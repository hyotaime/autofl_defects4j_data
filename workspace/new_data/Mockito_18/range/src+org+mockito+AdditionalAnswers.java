{
  "filepath": "/tmp/Mockito-18b/src/org/mockito/AdditionalAnswers.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AdditionalAnswers",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 24,
      "end_line": 198,
      "comment": "\n * Additional answers provides factory methods for less common answers.\n *\n * \u003cp\u003eCurrently offer answers that can return the parameter of an invocation at a certain position.\n *\n * \u003cp\u003eSee factory methods for more information : {@link #returnsFirstArg}, {@link #returnsSecondArg},\n * {@link #returnsLastArg} and {@link #returnsArgAt}\n *\n * @since 1.9.5\n "
    },
    {
      "type": "field",
      "varNames": [
        "RETURNS_FIRST_ARGUMENT"
      ],
      "begin_line": 26,
      "end_line": 26,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "RETURNS_SECOND_ARGUMENT"
      ],
      "begin_line": 27,
      "end_line": 27,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "RETURNS_LAST_ARGUMENT"
      ],
      "begin_line": 28,
      "end_line": 28,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockito.AdditionalAnswers.returnsFirstArg()",
      "begin_line": 46,
      "end_line": 48,
      "comment": "\n     * Returns the first parameter of an invocation.\n     *\n     * \u003cp\u003e\n     *     This additional answer could be used at stub time using the\n     *     \u003ccode\u003ethen|do|will{@link org.mockito.stubbing.Answer}\u003c/code\u003e methods. For example :\n     * \u003c/p\u003e\n     *\n     * \u003cpre class\u003d\"code\"\u003e\u003ccode class\u003d\"java\"\u003egiven(carKeyFob.authenticate(carKey)).will(returnsFirstArg());\n     * doAnswer(returnsFirstArg()).when(carKeyFob).authenticate(carKey)\u003c/code\u003e\u003c/pre\u003e\n     *\n     * @param \u003cT\u003e Return type of the invocation.\n     * @return Answer that will return the first argument of the invocation.\n     *\n     * @since 1.9.5\n     ",
      "child_ranges": [
        "(line 47,col 9)-(line 47,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.AdditionalAnswers.returnsSecondArg()",
      "begin_line": 66,
      "end_line": 68,
      "comment": "\n     * Returns the second parameter of an invocation.\n     *\n     * \u003cp\u003e\n     *     This additional answer could be used at stub time using the\n     *     \u003ccode\u003ethen|do|will{@link org.mockito.stubbing.Answer}\u003c/code\u003e methods. For example :\n     * \u003c/p\u003e\n     *\n     * \u003cpre class\u003d\"code\"\u003e\u003ccode class\u003d\"java\"\u003egiven(trader.apply(leesFormula, onCreditDefaultSwap)).will(returnsSecondArg());\n     * doAnswer(returnsSecondArg()).when(trader).apply(leesFormula, onCreditDefaultSwap)\u003c/code\u003e\u003c/pre\u003e\n     *\n     * @param \u003cT\u003e Return type of the invocation.\n     * @return Answer that will return the second argument of the invocation.\n     *\n     * @since 1.9.5\n     ",
      "child_ranges": [
        "(line 67,col 9)-(line 67,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.AdditionalAnswers.returnsLastArg()",
      "begin_line": 86,
      "end_line": 88,
      "comment": "\n     * Returns the last parameter of an invocation.\n     *\n     * \u003cp\u003e\n     *     This additional answer could be used at stub time using the\n     *     \u003ccode\u003ethen|do|will{@link org.mockito.stubbing.Answer}\u003c/code\u003e methods. For example :\n     * \u003c/p\u003e\n     *\n     * \u003cpre class\u003d\"code\"\u003e\u003ccode class\u003d\"java\"\u003egiven(person.remember(dream1, dream2, dream3, dream4)).will(returnsLastArg());\n     * doAnswer(returnsLastArg()).when(person).remember(dream1, dream2, dream3, dream4)\u003c/code\u003e\u003c/pre\u003e\n     *\n     * @param \u003cT\u003e Return type of the invocation.\n     * @return Answer that will return the last argument of the invocation.\n     *\n     * @since 1.9.5\n     ",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.AdditionalAnswers.returnsArgAt(int)",
      "begin_line": 107,
      "end_line": 109,
      "comment": "\n     * Returns the parameter of an invocation at the given position.\n     *\n     * \u003cp\u003e\n     * This additional answer could be used at stub time using the\n     * \u003ccode\u003ethen|do|will{@link org.mockito.stubbing.Answer}\u003c/code\u003e methods. For example :\n     * \u003c/p\u003e\n     *\n     * \u003cpre class\u003d\"code\"\u003e\u003ccode class\u003d\"java\"\u003egiven(person.remember(dream1, dream2, dream3, dream4)).will(returnsArgAt(3));\n     * doAnswer(returnsArgAt(3)).when(person).remember(dream1, dream2, dream3, dream4)\u003c/code\u003e\u003c/pre\u003e\n     *\n     * @param \u003cT\u003e Return type of the invocation.\n     * @param position index of the argument from the list of arguments.\n     * @return Answer that will return the argument from the given position in the argument\u0027s list\n     *\n     * @since 1.9.5\n     ",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.AdditionalAnswers.delegatesTo(java.lang.Object)",
      "begin_line": 174,
      "end_line": 176,
      "comment": "\n     * An answer that directly forwards the calls to the delegate. The delegate may or may not be of the same type as the mock.\n     * If the type is different, a matching method needs to be found on delegate type otherwise an exception is thrown.\n     * \u003cp\u003e\n     * Useful for spies or partial mocks of objects that are difficult to mock\n     * or spy using the usual spy API. Possible use cases:\n     * \u003cul\u003e\n     *     \u003cli\u003eFinal classes but with an interface\u003c/li\u003e\n     *     \u003cli\u003eAlready custom proxied object\u003c/li\u003e\n     *     \u003cli\u003eSpecial objects with a finalize method, i.e. to avoid executing it 2 times\u003c/li\u003e\n     * \u003c/ul\u003e\n     * For more details including the use cases reported by users take a look at\n     * \u003ca link\u003d\"http://code.google.com/p/mockito/issues/detail?id\u003d145\"\u003eissue 145\u003c/a\u003e.\n     * \u003cp\u003e\n     * The difference with the regular spy:\n     * \u003cul\u003e\n     *   \u003cli\u003e\n     *     The regular spy ({@link Mockito#spy(Object)}) contains \u003cstrong\u003eall\u003c/strong\u003e state from the spied instance\n     *     and the methods are invoked on the spy. The spied instance is only used at mock creation to copy the state from.\n     *     If you call a method on a regular spy and it internally calls other methods on this spy, those calls are remembered\n     *     for verifications, and they can be effectively stubbed.\n     *   \u003c/li\u003e\n     *   \u003cli\u003e\n     *     The mock that delegates simply delegates all methods to the delegate.\n     *     The delegate is used all the time as methods are delegated onto it.\n     *     If you call a method on a mock that delegates and it internally calls other methods on this mock,\n     *     those calls are \u003cstrong\u003enot\u003c/strong\u003e remembered for verifications, stubbing does not have effect on them, too.\n     *     Mock that delegates is less powerful than the regular spy but it is useful when the regular spy cannot be created.\n     *   \u003c/li\u003e\n     * \u003c/ul\u003e\n     * An example with a final class that we want to delegate to:\n     * \u003cp\u003e\n     * \u003cpre class\u003d\"code\"\u003e\u003ccode class\u003d\"java\"\u003e\n     *   final class DontYouDareToMockMe implements list { ... }\n     *\n     *   DontYouDareToMockMe awesomeList \u003d new DontYouDareToMockMe();\n     *\n     *   List mock \u003d mock(List.class, delegatesTo(awesomeList));\n     * \u003c/code\u003e\u003c/pre\u003e\n     *\n     * \u003cp\u003e\n     * This feature suffers from the same drawback as the spy.\n     * The mock will call the delegate if you use regular when().then() stubbing style.\n     * Since the real implementation is called this might have some side effects.\n     * Therefore you should to use the doReturn|Throw|Answer|CallRealMethod stubbing style. Example:\n     *\n     * \u003cpre class\u003d\"code\"\u003e\u003ccode class\u003d\"java\"\u003e\n     *   List listWithDelegate \u003d mock(List.class, AdditionalAnswers.delegatesTo(awesomeList));\n     *\n     *   //Impossible: real method is called so listWithDelegate.get(0) throws IndexOutOfBoundsException (the list is yet empty)\n     *   when(listWithDelegate.get(0)).thenReturn(\"foo\");\n     *\n     *   //You have to use doReturn() for stubbing\n     *   doReturn(\"foo\").when(listWithDelegate).get(0);\n     * \u003c/code\u003e\u003c/pre\u003e\n     *\n     * @param delegate The delegate to forward calls to. It does not have to be of the same type as the mock (although it usually is).\n     *                 The only requirement is that the instance should have compatible method signatures including the return values.\n     *                 Only the methods that were actually executed on the mock need to be present on the delegate type.\n     * @return the answer\n     *\n     * @since 1.9.5\n     ",
      "child_ranges": [
        "(line 175,col 9)-(line 175,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.AdditionalAnswers.returnsElementsOf(java.util.Collection\u003c?\u003e)",
      "begin_line": 195,
      "end_line": 197,
      "comment": "\n     * Returns elements of the collection. Keeps returning the last element forever.\n     * Might be useful on occasion when you have a collection of elements to return.\n     * \u003cp\u003e\n     * \u003cpre class\u003d\"code\"\u003e\u003ccode class\u003d\"java\"\u003e\n     *   //this:\n     *   when(mock.foo()).thenReturn(1, 2, 3);\n     *\n     *   //is equivalent to:\n     *   when(mock.foo()).thenAnswer(new ReturnsElementsOf(Arrays.asList(1, 2, 3)));\n     * \u003c/code\u003e\u003c/pre\u003e\n     *\n     * @param elements The collection of elements to return.\n     * @return the answer\n     *\n     * @since 1.9.5\n     ",
      "child_ranges": [
        "(line 196,col 9)-(line 196,col 59)"
      ]
    }
  ]
}