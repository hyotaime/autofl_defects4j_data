{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/rhino/jstype/ProxyObjectType.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ProxyObjectType",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.rhino.jstype.ObjectType"
      ],
      "begin_line": 56,
      "end_line": 376,
      "comment": "\n * An object type which uses composition to delegate all calls.\n *\n * @see NamedType\n * @see TemplatizedType\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "referencedType"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "referencedObjType"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.rhino.jstype.ProxyObjectType.ProxyObjectType(com.google.javascript.rhino.jstype.JSTypeRegistry, com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 62,
      "end_line": 64,
      "comment": "",
      "child_ranges": [
        "(line 63,col 5)-(line 63,col 41)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.rhino.jstype.ProxyObjectType.ProxyObjectType(com.google.javascript.rhino.jstype.JSTypeRegistry, com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.jstype.TemplateTypeMap)",
      "begin_line": 66,
      "end_line": 70,
      "comment": "",
      "child_ranges": [
        "(line 68,col 5)-(line 68,col 37)",
        "(line 69,col 5)-(line 69,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ProxyObjectType.getPropertyMap()",
      "begin_line": 72,
      "end_line": 76,
      "comment": "",
      "child_ranges": [
        "(line 74,col 5)-(line 75,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ProxyObjectType.getReferencedTypeInternal()",
      "begin_line": 78,
      "end_line": 80,
      "comment": "",
      "child_ranges": [
        "(line 79,col 5)-(line 79,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ProxyObjectType.getReferencedObjTypeInternal()",
      "begin_line": 82,
      "end_line": 84,
      "comment": "",
      "child_ranges": [
        "(line 83,col 5)-(line 83,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ProxyObjectType.setReferencedType(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 86,
      "end_line": 93,
      "comment": "",
      "child_ranges": [
        "(line 87,col 5)-(line 87,col 41)",
        "(line 88,col 5)-(line 92,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ProxyObjectType.getReferenceName()",
      "begin_line": 95,
      "end_line": 99,
      "comment": "",
      "child_ranges": [
        "(line 97,col 5)-(line 98,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ProxyObjectType.hasReferenceName()",
      "begin_line": 101,
      "end_line": 105,
      "comment": "",
      "child_ranges": [
        "(line 103,col 5)-(line 104,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ProxyObjectType.matchesNumberContext()",
      "begin_line": 107,
      "end_line": 110,
      "comment": "",
      "child_ranges": [
        "(line 109,col 5)-(line 109,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ProxyObjectType.matchesStringContext()",
      "begin_line": 112,
      "end_line": 115,
      "comment": "",
      "child_ranges": [
        "(line 114,col 5)-(line 114,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ProxyObjectType.matchesObjectContext()",
      "begin_line": 117,
      "end_line": 120,
      "comment": "",
      "child_ranges": [
        "(line 119,col 5)-(line 119,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ProxyObjectType.canBeCalled()",
      "begin_line": 122,
      "end_line": 125,
      "comment": "",
      "child_ranges": [
        "(line 124,col 5)-(line 124,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ProxyObjectType.isNoType()",
      "begin_line": 127,
      "end_line": 130,
      "comment": "",
      "child_ranges": [
        "(line 129,col 5)-(line 129,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ProxyObjectType.isNoObjectType()",
      "begin_line": 132,
      "end_line": 135,
      "comment": "",
      "child_ranges": [
        "(line 134,col 5)-(line 134,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ProxyObjectType.isNoResolvedType()",
      "begin_line": 137,
      "end_line": 140,
      "comment": "",
      "child_ranges": [
        "(line 139,col 5)-(line 139,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ProxyObjectType.isUnknownType()",
      "begin_line": 142,
      "end_line": 145,
      "comment": "",
      "child_ranges": [
        "(line 144,col 5)-(line 144,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ProxyObjectType.isCheckedUnknownType()",
      "begin_line": 147,
      "end_line": 150,
      "comment": "",
      "child_ranges": [
        "(line 149,col 5)-(line 149,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ProxyObjectType.isNullable()",
      "begin_line": 152,
      "end_line": 155,
      "comment": "",
      "child_ranges": [
        "(line 154,col 5)-(line 154,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ProxyObjectType.toMaybeEnumType()",
      "begin_line": 157,
      "end_line": 160,
      "comment": "",
      "child_ranges": [
        "(line 159,col 5)-(line 159,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ProxyObjectType.isConstructor()",
      "begin_line": 162,
      "end_line": 165,
      "comment": "",
      "child_ranges": [
        "(line 164,col 5)-(line 164,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ProxyObjectType.isNominalType()",
      "begin_line": 167,
      "end_line": 170,
      "comment": "",
      "child_ranges": [
        "(line 169,col 5)-(line 169,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ProxyObjectType.isInstanceType()",
      "begin_line": 172,
      "end_line": 175,
      "comment": "",
      "child_ranges": [
        "(line 174,col 5)-(line 174,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ProxyObjectType.isInterface()",
      "begin_line": 177,
      "end_line": 180,
      "comment": "",
      "child_ranges": [
        "(line 179,col 5)-(line 179,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ProxyObjectType.isOrdinaryFunction()",
      "begin_line": 182,
      "end_line": 185,
      "comment": "",
      "child_ranges": [
        "(line 184,col 5)-(line 184,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ProxyObjectType.isAllType()",
      "begin_line": 187,
      "end_line": 190,
      "comment": "",
      "child_ranges": [
        "(line 189,col 5)-(line 189,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ProxyObjectType.isStruct()",
      "begin_line": 192,
      "end_line": 195,
      "comment": "",
      "child_ranges": [
        "(line 194,col 5)-(line 194,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ProxyObjectType.isDict()",
      "begin_line": 197,
      "end_line": 200,
      "comment": "",
      "child_ranges": [
        "(line 199,col 5)-(line 199,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ProxyObjectType.isNativeObjectType()",
      "begin_line": 202,
      "end_line": 206,
      "comment": "",
      "child_ranges": [
        "(line 204,col 5)-(line 205,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ProxyObjectType.toMaybeRecordType()",
      "begin_line": 208,
      "end_line": 211,
      "comment": "",
      "child_ranges": [
        "(line 210,col 5)-(line 210,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ProxyObjectType.toMaybeUnionType()",
      "begin_line": 213,
      "end_line": 216,
      "comment": "",
      "child_ranges": [
        "(line 215,col 5)-(line 215,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ProxyObjectType.toMaybeFunctionType()",
      "begin_line": 218,
      "end_line": 221,
      "comment": "",
      "child_ranges": [
        "(line 220,col 5)-(line 220,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ProxyObjectType.toMaybeEnumElementType()",
      "begin_line": 223,
      "end_line": 226,
      "comment": "",
      "child_ranges": [
        "(line 225,col 5)-(line 225,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ProxyObjectType.testForEquality(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 228,
      "end_line": 231,
      "comment": "",
      "child_ranges": [
        "(line 230,col 5)-(line 230,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ProxyObjectType.isSubtype(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 233,
      "end_line": 236,
      "comment": "",
      "child_ranges": [
        "(line 235,col 5)-(line 235,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ProxyObjectType.getOwnerFunction()",
      "begin_line": 238,
      "end_line": 242,
      "comment": "",
      "child_ranges": [
        "(line 240,col 5)-(line 241,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ProxyObjectType.getCtorImplementedInterfaces()",
      "begin_line": 244,
      "end_line": 248,
      "comment": "",
      "child_ranges": [
        "(line 246,col 5)-(line 247,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ProxyObjectType.hashCode()",
      "begin_line": 250,
      "end_line": 253,
      "comment": "",
      "child_ranges": [
        "(line 252,col 5)-(line 252,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ProxyObjectType.toStringHelper(boolean)",
      "begin_line": 255,
      "end_line": 258,
      "comment": "",
      "child_ranges": [
        "(line 257,col 5)-(line 257,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ProxyObjectType.getImplicitPrototype()",
      "begin_line": 260,
      "end_line": 264,
      "comment": "",
      "child_ranges": [
        "(line 262,col 5)-(line 263,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ProxyObjectType.defineProperty(java.lang.String, com.google.javascript.rhino.jstype.JSType, boolean, com.google.javascript.rhino.Node)",
      "begin_line": 266,
      "end_line": 272,
      "comment": "",
      "child_ranges": [
        "(line 269,col 5)-(line 271,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ProxyObjectType.removeProperty(java.lang.String)",
      "begin_line": 274,
      "end_line": 278,
      "comment": "",
      "child_ranges": [
        "(line 276,col 5)-(line 277,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ProxyObjectType.findPropertyType(java.lang.String)",
      "begin_line": 280,
      "end_line": 283,
      "comment": "",
      "child_ranges": [
        "(line 282,col 5)-(line 282,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ProxyObjectType.getJSDocInfo()",
      "begin_line": 285,
      "end_line": 288,
      "comment": "",
      "child_ranges": [
        "(line 287,col 5)-(line 287,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ProxyObjectType.setJSDocInfo(com.google.javascript.rhino.JSDocInfo)",
      "begin_line": 290,
      "end_line": 295,
      "comment": "",
      "child_ranges": [
        "(line 292,col 5)-(line 294,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ProxyObjectType.setPropertyJSDocInfo(java.lang.String, com.google.javascript.rhino.JSDocInfo)",
      "begin_line": 297,
      "end_line": 302,
      "comment": "",
      "child_ranges": [
        "(line 299,col 5)-(line 301,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ProxyObjectType.getConstructor()",
      "begin_line": 304,
      "end_line": 308,
      "comment": "",
      "child_ranges": [
        "(line 306,col 5)-(line 307,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ProxyObjectType.getTemplateTypes()",
      "begin_line": 310,
      "end_line": 314,
      "comment": "",
      "child_ranges": [
        "(line 312,col 5)-(line 313,col 45)"
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
      "signature": "com.google.javascript.rhino.jstype.ProxyObjectType.toMaybeTemplatizedType()",
      "begin_line": 357,
      "end_line": 360,
      "comment": "",
      "child_ranges": [
        "(line 359,col 5)-(line 359,col 51)"
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
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ProxyObjectType.getTemplateTypeMap()",
      "begin_line": 372,
      "end_line": 375,
      "comment": "",
      "child_ranges": [
        "(line 374,col 5)-(line 374,col 47)"
      ]
    }
  ]
}