{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/jscomp/graph/UnionFind.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "UnionFind",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 35,
      "end_line": 87,
      "comment": "\n * Union-Find is a classical algorithm used to find connected components in\n * graph theory.\n *\n * \u003cp\u003eEach equivalence class has a representative element that is chosen\n * arbitrarily and is used to determine if two elements are members of the same\n * class.\n *\n * \u003cp\u003eSee \u003ca\n * href\u003d\"http://www.algorithmist.com/index.php?title\u003dUnion_Find\u0026oldid\u003d7575\"\u003e\n * algorithmist\u003c/a\u003e for more detail.\n *\n * @param \u003cE\u003e element type\n "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.UnionFind.add(E)",
      "begin_line": 43,
      "end_line": 43,
      "comment": "\n   * Adds the given element to a new set if it is not already in a set.\n   *\n   * @throws UnsupportedOperationException if the add operation is not\n   *     supported by this union-find.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.UnionFind.union(E, E)",
      "begin_line": 53,
      "end_line": 53,
      "comment": "\n   * Unions the equivalence classes of {@code a} and {@code b} and returns the\n   * representative of the resulting equivalence class.  The elements will be\n   * added if they are not already present.\n   *\n   * @throws UnsupportedOperationException if the add operation is not\n   *     supported by this union-find.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.UnionFind.find(E)",
      "begin_line": 56,
      "end_line": 56,
      "comment": " Returns the representative of the equivalence class of {@code e}. ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.UnionFind.areEquivalent(E, E)",
      "begin_line": 65,
      "end_line": 65,
      "comment": "\n   * Returns true if {@code a} and {@code b} belong to the same equivalence\n   * class.\n   *\n   * @throws IllegalArgumentException if any argument is not an element of this\n   *     structure.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.UnionFind.elements()",
      "begin_line": 68,
      "end_line": 68,
      "comment": " Returns an unmodifiable set of all elements added to the UnionFind. ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.UnionFind.allEquivalenceClasses()",
      "begin_line": 75,
      "end_line": 75,
      "comment": "\n   * Returns an immutable collection containing all equivalence classes.  The\n   * returned collection represents a snapshot of the current state and will not\n   * reflect changes made to the data structure.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.UnionFind.findAll(E)",
      "begin_line": 85,
      "end_line": 85,
      "comment": "\n   * Returns the elements in the same equivalence class as {@code value}.\n   *\n   * @return an unmodifiable view. As equivalence classes are merged, this set\n   *     will reflect those changes.\n   * @throws IllegalArgumentException if a requested element does not belong\n   *     to the structure.\n   ",
      "child_ranges": []
    }
  ]
}