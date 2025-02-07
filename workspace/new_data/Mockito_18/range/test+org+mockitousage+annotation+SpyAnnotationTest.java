{
  "filepath": "/tmp/Mockito-18b/test/org/mockitousage/annotation/SpyAnnotationTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SpyAnnotationTest",
      "is_interface": false,
      "parent_types": [
        "TestBase"
      ],
      "begin_line": 26,
      "end_line": 193,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "spiedList"
      ],
      "begin_line": 29,
      "end_line": 29,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "staticTypeWithNoArgConstructor"
      ],
      "begin_line": 31,
      "end_line": 31,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "staticTypeWithoutDefinedConstructor"
      ],
      "begin_line": 33,
      "end_line": 34,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "shouldThrow"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockitousage.annotation.SpyAnnotationTest.should_init_spy_by_instance()",
      "begin_line": 38,
      "end_line": 43,
      "comment": "",
      "child_ranges": [
        "(line 40,col 9)-(line 40,col 48)",
        "(line 41,col 9)-(line 41,col 47)",
        "(line 42,col 9)-(line 42,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.annotation.SpyAnnotationTest.should_init_spy_and_automatically_create_instance()",
      "begin_line": 45,
      "end_line": 51,
      "comment": "",
      "child_ranges": [
        "(line 47,col 9)-(line 47,col 72)",
        "(line 48,col 9)-(line 48,col 77)",
        "(line 49,col 9)-(line 49,col 69)",
        "(line 50,col 9)-(line 50,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.annotation.SpyAnnotationTest.should_prevent_spying_on_interfaces()",
      "begin_line": 53,
      "end_line": 66,
      "comment": "",
      "child_ranges": [
        "(line 55,col 9)-(line 57,col 9)",
        "(line 59,col 9)-(line 59,col 40)",
        "(line 60,col 9)-(line 65,col 9)"
      ]
    },
    {
      "type": "class_interface",
      "name": "WithSpy",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 55,
      "end_line": 57,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "list"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockitousage.annotation.SpyAnnotationTest.should_allow_spying_on_interfaces_when_instance_is_concrete()",
      "begin_line": 68,
      "end_line": 80,
      "comment": "",
      "child_ranges": [
        "(line 70,col 9)-(line 72,col 9)",
        "(line 74,col 9)-(line 74,col 40)",
        "(line 76,col 9)-(line 76,col 46)",
        "(line 79,col 9)-(line 79,col 46)"
      ]
    },
    {
      "type": "class_interface",
      "name": "WithSpy",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 70,
      "end_line": 72,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "list"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockitousage.annotation.SpyAnnotationTest.should_report_when_no_arg_less_constructor()",
      "begin_line": 82,
      "end_line": 95,
      "comment": "",
      "child_ranges": [
        "(line 84,col 9)-(line 87,col 9)",
        "(line 89,col 9)-(line 94,col 9)"
      ]
    },
    {
      "type": "class_interface",
      "name": "FailingSpy",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 84,
      "end_line": 87,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "noValidConstructor"
      ],
      "begin_line": 85,
      "end_line": 86,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockitousage.annotation.SpyAnnotationTest.should_report_when_constructor_is_explosive()",
      "begin_line": 97,
      "end_line": 110,
      "comment": "",
      "child_ranges": [
        "(line 99,col 9)-(line 102,col 9)",
        "(line 104,col 9)-(line 109,col 9)"
      ]
    },
    {
      "type": "class_interface",
      "name": "FailingSpy",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 99,
      "end_line": 102,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "throwingConstructor"
      ],
      "begin_line": 100,
      "end_line": 101,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockitousage.annotation.SpyAnnotationTest.should_spy_abstract_class()",
      "begin_line": 112,
      "end_line": 126,
      "comment": "",
      "child_ranges": [
        "(line 114,col 9)-(line 122,col 9)",
        "(line 123,col 9)-(line 123,col 58)",
        "(line 124,col 9)-(line 124,col 46)",
        "(line 125,col 9)-(line 125,col 71)"
      ]
    },
    {
      "type": "class_interface",
      "name": "SpyAbstractClass",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 114,
      "end_line": 122,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "list"
      ],
      "begin_line": 115,
      "end_line": 115,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockitousage.annotation.SpyAnnotationTest.SpyAbstractClass.asSingletonList(java.lang.String)",
      "begin_line": 117,
      "end_line": 121,
      "comment": "",
      "child_ranges": [
        "(line 118,col 17)-(line 118,col 48)",
        "(line 119,col 17)-(line 119,col 48)",
        "(line 120,col 17)-(line 120,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.annotation.SpyAnnotationTest.should_spy_inner_class()",
      "begin_line": 128,
      "end_line": 156,
      "comment": "",
      "child_ranges": [
        "(line 131,col 6)-(line 151,col 9)",
        "(line 152,col 9)-(line 152,col 52)",
        "(line 153,col 9)-(line 153,col 44)",
        "(line 154,col 9)-(line 154,col 63)",
        "(line 155,col 9)-(line 155,col 70)"
      ]
    },
    {
      "type": "class_interface",
      "name": "WithMockAndSpy",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 131,
      "end_line": 151,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "strength"
      ],
      "begin_line": 132,
      "end_line": 132,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "list"
      ],
      "begin_line": 133,
      "end_line": 133,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "InnerStrength",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 135,
      "end_line": 150,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 136,
      "end_line": 136,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.mockitousage.annotation.SpyAnnotationTest.WithMockAndSpy.InnerStrength.InnerStrength()",
      "begin_line": 138,
      "end_line": 143,
      "comment": "",
      "child_ranges": [
        "(line 140,col 21)-(line 140,col 40)",
        "(line 142,col 21)-(line 142,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.annotation.SpyAnnotationTest.WithMockAndSpy.InnerStrength.strength()",
      "begin_line": 145,
      "end_line": 145,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.mockitousage.annotation.SpyAnnotationTest.WithMockAndSpy.InnerStrength.fullStrength()",
      "begin_line": 147,
      "end_line": 149,
      "comment": "",
      "child_ranges": [
        "(line 148,col 21)-(line 148,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.annotation.SpyAnnotationTest.should_reset_spy()",
      "begin_line": 158,
      "end_line": 161,
      "comment": "",
      "child_ranges": [
        "(line 160,col 9)-(line 160,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.annotation.SpyAnnotationTest.should_report_when_encosing_instance_is_needed()",
      "begin_line": 163,
      "end_line": 177,
      "comment": "",
      "child_ranges": [
        "(line 165,col 9)-(line 167,col 9)",
        "(line 168,col 9)-(line 170,col 9)",
        "(line 171,col 9)-(line 176,col 9)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Outer",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 165,
      "end_line": 167,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "Inner",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 166,
      "end_line": 166,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "WithSpy",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 168,
      "end_line": 170,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "inner"
      ],
      "begin_line": 169,
      "end_line": 169,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "NestedClassWithoutDefinedConstructor",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 179,
      "end_line": 179,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "NestedClassWithNoArgConstructor",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 181,
      "end_line": 184,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.mockitousage.annotation.SpyAnnotationTest.NestedClassWithNoArgConstructor.NestedClassWithNoArgConstructor()",
      "begin_line": 182,
      "end_line": 182,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "constructor",
      "signature": "org.mockitousage.annotation.SpyAnnotationTest.NestedClassWithNoArgConstructor.NestedClassWithNoArgConstructor(java.lang.String)",
      "begin_line": 183,
      "end_line": 183,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "class_interface",
      "name": "NoValidConstructor",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 186,
      "end_line": 188,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.mockitousage.annotation.SpyAnnotationTest.NoValidConstructor.NoValidConstructor(java.lang.String)",
      "begin_line": 187,
      "end_line": 187,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "class_interface",
      "name": "ThrowingConstructor",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 190,
      "end_line": 192,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.mockitousage.annotation.SpyAnnotationTest.ThrowingConstructor.ThrowingConstructor()",
      "begin_line": 191,
      "end_line": 191,
      "comment": "",
      "child_ranges": [
        "(line 191,col 33)-(line 191,col 67)"
      ]
    }
  ]
}