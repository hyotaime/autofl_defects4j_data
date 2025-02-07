{
  "filepath": "/tmp/Mockito-18b/src/org/mockito/internal/creation/instance/ConstructorInstantiator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ConstructorInstantiator",
      "is_interface": false,
      "parent_types": [
        "org.mockito.internal.creation.instance.Instantiator"
      ],
      "begin_line": 7,
      "end_line": 74,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "outerClassInstance"
      ],
      "begin_line": 9,
      "end_line": 9,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.mockito.internal.creation.instance.ConstructorInstantiator.ConstructorInstantiator(java.lang.Object)",
      "begin_line": 11,
      "end_line": 13,
      "comment": "",
      "child_ranges": [
        "(line 12,col 9)-(line 12,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.creation.instance.ConstructorInstantiator.newInstance(java.lang.Class\u003cT\u003e)",
      "begin_line": 15,
      "end_line": 20,
      "comment": "",
      "child_ranges": [
        "(line 16,col 9)-(line 18,col 9)",
        "(line 19,col 9)-(line 19,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.creation.instance.ConstructorInstantiator.withParams(java.lang.Class\u003cT\u003e, java.lang.Object...)",
      "begin_line": 22,
      "end_line": 36,
      "comment": "",
      "child_ranges": [
        "(line 23,col 9)-(line 34,col 9)",
        "(line 35,col 9)-(line 35,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.creation.instance.ConstructorInstantiator.invokeConstructor(java.lang.reflect.Constructor\u003c?\u003e, java.lang.Object...)",
      "begin_line": 38,
      "end_line": 43,
      "comment": "",
      "child_ranges": [
        "(line 40,col 9)-(line 40,col 72)",
        "(line 41,col 9)-(line 41,col 48)",
        "(line 42,col 9)-(line 42,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.creation.instance.ConstructorInstantiator.paramsException(java.lang.Class\u003cT\u003e, java.lang.Exception)",
      "begin_line": 45,
      "end_line": 50,
      "comment": "",
      "child_ranges": [
        "(line 46,col 9)-(line 49,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.creation.instance.ConstructorInstantiator.paramsMatch(java.lang.Class\u003c?\u003e[], java.lang.Object[])",
      "begin_line": 52,
      "end_line": 62,
      "comment": "",
      "child_ranges": [
        "(line 53,col 9)-(line 55,col 9)",
        "(line 56,col 9)-(line 60,col 9)",
        "(line 61,col 9)-(line 61,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.creation.instance.ConstructorInstantiator.noArgConstructor(java.lang.Class\u003cT\u003e)",
      "begin_line": 64,
      "end_line": 73,
      "comment": "",
      "child_ranges": [
        "(line 65,col 9)-(line 72,col 9)"
      ]
    }
  ]
}