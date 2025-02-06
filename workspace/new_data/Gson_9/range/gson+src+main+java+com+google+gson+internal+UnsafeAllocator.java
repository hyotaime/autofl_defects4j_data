{
  "filepath": "/tmp/Gson-9b/gson/src/main/java/com/google/gson/internal/UnsafeAllocator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "UnsafeAllocator",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 31,
      "end_line": 123,
      "comment": "\n * Do sneaky things to allocate objects without invoking their constructors.\n *\n * @author Joel Leitch\n * @author Jesse Wilson\n "
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.UnsafeAllocator.newInstance(java.lang.Class\u003cT\u003e)",
      "begin_line": 32,
      "end_line": 32,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.UnsafeAllocator.create()",
      "begin_line": 34,
      "end_line": 107,
      "comment": "",
      "child_ranges": [
        "(line 39,col 5)-(line 54,col 5)",
        "(line 61,col 5)-(line 78,col 5)",
        "(line 85,col 5)-(line 98,col 5)",
        "(line 101,col 5)-(line 106,col 6)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.UnsafeAllocator.Anonymous-e47f4b74-e0dd-429a-a7cf-4223d616b9bc.newInstance(java.lang.Class\u003cT\u003e)",
      "begin_line": 46,
      "end_line": 51,
      "comment": "",
      "child_ranges": [
        "(line 49,col 11)-(line 49,col 32)",
        "(line 50,col 11)-(line 50,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.UnsafeAllocator.Anonymous-3ec856bd-3af7-4951-8b20-d9670386b049.newInstance(java.lang.Class\u003cT\u003e)",
      "begin_line": 70,
      "end_line": 75,
      "comment": "",
      "child_ranges": [
        "(line 73,col 11)-(line 73,col 32)",
        "(line 74,col 11)-(line 74,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.UnsafeAllocator.Anonymous-c3ed4ce6-e251-49fa-9904-17a80dd65a60.newInstance(java.lang.Class\u003cT\u003e)",
      "begin_line": 90,
      "end_line": 95,
      "comment": "",
      "child_ranges": [
        "(line 93,col 11)-(line 93,col 32)",
        "(line 94,col 11)-(line 94,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.UnsafeAllocator.Anonymous-ef6bd0d3-8e59-48c8-bd95-02bcce5fbdcb.newInstance(java.lang.Class\u003cT\u003e)",
      "begin_line": 102,
      "end_line": 105,
      "comment": "",
      "child_ranges": [
        "(line 104,col 9)-(line 104,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.UnsafeAllocator.assertInstantiable(java.lang.Class\u003c?\u003e)",
      "begin_line": 114,
      "end_line": 122,
      "comment": "\n   * Check if the class can be instantiated by unsafe allocator. If the instance has interface or abstract modifiers\n   * throw an {@link java.lang.UnsupportedOperationException}\n   * @param c instance of the class to be checked\n   ",
      "child_ranges": [
        "(line 115,col 5)-(line 115,col 37)",
        "(line 116,col 5)-(line 118,col 5)",
        "(line 119,col 5)-(line 121,col 5)"
      ]
    }
  ]
}