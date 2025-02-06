{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/rhino/jstype/NoResolvedType.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NoResolvedType",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.rhino.jstype.NoType"
      ],
      "begin_line": 55,
      "end_line": 85,
      "comment": "\n * An unresolved type that was forward declared. So we know it exists,\n * but that it wasn\u0027t pulled into this binary.\n *\n * In most cases, it behaves like a bottom type in the type lattice:\n * no real type should be assigned to a NoResolvedType, but the\n * NoResolvedType is a subtype of everything. In a few cases, it behaves\n * like the unknown type: properties of this type are also NoResolved types,\n * and comparisons to other types always have an unknown result.\n *\n * @author nicksantos@google.com (Nick Santos)\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.rhino.jstype.NoResolvedType.NoResolvedType(com.google.javascript.rhino.jstype.JSTypeRegistry)",
      "begin_line": 58,
      "end_line": 60,
      "comment": "",
      "child_ranges": [
        "(line 59,col 5)-(line 59,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.NoResolvedType.isNoResolvedType()",
      "begin_line": 62,
      "end_line": 65,
      "comment": "",
      "child_ranges": [
        "(line 64,col 5)-(line 64,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.NoResolvedType.isNoType()",
      "begin_line": 67,
      "end_line": 70,
      "comment": "",
      "child_ranges": [
        "(line 69,col 5)-(line 69,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.NoResolvedType.isSubtype(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 72,
      "end_line": 79,
      "comment": "",
      "child_ranges": [
        "(line 74,col 5)-(line 78,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.NoResolvedType.toStringHelper(boolean)",
      "begin_line": 81,
      "end_line": 84,
      "comment": "",
      "child_ranges": [
        "(line 83,col 5)-(line 83,col 51)"
      ]
    }
  ]
}