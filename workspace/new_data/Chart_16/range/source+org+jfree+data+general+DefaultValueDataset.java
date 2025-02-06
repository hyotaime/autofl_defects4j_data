{
  "filepath": "/tmp/Chart-16b/source/org/jfree/data/general/DefaultValueDataset.java",
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
      "end_line": 142,
      "comment": "\r\n * A dataset that stores a single value (that is possibly \u003ccode\u003enull\u003c/code\u003e).  \r\n * This class provides a default implementation of the {@link ValueDataset} \r\n * interface.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": " The value. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.general.DefaultValueDataset.DefaultValueDataset()",
      "begin_line": 72,
      "end_line": 74,
      "comment": "\r\n     * Constructs a new dataset, initially empty.\r\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 19)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.general.DefaultValueDataset.DefaultValueDataset(double)",
      "begin_line": 81,
      "end_line": 83,
      "comment": "\r\n     * Creates a new dataset with the specified value.\r\n     * \r\n     * @param value  the value.\r\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 32)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.general.DefaultValueDataset.DefaultValueDataset(java.lang.Number)",
      "begin_line": 90,
      "end_line": 93,
      "comment": "\r\n     * Creates a new dataset with the specified value.\r\n     *\r\n     * @param value  the initial value (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 91,col 9)-(line 91,col 16)",
        "(line 92,col 9)-(line 92,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DefaultValueDataset.getValue()",
      "begin_line": 100,
      "end_line": 102,
      "comment": "\r\n     * Returns the value.\r\n     *\r\n     * @return The value (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DefaultValueDataset.setValue(java.lang.Number)",
      "begin_line": 110,
      "end_line": 113,
      "comment": "\r\n     * Sets the value and sends a {@link DatasetChangeEvent} to all registered \r\n     * listeners.\r\n     *\r\n     * @param value  the new value (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 27)",
        "(line 112,col 9)-(line 112,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DefaultValueDataset.equals(java.lang.Object)",
      "begin_line": 122,
      "end_line": 131,
      "comment": "\r\n     * Tests this dataset for equality with an arbitrary object.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 123,col 9)-(line 125,col 9)",
        "(line 126,col 9)-(line 129,col 9)",
        "(line 130,col 9)-(line 130,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DefaultValueDataset.hashCode()",
      "begin_line": 138,
      "end_line": 140,
      "comment": "\r\n     * Returns a hash code.\r\n     * \r\n     * @return A hash code.\r\n     ",
      "child_ranges": [
        "(line 139,col 9)-(line 139,col 64)"
      ]
    }
  ]
}