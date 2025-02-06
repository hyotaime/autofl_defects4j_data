{
  "filepath": "/tmp/Gson-6b/gson/src/test/java/com/google/gson/functional/DefaultTypeAdaptersTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DefaultTypeAdaptersTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 67,
      "end_line": 734,
      "comment": "\n * Functional test for Json serialization and deserialization for common classes for which default\n * support is provided in Gson. The tests for Map types are available in {@link MapTest}.\n *\n * @author Inderjeet Singh\n * @author Joel Leitch\n "
    },
    {
      "type": "field",
      "varNames": [
        "gson"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "oldTimeZone"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.DefaultTypeAdaptersTest.setUp()",
      "begin_line": 71,
      "end_line": 78,
      "comment": "",
      "child_ranges": [
        "(line 73,col 5)-(line 73,col 18)",
        "(line 74,col 5)-(line 74,col 45)",
        "(line 75,col 5)-(line 75,col 69)",
        "(line 76,col 5)-(line 76,col 33)",
        "(line 77,col 5)-(line 77,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.DefaultTypeAdaptersTest.tearDown()",
      "begin_line": 80,
      "end_line": 84,
      "comment": "",
      "child_ranges": [
        "(line 82,col 5)-(line 82,col 37)",
        "(line 83,col 5)-(line 83,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.DefaultTypeAdaptersTest.testClassSerialization()",
      "begin_line": 86,
      "end_line": 93,
      "comment": "",
      "child_ranges": [
        "(line 87,col 5)-(line 89,col 55)",
        "(line 91,col 5)-(line 91,col 97)",
        "(line 92,col 5)-(line 92,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.DefaultTypeAdaptersTest.testClassDeserialization()",
      "begin_line": 95,
      "end_line": 102,
      "comment": "",
      "child_ranges": [
        "(line 96,col 5)-(line 98,col 55)",
        "(line 100,col 5)-(line 100,col 97)",
        "(line 101,col 5)-(line 101,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.DefaultTypeAdaptersTest.testUrlSerialization()",
      "begin_line": 104,
      "end_line": 108,
      "comment": "",
      "child_ranges": [
        "(line 105,col 5)-(line 105,col 43)",
        "(line 106,col 5)-(line 106,col 32)",
        "(line 107,col 5)-(line 107,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.DefaultTypeAdaptersTest.testUrlDeserialization()",
      "begin_line": 110,
      "end_line": 118,
      "comment": "",
      "child_ranges": [
        "(line 111,col 5)-(line 111,col 43)",
        "(line 112,col 5)-(line 112,col 47)",
        "(line 113,col 5)-(line 113,col 48)",
        "(line 114,col 5)-(line 114,col 52)",
        "(line 116,col 5)-(line 116,col 51)",
        "(line 117,col 5)-(line 117,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.DefaultTypeAdaptersTest.testUrlNullSerialization()",
      "begin_line": 120,
      "end_line": 123,
      "comment": "",
      "child_ranges": [
        "(line 121,col 5)-(line 121,col 55)",
        "(line 122,col 5)-(line 122,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.DefaultTypeAdaptersTest.testUrlNullDeserialization()",
      "begin_line": 125,
      "end_line": 129,
      "comment": "",
      "child_ranges": [
        "(line 126,col 5)-(line 126,col 23)",
        "(line 127,col 5)-(line 127,col 76)",
        "(line 128,col 5)-(line 128,col 27)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ClassWithUrlField",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 131,
      "end_line": 133,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "url"
      ],
      "begin_line": 132,
      "end_line": 132,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.DefaultTypeAdaptersTest.testUriSerialization()",
      "begin_line": 135,
      "end_line": 139,
      "comment": "",
      "child_ranges": [
        "(line 136,col 5)-(line 136,col 43)",
        "(line 137,col 5)-(line 137,col 32)",
        "(line 138,col 5)-(line 138,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.DefaultTypeAdaptersTest.testUriDeserialization()",
      "begin_line": 141,
      "end_line": 146,
      "comment": "",
      "child_ranges": [
        "(line 142,col 5)-(line 142,col 43)",
        "(line 143,col 5)-(line 143,col 39)",
        "(line 144,col 5)-(line 144,col 48)",
        "(line 145,col 5)-(line 145,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.DefaultTypeAdaptersTest.testNullSerialization()",
      "begin_line": 148,
      "end_line": 181,
      "comment": "",
      "child_ranges": [
        "(line 149,col 5)-(line 149,col 59)",
        "(line 150,col 5)-(line 150,col 56)",
        "(line 151,col 5)-(line 151,col 57)",
        "(line 152,col 5)-(line 152,col 59)",
        "(line 153,col 5)-(line 153,col 56)",
        "(line 154,col 5)-(line 154,col 58)",
        "(line 155,col 5)-(line 155,col 57)",
        "(line 156,col 5)-(line 156,col 58)",
        "(line 157,col 5)-(line 157,col 61)",
        "(line 158,col 5)-(line 158,col 58)",
        "(line 159,col 5)-(line 159,col 65)",
        "(line 160,col 5)-(line 160,col 64)",
        "(line 161,col 5)-(line 161,col 62)",
        "(line 162,col 5)-(line 162,col 62)",
        "(line 163,col 5)-(line 163,col 59)",
        "(line 164,col 5)-(line 164,col 61)",
        "(line 165,col 5)-(line 165,col 59)",
        "(line 166,col 5)-(line 166,col 62)",
        "(line 167,col 5)-(line 167,col 55)",
        "(line 168,col 5)-(line 168,col 55)",
        "(line 169,col 5)-(line 169,col 56)",
        "(line 170,col 5)-(line 170,col 58)",
        "(line 171,col 5)-(line 171,col 63)",
        "(line 172,col 5)-(line 172,col 58)",
        "(line 173,col 5)-(line 173,col 56)",
        "(line 174,col 5)-(line 174,col 69)",
        "(line 175,col 5)-(line 175,col 60)",
        "(line 176,col 5)-(line 176,col 56)",
        "(line 177,col 5)-(line 177,col 61)",
        "(line 178,col 5)-(line 178,col 65)",
        "(line 179,col 5)-(line 179,col 56)",
        "(line 180,col 5)-(line 180,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.DefaultTypeAdaptersTest.testNullSerializationAndDeserialization(java.lang.Class\u003c?\u003e)",
      "begin_line": 183,
      "end_line": 186,
      "comment": "",
      "child_ranges": [
        "(line 184,col 5)-(line 184,col 47)",
        "(line 185,col 5)-(line 185,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.DefaultTypeAdaptersTest.testUuidSerialization()",
      "begin_line": 188,
      "end_line": 192,
      "comment": "",
      "child_ranges": [
        "(line 189,col 5)-(line 189,col 62)",
        "(line 190,col 5)-(line 190,col 43)",
        "(line 191,col 5)-(line 191,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.DefaultTypeAdaptersTest.testUuidDeserialization()",
      "begin_line": 194,
      "end_line": 199,
      "comment": "",
      "child_ranges": [
        "(line 195,col 5)-(line 195,col 62)",
        "(line 196,col 5)-(line 196,col 40)",
        "(line 197,col 5)-(line 197,col 50)",
        "(line 198,col 5)-(line 198,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.DefaultTypeAdaptersTest.testLocaleSerializationWithLanguage()",
      "begin_line": 201,
      "end_line": 204,
      "comment": "",
      "child_ranges": [
        "(line 202,col 5)-(line 202,col 37)",
        "(line 203,col 5)-(line 203,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.DefaultTypeAdaptersTest.testLocaleDeserializationWithLanguage()",
      "begin_line": 206,
      "end_line": 210,
      "comment": "",
      "child_ranges": [
        "(line 207,col 5)-(line 207,col 27)",
        "(line 208,col 5)-(line 208,col 54)",
        "(line 209,col 5)-(line 209,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.DefaultTypeAdaptersTest.testLocaleSerializationWithLanguageCountry()",
      "begin_line": 212,
      "end_line": 215,
      "comment": "",
      "child_ranges": [
        "(line 213,col 5)-(line 213,col 41)",
        "(line 214,col 5)-(line 214,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.DefaultTypeAdaptersTest.testLocaleDeserializationWithLanguageCountry()",
      "begin_line": 217,
      "end_line": 221,
      "comment": "",
      "child_ranges": [
        "(line 218,col 5)-(line 218,col 30)",
        "(line 219,col 5)-(line 219,col 54)",
        "(line 220,col 5)-(line 220,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.DefaultTypeAdaptersTest.testLocaleSerializationWithLanguageCountryVariant()",
      "begin_line": 223,
      "end_line": 227,
      "comment": "",
      "child_ranges": [
        "(line 224,col 5)-(line 224,col 51)",
        "(line 225,col 5)-(line 225,col 38)",
        "(line 226,col 5)-(line 226,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.DefaultTypeAdaptersTest.testLocaleDeserializationWithLanguageCountryVariant()",
      "begin_line": 229,
      "end_line": 235,
      "comment": "",
      "child_ranges": [
        "(line 230,col 5)-(line 230,col 35)",
        "(line 231,col 5)-(line 231,col 54)",
        "(line 232,col 5)-(line 232,col 45)",
        "(line 233,col 5)-(line 233,col 44)",
        "(line 234,col 5)-(line 234,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.DefaultTypeAdaptersTest.testBigDecimalFieldSerialization()",
      "begin_line": 237,
      "end_line": 242,
      "comment": "",
      "child_ranges": [
        "(line 238,col 5)-(line 238,col 72)",
        "(line 239,col 5)-(line 239,col 38)",
        "(line 240,col 5)-(line 240,col 77)",
        "(line 241,col 5)-(line 241,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.DefaultTypeAdaptersTest.testBigDecimalFieldDeserialization()",
      "begin_line": 244,
      "end_line": 249,
      "comment": "",
      "child_ranges": [
        "(line 245,col 5)-(line 245,col 74)",
        "(line 246,col 5)-(line 246,col 45)",
        "(line 247,col 5)-(line 247,col 80)",
        "(line 248,col 5)-(line 248,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.DefaultTypeAdaptersTest.testBadValueForBigDecimalDeserialization()",
      "begin_line": 251,
      "end_line": 256,
      "comment": "",
      "child_ranges": [
        "(line 252,col 5)-(line 255,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.DefaultTypeAdaptersTest.testBigIntegerFieldSerialization()",
      "begin_line": 258,
      "end_line": 262,
      "comment": "",
      "child_ranges": [
        "(line 259,col 5)-(line 259,col 99)",
        "(line 260,col 5)-(line 260,col 38)",
        "(line 261,col 5)-(line 261,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.DefaultTypeAdaptersTest.testBigIntegerFieldDeserialization()",
      "begin_line": 264,
      "end_line": 269,
      "comment": "",
      "child_ranges": [
        "(line 265,col 5)-(line 265,col 99)",
        "(line 266,col 5)-(line 266,col 45)",
        "(line 267,col 5)-(line 267,col 80)",
        "(line 268,col 5)-(line 268,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.DefaultTypeAdaptersTest.testOverrideBigIntegerTypeAdapter()",
      "begin_line": 271,
      "end_line": 277,
      "comment": "",
      "child_ranges": [
        "(line 272,col 5)-(line 274,col 18)",
        "(line 275,col 5)-(line 275,col 82)",
        "(line 276,col 5)-(line 276,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.DefaultTypeAdaptersTest.testOverrideBigDecimalTypeAdapter()",
      "begin_line": 279,
      "end_line": 285,
      "comment": "",
      "child_ranges": [
        "(line 280,col 5)-(line 282,col 18)",
        "(line 283,col 5)-(line 283,col 82)",
        "(line 284,col 5)-(line 284,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.DefaultTypeAdaptersTest.testSetSerialization()",
      "begin_line": 287,
      "end_line": 296,
      "comment": "",
      "child_ranges": [
        "(line 288,col 5)-(line 288,col 27)",
        "(line 289,col 5)-(line 289,col 46)",
        "(line 290,col 5)-(line 290,col 18)",
        "(line 291,col 5)-(line 291,col 33)",
        "(line 292,col 5)-(line 292,col 37)",
        "(line 294,col 5)-(line 294,col 37)",
        "(line 295,col 5)-(line 295,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.DefaultTypeAdaptersTest.testBitSetSerialization()",
      "begin_line": 298,
      "end_line": 306,
      "comment": "",
      "child_ranges": [
        "(line 299,col 5)-(line 299,col 27)",
        "(line 300,col 5)-(line 300,col 31)",
        "(line 301,col 5)-(line 301,col 16)",
        "(line 302,col 5)-(line 302,col 19)",
        "(line 303,col 5)-(line 303,col 16)",
        "(line 304,col 5)-(line 304,col 36)",
        "(line 305,col 5)-(line 305,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.DefaultTypeAdaptersTest.testBitSetDeserialization()",
      "begin_line": 308,
      "end_line": 326,
      "comment": "",
      "child_ranges": [
        "(line 309,col 5)-(line 309,col 35)",
        "(line 310,col 5)-(line 310,col 20)",
        "(line 311,col 5)-(line 311,col 23)",
        "(line 312,col 5)-(line 312,col 20)",
        "(line 314,col 5)-(line 314,col 27)",
        "(line 315,col 5)-(line 315,col 40)",
        "(line 316,col 5)-(line 316,col 62)",
        "(line 318,col 5)-(line 318,col 39)",
        "(line 319,col 5)-(line 319,col 62)",
        "(line 321,col 5)-(line 321,col 69)",
        "(line 322,col 5)-(line 322,col 62)",
        "(line 324,col 5)-(line 324,col 75)",
        "(line 325,col 5)-(line 325,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.DefaultTypeAdaptersTest.testDefaultDateSerialization()",
      "begin_line": 328,
      "end_line": 332,
      "comment": "",
      "child_ranges": [
        "(line 329,col 5)-(line 329,col 40)",
        "(line 330,col 5)-(line 330,col 35)",
        "(line 331,col 5)-(line 331,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.DefaultTypeAdaptersTest.testDefaultDateDeserialization()",
      "begin_line": 334,
      "end_line": 339,
      "comment": "",
      "child_ranges": [
        "(line 335,col 5)-(line 335,col 47)",
        "(line 336,col 5)-(line 336,col 53)",
        "(line 337,col 5)-(line 337,col 46)",
        "(line 338,col 5)-(line 338,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.DefaultTypeAdaptersTest.assertEqualsDate(java.util.Date, int, int, int)",
      "begin_line": 343,
      "end_line": 348,
      "comment": " millisecond portion.",
      "child_ranges": [
        "(line 345,col 5)-(line 345,col 44)",
        "(line 346,col 5)-(line 346,col 41)",
        "(line 347,col 5)-(line 347,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.DefaultTypeAdaptersTest.assertEqualsTime(java.util.Date, int, int, int)",
      "begin_line": 350,
      "end_line": 355,
      "comment": "",
      "child_ranges": [
        "(line 352,col 5)-(line 352,col 41)",
        "(line 353,col 5)-(line 353,col 45)",
        "(line 354,col 5)-(line 354,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.DefaultTypeAdaptersTest.testDefaultJavaSqlDateSerialization()",
      "begin_line": 357,
      "end_line": 361,
      "comment": "",
      "child_ranges": [
        "(line 358,col 5)-(line 358,col 62)",
        "(line 359,col 5)-(line 359,col 39)",
        "(line 360,col 5)-(line 360,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.DefaultTypeAdaptersTest.testDefaultJavaSqlDateDeserialization()",
      "begin_line": 363,
      "end_line": 367,
      "comment": "",
      "child_ranges": [
        "(line 364,col 5)-(line 364,col 34)",
        "(line 365,col 5)-(line 365,col 71)",
        "(line 366,col 5)-(line 366,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.DefaultTypeAdaptersTest.testDefaultJavaSqlTimestampSerialization()",
      "begin_line": 369,
      "end_line": 373,
      "comment": "",
      "child_ranges": [
        "(line 370,col 5)-(line 370,col 59)",
        "(line 371,col 5)-(line 371,col 35)",
        "(line 372,col 5)-(line 372,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.DefaultTypeAdaptersTest.testDefaultJavaSqlTimestampDeserialization()",
      "begin_line": 375,
      "end_line": 380,
      "comment": "",
      "child_ranges": [
        "(line 376,col 5)-(line 376,col 45)",
        "(line 377,col 5)-(line 377,col 63)",
        "(line 378,col 5)-(line 378,col 45)",
        "(line 379,col 5)-(line 379,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.DefaultTypeAdaptersTest.testDefaultJavaSqlTimeSerialization()",
      "begin_line": 382,
      "end_line": 386,
      "comment": "",
      "child_ranges": [
        "(line 383,col 5)-(line 383,col 40)",
        "(line 384,col 5)-(line 384,col 35)",
        "(line 385,col 5)-(line 385,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.DefaultTypeAdaptersTest.testDefaultJavaSqlTimeDeserialization()",
      "begin_line": 388,
      "end_line": 392,
      "comment": "",
      "child_ranges": [
        "(line 389,col 5)-(line 389,col 33)",
        "(line 390,col 5)-(line 390,col 53)",
        "(line 391,col 5)-(line 391,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.DefaultTypeAdaptersTest.testDefaultDateSerializationUsingBuilder()",
      "begin_line": 394,
      "end_line": 399,
      "comment": "",
      "child_ranges": [
        "(line 395,col 5)-(line 395,col 43)",
        "(line 396,col 5)-(line 396,col 40)",
        "(line 397,col 5)-(line 397,col 35)",
        "(line 398,col 5)-(line 398,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.DefaultTypeAdaptersTest.testDefaultDateDeserializationUsingBuilder()",
      "begin_line": 401,
      "end_line": 407,
      "comment": "",
      "child_ranges": [
        "(line 402,col 5)-(line 402,col 43)",
        "(line 403,col 5)-(line 403,col 40)",
        "(line 404,col 5)-(line 404,col 35)",
        "(line 405,col 5)-(line 405,col 53)",
        "(line 406,col 5)-(line 406,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.DefaultTypeAdaptersTest.testDefaultCalendarSerialization()",
      "begin_line": 409,
      "end_line": 418,
      "comment": "",
      "child_ranges": [
        "(line 410,col 5)-(line 410,col 43)",
        "(line 411,col 5)-(line 411,col 54)",
        "(line 412,col 5)-(line 412,col 38)",
        "(line 413,col 5)-(line 413,col 39)",
        "(line 414,col 5)-(line 414,col 44)",
        "(line 415,col 5)-(line 415,col 43)",
        "(line 416,col 5)-(line 416,col 40)",
        "(line 417,col 5)-(line 417,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.DefaultTypeAdaptersTest.testDefaultCalendarDeserialization()",
      "begin_line": 420,
      "end_line": 430,
      "comment": "",
      "child_ranges": [
        "(line 421,col 5)-(line 421,col 43)",
        "(line 422,col 5)-(line 422,col 87)",
        "(line 423,col 5)-(line 423,col 55)",
        "(line 424,col 5)-(line 424,col 47)",
        "(line 425,col 5)-(line 425,col 45)",
        "(line 426,col 5)-(line 426,col 53)",
        "(line 427,col 5)-(line 427,col 52)",
        "(line 428,col 5)-(line 428,col 47)",
        "(line 429,col 5)-(line 429,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.DefaultTypeAdaptersTest.testDefaultGregorianCalendarSerialization()",
      "begin_line": 432,
      "end_line": 442,
      "comment": "",
      "child_ranges": [
        "(line 433,col 5)-(line 433,col 43)",
        "(line 434,col 5)-(line 434,col 52)",
        "(line 435,col 5)-(line 435,col 35)",
        "(line 436,col 5)-(line 436,col 38)",
        "(line 437,col 5)-(line 437,col 39)",
        "(line 438,col 5)-(line 438,col 44)",
        "(line 439,col 5)-(line 439,col 43)",
        "(line 440,col 5)-(line 440,col 40)",
        "(line 441,col 5)-(line 441,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.DefaultTypeAdaptersTest.testDefaultGregorianCalendarDeserialization()",
      "begin_line": 444,
      "end_line": 454,
      "comment": "",
      "child_ranges": [
        "(line 445,col 5)-(line 445,col 43)",
        "(line 446,col 5)-(line 446,col 87)",
        "(line 447,col 5)-(line 447,col 73)",
        "(line 448,col 5)-(line 448,col 47)",
        "(line 449,col 5)-(line 449,col 45)",
        "(line 450,col 5)-(line 450,col 53)",
        "(line 451,col 5)-(line 451,col 52)",
        "(line 452,col 5)-(line 452,col 47)",
        "(line 453,col 5)-(line 453,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.DefaultTypeAdaptersTest.testDateSerializationWithPattern()",
      "begin_line": 456,
      "end_line": 462,
      "comment": "",
      "child_ranges": [
        "(line 457,col 5)-(line 457,col 34)",
        "(line 458,col 5)-(line 458,col 97)",
        "(line 459,col 5)-(line 459,col 40)",
        "(line 460,col 5)-(line 460,col 35)",
        "(line 461,col 5)-(line 461,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.DefaultTypeAdaptersTest.testDateDeserializationWithPattern()",
      "begin_line": 464,
      "end_line": 474,
      "comment": "",
      "child_ranges": [
        "(line 466,col 5)-(line 466,col 34)",
        "(line 467,col 5)-(line 467,col 97)",
        "(line 468,col 5)-(line 468,col 40)",
        "(line 469,col 5)-(line 469,col 35)",
        "(line 470,col 5)-(line 470,col 53)",
        "(line 471,col 5)-(line 471,col 53)",
        "(line 472,col 5)-(line 472,col 55)",
        "(line 473,col 5)-(line 473,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.DefaultTypeAdaptersTest.testDateSerializationWithPatternNotOverridenByTypeAdapter()",
      "begin_line": 476,
      "end_line": 492,
      "comment": "",
      "child_ranges": [
        "(line 477,col 5)-(line 477,col 34)",
        "(line 478,col 5)-(line 487,col 18)",
        "(line 489,col 5)-(line 489,col 40)",
        "(line 490,col 5)-(line 490,col 35)",
        "(line 491,col 5)-(line 491,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.DefaultTypeAdaptersTest.Anonymous-a8a49e8c-77aa-4f3d-aafc-c9cc224ffecd.deserialize(com.google.gson.JsonElement, java.lang.reflect.Type, com.google.gson.JsonDeserializationContext)",
      "begin_line": 481,
      "end_line": 485,
      "comment": "",
      "child_ranges": [
        "(line 484,col 13)-(line 484,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.DefaultTypeAdaptersTest.testDateSerializationInCollection()",
      "begin_line": 495,
      "end_line": 511,
      "comment": " http://code.google.com/p/google-gson/issues/detail?id\u003d230",
      "child_ranges": [
        "(line 496,col 5)-(line 496,col 64)",
        "(line 497,col 5)-(line 497,col 53)",
        "(line 498,col 5)-(line 498,col 53)",
        "(line 499,col 5)-(line 499,col 47)",
        "(line 500,col 5)-(line 500,col 33)",
        "(line 501,col 5)-(line 510,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.DefaultTypeAdaptersTest.testTimestampSerialization()",
      "begin_line": 514,
      "end_line": 529,
      "comment": " http://code.google.com/p/google-gson/issues/detail?id\u003d230",
      "child_ranges": [
        "(line 515,col 5)-(line 515,col 53)",
        "(line 516,col 5)-(line 516,col 53)",
        "(line 517,col 5)-(line 517,col 47)",
        "(line 518,col 5)-(line 518,col 33)",
        "(line 519,col 5)-(line 528,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.DefaultTypeAdaptersTest.testSqlDateSerialization()",
      "begin_line": 532,
      "end_line": 547,
      "comment": " http://code.google.com/p/google-gson/issues/detail?id\u003d230",
      "child_ranges": [
        "(line 533,col 5)-(line 533,col 53)",
        "(line 534,col 5)-(line 534,col 53)",
        "(line 535,col 5)-(line 535,col 47)",
        "(line 536,col 5)-(line 536,col 33)",
        "(line 537,col 5)-(line 546,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.DefaultTypeAdaptersTest.testJsonPrimitiveSerialization()",
      "begin_line": 549,
      "end_line": 554,
      "comment": "",
      "child_ranges": [
        "(line 550,col 5)-(line 550,col 76)",
        "(line 551,col 5)-(line 551,col 82)",
        "(line 552,col 5)-(line 552,col 86)",
        "(line 553,col 5)-(line 553,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.DefaultTypeAdaptersTest.testJsonPrimitiveDeserialization()",
      "begin_line": 556,
      "end_line": 565,
      "comment": "",
      "child_ranges": [
        "(line 557,col 5)-(line 557,col 78)",
        "(line 558,col 5)-(line 558,col 80)",
        "(line 559,col 5)-(line 559,col 84)",
        "(line 560,col 5)-(line 560,col 86)",
        "(line 561,col 5)-(line 561,col 88)",
        "(line 562,col 5)-(line 562,col 90)",
        "(line 563,col 5)-(line 563,col 84)",
        "(line 564,col 5)-(line 564,col 86)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.DefaultTypeAdaptersTest.testJsonNullSerialization()",
      "begin_line": 567,
      "end_line": 570,
      "comment": "",
      "child_ranges": [
        "(line 568,col 5)-(line 568,col 76)",
        "(line 569,col 5)-(line 569,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.DefaultTypeAdaptersTest.testNullJsonElementSerialization()",
      "begin_line": 572,
      "end_line": 575,
      "comment": "",
      "child_ranges": [
        "(line 573,col 5)-(line 573,col 63)",
        "(line 574,col 5)-(line 574,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.DefaultTypeAdaptersTest.testJsonArraySerialization()",
      "begin_line": 577,
      "end_line": 583,
      "comment": "",
      "child_ranges": [
        "(line 578,col 5)-(line 578,col 38)",
        "(line 579,col 5)-(line 579,col 36)",
        "(line 580,col 5)-(line 580,col 36)",
        "(line 581,col 5)-(line 581,col 36)",
        "(line 582,col 5)-(line 582,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.DefaultTypeAdaptersTest.testJsonArrayDeserialization()",
      "begin_line": 585,
      "end_line": 594,
      "comment": "",
      "child_ranges": [
        "(line 586,col 5)-(line 586,col 38)",
        "(line 587,col 5)-(line 587,col 36)",
        "(line 588,col 5)-(line 588,col 36)",
        "(line 589,col 5)-(line 589,col 36)",
        "(line 591,col 5)-(line 591,col 28)",
        "(line 592,col 5)-(line 592,col 64)",
        "(line 593,col 5)-(line 593,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.DefaultTypeAdaptersTest.testJsonObjectSerialization()",
      "begin_line": 596,
      "end_line": 601,
      "comment": "",
      "child_ranges": [
        "(line 597,col 5)-(line 597,col 41)",
        "(line 598,col 5)-(line 598,col 44)",
        "(line 599,col 5)-(line 599,col 44)",
        "(line 600,col 5)-(line 600,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.DefaultTypeAdaptersTest.testJsonObjectDeserialization()",
      "begin_line": 603,
      "end_line": 614,
      "comment": "",
      "child_ranges": [
        "(line 604,col 5)-(line 604,col 41)",
        "(line 605,col 5)-(line 605,col 44)",
        "(line 606,col 5)-(line 606,col 44)",
        "(line 608,col 5)-(line 608,col 42)",
        "(line 609,col 5)-(line 609,col 64)",
        "(line 610,col 5)-(line 610,col 33)",
        "(line 612,col 5)-(line 612,col 65)",
        "(line 613,col 5)-(line 613,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.DefaultTypeAdaptersTest.testJsonNullDeserialization()",
      "begin_line": 616,
      "end_line": 619,
      "comment": "",
      "child_ranges": [
        "(line 617,col 5)-(line 617,col 78)",
        "(line 618,col 5)-(line 618,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.DefaultTypeAdaptersTest.testJsonElementTypeMismatch()",
      "begin_line": 621,
      "end_line": 629,
      "comment": "",
      "child_ranges": [
        "(line 622,col 5)-(line 628,col 5)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ClassWithBigDecimal",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 631,
      "end_line": 639,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 632,
      "end_line": 632,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.gson.functional.DefaultTypeAdaptersTest.ClassWithBigDecimal.ClassWithBigDecimal(java.lang.String)",
      "begin_line": 633,
      "end_line": 635,
      "comment": "",
      "child_ranges": [
        "(line 634,col 7)-(line 634,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.DefaultTypeAdaptersTest.ClassWithBigDecimal.getExpectedJson()",
      "begin_line": 636,
      "end_line": 638,
      "comment": "",
      "child_ranges": [
        "(line 637,col 7)-(line 637,col 63)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ClassWithBigInteger",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 641,
      "end_line": 649,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 642,
      "end_line": 642,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.gson.functional.DefaultTypeAdaptersTest.ClassWithBigInteger.ClassWithBigInteger(java.lang.String)",
      "begin_line": 643,
      "end_line": 645,
      "comment": "",
      "child_ranges": [
        "(line 644,col 7)-(line 644,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.DefaultTypeAdaptersTest.ClassWithBigInteger.getExpectedJson()",
      "begin_line": 646,
      "end_line": 648,
      "comment": "",
      "child_ranges": [
        "(line 647,col 7)-(line 647,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.DefaultTypeAdaptersTest.testPropertiesSerialization()",
      "begin_line": 651,
      "end_line": 657,
      "comment": "",
      "child_ranges": [
        "(line 652,col 5)-(line 652,col 40)",
        "(line 653,col 5)-(line 653,col 36)",
        "(line 654,col 5)-(line 654,col 37)",
        "(line 655,col 5)-(line 655,col 42)",
        "(line 656,col 5)-(line 656,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.DefaultTypeAdaptersTest.testPropertiesDeserialization()",
      "begin_line": 659,
      "end_line": 663,
      "comment": "",
      "child_ranges": [
        "(line 660,col 5)-(line 660,col 32)",
        "(line 661,col 5)-(line 661,col 61)",
        "(line 662,col 5)-(line 662,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.DefaultTypeAdaptersTest.testTreeSetSerialization()",
      "begin_line": 665,
      "end_line": 670,
      "comment": "",
      "child_ranges": [
        "(line 666,col 5)-(line 666,col 52)",
        "(line 667,col 5)-(line 667,col 26)",
        "(line 668,col 5)-(line 668,col 39)",
        "(line 669,col 5)-(line 669,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.DefaultTypeAdaptersTest.testTreeSetDeserialization()",
      "begin_line": 672,
      "end_line": 677,
      "comment": "",
      "child_ranges": [
        "(line 673,col 5)-(line 673,col 31)",
        "(line 674,col 5)-(line 674,col 62)",
        "(line 675,col 5)-(line 675,col 56)",
        "(line 676,col 5)-(line 676,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.DefaultTypeAdaptersTest.testStringBuilderSerialization()",
      "begin_line": 679,
      "end_line": 683,
      "comment": "",
      "child_ranges": [
        "(line 680,col 5)-(line 680,col 48)",
        "(line 681,col 5)-(line 681,col 34)",
        "(line 682,col 5)-(line 682,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.DefaultTypeAdaptersTest.testStringBuilderDeserialization()",
      "begin_line": 685,
      "end_line": 688,
      "comment": "",
      "child_ranges": [
        "(line 686,col 5)-(line 686,col 67)",
        "(line 687,col 5)-(line 687,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.DefaultTypeAdaptersTest.testStringBufferSerialization()",
      "begin_line": 690,
      "end_line": 694,
      "comment": "",
      "child_ranges": [
        "(line 691,col 5)-(line 691,col 46)",
        "(line 692,col 5)-(line 692,col 34)",
        "(line 693,col 5)-(line 693,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.DefaultTypeAdaptersTest.testStringBufferDeserialization()",
      "begin_line": 696,
      "end_line": 699,
      "comment": "",
      "child_ranges": [
        "(line 697,col 5)-(line 697,col 65)",
        "(line 698,col 5)-(line 698,col 39)"
      ]
    },
    {
      "type": "class_interface",
      "name": "MyClassTypeAdapter",
      "is_interface": false,
      "parent_types": [
        "com.google.gson.TypeAdapter\u003cjava.lang.Class\u003e"
      ],
      "begin_line": 701,
      "end_line": 716,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.DefaultTypeAdaptersTest.MyClassTypeAdapter.write(com.google.gson.stream.JsonWriter, java.lang.Class)",
      "begin_line": 703,
      "end_line": 706,
      "comment": "",
      "child_ranges": [
        "(line 705,col 7)-(line 705,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.DefaultTypeAdaptersTest.MyClassTypeAdapter.read(com.google.gson.stream.JsonReader)",
      "begin_line": 707,
      "end_line": 715,
      "comment": "",
      "child_ranges": [
        "(line 709,col 7)-(line 709,col 41)",
        "(line 710,col 7)-(line 714,col 7)"
      ]
    },
    {
      "type": "class_interface",
      "name": "NumberAsStringAdapter",
      "is_interface": false,
      "parent_types": [
        "com.google.gson.TypeAdapter\u003cjava.lang.Number\u003e"
      ],
      "begin_line": 718,
      "end_line": 733,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "constructor"
      ],
      "begin_line": 719,
      "end_line": 719,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.gson.functional.DefaultTypeAdaptersTest.NumberAsStringAdapter.NumberAsStringAdapter(java.lang.Class\u003c? extends java.lang.Number\u003e)",
      "begin_line": 720,
      "end_line": 722,
      "comment": "",
      "child_ranges": [
        "(line 721,col 7)-(line 721,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.DefaultTypeAdaptersTest.NumberAsStringAdapter.write(com.google.gson.stream.JsonWriter, java.lang.Number)",
      "begin_line": 723,
      "end_line": 725,
      "comment": "",
      "child_ranges": [
        "(line 724,col 7)-(line 724,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.DefaultTypeAdaptersTest.NumberAsStringAdapter.read(com.google.gson.stream.JsonReader)",
      "begin_line": 726,
      "end_line": 732,
      "comment": "",
      "child_ranges": [
        "(line 727,col 7)-(line 731,col 7)"
      ]
    }
  ]
}