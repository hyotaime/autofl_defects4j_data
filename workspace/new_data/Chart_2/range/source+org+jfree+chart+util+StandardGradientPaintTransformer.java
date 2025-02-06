{
  "filepath": "/tmp/Chart-2b/source/org/jfree/chart/util/StandardGradientPaintTransformer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StandardGradientPaintTransformer",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.util.GradientPaintTransformer",
        "java.lang.Cloneable",
        "org.jfree.chart.util.PublicCloneable",
        "java.io.Serializable"
      ],
      "begin_line": 54,
      "end_line": 180,
      "comment": "\n * Transforms a \u003ccode\u003eGradientPaint\u003c/code\u003e to range over the width of a target\n * shape.  Instances of this class are immutable.\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "type"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": " The transform type. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.util.StandardGradientPaintTransformer.StandardGradientPaintTransformer()",
      "begin_line": 68,
      "end_line": 70,
      "comment": "\n     * Creates a new transformer with the type\n     * {@link GradientPaintTransformType#VERTICAL}.\n     ",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 50)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.util.StandardGradientPaintTransformer.StandardGradientPaintTransformer(org.jfree.chart.util.GradientPaintTransformType)",
      "begin_line": 77,
      "end_line": 82,
      "comment": "\n     * Creates a new transformer with the specified type.\n     *\n     * @param type  the transform type (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     ",
      "child_ranges": [
        "(line 78,col 9)-(line 80,col 9)",
        "(line 81,col 9)-(line 81,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.StandardGradientPaintTransformer.getType()",
      "begin_line": 89,
      "end_line": 91,
      "comment": "\n     * Returns the type of transform.\n     *\n     * @return The type of transform (never \u003ccode\u003enull\u003c/code\u003e).\n     ",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.StandardGradientPaintTransformer.transform(java.awt.GradientPaint, java.awt.Shape)",
      "begin_line": 102,
      "end_line": 134,
      "comment": "\n     * Transforms a \u003ccode\u003eGradientPaint\u003c/code\u003e instance to fit the specified\n     * \u003ccode\u003etarget\u003c/code\u003e shape.\n     *\n     * @param paint  the original paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     * @param target  the target shape (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     *\n     * @return The transformed paint.\n     ",
      "child_ranges": [
        "(line 104,col 9)-(line 104,col 37)",
        "(line 105,col 9)-(line 105,col 50)",
        "(line 107,col 9)-(line 131,col 9)",
        "(line 133,col 9)-(line 133,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.StandardGradientPaintTransformer.equals(java.lang.Object)",
      "begin_line": 143,
      "end_line": 156,
      "comment": "\n     * Tests this instance for equality with an arbitrary object.\n     *\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\n     *\n     * @return A boolean.\n     ",
      "child_ranges": [
        "(line 144,col 9)-(line 146,col 9)",
        "(line 147,col 9)-(line 149,col 9)",
        "(line 150,col 9)-(line 151,col 57)",
        "(line 152,col 9)-(line 154,col 9)",
        "(line 155,col 9)-(line 155,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.StandardGradientPaintTransformer.clone()",
      "begin_line": 167,
      "end_line": 169,
      "comment": "\n     * Returns a clone of the transformer.  Note that instances of this class\n     * are immutable, so cloning an instance isn\u0027t really necessary.\n     *\n     * @return A clone.\n     *\n     * @throws CloneNotSupportedException not thrown by this class, but\n     *         subclasses (if any) might.\n     ",
      "child_ranges": [
        "(line 168,col 9)-(line 168,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.StandardGradientPaintTransformer.hashCode()",
      "begin_line": 176,
      "end_line": 178,
      "comment": "\n     * Returns a hash code for this object.\n     *\n     * @return A hash code.\n     ",
      "child_ranges": [
        "(line 177,col 9)-(line 177,col 62)"
      ]
    }
  ]
}