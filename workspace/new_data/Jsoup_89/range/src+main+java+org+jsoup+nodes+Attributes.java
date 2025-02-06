{
  "filepath": "/tmp/Jsoup-89b/src/main/java/org/jsoup/nodes/Attributes.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Attributes",
      "is_interface": false,
      "parent_types": [
        "java.lang.Iterable\u003corg.jsoup.nodes.Attribute\u003e",
        "java.lang.Cloneable"
      ],
      "begin_line": 33,
      "end_line": 446,
      "comment": "\n * The attributes of an Element.\n * \u003cp\u003e\n * Attributes are treated as a map: there can be only one value associated with an attribute key/name.\n * \u003c/p\u003e\n * \u003cp\u003e\n * Attribute name and value comparisons are  generally \u003cb\u003ecase sensitive\u003c/b\u003e. By default for HTML, attribute names are\n * normalized to lower-case on parsing. That means you should use lower-case strings when referring to attributes by\n * name.\n * \u003c/p\u003e\n *\n * @author Jonathan Hedley, jonathan@hedley.net\n "
    },
    {
      "type": "field",
      "varNames": [
        "dataPrefix"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "InitialCapacity"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": " todo - analyze Alexa 1MM sites, determine best setting"
    },
    {
      "type": "field",
      "varNames": [
        "GrowthFactor"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": " manages the key/val arrays"
    },
    {
      "type": "field",
      "varNames": [
        "Empty"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "NotFound"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "EmptyString"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "size"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " number of slots used (not capacity, which is keys.length"
    },
    {
      "type": "field",
      "varNames": [
        "keys"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "vals"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.checkCapacity(int)",
      "begin_line": 48,
      "end_line": 60,
      "comment": " check there\u0027s room for more",
      "child_ranges": [
        "(line 49,col 9)-(line 49,col 44)",
        "(line 50,col 9)-(line 50,col 34)",
        "(line 51,col 9)-(line 52,col 19)",
        "(line 54,col 9)-(line 54,col 89)",
        "(line 55,col 9)-(line 56,col 33)",
        "(line 58,col 9)-(line 58,col 37)",
        "(line 59,col 9)-(line 59,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.copyOf(java.lang.String[], int)",
      "begin_line": 63,
      "end_line": 68,
      "comment": " simple implementation of Arrays.copy, for support of Android API 8.",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 47)",
        "(line 65,col 9)-(line 66,col 45)",
        "(line 67,col 9)-(line 67,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.indexOfKey(java.lang.String)",
      "begin_line": 70,
      "end_line": 77,
      "comment": "",
      "child_ranges": [
        "(line 71,col 9)-(line 71,col 30)",
        "(line 72,col 9)-(line 75,col 9)",
        "(line 76,col 9)-(line 76,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.indexOfKeyIgnoreCase(java.lang.String)",
      "begin_line": 79,
      "end_line": 86,
      "comment": "",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 30)",
        "(line 81,col 9)-(line 84,col 9)",
        "(line 85,col 9)-(line 85,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.checkNotNull(java.lang.String)",
      "begin_line": 89,
      "end_line": 91,
      "comment": " we track boolean attributes as null in values - they\u0027re just keys. so returns empty for consumers",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.get(java.lang.String)",
      "begin_line": 99,
      "end_line": 102,
      "comment": "\n     Get an attribute value by key.\n     @param key the (case-sensitive) attribute key\n     @return the attribute value if set; or empty string if not set (or a boolean attribute).\n     @see #hasKey(String)\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 32)",
        "(line 101,col 9)-(line 101,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.getIgnoreCase(java.lang.String)",
      "begin_line": 109,
      "end_line": 112,
      "comment": "\n     * Get an attribute\u0027s value by case-insensitive key\n     * @param key the attribute name\n     * @return the first matching attribute value if set; or empty string if not set (ora boolean attribute).\n     ",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 42)",
        "(line 111,col 9)-(line 111,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.add(java.lang.String, java.lang.String)",
      "begin_line": 115,
      "end_line": 120,
      "comment": " adds without checking if this key exists",
      "child_ranges": [
        "(line 116,col 9)-(line 116,col 32)",
        "(line 117,col 9)-(line 117,col 25)",
        "(line 118,col 9)-(line 118,col 27)",
        "(line 119,col 9)-(line 119,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.put(java.lang.String, java.lang.String)",
      "begin_line": 128,
      "end_line": 135,
      "comment": "\n     * Set a new attribute, or replace an existing one by key.\n     * @param key case sensitive attribute key\n     * @param value attribute value\n     * @return these attributes, for chaining\n     ",
      "child_ranges": [
        "(line 129,col 9)-(line 129,col 32)",
        "(line 130,col 9)-(line 133,col 28)",
        "(line 134,col 9)-(line 134,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.putIgnoreCase(java.lang.String, java.lang.String)",
      "begin_line": 137,
      "end_line": 146,
      "comment": "",
      "child_ranges": [
        "(line 138,col 9)-(line 138,col 42)",
        "(line 139,col 9)-(line 145,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.put(java.lang.String, boolean)",
      "begin_line": 154,
      "end_line": 160,
      "comment": "\n     * Set a new boolean attribute, remove attribute if value is false.\n     * @param key case \u003cb\u003einsensitive\u003c/b\u003e attribute key\n     * @param value attribute value\n     * @return these attributes, for chaining\n     ",
      "child_ranges": [
        "(line 155,col 9)-(line 158,col 24)",
        "(line 159,col 9)-(line 159,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.put(org.jsoup.nodes.Attribute)",
      "begin_line": 167,
      "end_line": 172,
      "comment": "\n     Set a new attribute, or replace an existing one by key.\n     @param attribute attribute with case sensitive key\n     @return these attributes, for chaining\n     ",
      "child_ranges": [
        "(line 168,col 9)-(line 168,col 36)",
        "(line 169,col 9)-(line 169,col 54)",
        "(line 170,col 9)-(line 170,col 32)",
        "(line 171,col 9)-(line 171,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.remove(int)",
      "begin_line": 175,
      "end_line": 185,
      "comment": " removes and shifts up",
      "child_ranges": [
        "(line 176,col 9)-(line 176,col 40)",
        "(line 177,col 9)-(line 177,col 39)",
        "(line 178,col 9)-(line 181,col 9)",
        "(line 182,col 9)-(line 182,col 15)",
        "(line 183,col 9)-(line 183,col 26)",
        "(line 184,col 9)-(line 184,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.remove(java.lang.String)",
      "begin_line": 191,
      "end_line": 195,
      "comment": "\n     Remove an attribute by key. \u003cb\u003eCase sensitive.\u003c/b\u003e\n     @param key attribute key to remove\n     ",
      "child_ranges": [
        "(line 192,col 9)-(line 192,col 32)",
        "(line 193,col 9)-(line 194,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.removeIgnoreCase(java.lang.String)",
      "begin_line": 201,
      "end_line": 205,
      "comment": "\n     Remove an attribute by key. \u003cb\u003eCase insensitive.\u003c/b\u003e\n     @param key attribute key to remove\n     ",
      "child_ranges": [
        "(line 202,col 9)-(line 202,col 42)",
        "(line 203,col 9)-(line 204,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.hasKey(java.lang.String)",
      "begin_line": 212,
      "end_line": 214,
      "comment": "\n     Tests if these attributes contain an attribute with this key.\n     @param key case-sensitive key to check for\n     @return true if key exists, false otherwise\n     ",
      "child_ranges": [
        "(line 213,col 9)-(line 213,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.hasKeyIgnoreCase(java.lang.String)",
      "begin_line": 221,
      "end_line": 223,
      "comment": "\n     Tests if these attributes contain an attribute with this key.\n     @param key key to check for\n     @return true if key exists, false otherwise\n     ",
      "child_ranges": [
        "(line 222,col 9)-(line 222,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.size()",
      "begin_line": 229,
      "end_line": 231,
      "comment": "\n     Get the number of attributes in this set.\n     @return size\n     ",
      "child_ranges": [
        "(line 230,col 9)-(line 230,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.addAll(org.jsoup.nodes.Attributes)",
      "begin_line": 237,
      "end_line": 247,
      "comment": "\n     Add all the attributes from the incoming set to this set.\n     @param incoming attributes to add to these attributes.\n     ",
      "child_ranges": [
        "(line 238,col 9)-(line 239,col 19)",
        "(line 240,col 9)-(line 240,col 44)",
        "(line 242,col 9)-(line 245,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.iterator()",
      "begin_line": 249,
      "end_line": 270,
      "comment": "",
      "child_ranges": [
        "(line 250,col 9)-(line 269,col 10)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "i"
      ],
      "begin_line": 251,
      "end_line": 251,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.Anonymous-0efd3dd3-e4fb-4955-8b56-a0bbd9415d63.hasNext()",
      "begin_line": 253,
      "end_line": 256,
      "comment": "",
      "child_ranges": [
        "(line 255,col 17)-(line 255,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.Anonymous-620e1452-7d27-46bf-8085-a165717371bf.next()",
      "begin_line": 258,
      "end_line": 263,
      "comment": "",
      "child_ranges": [
        "(line 260,col 17)-(line 260,col 88)",
        "(line 261,col 17)-(line 261,col 20)",
        "(line 262,col 17)-(line 262,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.Anonymous-9fb72d51-b419-46ae-ba55-406bad08a46e.remove()",
      "begin_line": 265,
      "end_line": 268,
      "comment": "",
      "child_ranges": [
        "(line 267,col 17)-(line 267,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.asList()",
      "begin_line": 276,
      "end_line": 285,
      "comment": "\n     Get the attributes as a List, for iteration.\n     @return an view of the attributes as an unmodifialbe List.\n     ",
      "child_ranges": [
        "(line 277,col 9)-(line 277,col 58)",
        "(line 278,col 9)-(line 283,col 9)",
        "(line 284,col 9)-(line 284,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.dataset()",
      "begin_line": 292,
      "end_line": 294,
      "comment": "\n     * Retrieves a filtered view of attributes that are HTML5 custom data attributes; that is, attributes with keys\n     * starting with {@code data-}.\n     * @return map of custom data attributes.\n     ",
      "child_ranges": [
        "(line 293,col 9)-(line 293,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.html()",
      "begin_line": 301,
      "end_line": 309,
      "comment": "\n     Get the HTML representation of these attributes.\n     @return HTML\n     @throws SerializationException if the HTML representation of the attributes cannot be constructed.\n     ",
      "child_ranges": [
        "(line 302,col 9)-(line 302,col 54)",
        "(line 303,col 9)-(line 307,col 9)",
        "(line 308,col 9)-(line 308,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.html(java.lang.Appendable, org.jsoup.nodes.Document.OutputSettings)",
      "begin_line": 311,
      "end_line": 326,
      "comment": "",
      "child_ranges": [
        "(line 312,col 9)-(line 312,col 28)",
        "(line 313,col 9)-(line 325,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.toString()",
      "begin_line": 328,
      "end_line": 331,
      "comment": "",
      "child_ranges": [
        "(line 330,col 9)-(line 330,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.equals(java.lang.Object)",
      "begin_line": 338,
      "end_line": 348,
      "comment": "\n     * Checks if these attributes are equal to another set of attributes, by comparing the two sets\n     * @param o attributes to compare with\n     * @return if both sets of attributes have the same content\n     ",
      "child_ranges": [
        "(line 340,col 9)-(line 340,col 35)",
        "(line 341,col 9)-(line 341,col 66)",
        "(line 343,col 9)-(line 343,col 41)",
        "(line 345,col 9)-(line 345,col 44)",
        "(line 346,col 9)-(line 346,col 58)",
        "(line 347,col 9)-(line 347,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.hashCode()",
      "begin_line": 354,
      "end_line": 360,
      "comment": "\n     * Calculates the hashcode of these attributes, by iterating all attributes and summing their hashcodes.\n     * @return calculated hashcode\n     ",
      "child_ranges": [
        "(line 356,col 9)-(line 356,col 26)",
        "(line 357,col 9)-(line 357,col 53)",
        "(line 358,col 9)-(line 358,col 53)",
        "(line 359,col 9)-(line 359,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.clone()",
      "begin_line": 362,
      "end_line": 374,
      "comment": "",
      "child_ranges": [
        "(line 364,col 9)-(line 364,col 25)",
        "(line 365,col 9)-(line 369,col 9)",
        "(line 370,col 9)-(line 370,col 26)",
        "(line 371,col 9)-(line 371,col 34)",
        "(line 372,col 9)-(line 372,col 34)",
        "(line 373,col 9)-(line 373,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.normalize()",
      "begin_line": 379,
      "end_line": 383,
      "comment": "\n     * Internal method. Lowercases all keys.\n     ",
      "child_ranges": [
        "(line 380,col 9)-(line 382,col 9)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Dataset",
      "is_interface": false,
      "parent_types": [
        "java.util.AbstractMap\u003cjava.lang.String, java.lang.String\u003e"
      ],
      "begin_line": 385,
      "end_line": 441,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "attributes"
      ],
      "begin_line": 386,
      "end_line": 386,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.nodes.Attributes.Dataset.Dataset(org.jsoup.nodes.Attributes)",
      "begin_line": 388,
      "end_line": 390,
      "comment": "",
      "child_ranges": [
        "(line 389,col 13)-(line 389,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.Dataset.entrySet()",
      "begin_line": 392,
      "end_line": 395,
      "comment": "",
      "child_ranges": [
        "(line 394,col 13)-(line 394,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.Dataset.put(java.lang.String, java.lang.String)",
      "begin_line": 397,
      "end_line": 403,
      "comment": "",
      "child_ranges": [
        "(line 399,col 13)-(line 399,col 42)",
        "(line 400,col 13)-(line 400,col 90)",
        "(line 401,col 13)-(line 401,col 43)",
        "(line 402,col 13)-(line 402,col 28)"
      ]
    },
    {
      "type": "class_interface",
      "name": "EntrySet",
      "is_interface": false,
      "parent_types": [
        "java.util.AbstractSet\u003cjava.util.Map.Entry\u003cjava.lang.String, java.lang.String\u003e\u003e"
      ],
      "begin_line": 405,
      "end_line": 420,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.Dataset.EntrySet.iterator()",
      "begin_line": 407,
      "end_line": 410,
      "comment": "",
      "child_ranges": [
        "(line 409,col 17)-(line 409,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.Dataset.EntrySet.size()",
      "begin_line": 412,
      "end_line": 419,
      "comment": "",
      "child_ranges": [
        "(line 414,col 17)-(line 414,col 30)",
        "(line 415,col 17)-(line 415,col 54)",
        "(line 416,col 17)-(line 417,col 28)",
        "(line 418,col 17)-(line 418,col 29)"
      ]
    },
    {
      "type": "class_interface",
      "name": "DatasetIterator",
      "is_interface": false,
      "parent_types": [
        "java.util.Iterator\u003cjava.util.Map.Entry\u003cjava.lang.String, java.lang.String\u003e\u003e"
      ],
      "begin_line": 422,
      "end_line": 440,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "attrIter"
      ],
      "begin_line": 423,
      "end_line": 423,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "attr"
      ],
      "begin_line": 424,
      "end_line": 424,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.Dataset.DatasetIterator.hasNext()",
      "begin_line": 425,
      "end_line": 431,
      "comment": "",
      "child_ranges": [
        "(line 426,col 17)-(line 429,col 17)",
        "(line 430,col 17)-(line 430,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.Dataset.DatasetIterator.next()",
      "begin_line": 433,
      "end_line": 435,
      "comment": "",
      "child_ranges": [
        "(line 434,col 17)-(line 434,col 100)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.Dataset.DatasetIterator.remove()",
      "begin_line": 437,
      "end_line": 439,
      "comment": "",
      "child_ranges": [
        "(line 438,col 17)-(line 438,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attributes.dataKey(java.lang.String)",
      "begin_line": 443,
      "end_line": 445,
      "comment": "",
      "child_ranges": [
        "(line 444,col 9)-(line 444,col 32)"
      ]
    }
  ]
}