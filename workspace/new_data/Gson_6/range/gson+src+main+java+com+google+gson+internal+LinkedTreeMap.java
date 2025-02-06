{
  "filepath": "/tmp/Gson-6b/gson/src/main/java/com/google/gson/internal/LinkedTreeMap.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "LinkedTreeMap",
      "is_interface": false,
      "parent_types": [
        "java.util.AbstractMap\u003cK, V\u003e",
        "java.io.Serializable"
      ],
      "begin_line": 38,
      "end_line": 630,
      "comment": "\n * A map of comparable keys to values. Unlike {@code TreeMap}, this class uses\n * insertion order for iteration order. Comparison order is only used as an\n * optimization for efficient insertion and removal.\n *\n * \u003cp\u003eThis implementation was derived from Android 4.1\u0027s TreeMap class.\n "
    },
    {
      "type": "field",
      "varNames": [
        "NATURAL_ORDER"
      ],
      "begin_line": 39,
      "end_line": 44,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.LinkedTreeMap.Anonymous-56f1b6ff-9c5b-437b-b1b1-ddfd703e2050.compare(java.lang.Comparable, java.lang.Comparable)",
      "begin_line": 41,
      "end_line": 43,
      "comment": "",
      "child_ranges": [
        "(line 42,col 7)-(line 42,col 28)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "comparator"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "root"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "size"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "modCount"
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
      "begin_line": 52,
      "end_line": 52,
      "comment": " Used to preserve iteration order"
    },
    {
      "type": "constructor",
      "signature": "com.google.gson.internal.LinkedTreeMap.LinkedTreeMap()",
      "begin_line": 58,
      "end_line": 61,
      "comment": "\n   * Create a natural order, empty tree map whose keys must be mutually\n   * comparable and non-null.\n   ",
      "child_ranges": [
        "(line 60,col 5)-(line 60,col 48)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.gson.internal.LinkedTreeMap.LinkedTreeMap(java.util.Comparator\u003c? super K\u003e)",
      "begin_line": 70,
      "end_line": 75,
      "comment": "\n   * Create a tree map ordered by {@code comparator}. This map\u0027s keys may only\n   * be null if {@code comparator} permits.\n   *\n   * @param comparator the comparator to order elements with, or {@code null} to\n   *     use the natural ordering.\n   ",
      "child_ranges": [
        "(line 72,col 5)-(line 74,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.LinkedTreeMap.size()",
      "begin_line": 77,
      "end_line": 79,
      "comment": "",
      "child_ranges": [
        "(line 78,col 5)-(line 78,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.LinkedTreeMap.get(java.lang.Object)",
      "begin_line": 81,
      "end_line": 84,
      "comment": "",
      "child_ranges": [
        "(line 82,col 5)-(line 82,col 40)",
        "(line 83,col 5)-(line 83,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.LinkedTreeMap.containsKey(java.lang.Object)",
      "begin_line": 86,
      "end_line": 88,
      "comment": "",
      "child_ranges": [
        "(line 87,col 5)-(line 87,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.LinkedTreeMap.put(K, V)",
      "begin_line": 90,
      "end_line": 98,
      "comment": "",
      "child_ranges": [
        "(line 91,col 5)-(line 93,col 5)",
        "(line 94,col 5)-(line 94,col 41)",
        "(line 95,col 5)-(line 95,col 29)",
        "(line 96,col 5)-(line 96,col 26)",
        "(line 97,col 5)-(line 97,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.LinkedTreeMap.clear()",
      "begin_line": 100,
      "end_line": 108,
      "comment": "",
      "child_ranges": [
        "(line 101,col 5)-(line 101,col 16)",
        "(line 102,col 5)-(line 102,col 13)",
        "(line 103,col 5)-(line 103,col 15)",
        "(line 106,col 5)-(line 106,col 36)",
        "(line 107,col 5)-(line 107,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.LinkedTreeMap.remove(java.lang.Object)",
      "begin_line": 110,
      "end_line": 113,
      "comment": "",
      "child_ranges": [
        "(line 111,col 5)-(line 111,col 47)",
        "(line 112,col 5)-(line 112,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.LinkedTreeMap.find(K, boolean)",
      "begin_line": 121,
      "end_line": 181,
      "comment": "\n   * Returns the node at or adjacent to the given key, creating it if requested.\n   *\n   * @throws ClassCastException if {@code key} and the tree\u0027s keys aren\u0027t\n   *     mutually comparable.\n   ",
      "child_ranges": [
        "(line 122,col 5)-(line 122,col 55)",
        "(line 123,col 5)-(line 123,col 30)",
        "(line 124,col 5)-(line 124,col 23)",
        "(line 126,col 5)-(line 151,col 5)",
        "(line 154,col 5)-(line 156,col 5)",
        "(line 159,col 5)-(line 159,col 36)",
        "(line 160,col 5)-(line 160,col 23)",
        "(line 161,col 5)-(line 176,col 5)",
        "(line 177,col 5)-(line 177,col 11)",
        "(line 178,col 5)-(line 178,col 15)",
        "(line 180,col 5)-(line 180,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.LinkedTreeMap.findByObject(java.lang.Object)",
      "begin_line": 183,
      "end_line": 190,
      "comment": "",
      "child_ranges": [
        "(line 185,col 5)-(line 189,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.LinkedTreeMap.findByEntry(java.util.Map.Entry\u003c?, ?\u003e)",
      "begin_line": 201,
      "end_line": 205,
      "comment": "\n   * Returns this map\u0027s entry that has the same key and value as {@code\n   * entry}, or null if this map has no such entry.\n   *\n   * \u003cp\u003eThis method uses the comparator for key equality rather than {@code\n   * equals}. If this map\u0027s comparator isn\u0027t consistent with equals (such as\n   * {@code String.CASE_INSENSITIVE_ORDER}), then {@code remove()} and {@code\n   * contains()} will violate the collections API.\n   ",
      "child_ranges": [
        "(line 202,col 5)-(line 202,col 51)",
        "(line 203,col 5)-(line 203,col 78)",
        "(line 204,col 5)-(line 204,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.LinkedTreeMap.equal(java.lang.Object, java.lang.Object)",
      "begin_line": 207,
      "end_line": 209,
      "comment": "",
      "child_ranges": [
        "(line 208,col 5)-(line 208,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.LinkedTreeMap.removeInternal(com.google.gson.internal.LinkedTreeMap.Node\u003cK, V\u003e, boolean)",
      "begin_line": 217,
      "end_line": 274,
      "comment": "\n   * Removes {@code node} from this tree, rearranging the tree\u0027s structure as\n   * necessary.\n   *\n   * @param unlink true to also unlink this node from the iteration linked list.\n   ",
      "child_ranges": [
        "(line 218,col 5)-(line 221,col 5)",
        "(line 223,col 5)-(line 223,col 32)",
        "(line 224,col 5)-(line 224,col 34)",
        "(line 225,col 5)-(line 225,col 44)",
        "(line 226,col 5)-(line 269,col 5)",
        "(line 271,col 5)-(line 271,col 37)",
        "(line 272,col 5)-(line 272,col 11)",
        "(line 273,col 5)-(line 273,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.LinkedTreeMap.removeInternalByKey(java.lang.Object)",
      "begin_line": 276,
      "end_line": 282,
      "comment": "",
      "child_ranges": [
        "(line 277,col 5)-(line 277,col 40)",
        "(line 278,col 5)-(line 280,col 5)",
        "(line 281,col 5)-(line 281,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.LinkedTreeMap.replaceInParent(com.google.gson.internal.LinkedTreeMap.Node\u003cK, V\u003e, com.google.gson.internal.LinkedTreeMap.Node\u003cK, V\u003e)",
      "begin_line": 284,
      "end_line": 301,
      "comment": "",
      "child_ranges": [
        "(line 285,col 5)-(line 285,col 36)",
        "(line 286,col 5)-(line 286,col 23)",
        "(line 287,col 5)-(line 289,col 5)",
        "(line 291,col 5)-(line 300,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.LinkedTreeMap.rebalance(com.google.gson.internal.LinkedTreeMap.Node\u003cK, V\u003e, boolean)",
      "begin_line": 310,
      "end_line": 368,
      "comment": "\n   * Rebalances the tree by making any AVL rotations necessary between the\n   * newly-unbalanced node and the tree\u0027s root.\n   *\n   * @param insert true if the node was unbalanced by an insert; false if it\n   *     was by a removal.\n   ",
      "child_ranges": [
        "(line 311,col 5)-(line 367,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.LinkedTreeMap.rotateLeft(com.google.gson.internal.LinkedTreeMap.Node\u003cK, V\u003e)",
      "begin_line": 373,
      "end_line": 396,
      "comment": "\n   * Rotates the subtree so that its root\u0027s right child is the new root.\n   ",
      "child_ranges": [
        "(line 374,col 5)-(line 374,col 32)",
        "(line 375,col 5)-(line 375,col 34)",
        "(line 376,col 5)-(line 376,col 38)",
        "(line 377,col 5)-(line 377,col 40)",
        "(line 380,col 5)-(line 380,col 27)",
        "(line 381,col 5)-(line 383,col 5)",
        "(line 385,col 5)-(line 385,col 33)",
        "(line 388,col 5)-(line 388,col 22)",
        "(line 389,col 5)-(line 389,col 24)",
        "(line 392,col 5)-(line 393,col 54)",
        "(line 394,col 5)-(line 395,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.LinkedTreeMap.rotateRight(com.google.gson.internal.LinkedTreeMap.Node\u003cK, V\u003e)",
      "begin_line": 401,
      "end_line": 424,
      "comment": "\n   * Rotates the subtree so that its root\u0027s left child is the new root.\n   ",
      "child_ranges": [
        "(line 402,col 5)-(line 402,col 33)",
        "(line 403,col 5)-(line 403,col 34)",
        "(line 404,col 5)-(line 404,col 38)",
        "(line 405,col 5)-(line 405,col 40)",
        "(line 408,col 5)-(line 408,col 27)",
        "(line 409,col 5)-(line 411,col 5)",
        "(line 413,col 5)-(line 413,col 33)",
        "(line 416,col 5)-(line 416,col 23)",
        "(line 417,col 5)-(line 417,col 24)",
        "(line 420,col 5)-(line 421,col 56)",
        "(line 422,col 5)-(line 423,col 54)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "entrySet"
      ],
      "begin_line": 426,
      "end_line": 426,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "keySet"
      ],
      "begin_line": 427,
      "end_line": 427,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.LinkedTreeMap.entrySet()",
      "begin_line": 429,
      "end_line": 432,
      "comment": "",
      "child_ranges": [
        "(line 430,col 5)-(line 430,col 31)",
        "(line 431,col 5)-(line 431,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.LinkedTreeMap.keySet()",
      "begin_line": 434,
      "end_line": 437,
      "comment": "",
      "child_ranges": [
        "(line 435,col 5)-(line 435,col 27)",
        "(line 436,col 5)-(line 436,col 61)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Node",
      "is_interface": false,
      "parent_types": [
        "java.util.Map.Entry\u003cK, V\u003e"
      ],
      "begin_line": 439,
      "end_line": 524,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "parent"
      ],
      "begin_line": 440,
      "end_line": 440,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "left"
      ],
      "begin_line": 441,
      "end_line": 441,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "right"
      ],
      "begin_line": 442,
      "end_line": 442,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "next"
      ],
      "begin_line": 443,
      "end_line": 443,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "prev"
      ],
      "begin_line": 444,
      "end_line": 444,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "key"
      ],
      "begin_line": 445,
      "end_line": 445,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 446,
      "end_line": 446,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "height"
      ],
      "begin_line": 447,
      "end_line": 447,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.gson.internal.LinkedTreeMap.Node.Node()",
      "begin_line": 450,
      "end_line": 453,
      "comment": " Create the header entry ",
      "child_ranges": [
        "(line 451,col 7)-(line 451,col 17)",
        "(line 452,col 7)-(line 452,col 25)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.gson.internal.LinkedTreeMap.Node.Node(com.google.gson.internal.LinkedTreeMap.Node\u003cK, V\u003e, K, com.google.gson.internal.LinkedTreeMap.Node\u003cK, V\u003e, com.google.gson.internal.LinkedTreeMap.Node\u003cK, V\u003e)",
      "begin_line": 456,
      "end_line": 464,
      "comment": " Create a regular entry ",
      "child_ranges": [
        "(line 457,col 7)-(line 457,col 27)",
        "(line 458,col 7)-(line 458,col 21)",
        "(line 459,col 7)-(line 459,col 22)",
        "(line 460,col 7)-(line 460,col 23)",
        "(line 461,col 7)-(line 461,col 23)",
        "(line 462,col 7)-(line 462,col 23)",
        "(line 463,col 7)-(line 463,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.LinkedTreeMap.Node.getKey()",
      "begin_line": 466,
      "end_line": 468,
      "comment": "",
      "child_ranges": [
        "(line 467,col 7)-(line 467,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.LinkedTreeMap.Node.getValue()",
      "begin_line": 470,
      "end_line": 472,
      "comment": "",
      "child_ranges": [
        "(line 471,col 7)-(line 471,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.LinkedTreeMap.Node.setValue(V)",
      "begin_line": 474,
      "end_line": 478,
      "comment": "",
      "child_ranges": [
        "(line 475,col 7)-(line 475,col 30)",
        "(line 476,col 7)-(line 476,col 25)",
        "(line 477,col 7)-(line 477,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.LinkedTreeMap.Node.equals(java.lang.Object)",
      "begin_line": 480,
      "end_line": 488,
      "comment": "",
      "child_ranges": [
        "(line 482,col 7)-(line 486,col 7)",
        "(line 487,col 7)-(line 487,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.LinkedTreeMap.Node.hashCode()",
      "begin_line": 490,
      "end_line": 493,
      "comment": "",
      "child_ranges": [
        "(line 491,col 7)-(line 492,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.LinkedTreeMap.Node.toString()",
      "begin_line": 495,
      "end_line": 497,
      "comment": "",
      "child_ranges": [
        "(line 496,col 7)-(line 496,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.LinkedTreeMap.Node.first()",
      "begin_line": 502,
      "end_line": 510,
      "comment": "\n     * Returns the first node in this subtree.\n     ",
      "child_ranges": [
        "(line 503,col 7)-(line 503,col 29)",
        "(line 504,col 7)-(line 504,col 35)",
        "(line 505,col 7)-(line 508,col 7)",
        "(line 509,col 7)-(line 509,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.LinkedTreeMap.Node.last()",
      "begin_line": 515,
      "end_line": 523,
      "comment": "\n     * Returns the last node in this subtree.\n     ",
      "child_ranges": [
        "(line 516,col 7)-(line 516,col 29)",
        "(line 517,col 7)-(line 517,col 36)",
        "(line 518,col 7)-(line 521,col 7)",
        "(line 522,col 7)-(line 522,col 18)"
      ]
    },
    {
      "type": "class_interface",
      "name": "LinkedTreeMapIterator",
      "is_interface": false,
      "parent_types": [
        "java.util.Iterator\u003cT\u003e"
      ],
      "begin_line": 526,
      "end_line": 558,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "next"
      ],
      "begin_line": 527,
      "end_line": 527,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "lastReturned"
      ],
      "begin_line": 528,
      "end_line": 528,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "expectedModCount"
      ],
      "begin_line": 529,
      "end_line": 529,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.gson.internal.LinkedTreeMap.LinkedTreeMapIterator.LinkedTreeMapIterator()",
      "begin_line": 531,
      "end_line": 532,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.LinkedTreeMap.LinkedTreeMapIterator.hasNext()",
      "begin_line": 534,
      "end_line": 536,
      "comment": "",
      "child_ranges": [
        "(line 535,col 7)-(line 535,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.LinkedTreeMap.LinkedTreeMapIterator.nextNode()",
      "begin_line": 538,
      "end_line": 548,
      "comment": "",
      "child_ranges": [
        "(line 539,col 7)-(line 539,col 26)",
        "(line 540,col 7)-(line 542,col 7)",
        "(line 543,col 7)-(line 545,col 7)",
        "(line 546,col 7)-(line 546,col 20)",
        "(line 547,col 7)-(line 547,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.LinkedTreeMap.LinkedTreeMapIterator.remove()",
      "begin_line": 550,
      "end_line": 557,
      "comment": "",
      "child_ranges": [
        "(line 551,col 7)-(line 553,col 7)",
        "(line 554,col 7)-(line 554,col 41)",
        "(line 555,col 7)-(line 555,col 26)",
        "(line 556,col 7)-(line 556,col 34)"
      ]
    },
    {
      "type": "class_interface",
      "name": "EntrySet",
      "is_interface": false,
      "parent_types": [
        "java.util.AbstractSet\u003cjava.util.Map.Entry\u003cK, V\u003e\u003e"
      ],
      "begin_line": 560,
      "end_line": 593,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.LinkedTreeMap.EntrySet.size()",
      "begin_line": 561,
      "end_line": 563,
      "comment": "",
      "child_ranges": [
        "(line 562,col 7)-(line 562,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.LinkedTreeMap.EntrySet.iterator()",
      "begin_line": 565,
      "end_line": 571,
      "comment": "",
      "child_ranges": [
        "(line 566,col 7)-(line 570,col 8)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.LinkedTreeMap.EntrySet.Anonymous-961a7378-0aca-4dde-b29c-b5bab346d2e2.next()",
      "begin_line": 567,
      "end_line": 569,
      "comment": "",
      "child_ranges": [
        "(line 568,col 11)-(line 568,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.LinkedTreeMap.EntrySet.contains(java.lang.Object)",
      "begin_line": 573,
      "end_line": 575,
      "comment": "",
      "child_ranges": [
        "(line 574,col 7)-(line 574,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.LinkedTreeMap.EntrySet.remove(java.lang.Object)",
      "begin_line": 577,
      "end_line": 588,
      "comment": "",
      "child_ranges": [
        "(line 578,col 7)-(line 580,col 7)",
        "(line 582,col 7)-(line 582,col 53)",
        "(line 583,col 7)-(line 585,col 7)",
        "(line 586,col 7)-(line 586,col 33)",
        "(line 587,col 7)-(line 587,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.LinkedTreeMap.EntrySet.clear()",
      "begin_line": 590,
      "end_line": 592,
      "comment": "",
      "child_ranges": [
        "(line 591,col 7)-(line 591,col 33)"
      ]
    },
    {
      "type": "class_interface",
      "name": "KeySet",
      "is_interface": false,
      "parent_types": [
        "java.util.AbstractSet\u003cK\u003e"
      ],
      "begin_line": 595,
      "end_line": 619,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.LinkedTreeMap.KeySet.size()",
      "begin_line": 596,
      "end_line": 598,
      "comment": "",
      "child_ranges": [
        "(line 597,col 7)-(line 597,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.LinkedTreeMap.KeySet.iterator()",
      "begin_line": 600,
      "end_line": 606,
      "comment": "",
      "child_ranges": [
        "(line 601,col 7)-(line 605,col 8)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.LinkedTreeMap.KeySet.Anonymous-acdf6431-5939-472d-bb7e-b59acfebdb24.next()",
      "begin_line": 602,
      "end_line": 604,
      "comment": "",
      "child_ranges": [
        "(line 603,col 11)-(line 603,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.LinkedTreeMap.KeySet.contains(java.lang.Object)",
      "begin_line": 608,
      "end_line": 610,
      "comment": "",
      "child_ranges": [
        "(line 609,col 7)-(line 609,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.LinkedTreeMap.KeySet.remove(java.lang.Object)",
      "begin_line": 612,
      "end_line": 614,
      "comment": "",
      "child_ranges": [
        "(line 613,col 7)-(line 613,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.LinkedTreeMap.KeySet.clear()",
      "begin_line": 616,
      "end_line": 618,
      "comment": "",
      "child_ranges": [
        "(line 617,col 7)-(line 617,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.LinkedTreeMap.writeReplace()",
      "begin_line": 627,
      "end_line": 629,
      "comment": "\n   * If somebody is unlucky enough to have to serialize one of these, serialize\n   * it as a LinkedHashMap so that they won\u0027t need Gson on the other side to\n   * deserialize it. Using serialization defeats our DoS defence, so most apps\n   * shouldn\u0027t use it.\n   ",
      "child_ranges": [
        "(line 628,col 5)-(line 628,col 41)"
      ]
    }
  ]
}