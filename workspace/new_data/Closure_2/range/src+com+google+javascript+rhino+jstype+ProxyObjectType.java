{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/rhino/jstype/ProxyObjectType.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ProxyObjectType",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.rhino.jstype.ObjectType"
      ],
      "begin_line": 55,
      "end_line": 371,
      "comment": "\n * An object type which uses composition to delegate all calls.\n *\n * @see NamedType\n * @see ParameterizedType\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "referencedType"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "referencedObjType"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.rhino.jstype.ProxyObjectType.ProxyObjectType(com.google.javascript.rhino.jstype.JSTypeRegistry, com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 61,
      "end_line": 64,
      "comment": "",
      "child_ranges": [
        "(line 62,col 5)-(line 62,col 20)",
        "(line 63,col 5)-(line 63,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ProxyObjectType.getPropertyMap()",
      "begin_line": 66,
      "end_line": 70,
      "comment": "",
      "child_ranges": [
        "(line 68,col 5)-(line 69,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ProxyObjectType.getReferencedTypeInternal()",
      "begin_line": 72,
      "end_line": 74,
      "comment": "",
      "child_ranges": [
        "(line 73,col 5)-(line 73,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ProxyObjectType.getReferencedObjTypeInternal()",
      "begin_line": 76,
      "end_line": 78,
      "comment": "",
      "child_ranges": [
        "(line 77,col 5)-(line 77,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ProxyObjectType.setReferencedType(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 80,
      "end_line": 87,
      "comment": "",
      "child_ranges": [
        "(line 81,col 5)-(line 81,col 41)",
        "(line 82,col 5)-(line 86,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ProxyObjectType.getReferenceName()",
      "begin_line": 89,
      "end_line": 93,
      "comment": "",
      "child_ranges": [
        "(line 91,col 5)-(line 92,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ProxyObjectType.hasReferenceName()",
      "begin_line": 95,
      "end_line": 99,
      "comment": "",
      "child_ranges": [
        "(line 97,col 5)-(line 98,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ProxyObjectType.matchesNumberContext()",
      "begin_line": 101,
      "end_line": 104,
      "comment": "",
      "child_ranges": [
        "(line 103,col 5)-(line 103,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ProxyObjectType.matchesStringContext()",
      "begin_line": 106,
      "end_line": 109,
      "comment": "",
      "child_ranges": [
        "(line 108,col 5)-(line 108,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ProxyObjectType.matchesObjectContext()",
      "begin_line": 111,
      "end_line": 114,
      "comment": "",
      "child_ranges": [
        "(line 113,col 5)-(line 113,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ProxyObjectType.canBeCalled()",
      "begin_line": 116,
      "end_line": 119,
      "comment": "",
      "child_ranges": [
        "(line 118,col 5)-(line 118,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ProxyObjectType.isNoType()",
      "begin_line": 121,
      "end_line": 124,
      "comment": "",
      "child_ranges": [
        "(line 123,col 5)-(line 123,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ProxyObjectType.isNoObjectType()",
      "begin_line": 126,
      "end_line": 129,
      "comment": "",
      "child_ranges": [
        "(line 128,col 5)-(line 128,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ProxyObjectType.isNoResolvedType()",
      "begin_line": 131,
      "end_line": 134,
      "comment": "",
      "child_ranges": [
        "(line 133,col 5)-(line 133,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ProxyObjectType.isUnknownType()",
      "begin_line": 136,
      "end_line": 139,
      "comment": "",
      "child_ranges": [
        "(line 138,col 5)-(line 138,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ProxyObjectType.isCheckedUnknownType()",
      "begin_line": 141,
      "end_line": 144,
      "comment": "",
      "child_ranges": [
        "(line 143,col 5)-(line 143,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ProxyObjectType.isNullable()",
      "begin_line": 146,
      "end_line": 149,
      "comment": "",
      "child_ranges": [
        "(line 148,col 5)-(line 148,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ProxyObjectType.toMaybeEnumType()",
      "begin_line": 151,
      "end_line": 154,
      "comment": "",
      "child_ranges": [
        "(line 153,col 5)-(line 153,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ProxyObjectType.isConstructor()",
      "begin_line": 156,
      "end_line": 159,
      "comment": "",
      "child_ranges": [
        "(line 158,col 5)-(line 158,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ProxyObjectType.isNominalType()",
      "begin_line": 161,
      "end_line": 164,
      "comment": "",
      "child_ranges": [
        "(line 163,col 5)-(line 163,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ProxyObjectType.isInstanceType()",
      "begin_line": 166,
      "end_line": 169,
      "comment": "",
      "child_ranges": [
        "(line 168,col 5)-(line 168,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ProxyObjectType.isInterface()",
      "begin_line": 171,
      "end_line": 174,
      "comment": "",
      "child_ranges": [
        "(line 173,col 5)-(line 173,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ProxyObjectType.isOrdinaryFunction()",
      "begin_line": 176,
      "end_line": 179,
      "comment": "",
      "child_ranges": [
        "(line 178,col 5)-(line 178,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ProxyObjectType.isAllType()",
      "begin_line": 181,
      "end_line": 184,
      "comment": "",
      "child_ranges": [
        "(line 183,col 5)-(line 183,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ProxyObjectType.isStruct()",
      "begin_line": 186,
      "end_line": 189,
      "comment": "",
      "child_ranges": [
        "(line 188,col 5)-(line 188,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ProxyObjectType.isDict()",
      "begin_line": 191,
      "end_line": 194,
      "comment": "",
      "child_ranges": [
        "(line 193,col 5)-(line 193,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ProxyObjectType.isNativeObjectType()",
      "begin_line": 196,
      "end_line": 200,
      "comment": "",
      "child_ranges": [
        "(line 198,col 5)-(line 199,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ProxyObjectType.toMaybeRecordType()",
      "begin_line": 202,
      "end_line": 205,
      "comment": "",
      "child_ranges": [
        "(line 204,col 5)-(line 204,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ProxyObjectType.toMaybeUnionType()",
      "begin_line": 207,
      "end_line": 210,
      "comment": "",
      "child_ranges": [
        "(line 209,col 5)-(line 209,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ProxyObjectType.toMaybeFunctionType()",
      "begin_line": 212,
      "end_line": 215,
      "comment": "",
      "child_ranges": [
        "(line 214,col 5)-(line 214,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ProxyObjectType.toMaybeEnumElementType()",
      "begin_line": 217,
      "end_line": 220,
      "comment": "",
      "child_ranges": [
        "(line 219,col 5)-(line 219,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ProxyObjectType.testForEquality(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 222,
      "end_line": 225,
      "comment": "",
      "child_ranges": [
        "(line 224,col 5)-(line 224,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ProxyObjectType.isSubtype(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 227,
      "end_line": 230,
      "comment": "",
      "child_ranges": [
        "(line 229,col 5)-(line 229,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ProxyObjectType.getOwnerFunction()",
      "begin_line": 232,
      "end_line": 236,
      "comment": "",
      "child_ranges": [
        "(line 234,col 5)-(line 235,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ProxyObjectType.getCtorImplementedInterfaces()",
      "begin_line": 238,
      "end_line": 242,
      "comment": "",
      "child_ranges": [
        "(line 240,col 5)-(line 241,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ProxyObjectType.hashCode()",
      "begin_line": 244,
      "end_line": 247,
      "comment": "",
      "child_ranges": [
        "(line 246,col 5)-(line 246,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ProxyObjectType.toStringHelper(boolean)",
      "begin_line": 249,
      "end_line": 252,
      "comment": "",
      "child_ranges": [
        "(line 251,col 5)-(line 251,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ProxyObjectType.getImplicitPrototype()",
      "begin_line": 254,
      "end_line": 258,
      "comment": "",
      "child_ranges": [
        "(line 256,col 5)-(line 257,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ProxyObjectType.defineProperty(java.lang.String, com.google.javascript.rhino.jstype.JSType, boolean, com.google.javascript.rhino.Node)",
      "begin_line": 260,
      "end_line": 266,
      "comment": "",
      "child_ranges": [
        "(line 263,col 5)-(line 265,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ProxyObjectType.removeProperty(java.lang.String)",
      "begin_line": 268,
      "end_line": 272,
      "comment": "",
      "child_ranges": [
        "(line 270,col 5)-(line 271,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ProxyObjectType.findPropertyType(java.lang.String)",
      "begin_line": 274,
      "end_line": 277,
      "comment": "",
      "child_ranges": [
        "(line 276,col 5)-(line 276,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ProxyObjectType.getJSDocInfo()",
      "begin_line": 279,
      "end_line": 282,
      "comment": "",
      "child_ranges": [
        "(line 281,col 5)-(line 281,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ProxyObjectType.setJSDocInfo(com.google.javascript.rhino.JSDocInfo)",
      "begin_line": 284,
      "end_line": 289,
      "comment": "",
      "child_ranges": [
        "(line 286,col 5)-(line 288,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ProxyObjectType.setPropertyJSDocInfo(java.lang.String, com.google.javascript.rhino.JSDocInfo)",
      "begin_line": 291,
      "end_line": 296,
      "comment": "",
      "child_ranges": [
        "(line 293,col 5)-(line 295,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ProxyObjectType.getConstructor()",
      "begin_line": 298,
      "end_line": 302,
      "comment": "",
      "child_ranges": [
        "(line 300,col 5)-(line 301,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ProxyObjectType.getParameterType()",
      "begin_line": 304,
      "end_line": 308,
      "comment": "",
      "child_ranges": [
        "(line 306,col 5)-(line 307,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ProxyObjectType.getIndexType()",
      "begin_line": 310,
      "end_line": 314,
      "comment": "",
      "child_ranges": [
        "(line 312,col 5)-(line 313,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ProxyObjectType.visit(com.google.javascript.rhino.jstype.Visitor\u003cT\u003e)",
      "begin_line": 316,
      "end_line": 319,
      "comment": "",
      "child_ranges": [
        "(line 318,col 5)-(line 318,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ProxyObjectType.visit(com.google.javascript.rhino.jstype.RelationshipVisitor\u003cT\u003e, com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 321,
      "end_line": 323,
      "comment": "",
      "child_ranges": [
        "(line 322,col 5)-(line 322,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ProxyObjectType.resolveInternal(com.google.javascript.rhino.ErrorReporter, com.google.javascript.rhino.jstype.StaticScope\u003ccom.google.javascript.rhino.jstype.JSType\u003e)",
      "begin_line": 325,
      "end_line": 329,
      "comment": "",
      "child_ranges": [
        "(line 327,col 5)-(line 327,col 56)",
        "(line 328,col 5)-(line 328,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ProxyObjectType.toDebugHashCodeString()",
      "begin_line": 331,
      "end_line": 334,
      "comment": "",
      "child_ranges": [
        "(line 333,col 5)-(line 333,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ProxyObjectType.getTypeOfThis()",
      "begin_line": 336,
      "end_line": 342,
      "comment": "",
      "child_ranges": [
        "(line 338,col 5)-(line 340,col 5)",
        "(line 341,col 5)-(line 341,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ProxyObjectType.collapseUnion()",
      "begin_line": 344,
      "end_line": 350,
      "comment": "",
      "child_ranges": [
        "(line 346,col 5)-(line 348,col 5)",
        "(line 349,col 5)-(line 349,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ProxyObjectType.matchConstraint(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 352,
      "end_line": 355,
      "comment": "",
      "child_ranges": [
        "(line 354,col 5)-(line 354,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ProxyObjectType.toMaybeParameterizedType()",
      "begin_line": 357,
      "end_line": 360,
      "comment": "",
      "child_ranges": [
        "(line 359,col 5)-(line 359,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ProxyObjectType.toMaybeTemplateType()",
      "begin_line": 362,
      "end_line": 365,
      "comment": "",
      "child_ranges": [
        "(line 364,col 5)-(line 364,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ProxyObjectType.hasAnyTemplateTypesInternal()",
      "begin_line": 367,
      "end_line": 370,
      "comment": "",
      "child_ranges": [
        "(line 369,col 5)-(line 369,col 48)"
      ]
    }
  ]
}