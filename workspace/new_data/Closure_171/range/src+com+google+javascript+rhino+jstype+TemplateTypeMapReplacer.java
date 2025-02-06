{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/rhino/jstype/TemplateTypeMapReplacer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TemplateTypeMapReplacer",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.rhino.jstype.ModificationVisitor"
      ],
      "begin_line": 56,
      "end_line": 101,
      "comment": "\n * Uses a TemplateTypeMap to replace TemplateTypes with their associated JSType\n * values.\n *\n * @author izaakr@google.com (Izaak Rubin)\n "
    },
    {
      "type": "field",
      "varNames": [
        "replacements"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "visitedTypes"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.rhino.jstype.TemplateTypeMapReplacer.TemplateTypeMapReplacer(com.google.javascript.rhino.jstype.JSTypeRegistry, com.google.javascript.rhino.jstype.TemplateTypeMap)",
      "begin_line": 60,
      "end_line": 65,
      "comment": "",
      "child_ranges": [
        "(line 62,col 5)-(line 62,col 20)",
        "(line 63,col 5)-(line 63,col 37)",
        "(line 64,col 5)-(line 64,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.TemplateTypeMapReplacer.caseTemplateType(com.google.javascript.rhino.jstype.TemplateType)",
      "begin_line": 67,
      "end_line": 87,
      "comment": "",
      "child_ranges": [
        "(line 69,col 5)-(line 86,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.TemplateTypeMapReplacer.hasVisitedType(com.google.javascript.rhino.jstype.TemplateType)",
      "begin_line": 93,
      "end_line": 100,
      "comment": "\n   * Checks if the specified type has already been visited during the Visitor\u0027s\n   * traversal of a JSType.\n   ",
      "child_ranges": [
        "(line 94,col 5)-(line 98,col 5)",
        "(line 99,col 5)-(line 99,col 17)"
      ]
    }
  ]
}