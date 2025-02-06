{
  "filepath": "/tmp/Jsoup-26b/src/main/java/org/jsoup/nodes/Attributes.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Attributes",
      "is_interface": false,
      "parent_types": [
        "java.lang.Iterable\u003corg.jsoup.nodes.Attribute\u003e",
        "java.lang.Cloneable"
      ],
      "begin_line": 17,
      "end_line": 249,
      "comment": "\n * The attributes of an Element.\n * \u003cp/\u003e\n * Attributes are treated as a map: there can be only one value associated with an attribute key.\n * \u003cp/\u003e\n * Attribute key and value comparisons are done case insensitively, and keys are normalised to\n * lower-case.\n * \n * @author Jonathan Hedley, jonathan@hedley.net\n "
    },
    {
      "type": "field",
      "varNames": [
        "dataPrefix"
      ],
      "begin_line": 18,
      "end_line": 18,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "attributes"
      ],
      "begin_line": 20,
      "end_line": 20,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.get(java.lang.String)",
      "begin_line": 30,
      "end_line": 38,
      "comment": "\n     Get an attribute value by key.\n     @param key the attribute key\n     @return the attribute value if set; or empty string if not set.\n     @see #hasKey(String)\n     ",
      "child_ranges": [
        "(line 31,col 9)-(line 31,col 31)",
        "(line 33,col 9)-(line 34,col 22)",
        "(line 36,col 9)-(line 36,col 59)",
        "(line 37,col 9)-(line 37,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.put(java.lang.String, java.lang.String)",
      "begin_line": 45,
      "end_line": 48,
      "comment": "\n     Set a new attribute, or replace an existing one by key.\n     @param key attribute key\n     @param value attribute value\n     ",
      "child_ranges": [
        "(line 46,col 9)-(line 46,col 51)",
        "(line 47,col 9)-(line 47,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.put(org.jsoup.nodes.Attribute)",
      "begin_line": 54,
      "end_line": 59,
      "comment": "\n     Set a new attribute, or replace an existing one by key.\n     @param attribute attribute\n     ",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 36)",
        "(line 56,col 9)-(line 57,col 66)",
        "(line 58,col 9)-(line 58,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.remove(java.lang.String)",
      "begin_line": 65,
      "end_line": 70,
      "comment": "\n     Remove an attribute by key.\n     @param key attribute key to remove\n     ",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 31)",
        "(line 67,col 9)-(line 68,col 19)",
        "(line 69,col 9)-(line 69,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.hasKey(java.lang.String)",
      "begin_line": 77,
      "end_line": 79,
      "comment": "\n     Tests if these attributes contain an attribute with this key.\n     @param key key to check for\n     @return true if key exists, false otherwise\n     ",
      "child_ranges": [
        "(line 78,col 9)-(line 78,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.size()",
      "begin_line": 85,
      "end_line": 89,
      "comment": "\n     Get the number of attributes in this set.\n     @return size\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 87,col 21)",
        "(line 88,col 9)-(line 88,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.addAll(org.jsoup.nodes.Attributes)",
      "begin_line": 95,
      "end_line": 101,
      "comment": "\n     Add all the attributes from the incoming set to this set.\n     @param incoming attributes to add to these attributes.\n     ",
      "child_ranges": [
        "(line 96,col 9)-(line 97,col 19)",
        "(line 98,col 9)-(line 99,col 79)",
        "(line 100,col 9)-(line 100,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.iterator()",
      "begin_line": 103,
      "end_line": 105,
      "comment": "",
      "child_ranges": [
        "(line 104,col 9)-(line 104,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.asList()",
      "begin_line": 112,
      "end_line": 121,
      "comment": "\n     Get the attributes as a List, for iteration. Do not modify the keys of the attributes via this view, as changes\n     to keys will not be recognised in the containing set.\n     @return an view of the attributes as a List.\n     ",
      "child_ranges": [
        "(line 113,col 9)-(line 114,col 43)",
        "(line 116,col 9)-(line 116,col 75)",
        "(line 117,col 9)-(line 119,col 9)",
        "(line 120,col 9)-(line 120,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.dataset()",
      "begin_line": 128,
      "end_line": 130,
      "comment": "\n     * Retrieves a filtered view of attributes that are HTML5 custom data attributes; that is, attributes with keys\n     * starting with {@code data-}.\n     * @return map of custom data attributes.\n     ",
      "child_ranges": [
        "(line 129,col 9)-(line 129,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.html()",
      "begin_line": 136,
      "end_line": 140,
      "comment": "\n     Get the HTML representation of these attributes.\n     @return HTML\n     ",
      "child_ranges": [
        "(line 137,col 9)-(line 137,col 50)",
        "(line 138,col 9)-(line 138,col 57)",
        "(line 139,col 9)-(line 139,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.html(java.lang.StringBuilder, org.jsoup.nodes.Document.OutputSettings)",
      "begin_line": 142,
      "end_line": 151,
      "comment": "",
      "child_ranges": [
        "(line 143,col 9)-(line 144,col 19)",
        "(line 146,col 9)-(line 150,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.toString()",
      "begin_line": 153,
      "end_line": 155,
      "comment": "",
      "child_ranges": [
        "(line 154,col 9)-(line 154,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.equals(java.lang.Object)",
      "begin_line": 157,
      "end_line": 167,
      "comment": "",
      "child_ranges": [
        "(line 159,col 9)-(line 159,col 35)",
        "(line 160,col 9)-(line 160,col 53)",
        "(line 162,col 9)-(line 162,col 41)",
        "(line 164,col 9)-(line 164,col 109)",
        "(line 166,col 9)-(line 166,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.hashCode()",
      "begin_line": 169,
      "end_line": 172,
      "comment": "",
      "child_ranges": [
        "(line 171,col 9)-(line 171,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.clone()",
      "begin_line": 174,
      "end_line": 189,
      "comment": "",
      "child_ranges": [
        "(line 176,col 9)-(line 177,col 36)",
        "(line 179,col 9)-(line 179,col 25)",
        "(line 180,col 9)-(line 184,col 9)",
        "(line 185,col 9)-(line 185,col 83)",
        "(line 186,col 9)-(line 187,col 72)",
        "(line 188,col 9)-(line 188,col 21)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Dataset",
      "is_interface": false,
      "parent_types": [
        "java.util.AbstractMap\u003cjava.lang.String, java.lang.String\u003e"
      ],
      "begin_line": 191,
      "end_line": 244,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.nodes.Attributes.Dataset.Dataset()",
      "begin_line": 193,
      "end_line": 196,
      "comment": "",
      "child_ranges": [
        "(line 194,col 13)-(line 195,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.Dataset.entrySet()",
      "begin_line": 198,
      "end_line": 200,
      "comment": "",
      "child_ranges": [
        "(line 199,col 13)-(line 199,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.Dataset.put(java.lang.String, java.lang.String)",
      "begin_line": 202,
      "end_line": 209,
      "comment": "",
      "child_ranges": [
        "(line 204,col 13)-(line 204,col 42)",
        "(line 205,col 13)-(line 205,col 90)",
        "(line 206,col 13)-(line 206,col 59)",
        "(line 207,col 13)-(line 207,col 42)",
        "(line 208,col 13)-(line 208,col 28)"
      ]
    },
    {
      "type": "class_interface",
      "name": "EntrySet",
      "is_interface": false,
      "parent_types": [
        "java.util.AbstractSet\u003cjava.util.Map.Entry\u003cjava.lang.String, java.lang.String\u003e\u003e"
      ],
      "begin_line": 211,
      "end_line": 223,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.Dataset.EntrySet.iterator()",
      "begin_line": 212,
      "end_line": 214,
      "comment": "",
      "child_ranges": [
        "(line 213,col 17)-(line 213,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.Dataset.EntrySet.size()",
      "begin_line": 216,
      "end_line": 222,
      "comment": "",
      "child_ranges": [
        "(line 217,col 17)-(line 217,col 30)",
        "(line 218,col 17)-(line 218,col 54)",
        "(line 219,col 17)-(line 220,col 28)",
        "(line 221,col 17)-(line 221,col 29)"
      ]
    },
    {
      "type": "class_interface",
      "name": "DatasetIterator",
      "is_interface": false,
      "parent_types": [
        "java.util.Iterator\u003cjava.util.Map.Entry\u003cjava.lang.String, java.lang.String\u003e\u003e"
      ],
      "begin_line": 225,
      "end_line": 243,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "attrIter"
      ],
      "begin_line": 226,
      "end_line": 226,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "attr"
      ],
      "begin_line": 227,
      "end_line": 227,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.Dataset.DatasetIterator.hasNext()",
      "begin_line": 228,
      "end_line": 234,
      "comment": "",
      "child_ranges": [
        "(line 229,col 17)-(line 232,col 17)",
        "(line 233,col 17)-(line 233,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.Dataset.DatasetIterator.next()",
      "begin_line": 236,
      "end_line": 238,
      "comment": "",
      "child_ranges": [
        "(line 237,col 17)-(line 237,col 100)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.Dataset.DatasetIterator.remove()",
      "begin_line": 240,
      "end_line": 242,
      "comment": "",
      "child_ranges": [
        "(line 241,col 17)-(line 241,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.dataKey(java.lang.String)",
      "begin_line": 246,
      "end_line": 248,
      "comment": "",
      "child_ranges": [
        "(line 247,col 9)-(line 247,col 32)"
      ]
    }
  ]
}