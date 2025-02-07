{
  "filepath": "/tmp/Mockito-18b/src/org/mockito/junit/MockitoRule.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MockitoRule",
      "is_interface": true,
      "parent_types": [
        "org.junit.rules.MethodRule"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": "\n * The JUnit rule can be used instead of {@link org.mockito.runners.MockitoJUnitRunner}.\n * It requires JUnit at least 4.7.\n *\n * This rule adds following behavior:\n * \u003cul\u003e\n *   \u003cli\u003e\n *      Initializes mocks annotated with {@link org.mockito.Mock},\n *      so that explicit usage of {@link org.mockito.MockitoAnnotations#initMocks(Object)} is not necessary.\n *      Mocks are initialized before each test method.\n *   \u003cli\u003e\n *      validates framework usage after each test method. See javadoc for {@link org.mockito.Mockito#validateMockitoUsage()}.\n * \u003c/ul\u003e\n * Example use:\n * \u003cpre class\u003d\"code\"\u003e\u003ccode class\u003d\"java\"\u003e\n * public class ExampleTest {\n *\n *     \u0026#064;Rule\n *     public MockitoRule rule \u003d MockitoJUnit.rule();\n *\n *     \u0026#064;Mock\n *     private List list;\n *\n *     \u0026#064;Test\n *     public void shouldDoSomething() {\n *         list.add(100);\n *     }\n * }\n * \u003c/code\u003e\u003c/pre\u003e\n *\n * @since 1.10.17\n "
    }
  ]
}