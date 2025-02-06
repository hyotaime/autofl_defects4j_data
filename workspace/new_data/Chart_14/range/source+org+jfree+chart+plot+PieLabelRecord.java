{
  "filepath": "/tmp/Chart-14b/source/org/jfree/chart/plot/PieLabelRecord.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PieLabelRecord",
      "is_interface": false,
      "parent_types": [
        "java.lang.Comparable",
        "java.io.Serializable"
      ],
      "begin_line": 54,
      "end_line": 285,
      "comment": "\r\n * A structure that retains information about the label for a section in a pie \r\n * chart.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "key"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": " The section key. "
    },
    {
      "type": "field",
      "varNames": [
        "angle"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": " The angle of the centre of the section (in radians). "
    },
    {
      "type": "field",
      "varNames": [
        "baseY"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": " The base y-coordinate. "
    },
    {
      "type": "field",
      "varNames": [
        "allocatedY"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": " The allocated y-coordinate. "
    },
    {
      "type": "field",
      "varNames": [
        "label"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": " The label. "
    },
    {
      "type": "field",
      "varNames": [
        "labelHeight"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": " The label height. "
    },
    {
      "type": "field",
      "varNames": [
        "gap"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": " The gap. "
    },
    {
      "type": "field",
      "varNames": [
        "linkPercent"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": " The link percent. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.plot.PieLabelRecord.PieLabelRecord(java.lang.Comparable, double, double, org.jfree.chart.text.TextBox, double, double, double)",
      "begin_line": 91,
      "end_line": 102,
      "comment": "\r\n     * Creates a new record.\r\n     * \r\n     * @param key  the section key.\r\n     * @param angle  the angle to the middle of the section (in radians).\r\n     * @param baseY  the base y-coordinate.\r\n     * @param label  the section label.\r\n     * @param labelHeight  the label height (in Java2D units).\r\n     * @param gap  the offset to the left.\r\n     * @param linkPercent  the link percent.\r\n     ",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 23)",
        "(line 95,col 9)-(line 95,col 27)",
        "(line 96,col 9)-(line 96,col 27)",
        "(line 97,col 9)-(line 97,col 32)",
        "(line 98,col 9)-(line 98,col 27)",
        "(line 99,col 9)-(line 99,col 39)",
        "(line 100,col 9)-(line 100,col 23)",
        "(line 101,col 9)-(line 101,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PieLabelRecord.getBaseY()",
      "begin_line": 110,
      "end_line": 112,
      "comment": "\r\n     * Returns the base y-coordinate.  This is where the label will appear if \r\n     * there is no overlapping of labels.\r\n     * \r\n     * @return The base y-coordinate.\r\n     ",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PieLabelRecord.setBaseY(double)",
      "begin_line": 119,
      "end_line": 121,
      "comment": "\r\n     * Sets the base y-coordinate.\r\n     * \r\n     * @param base  the base y-coordinate.\r\n     ",
      "child_ranges": [
        "(line 120,col 9)-(line 120,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PieLabelRecord.getLowerY()",
      "begin_line": 128,
      "end_line": 130,
      "comment": "\r\n     * Returns the lower bound of the label.\r\n     * \r\n     * @return The lower bound.\r\n     ",
      "child_ranges": [
        "(line 129,col 9)-(line 129,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PieLabelRecord.getUpperY()",
      "begin_line": 137,
      "end_line": 139,
      "comment": "\r\n     * Returns the upper bound of the label.\r\n     * \r\n     * @return The upper bound.\r\n     ",
      "child_ranges": [
        "(line 138,col 9)-(line 138,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PieLabelRecord.getAngle()",
      "begin_line": 146,
      "end_line": 148,
      "comment": "\r\n     * Returns the angle of the middle of the section, in radians.\r\n     * \r\n     * @return The angle, in radians.\r\n     ",
      "child_ranges": [
        "(line 147,col 9)-(line 147,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PieLabelRecord.getKey()",
      "begin_line": 155,
      "end_line": 157,
      "comment": "\r\n     * Returns the key for the section that the label applies to.\r\n     * \r\n     * @return The key.\r\n     ",
      "child_ranges": [
        "(line 156,col 9)-(line 156,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PieLabelRecord.getLabel()",
      "begin_line": 164,
      "end_line": 166,
      "comment": "\r\n     * Returns the label.\r\n     * \r\n     * @return The label.\r\n     ",
      "child_ranges": [
        "(line 165,col 9)-(line 165,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PieLabelRecord.getLabelHeight()",
      "begin_line": 174,
      "end_line": 176,
      "comment": "\r\n     * Returns the label height (you could derive this from the label itself,\r\n     * but we cache the value so it can be retrieved quickly).\r\n     * \r\n     * @return The label height (in Java2D units).\r\n     ",
      "child_ranges": [
        "(line 175,col 9)-(line 175,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PieLabelRecord.getAllocatedY()",
      "begin_line": 183,
      "end_line": 185,
      "comment": "\r\n     * Returns the allocated y-coordinate.\r\n     * \r\n     * @return The allocated y-coordinate.\r\n     ",
      "child_ranges": [
        "(line 184,col 9)-(line 184,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PieLabelRecord.setAllocatedY(double)",
      "begin_line": 192,
      "end_line": 194,
      "comment": "\r\n     * Sets the allocated y-coordinate.\r\n     * \r\n     * @param y  the y-coordinate.\r\n     ",
      "child_ranges": [
        "(line 193,col 9)-(line 193,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PieLabelRecord.getGap()",
      "begin_line": 201,
      "end_line": 203,
      "comment": "\r\n     * Returns the gap.\r\n     * \r\n     * @return The gap.\r\n     ",
      "child_ranges": [
        "(line 202,col 9)-(line 202,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PieLabelRecord.getLinkPercent()",
      "begin_line": 210,
      "end_line": 212,
      "comment": "\r\n     * Returns the link percent.\r\n     * \r\n     * @return The link percent.\r\n     ",
      "child_ranges": [
        "(line 211,col 9)-(line 211,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PieLabelRecord.compareTo(java.lang.Object)",
      "begin_line": 221,
      "end_line": 233,
      "comment": "\r\n     * Compares this object to an arbitrary object.\r\n     * \r\n     * @param obj  the object to compare against.\r\n     * \r\n     * @return An integer that specifies the relative order of the two objects.\r\n     ",
      "child_ranges": [
        "(line 222,col 9)-(line 222,col 23)",
        "(line 223,col 9)-(line 231,col 9)",
        "(line 232,col 9)-(line 232,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PieLabelRecord.equals(java.lang.Object)",
      "begin_line": 242,
      "end_line": 275,
      "comment": "\r\n     * Tests this record for equality with an arbitrary object.\r\n     * \r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 243,col 9)-(line 245,col 9)",
        "(line 246,col 9)-(line 248,col 9)",
        "(line 249,col 9)-(line 249,col 51)",
        "(line 250,col 9)-(line 252,col 9)",
        "(line 253,col 9)-(line 255,col 9)",
        "(line 256,col 9)-(line 258,col 9)",
        "(line 259,col 9)-(line 261,col 9)",
        "(line 262,col 9)-(line 264,col 9)",
        "(line 265,col 9)-(line 267,col 9)",
        "(line 268,col 9)-(line 270,col 9)",
        "(line 271,col 9)-(line 273,col 9)",
        "(line 274,col 9)-(line 274,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PieLabelRecord.toString()",
      "begin_line": 282,
      "end_line": 284,
      "comment": "\r\n     * Returns a string describing the object.  This is used for debugging only.\r\n     * \r\n     * @return A string.\r\n     ",
      "child_ranges": [
        "(line 283,col 9)-(line 283,col 55)"
      ]
    }
  ]
}