{
  "filepath": "/tmp/Chart-14b/source/org/jfree/chart/entity/StandardEntityCollection.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StandardEntityCollection",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.entity.EntityCollection",
        "java.lang.Cloneable",
        "org.jfree.chart.util.PublicCloneable",
        "java.io.Serializable"
      ],
      "begin_line": 65,
      "end_line": 206,
      "comment": "\r\n * A standard implementation of the {@link EntityCollection} interface.\r\n "
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
        "entities"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": " Storage for the entities. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.entity.StandardEntityCollection.StandardEntityCollection()",
      "begin_line": 77,
      "end_line": 79,
      "comment": "\r\n     * Constructs a new entity collection (initially empty).\r\n     ",
      "child_ranges": [
        "(line 78,col 9)-(line 78,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.entity.StandardEntityCollection.getEntityCount()",
      "begin_line": 86,
      "end_line": 88,
      "comment": "\r\n     * Returns the number of entities in the collection.\r\n     * \r\n     * @return The entity count.\r\n     ",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.entity.StandardEntityCollection.getEntity(int)",
      "begin_line": 99,
      "end_line": 101,
      "comment": "\r\n     * Returns a chart entity from the collection.\r\n     * \r\n     * @param index  the entity index.\r\n     * \r\n     * @return The entity.\r\n     * \r\n     * @see #add(ChartEntity)\r\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.entity.StandardEntityCollection.clear()",
      "begin_line": 106,
      "end_line": 108,
      "comment": "\r\n     * Clears all the entities from the collection.\r\n     ",
      "child_ranges": [
        "(line 107,col 9)-(line 107,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.entity.StandardEntityCollection.add(org.jfree.chart.entity.ChartEntity)",
      "begin_line": 115,
      "end_line": 120,
      "comment": "\r\n     * Adds an entity to the collection.\r\n     *\r\n     * @param entity  the entity (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 116,col 9)-(line 118,col 9)",
        "(line 119,col 9)-(line 119,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.entity.StandardEntityCollection.addAll(org.jfree.chart.entity.EntityCollection)",
      "begin_line": 128,
      "end_line": 130,
      "comment": "\r\n     * Adds all the entities from the specified collection.\r\n     * \r\n     * @param collection  the collection of entities (\u003ccode\u003enull\u003c/code\u003e not\r\n     *     permitted).\r\n     ",
      "child_ranges": [
        "(line 129,col 9)-(line 129,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.entity.StandardEntityCollection.getEntity(double, double)",
      "begin_line": 141,
      "end_line": 150,
      "comment": "\r\n     * Returns the last entity in the list with an area that encloses the \r\n     * specified coordinates, or \u003ccode\u003enull\u003c/code\u003e if there is no such entity.\r\n     *\r\n     * @param x  the x coordinate.\r\n     * @param y  the y coordinate.\r\n     *\r\n     * @return The entity (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 142,col 9)-(line 142,col 47)",
        "(line 143,col 9)-(line 148,col 9)",
        "(line 149,col 9)-(line 149,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.entity.StandardEntityCollection.getEntities()",
      "begin_line": 157,
      "end_line": 159,
      "comment": "\r\n     * Returns the entities in an unmodifiable collection.\r\n     * \r\n     * @return The entities.\r\n     ",
      "child_ranges": [
        "(line 158,col 9)-(line 158,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.entity.StandardEntityCollection.iterator()",
      "begin_line": 166,
      "end_line": 168,
      "comment": "\r\n     * Returns an iterator for the entities in the collection.\r\n     *\r\n     * @return An iterator.\r\n     ",
      "child_ranges": [
        "(line 167,col 9)-(line 167,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.entity.StandardEntityCollection.equals(java.lang.Object)",
      "begin_line": 177,
      "end_line": 186,
      "comment": "\r\n     * Tests this object for equality with an arbitrary object.\r\n     * \r\n     * @param obj  the object to test against (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 178,col 9)-(line 180,col 9)",
        "(line 181,col 9)-(line 184,col 9)",
        "(line 185,col 9)-(line 185,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.entity.StandardEntityCollection.clone()",
      "begin_line": 195,
      "end_line": 204,
      "comment": "\r\n     * Returns a clone of this entity collection.\r\n     * \r\n     * @return A clone.\r\n     * \r\n     * @throws CloneNotSupportedException if the object cannot be cloned.\r\n     ",
      "child_ranges": [
        "(line 196,col 9)-(line 197,col 59)",
        "(line 198,col 9)-(line 198,col 71)",
        "(line 199,col 9)-(line 202,col 9)",
        "(line 203,col 9)-(line 203,col 21)"
      ]
    }
  ]
}