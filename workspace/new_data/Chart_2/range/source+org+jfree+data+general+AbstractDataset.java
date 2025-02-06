{
  "filepath": "/tmp/Chart-2b/source/org/jfree/data/general/AbstractDataset.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractDataset",
      "is_interface": false,
      "parent_types": [
        "org.jfree.data.general.Dataset",
        "java.lang.Cloneable",
        "java.io.Serializable",
        "java.io.ObjectInputValidation"
      ],
      "begin_line": 79,
      "end_line": 263,
      "comment": "\r\n * An abstract implementation of the {@link Dataset} interface, containing a\r\n * mechanism for registering change listeners.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 83,
      "end_line": 83,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "group"
      ],
      "begin_line": 86,
      "end_line": 86,
      "comment": " The group that the dataset belongs to. "
    },
    {
      "type": "field",
      "varNames": [
        "listenerList"
      ],
      "begin_line": 89,
      "end_line": 89,
      "comment": " Storage for registered change listeners. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.general.AbstractDataset.AbstractDataset()",
      "begin_line": 95,
      "end_line": 98,
      "comment": "\r\n     * Constructs a dataset. By default, the dataset is assigned to its own\r\n     * group.\r\n     ",
      "child_ranges": [
        "(line 96,col 9)-(line 96,col 40)",
        "(line 97,col 9)-(line 97,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.AbstractDataset.getGroup()",
      "begin_line": 107,
      "end_line": 109,
      "comment": "\r\n     * Returns the dataset group for the dataset.\r\n     *\r\n     * @return The group (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setGroup(DatasetGroup)\r\n     ",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.AbstractDataset.setGroup(org.jfree.data.general.DatasetGroup)",
      "begin_line": 118,
      "end_line": 123,
      "comment": "\r\n     * Sets the dataset group for the dataset.\r\n     *\r\n     * @param group  the group (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getGroup()\r\n     ",
      "child_ranges": [
        "(line 119,col 9)-(line 121,col 9)",
        "(line 122,col 9)-(line 122,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.AbstractDataset.addChangeListener(org.jfree.data.event.DatasetChangeListener)",
      "begin_line": 132,
      "end_line": 134,
      "comment": "\r\n     * Registers an object to receive notification of changes to the dataset.\r\n     *\r\n     * @param listener  the object to register.\r\n     *\r\n     * @see #removeChangeListener(DatasetChangeListener)\r\n     ",
      "child_ranges": [
        "(line 133,col 9)-(line 133,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.AbstractDataset.removeChangeListener(org.jfree.data.event.DatasetChangeListener)",
      "begin_line": 144,
      "end_line": 146,
      "comment": "\r\n     * Deregisters an object so that it no longer receives notification of\r\n     * changes to the dataset.\r\n     *\r\n     * @param listener  the object to deregister.\r\n     *\r\n     * @see #addChangeListener(DatasetChangeListener)\r\n     ",
      "child_ranges": [
        "(line 145,col 9)-(line 145,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.AbstractDataset.hasListener(java.util.EventListener)",
      "begin_line": 160,
      "end_line": 163,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if the specified object is registered with\r\n     * the dataset as a listener.  Most applications won\u0027t need to call this\r\n     * method, it exists mainly for use by unit testing code.\r\n     *\r\n     * @param listener  the listener.\r\n     *\r\n     * @return A boolean.\r\n     *\r\n     * @see #addChangeListener(DatasetChangeListener)\r\n     * @see #removeChangeListener(DatasetChangeListener)\r\n     ",
      "child_ranges": [
        "(line 161,col 9)-(line 161,col 71)",
        "(line 162,col 9)-(line 162,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.AbstractDataset.fireDatasetChanged(org.jfree.chart.event.DatasetChangeInfo)",
      "begin_line": 175,
      "end_line": 177,
      "comment": "\r\n     * Notifies all registered listeners that the dataset has changed.\r\n     *\r\n     * @param info  information about the change (\u003ccode\u003enull\u003c/code\u003e not\r\n     *         permitted).\r\n     *\r\n     * @see #addChangeListener(DatasetChangeListener)\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 176,col 9)-(line 176,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.AbstractDataset.notifyListeners(org.jfree.data.event.DatasetChangeEvent)",
      "begin_line": 188,
      "end_line": 196,
      "comment": "\r\n     * Notifies all registered listeners that the dataset has changed.\r\n     *\r\n     * @param event  contains information about the event that triggered the\r\n     *               notification.\r\n     *\r\n     * @see #addChangeListener(DatasetChangeListener)\r\n     * @see #removeChangeListener(DatasetChangeListener)\r\n     ",
      "child_ranges": [
        "(line 189,col 9)-(line 189,col 65)",
        "(line 190,col 9)-(line 195,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.AbstractDataset.clone()",
      "begin_line": 208,
      "end_line": 212,
      "comment": "\r\n     * Returns a clone of the dataset. The cloned dataset will NOT include the\r\n     * {@link DatasetChangeListener} references that have been registered with\r\n     * this dataset.\r\n     *\r\n     * @return A clone.\r\n     *\r\n     * @throws CloneNotSupportedException  if the dataset does not support\r\n     *                                     cloning.\r\n     ",
      "child_ranges": [
        "(line 209,col 9)-(line 209,col 64)",
        "(line 210,col 9)-(line 210,col 53)",
        "(line 211,col 9)-(line 211,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.AbstractDataset.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 221,
      "end_line": 223,
      "comment": "\r\n     * Handles serialization.\r\n     *\r\n     * @param stream  the output stream.\r\n     *\r\n     * @throws IOException if there is an I/O problem.\r\n     ",
      "child_ranges": [
        "(line 222,col 9)-(line 222,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.AbstractDataset.readObject(java.io.ObjectInputStream)",
      "begin_line": 233,
      "end_line": 239,
      "comment": "\r\n     * Restores a serialized object.\r\n     *\r\n     * @param stream  the input stream.\r\n     *\r\n     * @throws IOException if there is an I/O problem.\r\n     * @throws ClassNotFoundException if there is a problem loading a class.\r\n     ",
      "child_ranges": [
        "(line 235,col 9)-(line 235,col 35)",
        "(line 236,col 9)-(line 236,col 52)",
        "(line 237,col 9)-(line 237,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.AbstractDataset.validateObject()",
      "begin_line": 258,
      "end_line": 261,
      "comment": "\r\n     * Validates the object. We use this opportunity to call listeners who have\r\n     * registered during the deserialization process, as listeners are not\r\n     * serialized. This method is called by the serialization system after the\r\n     * entire graph is read.\r\n     *\r\n     * This object has registered itself to the system with a priority of 10.\r\n     * Other callbacks may register with a higher priority number to be called\r\n     * before this object, or with a lower priority number to be called after\r\n     * the listeners were notified.\r\n     *\r\n     * All listeners are supposed to have register by now, either in their\r\n     * readObject or validateObject methods. Notify them that this dataset has\r\n     * changed.\r\n     *\r\n     * @exception InvalidObjectException If the object cannot validate itself.\r\n     ",
      "child_ranges": [
        "(line 259,col 9)-(line 259,col 52)"
      ]
    }
  ]
}