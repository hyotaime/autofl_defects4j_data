{
  "filepath": "/tmp/Chart-14b/source/org/jfree/data/general/Series.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Series",
      "is_interface": false,
      "parent_types": [
        "java.lang.Cloneable",
        "java.io.Serializable"
      ],
      "begin_line": 76,
      "end_line": 367,
      "comment": "\r\n * Base class representing a data series.  Subclasses are left to implement the\r\n * actual data structures.\r\n * \u003cP\u003e\r\n * The series has two properties (\"Key\" and \"Description\") for which you can\r\n * register a \u003ccode\u003ePropertyChangeListener\u003c/code\u003e.\r\n * \u003cP\u003e\r\n * You can also register a {@link SeriesChangeListener} to receive notification \r\n * of changes to the series data.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "key"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": " The key for the series. "
    },
    {
      "type": "field",
      "varNames": [
        "description"
      ],
      "begin_line": 85,
      "end_line": 85,
      "comment": " A description of the series. "
    },
    {
      "type": "field",
      "varNames": [
        "listeners"
      ],
      "begin_line": 88,
      "end_line": 88,
      "comment": " Storage for registered change listeners. "
    },
    {
      "type": "field",
      "varNames": [
        "propertyChangeSupport"
      ],
      "begin_line": 91,
      "end_line": 91,
      "comment": " Object to support property change notification. "
    },
    {
      "type": "field",
      "varNames": [
        "notify"
      ],
      "begin_line": 94,
      "end_line": 94,
      "comment": " A flag that controls whether or not changes are notified. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.general.Series.Series(java.lang.Comparable)",
      "begin_line": 101,
      "end_line": 103,
      "comment": "\r\n     * Creates a new series with the specified key.  \r\n     *\r\n     * @param key  the series key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 24)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.general.Series.Series(java.lang.Comparable, java.lang.String)",
      "begin_line": 111,
      "end_line": 120,
      "comment": "\r\n     * Creates a new series with the specified key and description.\r\n     *\r\n     * @param key  the series key (\u003ccode\u003enull\u003c/code\u003e NOT permitted).\r\n     * @param description  the series description (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 112,col 9)-(line 114,col 9)",
        "(line 115,col 9)-(line 115,col 23)",
        "(line 116,col 9)-(line 116,col 39)",
        "(line 117,col 9)-(line 117,col 49)",
        "(line 118,col 9)-(line 118,col 69)",
        "(line 119,col 9)-(line 119,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.Series.getKey()",
      "begin_line": 129,
      "end_line": 131,
      "comment": "\r\n     * Returns the key for the series.\r\n     *\r\n     * @return The series key (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setKey(Comparable)\r\n     ",
      "child_ranges": [
        "(line 130,col 9)-(line 130,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.Series.setKey(java.lang.Comparable)",
      "begin_line": 141,
      "end_line": 148,
      "comment": "\r\n     * Sets the key for the series and sends a \u003ccode\u003ePropertyChangeEvent\u003c/code\u003e \r\n     * (with the property name \"Key\") to all registered listeners.\r\n     *\r\n     * @param key  the key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getKey()\r\n     ",
      "child_ranges": [
        "(line 142,col 9)-(line 144,col 9)",
        "(line 145,col 9)-(line 145,col 34)",
        "(line 146,col 9)-(line 146,col 23)",
        "(line 147,col 9)-(line 147,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.Series.getDescription()",
      "begin_line": 157,
      "end_line": 159,
      "comment": "\r\n     * Returns a description of the series.\r\n     *\r\n     * @return The series description (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setDescription(String)\r\n     ",
      "child_ranges": [
        "(line 158,col 9)-(line 158,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.Series.setDescription(java.lang.String)",
      "begin_line": 169,
      "end_line": 174,
      "comment": "\r\n     * Sets the description of the series and sends a \r\n     * \u003ccode\u003ePropertyChangeEvent\u003c/code\u003e to all registered listeners.\r\n     *\r\n     * @param description  the description (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getDescription()\r\n     ",
      "child_ranges": [
        "(line 170,col 9)-(line 170,col 38)",
        "(line 171,col 9)-(line 171,col 39)",
        "(line 172,col 9)-(line 173,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.Series.getNotify()",
      "begin_line": 184,
      "end_line": 186,
      "comment": "\r\n     * Returns the flag that controls whether or not change events are sent to \r\n     * registered listeners.\r\n     * \r\n     * @return A boolean.\r\n     * \r\n     * @see #setNotify(boolean)\r\n     ",
      "child_ranges": [
        "(line 185,col 9)-(line 185,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.Series.setNotify(boolean)",
      "begin_line": 196,
      "end_line": 201,
      "comment": "\r\n     * Sets the flag that controls whether or not change events are sent to \r\n     * registered listeners.\r\n     * \r\n     * @param notify  the new value of the flag.\r\n     * \r\n     * @see #getNotify()\r\n     ",
      "child_ranges": [
        "(line 197,col 9)-(line 200,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.Series.isEmpty()",
      "begin_line": 211,
      "end_line": 213,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if the series contains no data items, and\r\n     * \u003ccode\u003efalse\u003c/code\u003e otherwise.\r\n     * \r\n     * @return A boolean.\r\n     * \r\n     * @since 1.0.7\r\n     ",
      "child_ranges": [
        "(line 212,col 9)-(line 212,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.Series.getItemCount()",
      "begin_line": 220,
      "end_line": 220,
      "comment": "\r\n     * Returns the number of data items in the series.\r\n     * \r\n     * @return The number of data items in the series.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.Series.clone()",
      "begin_line": 239,
      "end_line": 246,
      "comment": "\r\n     * Returns a clone of the series.\r\n     * \u003cP\u003e\r\n     * Notes:\r\n     * \u003cul\u003e\r\n     * \u003cli\u003eNo need to clone the name or description, since String object is \r\n     * immutable.\u003c/li\u003e\r\n     * \u003cli\u003eWe set the listener list to empty, since the listeners did not \r\n     * register with the clone.\u003c/li\u003e\r\n     * \u003cli\u003eSame applies to the PropertyChangeSupport instance.\u003c/li\u003e\r\n     * \u003c/ul\u003e\r\n     *\r\n     * @return A clone of the series.\r\n     * \r\n     * @throws CloneNotSupportedException  not thrown by this class, but \r\n     *         subclasses may differ.\r\n     ",
      "child_ranges": [
        "(line 241,col 9)-(line 241,col 46)",
        "(line 242,col 9)-(line 242,col 50)",
        "(line 243,col 9)-(line 243,col 71)",
        "(line 244,col 9)-(line 244,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.Series.equals(java.lang.Object)",
      "begin_line": 255,
      "end_line": 270,
      "comment": "\r\n     * Tests the series for equality with another object.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return \u003ccode\u003etrue\u003c/code\u003e or \u003ccode\u003efalse\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 256,col 9)-(line 258,col 9)",
        "(line 259,col 9)-(line 261,col 9)",
        "(line 262,col 9)-(line 262,col 35)",
        "(line 263,col 9)-(line 265,col 9)",
        "(line 266,col 9)-(line 268,col 9)",
        "(line 269,col 9)-(line 269,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.Series.hashCode()",
      "begin_line": 277,
      "end_line": 283,
      "comment": "\r\n     * Returns a hash code.\r\n     * \r\n     * @return A hash code.\r\n     ",
      "child_ranges": [
        "(line 278,col 9)-(line 278,col 19)",
        "(line 279,col 9)-(line 279,col 37)",
        "(line 280,col 9)-(line 281,col 51)",
        "(line 282,col 9)-(line 282,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.Series.addChangeListener(org.jfree.data.general.SeriesChangeListener)",
      "begin_line": 294,
      "end_line": 296,
      "comment": "\r\n     * Registers an object with this series, to receive notification whenever \r\n     * the series changes.\r\n     * \u003cP\u003e\r\n     * Objects being registered must implement the {@link SeriesChangeListener} \r\n     * interface.\r\n     *\r\n     * @param listener  the listener to register.\r\n     ",
      "child_ranges": [
        "(line 295,col 9)-(line 295,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.Series.removeChangeListener(org.jfree.data.general.SeriesChangeListener)",
      "begin_line": 304,
      "end_line": 306,
      "comment": "\r\n     * Deregisters an object, so that it not longer receives notification \r\n     * whenever the series changes.\r\n     *\r\n     * @param listener  the listener to deregister.\r\n     ",
      "child_ranges": [
        "(line 305,col 9)-(line 305,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.Series.fireSeriesChanged()",
      "begin_line": 312,
      "end_line": 316,
      "comment": "\r\n     * General method for signalling to registered listeners that the series\r\n     * has been changed.\r\n     ",
      "child_ranges": [
        "(line 313,col 9)-(line 315,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.Series.notifyListeners(org.jfree.data.general.SeriesChangeEvent)",
      "begin_line": 324,
      "end_line": 334,
      "comment": "\r\n     * Sends a change event to all registered listeners.\r\n     *\r\n     * @param event  contains information about the event that triggered the \r\n     *               notification.\r\n     ",
      "child_ranges": [
        "(line 326,col 9)-(line 326,col 65)",
        "(line 327,col 9)-(line 332,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.Series.addPropertyChangeListener(java.beans.PropertyChangeListener)",
      "begin_line": 341,
      "end_line": 343,
      "comment": "\r\n     * Adds a property change listener to the series.\r\n     *\r\n     * @param listener  the listener.\r\n     ",
      "child_ranges": [
        "(line 342,col 9)-(line 342,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.Series.removePropertyChangeListener(java.beans.PropertyChangeListener)",
      "begin_line": 350,
      "end_line": 352,
      "comment": "\r\n     * Removes a property change listener from the series.\r\n     *\r\n     * @param listener The listener.\r\n     ",
      "child_ranges": [
        "(line 351,col 9)-(line 351,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.Series.firePropertyChange(java.lang.String, java.lang.Object, java.lang.Object)",
      "begin_line": 361,
      "end_line": 365,
      "comment": "\r\n     * Fires a property change event.\r\n     *\r\n     * @param property  the property key.\r\n     * @param oldValue  the old value.\r\n     * @param newValue  the new value.\r\n     ",
      "child_ranges": [
        "(line 363,col 9)-(line 364,col 26)"
      ]
    }
  ]
}