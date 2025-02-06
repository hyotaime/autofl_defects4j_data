{
  "filepath": "/tmp/Chart-16b/source/org/jfree/chart/ui/ProjectInfo.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ProjectInfo",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.ui.BasicProjectInfo"
      ],
      "begin_line": 53,
      "end_line": 214,
      "comment": "\n * A class for recording the basic information about a free or open source \n * software project.\n "
    },
    {
      "type": "field",
      "varNames": [
        "logo"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": " An optional project logo. "
    },
    {
      "type": "field",
      "varNames": [
        "licenceText"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": " The licence text. "
    },
    {
      "type": "field",
      "varNames": [
        "contributors"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": " A list of contributors. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.ui.ProjectInfo.ProjectInfo()",
      "begin_line": 67,
      "end_line": 69,
      "comment": "\n     * Constructs an empty project info object.\n     ",
      "child_ranges": []
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.ui.ProjectInfo.ProjectInfo(java.lang.String, java.lang.String, java.lang.String, java.awt.Image, java.lang.String, java.lang.String, java.lang.String)",
      "begin_line": 82,
      "end_line": 94,
      "comment": "\n     * Constructs a project info object.\n     *\n     * @param name  the name of the project.\n     * @param version  the version.\n     * @param info  other info (usually a URL).\n     * @param logo  the project logo.\n     * @param copyright  a copyright statement.\n     * @param licenceName  the name of the licence that applies to the project.\n     * @param licenceText  the text of the licence that applies to the project.\n     ",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 59)",
        "(line 91,col 9)-(line 91,col 25)",
        "(line 92,col 9)-(line 92,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ui.ProjectInfo.getLogo()",
      "begin_line": 101,
      "end_line": 103,
      "comment": "\n     * Returns the logo.\n     *\n     * @return the project logo.\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ui.ProjectInfo.setLogo(java.awt.Image)",
      "begin_line": 110,
      "end_line": 112,
      "comment": "\n     * Sets the project logo.\n     *\n     * @param logo  the project logo.\n     ",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ui.ProjectInfo.getLicenceText()",
      "begin_line": 119,
      "end_line": 121,
      "comment": "\n     * Returns the licence text.\n     *\n     * @return the licence text.\n     ",
      "child_ranges": [
        "(line 120,col 9)-(line 120,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ui.ProjectInfo.setLicenceText(java.lang.String)",
      "begin_line": 128,
      "end_line": 130,
      "comment": "\n     * Sets the project licence text.\n     *\n     * @param licenceText  the licence text.\n     ",
      "child_ranges": [
        "(line 129,col 9)-(line 129,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ui.ProjectInfo.getContributors()",
      "begin_line": 137,
      "end_line": 139,
      "comment": "\n     * Returns the list of contributors for the project.\n     *\n     * @return the list of contributors.\n     ",
      "child_ranges": [
        "(line 138,col 9)-(line 138,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ui.ProjectInfo.setContributors(java.util.List)",
      "begin_line": 146,
      "end_line": 148,
      "comment": "\n     * Sets the list of contributors.\n     *\n     * @param contributors  the list of contributors.\n     ",
      "child_ranges": [
        "(line 147,col 9)-(line 147,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ui.ProjectInfo.toString()",
      "begin_line": 155,
      "end_line": 212,
      "comment": "\n     * Returns a string describing the project.\n     *\n     * @return a string describing the project.\n     ",
      "child_ranges": [
        "(line 157,col 9)-(line 157,col 55)",
        "(line 158,col 9)-(line 158,col 33)",
        "(line 159,col 9)-(line 159,col 35)",
        "(line 160,col 9)-(line 160,col 36)",
        "(line 161,col 9)-(line 161,col 29)",
        "(line 162,col 9)-(line 162,col 38)",
        "(line 163,col 9)-(line 163,col 29)",
        "(line 164,col 9)-(line 164,col 28)",
        "(line 165,col 9)-(line 165,col 68)",
        "(line 166,col 9)-(line 166,col 28)",
        "(line 167,col 9)-(line 167,col 46)",
        "(line 168,col 9)-(line 168,col 33)",
        "(line 169,col 9)-(line 169,col 28)",
        "(line 170,col 9)-(line 170,col 39)",
        "(line 171,col 9)-(line 183,col 9)",
        "(line 185,col 9)-(line 185,col 28)",
        "(line 186,col 9)-(line 186,col 50)",
        "(line 187,col 9)-(line 187,col 33)",
        "(line 188,col 9)-(line 188,col 27)",
        "(line 189,col 9)-(line 189,col 51)",
        "(line 190,col 9)-(line 203,col 9)",
        "(line 204,col 9)-(line 204,col 28)",
        "(line 205,col 9)-(line 205,col 33)",
        "(line 206,col 9)-(line 206,col 41)",
        "(line 207,col 9)-(line 207,col 28)",
        "(line 208,col 9)-(line 208,col 40)",
        "(line 210,col 9)-(line 210,col 33)"
      ]
    }
  ]
}