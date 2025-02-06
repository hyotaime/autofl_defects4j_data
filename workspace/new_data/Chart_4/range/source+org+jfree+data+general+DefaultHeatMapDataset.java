{
  "filepath": "/tmp/Chart-4b/source/org/jfree/data/general/DefaultHeatMapDataset.java",
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
      "begin_line": 52,
      "end_line": 322,
      "comment": "\n * A default implementation of the {@link HeatMapDataset} interface.\n *\n * @since 1.0.13\n "
    },
    {
      "type": "field",
      "varNames": [
        "xSamples"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": " The number of samples in this dataset for the x-dimension. "
    },
    {
      "type": "field",
      "varNames": [
        "ySamples"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": " The number of samples in this dataset for the y-dimension. "
    },
    {
      "type": "field",
      "varNames": [
        "minX"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": " The minimum x-value in the dataset. "
    },
    {
      "type": "field",
      "varNames": [
        "maxX"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": " The maximum x-value in the dataset. "
    },
    {
      "type": "field",
      "varNames": [
        "minY"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": " The minimum y-value in the dataset. "
    },
    {
      "type": "field",
      "varNames": [
        "maxY"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": " The maximum y-value in the dataset. "
    },
    {
      "type": "field",
      "varNames": [
        "zValues"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": " Storage for the z-values. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.general.DefaultHeatMapDataset.DefaultHeatMapDataset(int, int, double, double, double, double)",
      "begin_line": 87,
      "end_line": 119,
      "comment": "\n     * Creates a new dataset where all the z-values are initially 0.  This is\n     * a fixed size array of z-values.\n     *\n     * @param xSamples  the number of x-values.\n     * @param ySamples  the number of y-values\n     * @param minX  the minimum x-value in the dataset.\n     * @param maxX  the maximum x-value in the dataset.\n     * @param minY  the minimum y-value in the dataset.\n     * @param maxY  the maximum y-value in the dataset.\n     ",
      "child_ranges": [
        "(line 90,col 9)-(line 92,col 9)",
        "(line 93,col 9)-(line 95,col 9)",
        "(line 96,col 9)-(line 98,col 9)",
        "(line 99,col 9)-(line 101,col 9)",
        "(line 102,col 9)-(line 104,col 9)",
        "(line 105,col 9)-(line 107,col 9)",
        "(line 109,col 9)-(line 109,col 33)",
        "(line 110,col 9)-(line 110,col 33)",
        "(line 111,col 9)-(line 111,col 25)",
        "(line 112,col 9)-(line 112,col 25)",
        "(line 113,col 9)-(line 113,col 25)",
        "(line 114,col 9)-(line 114,col 25)",
        "(line 115,col 9)-(line 115,col 46)",
        "(line 116,col 9)-(line 118,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DefaultHeatMapDataset.getXSampleCount()",
      "begin_line": 128,
      "end_line": 130,
      "comment": "\n     * Returns the number of x values across the width of the dataset.  The\n     * values are evenly spaced between {@link #getMinimumXValue()} and\n     * {@link #getMaximumXValue()}.\n     *\n     * @return The number of x-values (always \u003e 0).\n     ",
      "child_ranges": [
        "(line 129,col 9)-(line 129,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DefaultHeatMapDataset.getYSampleCount()",
      "begin_line": 139,
      "end_line": 141,
      "comment": "\n     * Returns the number of y values (or samples) for the dataset.  The\n     * values are evenly spaced between {@link #getMinimumYValue()} and\n     * {@link #getMaximumYValue()}.\n     *\n     * @return The number of y-values (always \u003e 0).\n     ",
      "child_ranges": [
        "(line 140,col 9)-(line 140,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DefaultHeatMapDataset.getMinimumXValue()",
      "begin_line": 150,
      "end_line": 152,
      "comment": "\n     * Returns the lowest x-value represented in this dataset.  A requirement\n     * of this interface is that this method must never return infinite or\n     * Double.NAN values.\n     *\n     * @return The lowest x-value represented in this dataset.\n     ",
      "child_ranges": [
        "(line 151,col 9)-(line 151,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DefaultHeatMapDataset.getMaximumXValue()",
      "begin_line": 161,
      "end_line": 163,
      "comment": "\n     * Returns the highest x-value represented in this dataset.  A requirement\n     * of this interface is that this method must never return infinite or\n     * Double.NAN values.\n     *\n     * @return The highest x-value represented in this dataset.\n     ",
      "child_ranges": [
        "(line 162,col 9)-(line 162,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DefaultHeatMapDataset.getMinimumYValue()",
      "begin_line": 172,
      "end_line": 174,
      "comment": "\n     * Returns the lowest y-value represented in this dataset.  A requirement\n     * of this interface is that this method must never return infinite or\n     * Double.NAN values.\n     *\n     * @return The lowest y-value represented in this dataset.\n     ",
      "child_ranges": [
        "(line 173,col 9)-(line 173,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DefaultHeatMapDataset.getMaximumYValue()",
      "begin_line": 183,
      "end_line": 185,
      "comment": "\n     * Returns the highest y-value represented in this dataset.  A requirement\n     * of this interface is that this method must never return infinite or\n     * Double.NAN values.\n     *\n     * @return The highest y-value represented in this dataset.\n     ",
      "child_ranges": [
        "(line 184,col 9)-(line 184,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DefaultHeatMapDataset.getXValue(int)",
      "begin_line": 194,
      "end_line": 198,
      "comment": "\n     * A convenience method that returns the x-value for the given index.\n     *\n     * @param xIndex  the xIndex.\n     *\n     * @return The x-value.\n     ",
      "child_ranges": [
        "(line 195,col 9)-(line 196,col 78)",
        "(line 197,col 9)-(line 197,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DefaultHeatMapDataset.getYValue(int)",
      "begin_line": 207,
      "end_line": 211,
      "comment": "\n     * A convenience method that returns the y-value for the given index.\n     *\n     * @param yIndex  the yIndex.\n     *\n     * @return The y-value.\n     ",
      "child_ranges": [
        "(line 208,col 9)-(line 209,col 78)",
        "(line 210,col 9)-(line 210,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DefaultHeatMapDataset.getZValue(int, int)",
      "begin_line": 222,
      "end_line": 224,
      "comment": "\n     * Returns the z-value at the specified sample position in the dataset.\n     * For a missing or unknown value, this method should return Double.NAN.\n     *\n     * @param xIndex  the position of the x sample in the dataset.\n     * @param yIndex  the position of the y sample in the dataset.\n     *\n     * @return The z-value.\n     ",
      "child_ranges": [
        "(line 223,col 9)-(line 223,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DefaultHeatMapDataset.getZ(int, int)",
      "begin_line": 237,
      "end_line": 239,
      "comment": "\n     * Returns the z-value at the specified sample position in the dataset.\n     * In this implementation, where the underlying values are stored in an\n     * array of double primitives, you should avoid using this method and\n     * use {@link #getZValue(int, int)} instead.\n     *\n     * @param xIndex  the position of the x sample in the dataset.\n     * @param yIndex  the position of the y sample in the dataset.\n     *\n     * @return The z-value.\n     ",
      "child_ranges": [
        "(line 238,col 9)-(line 238,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DefaultHeatMapDataset.setZValue(int, int, double)",
      "begin_line": 249,
      "end_line": 251,
      "comment": "\n     * Updates a z-value in the dataset and sends a {@link DatasetChangeEvent}\n     * to all registered listeners.\n     *\n     * @param xIndex  the x-index.\n     * @param yIndex  the y-index.\n     * @param z  the new z-value.\n     ",
      "child_ranges": [
        "(line 250,col 9)-(line 250,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DefaultHeatMapDataset.setZValue(int, int, double, boolean)",
      "begin_line": 262,
      "end_line": 267,
      "comment": "\n     * Updates a z-value in the dataset and, if requested, sends a\n     * {@link DatasetChangeEvent} to all registered listeners.\n     *\n     * @param xIndex  the x-index.\n     * @param yIndex  the y-index.\n     * @param z  the new z-value.\n     * @param notify  notify listeners?\n     ",
      "child_ranges": [
        "(line 263,col 9)-(line 263,col 41)",
        "(line 264,col 9)-(line 266,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DefaultHeatMapDataset.equals(java.lang.Object)",
      "begin_line": 276,
      "end_line": 307,
      "comment": "\n     * Tests this dataset for equality with an arbitrary object.\n     *\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\n     *\n     * @return A boolean.\n     ",
      "child_ranges": [
        "(line 277,col 9)-(line 279,col 9)",
        "(line 280,col 9)-(line 282,col 9)",
        "(line 283,col 9)-(line 283,col 65)",
        "(line 284,col 9)-(line 286,col 9)",
        "(line 287,col 9)-(line 289,col 9)",
        "(line 290,col 9)-(line 292,col 9)",
        "(line 293,col 9)-(line 295,col 9)",
        "(line 296,col 9)-(line 298,col 9)",
        "(line 299,col 9)-(line 301,col 9)",
        "(line 302,col 9)-(line 304,col 9)",
        "(line 306,col 9)-(line 306,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DefaultHeatMapDataset.clone()",
      "begin_line": 316,
      "end_line": 320,
      "comment": "\n     * Returns an independent copy of this dataset.\n     *\n     * @return A clone.\n     *\n     * @throws java.lang.CloneNotSupportedException\n     ",
      "child_ranges": [
        "(line 317,col 9)-(line 317,col 76)",
        "(line 318,col 9)-(line 318,col 58)",
        "(line 319,col 9)-(line 319,col 21)"
      ]
    }
  ]
}