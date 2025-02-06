{
  "filepath": "/tmp/Chart-14b/tests/org/jfree/chart/annotations/junit/XYDrawableAnnotationTests.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "XYDrawableAnnotationTests",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 66,
      "end_line": 196,
      "comment": "\n * Tests for the {@link XYDrawableAnnotation} class.\n "
    },
    {
      "type": "class_interface",
      "name": "TestDrawable",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.Drawable",
        "java.lang.Cloneable",
        "java.io.Serializable"
      ],
      "begin_line": 68,
      "end_line": 106,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.annotations.junit.XYDrawableAnnotationTests.TestDrawable.TestDrawable()",
      "begin_line": 72,
      "end_line": 73,
      "comment": "\n         * Default constructor.\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.junit.XYDrawableAnnotationTests.TestDrawable.draw(java.awt.Graphics2D, java.awt.geom.Rectangle2D)",
      "begin_line": 79,
      "end_line": 81,
      "comment": "\n         * Draws something.\n         * @param g2  the graphics device.\n         * @param area  the area in which to draw.\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.junit.XYDrawableAnnotationTests.TestDrawable.equals(java.lang.Object)",
      "begin_line": 87,
      "end_line": 95,
      "comment": "\n         * Tests this object for equality with an arbitrary object.\n         * @param obj  the object to test against (\u003ccode\u003enull\u003c/code\u003e permitted).\n         * @return A boolean.\n         ",
      "child_ranges": [
        "(line 88,col 13)-(line 90,col 13)",
        "(line 91,col 13)-(line 93,col 13)",
        "(line 94,col 13)-(line 94,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.junit.XYDrawableAnnotationTests.TestDrawable.clone()",
      "begin_line": 103,
      "end_line": 105,
      "comment": "\n         * Returns a clone.\n         * \n         * @return A clone.\n         * \n         * @throws CloneNotSupportedException if there is a problem cloning.\n         ",
      "child_ranges": [
        "(line 104,col 13)-(line 104,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.junit.XYDrawableAnnotationTests.suite()",
      "begin_line": 113,
      "end_line": 115,
      "comment": "\n     * Returns the tests as a test suite.\n     *\n     * @return The test suite.\n     ",
      "child_ranges": [
        "(line 114,col 9)-(line 114,col 62)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.annotations.junit.XYDrawableAnnotationTests.XYDrawableAnnotationTests(java.lang.String)",
      "begin_line": 122,
      "end_line": 124,
      "comment": "\n     * Constructs a new set of tests.\n     *\n     * @param name  the name of the tests.\n     ",
      "child_ranges": [
        "(line 123,col 9)-(line 123,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.junit.XYDrawableAnnotationTests.testEquals()",
      "begin_line": 129,
      "end_line": 135,
      "comment": "\n     * Confirm that the equals method can distinguish all the required fields.\n     ",
      "child_ranges": [
        "(line 130,col 9)-(line 131,col 43)",
        "(line 132,col 9)-(line 133,col 43)",
        "(line 134,col 9)-(line 134,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.junit.XYDrawableAnnotationTests.testHashCode()",
      "begin_line": 140,
      "end_line": 149,
      "comment": "\n     * Two objects that are equal are required to return the same hashCode. \n     ",
      "child_ranges": [
        "(line 141,col 9)-(line 142,col 43)",
        "(line 143,col 9)-(line 144,col 43)",
        "(line 145,col 9)-(line 145,col 34)",
        "(line 146,col 9)-(line 146,col 31)",
        "(line 147,col 9)-(line 147,col 31)",
        "(line 148,col 9)-(line 148,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.junit.XYDrawableAnnotationTests.testCloning()",
      "begin_line": 154,
      "end_line": 167,
      "comment": "\n     * Confirm that cloning works.\n     ",
      "child_ranges": [
        "(line 155,col 9)-(line 156,col 43)",
        "(line 157,col 9)-(line 157,col 39)",
        "(line 158,col 9)-(line 163,col 9)",
        "(line 164,col 9)-(line 164,col 29)",
        "(line 165,col 9)-(line 165,col 51)",
        "(line 166,col 9)-(line 166,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.junit.XYDrawableAnnotationTests.testSerialization()",
      "begin_line": 172,
      "end_line": 194,
      "comment": "\n     * Serialize an instance, restore it, and check for equality.\n     ",
      "child_ranges": [
        "(line 174,col 9)-(line 175,col 43)",
        "(line 176,col 9)-(line 176,col 39)",
        "(line 178,col 9)-(line 191,col 9)",
        "(line 192,col 9)-(line 192,col 29)"
      ]
    }
  ]
}