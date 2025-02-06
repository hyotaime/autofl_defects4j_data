{
  "filepath": "/tmp/Chart-14b/source/org/jfree/data/gantt/TaskSeries.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TaskSeries",
      "is_interface": false,
      "parent_types": [
        "org.jfree.data.general.Series"
      ],
      "begin_line": 58,
      "end_line": 183,
      "comment": "\r\n * A series that contains zero, one or many {@link Task} objects.\r\n * \u003cP\u003e\r\n * This class is used as a building block for the {@link TaskSeriesCollection}\r\n * class that can be used to construct basic Gantt charts.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "tasks"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": " Storage for the tasks in the series. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.gantt.TaskSeries.TaskSeries(java.lang.String)",
      "begin_line": 68,
      "end_line": 71,
      "comment": "\r\n     * Constructs a new series with the specified name.\r\n     *\r\n     * @param name  the series name (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 20)",
        "(line 70,col 9)-(line 70,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.TaskSeries.add(org.jfree.data.gantt.Task)",
      "begin_line": 80,
      "end_line": 86,
      "comment": "\r\n     * Adds a task to the series and sends a \r\n     * {@link org.jfree.data.general.SeriesChangeEvent} to all registered \r\n     * listeners.\r\n     *\r\n     * @param task  the task (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 81,col 9)-(line 83,col 9)",
        "(line 84,col 9)-(line 84,col 29)",
        "(line 85,col 9)-(line 85,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.TaskSeries.remove(org.jfree.data.gantt.Task)",
      "begin_line": 95,
      "end_line": 98,
      "comment": "\r\n     * Removes a task from the series and sends \r\n     * a {@link org.jfree.data.general.SeriesChangeEvent} \r\n     * to all registered listeners.\r\n     *\r\n     * @param task  the task.\r\n     ",
      "child_ranges": [
        "(line 96,col 9)-(line 96,col 32)",
        "(line 97,col 9)-(line 97,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.TaskSeries.removeAll()",
      "begin_line": 105,
      "end_line": 108,
      "comment": "\r\n     * Removes all tasks from the series and sends \r\n     * a {@link org.jfree.data.general.SeriesChangeEvent} \r\n     * to all registered listeners.\r\n     ",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 27)",
        "(line 107,col 9)-(line 107,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.TaskSeries.getItemCount()",
      "begin_line": 115,
      "end_line": 117,
      "comment": "\r\n     * Returns the number of items in the series.\r\n     *\r\n     * @return The item count.\r\n     ",
      "child_ranges": [
        "(line 116,col 9)-(line 116,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.TaskSeries.get(int)",
      "begin_line": 126,
      "end_line": 128,
      "comment": "\r\n     * Returns a task from the series.\r\n     *\r\n     * @param index  the task index (zero-based).\r\n     *\r\n     * @return The task.\r\n     ",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.TaskSeries.get(java.lang.String)",
      "begin_line": 137,
      "end_line": 148,
      "comment": "\r\n     * Returns the task in the series that has the specified description.\r\n     * \r\n     * @param description  the name (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @return The task (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 138,col 9)-(line 138,col 27)",
        "(line 139,col 9)-(line 139,col 38)",
        "(line 140,col 9)-(line 146,col 9)",
        "(line 147,col 9)-(line 147,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.TaskSeries.getTasks()",
      "begin_line": 155,
      "end_line": 157,
      "comment": "\r\n     * Returns an unmodifialble list of the tasks in the series.\r\n     *\r\n     * @return The tasks.\r\n     ",
      "child_ranges": [
        "(line 156,col 9)-(line 156,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.TaskSeries.equals(java.lang.Object)",
      "begin_line": 166,
      "end_line": 181,
      "comment": "\r\n     * Tests this object for equality with an arbitrary object.\r\n     * \r\n     * @param obj  the object to test against (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 167,col 9)-(line 169,col 9)",
        "(line 170,col 9)-(line 172,col 9)",
        "(line 173,col 9)-(line 175,col 9)",
        "(line 176,col 9)-(line 176,col 43)",
        "(line 177,col 9)-(line 179,col 9)",
        "(line 180,col 9)-(line 180,col 20)"
      ]
    }
  ]
}