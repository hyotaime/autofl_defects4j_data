{
  "filepath": "/tmp/Mockito-18b/src/org/mockito/internal/util/reflection/GenericMetadataSupport.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "GenericMetadataSupport",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 56,
      "end_line": 625,
      "comment": "\n * This class can retrieve generic meta-data that the compiler stores on classes\n * and accessible members.\n *\n * \u003cp\u003e\n *     The main idea of this code is to create a Map that will help to resolve return types.\n *     In order to actually work with nested generics, this map will have to be passed along new instances\n *     as a type context.\n * \u003c/p\u003e\n *\n * \u003cp\u003e\n *     Hence :\n *     \u003cul\u003e\n *         \u003cli\u003eA new instance representing the metadata is created using the {@link #inferFrom(Type)} method from a real\n *         \u003ccode\u003eClass\u003c/code\u003e or from a \u003ccode\u003eParameterizedType\u003c/code\u003e, other types are not yet supported.\u003c/li\u003e\n *\n *         \u003cli\u003eThen from this metadata, we can extract meta-data for a generic return type of a method, using\n *         {@link #resolveGenericReturnType(Method)}.\u003c/li\u003e\n *     \u003c/ul\u003e\n * \u003c/p\u003e\n *\n * \u003cp\u003e\n * For now this code support the following kind of generic declarations :\n * \u003cpre class\u003d\"code\"\u003e\u003ccode class\u003d\"java\"\u003e\n * interface GenericsNest\u0026lt;K extends Comparable\u0026lt;K\u0026gt; \u0026 Cloneable\u0026gt; extends Map\u0026lt;K, Set\u0026lt;Number\u0026gt;\u0026gt; {\n *     Set\u0026lt;Number\u0026gt; remove(Object key); // override with fixed ParameterizedType\n *     List\u0026lt;? super Integer\u0026gt; returning_wildcard_with_class_lower_bound();\n *     List\u0026lt;? super K\u0026gt; returning_wildcard_with_typeVar_lower_bound();\n *     List\u0026lt;? extends K\u0026gt; returning_wildcard_with_typeVar_upper_bound();\n *     K returningK();\n *     \u0026lt;O extends K\u0026gt; List\u0026lt;O\u0026gt; paramType_with_type_params();\n *     \u0026lt;S, T extends S\u0026gt; T two_type_params();\n *     \u0026lt;O extends K\u0026gt; O typeVar_with_type_params();\n *     Number returningNonGeneric();\n * }\n * \u003c/code\u003e\u003c/pre\u003e\n *\n * @see #inferFrom(Type)\n * @see #resolveGenericReturnType(Method)\n * @see org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs\n "
    },
    {
      "type": "field",
      "varNames": [
        "contextualActualTypeParameters"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": "\n     * Represents actual type variables resolved for current class.\n     "
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.reflection.GenericMetadataSupport.registerTypeVariablesOn(java.lang.reflect.Type)",
      "begin_line": 66,
      "end_line": 84,
      "comment": "",
      "child_ranges": [
        "(line 67,col 9)-(line 69,col 9)",
        "(line 70,col 9)-(line 70,col 76)",
        "(line 71,col 9)-(line 71,col 104)",
        "(line 72,col 9)-(line 72,col 80)",
        "(line 73,col 9)-(line 83,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.reflection.GenericMetadataSupport.registerTypeParametersOn(java.lang.reflect.TypeVariable[])",
      "begin_line": 86,
      "end_line": 90,
      "comment": "",
      "child_ranges": [
        "(line 87,col 9)-(line 89,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.reflection.GenericMetadataSupport.registerTypeVariableIfNotPresent(java.lang.reflect.TypeVariable)",
      "begin_line": 92,
      "end_line": 97,
      "comment": "",
      "child_ranges": [
        "(line 93,col 9)-(line 96,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.reflection.GenericMetadataSupport.boundsOf(java.lang.reflect.TypeVariable)",
      "begin_line": 104,
      "end_line": 109,
      "comment": "\n     * @param typeParameter The TypeVariable parameter\n     * @return A {@link BoundedType} for easy bound information, if first bound is a TypeVariable\n     *         then retrieve BoundedType of this TypeVariable\n     ",
      "child_ranges": [
        "(line 105,col 9)-(line 107,col 9)",
        "(line 108,col 9)-(line 108,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.reflection.GenericMetadataSupport.boundsOf(java.lang.reflect.WildcardType)",
      "begin_line": 116,
      "end_line": 129,
      "comment": "\n     * @param wildCard The WildCard type\n     * @return A {@link BoundedType} for easy bound information, if first bound is a TypeVariable\n     *         then retrieve BoundedType of this TypeVariable\n     ",
      "child_ranges": [
        "(line 123,col 9)-(line 123,col 84)",
        "(line 124,col 9)-(line 126,col 9)",
        "(line 128,col 9)-(line 128,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.reflection.GenericMetadataSupport.rawType()",
      "begin_line": 136,
      "end_line": 136,
      "comment": "\n     * @return Raw type of the current instance.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.reflection.GenericMetadataSupport.extraInterfaces()",
      "begin_line": 143,
      "end_line": 145,
      "comment": "\n     * @return Returns extra interfaces \u003cstrong\u003eif relevant\u003c/strong\u003e, otherwise empty List.\n     ",
      "child_ranges": [
        "(line 144,col 9)-(line 144,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.reflection.GenericMetadataSupport.rawExtraInterfaces()",
      "begin_line": 150,
      "end_line": 152,
      "comment": "\n     * @return Returns an array with the raw types of {@link #extraInterfaces()} \u003cstrong\u003eif relevant\u003c/strong\u003e.\n     ",
      "child_ranges": [
        "(line 151,col 9)-(line 151,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.reflection.GenericMetadataSupport.hasRawExtraInterfaces()",
      "begin_line": 157,
      "end_line": 159,
      "comment": "\n     * @return Returns true if metadata knows about extra-interfaces {@link #extraInterfaces()} \u003cstrong\u003eif relevant\u003c/strong\u003e.\n     ",
      "child_ranges": [
        "(line 158,col 9)-(line 158,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.reflection.GenericMetadataSupport.actualTypeArguments()",
      "begin_line": 166,
      "end_line": 179,
      "comment": "\n     * @return Actual type arguments matching the type variables of the raw type represented by this {@link GenericMetadataSupport} instance.\n     ",
      "child_ranges": [
        "(line 167,col 9)-(line 167,col 70)",
        "(line 168,col 9)-(line 168,col 104)",
        "(line 170,col 9)-(line 176,col 9)",
        "(line 178,col 9)-(line 178,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.reflection.GenericMetadataSupport.getActualTypeArgumentFor(java.lang.reflect.TypeVariable)",
      "begin_line": 181,
      "end_line": 189,
      "comment": "",
      "child_ranges": [
        "(line 182,col 9)-(line 182,col 75)",
        "(line 183,col 9)-(line 186,col 9)",
        "(line 188,col 9)-(line 188,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.reflection.GenericMetadataSupport.resolveGenericReturnType(java.lang.reflect.Method)",
      "begin_line": 199,
      "end_line": 214,
      "comment": "\n     * Resolve current method generic return type to a {@link GenericMetadataSupport}.\n     *\n     * @param method Method to resolve the return type.\n     * @return {@link GenericMetadataSupport} representing this generic return type.\n     ",
      "child_ranges": [
        "(line 200,col 9)-(line 200,col 63)",
        "(line 203,col 9)-(line 205,col 9)",
        "(line 206,col 9)-(line 208,col 9)",
        "(line 209,col 9)-(line 211,col 9)",
        "(line 213,col 9)-(line 213,col 215)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.reflection.GenericMetadataSupport.inferFrom(java.lang.reflect.Type)",
      "begin_line": 228,
      "end_line": 238,
      "comment": "\n     * Create an new instance of {@link GenericMetadataSupport} inferred from a {@link Type}.\n     *\n     * \u003cp\u003e\n     *     At the moment \u003ccode\u003etype\u003c/code\u003e can only be a {@link Class} or a {@link ParameterizedType}, otherwise\n     *     it\u0027ll throw a {@link MockitoException}.\n     * \u003c/p\u003e\n     *\n     * @param type The class from which the {@link GenericMetadataSupport} should be built.\n     * @return The new {@link GenericMetadataSupport}.\n     * @throws MockitoException Raised if type is not a {@link Class} or a {@link ParameterizedType}.\n     ",
      "child_ranges": [
        "(line 229,col 9)-(line 229,col 42)",
        "(line 230,col 9)-(line 232,col 9)",
        "(line 233,col 9)-(line 235,col 9)",
        "(line 237,col 9)-(line 237,col 139)"
      ]
    },
    {
      "type": "class_interface",
      "name": "FromClassGenericMetadataSupport",
      "is_interface": false,
      "parent_types": [
        "org.mockito.internal.util.reflection.GenericMetadataSupport"
      ],
      "begin_line": 251,
      "end_line": 286,
      "comment": "\n     * Generic metadata implementation for {@link Class}.\n     *\n     * Offer support to retrieve generic metadata on a {@link Class} by reading type parameters and type variables on\n     * the class and its ancestors and interfaces.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "clazz"
      ],
      "begin_line": 252,
      "end_line": 252,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.mockito.internal.util.reflection.GenericMetadataSupport.FromClassGenericMetadataSupport.FromClassGenericMetadataSupport(java.lang.Class\u003c?\u003e)",
      "begin_line": 254,
      "end_line": 263,
      "comment": "",
      "child_ranges": [
        "(line 255,col 13)-(line 255,col 31)",
        "(line 257,col 13)-(line 262,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.reflection.GenericMetadataSupport.FromClassGenericMetadataSupport.superClassOf(java.lang.Class)",
      "begin_line": 265,
      "end_line": 272,
      "comment": "",
      "child_ranges": [
        "(line 266,col 13)-(line 266,col 81)",
        "(line 267,col 13)-(line 270,col 13)",
        "(line 271,col 13)-(line 271,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.reflection.GenericMetadataSupport.FromClassGenericMetadataSupport.readActualTypeParametersOnDeclaringClass(java.lang.Class\u003c?\u003e)",
      "begin_line": 274,
      "end_line": 280,
      "comment": "",
      "child_ranges": [
        "(line 275,col 13)-(line 275,col 64)",
        "(line 276,col 13)-(line 276,col 66)",
        "(line 277,col 13)-(line 279,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.reflection.GenericMetadataSupport.FromClassGenericMetadataSupport.rawType()",
      "begin_line": 282,
      "end_line": 285,
      "comment": "",
      "child_ranges": [
        "(line 284,col 13)-(line 284,col 25)"
      ]
    },
    {
      "type": "class_interface",
      "name": "FromParameterizedTypeGenericMetadataSupport",
      "is_interface": false,
      "parent_types": [
        "org.mockito.internal.util.reflection.GenericMetadataSupport"
      ],
      "begin_line": 300,
      "end_line": 317,
      "comment": "\n     * Generic metadata implementation for \"standalone\" {@link ParameterizedType}.\n     *\n     * Offer support to retrieve generic metadata on a {@link ParameterizedType} by reading type variables of\n     * the related raw type and declared type variable of this parameterized type.\n     *\n     * This class is not designed to work on ParameterizedType returned by {@link Method#getGenericReturnType()}, as\n     * the ParameterizedType instance return in these cases could have Type Variables that refer to type declaration(s).\n     * That\u0027s what meant the \"standalone\" word at the beginning of the Javadoc.\n     * Instead use {@link ParameterizedReturnType}.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "parameterizedType"
      ],
      "begin_line": 301,
      "end_line": 301,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.mockito.internal.util.reflection.GenericMetadataSupport.FromParameterizedTypeGenericMetadataSupport.FromParameterizedTypeGenericMetadataSupport(java.lang.reflect.ParameterizedType)",
      "begin_line": 303,
      "end_line": 306,
      "comment": "",
      "child_ranges": [
        "(line 304,col 13)-(line 304,col 55)",
        "(line 305,col 13)-(line 305,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.reflection.GenericMetadataSupport.FromParameterizedTypeGenericMetadataSupport.readActualTypeParameters()",
      "begin_line": 308,
      "end_line": 311,
      "comment": "",
      "child_ranges": [
        "(line 309,col 13)-(line 309,col 68)",
        "(line 310,col 13)-(line 310,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.reflection.GenericMetadataSupport.FromParameterizedTypeGenericMetadataSupport.rawType()",
      "begin_line": 313,
      "end_line": 316,
      "comment": "",
      "child_ranges": [
        "(line 315,col 13)-(line 315,col 61)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ParameterizedReturnType",
      "is_interface": false,
      "parent_types": [
        "org.mockito.internal.util.reflection.GenericMetadataSupport"
      ],
      "begin_line": 323,
      "end_line": 349,
      "comment": "\n     * Generic metadata specific to {@link ParameterizedType} returned via {@link Method#getGenericReturnType()}.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "parameterizedType"
      ],
      "begin_line": 324,
      "end_line": 324,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "typeParameters"
      ],
      "begin_line": 325,
      "end_line": 325,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.mockito.internal.util.reflection.GenericMetadataSupport.ParameterizedReturnType.ParameterizedReturnType(org.mockito.internal.util.reflection.GenericMetadataSupport, java.lang.reflect.TypeVariable[], java.lang.reflect.ParameterizedType)",
      "begin_line": 327,
      "end_line": 334,
      "comment": "",
      "child_ranges": [
        "(line 328,col 13)-(line 328,col 55)",
        "(line 329,col 13)-(line 329,col 49)",
        "(line 330,col 13)-(line 330,col 88)",
        "(line 332,col 13)-(line 332,col 33)",
        "(line 333,col 13)-(line 333,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.reflection.GenericMetadataSupport.ParameterizedReturnType.readTypeParameters()",
      "begin_line": 336,
      "end_line": 338,
      "comment": "",
      "child_ranges": [
        "(line 337,col 13)-(line 337,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.reflection.GenericMetadataSupport.ParameterizedReturnType.readTypeVariables()",
      "begin_line": 340,
      "end_line": 342,
      "comment": "",
      "child_ranges": [
        "(line 341,col 13)-(line 341,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.reflection.GenericMetadataSupport.ParameterizedReturnType.rawType()",
      "begin_line": 344,
      "end_line": 347,
      "comment": "",
      "child_ranges": [
        "(line 346,col 13)-(line 346,col 61)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TypeVariableReturnType",
      "is_interface": false,
      "parent_types": [
        "org.mockito.internal.util.reflection.GenericMetadataSupport"
      ],
      "begin_line": 355,
      "end_line": 460,
      "comment": "\n     * Generic metadata for {@link TypeVariable} returned via {@link Method#getGenericReturnType()}.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "typeVariable"
      ],
      "begin_line": 356,
      "end_line": 356,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "typeParameters"
      ],
      "begin_line": 357,
      "end_line": 357,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "rawType"
      ],
      "begin_line": 358,
      "end_line": 358,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.mockito.internal.util.reflection.GenericMetadataSupport.TypeVariableReturnType.TypeVariableReturnType(org.mockito.internal.util.reflection.GenericMetadataSupport, java.lang.reflect.TypeVariable[], java.lang.reflect.TypeVariable)",
      "begin_line": 362,
      "end_line": 369,
      "comment": "",
      "child_ranges": [
        "(line 363,col 13)-(line 363,col 49)",
        "(line 364,col 13)-(line 364,col 45)",
        "(line 365,col 13)-(line 365,col 88)",
        "(line 367,col 13)-(line 367,col 33)",
        "(line 368,col 13)-(line 368,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.reflection.GenericMetadataSupport.TypeVariableReturnType.readTypeParameters()",
      "begin_line": 371,
      "end_line": 373,
      "comment": "",
      "child_ranges": [
        "(line 372,col 13)-(line 372,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.reflection.GenericMetadataSupport.TypeVariableReturnType.readTypeVariables()",
      "begin_line": 375,
      "end_line": 381,
      "comment": "",
      "child_ranges": [
        "(line 376,col 13)-(line 378,col 13)",
        "(line 379,col 13)-(line 379,col 74)",
        "(line 380,col 13)-(line 380,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.reflection.GenericMetadataSupport.TypeVariableReturnType.rawType()",
      "begin_line": 383,
      "end_line": 389,
      "comment": "",
      "child_ranges": [
        "(line 385,col 13)-(line 387,col 13)",
        "(line 388,col 13)-(line 388,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.reflection.GenericMetadataSupport.TypeVariableReturnType.extractRawTypeOf(java.lang.reflect.Type)",
      "begin_line": 391,
      "end_line": 409,
      "comment": "",
      "child_ranges": [
        "(line 392,col 13)-(line 394,col 13)",
        "(line 395,col 13)-(line 397,col 13)",
        "(line 398,col 13)-(line 400,col 13)",
        "(line 401,col 13)-(line 407,col 13)",
        "(line 408,col 13)-(line 408,col 92)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.reflection.GenericMetadataSupport.TypeVariableReturnType.extraInterfaces()",
      "begin_line": 411,
      "end_line": 424,
      "comment": "",
      "child_ranges": [
        "(line 413,col 13)-(line 413,col 65)",
        "(line 414,col 13)-(line 416,col 13)",
        "(line 417,col 13)-(line 419,col 13)",
        "(line 420,col 13)-(line 422,col 13)",
        "(line 423,col 13)-(line 423,col 119)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.reflection.GenericMetadataSupport.TypeVariableReturnType.rawExtraInterfaces()",
      "begin_line": 430,
      "end_line": 441,
      "comment": "\n         * @return Returns an array with the extracted raw types of {@link #extraInterfaces()}.\n         * @see #extractRawTypeOf(java.lang.reflect.Type)\n         ",
      "child_ranges": [
        "(line 431,col 13)-(line 431,col 59)",
        "(line 432,col 13)-(line 432,col 74)",
        "(line 433,col 13)-(line 439,col 13)",
        "(line 440,col 13)-(line 440,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.reflection.GenericMetadataSupport.TypeVariableReturnType.extractActualBoundedTypeOf(java.lang.reflect.Type)",
      "begin_line": 443,
      "end_line": 459,
      "comment": "",
      "child_ranges": [
        "(line 444,col 13)-(line 450,col 13)",
        "(line 451,col 13)-(line 457,col 13)",
        "(line 458,col 13)-(line 458,col 24)"
      ]
    },
    {
      "type": "class_interface",
      "name": "NotGenericReturnTypeSupport",
      "is_interface": false,
      "parent_types": [
        "org.mockito.internal.util.reflection.GenericMetadataSupport"
      ],
      "begin_line": 467,
      "end_line": 478,
      "comment": "\n     * Non-Generic metadata for {@link Class} returned via {@link Method#getGenericReturnType()}.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "returnType"
      ],
      "begin_line": 468,
      "end_line": 468,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.mockito.internal.util.reflection.GenericMetadataSupport.NotGenericReturnTypeSupport.NotGenericReturnTypeSupport(java.lang.reflect.Type)",
      "begin_line": 470,
      "end_line": 472,
      "comment": "",
      "child_ranges": [
        "(line 471,col 13)-(line 471,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.reflection.GenericMetadataSupport.NotGenericReturnTypeSupport.rawType()",
      "begin_line": 474,
      "end_line": 477,
      "comment": "",
      "child_ranges": [
        "(line 476,col 13)-(line 476,col 30)"
      ]
    },
    {
      "type": "class_interface",
      "name": "BoundedType",
      "is_interface": true,
      "parent_types": [
        "java.lang.reflect.Type"
      ],
      "begin_line": 490,
      "end_line": 494,
      "comment": "\n     * Type representing bounds of a type\n     *\n     * @see TypeVarBoundedType\n     * @see \u003ca href\u003d\"http://docs.oracle.com/javase/specs/jls/se5.0/html/typesValues.html#4.4\"\u003ehttp://docs.oracle.com/javase/specs/jls/se5.0/html/typesValues.html#4.4\u003c/a\u003e\n     * @see WildCardBoundedType\n     * @see \u003ca href\u003d\"http://docs.oracle.com/javase/specs/jls/se5.0/html/typesValues.html#4.5.1\"\u003ehttp://docs.oracle.com/javase/specs/jls/se5.0/html/typesValues.html#4.5.1\u003c/a\u003e\n     "
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.reflection.GenericMetadataSupport.BoundedType.firstBound()",
      "begin_line": 491,
      "end_line": 491,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.reflection.GenericMetadataSupport.BoundedType.interfaceBounds()",
      "begin_line": 493,
      "end_line": 493,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "class_interface",
      "name": "TypeVarBoundedType",
      "is_interface": false,
      "parent_types": [
        "org.mockito.internal.util.reflection.GenericMetadataSupport.BoundedType"
      ],
      "begin_line": 516,
      "end_line": 566,
      "comment": "\n     * Type representing bounds of a type variable, allows to keep all bounds information.\n     *\n     * \u003cp\u003eIt uses the first bound in the array, as this array is never null and always contains at least\n     * one element (Object is always here if no bounds are declared).\u003c/p\u003e\n     *\n     * \u003cp\u003eIf upper bounds are declared with SomeClass and additional interfaces, then firstBound will be SomeClass and\n     * interfacesBound will be an array of the additional interfaces.\n     *\n     * i.e. \u003ccode\u003eSomeClass\u003c/code\u003e.\n     * \u003cpre class\u003d\"code\"\u003e\u003ccode class\u003d\"java\"\u003e\n     *     interface UpperBoundedTypeWithClass\u003cE extends Comparable\u003cE\u003e \u0026 Cloneable\u003e {\n     *         E get();\n     *     }\n     *     // will return Comparable type\n     * \u003c/code\u003e\u003c/pre\u003e\n     * \u003c/p\u003e\n     *\n     * @see \u003ca href\u003d\"http://docs.oracle.com/javase/specs/jls/se5.0/html/typesValues.html#4.4\"\u003ehttp://docs.oracle.com/javase/specs/jls/se5.0/html/typesValues.html#4.4\u003c/a\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "typeVariable"
      ],
      "begin_line": 517,
      "end_line": 517,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.mockito.internal.util.reflection.GenericMetadataSupport.TypeVarBoundedType.TypeVarBoundedType(java.lang.reflect.TypeVariable)",
      "begin_line": 520,
      "end_line": 522,
      "comment": "",
      "child_ranges": [
        "(line 521,col 13)-(line 521,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.reflection.GenericMetadataSupport.TypeVarBoundedType.firstBound()",
      "begin_line": 527,
      "end_line": 529,
      "comment": "\n         * @return either a class or an interface (parameterized or not), if no bounds declared Object is returned.\n         ",
      "child_ranges": [
        "(line 528,col 13)-(line 528,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.reflection.GenericMetadataSupport.TypeVarBoundedType.interfaceBounds()",
      "begin_line": 538,
      "end_line": 542,
      "comment": "\n         * On a Type Variable (typeVar extends C_0 \u0026 I_1 \u0026 I_2 \u0026 etc), will return an array\n         * containing I_1 and I_2.\n         *\n         * @return other bounds for this type, these bounds can only be only interfaces as the JLS says,\n         * empty array if no other bound declared.\n         ",
      "child_ranges": [
        "(line 539,col 13)-(line 539,col 83)",
        "(line 540,col 13)-(line 540,col 115)",
        "(line 541,col 13)-(line 541,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.reflection.GenericMetadataSupport.TypeVarBoundedType.equals(java.lang.Object)",
      "begin_line": 544,
      "end_line": 551,
      "comment": "",
      "child_ranges": [
        "(line 546,col 13)-(line 546,col 39)",
        "(line 547,col 13)-(line 547,col 70)",
        "(line 549,col 13)-(line 549,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.reflection.GenericMetadataSupport.TypeVarBoundedType.hashCode()",
      "begin_line": 553,
      "end_line": 556,
      "comment": "",
      "child_ranges": [
        "(line 555,col 13)-(line 555,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.reflection.GenericMetadataSupport.TypeVarBoundedType.toString()",
      "begin_line": 558,
      "end_line": 561,
      "comment": "",
      "child_ranges": [
        "(line 560,col 13)-(line 560,col 119)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.reflection.GenericMetadataSupport.TypeVarBoundedType.typeVariable()",
      "begin_line": 563,
      "end_line": 565,
      "comment": "",
      "child_ranges": [
        "(line 564,col 13)-(line 564,col 32)"
      ]
    },
    {
      "type": "class_interface",
      "name": "WildCardBoundedType",
      "is_interface": false,
      "parent_types": [
        "org.mockito.internal.util.reflection.GenericMetadataSupport.BoundedType"
      ],
      "begin_line": 576,
      "end_line": 623,
      "comment": "\n     * Type representing bounds of a wildcard, allows to keep all bounds information.\n     *\n     * \u003cp\u003eThe JLS says that lower bound and upper bound are mutually exclusive, and that multiple bounds\n     * are not allowed.\n     *\n     * @see \u003ca href\u003d\"http://docs.oracle.com/javase/specs/jls/se5.0/html/typesValues.html#4.4\"\u003ehttp://docs.oracle.com/javase/specs/jls/se5.0/html/typesValues.html#4.4\u003c/a\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "wildcard"
      ],
      "begin_line": 577,
      "end_line": 577,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.mockito.internal.util.reflection.GenericMetadataSupport.WildCardBoundedType.WildCardBoundedType(java.lang.reflect.WildcardType)",
      "begin_line": 580,
      "end_line": 582,
      "comment": "",
      "child_ranges": [
        "(line 581,col 13)-(line 581,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.reflection.GenericMetadataSupport.WildCardBoundedType.firstBound()",
      "begin_line": 587,
      "end_line": 592,
      "comment": "\n         * @return The first bound, either a type or a reference to a TypeVariable\n         ",
      "child_ranges": [
        "(line 588,col 13)-(line 588,col 59)",
        "(line 589,col 13)-(line 589,col 59)",
        "(line 591,col 13)-(line 591,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.reflection.GenericMetadataSupport.WildCardBoundedType.interfaceBounds()",
      "begin_line": 597,
      "end_line": 599,
      "comment": "\n         * @return An empty array as, wildcard don\u0027t support multiple bounds.\n         ",
      "child_ranges": [
        "(line 598,col 13)-(line 598,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.reflection.GenericMetadataSupport.WildCardBoundedType.equals(java.lang.Object)",
      "begin_line": 601,
      "end_line": 608,
      "comment": "",
      "child_ranges": [
        "(line 603,col 13)-(line 603,col 39)",
        "(line 604,col 13)-(line 604,col 70)",
        "(line 606,col 13)-(line 606,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.reflection.GenericMetadataSupport.WildCardBoundedType.hashCode()",
      "begin_line": 610,
      "end_line": 613,
      "comment": "",
      "child_ranges": [
        "(line 612,col 13)-(line 612,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.reflection.GenericMetadataSupport.WildCardBoundedType.toString()",
      "begin_line": 615,
      "end_line": 618,
      "comment": "",
      "child_ranges": [
        "(line 617,col 13)-(line 617,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.reflection.GenericMetadataSupport.WildCardBoundedType.wildCard()",
      "begin_line": 620,
      "end_line": 622,
      "comment": "",
      "child_ranges": [
        "(line 621,col 13)-(line 621,col 28)"
      ]
    }
  ]
}