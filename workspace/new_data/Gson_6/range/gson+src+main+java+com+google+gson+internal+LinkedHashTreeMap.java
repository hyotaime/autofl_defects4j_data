{
  "filepath": "/tmp/Gson-6b/gson/src/main/java/com/google/gson/internal/LinkedHashTreeMap.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "LinkedHashTreeMap",
      "is_interface": false,
      "parent_types": [
        "java.util.AbstractMap\u003cK, V\u003e",
        "java.io.Serializable"
      ],
      "begin_line": 40,
      "end_line": 864,
      "comment": "\n * A map of comparable keys to values. Unlike {@code TreeMap}, this class uses\n * insertion order for iteration order. Comparison order is only used as an\n * optimization for efficient insertion and removal.\n *\n * \u003cp\u003eThis implementation was derived from Android 4.1\u0027s TreeMap and\n * LinkedHashMap classes.\n "
    },
    {
      "type": "field",
      "varNames": [
        "NATURAL_ORDER"
      ],
      "begin_line": 41,
      "end_line": 46,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.LinkedHashTreeMap.Anonymous-332a9bde-bed2-45cf-83ec-76f85ab94ef8.compare(java.lang.Comparable, java.lang.Comparable)",
      "begin_line": 43,
      "end_line": 45,
      "comment": "",
      "child_ranges": [
        "(line 44,col 7)-(line 44,col 28)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "comparator"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "table"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "header"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "size"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "modCount"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "threshold"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.gson.internal.LinkedHashTreeMap.LinkedHashTreeMap()",
      "begin_line": 59,
      "end_line": 62,
      "comment": "\n   * Create a natural order, empty tree map whose keys must be mutually\n   * comparable and non-null.\n   ",
      "child_ranges": [
        "(line 61,col 5)-(line 61,col 48)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.gson.internal.LinkedHashTreeMap.LinkedHashTreeMap(java.util.Comparator\u003c? super K\u003e)",
      "begin_line": 71,
      "end_line": 79,
      "comment": "\n   * Create a tree map ordered by {@code comparator}. This map\u0027s keys may only\n   * be null if {@code comparator} permits.\n   *\n   * @param comparator the comparator to order elements with, or {@code null} to\n   *     use the natural ordering.\n   ",
      "child_ranges": [
        "(line 73,col 5)-(line 75,col 37)",
        "(line 76,col 5)-(line 76,col 35)",
        "(line 77,col 5)-(line 77,col 30)",
        "(line 78,col 5)-(line 78,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.LinkedHashTreeMap.size()",
      "begin_line": 81,
      "end_line": 83,
      "comment": "",
      "child_ranges": [
        "(line 82,col 5)-(line 82,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.LinkedHashTreeMap.get(java.lang.Object)",
      "begin_line": 85,
      "end_line": 88,
      "comment": "",
      "child_ranges": [
        "(line 86,col 5)-(line 86,col 40)",
        "(line 87,col 5)-(line 87,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.LinkedHashTreeMap.containsKey(java.lang.Object)",
      "begin_line": 90,
      "end_line": 92,
      "comment": "",
      "child_ranges": [
        "(line 91,col 5)-(line 91,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.LinkedHashTreeMap.put(K, V)",
      "begin_line": 94,
      "end_line": 102,
      "comment": "",
      "child_ranges": [
        "(line 95,col 5)-(line 97,col 5)",
        "(line 98,col 5)-(line 98,col 41)",
        "(line 99,col 5)-(line 99,col 29)",
        "(line 100,col 5)-(line 100,col 26)",
        "(line 101,col 5)-(line 101,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.LinkedHashTreeMap.clear()",
      "begin_line": 104,
      "end_line": 118,
      "comment": "",
      "child_ranges": [
        "(line 105,col 5)-(line 105,col 29)",
        "(line 106,col 5)-(line 106,col 13)",
        "(line 107,col 5)-(line 107,col 15)",
        "(line 110,col 5)-(line 110,col 36)",
        "(line 111,col 5)-(line 115,col 5)",
        "(line 117,col 5)-(line 117,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.LinkedHashTreeMap.remove(java.lang.Object)",
      "begin_line": 120,
      "end_line": 123,
      "comment": "",
      "child_ranges": [
        "(line 121,col 5)-(line 121,col 47)",
        "(line 122,col 5)-(line 122,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.LinkedHashTreeMap.find(K, boolean)",
      "begin_line": 131,
      "end_line": 197,
      "comment": "\n   * Returns the node at or adjacent to the given key, creating it if requested.\n   *\n   * @throws ClassCastException if {@code key} and the tree\u0027s keys aren\u0027t\n   *     mutually comparable.\n   ",
      "child_ranges": [
        "(line 132,col 5)-(line 132,col 55)",
        "(line 133,col 5)-(line 133,col 36)",
        "(line 134,col 5)-(line 134,col 45)",
        "(line 135,col 5)-(line 135,col 42)",
        "(line 136,col 5)-(line 136,col 38)",
        "(line 137,col 5)-(line 137,col 23)",
        "(line 139,col 5)-(line 164,col 5)",
        "(line 167,col 5)-(line 169,col 5)",
        "(line 172,col 5)-(line 172,col 36)",
        "(line 173,col 5)-(line 173,col 23)",
        "(line 174,col 5)-(line 189,col 5)",
        "(line 191,col 5)-(line 193,col 5)",
        "(line 194,col 5)-(line 194,col 15)",
        "(line 196,col 5)-(line 196,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.LinkedHashTreeMap.findByObject(java.lang.Object)",
      "begin_line": 199,
      "end_line": 206,
      "comment": "",
      "child_ranges": [
        "(line 201,col 5)-(line 205,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.LinkedHashTreeMap.findByEntry(java.util.Map.Entry\u003c?, ?\u003e)",
      "begin_line": 217,
      "end_line": 221,
      "comment": "\n   * Returns this map\u0027s entry that has the same key and value as {@code\n   * entry}, or null if this map has no such entry.\n   *\n   * \u003cp\u003eThis method uses the comparator for key equality rather than {@code\n   * equals}. If this map\u0027s comparator isn\u0027t consistent with equals (such as\n   * {@code String.CASE_INSENSITIVE_ORDER}), then {@code remove()} and {@code\n   * contains()} will violate the collections API.\n   ",
      "child_ranges": [
        "(line 218,col 5)-(line 218,col 51)",
        "(line 219,col 5)-(line 219,col 78)",
        "(line 220,col 5)-(line 220,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.LinkedHashTreeMap.equal(java.lang.Object, java.lang.Object)",
      "begin_line": 223,
      "end_line": 225,
      "comment": "",
      "child_ranges": [
        "(line 224,col 5)-(line 224,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.LinkedHashTreeMap.secondaryHash(int)",
      "begin_line": 233,
      "end_line": 237,
      "comment": "\n   * Applies a supplemental hash function to a given hashCode, which defends\n   * against poor quality hash functions. This is critical because HashMap\n   * uses power-of-two length hash tables, that otherwise encounter collisions\n   * for hashCodes that do not differ in lower or upper bits.\n   ",
      "child_ranges": [
        "(line 235,col 5)-(line 235,col 33)",
        "(line 236,col 5)-(line 236,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.LinkedHashTreeMap.removeInternal(com.google.gson.internal.LinkedHashTreeMap.Node\u003cK, V\u003e, boolean)",
      "begin_line": 245,
      "end_line": 301,
      "comment": "\n   * Removes {@code node} from this tree, rearranging the tree\u0027s structure as\n   * necessary.\n   *\n   * @param unlink true to also unlink this node from the iteration linked list.\n   ",
      "child_ranges": [
        "(line 246,col 5)-(line 250,col 5)",
        "(line 252,col 5)-(line 252,col 32)",
        "(line 253,col 5)-(line 253,col 34)",
        "(line 254,col 5)-(line 254,col 44)",
        "(line 255,col 5)-(line 296,col 5)",
        "(line 298,col 5)-(line 298,col 37)",
        "(line 299,col 5)-(line 299,col 11)",
        "(line 300,col 5)-(line 300,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.LinkedHashTreeMap.removeInternalByKey(java.lang.Object)",
      "begin_line": 303,
      "end_line": 309,
      "comment": "",
      "child_ranges": [
        "(line 304,col 5)-(line 304,col 40)",
        "(line 305,col 5)-(line 307,col 5)",
        "(line 308,col 5)-(line 308,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.LinkedHashTreeMap.replaceInParent(com.google.gson.internal.LinkedHashTreeMap.Node\u003cK, V\u003e, com.google.gson.internal.LinkedHashTreeMap.Node\u003cK, V\u003e)",
      "begin_line": 311,
      "end_line": 329,
      "comment": "",
      "child_ranges": [
        "(line 312,col 5)-(line 312,col 36)",
        "(line 313,col 5)-(line 313,col 23)",
        "(line 314,col 5)-(line 316,col 5)",
        "(line 318,col 5)-(line 328,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.LinkedHashTreeMap.rebalance(com.google.gson.internal.LinkedHashTreeMap.Node\u003cK, V\u003e, boolean)",
      "begin_line": 338,
      "end_line": 396,
      "comment": "\n   * Rebalances the tree by making any AVL rotations necessary between the\n   * newly-unbalanced node and the tree\u0027s root.\n   *\n   * @param insert true if the node was unbalanced by an insert; false if it\n   *     was by a removal.\n   ",
      "child_ranges": [
        "(line 339,col 5)-(line 395,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.LinkedHashTreeMap.rotateLeft(com.google.gson.internal.LinkedHashTreeMap.Node\u003cK, V\u003e)",
      "begin_line": 401,
      "end_line": 424,
      "comment": "\n   * Rotates the subtree so that its root\u0027s right child is the new root.\n   ",
      "child_ranges": [
        "(line 402,col 5)-(line 402,col 32)",
        "(line 403,col 5)-(line 403,col 34)",
        "(line 404,col 5)-(line 404,col 38)",
        "(line 405,col 5)-(line 405,col 40)",
        "(line 408,col 5)-(line 408,col 27)",
        "(line 409,col 5)-(line 411,col 5)",
        "(line 413,col 5)-(line 413,col 33)",
        "(line 416,col 5)-(line 416,col 22)",
        "(line 417,col 5)-(line 417,col 24)",
        "(line 420,col 5)-(line 421,col 54)",
        "(line 422,col 5)-(line 423,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.LinkedHashTreeMap.rotateRight(com.google.gson.internal.LinkedHashTreeMap.Node\u003cK, V\u003e)",
      "begin_line": 429,
      "end_line": 452,
      "comment": "\n   * Rotates the subtree so that its root\u0027s left child is the new root.\n   ",
      "child_ranges": [
        "(line 430,col 5)-(line 430,col 33)",
        "(line 431,col 5)-(line 431,col 34)",
        "(line 432,col 5)-(line 432,col 38)",
        "(line 433,col 5)-(line 433,col 40)",
        "(line 436,col 5)-(line 436,col 27)",
        "(line 437,col 5)-(line 439,col 5)",
        "(line 441,col 5)-(line 441,col 33)",
        "(line 444,col 5)-(line 444,col 23)",
        "(line 445,col 5)-(line 445,col 24)",
        "(line 448,col 5)-(line 449,col 56)",
        "(line 450,col 5)-(line 451,col 54)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "entrySet"
      ],
      "begin_line": 454,
      "end_line": 454,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "keySet"
      ],
      "begin_line": 455,
      "end_line": 455,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.LinkedHashTreeMap.entrySet()",
      "begin_line": 457,
      "end_line": 460,
      "comment": "",
      "child_ranges": [
        "(line 458,col 5)-(line 458,col 31)",
        "(line 459,col 5)-(line 459,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.LinkedHashTreeMap.keySet()",
      "begin_line": 462,
      "end_line": 465,
      "comment": "",
      "child_ranges": [
        "(line 463,col 5)-(line 463,col 27)",
        "(line 464,col 5)-(line 464,col 61)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Node",
      "is_interface": false,
      "parent_types": [
        "java.util.Map.Entry\u003cK, V\u003e"
      ],
      "begin_line": 467,
      "end_line": 555,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "parent"
      ],
      "begin_line": 468,
      "end_line": 468,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "left"
      ],
      "begin_line": 469,
      "end_line": 469,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "right"
      ],
      "begin_line": 470,
      "end_line": 470,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "next"
      ],
      "begin_line": 471,
      "end_line": 471,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "prev"
      ],
      "begin_line": 472,
      "end_line": 472,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "key"
      ],
      "begin_line": 473,
      "end_line": 473,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "hash"
      ],
      "begin_line": 474,
      "end_line": 474,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 475,
      "end_line": 475,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "height"
      ],
      "begin_line": 476,
      "end_line": 476,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.gson.internal.LinkedHashTreeMap.Node.Node()",
      "begin_line": 479,
      "end_line": 483,
      "comment": " Create the header entry ",
      "child_ranges": [
        "(line 480,col 7)-(line 480,col 17)",
        "(line 481,col 7)-(line 481,col 16)",
        "(line 482,col 7)-(line 482,col 25)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.gson.internal.LinkedHashTreeMap.Node.Node(com.google.gson.internal.LinkedHashTreeMap.Node\u003cK, V\u003e, K, int, com.google.gson.internal.LinkedHashTreeMap.Node\u003cK, V\u003e, com.google.gson.internal.LinkedHashTreeMap.Node\u003cK, V\u003e)",
      "begin_line": 486,
      "end_line": 495,
      "comment": " Create a regular entry ",
      "child_ranges": [
        "(line 487,col 7)-(line 487,col 27)",
        "(line 488,col 7)-(line 488,col 21)",
        "(line 489,col 7)-(line 489,col 23)",
        "(line 490,col 7)-(line 490,col 22)",
        "(line 491,col 7)-(line 491,col 23)",
        "(line 492,col 7)-(line 492,col 23)",
        "(line 493,col 7)-(line 493,col 23)",
        "(line 494,col 7)-(line 494,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.LinkedHashTreeMap.Node.getKey()",
      "begin_line": 497,
      "end_line": 499,
      "comment": "",
      "child_ranges": [
        "(line 498,col 7)-(line 498,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.LinkedHashTreeMap.Node.getValue()",
      "begin_line": 501,
      "end_line": 503,
      "comment": "",
      "child_ranges": [
        "(line 502,col 7)-(line 502,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.LinkedHashTreeMap.Node.setValue(V)",
      "begin_line": 505,
      "end_line": 509,
      "comment": "",
      "child_ranges": [
        "(line 506,col 7)-(line 506,col 30)",
        "(line 507,col 7)-(line 507,col 25)",
        "(line 508,col 7)-(line 508,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.LinkedHashTreeMap.Node.equals(java.lang.Object)",
      "begin_line": 511,
      "end_line": 519,
      "comment": "",
      "child_ranges": [
        "(line 513,col 7)-(line 517,col 7)",
        "(line 518,col 7)-(line 518,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.LinkedHashTreeMap.Node.hashCode()",
      "begin_line": 521,
      "end_line": 524,
      "comment": "",
      "child_ranges": [
        "(line 522,col 7)-(line 523,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.LinkedHashTreeMap.Node.toString()",
      "begin_line": 526,
      "end_line": 528,
      "comment": "",
      "child_ranges": [
        "(line 527,col 7)-(line 527,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.LinkedHashTreeMap.Node.first()",
      "begin_line": 533,
      "end_line": 541,
      "comment": "\n     * Returns the first node in this subtree.\n     ",
      "child_ranges": [
        "(line 534,col 7)-(line 534,col 29)",
        "(line 535,col 7)-(line 535,col 35)",
        "(line 536,col 7)-(line 539,col 7)",
        "(line 540,col 7)-(line 540,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.LinkedHashTreeMap.Node.last()",
      "begin_line": 546,
      "end_line": 554,
      "comment": "\n     * Returns the last node in this subtree.\n     ",
      "child_ranges": [
        "(line 547,col 7)-(line 547,col 29)",
        "(line 548,col 7)-(line 548,col 36)",
        "(line 549,col 7)-(line 552,col 7)",
        "(line 553,col 7)-(line 553,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.LinkedHashTreeMap.doubleCapacity()",
      "begin_line": 557,
      "end_line": 560,
      "comment": "",
      "child_ranges": [
        "(line 558,col 5)-(line 558,col 34)",
        "(line 559,col 5)-(line 559,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.LinkedHashTreeMap.doubleCapacity(com.google.gson.internal.LinkedHashTreeMap.Node\u003cK, V\u003e[])",
      "begin_line": 566,
      "end_line": 611,
      "comment": "\n   * Returns a new array containing the same nodes as {@code oldTable}, but with\n   * twice as many trees, each of (approximately) half the previous size.\n   ",
      "child_ranges": [
        "(line 568,col 5)-(line 568,col 38)",
        "(line 569,col 5)-(line 570,col 54)",
        "(line 571,col 5)-(line 571,col 57)",
        "(line 572,col 5)-(line 572,col 58)",
        "(line 573,col 5)-(line 573,col 59)",
        "(line 576,col 5)-(line 609,col 5)",
        "(line 610,col 5)-(line 610,col 20)"
      ]
    },
    {
      "type": "class_interface",
      "name": "AvlIterator",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 622,
      "end_line": 650,
      "comment": "\n   * Walks an AVL tree in iteration order. Once a node has been returned, its\n   * left, right and parent links are \u003cstrong\u003eno longer used\u003c/strong\u003e. For this\n   * reason it is safe to transform these links as you walk a tree.\n   *\n   * \u003cp\u003e\u003cstrong\u003eWarning:\u003c/strong\u003e this iterator is destructive. It clears the\n   * parent node of all nodes in the tree. It is an error to make a partial\n   * iteration of a tree.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "stackTop"
      ],
      "begin_line": 624,
      "end_line": 624,
      "comment": " This stack is a singly linked list, linked by the \u0027parent\u0027 field. "
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.LinkedHashTreeMap.AvlIterator.reset(com.google.gson.internal.LinkedHashTreeMap.Node\u003cK, V\u003e)",
      "begin_line": 626,
      "end_line": 633,
      "comment": "",
      "child_ranges": [
        "(line 627,col 7)-(line 627,col 33)",
        "(line 628,col 7)-(line 631,col 7)",
        "(line 632,col 7)-(line 632,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.LinkedHashTreeMap.AvlIterator.next()",
      "begin_line": 635,
      "end_line": 649,
      "comment": "",
      "child_ranges": [
        "(line 636,col 7)-(line 636,col 42)",
        "(line 637,col 7)-(line 639,col 7)",
        "(line 640,col 7)-(line 640,col 35)",
        "(line 641,col 7)-(line 641,col 31)",
        "(line 642,col 7)-(line 642,col 27)",
        "(line 643,col 7)-(line 646,col 7)",
        "(line 647,col 7)-(line 647,col 31)",
        "(line 648,col 7)-(line 648,col 20)"
      ]
    },
    {
      "type": "class_interface",
      "name": "AvlBuilder",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 670,
      "end_line": 758,
      "comment": "\n   * Builds AVL trees of a predetermined size by accepting nodes of increasing\n   * value. To use:\n   * \u003col\u003e\n   *   \u003cli\u003eCall {@link #reset} to initialize the target size \u003ci\u003esize\u003c/i\u003e.\n   *   \u003cli\u003eCall {@link #add} \u003ci\u003esize\u003c/i\u003e times with increasing values.\n   *   \u003cli\u003eCall {@link #root} to get the root of the balanced tree.\n   * \u003c/ol\u003e\n   *\n   * \u003cp\u003eThe returned tree will satisfy the AVL constraint: for every node\n   * \u003ci\u003eN\u003c/i\u003e, the height of \u003ci\u003eN.left\u003c/i\u003e and \u003ci\u003eN.right\u003c/i\u003e is different by at\n   * most 1. It accomplishes this by omitting deepest-level leaf nodes when\n   * building trees whose size isn\u0027t a power of 2 minus 1.\n   *\n   * \u003cp\u003eUnlike rebuilding a tree from scratch, this approach requires no value\n   * comparisons. Using this class to create a tree of size \u003ci\u003eS\u003c/i\u003e is\n   * {@code O(S)}.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "stack"
      ],
      "begin_line": 672,
      "end_line": 672,
      "comment": " This stack is a singly linked list, linked by the \u0027parent\u0027 field. "
    },
    {
      "type": "field",
      "varNames": [
        "leavesToSkip"
      ],
      "begin_line": 673,
      "end_line": 673,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "leavesSkipped"
      ],
      "begin_line": 674,
      "end_line": 674,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "size"
      ],
      "begin_line": 675,
      "end_line": 675,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.LinkedHashTreeMap.AvlBuilder.reset(int)",
      "begin_line": 677,
      "end_line": 684,
      "comment": "",
      "child_ranges": [
        "(line 679,col 7)-(line 679,col 67)",
        "(line 680,col 7)-(line 680,col 47)",
        "(line 681,col 7)-(line 681,col 15)",
        "(line 682,col 7)-(line 682,col 24)",
        "(line 683,col 7)-(line 683,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.LinkedHashTreeMap.AvlBuilder.add(com.google.gson.internal.LinkedHashTreeMap.Node\u003cK, V\u003e)",
      "begin_line": 686,
      "end_line": 749,
      "comment": "",
      "child_ranges": [
        "(line 687,col 7)-(line 687,col 50)",
        "(line 688,col 7)-(line 688,col 22)",
        "(line 691,col 7)-(line 695,col 7)",
        "(line 697,col 7)-(line 697,col 26)",
        "(line 698,col 7)-(line 698,col 19)",
        "(line 699,col 7)-(line 699,col 13)",
        "(line 702,col 7)-(line 706,col 7)",
        "(line 721,col 7)-(line 748,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.LinkedHashTreeMap.AvlBuilder.root()",
      "begin_line": 751,
      "end_line": 757,
      "comment": "",
      "child_ranges": [
        "(line 752,col 7)-(line 752,col 39)",
        "(line 753,col 7)-(line 755,col 7)",
        "(line 756,col 7)-(line 756,col 22)"
      ]
    },
    {
      "type": "class_interface",
      "name": "LinkedTreeMapIterator",
      "is_interface": false,
      "parent_types": [
        "java.util.Iterator\u003cT\u003e"
      ],
      "begin_line": 760,
      "end_line": 792,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "next"
      ],
      "begin_line": 761,
      "end_line": 761,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "lastReturned"
      ],
      "begin_line": 762,
      "end_line": 762,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "expectedModCount"
      ],
      "begin_line": 763,
      "end_line": 763,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.gson.internal.LinkedHashTreeMap.LinkedTreeMapIterator.LinkedTreeMapIterator()",
      "begin_line": 765,
      "end_line": 766,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.LinkedHashTreeMap.LinkedTreeMapIterator.hasNext()",
      "begin_line": 768,
      "end_line": 770,
      "comment": "",
      "child_ranges": [
        "(line 769,col 7)-(line 769,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.LinkedHashTreeMap.LinkedTreeMapIterator.nextNode()",
      "begin_line": 772,
      "end_line": 782,
      "comment": "",
      "child_ranges": [
        "(line 773,col 7)-(line 773,col 26)",
        "(line 774,col 7)-(line 776,col 7)",
        "(line 777,col 7)-(line 779,col 7)",
        "(line 780,col 7)-(line 780,col 20)",
        "(line 781,col 7)-(line 781,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.LinkedHashTreeMap.LinkedTreeMapIterator.remove()",
      "begin_line": 784,
      "end_line": 791,
      "comment": "",
      "child_ranges": [
        "(line 785,col 7)-(line 787,col 7)",
        "(line 788,col 7)-(line 788,col 41)",
        "(line 789,col 7)-(line 789,col 26)",
        "(line 790,col 7)-(line 790,col 34)"
      ]
    },
    {
      "type": "class_interface",
      "name": "EntrySet",
      "is_interface": false,
      "parent_types": [
        "java.util.AbstractSet\u003cjava.util.Map.Entry\u003cK, V\u003e\u003e"
      ],
      "begin_line": 794,
      "end_line": 827,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.LinkedHashTreeMap.EntrySet.size()",
      "begin_line": 795,
      "end_line": 797,
      "comment": "",
      "child_ranges": [
        "(line 796,col 7)-(line 796,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.LinkedHashTreeMap.EntrySet.iterator()",
      "begin_line": 799,
      "end_line": 805,
      "comment": "",
      "child_ranges": [
        "(line 800,col 7)-(line 804,col 8)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.LinkedHashTreeMap.EntrySet.Anonymous-5b9f308f-5be0-469f-9b9b-94bf06ba72df.next()",
      "begin_line": 801,
      "end_line": 803,
      "comment": "",
      "child_ranges": [
        "(line 802,col 11)-(line 802,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.LinkedHashTreeMap.EntrySet.contains(java.lang.Object)",
      "begin_line": 807,
      "end_line": 809,
      "comment": "",
      "child_ranges": [
        "(line 808,col 7)-(line 808,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.LinkedHashTreeMap.EntrySet.remove(java.lang.Object)",
      "begin_line": 811,
      "end_line": 822,
      "comment": "",
      "child_ranges": [
        "(line 812,col 7)-(line 814,col 7)",
        "(line 816,col 7)-(line 816,col 53)",
        "(line 817,col 7)-(line 819,col 7)",
        "(line 820,col 7)-(line 820,col 33)",
        "(line 821,col 7)-(line 821,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.LinkedHashTreeMap.EntrySet.clear()",
      "begin_line": 824,
      "end_line": 826,
      "comment": "",
      "child_ranges": [
        "(line 825,col 7)-(line 825,col 37)"
      ]
    },
    {
      "type": "class_interface",
      "name": "KeySet",
      "is_interface": false,
      "parent_types": [
        "java.util.AbstractSet\u003cK\u003e"
      ],
      "begin_line": 829,
      "end_line": 853,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.LinkedHashTreeMap.KeySet.size()",
      "begin_line": 830,
      "end_line": 832,
      "comment": "",
      "child_ranges": [
        "(line 831,col 7)-(line 831,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.LinkedHashTreeMap.KeySet.iterator()",
      "begin_line": 834,
      "end_line": 840,
      "comment": "",
      "child_ranges": [
        "(line 835,col 7)-(line 839,col 8)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.LinkedHashTreeMap.KeySet.Anonymous-e3af4191-efe3-4fdb-b6e2-bd24b32d945e.next()",
      "begin_line": 836,
      "end_line": 838,
      "comment": "",
      "child_ranges": [
        "(line 837,col 11)-(line 837,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.LinkedHashTreeMap.KeySet.contains(java.lang.Object)",
      "begin_line": 842,
      "end_line": 844,
      "comment": "",
      "child_ranges": [
        "(line 843,col 7)-(line 843,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.LinkedHashTreeMap.KeySet.remove(java.lang.Object)",
      "begin_line": 846,
      "end_line": 848,
      "comment": "",
      "child_ranges": [
        "(line 847,col 7)-(line 847,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.LinkedHashTreeMap.KeySet.clear()",
      "begin_line": 850,
      "end_line": 852,
      "comment": "",
      "child_ranges": [
        "(line 851,col 7)-(line 851,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.LinkedHashTreeMap.writeReplace()",
      "begin_line": 861,
      "end_line": 863,
      "comment": "\n   * If somebody is unlucky enough to have to serialize one of these, serialize\n   * it as a LinkedHashMap so that they won\u0027t need Gson on the other side to\n   * deserialize it. Using serialization defeats our DoS defence, so most apps\n   * shouldn\u0027t use it.\n   ",
      "child_ranges": [
        "(line 862,col 5)-(line 862,col 41)"
      ]
    }
  ]
}