{
  "filepath": "/tmp/Closure-171b/test/com/google/javascript/jscomp/DisambiguatePropertiesTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DisambiguatePropertiesTest",
      "is_interface": false,
      "parent_types": [
        "CompilerTestCase"
      ],
      "begin_line": 37,
      "end_line": 1396,
      "comment": "\n * Unit test for the Compiler DisambiguateProperties pass.\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "lastPass"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "runTightenTypes"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.DisambiguatePropertiesTest.DisambiguatePropertiesTest()",
      "begin_line": 41,
      "end_line": 43,
      "comment": "",
      "child_ranges": [
        "(line 42,col 5)-(line 42,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguatePropertiesTest.setUp()",
      "begin_line": 45,
      "end_line": 50,
      "comment": "",
      "child_ranges": [
        "(line 47,col 5)-(line 47,col 18)",
        "(line 48,col 5)-(line 48,col 32)",
        "(line 49,col 5)-(line 49,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguatePropertiesTest.getProcessor(com.google.javascript.jscomp.Compiler)",
      "begin_line": 52,
      "end_line": 77,
      "comment": "",
      "child_ranges": [
        "(line 55,col 5)-(line 76,col 6)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguatePropertiesTest.Anonymous-03b003ec-feb6-4467-b3ec-eec361c5dd83.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 56,
      "end_line": 75,
      "comment": "",
      "child_ranges": [
        "(line 58,col 9)-(line 59,col 50)",
        "(line 60,col 9)-(line 60,col 61)",
        "(line 62,col 9)-(line 72,col 9)",
        "(line 74,col 9)-(line 74,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguatePropertiesTest.getNumRepetitions()",
      "begin_line": 79,
      "end_line": 82,
      "comment": "",
      "child_ranges": [
        "(line 81,col 5)-(line 81,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguatePropertiesTest.testOneType1()",
      "begin_line": 84,
      "end_line": 93,
      "comment": "",
      "child_ranges": [
        "(line 85,col 5)-(line 90,col 21)",
        "(line 91,col 5)-(line 91,col 53)",
        "(line 92,col 5)-(line 92,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguatePropertiesTest.testOneType2()",
      "begin_line": 95,
      "end_line": 105,
      "comment": "",
      "child_ranges": [
        "(line 96,col 5)-(line 101,col 21)",
        "(line 102,col 5)-(line 102,col 46)",
        "(line 103,col 5)-(line 103,col 38)",
        "(line 104,col 5)-(line 104,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguatePropertiesTest.testOneType3()",
      "begin_line": 107,
      "end_line": 118,
      "comment": "",
      "child_ranges": [
        "(line 108,col 5)-(line 114,col 21)",
        "(line 115,col 5)-(line 115,col 46)",
        "(line 116,col 5)-(line 116,col 38)",
        "(line 117,col 5)-(line 117,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguatePropertiesTest.testPrototypeAndInstance()",
      "begin_line": 120,
      "end_line": 129,
      "comment": "",
      "child_ranges": [
        "(line 121,col 5)-(line 126,col 21)",
        "(line 127,col 5)-(line 127,col 53)",
        "(line 128,col 5)-(line 128,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguatePropertiesTest.testPrototypeAndInstance2()",
      "begin_line": 131,
      "end_line": 138,
      "comment": "",
      "child_ranges": [
        "(line 132,col 5)-(line 135,col 29)",
        "(line 136,col 5)-(line 136,col 53)",
        "(line 137,col 5)-(line 137,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguatePropertiesTest.testTwoTypes1()",
      "begin_line": 140,
      "end_line": 163,
      "comment": "",
      "child_ranges": [
        "(line 141,col 5)-(line 151,col 21)",
        "(line 152,col 5)-(line 160,col 32)",
        "(line 161,col 5)-(line 161,col 74)",
        "(line 162,col 5)-(line 162,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguatePropertiesTest.testTwoTypes2()",
      "begin_line": 165,
      "end_line": 190,
      "comment": "",
      "child_ranges": [
        "(line 166,col 5)-(line 176,col 21)",
        "(line 178,col 5)-(line 186,col 32)",
        "(line 188,col 5)-(line 188,col 74)",
        "(line 189,col 5)-(line 189,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguatePropertiesTest.testTwoTypes3()",
      "begin_line": 192,
      "end_line": 221,
      "comment": "",
      "child_ranges": [
        "(line 193,col 5)-(line 205,col 21)",
        "(line 207,col 5)-(line 217,col 32)",
        "(line 219,col 5)-(line 219,col 74)",
        "(line 220,col 5)-(line 220,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguatePropertiesTest.testTwoFields()",
      "begin_line": 223,
      "end_line": 236,
      "comment": "",
      "child_ranges": [
        "(line 224,col 5)-(line 231,col 21)",
        "(line 232,col 5)-(line 233,col 38)",
        "(line 234,col 5)-(line 234,col 78)",
        "(line 235,col 5)-(line 235,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguatePropertiesTest.testTwoSeparateFieldsTwoTypes()",
      "begin_line": 238,
      "end_line": 271,
      "comment": "",
      "child_ranges": [
        "(line 239,col 5)-(line 253,col 21)",
        "(line 254,col 5)-(line 266,col 32)",
        "(line 267,col 5)-(line 268,col 76)",
        "(line 269,col 5)-(line 270,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguatePropertiesTest.testUnionType()",
      "begin_line": 273,
      "end_line": 289,
      "comment": "",
      "child_ranges": [
        "(line 274,col 5)-(line 285,col 35)",
        "(line 286,col 5)-(line 287,col 70)",
        "(line 288,col 5)-(line 288,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguatePropertiesTest.testIgnoreUnknownType()",
      "begin_line": 291,
      "end_line": 307,
      "comment": "",
      "child_ranges": [
        "(line 292,col 5)-(line 300,col 24)",
        "(line 301,col 5)-(line 303,col 50)",
        "(line 304,col 5)-(line 304,col 40)",
        "(line 305,col 5)-(line 306,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguatePropertiesTest.testIgnoreUnknownType1()",
      "begin_line": 309,
      "end_line": 326,
      "comment": "",
      "child_ranges": [
        "(line 310,col 5)-(line 319,col 24)",
        "(line 320,col 5)-(line 322,col 50)",
        "(line 323,col 5)-(line 323,col 62)",
        "(line 324,col 5)-(line 325,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguatePropertiesTest.testIgnoreUnknownType2()",
      "begin_line": 328,
      "end_line": 349,
      "comment": "",
      "child_ranges": [
        "(line 329,col 5)-(line 341,col 24)",
        "(line 342,col 5)-(line 345,col 50)",
        "(line 346,col 5)-(line 346,col 40)",
        "(line 347,col 5)-(line 348,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguatePropertiesTest.testUnionTypeTwoFields()",
      "begin_line": 351,
      "end_line": 371,
      "comment": "",
      "child_ranges": [
        "(line 352,col 5)-(line 366,col 35)",
        "(line 367,col 5)-(line 368,col 76)",
        "(line 369,col 5)-(line 370,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguatePropertiesTest.testCast()",
      "begin_line": 373,
      "end_line": 393,
      "comment": "",
      "child_ranges": [
        "(line 374,col 5)-(line 381,col 43)",
        "(line 382,col 5)-(line 385,col 47)",
        "(line 386,col 5)-(line 389,col 42)",
        "(line 390,col 5)-(line 390,col 74)",
        "(line 391,col 5)-(line 392,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguatePropertiesTest.testConstructorFields()",
      "begin_line": 395,
      "end_line": 414,
      "comment": "",
      "child_ranges": [
        "(line 396,col 5)-(line 401,col 18)",
        "(line 402,col 5)-(line 406,col 20)",
        "(line 407,col 5)-(line 411,col 20)",
        "(line 412,col 5)-(line 412,col 64)",
        "(line 413,col 5)-(line 413,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguatePropertiesTest.testStaticProperty()",
      "begin_line": 416,
      "end_line": 431,
      "comment": "",
      "child_ranges": [
        "(line 417,col 5)-(line 421,col 21)",
        "(line 422,col 5)-(line 426,col 53)",
        "(line 428,col 5)-(line 430,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguatePropertiesTest.testSupertypeWithSameField()",
      "begin_line": 433,
      "end_line": 458,
      "comment": "",
      "child_ranges": [
        "(line 434,col 5)-(line 443,col 44)",
        "(line 445,col 5)-(line 449,col 72)",
        "(line 450,col 5)-(line 454,col 72)",
        "(line 455,col 5)-(line 455,col 74)",
        "(line 456,col 5)-(line 457,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguatePropertiesTest.testScopedType()",
      "begin_line": 460,
      "end_line": 475,
      "comment": "",
      "child_ranges": [
        "(line 461,col 5)-(line 466,col 35)",
        "(line 467,col 5)-(line 472,col 49)",
        "(line 473,col 5)-(line 473,col 78)",
        "(line 474,col 5)-(line 474,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguatePropertiesTest.testUnresolvedType()",
      "begin_line": 477,
      "end_line": 498,
      "comment": "",
      "child_ranges": [
        "(line 479,col 5)-(line 485,col 33)",
        "(line 486,col 5)-(line 491,col 45)",
        "(line 493,col 5)-(line 493,col 37)",
        "(line 494,col 5)-(line 495,col 62)",
        "(line 496,col 5)-(line 497,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguatePropertiesTest.testNamedType()",
      "begin_line": 500,
      "end_line": 517,
      "comment": "",
      "child_ranges": [
        "(line 501,col 5)-(line 507,col 55)",
        "(line 508,col 5)-(line 514,col 34)",
        "(line 515,col 5)-(line 515,col 74)",
        "(line 516,col 5)-(line 516,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguatePropertiesTest.testUnknownType()",
      "begin_line": 519,
      "end_line": 537,
      "comment": "",
      "child_ranges": [
        "(line 520,col 5)-(line 526,col 33)",
        "(line 527,col 5)-(line 533,col 45)",
        "(line 534,col 5)-(line 534,col 34)",
        "(line 535,col 5)-(line 536,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguatePropertiesTest.testEnum()",
      "begin_line": 539,
      "end_line": 566,
      "comment": "",
      "child_ranges": [
        "(line 540,col 5)-(line 549,col 35)",
        "(line 550,col 5)-(line 556,col 44)",
        "(line 557,col 5)-(line 563,col 44)",
        "(line 564,col 5)-(line 564,col 78)",
        "(line 565,col 5)-(line 565,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguatePropertiesTest.testEnumOfObjects()",
      "begin_line": 568,
      "end_line": 592,
      "comment": "",
      "child_ranges": [
        "(line 569,col 5)-(line 577,col 31)",
        "(line 578,col 5)-(line 586,col 51)",
        "(line 587,col 5)-(line 588,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguatePropertiesTest.testEnumOfObjects2()",
      "begin_line": 594,
      "end_line": 622,
      "comment": "",
      "child_ranges": [
        "(line 595,col 5)-(line 607,col 14)",
        "(line 608,col 5)-(line 620,col 14)",
        "(line 621,col 5)-(line 621,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguatePropertiesTest.testEnumOfObjects3()",
      "begin_line": 624,
      "end_line": 659,
      "comment": "",
      "child_ranges": [
        "(line 625,col 5)-(line 640,col 14)",
        "(line 641,col 5)-(line 656,col 14)",
        "(line 657,col 5)-(line 658,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguatePropertiesTest.testUntypedExterns()",
      "begin_line": 661,
      "end_line": 691,
      "comment": "",
      "child_ranges": [
        "(line 662,col 5)-(line 665,col 43)",
        "(line 666,col 5)-(line 675,col 28)",
        "(line 676,col 5)-(line 685,col 28)",
        "(line 687,col 5)-(line 688,col 63)",
        "(line 689,col 5)-(line 690,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguatePropertiesTest.testUnionTypeInvalidation()",
      "begin_line": 693,
      "end_line": 746,
      "comment": "",
      "child_ranges": [
        "(line 694,col 5)-(line 696,col 28)",
        "(line 697,col 5)-(line 713,col 27)",
        "(line 716,col 5)-(line 729,col 25)",
        "(line 730,col 5)-(line 743,col 25)",
        "(line 744,col 5)-(line 744,col 56)",
        "(line 745,col 5)-(line 745,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguatePropertiesTest.testUnionAndExternTypes()",
      "begin_line": 748,
      "end_line": 776,
      "comment": "",
      "child_ranges": [
        "(line 749,col 5)-(line 751,col 33)",
        "(line 752,col 5)-(line 761,col 37)",
        "(line 762,col 5)-(line 771,col 37)",
        "(line 775,col 5)-(line 775,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguatePropertiesTest.testTypedExterns()",
      "begin_line": 778,
      "end_line": 794,
      "comment": "",
      "child_ranges": [
        "(line 779,col 5)-(line 783,col 24)",
        "(line 784,col 5)-(line 787,col 35)",
        "(line 788,col 5)-(line 791,col 35)",
        "(line 792,col 5)-(line 792,col 70)",
        "(line 793,col 5)-(line 793,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguatePropertiesTest.testSubtypesWithSameField()",
      "begin_line": 796,
      "end_line": 811,
      "comment": "",
      "child_ranges": [
        "(line 797,col 5)-(line 808,col 28)",
        "(line 809,col 5)-(line 809,col 30)",
        "(line 810,col 5)-(line 810,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguatePropertiesTest.testSupertypeReferenceOfSubtypeProperty()",
      "begin_line": 813,
      "end_line": 833,
      "comment": "",
      "child_ranges": [
        "(line 814,col 5)-(line 816,col 29)",
        "(line 817,col 5)-(line 824,col 16)",
        "(line 825,col 5)-(line 831,col 16)",
        "(line 832,col 5)-(line 832,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguatePropertiesTest.testObjectLiteralNotRenamed()",
      "begin_line": 835,
      "end_line": 841,
      "comment": "",
      "child_ranges": [
        "(line 836,col 5)-(line 838,col 23)",
        "(line 839,col 5)-(line 839,col 34)",
        "(line 840,col 5)-(line 840,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguatePropertiesTest.testObjectLiteralReflected()",
      "begin_line": 843,
      "end_line": 864,
      "comment": "",
      "child_ranges": [
        "(line 844,col 5)-(line 852,col 46)",
        "(line 853,col 5)-(line 861,col 58)",
        "(line 862,col 5)-(line 862,col 72)",
        "(line 863,col 5)-(line 863,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguatePropertiesTest.testObjectLiteralLends()",
      "begin_line": 866,
      "end_line": 883,
      "comment": "",
      "child_ranges": [
        "(line 867,col 5)-(line 873,col 59)",
        "(line 874,col 5)-(line 880,col 71)",
        "(line 881,col 5)-(line 881,col 72)",
        "(line 882,col 5)-(line 882,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguatePropertiesTest.testClosureInherits()",
      "begin_line": 885,
      "end_line": 916,
      "comment": "",
      "child_ranges": [
        "(line 886,col 5)-(line 912,col 29)",
        "(line 913,col 5)-(line 913,col 49)",
        "(line 914,col 5)-(line 915,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguatePropertiesTest.testSkipNativeFunctionMethod()",
      "begin_line": 918,
      "end_line": 928,
      "comment": "",
      "child_ranges": [
        "(line 919,col 5)-(line 922,col 53)",
        "(line 923,col 5)-(line 926,col 48)",
        "(line 927,col 5)-(line 927,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguatePropertiesTest.testSkipNativeObjectMethod()",
      "begin_line": 930,
      "end_line": 939,
      "comment": "",
      "child_ranges": [
        "(line 931,col 5)-(line 933,col 45)",
        "(line 934,col 5)-(line 936,col 43)",
        "(line 937,col 5)-(line 937,col 43)",
        "(line 938,col 5)-(line 938,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguatePropertiesTest.testExtendNativeType()",
      "begin_line": 941,
      "end_line": 951,
      "comment": "",
      "child_ranges": [
        "(line 942,col 5)-(line 945,col 69)",
        "(line 946,col 5)-(line 948,col 40)",
        "(line 949,col 5)-(line 949,col 42)",
        "(line 950,col 5)-(line 950,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguatePropertiesTest.testStringFunction()",
      "begin_line": 953,
      "end_line": 975,
      "comment": "",
      "child_ranges": [
        "(line 956,col 5)-(line 959,col 59)",
        "(line 960,col 5)-(line 964,col 47)",
        "(line 965,col 5)-(line 969,col 64)",
        "(line 971,col 5)-(line 972,col 60)",
        "(line 973,col 5)-(line 974,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguatePropertiesTest.testUnusedTypeInExterns()",
      "begin_line": 977,
      "end_line": 995,
      "comment": "",
      "child_ranges": [
        "(line 978,col 5)-(line 980,col 28)",
        "(line 981,col 5)-(line 985,col 29)",
        "(line 986,col 5)-(line 990,col 42)",
        "(line 991,col 5)-(line 992,col 55)",
        "(line 993,col 5)-(line 994,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguatePropertiesTest.testInterface()",
      "begin_line": 997,
      "end_line": 1008,
      "comment": "",
      "child_ranges": [
        "(line 998,col 5)-(line 1005,col 25)",
        "(line 1006,col 5)-(line 1006,col 62)",
        "(line 1007,col 5)-(line 1007,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguatePropertiesTest.testInterfaceOfSuperclass()",
      "begin_line": 1010,
      "end_line": 1024,
      "comment": "",
      "child_ranges": [
        "(line 1011,col 5)-(line 1020,col 20)",
        "(line 1021,col 5)-(line 1021,col 62)",
        "(line 1022,col 5)-(line 1023,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguatePropertiesTest.testTwoInterfacesWithSomeInheritance()",
      "begin_line": 1026,
      "end_line": 1043,
      "comment": "",
      "child_ranges": [
        "(line 1027,col 5)-(line 1039,col 20)",
        "(line 1040,col 5)-(line 1040,col 76)",
        "(line 1041,col 5)-(line 1042,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguatePropertiesTest.testInvalidatingInterface()",
      "begin_line": 1045,
      "end_line": 1061,
      "comment": "",
      "child_ranges": [
        "(line 1046,col 5)-(line 1058,col 29)",
        "(line 1059,col 5)-(line 1059,col 67)",
        "(line 1060,col 5)-(line 1060,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguatePropertiesTest.testMultipleInterfaces()",
      "begin_line": 1063,
      "end_line": 1075,
      "comment": "",
      "child_ranges": [
        "(line 1064,col 5)-(line 1072,col 28)",
        "(line 1073,col 5)-(line 1073,col 63)",
        "(line 1074,col 5)-(line 1074,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguatePropertiesTest.testInterfaceWithSupertypeImplementor()",
      "begin_line": 1077,
      "end_line": 1089,
      "comment": "",
      "child_ranges": [
        "(line 1078,col 5)-(line 1086,col 23)",
        "(line 1087,col 5)-(line 1087,col 62)",
        "(line 1088,col 5)-(line 1088,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguatePropertiesTest.testSuperInterface()",
      "begin_line": 1091,
      "end_line": 1103,
      "comment": "",
      "child_ranges": [
        "(line 1092,col 5)-(line 1100,col 28)",
        "(line 1101,col 5)-(line 1101,col 62)",
        "(line 1102,col 5)-(line 1102,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguatePropertiesTest.testInterfaceUnionWithCtor()",
      "begin_line": 1105,
      "end_line": 1135,
      "comment": "",
      "child_ranges": [
        "(line 1106,col 5)-(line 1115,col 39)",
        "(line 1117,col 5)-(line 1118,col 75)",
        "(line 1122,col 5)-(line 1131,col 39)",
        "(line 1133,col 5)-(line 1134,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguatePropertiesTest.testExternInterfaceUnionWithCtor()",
      "begin_line": 1137,
      "end_line": 1153,
      "comment": "",
      "child_ranges": [
        "(line 1138,col 5)-(line 1142,col 70)",
        "(line 1144,col 5)-(line 1149,col 39)",
        "(line 1151,col 5)-(line 1151,col 43)",
        "(line 1152,col 5)-(line 1152,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguatePropertiesTest.testMismatchInvalidation()",
      "begin_line": 1159,
      "end_line": 1177,
      "comment": "\n   * Tests that the type based version skips renaming on types that have a\n   * mismatch, and the type tightened version continues to work as normal.\n   ",
      "child_ranges": [
        "(line 1160,col 5)-(line 1167,col 21)",
        "(line 1169,col 5)-(line 1172,col 39)",
        "(line 1173,col 5)-(line 1176,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguatePropertiesTest.testBadCast()",
      "begin_line": 1179,
      "end_line": 1191,
      "comment": "",
      "child_ranges": [
        "(line 1180,col 5)-(line 1185,col 21)",
        "(line 1186,col 5)-(line 1190,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguatePropertiesTest.testDeterministicNaming()",
      "begin_line": 1193,
      "end_line": 1220,
      "comment": "",
      "child_ranges": [
        "(line 1194,col 5)-(line 1202,col 51)",
        "(line 1204,col 5)-(line 1211,col 70)",
        "(line 1213,col 5)-(line 1219,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguatePropertiesTest.testObjectLiteral()",
      "begin_line": 1222,
      "end_line": 1237,
      "comment": "",
      "child_ranges": [
        "(line 1223,col 5)-(line 1227,col 54)",
        "(line 1229,col 5)-(line 1233,col 48)",
        "(line 1235,col 5)-(line 1235,col 74)",
        "(line 1236,col 5)-(line 1236,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguatePropertiesTest.testCustomInherits()",
      "begin_line": 1239,
      "end_line": 1257,
      "comment": "",
      "child_ranges": [
        "(line 1240,col 5)-(line 1250,col 36)",
        "(line 1252,col 5)-(line 1254,col 77)",
        "(line 1256,col 5)-(line 1256,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguatePropertiesTest.testSkipNativeFunctionStaticProperty()",
      "begin_line": 1259,
      "end_line": 1276,
      "comment": "",
      "child_ranges": [
        "(line 1260,col 5)-(line 1266,col 21)",
        "(line 1268,col 5)-(line 1273,col 20)",
        "(line 1275,col 5)-(line 1275,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguatePropertiesTest.testErrorOnProtectedProperty()",
      "begin_line": 1278,
      "end_line": 1282,
      "comment": "",
      "child_ranges": [
        "(line 1279,col 5)-(line 1280,col 55)",
        "(line 1281,col 5)-(line 1281,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguatePropertiesTest.testMismatchForbiddenInvalidation()",
      "begin_line": 1284,
      "end_line": 1292,
      "comment": "",
      "child_ranges": [
        "(line 1285,col 5)-(line 1289,col 55)",
        "(line 1290,col 5)-(line 1291,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguatePropertiesTest.testUnionTypeInvalidationError()",
      "begin_line": 1294,
      "end_line": 1317,
      "comment": "",
      "child_ranges": [
        "(line 1295,col 5)-(line 1297,col 33)",
        "(line 1298,col 5)-(line 1310,col 28)",
        "(line 1312,col 5)-(line 1314,col 68)",
        "(line 1315,col 5)-(line 1316,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguatePropertiesTest.runFindHighestTypeInChain()",
      "begin_line": 1319,
      "end_line": 1326,
      "comment": "",
      "child_ranges": [
        "(line 1321,col 5)-(line 1325,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguatePropertiesTest.testSets(boolean, java.lang.String, java.lang.String, java.lang.String)",
      "begin_line": 1328,
      "end_line": 1335,
      "comment": "",
      "child_ranges": [
        "(line 1331,col 5)-(line 1331,col 43)",
        "(line 1332,col 5)-(line 1332,col 23)",
        "(line 1333,col 5)-(line 1334,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguatePropertiesTest.testSets(boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String)",
      "begin_line": 1337,
      "end_line": 1341,
      "comment": "",
      "child_ranges": [
        "(line 1340,col 5)-(line 1340,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguatePropertiesTest.testSets(boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.google.javascript.jscomp.DiagnosticType, java.lang.String)",
      "begin_line": 1343,
      "end_line": 1351,
      "comment": "",
      "child_ranges": [
        "(line 1347,col 5)-(line 1347,col 43)",
        "(line 1348,col 5)-(line 1348,col 60)",
        "(line 1349,col 5)-(line 1350,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguatePropertiesTest.testSets(boolean, java.lang.String, java.lang.String)",
      "begin_line": 1360,
      "end_line": 1364,
      "comment": "\n   * Compiles the code and checks that the set of types for each field matches\n   * the expected value.\n   *\n   * \u003cp\u003eThe format for the set of types for fields is:\n   * {field\u003d[[Type1, Type2]]}\n   ",
      "child_ranges": [
        "(line 1361,col 5)-(line 1361,col 43)",
        "(line 1362,col 5)-(line 1362,col 31)",
        "(line 1363,col 5)-(line 1363,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguatePropertiesTest.testSets(boolean, java.lang.String, java.lang.String, com.google.javascript.jscomp.DiagnosticType)",
      "begin_line": 1373,
      "end_line": 1378,
      "comment": "\n   * Compiles the code and checks that the set of types for each field matches\n   * the expected value.\n   *\n   * \u003cp\u003eThe format for the set of types for fields is:\n   * {field\u003d[[Type1, Type2]]}\n   ",
      "child_ranges": [
        "(line 1375,col 5)-(line 1375,col 43)",
        "(line 1376,col 5)-(line 1376,col 34)",
        "(line 1377,col 5)-(line 1377,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguatePropertiesTest.mapToString(com.google.common.collect.Multimap\u003cjava.lang.String, java.util.Collection\u003cT\u003e\u003e)",
      "begin_line": 1381,
      "end_line": 1395,
      "comment": " Sorts the map and converts to a string for comparison purposes. ",
      "child_ranges": [
        "(line 1382,col 5)-(line 1382,col 55)",
        "(line 1383,col 5)-(line 1393,col 5)",
        "(line 1394,col 5)-(line 1394,col 29)"
      ]
    }
  ]
}