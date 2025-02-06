{
  "filepath": "/tmp/Chart-2b/source/org/jfree/data/general/DefaultHeatMapDataset.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DefaultHeatMapDataset",
      "is_interface": false,
      "parent_types": [
        "org.jfree.data.general.AbstractDataset",
        "org.jfree.data.general.HeatMapDataset",
        "java.lang.Cloneable",
        "org.jfree.chart.util.PublicCloneable",
        "java.io.Serializable"
      ],
      "begin_line": 53,
      "end_line": 324,
      "comment": "\n * A default implementation of the {@link HeatMapDataset} interface.\n *\n * @since 1.0.13\n "
    },
    {
      "type": "field",
      "varNames": [
        "xSamples"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": " The number of samples in this dataset for the x-dimension. "
    },
    {
      "type": "field",
      "varNames": [
        "ySamples"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": " The number of samples in this dataset for the y-dimension. "
    },
    {
      "type": "field",
      "varNames": [
        "minX"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": " The minimum x-value in the dataset. "
    },
    {
      "type": "field",
      "varNames": [
        "maxX"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": " The maximum x-value in the dataset. "
    },
    {
      "type": "field",
      "varNames": [
        "minY"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": " The minimum y-value in the dataset. "
    },
    {
      "type": "field",
      "varNames": [
        "maxY"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": " The maximum y-value in the dataset. "
    },
    {
      "type": "field",
      "varNames": [
        "zValues"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": " Storage for the z-values. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.general.DefaultHeatMapDataset.DefaultHeatMapDataset(int, int, double, double, double, double)",
      "begin_line": 88,
      "end_line": 120,
      "comment": "\n     * Creates a new dataset where all the z-values are initially 0.  This is\n     * a fixed size array of z-values.\n     *\n     * @param xSamples  the number of x-values.\n     * @param ySamples  the number of y-values\n     * @param minX  the minimum x-value in the dataset.\n     * @param maxX  the maximum x-value in the dataset.\n     * @param minY  the minimum y-value in the dataset.\n     * @param maxY  the maximum y-value in the dataset.\n     ",
      "child_ranges": [
        "(line 91,col 9)-(line 93,col 9)",
        "(line 94,col 9)-(line 96,col 9)",
        "(line 97,col 9)-(line 99,col 9)",
        "(line 100,col 9)-(line 102,col 9)",
        "(line 103,col 9)-(line 105,col 9)",
        "(line 106,col 9)-(line 108,col 9)",
        "(line 110,col 9)-(line 110,col 33)",
        "(line 111,col 9)-(line 111,col 33)",
        "(line 112,col 9)-(line 112,col 25)",
        "(line 113,col 9)-(line 113,col 25)",
        "(line 114,col 9)-(line 114,col 25)",
        "(line 115,col 9)-(line 115,col 25)",
        "(line 116,col 9)-(line 116,col 46)",
        "(line 117,col 9)-(line 119,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DefaultHeatMapDataset.getXSampleCount()",
      "begin_line": 129,
      "end_line": 131,
      "comment": "\n     * Returns the number of x values across the width of the dataset.  The\n     * values are evenly spaced between {@link #getMinimumXValue()} and\n     * {@link #getMaximumXValue()}.\n     *\n     * @return The number of x-values (always \u003e 0).\n     ",
      "child_ranges": [
        "(line 130,col 9)-(line 130,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DefaultHeatMapDataset.getYSampleCount()",
      "begin_line": 140,
      "end_line": 142,
      "comment": "\n     * Returns the number of y values (or samples) for the dataset.  The\n     * values are evenly spaced between {@link #getMinimumYValue()} and\n     * {@link #getMaximumYValue()}.\n     *\n     * @return The number of y-values (always \u003e 0).\n     ",
      "child_ranges": [
        "(line 141,col 9)-(line 141,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DefaultHeatMapDataset.getMinimumXValue()",
      "begin_line": 151,
      "end_line": 153,
      "comment": "\n     * Returns the lowest x-value represented in this dataset.  A requirement\n     * of this interface is that this method must never return infinite or\n     * Double.NAN values.\n     *\n     * @return The lowest x-value represented in this dataset.\n     ",
      "child_ranges": [
        "(line 152,col 9)-(line 152,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DefaultHeatMapDataset.getMaximumXValue()",
      "begin_line": 162,
      "end_line": 164,
      "comment": "\n     * Returns the highest x-value represented in this dataset.  A requirement\n     * of this interface is that this method must never return infinite or\n     * Double.NAN values.\n     *\n     * @return The highest x-value represented in this dataset.\n     ",
      "child_ranges": [
        "(line 163,col 9)-(line 163,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DefaultHeatMapDataset.getMinimumYValue()",
      "begin_line": 173,
      "end_line": 175,
      "comment": "\n     * Returns the lowest y-value represented in this dataset.  A requirement\n     * of this interface is that this method must never return infinite or\n     * Double.NAN values.\n     *\n     * @return The lowest y-value represented in this dataset.\n     ",
      "child_ranges": [
        "(line 174,col 9)-(line 174,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DefaultHeatMapDataset.getMaximumYValue()",
      "begin_line": 184,
      "end_line": 186,
      "comment": "\n     * Returns the highest y-value represented in this dataset.  A requirement\n     * of this interface is that this method must never return infinite or\n     * Double.NAN values.\n     *\n     * @return The highest y-value represented in this dataset.\n     ",
      "child_ranges": [
        "(line 185,col 9)-(line 185,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DefaultHeatMapDataset.getXValue(int)",
      "begin_line": 195,
      "end_line": 199,
      "comment": "\n     * A convenience method that returns the x-value for the given index.\n     *\n     * @param xIndex  the xIndex.\n     *\n     * @return The x-value.\n     ",
      "child_ranges": [
        "(line 196,col 9)-(line 197,col 78)",
        "(line 198,col 9)-(line 198,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DefaultHeatMapDataset.getYValue(int)",
      "begin_line": 208,
      "end_line": 212,
      "comment": "\n     * A convenience method that returns the y-value for the given index.\n     *\n     * @param yIndex  the yIndex.\n     *\n     * @return The y-value.\n     ",
      "child_ranges": [
        "(line 209,col 9)-(line 210,col 78)",
        "(line 211,col 9)-(line 211,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DefaultHeatMapDataset.getZValue(int, int)",
      "begin_line": 223,
      "end_line": 225,
      "comment": "\n     * Returns the z-value at the specified sample position in the dataset.\n     * For a missing or unknown value, this method should return Double.NAN.\n     *\n     * @param xIndex  the position of the x sample in the dataset.\n     * @param yIndex  the position of the y sample in the dataset.\n     *\n     * @return The z-value.\n     ",
      "child_ranges": [
        "(line 224,col 9)-(line 224,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DefaultHeatMapDataset.getZ(int, int)",
      "begin_line": 238,
      "end_line": 240,
      "comment": "\n     * Returns the z-value at the specified sample position in the dataset.\n     * In this implementation, where the underlying values are stored in an\n     * array of double primitives, you should avoid using this method and\n     * use {@link #getZValue(int, int)} instead.\n     *\n     * @param xIndex  the position of the x sample in the dataset.\n     * @param yIndex  the position of the y sample in the dataset.\n     *\n     * @return The z-value.\n     ",
      "child_ranges": [
        "(line 239,col 9)-(line 239,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DefaultHeatMapDataset.setZValue(int, int, double)",
      "begin_line": 250,
      "end_line": 252,
      "comment": "\n     * Updates a z-value in the dataset and sends a {@link DatasetChangeEvent}\n     * to all registered listeners.\n     *\n     * @param xIndex  the x-index.\n     * @param yIndex  the y-index.\n     * @param z  the new z-value.\n     ",
      "child_ranges": [
        "(line 251,col 9)-(line 251,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DefaultHeatMapDataset.setZValue(int, int, double, boolean)",
      "begin_line": 263,
      "end_line": 269,
      "comment": "\n     * Updates a z-value in the dataset and, if requested, sends a\n     * {@link DatasetChangeEvent} to all registered listeners.\n     *\n     * @param xIndex  the x-index.\n     * @param yIndex  the y-index.\n     * @param z  the new z-value.\n     * @param notify  notify listeners?\n     ",
      "child_ranges": [
        "(line 264,col 9)-(line 264,col 41)",
        "(line 265,col 9)-(line 268,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DefaultHeatMapDataset.equals(java.lang.Object)",
      "begin_line": 278,
      "end_line": 309,
      "comment": "\n     * Tests this dataset for equality with an arbitrary object.\n     *\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\n     *\n     * @return A boolean.\n     ",
      "child_ranges": [
        "(line 279,col 9)-(line 281,col 9)",
        "(line 282,col 9)-(line 284,col 9)",
        "(line 285,col 9)-(line 285,col 65)",
        "(line 286,col 9)-(line 288,col 9)",
        "(line 289,col 9)-(line 291,col 9)",
        "(line 292,col 9)-(line 294,col 9)",
        "(line 295,col 9)-(line 297,col 9)",
        "(line 298,col 9)-(line 300,col 9)",
        "(line 301,col 9)-(line 303,col 9)",
        "(line 304,col 9)-(line 306,col 9)",
        "(line 308,col 9)-(line 308,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DefaultHeatMapDataset.clone()",
      "begin_line": 318,
      "end_line": 322,
      "comment": "\n     * Returns an independent copy of this dataset.\n     *\n     * @return A clone.\n     *\n     * @throws java.lang.CloneNotSupportedException\n     ",
      "child_ranges": [
        "(line 319,col 9)-(line 319,col 76)",
        "(line 320,col 9)-(line 320,col 58)",
        "(line 321,col 9)-(line 321,col 21)"
      ]
    }
  ]
}