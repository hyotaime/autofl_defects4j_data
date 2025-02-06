{
  "filepath": "/tmp/Mockito-38b/test/org/mockito/internal/creation/jmock/ClassImposterizerTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ClassImposterizerTest",
      "is_interface": false,
      "parent_types": [
        "TestBase"
      ],
      "begin_line": 17,
      "end_line": 85,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.creation.jmock.ClassImposterizerTest.shouldCreateMockFromInterface()",
      "begin_line": 20,
      "end_line": 26,
      "comment": "",
      "child_ranges": [
        "(line 22,col 9)-(line 22,col 119)",
        "(line 24,col 9)-(line 24,col 60)",
        "(line 25,col 9)-(line 25,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.creation.jmock.ClassImposterizerTest.shouldCreateMockFromClass()",
      "begin_line": 28,
      "end_line": 34,
      "comment": "",
      "child_ranges": [
        "(line 30,col 9)-(line 30,col 139)",
        "(line 32,col 9)-(line 32,col 60)",
        "(line 33,col 9)-(line 33,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.creation.jmock.ClassImposterizerTest.shouldCreateMockFromClassEvenWhenConstructorIsDodgy()",
      "begin_line": 36,
      "end_line": 45,
      "comment": "",
      "child_ranges": [
        "(line 38,col 9)-(line 41,col 32)",
        "(line 43,col 9)-(line 43,col 142)",
        "(line 44,col 9)-(line 44,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.creation.jmock.ClassImposterizerTest.shouldMocksHaveDifferentInterceptors()",
      "begin_line": 47,
      "end_line": 56,
      "comment": "",
      "child_ranges": [
        "(line 49,col 9)-(line 49,col 113)",
        "(line 50,col 9)-(line 50,col 113)",
        "(line 52,col 9)-(line 52,col 52)",
        "(line 53,col 9)-(line 53,col 52)",
        "(line 55,col 9)-(line 55,col 86)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.creation.jmock.ClassImposterizerTest.shouldUseAnicilliaryTypes()",
      "begin_line": 58,
      "end_line": 59,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "class_interface",
      "name": "SomeInterface",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 68,
      "end_line": 68,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "SomeClass",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 70,
      "end_line": 70,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "ClassWithoutConstructor",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 71,
      "end_line": 71,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "ClassWithDodgyConstructor",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 73,
      "end_line": 77,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.mockito.internal.creation.jmock.ClassImposterizerTest.ClassWithDodgyConstructor.ClassWithDodgyConstructor()",
      "begin_line": 74,
      "end_line": 76,
      "comment": "",
      "child_ranges": [
        "(line 75,col 13)-(line 75,col 41)"
      ]
    },
    {
      "type": "class_interface",
      "name": "MethodInterceptorStub",
      "is_interface": false,
      "parent_types": [
        "org.mockito.cglib.proxy.MethodInterceptor"
      ],
      "begin_line": 79,
      "end_line": 84,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.creation.jmock.ClassImposterizerTest.MethodInterceptorStub.intercept(java.lang.Object, java.lang.reflect.Method, java.lang.Object[], org.mockito.cglib.proxy.MethodProxy)",
      "begin_line": 81,
      "end_line": 83,
      "comment": "",
      "child_ranges": [
        "(line 82,col 13)-(line 82,col 24)"
      ]
    }
  ]
}