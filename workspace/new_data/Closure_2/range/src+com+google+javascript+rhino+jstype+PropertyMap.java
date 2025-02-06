{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/rhino/jstype/PropertyMap.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PropertyMap",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 57,
      "end_line": 205,
      "comment": "\n * Representation for a collection of properties on an object.\n * @author nicksantos@google.com (Nick Santos)\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "EMPTY_MAP"
      ],
      "begin_line": 60,
      "end_line": 61,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "PROP_MAP_FROM_TYPE"
      ],
      "begin_line": 63,
      "end_line": 68,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.PropertyMap.Anonymous-7b7618c0-8c64-408f-9eb9-917c1a907487.apply(com.google.javascript.rhino.jstype.ObjectType)",
      "begin_line": 65,
      "end_line": 67,
      "comment": "",
      "child_ranges": [
        "(line 66,col 7)-(line 66,col 32)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "parentSource"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": " just reference primary parents and secondary parents directly."
    },
    {
      "type": "field",
      "varNames": [
        "properties"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": " The map of our own properties."
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.rhino.jstype.PropertyMap.PropertyMap()",
      "begin_line": 79,
      "end_line": 81,
      "comment": "",
      "child_ranges": [
        "(line 80,col 5)-(line 80,col 46)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.rhino.jstype.PropertyMap.PropertyMap(java.util.Map\u003cjava.lang.String, com.google.javascript.rhino.jstype.Property\u003e)",
      "begin_line": 83,
      "end_line": 85,
      "comment": "",
      "child_ranges": [
        "(line 84,col 5)-(line 84,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.PropertyMap.immutableEmptyMap()",
      "begin_line": 87,
      "end_line": 89,
      "comment": "",
      "child_ranges": [
        "(line 88,col 5)-(line 88,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.PropertyMap.setParentSource(com.google.javascript.rhino.jstype.ObjectType)",
      "begin_line": 91,
      "end_line": 95,
      "comment": "",
      "child_ranges": [
        "(line 92,col 5)-(line 94,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.PropertyMap.getPrimaryParent()",
      "begin_line": 98,
      "end_line": 104,
      "comment": " Returns the direct parent of this property map. ",
      "child_ranges": [
        "(line 99,col 5)-(line 101,col 5)",
        "(line 102,col 5)-(line 102,col 60)",
        "(line 103,col 5)-(line 103,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.PropertyMap.getSecondaryParents()",
      "begin_line": 110,
      "end_line": 123,
      "comment": "\n   * Returns the secondary parents of this property map, for interfaces that\n   * need multiple inheritance.\n   ",
      "child_ranges": [
        "(line 111,col 5)-(line 113,col 5)",
        "(line 114,col 5)-(line 115,col 49)",
        "(line 118,col 5)-(line 120,col 5)",
        "(line 122,col 5)-(line 122,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.PropertyMap.getSlot(java.lang.String)",
      "begin_line": 125,
      "end_line": 145,
      "comment": "",
      "child_ranges": [
        "(line 126,col 5)-(line 128,col 5)",
        "(line 129,col 5)-(line 129,col 51)",
        "(line 130,col 5)-(line 135,col 5)",
        "(line 136,col 5)-(line 143,col 5)",
        "(line 144,col 5)-(line 144,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.PropertyMap.getOwnProperty(java.lang.String)",
      "begin_line": 147,
      "end_line": 149,
      "comment": "",
      "child_ranges": [
        "(line 148,col 5)-(line 148,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.PropertyMap.getPropertiesCount()",
      "begin_line": 151,
      "end_line": 159,
      "comment": "",
      "child_ranges": [
        "(line 152,col 5)-(line 152,col 51)",
        "(line 153,col 5)-(line 155,col 5)",
        "(line 156,col 5)-(line 156,col 42)",
        "(line 157,col 5)-(line 157,col 32)",
        "(line 158,col 5)-(line 158,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.PropertyMap.hasOwnProperty(java.lang.String)",
      "begin_line": 161,
      "end_line": 163,
      "comment": "",
      "child_ranges": [
        "(line 162,col 5)-(line 162,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.PropertyMap.hasProperty(java.lang.String)",
      "begin_line": 165,
      "end_line": 167,
      "comment": "",
      "child_ranges": [
        "(line 166,col 5)-(line 166,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.PropertyMap.getOwnPropertyNames()",
      "begin_line": 169,
      "end_line": 171,
      "comment": "",
      "child_ranges": [
        "(line 170,col 5)-(line 170,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.PropertyMap.collectPropertyNames(java.util.Set\u003cjava.lang.String\u003e)",
      "begin_line": 173,
      "end_line": 186,
      "comment": "",
      "child_ranges": [
        "(line 174,col 5)-(line 176,col 5)",
        "(line 177,col 5)-(line 177,col 51)",
        "(line 178,col 5)-(line 180,col 5)",
        "(line 181,col 5)-(line 185,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.PropertyMap.removeProperty(java.lang.String)",
      "begin_line": 188,
      "end_line": 190,
      "comment": "",
      "child_ranges": [
        "(line 189,col 5)-(line 189,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.PropertyMap.putProperty(java.lang.String, com.google.javascript.rhino.jstype.Property)",
      "begin_line": 192,
      "end_line": 200,
      "comment": "",
      "child_ranges": [
        "(line 193,col 5)-(line 193,col 44)",
        "(line 194,col 5)-(line 198,col 5)",
        "(line 199,col 5)-(line 199,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.PropertyMap.values()",
      "begin_line": 202,
      "end_line": 204,
      "comment": "",
      "child_ranges": [
        "(line 203,col 5)-(line 203,col 31)"
      ]
    }
  ]
}