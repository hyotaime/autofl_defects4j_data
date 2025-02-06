{
  "filepath": "/tmp/Jsoup-8b/src/main/java/org/jsoup/nodes/Attributes.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Attributes",
      "is_interface": false,
      "parent_types": [
        "java.lang.Iterable\u003corg.jsoup.nodes.Attribute\u003e"
      ],
      "begin_line": 17,
      "end_line": 207,
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
      "begin_line": 29,
      "end_line": 34,
      "comment": "\n     Get an attribute value by key.\n     @param key the attribute key\n     @return the attribute value if set; or empty string if not set.\n     @see #hasKey(String)\n     ",
      "child_ranges": [
        "(line 30,col 9)-(line 30,col 31)",
        "(line 32,col 9)-(line 32,col 59)",
        "(line 33,col 9)-(line 33,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.put(java.lang.String, java.lang.String)",
      "begin_line": 41,
      "end_line": 44,
      "comment": "\n     Set a new attribute, or replace an existing one by key.\n     @param key attribute key\n     @param value attribute value\n     ",
      "child_ranges": [
        "(line 42,col 9)-(line 42,col 51)",
        "(line 43,col 9)-(line 43,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.put(org.jsoup.nodes.Attribute)",
      "begin_line": 50,
      "end_line": 53,
      "comment": "\n     Set a new attribute, or replace an existing one by key.\n     @param attribute attribute\n     ",
      "child_ranges": [
        "(line 51,col 9)-(line 51,col 36)",
        "(line 52,col 9)-(line 52,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.remove(java.lang.String)",
      "begin_line": 59,
      "end_line": 62,
      "comment": "\n     Remove an attribute by key.\n     @param key attribute key to remove\n     ",
      "child_ranges": [
        "(line 60,col 9)-(line 60,col 31)",
        "(line 61,col 9)-(line 61,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.hasKey(java.lang.String)",
      "begin_line": 69,
      "end_line": 71,
      "comment": "\n     Tests if these attributes contain an attribute with this key.\n     @param key key to check for\n     @return true if key exists, false otherwise\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.size()",
      "begin_line": 77,
      "end_line": 79,
      "comment": "\n     Get the number of attributes in this set.\n     @return size\n     ",
      "child_ranges": [
        "(line 78,col 9)-(line 78,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.addAll(org.jsoup.nodes.Attributes)",
      "begin_line": 85,
      "end_line": 87,
      "comment": "\n     Add all the attributes from the incoming set to this set.\n     @param incoming attributes to add to these attributes.\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.iterator()",
      "begin_line": 89,
      "end_line": 91,
      "comment": "",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.asList()",
      "begin_line": 98,
      "end_line": 104,
      "comment": "\n     Get the attributes as a List, for iteration. Do not modify the keys of the attributes via this view, as changes\n     to keys will not be recognised in the containing set.\n     @return an view of the attributes as a List.\n     ",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 75)",
        "(line 100,col 9)-(line 102,col 9)",
        "(line 103,col 9)-(line 103,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.dataset()",
      "begin_line": 111,
      "end_line": 113,
      "comment": "\n     * Retrieves a filtered view of attributes that are HTML5 custom data attributes; that is, attributes with keys\n     * starting with {@code data-}.\n     * @return map of custom data attributes.\n     ",
      "child_ranges": [
        "(line 112,col 9)-(line 112,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.html()",
      "begin_line": 119,
      "end_line": 123,
      "comment": "\n     Get the HTML representation of these attributes.\n     @return HTML\n     ",
      "child_ranges": [
        "(line 120,col 9)-(line 120,col 50)",
        "(line 121,col 9)-(line 121,col 57)",
        "(line 122,col 9)-(line 122,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.html(java.lang.StringBuilder, org.jsoup.nodes.Document.OutputSettings)",
      "begin_line": 125,
      "end_line": 131,
      "comment": "",
      "child_ranges": [
        "(line 126,col 9)-(line 130,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.toString()",
      "begin_line": 133,
      "end_line": 135,
      "comment": "",
      "child_ranges": [
        "(line 134,col 9)-(line 134,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.equals(java.lang.Object)",
      "begin_line": 137,
      "end_line": 147,
      "comment": "",
      "child_ranges": [
        "(line 139,col 9)-(line 139,col 35)",
        "(line 140,col 9)-(line 140,col 53)",
        "(line 142,col 9)-(line 142,col 41)",
        "(line 144,col 9)-(line 144,col 109)",
        "(line 146,col 9)-(line 146,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.hashCode()",
      "begin_line": 149,
      "end_line": 152,
      "comment": "",
      "child_ranges": [
        "(line 151,col 9)-(line 151,col 62)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Dataset",
      "is_interface": false,
      "parent_types": [
        "java.util.AbstractMap\u003cjava.lang.String, java.lang.String\u003e"
      ],
      "begin_line": 154,
      "end_line": 202,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.Dataset.entrySet()",
      "begin_line": 156,
      "end_line": 158,
      "comment": "",
      "child_ranges": [
        "(line 157,col 13)-(line 157,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.Dataset.put(java.lang.String, java.lang.String)",
      "begin_line": 160,
      "end_line": 167,
      "comment": "",
      "child_ranges": [
        "(line 162,col 13)-(line 162,col 42)",
        "(line 163,col 13)-(line 163,col 90)",
        "(line 164,col 13)-(line 164,col 59)",
        "(line 165,col 13)-(line 165,col 42)",
        "(line 166,col 13)-(line 166,col 28)"
      ]
    },
    {
      "type": "class_interface",
      "name": "EntrySet",
      "is_interface": false,
      "parent_types": [
        "java.util.AbstractSet\u003cjava.util.Map.Entry\u003cjava.lang.String, java.lang.String\u003e\u003e"
      ],
      "begin_line": 169,
      "end_line": 181,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.Dataset.EntrySet.iterator()",
      "begin_line": 170,
      "end_line": 172,
      "comment": "",
      "child_ranges": [
        "(line 171,col 17)-(line 171,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.Dataset.EntrySet.size()",
      "begin_line": 174,
      "end_line": 180,
      "comment": "",
      "child_ranges": [
        "(line 175,col 17)-(line 175,col 30)",
        "(line 176,col 17)-(line 176,col 54)",
        "(line 177,col 17)-(line 178,col 28)",
        "(line 179,col 17)-(line 179,col 29)"
      ]
    },
    {
      "type": "class_interface",
      "name": "DatasetIterator",
      "is_interface": false,
      "parent_types": [
        "java.util.Iterator\u003cjava.util.Map.Entry\u003cjava.lang.String, java.lang.String\u003e\u003e"
      ],
      "begin_line": 183,
      "end_line": 201,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "attrIter"
      ],
      "begin_line": 184,
      "end_line": 184,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "attr"
      ],
      "begin_line": 185,
      "end_line": 185,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.Dataset.DatasetIterator.hasNext()",
      "begin_line": 186,
      "end_line": 192,
      "comment": "",
      "child_ranges": [
        "(line 187,col 17)-(line 190,col 17)",
        "(line 191,col 17)-(line 191,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.Dataset.DatasetIterator.next()",
      "begin_line": 194,
      "end_line": 196,
      "comment": "",
      "child_ranges": [
        "(line 195,col 17)-(line 195,col 100)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.Dataset.DatasetIterator.remove()",
      "begin_line": 198,
      "end_line": 200,
      "comment": "",
      "child_ranges": [
        "(line 199,col 17)-(line 199,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.dataKey(java.lang.String)",
      "begin_line": 204,
      "end_line": 206,
      "comment": "",
      "child_ranges": [
        "(line 205,col 9)-(line 205,col 32)"
      ]
    }
  ]
}