{
  "filepath": "/tmp/Gson-6b/gson/src/main/java/com/google/gson/FieldAttributes.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FieldAttributes",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 36,
      "end_line": 157,
      "comment": "\n * A data object that stores attributes of a field.\n *\n * \u003cp\u003eThis class is immutable; therefore, it can be safely shared across threads.\n *\n * @author Inderjeet Singh\n * @author Joel Leitch\n *\n * @since 1.4\n "
    },
    {
      "type": "field",
      "varNames": [
        "field"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.gson.FieldAttributes.FieldAttributes(java.lang.reflect.Field)",
      "begin_line": 44,
      "end_line": 47,
      "comment": "\n   * Constructs a Field Attributes object from the {@code f}.\n   *\n   * @param f the field to pull attributes from\n   ",
      "child_ranges": [
        "(line 45,col 5)-(line 45,col 40)",
        "(line 46,col 5)-(line 46,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.FieldAttributes.getDeclaringClass()",
      "begin_line": 52,
      "end_line": 54,
      "comment": "\n   * @return the declaring class that contains this field\n   ",
      "child_ranges": [
        "(line 53,col 5)-(line 53,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.FieldAttributes.getName()",
      "begin_line": 59,
      "end_line": 61,
      "comment": "\n   * @return the name of the field\n   ",
      "child_ranges": [
        "(line 60,col 5)-(line 60,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.FieldAttributes.getDeclaredType()",
      "begin_line": 79,
      "end_line": 81,
      "comment": "\n   * \u003cp\u003eFor example, assume the following class definition:\n   * \u003cpre class\u003d\"code\"\u003e\n   * public class Foo {\n   *   private String bar;\n   *   private List\u0026lt;String\u0026gt; red;\n   * }\n   *\n   * Type listParameterizedType \u003d new TypeToken\u0026lt;List\u0026lt;String\u0026gt;\u0026gt;() {}.getType();\n   * \u003c/pre\u003e\n   *\n   * \u003cp\u003eThis method would return {@code String.class} for the {@code bar} field and\n   * {@code listParameterizedType} for the {@code red} field.\n   *\n   * @return the specific type declared for this field\n   ",
      "child_ranges": [
        "(line 80,col 5)-(line 80,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.FieldAttributes.getDeclaredClass()",
      "begin_line": 99,
      "end_line": 101,
      "comment": "\n   * Returns the {@code Class} object that was declared for this field.\n   *\n   * \u003cp\u003eFor example, assume the following class definition:\n   * \u003cpre class\u003d\"code\"\u003e\n   * public class Foo {\n   *   private String bar;\n   *   private List\u0026lt;String\u0026gt; red;\n   * }\n   * \u003c/pre\u003e\n   *\n   * \u003cp\u003eThis method would return {@code String.class} for the {@code bar} field and\n   * {@code List.class} for the {@code red} field.\n   *\n   * @return the specific class object that was declared for the field\n   ",
      "child_ranges": [
        "(line 100,col 5)-(line 100,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.FieldAttributes.getAnnotation(java.lang.Class\u003cT\u003e)",
      "begin_line": 110,
      "end_line": 112,
      "comment": "\n   * Return the {@code T} annotation object from this field if it exist; otherwise returns\n   * {@code null}.\n   *\n   * @param annotation the class of the annotation that will be retrieved\n   * @return the annotation instance if it is bound to the field; otherwise {@code null}\n   ",
      "child_ranges": [
        "(line 111,col 5)-(line 111,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.FieldAttributes.getAnnotations()",
      "begin_line": 120,
      "end_line": 122,
      "comment": "\n   * Return the annotations that are present on this field.\n   *\n   * @return an array of all the annotations set on the field\n   * @since 1.4\n   ",
      "child_ranges": [
        "(line 121,col 5)-(line 121,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.FieldAttributes.hasModifier(int)",
      "begin_line": 134,
      "end_line": 136,
      "comment": "\n   * Returns {@code true} if the field is defined with the {@code modifier}.\n   *\n   * \u003cp\u003eThis method is meant to be called as:\n   * \u003cpre class\u003d\"code\"\u003e\n   * boolean hasPublicModifier \u003d fieldAttribute.hasModifier(java.lang.reflect.Modifier.PUBLIC);\n   * \u003c/pre\u003e\n   *\n   * @see java.lang.reflect.Modifier\n   ",
      "child_ranges": [
        "(line 135,col 5)-(line 135,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.FieldAttributes.get(java.lang.Object)",
      "begin_line": 145,
      "end_line": 147,
      "comment": "\n   * This is exposed internally only for the removing synthetic fields from the JSON output.\n   *\n   * @return true if the field is synthetic; otherwise false\n   * @throws IllegalAccessException\n   * @throws IllegalArgumentException\n   ",
      "child_ranges": [
        "(line 146,col 5)-(line 146,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.FieldAttributes.isSynthetic()",
      "begin_line": 154,
      "end_line": 156,
      "comment": "\n   * This is exposed internally only for the removing synthetic fields from the JSON output.\n   *\n   * @return true if the field is synthetic; otherwise false\n   ",
      "child_ranges": [
        "(line 155,col 5)-(line 155,col 31)"
      ]
    }
  ]
}