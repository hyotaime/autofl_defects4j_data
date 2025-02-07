{
  "filepath": "/tmp/Mockito-18b/test/org/mockitousage/matchers/CapturingArgumentsTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CapturingArgumentsTest",
      "is_interface": false,
      "parent_types": [
        "TestBase"
      ],
      "begin_line": 24,
      "end_line": 309,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mock"
      ],
      "begin_line": 26,
      "end_line": 26,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "Person",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 28,
      "end_line": 39,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "age"
      ],
      "begin_line": 30,
      "end_line": 30,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.mockitousage.matchers.CapturingArgumentsTest.Person.Person(java.lang.Integer)",
      "begin_line": 32,
      "end_line": 34,
      "comment": "",
      "child_ranges": [
        "(line 33,col 13)-(line 33,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.matchers.CapturingArgumentsTest.Person.getAge()",
      "begin_line": 36,
      "end_line": 38,
      "comment": "",
      "child_ranges": [
        "(line 37,col 13)-(line 37,col 23)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Emailer",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 41,
      "end_line": 55,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "service"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.mockitousage.matchers.CapturingArgumentsTest.Emailer.Emailer(org.mockitousage.matchers.CapturingArgumentsTest.EmailService)",
      "begin_line": 45,
      "end_line": 47,
      "comment": "",
      "child_ranges": [
        "(line 46,col 13)-(line 46,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.matchers.CapturingArgumentsTest.Emailer.email(java.lang.Integer...)",
      "begin_line": 49,
      "end_line": 54,
      "comment": "",
      "child_ranges": [
        "(line 50,col 13)-(line 53,col 13)"
      ]
    },
    {
      "type": "class_interface",
      "name": "EmailService",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 57,
      "end_line": 59,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockitousage.matchers.CapturingArgumentsTest.EmailService.sendEmailTo(org.mockitousage.matchers.CapturingArgumentsTest.Person)",
      "begin_line": 58,
      "end_line": 58,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "field",
      "varNames": [
        "emailService"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "emailer"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockitousage.matchers.CapturingArgumentsTest.should_allow_assertions_on_captured_argument()",
      "begin_line": 64,
      "end_line": 75,
      "comment": "",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 26)",
        "(line 71,col 9)-(line 71,col 71)",
        "(line 72,col 9)-(line 72,col 61)",
        "(line 74,col 9)-(line 74,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.matchers.CapturingArgumentsTest.should_allow_assertions_on_all_captured_arguments()",
      "begin_line": 77,
      "end_line": 89,
      "comment": "",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 30)",
        "(line 83,col 9)-(line 83,col 80)",
        "(line 84,col 9)-(line 84,col 76)",
        "(line 85,col 9)-(line 85,col 57)",
        "(line 87,col 9)-(line 87,col 52)",
        "(line 88,col 9)-(line 88,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.matchers.CapturingArgumentsTest.should_allow_assertions_on_last_argument()",
      "begin_line": 91,
      "end_line": 101,
      "comment": "",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 34)",
        "(line 97,col 9)-(line 97,col 80)",
        "(line 98,col 9)-(line 98,col 76)",
        "(line 100,col 9)-(line 100,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.matchers.CapturingArgumentsTest.should_print_captor_matcher()",
      "begin_line": 103,
      "end_line": 116,
      "comment": "",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 78)",
        "(line 108,col 9)-(line 115,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.matchers.CapturingArgumentsTest.should_allow_assertions_on_captured_null()",
      "begin_line": 118,
      "end_line": 127,
      "comment": "",
      "child_ranges": [
        "(line 121,col 9)-(line 121,col 39)",
        "(line 124,col 9)-(line 124,col 80)",
        "(line 125,col 9)-(line 125,col 61)",
        "(line 126,col 9)-(line 126,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.matchers.CapturingArgumentsTest.should_allow_construction_of_captor_for_parameterized_type_in_a_convenient_way()",
      "begin_line": 129,
      "end_line": 133,
      "comment": "",
      "child_ranges": [
        "(line 132,col 9)-(line 132,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.matchers.CapturingArgumentsTest.should_allow_construction_of_captor_for_a_more_specific_type()",
      "begin_line": 135,
      "end_line": 139,
      "comment": "",
      "child_ranges": [
        "(line 138,col 9)-(line 138,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.matchers.CapturingArgumentsTest.should_allow_capturing_for_stubbing()",
      "begin_line": 141,
      "end_line": 152,
      "comment": "",
      "child_ranges": [
        "(line 144,col 9)-(line 144,col 80)",
        "(line 145,col 9)-(line 145,col 77)",
        "(line 148,col 9)-(line 148,col 49)",
        "(line 151,col 9)-(line 151,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.matchers.CapturingArgumentsTest.should_capture_when_stubbing_only_when_entire_invocation_matches()",
      "begin_line": 154,
      "end_line": 166,
      "comment": "",
      "child_ranges": [
        "(line 157,col 9)-(line 157,col 80)",
        "(line 158,col 9)-(line 158,col 78)",
        "(line 161,col 9)-(line 161,col 38)",
        "(line 162,col 9)-(line 162,col 36)",
        "(line 165,col 9)-(line 165,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.matchers.CapturingArgumentsTest.should_say_something_smart_when_misused()",
      "begin_line": 168,
      "end_line": 175,
      "comment": "",
      "child_ranges": [
        "(line 170,col 9)-(line 170,col 80)",
        "(line 171,col 9)-(line 174,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.matchers.CapturingArgumentsTest.should_capture_when_full_arg_list_matches()",
      "begin_line": 177,
      "end_line": 190,
      "comment": "",
      "child_ranges": [
        "(line 180,col 9)-(line 180,col 36)",
        "(line 181,col 9)-(line 181,col 36)",
        "(line 184,col 9)-(line 184,col 78)",
        "(line 185,col 9)-(line 185,col 59)",
        "(line 188,col 9)-(line 188,col 54)",
        "(line 189,col 9)-(line 189,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.matchers.CapturingArgumentsTest.should_capture_int_by_creating_captor_with_primitive_wrapper()",
      "begin_line": 192,
      "end_line": 204,
      "comment": "",
      "child_ranges": [
        "(line 195,col 9)-(line 195,col 45)",
        "(line 196,col 9)-(line 196,col 82)",
        "(line 199,col 9)-(line 199,col 35)",
        "(line 202,col 9)-(line 202,col 59)",
        "(line 203,col 9)-(line 203,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.matchers.CapturingArgumentsTest.should_capture_int_by_creating_captor_with_primitive()",
      "begin_line": 206,
      "end_line": 218,
      "comment": "",
      "child_ranges": [
        "(line 209,col 9)-(line 209,col 45)",
        "(line 210,col 9)-(line 210,col 78)",
        "(line 213,col 9)-(line 213,col 35)",
        "(line 216,col 9)-(line 216,col 59)",
        "(line 217,col 9)-(line 217,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.matchers.CapturingArgumentsTest.should_capture_byte_vararg_by_creating_captor_with_primitive()",
      "begin_line": 220,
      "end_line": 233,
      "comment": "",
      "child_ranges": [
        "(line 223,col 9)-(line 223,col 45)",
        "(line 224,col 9)-(line 224,col 82)",
        "(line 227,col 9)-(line 227,col 45)",
        "(line 230,col 9)-(line 230,col 59)",
        "(line 231,col 9)-(line 231,col 65)",
        "(line 232,col 9)-(line 232,col 97)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.matchers.CapturingArgumentsTest.should_capture_byte_vararg_by_creating_captor_with_primitive_wrapper()",
      "begin_line": 235,
      "end_line": 248,
      "comment": "",
      "child_ranges": [
        "(line 238,col 9)-(line 238,col 45)",
        "(line 239,col 9)-(line 239,col 82)",
        "(line 242,col 9)-(line 242,col 45)",
        "(line 245,col 9)-(line 245,col 59)",
        "(line 246,col 9)-(line 246,col 65)",
        "(line 247,col 9)-(line 247,col 97)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.matchers.CapturingArgumentsTest.should_capture_vararg()",
      "begin_line": 250,
      "end_line": 262,
      "comment": "",
      "child_ranges": [
        "(line 253,col 9)-(line 253,col 45)",
        "(line 254,col 9)-(line 254,col 86)",
        "(line 257,col 9)-(line 257,col 45)",
        "(line 260,col 9)-(line 260,col 67)",
        "(line 261,col 9)-(line 261,col 92)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.matchers.CapturingArgumentsTest.should_capture_all_vararg()",
      "begin_line": 264,
      "end_line": 279,
      "comment": "",
      "child_ranges": [
        "(line 267,col 9)-(line 267,col 45)",
        "(line 268,col 9)-(line 268,col 86)",
        "(line 271,col 9)-(line 271,col 45)",
        "(line 272,col 9)-(line 272,col 42)",
        "(line 275,col 9)-(line 275,col 77)",
        "(line 277,col 9)-(line 277,col 70)",
        "(line 278,col 9)-(line 278,col 91)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.matchers.CapturingArgumentsTest.should_capture_one_arg_even_when_using_vararg_captor_on_nonvararg_method()",
      "begin_line": 281,
      "end_line": 293,
      "comment": "",
      "child_ranges": [
        "(line 284,col 9)-(line 284,col 45)",
        "(line 285,col 9)-(line 285,col 86)",
        "(line 288,col 9)-(line 288,col 34)",
        "(line 291,col 9)-(line 291,col 67)",
        "(line 292,col 9)-(line 292,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.matchers.CapturingArgumentsTest.captures_correclty_when_captor_used_multiple_times()",
      "begin_line": 295,
      "end_line": 308,
      "comment": "",
      "child_ranges": [
        "(line 298,col 9)-(line 298,col 45)",
        "(line 299,col 9)-(line 299,col 86)",
        "(line 302,col 9)-(line 302,col 45)",
        "(line 306,col 9)-(line 306,col 119)",
        "(line 307,col 9)-(line 307,col 92)"
      ]
    }
  ]
}