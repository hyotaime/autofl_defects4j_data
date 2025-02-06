{
  "filepath": "/tmp/Chart-2b/source/org/jfree/chart/annotations/AbstractAnnotation.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractAnnotation",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.annotations.Annotation",
        "java.lang.Cloneable",
        "java.io.Serializable"
      ],
      "begin_line": 62,
      "end_line": 222,
      "comment": "\n * An abstract implementation of the {@link Annotation} interface, containing a\n * mechanism for registering change listeners.\n *\n * @since 1.0.14\n "
    },
    {
      "type": "field",
      "varNames": [
        "listenerList"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": " Storage for registered change listeners. "
    },
    {
      "type": "field",
      "varNames": [
        "notify"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": "\n     * A flag that indicates whether listeners should be notified\n     * about changes of the annotation.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.annotations.AbstractAnnotation.AbstractAnnotation()",
      "begin_line": 77,
      "end_line": 79,
      "comment": "\n     * Constructs an annotation.\n     ",
      "child_ranges": [
        "(line 78,col 9)-(line 78,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.AbstractAnnotation.addChangeListener(org.jfree.chart.event.AnnotationChangeListener)",
      "begin_line": 89,
      "end_line": 91,
      "comment": "\n     * Registers an object to receive notification of changes to the\n     * annotation.\n     *\n     * @param listener  the object to register.\n     *\n     * @see #removeChangeListener(AnnotationChangeListener)\n     ",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.AbstractAnnotation.removeChangeListener(org.jfree.chart.event.AnnotationChangeListener)",
      "begin_line": 101,
      "end_line": 103,
      "comment": "\n     * Deregisters an object so that it no longer receives notification of\n     * changes to the annotation.\n     *\n     * @param listener  the object to deregister.\n     *\n     * @see #addChangeListener(AnnotationChangeListener)\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.AbstractAnnotation.hasListener(java.util.EventListener)",
      "begin_line": 117,
      "end_line": 120,
      "comment": "\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if the specified object is registered with\n     * the annotation as a listener.  Most applications won\u0027t need to call this\n     * method, it exists mainly for use by unit testing code.\n     *\n     * @param listener  the listener.\n     *\n     * @return A boolean.\n     *\n     * @see #addChangeListener(AnnotationChangeListener)\n     * @see #removeChangeListener(AnnotationChangeListener)\n     ",
      "child_ranges": [
        "(line 118,col 9)-(line 118,col 71)",
        "(line 119,col 9)-(line 119,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.AbstractAnnotation.fireAnnotationChanged()",
      "begin_line": 127,
      "end_line": 131,
      "comment": "\n     * Notifies all registered listeners that the annotation has changed.\n     *\n     * @see #addChangeListener(AnnotationChangeListener)\n     ",
      "child_ranges": [
        "(line 128,col 9)-(line 130,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.AbstractAnnotation.notifyListeners(org.jfree.chart.event.AnnotationChangeEvent)",
      "begin_line": 142,
      "end_line": 152,
      "comment": "\n     * Notifies all registered listeners that the annotation has changed.\n     *\n     * @param event  contains information about the event that triggered the\n     *               notification.\n     *\n     * @see #addChangeListener(AnnotationChangeListener)\n     * @see #removeChangeListener(AnnotationChangeListener)\n     ",
      "child_ranges": [
        "(line 144,col 9)-(line 144,col 65)",
        "(line 145,col 9)-(line 150,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.AbstractAnnotation.getNotify()",
      "begin_line": 162,
      "end_line": 164,
      "comment": "\n     * Returns a flag that indicates whether listeners should be\n     * notified about changes to the annotation.\n     *\n     * @return  the flag.\n     *\n     * @see #setNotify(boolean)\n     ",
      "child_ranges": [
        "(line 163,col 9)-(line 163,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.AbstractAnnotation.setNotify(boolean)",
      "begin_line": 174,
      "end_line": 179,
      "comment": "\n     * Sets a flag that indicates whether listeners should be notified about\n     * changes of an annotation.\n     *\n     * @param flag  the flag\n     *\n     * @see #getNotify()\n     ",
      "child_ranges": [
        "(line 175,col 9)-(line 175,col 27)",
        "(line 176,col 9)-(line 178,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.AbstractAnnotation.clone()",
      "begin_line": 191,
      "end_line": 195,
      "comment": "\n     * Returns a clone of the annotation. The cloned annotation will NOT\n     * include the {@link AnnotationChangeListener} references that have been\n     * registered with this annotation.\n     *\n     * @return A clone.\n     *\n     * @throws CloneNotSupportedException  if the annotation does not support\n     *                                     cloning.\n     ",
      "child_ranges": [
        "(line 192,col 9)-(line 192,col 70)",
        "(line 193,col 9)-(line 193,col 53)",
        "(line 194,col 9)-(line 194,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.AbstractAnnotation.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 204,
      "end_line": 206,
      "comment": "\n     * Handles serialization.\n     *\n     * @param stream  the output stream.\n     *\n     * @throws IOException if there is an I/O problem.\n     ",
      "child_ranges": [
        "(line 205,col 9)-(line 205,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.AbstractAnnotation.readObject(java.io.ObjectInputStream)",
      "begin_line": 216,
      "end_line": 220,
      "comment": "\n     * Restores a serialized object.\n     *\n     * @param stream  the input stream.\n     *\n     * @throws IOException if there is an I/O problem.\n     * @throws ClassNotFoundException if there is a problem loading a class.\n     ",
      "child_ranges": [
        "(line 218,col 9)-(line 218,col 35)",
        "(line 219,col 9)-(line 219,col 52)"
      ]
    }
  ]
}