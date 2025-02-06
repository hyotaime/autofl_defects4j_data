{
  "filepath": "/tmp/Mockito-38b/src/org/mockito/AdditionalMatchers.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AdditionalMatchers",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 41,
      "end_line": 991,
      "comment": "\n * See {@link Matchers} for general info about matchers.\n * \u003cp\u003e\n * AdditionalMatchers provides rarely used matchers, kept only for somewhat compatibility with EasyMock. \n * Use additional matchers very judiciously because they may impact readability of a test.\n * It is recommended to use matchers from {@link Matchers} and keep stubbing and verification simple.\n * \u003cp\u003e\n * Example of using logical and(), not(), or() matchers: \n *  \n * \u003cpre\u003e\n *   //anything but not \"ejb\"\n *   mock.someMethod(not(eq(\"ejb\")));\n *   \n *   //not \"ejb\" and not \"michael jackson\"\n *   mock.someMethod(and(not(eq(\"ejb\")), not(eq(\"michael jackson\"))));\n *   \n *   //1 or 10\n *   mock.someMethod(or(eq(1), eq(10)));\n * \u003c/pre\u003e\n * \n * Scroll down to see all methods - full list of matchers.\n "
    },
    {
      "type": "field",
      "varNames": [
        "mockingProgress"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockito.AdditionalMatchers.geq(java.lang.Comparable\u003cT\u003e)",
      "begin_line": 54,
      "end_line": 56,
      "comment": "\n     * argument greater than or equal the given value.\n     * \u003cp\u003e\n     * See examples in javadoc for {@link AdditionalMatchers} class\n     * \n     * @param value\n     *            the given value.\n     * @return \u003ccode\u003enull\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.AdditionalMatchers.geq(byte)",
      "begin_line": 67,
      "end_line": 69,
      "comment": "\n     * byte argument greater than or equal to the given value.\n     * \u003cp\u003e\n     * See examples in javadoc for {@link AdditionalMatchers} class\n     * \n     * @param value\n     *            the given value.\n     * @return \u003ccode\u003e0\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.AdditionalMatchers.geq(double)",
      "begin_line": 80,
      "end_line": 82,
      "comment": "\n     * double argument greater than or equal to the given value.\n     * \u003cp\u003e\n     * See examples in javadoc for {@link AdditionalMatchers} class\n     * \n     * @param value\n     *            the given value.\n     * @return \u003ccode\u003e0\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.AdditionalMatchers.geq(float)",
      "begin_line": 93,
      "end_line": 95,
      "comment": "\n     * float argument greater than or equal to the given value.\n     * \u003cp\u003e\n     * See examples in javadoc for {@link AdditionalMatchers} class\n     * \n     * @param value\n     *            the given value.\n     * @return \u003ccode\u003e0\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.AdditionalMatchers.geq(int)",
      "begin_line": 106,
      "end_line": 108,
      "comment": "\n     * int argument greater than or equal to the given value.\n     * \u003cp\u003e\n     * See examples in javadoc for {@link AdditionalMatchers} class\n     * \n     * @param value\n     *            the given value.\n     * @return \u003ccode\u003e0\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 107,col 9)-(line 107,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.AdditionalMatchers.geq(long)",
      "begin_line": 119,
      "end_line": 121,
      "comment": "\n     * long argument greater than or equal to the given value.\n     * \u003cp\u003e\n     * See examples in javadoc for {@link AdditionalMatchers} class\n     * \n     * @param value\n     *            the given value.\n     * @return \u003ccode\u003e0\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 120,col 9)-(line 120,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.AdditionalMatchers.geq(short)",
      "begin_line": 132,
      "end_line": 134,
      "comment": "\n     * short argument greater than or equal to the given value.\n     * \u003cp\u003e\n     * See examples in javadoc for {@link AdditionalMatchers} class\n     * \n     * @param value\n     *            the given value.\n     * @return \u003ccode\u003e0\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 133,col 9)-(line 133,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.AdditionalMatchers.leq(java.lang.Comparable\u003cT\u003e)",
      "begin_line": 145,
      "end_line": 147,
      "comment": "\n     * comparable argument less than or equal the given value details.\n     * \u003cp\u003e\n     * See examples in javadoc for {@link AdditionalMatchers} class\n     * \n     * @param value\n     *            the given value.\n     * @return \u003ccode\u003enull\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 146,col 9)-(line 146,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.AdditionalMatchers.leq(byte)",
      "begin_line": 158,
      "end_line": 160,
      "comment": "\n     * byte argument less than or equal to the given value.\n     * \u003cp\u003e\n     * See examples in javadoc for {@link AdditionalMatchers} class\n     * \n     * @param value\n     *            the given value.\n     * @return \u003ccode\u003e0\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 159,col 9)-(line 159,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.AdditionalMatchers.leq(double)",
      "begin_line": 171,
      "end_line": 173,
      "comment": "\n     * double argument less than or equal to the given value.\n     * \u003cp\u003e\n     * See examples in javadoc for {@link AdditionalMatchers} class\n     * \n     * @param value\n     *            the given value.\n     * @return \u003ccode\u003e0\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 172,col 9)-(line 172,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.AdditionalMatchers.leq(float)",
      "begin_line": 184,
      "end_line": 186,
      "comment": "\n     * float argument less than or equal to the given value.\n     * \u003cp\u003e\n     * See examples in javadoc for {@link AdditionalMatchers} class\n     * \n     * @param value\n     *            the given value.\n     * @return \u003ccode\u003e0\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 185,col 9)-(line 185,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.AdditionalMatchers.leq(int)",
      "begin_line": 197,
      "end_line": 199,
      "comment": "\n     * int argument less than or equal to the given value.\n     * \u003cp\u003e\n     * See examples in javadoc for {@link AdditionalMatchers} class\n     * \n     * @param value\n     *            the given value.\n     * @return \u003ccode\u003e0\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 198,col 9)-(line 198,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.AdditionalMatchers.leq(long)",
      "begin_line": 210,
      "end_line": 212,
      "comment": "\n     * long argument less than or equal to the given value.\n     * \u003cp\u003e\n     * See examples in javadoc for {@link AdditionalMatchers} class\n     * \n     * @param value\n     *            the given value.\n     * @return \u003ccode\u003e0\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 211,col 9)-(line 211,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.AdditionalMatchers.leq(short)",
      "begin_line": 223,
      "end_line": 225,
      "comment": "\n     * short argument less than or equal to the given value.\n     * \u003cp\u003e\n     * See examples in javadoc for {@link AdditionalMatchers} class \n     * \n     * @param value\n     *            the given value.\n     * @return \u003ccode\u003e0\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 224,col 9)-(line 224,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.AdditionalMatchers.gt(java.lang.Comparable\u003cT\u003e)",
      "begin_line": 236,
      "end_line": 238,
      "comment": "\n     * comparable argument greater than the given value.\n     * \u003cp\u003e\n     * See examples in javadoc for {@link AdditionalMatchers} class\n     * \n     * @param value\n     *            the given value.\n     * @return \u003ccode\u003enull\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 237,col 9)-(line 237,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.AdditionalMatchers.gt(byte)",
      "begin_line": 249,
      "end_line": 251,
      "comment": "\n     * byte argument greater than the given value.\n     * \u003cp\u003e\n     * See examples in javadoc for {@link AdditionalMatchers} class\n     * \n     * @param value\n     *            the given value.\n     * @return \u003ccode\u003e0\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 250,col 9)-(line 250,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.AdditionalMatchers.gt(double)",
      "begin_line": 262,
      "end_line": 264,
      "comment": "\n     * double argument greater than the given value.\n     * \u003cp\u003e\n     * See examples in javadoc for {@link AdditionalMatchers} class\n     * \n     * @param value\n     *            the given value.\n     * @return \u003ccode\u003e0\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 263,col 9)-(line 263,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.AdditionalMatchers.gt(float)",
      "begin_line": 275,
      "end_line": 277,
      "comment": "\n     * float argument greater than the given value.\n     * \u003cp\u003e\n     * See examples in javadoc for {@link AdditionalMatchers} class\n     * \n     * @param value\n     *            the given value.\n     * @return \u003ccode\u003e0\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 276,col 9)-(line 276,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.AdditionalMatchers.gt(int)",
      "begin_line": 288,
      "end_line": 290,
      "comment": "\n     * int argument greater than the given value.\n     * \u003cp\u003e\n     * See examples in javadoc for {@link AdditionalMatchers} class\n     * \n     * @param value\n     *            the given value.\n     * @return \u003ccode\u003e0\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 289,col 9)-(line 289,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.AdditionalMatchers.gt(long)",
      "begin_line": 301,
      "end_line": 303,
      "comment": "\n     * long argument greater than the given value.\n     * \u003cp\u003e\n     * See examples in javadoc for {@link AdditionalMatchers} class\n     * \n     * @param value\n     *            the given value.\n     * @return \u003ccode\u003e0\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 302,col 9)-(line 302,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.AdditionalMatchers.gt(short)",
      "begin_line": 314,
      "end_line": 316,
      "comment": "\n     * short argument greater than the given value.\n     * \u003cp\u003e\n     * See examples in javadoc for {@link AdditionalMatchers} class\n     * \n     * @param value\n     *            the given value.\n     * @return \u003ccode\u003e0\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 315,col 9)-(line 315,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.AdditionalMatchers.lt(java.lang.Comparable\u003cT\u003e)",
      "begin_line": 327,
      "end_line": 329,
      "comment": "\n     * comparable argument less than the given value.\n     * \u003cp\u003e\n     * See examples in javadoc for {@link AdditionalMatchers} class\n     * \n     * @param value\n     *            the given value.\n     * @return \u003ccode\u003enull\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 328,col 9)-(line 328,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.AdditionalMatchers.lt(byte)",
      "begin_line": 340,
      "end_line": 342,
      "comment": "\n     * byte argument less than the given value.\n     * \u003cp\u003e\n     * See examples in javadoc for {@link AdditionalMatchers} class\n     * \n     * @param value\n     *            the given value.\n     * @return \u003ccode\u003e0\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 341,col 9)-(line 341,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.AdditionalMatchers.lt(double)",
      "begin_line": 353,
      "end_line": 355,
      "comment": "\n     * double argument less than the given value.\n     * \u003cp\u003e\n     * See examples in javadoc for {@link AdditionalMatchers} class\n     * \n     * @param value\n     *            the given value.\n     * @return \u003ccode\u003e0\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 354,col 9)-(line 354,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.AdditionalMatchers.lt(float)",
      "begin_line": 366,
      "end_line": 368,
      "comment": "\n     * float argument less than the given value.\n     * \u003cp\u003e\n     * See examples in javadoc for {@link AdditionalMatchers} class\n     * \n     * @param value\n     *            the given value.\n     * @return \u003ccode\u003e0\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 367,col 9)-(line 367,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.AdditionalMatchers.lt(int)",
      "begin_line": 379,
      "end_line": 381,
      "comment": "\n     * int argument less than the given value.\n     * \u003cp\u003e\n     * See examples in javadoc for {@link AdditionalMatchers} class\n     * \n     * @param value\n     *            the given value.\n     * @return \u003ccode\u003e0\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 380,col 9)-(line 380,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.AdditionalMatchers.lt(long)",
      "begin_line": 392,
      "end_line": 394,
      "comment": "\n     * long argument less than the given value.\n     * \u003cp\u003e\n     * See examples in javadoc for {@link AdditionalMatchers} class\n     * \n     * @param value\n     *            the given value.\n     * @return \u003ccode\u003e0\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 393,col 9)-(line 393,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.AdditionalMatchers.lt(short)",
      "begin_line": 405,
      "end_line": 407,
      "comment": "\n     * short argument less than the given value.\n     * \u003cp\u003e\n     * See examples in javadoc for {@link AdditionalMatchers} class\n     * \n     * @param value\n     *            the given value.\n     * @return \u003ccode\u003e0\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 406,col 9)-(line 406,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.AdditionalMatchers.cmpEq(java.lang.Comparable\u003cT\u003e)",
      "begin_line": 419,
      "end_line": 421,
      "comment": "\n     * comparable argument equals to the given value according to their\n     * compareTo method.\n     * \u003cp\u003e\n     * See examples in javadoc for {@link AdditionalMatchers} class\n     * \n     * @param value\n     *            the given value.\n     * @return \u003ccode\u003enull\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 420,col 9)-(line 420,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.AdditionalMatchers.find(java.lang.String)",
      "begin_line": 431,
      "end_line": 433,
      "comment": "\n     * String argument that contains a substring that matches the given regular\n     * expression.\n     * \n     * @param regex\n     *            the regular expression.\n     * @return \u003ccode\u003enull\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 432,col 9)-(line 432,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.AdditionalMatchers.aryEq(T[])",
      "begin_line": 447,
      "end_line": 449,
      "comment": "\n     * Object array argument that is equal to the given array, i.e. it has to\n     * have the same type, length, and each element has to be equal.\n     * \u003cp\u003e\n     * See examples in javadoc for {@link AdditionalMatchers} class\n     * \n     * @param \u003cT\u003e\n     *            the type of the array, it is passed through to prevent casts.\n     * @param value\n     *            the given array.\n     * @return \u003ccode\u003enull\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 448,col 9)-(line 448,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.AdditionalMatchers.aryEq(short[])",
      "begin_line": 461,
      "end_line": 463,
      "comment": "\n     * short array argument that is equal to the given array, i.e. it has to\n     * have the same length, and each element has to be equal.\n     * \u003cp\u003e\n     * See examples in javadoc for {@link AdditionalMatchers} class\n     * \n     * @param value\n     *            the given array.\n     * @return \u003ccode\u003enull\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 462,col 9)-(line 462,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.AdditionalMatchers.aryEq(long[])",
      "begin_line": 475,
      "end_line": 477,
      "comment": "\n     * long array argument that is equal to the given array, i.e. it has to have\n     * the same length, and each element has to be equal.\n     * \u003cp\u003e\n     * See examples in javadoc for {@link AdditionalMatchers} class\n     * \n     * @param value\n     *            the given array.\n     * @return \u003ccode\u003enull\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 476,col 9)-(line 476,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.AdditionalMatchers.aryEq(int[])",
      "begin_line": 489,
      "end_line": 491,
      "comment": "\n     * int array argument that is equal to the given array, i.e. it has to have\n     * the same length, and each element has to be equal.\n     * \u003cp\u003e\n     * See examples in javadoc for {@link AdditionalMatchers} class\n     * \n     * @param value\n     *            the given array.\n     * @return \u003ccode\u003enull\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 490,col 9)-(line 490,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.AdditionalMatchers.aryEq(float[])",
      "begin_line": 503,
      "end_line": 505,
      "comment": "\n     * float array argument that is equal to the given array, i.e. it has to\n     * have the same length, and each element has to be equal.\n     * \u003cp\u003e\n     * See examples in javadoc for {@link AdditionalMatchers} class\n     * \n     * @param value\n     *            the given array.\n     * @return \u003ccode\u003enull\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 504,col 9)-(line 504,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.AdditionalMatchers.aryEq(double[])",
      "begin_line": 517,
      "end_line": 519,
      "comment": "\n     * double array argument that is equal to the given array, i.e. it has to\n     * have the same length, and each element has to be equal.\n     * \u003cp\u003e\n     * See examples in javadoc for {@link AdditionalMatchers} class\n     * \n     * @param value\n     *            the given array.\n     * @return \u003ccode\u003enull\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 518,col 9)-(line 518,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.AdditionalMatchers.aryEq(char[])",
      "begin_line": 531,
      "end_line": 533,
      "comment": "\n     * char array argument that is equal to the given array, i.e. it has to have\n     * the same length, and each element has to be equal.\n     * \u003cp\u003e\n     * See examples in javadoc for {@link AdditionalMatchers} class\n     * \n     * @param value\n     *            the given array.\n     * @return \u003ccode\u003enull\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 532,col 9)-(line 532,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.AdditionalMatchers.aryEq(byte[])",
      "begin_line": 545,
      "end_line": 547,
      "comment": "\n     * byte array argument that is equal to the given array, i.e. it has to have\n     * the same length, and each element has to be equal.\n     * \u003cp\u003e\n     * See examples in javadoc for {@link AdditionalMatchers} class\n     * \n     * @param value\n     *            the given array.\n     * @return \u003ccode\u003enull\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 546,col 9)-(line 546,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.AdditionalMatchers.aryEq(boolean[])",
      "begin_line": 559,
      "end_line": 561,
      "comment": "\n     * boolean array argument that is equal to the given array, i.e. it has to\n     * have the same length, and each element has to be equal.\n     * \u003cp\u003e\n     * See examples in javadoc for {@link AdditionalMatchers} class\n     * \n     * @param value\n     *            the given array.\n     * @return \u003ccode\u003enull\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 560,col 9)-(line 560,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.AdditionalMatchers.and(boolean, boolean)",
      "begin_line": 574,
      "end_line": 576,
      "comment": "\n     * boolean argument that matches both given matchers.\n     * \u003cp\u003e\n     * See examples in javadoc for {@link AdditionalMatchers} class\n     * \n     * @param first\n     *            placeholder for the first argument matcher.\n     * @param second\n     *            placeholder for the second argument matcher.\n     * @return \u003ccode\u003efalse\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 575,col 9)-(line 575,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.AdditionalMatchers.and(byte, byte)",
      "begin_line": 589,
      "end_line": 591,
      "comment": "\n     * byte argument that matches both given argument matchers.\n     * \u003cp\u003e\n     * See examples in javadoc for {@link AdditionalMatchers} class\n     * \n     * @param first\n     *            placeholder for the first argument matcher.\n     * @param second\n     *            placeholder for the second argument matcher.\n     * @return \u003ccode\u003e0\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 590,col 9)-(line 590,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.AdditionalMatchers.and(char, char)",
      "begin_line": 604,
      "end_line": 606,
      "comment": "\n     * char argument that matches both given argument matchers.\n     * \u003cp\u003e\n     * See examples in javadoc for {@link AdditionalMatchers} class\n     * \n     * @param first\n     *            placeholder for the first argument matcher.\n     * @param second\n     *            placeholder for the second argument matcher.\n     * @return \u003ccode\u003e0\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 605,col 9)-(line 605,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.AdditionalMatchers.and(double, double)",
      "begin_line": 619,
      "end_line": 621,
      "comment": "\n     * double argument that matches both given argument matchers.\n     * \u003cp\u003e\n     * See examples in javadoc for {@link AdditionalMatchers} class\n     * \n     * @param first\n     *            placeholder for the first argument matcher.\n     * @param second\n     *            placeholder for the second argument matcher.\n     * @return \u003ccode\u003e0\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 620,col 9)-(line 620,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.AdditionalMatchers.and(float, float)",
      "begin_line": 634,
      "end_line": 636,
      "comment": "\n     * float argument that matches both given argument matchers.\n     * \u003cp\u003e\n     * See examples in javadoc for {@link AdditionalMatchers} class\n     * \n     * @param first\n     *            placeholder for the first argument matcher.\n     * @param second\n     *            placeholder for the second argument matcher.\n     * @return \u003ccode\u003e0\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 635,col 9)-(line 635,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.AdditionalMatchers.and(int, int)",
      "begin_line": 649,
      "end_line": 651,
      "comment": "\n     * int argument that matches both given argument matchers.\n     * \u003cp\u003e\n     * See examples in javadoc for {@link AdditionalMatchers} class\n     * \n     * @param first\n     *            placeholder for the first argument matcher.\n     * @param second\n     *            placeholder for the second argument matcher.\n     * @return \u003ccode\u003e0\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 650,col 9)-(line 650,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.AdditionalMatchers.and(long, long)",
      "begin_line": 664,
      "end_line": 666,
      "comment": "\n     * long argument that matches both given argument matchers.\n     * \u003cp\u003e\n     * See examples in javadoc for {@link AdditionalMatchers} class\n     * \n     * @param first\n     *            placeholder for the first argument matcher.\n     * @param second\n     *            placeholder for the second argument matcher.\n     * @return \u003ccode\u003e0\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 665,col 9)-(line 665,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.AdditionalMatchers.and(short, short)",
      "begin_line": 679,
      "end_line": 681,
      "comment": "\n     * short argument that matches both given argument matchers.\n     * \u003cp\u003e\n     * See examples in javadoc for {@link AdditionalMatchers} class\n     * \n     * @param first\n     *            placeholder for the first argument matcher.\n     * @param second\n     *            placeholder for the second argument matcher.\n     * @return \u003ccode\u003e0\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 680,col 9)-(line 680,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.AdditionalMatchers.and(T, T)",
      "begin_line": 696,
      "end_line": 698,
      "comment": "\n     * Object argument that matches both given argument matchers.\n     * \u003cp\u003e\n     * See examples in javadoc for {@link AdditionalMatchers} class\n     * \n     * @param \u003cT\u003e\n     *            the type of the object, it is passed through to prevent casts.\n     * @param first\n     *            placeholder for the first argument matcher.\n     * @param second\n     *            placeholder for the second argument matcher.\n     * @return \u003ccode\u003enull\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 697,col 9)-(line 697,col 87)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.AdditionalMatchers.or(boolean, boolean)",
      "begin_line": 711,
      "end_line": 713,
      "comment": "\n     * boolean argument that matches any of the given argument matchers.\n     * \u003cp\u003e\n     * See examples in javadoc for {@link AdditionalMatchers} class\n     * \n     * @param first\n     *            placeholder for the first argument matcher.\n     * @param second\n     *            placeholder for the second argument matcher.\n     * @return \u003ccode\u003efalse\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 712,col 9)-(line 712,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.AdditionalMatchers.or(T, T)",
      "begin_line": 728,
      "end_line": 730,
      "comment": "\n     * Object argument that matches any of the given argument matchers.\n     * \u003cp\u003e\n     * See examples in javadoc for {@link AdditionalMatchers} class\n     * \n     * @param \u003cT\u003e\n     *            the type of the object, it is passed through to prevent casts.\n     * @param first\n     *            placeholder for the first argument matcher.\n     * @param second\n     *            placeholder for the second argument matcher.\n     * @return \u003ccode\u003enull\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 729,col 9)-(line 729,col 86)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.AdditionalMatchers.or(short, short)",
      "begin_line": 743,
      "end_line": 745,
      "comment": "\n     * short argument that matches any of the given argument matchers.\n     * \u003cp\u003e\n     * See examples in javadoc for {@link AdditionalMatchers} class\n     * \n     * @param first\n     *            placeholder for the first argument matcher.\n     * @param second\n     *            placeholder for the second argument matcher.\n     * @return \u003ccode\u003e0\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 744,col 9)-(line 744,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.AdditionalMatchers.or(long, long)",
      "begin_line": 758,
      "end_line": 760,
      "comment": "\n     * long argument that matches any of the given argument matchers.\n     * \u003cp\u003e\n     * See examples in javadoc for {@link AdditionalMatchers} class\n     * \n     * @param first\n     *            placeholder for the first argument matcher.\n     * @param second\n     *            placeholder for the second argument matcher.\n     * @return \u003ccode\u003e0\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 759,col 9)-(line 759,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.AdditionalMatchers.or(int, int)",
      "begin_line": 773,
      "end_line": 775,
      "comment": "\n     * int argument that matches any of the given argument matchers.\n     * \u003cp\u003e\n     * See examples in javadoc for {@link AdditionalMatchers} class\n     * \n     * @param first\n     *            placeholder for the first argument matcher.\n     * @param second\n     *            placeholder for the second argument matcher.\n     * @return \u003ccode\u003e0\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 774,col 9)-(line 774,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.AdditionalMatchers.or(float, float)",
      "begin_line": 788,
      "end_line": 790,
      "comment": "\n     * float argument that matches any of the given argument matchers.\n     * \u003cp\u003e\n     * See examples in javadoc for {@link AdditionalMatchers} class\n     * \n     * @param first\n     *            placeholder for the first argument matcher.\n     * @param second\n     *            placeholder for the second argument matcher.\n     * @return \u003ccode\u003e0\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 789,col 9)-(line 789,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.AdditionalMatchers.or(double, double)",
      "begin_line": 803,
      "end_line": 805,
      "comment": "\n     * double argument that matches any of the given argument matchers.\n     * \u003cp\u003e\n     * See examples in javadoc for {@link AdditionalMatchers} class\n     * \n     * @param first\n     *            placeholder for the first argument matcher.\n     * @param second\n     *            placeholder for the second argument matcher.\n     * @return \u003ccode\u003e0\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 804,col 9)-(line 804,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.AdditionalMatchers.or(char, char)",
      "begin_line": 818,
      "end_line": 820,
      "comment": "\n     * char argument that matches any of the given argument matchers.\n     * \u003cp\u003e\n     * See examples in javadoc for {@link AdditionalMatchers} class\n     * \n     * @param first\n     *            placeholder for the first argument matcher.\n     * @param second\n     *            placeholder for the second argument matcher.\n     * @return \u003ccode\u003e0\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 819,col 9)-(line 819,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.AdditionalMatchers.or(byte, byte)",
      "begin_line": 833,
      "end_line": 835,
      "comment": "\n     * byte argument that matches any of the given argument matchers.\n     * \u003cp\u003e\n     * See examples in javadoc for {@link AdditionalMatchers} class\n     * \n     * @param first\n     *            placeholder for the first argument matcher.\n     * @param second\n     *            placeholder for the second argument matcher.\n     * @return \u003ccode\u003e0\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 834,col 9)-(line 834,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.AdditionalMatchers.not(T)",
      "begin_line": 848,
      "end_line": 850,
      "comment": "\n     * Object argument that does not match the given argument matcher.\n     * \u003cp\u003e\n     * See examples in javadoc for {@link AdditionalMatchers} class\n     * \n     * @param \u003cT\u003e\n     *            the type of the object, it is passed through to prevent casts.\n     * @param first\n     *            placeholder for the argument matcher.\n     * @return \u003ccode\u003enull\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 849,col 9)-(line 849,col 87)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.AdditionalMatchers.not(short)",
      "begin_line": 861,
      "end_line": 863,
      "comment": "\n     * short argument that does not match the given argument matcher.\n     * \u003cp\u003e\n     * See examples in javadoc for {@link AdditionalMatchers} class\n     * \n     * @param first\n     *            placeholder for the argument matcher.\n     * @return \u003ccode\u003e0\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 862,col 9)-(line 862,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.AdditionalMatchers.not(int)",
      "begin_line": 874,
      "end_line": 876,
      "comment": "\n     * int argument that does not match the given argument matcher.\n     * \u003cp\u003e\n     * See examples in javadoc for {@link AdditionalMatchers} class\n     * \n     * @param first\n     *            placeholder for the argument matcher.\n     * @return \u003ccode\u003e0\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 875,col 9)-(line 875,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.AdditionalMatchers.not(long)",
      "begin_line": 887,
      "end_line": 889,
      "comment": "\n     * long argument that does not match the given argument matcher.\n     * \u003cp\u003e\n     * See examples in javadoc for {@link AdditionalMatchers} class\n     * \n     * @param first\n     *            placeholder for the argument matcher.\n     * @return \u003ccode\u003e0\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 888,col 9)-(line 888,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.AdditionalMatchers.not(float)",
      "begin_line": 900,
      "end_line": 902,
      "comment": "\n     * float argument that does not match the given argument matcher.\n     * \u003cp\u003e\n     * See examples in javadoc for {@link AdditionalMatchers} class\n     * \n     * @param first\n     *            placeholder for the argument matcher.\n     * @return \u003ccode\u003e0\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 901,col 9)-(line 901,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.AdditionalMatchers.not(double)",
      "begin_line": 913,
      "end_line": 915,
      "comment": "\n     * double argument that does not match the given argument matcher.\n     * \u003cp\u003e\n     * See examples in javadoc for {@link AdditionalMatchers} class\n     * \n     * @param first\n     *            placeholder for the argument matcher.\n     * @return \u003ccode\u003e0\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 914,col 9)-(line 914,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.AdditionalMatchers.not(char)",
      "begin_line": 926,
      "end_line": 928,
      "comment": "\n     * char argument that does not match the given argument matcher.\n     * \u003cp\u003e\n     * See examples in javadoc for {@link AdditionalMatchers} class\n     * \n     * @param first\n     *            placeholder for the argument matcher.\n     * @return \u003ccode\u003e0\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 927,col 9)-(line 927,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.AdditionalMatchers.not(boolean)",
      "begin_line": 939,
      "end_line": 941,
      "comment": "\n     * boolean argument that does not match the given argument matcher.\n     * \u003cp\u003e\n     * See examples in javadoc for {@link AdditionalMatchers} class\n     * \n     * @param first\n     *            placeholder for the argument matcher.\n     * @return \u003ccode\u003efalse\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 940,col 9)-(line 940,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.AdditionalMatchers.not(byte)",
      "begin_line": 952,
      "end_line": 954,
      "comment": "\n     * byte argument that does not match the given argument matcher.\n     * \u003cp\u003e\n     * See examples in javadoc for {@link AdditionalMatchers} class\n     * \n     * @param first\n     *            placeholder for the argument matcher.\n     * @return \u003ccode\u003e0\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 953,col 9)-(line 953,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.AdditionalMatchers.eq(double, double)",
      "begin_line": 968,
      "end_line": 970,
      "comment": "\n     * double argument that has an absolute difference to the given value that\n     * is less than the given delta details.\n     * \u003cp\u003e\n     * See examples in javadoc for {@link AdditionalMatchers} class\n     * \n     * @param value\n     *            the given value.\n     * @param delta\n     *            the given delta.\n     * @return \u003ccode\u003e0\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 969,col 9)-(line 969,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.AdditionalMatchers.eq(float, float)",
      "begin_line": 984,
      "end_line": 986,
      "comment": "\n     * float argument that has an absolute difference to the given value that is\n     * less than the given delta details.\n     * \u003cp\u003e\n     * See examples in javadoc for {@link AdditionalMatchers} class\n     * \n     * @param value\n     *            the given value.\n     * @param delta\n     *            the given delta.\n     * @return \u003ccode\u003e0\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 985,col 9)-(line 985,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.AdditionalMatchers.reportMatcher(org.mockito.ArgumentMatcher\u003c?\u003e)",
      "begin_line": 988,
      "end_line": 990,
      "comment": "",
      "child_ranges": [
        "(line 989,col 9)-(line 989,col 82)"
      ]
    }
  ]
}