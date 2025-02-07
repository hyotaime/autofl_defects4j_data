{
  "filepath": "/tmp/Mockito-18b/src/org/mockito/internal/configuration/plugins/PluginLoader.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PluginLoader",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 12,
      "end_line": 70,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "pluginSwitch"
      ],
      "begin_line": 14,
      "end_line": 14,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.mockito.internal.configuration.plugins.PluginLoader.PluginLoader(org.mockito.plugins.PluginSwitch)",
      "begin_line": 16,
      "end_line": 18,
      "comment": "",
      "child_ranges": [
        "(line 17,col 9)-(line 17,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(java.lang.Class\u003cT\u003e, java.lang.String)",
      "begin_line": 23,
      "end_line": 39,
      "comment": "\n     * Scans the classpath for given pluginType. If not found, default class is used.\n     ",
      "child_ranges": [
        "(line 24,col 9)-(line 24,col 40)",
        "(line 25,col 9)-(line 27,col 9)",
        "(line 29,col 9)-(line 38,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.configuration.plugins.PluginLoader.loadImpl(java.lang.Class\u003cT\u003e)",
      "begin_line": 45,
      "end_line": 69,
      "comment": "\n     * Equivalent to {@link java.util.ServiceLoader#load} but without requiring\n     * Java 6 / Android 2.3 (Gingerbread).\n     ",
      "child_ranges": [
        "(line 46,col 9)-(line 46,col 76)",
        "(line 47,col 9)-(line 49,col 9)",
        "(line 50,col 9)-(line 50,col 35)",
        "(line 51,col 9)-(line 55,col 9)",
        "(line 57,col 9)-(line 68,col 9)"
      ]
    }
  ]
}