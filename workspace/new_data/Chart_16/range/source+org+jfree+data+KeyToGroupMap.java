{
  "filepath": "/tmp/Chart-16b/source/org/jfree/data/KeyToGroupMap.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "KeyToGroupMap",
      "is_interface": false,
      "parent_types": [
        "java.lang.Cloneable",
        "org.jfree.chart.util.PublicCloneable",
        "java.io.Serializable"
      ],
      "begin_line": 64,
      "end_line": 325,
      "comment": "\r\n * A class that maps keys (instances of \u003ccode\u003eComparable\u003c/code\u003e) to groups.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "defaultGroup"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": " The default group. "
    },
    {
      "type": "field",
      "varNames": [
        "groups"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": " The groups. "
    },
    {
      "type": "field",
      "varNames": [
        "keyToGroupMap"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": " A mapping between keys and groups. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.KeyToGroupMap.KeyToGroupMap()",
      "begin_line": 81,
      "end_line": 83,
      "comment": "\r\n     * Creates a new map with a default group named \u0027Default Group\u0027.\r\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 30)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.KeyToGroupMap.KeyToGroupMap(java.lang.Comparable)",
      "begin_line": 90,
      "end_line": 97,
      "comment": "\r\n     * Creates a new map with the specified default group.\r\n     * \r\n     * @param defaultGroup  the default group (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 91,col 9)-(line 93,col 9)",
        "(line 94,col 9)-(line 94,col 41)",
        "(line 95,col 9)-(line 95,col 38)",
        "(line 96,col 9)-(line 96,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.KeyToGroupMap.getGroupCount()",
      "begin_line": 104,
      "end_line": 106,
      "comment": "\r\n     * Returns the number of groups in the map.\r\n     * \r\n     * @return The number of groups in the map.\r\n     ",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.KeyToGroupMap.getGroups()",
      "begin_line": 115,
      "end_line": 126,
      "comment": "\r\n     * Returns a list of the groups (always including the default group) in the \r\n     * map.  The returned list is independent of the map, so altering the list \r\n     * will have no effect.\r\n     * \r\n     * @return The groups (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 116,col 9)-(line 116,col 38)",
        "(line 117,col 9)-(line 117,col 38)",
        "(line 118,col 9)-(line 118,col 51)",
        "(line 119,col 9)-(line 124,col 9)",
        "(line 125,col 9)-(line 125,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.KeyToGroupMap.getGroupIndex(java.lang.Comparable)",
      "begin_line": 136,
      "end_line": 147,
      "comment": "\r\n     * Returns the index for the group.\r\n     * \r\n     * @param group  the group.\r\n     * \r\n     * @return The group index (or -1 if the group is not represented within \r\n     *         the map).\r\n     ",
      "child_ranges": [
        "(line 137,col 9)-(line 137,col 48)",
        "(line 138,col 9)-(line 145,col 9)",
        "(line 146,col 9)-(line 146,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.KeyToGroupMap.getGroup(java.lang.Comparable)",
      "begin_line": 157,
      "end_line": 167,
      "comment": "\r\n     * Returns the group that a key is mapped to.\r\n     * \r\n     * @param key  the key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @return The group (never \u003ccode\u003enull\u003c/code\u003e, returns the default group if\r\n     *         there is no mapping for the specified key).\r\n     ",
      "child_ranges": [
        "(line 158,col 9)-(line 160,col 9)",
        "(line 161,col 9)-(line 161,col 46)",
        "(line 162,col 9)-(line 162,col 68)",
        "(line 163,col 9)-(line 165,col 9)",
        "(line 166,col 9)-(line 166,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.KeyToGroupMap.mapKeyToGroup(java.lang.Comparable, java.lang.Comparable)",
      "begin_line": 176,
      "end_line": 200,
      "comment": "\r\n     * Maps a key to a group.\r\n     * \r\n     * @param key  the key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param group  the group (\u003ccode\u003enull\u003c/code\u003e permitted, clears any \r\n     *               existing mapping).\r\n     ",
      "child_ranges": [
        "(line 177,col 9)-(line 179,col 9)",
        "(line 180,col 9)-(line 180,col 48)",
        "(line 181,col 9)-(line 188,col 9)",
        "(line 189,col 9)-(line 199,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.KeyToGroupMap.getKeyCount(java.lang.Comparable)",
      "begin_line": 211,
      "end_line": 224,
      "comment": "\r\n     * Returns the number of keys mapped to the specified group.  This method \r\n     * won\u0027t always return an accurate result for the default group, since \r\n     * explicit mappings are not required for this group.\r\n     * \r\n     * @param group  the group (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @return The key count.\r\n     ",
      "child_ranges": [
        "(line 212,col 9)-(line 214,col 9)",
        "(line 215,col 9)-(line 215,col 23)",
        "(line 216,col 9)-(line 216,col 67)",
        "(line 217,col 9)-(line 222,col 9)",
        "(line 223,col 9)-(line 223,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.KeyToGroupMap.equals(java.lang.Object)",
      "begin_line": 233,
      "end_line": 248,
      "comment": "\r\n     * Tests the map for equality against an arbitrary object.\r\n     * \r\n     * @param obj  the object to test against (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 234,col 9)-(line 236,col 9)",
        "(line 237,col 9)-(line 239,col 9)",
        "(line 240,col 9)-(line 240,col 49)",
        "(line 241,col 9)-(line 243,col 9)",
        "(line 244,col 9)-(line 246,col 9)",
        "(line 247,col 9)-(line 247,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.KeyToGroupMap.clone()",
      "begin_line": 258,
      "end_line": 265,
      "comment": "\r\n     * Returns a clone of the map.\r\n     * \r\n     * @return A clone.\r\n     * \r\n     * @throws CloneNotSupportedException  if there is a problem cloning the\r\n     *                                     map.\r\n     ",
      "child_ranges": [
        "(line 259,col 9)-(line 259,col 61)",
        "(line 260,col 9)-(line 261,col 66)",
        "(line 262,col 9)-(line 262,col 64)",
        "(line 263,col 9)-(line 263,col 77)",
        "(line 264,col 9)-(line 264,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.KeyToGroupMap.clone(java.lang.Object)",
      "begin_line": 274,
      "end_line": 295,
      "comment": "\r\n     * Attempts to clone the specified object using reflection.\r\n     * \r\n     * @param object  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @return The cloned object, or the original object if cloning failed.\r\n     ",
      "child_ranges": [
        "(line 275,col 9)-(line 277,col 9)",
        "(line 278,col 9)-(line 278,col 36)",
        "(line 279,col 9)-(line 279,col 29)",
        "(line 280,col 9)-(line 293,col 9)",
        "(line 294,col 9)-(line 294,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.KeyToGroupMap.clone(java.util.Collection)",
      "begin_line": 306,
      "end_line": 323,
      "comment": "\r\n     * Returns a clone of the list.\r\n     * \r\n     * @param list  the list.\r\n     * \r\n     * @return A clone of the list.\r\n     * \r\n     * @throws CloneNotSupportedException if the list could not be cloned.\r\n     ",
      "child_ranges": [
        "(line 308,col 9)-(line 308,col 33)",
        "(line 309,col 9)-(line 321,col 9)",
        "(line 322,col 9)-(line 322,col 22)"
      ]
    }
  ]
}