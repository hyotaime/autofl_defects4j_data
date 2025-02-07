{
  "filepath": "/tmp/Mockito-18b/test/org/mockito/internal/util/reflection/GenericMetadataSupportTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "GenericMetadataSupportTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 24,
      "end_line": 217,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "GenericsSelfReference",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 26,
      "end_line": 28,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.reflection.GenericMetadataSupportTest.GenericsSelfReference.self()",
      "begin_line": 27,
      "end_line": 27,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "class_interface",
      "name": "UpperBoundedTypeWithClass",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 29,
      "end_line": 31,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.reflection.GenericMetadataSupportTest.UpperBoundedTypeWithClass.get()",
      "begin_line": 30,
      "end_line": 30,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "class_interface",
      "name": "UpperBoundedTypeWithInterfaces",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 32,
      "end_line": 34,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.reflection.GenericMetadataSupportTest.UpperBoundedTypeWithInterfaces.get()",
      "begin_line": 33,
      "end_line": 33,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "class_interface",
      "name": "ListOfNumbers",
      "is_interface": true,
      "parent_types": [
        "java.util.List\u003cjava.lang.Number\u003e"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "ListOfAnyNumbers",
      "is_interface": true,
      "parent_types": [
        "java.util.List\u003cN\u003e"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "GenericsNest",
      "is_interface": true,
      "parent_types": [
        "java.util.Map\u003cK, java.util.Set\u003cjava.lang.Number\u003e\u003e"
      ],
      "begin_line": 38,
      "end_line": 47,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.reflection.GenericMetadataSupportTest.GenericsNest.remove(java.lang.Object)",
      "begin_line": 39,
      "end_line": 39,
      "comment": " override with fixed ParameterizedType",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.reflection.GenericMetadataSupportTest.GenericsNest.returning_wildcard_with_class_lower_bound()",
      "begin_line": 40,
      "end_line": 40,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.reflection.GenericMetadataSupportTest.GenericsNest.returning_wildcard_with_typeVar_lower_bound()",
      "begin_line": 41,
      "end_line": 41,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.reflection.GenericMetadataSupportTest.GenericsNest.returning_wildcard_with_typeVar_upper_bound()",
      "begin_line": 42,
      "end_line": 42,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.reflection.GenericMetadataSupportTest.GenericsNest.returningK()",
      "begin_line": 43,
      "end_line": 43,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.reflection.GenericMetadataSupportTest.GenericsNest.paramType_with_type_params()",
      "begin_line": 44,
      "end_line": 44,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.reflection.GenericMetadataSupportTest.GenericsNest.two_type_params()",
      "begin_line": 45,
      "end_line": 45,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.reflection.GenericMetadataSupportTest.GenericsNest.typeVar_with_type_params()",
      "begin_line": 46,
      "end_line": 46,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "class_interface",
      "name": "StringList",
      "is_interface": false,
      "parent_types": [
        "java.util.ArrayList\u003cjava.lang.String\u003e"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.reflection.GenericMetadataSupportTest.typeVariable_of_self_type()",
      "begin_line": 51,
      "end_line": 56,
      "comment": "",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 168)",
        "(line 55,col 9)-(line 55,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.reflection.GenericMetadataSupportTest.can_get_raw_type_from_Class()",
      "begin_line": 58,
      "end_line": 64,
      "comment": "",
      "child_ranges": [
        "(line 60,col 9)-(line 60,col 98)",
        "(line 61,col 9)-(line 61,col 92)",
        "(line 62,col 9)-(line 62,col 90)",
        "(line 63,col 9)-(line 63,col 86)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.reflection.GenericMetadataSupportTest.can_get_raw_type_from_ParameterizedType()",
      "begin_line": 66,
      "end_line": 72,
      "comment": "",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 112)",
        "(line 69,col 9)-(line 69,col 109)",
        "(line 70,col 9)-(line 70,col 107)",
        "(line 71,col 9)-(line 71,col 108)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.reflection.GenericMetadataSupportTest.can_get_type_variables_from_Class()",
      "begin_line": 74,
      "end_line": 82,
      "comment": "",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 125)",
        "(line 77,col 9)-(line 77,col 92)",
        "(line 78,col 9)-(line 78,col 129)",
        "(line 79,col 9)-(line 79,col 121)",
        "(line 80,col 9)-(line 80,col 91)",
        "(line 81,col 9)-(line 81,col 89)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.reflection.GenericMetadataSupportTest.can_get_type_variables_from_ParameterizedType()",
      "begin_line": 84,
      "end_line": 91,
      "comment": "",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 156)",
        "(line 87,col 9)-(line 87,col 155)",
        "(line 88,col 9)-(line 88,col 146)",
        "(line 89,col 9)-(line 89,col 118)",
        "(line 90,col 9)-(line 90,col 89)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.reflection.GenericMetadataSupportTest.typeVariable_return_type_of____iterator____resolved_to_Iterator_and_type_argument_to_String()",
      "begin_line": 93,
      "end_line": 99,
      "comment": "",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 150)",
        "(line 97,col 9)-(line 97,col 72)",
        "(line 98,col 9)-(line 98,col 90)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.reflection.GenericMetadataSupportTest.typeVariable_return_type_of____get____resolved_to_Set_and_type_argument_to_Number()",
      "begin_line": 101,
      "end_line": 107,
      "comment": "",
      "child_ranges": [
        "(line 103,col 9)-(line 103,col 149)",
        "(line 105,col 9)-(line 105,col 67)",
        "(line 106,col 9)-(line 106,col 90)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.reflection.GenericMetadataSupportTest.bounded_typeVariable_return_type_of____returningK____resolved_to_Comparable_and_with_BoundedType()",
      "begin_line": 109,
      "end_line": 116,
      "comment": "",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 156)",
        "(line 113,col 9)-(line 113,col 74)",
        "(line 114,col 9)-(line 114,col 102)",
        "(line 115,col 9)-(line 115,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.reflection.GenericMetadataSupportTest.fixed_ParamType_return_type_of____remove____resolved_to_Set_and_type_argument_to_Number()",
      "begin_line": 118,
      "end_line": 124,
      "comment": "",
      "child_ranges": [
        "(line 120,col 9)-(line 120,col 152)",
        "(line 122,col 9)-(line 122,col 67)",
        "(line 123,col 9)-(line 123,col 90)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.reflection.GenericMetadataSupportTest.paramType_return_type_of____values____resolved_to_Collection_and_type_argument_to_Parameterized_Set()",
      "begin_line": 126,
      "end_line": 134,
      "comment": "",
      "child_ranges": [
        "(line 128,col 9)-(line 128,col 152)",
        "(line 130,col 9)-(line 130,col 74)",
        "(line 131,col 9)-(line 131,col 124)",
        "(line 132,col 9)-(line 132,col 69)",
        "(line 133,col 9)-(line 133,col 92)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.reflection.GenericMetadataSupportTest.paramType_with_type_parameters_return_type_of____paramType_with_type_params____resolved_to_Collection_and_type_argument_to_Parameterized_Set()",
      "begin_line": 136,
      "end_line": 143,
      "comment": "",
      "child_ranges": [
        "(line 138,col 9)-(line 138,col 172)",
        "(line 140,col 9)-(line 140,col 68)",
        "(line 141,col 9)-(line 141,col 150)",
        "(line 142,col 9)-(line 142,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.reflection.GenericMetadataSupportTest.typeVariable_with_type_parameters_return_type_of____typeVar_with_type_params____resolved_K_hence_to_Comparable_and_with_BoundedType()",
      "begin_line": 145,
      "end_line": 152,
      "comment": "",
      "child_ranges": [
        "(line 147,col 9)-(line 147,col 170)",
        "(line 149,col 9)-(line 149,col 74)",
        "(line 150,col 9)-(line 150,col 102)",
        "(line 151,col 9)-(line 151,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.reflection.GenericMetadataSupportTest.class_return_type_of____append____resolved_to_StringBuilder_and_type_arguments()",
      "begin_line": 154,
      "end_line": 160,
      "comment": "",
      "child_ranges": [
        "(line 156,col 9)-(line 156,col 154)",
        "(line 158,col 9)-(line 158,col 77)",
        "(line 159,col 9)-(line 159,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.reflection.GenericMetadataSupportTest.paramType_with_wildcard_return_type_of____returning_wildcard_with_class_lower_bound____resolved_to_List_and_type_argument_to_Integer()",
      "begin_line": 164,
      "end_line": 172,
      "comment": "",
      "child_ranges": [
        "(line 166,col 9)-(line 166,col 187)",
        "(line 168,col 9)-(line 168,col 68)",
        "(line 169,col 9)-(line 169,col 156)",
        "(line 170,col 9)-(line 170,col 70)",
        "(line 171,col 9)-(line 171,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.reflection.GenericMetadataSupportTest.paramType_with_wildcard_return_type_of____returning_wildcard_with_typeVar_lower_bound____resolved_to_List_and_type_argument_to_Integer()",
      "begin_line": 174,
      "end_line": 182,
      "comment": "",
      "child_ranges": [
        "(line 176,col 9)-(line 176,col 189)",
        "(line 178,col 9)-(line 178,col 68)",
        "(line 179,col 9)-(line 179,col 156)",
        "(line 181,col 9)-(line 181,col 94)",
        "(line 182,col 9)-(line 182,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.reflection.GenericMetadataSupportTest.paramType_with_wildcard_return_type_of____returning_wildcard_with_typeVar_upper_bound____resolved_to_List_and_type_argument_to_Integer()",
      "begin_line": 184,
      "end_line": 193,
      "comment": "",
      "child_ranges": [
        "(line 186,col 9)-(line 186,col 189)",
        "(line 188,col 9)-(line 188,col 68)",
        "(line 189,col 9)-(line 189,col 156)",
        "(line 191,col 9)-(line 191,col 94)",
        "(line 192,col 9)-(line 192,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.reflection.GenericMetadataSupportTest.typeVariableValue(java.util.Map\u003cjava.lang.reflect.TypeVariable, java.lang.reflect.Type\u003e, java.lang.String)",
      "begin_line": 197,
      "end_line": 206,
      "comment": "",
      "child_ranges": [
        "(line 198,col 9)-(line 202,col 9)",
        "(line 204,col 9)-(line 204,col 77)",
        "(line 205,col 9)-(line 205,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.reflection.GenericMetadataSupportTest.firstNamedMethod(java.lang.String, java.lang.Class\u003c?\u003e)",
      "begin_line": 208,
      "end_line": 216,
      "comment": "",
      "child_ranges": [
        "(line 209,col 9)-(line 214,col 9)",
        "(line 215,col 9)-(line 215,col 125)"
      ]
    }
  ]
}