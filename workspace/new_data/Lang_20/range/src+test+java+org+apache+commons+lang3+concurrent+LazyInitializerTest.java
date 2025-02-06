{
  "filepath": "/tmp/Lang-20b/src/test/java/org/apache/commons/lang3/concurrent/LazyInitializerTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "LazyInitializerTest",
      "is_interface": false,
      "parent_types": [
        "AbstractConcurrentInitializerTest"
      ],
      "begin_line": 26,
      "end_line": 58,
      "comment": "\n * Test class for {@code LazyInitializer}.\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "initializer"
      ],
      "begin_line": 28,
      "end_line": 28,
      "comment": " The initializer to be tested. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.LazyInitializerTest.setUp()",
      "begin_line": 30,
      "end_line": 33,
      "comment": "",
      "child_ranges": [
        "(line 32,col 9)-(line 32,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.LazyInitializerTest.createInitializer()",
      "begin_line": 41,
      "end_line": 44,
      "comment": "\n     * Returns the initializer to be tested. This implementation returns the\n     * {@code LazyInitializer} created in the {@code setUp()} method.\n     *\n     * @return the initializer to be tested\n     ",
      "child_ranges": [
        "(line 43,col 9)-(line 43,col 27)"
      ]
    },
    {
      "type": "class_interface",
      "name": "LazyInitializerTestImpl",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.concurrent.LazyInitializer\u003cjava.lang.Object\u003e"
      ],
      "begin_line": 51,
      "end_line": 57,
      "comment": "\n     * A test implementation of LazyInitializer. This class creates a plain\n     * Object. As Object does not provide a specific equals() method, it is easy\n     * to check whether multiple instances were created.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.LazyInitializerTest.LazyInitializerTestImpl.initialize()",
      "begin_line": 53,
      "end_line": 56,
      "comment": "",
      "child_ranges": [
        "(line 55,col 13)-(line 55,col 32)"
      ]
    }
  ]
}