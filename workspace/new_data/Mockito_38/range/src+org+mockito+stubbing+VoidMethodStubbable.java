{
  "filepath": "/tmp/Mockito-38b/src/org/mockito/stubbing/VoidMethodStubbable.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "VoidMethodStubbable",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 25,
      "end_line": 104,
      "comment": "\r\n * Stubs void method with an exception. E.g:\r\n *\r\n * \u003cpre\u003e\r\n * stubVoid(mock).toThrow(new RuntimeException()).on().someMethod();\r\n *\r\n * //you can stub with different behavior for consecutive method calls.\r\n * //Last stubbing (e.g: toReturn()) determines the behavior for further consecutive calls.\r\n * stubVoid(mock)\r\n *  .toThrow(new RuntimeException())\r\n *  .toReturn()\r\n *  .on().someMethod();\r\n * \u003c/pre\u003e\r\n *\r\n * See examples in javadoc for {@link Mockito#stubVoid}\r\n "
    },
    {
      "type": "method",
      "signature": "org.mockito.stubbing.VoidMethodStubbable.toThrow(java.lang.Throwable)",
      "begin_line": 43,
      "end_line": 43,
      "comment": "\r\n     * Stubs void method with an exception. E.g:\r\n     *\r\n     * \u003cpre\u003e\r\n     * stubVoid(mock).toThrow(new RuntimeException()).on().someMethod();\r\n     * \u003c/pre\u003e\r\n     *\r\n     * If throwable is a checked exception then it has to\r\n     * match one of the checked exceptions of method signature.\r\n     *\r\n     * See examples in javadoc for {@link Mockito#stubVoid}\r\n     *\r\n     * @param throwable to be thrown on method invocation\r\n     *\r\n     * @return VoidMethodStubbable - typically to choose void method and finish stubbing\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.mockito.stubbing.VoidMethodStubbable.toReturn()",
      "begin_line": 67,
      "end_line": 67,
      "comment": "\r\n     * Stubs void method to \u0027just return\u0027 (e.g. to \u003cb\u003enot\u003c/b\u003e to throw any exception)\r\n     * \u003cp\u003e\r\n     * \u003cb\u003eOnly use this method if you\u0027re stubbing consecutive calls.\u003c/b\u003e\r\n     * \u003cp\u003e\r\n     * For example:\r\n     * \u003cpre\u003e\r\n     * stubVoid(mock)\r\n     *   .toReturn()\r\n     *   .toThrow(new RuntimeException())\r\n     *   .on().foo(10);\r\n     * \u003c/pre\u003e\r\n     * \u003cul\u003e\r\n     * \u003cli\u003efirst time foo(10) is called the mock will \u0027just return\u0027 (e.g. don\u0027t throw any exception)\u003c/li\u003e\r\n     * \u003cli\u003esecond time foo(10) is called the mock will throw RuntimeException\u003c/li\u003e\r\n     * \u003cli\u003eevery consecutive time foo(10) is called the mock will throw RuntimeException\u003c/li\u003e\r\n     * \u003c/ul\u003e\r\n     * \u003cp\u003e\r\n     * See examples in javadoc for {@link Mockito#stubVoid}\r\n     *\r\n     * @return VoidMethodStubbable - typically to choose void method and finish stubbing\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.mockito.stubbing.VoidMethodStubbable.toAnswer(org.mockito.stubbing.Answer\u003c?\u003e)",
      "begin_line": 90,
      "end_line": 90,
      "comment": "\r\n     * Stubs a void method with generic {@link Answer}\r\n     * \u003cp\u003e\r\n     * For Example:\r\n     * \u003cpre\u003e\r\n     * stubVoid(mock)\r\n     *   .toAnswer(new Answer() {\r\n     *                 public Object answer(InvocationOnMOck invocation) {\r\n     *                     Visitor v \u003d (Visitor) invocation.getArguments()[0];\r\n     *                     v.visitMock(invocation.getMock());\r\n     *\r\n     *                     return null;\r\n     *                 }\r\n     *             })\r\n     *    .on().accept(any());\r\n     * \u003c/pre\u003e\r\n     *\r\n     * @param answer the custom answer to execute.\r\n     *\r\n     * @return VoidMethodStubbable - typically to choose void method and finish stubbing\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.mockito.stubbing.VoidMethodStubbable.on()",
      "begin_line": 103,
      "end_line": 103,
      "comment": "\r\n     * Choose void method for stubbing. E.g:\r\n     *\r\n     * \u003cpre\u003e\r\n     * stubVoid(mock).toThrow(new RuntimeException()).on().someMethod(\"some arg\");\r\n     * \u003c/pre\u003e\r\n     *\r\n     * See examples in javadoc for {@link Mockito#stubVoid}\r\n     *\r\n     * @return mock object itself\r\n     ",
      "child_ranges": []
    }
  ]
}