{
  "filepath": "/tmp/Gson-6b/gson/src/main/java/com/google/gson/InstanceCreator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "InstanceCreator",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 79,
      "end_line": 92,
      "comment": "\n * This interface is implemented to create instances of a class that does not define a no-args\n * constructor. If you can modify the class, you should instead add a private, or public\n * no-args constructor. However, that is not possible for library classes, such as JDK classes, or\n * a third-party library that you do not have source-code of. In such cases, you should define an\n * instance creator for the class. Implementations of this interface should be registered with\n * {@link GsonBuilder#registerTypeAdapter(Type, Object)} method before Gson will be able to use\n * them.\n * \u003cp\u003eLet us look at an example where defining an InstanceCreator might be useful. The\n * {@code Id} class defined below does not have a default no-args constructor.\u003c/p\u003e\n *\n * \u003cpre\u003e\n * public class Id\u0026lt;T\u0026gt; {\n *   private final Class\u0026lt;T\u0026gt; clazz;\n *   private final long value;\n *   public Id(Class\u0026lt;T\u0026gt; clazz, long value) {\n *     this.clazz \u003d clazz;\n *     this.value \u003d value;\n *   }\n * }\n * \u003c/pre\u003e\n *\n * \u003cp\u003eIf Gson encounters an object of type {@code Id} during deserialization, it will throw an\n * exception. The easiest way to solve this problem will be to add a (public or private) no-args\n * constructor as follows:\u003c/p\u003e\n *\n * \u003cpre\u003e\n * private Id() {\n *   this(Object.class, 0L);\n * }\n * \u003c/pre\u003e\n *\n * \u003cp\u003eHowever, let us assume that the developer does not have access to the source-code of the\n * {@code Id} class, or does not want to define a no-args constructor for it. The developer\n * can solve this problem by defining an {@code InstanceCreator} for {@code Id}:\u003c/p\u003e\n *\n * \u003cpre\u003e\n * class IdInstanceCreator implements InstanceCreator\u0026lt;Id\u0026gt; {\n *   public Id createInstance(Type type) {\n *     return new Id(Object.class, 0L);\n *   }\n * }\n * \u003c/pre\u003e\n *\n * \u003cp\u003eNote that it does not matter what the fields of the created instance contain since Gson will\n * overwrite them with the deserialized values specified in Json. You should also ensure that a\n * \u003ci\u003enew\u003c/i\u003e object is returned, not a common object since its fields will be overwritten.\n * The developer will need to register {@code IdInstanceCreator} with Gson as follows:\u003c/p\u003e\n *\n * \u003cpre\u003e\n * Gson gson \u003d new GsonBuilder().registerTypeAdapter(Id.class, new IdInstanceCreator()).create();\n * \u003c/pre\u003e\n *\n * @param \u003cT\u003e the type of object that will be created by this implementation.\n *\n * @author Inderjeet Singh\n * @author Joel Leitch\n "
    },
    {
      "type": "method",
      "signature": "com.google.gson.InstanceCreator.createInstance(java.lang.reflect.Type)",
      "begin_line": 91,
      "end_line": 91,
      "comment": "\n   * Gson invokes this call-back method during deserialization to create an instance of the\n   * specified type. The fields of the returned instance are overwritten with the data present\n   * in the Json. Since the prior contents of the object are destroyed and overwritten, do not\n   * return an instance that is useful elsewhere. In particular, do not return a common instance,\n   * always use {@code new} to create a new instance.\n   *\n   * @param type the parameterized T represented as a {@link Type}.\n   * @return a default object instance of type T.\n   ",
      "child_ranges": []
    }
  ]
}