{
  "filepath": "/tmp/Chart-16b/source/org/jfree/chart/plot/dial/AbstractDialLayer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractDialLayer",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.plot.dial.DialLayer"
      ],
      "begin_line": 59,
      "end_line": 197,
      "comment": "\n * A base class that can be used to implement a {@link DialLayer}.  It includes\n * an event notification mechanism.\n * \n * @since 1.0.7\n "
    },
    {
      "type": "field",
      "varNames": [
        "visible"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": " A flag that controls whether or not the layer is visible. "
    },
    {
      "type": "field",
      "varNames": [
        "listenerList"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": " Storage for registered listeners. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.plot.dial.AbstractDialLayer.AbstractDialLayer()",
      "begin_line": 70,
      "end_line": 73,
      "comment": "\n     * Creates a new instance.\n     ",
      "child_ranges": [
        "(line 71,col 9)-(line 71,col 28)",
        "(line 72,col 9)-(line 72,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.AbstractDialLayer.isVisible()",
      "begin_line": 83,
      "end_line": 85,
      "comment": "\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if this layer is visible (should be displayed),\n     * and \u003ccode\u003efalse\u003c/code\u003e otherwise.\n     * \n     * @return A boolean.\n     * \n     * @see #setVisible(boolean)\n     ",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.AbstractDialLayer.setVisible(boolean)",
      "begin_line": 96,
      "end_line": 99,
      "comment": "\n     * Sets the flag that determines whether or not this layer is drawn by\n     * the plot, and sends a {@link DialLayerChangeEvent} to all registered\n     * listeners.\n     * \n     * @param visible  the flag.\n     * \n     * @see #isVisible()\n     ",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 31)",
        "(line 98,col 9)-(line 98,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.AbstractDialLayer.equals(java.lang.Object)",
      "begin_line": 108,
      "end_line": 117,
      "comment": "\n     * Tests this instance for equality with an arbitrary object.\n     * \n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\n     * \n     * @return A boolean.\n     ",
      "child_ranges": [
        "(line 109,col 9)-(line 111,col 9)",
        "(line 112,col 9)-(line 114,col 9)",
        "(line 115,col 9)-(line 115,col 57)",
        "(line 116,col 9)-(line 116,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.AbstractDialLayer.clone()",
      "begin_line": 127,
      "end_line": 132,
      "comment": "\n     * Returns a clone of this instance.\n     * \n     * @return A clone.\n     * \n     * @throws CloneNotSupportedException if there is a problem cloning this\n     *     instance.\n     ",
      "child_ranges": [
        "(line 128,col 9)-(line 128,col 68)",
        "(line 130,col 9)-(line 130,col 53)",
        "(line 131,col 9)-(line 131,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.AbstractDialLayer.addChangeListener(org.jfree.chart.plot.dial.DialLayerChangeListener)",
      "begin_line": 141,
      "end_line": 143,
      "comment": "\n     * Registers an object for notification of changes to the dial layer.\n     *\n     * @param listener  the object that is being registered.\n     * \n     * @see #removeChangeListener(DialLayerChangeListener)\n     ",
      "child_ranges": [
        "(line 142,col 9)-(line 142,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.AbstractDialLayer.removeChangeListener(org.jfree.chart.plot.dial.DialLayerChangeListener)",
      "begin_line": 152,
      "end_line": 154,
      "comment": "\n     * Deregisters an object for notification of changes to the dial layer.\n     *\n     * @param listener  the object to deregister.\n     * \n     * @see #addChangeListener(DialLayerChangeListener)\n     ",
      "child_ranges": [
        "(line 153,col 9)-(line 153,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.AbstractDialLayer.hasListener(java.util.EventListener)",
      "begin_line": 165,
      "end_line": 168,
      "comment": "\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if the specified object is registered with\n     * the dataset as a listener.  Most applications won\u0027t need to call this \n     * method, it exists mainly for use by unit testing code.\n     * \n     * @param listener  the listener.\n     * \n     * @return A boolean.\n     ",
      "child_ranges": [
        "(line 166,col 9)-(line 166,col 71)",
        "(line 167,col 9)-(line 167,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.AbstractDialLayer.notifyListeners(org.jfree.chart.plot.dial.DialLayerChangeEvent)",
      "begin_line": 176,
      "end_line": 184,
      "comment": "\n     * Notifies all registered listeners that the dial layer has changed.\n     * The {@link DialLayerChangeEvent} provides information about the change.\n     *\n     * @param event  information about the change to the axis.\n     ",
      "child_ranges": [
        "(line 177,col 9)-(line 177,col 65)",
        "(line 178,col 9)-(line 183,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.AbstractDialLayer.readObject(java.io.ObjectInputStream)",
      "begin_line": 191,
      "end_line": 195,
      "comment": "\n     * Provides serialization support.\n     *\n     * @param stream  the input stream.\n     ",
      "child_ranges": [
        "(line 193,col 9)-(line 193,col 35)",
        "(line 194,col 9)-(line 194,col 52)"
      ]
    }
  ]
}