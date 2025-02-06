{
  "filepath": "/tmp/Chart-16b/source/org/jfree/chart/ChartFactory.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ChartFactory",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 222,
      "end_line": 2186,
      "comment": "\r\n * A collection of utility methods for creating some standard charts with \r\n * JFreeChart.\r\n "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartFactory.createPieChart(java.lang.String, org.jfree.data.general.PieDataset, boolean, boolean, java.util.Locale)",
      "begin_line": 240,
      "end_line": 252,
      "comment": "\r\n     * Creates a pie chart with default settings.\r\n     * \u003cP\u003e\r\n     * The chart object returned by this method uses a {@link PiePlot} instance \r\n     * as the plot.\r\n     *\r\n     * @param title  the chart title (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param dataset  the dataset for the chart (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param legend  a flag specifying whether or not a legend is required.\r\n     * @param tooltips  configure chart to generate tool tips?\r\n     * @param locale  the locale (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return A pie chart.\r\n     * \r\n     * @since 1.0.7\r\n     ",
      "child_ranges": [
        "(line 243,col 9)-(line 243,col 44)",
        "(line 244,col 9)-(line 244,col 77)",
        "(line 245,col 9)-(line 245,col 64)",
        "(line 246,col 9)-(line 248,col 9)",
        "(line 249,col 9)-(line 250,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartFactory.createPieChart(java.lang.String, org.jfree.data.general.PieDataset, boolean, boolean, boolean)",
      "begin_line": 268,
      "end_line": 286,
      "comment": "\r\n     * Creates a pie chart with default settings.\r\n     * \u003cP\u003e\r\n     * The chart object returned by this method uses a {@link PiePlot} instance \r\n     * as the plot.\r\n     *\r\n     * @param title  the chart title (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param dataset  the dataset for the chart (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param legend  a flag specifying whether or not a legend is required.\r\n     * @param tooltips  configure chart to generate tool tips?\r\n     * @param urls  configure chart to generate URLs?\r\n     *\r\n     * @return A pie chart.\r\n     ",
      "child_ranges": [
        "(line 274,col 9)-(line 274,col 44)",
        "(line 275,col 9)-(line 275,col 71)",
        "(line 276,col 9)-(line 276,col 64)",
        "(line 277,col 9)-(line 279,col 9)",
        "(line 280,col 9)-(line 282,col 9)",
        "(line 283,col 9)-(line 284,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartFactory.createPieChart(java.lang.String, org.jfree.data.general.PieDataset, org.jfree.data.general.PieDataset, int, boolean, boolean, boolean, java.util.Locale, boolean, boolean)",
      "begin_line": 328,
      "end_line": 405,
      "comment": "\r\n     * Creates a pie chart with default settings that compares 2 datasets.  \r\n     * The colour of each section will be determined by the move from the value\r\n     * for the same key in \u003ccode\u003epreviousDataset\u003c/code\u003e. ie if value1 \u003e value2 \r\n     * then the section will be in green (unless \u003ccode\u003egreenForIncrease\u003c/code\u003e \r\n     * is \u003ccode\u003efalse\u003c/code\u003e, in which case it would be \u003ccode\u003ered\u003c/code\u003e).  \r\n     * Each section can have a shade of red or green as the difference can be \r\n     * tailored between 0% (black) and percentDiffForMaxScale% (bright \r\n     * red/green).\r\n     * \u003cp\u003e\r\n     * For instance if \u003ccode\u003epercentDiffForMaxScale\u003c/code\u003e is 10 (10%), a \r\n     * difference of 5% will have a half shade of red/green, a difference of \r\n     * 10% or more will have a maximum shade/brightness of red/green.\r\n     * \u003cP\u003e\r\n     * The chart object returned by this method uses a {@link PiePlot} instance\r\n     * as the plot.\r\n     * \u003cp\u003e\r\n     * Written by \u003ca href\u003d\"mailto:opensource@objectlab.co.uk\"\u003eBenoit \r\n     * Xhenseval\u003c/a\u003e.\r\n     *\r\n     * @param title  the chart title (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param dataset  the dataset for the chart (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param previousDataset  the dataset for the last run, this will be used \r\n     *                         to compare each key in the dataset\r\n     * @param percentDiffForMaxScale scale goes from bright red/green to black,\r\n     *                               percentDiffForMaxScale indicate the change \r\n     *                               required to reach top scale.\r\n     * @param greenForIncrease  an increase since previousDataset will be \r\n     *                          displayed in green (decrease red) if true.\r\n     * @param legend  a flag specifying whether or not a legend is required.\r\n     * @param tooltips  configure chart to generate tool tips?\r\n     * @param locale  the locale (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param subTitle displays a subtitle with colour scheme if true\r\n     * @param showDifference  create a new dataset that will show the % \r\n     *                        difference between the two datasets. \r\n     *\r\n     * @return A pie chart.\r\n     * \r\n     * @since 1.0.7\r\n     ",
      "child_ranges": [
        "(line 333,col 9)-(line 333,col 44)",
        "(line 334,col 9)-(line 334,col 77)",
        "(line 335,col 9)-(line 335,col 64)",
        "(line 337,col 9)-(line 339,col 9)",
        "(line 341,col 9)-(line 341,col 38)",
        "(line 342,col 9)-(line 342,col 40)",
        "(line 343,col 9)-(line 345,col 9)",
        "(line 347,col 9)-(line 347,col 64)",
        "(line 348,col 9)-(line 385,col 9)",
        "(line 387,col 9)-(line 389,col 9)",
        "(line 391,col 9)-(line 392,col 61)",
        "(line 394,col 9)-(line 402,col 9)",
        "(line 404,col 9)-(line 404,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartFactory.createPieChart(java.lang.String, org.jfree.data.general.PieDataset, org.jfree.data.general.PieDataset, int, boolean, boolean, boolean, boolean, boolean, boolean)",
      "begin_line": 445,
      "end_line": 531,
      "comment": "\r\n     * Creates a pie chart with default settings that compares 2 datasets.  \r\n     * The colour of each section will be determined by the move from the value\r\n     * for the same key in \u003ccode\u003epreviousDataset\u003c/code\u003e. ie if value1 \u003e value2 \r\n     * then the section will be in green (unless \u003ccode\u003egreenForIncrease\u003c/code\u003e \r\n     * is \u003ccode\u003efalse\u003c/code\u003e, in which case it would be \u003ccode\u003ered\u003c/code\u003e).  \r\n     * Each section can have a shade of red or green as the difference can be \r\n     * tailored between 0% (black) and percentDiffForMaxScale% (bright \r\n     * red/green).\r\n     * \u003cp\u003e\r\n     * For instance if \u003ccode\u003epercentDiffForMaxScale\u003c/code\u003e is 10 (10%), a \r\n     * difference of 5% will have a half shade of red/green, a difference of \r\n     * 10% or more will have a maximum shade/brightness of red/green.\r\n     * \u003cP\u003e\r\n     * The chart object returned by this method uses a {@link PiePlot} instance\r\n     * as the plot.\r\n     * \u003cp\u003e\r\n     * Written by \u003ca href\u003d\"mailto:opensource@objectlab.co.uk\"\u003eBenoit \r\n     * Xhenseval\u003c/a\u003e.\r\n     *\r\n     * @param title  the chart title (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param dataset  the dataset for the chart (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param previousDataset  the dataset for the last run, this will be used \r\n     *                         to compare each key in the dataset\r\n     * @param percentDiffForMaxScale scale goes from bright red/green to black,\r\n     *                               percentDiffForMaxScale indicate the change \r\n     *                               required to reach top scale.\r\n     * @param greenForIncrease  an increase since previousDataset will be \r\n     *                          displayed in green (decrease red) if true.\r\n     * @param legend  a flag specifying whether or not a legend is required.\r\n     * @param tooltips  configure chart to generate tool tips?\r\n     * @param urls  configure chart to generate URLs?\r\n     * @param subTitle displays a subtitle with colour scheme if true\r\n     * @param showDifference  create a new dataset that will show the % \r\n     *                        difference between the two datasets. \r\n     *\r\n     * @return A pie chart.\r\n     ",
      "child_ranges": [
        "(line 456,col 9)-(line 456,col 44)",
        "(line 457,col 9)-(line 457,col 71)",
        "(line 458,col 9)-(line 458,col 64)",
        "(line 460,col 9)-(line 462,col 9)",
        "(line 463,col 9)-(line 465,col 9)",
        "(line 467,col 9)-(line 467,col 38)",
        "(line 468,col 9)-(line 468,col 40)",
        "(line 469,col 9)-(line 471,col 9)",
        "(line 473,col 9)-(line 473,col 64)",
        "(line 474,col 9)-(line 511,col 9)",
        "(line 513,col 9)-(line 515,col 9)",
        "(line 517,col 9)-(line 518,col 61)",
        "(line 520,col 9)-(line 528,col 9)",
        "(line 530,col 9)-(line 530,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartFactory.createRingChart(java.lang.String, org.jfree.data.general.PieDataset, boolean, boolean, java.util.Locale)",
      "begin_line": 549,
      "end_line": 561,
      "comment": "\r\n     * Creates a ring chart with default settings.\r\n     * \u003cP\u003e\r\n     * The chart object returned by this method uses a {@link RingPlot} \r\n     * instance as the plot.\r\n     *\r\n     * @param title  the chart title (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param dataset  the dataset for the chart (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param legend  a flag specifying whether or not a legend is required.\r\n     * @param tooltips  configure chart to generate tool tips?\r\n     * @param locale  the locale (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return A ring chart.\r\n     * \r\n     * @since 1.0.7\r\n     ",
      "child_ranges": [
        "(line 552,col 9)-(line 552,col 46)",
        "(line 553,col 9)-(line 553,col 77)",
        "(line 554,col 9)-(line 554,col 64)",
        "(line 555,col 9)-(line 557,col 9)",
        "(line 558,col 9)-(line 559,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartFactory.createRingChart(java.lang.String, org.jfree.data.general.PieDataset, boolean, boolean, boolean)",
      "begin_line": 577,
      "end_line": 595,
      "comment": "\r\n     * Creates a ring chart with default settings.\r\n     * \u003cP\u003e\r\n     * The chart object returned by this method uses a {@link RingPlot} \r\n     * instance as the plot.\r\n     *\r\n     * @param title  the chart title (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param dataset  the dataset for the chart (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param legend  a flag specifying whether or not a legend is required.\r\n     * @param tooltips  configure chart to generate tool tips?\r\n     * @param urls  configure chart to generate URLs?\r\n     *\r\n     * @return A ring chart.\r\n     ",
      "child_ranges": [
        "(line 583,col 9)-(line 583,col 46)",
        "(line 584,col 9)-(line 584,col 71)",
        "(line 585,col 9)-(line 585,col 64)",
        "(line 586,col 9)-(line 588,col 9)",
        "(line 589,col 9)-(line 591,col 9)",
        "(line 592,col 9)-(line 593,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartFactory.createMultiplePieChart(java.lang.String, org.jfree.data.category.CategoryDataset, org.jfree.chart.util.TableOrder, boolean, boolean, boolean)",
      "begin_line": 612,
      "end_line": 645,
      "comment": "\r\n     * Creates a chart that displays multiple pie plots.  The chart object \r\n     * returned by this method uses a {@link MultiplePiePlot} instance as the\r\n     * plot.\r\n     *\r\n     * @param title  the chart title (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param order  the order that the data is extracted (by row or by column)\r\n     *               (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param legend  include a legend?\r\n     * @param tooltips  generate tooltips?\r\n     * @param urls  generate URLs?\r\n     *\r\n     * @return A chart.\r\n     ",
      "child_ranges": [
        "(line 619,col 9)-(line 621,col 9)",
        "(line 622,col 9)-(line 622,col 60)",
        "(line 623,col 9)-(line 623,col 40)",
        "(line 624,col 9)-(line 624,col 38)",
        "(line 625,col 9)-(line 625,col 36)",
        "(line 627,col 9)-(line 632,col 9)",
        "(line 634,col 9)-(line 638,col 9)",
        "(line 640,col 9)-(line 641,col 30)",
        "(line 643,col 9)-(line 643,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartFactory.createPieChart3D(java.lang.String, org.jfree.data.general.PieDataset, boolean, boolean, java.util.Locale)",
      "begin_line": 662,
      "end_line": 673,
      "comment": "\r\n     * Creates a 3D pie chart using the specified dataset.  The chart object \r\n     * returned by this method uses a {@link PiePlot3D} instance as the\r\n     * plot.\r\n     *\r\n     * @param title  the chart title (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param dataset  the dataset for the chart (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param legend  a flag specifying whether or not a legend is required.\r\n     * @param tooltips  configure chart to generate tool tips?\r\n     * @param locale  the locale (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return A pie chart.\r\n     * \r\n     * @since 1.0.7\r\n     ",
      "child_ranges": [
        "(line 665,col 9)-(line 665,col 48)",
        "(line 666,col 9)-(line 666,col 64)",
        "(line 667,col 9)-(line 669,col 9)",
        "(line 670,col 9)-(line 671,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartFactory.createPieChart3D(java.lang.String, org.jfree.data.general.PieDataset, boolean, boolean, boolean)",
      "begin_line": 688,
      "end_line": 705,
      "comment": "\r\n     * Creates a 3D pie chart using the specified dataset.  The chart object \r\n     * returned by this method uses a {@link PiePlot3D} instance as the\r\n     * plot.\r\n     *\r\n     * @param title  the chart title (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param dataset  the dataset for the chart (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param legend  a flag specifying whether or not a legend is required.\r\n     * @param tooltips  configure chart to generate tool tips?\r\n     * @param urls  configure chart to generate URLs?\r\n     *\r\n     * @return A pie chart.\r\n     ",
      "child_ranges": [
        "(line 694,col 9)-(line 694,col 48)",
        "(line 695,col 9)-(line 695,col 64)",
        "(line 696,col 9)-(line 698,col 9)",
        "(line 699,col 9)-(line 701,col 9)",
        "(line 702,col 9)-(line 703,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartFactory.createMultiplePieChart3D(java.lang.String, org.jfree.data.category.CategoryDataset, org.jfree.chart.util.TableOrder, boolean, boolean, boolean)",
      "begin_line": 722,
      "end_line": 764,
      "comment": "\r\n     * Creates a chart that displays multiple pie plots.  The chart object \r\n     * returned by this method uses a {@link MultiplePiePlot} instance as the\r\n     * plot.\r\n     *\r\n     * @param title  the chart title (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param order  the order that the data is extracted (by row or by column) \r\n     *               (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param legend  include a legend?\r\n     * @param tooltips  generate tooltips?\r\n     * @param urls  generate URLs?\r\n     *\r\n     * @return A chart.\r\n     ",
      "child_ranges": [
        "(line 729,col 9)-(line 731,col 9)",
        "(line 732,col 9)-(line 732,col 60)",
        "(line 733,col 9)-(line 733,col 40)",
        "(line 734,col 9)-(line 734,col 38)",
        "(line 735,col 9)-(line 735,col 36)",
        "(line 737,col 9)-(line 737,col 66)",
        "(line 738,col 9)-(line 739,col 54)",
        "(line 740,col 9)-(line 740,col 54)",
        "(line 741,col 9)-(line 741,col 39)",
        "(line 742,col 9)-(line 742,col 32)",
        "(line 743,col 9)-(line 743,col 42)",
        "(line 744,col 9)-(line 744,col 35)",
        "(line 746,col 9)-(line 751,col 9)",
        "(line 753,col 9)-(line 757,col 9)",
        "(line 759,col 9)-(line 760,col 30)",
        "(line 762,col 9)-(line 762,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartFactory.createBarChart(java.lang.String, java.lang.String, java.lang.String, org.jfree.data.category.CategoryDataset, org.jfree.chart.plot.PlotOrientation, boolean, boolean, boolean)",
      "begin_line": 786,
      "end_line": 834,
      "comment": "\r\n     * Creates a bar chart.  The chart object returned by this method uses a \r\n     * {@link CategoryPlot} instance as the plot, with a {@link CategoryAxis} \r\n     * for the domain axis, a {@link NumberAxis} as the range axis, and a \r\n     * {@link BarRenderer} as the renderer.\r\n     *\r\n     * @param title  the chart title (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param categoryAxisLabel  the label for the category axis \r\n     *                           (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param valueAxisLabel  the label for the value axis \r\n     *                        (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param dataset  the dataset for the chart (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param orientation  the plot orientation (horizontal or vertical) \r\n     *                     (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param legend  a flag specifying whether or not a legend is required.\r\n     * @param tooltips  configure chart to generate tool tips?\r\n     * @param urls  configure chart to generate URLs?\r\n     *\r\n     * @return A bar chart.\r\n     ",
      "child_ranges": [
        "(line 795,col 9)-(line 797,col 9)",
        "(line 798,col 9)-(line 798,col 72)",
        "(line 799,col 9)-(line 799,col 61)",
        "(line 801,col 9)-(line 801,col 49)",
        "(line 802,col 9)-(line 817,col 9)",
        "(line 818,col 9)-(line 821,col 9)",
        "(line 822,col 9)-(line 824,col 9)",
        "(line 826,col 9)-(line 827,col 26)",
        "(line 828,col 9)-(line 828,col 41)",
        "(line 829,col 9)-(line 830,col 30)",
        "(line 832,col 9)-(line 832,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartFactory.createStackedBarChart(java.lang.String, java.lang.String, java.lang.String, org.jfree.data.category.CategoryDataset, org.jfree.chart.plot.PlotOrientation, boolean, boolean, boolean)",
      "begin_line": 857,
      "end_line": 890,
      "comment": "\r\n     * Creates a stacked bar chart with default settings.  The chart object \r\n     * returned by this method uses a {@link CategoryPlot} instance as the\r\n     * plot, with a {@link CategoryAxis} for the domain axis, a \r\n     * {@link NumberAxis} as the range axis, and a {@link StackedBarRenderer} \r\n     * as the renderer.\r\n     *\r\n     * @param title  the chart title (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param domainAxisLabel  the label for the category axis \r\n     *                         (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param rangeAxisLabel  the label for the value axis \r\n     *                        (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param dataset  the dataset for the chart (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param orientation  the orientation of the chart (horizontal or \r\n     *                     vertical) (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param legend  a flag specifying whether or not a legend is required.\r\n     * @param tooltips  configure chart to generate tool tips?\r\n     * @param urls  configure chart to generate URLs?\r\n     *\r\n     * @return A stacked bar chart.\r\n     ",
      "child_ranges": [
        "(line 866,col 9)-(line 868,col 9)",
        "(line 870,col 9)-(line 870,col 70)",
        "(line 871,col 9)-(line 871,col 61)",
        "(line 873,col 9)-(line 873,col 63)",
        "(line 874,col 9)-(line 877,col 9)",
        "(line 878,col 9)-(line 880,col 9)",
        "(line 882,col 9)-(line 883,col 26)",
        "(line 884,col 9)-(line 884,col 41)",
        "(line 885,col 9)-(line 886,col 30)",
        "(line 888,col 9)-(line 888,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartFactory.createBarChart3D(java.lang.String, java.lang.String, java.lang.String, org.jfree.data.category.CategoryDataset, org.jfree.chart.plot.PlotOrientation, boolean, boolean, boolean)",
      "begin_line": 912,
      "end_line": 952,
      "comment": "\r\n     * Creates a bar chart with a 3D effect. The chart object returned by this \r\n     * method uses a {@link CategoryPlot} instance as the plot, with a \r\n     * {@link CategoryAxis3D} for the domain axis, a {@link NumberAxis3D} as \r\n     * the range axis, and a {@link BarRenderer3D} as the renderer.\r\n     *\r\n     * @param title  the chart title (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param categoryAxisLabel  the label for the category axis \r\n     *                           (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param valueAxisLabel  the label for the value axis (\u003ccode\u003enull\u003c/code\u003e \r\n     *                        permitted).\r\n     * @param dataset  the dataset for the chart (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param orientation  the plot orientation (horizontal or vertical) \r\n     *                     (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param legend  a flag specifying whether or not a legend is required.\r\n     * @param tooltips  configure chart to generate tool tips?\r\n     * @param urls  configure chart to generate URLs?\r\n     *\r\n     * @return A bar chart with a 3D effect.\r\n     ",
      "child_ranges": [
        "(line 921,col 9)-(line 923,col 9)",
        "(line 924,col 9)-(line 924,col 74)",
        "(line 925,col 9)-(line 925,col 63)",
        "(line 927,col 9)-(line 927,col 53)",
        "(line 928,col 9)-(line 931,col 9)",
        "(line 932,col 9)-(line 934,col 9)",
        "(line 936,col 9)-(line 937,col 26)",
        "(line 938,col 9)-(line 938,col 41)",
        "(line 939,col 9)-(line 944,col 9)",
        "(line 945,col 9)-(line 945,col 39)",
        "(line 947,col 9)-(line 948,col 30)",
        "(line 950,col 9)-(line 950,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartFactory.createStackedBarChart3D(java.lang.String, java.lang.String, java.lang.String, org.jfree.data.category.CategoryDataset, org.jfree.chart.plot.PlotOrientation, boolean, boolean, boolean)",
      "begin_line": 975,
      "end_line": 1016,
      "comment": "\r\n     * Creates a stacked bar chart with a 3D effect and default settings. The \r\n     * chart object returned by this method uses a {@link CategoryPlot} \r\n     * instance as the plot, with a {@link CategoryAxis3D} for the domain axis, \r\n     * a {@link NumberAxis3D} as the range axis, and a \r\n     * {@link StackedBarRenderer3D} as the renderer.\r\n     *\r\n     * @param title  the chart title (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param categoryAxisLabel  the label for the category axis \r\n     *                           (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param valueAxisLabel  the label for the value axis (\u003ccode\u003enull\u003c/code\u003e \r\n     *                        permitted).\r\n     * @param dataset  the dataset for the chart (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param orientation  the orientation (horizontal or vertical) \r\n     *                     (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param legend  a flag specifying whether or not a legend is required.\r\n     * @param tooltips  configure chart to generate tool tips?\r\n     * @param urls  configure chart to generate URLs?\r\n     *\r\n     * @return A stacked bar chart with a 3D effect.\r\n     ",
      "child_ranges": [
        "(line 984,col 9)-(line 986,col 9)",
        "(line 987,col 9)-(line 987,col 74)",
        "(line 988,col 9)-(line 988,col 63)",
        "(line 991,col 9)-(line 991,col 67)",
        "(line 992,col 9)-(line 995,col 9)",
        "(line 996,col 9)-(line 998,col 9)",
        "(line 1001,col 9)-(line 1002,col 26)",
        "(line 1003,col 9)-(line 1003,col 41)",
        "(line 1004,col 9)-(line 1008,col 9)",
        "(line 1011,col 9)-(line 1012,col 30)",
        "(line 1014,col 9)-(line 1014,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartFactory.createAreaChart(java.lang.String, java.lang.String, java.lang.String, org.jfree.data.category.CategoryDataset, org.jfree.chart.plot.PlotOrientation, boolean, boolean, boolean)",
      "begin_line": 1038,
      "end_line": 1072,
      "comment": "\r\n     * Creates an area chart with default settings.  The chart object returned\r\n     * by this method uses a {@link CategoryPlot} instance as the plot, with a \r\n     * {@link CategoryAxis} for the domain axis, a {@link NumberAxis} as the\r\n     * range axis, and an {@link AreaRenderer} as the renderer.\r\n     *\r\n     * @param title  the chart title (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param categoryAxisLabel  the label for the category axis \r\n     *                           (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param valueAxisLabel  the label for the value axis (\u003ccode\u003enull\u003c/code\u003e \r\n     *                        permitted).\r\n     * @param dataset  the dataset for the chart (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param orientation  the plot orientation (\u003ccode\u003enull\u003c/code\u003e not \r\n     *                     permitted).\r\n     * @param legend  a flag specifying whether or not a legend is required.\r\n     * @param tooltips  configure chart to generate tool tips?\r\n     * @param urls  configure chart to generate URLs?\r\n     *\r\n     * @return An area chart.\r\n     ",
      "child_ranges": [
        "(line 1047,col 9)-(line 1049,col 9)",
        "(line 1050,col 9)-(line 1050,col 72)",
        "(line 1051,col 9)-(line 1051,col 44)",
        "(line 1053,col 9)-(line 1053,col 61)",
        "(line 1055,col 9)-(line 1055,col 51)",
        "(line 1056,col 9)-(line 1059,col 9)",
        "(line 1060,col 9)-(line 1062,col 9)",
        "(line 1064,col 9)-(line 1065,col 26)",
        "(line 1066,col 9)-(line 1066,col 41)",
        "(line 1067,col 9)-(line 1068,col 30)",
        "(line 1070,col 9)-(line 1070,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartFactory.createStackedAreaChart(java.lang.String, java.lang.String, java.lang.String, org.jfree.data.category.CategoryDataset, org.jfree.chart.plot.PlotOrientation, boolean, boolean, boolean)",
      "begin_line": 1095,
      "end_line": 1127,
      "comment": "\r\n     * Creates a stacked area chart with default settings.  The chart object \r\n     * returned by this method uses a {@link CategoryPlot} instance as the\r\n     * plot, with a {@link CategoryAxis} for the domain axis, a \r\n     * {@link NumberAxis} as the range axis, and a {@link StackedAreaRenderer} \r\n     * as the renderer.\r\n     *\r\n     * @param title  the chart title (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param categoryAxisLabel  the label for the category axis \r\n     *                           (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param valueAxisLabel  the label for the value axis (\u003ccode\u003enull\u003c/code\u003e \r\n     *                        permitted).\r\n     * @param dataset  the dataset for the chart (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param orientation  the plot orientation (horizontal or vertical) \r\n     *                     (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param legend  a flag specifying whether or not a legend is required.\r\n     * @param tooltips  configure chart to generate tool tips?\r\n     * @param urls  configure chart to generate URLs?\r\n     *\r\n     * @return A stacked area chart.\r\n     ",
      "child_ranges": [
        "(line 1104,col 9)-(line 1106,col 9)",
        "(line 1107,col 9)-(line 1107,col 72)",
        "(line 1108,col 9)-(line 1108,col 61)",
        "(line 1110,col 9)-(line 1110,col 65)",
        "(line 1111,col 9)-(line 1114,col 9)",
        "(line 1115,col 9)-(line 1117,col 9)",
        "(line 1119,col 9)-(line 1120,col 26)",
        "(line 1121,col 9)-(line 1121,col 41)",
        "(line 1122,col 9)-(line 1123,col 30)",
        "(line 1125,col 9)-(line 1125,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartFactory.createLineChart(java.lang.String, java.lang.String, java.lang.String, org.jfree.data.category.CategoryDataset, org.jfree.chart.plot.PlotOrientation, boolean, boolean, boolean)",
      "begin_line": 1149,
      "end_line": 1180,
      "comment": "\r\n     * Creates a line chart with default settings.  The chart object returned \r\n     * by this method uses a {@link CategoryPlot} instance as the plot, with a \r\n     * {@link CategoryAxis} for the domain axis, a {@link NumberAxis} as the \r\n     * range axis, and a {@link LineAndShapeRenderer} as the renderer.\r\n     *\r\n     * @param title  the chart title (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param categoryAxisLabel  the label for the category axis \r\n     *                           (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param valueAxisLabel  the label for the value axis (\u003ccode\u003enull\u003c/code\u003e \r\n     *                        permitted).\r\n     * @param dataset  the dataset for the chart (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param orientation  the chart orientation (horizontal or vertical) \r\n     *                     (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param legend  a flag specifying whether or not a legend is required.\r\n     * @param tooltips  configure chart to generate tool tips?\r\n     * @param urls  configure chart to generate URLs?\r\n     *\r\n     * @return A line chart.\r\n     ",
      "child_ranges": [
        "(line 1158,col 9)-(line 1160,col 9)",
        "(line 1161,col 9)-(line 1161,col 72)",
        "(line 1162,col 9)-(line 1162,col 61)",
        "(line 1164,col 9)-(line 1164,col 78)",
        "(line 1165,col 9)-(line 1168,col 9)",
        "(line 1169,col 9)-(line 1171,col 9)",
        "(line 1172,col 9)-(line 1173,col 26)",
        "(line 1174,col 9)-(line 1174,col 41)",
        "(line 1175,col 9)-(line 1176,col 30)",
        "(line 1178,col 9)-(line 1178,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartFactory.createLineChart3D(java.lang.String, java.lang.String, java.lang.String, org.jfree.data.category.CategoryDataset, org.jfree.chart.plot.PlotOrientation, boolean, boolean, boolean)",
      "begin_line": 1202,
      "end_line": 1233,
      "comment": "\r\n     * Creates a line chart with default settings. The chart object returned by \r\n     * this method uses a {@link CategoryPlot} instance as the plot, with a \r\n     * {@link CategoryAxis3D} for the domain axis, a {@link NumberAxis3D} as \r\n     * the range axis, and a {@link LineRenderer3D} as the renderer.\r\n     *\r\n     * @param title  the chart title (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param categoryAxisLabel  the label for the category axis \r\n     *                           (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param valueAxisLabel  the label for the value axis (\u003ccode\u003enull\u003c/code\u003e \r\n     *                        permitted).\r\n     * @param dataset  the dataset for the chart (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param orientation  the chart orientation (horizontal or vertical) \r\n     *                     (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param legend  a flag specifying whether or not a legend is required.\r\n     * @param tooltips  configure chart to generate tool tips?\r\n     * @param urls  configure chart to generate URLs?\r\n     *\r\n     * @return A line chart.\r\n     ",
      "child_ranges": [
        "(line 1211,col 9)-(line 1213,col 9)",
        "(line 1214,col 9)-(line 1214,col 74)",
        "(line 1215,col 9)-(line 1215,col 63)",
        "(line 1217,col 9)-(line 1217,col 55)",
        "(line 1218,col 9)-(line 1221,col 9)",
        "(line 1222,col 9)-(line 1224,col 9)",
        "(line 1225,col 9)-(line 1226,col 26)",
        "(line 1227,col 9)-(line 1227,col 41)",
        "(line 1228,col 9)-(line 1229,col 30)",
        "(line 1231,col 9)-(line 1231,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartFactory.createGanttChart(java.lang.String, java.lang.String, java.lang.String, org.jfree.data.category.IntervalCategoryDataset, boolean, boolean, boolean)",
      "begin_line": 1254,
      "end_line": 1283,
      "comment": "\r\n     * Creates a Gantt chart using the supplied attributes plus default values \r\n     * where required.  The chart object returned by this method uses a \r\n     * {@link CategoryPlot} instance as the plot, with a {@link CategoryAxis} \r\n     * for the domain axis, a {@link DateAxis} as the range axis, and a \r\n     * {@link GanttRenderer} as the renderer.\r\n     *\r\n     * @param title  the chart title (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param categoryAxisLabel  the label for the category axis \r\n     *                           (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param dateAxisLabel  the label for the date axis \r\n     *                       (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param dataset  the dataset for the chart (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param legend  a flag specifying whether or not a legend is required.\r\n     * @param tooltips  configure chart to generate tool tips?\r\n     * @param urls  configure chart to generate URLs?\r\n     *\r\n     * @return A Gantt chart.\r\n     ",
      "child_ranges": [
        "(line 1262,col 9)-(line 1262,col 72)",
        "(line 1263,col 9)-(line 1263,col 56)",
        "(line 1265,col 9)-(line 1265,col 60)",
        "(line 1266,col 9)-(line 1270,col 9)",
        "(line 1271,col 9)-(line 1273,col 9)",
        "(line 1275,col 9)-(line 1276,col 26)",
        "(line 1277,col 9)-(line 1277,col 56)",
        "(line 1278,col 9)-(line 1279,col 30)",
        "(line 1281,col 9)-(line 1281,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartFactory.createWaterfallChart(java.lang.String, java.lang.String, java.lang.String, org.jfree.data.category.CategoryDataset, org.jfree.chart.plot.PlotOrientation, boolean, boolean, boolean)",
      "begin_line": 1305,
      "end_line": 1358,
      "comment": "\r\n     * Creates a waterfall chart.  The chart object returned by this method \r\n     * uses a {@link CategoryPlot} instance as the plot, with a \r\n     * {@link CategoryAxis} for the domain axis, a {@link NumberAxis} as the\r\n     * range axis, and a {@link WaterfallBarRenderer} as the renderer.\r\n     *\r\n     * @param title  the chart title (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param categoryAxisLabel  the label for the category axis \r\n     *                           (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param valueAxisLabel  the label for the value axis (\u003ccode\u003enull\u003c/code\u003e \r\n     *                        permitted).\r\n     * @param dataset  the dataset for the chart (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param orientation  the plot orientation (horizontal or vertical) \r\n     *                     (\u003ccode\u003enull\u003c/code\u003e NOT permitted).\r\n     * @param legend  a flag specifying whether or not a legend is required.\r\n     * @param tooltips  configure chart to generate tool tips?\r\n     * @param urls  configure chart to generate URLs?\r\n     *\r\n     * @return A waterfall chart.\r\n     ",
      "child_ranges": [
        "(line 1314,col 9)-(line 1316,col 9)",
        "(line 1317,col 9)-(line 1317,col 72)",
        "(line 1318,col 9)-(line 1318,col 44)",
        "(line 1320,col 9)-(line 1320,col 61)",
        "(line 1322,col 9)-(line 1322,col 67)",
        "(line 1323,col 9)-(line 1336,col 9)",
        "(line 1337,col 9)-(line 1341,col 9)",
        "(line 1342,col 9)-(line 1344,col 9)",
        "(line 1346,col 9)-(line 1347,col 26)",
        "(line 1348,col 9)-(line 1348,col 33)",
        "(line 1349,col 9)-(line 1349,col 47)",
        "(line 1350,col 9)-(line 1350,col 39)",
        "(line 1351,col 9)-(line 1351,col 56)",
        "(line 1352,col 9)-(line 1352,col 41)",
        "(line 1353,col 9)-(line 1354,col 30)",
        "(line 1356,col 9)-(line 1356,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartFactory.createPolarChart(java.lang.String, org.jfree.data.xy.XYDataset, boolean, boolean, boolean)",
      "begin_line": 1374,
      "end_line": 1392,
      "comment": "\r\n     * Creates a polar plot for the specified dataset (x-values interpreted as \r\n     * angles in degrees).  The chart object returned by this method uses a \r\n     * {@link PolarPlot} instance as the plot, with a {@link NumberAxis} for \r\n     * the radial axis.\r\n     *\r\n     * @param title  the chart title (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param legend  legend required?\r\n     * @param tooltips  tooltips required?\r\n     * @param urls  URLs required?\r\n     *\r\n     * @return A chart.\r\n     ",
      "child_ranges": [
        "(line 1380,col 9)-(line 1380,col 41)",
        "(line 1381,col 9)-(line 1381,col 33)",
        "(line 1382,col 9)-(line 1382,col 48)",
        "(line 1383,col 9)-(line 1383,col 44)",
        "(line 1384,col 9)-(line 1384,col 45)",
        "(line 1385,col 9)-(line 1385,col 78)",
        "(line 1386,col 9)-(line 1386,col 32)",
        "(line 1387,col 9)-(line 1387,col 57)",
        "(line 1388,col 9)-(line 1389,col 68)",
        "(line 1390,col 9)-(line 1390,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartFactory.createScatterPlot(java.lang.String, java.lang.String, java.lang.String, org.jfree.data.xy.XYDataset, org.jfree.chart.plot.PlotOrientation, boolean, boolean, boolean)",
      "begin_line": 1413,
      "end_line": 1446,
      "comment": "\r\n     * Creates a scatter plot with default settings.  The chart object \r\n     * returned by this method uses an {@link XYPlot} instance as the plot, \r\n     * with a {@link NumberAxis} for the domain axis, a  {@link NumberAxis} \r\n     * as the range axis, and an {@link XYLineAndShapeRenderer} as the \r\n     * renderer.\r\n     *\r\n     * @param title  the chart title (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param xAxisLabel  a label for the X-axis (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param yAxisLabel  a label for the Y-axis (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param dataset  the dataset for the chart (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param orientation  the plot orientation (horizontal or vertical) \r\n     *                     (\u003ccode\u003enull\u003c/code\u003e NOT permitted).\r\n     * @param legend  a flag specifying whether or not a legend is required.\r\n     * @param tooltips  configure chart to generate tool tips?\r\n     * @param urls  configure chart to generate URLs?\r\n     *\r\n     * @return A scatter plot.\r\n     ",
      "child_ranges": [
        "(line 1417,col 9)-(line 1419,col 9)",
        "(line 1420,col 9)-(line 1420,col 54)",
        "(line 1421,col 9)-(line 1421,col 46)",
        "(line 1422,col 9)-(line 1422,col 54)",
        "(line 1423,col 9)-(line 1423,col 46)",
        "(line 1425,col 9)-(line 1425,col 62)",
        "(line 1427,col 9)-(line 1427,col 51)",
        "(line 1428,col 9)-(line 1430,col 9)",
        "(line 1432,col 9)-(line 1432,col 43)",
        "(line 1433,col 9)-(line 1435,col 9)",
        "(line 1436,col 9)-(line 1436,col 74)",
        "(line 1437,col 9)-(line 1437,col 59)",
        "(line 1438,col 9)-(line 1438,col 51)",
        "(line 1439,col 9)-(line 1439,col 35)",
        "(line 1440,col 9)-(line 1440,col 41)",
        "(line 1442,col 9)-(line 1443,col 30)",
        "(line 1444,col 9)-(line 1444,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartFactory.createXYBarChart(java.lang.String, java.lang.String, boolean, java.lang.String, org.jfree.data.xy.IntervalXYDataset, org.jfree.chart.plot.PlotOrientation, boolean, boolean, boolean)",
      "begin_line": 1469,
      "end_line": 1516,
      "comment": "\r\n     * Creates and returns a default instance of an XY bar chart.\r\n     * \u003cP\u003e\r\n     * The chart object returned by this method uses an {@link XYPlot} instance\r\n     * as the plot, with a {@link DateAxis} for the domain axis, a \r\n     * {@link NumberAxis} as the range axis, and a {@link XYBarRenderer} as the \r\n     * renderer.\r\n     *\r\n     * @param title  the chart title (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param xAxisLabel  a label for the X-axis (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param dateAxis  make the domain axis display dates?\r\n     * @param yAxisLabel  a label for the Y-axis (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param dataset  the dataset for the chart (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param orientation  the orientation (horizontal or vertical) \r\n     *                     (\u003ccode\u003enull\u003c/code\u003e NOT permitted).\r\n     * @param legend  a flag specifying whether or not a legend is required.\r\n     * @param tooltips  configure chart to generate tool tips?\r\n     * @param urls  configure chart to generate URLs?\r\n     *\r\n     * @return An XY bar chart.\r\n     ",
      "child_ranges": [
        "(line 1479,col 9)-(line 1481,col 9)",
        "(line 1482,col 9)-(line 1482,col 36)",
        "(line 1483,col 9)-(line 1490,col 9)",
        "(line 1491,col 9)-(line 1491,col 57)",
        "(line 1493,col 9)-(line 1493,col 53)",
        "(line 1494,col 9)-(line 1503,col 9)",
        "(line 1504,col 9)-(line 1506,col 9)",
        "(line 1508,col 9)-(line 1508,col 75)",
        "(line 1509,col 9)-(line 1509,col 41)",
        "(line 1511,col 9)-(line 1512,col 30)",
        "(line 1514,col 9)-(line 1514,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartFactory.createXYAreaChart(java.lang.String, java.lang.String, java.lang.String, org.jfree.data.xy.XYDataset, org.jfree.chart.plot.PlotOrientation, boolean, boolean, boolean)",
      "begin_line": 1538,
      "end_line": 1575,
      "comment": "\r\n     * Creates an area chart using an {@link XYDataset}.\r\n     * \u003cP\u003e\r\n     * The chart object returned by this method uses an {@link XYPlot} instance \r\n     * as the plot, with a {@link NumberAxis} for the domain axis, a \r\n     * {@link NumberAxis} as the range axis, and a {@link XYAreaRenderer} as \r\n     * the renderer.\r\n     *\r\n     * @param title  the chart title (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param xAxisLabel  a label for the X-axis (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param yAxisLabel  a label for the Y-axis (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param dataset  the dataset for the chart (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param orientation  the plot orientation (horizontal or vertical) \r\n     *                     (\u003ccode\u003enull\u003c/code\u003e NOT permitted).\r\n     * @param legend  a flag specifying whether or not a legend is required.\r\n     * @param tooltips  configure chart to generate tool tips?\r\n     * @param urls  configure chart to generate URLs?\r\n     *\r\n     * @return An XY area chart.\r\n     ",
      "child_ranges": [
        "(line 1547,col 9)-(line 1549,col 9)",
        "(line 1550,col 9)-(line 1550,col 54)",
        "(line 1551,col 9)-(line 1551,col 46)",
        "(line 1552,col 9)-(line 1552,col 54)",
        "(line 1553,col 9)-(line 1553,col 62)",
        "(line 1554,col 9)-(line 1554,col 41)",
        "(line 1555,col 9)-(line 1555,col 38)",
        "(line 1557,col 9)-(line 1557,col 47)",
        "(line 1558,col 9)-(line 1560,col 9)",
        "(line 1562,col 9)-(line 1562,col 43)",
        "(line 1563,col 9)-(line 1565,col 9)",
        "(line 1567,col 9)-(line 1569,col 10)",
        "(line 1570,col 9)-(line 1571,col 30)",
        "(line 1573,col 9)-(line 1573,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartFactory.createStackedXYAreaChart(java.lang.String, java.lang.String, java.lang.String, org.jfree.data.xy.TableXYDataset, org.jfree.chart.plot.PlotOrientation, boolean, boolean, boolean)",
      "begin_line": 1595,
      "end_line": 1633,
      "comment": "\r\n     * Creates a stacked XY area plot.  The chart object returned by this \r\n     * method uses an {@link XYPlot} instance as the plot, with a \r\n     * {@link NumberAxis} for the domain axis, a {@link NumberAxis} as the\r\n     * range axis, and a {@link StackedXYAreaRenderer2} as the renderer.\r\n     *\r\n     * @param title  the chart title (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param xAxisLabel  a label for the X-axis (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param yAxisLabel  a label for the Y-axis (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param dataset  the dataset for the chart (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param orientation  the plot orientation (horizontal or vertical) \r\n     *                     (\u003ccode\u003enull\u003c/code\u003e NOT permitted).\r\n     * @param legend  a flag specifying whether or not a legend is required.\r\n     * @param tooltips  configure chart to generate tool tips?\r\n     * @param urls  configure chart to generate URLs?\r\n     *\r\n     * @return A stacked XY area chart.\r\n     ",
      "child_ranges": [
        "(line 1604,col 9)-(line 1606,col 9)",
        "(line 1607,col 9)-(line 1607,col 54)",
        "(line 1608,col 9)-(line 1608,col 46)",
        "(line 1609,col 9)-(line 1609,col 34)",
        "(line 1610,col 9)-(line 1610,col 34)",
        "(line 1611,col 9)-(line 1611,col 54)",
        "(line 1612,col 9)-(line 1612,col 51)",
        "(line 1613,col 9)-(line 1615,col 9)",
        "(line 1617,col 9)-(line 1617,col 43)",
        "(line 1618,col 9)-(line 1620,col 9)",
        "(line 1621,col 9)-(line 1622,col 48)",
        "(line 1623,col 9)-(line 1623,col 34)",
        "(line 1624,col 9)-(line 1624,col 66)",
        "(line 1625,col 9)-(line 1625,col 41)",
        "(line 1627,col 9)-(line 1627,col 33)",
        "(line 1629,col 9)-(line 1630,col 30)",
        "(line 1631,col 9)-(line 1631,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartFactory.createXYLineChart(java.lang.String, java.lang.String, java.lang.String, org.jfree.data.xy.XYDataset, org.jfree.chart.plot.PlotOrientation, boolean, boolean, boolean)",
      "begin_line": 1651,
      "end_line": 1681,
      "comment": "\r\n     * Creates a line chart (based on an {@link XYDataset}) with default \r\n     * settings.\r\n     *\r\n     * @param title  the chart title (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param xAxisLabel  a label for the X-axis (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param yAxisLabel  a label for the Y-axis (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param dataset  the dataset for the chart (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param orientation  the plot orientation (horizontal or vertical) \r\n     *                     (\u003ccode\u003enull\u003c/code\u003e NOT permitted).\r\n     * @param legend  a flag specifying whether or not a legend is required.\r\n     * @param tooltips  configure chart to generate tool tips?\r\n     * @param urls  configure chart to generate URLs?\r\n     *\r\n     * @return The chart.\r\n     ",
      "child_ranges": [
        "(line 1660,col 9)-(line 1662,col 9)",
        "(line 1663,col 9)-(line 1663,col 54)",
        "(line 1664,col 9)-(line 1664,col 46)",
        "(line 1665,col 9)-(line 1665,col 54)",
        "(line 1666,col 9)-(line 1666,col 74)",
        "(line 1667,col 9)-(line 1667,col 66)",
        "(line 1668,col 9)-(line 1668,col 41)",
        "(line 1669,col 9)-(line 1671,col 9)",
        "(line 1672,col 9)-(line 1674,col 9)",
        "(line 1676,col 9)-(line 1677,col 30)",
        "(line 1679,col 9)-(line 1679,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartFactory.createXYStepChart(java.lang.String, java.lang.String, java.lang.String, org.jfree.data.xy.XYDataset, org.jfree.chart.plot.PlotOrientation, boolean, boolean, boolean)",
      "begin_line": 1698,
      "end_line": 1735,
      "comment": "\r\n     * Creates a stepped XY plot with default settings.\r\n     *\r\n     * @param title  the chart title (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param xAxisLabel  a label for the X-axis (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param yAxisLabel  a label for the Y-axis (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param dataset  the dataset for the chart (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param orientation  the plot orientation (horizontal or vertical) \r\n     *                     (\u003ccode\u003enull\u003c/code\u003e NOT permitted).\r\n     * @param legend  a flag specifying whether or not a legend is required.\r\n     * @param tooltips  configure chart to generate tool tips?\r\n     * @param urls  configure chart to generate URLs?\r\n     *\r\n     * @return A chart.\r\n     ",
      "child_ranges": [
        "(line 1707,col 9)-(line 1709,col 9)",
        "(line 1710,col 9)-(line 1710,col 50)",
        "(line 1711,col 9)-(line 1711,col 54)",
        "(line 1712,col 9)-(line 1712,col 72)",
        "(line 1714,col 9)-(line 1714,col 51)",
        "(line 1715,col 9)-(line 1717,col 9)",
        "(line 1719,col 9)-(line 1719,col 43)",
        "(line 1720,col 9)-(line 1722,col 9)",
        "(line 1723,col 9)-(line 1724,col 65)",
        "(line 1726,col 9)-(line 1726,col 62)",
        "(line 1727,col 9)-(line 1727,col 35)",
        "(line 1728,col 9)-(line 1728,col 41)",
        "(line 1729,col 9)-(line 1729,col 46)",
        "(line 1730,col 9)-(line 1730,col 45)",
        "(line 1731,col 9)-(line 1732,col 30)",
        "(line 1733,col 9)-(line 1733,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartFactory.createXYStepAreaChart(java.lang.String, java.lang.String, java.lang.String, org.jfree.data.xy.XYDataset, org.jfree.chart.plot.PlotOrientation, boolean, boolean, boolean)",
      "begin_line": 1752,
      "end_line": 1789,
      "comment": "\r\n     * Creates a filled stepped XY plot with default settings.\r\n     *\r\n     * @param title  the chart title (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param xAxisLabel  a label for the X-axis (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param yAxisLabel  a label for the Y-axis (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param dataset  the dataset for the chart (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param orientation  the plot orientation (horizontal or vertical) \r\n     *                     (\u003ccode\u003enull\u003c/code\u003e NOT permitted).\r\n     * @param legend  a flag specifying whether or not a legend is required.\r\n     * @param tooltips  configure chart to generate tool tips?\r\n     * @param urls  configure chart to generate URLs?\r\n     *\r\n     * @return A chart.\r\n     ",
      "child_ranges": [
        "(line 1761,col 9)-(line 1763,col 9)",
        "(line 1764,col 9)-(line 1764,col 54)",
        "(line 1765,col 9)-(line 1765,col 46)",
        "(line 1766,col 9)-(line 1766,col 54)",
        "(line 1768,col 9)-(line 1768,col 51)",
        "(line 1769,col 9)-(line 1771,col 9)",
        "(line 1773,col 9)-(line 1773,col 43)",
        "(line 1774,col 9)-(line 1776,col 9)",
        "(line 1777,col 9)-(line 1779,col 30)",
        "(line 1781,col 9)-(line 1781,col 62)",
        "(line 1782,col 9)-(line 1782,col 35)",
        "(line 1783,col 9)-(line 1783,col 41)",
        "(line 1784,col 9)-(line 1784,col 46)",
        "(line 1785,col 9)-(line 1785,col 45)",
        "(line 1786,col 9)-(line 1787,col 30)",
        "(line 1788,col 9)-(line 1788,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartFactory.createTimeSeriesChart(java.lang.String, java.lang.String, java.lang.String, org.jfree.data.xy.XYDataset, boolean, boolean, boolean)",
      "begin_line": 1812,
      "end_line": 1848,
      "comment": "\r\n     * Creates and returns a time series chart.  A time series chart is an \r\n     * {@link XYPlot} with a {@link DateAxis} for the x-axis and a \r\n     * {@link NumberAxis} for the y-axis.  The default renderer is an\r\n     * {@link XYLineAndShapeRenderer}.\r\n     * \u003cP\u003e\r\n     * A convenient dataset to use with this chart is a \r\n     * {@link org.jfree.data.time.TimeSeriesCollection}.\r\n     *\r\n     * @param title  the chart title (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param timeAxisLabel  a label for the time axis (\u003ccode\u003enull\u003c/code\u003e \r\n     *                       permitted).\r\n     * @param valueAxisLabel  a label for the value axis (\u003ccode\u003enull\u003c/code\u003e \r\n     *                        permitted).\r\n     * @param dataset  the dataset for the chart (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param legend  a flag specifying whether or not a legend is required.\r\n     * @param tooltips  configure chart to generate tool tips?\r\n     * @param urls  configure chart to generate URLs?\r\n     *\r\n     * @return A time series chart.\r\n     ",
      "child_ranges": [
        "(line 1820,col 9)-(line 1820,col 57)",
        "(line 1821,col 9)-(line 1821,col 38)",
        "(line 1822,col 9)-(line 1822,col 38)",
        "(line 1823,col 9)-(line 1823,col 62)",
        "(line 1824,col 9)-(line 1824,col 50)",
        "(line 1825,col 9)-(line 1825,col 69)",
        "(line 1827,col 9)-(line 1827,col 51)",
        "(line 1828,col 9)-(line 1831,col 9)",
        "(line 1833,col 9)-(line 1833,col 43)",
        "(line 1834,col 9)-(line 1836,col 9)",
        "(line 1838,col 9)-(line 1839,col 23)",
        "(line 1840,col 9)-(line 1840,col 59)",
        "(line 1841,col 9)-(line 1841,col 51)",
        "(line 1842,col 9)-(line 1842,col 35)",
        "(line 1844,col 9)-(line 1845,col 30)",
        "(line 1846,col 9)-(line 1846,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartFactory.createCandlestickChart(java.lang.String, java.lang.String, java.lang.String, org.jfree.data.xy.OHLCDataset, boolean)",
      "begin_line": 1863,
      "end_line": 1877,
      "comment": "\r\n     * Creates and returns a default instance of a candlesticks chart.\r\n     *\r\n     * @param title  the chart title (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param timeAxisLabel  a label for the time axis (\u003ccode\u003enull\u003c/code\u003e \r\n     *                       permitted).\r\n     * @param valueAxisLabel  a label for the value axis (\u003ccode\u003enull\u003c/code\u003e \r\n     *                        permitted).\r\n     * @param dataset  the dataset for the chart (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param legend  a flag specifying whether or not a legend is required.\r\n     *\r\n     * @return A candlestick chart.\r\n     ",
      "child_ranges": [
        "(line 1869,col 9)-(line 1869,col 57)",
        "(line 1870,col 9)-(line 1870,col 62)",
        "(line 1871,col 9)-(line 1871,col 69)",
        "(line 1872,col 9)-(line 1872,col 52)",
        "(line 1873,col 9)-(line 1874,col 30)",
        "(line 1875,col 9)-(line 1875,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartFactory.createHighLowChart(java.lang.String, java.lang.String, java.lang.String, org.jfree.data.xy.OHLCDataset, boolean)",
      "begin_line": 1892,
      "end_line": 1907,
      "comment": "\r\n     * Creates and returns a default instance of a high-low-open-close chart.\r\n     *\r\n     * @param title  the chart title (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param timeAxisLabel  a label for the time axis (\u003ccode\u003enull\u003c/code\u003e \r\n     *                       permitted).\r\n     * @param valueAxisLabel  a label for the value axis (\u003ccode\u003enull\u003c/code\u003e \r\n     *                        permitted).\r\n     * @param dataset  the dataset for the chart (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param legend  a flag specifying whether or not a legend is required.\r\n     *\r\n     * @return A high-low-open-close chart.\r\n     ",
      "child_ranges": [
        "(line 1898,col 9)-(line 1898,col 57)",
        "(line 1899,col 9)-(line 1899,col 62)",
        "(line 1900,col 9)-(line 1900,col 57)",
        "(line 1901,col 9)-(line 1901,col 74)",
        "(line 1902,col 9)-(line 1902,col 73)",
        "(line 1903,col 9)-(line 1904,col 30)",
        "(line 1905,col 9)-(line 1905,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartFactory.createHighLowChart(java.lang.String, java.lang.String, java.lang.String, org.jfree.data.xy.OHLCDataset, org.jfree.chart.axis.Timeline, boolean)",
      "begin_line": 1927,
      "end_line": 1944,
      "comment": "\r\n     * Creates and returns a default instance of a high-low-open-close chart \r\n     * with a special timeline. This timeline can be a \r\n     * {@link org.jfree.chart.axis.SegmentedTimeline} such as the Monday \r\n     * through Friday timeline that will remove Saturdays and Sundays from\r\n     * the axis.\r\n     *\r\n     * @param title  the chart title (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param timeAxisLabel  a label for the time axis (\u003ccode\u003enull\u003c/code\u003e \r\n     *                       permitted).\r\n     * @param valueAxisLabel  a label for the value axis (\u003ccode\u003enull\u003c/code\u003e \r\n     *                        permitted).\r\n     * @param dataset  the dataset for the chart (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param timeline  the timeline.\r\n     * @param legend  a flag specifying whether or not a legend is required.\r\n     *\r\n     * @return A high-low-open-close chart.\r\n     ",
      "child_ranges": [
        "(line 1934,col 9)-(line 1934,col 56)",
        "(line 1935,col 9)-(line 1935,col 39)",
        "(line 1936,col 9)-(line 1936,col 62)",
        "(line 1937,col 9)-(line 1937,col 57)",
        "(line 1938,col 9)-(line 1938,col 74)",
        "(line 1939,col 9)-(line 1939,col 73)",
        "(line 1940,col 9)-(line 1941,col 30)",
        "(line 1942,col 9)-(line 1942,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartFactory.createBubbleChart(java.lang.String, java.lang.String, java.lang.String, org.jfree.data.xy.XYZDataset, org.jfree.chart.plot.PlotOrientation, boolean, boolean, boolean)",
      "begin_line": 1964,
      "end_line": 1999,
      "comment": "\r\n     * Creates a bubble chart with default settings.  The chart is composed of\r\n     * an {@link XYPlot}, with a {@link NumberAxis} for the domain axis,\r\n     * a {@link NumberAxis} for the range axis, and an {@link XYBubbleRenderer}\r\n     * to draw the data items.\r\n     *\r\n     * @param title  the chart title (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param xAxisLabel  a label for the X-axis (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param yAxisLabel  a label for the Y-axis (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param dataset  the dataset for the chart (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param orientation  the orientation (horizontal or vertical) \r\n     *                     (\u003ccode\u003enull\u003c/code\u003e NOT permitted).\r\n     * @param legend  a flag specifying whether or not a legend is required.\r\n     * @param tooltips  configure chart to generate tool tips?\r\n     * @param urls  configure chart to generate URLs?\r\n     *\r\n     * @return A bubble chart.\r\n     ",
      "child_ranges": [
        "(line 1973,col 9)-(line 1975,col 9)",
        "(line 1976,col 9)-(line 1976,col 54)",
        "(line 1977,col 9)-(line 1977,col 46)",
        "(line 1978,col 9)-(line 1978,col 54)",
        "(line 1979,col 9)-(line 1979,col 46)",
        "(line 1981,col 9)-(line 1981,col 62)",
        "(line 1983,col 9)-(line 1984,col 54)",
        "(line 1985,col 9)-(line 1987,col 9)",
        "(line 1988,col 9)-(line 1990,col 9)",
        "(line 1991,col 9)-(line 1991,col 35)",
        "(line 1992,col 9)-(line 1992,col 41)",
        "(line 1994,col 9)-(line 1995,col 30)",
        "(line 1997,col 9)-(line 1997,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartFactory.createHistogram(java.lang.String, java.lang.String, java.lang.String, org.jfree.data.xy.IntervalXYDataset, org.jfree.chart.plot.PlotOrientation, boolean, boolean, boolean)",
      "begin_line": 2018,
      "end_line": 2048,
      "comment": "\r\n     * Creates a histogram chart.  This chart is constructed with an \r\n     * {@link XYPlot} using an {@link XYBarRenderer}.  The domain and range \r\n     * axes are {@link NumberAxis} instances.\r\n     *\r\n     * @param title  the chart title (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param xAxisLabel  the x axis label (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param yAxisLabel  the y axis label (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param orientation  the orientation (horizontal or vertical) \r\n     *                     (\u003ccode\u003enull\u003c/code\u003e NOT permitted).\r\n     * @param legend  create a legend?\r\n     * @param tooltips  display tooltips?\r\n     * @param urls  generate URLs?\r\n     *\r\n     * @return The chart.\r\n     ",
      "child_ranges": [
        "(line 2027,col 9)-(line 2029,col 9)",
        "(line 2030,col 9)-(line 2030,col 54)",
        "(line 2031,col 9)-(line 2031,col 46)",
        "(line 2032,col 9)-(line 2032,col 53)",
        "(line 2034,col 9)-(line 2034,col 54)",
        "(line 2035,col 9)-(line 2037,col 9)",
        "(line 2038,col 9)-(line 2040,col 9)",
        "(line 2042,col 9)-(line 2042,col 66)",
        "(line 2043,col 9)-(line 2043,col 41)",
        "(line 2044,col 9)-(line 2045,col 30)",
        "(line 2046,col 9)-(line 2046,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartFactory.createBoxAndWhiskerChart(java.lang.String, java.lang.String, java.lang.String, org.jfree.data.statistics.BoxAndWhiskerCategoryDataset, boolean)",
      "begin_line": 2066,
      "end_line": 2081,
      "comment": "\r\n     * Creates and returns a default instance of a box and whisker chart\r\n     * based on data from a {@link BoxAndWhiskerCategoryDataset}.\r\n     *\r\n     * @param title  the chart title (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param categoryAxisLabel  a label for the category axis \r\n     *     (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param valueAxisLabel  a label for the value axis (\u003ccode\u003enull\u003c/code\u003e \r\n     *     permitted).\r\n     * @param dataset  the dataset for the chart (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param legend  a flag specifying whether or not a legend is required.\r\n     *\r\n     * @return A box and whisker chart.\r\n     * \r\n     * @since 1.0.4\r\n     ",
      "child_ranges": [
        "(line 2070,col 9)-(line 2070,col 72)",
        "(line 2071,col 9)-(line 2071,col 62)",
        "(line 2072,col 9)-(line 2072,col 50)",
        "(line 2074,col 9)-(line 2074,col 69)",
        "(line 2075,col 9)-(line 2075,col 78)",
        "(line 2077,col 9)-(line 2078,col 26)",
        "(line 2079,col 9)-(line 2080,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartFactory.createBoxAndWhiskerChart(java.lang.String, java.lang.String, java.lang.String, org.jfree.data.statistics.BoxAndWhiskerXYDataset, boolean)",
      "begin_line": 2096,
      "end_line": 2110,
      "comment": "\r\n     * Creates and returns a default instance of a box and whisker chart.\r\n     *\r\n     * @param title  the chart title (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param timeAxisLabel  a label for the time axis (\u003ccode\u003enull\u003c/code\u003e \r\n     *                       permitted).\r\n     * @param valueAxisLabel  a label for the value axis (\u003ccode\u003enull\u003c/code\u003e \r\n     *                        permitted).\r\n     * @param dataset  the dataset for the chart (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param legend  a flag specifying whether or not a legend is required.\r\n     *\r\n     * @return A box and whisker chart.\r\n     ",
      "child_ranges": [
        "(line 2102,col 9)-(line 2102,col 57)",
        "(line 2103,col 9)-(line 2103,col 62)",
        "(line 2104,col 9)-(line 2104,col 50)",
        "(line 2105,col 9)-(line 2105,col 77)",
        "(line 2106,col 9)-(line 2106,col 73)",
        "(line 2107,col 9)-(line 2108,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartFactory.createWindPlot(java.lang.String, java.lang.String, java.lang.String, org.jfree.data.xy.WindDataset, boolean, boolean, boolean)",
      "begin_line": 2126,
      "end_line": 2151,
      "comment": "\r\n     * Creates a wind plot with default settings.\r\n     *\r\n     * @param title  the chart title (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param xAxisLabel  a label for the x-axis (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param yAxisLabel  a label for the y-axis (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param dataset  the dataset for the chart (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param legend  a flag that controls whether or not a legend is created.\r\n     * @param tooltips  configure chart to generate tool tips?\r\n     * @param urls  configure chart to generate URLs?\r\n     *\r\n     * @return A wind plot.\r\n     *\r\n     ",
      "child_ranges": [
        "(line 2134,col 9)-(line 2134,col 51)",
        "(line 2135,col 9)-(line 2135,col 53)",
        "(line 2136,col 9)-(line 2136,col 36)",
        "(line 2138,col 9)-(line 2138,col 59)",
        "(line 2139,col 9)-(line 2141,col 9)",
        "(line 2142,col 9)-(line 2144,col 9)",
        "(line 2145,col 9)-(line 2145,col 66)",
        "(line 2146,col 9)-(line 2147,col 30)",
        "(line 2149,col 9)-(line 2149,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartFactory.createWaferMapChart(java.lang.String, org.jfree.data.general.WaferMapDataset, org.jfree.chart.plot.PlotOrientation, boolean, boolean, boolean)",
      "begin_line": 2166,
      "end_line": 2184,
      "comment": "\r\n     * Creates a wafer map chart.\r\n     *\r\n     * @param title  the chart title (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param orientation  the plot orientation (horizontal or vertical) \r\n     *                     (\u003ccode\u003enull\u003c/code\u003e NOT permitted.\r\n     * @param legend  display a legend?\r\n     * @param tooltips  generate tooltips?\r\n     * @param urls  generate URLs?\r\n     *\r\n     * @return A wafer map chart.\r\n     ",
      "child_ranges": [
        "(line 2173,col 9)-(line 2175,col 9)",
        "(line 2176,col 9)-(line 2176,col 54)",
        "(line 2177,col 9)-(line 2177,col 59)",
        "(line 2178,col 9)-(line 2178,col 35)",
        "(line 2180,col 9)-(line 2181,col 30)",
        "(line 2183,col 9)-(line 2183,col 21)"
      ]
    }
  ]
}