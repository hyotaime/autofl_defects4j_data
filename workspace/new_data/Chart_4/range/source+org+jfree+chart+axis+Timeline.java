{
  "filepath": "/tmp/Chart-4b/source/org/jfree/chart/axis/Timeline.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Timeline",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 74,
      "end_line": 155,
      "comment": "\r\n * An interface that defines the contract for a Timeline.\r\n * \u003cP\u003e\r\n * A Timeline will present a series of values to be used for an axis. Each\r\n * Timeline must provide transformation methods between domain values and\r\n * timeline values. In theory many transformations are possible. This interface\r\n * has been implemented completely in\r\n * {@link org.jfree.chart.axis.SegmentedTimeline}.\r\n * \u003cP\u003e\r\n * A timeline can be used as parameter to a\r\n * {@link org.jfree.chart.axis.DateAxis} to define the values that this axis\r\n * supports. As an example, the {@link org.jfree.chart.axis.SegmentedTimeline}\r\n * implements a timeline formed by segments of equal length (ex. days, hours,\r\n * minutes) where some segments can be included in the timeline and others\r\n * excluded. Therefore timelines like \"working days\" or \"working hours\" can be\r\n * created where non-working days or non-working hours respectively can be\r\n * removed from the timeline, and therefore from the axis. This creates a smooth\r\n * plot with equal separation between all included segments.\r\n * \u003cP\u003e\r\n * Because Timelines were created mainly for Date related axis, values are\r\n * represented as longs instead of doubles. In this case, the domain value is\r\n * just the number of milliseconds since January 1, 1970, 00:00:00 GMT as\r\n * defined by the getTime() method of {@link java.util.Date}.\r\n *\r\n * @see org.jfree.chart.axis.SegmentedTimeline\r\n * @see org.jfree.chart.axis.DateAxis\r\n "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Timeline.toTimelineValue(long)",
      "begin_line": 84,
      "end_line": 84,
      "comment": "\r\n     * Translates a millisecond (as defined by java.util.Date) into an index\r\n     * along this timeline.\r\n     *\r\n     * @param millisecond  the millisecond.\r\n     *\r\n     * @return A timeline value.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Timeline.toTimelineValue(java.util.Date)",
      "begin_line": 93,
      "end_line": 93,
      "comment": "\r\n     * Translates a date into a value on this timeline.\r\n     *\r\n     * @param date  the date.\r\n     *\r\n     * @return A timeline value\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Timeline.toMillisecond(long)",
      "begin_line": 109,
      "end_line": 109,
      "comment": "\r\n     * Translates a value relative to this timeline into a domain value. The\r\n     * domain value obtained by this method is not always the same domain value\r\n     * that could have been supplied to\r\n     * translateDomainValueToTimelineValue(domainValue).\r\n     * This is because the original tranformation may not be complete\r\n     * reversable.\r\n     *\r\n     * @see org.jfree.chart.axis.SegmentedTimeline\r\n     *\r\n     * @param timelineValue  a timeline value.\r\n     *\r\n     * @return A domain value.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Timeline.containsDomainValue(long)",
      "begin_line": 119,
      "end_line": 119,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if a value is contained in the timeline values.\r\n     *\r\n     * @param millisecond  the millisecond.\r\n     *\r\n     * @return \u003ccode\u003etrue\u003c/code\u003e if value is contained in the timeline and\r\n     *         \u003ccode\u003efalse\u003c/code\u003e otherwise.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Timeline.containsDomainValue(java.util.Date)",
      "begin_line": 129,
      "end_line": 129,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if a date is contained in the timeline values.\r\n     *\r\n     * @param date  the date to verify.\r\n     *\r\n     * @return \u003ccode\u003etrue\u003c/code\u003e if value is contained in the timeline and\r\n     *         \u003ccode\u003efalse\u003c/code\u003e  otherwise.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Timeline.containsDomainRange(long, long)",
      "begin_line": 141,
      "end_line": 141,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if a range of values are contained in the\r\n     * timeline.\r\n     *\r\n     * @param fromMillisecond  the start of the range to verify.\r\n     * @param toMillisecond  the end of the range to verify.\r\n     *\r\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the range is contained in the timeline or\r\n     *         \u003ccode\u003efalse\u003c/code\u003e otherwise\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Timeline.containsDomainRange(java.util.Date, java.util.Date)",
      "begin_line": 153,
      "end_line": 153,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if a range of dates are contained in the\r\n     * timeline.\r\n     *\r\n     * @param fromDate  the start of the range to verify.\r\n     * @param toDate  the end of the range to verify.\r\n     *\r\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the range is contained in the timeline or\r\n     *         \u003ccode\u003efalse\u003c/code\u003e otherwise\r\n     ",
      "child_ranges": []
    }
  ]
}