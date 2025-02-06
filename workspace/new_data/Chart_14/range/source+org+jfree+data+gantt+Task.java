{
  "filepath": "/tmp/Chart-14b/source/org/jfree/data/gantt/Task.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Task",
      "is_interface": false,
      "parent_types": [
        "java.lang.Cloneable",
        "org.jfree.chart.util.PublicCloneable",
        "java.io.Serializable"
      ],
      "begin_line": 60,
      "end_line": 257,
      "comment": "\r\n * A simple representation of a task.  The task has a description and a \r\n * duration.  You can add sub-tasks to the task.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "description"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": " The task description. "
    },
    {
      "type": "field",
      "varNames": [
        "duration"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": " The time period for the task (estimated or actual). "
    },
    {
      "type": "field",
      "varNames": [
        "percentComplete"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": " The percent complete (\u003ccode\u003enull\u003c/code\u003e is permitted). "
    },
    {
      "type": "field",
      "varNames": [
        "subtasks"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": " Storage for the sub-tasks (if any). "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.gantt.Task.Task(java.lang.String, org.jfree.data.time.TimePeriod)",
      "begin_line": 84,
      "end_line": 92,
      "comment": "\r\n     * Creates a new task.\r\n     *\r\n     * @param description  the task description (\u003ccode\u003enull\u003c/code\u003e not \r\n     *                     permitted).\r\n     * @param duration  the task duration (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 85,col 9)-(line 87,col 9)",
        "(line 88,col 9)-(line 88,col 39)",
        "(line 89,col 9)-(line 89,col 33)",
        "(line 90,col 9)-(line 90,col 36)",
        "(line 91,col 9)-(line 91,col 50)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.gantt.Task.Task(java.lang.String, java.util.Date, java.util.Date)",
      "begin_line": 102,
      "end_line": 104,
      "comment": "\r\n     * Creates a new task.\r\n     * \r\n     * @param description  the task description (\u003ccode\u003enull\u003c/code\u003e not \r\n     *                     permitted).\r\n     * @param start  the start date (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param end  the end date (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 103,col 9)-(line 103,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.Task.getDescription()",
      "begin_line": 111,
      "end_line": 113,
      "comment": "\r\n     * Returns the task description.\r\n     *\r\n     * @return The task description (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 112,col 9)-(line 112,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.Task.setDescription(java.lang.String)",
      "begin_line": 120,
      "end_line": 125,
      "comment": "\r\n     * Sets the task description.\r\n     *\r\n     * @param description  the description (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 121,col 9)-(line 123,col 9)",
        "(line 124,col 9)-(line 124,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.Task.getDuration()",
      "begin_line": 132,
      "end_line": 134,
      "comment": "\r\n     * Returns the duration (actual or estimated) of the task.\r\n     *\r\n     * @return The task duration (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 133,col 9)-(line 133,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.Task.setDuration(org.jfree.data.time.TimePeriod)",
      "begin_line": 141,
      "end_line": 143,
      "comment": "\r\n     * Sets the task duration (actual or estimated).\r\n     *\r\n     * @param duration  the duration (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 142,col 9)-(line 142,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.Task.getPercentComplete()",
      "begin_line": 150,
      "end_line": 152,
      "comment": "\r\n     * Returns the percentage complete for this task.\r\n     * \r\n     * @return The percentage complete (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 151,col 9)-(line 151,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.Task.setPercentComplete(java.lang.Double)",
      "begin_line": 159,
      "end_line": 161,
      "comment": "\r\n     * Sets the percentage complete for the task.\r\n     * \r\n     * @param percent  the percentage (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 160,col 9)-(line 160,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.Task.setPercentComplete(double)",
      "begin_line": 168,
      "end_line": 170,
      "comment": "\r\n     * Sets the percentage complete for the task.\r\n     * \r\n     * @param percent  the percentage.\r\n     ",
      "child_ranges": [
        "(line 169,col 9)-(line 169,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.Task.addSubtask(org.jfree.data.gantt.Task)",
      "begin_line": 177,
      "end_line": 182,
      "comment": "\r\n     * Adds a sub-task to the task.\r\n     *\r\n     * @param subtask  the subtask (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 178,col 9)-(line 180,col 9)",
        "(line 181,col 9)-(line 181,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.Task.removeSubtask(org.jfree.data.gantt.Task)",
      "begin_line": 189,
      "end_line": 191,
      "comment": "\r\n     * Removes a sub-task from the task.\r\n     *\r\n     * @param subtask  the subtask.\r\n     ",
      "child_ranges": [
        "(line 190,col 9)-(line 190,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.Task.getSubtaskCount()",
      "begin_line": 198,
      "end_line": 200,
      "comment": "\r\n     * Returns the sub-task count.\r\n     *\r\n     * @return The sub-task count.\r\n     ",
      "child_ranges": [
        "(line 199,col 9)-(line 199,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.Task.getSubtask(int)",
      "begin_line": 209,
      "end_line": 211,
      "comment": "\r\n     * Returns a sub-task.\r\n     *\r\n     * @param index  the index.\r\n     *\r\n     * @return The sub-task.\r\n     ",
      "child_ranges": [
        "(line 210,col 9)-(line 210,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.Task.equals(java.lang.Object)",
      "begin_line": 220,
      "end_line": 242,
      "comment": "\r\n     * Tests this object for equality with an arbitrary object.\r\n     *\r\n     * @param object  the other object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 221,col 9)-(line 223,col 9)",
        "(line 224,col 9)-(line 226,col 9)",
        "(line 227,col 9)-(line 227,col 34)",
        "(line 228,col 9)-(line 230,col 9)",
        "(line 231,col 9)-(line 233,col 9)",
        "(line 234,col 9)-(line 237,col 9)",
        "(line 238,col 9)-(line 240,col 9)",
        "(line 241,col 9)-(line 241,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.Task.clone()",
      "begin_line": 252,
      "end_line": 255,
      "comment": "\r\n     * Returns a clone of the task.\r\n     * \r\n     * @return A clone.\r\n     * \r\n     * @throws CloneNotSupportedException  never thrown by this class, but \r\n     *         subclasses may not support cloning.\r\n     ",
      "child_ranges": [
        "(line 253,col 9)-(line 253,col 42)",
        "(line 254,col 9)-(line 254,col 21)"
      ]
    }
  ]
}