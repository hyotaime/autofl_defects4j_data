{
  "filepath": "/tmp/Chart-2b/source/org/jfree/chart/ChartFactory.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ChartFactory",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 226,
      "end_line": 1671,
      "comment": "\r\n * A collection of utility methods for creating some standard charts with\r\n * JFreeChart.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "currentTheme"
      ],
      "begin_line": 229,
      "end_line": 229,
      "comment": " The chart theme. "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartFactory.getChartTheme()",
      "begin_line": 241,
      "end_line": 243,
      "comment": "\r\n     * Returns the current chart theme used by the factory.\r\n     *\r\n     * @return The chart theme.\r\n     *\r\n     * @see #setChartTheme(ChartTheme)\r\n     * @see ChartUtilities#applyCurrentTheme(JFreeChart)\r\n     *\r\n     * @since 1.0.11\r\n     ",
      "child_ranges": [
        "(line 242,col 9)-(line 242,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartFactory.setChartTheme(org.jfree.chart.ChartTheme)",
      "begin_line": 256,
      "end_line": 275,
      "comment": "\r\n     * Sets the current chart theme.  This will be applied to all new charts\r\n     * created via methods in this class.\r\n     *\r\n     * @param theme  the theme (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getChartTheme()\r\n     * @see ChartUtilities#applyCurrentTheme(JFreeChart)\r\n     *\r\n     * @since 1.0.11\r\n     ",
      "child_ranges": [
        "(line 257,col 9)-(line 259,col 9)",
        "(line 260,col 9)-(line 260,col 29)",
        "(line 264,col 9)-(line 274,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartFactory.createPieChart(java.lang.String, org.jfree.data.pie.PieDataset, boolean)",
      "begin_line": 287,
      "end_line": 290,
      "comment": "\r\n     * Creates a pie chart with default settings.  The chart object returned\r\n     * by this method uses a {@link PiePlot} instance as the plot.\r\n     *\r\n     * @param title  the chart title (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param dataset  the dataset for the chart (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param legend  a flag specifying whether or not a legend is required.\r\n     *\r\n     * @return A pie chart.\r\n     ",
      "child_ranges": [
        "(line 289,col 9)-(line 289,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartFactory.createPieChart(java.lang.String, org.jfree.data.pie.PieDataset, boolean, java.util.Locale)",
      "begin_line": 307,
      "end_line": 319,
      "comment": "\r\n     * Creates a pie chart with default settings.\r\n     * \u003cP\u003e\r\n     * The chart object returned by this method uses a {@link PiePlot} instance\r\n     * as the plot.\r\n     *\r\n     * @param title  the chart title (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param dataset  the dataset for the chart (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param legend  a flag specifying whether or not a legend is required.\r\n     * @param locale  the locale (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return A pie chart.\r\n     *\r\n     * @since 1.0.7\r\n     ",
      "child_ranges": [
        "(line 310,col 9)-(line 310,col 44)",
        "(line 311,col 9)-(line 311,col 77)",
        "(line 312,col 9)-(line 312,col 64)",
        "(line 313,col 9)-(line 313,col 74)",
        "(line 314,col 9)-(line 315,col 30)",
        "(line 316,col 9)-(line 316,col 34)",
        "(line 317,col 9)-(line 317,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartFactory.createPieChart(java.lang.String, org.jfree.data.pie.PieDataset, org.jfree.data.pie.PieDataset, int, boolean, boolean, java.util.Locale, boolean, boolean)",
      "begin_line": 360,
      "end_line": 434,
      "comment": "\r\n     * Creates a pie chart with default settings that compares 2 datasets.\r\n     * The colour of each section will be determined by the move from the value\r\n     * for the same key in \u003ccode\u003epreviousDataset\u003c/code\u003e. ie if value1 \u003e value2\r\n     * then the section will be in green (unless \u003ccode\u003egreenForIncrease\u003c/code\u003e\r\n     * is \u003ccode\u003efalse\u003c/code\u003e, in which case it would be \u003ccode\u003ered\u003c/code\u003e).\r\n     * Each section can have a shade of red or green as the difference can be\r\n     * tailored between 0% (black) and percentDiffForMaxScale% (bright\r\n     * red/green).\r\n     * \u003cp\u003e\r\n     * For instance if \u003ccode\u003epercentDiffForMaxScale\u003c/code\u003e is 10 (10%), a\r\n     * difference of 5% will have a half shade of red/green, a difference of\r\n     * 10% or more will have a maximum shade/brightness of red/green.\r\n     * \u003cP\u003e\r\n     * The chart object returned by this method uses a {@link PiePlot} instance\r\n     * as the plot.\r\n     * \u003cp\u003e\r\n     * Written by \u003ca href\u003d\"mailto:opensource@objectlab.co.uk\"\u003eBenoit\r\n     * Xhenseval\u003c/a\u003e.\r\n     *\r\n     * @param title  the chart title (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param dataset  the dataset for the chart (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param previousDataset  the dataset for the last run, this will be used\r\n     *                         to compare each key in the dataset\r\n     * @param percentDiffForMaxScale scale goes from bright red/green to black,\r\n     *                               percentDiffForMaxScale indicate the change\r\n     *                               required to reach top scale.\r\n     * @param greenForIncrease  an increase since previousDataset will be\r\n     *                          displayed in green (decrease red) if true.\r\n     * @param legend  a flag specifying whether or not a legend is required.\r\n     * @param locale  the locale (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param subTitle displays a subtitle with colour scheme if true\r\n     * @param showDifference  create a new dataset that will show the %\r\n     *                        difference between the two datasets.\r\n     *\r\n     * @return A pie chart.\r\n     *\r\n     * @since 1.0.7\r\n     ",
      "child_ranges": [
        "(line 365,col 9)-(line 365,col 44)",
        "(line 366,col 9)-(line 366,col 77)",
        "(line 367,col 9)-(line 367,col 64)",
        "(line 368,col 9)-(line 368,col 74)",
        "(line 370,col 9)-(line 370,col 38)",
        "(line 371,col 9)-(line 371,col 40)",
        "(line 372,col 9)-(line 374,col 9)",
        "(line 376,col 9)-(line 376,col 64)",
        "(line 377,col 9)-(line 414,col 9)",
        "(line 416,col 9)-(line 418,col 9)",
        "(line 420,col 9)-(line 421,col 61)",
        "(line 423,col 9)-(line 431,col 9)",
        "(line 432,col 9)-(line 432,col 34)",
        "(line 433,col 9)-(line 433,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartFactory.createPieChart(java.lang.String, org.jfree.data.pie.PieDataset, org.jfree.data.pie.PieDataset, int, boolean, boolean, boolean, boolean)",
      "begin_line": 472,
      "end_line": 546,
      "comment": "\r\n     * Creates a pie chart with default settings that compares 2 datasets.\r\n     * The colour of each section will be determined by the move from the value\r\n     * for the same key in \u003ccode\u003epreviousDataset\u003c/code\u003e. ie if value1 \u003e value2\r\n     * then the section will be in green (unless \u003ccode\u003egreenForIncrease\u003c/code\u003e\r\n     * is \u003ccode\u003efalse\u003c/code\u003e, in which case it would be \u003ccode\u003ered\u003c/code\u003e).\r\n     * Each section can have a shade of red or green as the difference can be\r\n     * tailored between 0% (black) and percentDiffForMaxScale% (bright\r\n     * red/green).\r\n     * \u003cp\u003e\r\n     * For instance if \u003ccode\u003epercentDiffForMaxScale\u003c/code\u003e is 10 (10%), a\r\n     * difference of 5% will have a half shade of red/green, a difference of\r\n     * 10% or more will have a maximum shade/brightness of red/green.\r\n     * \u003cP\u003e\r\n     * The chart object returned by this method uses a {@link PiePlot} instance\r\n     * as the plot.\r\n     * \u003cp\u003e\r\n     * Written by \u003ca href\u003d\"mailto:opensource@objectlab.co.uk\"\u003eBenoit\r\n     * Xhenseval\u003c/a\u003e.\r\n     *\r\n     * @param title  the chart title (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param dataset  the dataset for the chart (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param previousDataset  the dataset for the last run, this will be used\r\n     *                         to compare each key in the dataset\r\n     * @param percentDiffForMaxScale scale goes from bright red/green to black,\r\n     *                               percentDiffForMaxScale indicate the change\r\n     *                               required to reach top scale.\r\n     * @param greenForIncrease  an increase since previousDataset will be\r\n     *                          displayed in green (decrease red) if true.\r\n     * @param legend  a flag specifying whether or not a legend is required.\r\n     * @param subTitle displays a subtitle with colour scheme if true\r\n     * @param showDifference  create a new dataset that will show the %\r\n     *                        difference between the two datasets.\r\n     *\r\n     * @return A pie chart.\r\n     ",
      "child_ranges": [
        "(line 477,col 9)-(line 477,col 44)",
        "(line 478,col 9)-(line 478,col 71)",
        "(line 479,col 9)-(line 479,col 64)",
        "(line 480,col 9)-(line 480,col 68)",
        "(line 482,col 9)-(line 482,col 38)",
        "(line 483,col 9)-(line 483,col 40)",
        "(line 484,col 9)-(line 486,col 9)",
        "(line 488,col 9)-(line 488,col 64)",
        "(line 489,col 9)-(line 526,col 9)",
        "(line 528,col 9)-(line 530,col 9)",
        "(line 532,col 9)-(line 533,col 61)",
        "(line 535,col 9)-(line 543,col 9)",
        "(line 544,col 9)-(line 544,col 34)",
        "(line 545,col 9)-(line 545,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartFactory.createRingChart(java.lang.String, org.jfree.data.pie.PieDataset, boolean)",
      "begin_line": 558,
      "end_line": 563,
      "comment": "\r\n     * Creates a ring chart with default settings. The chart object returned by\r\n     * this method uses a {@link RingPlot} instance as the plot.\r\n     *\r\n     * @param title  the chart title (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param dataset  the dataset for the chart (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param legend  a flag specifying whether or not a legend is required.\r\n     *\r\n     * @return A ring chart.\r\n     ",
      "child_ranges": [
        "(line 561,col 9)-(line 561,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartFactory.createRingChart(java.lang.String, org.jfree.data.pie.PieDataset, boolean, java.util.Locale)",
      "begin_line": 580,
      "end_line": 591,
      "comment": "\r\n     * Creates a ring chart with default settings.\r\n     * \u003cP\u003e\r\n     * The chart object returned by this method uses a {@link RingPlot}\r\n     * instance as the plot.\r\n     *\r\n     * @param title  the chart title (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param dataset  the dataset for the chart (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param legend  a flag specifying whether or not a legend is required.\r\n     * @param locale  the locale (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return A ring chart.\r\n     *\r\n     * @since 1.0.7\r\n     ",
      "child_ranges": [
        "(line 583,col 9)-(line 583,col 46)",
        "(line 584,col 9)-(line 584,col 77)",
        "(line 585,col 9)-(line 585,col 64)",
        "(line 586,col 9)-(line 586,col 74)",
        "(line 587,col 9)-(line 588,col 30)",
        "(line 589,col 9)-(line 589,col 34)",
        "(line 590,col 9)-(line 590,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartFactory.createMultiplePieChart(java.lang.String, org.jfree.data.category.CategoryDataset, org.jfree.chart.util.TableOrder, boolean)",
      "begin_line": 606,
      "end_line": 625,
      "comment": "\r\n     * Creates a chart that displays multiple pie plots.  The chart object\r\n     * returned by this method uses a {@link MultiplePiePlot} instance as the\r\n     * plot.\r\n     *\r\n     * @param title  the chart title (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param order  the order that the data is extracted (by row or by column)\r\n     *               (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param legend  include a legend?\r\n     *\r\n     * @return A chart.\r\n     ",
      "child_ranges": [
        "(line 609,col 9)-(line 611,col 9)",
        "(line 612,col 9)-(line 612,col 60)",
        "(line 613,col 9)-(line 613,col 40)",
        "(line 614,col 9)-(line 614,col 38)",
        "(line 615,col 9)-(line 615,col 36)",
        "(line 616,col 9)-(line 617,col 52)",
        "(line 618,col 9)-(line 618,col 60)",
        "(line 619,col 9)-(line 619,col 49)",
        "(line 620,col 9)-(line 621,col 30)",
        "(line 622,col 9)-(line 622,col 34)",
        "(line 623,col 9)-(line 623,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartFactory.createPieChart3D(java.lang.String, org.jfree.data.pie.PieDataset, boolean, java.util.Locale)",
      "begin_line": 641,
      "end_line": 652,
      "comment": "\r\n     * Creates a 3D pie chart using the specified dataset.  The chart object\r\n     * returned by this method uses a {@link PiePlot3D} instance as the\r\n     * plot.\r\n     *\r\n     * @param title  the chart title (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param dataset  the dataset for the chart (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param legend  a flag specifying whether or not a legend is required.\r\n     * @param locale  the locale (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return A pie chart.\r\n     *\r\n     * @since 1.0.7\r\n     ",
      "child_ranges": [
        "(line 644,col 9)-(line 644,col 48)",
        "(line 645,col 9)-(line 645,col 64)",
        "(line 646,col 9)-(line 646,col 74)",
        "(line 647,col 9)-(line 648,col 30)",
        "(line 649,col 9)-(line 649,col 34)",
        "(line 650,col 9)-(line 650,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartFactory.createPieChart3D(java.lang.String, org.jfree.data.pie.PieDataset, boolean)",
      "begin_line": 665,
      "end_line": 676,
      "comment": "\r\n     * Creates a 3D pie chart using the specified dataset.  The chart object\r\n     * returned by this method uses a {@link PiePlot3D} instance as the\r\n     * plot.\r\n     *\r\n     * @param title  the chart title (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param dataset  the dataset for the chart (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param legend  a flag specifying whether or not a legend is required.\r\n     *\r\n     * @return A pie chart.\r\n     ",
      "child_ranges": [
        "(line 668,col 9)-(line 668,col 48)",
        "(line 669,col 9)-(line 669,col 64)",
        "(line 670,col 9)-(line 670,col 68)",
        "(line 671,col 9)-(line 672,col 30)",
        "(line 673,col 9)-(line 673,col 34)",
        "(line 674,col 9)-(line 674,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartFactory.createMultiplePieChart3D(java.lang.String, org.jfree.data.category.CategoryDataset, org.jfree.chart.util.TableOrder, boolean)",
      "begin_line": 691,
      "end_line": 720,
      "comment": "\r\n     * Creates a chart that displays multiple pie plots.  The chart object\r\n     * returned by this method uses a {@link MultiplePiePlot} instance as the\r\n     * plot.\r\n     *\r\n     * @param title  the chart title (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param order  the order that the data is extracted (by row or by column)\r\n     *               (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param legend  include a legend?\r\n     *\r\n     * @return A chart.\r\n     ",
      "child_ranges": [
        "(line 694,col 9)-(line 696,col 9)",
        "(line 697,col 9)-(line 697,col 60)",
        "(line 698,col 9)-(line 698,col 40)",
        "(line 699,col 9)-(line 699,col 38)",
        "(line 700,col 9)-(line 700,col 36)",
        "(line 702,col 9)-(line 702,col 66)",
        "(line 703,col 9)-(line 704,col 51)",
        "(line 705,col 9)-(line 705,col 54)",
        "(line 706,col 9)-(line 706,col 39)",
        "(line 707,col 9)-(line 707,col 32)",
        "(line 708,col 9)-(line 708,col 42)",
        "(line 709,col 9)-(line 709,col 35)",
        "(line 711,col 9)-(line 712,col 52)",
        "(line 713,col 9)-(line 713,col 60)",
        "(line 714,col 9)-(line 714,col 49)",
        "(line 715,col 9)-(line 716,col 30)",
        "(line 717,col 9)-(line 717,col 34)",
        "(line 718,col 9)-(line 718,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartFactory.createBarChart(java.lang.String, java.lang.String, java.lang.String, org.jfree.data.category.CategoryDataset, boolean)",
      "begin_line": 738,
      "end_line": 760,
      "comment": "\r\n     * Creates a bar chart.  The chart object returned by this method uses a\r\n     * {@link CategoryPlot} instance as the plot, with a {@link CategoryAxis}\r\n     * for the domain axis, a {@link NumberAxis} as the range axis, and a\r\n     * {@link BarRenderer} as the renderer.\r\n     *\r\n     * @param title  the chart title (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param categoryAxisLabel  the label for the category axis\r\n     *                           (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param valueAxisLabel  the label for the value axis\r\n     *                        (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param dataset  the dataset for the chart (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param legend  a flag specifying whether or not a legend is required.\r\n     *\r\n     * @return A bar chart.\r\n     ",
      "child_ranges": [
        "(line 742,col 9)-(line 742,col 72)",
        "(line 743,col 9)-(line 743,col 61)",
        "(line 744,col 9)-(line 744,col 49)",
        "(line 745,col 9)-(line 746,col 69)",
        "(line 747,col 9)-(line 747,col 61)",
        "(line 748,col 9)-(line 749,col 65)",
        "(line 750,col 9)-(line 750,col 61)",
        "(line 751,col 9)-(line 752,col 56)",
        "(line 753,col 9)-(line 754,col 26)",
        "(line 755,col 9)-(line 756,col 30)",
        "(line 757,col 9)-(line 757,col 34)",
        "(line 758,col 9)-(line 758,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartFactory.createStackedBarChart(java.lang.String, java.lang.String, java.lang.String, org.jfree.data.category.CategoryDataset, boolean)",
      "begin_line": 779,
      "end_line": 795,
      "comment": "\r\n     * Creates a stacked bar chart with default settings.  The chart object\r\n     * returned by this method uses a {@link CategoryPlot} instance as the\r\n     * plot, with a {@link CategoryAxis} for the domain axis, a\r\n     * {@link NumberAxis} as the range axis, and a {@link StackedBarRenderer}\r\n     * as the renderer.\r\n     *\r\n     * @param title  the chart title (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param domainAxisLabel  the label for the category axis\r\n     *                         (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param rangeAxisLabel  the label for the value axis\r\n     *                        (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param dataset  the dataset for the chart (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param legend  a flag specifying whether or not a legend is required.\r\n     *\r\n     * @return A stacked bar chart.\r\n     ",
      "child_ranges": [
        "(line 783,col 9)-(line 783,col 70)",
        "(line 784,col 9)-(line 784,col 61)",
        "(line 785,col 9)-(line 785,col 63)",
        "(line 786,col 9)-(line 787,col 60)",
        "(line 788,col 9)-(line 789,col 26)",
        "(line 790,col 9)-(line 791,col 30)",
        "(line 792,col 9)-(line 792,col 34)",
        "(line 793,col 9)-(line 793,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartFactory.createBarChart3D(java.lang.String, java.lang.String, java.lang.String, org.jfree.data.category.CategoryDataset, boolean)",
      "begin_line": 813,
      "end_line": 830,
      "comment": "\r\n     * Creates a bar chart with a 3D effect. The chart object returned by this\r\n     * method uses a {@link CategoryPlot} instance as the plot, with a\r\n     * {@link CategoryAxis3D} for the domain axis, a {@link NumberAxis3D} as\r\n     * the range axis, and a {@link BarRenderer3D} as the renderer.\r\n     *\r\n     * @param title  the chart title (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param categoryAxisLabel  the label for the category axis\r\n     *                           (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param valueAxisLabel  the label for the value axis (\u003ccode\u003enull\u003c/code\u003e\r\n     *                        permitted).\r\n     * @param dataset  the dataset for the chart (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param legend  a flag specifying whether or not a legend is required.\r\n     *\r\n     * @return A bar chart with a 3D effect.\r\n     ",
      "child_ranges": [
        "(line 817,col 9)-(line 817,col 74)",
        "(line 818,col 9)-(line 818,col 63)",
        "(line 819,col 9)-(line 819,col 53)",
        "(line 820,col 9)-(line 821,col 56)",
        "(line 822,col 9)-(line 823,col 26)",
        "(line 824,col 9)-(line 824,col 39)",
        "(line 825,col 9)-(line 826,col 30)",
        "(line 827,col 9)-(line 827,col 34)",
        "(line 828,col 9)-(line 828,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartFactory.createStackedBarChart3D(java.lang.String, java.lang.String, java.lang.String, org.jfree.data.category.CategoryDataset, boolean)",
      "begin_line": 849,
      "end_line": 865,
      "comment": "\r\n     * Creates a stacked bar chart with a 3D effect and default settings. The\r\n     * chart object returned by this method uses a {@link CategoryPlot}\r\n     * instance as the plot, with a {@link CategoryAxis3D} for the domain axis,\r\n     * a {@link NumberAxis3D} as the range axis, and a\r\n     * {@link StackedBarRenderer3D} as the renderer.\r\n     *\r\n     * @param title  the chart title (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param categoryAxisLabel  the label for the category axis\r\n     *                           (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param valueAxisLabel  the label for the value axis (\u003ccode\u003enull\u003c/code\u003e\r\n     *                        permitted).\r\n     * @param dataset  the dataset for the chart (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param legend  a flag specifying whether or not a legend is required.\r\n     *\r\n     * @return A stacked bar chart with a 3D effect.\r\n     ",
      "child_ranges": [
        "(line 853,col 9)-(line 853,col 74)",
        "(line 854,col 9)-(line 854,col 63)",
        "(line 855,col 9)-(line 855,col 67)",
        "(line 856,col 9)-(line 857,col 56)",
        "(line 858,col 9)-(line 859,col 26)",
        "(line 860,col 9)-(line 861,col 30)",
        "(line 862,col 9)-(line 862,col 34)",
        "(line 863,col 9)-(line 863,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartFactory.createAreaChart(java.lang.String, java.lang.String, java.lang.String, org.jfree.data.category.CategoryDataset, boolean)",
      "begin_line": 883,
      "end_line": 900,
      "comment": "\r\n     * Creates an area chart with default settings.  The chart object returned\r\n     * by this method uses a {@link CategoryPlot} instance as the plot, with a\r\n     * {@link CategoryAxis} for the domain axis, a {@link NumberAxis} as the\r\n     * range axis, and an {@link AreaRenderer} as the renderer.\r\n     *\r\n     * @param title  the chart title (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param categoryAxisLabel  the label for the category axis\r\n     *                           (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param valueAxisLabel  the label for the value axis (\u003ccode\u003enull\u003c/code\u003e\r\n     *                        permitted).\r\n     * @param dataset  the dataset for the chart (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param legend  a flag specifying whether or not a legend is required.\r\n     *\r\n     * @return An area chart.\r\n     ",
      "child_ranges": [
        "(line 887,col 9)-(line 887,col 72)",
        "(line 888,col 9)-(line 888,col 44)",
        "(line 889,col 9)-(line 889,col 61)",
        "(line 890,col 9)-(line 890,col 51)",
        "(line 891,col 9)-(line 892,col 56)",
        "(line 893,col 9)-(line 894,col 26)",
        "(line 895,col 9)-(line 896,col 30)",
        "(line 897,col 9)-(line 897,col 34)",
        "(line 898,col 9)-(line 898,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartFactory.createStackedAreaChart(java.lang.String, java.lang.String, java.lang.String, org.jfree.data.category.CategoryDataset, boolean)",
      "begin_line": 919,
      "end_line": 936,
      "comment": "\r\n     * Creates a stacked area chart with default settings.  The chart object\r\n     * returned by this method uses a {@link CategoryPlot} instance as the\r\n     * plot, with a {@link CategoryAxis} for the domain axis, a\r\n     * {@link NumberAxis} as the range axis, and a {@link StackedAreaRenderer}\r\n     * as the renderer.\r\n     *\r\n     * @param title  the chart title (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param categoryAxisLabel  the label for the category axis\r\n     *                           (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param valueAxisLabel  the label for the value axis (\u003ccode\u003enull\u003c/code\u003e\r\n     *                        permitted).\r\n     * @param dataset  the dataset for the chart (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param legend  a flag specifying whether or not a legend is required.\r\n     *\r\n     * @return A stacked area chart.\r\n     ",
      "child_ranges": [
        "(line 923,col 9)-(line 923,col 72)",
        "(line 924,col 9)-(line 924,col 44)",
        "(line 925,col 9)-(line 925,col 61)",
        "(line 926,col 9)-(line 926,col 65)",
        "(line 927,col 9)-(line 928,col 60)",
        "(line 929,col 9)-(line 930,col 26)",
        "(line 931,col 9)-(line 932,col 30)",
        "(line 933,col 9)-(line 933,col 34)",
        "(line 934,col 9)-(line 934,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartFactory.createLineChart(java.lang.String, java.lang.String, java.lang.String, org.jfree.data.category.CategoryDataset, boolean)",
      "begin_line": 954,
      "end_line": 970,
      "comment": "\r\n     * Creates a line chart with default settings.  The chart object returned\r\n     * by this method uses a {@link CategoryPlot} instance as the plot, with a\r\n     * {@link CategoryAxis} for the domain axis, a {@link NumberAxis} as the\r\n     * range axis, and a {@link LineAndShapeRenderer} as the renderer.\r\n     *\r\n     * @param title  the chart title (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param categoryAxisLabel  the label for the category axis\r\n     *                           (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param valueAxisLabel  the label for the value axis (\u003ccode\u003enull\u003c/code\u003e\r\n     *                        permitted).\r\n     * @param dataset  the dataset for the chart (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param legend  a flag specifying whether or not a legend is required.\r\n     *\r\n     * @return A line chart.\r\n     ",
      "child_ranges": [
        "(line 958,col 9)-(line 958,col 72)",
        "(line 959,col 9)-(line 959,col 61)",
        "(line 960,col 9)-(line 960,col 78)",
        "(line 961,col 9)-(line 962,col 60)",
        "(line 963,col 9)-(line 964,col 26)",
        "(line 965,col 9)-(line 966,col 30)",
        "(line 967,col 9)-(line 967,col 34)",
        "(line 968,col 9)-(line 968,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartFactory.createLineChart3D(java.lang.String, java.lang.String, java.lang.String, org.jfree.data.category.CategoryDataset, boolean)",
      "begin_line": 988,
      "end_line": 1005,
      "comment": "\r\n     * Creates a line chart with default settings. The chart object returned by\r\n     * this method uses a {@link CategoryPlot} instance as the plot, with a\r\n     * {@link CategoryAxis3D} for the domain axis, a {@link NumberAxis3D} as\r\n     * the range axis, and a {@link LineRenderer3D} as the renderer.\r\n     *\r\n     * @param title  the chart title (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param categoryAxisLabel  the label for the category axis\r\n     *                           (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param valueAxisLabel  the label for the value axis (\u003ccode\u003enull\u003c/code\u003e\r\n     *                        permitted).\r\n     * @param dataset  the dataset for the chart (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param legend  a flag specifying whether or not a legend is required.\r\n     *\r\n     * @return A line chart.\r\n     ",
      "child_ranges": [
        "(line 992,col 9)-(line 992,col 74)",
        "(line 993,col 9)-(line 993,col 63)",
        "(line 995,col 9)-(line 995,col 55)",
        "(line 996,col 9)-(line 997,col 56)",
        "(line 998,col 9)-(line 999,col 26)",
        "(line 1000,col 9)-(line 1001,col 30)",
        "(line 1002,col 9)-(line 1002,col 34)",
        "(line 1003,col 9)-(line 1003,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartFactory.createGanttChart(java.lang.String, java.lang.String, java.lang.String, org.jfree.data.category.IntervalCategoryDataset, boolean)",
      "begin_line": 1024,
      "end_line": 1042,
      "comment": "\r\n     * Creates a Gantt chart using the supplied attributes plus default values\r\n     * where required.  The chart object returned by this method uses a\r\n     * {@link CategoryPlot} instance as the plot, with a {@link CategoryAxis}\r\n     * for the domain axis, a {@link DateAxis} as the range axis, and a\r\n     * {@link GanttRenderer} as the renderer.\r\n     *\r\n     * @param title  the chart title (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param categoryAxisLabel  the label for the category axis\r\n     *                           (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param dateAxisLabel  the label for the date axis\r\n     *                       (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param dataset  the dataset for the chart (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param legend  a flag specifying whether or not a legend is required.\r\n     *\r\n     * @return A Gantt chart.\r\n     ",
      "child_ranges": [
        "(line 1028,col 9)-(line 1028,col 72)",
        "(line 1029,col 9)-(line 1029,col 56)",
        "(line 1030,col 9)-(line 1030,col 60)",
        "(line 1031,col 9)-(line 1033,col 64)",
        "(line 1034,col 9)-(line 1035,col 26)",
        "(line 1036,col 9)-(line 1036,col 56)",
        "(line 1037,col 9)-(line 1038,col 30)",
        "(line 1039,col 9)-(line 1039,col 34)",
        "(line 1040,col 9)-(line 1040,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartFactory.createWaterfallChart(java.lang.String, java.lang.String, java.lang.String, org.jfree.data.category.CategoryDataset, boolean)",
      "begin_line": 1060,
      "end_line": 1087,
      "comment": "\r\n     * Creates a waterfall chart.  The chart object returned by this method\r\n     * uses a {@link CategoryPlot} instance as the plot, with a\r\n     * {@link CategoryAxis} for the domain axis, a {@link NumberAxis} as the\r\n     * range axis, and a {@link WaterfallBarRenderer} as the renderer.\r\n     *\r\n     * @param title  the chart title (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param categoryAxisLabel  the label for the category axis\r\n     *                           (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param valueAxisLabel  the label for the value axis (\u003ccode\u003enull\u003c/code\u003e\r\n     *                        permitted).\r\n     * @param dataset  the dataset for the chart (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param legend  a flag specifying whether or not a legend is required.\r\n     *\r\n     * @return A waterfall chart.\r\n     ",
      "child_ranges": [
        "(line 1064,col 9)-(line 1064,col 72)",
        "(line 1065,col 9)-(line 1065,col 44)",
        "(line 1066,col 9)-(line 1066,col 61)",
        "(line 1067,col 9)-(line 1067,col 67)",
        "(line 1068,col 9)-(line 1070,col 40)",
        "(line 1071,col 9)-(line 1071,col 60)",
        "(line 1072,col 9)-(line 1072,col 60)",
        "(line 1073,col 9)-(line 1074,col 57)",
        "(line 1075,col 9)-(line 1075,col 52)",
        "(line 1076,col 9)-(line 1077,col 26)",
        "(line 1078,col 9)-(line 1078,col 33)",
        "(line 1079,col 9)-(line 1079,col 47)",
        "(line 1080,col 9)-(line 1080,col 39)",
        "(line 1081,col 9)-(line 1081,col 56)",
        "(line 1082,col 9)-(line 1083,col 30)",
        "(line 1084,col 9)-(line 1084,col 34)",
        "(line 1085,col 9)-(line 1085,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartFactory.createPolarChart(java.lang.String, org.jfree.data.xy.XYDataset, boolean)",
      "begin_line": 1101,
      "end_line": 1117,
      "comment": "\r\n     * Creates a polar plot for the specified dataset (x-values interpreted as\r\n     * angles in degrees).  The chart object returned by this method uses a\r\n     * {@link PolarPlot} instance as the plot, with a {@link NumberAxis} for\r\n     * the radial axis.\r\n     *\r\n     * @param title  the chart title (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param legend  legend required?\r\n     *\r\n     * @return A chart.\r\n     ",
      "child_ranges": [
        "(line 1104,col 9)-(line 1104,col 41)",
        "(line 1105,col 9)-(line 1105,col 33)",
        "(line 1106,col 9)-(line 1106,col 48)",
        "(line 1107,col 9)-(line 1107,col 44)",
        "(line 1108,col 9)-(line 1108,col 45)",
        "(line 1109,col 9)-(line 1109,col 78)",
        "(line 1110,col 9)-(line 1110,col 32)",
        "(line 1111,col 9)-(line 1111,col 57)",
        "(line 1112,col 9)-(line 1113,col 68)",
        "(line 1114,col 9)-(line 1114,col 34)",
        "(line 1115,col 9)-(line 1115,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartFactory.createScatterPlot(java.lang.String, java.lang.String, java.lang.String, org.jfree.data.xy.XYDataset, boolean)",
      "begin_line": 1134,
      "end_line": 1150,
      "comment": "\r\n     * Creates a scatter plot with default settings.  The chart object\r\n     * returned by this method uses an {@link XYPlot} instance as the plot,\r\n     * with a {@link NumberAxis} for the domain axis, a  {@link NumberAxis}\r\n     * as the range axis, and an {@link XYLineAndShapeRenderer} as the\r\n     * renderer.\r\n     *\r\n     * @param title  the chart title (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param xAxisLabel  a label for the X-axis (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param yAxisLabel  a label for the Y-axis (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param dataset  the dataset for the chart (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param legend  a flag specifying whether or not a legend is required.\r\n     *\r\n     * @return A scatter plot.\r\n     ",
      "child_ranges": [
        "(line 1137,col 9)-(line 1137,col 54)",
        "(line 1138,col 9)-(line 1138,col 46)",
        "(line 1139,col 9)-(line 1139,col 54)",
        "(line 1140,col 9)-(line 1140,col 46)",
        "(line 1141,col 9)-(line 1141,col 62)",
        "(line 1142,col 9)-(line 1142,col 74)",
        "(line 1143,col 9)-(line 1143,col 75)",
        "(line 1144,col 9)-(line 1144,col 35)",
        "(line 1145,col 9)-(line 1146,col 30)",
        "(line 1147,col 9)-(line 1147,col 34)",
        "(line 1148,col 9)-(line 1148,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartFactory.createXYBarChart(java.lang.String, java.lang.String, boolean, java.lang.String, org.jfree.data.xy.IntervalXYDataset, boolean)",
      "begin_line": 1169,
      "end_line": 1200,
      "comment": "\r\n     * Creates and returns a default instance of an XY bar chart.\r\n     * \u003cP\u003e\r\n     * The chart object returned by this method uses an {@link XYPlot} instance\r\n     * as the plot, with a {@link DateAxis} for the domain axis, a\r\n     * {@link NumberAxis} as the range axis, and a {@link XYBarRenderer} as the\r\n     * renderer.\r\n     *\r\n     * @param title  the chart title (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param xAxisLabel  a label for the X-axis (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param dateAxis  make the domain axis display dates?\r\n     * @param yAxisLabel  a label for the Y-axis (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param dataset  the dataset for the chart (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param legend  a flag specifying whether or not a legend is required.\r\n     *\r\n     * @return An XY bar chart.\r\n     ",
      "child_ranges": [
        "(line 1173,col 9)-(line 1173,col 36)",
        "(line 1174,col 9)-(line 1181,col 9)",
        "(line 1182,col 9)-(line 1182,col 57)",
        "(line 1184,col 9)-(line 1184,col 53)",
        "(line 1185,col 9)-(line 1185,col 30)",
        "(line 1186,col 9)-(line 1191,col 9)",
        "(line 1192,col 9)-(line 1192,col 45)",
        "(line 1194,col 9)-(line 1194,col 75)",
        "(line 1195,col 9)-(line 1196,col 30)",
        "(line 1197,col 9)-(line 1197,col 34)",
        "(line 1198,col 9)-(line 1198,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartFactory.createXYAreaChart(java.lang.String, java.lang.String, java.lang.String, org.jfree.data.xy.XYDataset, boolean)",
      "begin_line": 1218,
      "end_line": 1234,
      "comment": "\r\n     * Creates an area chart using an {@link XYDataset}.\r\n     * \u003cP\u003e\r\n     * The chart object returned by this method uses an {@link XYPlot} instance\r\n     * as the plot, with a {@link NumberAxis} for the domain axis, a\r\n     * {@link NumberAxis} as the range axis, and a {@link XYAreaRenderer} as\r\n     * the renderer.\r\n     *\r\n     * @param title  the chart title (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param xAxisLabel  a label for the X-axis (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param yAxisLabel  a label for the Y-axis (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param dataset  the dataset for the chart (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param legend  a flag specifying whether or not a legend is required.\r\n     *\r\n     * @return An XY area chart.\r\n     ",
      "child_ranges": [
        "(line 1221,col 9)-(line 1221,col 54)",
        "(line 1222,col 9)-(line 1222,col 46)",
        "(line 1223,col 9)-(line 1223,col 54)",
        "(line 1224,col 9)-(line 1224,col 62)",
        "(line 1225,col 9)-(line 1225,col 38)",
        "(line 1226,col 9)-(line 1226,col 74)",
        "(line 1227,col 9)-(line 1227,col 75)",
        "(line 1228,col 9)-(line 1228,col 35)",
        "(line 1229,col 9)-(line 1230,col 30)",
        "(line 1231,col 9)-(line 1231,col 34)",
        "(line 1232,col 9)-(line 1232,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartFactory.createStackedXYAreaChart(java.lang.String, java.lang.String, java.lang.String, org.jfree.data.xy.TableXYDataset, boolean)",
      "begin_line": 1251,
      "end_line": 1270,
      "comment": "\r\n     * Creates a stacked XY area plot.  The chart object returned by this\r\n     * method uses an {@link XYPlot} instance as the plot, with a\r\n     * {@link NumberAxis} for the domain axis, a {@link NumberAxis} as the\r\n     * range axis, and a {@link StackedXYAreaRenderer2} as the renderer.\r\n     *\r\n     * @param title  the chart title (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param xAxisLabel  a label for the X-axis (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param yAxisLabel  a label for the Y-axis (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param dataset  the dataset for the chart (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param legend  a flag specifying whether or not a legend is required.\r\n\r\n     *\r\n     * @return A stacked XY area chart.\r\n     ",
      "child_ranges": [
        "(line 1255,col 9)-(line 1255,col 54)",
        "(line 1256,col 9)-(line 1256,col 46)",
        "(line 1257,col 9)-(line 1257,col 34)",
        "(line 1258,col 9)-(line 1258,col 34)",
        "(line 1259,col 9)-(line 1259,col 54)",
        "(line 1260,col 9)-(line 1260,col 71)",
        "(line 1261,col 9)-(line 1261,col 75)",
        "(line 1262,col 9)-(line 1262,col 34)",
        "(line 1263,col 9)-(line 1263,col 66)",
        "(line 1264,col 9)-(line 1264,col 33)",
        "(line 1265,col 9)-(line 1266,col 30)",
        "(line 1267,col 9)-(line 1267,col 34)",
        "(line 1268,col 9)-(line 1268,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartFactory.createXYLineChart(java.lang.String, java.lang.String, java.lang.String, org.jfree.data.xy.XYDataset, boolean)",
      "begin_line": 1284,
      "end_line": 1298,
      "comment": "\r\n     * Creates a line chart (based on an {@link XYDataset}) with default\r\n     * settings.\r\n     *\r\n     * @param title  the chart title (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param xAxisLabel  a label for the X-axis (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param yAxisLabel  a label for the Y-axis (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param dataset  the dataset for the chart (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param legend  a flag specifying whether or not a legend is required.\r\n     *\r\n     * @return The chart.\r\n     ",
      "child_ranges": [
        "(line 1287,col 9)-(line 1287,col 54)",
        "(line 1288,col 9)-(line 1288,col 46)",
        "(line 1289,col 9)-(line 1289,col 54)",
        "(line 1290,col 9)-(line 1290,col 74)",
        "(line 1291,col 9)-(line 1291,col 66)",
        "(line 1292,col 9)-(line 1292,col 75)",
        "(line 1293,col 9)-(line 1294,col 30)",
        "(line 1295,col 9)-(line 1295,col 34)",
        "(line 1296,col 9)-(line 1296,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartFactory.createXYStepChart(java.lang.String, java.lang.String, java.lang.String, org.jfree.data.xy.XYDataset, boolean)",
      "begin_line": 1311,
      "end_line": 1328,
      "comment": "\r\n     * Creates a stepped XY plot with default settings.\r\n     *\r\n     * @param title  the chart title (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param xAxisLabel  a label for the X-axis (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param yAxisLabel  a label for the Y-axis (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param dataset  the dataset for the chart (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param legend  a flag specifying whether or not a legend is required.\r\n     *\r\n     * @return A chart.\r\n     ",
      "child_ranges": [
        "(line 1314,col 9)-(line 1314,col 50)",
        "(line 1315,col 9)-(line 1315,col 54)",
        "(line 1316,col 9)-(line 1316,col 72)",
        "(line 1317,col 9)-(line 1317,col 55)",
        "(line 1318,col 9)-(line 1318,col 75)",
        "(line 1319,col 9)-(line 1319,col 62)",
        "(line 1320,col 9)-(line 1320,col 35)",
        "(line 1321,col 9)-(line 1321,col 46)",
        "(line 1322,col 9)-(line 1322,col 45)",
        "(line 1323,col 9)-(line 1324,col 30)",
        "(line 1325,col 9)-(line 1325,col 34)",
        "(line 1326,col 9)-(line 1326,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartFactory.createXYStepAreaChart(java.lang.String, java.lang.String, java.lang.String, org.jfree.data.xy.XYDataset, boolean)",
      "begin_line": 1341,
      "end_line": 1359,
      "comment": "\r\n     * Creates a filled stepped XY plot with default settings.\r\n     *\r\n     * @param title  the chart title (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param xAxisLabel  a label for the X-axis (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param yAxisLabel  a label for the Y-axis (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param dataset  the dataset for the chart (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param legend  a flag specifying whether or not a legend is required.\r\n     *\r\n     * @return A chart.\r\n     ",
      "child_ranges": [
        "(line 1345,col 9)-(line 1345,col 54)",
        "(line 1346,col 9)-(line 1346,col 46)",
        "(line 1347,col 9)-(line 1347,col 54)",
        "(line 1348,col 9)-(line 1349,col 52)",
        "(line 1350,col 9)-(line 1350,col 75)",
        "(line 1351,col 9)-(line 1351,col 62)",
        "(line 1352,col 9)-(line 1352,col 35)",
        "(line 1353,col 9)-(line 1353,col 46)",
        "(line 1354,col 9)-(line 1354,col 45)",
        "(line 1355,col 9)-(line 1356,col 30)",
        "(line 1357,col 9)-(line 1357,col 34)",
        "(line 1358,col 9)-(line 1358,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartFactory.createTimeSeriesChart(java.lang.String, java.lang.String, java.lang.String, org.jfree.data.xy.XYDataset, boolean)",
      "begin_line": 1378,
      "end_line": 1399,
      "comment": "\r\n     * Creates and returns a time series chart.  A time series chart is an\r\n     * {@link XYPlot} with a {@link DateAxis} for the x-axis and a\r\n     * {@link NumberAxis} for the y-axis.  The default renderer is an\r\n     * {@link XYLineAndShapeRenderer}. A convenient dataset to use with this\r\n     * chart is a {@link TimeSeriesCollection}.\r\n     *\r\n     * @param title  the chart title (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param timeAxisLabel  a label for the time axis (\u003ccode\u003enull\u003c/code\u003e\r\n     *                       permitted).\r\n     * @param valueAxisLabel  a label for the value axis (\u003ccode\u003enull\u003c/code\u003e\r\n     *                        permitted).\r\n     * @param dataset  the dataset for the chart (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param legend  a flag specifying whether or not a legend is required.\r\n     *\r\n     * @return A time series chart.\r\n     ",
      "child_ranges": [
        "(line 1382,col 9)-(line 1382,col 57)",
        "(line 1383,col 9)-(line 1383,col 38)",
        "(line 1384,col 9)-(line 1384,col 38)",
        "(line 1385,col 9)-(line 1385,col 62)",
        "(line 1386,col 9)-(line 1386,col 50)",
        "(line 1387,col 9)-(line 1387,col 69)",
        "(line 1388,col 9)-(line 1388,col 51)",
        "(line 1389,col 9)-(line 1389,col 78)",
        "(line 1390,col 9)-(line 1391,col 23)",
        "(line 1392,col 9)-(line 1392,col 59)",
        "(line 1393,col 9)-(line 1393,col 35)",
        "(line 1394,col 9)-(line 1395,col 30)",
        "(line 1396,col 9)-(line 1396,col 34)",
        "(line 1397,col 9)-(line 1397,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartFactory.createCandlestickChart(java.lang.String, java.lang.String, java.lang.String, org.jfree.data.xy.OHLCDataset, boolean)",
      "begin_line": 1414,
      "end_line": 1427,
      "comment": "\r\n     * Creates and returns a default instance of a candlesticks chart.\r\n     *\r\n     * @param title  the chart title (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param timeAxisLabel  a label for the time axis (\u003ccode\u003enull\u003c/code\u003e\r\n     *                       permitted).\r\n     * @param valueAxisLabel  a label for the value axis (\u003ccode\u003enull\u003c/code\u003e\r\n     *                        permitted).\r\n     * @param dataset  the dataset for the chart (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param legend  a flag specifying whether or not a legend is required.\r\n     *\r\n     * @return A candlestick chart.\r\n     ",
      "child_ranges": [
        "(line 1418,col 9)-(line 1418,col 57)",
        "(line 1419,col 9)-(line 1419,col 62)",
        "(line 1420,col 9)-(line 1420,col 69)",
        "(line 1421,col 9)-(line 1421,col 52)",
        "(line 1422,col 9)-(line 1423,col 30)",
        "(line 1424,col 9)-(line 1424,col 34)",
        "(line 1425,col 9)-(line 1425,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartFactory.createHighLowChart(java.lang.String, java.lang.String, java.lang.String, org.jfree.data.xy.OHLCDataset, boolean)",
      "begin_line": 1442,
      "end_line": 1456,
      "comment": "\r\n     * Creates and returns a default instance of a high-low-open-close chart.\r\n     *\r\n     * @param title  the chart title (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param timeAxisLabel  a label for the time axis (\u003ccode\u003enull\u003c/code\u003e\r\n     *                       permitted).\r\n     * @param valueAxisLabel  a label for the value axis (\u003ccode\u003enull\u003c/code\u003e\r\n     *                        permitted).\r\n     * @param dataset  the dataset for the chart (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param legend  a flag specifying whether or not a legend is required.\r\n     *\r\n     * @return A high-low-open-close chart.\r\n     ",
      "child_ranges": [
        "(line 1446,col 9)-(line 1446,col 57)",
        "(line 1447,col 9)-(line 1447,col 62)",
        "(line 1448,col 9)-(line 1448,col 57)",
        "(line 1449,col 9)-(line 1449,col 74)",
        "(line 1450,col 9)-(line 1450,col 73)",
        "(line 1451,col 9)-(line 1452,col 30)",
        "(line 1453,col 9)-(line 1453,col 34)",
        "(line 1454,col 9)-(line 1454,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartFactory.createHighLowChart(java.lang.String, java.lang.String, java.lang.String, org.jfree.data.xy.OHLCDataset, org.jfree.chart.axis.Timeline, boolean)",
      "begin_line": 1476,
      "end_line": 1491,
      "comment": "\r\n     * Creates and returns a default instance of a high-low-open-close chart\r\n     * with a special timeline. This timeline can be a\r\n     * {@link org.jfree.chart.axis.SegmentedTimeline} such as the Monday\r\n     * through Friday timeline that will remove Saturdays and Sundays from\r\n     * the axis.\r\n     *\r\n     * @param title  the chart title (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param timeAxisLabel  a label for the time axis (\u003ccode\u003enull\u003c/code\u003e\r\n     *                       permitted).\r\n     * @param valueAxisLabel  a label for the value axis (\u003ccode\u003enull\u003c/code\u003e\r\n     *                        permitted).\r\n     * @param dataset  the dataset for the chart (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param timeline  the timeline.\r\n     * @param legend  a flag specifying whether or not a legend is required.\r\n     *\r\n     * @return A high-low-open-close chart.\r\n     ",
      "child_ranges": [
        "(line 1480,col 9)-(line 1480,col 56)",
        "(line 1481,col 9)-(line 1481,col 39)",
        "(line 1482,col 9)-(line 1482,col 62)",
        "(line 1483,col 9)-(line 1483,col 57)",
        "(line 1484,col 9)-(line 1484,col 74)",
        "(line 1485,col 9)-(line 1485,col 73)",
        "(line 1486,col 9)-(line 1487,col 30)",
        "(line 1488,col 9)-(line 1488,col 34)",
        "(line 1489,col 9)-(line 1489,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartFactory.createBubbleChart(java.lang.String, java.lang.String, java.lang.String, org.jfree.data.xy.XYZDataset, boolean)",
      "begin_line": 1507,
      "end_line": 1524,
      "comment": "\r\n     * Creates a bubble chart with default settings.  The chart is composed of\r\n     * an {@link XYPlot}, with a {@link NumberAxis} for the domain axis,\r\n     * a {@link NumberAxis} for the range axis, and an {@link XYBubbleRenderer}\r\n     * to draw the data items.\r\n     *\r\n     * @param title  the chart title (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param xAxisLabel  a label for the X-axis (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param yAxisLabel  a label for the Y-axis (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param dataset  the dataset for the chart (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param legend  a flag specifying whether or not a legend is required.\r\n     *\r\n     * @return A bubble chart.\r\n     ",
      "child_ranges": [
        "(line 1510,col 9)-(line 1510,col 54)",
        "(line 1511,col 9)-(line 1511,col 46)",
        "(line 1512,col 9)-(line 1512,col 54)",
        "(line 1513,col 9)-(line 1513,col 46)",
        "(line 1514,col 9)-(line 1514,col 62)",
        "(line 1515,col 9)-(line 1516,col 54)",
        "(line 1517,col 9)-(line 1517,col 76)",
        "(line 1518,col 9)-(line 1518,col 35)",
        "(line 1519,col 9)-(line 1520,col 30)",
        "(line 1521,col 9)-(line 1521,col 34)",
        "(line 1522,col 9)-(line 1522,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartFactory.createHistogram(java.lang.String, java.lang.String, java.lang.String, org.jfree.data.xy.IntervalXYDataset, boolean)",
      "begin_line": 1539,
      "end_line": 1553,
      "comment": "\r\n     * Creates a histogram chart.  This chart is constructed with an\r\n     * {@link XYPlot} using an {@link XYBarRenderer}.  The domain and range\r\n     * axes are {@link NumberAxis} instances.\r\n     *\r\n     * @param title  the chart title (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param xAxisLabel  the x axis label (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param yAxisLabel  the y axis label (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param legend  create a legend?\r\n     *\r\n     * @return The chart.\r\n     ",
      "child_ranges": [
        "(line 1542,col 9)-(line 1542,col 54)",
        "(line 1543,col 9)-(line 1543,col 46)",
        "(line 1544,col 9)-(line 1544,col 53)",
        "(line 1545,col 9)-(line 1545,col 54)",
        "(line 1546,col 9)-(line 1546,col 75)",
        "(line 1547,col 9)-(line 1547,col 66)",
        "(line 1548,col 9)-(line 1549,col 30)",
        "(line 1550,col 9)-(line 1550,col 34)",
        "(line 1551,col 9)-(line 1551,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartFactory.createBoxAndWhiskerChart(java.lang.String, java.lang.String, java.lang.String, org.jfree.data.statistics.BoxAndWhiskerCategoryDataset, boolean)",
      "begin_line": 1571,
      "end_line": 1588,
      "comment": "\r\n     * Creates and returns a default instance of a box and whisker chart\r\n     * based on data from a {@link BoxAndWhiskerCategoryDataset}.\r\n     *\r\n     * @param title  the chart title (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param categoryAxisLabel  a label for the category axis\r\n     *     (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param valueAxisLabel  a label for the value axis (\u003ccode\u003enull\u003c/code\u003e\r\n     *     permitted).\r\n     * @param dataset  the dataset for the chart (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param legend  a flag specifying whether or not a legend is required.\r\n     *\r\n     * @return A box and whisker chart.\r\n     *\r\n     * @since 1.0.4\r\n     ",
      "child_ranges": [
        "(line 1575,col 9)-(line 1575,col 72)",
        "(line 1576,col 9)-(line 1576,col 62)",
        "(line 1577,col 9)-(line 1577,col 50)",
        "(line 1579,col 9)-(line 1579,col 69)",
        "(line 1580,col 9)-(line 1580,col 78)",
        "(line 1582,col 9)-(line 1583,col 26)",
        "(line 1584,col 9)-(line 1585,col 30)",
        "(line 1586,col 9)-(line 1586,col 34)",
        "(line 1587,col 9)-(line 1587,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartFactory.createBoxAndWhiskerChart(java.lang.String, java.lang.String, java.lang.String, org.jfree.data.statistics.BoxAndWhiskerXYDataset, boolean)",
      "begin_line": 1603,
      "end_line": 1617,
      "comment": "\r\n     * Creates and returns a default instance of a box and whisker chart.\r\n     *\r\n     * @param title  the chart title (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param timeAxisLabel  a label for the time axis (\u003ccode\u003enull\u003c/code\u003e\r\n     *                       permitted).\r\n     * @param valueAxisLabel  a label for the value axis (\u003ccode\u003enull\u003c/code\u003e\r\n     *                        permitted).\r\n     * @param dataset  the dataset for the chart (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param legend  a flag specifying whether or not a legend is required.\r\n     *\r\n     * @return A box and whisker chart.\r\n     ",
      "child_ranges": [
        "(line 1607,col 9)-(line 1607,col 57)",
        "(line 1608,col 9)-(line 1608,col 62)",
        "(line 1609,col 9)-(line 1609,col 50)",
        "(line 1610,col 9)-(line 1610,col 77)",
        "(line 1611,col 9)-(line 1611,col 73)",
        "(line 1612,col 9)-(line 1613,col 30)",
        "(line 1614,col 9)-(line 1614,col 34)",
        "(line 1615,col 9)-(line 1615,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartFactory.createWindPlot(java.lang.String, java.lang.String, java.lang.String, org.jfree.data.xy.WindDataset, boolean)",
      "begin_line": 1630,
      "end_line": 1647,
      "comment": "\r\n     * Creates a wind plot with default settings.\r\n     *\r\n     * @param title  the chart title (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param xAxisLabel  a label for the x-axis (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param yAxisLabel  a label for the y-axis (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param dataset  the dataset for the chart (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param legend  a flag that controls whether or not a legend is created.\r\n     *\r\n     * @return A wind plot.\r\n     ",
      "child_ranges": [
        "(line 1634,col 9)-(line 1634,col 51)",
        "(line 1635,col 9)-(line 1635,col 53)",
        "(line 1636,col 9)-(line 1636,col 36)",
        "(line 1638,col 9)-(line 1638,col 59)",
        "(line 1639,col 9)-(line 1639,col 75)",
        "(line 1641,col 9)-(line 1641,col 66)",
        "(line 1642,col 9)-(line 1643,col 30)",
        "(line 1644,col 9)-(line 1644,col 34)",
        "(line 1645,col 9)-(line 1645,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartFactory.createWaferMapChart(java.lang.String, org.jfree.data.general.WaferMapDataset, boolean)",
      "begin_line": 1658,
      "end_line": 1669,
      "comment": "\r\n     * Creates a wafer map chart.\r\n     *\r\n     * @param title  the chart title (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param legend  display a legend?\r\n     *\r\n     * @return A wafer map chart.\r\n     ",
      "child_ranges": [
        "(line 1661,col 9)-(line 1661,col 54)",
        "(line 1662,col 9)-(line 1662,col 59)",
        "(line 1663,col 9)-(line 1663,col 35)",
        "(line 1664,col 9)-(line 1665,col 30)",
        "(line 1666,col 9)-(line 1666,col 34)",
        "(line 1667,col 9)-(line 1667,col 21)"
      ]
    }
  ]
}