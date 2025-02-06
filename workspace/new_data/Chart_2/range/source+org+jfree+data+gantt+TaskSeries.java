{
  "filepath": "/tmp/Chart-2b/source/org/jfree/data/gantt/TaskSeries.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TaskSeries",
      "is_interface": false,
      "parent_types": [
        "org.jfree.data.general.Series"
      ],
      "begin_line": 60,
      "end_line": 199,
      "comment": "\r\n * A series that contains zero, one or many {@link Task} objects.\r\n * \u003cP\u003e\r\n * This class is used as a building block for the {@link TaskSeriesCollection}\r\n * class that can be used to construct basic Gantt charts.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "tasks"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": " Storage for the tasks in the series. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.gantt.TaskSeries.TaskSeries(java.lang.String)",
      "begin_line": 70,
      "end_line": 73,
      "comment": "\r\n     * Constructs a new series with the specified name.\r\n     *\r\n     * @param name  the series name (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 71,col 9)-(line 71,col 20)",
        "(line 72,col 9)-(line 72,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.TaskSeries.add(org.jfree.data.gantt.Task)",
      "begin_line": 82,
      "end_line": 88,
      "comment": "\r\n     * Adds a task to the series and sends a\r\n     * {@link org.jfree.data.general.SeriesChangeEvent} to all registered\r\n     * listeners.\r\n     *\r\n     * @param task  the task (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 83,col 9)-(line 85,col 9)",
        "(line 86,col 9)-(line 86,col 29)",
        "(line 87,col 9)-(line 87,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.TaskSeries.remove(org.jfree.data.gantt.Task)",
      "begin_line": 97,
      "end_line": 100,
      "comment": "\r\n     * Removes a task from the series and sends\r\n     * a {@link org.jfree.data.general.SeriesChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param task  the task.\r\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 32)",
        "(line 99,col 9)-(line 99,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.TaskSeries.removeAll()",
      "begin_line": 107,
      "end_line": 110,
      "comment": "\r\n     * Removes all tasks from the series and sends\r\n     * a {@link org.jfree.data.general.SeriesChangeEvent}\r\n     * to all registered listeners.\r\n     ",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 27)",
        "(line 109,col 9)-(line 109,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.TaskSeries.getItemCount()",
      "begin_line": 117,
      "end_line": 119,
      "comment": "\r\n     * Returns the number of items in the series.\r\n     *\r\n     * @return The item count.\r\n     ",
      "child_ranges": [
        "(line 118,col 9)-(line 118,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.TaskSeries.get(int)",
      "begin_line": 128,
      "end_line": 130,
      "comment": "\r\n     * Returns a task from the series.\r\n     *\r\n     * @param index  the task index (zero-based).\r\n     *\r\n     * @return The task.\r\n     ",
      "child_ranges": [
        "(line 129,col 9)-(line 129,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.TaskSeries.get(java.lang.String)",
      "begin_line": 139,
      "end_line": 150,
      "comment": "\r\n     * Returns the task in the series that has the specified description.\r\n     *\r\n     * @param description  the name (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The task (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 140,col 9)-(line 140,col 27)",
        "(line 141,col 9)-(line 141,col 38)",
        "(line 142,col 9)-(line 148,col 9)",
        "(line 149,col 9)-(line 149,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.TaskSeries.getTasks()",
      "begin_line": 157,
      "end_line": 159,
      "comment": "\r\n     * Returns an unmodifialble list of the tasks in the series.\r\n     *\r\n     * @return The tasks.\r\n     ",
      "child_ranges": [
        "(line 158,col 9)-(line 158,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.TaskSeries.equals(java.lang.Object)",
      "begin_line": 168,
      "end_line": 183,
      "comment": "\r\n     * Tests this object for equality with an arbitrary object.\r\n     *\r\n     * @param obj  the object to test against (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 169,col 9)-(line 171,col 9)",
        "(line 172,col 9)-(line 174,col 9)",
        "(line 175,col 9)-(line 177,col 9)",
        "(line 178,col 9)-(line 178,col 43)",
        "(line 179,col 9)-(line 181,col 9)",
        "(line 182,col 9)-(line 182,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.TaskSeries.clone()",
      "begin_line": 193,
      "end_line": 197,
      "comment": "\r\n     * Returns an independent copy of this series.\r\n     *\r\n     * @return A clone of the series.\r\n     *\r\n     * @throws CloneNotSupportedException if there is some problem cloning\r\n     *     the dataset.\r\n     ",
      "child_ranges": [
        "(line 194,col 9)-(line 194,col 54)",
        "(line 195,col 9)-(line 195,col 67)",
        "(line 196,col 9)-(line 196,col 21)"
      ]
    }
  ]
}