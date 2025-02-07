{
  "filepath": "/tmp/Mockito-18b/src/org/mockito/plugins/PluginSwitch.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PluginSwitch",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 41,
      "end_line": 52,
      "comment": "\n * Allows switching off the plugins that are discovered on classpath.\n *\n * \u003cp\u003e\n *     Mockito will invoke this interface in order to select whether a plugin is enabled or not.\n * \u003c/p\u003e\n *\n * \u003cp\u003e\n *     When a particular plugin is switched off, the default Mockito behavior is used.\n *     For example, if Android\u0027s dexmaker MockMaker is switched off,\n *     Mockito default MockMaker implementation is used {@link org.mockito.plugins.MockMaker}\n * \u003c/p\u003e\n *\n * \u003ch3\u003eUsing the extension point\u003c/h3\u003e\n *\n * \u003cp\u003e\n *     The plugin mechanism of mockito works in a similar way as the {@link java.util.ServiceLoader}, however instead of\n *     looking in the \u003ccode\u003eMETA-INF\u003c/code\u003e directory, Mockito will look in \u003ccode\u003emockito-extensions\u003c/code\u003e directory.\n *     \u003cem\u003eThe reason for that is that Android SDK strips jar from the \u003ccode\u003eMETA-INF\u003c/code\u003e directory when creating an APK.\u003c/em\u003e\n * \u003c/p\u003e\n *\n * \u003col style\u003d\"list-style-type: lower-alpha\"\u003e\n *     \u003cli\u003eThe implementation itself, for example \u003ccode\u003eorg.awesome.mockito.AwesomeMockMaker\u003c/code\u003e that extends the \u003ccode\u003eMockMaker\u003c/code\u003e.\u003c/li\u003e\n *     \u003cli\u003eA file \"\u003ccode\u003emockito-extensions/org.mockito.plugins.MockMaker\u003c/code\u003e\". The content of this file is\n *     exactly a \u003cstrong\u003eone\u003c/strong\u003e line with the qualified name: \u003ccode\u003eorg.awesome.mockito.AwesomeMockMaker\u003c/code\u003e.\u003c/li\u003e\n * \u003c/ol\u003e\u003c/p\u003e\n *\n * \u003cp\u003eNote that if several \u003ccode\u003emockito-extensions/org.mockito.plugins.MockMaker\u003c/code\u003e files exists in the classpath\n * Mockito will only use the first returned by the standard {@link ClassLoader#getResource} mechanism.\n * \u003cp\u003e\n *     So just create a custom implementation of {@link PluginSwitch} and place the qualified name in the following file\n *     \u003ccode\u003emockito-extensions/org.mockito.plugins.PluginSwitch\u003c/code\u003e.\n * \u003c/p\u003e\n *\n * @since 1.10.15\n "
    },
    {
      "type": "method",
      "signature": "org.mockito.plugins.PluginSwitch.isEnabled(java.lang.String)",
      "begin_line": 51,
      "end_line": 51,
      "comment": "\n     * Mockito invokes this method for every plugin found in the classpath\n     * (except from the {@code PluginSwitch} implementation itself).\n     * If no custom plugins are discovered this method is not invoked.\n     *\n     * @since 1.10.15\n     ",
      "child_ranges": []
    }
  ]
}