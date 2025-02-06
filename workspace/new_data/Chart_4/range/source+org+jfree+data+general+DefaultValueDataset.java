{
  "filepath": "/tmp/Chart-4b/source/org/jfree/data/general/DefaultValueDataset.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DefaultValueDataset",
      "is_interface": false,
      "parent_types": [
        "org.jfree.data.general.AbstractDataset",
        "org.jfree.data.general.ValueDataset",
        "java.lang.Cloneable",
        "org.jfree.chart.util.PublicCloneable",
        "java.io.Serializable"
      ],
      "begin_line": 58,
      "end_line": 140,
      "comment": "\r\n * A dataset that stores a single value (that is possibly \u003ccode\u003enull\u003c/code\u003e).\r\n * This class provides a default implementation of the {@link ValueDataset}\r\n * interface.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": " The value. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.general.DefaultValueDataset.DefaultValueDataset()",
      "begin_line": 70,
      "end_line": 72,
      "comment": "\r\n     * Constructs a new dataset, initially empty.\r\n     ",
      "child_ranges": [
        "(line 71,col 9)-(line 71,col 19)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.general.DefaultValueDataset.DefaultValueDataset(double)",
      "begin_line": 79,
      "end_line": 81,
      "comment": "\r\n     * Creates a new dataset with the specified value.\r\n     *\r\n     * @param value  the value.\r\n     ",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 32)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.general.DefaultValueDataset.DefaultValueDataset(java.lang.Number)",
      "begin_line": 88,
      "end_line": 91,
      "comment": "\r\n     * Creates a new dataset with the specified value.\r\n     *\r\n     * @param value  the initial value (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 16)",
        "(line 90,col 9)-(line 90,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DefaultValueDataset.getValue()",
      "begin_line": 98,
      "end_line": 100,
      "comment": "\r\n     * Returns the value.\r\n     *\r\n     * @return The value (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DefaultValueDataset.setValue(java.lang.Number)",
      "begin_line": 108,
      "end_line": 111,
      "comment": "\r\n     * Sets the value and sends a {@link DatasetChangeEvent} to all registered\r\n     * listeners.\r\n     *\r\n     * @param value  the new value (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 27)",
        "(line 110,col 9)-(line 110,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DefaultValueDataset.equals(java.lang.Object)",
      "begin_line": 120,
      "end_line": 129,
      "comment": "\r\n     * Tests this dataset for equality with an arbitrary object.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 121,col 9)-(line 123,col 9)",
        "(line 124,col 9)-(line 127,col 9)",
        "(line 128,col 9)-(line 128,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DefaultValueDataset.hashCode()",
      "begin_line": 136,
      "end_line": 138,
      "comment": "\r\n     * Returns a hash code.\r\n     *\r\n     * @return A hash code.\r\n     ",
      "child_ranges": [
        "(line 137,col 9)-(line 137,col 64)"
      ]
    }
  ]
}