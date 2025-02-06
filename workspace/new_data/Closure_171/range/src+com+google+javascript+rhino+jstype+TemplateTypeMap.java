{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/rhino/jstype/TemplateTypeMap.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TemplateTypeMap",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 54,
      "end_line": 329,
      "comment": "\n * Manages a mapping from TemplateType to its resolved JSType. Provides utility\n * methods for cloning/extending the map.\n *\n * @author izaakr@google.com (Izaak Rubin)\n "
    },
    {
      "type": "field",
      "varNames": [
        "templateKeys"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": " The TemplateType keys of the map."
    },
    {
      "type": "field",
      "varNames": [
        "templateValues"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": " iterative type resolution to find their true, resolved type."
    },
    {
      "type": "field",
      "varNames": [
        "resolvedTemplateValues"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": " equivalence of two TemplateTypeMap instances."
    },
    {
      "type": "field",
      "varNames": [
        "registry"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.rhino.jstype.TemplateTypeMap.TemplateTypeMap(com.google.javascript.rhino.jstype.JSTypeRegistry, com.google.common.collect.ImmutableList\u003ccom.google.javascript.rhino.jstype.TemplateType\u003e, com.google.common.collect.ImmutableList\u003ccom.google.javascript.rhino.jstype.JSType\u003e)",
      "begin_line": 69,
      "end_line": 91,
      "comment": "",
      "child_ranges": [
        "(line 72,col 5)-(line 72,col 45)",
        "(line 73,col 5)-(line 73,col 47)",
        "(line 75,col 5)-(line 75,col 29)",
        "(line 76,col 5)-(line 76,col 37)",
        "(line 78,col 5)-(line 78,col 36)",
        "(line 79,col 5)-(line 80,col 58)",
        "(line 84,col 5)-(line 85,col 24)",
        "(line 86,col 5)-(line 86,col 68)",
        "(line 87,col 5)-(line 89,col 5)",
        "(line 90,col 5)-(line 90,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.TemplateTypeMap.isEmpty()",
      "begin_line": 96,
      "end_line": 98,
      "comment": "\n   * Returns true if the map is empty; false otherwise.\n   ",
      "child_ranges": [
        "(line 97,col 5)-(line 97,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.TemplateTypeMap.getTemplateKeys()",
      "begin_line": 103,
      "end_line": 105,
      "comment": "\n   * Returns a list of all template keys.\n   ",
      "child_ranges": [
        "(line 104,col 5)-(line 104,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.TemplateTypeMap.hasTemplateKey(com.google.javascript.rhino.jstype.TemplateType)",
      "begin_line": 111,
      "end_line": 119,
      "comment": "\n   * Returns true if this map contains the specified template key, false\n   * otherwise.\n   ",
      "child_ranges": [
        "(line 113,col 5)-(line 117,col 5)",
        "(line 118,col 5)-(line 118,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.TemplateTypeMap.numUnfilledTemplateKeys()",
      "begin_line": 125,
      "end_line": 127,
      "comment": "\n   * Returns the number of template keys in this map that do not have a\n   * corresponding JSType value.\n   ",
      "child_ranges": [
        "(line 126,col 5)-(line 126,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.TemplateTypeMap.getUnfilledTemplateKeys()",
      "begin_line": 133,
      "end_line": 135,
      "comment": "\n   * Returns a list of template keys in this map that do not have corresponding\n   * JSType values.\n   ",
      "child_ranges": [
        "(line 134,col 5)-(line 134,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.TemplateTypeMap.hasTemplateType(com.google.javascript.rhino.jstype.TemplateType)",
      "begin_line": 141,
      "end_line": 143,
      "comment": "\n   * Returns true if there is a JSType value associated with the specified\n   * template key; false otherwise.\n   ",
      "child_ranges": [
        "(line 142,col 5)-(line 142,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.TemplateTypeMap.getTemplateType(com.google.javascript.rhino.jstype.TemplateType)",
      "begin_line": 149,
      "end_line": 153,
      "comment": "\n   * Returns the JSType value associated with the specified template key. If no\n   * JSType value is associated, returns UNKNOWN_TYPE.\n   ",
      "child_ranges": [
        "(line 150,col 5)-(line 150,col 42)",
        "(line 151,col 5)-(line 152,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.TemplateTypeMap.getTemplateTypeKeyByName(java.lang.String)",
      "begin_line": 155,
      "end_line": 162,
      "comment": "",
      "child_ranges": [
        "(line 156,col 5)-(line 160,col 5)",
        "(line 161,col 5)-(line 161,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.TemplateTypeMap.getTemplateTypeIndex(com.google.javascript.rhino.jstype.TemplateType)",
      "begin_line": 168,
      "end_line": 176,
      "comment": "\n   * Returns the index of the JSType value associated with the specified\n   * template key. If no JSType value is associated, returns -1.\n   ",
      "child_ranges": [
        "(line 169,col 5)-(line 169,col 72)",
        "(line 170,col 5)-(line 174,col 5)",
        "(line 175,col 5)-(line 175,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.TemplateTypeMap.getResolvedTemplateType(com.google.javascript.rhino.jstype.TemplateType)",
      "begin_line": 178,
      "end_line": 182,
      "comment": "",
      "child_ranges": [
        "(line 179,col 5)-(line 179,col 42)",
        "(line 180,col 5)-(line 181,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.TemplateTypeMap.checkEquivalenceHelper(com.google.javascript.rhino.jstype.TemplateTypeMap, com.google.javascript.rhino.jstype.EquivalenceMethod)",
      "begin_line": 196,
      "end_line": 243,
      "comment": "\n   * Determines if this map and the specified map have equivalent template\n   * types.\n   ",
      "child_ranges": [
        "(line 198,col 5)-(line 198,col 61)",
        "(line 199,col 5)-(line 199,col 66)",
        "(line 201,col 5)-(line 201,col 75)",
        "(line 202,col 5)-(line 202,col 60)",
        "(line 204,col 5)-(line 234,col 5)",
        "(line 236,col 5)-(line 240,col 5)",
        "(line 242,col 5)-(line 242,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.TemplateTypeMap.failedEquivalenceCheck(com.google.javascript.rhino.jstype.TemplateTypeMap.EquivalenceMatch, com.google.javascript.rhino.jstype.EquivalenceMethod)",
      "begin_line": 250,
      "end_line": 255,
      "comment": "\n   * Determines if the specified EquivalenceMatch is considered a failing\n   * condition for an equivalence check, given the EquivalenceMethod used for\n   * the check.\n   ",
      "child_ranges": [
        "(line 252,col 5)-(line 254,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.TemplateTypeMap.extend(com.google.javascript.rhino.jstype.TemplateTypeMap)",
      "begin_line": 262,
      "end_line": 267,
      "comment": "\n   * Extends this TemplateTypeMap with the contents of the specified map.\n   * UNKNOWN_TYPE will be used as the value for any missing values in the\n   * specified map.\n   ",
      "child_ranges": [
        "(line 263,col 5)-(line 263,col 41)",
        "(line 264,col 5)-(line 266,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.TemplateTypeMap.addValues(com.google.common.collect.ImmutableList\u003ccom.google.javascript.rhino.jstype.JSType\u003e)",
      "begin_line": 273,
      "end_line": 283,
      "comment": "\n   * Returns a new TemplateTypeMap whose values have been extended with the\n   * specified list.\n   ",
      "child_ranges": [
        "(line 276,col 5)-(line 276,col 52)",
        "(line 277,col 5)-(line 279,col 5)",
        "(line 281,col 5)-(line 282,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.TemplateTypeMap.addUnknownValues()",
      "begin_line": 289,
      "end_line": 300,
      "comment": "\n   * Returns a new TemplateTypeMap, where all unfilled values have been filled\n   * with UNKNOWN_TYPE.\n   ",
      "child_ranges": [
        "(line 290,col 5)-(line 290,col 60)",
        "(line 291,col 5)-(line 293,col 5)",
        "(line 295,col 5)-(line 295,col 68)",
        "(line 296,col 5)-(line 298,col 5)",
        "(line 299,col 5)-(line 299,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.TemplateTypeMap.concatImmutableLists(com.google.common.collect.ImmutableList\u003cT\u003e, com.google.common.collect.ImmutableList\u003cT\u003e)",
      "begin_line": 307,
      "end_line": 319,
      "comment": "\n   * Concatenates two ImmutableList instances. If either input is empty, the\n   * other is returned; otherwise, a new ImmutableList instance is created that\n   * contains the contents of both arguments.\n   ",
      "child_ranges": [
        "(line 309,col 5)-(line 311,col 5)",
        "(line 312,col 5)-(line 314,col 5)",
        "(line 315,col 5)-(line 315,col 63)",
        "(line 316,col 5)-(line 316,col 26)",
        "(line 317,col 5)-(line 317,col 27)",
        "(line 318,col 5)-(line 318,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.TemplateTypeMap.hasAnyTemplateTypesInternal()",
      "begin_line": 321,
      "end_line": 328,
      "comment": "",
      "child_ranges": [
        "(line 322,col 5)-(line 326,col 5)",
        "(line 327,col 5)-(line 327,col 17)"
      ]
    }
  ]
}