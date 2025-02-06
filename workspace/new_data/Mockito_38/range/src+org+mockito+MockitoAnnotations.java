{
  "filepath": "/tmp/Mockito-38b/src/org/mockito/MockitoAnnotations.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MockitoAnnotations",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 56,
      "end_line": 112,
      "comment": "\n * \u003cul\u003e\n * \u003cli\u003eAllows shorthand mock creation.\u003c/li\u003e \n * \u003cli\u003eMinimizes repetitive mock creation code.\u003c/li\u003e \n * \u003cli\u003eMakes the test class more readable.\u003c/li\u003e\n * \u003cli\u003eMakes the verification error easier to read because \u003cb\u003efield name\u003c/b\u003e is used to identify the mock.\u003c/li\u003e\n * \u003c/ul\u003e\n * \n * \u003cpre\u003e\n *   public class ArticleManagerTest extends SampleBaseTestCase { \n *     \n *       \u0026#064;Mock private ArticleCalculator calculator;\n *       \u0026#064;Mock private ArticleDatabase database;\n *       \u0026#064;Mock private UserProvider userProvider;\n *     \n *       private ArticleManager manager;\n *     \n *       \u0026#064;Before public void setup() {\n *           manager \u003d new ArticleManager(userProvider, database, calculator);\n *       }\n *   }\n *   \n *   public class SampleBaseTestCase {\n *   \n *       \u0026#064;Before public void initMocks() {\n *           MockitoAnnotations.initMocks(this);\n *       }\n *   }\n * \u003c/pre\u003e\n * \n * \u003cb\u003e\u003ccode\u003eMockitoAnnotations.initMocks(this)\u003c/code\u003e\u003c/b\u003e method has to called to initialize annotated mocks.\n * \u003cp\u003e\n * In above example, \u003ccode\u003einitMocks()\u003c/code\u003e is called in \u0026#064;Before (JUnit4) method of test\u0027s base class. \n * For JUnit3 \u003ccode\u003einitMocks()\u003c/code\u003e can go to \u003ccode\u003esetup()\u003c/code\u003e method of a base class.\n * You can also put initMocks() in your JUnit runner (\u0026#064;RunWith) or use built-in runner: {@link MockitoJUnitRunner}\n "
    },
    {
      "type": "method",
      "signature": "org.mockito.MockitoAnnotations.initMocks(java.lang.Object)",
      "begin_line": 80,
      "end_line": 90,
      "comment": "\n     * Initializes objects annotated with \u0026#064;Mock for given testClass.\n     * \u003cp\u003e\n     * See examples in javadoc for {@link MockitoAnnotations} class.\n     ",
      "child_ranges": [
        "(line 81,col 9)-(line 83,col 9)",
        "(line 85,col 9)-(line 85,col 46)",
        "(line 86,col 9)-(line 89,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.MockitoAnnotations.scan(java.lang.Object, java.lang.Class\u003c?\u003e)",
      "begin_line": 92,
      "end_line": 111,
      "comment": "",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 92)",
        "(line 94,col 9)-(line 94,col 51)",
        "(line 95,col 9)-(line 110,col 9)"
      ]
    }
  ]
}