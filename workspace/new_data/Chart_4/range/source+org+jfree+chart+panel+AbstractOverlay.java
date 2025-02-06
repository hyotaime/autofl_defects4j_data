{
  "filepath": "/tmp/Chart-4b/source/org/jfree/chart/panel/AbstractOverlay.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractOverlay",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 54,
      "end_line": 120,
      "comment": "\n * A base class for implementing overlays for a {@link ChartPanel}.\n *\n * @since 1.0.13\n "
    },
    {
      "type": "field",
      "varNames": [
        "changeListeners"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": " Storage for registered change listeners. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.panel.AbstractOverlay.AbstractOverlay()",
      "begin_line": 62,
      "end_line": 64,
      "comment": "\n     * Default constructor.\n     ",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.panel.AbstractOverlay.addChangeListener(org.jfree.chart.event.OverlayChangeListener)",
      "begin_line": 73,
      "end_line": 78,
      "comment": "\n     * Registers an object for notification of changes to the overlay.\n     *\n     * @param listener  the listener (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     *\n     * @see #removeChangeListener(OverlayChangeListener)\n     ",
      "child_ranges": [
        "(line 74,col 9)-(line 76,col 9)",
        "(line 77,col 9)-(line 77,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.panel.AbstractOverlay.removeChangeListener(org.jfree.chart.event.OverlayChangeListener)",
      "begin_line": 87,
      "end_line": 92,
      "comment": "\n     * Deregisters an object for notification of changes to the overlay.\n     *\n     * @param listener  the listener (\u003ccode\u003enull\u003c/code\u003e not permitted)\n     *\n     * @see #addChangeListener(OverlayChangeListener)\n     ",
      "child_ranges": [
        "(line 88,col 9)-(line 90,col 9)",
        "(line 91,col 9)-(line 91,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.panel.AbstractOverlay.fireOverlayChanged()",
      "begin_line": 99,
      "end_line": 102,
      "comment": "\n     * Sends a default {@link ChartChangeEvent} to all registered listeners.\n     * \u003cP\u003e\n     * This method is for convenience only.\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 64)",
        "(line 101,col 9)-(line 101,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.panel.AbstractOverlay.notifyListeners(org.jfree.chart.event.OverlayChangeEvent)",
      "begin_line": 110,
      "end_line": 118,
      "comment": "\n     * Sends a {@link ChartChangeEvent} to all registered listeners.\n     *\n     * @param event  information about the event that triggered the\n     *               notification.\n     ",
      "child_ranges": [
        "(line 111,col 8)-(line 111,col 67)",
        "(line 112,col 9)-(line 117,col 9)"
      ]
    }
  ]
}