{
  "filepath": "/tmp/Chart-4b/source/org/jfree/chart/plot/PieLabelRecord.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PieLabelRecord",
      "is_interface": false,
      "parent_types": [
        "java.lang.Comparable",
        "java.io.Serializable"
      ],
      "begin_line": 55,
      "end_line": 286,
      "comment": "\r\n * A structure that retains information about the label for a section in a pie\r\n * chart.  Instances of this class are created temporarily during chart drawing\r\n * only.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "key"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": " The section key. "
    },
    {
      "type": "field",
      "varNames": [
        "angle"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": " The angle of the centre of the section (in radians). "
    },
    {
      "type": "field",
      "varNames": [
        "baseY"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": " The base y-coordinate. "
    },
    {
      "type": "field",
      "varNames": [
        "allocatedY"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": " The allocated y-coordinate. "
    },
    {
      "type": "field",
      "varNames": [
        "label"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": " The label. "
    },
    {
      "type": "field",
      "varNames": [
        "labelHeight"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": " The label height. "
    },
    {
      "type": "field",
      "varNames": [
        "gap"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": " The gap. "
    },
    {
      "type": "field",
      "varNames": [
        "linkPercent"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": " The link percent. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.plot.PieLabelRecord.PieLabelRecord(java.lang.Comparable, double, double, org.jfree.chart.text.TextBox, double, double, double)",
      "begin_line": 92,
      "end_line": 103,
      "comment": "\r\n     * Creates a new record.\r\n     *\r\n     * @param key  the section key.\r\n     * @param angle  the angle to the middle of the section (in radians).\r\n     * @param baseY  the base y-coordinate.\r\n     * @param label  the section label.\r\n     * @param labelHeight  the label height (in Java2D units).\r\n     * @param gap  the offset to the left.\r\n     * @param linkPercent  the link percent.\r\n     ",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 23)",
        "(line 96,col 9)-(line 96,col 27)",
        "(line 97,col 9)-(line 97,col 27)",
        "(line 98,col 9)-(line 98,col 32)",
        "(line 99,col 9)-(line 99,col 27)",
        "(line 100,col 9)-(line 100,col 39)",
        "(line 101,col 9)-(line 101,col 23)",
        "(line 102,col 9)-(line 102,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PieLabelRecord.getBaseY()",
      "begin_line": 111,
      "end_line": 113,
      "comment": "\r\n     * Returns the base y-coordinate.  This is where the label will appear if\r\n     * there is no overlapping of labels.\r\n     *\r\n     * @return The base y-coordinate.\r\n     ",
      "child_ranges": [
        "(line 112,col 9)-(line 112,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PieLabelRecord.setBaseY(double)",
      "begin_line": 120,
      "end_line": 122,
      "comment": "\r\n     * Sets the base y-coordinate.\r\n     *\r\n     * @param base  the base y-coordinate.\r\n     ",
      "child_ranges": [
        "(line 121,col 9)-(line 121,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PieLabelRecord.getLowerY()",
      "begin_line": 129,
      "end_line": 131,
      "comment": "\r\n     * Returns the lower bound of the label.\r\n     *\r\n     * @return The lower bound.\r\n     ",
      "child_ranges": [
        "(line 130,col 9)-(line 130,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PieLabelRecord.getUpperY()",
      "begin_line": 138,
      "end_line": 140,
      "comment": "\r\n     * Returns the upper bound of the label.\r\n     *\r\n     * @return The upper bound.\r\n     ",
      "child_ranges": [
        "(line 139,col 9)-(line 139,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PieLabelRecord.getAngle()",
      "begin_line": 147,
      "end_line": 149,
      "comment": "\r\n     * Returns the angle of the middle of the section, in radians.\r\n     *\r\n     * @return The angle, in radians.\r\n     ",
      "child_ranges": [
        "(line 148,col 9)-(line 148,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PieLabelRecord.getKey()",
      "begin_line": 156,
      "end_line": 158,
      "comment": "\r\n     * Returns the key for the section that the label applies to.\r\n     *\r\n     * @return The key.\r\n     ",
      "child_ranges": [
        "(line 157,col 9)-(line 157,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PieLabelRecord.getLabel()",
      "begin_line": 165,
      "end_line": 167,
      "comment": "\r\n     * Returns the label.\r\n     *\r\n     * @return The label.\r\n     ",
      "child_ranges": [
        "(line 166,col 9)-(line 166,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PieLabelRecord.getLabelHeight()",
      "begin_line": 175,
      "end_line": 177,
      "comment": "\r\n     * Returns the label height (you could derive this from the label itself,\r\n     * but we cache the value so it can be retrieved quickly).\r\n     *\r\n     * @return The label height (in Java2D units).\r\n     ",
      "child_ranges": [
        "(line 176,col 9)-(line 176,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PieLabelRecord.getAllocatedY()",
      "begin_line": 184,
      "end_line": 186,
      "comment": "\r\n     * Returns the allocated y-coordinate.\r\n     *\r\n     * @return The allocated y-coordinate.\r\n     ",
      "child_ranges": [
        "(line 185,col 9)-(line 185,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PieLabelRecord.setAllocatedY(double)",
      "begin_line": 193,
      "end_line": 195,
      "comment": "\r\n     * Sets the allocated y-coordinate.\r\n     *\r\n     * @param y  the y-coordinate.\r\n     ",
      "child_ranges": [
        "(line 194,col 9)-(line 194,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PieLabelRecord.getGap()",
      "begin_line": 202,
      "end_line": 204,
      "comment": "\r\n     * Returns the gap.\r\n     *\r\n     * @return The gap.\r\n     ",
      "child_ranges": [
        "(line 203,col 9)-(line 203,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PieLabelRecord.getLinkPercent()",
      "begin_line": 211,
      "end_line": 213,
      "comment": "\r\n     * Returns the link percent.\r\n     *\r\n     * @return The link percent.\r\n     ",
      "child_ranges": [
        "(line 212,col 9)-(line 212,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PieLabelRecord.compareTo(java.lang.Object)",
      "begin_line": 222,
      "end_line": 234,
      "comment": "\r\n     * Compares this object to an arbitrary object.\r\n     *\r\n     * @param obj  the object to compare against.\r\n     *\r\n     * @return An integer that specifies the relative order of the two objects.\r\n     ",
      "child_ranges": [
        "(line 223,col 9)-(line 223,col 23)",
        "(line 224,col 9)-(line 232,col 9)",
        "(line 233,col 9)-(line 233,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PieLabelRecord.equals(java.lang.Object)",
      "begin_line": 243,
      "end_line": 276,
      "comment": "\r\n     * Tests this record for equality with an arbitrary object.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 244,col 9)-(line 246,col 9)",
        "(line 247,col 9)-(line 249,col 9)",
        "(line 250,col 9)-(line 250,col 51)",
        "(line 251,col 9)-(line 253,col 9)",
        "(line 254,col 9)-(line 256,col 9)",
        "(line 257,col 9)-(line 259,col 9)",
        "(line 260,col 9)-(line 262,col 9)",
        "(line 263,col 9)-(line 265,col 9)",
        "(line 266,col 9)-(line 268,col 9)",
        "(line 269,col 9)-(line 271,col 9)",
        "(line 272,col 9)-(line 274,col 9)",
        "(line 275,col 9)-(line 275,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PieLabelRecord.toString()",
      "begin_line": 283,
      "end_line": 285,
      "comment": "\r\n     * Returns a string describing the object.  This is used for debugging only.\r\n     *\r\n     * @return A string.\r\n     ",
      "child_ranges": [
        "(line 284,col 9)-(line 284,col 55)"
      ]
    }
  ]
}