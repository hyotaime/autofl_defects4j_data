{
  "filepath": "/tmp/Chart-2b/source/org/jfree/chart/util/ApplicationFrame.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ApplicationFrame",
      "is_interface": false,
      "parent_types": [
        "javax.swing.JFrame",
        "java.awt.event.WindowListener"
      ],
      "begin_line": 55,
      "end_line": 133,
      "comment": "\n * A base class for creating the main frame for simple applications.  The frame\n * listens for window closing events, and responds by shutting down the JVM.\n * This is OK for small demo applications...for more serious applications,\n * you\u0027ll want to use something more robust.\n "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.util.ApplicationFrame.ApplicationFrame(java.lang.String)",
      "begin_line": 62,
      "end_line": 65,
      "comment": "\n     * Constructs a new application frame.\n     *\n     * @param title  the frame title.\n     ",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 21)",
        "(line 64,col 9)-(line 64,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.ApplicationFrame.windowClosing(java.awt.event.WindowEvent)",
      "begin_line": 72,
      "end_line": 77,
      "comment": "\n     * Listens for the main window closing, and shuts down the application.\n     *\n     * @param event  information about the window event.\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 76,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.ApplicationFrame.windowClosed(java.awt.event.WindowEvent)",
      "begin_line": 84,
      "end_line": 86,
      "comment": "\n     * Required for WindowListener interface, but not used by this class.\n     *\n     * @param event  information about the window event.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.ApplicationFrame.windowActivated(java.awt.event.WindowEvent)",
      "begin_line": 93,
      "end_line": 95,
      "comment": "\n     * Required for WindowListener interface, but not used by this class.\n     *\n     * @param event  information about the window event.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.ApplicationFrame.windowDeactivated(java.awt.event.WindowEvent)",
      "begin_line": 102,
      "end_line": 104,
      "comment": "\n     * Required for WindowListener interface, but not used by this class.\n     *\n     * @param event  information about the window event.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.ApplicationFrame.windowDeiconified(java.awt.event.WindowEvent)",
      "begin_line": 111,
      "end_line": 113,
      "comment": "\n     * Required for WindowListener interface, but not used by this class.\n     *\n     * @param event  information about the window event.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.ApplicationFrame.windowIconified(java.awt.event.WindowEvent)",
      "begin_line": 120,
      "end_line": 122,
      "comment": "\n     * Required for WindowListener interface, but not used by this class.\n     *\n     * @param event  information about the window event.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.ApplicationFrame.windowOpened(java.awt.event.WindowEvent)",
      "begin_line": 129,
      "end_line": 131,
      "comment": "\n     * Required for WindowListener interface, but not used by this class.\n     *\n     * @param event  information about the window event.\n     ",
      "child_ranges": []
    }
  ]
}