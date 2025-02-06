{
  "filepath": "/tmp/Chart-2b/source/org/jfree/chart/util/ResourceBundleWrapper.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ResourceBundleWrapper",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 70,
      "end_line": 171,
      "comment": "\r\n * Wrapper of ResourceBundle.getBundle() methods. This wrapper is introduced to\r\n * avoid a dramatic performance penalty by superfluous resource (and classes\r\n * loaded by Class.forName) lookups on web server in applets.\r\n *\r\n * \u003cpre\u003e\r\n * public class AppletC extends javax.swing.JApplet {\r\n *    public void init() {\r\n *       ResourceBundleWrapper.removeCodeBase(getCodeBase(),\r\n *               (URLClassLoader) getClass().getClassLoader());\r\n *    ...\r\n * \u003c/pre\u003e\r\n *\r\n * @see \u003ca href\u003d\"http://bugs.sun.com/bugdatabase/view_bug.do?bug_id\u003d4243379\"\u003e\r\n *               Bug ID: 4243379\u003c/a\u003e\r\n * @see \u003ca href\u003d\"http://bugs.sun.com/bugdatabase/view_bug.do?bug_id\u003d4668479\"\u003e\r\n *               Bug ID: 4668479\u003c/a\u003e\r\n *\r\n * @since 1.2.0\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "noCodeBaseClassLoader"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": "\r\n     * A special class loader with no code base lookup.  This field may be\r\n     * \u003ccode\u003enull\u003c/code\u003e (the field is only initialised if removeCodeBase() is\r\n     * called from an applet.\r\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.util.ResourceBundleWrapper.ResourceBundleWrapper()",
      "begin_line": 82,
      "end_line": 84,
      "comment": "\r\n     * Private constructor.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.ResourceBundleWrapper.removeCodeBase(java.net.URL, java.net.URLClassLoader)",
      "begin_line": 96,
      "end_line": 109,
      "comment": "\r\n     * Instantiate a {@link URLClassLoader} for resource lookups where the\r\n     * codeBase URL is removed.  This method is typically called from an\r\n     * applet\u0027s init() method.  If this method is never called, the\r\n     * \u003ccode\u003egetBundle()\u003c/code\u003e methods map to the standard\r\n     * {@link ResourceBundle} lookup methods.\r\n     *\r\n     * @param codeBase  the codeBase URL.\r\n     * @param urlClassLoader  the class loader.\r\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 42)",
        "(line 100,col 9)-(line 100,col 46)",
        "(line 101,col 9)-(line 105,col 9)",
        "(line 107,col 9)-(line 107,col 71)",
        "(line 108,col 9)-(line 108,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.ResourceBundleWrapper.getBundle(java.lang.String)",
      "begin_line": 118,
      "end_line": 130,
      "comment": "\r\n     * Finds and returns the specified resource bundle.\r\n     *\r\n     * @param baseName  the base name.\r\n     *\r\n     * @return The resource bundle.\r\n     ",
      "child_ranges": [
        "(line 122,col 9)-(line 129,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.ResourceBundleWrapper.getBundle(java.lang.String, java.util.Locale)",
      "begin_line": 140,
      "end_line": 154,
      "comment": "\r\n     * Finds and returns the specified resource bundle.\r\n     *\r\n     * @param baseName  the base name.\r\n     * @param locale  the locale.\r\n     *\r\n     * @return The resource bundle.\r\n     ",
      "child_ranges": [
        "(line 146,col 9)-(line 153,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.ResourceBundleWrapper.getBundle(java.lang.String, java.util.Locale, java.lang.ClassLoader)",
      "begin_line": 166,
      "end_line": 169,
      "comment": "\r\n     * Maps directly to \u003ccode\u003eResourceBundle.getBundle(baseName, locale,\r\n     * loader)\u003c/code\u003e.\r\n     *\r\n     * @param baseName  the base name.\r\n     * @param locale  the locale.\r\n     * @param loader  the class loader.\r\n     *\r\n     * @return The resource bundle.\r\n     ",
      "child_ranges": [
        "(line 168,col 9)-(line 168,col 66)"
      ]
    }
  ]
}