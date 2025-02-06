{
  "filepath": "/tmp/Chart-2b/source/org/jfree/chart/labels/AbstractCategoryItemLabelGenerator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractCategoryItemLabelGenerator",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.util.PublicCloneable",
        "java.lang.Cloneable",
        "java.io.Serializable"
      ],
      "begin_line": 65,
      "end_line": 334,
      "comment": "\r\n * A base class that can be used to create a label or tooltip generator that\r\n * can be assigned to a\r\n * {@link org.jfree.chart.renderer.category.CategoryItemRenderer}.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "labelFormat"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": "\r\n     * The label format string used by a \u003ccode\u003eMessageFormat\u003c/code\u003e object to\r\n     * combine the standard items:  {0} \u003d series name, {1} \u003d category,\r\n     * {2} \u003d value, {3} \u003d value as a percentage of the column total.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "nullValueString"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": " The string used to represent a null value. "
    },
    {
      "type": "field",
      "varNames": [
        "numberFormat"
      ],
      "begin_line": 85,
      "end_line": 85,
      "comment": "\r\n     * A number formatter used to preformat the value before it is passed to\r\n     * the MessageFormat object.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "dateFormat"
      ],
      "begin_line": 91,
      "end_line": 91,
      "comment": "\r\n     * A date formatter used to preformat the value before it is passed to the\r\n     * MessageFormat object.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "percentFormat"
      ],
      "begin_line": 97,
      "end_line": 97,
      "comment": "\r\n     * A number formatter used to preformat the percentage value before it is\r\n     * passed to the MessageFormat object.\r\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.labels.AbstractCategoryItemLabelGenerator.AbstractCategoryItemLabelGenerator(java.lang.String, java.text.NumberFormat)",
      "begin_line": 106,
      "end_line": 109,
      "comment": "\r\n     * Creates a label generator with the specified number formatter.\r\n     *\r\n     * @param labelFormat  the label format string (\u003ccode\u003enull\u003c/code\u003e not\r\n     *                     permitted).\r\n     * @param formatter  the number formatter (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 72)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.labels.AbstractCategoryItemLabelGenerator.AbstractCategoryItemLabelGenerator(java.lang.String, java.text.NumberFormat, java.text.NumberFormat)",
      "begin_line": 122,
      "end_line": 139,
      "comment": "\r\n     * Creates a label generator with the specified number formatter.\r\n     *\r\n     * @param labelFormat  the label format string (\u003ccode\u003enull\u003c/code\u003e not\r\n     *                     permitted).\r\n     * @param formatter  the number formatter (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param percentFormatter  the percent formatter (\u003ccode\u003enull\u003c/code\u003e not\r\n     *     permitted).\r\n     *\r\n     * @since 1.0.2\r\n     ",
      "child_ranges": [
        "(line 124,col 9)-(line 126,col 9)",
        "(line 127,col 9)-(line 129,col 9)",
        "(line 130,col 9)-(line 133,col 9)",
        "(line 134,col 9)-(line 134,col 39)",
        "(line 135,col 9)-(line 135,col 38)",
        "(line 136,col 9)-(line 136,col 46)",
        "(line 137,col 9)-(line 137,col 31)",
        "(line 138,col 9)-(line 138,col 35)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.labels.AbstractCategoryItemLabelGenerator.AbstractCategoryItemLabelGenerator(java.lang.String, java.text.DateFormat)",
      "begin_line": 148,
      "end_line": 161,
      "comment": "\r\n     * Creates a label generator with the specified date formatter.\r\n     *\r\n     * @param labelFormat  the label format string (\u003ccode\u003enull\u003c/code\u003e not\r\n     *                     permitted).\r\n     * @param formatter  the date formatter (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 150,col 9)-(line 152,col 9)",
        "(line 153,col 9)-(line 155,col 9)",
        "(line 156,col 9)-(line 156,col 39)",
        "(line 157,col 9)-(line 157,col 33)",
        "(line 158,col 9)-(line 158,col 63)",
        "(line 159,col 9)-(line 159,col 36)",
        "(line 160,col 9)-(line 160,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.labels.AbstractCategoryItemLabelGenerator.generateRowLabel(org.jfree.data.category.CategoryDataset, int)",
      "begin_line": 171,
      "end_line": 173,
      "comment": "\r\n     * Generates a label for the specified row.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param row  the row index (zero-based).\r\n     *\r\n     * @return The label.\r\n     ",
      "child_ranges": [
        "(line 172,col 9)-(line 172,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.labels.AbstractCategoryItemLabelGenerator.generateColumnLabel(org.jfree.data.category.CategoryDataset, int)",
      "begin_line": 183,
      "end_line": 185,
      "comment": "\r\n     * Generates a label for the specified row.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param column  the column index (zero-based).\r\n     *\r\n     * @return The label.\r\n     ",
      "child_ranges": [
        "(line 184,col 9)-(line 184,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.labels.AbstractCategoryItemLabelGenerator.getLabelFormat()",
      "begin_line": 192,
      "end_line": 194,
      "comment": "\r\n     * Returns the label format string.\r\n     *\r\n     * @return The label format string (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 193,col 9)-(line 193,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.labels.AbstractCategoryItemLabelGenerator.getNumberFormat()",
      "begin_line": 201,
      "end_line": 203,
      "comment": "\r\n     * Returns the number formatter.\r\n     *\r\n     * @return The number formatter (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 202,col 9)-(line 202,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.labels.AbstractCategoryItemLabelGenerator.getDateFormat()",
      "begin_line": 210,
      "end_line": 212,
      "comment": "\r\n     * Returns the date formatter.\r\n     *\r\n     * @return The date formatter (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 211,col 9)-(line 211,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.labels.AbstractCategoryItemLabelGenerator.generateLabelString(org.jfree.data.category.CategoryDataset, int, int)",
      "begin_line": 223,
      "end_line": 233,
      "comment": "\r\n     * Generates a for the specified item.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param row  the row index (zero-based).\r\n     * @param column  the column index (zero-based).\r\n     *\r\n     * @return The label (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 225,col 9)-(line 227,col 9)",
        "(line 228,col 9)-(line 228,col 29)",
        "(line 229,col 9)-(line 229,col 63)",
        "(line 230,col 9)-(line 230,col 63)",
        "(line 231,col 9)-(line 231,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.labels.AbstractCategoryItemLabelGenerator.createItemArray(org.jfree.data.category.CategoryDataset, int, int)",
      "begin_line": 245,
      "end_line": 269,
      "comment": "\r\n     * Creates the array of items that can be passed to the\r\n     * {@link MessageFormat} class for creating labels.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param row  the row index (zero-based).\r\n     * @param column  the column index (zero-based).\r\n     *\r\n     * @return The items (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 247,col 9)-(line 247,col 40)",
        "(line 248,col 9)-(line 248,col 54)",
        "(line 249,col 9)-(line 249,col 60)",
        "(line 250,col 9)-(line 250,col 53)",
        "(line 251,col 9)-(line 261,col 9)",
        "(line 262,col 9)-(line 266,col 9)",
        "(line 268,col 9)-(line 268,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.labels.AbstractCategoryItemLabelGenerator.equals(java.lang.Object)",
      "begin_line": 278,
      "end_line": 298,
      "comment": "\r\n     * Tests this object for equality with an arbitrary object.\r\n     *\r\n     * @param obj  the other object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 279,col 9)-(line 281,col 9)",
        "(line 282,col 9)-(line 284,col 9)",
        "(line 286,col 9)-(line 287,col 55)",
        "(line 288,col 9)-(line 290,col 9)",
        "(line 291,col 9)-(line 293,col 9)",
        "(line 294,col 9)-(line 296,col 9)",
        "(line 297,col 9)-(line 297,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.labels.AbstractCategoryItemLabelGenerator.hashCode()",
      "begin_line": 305,
      "end_line": 313,
      "comment": "\r\n     * Returns a hash code for this instance.\r\n     *\r\n     * @return A hash code.\r\n     ",
      "child_ranges": [
        "(line 306,col 9)-(line 306,col 25)",
        "(line 307,col 9)-(line 307,col 66)",
        "(line 308,col 9)-(line 308,col 70)",
        "(line 309,col 9)-(line 309,col 65)",
        "(line 310,col 9)-(line 310,col 67)",
        "(line 311,col 9)-(line 311,col 68)",
        "(line 312,col 9)-(line 312,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.labels.AbstractCategoryItemLabelGenerator.clone()",
      "begin_line": 322,
      "end_line": 332,
      "comment": "\r\n     * Returns an independent copy of the generator.\r\n     *\r\n     * @return A clone.\r\n     *\r\n     * @throws CloneNotSupportedException  should not happen.\r\n     ",
      "child_ranges": [
        "(line 323,col 9)-(line 324,col 65)",
        "(line 325,col 9)-(line 327,col 9)",
        "(line 328,col 9)-(line 330,col 9)",
        "(line 331,col 9)-(line 331,col 21)"
      ]
    }
  ]
}