{
  "filepath": "/tmp/Mockito-18b/src/org/mockito/stubbing/VoidMethodStubbable.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "VoidMethodStubbable",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 25,
      "end_line": 104,
      "comment": "\n * Stubs void method with an exception. E.g:\n *\n * \u003cpre class\u003d\"code\"\u003e\u003ccode class\u003d\"java\"\u003e\n * stubVoid(mock).toThrow(new RuntimeException()).on().someMethod();\n *\n * //you can stub with different behavior for consecutive method calls.\n * //Last stubbing (e.g: toReturn()) determines the behavior for further consecutive calls.\n * stubVoid(mock)\n *  .toThrow(new RuntimeException())\n *  .toReturn()\n *  .on().someMethod();\n * \u003c/code\u003e\u003c/pre\u003e\n *\n * See examples in javadoc for {@link Mockito#stubVoid}\n "
    },
    {
      "type": "method",
      "signature": "org.mockito.stubbing.VoidMethodStubbable.toThrow(java.lang.Throwable)",
      "begin_line": 43,
      "end_line": 43,
      "comment": "\n     * Stubs void method with an exception. E.g:\n     *\n     * \u003cpre class\u003d\"code\"\u003e\u003ccode class\u003d\"java\"\u003e\n     * stubVoid(mock).toThrow(new RuntimeException()).on().someMethod();\n     * \u003c/code\u003e\u003c/pre\u003e\n     *\n     * If throwable is a checked exception then it has to\n     * match one of the checked exceptions of method signature.\n     *\n     * See examples in javadoc for {@link Mockito#stubVoid}\n     *\n     * @param throwable to be thrown on method invocation\n     *\n     * @return VoidMethodStubbable - typically to choose void method and finish stubbing\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.mockito.stubbing.VoidMethodStubbable.toReturn()",
      "begin_line": 67,
      "end_line": 67,
      "comment": "\n     * Stubs void method to \u0027just return\u0027 (e.g. to \u003cb\u003enot\u003c/b\u003e to throw any exception)\n     * \u003cp\u003e\n     * \u003cb\u003eOnly use this method if you\u0027re stubbing consecutive calls.\u003c/b\u003e\n     * \u003cp\u003e\n     * For example:\n     * \u003cpre class\u003d\"code\"\u003e\u003ccode class\u003d\"java\"\u003e\n     * stubVoid(mock)\n     *   .toReturn()\n     *   .toThrow(new RuntimeException())\n     *   .on().foo(10);\n     * \u003c/code\u003e\u003c/pre\u003e\n     * \u003cul\u003e\n     * \u003cli\u003efirst time foo(10) is called the mock will \u0027just return\u0027 (e.g. don\u0027t throw any exception)\u003c/li\u003e\n     * \u003cli\u003esecond time foo(10) is called the mock will throw RuntimeException\u003c/li\u003e\n     * \u003cli\u003eevery consecutive time foo(10) is called the mock will throw RuntimeException\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003cp\u003e\n     * See examples in javadoc for {@link Mockito#stubVoid}\n     *\n     * @return VoidMethodStubbable - typically to choose void method and finish stubbing\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.mockito.stubbing.VoidMethodStubbable.toAnswer(org.mockito.stubbing.Answer\u003c?\u003e)",
      "begin_line": 90,
      "end_line": 90,
      "comment": "\n     * Stubs a void method with generic {@link Answer}\n     * \u003cp\u003e\n     * For Example:\n     * \u003cpre class\u003d\"code\"\u003e\u003ccode class\u003d\"java\"\u003e\n     * stubVoid(mock)\n     *   .toAnswer(new Answer() {\n     *                 public Object answer(InvocationOnMOck invocation) {\n     *                     Visitor v \u003d (Visitor) invocation.getArguments()[0];\n     *                     v.visitMock(invocation.getMock());\n     *\n     *                     return null;\n     *                 }\n     *             })\n     *    .on().accept(any());\n     * \u003c/code\u003e\u003c/pre\u003e\n     *\n     * @param answer the custom answer to execute.\n     *\n     * @return VoidMethodStubbable - typically to choose void method and finish stubbing\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.mockito.stubbing.VoidMethodStubbable.on()",
      "begin_line": 103,
      "end_line": 103,
      "comment": "\n     * Choose void method for stubbing. E.g:\n     *\n     * \u003cpre class\u003d\"code\"\u003e\u003ccode class\u003d\"java\"\u003e\n     * stubVoid(mock).toThrow(new RuntimeException()).on().someMethod(\"some arg\");\n     * \u003c/code\u003e\u003c/pre\u003e\n     *\n     * See examples in javadoc for {@link Mockito#stubVoid}\n     *\n     * @return mock object itself\n     ",
      "child_ranges": []
    }
  ]
}