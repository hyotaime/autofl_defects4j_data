{
  "filepath": "/tmp/Chart-14b/source/org/jfree/data/general/DefaultKeyedValueDataset.java",
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
      "end_line": 196,
      "comment": "\r\n * A default implementation of the {@link KeyedValueDataset} interface.\r\n "
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
        "data"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": " Storage for the data. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.general.DefaultKeyedValueDataset.DefaultKeyedValueDataset()",
      "begin_line": 67,
      "end_line": 69,
      "comment": "\r\n     * Constructs a new dataset, initially empty.\r\n     ",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 19)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.general.DefaultKeyedValueDataset.DefaultKeyedValueDataset(java.lang.Comparable, java.lang.Number)",
      "begin_line": 77,
      "end_line": 79,
      "comment": "\r\n     * Creates a new dataset with the specified initial value.\r\n     *\r\n     * @param key  the key.\r\n     * @param value  the value (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 78,col 9)-(line 78,col 48)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.general.DefaultKeyedValueDataset.DefaultKeyedValueDataset(org.jfree.data.KeyedValue)",
      "begin_line": 87,
      "end_line": 89,
      "comment": "\r\n     * Creates a new dataset that uses the data from a {@link KeyedValue} \r\n     * instance.\r\n     *\r\n     * @param data  the data (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 88,col 9)-(line 88,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DefaultKeyedValueDataset.getKey()",
      "begin_line": 97,
      "end_line": 103,
      "comment": "\r\n     * Returns the key associated with the value, or \u003ccode\u003enull\u003c/code\u003e if the \r\n     * dataset has no data item.\r\n     *\r\n     * @return The key.\r\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 33)",
        "(line 99,col 9)-(line 101,col 9)",
        "(line 102,col 9)-(line 102,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DefaultKeyedValueDataset.getValue()",
      "begin_line": 110,
      "end_line": 116,
      "comment": "\r\n     * Returns the value.\r\n     *\r\n     * @return The value (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 29)",
        "(line 112,col 9)-(line 114,col 9)",
        "(line 115,col 9)-(line 115,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DefaultKeyedValueDataset.updateValue(java.lang.Number)",
      "begin_line": 123,
      "end_line": 128,
      "comment": "\r\n     * Updates the value.\r\n     *\r\n     * @param value  the new value (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 124,col 9)-(line 126,col 9)",
        "(line 127,col 9)-(line 127,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DefaultKeyedValueDataset.setValue(java.lang.Comparable, java.lang.Number)",
      "begin_line": 137,
      "end_line": 140,
      "comment": "\r\n     * Sets the value for the dataset and sends a {@link DatasetChangeEvent} to \r\n     * all registered listeners.\r\n     *\r\n     * @param key  the key.\r\n     * @param value  the value (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 138,col 9)-(line 138,col 54)",
        "(line 139,col 9)-(line 139,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DefaultKeyedValueDataset.equals(java.lang.Object)",
      "begin_line": 149,
      "end_line": 171,
      "comment": "\r\n     * Tests this dataset for equality with an arbitrary object.\r\n     *\r\n     * @param obj  the object.\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 151,col 9)-(line 153,col 9)",
        "(line 154,col 9)-(line 156,col 9)",
        "(line 157,col 9)-(line 157,col 57)",
        "(line 158,col 9)-(line 163,col 9)",
        "(line 164,col 9)-(line 166,col 9)",
        "(line 167,col 9)-(line 169,col 9)",
        "(line 170,col 9)-(line 170,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DefaultKeyedValueDataset.hashCode()",
      "begin_line": 178,
      "end_line": 180,
      "comment": "\r\n     * Returns a hash code.\r\n     * \r\n     * @return A hash code.\r\n     ",
      "child_ranges": [
        "(line 179,col 9)-(line 179,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DefaultKeyedValueDataset.clone()",
      "begin_line": 190,
      "end_line": 194,
      "comment": "\r\n     * Creates a clone of the dataset.\r\n     * \r\n     * @return A clone.\r\n     * \r\n     * @throws CloneNotSupportedException This class will not throw this \r\n     *         exception, but subclasses (if any) might.\r\n     ",
      "child_ranges": [
        "(line 191,col 9)-(line 192,col 55)",
        "(line 193,col 9)-(line 193,col 21)"
      ]
    }
  ]
}