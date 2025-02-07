{
  "filepath": "/tmp/Mockito-18b/test/org/mockitoutil/ClassLoadersTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ClassLoadersTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 13,
      "end_line": 224,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CLASS_NAME_USING_INTERFACE"
      ],
      "begin_line": 15,
      "end_line": 15,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "INTERFACE_NAME"
      ],
      "begin_line": 16,
      "end_line": 16,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockitoutil.ClassLoadersTest.isolated_class_loader_cannot_load_classes_when_no_given_prefix()",
      "begin_line": 18,
      "end_line": 27,
      "comment": "",
      "child_ranges": [
        "(line 21,col 9)-(line 21,col 55)",
        "(line 24,col 9)-(line 24,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitoutil.ClassLoadersTest.isolated_class_loader_cannot_load_classes_if_no_code_source_path()",
      "begin_line": 29,
      "end_line": 44,
      "comment": "",
      "child_ranges": [
        "(line 32,col 9)-(line 34,col 25)",
        "(line 37,col 9)-(line 43,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitoutil.ClassLoadersTest.isolated_class_loader_cannot_load_classes_not_matching_the_prefix()",
      "begin_line": 46,
      "end_line": 62,
      "comment": "",
      "child_ranges": [
        "(line 49,col 9)-(line 52,col 25)",
        "(line 55,col 9)-(line 61,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitoutil.ClassLoadersTest.isolated_class_loader_can_load_all_classes_unless_all_classes_mathch_the_prefixes()",
      "begin_line": 64,
      "end_line": 80,
      "comment": "",
      "child_ranges": [
        "(line 67,col 9)-(line 71,col 25)",
        "(line 74,col 9)-(line 74,col 67)",
        "(line 77,col 9)-(line 77,col 39)",
        "(line 78,col 9)-(line 78,col 58)",
        "(line 79,col 9)-(line 79,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitoutil.ClassLoadersTest.isolated_class_loader_has_no_parent()",
      "begin_line": 82,
      "end_line": 91,
      "comment": "",
      "child_ranges": [
        "(line 84,col 9)-(line 88,col 25)",
        "(line 90,col 9)-(line 90,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitoutil.ClassLoadersTest.excluding_class_loader_cannot_load_classes_when_no_correct_source_url_set()",
      "begin_line": 93,
      "end_line": 104,
      "comment": "",
      "child_ranges": [
        "(line 96,col 9)-(line 98,col 25)",
        "(line 101,col 9)-(line 101,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitoutil.ClassLoadersTest.excluding_class_loader_can_load_classes_when_correct_source_url_set()",
      "begin_line": 106,
      "end_line": 117,
      "comment": "",
      "child_ranges": [
        "(line 109,col 9)-(line 111,col 25)",
        "(line 114,col 9)-(line 114,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitoutil.ClassLoadersTest.excluding_class_loader_cannot_load_class_when_excluded_prefix_match_class_to_load()",
      "begin_line": 119,
      "end_line": 138,
      "comment": "",
      "child_ranges": [
        "(line 122,col 9)-(line 125,col 25)",
        "(line 127,col 9)-(line 127,col 44)",
        "(line 130,col 9)-(line 135,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitoutil.ClassLoadersTest.can_not_load_a_class_not_previously_registered_in_builder()",
      "begin_line": 140,
      "end_line": 156,
      "comment": "",
      "child_ranges": [
        "(line 143,col 9)-(line 146,col 25)",
        "(line 149,col 9)-(line 155,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitoutil.ClassLoadersTest.can_load_a_class_in_memory_from_bytes()",
      "begin_line": 158,
      "end_line": 173,
      "comment": "",
      "child_ranges": [
        "(line 161,col 9)-(line 164,col 25)",
        "(line 167,col 9)-(line 167,col 51)",
        "(line 170,col 9)-(line 170,col 39)",
        "(line 171,col 9)-(line 171,col 58)",
        "(line 172,col 9)-(line 172,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitoutil.ClassLoadersTest.cannot_load_a_class_file_not_in_parent()",
      "begin_line": 175,
      "end_line": 193,
      "comment": "",
      "child_ranges": [
        "(line 178,col 9)-(line 181,col 25)",
        "(line 183,col 9)-(line 183,col 41)",
        "(line 185,col 9)-(line 192,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitoutil.ClassLoadersTest.can_list_all_classes_reachable_in_a_classloader()",
      "begin_line": 195,
      "end_line": 207,
      "comment": "",
      "child_ranges": [
        "(line 197,col 9)-(line 203,col 25)",
        "(line 205,col 9)-(line 205,col 104)",
        "(line 206,col 9)-(line 206,col 103)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitoutil.ClassLoadersTest.return_bootstrap_classloader()",
      "begin_line": 209,
      "end_line": 215,
      "comment": "",
      "child_ranges": [
        "(line 211,col 9)-(line 211,col 82)",
        "(line 212,col 9)-(line 212,col 87)",
        "(line 213,col 9)-(line 213,col 78)",
        "(line 214,col 9)-(line 214,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitoutil.ClassLoadersTest.return_current_classloader()",
      "begin_line": 217,
      "end_line": 220,
      "comment": "",
      "child_ranges": [
        "(line 219,col 9)-(line 219,col 85)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ClassUsingInterface1",
      "is_interface": false,
      "parent_types": [
        "org.mockitoutil.ClassLoadersTest.Interface1"
      ],
      "begin_line": 222,
      "end_line": 222,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "Interface1",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 223,
      "end_line": 223,
      "comment": ""
    }
  ]
}