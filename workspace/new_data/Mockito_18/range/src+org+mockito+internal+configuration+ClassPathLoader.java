{
  "filepath": "/tmp/Mockito-18b/src/org/mockito/internal/configuration/ClassPathLoader.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ClassPathLoader",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 56,
      "end_line": 82,
      "comment": "\n * Loads configuration or extension points available in the classpath.\n *\n * \u003cp\u003e\n * \u003cul\u003e\n *     \u003cli\u003e\n *         Can load the mockito configuration. The user who want to provide his own mockito configuration\n *         should write the class \u003ccode\u003eorg.mockito.configuration.MockitoConfiguration\u003c/code\u003e that implements\n *         {@link IMockitoConfiguration}. For example :\n *         \u003cpre class\u003d\"code\"\u003e\u003ccode class\u003d\"java\"\u003e\n * package org.mockito.configuration;\n *\n * //...\n *\n * public class MockitoConfiguration implements IMockitoConfiguration {\n *     boolean enableClassCache() { return false; }\n *\n *     // ...\n * }\n *     \u003c/code\u003e\u003c/pre\u003e\n *     \u003c/li\u003e\n *     \u003cli\u003e\n *         Can load available mockito extensions. Currently Mockito only have one extension point the\n *         {@link MockMaker}. This extension point allows a user to provide his own bytecode engine to build mocks.\n *         \u003cbr\u003eSuppose you wrote an extension to create mocks with some \u003cem\u003eAwesome\u003c/em\u003e library, in order to tell\n *         Mockito to use it you need to put in your classpath\n *         \u003col style\u003d\"list-style-type: lower-alpha\"\u003e\n *             \u003cli\u003eThe implementation itself, for example \u003ccode\u003eorg.awesome.mockito.AwesomeMockMaker\u003c/code\u003e.\u003c/li\u003e\n *             \u003cli\u003eA file named \u003ccode\u003eorg.mockito.plugins.MockMaker\u003c/code\u003e in a folder named\n *             \u003ccode\u003emockito-extensions\u003c/code\u003e, the content of this file need to have \u003cstrong\u003eone\u003c/strong\u003e line with\n *             the qualified name \u003ccode\u003eorg.awesome.mockito.AwesomeMockMaker\u003c/code\u003e.\u003c/li\u003e\n *         \u003c/ol\u003e\n *     \u003c/li\u003e\n * \u003c/ul\u003e\n * \u003c/p\u003e\n "
    },
    {
      "type": "field",
      "varNames": [
        "MOCKITO_CONFIGURATION_CLASS_NAME"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.configuration.ClassPathLoader.loadConfiguration()",
      "begin_line": 63,
      "end_line": 81,
      "comment": "\n     * @return configuration loaded from classpath or null\n     ",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 26)",
        "(line 67,col 9)-(line 72,col 9)",
        "(line 74,col 9)-(line 80,col 9)"
      ]
    }
  ]
}