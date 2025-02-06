{
  "filepath": "/tmp/Jsoup-22b/src/main/java/org/jsoup/helper/DescendableLinkedList.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DescendableLinkedList",
      "is_interface": false,
      "parent_types": [
        "java.util.LinkedList\u003cE\u003e"
      ],
      "begin_line": 10,
      "end_line": 82,
      "comment": "\n * Provides a descending iterator and other 1.6 methods to allow support on the 1.5 JRE.\n "
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.helper.DescendableLinkedList.DescendableLinkedList()",
      "begin_line": 15,
      "end_line": 17,
      "comment": "\n     * Create a new DescendableLinkedList.\n     ",
      "child_ranges": [
        "(line 16,col 9)-(line 16,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.DescendableLinkedList.push(E)",
      "begin_line": 23,
      "end_line": 25,
      "comment": "\n     * Add a new element to the start of the list.\n     * @param e element to add\n     ",
      "child_ranges": [
        "(line 24,col 9)-(line 24,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.DescendableLinkedList.peekLast()",
      "begin_line": 31,
      "end_line": 33,
      "comment": "\n     * Look at the last element, if there is one.\n     * @return the last element, or null\n     ",
      "child_ranges": [
        "(line 32,col 9)-(line 32,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.DescendableLinkedList.pollLast()",
      "begin_line": 39,
      "end_line": 41,
      "comment": "\n     * Remove and return the last element, if there is one\n     * @return the last element, or null\n     ",
      "child_ranges": [
        "(line 40,col 9)-(line 40,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.DescendableLinkedList.descendingIterator()",
      "begin_line": 47,
      "end_line": 49,
      "comment": "\n     * Get an iterator that starts and the end of the list and works towards the start.\n     * @return an iterator that starts and the end of the list and works towards the start.\n     ",
      "child_ranges": [
        "(line 48,col 9)-(line 48,col 49)"
      ]
    },
    {
      "type": "class_interface",
      "name": "DescendingIterator",
      "is_interface": false,
      "parent_types": [
        "java.util.Iterator\u003cE\u003e"
      ],
      "begin_line": 51,
      "end_line": 81,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "iter"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.helper.DescendableLinkedList.DescendingIterator.DescendingIterator(int)",
      "begin_line": 54,
      "end_line": 57,
      "comment": "",
      "child_ranges": [
        "(line 56,col 13)-(line 56,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.DescendableLinkedList.DescendingIterator.hasNext()",
      "begin_line": 63,
      "end_line": 65,
      "comment": "\n         * Check if there is another element on the list.\n         * @return if another element\n         ",
      "child_ranges": [
        "(line 64,col 13)-(line 64,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.DescendableLinkedList.DescendingIterator.next()",
      "begin_line": 71,
      "end_line": 73,
      "comment": "\n         * Get the next element.\n         * @return the next element.\n         ",
      "child_ranges": [
        "(line 72,col 13)-(line 72,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.DescendableLinkedList.DescendingIterator.remove()",
      "begin_line": 78,
      "end_line": 80,
      "comment": "\n         * Remove the current element.\n         ",
      "child_ranges": [
        "(line 79,col 13)-(line 79,col 26)"
      ]
    }
  ]
}