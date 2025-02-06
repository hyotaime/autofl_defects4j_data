{
  "filepath": "/tmp/Jsoup-66b/src/main/java/org/jsoup/nodes/Attribute.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Attribute",
      "is_interface": false,
      "parent_types": [
        "java.util.Map.Entry\u003cjava.lang.String, java.lang.String\u003e",
        "java.lang.Cloneable"
      ],
      "begin_line": 13,
      "end_line": 207,
      "comment": "\n A single key + value attribute. (Only used for presentation.)\n "
    },
    {
      "type": "field",
      "varNames": [
        "booleanAttributes"
      ],
      "begin_line": 14,
      "end_line": 19,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "key"
      ],
      "begin_line": 21,
      "end_line": 21,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "val"
      ],
      "begin_line": 22,
      "end_line": 22,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "parent"
      ],
      "begin_line": 23,
      "end_line": 23,
      "comment": " used to update the holding Attributes when the key / value is changed via this interface"
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.nodes.Attribute.Attribute(java.lang.String, java.lang.String)",
      "begin_line": 31,
      "end_line": 33,
      "comment": "\n     * Create a new attribute from unencoded (raw) key and value.\n     * @param key attribute key; case is preserved.\n     * @param value attribute value\n     * @see #createFromEncoded\n     ",
      "child_ranges": [
        "(line 32,col 9)-(line 32,col 31)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.nodes.Attribute.Attribute(java.lang.String, java.lang.String, org.jsoup.nodes.Attributes)",
      "begin_line": 41,
      "end_line": 47,
      "comment": "\n     * Create a new attribute from unencoded (raw) key and value.\n     * @param key attribute key; case is preserved.\n     * @param val attribute value\n     * @param parent the containing Attributes (this Attribute is not automatically added to said Attributes)\n     * @see #createFromEncoded",
      "child_ranges": [
        "(line 42,col 9)-(line 42,col 30)",
        "(line 43,col 9)-(line 43,col 30)",
        "(line 44,col 9)-(line 44,col 31)",
        "(line 45,col 9)-(line 45,col 23)",
        "(line 46,col 9)-(line 46,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attribute.getKey()",
      "begin_line": 53,
      "end_line": 55,
      "comment": "\n     Get the attribute key.\n     @return the attribute key\n     ",
      "child_ranges": [
        "(line 54,col 9)-(line 54,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attribute.setKey(java.lang.String)",
      "begin_line": 61,
      "end_line": 71,
      "comment": "\n     Set the attribute key; case is preserved.\n     @param key the new key; must not be null\n     ",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 30)",
        "(line 63,col 9)-(line 63,col 25)",
        "(line 64,col 9)-(line 64,col 31)",
        "(line 65,col 9)-(line 69,col 9)",
        "(line 70,col 9)-(line 70,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attribute.getValue()",
      "begin_line": 77,
      "end_line": 79,
      "comment": "\n     Get the attribute value.\n     @return the attribute value\n     ",
      "child_ranges": [
        "(line 78,col 9)-(line 78,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attribute.setValue(java.lang.String)",
      "begin_line": 85,
      "end_line": 94,
      "comment": "\n     Set the attribute value.\n     @param val the new attribute value; must not be null\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 45)",
        "(line 87,col 9)-(line 91,col 9)",
        "(line 92,col 9)-(line 92,col 23)",
        "(line 93,col 9)-(line 93,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attribute.html()",
      "begin_line": 100,
      "end_line": 109,
      "comment": "\n     Get the HTML representation of this attribute; e.g. {@code href\u003d\"index.html\"}.\n     @return HTML\n     ",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 50)",
        "(line 103,col 9)-(line 107,col 9)",
        "(line 108,col 9)-(line 108,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attribute.html(java.lang.String, java.lang.String, java.lang.Appendable, org.jsoup.nodes.Document.OutputSettings)",
      "begin_line": 111,
      "end_line": 118,
      "comment": "",
      "child_ranges": [
        "(line 112,col 9)-(line 112,col 26)",
        "(line 113,col 9)-(line 117,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attribute.html(java.lang.Appendable, org.jsoup.nodes.Document.OutputSettings)",
      "begin_line": 120,
      "end_line": 122,
      "comment": "",
      "child_ranges": [
        "(line 121,col 9)-(line 121,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attribute.toString()",
      "begin_line": 128,
      "end_line": 131,
      "comment": "\n     Get the string representation of this attribute, implemented as {@link #html()}.\n     @return string\n     ",
      "child_ranges": [
        "(line 130,col 9)-(line 130,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attribute.createFromEncoded(java.lang.String, java.lang.String)",
      "begin_line": 139,
      "end_line": 142,
      "comment": "\n     * Create a new Attribute from an unencoded key and a HTML attribute encoded value.\n     * @param unencodedKey assumes the key is not encoded, as can be only run of simple \\w chars.\n     * @param encodedValue HTML attribute encoded value\n     * @return attribute\n     ",
      "child_ranges": [
        "(line 140,col 9)-(line 140,col 61)",
        "(line 141,col 9)-(line 141,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attribute.isDataAttribute()",
      "begin_line": 144,
      "end_line": 146,
      "comment": "",
      "child_ranges": [
        "(line 145,col 9)-(line 145,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attribute.isDataAttribute(java.lang.String)",
      "begin_line": 148,
      "end_line": 150,
      "comment": "",
      "child_ranges": [
        "(line 149,col 9)-(line 149,col 102)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attribute.shouldCollapseAttribute(org.jsoup.nodes.Document.OutputSettings)",
      "begin_line": 158,
      "end_line": 160,
      "comment": "\n     * Collapsible if it\u0027s a boolean attribute and value is empty or same as name\n     * \n     * @param out output settings\n     * @return  Returns whether collapsible or not\n     ",
      "child_ranges": [
        "(line 159,col 9)-(line 159,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attribute.shouldCollapseAttribute(java.lang.String, java.lang.String, org.jsoup.nodes.Document.OutputSettings)",
      "begin_line": 162,
      "end_line": 167,
      "comment": "",
      "child_ranges": [
        "(line 164,col 9)-(line 166,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attribute.isBooleanAttribute()",
      "begin_line": 172,
      "end_line": 174,
      "comment": "\n     * @deprecated\n     ",
      "child_ranges": [
        "(line 173,col 9)-(line 173,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attribute.isBooleanAttribute(java.lang.String)",
      "begin_line": 179,
      "end_line": 181,
      "comment": "\n     * Checks if this attribute name is defined as a boolean attribute in HTML5\n     ",
      "child_ranges": [
        "(line 180,col 9)-(line 180,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attribute.equals(java.lang.Object)",
      "begin_line": 183,
      "end_line": 190,
      "comment": "",
      "child_ranges": [
        "(line 185,col 9)-(line 185,col 35)",
        "(line 186,col 9)-(line 186,col 66)",
        "(line 187,col 9)-(line 187,col 44)",
        "(line 188,col 9)-(line 188,col 91)",
        "(line 189,col 9)-(line 189,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attribute.hashCode()",
      "begin_line": 192,
      "end_line": 197,
      "comment": "",
      "child_ranges": [
        "(line 194,col 9)-(line 194,col 54)",
        "(line 195,col 9)-(line 195,col 66)",
        "(line 196,col 9)-(line 196,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attribute.clone()",
      "begin_line": 199,
      "end_line": 206,
      "comment": "",
      "child_ranges": [
        "(line 201,col 9)-(line 205,col 9)"
      ]
    }
  ]
}