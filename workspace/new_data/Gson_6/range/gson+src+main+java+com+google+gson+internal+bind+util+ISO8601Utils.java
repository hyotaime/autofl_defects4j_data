{
  "filepath": "/tmp/Gson-6b/gson/src/main/java/com/google/gson/internal/bind/util/ISO8601Utils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ISO8601Utils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 17,
      "end_line": 352,
      "comment": " https://github.com/FasterXML/jackson-databind/blob/master/src/main/java/com/fasterxml/jackson/databind/util/ISO8601Utils.java"
    },
    {
      "type": "field",
      "varNames": [
        "UTC_ID"
      ],
      "begin_line": 24,
      "end_line": 24,
      "comment": "\n     * ID to represent the \u0027UTC\u0027 string, default timezone since Jackson 2.7\n     * \n     * @since 2.7\n     "
    },
    {
      "type": "field",
      "varNames": [
        "TIMEZONE_UTC"
      ],
      "begin_line": 30,
      "end_line": 30,
      "comment": "\n     * The UTC timezone, prefetched to avoid more lookups.\n     * \n     * @since 2.7\n     "
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.bind.util.ISO8601Utils.format(java.util.Date)",
      "begin_line": 44,
      "end_line": 46,
      "comment": "\n     * Format a date into \u0027yyyy-MM-ddThh:mm:ssZ\u0027 (default timezone, no milliseconds precision)\n     * \n     * @param date the date to format\n     * @return the date formatted as \u0027yyyy-MM-ddThh:mm:ssZ\u0027\n     ",
      "child_ranges": [
        "(line 45,col 9)-(line 45,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.bind.util.ISO8601Utils.format(java.util.Date, boolean)",
      "begin_line": 55,
      "end_line": 57,
      "comment": "\n     * Format a date into \u0027yyyy-MM-ddThh:mm:ss[.sss]Z\u0027 (GMT timezone)\n     * \n     * @param date the date to format\n     * @param millis true to include millis precision otherwise false\n     * @return the date formatted as \u0027yyyy-MM-ddThh:mm:ss[.sss]Z\u0027\n     ",
      "child_ranges": [
        "(line 56,col 9)-(line 56,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.bind.util.ISO8601Utils.format(java.util.Date, boolean, java.util.TimeZone)",
      "begin_line": 67,
      "end_line": 106,
      "comment": "\n     * Format date into yyyy-MM-ddThh:mm:ss[.sss][Z|[+-]hh:mm]\n     * \n     * @param date the date to format\n     * @param millis true to include millis precision otherwise false\n     * @param tz timezone to use for the formatting (UTC will produce \u0027Z\u0027)\n     * @return the date formatted as yyyy-MM-ddThh:mm:ss[.sss][Z|[+-]hh:mm]\n     ",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 65)",
        "(line 69,col 9)-(line 69,col 31)",
        "(line 72,col 9)-(line 72,col 54)",
        "(line 73,col 9)-(line 73,col 49)",
        "(line 74,col 9)-(line 74,col 78)",
        "(line 75,col 9)-(line 75,col 62)",
        "(line 77,col 9)-(line 77,col 72)",
        "(line 78,col 9)-(line 78,col 30)",
        "(line 79,col 9)-(line 79,col 75)",
        "(line 80,col 9)-(line 80,col 30)",
        "(line 81,col 9)-(line 81,col 78)",
        "(line 82,col 9)-(line 82,col 30)",
        "(line 83,col 9)-(line 83,col 77)",
        "(line 84,col 9)-(line 84,col 30)",
        "(line 85,col 9)-(line 85,col 72)",
        "(line 86,col 9)-(line 86,col 30)",
        "(line 87,col 9)-(line 87,col 72)",
        "(line 88,col 9)-(line 91,col 9)",
        "(line 93,col 9)-(line 93,col 62)",
        "(line 94,col 9)-(line 103,col 9)",
        "(line 105,col 9)-(line 105,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.bind.util.ISO8601Utils.parse(java.lang.String, java.text.ParsePosition)",
      "begin_line": 123,
      "end_line": 277,
      "comment": "\n     * Parse a date from ISO-8601 formatted string. It expects a format\n     * [yyyy-MM-dd|yyyyMMdd][T(hh:mm[:ss[.sss]]|hhmm[ss[.sss]])]?[Z|[+-]hh[:mm]]]\n     * \n     * @param date ISO string to parse in the appropriate format.\n     * @param pos The position to start parsing from, updated to where parsing stopped.\n     * @return the parsed date\n     * @throws ParseException if the date is not in the appropriate format\n     ",
      "child_ranges": [
        "(line 124,col 9)-(line 124,col 30)",
        "(line 125,col 9)-(line 268,col 9)",
        "(line 269,col 9)-(line 269,col 66)",
        "(line 270,col 9)-(line 270,col 39)",
        "(line 271,col 9)-(line 273,col 9)",
        "(line 274,col 9)-(line 274,col 111)",
        "(line 275,col 9)-(line 275,col 27)",
        "(line 276,col 9)-(line 276,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.bind.util.ISO8601Utils.checkOffset(java.lang.String, int, char)",
      "begin_line": 287,
      "end_line": 289,
      "comment": "\n     * Check if the expected character exist at the given offset in the value.\n     * \n     * @param value the string to check at the specified offset\n     * @param offset the offset to look for the expected character\n     * @param expected the expected character\n     * @return true if the expected character exist at the given offset\n     ",
      "child_ranges": [
        "(line 288,col 9)-(line 288,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.bind.util.ISO8601Utils.parseInt(java.lang.String, int, int)",
      "begin_line": 300,
      "end_line": 324,
      "comment": "\n     * Parse an integer located between 2 given offsets in a string\n     * \n     * @param value the string to parse\n     * @param beginIndex the start index for the integer in the string\n     * @param endIndex the end index for the integer in the string\n     * @return the int\n     * @throws NumberFormatException if the value is not a number\n     ",
      "child_ranges": [
        "(line 301,col 9)-(line 303,col 9)",
        "(line 305,col 9)-(line 305,col 27)",
        "(line 306,col 9)-(line 306,col 23)",
        "(line 307,col 9)-(line 307,col 18)",
        "(line 308,col 9)-(line 314,col 9)",
        "(line 315,col 9)-(line 322,col 9)",
        "(line 323,col 9)-(line 323,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.bind.util.ISO8601Utils.padInt(java.lang.StringBuilder, int, int)",
      "begin_line": 333,
      "end_line": 339,
      "comment": "\n     * Zero pad a number to a specified length\n     * \n     * @param buffer buffer to use for padding\n     * @param value the integer value to pad if necessary.\n     * @param length the length of the string we should zero pad\n     ",
      "child_ranges": [
        "(line 334,col 9)-(line 334,col 50)",
        "(line 335,col 9)-(line 337,col 9)",
        "(line 338,col 9)-(line 338,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.bind.util.ISO8601Utils.indexOfNonDigit(java.lang.String, int)",
      "begin_line": 344,
      "end_line": 350,
      "comment": "\n     * Returns the index of the first character in the string that is not a digit, starting at offset.\n     ",
      "child_ranges": [
        "(line 345,col 9)-(line 348,col 9)",
        "(line 349,col 9)-(line 349,col 31)"
      ]
    }
  ]
}