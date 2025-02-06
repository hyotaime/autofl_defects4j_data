{
  "filepath": "/tmp/Chart-2b/source/org/jfree/chart/axis/TickUnitSource.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TickUnitSource",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 47,
      "end_line": 78,
      "comment": "\r\n * An interface used by the {@link DateAxis} and {@link NumberAxis} classes to\r\n * obtain a suitable {@link TickUnit}.\r\n "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.TickUnitSource.getLargerTickUnit(org.jfree.chart.axis.TickUnit)",
      "begin_line": 56,
      "end_line": 56,
      "comment": "\r\n     * Returns a tick unit that is larger than the supplied unit.\r\n     *\r\n     * @param unit   the unit.\r\n     *\r\n     * @return A tick unit that is larger than the supplied unit.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.TickUnitSource.getCeilingTickUnit(org.jfree.chart.axis.TickUnit)",
      "begin_line": 66,
      "end_line": 66,
      "comment": "\r\n     * Returns the tick unit in the collection that is greater than or equal\r\n     * to (in size) the specified unit.\r\n     *\r\n     * @param unit  the unit.\r\n     *\r\n     * @return A unit from the collection.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.TickUnitSource.getCeilingTickUnit(double)",
      "begin_line": 76,
      "end_line": 76,
      "comment": "\r\n     * Returns the tick unit in the collection that is greater than or equal\r\n     * to the specified size.\r\n     *\r\n     * @param size  the size.\r\n     *\r\n     * @return A unit from the collection.\r\n     ",
      "child_ranges": []
    }
  ]
}