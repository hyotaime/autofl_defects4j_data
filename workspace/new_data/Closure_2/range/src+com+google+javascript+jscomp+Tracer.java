{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/Tracer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Tracer",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 161,
      "end_line": 1078,
      "comment": "\n * Tracer provides a simple way to trace the handling of a request.\n *\n * By timing likely slow points in the code you can quickly pinpoint\n * why a request is slow.\n *\n * \u003cp\u003eExample usage:\n * \u003cpre\u003e\n * Tracer.initCurrentThreadTrace(); // must be called in each Thread\n * Tracer wholeRequest \u003d new Tracer(null, \"Request \" + params);\n * try {\n *   ...\n *   t \u003d new Tracer(\"Database\", \"getName()\");\n *   try {\n *     name \u003d database.getName();\n *   } finally {\n *     t.stop();\n *   }\n *   ...\n *   t \u003d new Tracer(null, \"call sendmail\");\n *   try {\n *     sendMessage();\n *   } finally {\n *     t.stop();\n *   }\n *   ...\n *   t \u003d new Tracer(\"Database\", \"updateinfo()\");\n *   try {\n *     database.updateinfo(\"new info\");\n *   } finally {\n *     t.stop();\n *   }\n *   ...\n * } finally {\n *   if (wholeRequest.stop() \u003e 1000) {\n *     // more than a second, better log\n *     Tracer.logAndClearCurrentThreadTrace();\n *   } else {\n *     Tracer.clearCurrentThreadTrace();\n *   }\n * }\n * \u003c/pre\u003e\n *\n * Now slow requests will produce a report like this:\n * \u003cpre\u003e\n *       10.452 Start        Request cmd\u003ddostuff\n *     3 10.455 Start        [Database] getName()\n *    34 10.489 Done   34 ms [Database] getName()\n *     3 10.491 Start        call sendmail\n *  1042 11.533 Done 1042 ms call sendmail\n *     0 11.533 Start        [Database] updateinfo()\n *     3 11.536 Done    3 ms [Database] updateinfo()\n *    64 11.600 Done 1148 ms Request cmd\u003ddostuff\n *   TOTAL Database 2 (37 ms)\n * \u003c/pre\u003e\n *\n * If you enabled pretty-printing by calling {@link Tracer#setPrettyPrint},\n * it will print more easily readable reports that use indentation to visualize\n * the tracer hierarchy and dynamically adjusts the padding to handle large\n * durations. Like:\n * \u003cpre\u003e\n *       10.452 Start        Request cmd\u003ddostuff\n *     3 10.455 Start        | [Database] getName()\n *    34 10.489 Done   34 ms | [Database] getName()\n *     3 10.491 Start        | call sendmail\n *  1042 11.533 Done 1042 ms | call sendmail\n *     0 11.533 Start        | [Database] updateinfo()\n *     3 11.536 Done    3 ms | [Database] updateinfo()\n *    64 11.600 Done 1148 ms Request cmd\u003ddostuff\n *   TOTAL Database 2 (37 ms)\n * \u003c/pre\u003e\n * Pretty-printing is an application global setting and should only be called\n * in the main setup of an application, not in library code.\n *\n * Now you can easily see that sendmail is causing your problems, not\n * the two database calls.\n *\n * You can easily add additional tracing statistics to your Trace output by\n * adding additional tracing statistics. Simply add to your initialization code:\n * \u003cpre\u003e\n *    Tracer.addTracingStatistic(myTracingStatistic)\n * \u003c/pre\u003e\n * where myTracingStatistic implements the {@link TracingStatistic} interface.\n * The class com.google.monitoring.tracing.TracingStatistics contains\n * several useful statistics such as CPU time, wait time, and memory usage.\n * If you add your own tracing statistics, the output is not quite as pretty,\n * but includes additional useful information.\n\n * \u003cp\u003eIf a Trace is given a type (the first argument to the constructor) and\n * multiple Traces are done on that type then a \"TOTAL line will be\n * produced showing the total number of traces and the sum of the time\n * (\"TOTAL Database 2 (37 ms)\" in our example). These traces should be\n * mutually exclusive or else the sum won\u0027t make sense (the time will\n * be double counted if the second starts before the first ends).\n *\n * \u003cp\u003eIt is also possible to have a \"silent\" Tracer which does not appear\n * in the trace because it was faster than the silence threshold. This\n * threshold can be set for the for the current ThreadTrace with\n * setDefaultSilenceThreshold(threshold), or on a per-Tracer basis with\n * t.stop(threshold). Silent tracers are still counted in the type\n * totals, so these events are not completely lost.\n *\n * \u003cp\u003e\u003cb\u003eWARNING:\u003c/b\u003e This code makes a big assumption that\n * everything for a given trace is done within a single thread.\n * It uses threads to identify requests. It is fine to have multiple\n * requests traced in multiple simultaneous threads but it is not ok\n * to have any given request traced in multiple threads. (the results\n * will be scattered across reports).\n *\n * Java objects do not support destructors (as in C++) so Tracer is not robust\n * when exceptions are thrown. Each Tracer object should be wrapped in a\n * try/finally block so that if an exception is thrown, the Tracer.stop()\n * method is guaranteed to be called.\n *\n * \u003cp\u003eA thread must call {@link Tracer#initCurrentThreadTrace()} to enable the\n * Tracer logging, otherwise Tracer does nothing.  The requirement to call\n * {@code initCurrentThreadTrace} avoids the situation where Tracer is called\n * without the explicit knowledge of the application authors because they\n * happen to use a class in another package that uses Tracer. If {@link\n * Tracer#logCurrentThreadTrace} is called without calling {@link\n * Tracer#initCurrentThreadTrace()}, then a Third Eye WARNING message is logged,\n * which should help track down the problem.\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "logger"
      ],
      "begin_line": 163,
      "end_line": 164,
      "comment": " package-private for access from unit tests"
    },
    {
      "type": "field",
      "varNames": [
        "defaultPrettyPrint"
      ],
      "begin_line": 170,
      "end_line": 170,
      "comment": "\n   * Whether pretty printing is enabled. This is intended to be set once\n   * at application startup.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "extraTracingStatistics"
      ],
      "begin_line": 176,
      "end_line": 177,
      "comment": " This list is guaranteed to only increase in length.  It contains\n   * a list of additional statistics that the user wants to keep track\n   * of.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "extraTracingValues"
      ],
      "begin_line": 180,
      "end_line": 180,
      "comment": " Values returned by extraTracingStatistics "
    },
    {
      "type": "field",
      "varNames": [
        "type"
      ],
      "begin_line": 183,
      "end_line": 183,
      "comment": " The type for grouping traces, may be null "
    },
    {
      "type": "field",
      "varNames": [
        "comment"
      ],
      "begin_line": 186,
      "end_line": 186,
      "comment": " A comment string for the report "
    },
    {
      "type": "field",
      "varNames": [
        "startTimeMs"
      ],
      "begin_line": 189,
      "end_line": 189,
      "comment": " Start time of the trace "
    },
    {
      "type": "field",
      "varNames": [
        "stopTimeMs"
      ],
      "begin_line": 192,
      "end_line": 192,
      "comment": " Stop time of the trace, non-final "
    },
    {
      "type": "field",
      "varNames": [
        "startThread"
      ],
      "begin_line": 198,
      "end_line": 198,
      "comment": "\n   * Record our starter thread in order to trap Traces that are started in one\n   * thread and stopped in another\n   "
    },
    {
      "type": "field",
      "varNames": [
        "MAX_TRACE_SIZE"
      ],
      "begin_line": 207,
      "end_line": 207,
      "comment": "\n   * We limit the number of events in a Trace in order to catch memory\n   * leaks (a thread that keeps logging events and never clears them).\n   * This number is arbitrary and can be increased if necessary (though\n   * if there are more than 1000 events then the Tracer is probably being\n   * misused).\n   "
    },
    {
      "type": "class_interface",
      "name": "InternalClock",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 213,
      "end_line": 215,
      "comment": "\n   * For unit testing. Can\u0027t use {@link com.google.common.time.Clock} because\n   * this code is in base and has minimal dependencies.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Tracer.InternalClock.currentTimeMillis()",
      "begin_line": 214,
      "end_line": 214,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "field",
      "varNames": [
        "clock"
      ],
      "begin_line": 221,
      "end_line": 226,
      "comment": "\n   * Default clock that calls through to the system clock. Can be overridden\n   * in unit tests.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Tracer.Anonymous-fdb0e86c-fe57-4bc3-9d8c-1c44757ebd11.currentTimeMillis()",
      "begin_line": 222,
      "end_line": 225,
      "comment": "",
      "child_ranges": [
        "(line 224,col 7)-(line 224,col 40)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.Tracer.Tracer(java.lang.String, java.lang.String)",
      "begin_line": 235,
      "end_line": 278,
      "comment": "\n   * Create and start a tracer.\n   * Both type and comment may be null. See class comment for usage.\n   *\n   * @param type The type for totaling\n   * @param comment Comment about this tracer\n   ",
      "child_ranges": [
        "(line 236,col 5)-(line 236,col 21)",
        "(line 237,col 5)-(line 237,col 50)",
        "(line 238,col 5)-(line 238,col 44)",
        "(line 239,col 5)-(line 239,col 41)",
        "(line 240,col 5)-(line 248,col 5)",
        "(line 250,col 5)-(line 250,col 41)",
        "(line 253,col 5)-(line 255,col 5)",
        "(line 258,col 5)-(line 264,col 5)",
        "(line 267,col 5)-(line 275,col 5)",
        "(line 277,col 5)-(line 277,col 27)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.Tracer.Tracer(java.lang.String)",
      "begin_line": 285,
      "end_line": 287,
      "comment": "\n   * Create a tracer that isn\u0027t summed as part of a total\n   *\n   * @param comment  Comment about this tracer\n   ",
      "child_ranges": [
        "(line 286,col 5)-(line 286,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Tracer.shortName(java.lang.Object, java.lang.String)",
      "begin_line": 295,
      "end_line": 300,
      "comment": "\n   * Construct a tracer whose type is based on the short name of the object\n   * @param object   Object to use as type name\n   * @param comment  A comment\n   * @return  new Tracer.\n   ",
      "child_ranges": [
        "(line 296,col 5)-(line 298,col 5)",
        "(line 299,col 5)-(line 299,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Tracer.longToPaddedString(long, int)",
      "begin_line": 308,
      "end_line": 314,
      "comment": "\n   * Converts \u0027v\u0027 to a string and pads it with up to 16 spaces for\n   * improved alignment.\n   * @param v The value to convert.\n   * @param digits_column_width The desired with of the string.\n   ",
      "child_ranges": [
        "(line 309,col 5)-(line 309,col 35)",
        "(line 310,col 5)-(line 310,col 43)",
        "(line 311,col 5)-(line 311,col 56)",
        "(line 312,col 5)-(line 312,col 17)",
        "(line 313,col 5)-(line 313,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Tracer.numDigits(long)",
      "begin_line": 322,
      "end_line": 329,
      "comment": "\n   * Gets the number of digits in an integer when printed in base 10. Assumes\n   * a positive integer.\n   * @param n The value.\n   * @return The number of digits in the string.\n   ",
      "child_ranges": [
        "(line 323,col 5)-(line 323,col 14)",
        "(line 324,col 5)-(line 327,col 20)",
        "(line 328,col 5)-(line 328,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Tracer.appendSpaces(java.lang.StringBuilder, int)",
      "begin_line": 336,
      "end_line": 363,
      "comment": "\n   * Gets a string of spaces of the length specified.\n   * @param sb The string builder to append to.\n   * @param numSpaces The number of spaces in the string.\n   ",
      "child_ranges": [
        "(line 338,col 5)-(line 342,col 5)",
        "(line 343,col 5)-(line 346,col 5)",
        "(line 349,col 5)-(line 362,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Tracer.addTracingStatistic(com.google.javascript.jscomp.Tracer.TracingStatistic)",
      "begin_line": 372,
      "end_line": 384,
      "comment": "\n   * Adds a new tracing statistic to a trace\n   *\n   * @param tracingStatistic to enable a run\n   * @return The index of this statistic (for use with stat.extraInfo()), or\n   *         -1 if the statistic is not enabled.\n   ",
      "child_ranges": [
        "(line 375,col 5)-(line 383,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Tracer.clearTracingStatisticsTestingOnly()",
      "begin_line": 393,
      "end_line": 396,
      "comment": "\n   * For testing purposes only.  These removes all current tracers.\n   * Severe errors can occur if there are any active tracers going on\n   * when this is called.\n   *\n   * The test suite uses this to remove any tracers that it has added.\n   ",
      "child_ranges": [
        "(line 395,col 5)-(line 395,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Tracer.stop(int)",
      "begin_line": 407,
      "end_line": 434,
      "comment": "\n   * Stop the trace.\n   * This may only be done once and must be done from the same thread\n   * that started it.\n   * @param silence_threshold Traces for time less than silence_threshold\n   * ms will be left out of the trace report. A value of -1 indicates\n   * that the current ThreadTrace silence_threshold should be used.\n   * @return The time that this trace actually ran\n   ",
      "child_ranges": [
        "(line 408,col 5)-(line 408,col 68)",
        "(line 410,col 5)-(line 410,col 41)",
        "(line 412,col 5)-(line 414,col 5)",
        "(line 416,col 5)-(line 416,col 43)",
        "(line 417,col 5)-(line 425,col 5)",
        "(line 428,col 5)-(line 430,col 5)",
        "(line 432,col 5)-(line 432,col 44)",
        "(line 433,col 5)-(line 433,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Tracer.stop()",
      "begin_line": 440,
      "end_line": 442,
      "comment": " Stop the trace using the default silence_threshold\n   *\n   * @return  The time that this trace actually ran.\n   ",
      "child_ranges": [
        "(line 441,col 5)-(line 441,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Tracer.toString()",
      "begin_line": 444,
      "end_line": 450,
      "comment": "",
      "child_ranges": [
        "(line 445,col 5)-(line 449,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Tracer.setDefaultSilenceThreshold(int)",
      "begin_line": 452,
      "end_line": 454,
      "comment": "",
      "child_ranges": [
        "(line 453,col 5)-(line 453,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Tracer.initCurrentThreadTrace()",
      "begin_line": 461,
      "end_line": 475,
      "comment": "\n   * Initialize the trace associated with the current thread by clearing\n   * out any existing trace. There shouldn\u0027t be a trace so if one is\n   * found we log it as an error.\n   ",
      "child_ranges": [
        "(line 462,col 5)-(line 462,col 42)",
        "(line 463,col 5)-(line 471,col 5)",
        "(line 474,col 5)-(line 474,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Tracer.initCurrentThreadTrace(int)",
      "begin_line": 477,
      "end_line": 480,
      "comment": "",
      "child_ranges": [
        "(line 478,col 5)-(line 478,col 29)",
        "(line 479,col 5)-(line 479,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Tracer.getCurrentThreadTraceReport()",
      "begin_line": 487,
      "end_line": 489,
      "comment": "\n   * Returns a timer report similar to the one described in the class comment.\n   *\n   * @return The timer report as a string\n   ",
      "child_ranges": [
        "(line 488,col 5)-(line 488,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Tracer.logCurrentThreadTrace()",
      "begin_line": 494,
      "end_line": 513,
      "comment": "\n   * Logs a timer report similar to the one described in the class comment.\n   ",
      "child_ranges": [
        "(line 495,col 5)-(line 495,col 41)",
        "(line 502,col 5)-(line 508,col 5)",
        "(line 510,col 5)-(line 512,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Tracer.clearCurrentThreadTrace()",
      "begin_line": 518,
      "end_line": 520,
      "comment": "\n   * Throw away any Trace associated with the current thread.\n   ",
      "child_ranges": [
        "(line 519,col 5)-(line 519,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Tracer.logAndClearCurrentThreadTrace()",
      "begin_line": 525,
      "end_line": 528,
      "comment": "\n   * logCurrentThreadTrace() then clearCurrentThreadTrace()\n   ",
      "child_ranges": [
        "(line 526,col 5)-(line 526,col 28)",
        "(line 527,col 5)-(line 527,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Tracer.setPrettyPrint(boolean)",
      "begin_line": 535,
      "end_line": 537,
      "comment": "\n   * Sets whether pretty printing is enabled. See class-level comment. This\n   * only affects tracers created after this is called.\n   * @param enabled Whether to enable pretty printing.\n   ",
      "child_ranges": [
        "(line 536,col 5)-(line 536,col 33)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Stat",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 540,
      "end_line": 570,
      "comment": " Statistics for a given tracer type "
    },
    {
      "type": "field",
      "varNames": [
        "count"
      ],
      "begin_line": 541,
      "end_line": 541,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "silent"
      ],
      "begin_line": 542,
      "end_line": 542,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "clockTime"
      ],
      "begin_line": 543,
      "end_line": 543,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "extraInfo"
      ],
      "begin_line": 544,
      "end_line": 544,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Tracer.Stat.getCount()",
      "begin_line": 550,
      "end_line": 550,
      "comment": " total count of tracers of a type, including silent\n     *\n     * @return total count of tracers, including silent tracers\n     ",
      "child_ranges": [
        "(line 550,col 22)-(line 550,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Tracer.Stat.getSilentCount()",
      "begin_line": 556,
      "end_line": 556,
      "comment": " total count of silent tracers of a type\n     *\n     * @return total count of silent tracers\n     ",
      "child_ranges": [
        "(line 556,col 28)-(line 556,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Tracer.Stat.getTotalTime()",
      "begin_line": 562,
      "end_line": 562,
      "comment": " total time spent in tracers of a type, in ms\n     *\n     * @return total time spent in tracer, in ms\n     ",
      "child_ranges": [
        "(line 562,col 26)-(line 562,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Tracer.Stat.getExtraInfo(int)",
      "begin_line": 565,
      "end_line": 568,
      "comment": " total time spent doing additional things that we are clocking ",
      "child_ranges": [
        "(line 567,col 7)-(line 567,col 62)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "typeToCountMap"
      ],
      "begin_line": 575,
      "end_line": 575,
      "comment": "\n   * This map tracks counts of tracers for each type over all time.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "typeToSilentMap"
      ],
      "begin_line": 580,
      "end_line": 580,
      "comment": "\n   * This map tracks counts of silent tracers for each type over all time.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "typeToTimeMap"
      ],
      "begin_line": 585,
      "end_line": 585,
      "comment": "\n   * This map tracks time (ms) for each type over all time.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Tracer.enableTypeMaps()",
      "begin_line": 592,
      "end_line": 598,
      "comment": "\n   * This method MUST be called before getTypeToCountMap (and friends)\n   * will return a valid map.  This is because computing this information\n   * imposes a synchronization penalty on every Tracer that is stopped.\n   ",
      "child_ranges": [
        "(line 593,col 5)-(line 597,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Tracer.getTypeToCountMap()",
      "begin_line": 605,
      "end_line": 607,
      "comment": "\n   * Used for exporting this data via varz.  Accesses to this\n   * map must be synchronized on the map.  If enableTypeMaps has not\n   * been called, this will return null.\n   ",
      "child_ranges": [
        "(line 606,col 5)-(line 606,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Tracer.getTypeToSilentMap()",
      "begin_line": 614,
      "end_line": 616,
      "comment": "\n   * Used for exporting this data via varz.  Accesses to this\n   * map must be synchronized on the map.  If enableTypeMaps has not\n   * been called, this will return null.\n   ",
      "child_ranges": [
        "(line 615,col 5)-(line 615,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Tracer.getTypeToTimeMap()",
      "begin_line": 623,
      "end_line": 625,
      "comment": "\n   * Used for exporting this data via varz.  Accesses to this\n   * map must be synchronized on the map.  If enableTypeMaps has not\n   * been called, this will return null.\n   ",
      "child_ranges": [
        "(line 624,col 5)-(line 624,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Tracer.getStatsForType(java.lang.String)",
      "begin_line": 628,
      "end_line": 631,
      "comment": " Gets the Stat for a tracer type; never returns null ",
      "child_ranges": [
        "(line 629,col 5)-(line 629,col 49)",
        "(line 630,col 5)-(line 630,col 43)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "ZERO_STAT"
      ],
      "begin_line": 633,
      "end_line": 633,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Tracer.formatTime(long)",
      "begin_line": 636,
      "end_line": 640,
      "comment": " Return the sec.ms part of time (if time \u003d \"20:06:11.566\",  \"11.566\") ",
      "child_ranges": [
        "(line 637,col 5)-(line 637,col 41)",
        "(line 638,col 5)-(line 638,col 33)",
        "(line 639,col 5)-(line 639,col 47)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Event",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 643,
      "end_line": 699,
      "comment": " An event is created every time a Tracer is created or stopped "
    },
    {
      "type": "field",
      "varNames": [
        "isStart"
      ],
      "begin_line": 644,
      "end_line": 644,
      "comment": " else is_stop"
    },
    {
      "type": "field",
      "varNames": [
        "tracer"
      ],
      "begin_line": 645,
      "end_line": 645,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.Tracer.Event.Event(boolean, com.google.javascript.jscomp.Tracer)",
      "begin_line": 647,
      "end_line": 650,
      "comment": "",
      "child_ranges": [
        "(line 648,col 7)-(line 648,col 22)",
        "(line 649,col 7)-(line 649,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Tracer.Event.eventTime()",
      "begin_line": 652,
      "end_line": 654,
      "comment": "",
      "child_ranges": [
        "(line 653,col 7)-(line 653,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Tracer.Event.toString(long, java.lang.String, int)",
      "begin_line": 665,
      "end_line": 698,
      "comment": "\n     * Converts the event to a formatted string.\n     * @param prevEventTime The time of the previous event which appears at\n     *     the left most part of the trace line.\n     * @param indent The indentation to put before the tracer to show the\n     *     hierarchy.\n     * @param digitsColWidth How many characters the digits should use.\n     * @return The formatted string.\n     ",
      "child_ranges": [
        "(line 666,col 7)-(line 666,col 48)",
        "(line 668,col 7)-(line 673,col 7)",
        "(line 675,col 7)-(line 675,col 21)",
        "(line 676,col 7)-(line 676,col 41)",
        "(line 677,col 7)-(line 694,col 7)",
        "(line 695,col 7)-(line 695,col 24)",
        "(line 696,col 7)-(line 696,col 35)",
        "(line 697,col 7)-(line 697,col 27)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ThreadTrace",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 702,
      "end_line": 949,
      "comment": " Stores a thread\u0027s Trace "
    },
    {
      "type": "field",
      "varNames": [
        "defaultSilenceThreshold"
      ],
      "begin_line": 705,
      "end_line": 705,
      "comment": " non-final"
    },
    {
      "type": "field",
      "varNames": [
        "events"
      ],
      "begin_line": 708,
      "end_line": 708,
      "comment": " The Events corresponding to each startEvent/stopEvent "
    },
    {
      "type": "field",
      "varNames": [
        "outstandingEvents"
      ],
      "begin_line": 711,
      "end_line": 711,
      "comment": " Tracers that have not had their .stop() called "
    },
    {
      "type": "field",
      "varNames": [
        "stats"
      ],
      "begin_line": 714,
      "end_line": 714,
      "comment": " Map from type to Stat object "
    },
    {
      "type": "field",
      "varNames": [
        "isOutstandingEventsTruncated"
      ],
      "begin_line": 720,
      "end_line": 720,
      "comment": "\n     * True if {@code outstandingEvents} has been cleared because we exceeded\n     * the max trace limit.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "isEventsTruncated"
      ],
      "begin_line": 726,
      "end_line": 726,
      "comment": "\n     * True if {@code events} has been cleared because we exceeded the max\n     * trace limit.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "isInitialized"
      ],
      "begin_line": 732,
      "end_line": 732,
      "comment": "\n     * Set to true if {@link Tracer#initCurrentThreadTrace()} was called by\n     * the current thread.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "prettyPrint"
      ],
      "begin_line": 737,
      "end_line": 737,
      "comment": "\n     * Whether pretty printing is enabled for the trace.\n     "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Tracer.ThreadTrace.init()",
      "begin_line": 740,
      "end_line": 742,
      "comment": " Initialize the trace.  ",
      "child_ranges": [
        "(line 741,col 7)-(line 741,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Tracer.ThreadTrace.isInitialized()",
      "begin_line": 745,
      "end_line": 747,
      "comment": " Is initialized? ",
      "child_ranges": [
        "(line 746,col 7)-(line 746,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Tracer.ThreadTrace.startEvent(com.google.javascript.jscomp.Tracer)",
      "begin_line": 753,
      "end_line": 757,
      "comment": "\n     * Called by the constructor {@link Tracer#Tracer(String, String)} to create\n     * a start event.\n     ",
      "child_ranges": [
        "(line 754,col 7)-(line 754,col 37)",
        "(line 755,col 7)-(line 755,col 63)",
        "(line 756,col 7)-(line 756,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Tracer.ThreadTrace.endEvent(com.google.javascript.jscomp.Tracer, int)",
      "begin_line": 762,
      "end_line": 846,
      "comment": "\n     * Called by {@link Tracer#stop()} to create a stop event.\n     ",
      "child_ranges": [
        "(line 763,col 7)-(line 763,col 59)",
        "(line 764,col 7)-(line 778,col 7)",
        "(line 780,col 7)-(line 780,col 50)",
        "(line 782,col 7)-(line 784,col 7)",
        "(line 786,col 7)-(line 804,col 7)",
        "(line 806,col 7)-(line 845,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Tracer.ThreadTrace.isEmpty()",
      "begin_line": 848,
      "end_line": 850,
      "comment": "",
      "child_ranges": [
        "(line 849,col 7)-(line 849,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Tracer.ThreadTrace.truncateOutstandingEvents()",
      "begin_line": 852,
      "end_line": 855,
      "comment": "",
      "child_ranges": [
        "(line 853,col 7)-(line 853,col 42)",
        "(line 854,col 7)-(line 854,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Tracer.ThreadTrace.truncateEvents()",
      "begin_line": 857,
      "end_line": 860,
      "comment": "",
      "child_ranges": [
        "(line 858,col 7)-(line 858,col 31)",
        "(line 859,col 7)-(line 859,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Tracer.ThreadTrace.toString()",
      "begin_line": 864,
      "end_line": 925,
      "comment": " Nullness checker does not understand that prettyPrint \u003d\u003e indent !\u003d null",
      "child_ranges": [
        "(line 867,col 7)-(line 867,col 37)",
        "(line 868,col 7)-(line 868,col 45)",
        "(line 869,col 7)-(line 869,col 22)",
        "(line 870,col 7)-(line 870,col 80)",
        "(line 871,col 7)-(line 886,col 7)",
        "(line 888,col 7)-(line 901,col 7)",
        "(line 903,col 7)-(line 923,col 7)",
        "(line 924,col 7)-(line 924,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Tracer.ThreadTrace.getMaxDigits()",
      "begin_line": 932,
      "end_line": 948,
      "comment": "\n     * Gets the maximum number of digits that can appear in the tracer output\n     * in the gaps between tracers or the duration of a tracer. This is used\n     * by the pretty printing case so that all of the tracers are aligned.\n     ",
      "child_ranges": [
        "(line 933,col 7)-(line 933,col 22)",
        "(line 934,col 7)-(line 934,col 24)",
        "(line 935,col 7)-(line 945,col 7)",
        "(line 947,col 7)-(line 947,col 46)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "traces"
      ],
      "begin_line": 952,
      "end_line": 953,
      "comment": " Holds the ThreadTrace for each thread.  "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Tracer.getThreadTrace()",
      "begin_line": 958,
      "end_line": 966,
      "comment": "\n   * Get the ThreadTrace for the current thread, creating one if necessary.\n   ",
      "child_ranges": [
        "(line 959,col 5)-(line 959,col 33)",
        "(line 960,col 5)-(line 964,col 5)",
        "(line 965,col 5)-(line 965,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Tracer.clearThreadTrace()",
      "begin_line": 969,
      "end_line": 971,
      "comment": " Remove any ThreadTrace associated with the current thread ",
      "child_ranges": [
        "(line 970,col 5)-(line 970,col 20)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TracingStatistic",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 981,
      "end_line": 1025,
      "comment": "\n   * A TracingStatistic allows the program to add additional optional\n   * statistics to the trace output.\n   *\n   * The class com.google.monitoring.tracing.TracingStatistics\n   * contains several useful tracing statistics\n   *\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Tracer.TracingStatistic.start(java.lang.Thread)",
      "begin_line": 990,
      "end_line": 990,
      "comment": "\n     * This method is called at the start of the trace.  It should\n     * return a numeric result indicating the amount of the specific\n     * resource in use before the call started\n     * @param thread  The current thread\n     * @return A numeric value indicating the amount of the resource\n     * already used.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Tracer.TracingStatistic.stop(java.lang.Thread)",
      "begin_line": 1001,
      "end_line": 1001,
      "comment": "\n     * This method is called at the end of the trace.  It should\n     * return a numeric result indicating the amount of the specific\n     * resource in use after the call ends. The actual reported result\n     * will be the result end() - start()\n     * @param thread  The current thread\n     * @return A numeric value indicating the amount of the resource\n     * currently used.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Tracer.TracingStatistic.enable()",
      "begin_line": 1011,
      "end_line": 1011,
      "comment": "\n     * Called when this tracing statistic is first enabled.  A return\n     * value of True indicates that this statistic can successfully\n     * run in the current JVM.\n     *\n     * @return An indication of whether this statistic can be\n     * implemented in the current JVM.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Tracer.TracingStatistic.getTracingStat()",
      "begin_line": 1017,
      "end_line": 1017,
      "comment": " Returns this tracing statistic\u0027s trace map.\n     *\n     * @return This tracing statistic\u0027s trace map.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Tracer.TracingStatistic.getUnits()",
      "begin_line": 1024,
      "end_line": 1024,
      "comment": " A string that should be appended to the numeric output\n     * indicating what this is.\n     *\n     * @return  A string indicating the units of this statistic and what it is.\n     ",
      "child_ranges": []
    },
    {
      "type": "class_interface",
      "name": "AtomicTracerStatMap",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 1032,
      "end_line": 1077,
      "comment": "\n   * This class encapsulates a map for keeping track of tracing statistics.\n   * It allows the caller to atomically increment named fields.\n   *\n   "
    },
    {
      "type": "field",
      "varNames": [
        "map"
      ],
      "begin_line": 1033,
      "end_line": 1034,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Tracer.AtomicTracerStatMap.incrementBy(java.lang.String, long)",
      "begin_line": 1044,
      "end_line": 1069,
      "comment": " this method",
      "child_ranges": [
        "(line 1050,col 7)-(line 1050,col 35)",
        "(line 1051,col 7)-(line 1061,col 7)",
        "(line 1062,col 7)-(line 1068,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Tracer.AtomicTracerStatMap.getMap()",
      "begin_line": 1074,
      "end_line": 1076,
      "comment": "\n     * Returns a map of key:value pairs.\n     ",
      "child_ranges": [
        "(line 1075,col 7)-(line 1075,col 17)"
      ]
    }
  ]
}