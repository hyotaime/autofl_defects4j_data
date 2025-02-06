{
  "filepath": "/tmp/Chart-2b/source/org/jfree/chart/event/AnnotationChangeEvent.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AnnotationChangeEvent",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.event.ChartChangeEvent"
      ],
      "begin_line": 51,
      "end_line": 80,
      "comment": "\n * An event that can be forwarded to any {@link AnnotationChangeListener} to\n * signal a change to an {@link Annotation}.\n *\n * @since 1.0.14\n "
    },
    {
      "type": "field",
      "varNames": [
        "annotation"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": " The plot that generated the event. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.event.AnnotationChangeEvent.AnnotationChangeEvent(java.lang.Object, org.jfree.chart.annotations.Annotation)",
      "begin_line": 64,
      "end_line": 67,
      "comment": "\n     * Creates a new \u003ccode\u003eAnnotationChangeEvent\u003c/code\u003e instance.\n     *\n     * @param annotation  the annotation that triggered the event\n     *     (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     *\n     * @since 1.0.14\n     ",
      "child_ranges": [
        "(line 65,col 9)-(line 65,col 22)",
        "(line 66,col 9)-(line 66,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.event.AnnotationChangeEvent.getAnnotation()",
      "begin_line": 76,
      "end_line": 78,
      "comment": "\n     * Returns the annotation that triggered the event.\n     *\n     * @return The annotation that triggered the event (never \u003ccode\u003enull\u003c/code\u003e).\n     *\n     * @since 1.0.14\n     ",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 31)"
      ]
    }
  ]
}