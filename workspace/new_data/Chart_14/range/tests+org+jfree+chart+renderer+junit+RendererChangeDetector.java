{
  "filepath": "/tmp/Chart-14b/tests/org/jfree/chart/renderer/junit/RendererChangeDetector.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RendererChangeDetector",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.event.RendererChangeListener"
      ],
      "begin_line": 50,
      "end_line": 91,
      "comment": "\n * A simple class for detecting whether or not a renderer has generated \n * a {@link RendererChangeEvent}.\n "
    },
    {
      "type": "field",
      "varNames": [
        "notified"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": " A flag that records whether or not a change event has been received. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.renderer.junit.RendererChangeDetector.RendererChangeDetector()",
      "begin_line": 58,
      "end_line": 60,
      "comment": "\n     * Creates a new detector.\n     ",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.junit.RendererChangeDetector.getNotified()",
      "begin_line": 68,
      "end_line": 70,
      "comment": "\n     * Returns the flag that indicates whether or not a change event has been \n     * received.\n     * \n     * @return The flag.\n     ",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.junit.RendererChangeDetector.setNotified(boolean)",
      "begin_line": 78,
      "end_line": 80,
      "comment": "\n     * Sets the flag that indicates whether or not a change event has been \n     * received.\n     * \n     * @param notified  the new value of the flag.\n     ",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.junit.RendererChangeDetector.rendererChanged(org.jfree.chart.event.RendererChangeEvent)",
      "begin_line": 87,
      "end_line": 89,
      "comment": "\n     * Receives a {@link RendererChangeEvent} from a renderer.\n     * \n     * @param event  the event.\n     ",
      "child_ranges": [
        "(line 88,col 9)-(line 88,col 29)"
      ]
    }
  ]
}