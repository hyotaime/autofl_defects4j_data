{
  "filepath": "/tmp/Mockito-18b/src/org/mockito/internal/util/DefaultMockingDetails.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DefaultMockingDetails",
      "is_interface": false,
      "parent_types": [
        "org.mockito.MockingDetails"
      ],
      "begin_line": 15,
      "end_line": 43,
      "comment": "\n * Class to inspect any object, and identify whether a particular object is either a mock or a spy.  This is\n * a wrapper for {@link org.mockito.internal.util.MockUtil}.\n "
    },
    {
      "type": "field",
      "varNames": [
        "toInspect"
      ],
      "begin_line": 17,
      "end_line": 17,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "delegate"
      ],
      "begin_line": 18,
      "end_line": 18,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.mockito.internal.util.DefaultMockingDetails.DefaultMockingDetails(java.lang.Object, org.mockito.internal.util.MockUtil)",
      "begin_line": 20,
      "end_line": 23,
      "comment": "",
      "child_ranges": [
        "(line 21,col 9)-(line 21,col 35)",
        "(line 22,col 9)-(line 22,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.DefaultMockingDetails.isMock()",
      "begin_line": 28,
      "end_line": 30,
      "comment": "\n     * Find out whether the object is a mock.\n     * @return true if the object is a mock or a spy.\n     ",
      "child_ranges": [
        "(line 29,col 9)-(line 29,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.DefaultMockingDetails.isSpy()",
      "begin_line": 36,
      "end_line": 38,
      "comment": "\n     * Find out whether the object is a spy.\n     * @return true if the object is a spy.\n     ",
      "child_ranges": [
        "(line 37,col 9)-(line 37,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.DefaultMockingDetails.getInvocations()",
      "begin_line": 40,
      "end_line": 42,
      "comment": "",
      "child_ranges": [
        "(line 41,col 9)-(line 41,col 92)"
      ]
    }
  ]
}