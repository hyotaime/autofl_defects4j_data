{
  "filepath": "/tmp/Gson-9b/gson/src/test/java/com/google/gson/internal/UnsafeAllocatorInstantiationTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "UnsafeAllocatorInstantiationTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 24,
      "end_line": 74,
      "comment": "\n * Test unsafe allocator instantiation\n * @author Ugljesa Jovanovic\n "
    },
    {
      "type": "class_interface",
      "name": "Interface",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 26,
      "end_line": 27,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "AbstractClass",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 29,
      "end_line": 30,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "ConcreteClass",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 32,
      "end_line": 33,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.UnsafeAllocatorInstantiationTest.testInterfaceInstantiation()",
      "begin_line": 39,
      "end_line": 47,
      "comment": "\n   * Ensure that the {@link java.lang.UnsupportedOperationException} is thrown when  trying\n   * to instantiate an interface\n   ",
      "child_ranges": [
        "(line 40,col 5)-(line 40,col 63)",
        "(line 41,col 5)-(line 46,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.UnsafeAllocatorInstantiationTest.testAbstractClassInstantiation()",
      "begin_line": 53,
      "end_line": 61,
      "comment": "\n   * Ensure that the {@link java.lang.UnsupportedOperationException} is thrown when  trying\n   * to instantiate an abstract class\n   ",
      "child_ranges": [
        "(line 54,col 5)-(line 54,col 63)",
        "(line 55,col 5)-(line 60,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.UnsafeAllocatorInstantiationTest.testConcreteClassInstantiation()",
      "begin_line": 66,
      "end_line": 73,
      "comment": "\n   * Ensure that no exception is thrown when trying to instantiate a concrete class\n   ",
      "child_ranges": [
        "(line 67,col 5)-(line 67,col 63)",
        "(line 68,col 5)-(line 72,col 5)"
      ]
    }
  ]
}