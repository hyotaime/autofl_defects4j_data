{
  "filepath": "/tmp/Mockito-18b/src/org/mockito/AdditionalMatchers.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AdditionalMatchers",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 42,
      "end_line": 992,
      "comment": "\n * See {@link Matchers} for general info about matchers.\n * \u003cp\u003e\n * AdditionalMatchers provides rarely used matchers, kept only for somewhat compatibility with EasyMock. \n * Use additional matchers very judiciously because they may impact readability of a test.\n * It is recommended to use matchers from {@link Matchers} and keep stubbing and verification simple.\n * \u003cp\u003e\n * Example of using logical and(), not(), or() matchers: \n *  \n * \u003cpre class\u003d\"code\"\u003e\u003ccode class\u003d\"java\"\u003e\n *   //anything but not \"ejb\"\n *   mock.someMethod(not(eq(\"ejb\")));\n *   \n *   //not \"ejb\" and not \"michael jackson\"\n *   mock.someMethod(and(not(eq(\"ejb\")), not(eq(\"michael jackson\"))));\n *   \n *   //1 or 10\n *   mock.someMethod(or(eq(1), eq(10)));\n * \u003c/code\u003e\u003c/pre\u003e\n * \n * Scroll down to see all methods - full list of matchers.\n "
    },
    {
      "type": "field",
      "varNames": [
        "MOCKING_PROGRESS"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockito.AdditionalMatchers.geq(java.lang.Comparable\u003cT\u003e)",
      "begin_line": 55,
      "end_line": 57,
      "comment": "\n     * argument greater than or equal the given value.\n     * \u003cp\u003e\n     * See examples in javadoc for {@link AdditionalMatchers} class\n     * \n     * @param value\n     *            the given value.\n     * @return \u003ccode\u003enull\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 56,col 9)-(line 56,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.AdditionalMatchers.geq(byte)",
      "begin_line": 68,
      "end_line": 70,
      "comment": "\n     * byte argument greater than or equal to the given value.\n     * \u003cp\u003e\n     * See examples in javadoc for {@link AdditionalMatchers} class\n     * \n     * @param value\n     *            the given value.\n     * @return \u003ccode\u003e0\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.AdditionalMatchers.geq(double)",
      "begin_line": 81,
      "end_line": 83,
      "comment": "\n     * double argument greater than or equal to the given value.\n     * \u003cp\u003e\n     * See examples in javadoc for {@link AdditionalMatchers} class\n     * \n     * @param value\n     *            the given value.\n     * @return \u003ccode\u003e0\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.AdditionalMatchers.geq(float)",
      "begin_line": 94,
      "end_line": 96,
      "comment": "\n     * float argument greater than or equal to the given value.\n     * \u003cp\u003e\n     * See examples in javadoc for {@link AdditionalMatchers} class\n     * \n     * @param value\n     *            the given value.\n     * @return \u003ccode\u003e0\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.AdditionalMatchers.geq(int)",
      "begin_line": 107,
      "end_line": 109,
      "comment": "\n     * int argument greater than or equal to the given value.\n     * \u003cp\u003e\n     * See examples in javadoc for {@link AdditionalMatchers} class\n     * \n     * @param value\n     *            the given value.\n     * @return \u003ccode\u003e0\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.AdditionalMatchers.geq(long)",
      "begin_line": 120,
      "end_line": 122,
      "comment": "\n     * long argument greater than or equal to the given value.\n     * \u003cp\u003e\n     * See examples in javadoc for {@link AdditionalMatchers} class\n     * \n     * @param value\n     *            the given value.\n     * @return \u003ccode\u003e0\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 121,col 9)-(line 121,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.AdditionalMatchers.geq(short)",
      "begin_line": 133,
      "end_line": 135,
      "comment": "\n     * short argument greater than or equal to the given value.\n     * \u003cp\u003e\n     * See examples in javadoc for {@link AdditionalMatchers} class\n     * \n     * @param value\n     *            the given value.\n     * @return \u003ccode\u003e0\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 134,col 9)-(line 134,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.AdditionalMatchers.leq(java.lang.Comparable\u003cT\u003e)",
      "begin_line": 146,
      "end_line": 148,
      "comment": "\n     * comparable argument less than or equal the given value details.\n     * \u003cp\u003e\n     * See examples in javadoc for {@link AdditionalMatchers} class\n     * \n     * @param value\n     *            the given value.\n     * @return \u003ccode\u003enull\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 147,col 9)-(line 147,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.AdditionalMatchers.leq(byte)",
      "begin_line": 159,
      "end_line": 161,
      "comment": "\n     * byte argument less than or equal to the given value.\n     * \u003cp\u003e\n     * See examples in javadoc for {@link AdditionalMatchers} class\n     * \n     * @param value\n     *            the given value.\n     * @return \u003ccode\u003e0\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 160,col 9)-(line 160,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.AdditionalMatchers.leq(double)",
      "begin_line": 172,
      "end_line": 174,
      "comment": "\n     * double argument less than or equal to the given value.\n     * \u003cp\u003e\n     * See examples in javadoc for {@link AdditionalMatchers} class\n     * \n     * @param value\n     *            the given value.\n     * @return \u003ccode\u003e0\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 173,col 9)-(line 173,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.AdditionalMatchers.leq(float)",
      "begin_line": 185,
      "end_line": 187,
      "comment": "\n     * float argument less than or equal to the given value.\n     * \u003cp\u003e\n     * See examples in javadoc for {@link AdditionalMatchers} class\n     * \n     * @param value\n     *            the given value.\n     * @return \u003ccode\u003e0\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 186,col 9)-(line 186,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.AdditionalMatchers.leq(int)",
      "begin_line": 198,
      "end_line": 200,
      "comment": "\n     * int argument less than or equal to the given value.\n     * \u003cp\u003e\n     * See examples in javadoc for {@link AdditionalMatchers} class\n     * \n     * @param value\n     *            the given value.\n     * @return \u003ccode\u003e0\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 199,col 9)-(line 199,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.AdditionalMatchers.leq(long)",
      "begin_line": 211,
      "end_line": 213,
      "comment": "\n     * long argument less than or equal to the given value.\n     * \u003cp\u003e\n     * See examples in javadoc for {@link AdditionalMatchers} class\n     * \n     * @param value\n     *            the given value.\n     * @return \u003ccode\u003e0\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 212,col 9)-(line 212,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.AdditionalMatchers.leq(short)",
      "begin_line": 224,
      "end_line": 226,
      "comment": "\n     * short argument less than or equal to the given value.\n     * \u003cp\u003e\n     * See examples in javadoc for {@link AdditionalMatchers} class \n     * \n     * @param value\n     *            the given value.\n     * @return \u003ccode\u003e0\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 225,col 9)-(line 225,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.AdditionalMatchers.gt(java.lang.Comparable\u003cT\u003e)",
      "begin_line": 237,
      "end_line": 239,
      "comment": "\n     * comparable argument greater than the given value.\n     * \u003cp\u003e\n     * See examples in javadoc for {@link AdditionalMatchers} class\n     * \n     * @param value\n     *            the given value.\n     * @return \u003ccode\u003enull\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 238,col 9)-(line 238,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.AdditionalMatchers.gt(byte)",
      "begin_line": 250,
      "end_line": 252,
      "comment": "\n     * byte argument greater than the given value.\n     * \u003cp\u003e\n     * See examples in javadoc for {@link AdditionalMatchers} class\n     * \n     * @param value\n     *            the given value.\n     * @return \u003ccode\u003e0\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 251,col 9)-(line 251,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.AdditionalMatchers.gt(double)",
      "begin_line": 263,
      "end_line": 265,
      "comment": "\n     * double argument greater than the given value.\n     * \u003cp\u003e\n     * See examples in javadoc for {@link AdditionalMatchers} class\n     * \n     * @param value\n     *            the given value.\n     * @return \u003ccode\u003e0\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 264,col 9)-(line 264,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.AdditionalMatchers.gt(float)",
      "begin_line": 276,
      "end_line": 278,
      "comment": "\n     * float argument greater than the given value.\n     * \u003cp\u003e\n     * See examples in javadoc for {@link AdditionalMatchers} class\n     * \n     * @param value\n     *            the given value.\n     * @return \u003ccode\u003e0\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 277,col 9)-(line 277,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.AdditionalMatchers.gt(int)",
      "begin_line": 289,
      "end_line": 291,
      "comment": "\n     * int argument greater than the given value.\n     * \u003cp\u003e\n     * See examples in javadoc for {@link AdditionalMatchers} class\n     * \n     * @param value\n     *            the given value.\n     * @return \u003ccode\u003e0\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 290,col 9)-(line 290,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.AdditionalMatchers.gt(long)",
      "begin_line": 302,
      "end_line": 304,
      "comment": "\n     * long argument greater than the given value.\n     * \u003cp\u003e\n     * See examples in javadoc for {@link AdditionalMatchers} class\n     * \n     * @param value\n     *            the given value.\n     * @return \u003ccode\u003e0\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 303,col 9)-(line 303,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.AdditionalMatchers.gt(short)",
      "begin_line": 315,
      "end_line": 317,
      "comment": "\n     * short argument greater than the given value.\n     * \u003cp\u003e\n     * See examples in javadoc for {@link AdditionalMatchers} class\n     * \n     * @param value\n     *            the given value.\n     * @return \u003ccode\u003e0\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 316,col 9)-(line 316,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.AdditionalMatchers.lt(java.lang.Comparable\u003cT\u003e)",
      "begin_line": 328,
      "end_line": 330,
      "comment": "\n     * comparable argument less than the given value.\n     * \u003cp\u003e\n     * See examples in javadoc for {@link AdditionalMatchers} class\n     * \n     * @param value\n     *            the given value.\n     * @return \u003ccode\u003enull\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 329,col 9)-(line 329,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.AdditionalMatchers.lt(byte)",
      "begin_line": 341,
      "end_line": 343,
      "comment": "\n     * byte argument less than the given value.\n     * \u003cp\u003e\n     * See examples in javadoc for {@link AdditionalMatchers} class\n     * \n     * @param value\n     *            the given value.\n     * @return \u003ccode\u003e0\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 342,col 9)-(line 342,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.AdditionalMatchers.lt(double)",
      "begin_line": 354,
      "end_line": 356,
      "comment": "\n     * double argument less than the given value.\n     * \u003cp\u003e\n     * See examples in javadoc for {@link AdditionalMatchers} class\n     * \n     * @param value\n     *            the given value.\n     * @return \u003ccode\u003e0\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 355,col 9)-(line 355,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.AdditionalMatchers.lt(float)",
      "begin_line": 367,
      "end_line": 369,
      "comment": "\n     * float argument less than the given value.\n     * \u003cp\u003e\n     * See examples in javadoc for {@link AdditionalMatchers} class\n     * \n     * @param value\n     *            the given value.\n     * @return \u003ccode\u003e0\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 368,col 9)-(line 368,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.AdditionalMatchers.lt(int)",
      "begin_line": 380,
      "end_line": 382,
      "comment": "\n     * int argument less than the given value.\n     * \u003cp\u003e\n     * See examples in javadoc for {@link AdditionalMatchers} class\n     * \n     * @param value\n     *            the given value.\n     * @return \u003ccode\u003e0\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 381,col 9)-(line 381,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.AdditionalMatchers.lt(long)",
      "begin_line": 393,
      "end_line": 395,
      "comment": "\n     * long argument less than the given value.\n     * \u003cp\u003e\n     * See examples in javadoc for {@link AdditionalMatchers} class\n     * \n     * @param value\n     *            the given value.\n     * @return \u003ccode\u003e0\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 394,col 9)-(line 394,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.AdditionalMatchers.lt(short)",
      "begin_line": 406,
      "end_line": 408,
      "comment": "\n     * short argument less than the given value.\n     * \u003cp\u003e\n     * See examples in javadoc for {@link AdditionalMatchers} class\n     * \n     * @param value\n     *            the given value.\n     * @return \u003ccode\u003e0\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 407,col 9)-(line 407,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.AdditionalMatchers.cmpEq(java.lang.Comparable\u003cT\u003e)",
      "begin_line": 420,
      "end_line": 422,
      "comment": "\n     * comparable argument equals to the given value according to their\n     * compareTo method.\n     * \u003cp\u003e\n     * See examples in javadoc for {@link AdditionalMatchers} class\n     * \n     * @param value\n     *            the given value.\n     * @return \u003ccode\u003enull\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 421,col 9)-(line 421,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.AdditionalMatchers.find(java.lang.String)",
      "begin_line": 432,
      "end_line": 434,
      "comment": "\n     * String argument that contains a substring that matches the given regular\n     * expression.\n     * \n     * @param regex\n     *            the regular expression.\n     * @return \u003ccode\u003enull\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 433,col 9)-(line 433,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.AdditionalMatchers.aryEq(T[])",
      "begin_line": 448,
      "end_line": 450,
      "comment": "\n     * Object array argument that is equal to the given array, i.e. it has to\n     * have the same type, length, and each element has to be equal.\n     * \u003cp\u003e\n     * See examples in javadoc for {@link AdditionalMatchers} class\n     * \n     * @param \u003cT\u003e\n     *            the type of the array, it is passed through to prevent casts.\n     * @param value\n     *            the given array.\n     * @return \u003ccode\u003enull\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 449,col 9)-(line 449,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.AdditionalMatchers.aryEq(short[])",
      "begin_line": 462,
      "end_line": 464,
      "comment": "\n     * short array argument that is equal to the given array, i.e. it has to\n     * have the same length, and each element has to be equal.\n     * \u003cp\u003e\n     * See examples in javadoc for {@link AdditionalMatchers} class\n     * \n     * @param value\n     *            the given array.\n     * @return \u003ccode\u003enull\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 463,col 9)-(line 463,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.AdditionalMatchers.aryEq(long[])",
      "begin_line": 476,
      "end_line": 478,
      "comment": "\n     * long array argument that is equal to the given array, i.e. it has to have\n     * the same length, and each element has to be equal.\n     * \u003cp\u003e\n     * See examples in javadoc for {@link AdditionalMatchers} class\n     * \n     * @param value\n     *            the given array.\n     * @return \u003ccode\u003enull\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 477,col 9)-(line 477,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.AdditionalMatchers.aryEq(int[])",
      "begin_line": 490,
      "end_line": 492,
      "comment": "\n     * int array argument that is equal to the given array, i.e. it has to have\n     * the same length, and each element has to be equal.\n     * \u003cp\u003e\n     * See examples in javadoc for {@link AdditionalMatchers} class\n     * \n     * @param value\n     *            the given array.\n     * @return \u003ccode\u003enull\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 491,col 9)-(line 491,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.AdditionalMatchers.aryEq(float[])",
      "begin_line": 504,
      "end_line": 506,
      "comment": "\n     * float array argument that is equal to the given array, i.e. it has to\n     * have the same length, and each element has to be equal.\n     * \u003cp\u003e\n     * See examples in javadoc for {@link AdditionalMatchers} class\n     * \n     * @param value\n     *            the given array.\n     * @return \u003ccode\u003enull\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 505,col 9)-(line 505,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.AdditionalMatchers.aryEq(double[])",
      "begin_line": 518,
      "end_line": 520,
      "comment": "\n     * double array argument that is equal to the given array, i.e. it has to\n     * have the same length, and each element has to be equal.\n     * \u003cp\u003e\n     * See examples in javadoc for {@link AdditionalMatchers} class\n     * \n     * @param value\n     *            the given array.\n     * @return \u003ccode\u003enull\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 519,col 9)-(line 519,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.AdditionalMatchers.aryEq(char[])",
      "begin_line": 532,
      "end_line": 534,
      "comment": "\n     * char array argument that is equal to the given array, i.e. it has to have\n     * the same length, and each element has to be equal.\n     * \u003cp\u003e\n     * See examples in javadoc for {@link AdditionalMatchers} class\n     * \n     * @param value\n     *            the given array.\n     * @return \u003ccode\u003enull\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 533,col 9)-(line 533,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.AdditionalMatchers.aryEq(byte[])",
      "begin_line": 546,
      "end_line": 548,
      "comment": "\n     * byte array argument that is equal to the given array, i.e. it has to have\n     * the same length, and each element has to be equal.\n     * \u003cp\u003e\n     * See examples in javadoc for {@link AdditionalMatchers} class\n     * \n     * @param value\n     *            the given array.\n     * @return \u003ccode\u003enull\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 547,col 9)-(line 547,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.AdditionalMatchers.aryEq(boolean[])",
      "begin_line": 560,
      "end_line": 562,
      "comment": "\n     * boolean array argument that is equal to the given array, i.e. it has to\n     * have the same length, and each element has to be equal.\n     * \u003cp\u003e\n     * See examples in javadoc for {@link AdditionalMatchers} class\n     * \n     * @param value\n     *            the given array.\n     * @return \u003ccode\u003enull\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 561,col 9)-(line 561,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.AdditionalMatchers.and(boolean, boolean)",
      "begin_line": 575,
      "end_line": 577,
      "comment": "\n     * boolean argument that matches both given matchers.\n     * \u003cp\u003e\n     * See examples in javadoc for {@link AdditionalMatchers} class\n     * \n     * @param first\n     *            placeholder for the first argument matcher.\n     * @param second\n     *            placeholder for the second argument matcher.\n     * @return \u003ccode\u003efalse\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 576,col 9)-(line 576,col 86)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.AdditionalMatchers.and(byte, byte)",
      "begin_line": 590,
      "end_line": 592,
      "comment": "\n     * byte argument that matches both given argument matchers.\n     * \u003cp\u003e\n     * See examples in javadoc for {@link AdditionalMatchers} class\n     * \n     * @param first\n     *            placeholder for the first argument matcher.\n     * @param second\n     *            placeholder for the second argument matcher.\n     * @return \u003ccode\u003e0\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 591,col 9)-(line 591,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.AdditionalMatchers.and(char, char)",
      "begin_line": 605,
      "end_line": 607,
      "comment": "\n     * char argument that matches both given argument matchers.\n     * \u003cp\u003e\n     * See examples in javadoc for {@link AdditionalMatchers} class\n     * \n     * @param first\n     *            placeholder for the first argument matcher.\n     * @param second\n     *            placeholder for the second argument matcher.\n     * @return \u003ccode\u003e0\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 606,col 9)-(line 606,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.AdditionalMatchers.and(double, double)",
      "begin_line": 620,
      "end_line": 622,
      "comment": "\n     * double argument that matches both given argument matchers.\n     * \u003cp\u003e\n     * See examples in javadoc for {@link AdditionalMatchers} class\n     * \n     * @param first\n     *            placeholder for the first argument matcher.\n     * @param second\n     *            placeholder for the second argument matcher.\n     * @return \u003ccode\u003e0\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 621,col 9)-(line 621,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.AdditionalMatchers.and(float, float)",
      "begin_line": 635,
      "end_line": 637,
      "comment": "\n     * float argument that matches both given argument matchers.\n     * \u003cp\u003e\n     * See examples in javadoc for {@link AdditionalMatchers} class\n     * \n     * @param first\n     *            placeholder for the first argument matcher.\n     * @param second\n     *            placeholder for the second argument matcher.\n     * @return \u003ccode\u003e0\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 636,col 9)-(line 636,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.AdditionalMatchers.and(int, int)",
      "begin_line": 650,
      "end_line": 652,
      "comment": "\n     * int argument that matches both given argument matchers.\n     * \u003cp\u003e\n     * See examples in javadoc for {@link AdditionalMatchers} class\n     * \n     * @param first\n     *            placeholder for the first argument matcher.\n     * @param second\n     *            placeholder for the second argument matcher.\n     * @return \u003ccode\u003e0\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 651,col 9)-(line 651,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.AdditionalMatchers.and(long, long)",
      "begin_line": 665,
      "end_line": 667,
      "comment": "\n     * long argument that matches both given argument matchers.\n     * \u003cp\u003e\n     * See examples in javadoc for {@link AdditionalMatchers} class\n     * \n     * @param first\n     *            placeholder for the first argument matcher.\n     * @param second\n     *            placeholder for the second argument matcher.\n     * @return \u003ccode\u003e0\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 666,col 9)-(line 666,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.AdditionalMatchers.and(short, short)",
      "begin_line": 680,
      "end_line": 682,
      "comment": "\n     * short argument that matches both given argument matchers.\n     * \u003cp\u003e\n     * See examples in javadoc for {@link AdditionalMatchers} class\n     * \n     * @param first\n     *            placeholder for the first argument matcher.\n     * @param second\n     *            placeholder for the second argument matcher.\n     * @return \u003ccode\u003e0\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 681,col 9)-(line 681,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.AdditionalMatchers.and(T, T)",
      "begin_line": 697,
      "end_line": 699,
      "comment": "\n     * Object argument that matches both given argument matchers.\n     * \u003cp\u003e\n     * See examples in javadoc for {@link AdditionalMatchers} class\n     * \n     * @param \u003cT\u003e\n     *            the type of the object, it is passed through to prevent casts.\n     * @param first\n     *            placeholder for the first argument matcher.\n     * @param second\n     *            placeholder for the second argument matcher.\n     * @return \u003ccode\u003enull\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 698,col 9)-(line 698,col 88)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.AdditionalMatchers.or(boolean, boolean)",
      "begin_line": 712,
      "end_line": 714,
      "comment": "\n     * boolean argument that matches any of the given argument matchers.\n     * \u003cp\u003e\n     * See examples in javadoc for {@link AdditionalMatchers} class\n     * \n     * @param first\n     *            placeholder for the first argument matcher.\n     * @param second\n     *            placeholder for the second argument matcher.\n     * @return \u003ccode\u003efalse\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 713,col 9)-(line 713,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.AdditionalMatchers.or(T, T)",
      "begin_line": 729,
      "end_line": 731,
      "comment": "\n     * Object argument that matches any of the given argument matchers.\n     * \u003cp\u003e\n     * See examples in javadoc for {@link AdditionalMatchers} class\n     * \n     * @param \u003cT\u003e\n     *            the type of the object, it is passed through to prevent casts.\n     * @param first\n     *            placeholder for the first argument matcher.\n     * @param second\n     *            placeholder for the second argument matcher.\n     * @return \u003ccode\u003enull\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 730,col 9)-(line 730,col 87)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.AdditionalMatchers.or(short, short)",
      "begin_line": 744,
      "end_line": 746,
      "comment": "\n     * short argument that matches any of the given argument matchers.\n     * \u003cp\u003e\n     * See examples in javadoc for {@link AdditionalMatchers} class\n     * \n     * @param first\n     *            placeholder for the first argument matcher.\n     * @param second\n     *            placeholder for the second argument matcher.\n     * @return \u003ccode\u003e0\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 745,col 9)-(line 745,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.AdditionalMatchers.or(long, long)",
      "begin_line": 759,
      "end_line": 761,
      "comment": "\n     * long argument that matches any of the given argument matchers.\n     * \u003cp\u003e\n     * See examples in javadoc for {@link AdditionalMatchers} class\n     * \n     * @param first\n     *            placeholder for the first argument matcher.\n     * @param second\n     *            placeholder for the second argument matcher.\n     * @return \u003ccode\u003e0\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 760,col 9)-(line 760,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.AdditionalMatchers.or(int, int)",
      "begin_line": 774,
      "end_line": 776,
      "comment": "\n     * int argument that matches any of the given argument matchers.\n     * \u003cp\u003e\n     * See examples in javadoc for {@link AdditionalMatchers} class\n     * \n     * @param first\n     *            placeholder for the first argument matcher.\n     * @param second\n     *            placeholder for the second argument matcher.\n     * @return \u003ccode\u003e0\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 775,col 9)-(line 775,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.AdditionalMatchers.or(float, float)",
      "begin_line": 789,
      "end_line": 791,
      "comment": "\n     * float argument that matches any of the given argument matchers.\n     * \u003cp\u003e\n     * See examples in javadoc for {@link AdditionalMatchers} class\n     * \n     * @param first\n     *            placeholder for the first argument matcher.\n     * @param second\n     *            placeholder for the second argument matcher.\n     * @return \u003ccode\u003e0\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 790,col 9)-(line 790,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.AdditionalMatchers.or(double, double)",
      "begin_line": 804,
      "end_line": 806,
      "comment": "\n     * double argument that matches any of the given argument matchers.\n     * \u003cp\u003e\n     * See examples in javadoc for {@link AdditionalMatchers} class\n     * \n     * @param first\n     *            placeholder for the first argument matcher.\n     * @param second\n     *            placeholder for the second argument matcher.\n     * @return \u003ccode\u003e0\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 805,col 9)-(line 805,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.AdditionalMatchers.or(char, char)",
      "begin_line": 819,
      "end_line": 821,
      "comment": "\n     * char argument that matches any of the given argument matchers.\n     * \u003cp\u003e\n     * See examples in javadoc for {@link AdditionalMatchers} class\n     * \n     * @param first\n     *            placeholder for the first argument matcher.\n     * @param second\n     *            placeholder for the second argument matcher.\n     * @return \u003ccode\u003e0\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 820,col 9)-(line 820,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.AdditionalMatchers.or(byte, byte)",
      "begin_line": 834,
      "end_line": 836,
      "comment": "\n     * byte argument that matches any of the given argument matchers.\n     * \u003cp\u003e\n     * See examples in javadoc for {@link AdditionalMatchers} class\n     * \n     * @param first\n     *            placeholder for the first argument matcher.\n     * @param second\n     *            placeholder for the second argument matcher.\n     * @return \u003ccode\u003e0\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 835,col 9)-(line 835,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.AdditionalMatchers.not(T)",
      "begin_line": 849,
      "end_line": 851,
      "comment": "\n     * Object argument that does not match the given argument matcher.\n     * \u003cp\u003e\n     * See examples in javadoc for {@link AdditionalMatchers} class\n     * \n     * @param \u003cT\u003e\n     *            the type of the object, it is passed through to prevent casts.\n     * @param first\n     *            placeholder for the argument matcher.\n     * @return \u003ccode\u003enull\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 850,col 9)-(line 850,col 88)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.AdditionalMatchers.not(short)",
      "begin_line": 862,
      "end_line": 864,
      "comment": "\n     * short argument that does not match the given argument matcher.\n     * \u003cp\u003e\n     * See examples in javadoc for {@link AdditionalMatchers} class\n     * \n     * @param first\n     *            placeholder for the argument matcher.\n     * @return \u003ccode\u003e0\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 863,col 9)-(line 863,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.AdditionalMatchers.not(int)",
      "begin_line": 875,
      "end_line": 877,
      "comment": "\n     * int argument that does not match the given argument matcher.\n     * \u003cp\u003e\n     * See examples in javadoc for {@link AdditionalMatchers} class\n     * \n     * @param first\n     *            placeholder for the argument matcher.\n     * @return \u003ccode\u003e0\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 876,col 9)-(line 876,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.AdditionalMatchers.not(long)",
      "begin_line": 888,
      "end_line": 890,
      "comment": "\n     * long argument that does not match the given argument matcher.\n     * \u003cp\u003e\n     * See examples in javadoc for {@link AdditionalMatchers} class\n     * \n     * @param first\n     *            placeholder for the argument matcher.\n     * @return \u003ccode\u003e0\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 889,col 9)-(line 889,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.AdditionalMatchers.not(float)",
      "begin_line": 901,
      "end_line": 903,
      "comment": "\n     * float argument that does not match the given argument matcher.\n     * \u003cp\u003e\n     * See examples in javadoc for {@link AdditionalMatchers} class\n     * \n     * @param first\n     *            placeholder for the argument matcher.\n     * @return \u003ccode\u003e0\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 902,col 9)-(line 902,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.AdditionalMatchers.not(double)",
      "begin_line": 914,
      "end_line": 916,
      "comment": "\n     * double argument that does not match the given argument matcher.\n     * \u003cp\u003e\n     * See examples in javadoc for {@link AdditionalMatchers} class\n     * \n     * @param first\n     *            placeholder for the argument matcher.\n     * @return \u003ccode\u003e0\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 915,col 9)-(line 915,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.AdditionalMatchers.not(char)",
      "begin_line": 927,
      "end_line": 929,
      "comment": "\n     * char argument that does not match the given argument matcher.\n     * \u003cp\u003e\n     * See examples in javadoc for {@link AdditionalMatchers} class\n     * \n     * @param first\n     *            placeholder for the argument matcher.\n     * @return \u003ccode\u003e0\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 928,col 9)-(line 928,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.AdditionalMatchers.not(boolean)",
      "begin_line": 940,
      "end_line": 942,
      "comment": "\n     * boolean argument that does not match the given argument matcher.\n     * \u003cp\u003e\n     * See examples in javadoc for {@link AdditionalMatchers} class\n     * \n     * @param first\n     *            placeholder for the argument matcher.\n     * @return \u003ccode\u003efalse\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 941,col 9)-(line 941,col 86)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.AdditionalMatchers.not(byte)",
      "begin_line": 953,
      "end_line": 955,
      "comment": "\n     * byte argument that does not match the given argument matcher.\n     * \u003cp\u003e\n     * See examples in javadoc for {@link AdditionalMatchers} class\n     * \n     * @param first\n     *            placeholder for the argument matcher.\n     * @return \u003ccode\u003e0\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 954,col 9)-(line 954,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.AdditionalMatchers.eq(double, double)",
      "begin_line": 969,
      "end_line": 971,
      "comment": "\n     * double argument that has an absolute difference to the given value that\n     * is less than the given delta details.\n     * \u003cp\u003e\n     * See examples in javadoc for {@link AdditionalMatchers} class\n     * \n     * @param value\n     *            the given value.\n     * @param delta\n     *            the given delta.\n     * @return \u003ccode\u003e0\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 970,col 9)-(line 970,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.AdditionalMatchers.eq(float, float)",
      "begin_line": 985,
      "end_line": 987,
      "comment": "\n     * float argument that has an absolute difference to the given value that is\n     * less than the given delta details.\n     * \u003cp\u003e\n     * See examples in javadoc for {@link AdditionalMatchers} class\n     * \n     * @param value\n     *            the given value.\n     * @param delta\n     *            the given delta.\n     * @return \u003ccode\u003e0\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 986,col 9)-(line 986,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.AdditionalMatchers.reportMatcher(org.mockito.ArgumentMatcher\u003c?\u003e)",
      "begin_line": 989,
      "end_line": 991,
      "comment": "",
      "child_ranges": [
        "(line 990,col 9)-(line 990,col 83)"
      ]
    }
  ]
}