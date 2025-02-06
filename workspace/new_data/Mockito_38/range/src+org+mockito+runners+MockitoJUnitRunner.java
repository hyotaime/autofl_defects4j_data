{
  "filepath": "/tmp/Mockito-38b/src/org/mockito/runners/MockitoJUnitRunner.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MockitoJUnitRunner",
      "is_interface": false,
      "parent_types": [
        "org.junit.runner.Runner",
        "org.junit.runner.manipulation.Filterable"
      ],
      "begin_line": 47,
      "end_line": 68,
      "comment": "\r\n * Compatible with \u003cb\u003eJUnit 4.4\u003c/b\u003e and higher, this runner adds following behavior:\r\n * \u003cul\u003e\r\n *   \u003cli\u003e\r\n *      Initializes mocks annotated with {@link Mock},\r\n *      so that explicit usage of {@link MockitoAnnotations#initMocks(Object)} is not necessary. \r\n *      Mocks are initialized before each test method.\r\n *   \u003cli\u003e\r\n *      validates framework usage after each test method. See javadoc for {@link Mockito#validateMockitoUsage()}.\r\n * \u003c/ul\u003e\r\n * \r\n * Runner is completely optional - there are other ways you can get \u0026#064;Mock working, for example by writing a base class.\r\n * Explicitly validating framework usage is also optional because it is triggered automatically by Mockito every time you use the framework.\r\n * See javadoc for {@link Mockito#validateMockitoUsage()}.\r\n * \u003cp\u003e\r\n * Read more about \u0026#064;Mock annotation in javadoc for {@link MockitoAnnotations}\r\n * \u003cpre\u003e\r\n * \u003cb\u003e\u0026#064;RunWith(MockitoJUnit44Runner.class)\u003c/b\u003e\r\n * public class ExampleTest {\r\n * \r\n *     \u0026#064;Mock\r\n *     private List list;\r\n * \r\n *     \u0026#064;Test\r\n *     public void shouldDoSomething() {\r\n *         list.add(100);\r\n *     }\r\n * }\r\n * \u003c/pre\u003e\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "runner"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.mockito.runners.MockitoJUnitRunner.MockitoJUnitRunner(java.lang.Class\u003c?\u003e)",
      "begin_line": 51,
      "end_line": 53,
      "comment": "",
      "child_ranges": [
        "(line 52,col 9)-(line 52,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.runners.MockitoJUnitRunner.run(org.junit.runner.notification.RunNotifier)",
      "begin_line": 55,
      "end_line": 58,
      "comment": "",
      "child_ranges": [
        "(line 57,col 9)-(line 57,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.runners.MockitoJUnitRunner.getDescription()",
      "begin_line": 60,
      "end_line": 63,
      "comment": "",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.runners.MockitoJUnitRunner.filter(org.junit.runner.manipulation.Filter)",
      "begin_line": 64,
      "end_line": 67,
      "comment": "",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 30)"
      ]
    }
  ]
}