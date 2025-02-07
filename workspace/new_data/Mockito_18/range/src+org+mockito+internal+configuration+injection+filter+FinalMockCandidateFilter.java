{
  "filepath": "/tmp/Mockito-18b/src/org/mockito/internal/configuration/injection/filter/FinalMockCandidateFilter.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FinalMockCandidateFilter",
      "is_interface": false,
      "parent_types": [
        "org.mockito.internal.configuration.injection.filter.MockCandidateFilter"
      ],
      "begin_line": 22,
      "end_line": 48,
      "comment": "\n * This node returns an actual injecter which will be either :\n *\n * \u003cul\u003e\n * \u003cli\u003ean {@link OngoingInjecter} that do nothing if a candidate couldn\u0027t be found\u003c/li\u003e\n * \u003cli\u003ean {@link OngoingInjecter} that will try to inject the candidate trying first the property setter then if not possible try the field access\u003c/li\u003e\n * \u003c/ul\u003e\n "
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter.filterCandidate(java.util.Collection\u003cjava.lang.Object\u003e, java.lang.reflect.Field, java.lang.Object)",
      "begin_line": 23,
      "end_line": 47,
      "comment": "",
      "child_ranges": [
        "(line 24,col 9)-(line 39,col 9)",
        "(line 41,col 9)-(line 45,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter.Anonymous-02efc463-f053-4feb-a208-52b4bac5772e.thenInject()",
      "begin_line": 28,
      "end_line": 37,
      "comment": "",
      "child_ranges": [
        "(line 29,col 21)-(line 35,col 21)",
        "(line 36,col 21)-(line 36,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter.Anonymous-069174de-4c57-4217-bb72-a8b9061fba4a.thenInject()",
      "begin_line": 42,
      "end_line": 44,
      "comment": "",
      "child_ranges": [
        "(line 43,col 17)-(line 43,col 28)"
      ]
    }
  ]
}