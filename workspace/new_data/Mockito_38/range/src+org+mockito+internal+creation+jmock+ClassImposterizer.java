{
  "filepath": "/tmp/Mockito-38b/src/org/mockito/internal/creation/jmock/ClassImposterizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ClassImposterizer",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 28,
      "end_line": 131,
      "comment": "\r\n * Thanks to jMock guys for this handy class that wraps all the cglib magic. \r\n "
    },
    {
      "type": "field",
      "varNames": [
        "INSTANCE"
      ],
      "begin_line": 30,
      "end_line": 30,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.mockito.internal.creation.jmock.ClassImposterizer.ClassImposterizer()",
      "begin_line": 32,
      "end_line": 32,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "field",
      "varNames": [
        "objenesis"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": "TODO: after 1.8, for the same reason catch and give better feedback when hamcrest core is not found."
    },
    {
      "type": "field",
      "varNames": [
        "NAMING_POLICY_THAT_ALLOWS_IMPOSTERISATION_OF_CLASSES_IN_SIGNED_PACKAGES"
      ],
      "begin_line": 39,
      "end_line": 44,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.creation.jmock.ClassImposterizer.Anonymous-76a35481-b881-4a5f-8136-6e3cddaecc9f.getClassName(java.lang.String, java.lang.String, java.lang.Object, org.mockito.cglib.core.Predicate)",
      "begin_line": 40,
      "end_line": 43,
      "comment": "",
      "child_ranges": [
        "(line 42,col 13)-(line 42,col 79)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "IGNORE_BRIDGE_METHODS"
      ],
      "begin_line": 46,
      "end_line": 50,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.creation.jmock.ClassImposterizer.Anonymous-43e71fe5-9b4c-4312-b3f4-67ecf8b49fb3.accept(java.lang.reflect.Method)",
      "begin_line": 47,
      "end_line": 49,
      "comment": "",
      "child_ranges": [
        "(line 48,col 13)-(line 48,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.creation.jmock.ClassImposterizer.canImposterise(java.lang.Class\u003c?\u003e)",
      "begin_line": 52,
      "end_line": 54,
      "comment": "",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 105)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.creation.jmock.ClassImposterizer.imposterise(org.mockito.cglib.proxy.MethodInterceptor, java.lang.Class\u003cT\u003e, java.lang.Class\u003c?\u003e...)",
      "begin_line": 56,
      "end_line": 64,
      "comment": "",
      "child_ranges": [
        "(line 57,col 9)-(line 63,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.creation.jmock.ClassImposterizer.setConstructorsAccessible(java.lang.Class\u003c?\u003e, boolean)",
      "begin_line": 66,
      "end_line": 70,
      "comment": "",
      "child_ranges": [
        "(line 67,col 9)-(line 69,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.creation.jmock.ClassImposterizer.createProxyClass(java.lang.Class\u003c?\u003e, java.lang.Class\u003c?\u003e...)",
      "begin_line": 72,
      "end_line": 115,
      "comment": "",
      "child_ranges": [
        "(line 73,col 9)-(line 75,col 9)",
        "(line 77,col 9)-(line 83,col 10)",
        "(line 84,col 9)-(line 84,col 83)",
        "(line 85,col 9)-(line 85,col 37)",
        "(line 86,col 9)-(line 92,col 9)",
        "(line 93,col 9)-(line 93,col 84)",
        "(line 94,col 9)-(line 94,col 58)",
        "(line 95,col 9)-(line 99,col 9)",
        "(line 101,col 9)-(line 114,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.creation.jmock.ClassImposterizer.Anonymous-1c1c0d25-9fdf-44d0-bf98-f5d76696109b.filterConstructors(java.lang.Class, java.util.List)",
      "begin_line": 78,
      "end_line": 82,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.creation.jmock.ClassImposterizer.createProxy(java.lang.Class\u003c?\u003e, org.mockito.cglib.proxy.MethodInterceptor)",
      "begin_line": 117,
      "end_line": 121,
      "comment": "",
      "child_ranges": [
        "(line 118,col 9)-(line 118,col 68)",
        "(line 119,col 9)-(line 119,col 72)",
        "(line 120,col 9)-(line 120,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.creation.jmock.ClassImposterizer.prepend(java.lang.Class\u003c?\u003e, java.lang.Class\u003c?\u003e...)",
      "begin_line": 123,
      "end_line": 128,
      "comment": "",
      "child_ranges": [
        "(line 124,col 9)-(line 124,col 53)",
        "(line 125,col 9)-(line 125,col 23)",
        "(line 126,col 9)-(line 126,col 55)",
        "(line 127,col 9)-(line 127,col 19)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ClassWithSuperclassToWorkAroundCglibBug",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 130,
      "end_line": 130,
      "comment": ""
    }
  ]
}