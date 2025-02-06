{
  "filepath": "/tmp/Chart-14b/source/org/jfree/chart/plot/dial/DialScale.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DialScale",
      "is_interface": true,
      "parent_types": [
        "org.jfree.chart.plot.dial.DialLayer"
      ],
      "begin_line": 50,
      "end_line": 75,
      "comment": "\n * A dial scale is a specialised layer that has the ability to convert data \n * values into angles.\n * \n * @since 1.0.7\n "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialScale.valueToAngle(double)",
      "begin_line": 62,
      "end_line": 62,
      "comment": "\n     * Converts a data value to an angle (in degrees, using the same \n     * specification as Java\u0027s Arc2D class).\n     *\n     * @param value  the data value.\n     *\n     * @return The angle in degrees.\n     * \n     * @see #angleToValue(double)\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialScale.angleToValue(double)",
      "begin_line": 73,
      "end_line": 73,
      "comment": "\n     * Converts an angle (in degrees) to a data value.\n     *\n     * @param angle  the angle (in degrees).\n     *\n     * @return The data value.\n     * \n     * @see #valueToAngle(double)\n     ",
      "child_ranges": []
    }
  ]
}