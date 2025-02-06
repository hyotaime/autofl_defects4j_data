{
  "filepath": "/tmp/Chart-4b/source/org/jfree/data/time/MovingAverage.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MovingAverage",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 59,
      "end_line": 361,
      "comment": "\r\n * A utility class for calculating moving averages of time series data.\r\n "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.MovingAverage.createMovingAverage(org.jfree.data.time.TimeSeriesCollection, java.lang.String, int, int)",
      "begin_line": 74,
      "end_line": 95,
      "comment": "\r\n     * Creates a new {@link TimeSeriesCollection} containing a moving average\r\n     * series for each series in the source collection.\r\n     *\r\n     * @param source  the source collection.\r\n     * @param suffix  the suffix added to each source series name to create the\r\n     *                corresponding moving average series name.\r\n     * @param periodCount  the number of periods in the moving average\r\n     *                     calculation.\r\n     * @param skip  the number of initial periods to skip.\r\n     *\r\n     * @return A collection of moving average time series.\r\n     ",
      "child_ranges": [
        "(line 78,col 9)-(line 80,col 9)",
        "(line 81,col 9)-(line 84,col 9)",
        "(line 86,col 9)-(line 86,col 65)",
        "(line 87,col 9)-(line 92,col 9)",
        "(line 93,col 9)-(line 93,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.MovingAverage.createMovingAverage(org.jfree.data.time.TimeSeries, java.lang.String, int, int)",
      "begin_line": 110,
      "end_line": 177,
      "comment": "\r\n     * Creates a new {@link TimeSeries} containing moving average values for\r\n     * the given series.  If the series is empty (contains zero items), the\r\n     * result is an empty series.\r\n     *\r\n     * @param source  the source series.\r\n     * @param name  the name of the new series.\r\n     * @param periodCount  the number of periods used in the average\r\n     *                     calculation.\r\n     * @param skip  the number of initial periods to skip.\r\n     *\r\n     * @return The moving average series.\r\n     ",
      "child_ranges": [
        "(line 113,col 9)-(line 115,col 9)",
        "(line 116,col 9)-(line 120,col 9)",
        "(line 122,col 9)-(line 122,col 49)",
        "(line 124,col 9)-(line 173,col 9)",
        "(line 175,col 9)-(line 175,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.MovingAverage.createPointMovingAverage(org.jfree.data.time.TimeSeries, java.lang.String, int)",
      "begin_line": 194,
      "end_line": 227,
      "comment": "\r\n     * Creates a new {@link TimeSeries} containing moving average values for\r\n     * the given series, calculated by number of points (irrespective of the\r\n     * \u0027age\u0027 of those points).  If the series is empty (contains zero items),\r\n     * the result is an empty series.\r\n     * \u003cp\u003e\r\n     * Developed by Benoit Xhenseval (www.ObjectLab.co.uk).\r\n     *\r\n     * @param source  the source series.\r\n     * @param name  the name of the new series.\r\n     * @param pointCount  the number of POINTS used in the average calculation\r\n     *                    (not periods!)\r\n     *\r\n     * @return The moving average series.\r\n     ",
      "child_ranges": [
        "(line 197,col 9)-(line 199,col 9)",
        "(line 200,col 9)-(line 203,col 9)",
        "(line 205,col 9)-(line 205,col 49)",
        "(line 206,col 9)-(line 206,col 41)",
        "(line 207,col 9)-(line 225,col 9)",
        "(line 226,col 9)-(line 226,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.MovingAverage.createMovingAverage(org.jfree.data.xy.XYDataset, java.lang.String, long, long)",
      "begin_line": 241,
      "end_line": 247,
      "comment": "\r\n     * Creates a new {@link XYDataset} containing the moving averages of each\r\n     * series in the \u003ccode\u003esource\u003c/code\u003e dataset.\r\n     *\r\n     * @param source  the source dataset.\r\n     * @param suffix  the string to append to source series names to create\r\n     *                target series names.\r\n     * @param period  the averaging period.\r\n     * @param skip  the length of the initial skip period.\r\n     *\r\n     * @return The dataset.\r\n     ",
      "child_ranges": [
        "(line 244,col 9)-(line 245,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.MovingAverage.createMovingAverage(org.jfree.data.xy.XYDataset, java.lang.String, double, double)",
      "begin_line": 262,
      "end_line": 279,
      "comment": "\r\n     * Creates a new {@link XYDataset} containing the moving averages of each\r\n     * series in the \u003ccode\u003esource\u003c/code\u003e dataset.\r\n     *\r\n     * @param source  the source dataset.\r\n     * @param suffix  the string to append to source series names to create\r\n     *                target series names.\r\n     * @param period  the averaging period.\r\n     * @param skip  the length of the initial skip period.\r\n     *\r\n     * @return The dataset.\r\n     ",
      "child_ranges": [
        "(line 265,col 9)-(line 267,col 9)",
        "(line 269,col 9)-(line 269,col 61)",
        "(line 271,col 9)-(line 275,col 9)",
        "(line 277,col 9)-(line 277,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.MovingAverage.createMovingAverage(org.jfree.data.xy.XYDataset, int, java.lang.String, double, double)",
      "begin_line": 293,
      "end_line": 359,
      "comment": "\r\n     * Creates a new {@link XYSeries} containing the moving averages of one\r\n     * series in the \u003ccode\u003esource\u003c/code\u003e dataset.\r\n     *\r\n     * @param source  the source dataset.\r\n     * @param series  the series index (zero based).\r\n     * @param name  the name for the new series.\r\n     * @param period  the averaging period.\r\n     * @param skip  the length of the initial skip period.\r\n     *\r\n     * @return The dataset.\r\n     ",
      "child_ranges": [
        "(line 296,col 9)-(line 298,col 9)",
        "(line 299,col 9)-(line 301,col 9)",
        "(line 302,col 9)-(line 304,col 9)",
        "(line 306,col 9)-(line 306,col 45)",
        "(line 308,col 9)-(line 355,col 9)",
        "(line 357,col 9)-(line 357,col 22)"
      ]
    }
  ]
}