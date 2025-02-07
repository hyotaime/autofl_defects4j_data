{
  "filepath": "/tmp/Mockito-18b/test/org/mockito/internal/util/reflection/FieldInitializerTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FieldInitializerTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 22,
      "end_line": 207,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "alreadyInstantiated"
      ],
      "begin_line": 24,
      "end_line": 24,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "noConstructor"
      ],
      "begin_line": 25,
      "end_line": 25,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "defaultConstructor"
      ],
      "begin_line": 26,
      "end_line": 26,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "privateDefaultConstructor"
      ],
      "begin_line": 27,
      "end_line": 27,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "noDefaultConstructor"
      ],
      "begin_line": 28,
      "end_line": 28,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "throwingExDefaultConstructor"
      ],
      "begin_line": 29,
      "end_line": 29,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "abstractType"
      ],
      "begin_line": 30,
      "end_line": 30,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "interfaceType"
      ],
      "begin_line": 31,
      "end_line": 31,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "innerClassType"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "instantiatedAbstractType"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "instantiatedInterfaceType"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "instantiatedInnerClassType"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.reflection.FieldInitializerTest.should_keep_same_instance_if_field_initialized()",
      "begin_line": 37,
      "end_line": 46,
      "comment": "",
      "child_ranges": [
        "(line 39,col 9)-(line 39,col 63)",
        "(line 40,col 9)-(line 40,col 101)",
        "(line 41,col 9)-(line 41,col 73)",
        "(line 43,col 9)-(line 43,col 59)",
        "(line 44,col 9)-(line 44,col 50)",
        "(line 45,col 9)-(line 45,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.reflection.FieldInitializerTest.should_instantiate_field_when_type_has_no_constructor()",
      "begin_line": 48,
      "end_line": 56,
      "comment": "",
      "child_ranges": [
        "(line 50,col 9)-(line 50,col 95)",
        "(line 51,col 9)-(line 51,col 73)",
        "(line 53,col 9)-(line 53,col 46)",
        "(line 54,col 9)-(line 54,col 49)",
        "(line 55,col 9)-(line 55,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.reflection.FieldInitializerTest.should_instantiate_field_with_default_constructor()",
      "begin_line": 58,
      "end_line": 66,
      "comment": "",
      "child_ranges": [
        "(line 60,col 9)-(line 60,col 100)",
        "(line 61,col 9)-(line 61,col 73)",
        "(line 63,col 9)-(line 63,col 46)",
        "(line 64,col 9)-(line 64,col 49)",
        "(line 65,col 9)-(line 65,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.reflection.FieldInitializerTest.should_instantiate_field_with_private_default_constructor()",
      "begin_line": 68,
      "end_line": 76,
      "comment": "",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 107)",
        "(line 71,col 9)-(line 71,col 73)",
        "(line 73,col 9)-(line 73,col 46)",
        "(line 74,col 9)-(line 74,col 49)",
        "(line 75,col 9)-(line 75,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.reflection.FieldInitializerTest.should_fail_to_instantiate_field_if_no_default_constructor()",
      "begin_line": 78,
      "end_line": 82,
      "comment": "",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 102)",
        "(line 81,col 9)-(line 81,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.reflection.FieldInitializerTest.should_fail_to_instantiate_field_if_default_constructor_throws_exception()",
      "begin_line": 84,
      "end_line": 95,
      "comment": "",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 110)",
        "(line 87,col 9)-(line 94,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.reflection.FieldInitializerTest.should_fail_for_abstract_field()",
      "begin_line": 97,
      "end_line": 100,
      "comment": "",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.reflection.FieldInitializerTest.should_not_fail_if_abstract_field_is_instantiated()",
      "begin_line": 102,
      "end_line": 105,
      "comment": "",
      "child_ranges": [
        "(line 104,col 9)-(line 104,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.reflection.FieldInitializerTest.should_fail_for_interface_field()",
      "begin_line": 107,
      "end_line": 110,
      "comment": "",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.reflection.FieldInitializerTest.should_not_fail_if_interface_field_is_instantiated()",
      "begin_line": 112,
      "end_line": 115,
      "comment": "",
      "child_ranges": [
        "(line 114,col 9)-(line 114,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.reflection.FieldInitializerTest.should_fail_for_local_type_field()",
      "begin_line": 117,
      "end_line": 130,
      "comment": "",
      "child_ranges": [
        "(line 120,col 9)-(line 120,col 27)",
        "(line 122,col 9)-(line 124,col 9)",
        "(line 126,col 9)-(line 126,col 76)",
        "(line 129,col 9)-(line 129,col 104)"
      ]
    },
    {
      "type": "class_interface",
      "name": "LocalType",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 120,
      "end_line": 120,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "TheTestWithLocalType",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 122,
      "end_line": 124,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "field"
      ],
      "begin_line": 123,
      "end_line": 123,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.reflection.FieldInitializerTest.should_not_fail_if_local_type_field_is_instantiated()",
      "begin_line": 132,
      "end_line": 145,
      "comment": "",
      "child_ranges": [
        "(line 135,col 9)-(line 135,col 27)",
        "(line 137,col 9)-(line 139,col 9)",
        "(line 141,col 9)-(line 141,col 76)",
        "(line 144,col 9)-(line 144,col 104)"
      ]
    },
    {
      "type": "class_interface",
      "name": "LocalType",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 135,
      "end_line": 135,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "TheTestWithLocalType",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 137,
      "end_line": 139,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "field"
      ],
      "begin_line": 138,
      "end_line": 138,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.reflection.FieldInitializerTest.should_fail_for_inner_class_field()",
      "begin_line": 147,
      "end_line": 150,
      "comment": "",
      "child_ranges": [
        "(line 149,col 9)-(line 149,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.reflection.FieldInitializerTest.should_not_fail_if_inner_class_field_is_instantiated()",
      "begin_line": 152,
      "end_line": 155,
      "comment": "",
      "child_ranges": [
        "(line 154,col 9)-(line 154,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.reflection.FieldInitializerTest.can_instantiate_class_with_parameterized_constructor()",
      "begin_line": 157,
      "end_line": 165,
      "comment": "",
      "child_ranges": [
        "(line 159,col 9)-(line 160,col 66)",
        "(line 162,col 9)-(line 162,col 89)",
        "(line 164,col 9)-(line 164,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.reflection.FieldInitializerTest.field(java.lang.String)",
      "begin_line": 167,
      "end_line": 169,
      "comment": "",
      "child_ranges": [
        "(line 168,col 9)-(line 168,col 59)"
      ]
    },
    {
      "type": "class_interface",
      "name": "StaticClass",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 171,
      "end_line": 172,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "StaticClassWithDefaultConstructor",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 174,
      "end_line": 176,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.mockito.internal.util.reflection.FieldInitializerTest.StaticClassWithDefaultConstructor.StaticClassWithDefaultConstructor()",
      "begin_line": 175,
      "end_line": 175,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "class_interface",
      "name": "StaticClassWithPrivateDefaultConstructor",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 178,
      "end_line": 180,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.mockito.internal.util.reflection.FieldInitializerTest.StaticClassWithPrivateDefaultConstructor.StaticClassWithPrivateDefaultConstructor()",
      "begin_line": 179,
      "end_line": 179,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "class_interface",
      "name": "StaticClassWithoutDefaultConstructor",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 182,
      "end_line": 184,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.mockito.internal.util.reflection.FieldInitializerTest.StaticClassWithoutDefaultConstructor.StaticClassWithoutDefaultConstructor(java.lang.String)",
      "begin_line": 183,
      "end_line": 183,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "class_interface",
      "name": "StaticClassThrowingExceptionDefaultConstructor",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 186,
      "end_line": 190,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.mockito.internal.util.reflection.FieldInitializerTest.StaticClassThrowingExceptionDefaultConstructor.StaticClassThrowingExceptionDefaultConstructor()",
      "begin_line": 187,
      "end_line": 189,
      "comment": "",
      "child_ranges": [
        "(line 188,col 13)-(line 188,col 68)"
      ]
    },
    {
      "type": "class_interface",
      "name": "AbstractStaticClass",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 192,
      "end_line": 194,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.mockito.internal.util.reflection.FieldInitializerTest.AbstractStaticClass.AbstractStaticClass()",
      "begin_line": 193,
      "end_line": 193,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "class_interface",
      "name": "Interface",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 196,
      "end_line": 198,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "ConcreteStaticClass",
      "is_interface": false,
      "parent_types": [
        "org.mockito.internal.util.reflection.FieldInitializerTest.AbstractStaticClass",
        "org.mockito.internal.util.reflection.FieldInitializerTest.Interface"
      ],
      "begin_line": 200,
      "end_line": 201,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "InnerClassType",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 203,
      "end_line": 205,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.mockito.internal.util.reflection.FieldInitializerTest.InnerClassType.InnerClassType()",
      "begin_line": 204,
      "end_line": 204,
      "comment": "",
      "child_ranges": []
    }
  ]
}