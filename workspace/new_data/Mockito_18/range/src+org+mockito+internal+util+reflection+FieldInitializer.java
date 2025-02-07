{
  "filepath": "/tmp/Mockito-18b/src/org/mockito/internal/util/reflection/FieldInitializer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FieldInitializer",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 28,
      "end_line": 291,
      "comment": "\n * Initialize a field with type instance if a default constructor can be found.\n *\n * \u003cp\u003e\n * If the given field is already initialized, then \u003cstrong\u003ethe actual instance is returned\u003c/strong\u003e.\n * This initializer doesn\u0027t work with inner classes, local classes, interfaces or abstract types.\n * \u003c/p\u003e\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "fieldOwner"
      ],
      "begin_line": 30,
      "end_line": 30,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "field"
      ],
      "begin_line": 31,
      "end_line": 31,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "instantiator"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.mockito.internal.util.reflection.FieldInitializer.FieldInitializer(java.lang.Object, java.lang.reflect.Field)",
      "begin_line": 45,
      "end_line": 47,
      "comment": "\n     * Prepare initializer with the given field on the given instance.\n     *\n     * \u003cp\u003e\n     * This constructor fail fast if the field type cannot be handled.\n     * \u003c/p\u003e\n     *\n     * @param fieldOwner Instance of the test.\n     * @param field Field to be initialize.\n     ",
      "child_ranges": [
        "(line 46,col 9)-(line 46,col 85)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.mockito.internal.util.reflection.FieldInitializer.FieldInitializer(java.lang.Object, java.lang.reflect.Field, org.mockito.internal.util.reflection.FieldInitializer.ConstructorArgumentResolver)",
      "begin_line": 60,
      "end_line": 62,
      "comment": "\n     * Prepare initializer with the given field on the given instance.\n     *\n     * \u003cp\u003e\n     * This constructor fail fast if the field type cannot be handled.\n     * \u003c/p\u003e\n     *\n     * @param fieldOwner Instance of the test.\n     * @param field Field to be initialize.\n     * @param argResolver Constructor parameters resolver\n     ",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 106)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.mockito.internal.util.reflection.FieldInitializer.FieldInitializer(java.lang.Object, java.lang.reflect.Field, org.mockito.internal.util.reflection.FieldInitializer.ConstructorInstantiator)",
      "begin_line": 64,
      "end_line": 74,
      "comment": "",
      "child_ranges": [
        "(line 65,col 9)-(line 70,col 9)",
        "(line 71,col 9)-(line 71,col 37)",
        "(line 72,col 9)-(line 72,col 27)",
        "(line 73,col 9)-(line 73,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.reflection.FieldInitializer.initialize()",
      "begin_line": 81,
      "end_line": 92,
      "comment": "\n     * Initialize field if not initialized and return the actual instance.\n     *\n     * @return Actual field instance.\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 72)",
        "(line 83,col 9)-(line 83,col 36)",
        "(line 85,col 9)-(line 91,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.reflection.FieldInitializer.checkNotLocal(java.lang.reflect.Field)",
      "begin_line": 94,
      "end_line": 98,
      "comment": "",
      "child_ranges": [
        "(line 95,col 9)-(line 97,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.reflection.FieldInitializer.checkNotInner(java.lang.reflect.Field)",
      "begin_line": 100,
      "end_line": 104,
      "comment": "",
      "child_ranges": [
        "(line 101,col 9)-(line 103,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.reflection.FieldInitializer.checkNotInterface(java.lang.reflect.Field)",
      "begin_line": 106,
      "end_line": 110,
      "comment": "",
      "child_ranges": [
        "(line 107,col 9)-(line 109,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.reflection.FieldInitializer.checkNotAbstract(java.lang.reflect.Field)",
      "begin_line": 112,
      "end_line": 116,
      "comment": "",
      "child_ranges": [
        "(line 113,col 9)-(line 115,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.reflection.FieldInitializer.acquireFieldInstance()",
      "begin_line": 118,
      "end_line": 125,
      "comment": "",
      "child_ranges": [
        "(line 119,col 9)-(line 119,col 53)",
        "(line 120,col 9)-(line 122,col 9)",
        "(line 124,col 9)-(line 124,col 42)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ConstructorArgumentResolver",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 131,
      "end_line": 146,
      "comment": "\n     * Represents the strategy used to resolve actual instances\n     * to be given to a constructor given the argument types.\n     "
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.reflection.FieldInitializer.ConstructorArgumentResolver.resolveTypeInstances(java.lang.Class\u003c?\u003e...)",
      "begin_line": 145,
      "end_line": 145,
      "comment": "\n         * Try to resolve instances from types.\n         *\n         * \u003cp\u003e\n         * Checks on the real argument type or on the correct argument number\n         * will happen during the field initialization {@link FieldInitializer#initialize()}.\n         * I.e the only responsibility of this method, is to provide instances \u003cstrong\u003eif possible\u003c/strong\u003e.\n         * \u003c/p\u003e\n         *\n         * @param argTypes Constructor argument types, should not be null.\n         * @return The argument instances to be given to the constructor, should not be null.\n         ",
      "child_ranges": []
    },
    {
      "type": "class_interface",
      "name": "ConstructorInstantiator",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 148,
      "end_line": 150,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.reflection.FieldInitializer.ConstructorInstantiator.instantiate()",
      "begin_line": 149,
      "end_line": 149,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "class_interface",
      "name": "NoArgConstructorInstantiator",
      "is_interface": false,
      "parent_types": [
        "org.mockito.internal.util.reflection.FieldInitializer.ConstructorInstantiator"
      ],
      "begin_line": 161,
      "end_line": 200,
      "comment": "\n     * Constructor instantiating strategy for no-arg constructor.\n     *\n     * \u003cp\u003e\n     * If a no-arg constructor can be found then the instance is created using\n     * this constructor.\n     * Otherwise a technical MockitoException is thrown.\n     * \u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "testClass"
      ],
      "begin_line": 162,
      "end_line": 162,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "field"
      ],
      "begin_line": 163,
      "end_line": 163,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.mockito.internal.util.reflection.FieldInitializer.NoArgConstructorInstantiator.NoArgConstructorInstantiator(java.lang.Object, java.lang.reflect.Field)",
      "begin_line": 169,
      "end_line": 172,
      "comment": "\n         * Internal, checks are done by FieldInitializer.\n         * Fields are assumed to be accessible.\n         ",
      "child_ranges": [
        "(line 170,col 13)-(line 170,col 39)",
        "(line 171,col 13)-(line 171,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.reflection.FieldInitializer.NoArgConstructorInstantiator.instantiate()",
      "begin_line": 174,
      "end_line": 199,
      "comment": "",
      "child_ranges": [
        "(line 175,col 13)-(line 175,col 76)",
        "(line 176,col 13)-(line 176,col 46)",
        "(line 177,col 13)-(line 198,col 13)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ParameterizedConstructorInstantiator",
      "is_interface": false,
      "parent_types": [
        "org.mockito.internal.util.reflection.FieldInitializer.ConstructorInstantiator"
      ],
      "begin_line": 212,
      "end_line": 290,
      "comment": "\n     * Constructor instantiating strategy for parameterized constructors.\n     *\n     * \u003cp\u003e\n     * Choose the constructor with the highest number of parameters, then\n     * call the ConstructorArgResolver to get actual argument instances.\n     * If the argResolver fail, then a technical MockitoException is thrown is thrown.\n     * Otherwise the instance is created with the resolved arguments.\n     * \u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "testClass"
      ],
      "begin_line": 213,
      "end_line": 213,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "field"
      ],
      "begin_line": 214,
      "end_line": 214,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "argResolver"
      ],
      "begin_line": 215,
      "end_line": 215,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mockUtil"
      ],
      "begin_line": 216,
      "end_line": 216,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "byParameterNumber"
      ],
      "begin_line": 217,
      "end_line": 237,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.reflection.FieldInitializer.ParameterizedConstructorInstantiator.Anonymous-579b8c2e-96a0-478c-beb5-363fc34efe9b.compare(java.lang.reflect.Constructor\u003c?\u003e, java.lang.reflect.Constructor\u003c?\u003e)",
      "begin_line": 218,
      "end_line": 226,
      "comment": "",
      "child_ranges": [
        "(line 219,col 17)-(line 219,col 115)",
        "(line 220,col 17)-(line 224,col 17)",
        "(line 225,col 17)-(line 225,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.reflection.FieldInitializer.ParameterizedConstructorInstantiator.Anonymous-471487ff-93cc-41e7-a3dd-47386060871b.countMockableParams(java.lang.reflect.Constructor\u003c?\u003e)",
      "begin_line": 228,
      "end_line": 236,
      "comment": "",
      "child_ranges": [
        "(line 229,col 17)-(line 229,col 54)",
        "(line 230,col 17)-(line 234,col 17)",
        "(line 235,col 17)-(line 235,col 53)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.mockito.internal.util.reflection.FieldInitializer.ParameterizedConstructorInstantiator.ParameterizedConstructorInstantiator(java.lang.Object, java.lang.reflect.Field, org.mockito.internal.util.reflection.FieldInitializer.ConstructorArgumentResolver)",
      "begin_line": 243,
      "end_line": 247,
      "comment": "\n         * Internal, checks are done by FieldInitializer.\n         * Fields are assumed to be accessible.\n         ",
      "child_ranges": [
        "(line 244,col 13)-(line 244,col 39)",
        "(line 245,col 13)-(line 245,col 31)",
        "(line 246,col 13)-(line 246,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.reflection.FieldInitializer.ParameterizedConstructorInstantiator.instantiate()",
      "begin_line": 249,
      "end_line": 274,
      "comment": "",
      "child_ranges": [
        "(line 250,col 13)-(line 250,col 76)",
        "(line 251,col 13)-(line 251,col 46)",
        "(line 252,col 13)-(line 273,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.reflection.FieldInitializer.ParameterizedConstructorInstantiator.checkParameterized(java.lang.reflect.Constructor\u003c?\u003e, java.lang.reflect.Field)",
      "begin_line": 276,
      "end_line": 280,
      "comment": "",
      "child_ranges": [
        "(line 277,col 13)-(line 279,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.reflection.FieldInitializer.ParameterizedConstructorInstantiator.biggestConstructor(java.lang.Class\u003c?\u003e)",
      "begin_line": 282,
      "end_line": 289,
      "comment": "",
      "child_ranges": [
        "(line 283,col 13)-(line 283,col 101)",
        "(line 284,col 13)-(line 284,col 62)",
        "(line 286,col 13)-(line 286,col 61)",
        "(line 287,col 13)-(line 287,col 51)",
        "(line 288,col 13)-(line 288,col 31)"
      ]
    }
  ]
}