{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/jscomp/type/ChainableReverseAbstractInterpreter.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ChainableReverseAbstractInterpreter",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.type.ReverseAbstractInterpreter"
      ],
      "begin_line": 52,
      "end_line": 718,
      "comment": "\n * Chainable reverse abstract interpreter providing basic functionality.\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "convention"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": ""
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
        "firstLink"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "nextLink"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.ChainableReverseAbstractInterpreter(com.google.javascript.jscomp.CodingConvention, com.google.javascript.rhino.jstype.JSTypeRegistry)",
      "begin_line": 63,
      "end_line": 70,
      "comment": "\n   * Constructs an interpreter, which is the only link in a chain. Interpreters\n   * can be appended using {@link #append}.\n   ",
      "child_ranges": [
        "(line 65,col 5)-(line 65,col 43)",
        "(line 66,col 5)-(line 66,col 33)",
        "(line 67,col 5)-(line 67,col 37)",
        "(line 68,col 5)-(line 68,col 21)",
        "(line 69,col 5)-(line 69,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.append(com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)",
      "begin_line": 80,
      "end_line": 86,
      "comment": "\n   * Appends a link to {@code this}, returning the updated last link.\n   * \u003cp\u003e\n   * The pattern {@code new X().append(new Y())...append(new Z())} forms a\n   * chain starting with X, then Y, then ... Z.\n   * @param lastLink a chainable interpreter, with no next link\n   * @return the updated last link\n   ",
      "child_ranges": [
        "(line 82,col 5)-(line 82,col 59)",
        "(line 83,col 5)-(line 83,col 29)",
        "(line 84,col 5)-(line 84,col 40)",
        "(line 85,col 5)-(line 85,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.getFirst()",
      "begin_line": 91,
      "end_line": 93,
      "comment": "\n   * Gets the first link of this chain.\n   ",
      "child_ranges": [
        "(line 92,col 5)-(line 92,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.firstPreciserScopeKnowingConditionOutcome(com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope, boolean)",
      "begin_line": 98,
      "end_line": 102,
      "comment": "\n   * Calculates the preciser scope starting with the first link.\n   ",
      "child_ranges": [
        "(line 100,col 5)-(line 101,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.nextPreciserScopeKnowingConditionOutcome(com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope, boolean)",
      "begin_line": 108,
      "end_line": 112,
      "comment": "\n   * Delegates the calculation of the preciser scope to the next link.\n   * If there is no next link, returns the blind scope.\n   ",
      "child_ranges": [
        "(line 110,col 5)-(line 111,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.getTypeIfRefinable(com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope)",
      "begin_line": 119,
      "end_line": 151,
      "comment": "\n   * Returns the type of a node in the given scope if the node corresponds to a\n   * name whose type is capable of being refined.\n   * @return The current type of the node if it can be refined, null otherwise.\n   ",
      "child_ranges": [
        "(line 120,col 5)-(line 149,col 5)",
        "(line 150,col 5)-(line 150,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.declareNameInScope(com.google.javascript.jscomp.type.FlowScope, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 158,
      "end_line": 181,
      "comment": "\n   * Declares a refined type in {@code scope} for the name represented by\n   * {@code node}. It must be possible to refine the type of the given node in\n   * the given scope, as determined by {@link #getTypeIfRefinable}.\n   ",
      "child_ranges": [
        "(line 159,col 5)-(line 180,col 5)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "restrictUndefinedVisitor"
      ],
      "begin_line": 186,
      "end_line": 268,
      "comment": "\n   * @see #getRestrictedWithoutUndefined(JSType)\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.Anonymous-f066b22a-6c39-498a-a1b8-66935e1e2c04.caseEnumElementType(com.google.javascript.rhino.jstype.EnumElementType)",
      "begin_line": 188,
      "end_line": 196,
      "comment": "",
      "child_ranges": [
        "(line 190,col 9)-(line 190,col 69)",
        "(line 191,col 9)-(line 195,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.Anonymous-bb09df80-86e0-4a51-998f-78404fa5e780.caseAllType()",
      "begin_line": 198,
      "end_line": 202,
      "comment": "",
      "child_ranges": [
        "(line 200,col 9)-(line 201,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.Anonymous-f8135cd1-921c-4f29-96e9-5c581d2a45b5.caseNoObjectType()",
      "begin_line": 204,
      "end_line": 207,
      "comment": "",
      "child_ranges": [
        "(line 206,col 9)-(line 206,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.Anonymous-38a9e5d1-2a74-4c2e-8520-5d85d1be1a1f.caseNoType()",
      "begin_line": 209,
      "end_line": 212,
      "comment": "",
      "child_ranges": [
        "(line 211,col 9)-(line 211,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.Anonymous-e7f9a3e2-c55a-4f10-9c0c-c78e3a35742c.caseBooleanType()",
      "begin_line": 214,
      "end_line": 217,
      "comment": "",
      "child_ranges": [
        "(line 216,col 9)-(line 216,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.Anonymous-c6bd77d0-8c88-4441-99b8-fa2923ff5088.caseFunctionType(com.google.javascript.rhino.jstype.FunctionType)",
      "begin_line": 219,
      "end_line": 222,
      "comment": "",
      "child_ranges": [
        "(line 221,col 9)-(line 221,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.Anonymous-1c18d2d4-d2e5-4008-a7fa-8cf3f2eda8b9.caseNullType()",
      "begin_line": 224,
      "end_line": 227,
      "comment": "",
      "child_ranges": [
        "(line 226,col 9)-(line 226,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.Anonymous-f840857d-2619-4a59-be0d-819bfac09841.caseNumberType()",
      "begin_line": 229,
      "end_line": 232,
      "comment": "",
      "child_ranges": [
        "(line 231,col 9)-(line 231,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.Anonymous-07bd2e14-e3cb-4ee3-a874-08858455a3fd.caseObjectType(com.google.javascript.rhino.jstype.ObjectType)",
      "begin_line": 234,
      "end_line": 237,
      "comment": "",
      "child_ranges": [
        "(line 236,col 9)-(line 236,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.Anonymous-585ff8d0-d651-4056-bc3d-fda7822437fc.caseStringType()",
      "begin_line": 239,
      "end_line": 242,
      "comment": "",
      "child_ranges": [
        "(line 241,col 9)-(line 241,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.Anonymous-5faf9a4f-6883-4d0d-b8d9-a031e6beeced.caseUnionType(com.google.javascript.rhino.jstype.UnionType)",
      "begin_line": 244,
      "end_line": 247,
      "comment": "",
      "child_ranges": [
        "(line 246,col 9)-(line 246,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.Anonymous-218772a7-eaed-415d-a744-93f232027c7a.caseUnknownType()",
      "begin_line": 249,
      "end_line": 252,
      "comment": "",
      "child_ranges": [
        "(line 251,col 9)-(line 251,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.Anonymous-ce00af94-80da-46fd-9416-ca926bda9224.caseVoidType()",
      "begin_line": 254,
      "end_line": 257,
      "comment": "",
      "child_ranges": [
        "(line 256,col 9)-(line 256,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.Anonymous-2fbf32d8-7afd-4ea9-8d78-3245914c55aa.caseTemplatizedType(com.google.javascript.rhino.jstype.TemplatizedType)",
      "begin_line": 259,
      "end_line": 262,
      "comment": "",
      "child_ranges": [
        "(line 261,col 9)-(line 261,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.Anonymous-f131c188-4571-432c-83fa-6f33d5f533b4.caseTemplateType(com.google.javascript.rhino.jstype.TemplateType)",
      "begin_line": 264,
      "end_line": 267,
      "comment": "",
      "child_ranges": [
        "(line 266,col 9)-(line 266,col 44)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "restrictNullVisitor"
      ],
      "begin_line": 274,
      "end_line": 357,
      "comment": "\n   * @see #getRestrictedWithoutNull(JSType)\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.Anonymous-2b69ab22-fc88-4872-b93e-ab6205ed47c6.caseEnumElementType(com.google.javascript.rhino.jstype.EnumElementType)",
      "begin_line": 276,
      "end_line": 285,
      "comment": "",
      "child_ranges": [
        "(line 278,col 9)-(line 278,col 69)",
        "(line 279,col 9)-(line 284,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.Anonymous-4f7fd005-6ea3-4612-9f2a-598fe8d5ec9a.caseAllType()",
      "begin_line": 287,
      "end_line": 291,
      "comment": "",
      "child_ranges": [
        "(line 289,col 9)-(line 290,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.Anonymous-b524bd2f-9fd1-4753-8bed-649e358d7228.caseNoObjectType()",
      "begin_line": 293,
      "end_line": 296,
      "comment": "",
      "child_ranges": [
        "(line 295,col 9)-(line 295,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.Anonymous-2426bfc4-a672-4093-ba02-5a336ee93418.caseNoType()",
      "begin_line": 298,
      "end_line": 301,
      "comment": "",
      "child_ranges": [
        "(line 300,col 9)-(line 300,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.Anonymous-02c393f8-5d96-4082-98f6-ee19473ecb8a.caseBooleanType()",
      "begin_line": 303,
      "end_line": 306,
      "comment": "",
      "child_ranges": [
        "(line 305,col 9)-(line 305,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.Anonymous-5c664386-ebf9-4135-926c-c5b806f55223.caseFunctionType(com.google.javascript.rhino.jstype.FunctionType)",
      "begin_line": 308,
      "end_line": 311,
      "comment": "",
      "child_ranges": [
        "(line 310,col 9)-(line 310,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.Anonymous-00ef5bde-e3eb-45bc-90e8-c327537bddbd.caseNullType()",
      "begin_line": 313,
      "end_line": 316,
      "comment": "",
      "child_ranges": [
        "(line 315,col 9)-(line 315,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.Anonymous-558a4f95-96c3-482e-9323-bbf252f167bf.caseNumberType()",
      "begin_line": 318,
      "end_line": 321,
      "comment": "",
      "child_ranges": [
        "(line 320,col 9)-(line 320,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.Anonymous-486a329c-56c1-4f30-9be7-1dbd4b9a5a9f.caseObjectType(com.google.javascript.rhino.jstype.ObjectType)",
      "begin_line": 323,
      "end_line": 326,
      "comment": "",
      "child_ranges": [
        "(line 325,col 9)-(line 325,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.Anonymous-a9f45289-ccfd-4bd2-bd40-143a4141ac0f.caseStringType()",
      "begin_line": 328,
      "end_line": 331,
      "comment": "",
      "child_ranges": [
        "(line 330,col 9)-(line 330,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.Anonymous-c0a96e27-dba6-4e0e-a761-313aad996779.caseUnionType(com.google.javascript.rhino.jstype.UnionType)",
      "begin_line": 333,
      "end_line": 336,
      "comment": "",
      "child_ranges": [
        "(line 335,col 9)-(line 335,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.Anonymous-86a31b1f-af95-4cbe-8b8b-77263de8e7e6.caseUnknownType()",
      "begin_line": 338,
      "end_line": 341,
      "comment": "",
      "child_ranges": [
        "(line 340,col 9)-(line 340,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.Anonymous-46576974-4e84-4a1f-b338-749828824ead.caseVoidType()",
      "begin_line": 343,
      "end_line": 346,
      "comment": "",
      "child_ranges": [
        "(line 345,col 9)-(line 345,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.Anonymous-5ad9f986-9e5f-4555-b879-ea3252c89876.caseTemplatizedType(com.google.javascript.rhino.jstype.TemplatizedType)",
      "begin_line": 348,
      "end_line": 351,
      "comment": "",
      "child_ranges": [
        "(line 350,col 9)-(line 350,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.Anonymous-94fc3ddd-fef9-4ebf-9a99-58b7a8fa1e82.caseTemplateType(com.google.javascript.rhino.jstype.TemplateType)",
      "begin_line": 353,
      "end_line": 356,
      "comment": "",
      "child_ranges": [
        "(line 355,col 9)-(line 355,col 44)"
      ]
    },
    {
      "type": "class_interface",
      "name": "RestrictByTypeOfResultVisitor",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.rhino.jstype.Visitor\u003ccom.google.javascript.rhino.jstype.JSType\u003e"
      ],
      "begin_line": 363,
      "end_line": 436,
      "comment": "\n   * A class common to all visitors that need to restrict the type based on\n   * {@code typeof}-like conditions.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.RestrictByTypeOfResultVisitor.caseTopType(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 374,
      "end_line": 374,
      "comment": "\n     * Abstracts away the similarities between visiting the unknown type and the\n     * all type.\n     * @param topType {@code UNKNOWN_TYPE} or {@code ALL_TYPE}\n     * @return the restricted type\n     * @see #caseAllType\n     * @see #caseUnknownType\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.RestrictByTypeOfResultVisitor.caseAllType()",
      "begin_line": 376,
      "end_line": 379,
      "comment": "",
      "child_ranges": [
        "(line 378,col 7)-(line 378,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.RestrictByTypeOfResultVisitor.caseUnknownType()",
      "begin_line": 381,
      "end_line": 384,
      "comment": "",
      "child_ranges": [
        "(line 383,col 7)-(line 383,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.RestrictByTypeOfResultVisitor.caseUnionType(com.google.javascript.rhino.jstype.UnionType)",
      "begin_line": 386,
      "end_line": 400,
      "comment": "",
      "child_ranges": [
        "(line 388,col 7)-(line 388,col 31)",
        "(line 389,col 7)-(line 398,col 7)",
        "(line 399,col 7)-(line 399,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.RestrictByTypeOfResultVisitor.caseNoType()",
      "begin_line": 402,
      "end_line": 405,
      "comment": "",
      "child_ranges": [
        "(line 404,col 7)-(line 404,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.RestrictByTypeOfResultVisitor.caseEnumElementType(com.google.javascript.rhino.jstype.EnumElementType)",
      "begin_line": 407,
      "end_line": 425,
      "comment": "",
      "child_ranges": [
        "(line 418,col 7)-(line 418,col 67)",
        "(line 419,col 7)-(line 424,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.RestrictByTypeOfResultVisitor.caseTemplatizedType(com.google.javascript.rhino.jstype.TemplatizedType)",
      "begin_line": 427,
      "end_line": 430,
      "comment": "",
      "child_ranges": [
        "(line 429,col 7)-(line 429,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.RestrictByTypeOfResultVisitor.caseTemplateType(com.google.javascript.rhino.jstype.TemplateType)",
      "begin_line": 432,
      "end_line": 435,
      "comment": "",
      "child_ranges": [
        "(line 434,col 7)-(line 434,col 42)"
      ]
    },
    {
      "type": "class_interface",
      "name": "RestrictByTrueTypeOfResultVisitor",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.RestrictByTypeOfResultVisitor"
      ],
      "begin_line": 443,
      "end_line": 484,
      "comment": "\n   * A class common to all visitors that need to restrict the type based on\n   * some {@code typeof}-like condition being true. All base cases return\n   * {@code null}. It is up to the subclasses to override the appropriate ones.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.RestrictByTrueTypeOfResultVisitor.caseNoObjectType()",
      "begin_line": 445,
      "end_line": 448,
      "comment": "",
      "child_ranges": [
        "(line 447,col 7)-(line 447,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.RestrictByTrueTypeOfResultVisitor.caseBooleanType()",
      "begin_line": 450,
      "end_line": 453,
      "comment": "",
      "child_ranges": [
        "(line 452,col 7)-(line 452,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.RestrictByTrueTypeOfResultVisitor.caseFunctionType(com.google.javascript.rhino.jstype.FunctionType)",
      "begin_line": 455,
      "end_line": 458,
      "comment": "",
      "child_ranges": [
        "(line 457,col 7)-(line 457,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.RestrictByTrueTypeOfResultVisitor.caseNullType()",
      "begin_line": 460,
      "end_line": 463,
      "comment": "",
      "child_ranges": [
        "(line 462,col 7)-(line 462,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.RestrictByTrueTypeOfResultVisitor.caseNumberType()",
      "begin_line": 465,
      "end_line": 468,
      "comment": "",
      "child_ranges": [
        "(line 467,col 7)-(line 467,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.RestrictByTrueTypeOfResultVisitor.caseObjectType(com.google.javascript.rhino.jstype.ObjectType)",
      "begin_line": 470,
      "end_line": 473,
      "comment": "",
      "child_ranges": [
        "(line 472,col 7)-(line 472,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.RestrictByTrueTypeOfResultVisitor.caseStringType()",
      "begin_line": 475,
      "end_line": 478,
      "comment": "",
      "child_ranges": [
        "(line 477,col 7)-(line 477,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.RestrictByTrueTypeOfResultVisitor.caseVoidType()",
      "begin_line": 480,
      "end_line": 483,
      "comment": "",
      "child_ranges": [
        "(line 482,col 7)-(line 482,col 18)"
      ]
    },
    {
      "type": "class_interface",
      "name": "RestrictByFalseTypeOfResultVisitor",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.RestrictByTypeOfResultVisitor"
      ],
      "begin_line": 491,
      "end_line": 537,
      "comment": "\n   * A class common to all visitors that need to restrict the type based on\n   * some {@code typeof}-like condition being false. All base cases return\n   * their type. It is up to the subclasses to override the appropriate ones.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.RestrictByFalseTypeOfResultVisitor.caseTopType(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 493,
      "end_line": 496,
      "comment": "",
      "child_ranges": [
        "(line 495,col 7)-(line 495,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.RestrictByFalseTypeOfResultVisitor.caseNoObjectType()",
      "begin_line": 498,
      "end_line": 501,
      "comment": "",
      "child_ranges": [
        "(line 500,col 7)-(line 500,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.RestrictByFalseTypeOfResultVisitor.caseBooleanType()",
      "begin_line": 503,
      "end_line": 506,
      "comment": "",
      "child_ranges": [
        "(line 505,col 7)-(line 505,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.RestrictByFalseTypeOfResultVisitor.caseFunctionType(com.google.javascript.rhino.jstype.FunctionType)",
      "begin_line": 508,
      "end_line": 511,
      "comment": "",
      "child_ranges": [
        "(line 510,col 7)-(line 510,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.RestrictByFalseTypeOfResultVisitor.caseNullType()",
      "begin_line": 513,
      "end_line": 516,
      "comment": "",
      "child_ranges": [
        "(line 515,col 7)-(line 515,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.RestrictByFalseTypeOfResultVisitor.caseNumberType()",
      "begin_line": 518,
      "end_line": 521,
      "comment": "",
      "child_ranges": [
        "(line 520,col 7)-(line 520,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.RestrictByFalseTypeOfResultVisitor.caseObjectType(com.google.javascript.rhino.jstype.ObjectType)",
      "begin_line": 523,
      "end_line": 526,
      "comment": "",
      "child_ranges": [
        "(line 525,col 7)-(line 525,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.RestrictByFalseTypeOfResultVisitor.caseStringType()",
      "begin_line": 528,
      "end_line": 531,
      "comment": "",
      "child_ranges": [
        "(line 530,col 7)-(line 530,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.RestrictByFalseTypeOfResultVisitor.caseVoidType()",
      "begin_line": 533,
      "end_line": 536,
      "comment": "",
      "child_ranges": [
        "(line 535,col 7)-(line 535,col 38)"
      ]
    },
    {
      "type": "class_interface",
      "name": "RestrictByOneTypeOfResultVisitor",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.RestrictByTypeOfResultVisitor"
      ],
      "begin_line": 542,
      "end_line": 633,
      "comment": "\n   * @see ChainableReverseAbstractInterpreter#getRestrictedByTypeOfResult\n   "
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 548,
      "end_line": 548,
      "comment": "\n     * A value known to be equal or not equal to the result of the\n     * {@code typeOf} operation.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "resultEqualsValue"
      ],
      "begin_line": 555,
      "end_line": 555,
      "comment": "\n     * {@code true} if the {@code typeOf} result is known to equal\n     * {@code value}; {@code false} if it is known \u003cem\u003enot\u003c/em\u003e to equal\n     * {@code value}.\n     "
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.RestrictByOneTypeOfResultVisitor.RestrictByOneTypeOfResultVisitor(java.lang.String, boolean)",
      "begin_line": 557,
      "end_line": 560,
      "comment": "",
      "child_ranges": [
        "(line 558,col 7)-(line 558,col 25)",
        "(line 559,col 7)-(line 559,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.RestrictByOneTypeOfResultVisitor.matchesExpectation(java.lang.String)",
      "begin_line": 567,
      "end_line": 569,
      "comment": "\n     * Computes whether the given result of a {@code typeof} operator matches\n     * expectations, i.e. whether a type that gives such a result should be\n     * kept.\n     ",
      "child_ranges": [
        "(line 568,col 7)-(line 568,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.RestrictByOneTypeOfResultVisitor.caseTopType(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 571,
      "end_line": 581,
      "comment": "",
      "child_ranges": [
        "(line 573,col 7)-(line 573,col 30)",
        "(line 574,col 7)-(line 579,col 7)",
        "(line 580,col 7)-(line 580,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.RestrictByOneTypeOfResultVisitor.caseNoObjectType()",
      "begin_line": 583,
      "end_line": 587,
      "comment": "",
      "child_ranges": [
        "(line 585,col 7)-(line 586,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.RestrictByOneTypeOfResultVisitor.caseBooleanType()",
      "begin_line": 589,
      "end_line": 592,
      "comment": "",
      "child_ranges": [
        "(line 591,col 7)-(line 591,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.RestrictByOneTypeOfResultVisitor.caseFunctionType(com.google.javascript.rhino.jstype.FunctionType)",
      "begin_line": 594,
      "end_line": 597,
      "comment": "",
      "child_ranges": [
        "(line 596,col 7)-(line 596,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.RestrictByOneTypeOfResultVisitor.caseNullType()",
      "begin_line": 599,
      "end_line": 602,
      "comment": "",
      "child_ranges": [
        "(line 601,col 7)-(line 601,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.RestrictByOneTypeOfResultVisitor.caseNumberType()",
      "begin_line": 604,
      "end_line": 607,
      "comment": "",
      "child_ranges": [
        "(line 606,col 7)-(line 606,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.RestrictByOneTypeOfResultVisitor.caseObjectType(com.google.javascript.rhino.jstype.ObjectType)",
      "begin_line": 609,
      "end_line": 622,
      "comment": "",
      "child_ranges": [
        "(line 611,col 7)-(line 620,col 7)",
        "(line 621,col 7)-(line 621,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.RestrictByOneTypeOfResultVisitor.caseStringType()",
      "begin_line": 624,
      "end_line": 627,
      "comment": "",
      "child_ranges": [
        "(line 626,col 7)-(line 626,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.RestrictByOneTypeOfResultVisitor.caseVoidType()",
      "begin_line": 629,
      "end_line": 632,
      "comment": "",
      "child_ranges": [
        "(line 631,col 7)-(line 631,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.getRestrictedWithoutUndefined(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 638,
      "end_line": 640,
      "comment": "\n   * Returns a version of type where undefined is not present.\n   ",
      "child_ranges": [
        "(line 639,col 5)-(line 639,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.getRestrictedWithoutNull(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 645,
      "end_line": 647,
      "comment": "\n   * Returns a version of type where null is not present.\n   ",
      "child_ranges": [
        "(line 646,col 5)-(line 646,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.getRestrictedByTypeOfResult(com.google.javascript.rhino.jstype.JSType, java.lang.String, boolean)",
      "begin_line": 676,
      "end_line": 688,
      "comment": "\n   * Returns a version of {@code type} that is restricted by some knowledge\n   * about the result of the {@code typeof} operation.\n   * \u003cp\u003e\n   * The behavior of the {@code typeof} operator can be summarized by the\n   * following table:\n   * \u003ctable\u003e\n   * \u003ctr\u003e\u003cth\u003etype\u003c/th\u003e\u003cth\u003eresult\u003c/th\u003e\u003c/tr\u003e\n   * \u003ctr\u003e\u003ctd\u003e{@code undefined}\u003c/td\u003e\u003ctd\u003e\"undefined\"\u003c/td\u003e\u003c/tr\u003e\n   * \u003ctr\u003e\u003ctd\u003e{@code null}\u003c/td\u003e\u003ctd\u003e\"object\"\u003c/td\u003e\u003c/tr\u003e\n   * \u003ctr\u003e\u003ctd\u003e{@code boolean}\u003c/td\u003e\u003ctd\u003e\"boolean\"\u003c/td\u003e\u003c/tr\u003e\n   * \u003ctr\u003e\u003ctd\u003e{@code number}\u003c/td\u003e\u003ctd\u003e\"number\"\u003c/td\u003e\u003c/tr\u003e\n   * \u003ctr\u003e\u003ctd\u003e{@code string}\u003c/td\u003e\u003ctd\u003e\"string\"\u003c/td\u003e\u003c/tr\u003e\n   * \u003ctr\u003e\u003ctd\u003e{@code Object} (which doesn\u0027t implement [[Call]])\u003c/td\u003e\n   *     \u003ctd\u003e\"object\"\u003c/td\u003e\u003c/tr\u003e\n   * \u003ctr\u003e\u003ctd\u003e{@code Object} (which implements [[Call]])\u003c/td\u003e\n   *     \u003ctd\u003e\"function\"\u003c/td\u003e\u003c/tr\u003e\n   * \u003c/table\u003e\n   * @param type the type to restrict\n   * @param value A value known to be equal or not equal to the result of the\n   *        {@code typeof} operation\n   * @param resultEqualsValue {@code true} if the {@code typeOf} result is known\n   *        to equal {@code value}; {@code false} if it is known \u003cem\u003enot\u003c/em\u003e to\n   *        equal {@code value}\n   * @return the restricted type or null if no version of the type matches the\n   *         restriction\n   ",
      "child_ranges": [
        "(line 678,col 5)-(line 685,col 5)",
        "(line 686,col 5)-(line 687,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.getNativeType(com.google.javascript.rhino.jstype.JSTypeNative)",
      "begin_line": 690,
      "end_line": 692,
      "comment": "",
      "child_ranges": [
        "(line 691,col 5)-(line 691,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.getNativeTypeForTypeOf(java.lang.String)",
      "begin_line": 703,
      "end_line": 717,
      "comment": "\n   * If we definitely know what a type is based on the typeof result,\n   * return it.  Otherwise, return null.\n   *\n   * The typeof operation in JS is poorly defined, and this function works\n   * for both the native typeof and goog.typeOf. It should not be made public,\n   * because its semantics are informally defined, and would be wrong in\n   * the general case.\n   ",
      "child_ranges": [
        "(line 704,col 5)-(line 716,col 5)"
      ]
    }
  ]
}