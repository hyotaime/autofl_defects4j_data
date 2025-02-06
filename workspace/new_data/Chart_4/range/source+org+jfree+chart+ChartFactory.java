{
  "filepath": "/tmp/Chart-4b/source/org/jfree/chart/ChartFactory.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ChartFactory",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 230,
      "end_line": 2263,
      "comment": "\r\n * A collection of utility methods for creating some standard charts with\r\n * JFreeChart.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "currentTheme"
      ],
      "begin_line": 233,
      "end_line": 233,
      "comment": " The chart theme. "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartFactory.getChartTheme()",
      "begin_line": 245,
      "end_line": 247,
      "comment": "\r\n     * Returns the current chart theme used by the factory.\r\n     *\r\n     * @return The chart theme.\r\n     *\r\n     * @see #setChartTheme(ChartTheme)\r\n     * @see ChartUtilities#applyCurrentTheme(JFreeChart)\r\n     *\r\n     * @since 1.0.11\r\n     ",
      "child_ranges": [
        "(line 246,col 9)-(line 246,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartFactory.setChartTheme(org.jfree.chart.ChartTheme)",
      "begin_line": 260,
      "end_line": 279,
      "comment": "\r\n     * Sets the current chart theme.  This will be applied to all new charts\r\n     * created via methods in this class.\r\n     *\r\n     * @param theme  the theme (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getChartTheme()\r\n     * @see ChartUtilities#applyCurrentTheme(JFreeChart)\r\n     *\r\n     * @since 1.0.11\r\n     ",
      "child_ranges": [
        "(line 261,col 9)-(line 263,col 9)",
        "(line 264,col 9)-(line 264,col 29)",
        "(line 268,col 9)-(line 278,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartFactory.createPieChart(java.lang.String, org.jfree.data.general.PieDataset, boolean, boolean, java.util.Locale)",
      "begin_line": 297,
      "end_line": 311,
      "comment": "\r\n     * Creates a pie chart with default settings.\r\n     * \u003cP\u003e\r\n     * The chart object returned by this method uses a {@link PiePlot} instance\r\n     * as the plot.\r\n     *\r\n     * @param title  the chart title (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param dataset  the dataset for the chart (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param legend  a flag specifying whether or not a legend is required.\r\n     * @param tooltips  configure chart to generate tool tips?\r\n     * @param locale  the locale (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return A pie chart.\r\n     *\r\n     * @since 1.0.7\r\n     ",
      "child_ranges": [
        "(line 300,col 9)-(line 300,col 44)",
        "(line 301,col 9)-(line 301,col 77)",
        "(line 302,col 9)-(line 302,col 64)",
        "(line 303,col 9)-(line 305,col 9)",
        "(line 306,col 9)-(line 307,col 30)",
        "(line 308,col 9)-(line 308,col 34)",
        "(line 309,col 9)-(line 309,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartFactory.createPieChart(java.lang.String, org.jfree.data.general.PieDataset, boolean, boolean, boolean)",
      "begin_line": 327,
      "end_line": 346,
      "comment": "\r\n     * Creates a pie chart with default settings.\r\n     * \u003cP\u003e\r\n     * The chart object returned by this method uses a {@link PiePlot} instance\r\n     * as the plot.\r\n     *\r\n     * @param title  the chart title (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param dataset  the dataset for the chart (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param legend  a flag specifying whether or not a legend is required.\r\n     * @param tooltips  configure chart to generate tool tips?\r\n     * @param urls  configure chart to generate URLs?\r\n     *\r\n     * @return A pie chart.\r\n     ",
      "child_ranges": [
        "(line 333,col 9)-(line 333,col 44)",
        "(line 334,col 9)-(line 334,col 71)",
        "(line 335,col 9)-(line 335,col 64)",
        "(line 336,col 9)-(line 338,col 9)",
        "(line 339,col 9)-(line 341,col 9)",
        "(line 342,col 9)-(line 343,col 30)",
        "(line 344,col 9)-(line 344,col 34)",
        "(line 345,col 9)-(line 345,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartFactory.createPieChart(java.lang.String, org.jfree.data.general.PieDataset, org.jfree.data.general.PieDataset, int, boolean, boolean, boolean, java.util.Locale, boolean, boolean)",
      "begin_line": 388,
      "end_line": 465,
      "comment": "\r\n     * Creates a pie chart with default settings that compares 2 datasets.\r\n     * The colour of each section will be determined by the move from the value\r\n     * for the same key in \u003ccode\u003epreviousDataset\u003c/code\u003e. ie if value1 \u003e value2\r\n     * then the section will be in green (unless \u003ccode\u003egreenForIncrease\u003c/code\u003e\r\n     * is \u003ccode\u003efalse\u003c/code\u003e, in which case it would be \u003ccode\u003ered\u003c/code\u003e).\r\n     * Each section can have a shade of red or green as the difference can be\r\n     * tailored between 0% (black) and percentDiffForMaxScale% (bright\r\n     * red/green).\r\n     * \u003cp\u003e\r\n     * For instance if \u003ccode\u003epercentDiffForMaxScale\u003c/code\u003e is 10 (10%), a\r\n     * difference of 5% will have a half shade of red/green, a difference of\r\n     * 10% or more will have a maximum shade/brightness of red/green.\r\n     * \u003cP\u003e\r\n     * The chart object returned by this method uses a {@link PiePlot} instance\r\n     * as the plot.\r\n     * \u003cp\u003e\r\n     * Written by \u003ca href\u003d\"mailto:opensource@objectlab.co.uk\"\u003eBenoit\r\n     * Xhenseval\u003c/a\u003e.\r\n     *\r\n     * @param title  the chart title (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param dataset  the dataset for the chart (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param previousDataset  the dataset for the last run, this will be used\r\n     *                         to compare each key in the dataset\r\n     * @param percentDiffForMaxScale scale goes from bright red/green to black,\r\n     *                               percentDiffForMaxScale indicate the change\r\n     *                               required to reach top scale.\r\n     * @param greenForIncrease  an increase since previousDataset will be\r\n     *                          displayed in green (decrease red) if true.\r\n     * @param legend  a flag specifying whether or not a legend is required.\r\n     * @param tooltips  configure chart to generate tool tips?\r\n     * @param locale  the locale (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param subTitle displays a subtitle with colour scheme if true\r\n     * @param showDifference  create a new dataset that will show the %\r\n     *                        difference between the two datasets.\r\n     *\r\n     * @return A pie chart.\r\n     *\r\n     * @since 1.0.7\r\n     ",
      "child_ranges": [
        "(line 393,col 9)-(line 393,col 44)",
        "(line 394,col 9)-(line 394,col 77)",
        "(line 395,col 9)-(line 395,col 64)",
        "(line 397,col 9)-(line 399,col 9)",
        "(line 401,col 9)-(line 401,col 38)",
        "(line 402,col 9)-(line 402,col 40)",
        "(line 403,col 9)-(line 405,col 9)",
        "(line 407,col 9)-(line 407,col 64)",
        "(line 408,col 9)-(line 445,col 9)",
        "(line 447,col 9)-(line 449,col 9)",
        "(line 451,col 9)-(line 452,col 61)",
        "(line 454,col 9)-(line 462,col 9)",
        "(line 463,col 9)-(line 463,col 34)",
        "(line 464,col 9)-(line 464,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartFactory.createPieChart(java.lang.String, org.jfree.data.general.PieDataset, org.jfree.data.general.PieDataset, int, boolean, boolean, boolean, boolean, boolean, boolean)",
      "begin_line": 505,
      "end_line": 591,
      "comment": "\r\n     * Creates a pie chart with default settings that compares 2 datasets.\r\n     * The colour of each section will be determined by the move from the value\r\n     * for the same key in \u003ccode\u003epreviousDataset\u003c/code\u003e. ie if value1 \u003e value2\r\n     * then the section will be in green (unless \u003ccode\u003egreenForIncrease\u003c/code\u003e\r\n     * is \u003ccode\u003efalse\u003c/code\u003e, in which case it would be \u003ccode\u003ered\u003c/code\u003e).\r\n     * Each section can have a shade of red or green as the difference can be\r\n     * tailored between 0% (black) and percentDiffForMaxScale% (bright\r\n     * red/green).\r\n     * \u003cp\u003e\r\n     * For instance if \u003ccode\u003epercentDiffForMaxScale\u003c/code\u003e is 10 (10%), a\r\n     * difference of 5% will have a half shade of red/green, a difference of\r\n     * 10% or more will have a maximum shade/brightness of red/green.\r\n     * \u003cP\u003e\r\n     * The chart object returned by this method uses a {@link PiePlot} instance\r\n     * as the plot.\r\n     * \u003cp\u003e\r\n     * Written by \u003ca href\u003d\"mailto:opensource@objectlab.co.uk\"\u003eBenoit\r\n     * Xhenseval\u003c/a\u003e.\r\n     *\r\n     * @param title  the chart title (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param dataset  the dataset for the chart (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param previousDataset  the dataset for the last run, this will be used\r\n     *                         to compare each key in the dataset\r\n     * @param percentDiffForMaxScale scale goes from bright red/green to black,\r\n     *                               percentDiffForMaxScale indicate the change\r\n     *                               required to reach top scale.\r\n     * @param greenForIncrease  an increase since previousDataset will be\r\n     *                          displayed in green (decrease red) if true.\r\n     * @param legend  a flag specifying whether or not a legend is required.\r\n     * @param tooltips  configure chart to generate tool tips?\r\n     * @param urls  configure chart to generate URLs?\r\n     * @param subTitle displays a subtitle with colour scheme if true\r\n     * @param showDifference  create a new dataset that will show the %\r\n     *                        difference between the two datasets.\r\n     *\r\n     * @return A pie chart.\r\n     ",
      "child_ranges": [
        "(line 516,col 9)-(line 516,col 44)",
        "(line 517,col 9)-(line 517,col 71)",
        "(line 518,col 9)-(line 518,col 64)",
        "(line 520,col 9)-(line 522,col 9)",
        "(line 523,col 9)-(line 525,col 9)",
        "(line 527,col 9)-(line 527,col 38)",
        "(line 528,col 9)-(line 528,col 40)",
        "(line 529,col 9)-(line 531,col 9)",
        "(line 533,col 9)-(line 533,col 64)",
        "(line 534,col 9)-(line 571,col 9)",
        "(line 573,col 9)-(line 575,col 9)",
        "(line 577,col 9)-(line 578,col 61)",
        "(line 580,col 9)-(line 588,col 9)",
        "(line 589,col 9)-(line 589,col 34)",
        "(line 590,col 9)-(line 590,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartFactory.createRingChart(java.lang.String, org.jfree.data.general.PieDataset, boolean, boolean, java.util.Locale)",
      "begin_line": 609,
      "end_line": 622,
      "comment": "\r\n     * Creates a ring chart with default settings.\r\n     * \u003cP\u003e\r\n     * The chart object returned by this method uses a {@link RingPlot}\r\n     * instance as the plot.\r\n     *\r\n     * @param title  the chart title (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param dataset  the dataset for the chart (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param legend  a flag specifying whether or not a legend is required.\r\n     * @param tooltips  configure chart to generate tool tips?\r\n     * @param locale  the locale (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return A ring chart.\r\n     *\r\n     * @since 1.0.7\r\n     ",
      "child_ranges": [
        "(line 612,col 9)-(line 612,col 46)",
        "(line 613,col 9)-(line 613,col 77)",
        "(line 614,col 9)-(line 614,col 64)",
        "(line 615,col 9)-(line 617,col 9)",
        "(line 618,col 9)-(line 619,col 30)",
        "(line 620,col 9)-(line 620,col 34)",
        "(line 621,col 9)-(line 621,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartFactory.createRingChart(java.lang.String, org.jfree.data.general.PieDataset, boolean, boolean, boolean)",
      "begin_line": 638,
      "end_line": 658,
      "comment": "\r\n     * Creates a ring chart with default settings.\r\n     * \u003cP\u003e\r\n     * The chart object returned by this method uses a {@link RingPlot}\r\n     * instance as the plot.\r\n     *\r\n     * @param title  the chart title (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param dataset  the dataset for the chart (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param legend  a flag specifying whether or not a legend is required.\r\n     * @param tooltips  configure chart to generate tool tips?\r\n     * @param urls  configure chart to generate URLs?\r\n     *\r\n     * @return A ring chart.\r\n     ",
      "child_ranges": [
        "(line 644,col 9)-(line 644,col 46)",
        "(line 645,col 9)-(line 645,col 71)",
        "(line 646,col 9)-(line 646,col 64)",
        "(line 647,col 9)-(line 649,col 9)",
        "(line 650,col 9)-(line 652,col 9)",
        "(line 653,col 9)-(line 654,col 30)",
        "(line 655,col 9)-(line 655,col 34)",
        "(line 656,col 9)-(line 656,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartFactory.createMultiplePieChart(java.lang.String, org.jfree.data.category.CategoryDataset, org.jfree.chart.util.TableOrder, boolean, boolean, boolean)",
      "begin_line": 675,
      "end_line": 708,
      "comment": "\r\n     * Creates a chart that displays multiple pie plots.  The chart object\r\n     * returned by this method uses a {@link MultiplePiePlot} instance as the\r\n     * plot.\r\n     *\r\n     * @param title  the chart title (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param order  the order that the data is extracted (by row or by column)\r\n     *               (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param legend  include a legend?\r\n     * @param tooltips  generate tooltips?\r\n     * @param urls  generate URLs?\r\n     *\r\n     * @return A chart.\r\n     ",
      "child_ranges": [
        "(line 682,col 9)-(line 684,col 9)",
        "(line 685,col 9)-(line 685,col 60)",
        "(line 686,col 9)-(line 686,col 40)",
        "(line 687,col 9)-(line 687,col 38)",
        "(line 688,col 9)-(line 688,col 36)",
        "(line 690,col 9)-(line 695,col 9)",
        "(line 697,col 9)-(line 701,col 9)",
        "(line 703,col 9)-(line 704,col 30)",
        "(line 705,col 9)-(line 705,col 34)",
        "(line 706,col 9)-(line 706,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartFactory.createPieChart3D(java.lang.String, org.jfree.data.general.PieDataset, boolean, boolean, java.util.Locale)",
      "begin_line": 725,
      "end_line": 738,
      "comment": "\r\n     * Creates a 3D pie chart using the specified dataset.  The chart object\r\n     * returned by this method uses a {@link PiePlot3D} instance as the\r\n     * plot.\r\n     *\r\n     * @param title  the chart title (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param dataset  the dataset for the chart (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param legend  a flag specifying whether or not a legend is required.\r\n     * @param tooltips  configure chart to generate tool tips?\r\n     * @param locale  the locale (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return A pie chart.\r\n     *\r\n     * @since 1.0.7\r\n     ",
      "child_ranges": [
        "(line 728,col 9)-(line 728,col 48)",
        "(line 729,col 9)-(line 729,col 64)",
        "(line 730,col 9)-(line 732,col 9)",
        "(line 733,col 9)-(line 734,col 30)",
        "(line 735,col 9)-(line 735,col 34)",
        "(line 736,col 9)-(line 736,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartFactory.createPieChart3D(java.lang.String, org.jfree.data.general.PieDataset, boolean, boolean, boolean)",
      "begin_line": 753,
      "end_line": 772,
      "comment": "\r\n     * Creates a 3D pie chart using the specified dataset.  The chart object\r\n     * returned by this method uses a {@link PiePlot3D} instance as the\r\n     * plot.\r\n     *\r\n     * @param title  the chart title (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param dataset  the dataset for the chart (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param legend  a flag specifying whether or not a legend is required.\r\n     * @param tooltips  configure chart to generate tool tips?\r\n     * @param urls  configure chart to generate URLs?\r\n     *\r\n     * @return A pie chart.\r\n     ",
      "child_ranges": [
        "(line 759,col 9)-(line 759,col 48)",
        "(line 760,col 9)-(line 760,col 64)",
        "(line 761,col 9)-(line 763,col 9)",
        "(line 764,col 9)-(line 766,col 9)",
        "(line 767,col 9)-(line 768,col 30)",
        "(line 769,col 9)-(line 769,col 34)",
        "(line 770,col 9)-(line 770,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartFactory.createMultiplePieChart3D(java.lang.String, org.jfree.data.category.CategoryDataset, org.jfree.chart.util.TableOrder, boolean, boolean, boolean)",
      "begin_line": 789,
      "end_line": 831,
      "comment": "\r\n     * Creates a chart that displays multiple pie plots.  The chart object\r\n     * returned by this method uses a {@link MultiplePiePlot} instance as the\r\n     * plot.\r\n     *\r\n     * @param title  the chart title (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param order  the order that the data is extracted (by row or by column)\r\n     *               (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param legend  include a legend?\r\n     * @param tooltips  generate tooltips?\r\n     * @param urls  generate URLs?\r\n     *\r\n     * @return A chart.\r\n     ",
      "child_ranges": [
        "(line 796,col 9)-(line 798,col 9)",
        "(line 799,col 9)-(line 799,col 60)",
        "(line 800,col 9)-(line 800,col 40)",
        "(line 801,col 9)-(line 801,col 38)",
        "(line 802,col 9)-(line 802,col 36)",
        "(line 804,col 9)-(line 804,col 66)",
        "(line 805,col 9)-(line 806,col 51)",
        "(line 807,col 9)-(line 807,col 54)",
        "(line 808,col 9)-(line 808,col 39)",
        "(line 809,col 9)-(line 809,col 32)",
        "(line 810,col 9)-(line 810,col 42)",
        "(line 811,col 9)-(line 811,col 35)",
        "(line 813,col 9)-(line 818,col 9)",
        "(line 820,col 9)-(line 824,col 9)",
        "(line 826,col 9)-(line 827,col 30)",
        "(line 828,col 9)-(line 828,col 34)",
        "(line 829,col 9)-(line 829,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartFactory.createBarChart(java.lang.String, java.lang.String, java.lang.String, org.jfree.data.category.CategoryDataset, org.jfree.chart.plot.PlotOrientation, boolean, boolean, boolean)",
      "begin_line": 853,
      "end_line": 901,
      "comment": "\r\n     * Creates a bar chart.  The chart object returned by this method uses a\r\n     * {@link CategoryPlot} instance as the plot, with a {@link CategoryAxis}\r\n     * for the domain axis, a {@link NumberAxis} as the range axis, and a\r\n     * {@link BarRenderer} as the renderer.\r\n     *\r\n     * @param title  the chart title (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param categoryAxisLabel  the label for the category axis\r\n     *                           (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param valueAxisLabel  the label for the value axis\r\n     *                        (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param dataset  the dataset for the chart (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param orientation  the plot orientation (horizontal or vertical)\r\n     *                     (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param legend  a flag specifying whether or not a legend is required.\r\n     * @param tooltips  configure chart to generate tool tips?\r\n     * @param urls  configure chart to generate URLs?\r\n     *\r\n     * @return A bar chart.\r\n     ",
      "child_ranges": [
        "(line 862,col 9)-(line 864,col 9)",
        "(line 865,col 9)-(line 865,col 72)",
        "(line 866,col 9)-(line 866,col 61)",
        "(line 868,col 9)-(line 868,col 49)",
        "(line 869,col 9)-(line 884,col 9)",
        "(line 885,col 9)-(line 888,col 9)",
        "(line 889,col 9)-(line 891,col 9)",
        "(line 893,col 9)-(line 894,col 26)",
        "(line 895,col 9)-(line 895,col 41)",
        "(line 896,col 9)-(line 897,col 30)",
        "(line 898,col 9)-(line 898,col 34)",
        "(line 899,col 9)-(line 899,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartFactory.createStackedBarChart(java.lang.String, java.lang.String, java.lang.String, org.jfree.data.category.CategoryDataset, org.jfree.chart.plot.PlotOrientation, boolean, boolean, boolean)",
      "begin_line": 924,
      "end_line": 957,
      "comment": "\r\n     * Creates a stacked bar chart with default settings.  The chart object\r\n     * returned by this method uses a {@link CategoryPlot} instance as the\r\n     * plot, with a {@link CategoryAxis} for the domain axis, a\r\n     * {@link NumberAxis} as the range axis, and a {@link StackedBarRenderer}\r\n     * as the renderer.\r\n     *\r\n     * @param title  the chart title (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param domainAxisLabel  the label for the category axis\r\n     *                         (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param rangeAxisLabel  the label for the value axis\r\n     *                        (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param dataset  the dataset for the chart (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param orientation  the orientation of the chart (horizontal or\r\n     *                     vertical) (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param legend  a flag specifying whether or not a legend is required.\r\n     * @param tooltips  configure chart to generate tool tips?\r\n     * @param urls  configure chart to generate URLs?\r\n     *\r\n     * @return A stacked bar chart.\r\n     ",
      "child_ranges": [
        "(line 933,col 9)-(line 935,col 9)",
        "(line 937,col 9)-(line 937,col 70)",
        "(line 938,col 9)-(line 938,col 61)",
        "(line 940,col 9)-(line 940,col 63)",
        "(line 941,col 9)-(line 944,col 9)",
        "(line 945,col 9)-(line 947,col 9)",
        "(line 949,col 9)-(line 950,col 26)",
        "(line 951,col 9)-(line 951,col 41)",
        "(line 952,col 9)-(line 953,col 30)",
        "(line 954,col 9)-(line 954,col 34)",
        "(line 955,col 9)-(line 955,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartFactory.createBarChart3D(java.lang.String, java.lang.String, java.lang.String, org.jfree.data.category.CategoryDataset, org.jfree.chart.plot.PlotOrientation, boolean, boolean, boolean)",
      "begin_line": 979,
      "end_line": 1019,
      "comment": "\r\n     * Creates a bar chart with a 3D effect. The chart object returned by this\r\n     * method uses a {@link CategoryPlot} instance as the plot, with a\r\n     * {@link CategoryAxis3D} for the domain axis, a {@link NumberAxis3D} as\r\n     * the range axis, and a {@link BarRenderer3D} as the renderer.\r\n     *\r\n     * @param title  the chart title (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param categoryAxisLabel  the label for the category axis\r\n     *                           (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param valueAxisLabel  the label for the value axis (\u003ccode\u003enull\u003c/code\u003e\r\n     *                        permitted).\r\n     * @param dataset  the dataset for the chart (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param orientation  the plot orientation (horizontal or vertical)\r\n     *                     (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param legend  a flag specifying whether or not a legend is required.\r\n     * @param tooltips  configure chart to generate tool tips?\r\n     * @param urls  configure chart to generate URLs?\r\n     *\r\n     * @return A bar chart with a 3D effect.\r\n     ",
      "child_ranges": [
        "(line 988,col 9)-(line 990,col 9)",
        "(line 991,col 9)-(line 991,col 74)",
        "(line 992,col 9)-(line 992,col 63)",
        "(line 994,col 9)-(line 994,col 53)",
        "(line 995,col 9)-(line 998,col 9)",
        "(line 999,col 9)-(line 1001,col 9)",
        "(line 1003,col 9)-(line 1004,col 26)",
        "(line 1005,col 9)-(line 1005,col 41)",
        "(line 1006,col 9)-(line 1011,col 9)",
        "(line 1012,col 9)-(line 1012,col 39)",
        "(line 1014,col 9)-(line 1015,col 30)",
        "(line 1016,col 9)-(line 1016,col 34)",
        "(line 1017,col 9)-(line 1017,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartFactory.createStackedBarChart3D(java.lang.String, java.lang.String, java.lang.String, org.jfree.data.category.CategoryDataset, org.jfree.chart.plot.PlotOrientation, boolean, boolean, boolean)",
      "begin_line": 1042,
      "end_line": 1083,
      "comment": "\r\n     * Creates a stacked bar chart with a 3D effect and default settings. The\r\n     * chart object returned by this method uses a {@link CategoryPlot}\r\n     * instance as the plot, with a {@link CategoryAxis3D} for the domain axis,\r\n     * a {@link NumberAxis3D} as the range axis, and a\r\n     * {@link StackedBarRenderer3D} as the renderer.\r\n     *\r\n     * @param title  the chart title (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param categoryAxisLabel  the label for the category axis\r\n     *                           (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param valueAxisLabel  the label for the value axis (\u003ccode\u003enull\u003c/code\u003e\r\n     *                        permitted).\r\n     * @param dataset  the dataset for the chart (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param orientation  the orientation (horizontal or vertical)\r\n     *                     (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param legend  a flag specifying whether or not a legend is required.\r\n     * @param tooltips  configure chart to generate tool tips?\r\n     * @param urls  configure chart to generate URLs?\r\n     *\r\n     * @return A stacked bar chart with a 3D effect.\r\n     ",
      "child_ranges": [
        "(line 1051,col 9)-(line 1053,col 9)",
        "(line 1054,col 9)-(line 1054,col 74)",
        "(line 1055,col 9)-(line 1055,col 63)",
        "(line 1058,col 9)-(line 1058,col 67)",
        "(line 1059,col 9)-(line 1062,col 9)",
        "(line 1063,col 9)-(line 1065,col 9)",
        "(line 1068,col 9)-(line 1069,col 26)",
        "(line 1070,col 9)-(line 1070,col 41)",
        "(line 1071,col 9)-(line 1075,col 9)",
        "(line 1078,col 9)-(line 1079,col 30)",
        "(line 1080,col 9)-(line 1080,col 34)",
        "(line 1081,col 9)-(line 1081,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartFactory.createAreaChart(java.lang.String, java.lang.String, java.lang.String, org.jfree.data.category.CategoryDataset, org.jfree.chart.plot.PlotOrientation, boolean, boolean, boolean)",
      "begin_line": 1105,
      "end_line": 1139,
      "comment": "\r\n     * Creates an area chart with default settings.  The chart object returned\r\n     * by this method uses a {@link CategoryPlot} instance as the plot, with a\r\n     * {@link CategoryAxis} for the domain axis, a {@link NumberAxis} as the\r\n     * range axis, and an {@link AreaRenderer} as the renderer.\r\n     *\r\n     * @param title  the chart title (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param categoryAxisLabel  the label for the category axis\r\n     *                           (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param valueAxisLabel  the label for the value axis (\u003ccode\u003enull\u003c/code\u003e\r\n     *                        permitted).\r\n     * @param dataset  the dataset for the chart (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param orientation  the plot orientation (\u003ccode\u003enull\u003c/code\u003e not\r\n     *                     permitted).\r\n     * @param legend  a flag specifying whether or not a legend is required.\r\n     * @param tooltips  configure chart to generate tool tips?\r\n     * @param urls  configure chart to generate URLs?\r\n     *\r\n     * @return An area chart.\r\n     ",
      "child_ranges": [
        "(line 1114,col 9)-(line 1116,col 9)",
        "(line 1117,col 9)-(line 1117,col 72)",
        "(line 1118,col 9)-(line 1118,col 44)",
        "(line 1120,col 9)-(line 1120,col 61)",
        "(line 1122,col 9)-(line 1122,col 51)",
        "(line 1123,col 9)-(line 1126,col 9)",
        "(line 1127,col 9)-(line 1129,col 9)",
        "(line 1131,col 9)-(line 1132,col 26)",
        "(line 1133,col 9)-(line 1133,col 41)",
        "(line 1134,col 9)-(line 1135,col 30)",
        "(line 1136,col 9)-(line 1136,col 34)",
        "(line 1137,col 9)-(line 1137,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartFactory.createStackedAreaChart(java.lang.String, java.lang.String, java.lang.String, org.jfree.data.category.CategoryDataset, org.jfree.chart.plot.PlotOrientation, boolean, boolean, boolean)",
      "begin_line": 1162,
      "end_line": 1191,
      "comment": "\r\n     * Creates a stacked area chart with default settings.  The chart object\r\n     * returned by this method uses a {@link CategoryPlot} instance as the\r\n     * plot, with a {@link CategoryAxis} for the domain axis, a\r\n     * {@link NumberAxis} as the range axis, and a {@link StackedAreaRenderer}\r\n     * as the renderer.\r\n     *\r\n     * @param title  the chart title (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param categoryAxisLabel  the label for the category axis\r\n     *                           (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param valueAxisLabel  the label for the value axis (\u003ccode\u003enull\u003c/code\u003e\r\n     *                        permitted).\r\n     * @param dataset  the dataset for the chart (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param orientation  the plot orientation (horizontal or vertical)\r\n     *                     (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param legend  a flag specifying whether or not a legend is required.\r\n     * @param tooltips  configure chart to generate tool tips?\r\n     * @param urls  configure chart to generate URLs?\r\n     *\r\n     * @return A stacked area chart.\r\n     ",
      "child_ranges": [
        "(line 1167,col 9)-(line 1169,col 9)",
        "(line 1170,col 9)-(line 1170,col 72)",
        "(line 1171,col 9)-(line 1171,col 44)",
        "(line 1172,col 9)-(line 1172,col 61)",
        "(line 1174,col 9)-(line 1174,col 65)",
        "(line 1175,col 9)-(line 1178,col 9)",
        "(line 1179,col 9)-(line 1181,col 9)",
        "(line 1183,col 9)-(line 1184,col 26)",
        "(line 1185,col 9)-(line 1185,col 41)",
        "(line 1186,col 9)-(line 1187,col 30)",
        "(line 1188,col 9)-(line 1188,col 34)",
        "(line 1189,col 9)-(line 1189,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartFactory.createLineChart(java.lang.String, java.lang.String, java.lang.String, org.jfree.data.category.CategoryDataset, org.jfree.chart.plot.PlotOrientation, boolean, boolean, boolean)",
      "begin_line": 1213,
      "end_line": 1244,
      "comment": "\r\n     * Creates a line chart with default settings.  The chart object returned\r\n     * by this method uses a {@link CategoryPlot} instance as the plot, with a\r\n     * {@link CategoryAxis} for the domain axis, a {@link NumberAxis} as the\r\n     * range axis, and a {@link LineAndShapeRenderer} as the renderer.\r\n     *\r\n     * @param title  the chart title (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param categoryAxisLabel  the label for the category axis\r\n     *                           (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param valueAxisLabel  the label for the value axis (\u003ccode\u003enull\u003c/code\u003e\r\n     *                        permitted).\r\n     * @param dataset  the dataset for the chart (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param orientation  the chart orientation (horizontal or vertical)\r\n     *                     (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param legend  a flag specifying whether or not a legend is required.\r\n     * @param tooltips  configure chart to generate tool tips?\r\n     * @param urls  configure chart to generate URLs?\r\n     *\r\n     * @return A line chart.\r\n     ",
      "child_ranges": [
        "(line 1222,col 9)-(line 1224,col 9)",
        "(line 1225,col 9)-(line 1225,col 72)",
        "(line 1226,col 9)-(line 1226,col 61)",
        "(line 1228,col 9)-(line 1228,col 78)",
        "(line 1229,col 9)-(line 1232,col 9)",
        "(line 1233,col 9)-(line 1235,col 9)",
        "(line 1236,col 9)-(line 1237,col 26)",
        "(line 1238,col 9)-(line 1238,col 41)",
        "(line 1239,col 9)-(line 1240,col 30)",
        "(line 1241,col 9)-(line 1241,col 34)",
        "(line 1242,col 9)-(line 1242,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartFactory.createLineChart3D(java.lang.String, java.lang.String, java.lang.String, org.jfree.data.category.CategoryDataset, org.jfree.chart.plot.PlotOrientation, boolean, boolean, boolean)",
      "begin_line": 1266,
      "end_line": 1297,
      "comment": "\r\n     * Creates a line chart with default settings. The chart object returned by\r\n     * this method uses a {@link CategoryPlot} instance as the plot, with a\r\n     * {@link CategoryAxis3D} for the domain axis, a {@link NumberAxis3D} as\r\n     * the range axis, and a {@link LineRenderer3D} as the renderer.\r\n     *\r\n     * @param title  the chart title (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param categoryAxisLabel  the label for the category axis\r\n     *                           (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param valueAxisLabel  the label for the value axis (\u003ccode\u003enull\u003c/code\u003e\r\n     *                        permitted).\r\n     * @param dataset  the dataset for the chart (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param orientation  the chart orientation (horizontal or vertical)\r\n     *                     (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param legend  a flag specifying whether or not a legend is required.\r\n     * @param tooltips  configure chart to generate tool tips?\r\n     * @param urls  configure chart to generate URLs?\r\n     *\r\n     * @return A line chart.\r\n     ",
      "child_ranges": [
        "(line 1275,col 9)-(line 1277,col 9)",
        "(line 1278,col 9)-(line 1278,col 74)",
        "(line 1279,col 9)-(line 1279,col 63)",
        "(line 1281,col 9)-(line 1281,col 55)",
        "(line 1282,col 9)-(line 1285,col 9)",
        "(line 1286,col 9)-(line 1288,col 9)",
        "(line 1289,col 9)-(line 1290,col 26)",
        "(line 1291,col 9)-(line 1291,col 41)",
        "(line 1292,col 9)-(line 1293,col 30)",
        "(line 1294,col 9)-(line 1294,col 34)",
        "(line 1295,col 9)-(line 1295,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartFactory.createGanttChart(java.lang.String, java.lang.String, java.lang.String, org.jfree.data.category.IntervalCategoryDataset, boolean, boolean, boolean)",
      "begin_line": 1318,
      "end_line": 1347,
      "comment": "\r\n     * Creates a Gantt chart using the supplied attributes plus default values\r\n     * where required.  The chart object returned by this method uses a\r\n     * {@link CategoryPlot} instance as the plot, with a {@link CategoryAxis}\r\n     * for the domain axis, a {@link DateAxis} as the range axis, and a\r\n     * {@link GanttRenderer} as the renderer.\r\n     *\r\n     * @param title  the chart title (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param categoryAxisLabel  the label for the category axis\r\n     *                           (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param dateAxisLabel  the label for the date axis\r\n     *                       (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param dataset  the dataset for the chart (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param legend  a flag specifying whether or not a legend is required.\r\n     * @param tooltips  configure chart to generate tool tips?\r\n     * @param urls  configure chart to generate URLs?\r\n     *\r\n     * @return A Gantt chart.\r\n     ",
      "child_ranges": [
        "(line 1326,col 9)-(line 1326,col 72)",
        "(line 1327,col 9)-(line 1327,col 56)",
        "(line 1329,col 9)-(line 1329,col 60)",
        "(line 1330,col 9)-(line 1334,col 9)",
        "(line 1335,col 9)-(line 1337,col 9)",
        "(line 1339,col 9)-(line 1340,col 26)",
        "(line 1341,col 9)-(line 1341,col 56)",
        "(line 1342,col 9)-(line 1343,col 30)",
        "(line 1344,col 9)-(line 1344,col 34)",
        "(line 1345,col 9)-(line 1345,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartFactory.createWaterfallChart(java.lang.String, java.lang.String, java.lang.String, org.jfree.data.category.CategoryDataset, org.jfree.chart.plot.PlotOrientation, boolean, boolean, boolean)",
      "begin_line": 1369,
      "end_line": 1422,
      "comment": "\r\n     * Creates a waterfall chart.  The chart object returned by this method\r\n     * uses a {@link CategoryPlot} instance as the plot, with a\r\n     * {@link CategoryAxis} for the domain axis, a {@link NumberAxis} as the\r\n     * range axis, and a {@link WaterfallBarRenderer} as the renderer.\r\n     *\r\n     * @param title  the chart title (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param categoryAxisLabel  the label for the category axis\r\n     *                           (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param valueAxisLabel  the label for the value axis (\u003ccode\u003enull\u003c/code\u003e\r\n     *                        permitted).\r\n     * @param dataset  the dataset for the chart (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param orientation  the plot orientation (horizontal or vertical)\r\n     *                     (\u003ccode\u003enull\u003c/code\u003e NOT permitted).\r\n     * @param legend  a flag specifying whether or not a legend is required.\r\n     * @param tooltips  configure chart to generate tool tips?\r\n     * @param urls  configure chart to generate URLs?\r\n     *\r\n     * @return A waterfall chart.\r\n     ",
      "child_ranges": [
        "(line 1378,col 9)-(line 1380,col 9)",
        "(line 1381,col 9)-(line 1381,col 72)",
        "(line 1382,col 9)-(line 1382,col 44)",
        "(line 1384,col 9)-(line 1384,col 61)",
        "(line 1386,col 9)-(line 1386,col 67)",
        "(line 1387,col 9)-(line 1400,col 9)",
        "(line 1401,col 9)-(line 1405,col 9)",
        "(line 1406,col 9)-(line 1408,col 9)",
        "(line 1410,col 9)-(line 1411,col 26)",
        "(line 1412,col 9)-(line 1412,col 33)",
        "(line 1413,col 9)-(line 1413,col 47)",
        "(line 1414,col 9)-(line 1414,col 39)",
        "(line 1415,col 9)-(line 1415,col 56)",
        "(line 1416,col 9)-(line 1416,col 41)",
        "(line 1417,col 9)-(line 1418,col 30)",
        "(line 1419,col 9)-(line 1419,col 34)",
        "(line 1420,col 9)-(line 1420,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartFactory.createPolarChart(java.lang.String, org.jfree.data.xy.XYDataset, boolean, boolean, boolean)",
      "begin_line": 1438,
      "end_line": 1457,
      "comment": "\r\n     * Creates a polar plot for the specified dataset (x-values interpreted as\r\n     * angles in degrees).  The chart object returned by this method uses a\r\n     * {@link PolarPlot} instance as the plot, with a {@link NumberAxis} for\r\n     * the radial axis.\r\n     *\r\n     * @param title  the chart title (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param legend  legend required?\r\n     * @param tooltips  tooltips required?\r\n     * @param urls  URLs required?\r\n     *\r\n     * @return A chart.\r\n     ",
      "child_ranges": [
        "(line 1444,col 9)-(line 1444,col 41)",
        "(line 1445,col 9)-(line 1445,col 33)",
        "(line 1446,col 9)-(line 1446,col 48)",
        "(line 1447,col 9)-(line 1447,col 44)",
        "(line 1448,col 9)-(line 1448,col 45)",
        "(line 1449,col 9)-(line 1449,col 78)",
        "(line 1450,col 9)-(line 1450,col 32)",
        "(line 1451,col 9)-(line 1451,col 57)",
        "(line 1452,col 9)-(line 1453,col 68)",
        "(line 1454,col 9)-(line 1454,col 34)",
        "(line 1455,col 9)-(line 1455,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartFactory.createScatterPlot(java.lang.String, java.lang.String, java.lang.String, org.jfree.data.xy.XYDataset, org.jfree.chart.plot.PlotOrientation, boolean, boolean, boolean)",
      "begin_line": 1478,
      "end_line": 1512,
      "comment": "\r\n     * Creates a scatter plot with default settings.  The chart object\r\n     * returned by this method uses an {@link XYPlot} instance as the plot,\r\n     * with a {@link NumberAxis} for the domain axis, a  {@link NumberAxis}\r\n     * as the range axis, and an {@link XYLineAndShapeRenderer} as the\r\n     * renderer.\r\n     *\r\n     * @param title  the chart title (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param xAxisLabel  a label for the X-axis (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param yAxisLabel  a label for the Y-axis (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param dataset  the dataset for the chart (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param orientation  the plot orientation (horizontal or vertical)\r\n     *                     (\u003ccode\u003enull\u003c/code\u003e NOT permitted).\r\n     * @param legend  a flag specifying whether or not a legend is required.\r\n     * @param tooltips  configure chart to generate tool tips?\r\n     * @param urls  configure chart to generate URLs?\r\n     *\r\n     * @return A scatter plot.\r\n     ",
      "child_ranges": [
        "(line 1482,col 9)-(line 1484,col 9)",
        "(line 1485,col 9)-(line 1485,col 54)",
        "(line 1486,col 9)-(line 1486,col 46)",
        "(line 1487,col 9)-(line 1487,col 54)",
        "(line 1488,col 9)-(line 1488,col 46)",
        "(line 1490,col 9)-(line 1490,col 62)",
        "(line 1492,col 9)-(line 1492,col 51)",
        "(line 1493,col 9)-(line 1495,col 9)",
        "(line 1497,col 9)-(line 1497,col 43)",
        "(line 1498,col 9)-(line 1500,col 9)",
        "(line 1501,col 9)-(line 1501,col 74)",
        "(line 1502,col 9)-(line 1502,col 59)",
        "(line 1503,col 9)-(line 1503,col 51)",
        "(line 1504,col 9)-(line 1504,col 35)",
        "(line 1505,col 9)-(line 1505,col 41)",
        "(line 1507,col 9)-(line 1508,col 30)",
        "(line 1509,col 9)-(line 1509,col 34)",
        "(line 1510,col 9)-(line 1510,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartFactory.createXYBarChart(java.lang.String, java.lang.String, boolean, java.lang.String, org.jfree.data.xy.IntervalXYDataset, org.jfree.chart.plot.PlotOrientation, boolean, boolean, boolean)",
      "begin_line": 1535,
      "end_line": 1582,
      "comment": "\r\n     * Creates and returns a default instance of an XY bar chart.\r\n     * \u003cP\u003e\r\n     * The chart object returned by this method uses an {@link XYPlot} instance\r\n     * as the plot, with a {@link DateAxis} for the domain axis, a\r\n     * {@link NumberAxis} as the range axis, and a {@link XYBarRenderer} as the\r\n     * renderer.\r\n     *\r\n     * @param title  the chart title (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param xAxisLabel  a label for the X-axis (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param dateAxis  make the domain axis display dates?\r\n     * @param yAxisLabel  a label for the Y-axis (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param dataset  the dataset for the chart (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param orientation  the orientation (horizontal or vertical)\r\n     *                     (\u003ccode\u003enull\u003c/code\u003e NOT permitted).\r\n     * @param legend  a flag specifying whether or not a legend is required.\r\n     * @param tooltips  configure chart to generate tool tips?\r\n     * @param urls  configure chart to generate URLs?\r\n     *\r\n     * @return An XY bar chart.\r\n     ",
      "child_ranges": [
        "(line 1545,col 9)-(line 1547,col 9)",
        "(line 1548,col 9)-(line 1548,col 36)",
        "(line 1549,col 9)-(line 1556,col 9)",
        "(line 1557,col 9)-(line 1557,col 57)",
        "(line 1559,col 9)-(line 1559,col 53)",
        "(line 1560,col 9)-(line 1569,col 9)",
        "(line 1570,col 9)-(line 1572,col 9)",
        "(line 1574,col 9)-(line 1574,col 75)",
        "(line 1575,col 9)-(line 1575,col 41)",
        "(line 1577,col 9)-(line 1578,col 30)",
        "(line 1579,col 9)-(line 1579,col 34)",
        "(line 1580,col 9)-(line 1580,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartFactory.createXYAreaChart(java.lang.String, java.lang.String, java.lang.String, org.jfree.data.xy.XYDataset, org.jfree.chart.plot.PlotOrientation, boolean, boolean, boolean)",
      "begin_line": 1604,
      "end_line": 1640,
      "comment": "\r\n     * Creates an area chart using an {@link XYDataset}.\r\n     * \u003cP\u003e\r\n     * The chart object returned by this method uses an {@link XYPlot} instance\r\n     * as the plot, with a {@link NumberAxis} for the domain axis, a\r\n     * {@link NumberAxis} as the range axis, and a {@link XYAreaRenderer} as\r\n     * the renderer.\r\n     *\r\n     * @param title  the chart title (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param xAxisLabel  a label for the X-axis (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param yAxisLabel  a label for the Y-axis (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param dataset  the dataset for the chart (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param orientation  the plot orientation (horizontal or vertical)\r\n     *                     (\u003ccode\u003enull\u003c/code\u003e NOT permitted).\r\n     * @param legend  a flag specifying whether or not a legend is required.\r\n     * @param tooltips  configure chart to generate tool tips?\r\n     * @param urls  configure chart to generate URLs?\r\n     *\r\n     * @return An XY area chart.\r\n     ",
      "child_ranges": [
        "(line 1613,col 9)-(line 1615,col 9)",
        "(line 1616,col 9)-(line 1616,col 54)",
        "(line 1617,col 9)-(line 1617,col 46)",
        "(line 1618,col 9)-(line 1618,col 54)",
        "(line 1619,col 9)-(line 1619,col 62)",
        "(line 1620,col 9)-(line 1620,col 41)",
        "(line 1621,col 9)-(line 1621,col 38)",
        "(line 1623,col 9)-(line 1623,col 47)",
        "(line 1624,col 9)-(line 1626,col 9)",
        "(line 1628,col 9)-(line 1628,col 43)",
        "(line 1629,col 9)-(line 1631,col 9)",
        "(line 1633,col 9)-(line 1634,col 31)",
        "(line 1635,col 9)-(line 1636,col 30)",
        "(line 1637,col 9)-(line 1637,col 34)",
        "(line 1638,col 9)-(line 1638,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartFactory.createStackedXYAreaChart(java.lang.String, java.lang.String, java.lang.String, org.jfree.data.xy.TableXYDataset, org.jfree.chart.plot.PlotOrientation, boolean, boolean, boolean)",
      "begin_line": 1660,
      "end_line": 1699,
      "comment": "\r\n     * Creates a stacked XY area plot.  The chart object returned by this\r\n     * method uses an {@link XYPlot} instance as the plot, with a\r\n     * {@link NumberAxis} for the domain axis, a {@link NumberAxis} as the\r\n     * range axis, and a {@link StackedXYAreaRenderer2} as the renderer.\r\n     *\r\n     * @param title  the chart title (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param xAxisLabel  a label for the X-axis (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param yAxisLabel  a label for the Y-axis (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param dataset  the dataset for the chart (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param orientation  the plot orientation (horizontal or vertical)\r\n     *                     (\u003ccode\u003enull\u003c/code\u003e NOT permitted).\r\n     * @param legend  a flag specifying whether or not a legend is required.\r\n     * @param tooltips  configure chart to generate tool tips?\r\n     * @param urls  configure chart to generate URLs?\r\n     *\r\n     * @return A stacked XY area chart.\r\n     ",
      "child_ranges": [
        "(line 1669,col 9)-(line 1671,col 9)",
        "(line 1672,col 9)-(line 1672,col 54)",
        "(line 1673,col 9)-(line 1673,col 46)",
        "(line 1674,col 9)-(line 1674,col 34)",
        "(line 1675,col 9)-(line 1675,col 34)",
        "(line 1676,col 9)-(line 1676,col 54)",
        "(line 1677,col 9)-(line 1677,col 51)",
        "(line 1678,col 9)-(line 1680,col 9)",
        "(line 1682,col 9)-(line 1682,col 43)",
        "(line 1683,col 9)-(line 1685,col 9)",
        "(line 1686,col 9)-(line 1687,col 48)",
        "(line 1688,col 9)-(line 1688,col 34)",
        "(line 1689,col 9)-(line 1689,col 66)",
        "(line 1690,col 9)-(line 1690,col 41)",
        "(line 1692,col 9)-(line 1692,col 33)",
        "(line 1694,col 9)-(line 1695,col 30)",
        "(line 1696,col 9)-(line 1696,col 34)",
        "(line 1697,col 9)-(line 1697,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartFactory.createXYLineChart(java.lang.String, java.lang.String, java.lang.String, org.jfree.data.xy.XYDataset, org.jfree.chart.plot.PlotOrientation, boolean, boolean, boolean)",
      "begin_line": 1717,
      "end_line": 1747,
      "comment": "\r\n     * Creates a line chart (based on an {@link XYDataset}) with default\r\n     * settings.\r\n     *\r\n     * @param title  the chart title (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param xAxisLabel  a label for the X-axis (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param yAxisLabel  a label for the Y-axis (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param dataset  the dataset for the chart (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param orientation  the plot orientation (horizontal or vertical)\r\n     *                     (\u003ccode\u003enull\u003c/code\u003e NOT permitted).\r\n     * @param legend  a flag specifying whether or not a legend is required.\r\n     * @param tooltips  configure chart to generate tool tips?\r\n     * @param urls  configure chart to generate URLs?\r\n     *\r\n     * @return The chart.\r\n     ",
      "child_ranges": [
        "(line 1726,col 9)-(line 1728,col 9)",
        "(line 1729,col 9)-(line 1729,col 54)",
        "(line 1730,col 9)-(line 1730,col 46)",
        "(line 1731,col 9)-(line 1731,col 54)",
        "(line 1732,col 9)-(line 1732,col 74)",
        "(line 1733,col 9)-(line 1733,col 66)",
        "(line 1734,col 9)-(line 1734,col 41)",
        "(line 1735,col 9)-(line 1737,col 9)",
        "(line 1738,col 9)-(line 1740,col 9)",
        "(line 1742,col 9)-(line 1743,col 30)",
        "(line 1744,col 9)-(line 1744,col 34)",
        "(line 1745,col 9)-(line 1745,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartFactory.createXYStepChart(java.lang.String, java.lang.String, java.lang.String, org.jfree.data.xy.XYDataset, org.jfree.chart.plot.PlotOrientation, boolean, boolean, boolean)",
      "begin_line": 1764,
      "end_line": 1802,
      "comment": "\r\n     * Creates a stepped XY plot with default settings.\r\n     *\r\n     * @param title  the chart title (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param xAxisLabel  a label for the X-axis (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param yAxisLabel  a label for the Y-axis (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param dataset  the dataset for the chart (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param orientation  the plot orientation (horizontal or vertical)\r\n     *                     (\u003ccode\u003enull\u003c/code\u003e NOT permitted).\r\n     * @param legend  a flag specifying whether or not a legend is required.\r\n     * @param tooltips  configure chart to generate tool tips?\r\n     * @param urls  configure chart to generate URLs?\r\n     *\r\n     * @return A chart.\r\n     ",
      "child_ranges": [
        "(line 1773,col 9)-(line 1775,col 9)",
        "(line 1776,col 9)-(line 1776,col 50)",
        "(line 1777,col 9)-(line 1777,col 54)",
        "(line 1778,col 9)-(line 1778,col 72)",
        "(line 1780,col 9)-(line 1780,col 51)",
        "(line 1781,col 9)-(line 1783,col 9)",
        "(line 1785,col 9)-(line 1785,col 43)",
        "(line 1786,col 9)-(line 1788,col 9)",
        "(line 1789,col 9)-(line 1790,col 65)",
        "(line 1792,col 9)-(line 1792,col 62)",
        "(line 1793,col 9)-(line 1793,col 35)",
        "(line 1794,col 9)-(line 1794,col 41)",
        "(line 1795,col 9)-(line 1795,col 46)",
        "(line 1796,col 9)-(line 1796,col 45)",
        "(line 1797,col 9)-(line 1798,col 30)",
        "(line 1799,col 9)-(line 1799,col 34)",
        "(line 1800,col 9)-(line 1800,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartFactory.createXYStepAreaChart(java.lang.String, java.lang.String, java.lang.String, org.jfree.data.xy.XYDataset, org.jfree.chart.plot.PlotOrientation, boolean, boolean, boolean)",
      "begin_line": 1819,
      "end_line": 1857,
      "comment": "\r\n     * Creates a filled stepped XY plot with default settings.\r\n     *\r\n     * @param title  the chart title (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param xAxisLabel  a label for the X-axis (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param yAxisLabel  a label for the Y-axis (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param dataset  the dataset for the chart (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param orientation  the plot orientation (horizontal or vertical)\r\n     *                     (\u003ccode\u003enull\u003c/code\u003e NOT permitted).\r\n     * @param legend  a flag specifying whether or not a legend is required.\r\n     * @param tooltips  configure chart to generate tool tips?\r\n     * @param urls  configure chart to generate URLs?\r\n     *\r\n     * @return A chart.\r\n     ",
      "child_ranges": [
        "(line 1828,col 9)-(line 1830,col 9)",
        "(line 1831,col 9)-(line 1831,col 54)",
        "(line 1832,col 9)-(line 1832,col 46)",
        "(line 1833,col 9)-(line 1833,col 54)",
        "(line 1835,col 9)-(line 1835,col 51)",
        "(line 1836,col 9)-(line 1838,col 9)",
        "(line 1840,col 9)-(line 1840,col 43)",
        "(line 1841,col 9)-(line 1843,col 9)",
        "(line 1844,col 9)-(line 1846,col 30)",
        "(line 1848,col 9)-(line 1848,col 62)",
        "(line 1849,col 9)-(line 1849,col 35)",
        "(line 1850,col 9)-(line 1850,col 41)",
        "(line 1851,col 9)-(line 1851,col 46)",
        "(line 1852,col 9)-(line 1852,col 45)",
        "(line 1853,col 9)-(line 1854,col 30)",
        "(line 1855,col 9)-(line 1855,col 34)",
        "(line 1856,col 9)-(line 1856,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartFactory.createTimeSeriesChart(java.lang.String, java.lang.String, java.lang.String, org.jfree.data.xy.XYDataset, boolean, boolean, boolean)",
      "begin_line": 1880,
      "end_line": 1917,
      "comment": "\r\n     * Creates and returns a time series chart.  A time series chart is an\r\n     * {@link XYPlot} with a {@link DateAxis} for the x-axis and a\r\n     * {@link NumberAxis} for the y-axis.  The default renderer is an\r\n     * {@link XYLineAndShapeRenderer}.\r\n     * \u003cP\u003e\r\n     * A convenient dataset to use with this chart is a\r\n     * {@link org.jfree.data.time.TimeSeriesCollection}.\r\n     *\r\n     * @param title  the chart title (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param timeAxisLabel  a label for the time axis (\u003ccode\u003enull\u003c/code\u003e\r\n     *                       permitted).\r\n     * @param valueAxisLabel  a label for the value axis (\u003ccode\u003enull\u003c/code\u003e\r\n     *                        permitted).\r\n     * @param dataset  the dataset for the chart (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param legend  a flag specifying whether or not a legend is required.\r\n     * @param tooltips  configure chart to generate tool tips?\r\n     * @param urls  configure chart to generate URLs?\r\n     *\r\n     * @return A time series chart.\r\n     ",
      "child_ranges": [
        "(line 1888,col 9)-(line 1888,col 57)",
        "(line 1889,col 9)-(line 1889,col 38)",
        "(line 1890,col 9)-(line 1890,col 38)",
        "(line 1891,col 9)-(line 1891,col 62)",
        "(line 1892,col 9)-(line 1892,col 50)",
        "(line 1893,col 9)-(line 1893,col 69)",
        "(line 1895,col 9)-(line 1895,col 51)",
        "(line 1896,col 9)-(line 1899,col 9)",
        "(line 1901,col 9)-(line 1901,col 43)",
        "(line 1902,col 9)-(line 1904,col 9)",
        "(line 1906,col 9)-(line 1907,col 23)",
        "(line 1908,col 9)-(line 1908,col 59)",
        "(line 1909,col 9)-(line 1909,col 51)",
        "(line 1910,col 9)-(line 1910,col 35)",
        "(line 1912,col 9)-(line 1913,col 30)",
        "(line 1914,col 9)-(line 1914,col 34)",
        "(line 1915,col 9)-(line 1915,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartFactory.createCandlestickChart(java.lang.String, java.lang.String, java.lang.String, org.jfree.data.xy.OHLCDataset, boolean)",
      "begin_line": 1932,
      "end_line": 1947,
      "comment": "\r\n     * Creates and returns a default instance of a candlesticks chart.\r\n     *\r\n     * @param title  the chart title (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param timeAxisLabel  a label for the time axis (\u003ccode\u003enull\u003c/code\u003e\r\n     *                       permitted).\r\n     * @param valueAxisLabel  a label for the value axis (\u003ccode\u003enull\u003c/code\u003e\r\n     *                        permitted).\r\n     * @param dataset  the dataset for the chart (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param legend  a flag specifying whether or not a legend is required.\r\n     *\r\n     * @return A candlestick chart.\r\n     ",
      "child_ranges": [
        "(line 1938,col 9)-(line 1938,col 57)",
        "(line 1939,col 9)-(line 1939,col 62)",
        "(line 1940,col 9)-(line 1940,col 69)",
        "(line 1941,col 9)-(line 1941,col 52)",
        "(line 1942,col 9)-(line 1943,col 30)",
        "(line 1944,col 9)-(line 1944,col 34)",
        "(line 1945,col 9)-(line 1945,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartFactory.createHighLowChart(java.lang.String, java.lang.String, java.lang.String, org.jfree.data.xy.OHLCDataset, boolean)",
      "begin_line": 1962,
      "end_line": 1978,
      "comment": "\r\n     * Creates and returns a default instance of a high-low-open-close chart.\r\n     *\r\n     * @param title  the chart title (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param timeAxisLabel  a label for the time axis (\u003ccode\u003enull\u003c/code\u003e\r\n     *                       permitted).\r\n     * @param valueAxisLabel  a label for the value axis (\u003ccode\u003enull\u003c/code\u003e\r\n     *                        permitted).\r\n     * @param dataset  the dataset for the chart (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param legend  a flag specifying whether or not a legend is required.\r\n     *\r\n     * @return A high-low-open-close chart.\r\n     ",
      "child_ranges": [
        "(line 1968,col 9)-(line 1968,col 57)",
        "(line 1969,col 9)-(line 1969,col 62)",
        "(line 1970,col 9)-(line 1970,col 57)",
        "(line 1971,col 9)-(line 1971,col 74)",
        "(line 1972,col 9)-(line 1972,col 73)",
        "(line 1973,col 9)-(line 1974,col 30)",
        "(line 1975,col 9)-(line 1975,col 34)",
        "(line 1976,col 9)-(line 1976,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartFactory.createHighLowChart(java.lang.String, java.lang.String, java.lang.String, org.jfree.data.xy.OHLCDataset, org.jfree.chart.axis.Timeline, boolean)",
      "begin_line": 1998,
      "end_line": 2016,
      "comment": "\r\n     * Creates and returns a default instance of a high-low-open-close chart\r\n     * with a special timeline. This timeline can be a\r\n     * {@link org.jfree.chart.axis.SegmentedTimeline} such as the Monday\r\n     * through Friday timeline that will remove Saturdays and Sundays from\r\n     * the axis.\r\n     *\r\n     * @param title  the chart title (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param timeAxisLabel  a label for the time axis (\u003ccode\u003enull\u003c/code\u003e\r\n     *                       permitted).\r\n     * @param valueAxisLabel  a label for the value axis (\u003ccode\u003enull\u003c/code\u003e\r\n     *                        permitted).\r\n     * @param dataset  the dataset for the chart (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param timeline  the timeline.\r\n     * @param legend  a flag specifying whether or not a legend is required.\r\n     *\r\n     * @return A high-low-open-close chart.\r\n     ",
      "child_ranges": [
        "(line 2005,col 9)-(line 2005,col 56)",
        "(line 2006,col 9)-(line 2006,col 39)",
        "(line 2007,col 9)-(line 2007,col 62)",
        "(line 2008,col 9)-(line 2008,col 57)",
        "(line 2009,col 9)-(line 2009,col 74)",
        "(line 2010,col 9)-(line 2010,col 73)",
        "(line 2011,col 9)-(line 2012,col 30)",
        "(line 2013,col 9)-(line 2013,col 34)",
        "(line 2014,col 9)-(line 2014,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartFactory.createBubbleChart(java.lang.String, java.lang.String, java.lang.String, org.jfree.data.xy.XYZDataset, org.jfree.chart.plot.PlotOrientation, boolean, boolean, boolean)",
      "begin_line": 2036,
      "end_line": 2071,
      "comment": "\r\n     * Creates a bubble chart with default settings.  The chart is composed of\r\n     * an {@link XYPlot}, with a {@link NumberAxis} for the domain axis,\r\n     * a {@link NumberAxis} for the range axis, and an {@link XYBubbleRenderer}\r\n     * to draw the data items.\r\n     *\r\n     * @param title  the chart title (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param xAxisLabel  a label for the X-axis (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param yAxisLabel  a label for the Y-axis (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param dataset  the dataset for the chart (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param orientation  the orientation (horizontal or vertical)\r\n     *                     (\u003ccode\u003enull\u003c/code\u003e NOT permitted).\r\n     * @param legend  a flag specifying whether or not a legend is required.\r\n     * @param tooltips  configure chart to generate tool tips?\r\n     * @param urls  configure chart to generate URLs?\r\n     *\r\n     * @return A bubble chart.\r\n     ",
      "child_ranges": [
        "(line 2045,col 9)-(line 2047,col 9)",
        "(line 2048,col 9)-(line 2048,col 54)",
        "(line 2049,col 9)-(line 2049,col 46)",
        "(line 2050,col 9)-(line 2050,col 54)",
        "(line 2051,col 9)-(line 2051,col 46)",
        "(line 2053,col 9)-(line 2053,col 62)",
        "(line 2055,col 9)-(line 2056,col 54)",
        "(line 2057,col 9)-(line 2059,col 9)",
        "(line 2060,col 9)-(line 2062,col 9)",
        "(line 2063,col 9)-(line 2063,col 35)",
        "(line 2064,col 9)-(line 2064,col 41)",
        "(line 2066,col 9)-(line 2067,col 30)",
        "(line 2068,col 9)-(line 2068,col 34)",
        "(line 2069,col 9)-(line 2069,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartFactory.createHistogram(java.lang.String, java.lang.String, java.lang.String, org.jfree.data.xy.IntervalXYDataset, org.jfree.chart.plot.PlotOrientation, boolean, boolean, boolean)",
      "begin_line": 2090,
      "end_line": 2121,
      "comment": "\r\n     * Creates a histogram chart.  This chart is constructed with an\r\n     * {@link XYPlot} using an {@link XYBarRenderer}.  The domain and range\r\n     * axes are {@link NumberAxis} instances.\r\n     *\r\n     * @param title  the chart title (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param xAxisLabel  the x axis label (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param yAxisLabel  the y axis label (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param orientation  the orientation (horizontal or vertical)\r\n     *                     (\u003ccode\u003enull\u003c/code\u003e NOT permitted).\r\n     * @param legend  create a legend?\r\n     * @param tooltips  display tooltips?\r\n     * @param urls  generate URLs?\r\n     *\r\n     * @return The chart.\r\n     ",
      "child_ranges": [
        "(line 2099,col 9)-(line 2101,col 9)",
        "(line 2102,col 9)-(line 2102,col 54)",
        "(line 2103,col 9)-(line 2103,col 46)",
        "(line 2104,col 9)-(line 2104,col 53)",
        "(line 2106,col 9)-(line 2106,col 54)",
        "(line 2107,col 9)-(line 2109,col 9)",
        "(line 2110,col 9)-(line 2112,col 9)",
        "(line 2114,col 9)-(line 2114,col 66)",
        "(line 2115,col 9)-(line 2115,col 41)",
        "(line 2116,col 9)-(line 2117,col 30)",
        "(line 2118,col 9)-(line 2118,col 34)",
        "(line 2119,col 9)-(line 2119,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartFactory.createBoxAndWhiskerChart(java.lang.String, java.lang.String, java.lang.String, org.jfree.data.statistics.BoxAndWhiskerCategoryDataset, boolean)",
      "begin_line": 2139,
      "end_line": 2156,
      "comment": "\r\n     * Creates and returns a default instance of a box and whisker chart\r\n     * based on data from a {@link BoxAndWhiskerCategoryDataset}.\r\n     *\r\n     * @param title  the chart title (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param categoryAxisLabel  a label for the category axis\r\n     *     (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param valueAxisLabel  a label for the value axis (\u003ccode\u003enull\u003c/code\u003e\r\n     *     permitted).\r\n     * @param dataset  the dataset for the chart (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param legend  a flag specifying whether or not a legend is required.\r\n     *\r\n     * @return A box and whisker chart.\r\n     *\r\n     * @since 1.0.4\r\n     ",
      "child_ranges": [
        "(line 2143,col 9)-(line 2143,col 72)",
        "(line 2144,col 9)-(line 2144,col 62)",
        "(line 2145,col 9)-(line 2145,col 50)",
        "(line 2147,col 9)-(line 2147,col 69)",
        "(line 2148,col 9)-(line 2148,col 78)",
        "(line 2150,col 9)-(line 2151,col 26)",
        "(line 2152,col 9)-(line 2153,col 30)",
        "(line 2154,col 9)-(line 2154,col 34)",
        "(line 2155,col 9)-(line 2155,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartFactory.createBoxAndWhiskerChart(java.lang.String, java.lang.String, java.lang.String, org.jfree.data.statistics.BoxAndWhiskerXYDataset, boolean)",
      "begin_line": 2171,
      "end_line": 2187,
      "comment": "\r\n     * Creates and returns a default instance of a box and whisker chart.\r\n     *\r\n     * @param title  the chart title (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param timeAxisLabel  a label for the time axis (\u003ccode\u003enull\u003c/code\u003e\r\n     *                       permitted).\r\n     * @param valueAxisLabel  a label for the value axis (\u003ccode\u003enull\u003c/code\u003e\r\n     *                        permitted).\r\n     * @param dataset  the dataset for the chart (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param legend  a flag specifying whether or not a legend is required.\r\n     *\r\n     * @return A box and whisker chart.\r\n     ",
      "child_ranges": [
        "(line 2177,col 9)-(line 2177,col 57)",
        "(line 2178,col 9)-(line 2178,col 62)",
        "(line 2179,col 9)-(line 2179,col 50)",
        "(line 2180,col 9)-(line 2180,col 77)",
        "(line 2181,col 9)-(line 2181,col 73)",
        "(line 2182,col 9)-(line 2183,col 30)",
        "(line 2184,col 9)-(line 2184,col 34)",
        "(line 2185,col 9)-(line 2185,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartFactory.createWindPlot(java.lang.String, java.lang.String, java.lang.String, org.jfree.data.xy.WindDataset, boolean, boolean, boolean)",
      "begin_line": 2203,
      "end_line": 2228,
      "comment": "\r\n     * Creates a wind plot with default settings.\r\n     *\r\n     * @param title  the chart title (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param xAxisLabel  a label for the x-axis (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param yAxisLabel  a label for the y-axis (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param dataset  the dataset for the chart (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param legend  a flag that controls whether or not a legend is created.\r\n     * @param tooltips  configure chart to generate tool tips?\r\n     * @param urls  configure chart to generate URLs?\r\n     *\r\n     * @return A wind plot.\r\n     *\r\n     ",
      "child_ranges": [
        "(line 2211,col 9)-(line 2211,col 51)",
        "(line 2212,col 9)-(line 2212,col 53)",
        "(line 2213,col 9)-(line 2213,col 36)",
        "(line 2215,col 9)-(line 2215,col 59)",
        "(line 2216,col 9)-(line 2218,col 9)",
        "(line 2219,col 9)-(line 2221,col 9)",
        "(line 2222,col 9)-(line 2222,col 66)",
        "(line 2223,col 9)-(line 2224,col 30)",
        "(line 2225,col 9)-(line 2225,col 34)",
        "(line 2226,col 9)-(line 2226,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartFactory.createWaferMapChart(java.lang.String, org.jfree.data.general.WaferMapDataset, org.jfree.chart.plot.PlotOrientation, boolean, boolean, boolean)",
      "begin_line": 2243,
      "end_line": 2261,
      "comment": "\r\n     * Creates a wafer map chart.\r\n     *\r\n     * @param title  the chart title (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param orientation  the plot orientation (horizontal or vertical)\r\n     *                     (\u003ccode\u003enull\u003c/code\u003e NOT permitted.\r\n     * @param legend  display a legend?\r\n     * @param tooltips  generate tooltips?\r\n     * @param urls  generate URLs?\r\n     *\r\n     * @return A wafer map chart.\r\n     ",
      "child_ranges": [
        "(line 2250,col 9)-(line 2252,col 9)",
        "(line 2253,col 9)-(line 2253,col 54)",
        "(line 2254,col 9)-(line 2254,col 59)",
        "(line 2255,col 9)-(line 2255,col 35)",
        "(line 2257,col 9)-(line 2258,col 30)",
        "(line 2259,col 9)-(line 2259,col 34)",
        "(line 2260,col 9)-(line 2260,col 21)"
      ]
    }
  ]
}