{
  "filepath": "/tmp/Mockito-38b/src/org/mockito/ArgumentMatcher.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ArgumentMatcher",
      "is_interface": false,
      "parent_types": [
        "org.hamcrest.BaseMatcher\u003cT\u003e"
      ],
      "begin_line": 60,
      "end_line": 90,
      "comment": "\n * Allows creating customized argument matchers. \n * \u003cp\u003e\n * ArgumentMatcher is an hamcrest {@link Matcher} with predefined describeTo() method.\n * In case of failure, ArgumentMatcher generates description based on \u003cb\u003edecamelized class name\u003c/b\u003e - to promote meaningful class names. \n * For example \u003cb\u003eStringWithStrongLanguage\u003c/b\u003e matcher will generate \u0027String with strong language\u0027 description.\n * You can always override describeTo() method and provide detailed description.\n * \u003cp\u003e\n * Use {@link Matchers#argThat} method and pass an instance of hamcrest {@link Matcher}, e.g:\n * \n * \u003cpre\u003e\n * class IsListOfTwoElements extends ArgumentMatcher\u0026lt;List\u0026gt; {\n *     public boolean matches(Object list) {\n *         return ((List) list).size() \u003d\u003d 2;\n *     }\n * }\n * \n * List mock \u003d mock(List.class);\n * \n * when(mock.addAll(argThat(new IsListOfTwoElements()))).thenReturn(true);\n * \n * mock.addAll(Arrays.asList(\u0026quot;one\u0026quot;, \u0026quot;two\u0026quot;));\n * \n * verify(mock).addAll(argThat(new IsListOfTwoElements()));\n * \u003c/pre\u003e\n * \n * To keep it readable you may want to extract method, e.g:\n * \n * \u003cpre\u003e\n *   verify(mock).addAll(\u003cb\u003eargThat(new IsListOfTwoElements())\u003c/b\u003e);\n *   //becomes\n *   verify(mock).addAll(\u003cb\u003elistOfTwoElements()\u003c/b\u003e);\n * \u003c/pre\u003e\n *\n * \u003cb\u003eWarning:\u003c/b\u003e Be reasonable with using complicated argument matching, especially custom argument matchers, as it can make the test less readable. \n * Sometimes it\u0027s better to implement equals() for arguments that are passed to mocks \n * (Mockito naturally uses equals() for argument matching). \n * This can make the test cleaner. \n * \u003cp\u003e\n * Also, \u003cb\u003esometimes {@link ArgumentCaptor} may be a better fit\u003c/b\u003e than custom matcher.\n * For example, if custom argument matcher is not likely to be reused\n * or you just need it to assert on argument values to complete verification of behavior.\n * \u003cp\u003e\n * Read more about other matchers in javadoc for {@link Matchers} class\n * \n * @param \u003cT\u003e type of argument\n "
    },
    {
      "type": "method",
      "signature": "org.mockito.ArgumentMatcher.matches(java.lang.Object)",
      "begin_line": 72,
      "end_line": 72,
      "comment": "\n     * Returns whether this matcher accepts the given argument.\n     * \u003cp\u003e\n     * The method should \u003cb\u003enever\u003c/b\u003e assert if the argument doesn\u0027t match. It\n     * should only return false.\n     * \n     * @param argument\n     *            the argument\n     * @return whether this matcher accepts the given argument.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.mockito.ArgumentMatcher.describeTo(org.hamcrest.Description)",
      "begin_line": 86,
      "end_line": 89,
      "comment": " \n     * By default this method decamlizes matchers name to promote meaningful names for matchers.\n     * \u003cp\u003e\n     * For example \u003cb\u003eStringWithStrongLanguage\u003c/b\u003e matcher will generate \u0027String with strong language\u0027 description in case of failure.\n     * \u003cp\u003e\n     * You might want to override this method to\n     * provide more specific description of the matcher (useful when\n     * verification failures are reported).\n     * \n     * @param description the description to which the matcher description is\n     * appended.\n     ",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 54)",
        "(line 88,col 9)-(line 88,col 73)"
      ]
    }
  ]
}