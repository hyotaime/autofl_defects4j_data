{
  "filepath": "/tmp/Chart-4b/source/org/jfree/data/general/DefaultKeyedValueDataset.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DefaultKeyedValueDataset",
      "is_interface": false,
      "parent_types": [
        "org.jfree.data.general.AbstractDataset",
        "org.jfree.data.general.KeyedValueDataset",
        "java.io.Serializable"
      ],
      "begin_line": 54,
      "end_line": 194,
      "comment": "\r\n * A default implementation of the {@link KeyedValueDataset} interface.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "data"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": " Storage for the data. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.general.DefaultKeyedValueDataset.DefaultKeyedValueDataset()",
      "begin_line": 66,
      "end_line": 68,
      "comment": "\r\n     * Constructs a new dataset, initially empty.\r\n     ",
      "child_ranges": [
        "(line 67,col 9)-(line 67,col 19)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.general.DefaultKeyedValueDataset.DefaultKeyedValueDataset(java.lang.Comparable, java.lang.Number)",
      "begin_line": 76,
      "end_line": 78,
      "comment": "\r\n     * Creates a new dataset with the specified initial value.\r\n     *\r\n     * @param key  the key.\r\n     * @param value  the value (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 48)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.general.DefaultKeyedValueDataset.DefaultKeyedValueDataset(org.jfree.data.KeyedValue)",
      "begin_line": 86,
      "end_line": 88,
      "comment": "\r\n     * Creates a new dataset that uses the data from a {@link KeyedValue}\r\n     * instance.\r\n     *\r\n     * @param data  the data (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DefaultKeyedValueDataset.getKey()",
      "begin_line": 96,
      "end_line": 102,
      "comment": "\r\n     * Returns the key associated with the value, or \u003ccode\u003enull\u003c/code\u003e if the\r\n     * dataset has no data item.\r\n     *\r\n     * @return The key.\r\n     ",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 33)",
        "(line 98,col 9)-(line 100,col 9)",
        "(line 101,col 9)-(line 101,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DefaultKeyedValueDataset.getValue()",
      "begin_line": 109,
      "end_line": 115,
      "comment": "\r\n     * Returns the value.\r\n     *\r\n     * @return The value (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 29)",
        "(line 111,col 9)-(line 113,col 9)",
        "(line 114,col 9)-(line 114,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DefaultKeyedValueDataset.updateValue(java.lang.Number)",
      "begin_line": 122,
      "end_line": 127,
      "comment": "\r\n     * Updates the value.\r\n     *\r\n     * @param value  the new value (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 123,col 9)-(line 125,col 9)",
        "(line 126,col 9)-(line 126,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DefaultKeyedValueDataset.setValue(java.lang.Comparable, java.lang.Number)",
      "begin_line": 136,
      "end_line": 139,
      "comment": "\r\n     * Sets the value for the dataset and sends a {@link DatasetChangeEvent} to\r\n     * all registered listeners.\r\n     *\r\n     * @param key  the key.\r\n     * @param value  the value (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 137,col 9)-(line 137,col 54)",
        "(line 138,col 9)-(line 138,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DefaultKeyedValueDataset.equals(java.lang.Object)",
      "begin_line": 148,
      "end_line": 169,
      "comment": "\r\n     * Tests this dataset for equality with an arbitrary object.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 149,col 9)-(line 151,col 9)",
        "(line 152,col 9)-(line 154,col 9)",
        "(line 155,col 9)-(line 155,col 57)",
        "(line 156,col 9)-(line 161,col 9)",
        "(line 162,col 9)-(line 164,col 9)",
        "(line 165,col 9)-(line 167,col 9)",
        "(line 168,col 9)-(line 168,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DefaultKeyedValueDataset.hashCode()",
      "begin_line": 176,
      "end_line": 178,
      "comment": "\r\n     * Returns a hash code.\r\n     *\r\n     * @return A hash code.\r\n     ",
      "child_ranges": [
        "(line 177,col 9)-(line 177,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DefaultKeyedValueDataset.clone()",
      "begin_line": 188,
      "end_line": 192,
      "comment": "\r\n     * Creates a clone of the dataset.\r\n     *\r\n     * @return A clone.\r\n     *\r\n     * @throws CloneNotSupportedException This class will not throw this\r\n     *         exception, but subclasses (if any) might.\r\n     ",
      "child_ranges": [
        "(line 189,col 9)-(line 190,col 59)",
        "(line 191,col 9)-(line 191,col 21)"
      ]
    }
  ]
}