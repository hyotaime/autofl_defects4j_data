{
  "filepath": "/tmp/Chart-2b/source/org/jfree/chart/plot/dial/AbstractDialLayer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractDialLayer",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.plot.dial.DialLayer"
      ],
      "begin_line": 61,
      "end_line": 213,
      "comment": "\n * A base class that can be used to implement a {@link DialLayer}.  It includes\n * an event notification mechanism.\n *\n * @since 1.0.7\n "
    },
    {
      "type": "field",
      "varNames": [
        "visible"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": " A flag that controls whether or not the layer is visible. "
    },
    {
      "type": "field",
      "varNames": [
        "listenerList"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": " Storage for registered listeners. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.plot.dial.AbstractDialLayer.AbstractDialLayer()",
      "begin_line": 72,
      "end_line": 75,
      "comment": "\n     * Creates a new instance.\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 28)",
        "(line 74,col 9)-(line 74,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.AbstractDialLayer.isVisible()",
      "begin_line": 85,
      "end_line": 87,
      "comment": "\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if this layer is visible (should be displayed),\n     * and \u003ccode\u003efalse\u003c/code\u003e otherwise.\n     *\n     * @return A boolean.\n     *\n     * @see #setVisible(boolean)\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.AbstractDialLayer.setVisible(boolean)",
      "begin_line": 98,
      "end_line": 101,
      "comment": "\n     * Sets the flag that determines whether or not this layer is drawn by\n     * the plot, and sends a {@link DialLayerChangeEvent} to all registered\n     * listeners.\n     *\n     * @param visible  the flag.\n     *\n     * @see #isVisible()\n     ",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 31)",
        "(line 100,col 9)-(line 100,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.AbstractDialLayer.equals(java.lang.Object)",
      "begin_line": 110,
      "end_line": 119,
      "comment": "\n     * Tests this instance for equality with an arbitrary object.\n     *\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\n     *\n     * @return A boolean.\n     ",
      "child_ranges": [
        "(line 111,col 9)-(line 113,col 9)",
        "(line 114,col 9)-(line 116,col 9)",
        "(line 117,col 9)-(line 117,col 57)",
        "(line 118,col 9)-(line 118,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.AbstractDialLayer.hashCode()",
      "begin_line": 126,
      "end_line": 130,
      "comment": "\n     * Returns a hash code for this instance.\n     *\n     * @return A hash code.\n     ",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 24)",
        "(line 128,col 9)-(line 128,col 62)",
        "(line 129,col 9)-(line 129,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.AbstractDialLayer.clone()",
      "begin_line": 140,
      "end_line": 145,
      "comment": "\n     * Returns a clone of this instance.\n     *\n     * @return A clone.\n     *\n     * @throws CloneNotSupportedException if there is a problem cloning this\n     *     instance.\n     ",
      "child_ranges": [
        "(line 141,col 9)-(line 141,col 68)",
        "(line 143,col 9)-(line 143,col 53)",
        "(line 144,col 9)-(line 144,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.AbstractDialLayer.addChangeListener(org.jfree.chart.plot.dial.DialLayerChangeListener)",
      "begin_line": 154,
      "end_line": 156,
      "comment": "\n     * Registers an object for notification of changes to the dial layer.\n     *\n     * @param listener  the object that is being registered.\n     *\n     * @see #removeChangeListener(DialLayerChangeListener)\n     ",
      "child_ranges": [
        "(line 155,col 9)-(line 155,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.AbstractDialLayer.removeChangeListener(org.jfree.chart.plot.dial.DialLayerChangeListener)",
      "begin_line": 165,
      "end_line": 167,
      "comment": "\n     * Deregisters an object for notification of changes to the dial layer.\n     *\n     * @param listener  the object to deregister.\n     *\n     * @see #addChangeListener(DialLayerChangeListener)\n     ",
      "child_ranges": [
        "(line 166,col 9)-(line 166,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.AbstractDialLayer.hasListener(java.util.EventListener)",
      "begin_line": 178,
      "end_line": 181,
      "comment": "\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if the specified object is registered with\n     * the dataset as a listener.  Most applications won\u0027t need to call this\n     * method, it exists mainly for use by unit testing code.\n     *\n     * @param listener  the listener.\n     *\n     * @return A boolean.\n     ",
      "child_ranges": [
        "(line 179,col 9)-(line 179,col 71)",
        "(line 180,col 9)-(line 180,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.AbstractDialLayer.notifyListeners(org.jfree.chart.plot.dial.DialLayerChangeEvent)",
      "begin_line": 189,
      "end_line": 197,
      "comment": "\n     * Notifies all registered listeners that the dial layer has changed.\n     * The {@link DialLayerChangeEvent} provides information about the change.\n     *\n     * @param event  information about the change to the axis.\n     ",
      "child_ranges": [
        "(line 190,col 9)-(line 190,col 65)",
        "(line 191,col 9)-(line 196,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.AbstractDialLayer.readObject(java.io.ObjectInputStream)",
      "begin_line": 207,
      "end_line": 211,
      "comment": "\n     * Provides serialization support.\n     *\n     * @param stream  the input stream.\n     *\n     * @throws IOException  if there is an I/O error.\n     * @throws ClassNotFoundException  if there is a classpath problem.\n     ",
      "child_ranges": [
        "(line 209,col 9)-(line 209,col 35)",
        "(line 210,col 9)-(line 210,col 52)"
      ]
    }
  ]
}