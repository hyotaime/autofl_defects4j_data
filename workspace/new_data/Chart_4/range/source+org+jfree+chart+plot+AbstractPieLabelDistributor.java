{
  "filepath": "/tmp/Chart-4b/source/org/jfree/chart/plot/AbstractPieLabelDistributor.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractPieLabelDistributor",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 52,
      "end_line": 112,
      "comment": "\r\n * A base class for handling the distribution of pie section labels.  Create\r\n * your own subclass and set it using the\r\n * {@link PiePlot#setLabelDistributor(AbstractPieLabelDistributor)} method\r\n * if you want to customise the label distribution.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "labels"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": " The label records. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.plot.AbstractPieLabelDistributor.AbstractPieLabelDistributor()",
      "begin_line": 60,
      "end_line": 62,
      "comment": "\r\n     * Creates a new instance.\r\n     ",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.AbstractPieLabelDistributor.getPieLabelRecord(int)",
      "begin_line": 71,
      "end_line": 73,
      "comment": "\r\n     * Returns a label record from the list.\r\n     *\r\n     * @param index  the index.\r\n     *\r\n     * @return The label record.\r\n     ",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.AbstractPieLabelDistributor.addPieLabelRecord(org.jfree.chart.plot.PieLabelRecord)",
      "begin_line": 80,
      "end_line": 85,
      "comment": "\r\n     * Adds a label record.\r\n     *\r\n     * @param record  the label record (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 81,col 9)-(line 83,col 9)",
        "(line 84,col 9)-(line 84,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.AbstractPieLabelDistributor.getItemCount()",
      "begin_line": 92,
      "end_line": 94,
      "comment": "\r\n     * Returns the number of items in the list.\r\n     *\r\n     * @return The item count.\r\n     ",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.AbstractPieLabelDistributor.clear()",
      "begin_line": 99,
      "end_line": 101,
      "comment": "\r\n     * Clears the list of labels.\r\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.AbstractPieLabelDistributor.distributeLabels(double, double)",
      "begin_line": 110,
      "end_line": 110,
      "comment": "\r\n     * Called by the {@link PiePlot} class.  Implementations should distribute\r\n     * the labels in this.labels then return.\r\n     *\r\n     * @param minY  the y-coordinate for the top of the label area.\r\n     * @param height  the height of the label area.\r\n     ",
      "child_ranges": []
    }
  ]
}