{
  "filepath": "/tmp/Lang-47b/src/java/org/apache/commons/lang/time/FastDateFormat.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FastDateFormat",
      "is_interface": false,
      "parent_types": [
        "java.text.Format"
      ],
      "begin_line": 71,
      "end_line": 1747,
      "comment": "\n * \u003cp\u003eFastDateFormat is a fast and thread-safe version of\n * {@link java.text.SimpleDateFormat}.\u003c/p\u003e\n * \n * \u003cp\u003eThis class can be used as a direct replacement to\n * \u003ccode\u003eSimpleDateFormat\u003c/code\u003e in most formatting situations.\n * This class is especially useful in multi-threaded server environments.\n * \u003ccode\u003eSimpleDateFormat\u003c/code\u003e is not thread-safe in any JDK version,\n * nor will it be as Sun have closed the bug/RFE.\n * \u003c/p\u003e\n *\n * \u003cp\u003eOnly formatting is supported, but all patterns are compatible with\n * SimpleDateFormat (except time zones - see below).\u003c/p\u003e\n *\n * \u003cp\u003eJava 1.4 introduced a new pattern letter, \u003ccode\u003e\u0027Z\u0027\u003c/code\u003e, to represent\n * time zones in RFC822 format (eg. \u003ccode\u003e+0800\u003c/code\u003e or \u003ccode\u003e-1100\u003c/code\u003e).\n * This pattern letter can be used here (on all JDK versions).\u003c/p\u003e\n *\n * \u003cp\u003eIn addition, the pattern \u003ccode\u003e\u0027ZZ\u0027\u003c/code\u003e has been made to represent\n * ISO8601 full format time zones (eg. \u003ccode\u003e+08:00\u003c/code\u003e or \u003ccode\u003e-11:00\u003c/code\u003e).\n * This introduces a minor incompatibility with Java 1.4, but at a gain of\n * useful functionality.\u003c/p\u003e\n *\n * @author TeaTrove project\n * @author Brian S O\u0027Neill\n * @author Sean Schofield\n * @author Gary Gregory\n * @author Stephen Colebourne\n * @author Nikolay Metchev\n * @since 2.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 89,
      "end_line": 89,
      "comment": "\n     * Required for serialization support.\n     * \n     * @see java.io.Serializable\n     "
    },
    {
      "type": "field",
      "varNames": [
        "FULL"
      ],
      "begin_line": 94,
      "end_line": 94,
      "comment": "\n     * FULL locale dependent date or time style.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "LONG"
      ],
      "begin_line": 98,
      "end_line": 98,
      "comment": "\n     * LONG locale dependent date or time style.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "MEDIUM"
      ],
      "begin_line": 102,
      "end_line": 102,
      "comment": "\n     * MEDIUM locale dependent date or time style.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "SHORT"
      ],
      "begin_line": 106,
      "end_line": 106,
      "comment": "\n     * SHORT locale dependent date or time style.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "cDefaultPattern"
      ],
      "begin_line": 108,
      "end_line": 108,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "cInstanceCache"
      ],
      "begin_line": 110,
      "end_line": 110,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "cDateInstanceCache"
      ],
      "begin_line": 111,
      "end_line": 111,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "cTimeInstanceCache"
      ],
      "begin_line": 112,
      "end_line": 112,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "cDateTimeInstanceCache"
      ],
      "begin_line": 113,
      "end_line": 113,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "cTimeZoneDisplayCache"
      ],
      "begin_line": 114,
      "end_line": 114,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mPattern"
      ],
      "begin_line": 119,
      "end_line": 119,
      "comment": "\n     * The pattern.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "mTimeZone"
      ],
      "begin_line": 123,
      "end_line": 123,
      "comment": "\n     * The time zone.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "mTimeZoneForced"
      ],
      "begin_line": 127,
      "end_line": 127,
      "comment": "\n     * Whether the time zone overrides any on Calendars.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "mLocale"
      ],
      "begin_line": 131,
      "end_line": 131,
      "comment": "\n     * The locale.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "mLocaleForced"
      ],
      "begin_line": 135,
      "end_line": 135,
      "comment": "\n     * Whether the locale overrides the default.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "mRules"
      ],
      "begin_line": 139,
      "end_line": 139,
      "comment": "\n     * The parsed rules.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "mMaxLengthEstimate"
      ],
      "begin_line": 143,
      "end_line": 143,
      "comment": "\n     * The estimated maximum length.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.getInstance()",
      "begin_line": 152,
      "end_line": 154,
      "comment": "\n     * \u003cp\u003eGets a formatter instance using the default pattern in the\n     * default locale.\u003c/p\u003e\n     * \n     * @return a date/time formatter\n     ",
      "child_ranges": [
        "(line 153,col 9)-(line 153,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.getInstance(java.lang.String)",
      "begin_line": 165,
      "end_line": 167,
      "comment": "\n     * \u003cp\u003eGets a formatter instance using the specified pattern in the\n     * default locale.\u003c/p\u003e\n     * \n     * @param pattern  {@link java.text.SimpleDateFormat} compatible\n     *  pattern\n     * @return a pattern based date/time formatter\n     * @throws IllegalArgumentException if pattern is invalid\n     ",
      "child_ranges": [
        "(line 166,col 9)-(line 166,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.getInstance(java.lang.String, java.util.TimeZone)",
      "begin_line": 180,
      "end_line": 182,
      "comment": "\n     * \u003cp\u003eGets a formatter instance using the specified pattern and\n     * time zone.\u003c/p\u003e\n     * \n     * @param pattern  {@link java.text.SimpleDateFormat} compatible\n     *  pattern\n     * @param timeZone  optional time zone, overrides time zone of\n     *  formatted date\n     * @return a pattern based date/time formatter\n     * @throws IllegalArgumentException if pattern is invalid\n     ",
      "child_ranges": [
        "(line 181,col 9)-(line 181,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.getInstance(java.lang.String, java.util.Locale)",
      "begin_line": 194,
      "end_line": 196,
      "comment": "\n     * \u003cp\u003eGets a formatter instance using the specified pattern and\n     * locale.\u003c/p\u003e\n     * \n     * @param pattern  {@link java.text.SimpleDateFormat} compatible\n     *  pattern\n     * @param locale  optional locale, overrides system locale\n     * @return a pattern based date/time formatter\n     * @throws IllegalArgumentException if pattern is invalid\n     ",
      "child_ranges": [
        "(line 195,col 9)-(line 195,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.getInstance(java.lang.String, java.util.TimeZone, java.util.Locale)",
      "begin_line": 211,
      "end_line": 220,
      "comment": "\n     * \u003cp\u003eGets a formatter instance using the specified pattern, time zone\n     * and locale.\u003c/p\u003e\n     * \n     * @param pattern  {@link java.text.SimpleDateFormat} compatible\n     *  pattern\n     * @param timeZone  optional time zone, overrides time zone of\n     *  formatted date\n     * @param locale  optional locale, overrides system locale\n     * @return a pattern based date/time formatter\n     * @throws IllegalArgumentException if pattern is invalid\n     *  or \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 212,col 9)-(line 212,col 83)",
        "(line 213,col 9)-(line 213,col 81)",
        "(line 214,col 9)-(line 218,col 9)",
        "(line 219,col 9)-(line 219,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.getDateInstance(int)",
      "begin_line": 233,
      "end_line": 235,
      "comment": "\n     * \u003cp\u003eGets a date formatter instance using the specified style in the\n     * default time zone and locale.\u003c/p\u003e\n     * \n     * @param style  date style: FULL, LONG, MEDIUM, or SHORT\n     * @return a localized standard date formatter\n     * @throws IllegalArgumentException if the Locale has no date\n     *  pattern defined\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 234,col 9)-(line 234,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.getDateInstance(int, java.util.Locale)",
      "begin_line": 248,
      "end_line": 250,
      "comment": "\n     * \u003cp\u003eGets a date formatter instance using the specified style and\n     * locale in the default time zone.\u003c/p\u003e\n     * \n     * @param style  date style: FULL, LONG, MEDIUM, or SHORT\n     * @param locale  optional locale, overrides system locale\n     * @return a localized standard date formatter\n     * @throws IllegalArgumentException if the Locale has no date\n     *  pattern defined\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 249,col 9)-(line 249,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.getDateInstance(int, java.util.TimeZone)",
      "begin_line": 264,
      "end_line": 266,
      "comment": "\n     * \u003cp\u003eGets a date formatter instance using the specified style and\n     * time zone in the default locale.\u003c/p\u003e\n     * \n     * @param style  date style: FULL, LONG, MEDIUM, or SHORT\n     * @param timeZone  optional time zone, overrides time zone of\n     *  formatted date\n     * @return a localized standard date formatter\n     * @throws IllegalArgumentException if the Locale has no date\n     *  pattern defined\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 265,col 9)-(line 265,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.getDateInstance(int, java.util.TimeZone, java.util.Locale)",
      "begin_line": 279,
      "end_line": 304,
      "comment": "\n     * \u003cp\u003eGets a date formatter instance using the specified style, time\n     * zone and locale.\u003c/p\u003e\n     * \n     * @param style  date style: FULL, LONG, MEDIUM, or SHORT\n     * @param timeZone  optional time zone, overrides time zone of\n     *  formatted date\n     * @param locale  optional locale, overrides system locale\n     * @return a localized standard date formatter\n     * @throws IllegalArgumentException if the Locale has no date\n     *  pattern defined\n     ",
      "child_ranges": [
        "(line 280,col 9)-(line 280,col 40)",
        "(line 281,col 9)-(line 283,col 9)",
        "(line 285,col 9)-(line 287,col 9)",
        "(line 289,col 9)-(line 289,col 36)",
        "(line 291,col 9)-(line 291,col 77)",
        "(line 292,col 9)-(line 302,col 9)",
        "(line 303,col 9)-(line 303,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.getTimeInstance(int)",
      "begin_line": 317,
      "end_line": 319,
      "comment": "\n     * \u003cp\u003eGets a time formatter instance using the specified style in the\n     * default time zone and locale.\u003c/p\u003e\n     * \n     * @param style  time style: FULL, LONG, MEDIUM, or SHORT\n     * @return a localized standard time formatter\n     * @throws IllegalArgumentException if the Locale has no time\n     *  pattern defined\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 318,col 9)-(line 318,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.getTimeInstance(int, java.util.Locale)",
      "begin_line": 332,
      "end_line": 334,
      "comment": "\n     * \u003cp\u003eGets a time formatter instance using the specified style and\n     * locale in the default time zone.\u003c/p\u003e\n     * \n     * @param style  time style: FULL, LONG, MEDIUM, or SHORT\n     * @param locale  optional locale, overrides system locale\n     * @return a localized standard time formatter\n     * @throws IllegalArgumentException if the Locale has no time\n     *  pattern defined\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 333,col 9)-(line 333,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.getTimeInstance(int, java.util.TimeZone)",
      "begin_line": 348,
      "end_line": 350,
      "comment": "\n     * \u003cp\u003eGets a time formatter instance using the specified style and\n     * time zone in the default locale.\u003c/p\u003e\n     * \n     * @param style  time style: FULL, LONG, MEDIUM, or SHORT\n     * @param timeZone  optional time zone, overrides time zone of\n     *  formatted time\n     * @return a localized standard time formatter\n     * @throws IllegalArgumentException if the Locale has no time\n     *  pattern defined\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 349,col 9)-(line 349,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.getTimeInstance(int, java.util.TimeZone, java.util.Locale)",
      "begin_line": 364,
      "end_line": 390,
      "comment": "\n     * \u003cp\u003eGets a time formatter instance using the specified style, time\n     * zone and locale.\u003c/p\u003e\n     * \n     * @param style  time style: FULL, LONG, MEDIUM, or SHORT\n     * @param timeZone  optional time zone, overrides time zone of\n     *  formatted time\n     * @param locale  optional locale, overrides system locale\n     * @return a localized standard time formatter\n     * @throws IllegalArgumentException if the Locale has no time\n     *  pattern defined\n     ",
      "child_ranges": [
        "(line 365,col 9)-(line 365,col 40)",
        "(line 366,col 9)-(line 368,col 9)",
        "(line 369,col 9)-(line 371,col 9)",
        "(line 373,col 9)-(line 373,col 77)",
        "(line 374,col 9)-(line 388,col 9)",
        "(line 389,col 9)-(line 389,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(int, int)",
      "begin_line": 404,
      "end_line": 407,
      "comment": "\n     * \u003cp\u003eGets a date/time formatter instance using the specified style\n     * in the default time zone and locale.\u003c/p\u003e\n     * \n     * @param dateStyle  date style: FULL, LONG, MEDIUM, or SHORT\n     * @param timeStyle  time style: FULL, LONG, MEDIUM, or SHORT\n     * @return a localized standard date/time formatter\n     * @throws IllegalArgumentException if the Locale has no date/time\n     *  pattern defined\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 406,col 9)-(line 406,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(int, int, java.util.Locale)",
      "begin_line": 421,
      "end_line": 424,
      "comment": "\n     * \u003cp\u003eGets a date/time formatter instance using the specified style and\n     * locale in the default time zone.\u003c/p\u003e\n     * \n     * @param dateStyle  date style: FULL, LONG, MEDIUM, or SHORT\n     * @param timeStyle  time style: FULL, LONG, MEDIUM, or SHORT\n     * @param locale  optional locale, overrides system locale\n     * @return a localized standard date/time formatter\n     * @throws IllegalArgumentException if the Locale has no date/time\n     *  pattern defined\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 423,col 9)-(line 423,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(int, int, java.util.TimeZone)",
      "begin_line": 439,
      "end_line": 442,
      "comment": "\n     * \u003cp\u003eGets a date/time formatter instance using the specified style and\n     * time zone in the default locale.\u003c/p\u003e\n     * \n     * @param dateStyle  date style: FULL, LONG, MEDIUM, or SHORT\n     * @param timeStyle  time style: FULL, LONG, MEDIUM, or SHORT\n     * @param timeZone  optional time zone, overrides time zone of\n     *  formatted date\n     * @return a localized standard date/time formatter\n     * @throws IllegalArgumentException if the Locale has no date/time\n     *  pattern defined\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 441,col 9)-(line 441,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(int, int, java.util.TimeZone, java.util.Locale)",
      "begin_line": 456,
      "end_line": 482,
      "comment": "\n     * \u003cp\u003eGets a date/time formatter instance using the specified style,\n     * time zone and locale.\u003c/p\u003e\n     * \n     * @param dateStyle  date style: FULL, LONG, MEDIUM, or SHORT\n     * @param timeStyle  time style: FULL, LONG, MEDIUM, or SHORT\n     * @param timeZone  optional time zone, overrides time zone of\n     *  formatted date\n     * @param locale  optional locale, overrides system locale\n     * @return a localized standard date/time formatter\n     * @throws IllegalArgumentException if the Locale has no date/time\n     *  pattern defined\n     ",
      "child_ranges": [
        "(line 459,col 9)-(line 459,col 78)",
        "(line 460,col 9)-(line 462,col 9)",
        "(line 463,col 9)-(line 465,col 9)",
        "(line 466,col 9)-(line 466,col 36)",
        "(line 468,col 9)-(line 468,col 81)",
        "(line 469,col 9)-(line 480,col 9)",
        "(line 481,col 9)-(line 481,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.getTimeZoneDisplay(java.util.TimeZone, boolean, int, java.util.Locale)",
      "begin_line": 495,
      "end_line": 504,
      "comment": "\n     * \u003cp\u003eGets the time zone display name, using a cache for performance.\u003c/p\u003e\n     * \n     * @param tz  the zone to query\n     * @param daylight  true if daylight savings\n     * @param style  the style to use \u003ccode\u003eTimeZone.LONG\u003c/code\u003e\n     *  or \u003ccode\u003eTimeZone.SHORT\u003c/code\u003e\n     * @param locale  the locale to use\n     * @return the textual name of the time zone\n     ",
      "child_ranges": [
        "(line 496,col 9)-(line 496,col 73)",
        "(line 497,col 9)-(line 497,col 63)",
        "(line 498,col 9)-(line 502,col 9)",
        "(line 503,col 9)-(line 503,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.getDefaultPattern()",
      "begin_line": 511,
      "end_line": 516,
      "comment": "\n     * \u003cp\u003eGets the default pattern.\u003c/p\u003e\n     * \n     * @return the default pattern\n     ",
      "child_ranges": [
        "(line 512,col 9)-(line 514,col 9)",
        "(line 515,col 9)-(line 515,col 31)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.time.FastDateFormat.FastDateFormat(java.lang.String, java.util.TimeZone, java.util.Locale)",
      "begin_line": 533,
      "end_line": 551,
      "comment": "\n     * \u003cp\u003eConstructs a new FastDateFormat.\u003c/p\u003e\n     * \n     * @param pattern  {@link java.text.SimpleDateFormat} compatible\n     *  pattern\n     * @param timeZone  time zone to use, \u003ccode\u003enull\u003c/code\u003e means use\n     *  default for \u003ccode\u003eDate\u003c/code\u003e and value within for\n     *  \u003ccode\u003eCalendar\u003c/code\u003e\n     * @param locale  locale, \u003ccode\u003enull\u003c/code\u003e means use system\n     *  default\n     * @throws IllegalArgumentException if pattern is invalid or\n     *  \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 534,col 9)-(line 534,col 16)",
        "(line 535,col 9)-(line 537,col 9)",
        "(line 538,col 9)-(line 538,col 27)",
        "(line 540,col 9)-(line 540,col 45)",
        "(line 541,col 9)-(line 543,col 9)",
        "(line 544,col 9)-(line 544,col 29)",
        "(line 546,col 9)-(line 546,col 41)",
        "(line 547,col 9)-(line 549,col 9)",
        "(line 550,col 9)-(line 550,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.init()",
      "begin_line": 556,
      "end_line": 566,
      "comment": "\n     * \u003cp\u003eInitializes the instance for first use.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 557,col 9)-(line 557,col 40)",
        "(line 558,col 9)-(line 558,col 72)",
        "(line 560,col 9)-(line 560,col 20)",
        "(line 561,col 9)-(line 563,col 9)",
        "(line 565,col 9)-(line 565,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.parsePattern()",
      "begin_line": 576,
      "end_line": 697,
      "comment": "\n     * \u003cp\u003eReturns a list of Rules given a pattern.\u003c/p\u003e\n     * \n     * @return a \u003ccode\u003eList\u003c/code\u003e of Rule objects\n     * @throws IllegalArgumentException if pattern is invalid\n     ",
      "child_ranges": [
        "(line 577,col 9)-(line 577,col 67)",
        "(line 578,col 9)-(line 578,col 37)",
        "(line 580,col 9)-(line 580,col 42)",
        "(line 581,col 9)-(line 581,col 46)",
        "(line 582,col 9)-(line 582,col 56)",
        "(line 583,col 9)-(line 583,col 50)",
        "(line 584,col 9)-(line 584,col 60)",
        "(line 585,col 9)-(line 585,col 56)",
        "(line 587,col 9)-(line 587,col 39)",
        "(line 588,col 9)-(line 588,col 36)",
        "(line 590,col 9)-(line 694,col 9)",
        "(line 696,col 9)-(line 696,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.parseToken(java.lang.String, int[])",
      "begin_line": 706,
      "end_line": 756,
      "comment": "\n     * \u003cp\u003ePerforms the parsing of tokens.\u003c/p\u003e\n     * \n     * @param pattern  the pattern\n     * @param indexRef  index references\n     * @return parsed token\n     ",
      "child_ranges": [
        "(line 707,col 9)-(line 707,col 46)",
        "(line 709,col 9)-(line 709,col 28)",
        "(line 710,col 9)-(line 710,col 38)",
        "(line 712,col 9)-(line 712,col 35)",
        "(line 713,col 9)-(line 752,col 9)",
        "(line 754,col 9)-(line 754,col 24)",
        "(line 755,col 9)-(line 755,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.selectNumberRule(int, int)",
      "begin_line": 765,
      "end_line": 774,
      "comment": "\n     * \u003cp\u003eGets an appropriate rule for the padding required.\u003c/p\u003e\n     * \n     * @param field  the field to get a rule for\n     * @param padding  the padding required\n     * @return a new rule with the correct padding\n     ",
      "child_ranges": [
        "(line 766,col 9)-(line 773,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.format(java.lang.Object, java.lang.StringBuffer, java.text.FieldPosition)",
      "begin_line": 787,
      "end_line": 798,
      "comment": "\n     * \u003cp\u003eFormats a \u003ccode\u003eDate\u003c/code\u003e, \u003ccode\u003eCalendar\u003c/code\u003e or\n     * \u003ccode\u003eLong\u003c/code\u003e (milliseconds) object.\u003c/p\u003e\n     * \n     * @param obj  the object to format\n     * @param toAppendTo  the buffer to append to\n     * @param pos  the position - ignored\n     * @return the buffer passed in\n     ",
      "child_ranges": [
        "(line 788,col 9)-(line 797,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.format(long)",
      "begin_line": 807,
      "end_line": 809,
      "comment": "\n     * \u003cp\u003eFormats a millisecond \u003ccode\u003elong\u003c/code\u003e value.\u003c/p\u003e\n     * \n     * @param millis  the millisecond value to format\n     * @return the formatted string\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 808,col 9)-(line 808,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.format(java.util.Date)",
      "begin_line": 817,
      "end_line": 821,
      "comment": "\n     * \u003cp\u003eFormats a \u003ccode\u003eDate\u003c/code\u003e object.\u003c/p\u003e\n     * \n     * @param date  the date to format\n     * @return the formatted string\n     ",
      "child_ranges": [
        "(line 818,col 9)-(line 818,col 54)",
        "(line 819,col 9)-(line 819,col 24)",
        "(line 820,col 9)-(line 820,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.format(java.util.Calendar)",
      "begin_line": 829,
      "end_line": 831,
      "comment": "\n     * \u003cp\u003eFormats a \u003ccode\u003eCalendar\u003c/code\u003e object.\u003c/p\u003e\n     * \n     * @param calendar  the calendar to format\n     * @return the formatted string\n     ",
      "child_ranges": [
        "(line 830,col 9)-(line 830,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.format(long, java.lang.StringBuffer)",
      "begin_line": 842,
      "end_line": 844,
      "comment": "\n     * \u003cp\u003eFormats a milliseond \u003ccode\u003elong\u003c/code\u003e value into the\n     * supplied \u003ccode\u003eStringBuffer\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @param millis  the millisecond value to format\n     * @param buf  the buffer to format into\n     * @return the specified string buffer\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 843,col 9)-(line 843,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.format(java.util.Date, java.lang.StringBuffer)",
      "begin_line": 854,
      "end_line": 858,
      "comment": "\n     * \u003cp\u003eFormats a \u003ccode\u003eDate\u003c/code\u003e object into the\n     * supplied \u003ccode\u003eStringBuffer\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @param date  the date to format\n     * @param buf  the buffer to format into\n     * @return the specified string buffer\n     ",
      "child_ranges": [
        "(line 855,col 9)-(line 855,col 54)",
        "(line 856,col 9)-(line 856,col 24)",
        "(line 857,col 9)-(line 857,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.format(java.util.Calendar, java.lang.StringBuffer)",
      "begin_line": 868,
      "end_line": 874,
      "comment": "\n     * \u003cp\u003eFormats a \u003ccode\u003eCalendar\u003c/code\u003e object into the\n     * supplied \u003ccode\u003eStringBuffer\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @param calendar  the calendar to format\n     * @param buf  the buffer to format into\n     * @return the specified string buffer\n     ",
      "child_ranges": [
        "(line 869,col 9)-(line 872,col 9)",
        "(line 873,col 9)-(line 873,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.applyRules(java.util.Calendar, java.lang.StringBuffer)",
      "begin_line": 884,
      "end_line": 891,
      "comment": "\n     * \u003cp\u003ePerforms the formatting by applying the rules to the\n     * specified calendar.\u003c/p\u003e\n     * \n     * @param calendar  the calendar to format\n     * @param buf  the buffer to format into\n     * @return the specified string buffer\n     ",
      "child_ranges": [
        "(line 885,col 9)-(line 885,col 30)",
        "(line 886,col 9)-(line 886,col 32)",
        "(line 887,col 9)-(line 889,col 9)",
        "(line 890,col 9)-(line 890,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.parseObject(java.lang.String, java.text.ParsePosition)",
      "begin_line": 902,
      "end_line": 906,
      "comment": "\n     * \u003cp\u003eParsing is not supported.\u003c/p\u003e\n     * \n     * @param source  the string to parse\n     * @param pos  the parsing position\n     * @return \u003ccode\u003enull\u003c/code\u003e as not supported\n     ",
      "child_ranges": [
        "(line 903,col 9)-(line 903,col 24)",
        "(line 904,col 9)-(line 904,col 29)",
        "(line 905,col 9)-(line 905,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.getPattern()",
      "begin_line": 915,
      "end_line": 917,
      "comment": "\n     * \u003cp\u003eGets the pattern used by this formatter.\u003c/p\u003e\n     * \n     * @return the pattern, {@link java.text.SimpleDateFormat} compatible\n     ",
      "child_ranges": [
        "(line 916,col 9)-(line 916,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.getTimeZone()",
      "begin_line": 929,
      "end_line": 931,
      "comment": "\n     * \u003cp\u003eGets the time zone used by this formatter.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis zone is always used for \u003ccode\u003eDate\u003c/code\u003e formatting.\n     * If a \u003ccode\u003eCalendar\u003c/code\u003e is passed in to be formatted, the\n     * time zone on that may be used depending on\n     * {@link #getTimeZoneOverridesCalendar()}.\u003c/p\u003e\n     * \n     * @return the time zone\n     ",
      "child_ranges": [
        "(line 930,col 9)-(line 930,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.getTimeZoneOverridesCalendar()",
      "begin_line": 940,
      "end_line": 942,
      "comment": "\n     * \u003cp\u003eReturns \u003ccode\u003etrue\u003c/code\u003e if the time zone of the\n     * calendar overrides the time zone of the formatter.\u003c/p\u003e\n     * \n     * @return \u003ccode\u003etrue\u003c/code\u003e if time zone of formatter\n     *  overridden for calendars\n     ",
      "child_ranges": [
        "(line 941,col 9)-(line 941,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.getLocale()",
      "begin_line": 949,
      "end_line": 951,
      "comment": "\n     * \u003cp\u003eGets the locale used by this formatter.\u003c/p\u003e\n     * \n     * @return the locale\n     ",
      "child_ranges": [
        "(line 950,col 9)-(line 950,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.getMaxLengthEstimate()",
      "begin_line": 962,
      "end_line": 964,
      "comment": "\n     * \u003cp\u003eGets an estimate for the maximum string length that the\n     * formatter will produce.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe actual formatted length will almost always be less than or\n     * equal to this amount.\u003c/p\u003e\n     * \n     * @return the maximum formatted length\n     ",
      "child_ranges": [
        "(line 963,col 9)-(line 963,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.equals(java.lang.Object)",
      "begin_line": 974,
      "end_line": 989,
      "comment": "\n     * \u003cp\u003eCompares two objects for equality.\u003c/p\u003e\n     * \n     * @param obj  the object to compare to\n     * @return \u003ccode\u003etrue\u003c/code\u003e if equal\n     ",
      "child_ranges": [
        "(line 975,col 9)-(line 977,col 9)",
        "(line 978,col 9)-(line 978,col 52)",
        "(line 979,col 9)-(line 987,col 9)",
        "(line 988,col 9)-(line 988,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.hashCode()",
      "begin_line": 996,
      "end_line": 1004,
      "comment": "\n     * \u003cp\u003eReturns a hashcode compatible with equals.\u003c/p\u003e\n     * \n     * @return a hashcode compatible with equals\n     ",
      "child_ranges": [
        "(line 997,col 9)-(line 997,col 22)",
        "(line 998,col 9)-(line 998,col 37)",
        "(line 999,col 9)-(line 999,col 38)",
        "(line 1000,col 9)-(line 1000,col 43)",
        "(line 1001,col 9)-(line 1001,col 36)",
        "(line 1002,col 9)-(line 1002,col 41)",
        "(line 1003,col 9)-(line 1003,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.toString()",
      "begin_line": 1011,
      "end_line": 1013,
      "comment": "\n     * \u003cp\u003eGets a debugging string version of this formatter.\u003c/p\u003e\n     * \n     * @return a debugging string\n     ",
      "child_ranges": [
        "(line 1012,col 9)-(line 1012,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.readObject(java.io.ObjectInputStream)",
      "begin_line": 1025,
      "end_line": 1028,
      "comment": "\n     * Create the object after serialization. This implementation reinitializes the \n     * transient properties.\n     *\n     * @param in ObjectInputStream from which the object is being deserialized.\n     * @throws IOException if there is an IO issue.\n     * @throws ClassNotFoundException if a class cannot be found.\n     ",
      "child_ranges": [
        "(line 1026,col 9)-(line 1026,col 31)",
        "(line 1027,col 9)-(line 1027,col 15)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Rule",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 1035,
      "end_line": 1050,
      "comment": "\n     * \u003cp\u003eInner class defining a rule.\u003c/p\u003e\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.Rule.estimateLength()",
      "begin_line": 1041,
      "end_line": 1041,
      "comment": "\n         * Returns the estimated lentgh of the result.\n         * \n         * @return the estimated length\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.Rule.appendTo(java.lang.StringBuffer, java.util.Calendar)",
      "begin_line": 1049,
      "end_line": 1049,
      "comment": "\n         * Appends the value of the specified calendar to the output buffer based on the rule implementation.\n         * \n         * @param buffer the output buffer\n         * @param calendar calendar to be appended\n         ",
      "child_ranges": []
    },
    {
      "type": "class_interface",
      "name": "NumberRule",
      "is_interface": true,
      "parent_types": [
        "org.apache.commons.lang.time.FastDateFormat.Rule"
      ],
      "begin_line": 1055,
      "end_line": 1063,
      "comment": "\n     * \u003cp\u003eInner class defining a numeric rule.\u003c/p\u003e\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.NumberRule.appendTo(java.lang.StringBuffer, int)",
      "begin_line": 1062,
      "end_line": 1062,
      "comment": "\n         * Appends the specified value to the output buffer based on the rule implementation.\n         * \n         * @param buffer the output buffer\n         * @param value the value to be appended\n         ",
      "child_ranges": []
    },
    {
      "type": "class_interface",
      "name": "CharacterLiteral",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang.time.FastDateFormat.Rule"
      ],
      "begin_line": 1068,
      "end_line": 1094,
      "comment": "\n     * \u003cp\u003eInner class to output a constant single character.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "mValue"
      ],
      "begin_line": 1069,
      "end_line": 1069,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.time.FastDateFormat.CharacterLiteral.CharacterLiteral(char)",
      "begin_line": 1077,
      "end_line": 1079,
      "comment": "\n         * Constructs a new instance of \u003ccode\u003eCharacterLiteral\u003c/code\u003e\n         * to hold the specified value.\n         * \n         * @param value the character literal\n         ",
      "child_ranges": [
        "(line 1078,col 13)-(line 1078,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.CharacterLiteral.estimateLength()",
      "begin_line": 1084,
      "end_line": 1086,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1085,col 13)-(line 1085,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.CharacterLiteral.appendTo(java.lang.StringBuffer, java.util.Calendar)",
      "begin_line": 1091,
      "end_line": 1093,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1092,col 13)-(line 1092,col 34)"
      ]
    },
    {
      "type": "class_interface",
      "name": "StringLiteral",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang.time.FastDateFormat.Rule"
      ],
      "begin_line": 1099,
      "end_line": 1125,
      "comment": "\n     * \u003cp\u003eInner class to output a constant string.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "mValue"
      ],
      "begin_line": 1100,
      "end_line": 1100,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.time.FastDateFormat.StringLiteral.StringLiteral(java.lang.String)",
      "begin_line": 1108,
      "end_line": 1110,
      "comment": "\n         * Constructs a new instance of \u003ccode\u003eStringLiteral\u003c/code\u003e\n         * to hold the specified value.\n         * \n         * @param value the string literal\n         ",
      "child_ranges": [
        "(line 1109,col 13)-(line 1109,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.StringLiteral.estimateLength()",
      "begin_line": 1115,
      "end_line": 1117,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1116,col 13)-(line 1116,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.StringLiteral.appendTo(java.lang.StringBuffer, java.util.Calendar)",
      "begin_line": 1122,
      "end_line": 1124,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1123,col 13)-(line 1123,col 34)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TextField",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang.time.FastDateFormat.Rule"
      ],
      "begin_line": 1130,
      "end_line": 1166,
      "comment": "\n     * \u003cp\u003eInner class to output one of a set of values.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "mField"
      ],
      "begin_line": 1131,
      "end_line": 1131,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mValues"
      ],
      "begin_line": 1132,
      "end_line": 1132,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.time.FastDateFormat.TextField.TextField(int, java.lang.String[])",
      "begin_line": 1141,
      "end_line": 1144,
      "comment": "\n         * Constructs an instance of \u003ccode\u003eTextField\u003c/code\u003e\n         * with the specified field and values.\n         * \n         * @param field the field\n         * @param values the field values\n         ",
      "child_ranges": [
        "(line 1142,col 13)-(line 1142,col 27)",
        "(line 1143,col 13)-(line 1143,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.TextField.estimateLength()",
      "begin_line": 1149,
      "end_line": 1158,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1150,col 13)-(line 1150,col 24)",
        "(line 1151,col 13)-(line 1156,col 13)",
        "(line 1157,col 13)-(line 1157,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.TextField.appendTo(java.lang.StringBuffer, java.util.Calendar)",
      "begin_line": 1163,
      "end_line": 1165,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1164,col 13)-(line 1164,col 57)"
      ]
    },
    {
      "type": "class_interface",
      "name": "UnpaddedNumberField",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang.time.FastDateFormat.NumberRule"
      ],
      "begin_line": 1171,
      "end_line": 1212,
      "comment": "\n     * \u003cp\u003eInner class to output an unpadded number.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "INSTANCE_YEAR"
      ],
      "begin_line": 1172,
      "end_line": 1172,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mField"
      ],
      "begin_line": 1174,
      "end_line": 1174,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.time.FastDateFormat.UnpaddedNumberField.UnpaddedNumberField(int)",
      "begin_line": 1181,
      "end_line": 1183,
      "comment": "\n         * Constructs an instance of \u003ccode\u003eUnpadedNumberField\u003c/code\u003e with the specified field.\n         * \n         * @param field the field\n         ",
      "child_ranges": [
        "(line 1182,col 13)-(line 1182,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.UnpaddedNumberField.estimateLength()",
      "begin_line": 1188,
      "end_line": 1190,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1189,col 13)-(line 1189,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.UnpaddedNumberField.appendTo(java.lang.StringBuffer, java.util.Calendar)",
      "begin_line": 1195,
      "end_line": 1197,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1196,col 13)-(line 1196,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.UnpaddedNumberField.appendTo(java.lang.StringBuffer, int)",
      "begin_line": 1202,
      "end_line": 1211,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1203,col 13)-(line 1210,col 13)"
      ]
    },
    {
      "type": "class_interface",
      "name": "UnpaddedMonthField",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang.time.FastDateFormat.NumberRule"
      ],
      "begin_line": 1217,
      "end_line": 1253,
      "comment": "\n     * \u003cp\u003eInner class to output an unpadded month.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "INSTANCE"
      ],
      "begin_line": 1218,
      "end_line": 1218,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.time.FastDateFormat.UnpaddedMonthField.UnpaddedMonthField()",
      "begin_line": 1224,
      "end_line": 1226,
      "comment": "\n         * Constructs an instance of \u003ccode\u003eUnpaddedMonthField\u003c/code\u003e.\n         *\n         ",
      "child_ranges": [
        "(line 1225,col 13)-(line 1225,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.UnpaddedMonthField.estimateLength()",
      "begin_line": 1231,
      "end_line": 1233,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1232,col 13)-(line 1232,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.UnpaddedMonthField.appendTo(java.lang.StringBuffer, java.util.Calendar)",
      "begin_line": 1238,
      "end_line": 1240,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1239,col 13)-(line 1239,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.UnpaddedMonthField.appendTo(java.lang.StringBuffer, int)",
      "begin_line": 1245,
      "end_line": 1252,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1246,col 13)-(line 1251,col 13)"
      ]
    },
    {
      "type": "class_interface",
      "name": "PaddedNumberField",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang.time.FastDateFormat.NumberRule"
      ],
      "begin_line": 1258,
      "end_line": 1315,
      "comment": "\n     * \u003cp\u003eInner class to output a padded number.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "mField"
      ],
      "begin_line": 1259,
      "end_line": 1259,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mSize"
      ],
      "begin_line": 1260,
      "end_line": 1260,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.time.FastDateFormat.PaddedNumberField.PaddedNumberField(int, int)",
      "begin_line": 1268,
      "end_line": 1275,
      "comment": "\n         * Constructs an instance of \u003ccode\u003ePaddedNumberField\u003c/code\u003e.\n         * \n         * @param field the field\n         * @param size size of the output field\n         ",
      "child_ranges": [
        "(line 1269,col 13)-(line 1272,col 13)",
        "(line 1273,col 13)-(line 1273,col 27)",
        "(line 1274,col 13)-(line 1274,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.PaddedNumberField.estimateLength()",
      "begin_line": 1280,
      "end_line": 1282,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1281,col 13)-(line 1281,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.PaddedNumberField.appendTo(java.lang.StringBuffer, java.util.Calendar)",
      "begin_line": 1287,
      "end_line": 1289,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1288,col 13)-(line 1288,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.PaddedNumberField.appendTo(java.lang.StringBuffer, int)",
      "begin_line": 1294,
      "end_line": 1314,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1295,col 13)-(line 1313,col 13)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TwoDigitNumberField",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang.time.FastDateFormat.NumberRule"
      ],
      "begin_line": 1320,
      "end_line": 1357,
      "comment": "\n     * \u003cp\u003eInner class to output a two digit number.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "mField"
      ],
      "begin_line": 1321,
      "end_line": 1321,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.time.FastDateFormat.TwoDigitNumberField.TwoDigitNumberField(int)",
      "begin_line": 1328,
      "end_line": 1330,
      "comment": "\n         * Constructs an instance of \u003ccode\u003eTwoDigitNumberField\u003c/code\u003e with the specified field.\n         * \n         * @param field the field\n         ",
      "child_ranges": [
        "(line 1329,col 13)-(line 1329,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.TwoDigitNumberField.estimateLength()",
      "begin_line": 1335,
      "end_line": 1337,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1336,col 13)-(line 1336,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.TwoDigitNumberField.appendTo(java.lang.StringBuffer, java.util.Calendar)",
      "begin_line": 1342,
      "end_line": 1344,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1343,col 13)-(line 1343,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.TwoDigitNumberField.appendTo(java.lang.StringBuffer, int)",
      "begin_line": 1349,
      "end_line": 1356,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1350,col 13)-(line 1355,col 13)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TwoDigitYearField",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang.time.FastDateFormat.NumberRule"
      ],
      "begin_line": 1362,
      "end_line": 1393,
      "comment": "\n     * \u003cp\u003eInner class to output a two digit year.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "INSTANCE"
      ],
      "begin_line": 1363,
      "end_line": 1363,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.time.FastDateFormat.TwoDigitYearField.TwoDigitYearField()",
      "begin_line": 1368,
      "end_line": 1370,
      "comment": "\n         * Constructs an instance of \u003ccode\u003eTwoDigitYearField\u003c/code\u003e.\n         ",
      "child_ranges": [
        "(line 1369,col 13)-(line 1369,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.TwoDigitYearField.estimateLength()",
      "begin_line": 1375,
      "end_line": 1377,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1376,col 13)-(line 1376,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.TwoDigitYearField.appendTo(java.lang.StringBuffer, java.util.Calendar)",
      "begin_line": 1382,
      "end_line": 1384,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1383,col 13)-(line 1383,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.TwoDigitYearField.appendTo(java.lang.StringBuffer, int)",
      "begin_line": 1389,
      "end_line": 1392,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1390,col 13)-(line 1390,col 52)",
        "(line 1391,col 13)-(line 1391,col 52)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TwoDigitMonthField",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang.time.FastDateFormat.NumberRule"
      ],
      "begin_line": 1398,
      "end_line": 1429,
      "comment": "\n     * \u003cp\u003eInner class to output a two digit month.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "INSTANCE"
      ],
      "begin_line": 1399,
      "end_line": 1399,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.time.FastDateFormat.TwoDigitMonthField.TwoDigitMonthField()",
      "begin_line": 1404,
      "end_line": 1406,
      "comment": "\n         * Constructs an instance of \u003ccode\u003eTwoDigitMonthField\u003c/code\u003e.\n         ",
      "child_ranges": [
        "(line 1405,col 13)-(line 1405,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.TwoDigitMonthField.estimateLength()",
      "begin_line": 1411,
      "end_line": 1413,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1412,col 13)-(line 1412,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.TwoDigitMonthField.appendTo(java.lang.StringBuffer, java.util.Calendar)",
      "begin_line": 1418,
      "end_line": 1420,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1419,col 13)-(line 1419,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.TwoDigitMonthField.appendTo(java.lang.StringBuffer, int)",
      "begin_line": 1425,
      "end_line": 1428,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1426,col 13)-(line 1426,col 52)",
        "(line 1427,col 13)-(line 1427,col 52)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TwelveHourField",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang.time.FastDateFormat.NumberRule"
      ],
      "begin_line": 1434,
      "end_line": 1471,
      "comment": "\n     * \u003cp\u003eInner class to output the twelve hour field.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "mRule"
      ],
      "begin_line": 1435,
      "end_line": 1435,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.time.FastDateFormat.TwelveHourField.TwelveHourField(org.apache.commons.lang.time.FastDateFormat.NumberRule)",
      "begin_line": 1443,
      "end_line": 1445,
      "comment": "\n         * Constructs an instance of \u003ccode\u003eTwelveHourField\u003c/code\u003e with the specified\n         * \u003ccode\u003eNumberRule\u003c/code\u003e.\n         * \n         * @param rule the rule\n         ",
      "child_ranges": [
        "(line 1444,col 13)-(line 1444,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.TwelveHourField.estimateLength()",
      "begin_line": 1450,
      "end_line": 1452,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1451,col 13)-(line 1451,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.TwelveHourField.appendTo(java.lang.StringBuffer, java.util.Calendar)",
      "begin_line": 1457,
      "end_line": 1463,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1458,col 13)-(line 1458,col 52)",
        "(line 1459,col 13)-(line 1461,col 13)",
        "(line 1462,col 13)-(line 1462,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.TwelveHourField.appendTo(java.lang.StringBuffer, int)",
      "begin_line": 1468,
      "end_line": 1470,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1469,col 13)-(line 1469,col 42)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TwentyFourHourField",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang.time.FastDateFormat.NumberRule"
      ],
      "begin_line": 1476,
      "end_line": 1513,
      "comment": "\n     * \u003cp\u003eInner class to output the twenty four hour field.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "mRule"
      ],
      "begin_line": 1477,
      "end_line": 1477,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.time.FastDateFormat.TwentyFourHourField.TwentyFourHourField(org.apache.commons.lang.time.FastDateFormat.NumberRule)",
      "begin_line": 1485,
      "end_line": 1487,
      "comment": "\n         * Constructs an instance of \u003ccode\u003eTwentyFourHourField\u003c/code\u003e with the specified\n         * \u003ccode\u003eNumberRule\u003c/code\u003e.\n         * \n         * @param rule the rule\n         ",
      "child_ranges": [
        "(line 1486,col 13)-(line 1486,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.TwentyFourHourField.estimateLength()",
      "begin_line": 1492,
      "end_line": 1494,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1493,col 13)-(line 1493,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.TwentyFourHourField.appendTo(java.lang.StringBuffer, java.util.Calendar)",
      "begin_line": 1499,
      "end_line": 1505,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1500,col 13)-(line 1500,col 59)",
        "(line 1501,col 13)-(line 1503,col 13)",
        "(line 1504,col 13)-(line 1504,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.TwentyFourHourField.appendTo(java.lang.StringBuffer, int)",
      "begin_line": 1510,
      "end_line": 1512,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1511,col 13)-(line 1511,col 42)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TimeZoneNameRule",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang.time.FastDateFormat.Rule"
      ],
      "begin_line": 1518,
      "end_line": 1581,
      "comment": "\n     * \u003cp\u003eInner class to output a time zone name.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "mTimeZone"
      ],
      "begin_line": 1519,
      "end_line": 1519,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mTimeZoneForced"
      ],
      "begin_line": 1520,
      "end_line": 1520,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mLocale"
      ],
      "begin_line": 1521,
      "end_line": 1521,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mStyle"
      ],
      "begin_line": 1522,
      "end_line": 1522,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mStandard"
      ],
      "begin_line": 1523,
      "end_line": 1523,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mDaylight"
      ],
      "begin_line": 1524,
      "end_line": 1524,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.time.FastDateFormat.TimeZoneNameRule.TimeZoneNameRule(java.util.TimeZone, boolean, java.util.Locale, int)",
      "begin_line": 1534,
      "end_line": 1547,
      "comment": "\n         * Constructs an instance of \u003ccode\u003eTimeZoneNameRule\u003c/code\u003e with the specified properties.\n         * \n         * @param timeZone the time zone\n         * @param timeZoneForced if \u003ccode\u003etrue\u003c/code\u003e the time zone is forced into standard and daylight\n         * @param locale the locale\n         * @param style the style\n         ",
      "child_ranges": [
        "(line 1535,col 13)-(line 1535,col 33)",
        "(line 1536,col 13)-(line 1536,col 45)",
        "(line 1537,col 13)-(line 1537,col 29)",
        "(line 1538,col 13)-(line 1538,col 27)",
        "(line 1540,col 13)-(line 1546,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.TimeZoneNameRule.estimateLength()",
      "begin_line": 1552,
      "end_line": 1560,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1553,col 13)-(line 1559,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.TimeZoneNameRule.appendTo(java.lang.StringBuffer, java.util.Calendar)",
      "begin_line": 1565,
      "end_line": 1580,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1566,col 13)-(line 1579,col 13)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TimeZoneNumberRule",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang.time.FastDateFormat.Rule"
      ],
      "begin_line": 1587,
      "end_line": 1634,
      "comment": "\n     * \u003cp\u003eInner class to output a time zone as a number \u003ccode\u003e+/-HHMM\u003c/code\u003e\n     * or \u003ccode\u003e+/-HH:MM\u003c/code\u003e.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "INSTANCE_COLON"
      ],
      "begin_line": 1588,
      "end_line": 1588,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "INSTANCE_NO_COLON"
      ],
      "begin_line": 1589,
      "end_line": 1589,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mColon"
      ],
      "begin_line": 1591,
      "end_line": 1591,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.time.FastDateFormat.TimeZoneNumberRule.TimeZoneNumberRule(boolean)",
      "begin_line": 1598,
      "end_line": 1600,
      "comment": "\n         * Constructs an instance of \u003ccode\u003eTimeZoneNumberRule\u003c/code\u003e with the specified properties.\n         * \n         * @param colon add colon between HH and MM in the output if \u003ccode\u003etrue\u003c/code\u003e\n         ",
      "child_ranges": [
        "(line 1599,col 13)-(line 1599,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.TimeZoneNumberRule.estimateLength()",
      "begin_line": 1605,
      "end_line": 1607,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1606,col 13)-(line 1606,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.TimeZoneNumberRule.appendTo(java.lang.StringBuffer, java.util.Calendar)",
      "begin_line": 1612,
      "end_line": 1633,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1613,col 13)-(line 1613,col 96)",
        "(line 1615,col 13)-(line 1620,col 13)",
        "(line 1622,col 13)-(line 1622,col 50)",
        "(line 1623,col 13)-(line 1623,col 52)",
        "(line 1624,col 13)-(line 1624,col 52)",
        "(line 1626,col 13)-(line 1628,col 13)",
        "(line 1630,col 13)-(line 1630,col 60)",
        "(line 1631,col 13)-(line 1631,col 54)",
        "(line 1632,col 13)-(line 1632,col 54)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TimeZoneDisplayKey",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 1640,
      "end_line": 1686,
      "comment": "\n     * \u003cp\u003eInner class that acts as a compound key for time zone names.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "mTimeZone"
      ],
      "begin_line": 1641,
      "end_line": 1641,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mStyle"
      ],
      "begin_line": 1642,
      "end_line": 1642,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mLocale"
      ],
      "begin_line": 1643,
      "end_line": 1643,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.time.FastDateFormat.TimeZoneDisplayKey.TimeZoneDisplayKey(java.util.TimeZone, boolean, int, java.util.Locale)",
      "begin_line": 1653,
      "end_line": 1661,
      "comment": "\n         * Constructs an instance of \u003ccode\u003eTimeZoneDisplayKey\u003c/code\u003e with the specified properties.\n         *  \n         * @param timeZone the time zone\n         * @param daylight adjust the style for daylight saving time if \u003ccode\u003etrue\u003c/code\u003e\n         * @param style the timezone style\n         * @param locale the timezone locale\n         ",
      "child_ranges": [
        "(line 1655,col 13)-(line 1655,col 33)",
        "(line 1656,col 13)-(line 1658,col 13)",
        "(line 1659,col 13)-(line 1659,col 27)",
        "(line 1660,col 13)-(line 1660,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.TimeZoneDisplayKey.hashCode()",
      "begin_line": 1666,
      "end_line": 1668,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1667,col 13)-(line 1667,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.TimeZoneDisplayKey.equals(java.lang.Object)",
      "begin_line": 1673,
      "end_line": 1685,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1674,col 13)-(line 1676,col 13)",
        "(line 1677,col 13)-(line 1683,col 13)",
        "(line 1684,col 13)-(line 1684,col 25)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Pair",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 1695,
      "end_line": 1745,
      "comment": "\n     * \u003cp\u003eHelper class for creating compound objects.\u003c/p\u003e\n     *\n     * \u003cp\u003eOne use for this class is to create a hashtable key\n     * out of multiple objects.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "mObj1"
      ],
      "begin_line": 1696,
      "end_line": 1696,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mObj2"
      ],
      "begin_line": 1697,
      "end_line": 1697,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.time.FastDateFormat.Pair.Pair(java.lang.Object, java.lang.Object)",
      "begin_line": 1704,
      "end_line": 1707,
      "comment": "\n         * Constructs an instance of \u003ccode\u003ePair\u003c/code\u003e to hold the specified objects.\n         * @param obj1 one object in the pair\n         * @param obj2 second object in the pair\n         ",
      "child_ranges": [
        "(line 1705,col 13)-(line 1705,col 25)",
        "(line 1706,col 13)-(line 1706,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.Pair.equals(java.lang.Object)",
      "begin_line": 1712,
      "end_line": 1728,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1713,col 13)-(line 1715,col 13)",
        "(line 1717,col 13)-(line 1719,col 13)",
        "(line 1721,col 13)-(line 1721,col 33)",
        "(line 1723,col 13)-(line 1727,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.Pair.hashCode()",
      "begin_line": 1733,
      "end_line": 1737,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1734,col 13)-(line 1736,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.Pair.toString()",
      "begin_line": 1742,
      "end_line": 1744,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1743,col 13)-(line 1743,col 51)"
      ]
    }
  ]
}