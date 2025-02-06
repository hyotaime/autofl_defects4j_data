{
  "filepath": "/tmp/Lang-20b/src/main/java/org/apache/commons/lang3/concurrent/ConcurrentUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ConcurrentUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 33,
      "end_line": 386,
      "comment": "\n * \u003cp\u003e\n * An utility class providing functionality related to the {@code\n * java.util.concurrent} package.\n * \u003c/p\u003e\n *\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtils.ConcurrentUtils()",
      "begin_line": 39,
      "end_line": 40,
      "comment": "\n     * Private constructor so that no instances can be created. This class\n     * contains only static utility methods.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtils.extractCause(java.util.concurrent.ExecutionException)",
      "begin_line": 60,
      "end_line": 67,
      "comment": "\n     * Inspects the cause of the specified {@code ExecutionException} and\n     * creates a {@code ConcurrentException} with the checked cause if\n     * necessary. This method performs the following checks on the cause of the\n     * passed in exception:\n     * \u003cul\u003e\n     * \u003cli\u003eIf the passed in exception is \u003cb\u003enull\u003c/b\u003e or the cause is\n     * \u003cb\u003enull\u003c/b\u003e, this method returns \u003cb\u003enull\u003c/b\u003e.\u003c/li\u003e\n     * \u003cli\u003eIf the cause is a runtime exception, it is directly thrown.\u003c/li\u003e\n     * \u003cli\u003eIf the cause is an error, it is directly thrown, too.\u003c/li\u003e\n     * \u003cli\u003eIn any other case the cause is a checked exception. The method then\n     * creates a {@link ConcurrentException}, initializes it with the cause, and\n     * returns it.\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @param ex the exception to be processed\n     * @return a {@code ConcurrentException} with the checked cause\n     ",
      "child_ranges": [
        "(line 61,col 9)-(line 63,col 9)",
        "(line 65,col 9)-(line 65,col 23)",
        "(line 66,col 9)-(line 66,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtils.extractCauseUnchecked(java.util.concurrent.ExecutionException)",
      "begin_line": 81,
      "end_line": 89,
      "comment": "\n     * Inspects the cause of the specified {@code ExecutionException} and\n     * creates a {@code ConcurrentRuntimeException} with the checked cause if\n     * necessary. This method works exactly like\n     * {@link #extractCause(ExecutionException)}. The only difference is that\n     * the cause of the specified {@code ExecutionException} is extracted as a\n     * runtime exception. This is an alternative for client code that does not\n     * want to deal with checked exceptions.\n     *\n     * @param ex the exception to be processed\n     * @return a {@code ConcurrentRuntimeException} with the checked cause\n     ",
      "child_ranges": [
        "(line 83,col 9)-(line 85,col 9)",
        "(line 87,col 9)-(line 87,col 23)",
        "(line 88,col 9)-(line 88,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtils.handleCause(java.util.concurrent.ExecutionException)",
      "begin_line": 104,
      "end_line": 111,
      "comment": "\n     * Handles the specified {@code ExecutionException}. This method calls\n     * {@link #extractCause(ExecutionException)} for obtaining the cause of the\n     * exception - which might already cause an unchecked exception or an error\n     * being thrown. If the cause is a checked exception however, it is wrapped\n     * in a {@code ConcurrentException}, which is thrown. If the passed in\n     * exception is \u003cb\u003enull\u003c/b\u003e or has no cause, the method simply returns\n     * without throwing an exception.\n     *\n     * @param ex the exception to be handled\n     * @throws ConcurrentException if the cause of the {@code\n     * ExecutionException} is a checked exception\n     ",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 51)",
        "(line 108,col 9)-(line 110,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtils.handleCauseUnchecked(java.util.concurrent.ExecutionException)",
      "begin_line": 126,
      "end_line": 132,
      "comment": "\n     * Handles the specified {@code ExecutionException} and transforms it into a\n     * runtime exception. This method works exactly like\n     * {@link #handleCause(ExecutionException)}, but instead of a\n     * {@link ConcurrentException} it throws a\n     * {@link ConcurrentRuntimeException}. This is an alternative for client\n     * code that does not want to deal with checked exceptions.\n     *\n     * @param ex the exception to be handled\n     * @throws ConcurrentRuntimeException if the cause of the {@code\n     * ExecutionException} is a checked exception; this exception is then\n     * wrapped in the thrown runtime exception\n     ",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 68)",
        "(line 129,col 9)-(line 131,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtils.checkedException(java.lang.Throwable)",
      "begin_line": 143,
      "end_line": 150,
      "comment": "\n     * Tests whether the specified {@code Throwable} is a checked exception. If\n     * not, an exception is thrown.\n     *\n     * @param ex the {@code Throwable} to check\n     * @return a flag whether the passed in exception is a checked exception\n     * @throws IllegalArgumentException if the {@code Throwable} is not a\n     * checked exception\n     ",
      "child_ranges": [
        "(line 144,col 9)-(line 149,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtils.throwCause(java.util.concurrent.ExecutionException)",
      "begin_line": 158,
      "end_line": 166,
      "comment": "\n     * Tests whether the cause of the specified {@code ExecutionException}\n     * should be thrown and does it if necessary.\n     *\n     * @param ex the exception in question\n     ",
      "child_ranges": [
        "(line 159,col 9)-(line 161,col 9)",
        "(line 163,col 9)-(line 165,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtils.initialize(org.apache.commons.lang3.concurrent.ConcurrentInitializer\u003cT\u003e)",
      "begin_line": 182,
      "end_line": 185,
      "comment": "\n     * Invokes the specified {@code ConcurrentInitializer} and returns the\n     * object produced by the initializer. This method just invokes the {@code\n     * get()} method of the given {@code ConcurrentInitializer}. It is\n     * \u003cb\u003enull\u003c/b\u003e-safe: if the argument is \u003cb\u003enull\u003c/b\u003e, result is also\n     * \u003cb\u003enull\u003c/b\u003e.\n     *\n     * @param \u003cT\u003e the type of the object produced by the initializer\n     * @param initializer the {@code ConcurrentInitializer} to be invoked\n     * @return the object managed by the {@code ConcurrentInitializer}\n     * @throws ConcurrentException if the {@code ConcurrentInitializer} throws\n     * an exception\n     ",
      "child_ranges": [
        "(line 184,col 9)-(line 184,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtils.initializeUnchecked(org.apache.commons.lang3.concurrent.ConcurrentInitializer\u003cT\u003e)",
      "begin_line": 200,
      "end_line": 206,
      "comment": "\n     * Invokes the specified {@code ConcurrentInitializer} and transforms\n     * occurring exceptions to runtime exceptions. This method works like\n     * {@link #initialize(ConcurrentInitializer)}, but if the {@code\n     * ConcurrentInitializer} throws a {@link ConcurrentException}, it is\n     * caught, and the cause is wrapped in a {@link ConcurrentRuntimeException}.\n     * So client code does not have to deal with checked exceptions.\n     *\n     * @param \u003cT\u003e the type of the object produced by the initializer\n     * @param initializer the {@code ConcurrentInitializer} to be invoked\n     * @return the object managed by the {@code ConcurrentInitializer}\n     * @throws ConcurrentRuntimeException if the initializer throws an exception\n     ",
      "child_ranges": [
        "(line 201,col 9)-(line 205,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtils.putIfAbsent(java.util.concurrent.ConcurrentMap\u003cK, V\u003e, K, V)",
      "begin_line": 241,
      "end_line": 248,
      "comment": "\n     * \u003cp\u003e\n     * Puts a value in the specified {@code ConcurrentMap} if the key is not yet\n     * present. This method works similar to the {@code putIfAbsent()} method of\n     * the {@code ConcurrentMap} interface, but the value returned is different.\n     * Basically, this method is equivalent to the following code fragment:\n     *\n     * \u003cpre\u003e\n     * if (!map.containsKey(key)) {\n     *     map.put(key, value);\n     *     return value;\n     * } else {\n     *     return map.get(key);\n     * }\n     * \u003c/pre\u003e\n     *\n     * except that the action is performed atomically. So this method always\n     * returns the value which is stored in the map.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * This method is \u003cb\u003enull\u003c/b\u003e-safe: It accepts a \u003cb\u003enull\u003c/b\u003e map as input\n     * without throwing an exception. In this case the return value is\n     * \u003cb\u003enull\u003c/b\u003e, too.\n     * \u003c/p\u003e\n     *\n     * @param \u003cK\u003e the type of the keys of the map\n     * @param \u003cV\u003e the type of the values of the map\n     * @param map the map to be modified\n     * @param key the key of the value to be added\n     * @param value the value to be added\n     * @return the value stored in the map after this operation\n     ",
      "child_ranges": [
        "(line 242,col 9)-(line 244,col 9)",
        "(line 246,col 9)-(line 246,col 47)",
        "(line 247,col 9)-(line 247,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtils.createIfAbsent(java.util.concurrent.ConcurrentMap\u003cK, V\u003e, K, org.apache.commons.lang3.concurrent.ConcurrentInitializer\u003cV\u003e)",
      "begin_line": 270,
      "end_line": 281,
      "comment": "\n     * Checks if a concurrent map contains a key and creates a corresponding\n     * value if not. This method first checks the presence of the key in the\n     * given map. If it is already contained, its value is returned. Otherwise\n     * the {@code get()} method of the passed in {@link ConcurrentInitializer}\n     * is called. With the resulting object\n     * {@link #putIfAbsent(ConcurrentMap, Object, Object)} is called. This\n     * handles the case that in the meantime another thread has added the key to\n     * the map. Both the map and the initializer can be \u003cb\u003enull\u003c/b\u003e; in this\n     * case this method simply returns \u003cb\u003enull\u003c/b\u003e.\n     *\n     * @param \u003cK\u003e the type of the keys of the map\n     * @param \u003cV\u003e the type of the values of the map\n     * @param map the map to be modified\n     * @param key the key of the value to be added\n     * @param init the {@link ConcurrentInitializer} for creating the value\n     * @return the value stored in the map after this operation; this may or may\n     * not be the object created by the {@link ConcurrentInitializer}\n     * @throws ConcurrentException if the initializer throws an exception\n     ",
      "child_ranges": [
        "(line 272,col 9)-(line 274,col 9)",
        "(line 276,col 9)-(line 276,col 31)",
        "(line 277,col 9)-(line 279,col 9)",
        "(line 280,col 9)-(line 280,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtils.createIfAbsentUnchecked(java.util.concurrent.ConcurrentMap\u003cK, V\u003e, K, org.apache.commons.lang3.concurrent.ConcurrentInitializer\u003cV\u003e)",
      "begin_line": 298,
      "end_line": 305,
      "comment": "\n     * Checks if a concurrent map contains a key and creates a corresponding\n     * value if not, suppressing checked exceptions. This method calls\n     * {@code createIfAbsent()}. If a {@link ConcurrentException} is thrown, it\n     * is caught and re-thrown as a {@link ConcurrentRuntimeException}.\n     *\n     * @param \u003cK\u003e the type of the keys of the map\n     * @param \u003cV\u003e the type of the values of the map\n     * @param map the map to be modified\n     * @param key the key of the value to be added\n     * @param init the {@link ConcurrentInitializer} for creating the value\n     * @return the value stored in the map after this operation; this may or may\n     * not be the object created by the {@link ConcurrentInitializer}\n     * @throws ConcurrentRuntimeException if the initializer throws an exception\n     ",
      "child_ranges": [
        "(line 300,col 9)-(line 304,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtils.constantFuture(T)",
      "begin_line": 323,
      "end_line": 325,
      "comment": "\n     * \u003cp\u003e\n     * Gets an implementation of \u003ccode\u003eFuture\u003c/code\u003e that is immediately done\n     * and returns the specified constant value.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * This can be useful to return a simple constant immediately from the\n     * concurrent processing, perhaps as part of avoiding nulls.\n     * A constant future can also be useful in testing.\n     * \u003c/p\u003e\n     *\n     * @param \u003cT\u003e the type of the value used by this {@code Future} object\n     * @param value  the constant value to return, may be null\n     * @return an instance of Future that will return the value, never null\n     ",
      "child_ranges": [
        "(line 324,col 9)-(line 324,col 44)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ConstantFuture",
      "is_interface": false,
      "parent_types": [
        "java.util.concurrent.Future\u003cT\u003e"
      ],
      "begin_line": 331,
      "end_line": 384,
      "comment": "\n     * A specialized {@code Future} implementation which wraps a constant value.\n     * @param \u003cT\u003e the type of the value wrapped by this class\n     "
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 333,
      "end_line": 333,
      "comment": " The constant value. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtils.ConstantFuture.ConstantFuture(T)",
      "begin_line": 341,
      "end_line": 343,
      "comment": "\n         * Creates a new instance of {@code ConstantFuture} and initializes it\n         * with the constant value.\n         *\n         * @param value the value (may be \u003cb\u003enull\u003c/b\u003e)\n         ",
      "child_ranges": [
        "(line 342,col 13)-(line 342,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtils.ConstantFuture.isDone()",
      "begin_line": 350,
      "end_line": 352,
      "comment": "\n         * {@inheritDoc} This implementation always returns \u003cb\u003etrue\u003c/b\u003e because\n         * the constant object managed by this {@code Future} implementation is\n         * always available.\n         ",
      "child_ranges": [
        "(line 351,col 13)-(line 351,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtils.ConstantFuture.get()",
      "begin_line": 357,
      "end_line": 359,
      "comment": "\n         * {@inheritDoc} This implementation just returns the constant value.\n         ",
      "child_ranges": [
        "(line 358,col 13)-(line 358,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtils.ConstantFuture.get(long, java.util.concurrent.TimeUnit)",
      "begin_line": 365,
      "end_line": 367,
      "comment": "\n         * {@inheritDoc} This implementation just returns the constant value; it\n         * does not block, therefore the timeout has no meaning.\n         ",
      "child_ranges": [
        "(line 366,col 13)-(line 366,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtils.ConstantFuture.isCancelled()",
      "begin_line": 373,
      "end_line": 375,
      "comment": "\n         * {@inheritDoc} This implementation always returns \u003cb\u003efalse\u003c/b\u003e; there\n         * is no background process which could be cancelled.\n         ",
      "child_ranges": [
        "(line 374,col 13)-(line 374,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtils.ConstantFuture.cancel(boolean)",
      "begin_line": 381,
      "end_line": 383,
      "comment": "\n         * {@inheritDoc} The cancel operation is not supported. This\n         * implementation always returns \u003cb\u003efalse\u003c/b\u003e.\n         ",
      "child_ranges": [
        "(line 382,col 13)-(line 382,col 25)"
      ]
    }
  ]
}