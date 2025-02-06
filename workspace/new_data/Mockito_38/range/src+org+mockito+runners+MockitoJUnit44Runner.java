{
  "filepath": "/tmp/Mockito-38b/src/org/mockito/runners/MockitoJUnit44Runner.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MockitoJUnit44Runner",
      "is_interface": false,
      "parent_types": [
        "org.mockito.runners.MockitoJUnitRunner"
      ],
      "begin_line": 47,
      "end_line": 54,
      "comment": "\n * \u003cb\u003eDeprecated: Simply use {@link MockitoJUnitRunner}\u003c/b\u003e\n * \u003cp\u003e\n * Compatible only with \u003cb\u003eJUnit 4.4\u003c/b\u003e, this runner adds following behavior:\n * \u003cul\u003e\n *   \u003cli\u003e\n *      Initializes mocks annotated with {@link Mock},\n *      so that explicit usage of {@link MockitoAnnotations#initMocks(Object)} is not necessary. \n *      Mocks are initialized before each test method.\n *   \u003cli\u003e\n *      validates framework usage after each test method. See javadoc for {@link Mockito#validateMockitoUsage()}.\n * \u003c/ul\u003e\n * \n * Runner is completely optional - there are other ways you can get \u0026#064;Mock working, for example by writing a base class.\n * Explicitly validating framework usage is also optional because it is triggered automatically by Mockito every time you use the framework.\n * See javadoc for {@link Mockito#validateMockitoUsage()}.\n * \u003cp\u003e\n * Read more about \u0026#064;Mock annotation in javadoc for {@link MockitoAnnotations}\n * \u003cp\u003e\n * Example:\n * \u003cpre\u003e\n * \u0026#064;RunWith(MockitoJUnit44Runner.class)\n * public class ExampleTest {\n * \n *     \u0026#064;Mock\n *     private List list;\n * \n *     \u0026#064;Test\n *     public void shouldDoSomething() {\n *         list.add(100);\n *     }\n * }\n * \u003cp\u003e\n * \n * \u003c/pre\u003e\n "
    },
    {
      "type": "constructor",
      "signature": "org.mockito.runners.MockitoJUnit44Runner.MockitoJUnit44Runner(java.lang.Class\u003c?\u003e)",
      "begin_line": 51,
      "end_line": 53,
      "comment": "",
      "child_ranges": [
        "(line 52,col 9)-(line 52,col 21)"
      ]
    }
  ]
}