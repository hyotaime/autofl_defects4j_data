{
  "filepath": "/tmp/Jsoup-66b/src/main/java/org/jsoup/nodes/Attributes.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Attributes",
      "is_interface": false,
      "parent_types": [
        "java.lang.Iterable\u003corg.jsoup.nodes.Attribute\u003e",
        "java.lang.Cloneable"
      ],
      "begin_line": 32,
      "end_line": 447,
      "comment": "\n * The attributes of an Element.\n * \u003cp\u003e\n * Attributes are treated as a map: there can be only one value associated with an attribute key/name.\n * \u003c/p\u003e\n * \u003cp\u003e\n * Attribute name and value comparisons are  generally \u003cb\u003ecase sensitive\u003c/b\u003e. By default for HTML, attribute names are\n * normalized to lower-case on parsing. That means you should use lower-case strings when referring to attributes by\n * name.\n * \u003c/p\u003e\n *\n * @author Jonathan Hedley, jonathan@hedley.net\n "
    },
    {
      "type": "field",
      "varNames": [
        "dataPrefix"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "InitialCapacity"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": " todo - analyze Alexa 1MM sites, determine best setting"
    },
    {
      "type": "field",
      "varNames": [
        "GrowthFactor"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": " manages the key/val arrays"
    },
    {
      "type": "field",
      "varNames": [
        "Empty"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "NotFound"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "EmptyString"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "size"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " number of slots used (not capacity, which is keys.length"
    },
    {
      "type": "field",
      "varNames": [
        "keys"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "vals"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.checkCapacity(int)",
      "begin_line": 47,
      "end_line": 59,
      "comment": " check there\u0027s room for more",
      "child_ranges": [
        "(line 48,col 9)-(line 48,col 44)",
        "(line 49,col 9)-(line 49,col 34)",
        "(line 50,col 9)-(line 51,col 19)",
        "(line 53,col 9)-(line 53,col 89)",
        "(line 54,col 9)-(line 55,col 33)",
        "(line 57,col 9)-(line 57,col 37)",
        "(line 58,col 9)-(line 58,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.copyOf(java.lang.String[], int)",
      "begin_line": 62,
      "end_line": 67,
      "comment": " simple implementation of Arrays.copy, for support of Android API 8.",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 47)",
        "(line 64,col 9)-(line 65,col 45)",
        "(line 66,col 9)-(line 66,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.indexOfKey(java.lang.String)",
      "begin_line": 69,
      "end_line": 76,
      "comment": "",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 30)",
        "(line 71,col 9)-(line 74,col 9)",
        "(line 75,col 9)-(line 75,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.indexOfKeyIgnoreCase(java.lang.String)",
      "begin_line": 78,
      "end_line": 85,
      "comment": "",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 30)",
        "(line 80,col 9)-(line 83,col 9)",
        "(line 84,col 9)-(line 84,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.checkNotNull(java.lang.String)",
      "begin_line": 88,
      "end_line": 90,
      "comment": " we track boolean attributes as null in values - they\u0027re just keys. so returns empty for consumers",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.get(java.lang.String)",
      "begin_line": 98,
      "end_line": 101,
      "comment": "\n     Get an attribute value by key.\n     @param key the (case-sensitive) attribute key\n     @return the attribute value if set; or empty string if not set (or a boolean attribute).\n     @see #hasKey(String)\n     ",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 32)",
        "(line 100,col 9)-(line 100,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.getIgnoreCase(java.lang.String)",
      "begin_line": 108,
      "end_line": 111,
      "comment": "\n     * Get an attribute\u0027s value by case-insensitive key\n     * @param key the attribute name\n     * @return the first matching attribute value if set; or empty string if not set (ora boolean attribute).\n     ",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 42)",
        "(line 110,col 9)-(line 110,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.add(java.lang.String, java.lang.String)",
      "begin_line": 114,
      "end_line": 119,
      "comment": " adds without checking if this key exists",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 32)",
        "(line 116,col 9)-(line 116,col 25)",
        "(line 117,col 9)-(line 117,col 27)",
        "(line 118,col 9)-(line 118,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.put(java.lang.String, java.lang.String)",
      "begin_line": 127,
      "end_line": 134,
      "comment": "\n     * Set a new attribute, or replace an existing one by key.\n     * @param key case sensitive attribute key\n     * @param value attribute value\n     * @return these attributes, for chaining\n     ",
      "child_ranges": [
        "(line 128,col 9)-(line 128,col 32)",
        "(line 129,col 9)-(line 132,col 28)",
        "(line 133,col 9)-(line 133,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.putIgnoreCase(java.lang.String, java.lang.String)",
      "begin_line": 136,
      "end_line": 145,
      "comment": "",
      "child_ranges": [
        "(line 137,col 9)-(line 137,col 42)",
        "(line 138,col 9)-(line 144,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.put(java.lang.String, boolean)",
      "begin_line": 153,
      "end_line": 159,
      "comment": "\n     * Set a new boolean attribute, remove attribute if value is false.\n     * @param key case \u003cb\u003einsensitive\u003c/b\u003e attribute key\n     * @param value attribute value\n     * @return these attributes, for chaining\n     ",
      "child_ranges": [
        "(line 154,col 9)-(line 157,col 24)",
        "(line 158,col 9)-(line 158,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.put(org.jsoup.nodes.Attribute)",
      "begin_line": 166,
      "end_line": 171,
      "comment": "\n     Set a new attribute, or replace an existing one by key.\n     @param attribute attribute with case sensitive key\n     @return these attributes, for chaining\n     ",
      "child_ranges": [
        "(line 167,col 9)-(line 167,col 36)",
        "(line 168,col 9)-(line 168,col 54)",
        "(line 169,col 9)-(line 169,col 32)",
        "(line 170,col 9)-(line 170,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.remove(int)",
      "begin_line": 174,
      "end_line": 184,
      "comment": " removes and shifts up",
      "child_ranges": [
        "(line 175,col 9)-(line 175,col 40)",
        "(line 176,col 9)-(line 176,col 39)",
        "(line 177,col 9)-(line 180,col 9)",
        "(line 181,col 9)-(line 181,col 15)",
        "(line 182,col 9)-(line 182,col 26)",
        "(line 183,col 9)-(line 183,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.remove(java.lang.String)",
      "begin_line": 190,
      "end_line": 194,
      "comment": "\n     Remove an attribute by key. \u003cb\u003eCase sensitive.\u003c/b\u003e\n     @param key attribute key to remove\n     ",
      "child_ranges": [
        "(line 191,col 9)-(line 191,col 32)",
        "(line 192,col 9)-(line 193,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.removeIgnoreCase(java.lang.String)",
      "begin_line": 200,
      "end_line": 204,
      "comment": "\n     Remove an attribute by key. \u003cb\u003eCase insensitive.\u003c/b\u003e\n     @param key attribute key to remove\n     ",
      "child_ranges": [
        "(line 201,col 9)-(line 201,col 42)",
        "(line 202,col 9)-(line 203,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.hasKey(java.lang.String)",
      "begin_line": 211,
      "end_line": 213,
      "comment": "\n     Tests if these attributes contain an attribute with this key.\n     @param key case-sensitive key to check for\n     @return true if key exists, false otherwise\n     ",
      "child_ranges": [
        "(line 212,col 9)-(line 212,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.hasKeyIgnoreCase(java.lang.String)",
      "begin_line": 220,
      "end_line": 222,
      "comment": "\n     Tests if these attributes contain an attribute with this key.\n     @param key key to check for\n     @return true if key exists, false otherwise\n     ",
      "child_ranges": [
        "(line 221,col 9)-(line 221,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.size()",
      "begin_line": 228,
      "end_line": 230,
      "comment": "\n     Get the number of attributes in this set.\n     @return size\n     ",
      "child_ranges": [
        "(line 229,col 9)-(line 229,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.addAll(org.jsoup.nodes.Attributes)",
      "begin_line": 236,
      "end_line": 246,
      "comment": "\n     Add all the attributes from the incoming set to this set.\n     @param incoming attributes to add to these attributes.\n     ",
      "child_ranges": [
        "(line 237,col 9)-(line 238,col 19)",
        "(line 239,col 9)-(line 239,col 44)",
        "(line 241,col 9)-(line 244,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.iterator()",
      "begin_line": 248,
      "end_line": 269,
      "comment": "",
      "child_ranges": [
        "(line 249,col 9)-(line 268,col 10)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "i"
      ],
      "begin_line": 250,
      "end_line": 250,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.Anonymous-0f6da4d9-9688-4d1b-90e7-ab73af400238.hasNext()",
      "begin_line": 252,
      "end_line": 255,
      "comment": "",
      "child_ranges": [
        "(line 254,col 17)-(line 254,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.Anonymous-45515ba7-c43f-41f7-904f-20fe53eb11e1.next()",
      "begin_line": 257,
      "end_line": 262,
      "comment": "",
      "child_ranges": [
        "(line 259,col 17)-(line 259,col 88)",
        "(line 260,col 17)-(line 260,col 20)",
        "(line 261,col 17)-(line 261,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.Anonymous-324e29d5-5fac-4fdd-9060-f3c5c8bd31f7.remove()",
      "begin_line": 264,
      "end_line": 267,
      "comment": "",
      "child_ranges": [
        "(line 266,col 17)-(line 266,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.asList()",
      "begin_line": 275,
      "end_line": 284,
      "comment": "\n     Get the attributes as a List, for iteration.\n     @return an view of the attributes as an unmodifialbe List.\n     ",
      "child_ranges": [
        "(line 276,col 9)-(line 276,col 58)",
        "(line 277,col 9)-(line 282,col 9)",
        "(line 283,col 9)-(line 283,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.dataset()",
      "begin_line": 291,
      "end_line": 293,
      "comment": "\n     * Retrieves a filtered view of attributes that are HTML5 custom data attributes; that is, attributes with keys\n     * starting with {@code data-}.\n     * @return map of custom data attributes.\n     ",
      "child_ranges": [
        "(line 292,col 9)-(line 292,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.html()",
      "begin_line": 300,
      "end_line": 308,
      "comment": "\n     Get the HTML representation of these attributes.\n     @return HTML\n     @throws SerializationException if the HTML representation of the attributes cannot be constructed.\n     ",
      "child_ranges": [
        "(line 301,col 9)-(line 301,col 50)",
        "(line 302,col 9)-(line 306,col 9)",
        "(line 307,col 9)-(line 307,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.html(java.lang.Appendable, org.jsoup.nodes.Document.OutputSettings)",
      "begin_line": 310,
      "end_line": 327,
      "comment": "",
      "child_ranges": [
        "(line 311,col 9)-(line 311,col 28)",
        "(line 312,col 9)-(line 326,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.toString()",
      "begin_line": 329,
      "end_line": 332,
      "comment": "",
      "child_ranges": [
        "(line 331,col 9)-(line 331,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.equals(java.lang.Object)",
      "begin_line": 339,
      "end_line": 349,
      "comment": "\n     * Checks if these attributes are equal to another set of attributes, by comparing the two sets\n     * @param o attributes to compare with\n     * @return if both sets of attributes have the same content\n     ",
      "child_ranges": [
        "(line 341,col 9)-(line 341,col 35)",
        "(line 342,col 9)-(line 342,col 66)",
        "(line 344,col 9)-(line 344,col 41)",
        "(line 346,col 9)-(line 346,col 44)",
        "(line 347,col 9)-(line 347,col 58)",
        "(line 348,col 9)-(line 348,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.hashCode()",
      "begin_line": 355,
      "end_line": 361,
      "comment": "\n     * Calculates the hashcode of these attributes, by iterating all attributes and summing their hashcodes.\n     * @return calculated hashcode\n     ",
      "child_ranges": [
        "(line 357,col 9)-(line 357,col 26)",
        "(line 358,col 9)-(line 358,col 53)",
        "(line 359,col 9)-(line 359,col 53)",
        "(line 360,col 9)-(line 360,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.clone()",
      "begin_line": 363,
      "end_line": 375,
      "comment": "",
      "child_ranges": [
        "(line 365,col 9)-(line 365,col 25)",
        "(line 366,col 9)-(line 370,col 9)",
        "(line 371,col 9)-(line 371,col 26)",
        "(line 372,col 9)-(line 372,col 34)",
        "(line 373,col 9)-(line 373,col 34)",
        "(line 374,col 9)-(line 374,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.normalize()",
      "begin_line": 380,
      "end_line": 384,
      "comment": "\n     * Internal method. Lowercases all keys.\n     ",
      "child_ranges": [
        "(line 381,col 9)-(line 383,col 9)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Dataset",
      "is_interface": false,
      "parent_types": [
        "java.util.AbstractMap\u003cjava.lang.String, java.lang.String\u003e"
      ],
      "begin_line": 386,
      "end_line": 442,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "attributes"
      ],
      "begin_line": 387,
      "end_line": 387,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.nodes.Attributes.Dataset.Dataset(org.jsoup.nodes.Attributes)",
      "begin_line": 389,
      "end_line": 391,
      "comment": "",
      "child_ranges": [
        "(line 390,col 13)-(line 390,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.Dataset.entrySet()",
      "begin_line": 393,
      "end_line": 396,
      "comment": "",
      "child_ranges": [
        "(line 395,col 13)-(line 395,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.Dataset.put(java.lang.String, java.lang.String)",
      "begin_line": 398,
      "end_line": 404,
      "comment": "",
      "child_ranges": [
        "(line 400,col 13)-(line 400,col 42)",
        "(line 401,col 13)-(line 401,col 90)",
        "(line 402,col 13)-(line 402,col 43)",
        "(line 403,col 13)-(line 403,col 28)"
      ]
    },
    {
      "type": "class_interface",
      "name": "EntrySet",
      "is_interface": false,
      "parent_types": [
        "java.util.AbstractSet\u003cjava.util.Map.Entry\u003cjava.lang.String, java.lang.String\u003e\u003e"
      ],
      "begin_line": 406,
      "end_line": 421,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.Dataset.EntrySet.iterator()",
      "begin_line": 408,
      "end_line": 411,
      "comment": "",
      "child_ranges": [
        "(line 410,col 17)-(line 410,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.Dataset.EntrySet.size()",
      "begin_line": 413,
      "end_line": 420,
      "comment": "",
      "child_ranges": [
        "(line 415,col 17)-(line 415,col 30)",
        "(line 416,col 17)-(line 416,col 54)",
        "(line 417,col 17)-(line 418,col 28)",
        "(line 419,col 17)-(line 419,col 29)"
      ]
    },
    {
      "type": "class_interface",
      "name": "DatasetIterator",
      "is_interface": false,
      "parent_types": [
        "java.util.Iterator\u003cjava.util.Map.Entry\u003cjava.lang.String, java.lang.String\u003e\u003e"
      ],
      "begin_line": 423,
      "end_line": 441,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "attrIter"
      ],
      "begin_line": 424,
      "end_line": 424,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "attr"
      ],
      "begin_line": 425,
      "end_line": 425,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.Dataset.DatasetIterator.hasNext()",
      "begin_line": 426,
      "end_line": 432,
      "comment": "",
      "child_ranges": [
        "(line 427,col 17)-(line 430,col 17)",
        "(line 431,col 17)-(line 431,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.Dataset.DatasetIterator.next()",
      "begin_line": 434,
      "end_line": 436,
      "comment": "",
      "child_ranges": [
        "(line 435,col 17)-(line 435,col 100)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.Dataset.DatasetIterator.remove()",
      "begin_line": 438,
      "end_line": 440,
      "comment": "",
      "child_ranges": [
        "(line 439,col 17)-(line 439,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.dataKey(java.lang.String)",
      "begin_line": 444,
      "end_line": 446,
      "comment": "",
      "child_ranges": [
        "(line 445,col 9)-(line 445,col 32)"
      ]
    }
  ]
}