{
  "filepath": "/tmp/Chart-16b/source/org/jfree/data/statistics/BoxAndWhiskerItem.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BoxAndWhiskerItem",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 58,
      "end_line": 297,
      "comment": "\r\n * Represents one data item within a box-and-whisker dataset.  Instances of \r\n * this class are immutable.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "mean"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": " The mean. "
    },
    {
      "type": "field",
      "varNames": [
        "median"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": " The median. "
    },
    {
      "type": "field",
      "varNames": [
        "q1"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": " The first quarter. "
    },
    {
      "type": "field",
      "varNames": [
        "q3"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": " The third quarter. "
    },
    {
      "type": "field",
      "varNames": [
        "minRegularValue"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": " The minimum regular value. "
    },
    {
      "type": "field",
      "varNames": [
        "maxRegularValue"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": " The maximum regular value. "
    },
    {
      "type": "field",
      "varNames": [
        "minOutlier"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": " The minimum outlier. "
    },
    {
      "type": "field",
      "varNames": [
        "maxOutlier"
      ],
      "begin_line": 85,
      "end_line": 85,
      "comment": " The maximum outlier. "
    },
    {
      "type": "field",
      "varNames": [
        "outliers"
      ],
      "begin_line": 88,
      "end_line": 88,
      "comment": " The outliers. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.statistics.BoxAndWhiskerItem.BoxAndWhiskerItem(java.lang.Number, java.lang.Number, java.lang.Number, java.lang.Number, java.lang.Number, java.lang.Number, java.lang.Number, java.lang.Number, java.util.List)",
      "begin_line": 105,
      "end_line": 125,
      "comment": "\r\n     * Creates a new box-and-whisker item.\r\n     * \r\n     * @param mean  the mean (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param median  the median (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param q1  the first quartile (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param q3  the third quartile (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param minRegularValue  the minimum regular value (\u003ccode\u003enull\u003c/code\u003e \r\n     *                         permitted).\r\n     * @param maxRegularValue  the maximum regular value (\u003ccode\u003enull\u003c/code\u003e \r\n     *                         permitted).\r\n     * @param minOutlier  the minimum outlier (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param maxOutlier  the maximum outlier (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param outliers  the outliers (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 25)",
        "(line 116,col 9)-(line 116,col 29)",
        "(line 117,col 9)-(line 117,col 21)",
        "(line 118,col 9)-(line 118,col 21)",
        "(line 119,col 9)-(line 119,col 47)",
        "(line 120,col 9)-(line 120,col 47)",
        "(line 121,col 9)-(line 121,col 37)",
        "(line 122,col 9)-(line 122,col 37)",
        "(line 123,col 9)-(line 123,col 33)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.statistics.BoxAndWhiskerItem.BoxAndWhiskerItem(double, double, double, double, double, double, double, double, java.util.List)",
      "begin_line": 142,
      "end_line": 152,
      "comment": "\r\n     * Creates a new box-and-whisker item.\r\n     * \r\n     * @param mean  the mean.\r\n     * @param median  the median\r\n     * @param q1  the first quartile.\r\n     * @param q3  the third quartile.\r\n     * @param minRegularValue  the minimum regular value.\r\n     * @param maxRegularValue  the maximum regular value.\r\n     * @param minOutlier  the minimum outlier value.\r\n     * @param maxOutlier  the maximum outlier value.\r\n     * @param outliers  a list of the outliers.\r\n     * \r\n     * @since 1.0.7\r\n     ",
      "child_ranges": [
        "(line 147,col 9)-(line 150,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.BoxAndWhiskerItem.getMean()",
      "begin_line": 159,
      "end_line": 161,
      "comment": "\r\n     * Returns the mean.\r\n     * \r\n     * @return The mean (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 160,col 9)-(line 160,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.BoxAndWhiskerItem.getMedian()",
      "begin_line": 168,
      "end_line": 170,
      "comment": "\r\n     * Returns the median.\r\n     * \r\n     * @return The median (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 169,col 9)-(line 169,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.BoxAndWhiskerItem.getQ1()",
      "begin_line": 177,
      "end_line": 179,
      "comment": "\r\n     * Returns the first quartile. \r\n     * \r\n     * @return The first quartile (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 178,col 9)-(line 178,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.BoxAndWhiskerItem.getQ3()",
      "begin_line": 186,
      "end_line": 188,
      "comment": "\r\n     * Returns the third quartile. \r\n     * \r\n     * @return The third quartile (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 187,col 9)-(line 187,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.BoxAndWhiskerItem.getMinRegularValue()",
      "begin_line": 195,
      "end_line": 197,
      "comment": "\r\n     * Returns the minimum regular value.\r\n     * \r\n     * @return The minimum regular value (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 196,col 9)-(line 196,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.BoxAndWhiskerItem.getMaxRegularValue()",
      "begin_line": 204,
      "end_line": 206,
      "comment": "\r\n     * Returns the maximum regular value. \r\n     * \r\n     * @return The maximum regular value (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 205,col 9)-(line 205,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.BoxAndWhiskerItem.getMinOutlier()",
      "begin_line": 213,
      "end_line": 215,
      "comment": "\r\n     * Returns the minimum outlier.\r\n     * \r\n     * @return The minimum outlier (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 214,col 9)-(line 214,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.BoxAndWhiskerItem.getMaxOutlier()",
      "begin_line": 222,
      "end_line": 224,
      "comment": "\r\n     * Returns the maximum outlier.\r\n     * \r\n     * @return The maximum outlier (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 223,col 9)-(line 223,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.BoxAndWhiskerItem.getOutliers()",
      "begin_line": 231,
      "end_line": 236,
      "comment": "\r\n     * Returns a list of outliers.\r\n     * \r\n     * @return A list of outliers (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 232,col 9)-(line 234,col 9)",
        "(line 235,col 9)-(line 235,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.BoxAndWhiskerItem.toString()",
      "begin_line": 244,
      "end_line": 247,
      "comment": "\r\n     * Returns a string representation of this instance, primarily for\r\n     * debugging purposes.\r\n     * \r\n     * @return A string representation of this instance.\r\n     ",
      "child_ranges": [
        "(line 245,col 9)-(line 246,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.BoxAndWhiskerItem.equals(java.lang.Object)",
      "begin_line": 256,
      "end_line": 295,
      "comment": "\r\n     * Tests this object for equality with an arbitrary object.\r\n     * \r\n     * @param obj  the object to test against (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 258,col 9)-(line 260,col 9)",
        "(line 261,col 9)-(line 263,col 9)",
        "(line 264,col 9)-(line 264,col 57)",
        "(line 265,col 9)-(line 267,col 9)",
        "(line 268,col 9)-(line 270,col 9)",
        "(line 271,col 9)-(line 273,col 9)",
        "(line 274,col 9)-(line 276,col 9)",
        "(line 277,col 9)-(line 280,col 9)",
        "(line 281,col 9)-(line 284,col 9)",
        "(line 285,col 9)-(line 287,col 9)",
        "(line 288,col 9)-(line 290,col 9)",
        "(line 291,col 9)-(line 293,col 9)",
        "(line 294,col 9)-(line 294,col 20)"
      ]
    }
  ]
}