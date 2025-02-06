{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/graph/UnionFind.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "UnionFind",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 36,
      "end_line": 88,
      "comment": "\n * Union-Find is a classical algorithm used to find connected components in\n * graph theory.\n *\n * \u003cp\u003eEach equivalence class has a representative element that is chosen\n * arbitrarily and is used to determine if two elements are members of the same\n * class.\n *\n * \u003cp\u003eSee \u003ca\n * href\u003d\"http://www.algorithmist.com/index.php?title\u003dUnion_Find\u0026oldid\u003d7575\"\u003e\n * algorithmist\u003c/a\u003e for more detail.\n *\n * @param \u003cE\u003e element type\n "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.UnionFind.add(E)",
      "begin_line": 44,
      "end_line": 44,
      "comment": "\n   * Adds the given element to a new set if it is not already in a set.\n   *\n   * @throws UnsupportedOperationException if the add operation is not\n   *     supported by this union-find.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.UnionFind.union(E, E)",
      "begin_line": 54,
      "end_line": 54,
      "comment": "\n   * Unions the equivalence classes of {@code a} and {@code b} and returns the\n   * representative of the resulting equivalence class.  The elements will be\n   * added if they are not already present.\n   *\n   * @throws UnsupportedOperationException if the add operation is not\n   *     supported by this union-find.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.UnionFind.find(E)",
      "begin_line": 57,
      "end_line": 57,
      "comment": " Returns the representative of the equivalence class of {@code e}. ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.UnionFind.areEquivalent(E, E)",
      "begin_line": 66,
      "end_line": 66,
      "comment": "\n   * Returns true if {@code a} and {@code b} belong to the same equivalence\n   * class.\n   *\n   * @throws IllegalArgumentException if any argument is not an element of this\n   *     structure.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.UnionFind.elements()",
      "begin_line": 69,
      "end_line": 69,
      "comment": " Returns an unmodifiable set of all elements added to the UnionFind. ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.UnionFind.allEquivalenceClasses()",
      "begin_line": 76,
      "end_line": 76,
      "comment": "\n   * Returns an immutable collection containing all equivalence classes.  The\n   * returned collection represents a snapshot of the current state and will not\n   * reflect changes made to the data structure.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.UnionFind.findAll(E)",
      "begin_line": 86,
      "end_line": 86,
      "comment": "\n   * Returns the elements in the same equivalence class as {@code value}.\n   *\n   * @return an unmodifiable view. As equivalence classes are merged, this set\n   *     will reflect those changes.\n   * @throws IllegalArgumentException if a requested element does not belong\n   *     to the structure.\n   ",
      "child_ranges": []
    }
  ]
}