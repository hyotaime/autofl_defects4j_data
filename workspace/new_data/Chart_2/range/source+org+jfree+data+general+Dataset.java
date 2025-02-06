{
  "filepath": "/tmp/Chart-2b/source/org/jfree/data/general/Dataset.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Dataset",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 65,
      "end_line": 95,
      "comment": "\r\n * The base interface for data sets.\r\n * \u003cP\u003e\r\n * All datasets are required to support the {@link DatasetChangeEvent}\r\n * mechanism by allowing listeners to register and receive notification of any\r\n * changes to the dataset.\r\n * \u003cP\u003e\r\n * In addition, all datasets must belong to one (and only one)\r\n * {@link DatasetGroup}.  The group object maintains a reader-writer lock\r\n * which provides synchronised access to the datasets in multi-threaded code.\r\n "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.Dataset.addChangeListener(org.jfree.data.event.DatasetChangeListener)",
      "begin_line": 72,
      "end_line": 72,
      "comment": "\r\n     * Registers an object for notification of changes to the dataset.\r\n     *\r\n     * @param listener  the object to register.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.Dataset.removeChangeListener(org.jfree.data.event.DatasetChangeListener)",
      "begin_line": 79,
      "end_line": 79,
      "comment": "\r\n     * Deregisters an object for notification of changes to the dataset.\r\n     *\r\n     * @param listener  the object to deregister.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.Dataset.getGroup()",
      "begin_line": 86,
      "end_line": 86,
      "comment": "\r\n     * Returns the dataset group.\r\n     *\r\n     * @return The dataset group.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.Dataset.setGroup(org.jfree.data.general.DatasetGroup)",
      "begin_line": 93,
      "end_line": 93,
      "comment": "\r\n     * Sets the dataset group.\r\n     *\r\n     * @param group  the dataset group.\r\n     ",
      "child_ranges": []
    }
  ]
}