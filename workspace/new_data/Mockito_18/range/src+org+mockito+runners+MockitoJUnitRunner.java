{
  "filepath": "/tmp/Mockito-18b/src/org/mockito/runners/MockitoJUnitRunner.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MockitoJUnitRunner",
      "is_interface": false,
      "parent_types": [
        "org.junit.runner.Runner",
        "org.junit.runner.manipulation.Filterable"
      ],
      "begin_line": 52,
      "end_line": 74,
      "comment": "\n * Compatible with \u003cb\u003eJUnit 4.4 and higher\u003c/b\u003e, this runner adds following behavior:\n * \u003cul\u003e\n *   \u003cli\u003e\n *      Initializes mocks annotated with {@link Mock},\n *      so that explicit usage of {@link MockitoAnnotations#initMocks(Object)} is not necessary. \n *      Mocks are initialized before each test method.\n *   \u003cli\u003e\n *      validates framework usage after each test method. See javadoc for {@link Mockito#validateMockitoUsage()}.\n * \u003c/ul\u003e\n * \n * Runner is completely optional - there are other ways you can get \u0026#064;Mock working, for example by writing a base class.\n * Explicitly validating framework usage is also optional because it is triggered automatically by Mockito every time you use the framework.\n * See javadoc for {@link Mockito#validateMockitoUsage()}.\n * \u003cp\u003e\n * Read more about \u0026#064;Mock annotation in javadoc for {@link MockitoAnnotations}\n * \u003cpre class\u003d\"code\"\u003e\u003ccode class\u003d\"java\"\u003e\n * \u003cb\u003e\u0026#064;RunWith(MockitoJUnitRunner.class)\u003c/b\u003e\n * public class ExampleTest {\n * \n *     \u0026#064;Mock\n *     private List list;\n * \n *     \u0026#064;Test\n *     public void shouldDoSomething() {\n *         list.add(100);\n *     }\n * }\n * \u003c/code\u003e\u003c/pre\u003e\n "
    },
    {
      "type": "field",
      "varNames": [
        "runner"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.mockito.runners.MockitoJUnitRunner.MockitoJUnitRunner(java.lang.Class\u003c?\u003e)",
      "begin_line": 56,
      "end_line": 58,
      "comment": "",
      "child_ranges": [
        "(line 57,col 9)-(line 57,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.runners.MockitoJUnitRunner.run(org.junit.runner.notification.RunNotifier)",
      "begin_line": 60,
      "end_line": 63,
      "comment": "",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.runners.MockitoJUnitRunner.getDescription()",
      "begin_line": 65,
      "end_line": 68,
      "comment": "",
      "child_ranges": [
        "(line 67,col 9)-(line 67,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.runners.MockitoJUnitRunner.filter(org.junit.runner.manipulation.Filter)",
      "begin_line": 70,
      "end_line": 73,
      "comment": "",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 30)"
      ]
    }
  ]
}