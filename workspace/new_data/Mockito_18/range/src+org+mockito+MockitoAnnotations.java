{
  "filepath": "/tmp/Mockito-18b/src/org/mockito/MockitoAnnotations.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MockitoAnnotations",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 64,
      "end_line": 142,
      "comment": "\n * MockitoAnnotations.initMocks(this); initializes fields annotated with Mockito annotations.\n * \u003cp\u003e  \n * \u003cul\u003e\n * \u003cli\u003eAllows shorthand creation of objects required for testing.\u003c/li\u003e \n * \u003cli\u003eMinimizes repetitive mock creation code.\u003c/li\u003e \n * \u003cli\u003eMakes the test class more readable.\u003c/li\u003e\n * \u003cli\u003eMakes the verification error easier to read because \u003cb\u003efield name\u003c/b\u003e is used to identify the mock.\u003c/li\u003e\n * \u003c/ul\u003e\n * \n * \u003cpre class\u003d\"code\"\u003e\u003ccode class\u003d\"java\"\u003e\n *   public class ArticleManagerTest extends SampleBaseTestCase { \n *     \n *       \u0026#064;Mock private ArticleCalculator calculator;\n *       \u0026#064;Mock private ArticleDatabase database;\n *       \u0026#064;Mock private UserProvider userProvider;\n *     \n *       private ArticleManager manager;\n *     \n *       \u0026#064;Before public void setup() {\n *           manager \u003d new ArticleManager(userProvider, database, calculator);\n *       }\n *   }\n *   \n *   public class SampleBaseTestCase {\n *   \n *       \u0026#064;Before public void initMocks() {\n *           MockitoAnnotations.initMocks(this);\n *       }\n *   }\n * \u003c/code\u003e\u003c/pre\u003e\n * \u003cp\u003e\n * Read also about other annotations \u0026#064;{@link Spy}, \u0026#064;{@link Captor}, \u0026#064;{@link InjectMocks}\n * \u003cp\u003e\n * \u003cb\u003e\u003ccode\u003eMockitoAnnotations.initMocks(this)\u003c/code\u003e\u003c/b\u003e method has to called to initialize annotated fields.\n * \u003cp\u003e\n * In above example, \u003ccode\u003einitMocks()\u003c/code\u003e is called in \u0026#064;Before (JUnit4) method of test\u0027s base class. \n * For JUnit3 \u003ccode\u003einitMocks()\u003c/code\u003e can go to \u003ccode\u003esetup()\u003c/code\u003e method of a base class.\n * You can also put initMocks() in your JUnit runner (\u0026#064;RunWith) or use built-in runner: {@link MockitoJUnitRunner}\n "
    },
    {
      "type": "method",
      "signature": "org.mockito.MockitoAnnotations.initMocks(java.lang.Object)",
      "begin_line": 89,
      "end_line": 109,
      "comment": "\n     * Initializes objects annotated with Mockito annotations for given testClass:\n     *  \u0026#064;{@link org.mockito.Mock}, \u0026#064;{@link Spy}, \u0026#064;{@link Captor}, \u0026#064;{@link InjectMocks} \n     * \u003cp\u003e\n     * See examples in javadoc for {@link MockitoAnnotations} class.\n     ",
      "child_ranges": [
        "(line 90,col 9)-(line 92,col 9)",
        "(line 94,col 9)-(line 94,col 92)",
        "(line 95,col 9)-(line 95,col 46)",
        "(line 98,col 9)-(line 105,col 9)",
        "(line 108,col 9)-(line 108,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.MockitoAnnotations.scanDeprecatedWay(org.mockito.configuration.AnnotationEngine, java.lang.Object, java.lang.Class\u003c?\u003e)",
      "begin_line": 111,
      "end_line": 117,
      "comment": "",
      "child_ranges": [
        "(line 112,col 9)-(line 112,col 51)",
        "(line 114,col 9)-(line 116,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.MockitoAnnotations.processAnnotationDeprecatedWay(org.mockito.configuration.AnnotationEngine, java.lang.Object, java.lang.reflect.Field)",
      "begin_line": 119,
      "end_line": 135,
      "comment": "",
      "child_ranges": [
        "(line 121,col 9)-(line 121,col 40)",
        "(line 122,col 9)-(line 134,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.MockitoAnnotations.throwIfAlreadyAssigned(java.lang.reflect.Field, boolean)",
      "begin_line": 137,
      "end_line": 141,
      "comment": "",
      "child_ranges": [
        "(line 138,col 9)-(line 140,col 9)"
      ]
    }
  ]
}