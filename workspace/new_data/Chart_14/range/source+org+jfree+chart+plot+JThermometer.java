{
  "filepath": "/tmp/Chart-14b/source/org/jfree/chart/plot/JThermometer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "JThermometer",
      "is_interface": false,
      "parent_types": [
        "javax.swing.JPanel",
        "java.io.Serializable"
      ],
      "begin_line": 71,
      "end_line": 368,
      "comment": "\r\n * An initial quick and dirty.  The concept behind this class would be to\r\n * generate a gui bean that could be used within JBuilder, Netbeans etc...\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "data"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": " The dataset. "
    },
    {
      "type": "field",
      "varNames": [
        "chart"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": " The chart. "
    },
    {
      "type": "field",
      "varNames": [
        "panel"
      ],
      "begin_line": 83,
      "end_line": 83,
      "comment": " The chart panel. "
    },
    {
      "type": "field",
      "varNames": [
        "plot"
      ],
      "begin_line": 86,
      "end_line": 86,
      "comment": " The thermometer plot. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.plot.JThermometer.JThermometer()",
      "begin_line": 91,
      "end_line": 101,
      "comment": "\r\n     * Default constructor.\r\n     ",
      "child_ranges": [
        "(line 92,col 9)-(line 92,col 32)",
        "(line 93,col 9)-(line 93,col 69)",
        "(line 94,col 9)-(line 94,col 46)",
        "(line 95,col 9)-(line 95,col 40)",
        "(line 96,col 9)-(line 97,col 34)",
        "(line 98,col 9)-(line 98,col 48)",
        "(line 99,col 9)-(line 99,col 33)",
        "(line 100,col 9)-(line 100,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.JThermometer.addSubtitle(org.jfree.chart.title.Title)",
      "begin_line": 108,
      "end_line": 110,
      "comment": "\r\n     * Adds a subtitle to the chart.\r\n     *\r\n     * @param subtitle  the subtitle.\r\n     ",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.JThermometer.addSubtitle(java.lang.String)",
      "begin_line": 117,
      "end_line": 119,
      "comment": "\r\n     * Adds a subtitle to the chart.\r\n     *\r\n     * @param subtitle  the subtitle.\r\n     ",
      "child_ranges": [
        "(line 118,col 9)-(line 118,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.JThermometer.addSubtitle(java.lang.String, java.awt.Font)",
      "begin_line": 127,
      "end_line": 129,
      "comment": "\r\n     * Adds a subtitle to the chart.\r\n     *\r\n     * @param subtitle  the subtitle.\r\n     * @param font  the subtitle font.\r\n     ",
      "child_ranges": [
        "(line 128,col 9)-(line 128,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.JThermometer.setValueFormat(java.text.DecimalFormat)",
      "begin_line": 136,
      "end_line": 138,
      "comment": "\r\n     * Sets the value format for the thermometer.\r\n     *\r\n     * @param df  the formatter.\r\n     ",
      "child_ranges": [
        "(line 137,col 9)-(line 137,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.JThermometer.setRange(double, double)",
      "begin_line": 146,
      "end_line": 148,
      "comment": "\r\n     * Sets the lower and upper bounds for the thermometer.\r\n     *\r\n     * @param lower  the lower bound.\r\n     * @param upper  the upper bound.\r\n     ",
      "child_ranges": [
        "(line 147,col 9)-(line 147,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.JThermometer.setSubrangeInfo(int, double, double)",
      "begin_line": 157,
      "end_line": 160,
      "comment": "\r\n     * Sets the range.\r\n     *\r\n     * @param range  the range type.\r\n     * @param displayLow  the low value.\r\n     * @param displayHigh  the high value.\r\n     ",
      "child_ranges": [
        "(line 159,col 9)-(line 159,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.JThermometer.setSubrangeInfo(int, double, double, double, double)",
      "begin_line": 171,
      "end_line": 178,
      "comment": "\r\n     * Sets the range.\r\n     *\r\n     * @param range  the range type.\r\n     * @param rangeLow  the low value for the range.\r\n     * @param rangeHigh  the high value for the range.\r\n     * @param displayLow  the low value for display.\r\n     * @param displayHigh  the high value for display.\r\n     ",
      "child_ranges": [
        "(line 175,col 9)-(line 176,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.JThermometer.setValueLocation(int)",
      "begin_line": 185,
      "end_line": 188,
      "comment": "\r\n     * Sets the location at which the temperature value is displayed.\r\n     *\r\n     * @param loc  the location.\r\n     ",
      "child_ranges": [
        "(line 186,col 9)-(line 186,col 40)",
        "(line 187,col 9)-(line 187,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.JThermometer.setValuePaint(java.awt.Paint)",
      "begin_line": 195,
      "end_line": 197,
      "comment": "\r\n     * Sets the value paint.\r\n     *\r\n     * @param paint  the paint.\r\n     ",
      "child_ranges": [
        "(line 196,col 9)-(line 196,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.JThermometer.getValue()",
      "begin_line": 204,
      "end_line": 211,
      "comment": "\r\n     * Returns the value of the thermometer.\r\n     *\r\n     * @return The value.\r\n     ",
      "child_ranges": [
        "(line 205,col 9)-(line 210,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.JThermometer.setValue(double)",
      "begin_line": 218,
      "end_line": 220,
      "comment": "\r\n     * Sets the value of the thermometer.\r\n     *\r\n     * @param value  the value.\r\n     ",
      "child_ranges": [
        "(line 219,col 9)-(line 219,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.JThermometer.setValue(java.lang.Number)",
      "begin_line": 227,
      "end_line": 231,
      "comment": "\r\n     * Sets the value of the thermometer.\r\n     *\r\n     * @param value  the value.\r\n     ",
      "child_ranges": [
        "(line 228,col 9)-(line 230,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.JThermometer.setUnits(int)",
      "begin_line": 238,
      "end_line": 242,
      "comment": "\r\n     * Sets the unit type.\r\n     *\r\n     * @param i  the unit type.\r\n     ",
      "child_ranges": [
        "(line 239,col 9)-(line 241,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.JThermometer.setOutlinePaint(java.awt.Paint)",
      "begin_line": 249,
      "end_line": 253,
      "comment": "\r\n     * Sets the outline paint.\r\n     *\r\n     * @param p  the paint.\r\n     ",
      "child_ranges": [
        "(line 250,col 9)-(line 252,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.JThermometer.setForeground(java.awt.Color)",
      "begin_line": 260,
      "end_line": 265,
      "comment": "\r\n     * Sets the foreground color.\r\n     *\r\n     * @param fg  the foreground color.\r\n     ",
      "child_ranges": [
        "(line 261,col 9)-(line 261,col 32)",
        "(line 262,col 9)-(line 264,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.JThermometer.setBackground(java.awt.Color)",
      "begin_line": 272,
      "end_line": 283,
      "comment": "\r\n     * Sets the background color.\r\n     *\r\n     * @param bg  the background color.\r\n     ",
      "child_ranges": [
        "(line 273,col 9)-(line 273,col 32)",
        "(line 274,col 9)-(line 276,col 9)",
        "(line 277,col 9)-(line 279,col 9)",
        "(line 280,col 9)-(line 282,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.JThermometer.setValueFont(java.awt.Font)",
      "begin_line": 290,
      "end_line": 294,
      "comment": "\r\n     * Sets the value font.\r\n     *\r\n     * @param f  the font.\r\n     ",
      "child_ranges": [
        "(line 291,col 9)-(line 293,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.JThermometer.getTickLabelFont()",
      "begin_line": 301,
      "end_line": 304,
      "comment": "\r\n     * Returns the tick label font.\r\n     *\r\n     * @return The tick label font.\r\n     ",
      "child_ranges": [
        "(line 302,col 9)-(line 302,col 50)",
        "(line 303,col 9)-(line 303,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.JThermometer.setTickLabelFont(java.awt.Font)",
      "begin_line": 311,
      "end_line": 314,
      "comment": "\r\n     * Sets the tick label font.\r\n     *\r\n     * @param font  the font.\r\n     ",
      "child_ranges": [
        "(line 312,col 9)-(line 312,col 50)",
        "(line 313,col 9)-(line 313,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.JThermometer.changeTickFontSize(int)",
      "begin_line": 321,
      "end_line": 326,
      "comment": "\r\n     * Increases or decreases the tick font size.\r\n     *\r\n     * @param delta  the change in size.\r\n     ",
      "child_ranges": [
        "(line 322,col 9)-(line 322,col 36)",
        "(line 323,col 9)-(line 323,col 39)",
        "(line 324,col 9)-(line 324,col 76)",
        "(line 325,col 9)-(line 325,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.JThermometer.setTickFontStyle(int)",
      "begin_line": 333,
      "end_line": 338,
      "comment": "\r\n     * Sets the tick font style.\r\n     *\r\n     * @param style  the style.\r\n     ",
      "child_ranges": [
        "(line 334,col 9)-(line 334,col 36)",
        "(line 335,col 9)-(line 335,col 39)",
        "(line 336,col 9)-(line 336,col 59)",
        "(line 337,col 9)-(line 337,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.JThermometer.setFollowDataInSubranges(boolean)",
      "begin_line": 346,
      "end_line": 348,
      "comment": "\r\n     * Sets the flag that controls whether or not the display range follows the\r\n     * data value.\r\n     *\r\n     * @param flag  the new value of the flag.\r\n     ",
      "child_ranges": [
        "(line 347,col 9)-(line 347,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.JThermometer.setShowAxisLocation(int)",
      "begin_line": 355,
      "end_line": 357,
      "comment": "\r\n     * Sets the location for the axis.\r\n     * \r\n     * @param location  the location.\r\n     ",
      "child_ranges": [
        "(line 356,col 9)-(line 356,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.JThermometer.getShowAxisLocation()",
      "begin_line": 364,
      "end_line": 366,
      "comment": "\r\n     * Returns the location for the axis.\r\n     * \r\n     * @return The location.\r\n     ",
      "child_ranges": [
        "(line 365,col 7)-(line 365,col 41)"
      ]
    }
  ]
}