{
  "filepath": "/tmp/Closure-171b/test/com/google/javascript/jscomp/ConcreteTypeTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ConcreteTypeTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 54,
      "end_line": 386,
      "comment": "\n * Unit test for the the subclasses of ConcreteType.\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "typeRegistry"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "unknownType"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "factory"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ConcreteTypeTest.setUp()",
      "begin_line": 59,
      "end_line": 64,
      "comment": "",
      "child_ranges": [
        "(line 61,col 5)-(line 61,col 73)",
        "(line 62,col 5)-(line 62,col 72)",
        "(line 63,col 5)-(line 63,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ConcreteTypeTest.checkEquality(java.util.List\u003ccom.google.javascript.jscomp.ConcreteType\u003e)",
      "begin_line": 66,
      "end_line": 76,
      "comment": "",
      "child_ranges": [
        "(line 67,col 5)-(line 75,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ConcreteTypeTest.testEquals()",
      "begin_line": 78,
      "end_line": 91,
      "comment": "",
      "child_ranges": [
        "(line 79,col 5)-(line 79,col 55)",
        "(line 80,col 5)-(line 80,col 55)",
        "(line 81,col 5)-(line 81,col 47)",
        "(line 82,col 5)-(line 82,col 47)",
        "(line 83,col 5)-(line 83,col 60)",
        "(line 84,col 5)-(line 84,col 60)",
        "(line 85,col 5)-(line 85,col 60)",
        "(line 87,col 5)-(line 88,col 54)",
        "(line 90,col 5)-(line 90,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ConcreteTypeTest.testUnionWith()",
      "begin_line": 93,
      "end_line": 110,
      "comment": "",
      "child_ranges": [
        "(line 94,col 5)-(line 94,col 53)",
        "(line 95,col 5)-(line 95,col 45)",
        "(line 96,col 5)-(line 96,col 56)",
        "(line 98,col 5)-(line 98,col 34)",
        "(line 99,col 5)-(line 99,col 34)",
        "(line 100,col 5)-(line 100,col 36)",
        "(line 101,col 5)-(line 101,col 36)",
        "(line 102,col 5)-(line 102,col 35)",
        "(line 104,col 5)-(line 104,col 35)",
        "(line 105,col 5)-(line 105,col 34)",
        "(line 107,col 5)-(line 107,col 35)",
        "(line 108,col 5)-(line 108,col 37)",
        "(line 109,col 5)-(line 109,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ConcreteTypeTest.checkUnionWith(com.google.javascript.jscomp.ConcreteType, com.google.javascript.jscomp.ConcreteType, com.google.javascript.jscomp.ConcreteType)",
      "begin_line": 112,
      "end_line": 117,
      "comment": "",
      "child_ranges": [
        "(line 113,col 5)-(line 113,col 36)",
        "(line 114,col 5)-(line 114,col 36)",
        "(line 115,col 5)-(line 115,col 36)",
        "(line 116,col 5)-(line 116,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ConcreteTypeTest.testIntersectionWith()",
      "begin_line": 119,
      "end_line": 144,
      "comment": "",
      "child_ranges": [
        "(line 120,col 5)-(line 120,col 53)",
        "(line 121,col 5)-(line 121,col 55)",
        "(line 122,col 5)-(line 122,col 45)",
        "(line 123,col 5)-(line 123,col 56)",
        "(line 125,col 5)-(line 125,col 47)",
        "(line 126,col 5)-(line 126,col 47)",
        "(line 128,col 5)-(line 128,col 47)",
        "(line 129,col 5)-(line 129,col 47)",
        "(line 131,col 5)-(line 131,col 49)",
        "(line 132,col 5)-(line 132,col 49)",
        "(line 133,col 5)-(line 133,col 48)",
        "(line 134,col 5)-(line 134,col 48)",
        "(line 136,col 5)-(line 136,col 49)",
        "(line 138,col 5)-(line 138,col 48)",
        "(line 139,col 5)-(line 139,col 48)",
        "(line 140,col 5)-(line 140,col 46)",
        "(line 141,col 5)-(line 141,col 46)",
        "(line 142,col 5)-(line 142,col 48)",
        "(line 143,col 5)-(line 143,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ConcreteTypeTest.testFunction()",
      "begin_line": 146,
      "end_line": 155,
      "comment": "",
      "child_ranges": [
        "(line 147,col 5)-(line 147,col 63)",
        "(line 148,col 5)-(line 148,col 33)",
        "(line 149,col 5)-(line 149,col 37)",
        "(line 150,col 5)-(line 150,col 39)",
        "(line 151,col 5)-(line 151,col 43)",
        "(line 152,col 5)-(line 152,col 43)",
        "(line 153,col 5)-(line 153,col 40)",
        "(line 154,col 5)-(line 154,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ConcreteTypeTest.testInstance()",
      "begin_line": 157,
      "end_line": 171,
      "comment": "",
      "child_ranges": [
        "(line 158,col 5)-(line 158,col 65)",
        "(line 159,col 5)-(line 159,col 33)",
        "(line 160,col 5)-(line 160,col 44)",
        "(line 161,col 5)-(line 161,col 44)",
        "(line 162,col 5)-(line 162,col 41)",
        "(line 166,col 5)-(line 169,col 5)",
        "(line 170,col 5)-(line 170,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ConcreteTypeTest.testGetX()",
      "begin_line": 173,
      "end_line": 194,
      "comment": "",
      "child_ranges": [
        "(line 174,col 5)-(line 174,col 55)",
        "(line 175,col 5)-(line 175,col 55)",
        "(line 176,col 5)-(line 176,col 55)",
        "(line 177,col 5)-(line 177,col 55)",
        "(line 178,col 5)-(line 178,col 47)",
        "(line 179,col 5)-(line 180,col 47)",
        "(line 182,col 5)-(line 182,col 63)",
        "(line 183,col 5)-(line 183,col 63)",
        "(line 184,col 5)-(line 184,col 67)",
        "(line 185,col 5)-(line 185,col 63)",
        "(line 186,col 5)-(line 186,col 63)",
        "(line 187,col 5)-(line 187,col 67)",
        "(line 189,col 5)-(line 189,col 69)",
        "(line 190,col 5)-(line 190,col 69)",
        "(line 192,col 5)-(line 192,col 75)",
        "(line 193,col 5)-(line 193,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ConcreteTypeTest.assertEqualSets(java.util.Collection\u003c?\u003e, java.util.Collection\u003c?\u003e)",
      "begin_line": 197,
      "end_line": 199,
      "comment": " Checks that the two collections are equal as sets. ",
      "child_ranges": [
        "(line 198,col 5)-(line 198,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ConcreteTypeTest.createFunction(java.lang.String, java.lang.String...)",
      "begin_line": 202,
      "end_line": 220,
      "comment": " Creates a fake function with the given description. ",
      "child_ranges": [
        "(line 204,col 5)-(line 204,col 43)",
        "(line 205,col 5)-(line 207,col 5)",
        "(line 209,col 5)-(line 212,col 48)",
        "(line 214,col 5)-(line 214,col 56)",
        "(line 215,col 5)-(line 215,col 41)",
        "(line 216,col 5)-(line 217,col 46)",
        "(line 219,col 5)-(line 219,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ConcreteTypeTest.createInstance(java.lang.String, java.lang.String...)",
      "begin_line": 223,
      "end_line": 231,
      "comment": " Creates a fake instance with the given description. ",
      "child_ranges": [
        "(line 225,col 5)-(line 226,col 72)",
        "(line 227,col 5)-(line 229,col 5)",
        "(line 230,col 5)-(line 230,col 54)"
      ]
    },
    {
      "type": "class_interface",
      "name": "FakeFactory",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.ConcreteType.Factory"
      ],
      "begin_line": 233,
      "end_line": 321,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "functionByDeclaration"
      ],
      "begin_line": 234,
      "end_line": 235,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "functionByJSType"
      ],
      "begin_line": 236,
      "end_line": 237,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "instanceByJSType"
      ],
      "begin_line": 238,
      "end_line": 239,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "registry"
      ],
      "begin_line": 241,
      "end_line": 242,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ConcreteTypeTest.FakeFactory.getTypeRegistry()",
      "begin_line": 244,
      "end_line": 247,
      "comment": "",
      "child_ranges": [
        "(line 246,col 7)-(line 246,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ConcreteTypeTest.FakeFactory.createConcreteFunction(com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.StaticScope\u003ccom.google.javascript.jscomp.ConcreteType\u003e)",
      "begin_line": 250,
      "end_line": 262,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 253,col 7)-(line 253,col 70)",
        "(line 254,col 7)-(line 260,col 7)",
        "(line 261,col 7)-(line 261,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ConcreteTypeTest.FakeFactory.createConcreteInstance(com.google.javascript.rhino.jstype.ObjectType)",
      "begin_line": 265,
      "end_line": 274,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 268,col 7)-(line 268,col 73)",
        "(line 269,col 7)-(line 272,col 7)",
        "(line 273,col 7)-(line 273,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ConcreteTypeTest.FakeFactory.getConcreteFunction(com.google.javascript.rhino.jstype.FunctionType)",
      "begin_line": 277,
      "end_line": 280,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 279,col 7)-(line 279,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ConcreteTypeTest.FakeFactory.getConcreteInstance(com.google.javascript.rhino.jstype.ObjectType)",
      "begin_line": 283,
      "end_line": 286,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 285,col 7)-(line 285,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ConcreteTypeTest.FakeFactory.createFunctionScope(com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.StaticScope\u003ccom.google.javascript.jscomp.ConcreteType\u003e)",
      "begin_line": 289,
      "end_line": 302,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 292,col 7)-(line 292,col 58)",
        "(line 293,col 7)-(line 293,col 57)",
        "(line 294,col 7)-(line 294,col 57)",
        "(line 295,col 7)-(line 295,col 59)",
        "(line 296,col 7)-(line 300,col 7)",
        "(line 301,col 7)-(line 301,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ConcreteTypeTest.FakeFactory.createInstanceScope(com.google.javascript.rhino.jstype.ObjectType)",
      "begin_line": 305,
      "end_line": 320,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 308,col 7)-(line 308,col 35)",
        "(line 309,col 7)-(line 313,col 7)",
        "(line 315,col 7)-(line 315,col 51)",
        "(line 316,col 7)-(line 318,col 7)",
        "(line 319,col 7)-(line 319,col 19)"
      ]
    },
    {
      "type": "class_interface",
      "name": "FakeScope",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.rhino.testing.AbstractStaticScope\u003ccom.google.javascript.jscomp.ConcreteType\u003e"
      ],
      "begin_line": 324,
      "end_line": 361,
      "comment": " TODO(user): move to a common place if it can be used elsewhere"
    },
    {
      "type": "field",
      "varNames": [
        "parent"
      ],
      "begin_line": 325,
      "end_line": 325,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "slots"
      ],
      "begin_line": 326,
      "end_line": 326,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.ConcreteTypeTest.FakeScope.FakeScope(com.google.javascript.jscomp.ConcreteTypeTest.FakeScope)",
      "begin_line": 328,
      "end_line": 330,
      "comment": "",
      "child_ranges": [
        "(line 329,col 7)-(line 329,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ConcreteTypeTest.FakeScope.getParentScope()",
      "begin_line": 333,
      "end_line": 334,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 334,col 57)-(line 334,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ConcreteTypeTest.FakeScope.getOwnSlot(java.lang.String)",
      "begin_line": 337,
      "end_line": 340,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 339,col 7)-(line 339,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ConcreteTypeTest.FakeScope.getSlot(java.lang.String)",
      "begin_line": 343,
      "end_line": 352,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 345,col 7)-(line 351,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ConcreteTypeTest.FakeScope.getTypeOfThis()",
      "begin_line": 355,
      "end_line": 356,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 356,col 43)-(line 356,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ConcreteTypeTest.FakeScope.addSlot(java.lang.String)",
      "begin_line": 358,
      "end_line": 360,
      "comment": "",
      "child_ranges": [
        "(line 359,col 7)-(line 359,col 42)"
      ]
    },
    {
      "type": "class_interface",
      "name": "FakeSlot",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.rhino.jstype.StaticSlot\u003ccom.google.javascript.jscomp.ConcreteType\u003e"
      ],
      "begin_line": 364,
      "end_line": 385,
      "comment": " TODO(user): move to a common place if it can be used elsewhere"
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 365,
      "end_line": 365,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.ConcreteTypeTest.FakeSlot.FakeSlot(java.lang.String)",
      "begin_line": 367,
      "end_line": 369,
      "comment": "",
      "child_ranges": [
        "(line 368,col 7)-(line 368,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ConcreteTypeTest.FakeSlot.getName()",
      "begin_line": 371,
      "end_line": 372,
      "comment": "",
      "child_ranges": [
        "(line 372,col 31)-(line 372,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ConcreteTypeTest.FakeSlot.getType()",
      "begin_line": 374,
      "end_line": 375,
      "comment": "",
      "child_ranges": [
        "(line 375,col 37)-(line 375,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ConcreteTypeTest.FakeSlot.isTypeInferred()",
      "begin_line": 377,
      "end_line": 378,
      "comment": "",
      "child_ranges": [
        "(line 378,col 39)-(line 378,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ConcreteTypeTest.FakeSlot.getDeclaration()",
      "begin_line": 380,
      "end_line": 381,
      "comment": "",
      "child_ranges": [
        "(line 381,col 61)-(line 381,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ConcreteTypeTest.FakeSlot.getJSDocInfo()",
      "begin_line": 383,
      "end_line": 384,
      "comment": "",
      "child_ranges": [
        "(line 384,col 39)-(line 384,col 50)"
      ]
    }
  ]
}