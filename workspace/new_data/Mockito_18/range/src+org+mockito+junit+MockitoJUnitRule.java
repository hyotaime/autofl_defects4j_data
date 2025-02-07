{
  "filepath": "/tmp/Mockito-18b/src/org/mockito/junit/MockitoJUnitRule.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MockitoJUnitRule",
      "is_interface": false,
      "parent_types": [
        "org.junit.rules.MethodRule",
        "org.mockito.junit.MockitoRule"
      ],
      "begin_line": 16,
      "end_line": 42,
      "comment": "\n * Please use {@link MockitoJUnit#rule()} instead of direct use.\n * The reason of the deprecation is that we want to avoid concrete classes in the public api.\n *\n * @see MockitoJUnit\n * @since 1.10.6\n "
    },
    {
      "type": "field",
      "varNames": [
        "jUnitRule"
      ],
      "begin_line": 19,
      "end_line": 19,
      "comment": "MethodRule is undeprecated in latest JUnit"
    },
    {
      "type": "constructor",
      "signature": "org.mockito.junit.MockitoJUnitRule.MockitoJUnitRule()",
      "begin_line": 25,
      "end_line": 28,
      "comment": "\n     * Please use {@link MockitoJUnit#rule()}.\n     * The reason of the deprecation is that we want to avoid concrete classes in the public api.\n     ",
      "child_ranges": [
        "(line 27,col 9)-(line 27,col 41)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.mockito.junit.MockitoJUnitRule.MockitoJUnitRule(java.lang.Object)",
      "begin_line": 34,
      "end_line": 37,
      "comment": "\n     * Please use {@link MockitoJUnit#rule()}.\n     * The reason of the deprecation is that we want to avoid concrete classes in the public api.\n     ",
      "child_ranges": [
        "(line 36,col 9)-(line 36,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.junit.MockitoJUnitRule.apply(org.junit.runners.model.Statement, org.junit.runners.model.FrameworkMethod, java.lang.Object)",
      "begin_line": 39,
      "end_line": 41,
      "comment": "",
      "child_ranges": [
        "(line 40,col 9)-(line 40,col 45)"
      ]
    }
  ]
}