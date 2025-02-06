{
  "filepath": "/tmp/Lang-57b/src/java/org/apache/commons/lang/enum/ValuedEnum.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ValuedEnum",
      "is_interface": false,
      "parent_types": [
        "java.lang.Enum"
      ],
      "begin_line": 105,
      "end_line": 196,
      "comment": "\n * \u003cp\u003eAbstract superclass for type-safe enums with integer values suitable\n * for use in \u003ccode\u003eswitch\u003c/code\u003e statements.\u003c/p\u003e\n *\n * \u003cp\u003e\u003cem\u003eNOTE:\u003c/em\u003eDue to the way in which Java ClassLoaders work, comparing\n * \u003ccode\u003eEnum\u003c/code\u003e objects should always be done using the equals() method,\n * not \u003ccode\u003e\u003d\u003d\u003c/code\u003e. The equals() method will try \u003ccode\u003e\u003d\u003d\u003c/code\u003e first so\n * in most cases the effect is the same.\u003c/p\u003e\n *\n * \u003cp\u003eTo use this class, it must be subclassed. For example:\u003c/p\u003e\n *\n * \u003cpre\u003e\n * public final class JavaVersionEnum extends ValuedEnum {\n *   //standard enums for version of JVM\n *   public static final int  JAVA1_0_VALUE  \u003d 100;\n *   public static final int  JAVA1_1_VALUE  \u003d 110;\n *   public static final int  JAVA1_2_VALUE  \u003d 120;\n *   public static final int  JAVA1_3_VALUE  \u003d 130;\n *   public static final JavaVersionEnum  JAVA1_0  \u003d new JavaVersionEnum( \"Java 1.0\", JAVA1_0_VALUE );\n *   public static final JavaVersionEnum  JAVA1_1  \u003d new JavaVersionEnum( \"Java 1.1\", JAVA1_1_VALUE );\n *   public static final JavaVersionEnum  JAVA1_2  \u003d new JavaVersionEnum( \"Java 1.2\", JAVA1_2_VALUE );\n *   public static final JavaVersionEnum  JAVA1_3  \u003d new JavaVersionEnum( \"Java 1.3\", JAVA1_3_VALUE );\n *\n *   private JavaVersionEnum(String name, int value) {\n *     super( name, value );\n *   }\n * \n *   public static JavaVersionEnum getEnum(String javaVersion) {\n *     return (JavaVersionEnum) getEnum(JavaVersionEnum.class, javaVersion);\n *   }\n * \n *   public static JavaVersionEnum getEnum(int javaVersion) {\n *     return (JavaVersionEnum) getEnum(JavaVersionEnum.class, javaVersion);\n *   }\n * \n *   public static Map getEnumMap() {\n *     return getEnumMap(JavaVersionEnum.class);\n *   }\n * \n *   public static List getEnumList() {\n *     return getEnumList(JavaVersionEnum.class);\n *   }\n * \n *   public static Iterator iterator() {\n *     return iterator(JavaVersionEnum.class);\n *   }\n * }\n * \u003c/pre\u003e\n *\n * \u003cp\u003eThe above class could then be used as follows:\u003c/p\u003e\n *\n * \u003cpre\u003e\n * public void doSomething(JavaVersionEnum ver) {\n *   switch (ver.getValue()) {\n *     case JAVA1_0_VALUE:\n *       // ...\n *       break;\n *     case JAVA1_1_VALUE:\n *       // ...\n *       break;\n *     //...\n *   }\n * }\n * \u003c/pre\u003e\n *\n * \u003cp\u003eAs shown, each enum has a name and a value. These can be accessed using\n * \u003ccode\u003egetName\u003c/code\u003e and \u003ccode\u003egetValue\u003c/code\u003e.\u003c/p\u003e\n *\n * \u003cp\u003eThe \u003ccode\u003egetEnum\u003c/code\u003e and \u003ccode\u003eiterator\u003c/code\u003e methods are recommended.\n * Unfortunately, Java restrictions require these to be coded as shown in each subclass.\n * An alternative choice is to use the {@link EnumUtils} class.\u003c/p\u003e\n *\n//  * @deprecated Replaced by {@link org.apache.commons.lang.enums.ValuedEnum org.apache.commons.lang.enums.ValuedEnum}\n *          and will be removed in version 3.0. All classes in this package are deprecated and repackaged to \n//  *          {@link org.apache.commons.lang.enums} since \u003ccode\u003eenum\u003c/code\u003e is a Java 1.5 keyword. \n//  * @see org.apache.commons.lang.enums.ValuedEnum\n * @author Apache Avalon project\n * @author Stephen Colebourne\n * @since 1.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 112,
      "end_line": 112,
      "comment": "\n     * Required for serialization support. Lang version 1.0.1 serial compatibility.\n     * \n     * @see java.io.Serializable\n     "
    },
    {
      "type": "field",
      "varNames": [
        "iValue"
      ],
      "begin_line": 117,
      "end_line": 117,
      "comment": "\n     * The value contained in enum.\n     "
    },
    {
      "type": "constructor",
      "signature": "ValuedEnum.ValuedEnum(java.lang.String, int)",
      "begin_line": 125,
      "end_line": 128,
      "comment": "\n     * Constructor for enum item.\n     *\n     * @param name  the name of enum item\n     * @param value  the value of enum item\n     ",
      "child_ranges": [
        "(line 126,col 9)-(line 126,col 20)",
        "(line 127,col 9)-(line 127,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "ValuedEnum.getEnum(java.lang.Class, int)",
      "begin_line": 142,
      "end_line": 154,
      "comment": "\n     * \u003cp\u003eGets an \u003ccode\u003eEnum\u003c/code\u003e object by class and value.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method loops through the list of \u003ccode\u003eEnum\u003c/code\u003e,\n     * thus if there are many \u003ccode\u003eEnum\u003c/code\u003es this will be\n     * slow.\u003c/p\u003e\n     * \n     * @param enumClass  the class of the \u003ccode\u003eEnum\u003c/code\u003e to get\n     * @param value  the value of the \u003ccode\u003eEnum\u003c/code\u003e to get\n     * @return the enum object, or null if the enum does not exist\n     * @throws IllegalArgumentException if the enum class is \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 143,col 9)-(line 145,col 9)",
        "(line 146,col 9)-(line 146,col 48)",
        "(line 147,col 9)-(line 152,col 9)",
        "(line 153,col 9)-(line 153,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "ValuedEnum.getValue()",
      "begin_line": 161,
      "end_line": 163,
      "comment": "\n     * \u003cp\u003eGet value of enum item.\u003c/p\u003e\n     *\n     * @return the enum item\u0027s value.\n     ",
      "child_ranges": [
        "(line 162,col 9)-(line 162,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "ValuedEnum.compareTo(java.lang.Object)",
      "begin_line": 178,
      "end_line": 180,
      "comment": "\n     * \u003cp\u003eTests for order.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe default ordering is numeric by value, but this\n     * can be overridden by subclasses.\u003c/p\u003e\n     * \n     * @see java.lang.Comparable#compareTo(Object)\n     * @param other  the other object to compare to\n     * @return -ve if this is less than the other object, +ve if greater than,\n     *  \u003ccode\u003e0\u003c/code\u003e of equal\n     * @throws ClassCastException if other is not an \u003ccode\u003eEnum\u003c/code\u003e\n     * @throws NullPointerException if other is \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 179,col 9)-(line 179,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "ValuedEnum.toString()",
      "begin_line": 189,
      "end_line": 195,
      "comment": "\n     * \u003cp\u003eHuman readable description of this \u003ccode\u003eEnum\u003c/code\u003e item.\u003c/p\u003e\n     *\n     * @return String in the form \u003ccode\u003etype[name\u003dvalue]\u003c/code\u003e, for example:\n     *  \u003ccode\u003eJavaVersion[Java 1.0\u003d100]\u003c/code\u003e. Note that the package name is\n     *  stripped from the type name.\n     ",
      "child_ranges": [
        "(line 190,col 9)-(line 193,col 9)",
        "(line 194,col 9)-(line 194,col 25)"
      ]
    }
  ]
}