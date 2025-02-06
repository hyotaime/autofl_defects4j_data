{
  "filepath": "/tmp/Jsoup-66b/src/main/java/org/jsoup/helper/Validate.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Validate",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 6,
      "end_line": 112,
      "comment": "\n * Simple validation methods. Designed for jsoup internal use\n "
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.helper.Validate.Validate()",
      "begin_line": 8,
      "end_line": 8,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.Validate.notNull(java.lang.Object)",
      "begin_line": 14,
      "end_line": 17,
      "comment": "\n     * Validates that the object is not null\n     * @param obj object to test\n     ",
      "child_ranges": [
        "(line 15,col 9)-(line 16,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.Validate.notNull(java.lang.Object, java.lang.String)",
      "begin_line": 24,
      "end_line": 27,
      "comment": "\n     * Validates that the object is not null\n     * @param obj object to test\n     * @param msg message to output if validation fails\n     ",
      "child_ranges": [
        "(line 25,col 9)-(line 26,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.Validate.isTrue(boolean)",
      "begin_line": 33,
      "end_line": 36,
      "comment": "\n     * Validates that the value is true\n     * @param val object to test\n     ",
      "child_ranges": [
        "(line 34,col 9)-(line 35,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.Validate.isTrue(boolean, java.lang.String)",
      "begin_line": 43,
      "end_line": 46,
      "comment": "\n     * Validates that the value is true\n     * @param val object to test\n     * @param msg message to output if validation fails\n     ",
      "child_ranges": [
        "(line 44,col 9)-(line 45,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.Validate.isFalse(boolean)",
      "begin_line": 52,
      "end_line": 55,
      "comment": "\n     * Validates that the value is false\n     * @param val object to test\n     ",
      "child_ranges": [
        "(line 53,col 9)-(line 54,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.Validate.isFalse(boolean, java.lang.String)",
      "begin_line": 62,
      "end_line": 65,
      "comment": "\n     * Validates that the value is false\n     * @param val object to test\n     * @param msg message to output if validation fails\n     ",
      "child_ranges": [
        "(line 63,col 9)-(line 64,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.Validate.noNullElements(java.lang.Object[])",
      "begin_line": 71,
      "end_line": 73,
      "comment": "\n     * Validates that the array contains no null elements\n     * @param objects the array to test\n     ",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.Validate.noNullElements(java.lang.Object[], java.lang.String)",
      "begin_line": 80,
      "end_line": 84,
      "comment": "\n     * Validates that the array contains no null elements\n     * @param objects the array to test\n     * @param msg message to output if validation fails\n     ",
      "child_ranges": [
        "(line 81,col 9)-(line 83,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.Validate.notEmpty(java.lang.String)",
      "begin_line": 90,
      "end_line": 93,
      "comment": "\n     * Validates that the string is not empty\n     * @param string the string to test\n     ",
      "child_ranges": [
        "(line 91,col 9)-(line 92,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.Validate.notEmpty(java.lang.String, java.lang.String)",
      "begin_line": 100,
      "end_line": 103,
      "comment": "\n     * Validates that the string is not empty\n     * @param string the string to test\n     * @param msg message to output if validation fails\n     ",
      "child_ranges": [
        "(line 101,col 9)-(line 102,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.Validate.fail(java.lang.String)",
      "begin_line": 109,
      "end_line": 111,
      "comment": "\n     Cause a failure.\n     @param msg message to output.\n     ",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 48)"
      ]
    }
  ]
}