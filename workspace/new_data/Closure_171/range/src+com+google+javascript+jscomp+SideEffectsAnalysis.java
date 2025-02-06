{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/jscomp/SideEffectsAnalysis.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SideEffectsAnalysis",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.CompilerPass"
      ],
      "begin_line": 53,
      "end_line": 993,
      "comment": "\n * A pass that analyzes side effects to determine when it is safe to move\n * code from one program point to another.\n *\n * In its current form, SideEffectsAnalysis is very incomplete; this is\n * mostly a sketch to prototype the interface and the broad strokes of\n * a possible implementation based on flow-insensitive MOD and REF sets.\n *\n * See:\n *\n * Banning, John. \"An efficient way to find the side effects of procedure\n *      calls and the aliases of variables.\" POPL \u002779.\n *\n * For an introduction to MOD and REF sets.\n *\n * @author dcc@google.com (Devin Coughlin)\n "
    },
    {
      "type": "field",
      "varNames": [
        "NOT_FUNCTION_PREDICATE"
      ],
      "begin_line": 65,
      "end_line": 71,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SideEffectsAnalysis.Anonymous-fde9e828-9113-4938-ba02-60133f4f533e.apply(com.google.javascript.rhino.Node)",
      "begin_line": 67,
      "end_line": 70,
      "comment": "",
      "child_ranges": [
        "(line 69,col 7)-(line 69,col 33)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "locationAbstraction"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": " The location abstraction used to calculate the effects of code "
    },
    {
      "type": "field",
      "varNames": [
        "locationAbstractionIdentifier"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": " The kind of location abstraction to use "
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.SideEffectsAnalysis.SideEffectsAnalysis(com.google.javascript.jscomp.AbstractCompiler, com.google.javascript.jscomp.SideEffectsAnalysis.LocationAbstractionMode)",
      "begin_line": 90,
      "end_line": 95,
      "comment": "\n   * Constructs a new SideEffectsAnalysis with the given location abstraction.\n   *\n   * @param compiler A compiler instance\n   * @param locationAbstractionMode The location abstraction to use. {@code\n   *    DEGENERATE} will use {@link DegenerateLocationAbstraction} while\n   *    {@code VISIBILITY_BASED} will use {@link VisibilityLocationAbstraction}\n   *\n   ",
      "child_ranges": [
        "(line 92,col 5)-(line 92,col 29)",
        "(line 94,col 5)-(line 94,col 65)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.SideEffectsAnalysis.SideEffectsAnalysis(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 97,
      "end_line": 99,
      "comment": "",
      "child_ranges": [
        "(line 98,col 5)-(line 98,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SideEffectsAnalysis.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 101,
      "end_line": 119,
      "comment": "",
      "child_ranges": [
        "(line 103,col 5)-(line 113,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SideEffectsAnalysis.createVisibilityAbstraction(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 121,
      "end_line": 135,
      "comment": "",
      "child_ranges": [
        "(line 123,col 5)-(line 124,col 49)",
        "(line 126,col 5)-(line 126,col 46)",
        "(line 128,col 5)-(line 129,col 48)",
        "(line 131,col 5)-(line 131,col 30)",
        "(line 133,col 4)-(line 134,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SideEffectsAnalysis.safeToMoveBefore(com.google.javascript.rhino.Node, com.google.javascript.jscomp.SideEffectsAnalysis.AbstractMotionEnvironment, com.google.javascript.rhino.Node)",
      "begin_line": 154,
      "end_line": 216,
      "comment": "\n   * Determines whether it is safe to move code ({@code source}) across\n   * an environment to another program point (immediately preceding\n   * {@code destination}).\n   *\n   * \u003cp\u003eThe notion of \"environment\" is optimization-specific, but it should\n   * include any code that could be executed between the source program point\n   * and the destination program point.\n   *\n   * {@code destination} must not be a descendant of {@code source}.\n   *\n   * @param source The node that would be moved\n   * @param environment An environment representing the code across which\n   *    the source will be moved.\n   * @param destination The node before which the source would be moved\n   * @return Whether it is safe to move the source to the destination\n   ",
      "child_ranges": [
        "(line 157,col 5)-(line 157,col 52)",
        "(line 158,col 5)-(line 158,col 71)",
        "(line 161,col 5)-(line 163,col 5)",
        "(line 166,col 5)-(line 168,col 5)",
        "(line 170,col 5)-(line 171,col 61)",
        "(line 173,col 5)-(line 173,col 68)",
        "(line 177,col 5)-(line 180,col 5)",
        "(line 182,col 5)-(line 182,col 68)",
        "(line 184,col 5)-(line 184,col 68)",
        "(line 186,col 5)-(line 190,col 5)",
        "(line 192,col 5)-(line 193,col 71)",
        "(line 195,col 5)-(line 195,col 78)",
        "(line 197,col 5)-(line 197,col 78)",
        "(line 209,col 5)-(line 213,col 5)",
        "(line 215,col 5)-(line 215,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SideEffectsAnalysis.isPure(com.google.javascript.rhino.Node)",
      "begin_line": 223,
      "end_line": 227,
      "comment": "\n   * Returns true if the node is pure, that is it side effect free and does it\n   * not depend on its environment?\n   * @param node node to check.\n   ",
      "child_ranges": [
        "(line 226,col 5)-(line 226,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SideEffectsAnalysis.nodesHaveSameControlFlow(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 233,
      "end_line": 319,
      "comment": "\n   * Returns true if the two nodes have the same control flow properties,\n   * that is, is node1 be executed every time node2 is executed and vice versa?\n   ",
      "child_ranges": [
        "(line 260,col 5)-(line 261,col 47)",
        "(line 263,col 5)-(line 264,col 45)",
        "(line 266,col 5)-(line 318,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SideEffectsAnalysis.Anonymous-78756ea6-9c15-42f0-8b46-5b20352380eb.apply(com.google.javascript.rhino.Node)",
      "begin_line": 301,
      "end_line": 308,
      "comment": "",
      "child_ranges": [
        "(line 303,col 13)-(line 303,col 43)",
        "(line 305,col 13)-(line 307,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SideEffectsAnalysis.isControlDependentChild(com.google.javascript.rhino.Node)",
      "begin_line": 331,
      "end_line": 364,
      "comment": "\n   * Returns true if the number of times the child executes depends on the\n   * parent.\n   *\n   * For example, the guard of an IF is not control dependent on the\n   * IF, but its two THEN/ELSE blocks are.\n   *\n   * Also, the guard of WHILE and DO are control dependent on the parent\n   * since the number of times it executes depends on the parent.\n   ",
      "child_ranges": [
        "(line 332,col 5)-(line 332,col 36)",
        "(line 334,col 5)-(line 336,col 5)",
        "(line 338,col 5)-(line 338,col 69)",
        "(line 340,col 5)-(line 340,col 55)",
        "(line 342,col 5)-(line 363,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SideEffectsAnalysis.closestControlDependentAncestor(com.google.javascript.rhino.Node)",
      "begin_line": 366,
      "end_line": 379,
      "comment": "",
      "child_ranges": [
        "(line 367,col 5)-(line 369,col 5)",
        "(line 372,col 5)-(line 376,col 5)",
        "(line 378,col 5)-(line 378,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SideEffectsAnalysis.nodeHasAncestor(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 385,
      "end_line": 395,
      "comment": "\n   * Returns true if {@code possibleAncestor} is an ancestor of{@code node}.\n   * A node is not considered to be an ancestor of itself.\n   ",
      "child_ranges": [
        "(line 388,col 5)-(line 392,col 5)",
        "(line 394,col 5)-(line 394,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SideEffectsAnalysis.nodeHasCall(com.google.javascript.rhino.Node)",
      "begin_line": 400,
      "end_line": 407,
      "comment": "\n   * Returns true if a node has a CALL or a NEW descendant.\n   ",
      "child_ranges": [
        "(line 401,col 5)-(line 406,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SideEffectsAnalysis.Anonymous-3d5b2d3f-7cd6-4513-a276-e8cc7452a85f.apply(com.google.javascript.rhino.Node)",
      "begin_line": 402,
      "end_line": 405,
      "comment": "",
      "child_ranges": [
        "(line 404,col 9)-(line 404,col 47)"
      ]
    },
    {
      "type": "class_interface",
      "name": "AbstractMotionEnvironment",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 421,
      "end_line": 427,
      "comment": "\n   * Represents an environment across which code might be moved, i.e. the set\n   * of code that could be run in between the source and the destination.\n   *\n   * SideEffectAnalysis characterizes the code to be moved and the environment\n   * in order to determine if they interact in such a way as to make the move\n   * unsafe.\n   *\n   * Since determining the environment for an optimization can be tricky,\n   * we provide several concrete subclasses that common classes of optimizations\n   * may be able to reuse.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SideEffectsAnalysis.AbstractMotionEnvironment.calculateEnvironment()",
      "begin_line": 426,
      "end_line": 426,
      "comment": "\n     * Calculates the set of nodes that this environment represents.\n     ",
      "child_ranges": []
    },
    {
      "type": "class_interface",
      "name": "IntraproceduralMotionEnvironment",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.SideEffectsAnalysis.AbstractMotionEnvironment"
      ],
      "begin_line": 435,
      "end_line": 459,
      "comment": "\n   * An environment for motion within a function. Given a\n   * control flow graph and a source and destination node in the control\n   * flow graph, instances of this object will calculate the environment between\n   * the source and destination.\n   "
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.SideEffectsAnalysis.IntraproceduralMotionEnvironment.IntraproceduralMotionEnvironment(com.google.javascript.jscomp.ControlFlowGraph\u003ccom.google.javascript.rhino.Node\u003e, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 447,
      "end_line": 452,
      "comment": "\n     * Creates an intraprocedural motion environment.\n     *\n     * @param controlFlowGraph A control flow graph for function in which\n     * code will be moved\n     * @param cfgSource The code to be moved\n     * @param cfgDestination The node immediately before which cfgSource\n     * will be moved\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SideEffectsAnalysis.IntraproceduralMotionEnvironment.calculateEnvironment()",
      "begin_line": 454,
      "end_line": 458,
      "comment": "",
      "child_ranges": [
        "(line 457,col 7)-(line 457,col 18)"
      ]
    },
    {
      "type": "class_interface",
      "name": "CrossModuleMotionEnvironment",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.SideEffectsAnalysis.AbstractMotionEnvironment"
      ],
      "begin_line": 467,
      "end_line": 492,
      "comment": "\n   * An environment for motion between modules. Given a\n   * module graph and as well as source and destination nodes and modules,\n   * instances of this object will calculate the environment between the source\n   * and destination.\n   "
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.SideEffectsAnalysis.CrossModuleMotionEnvironment.CrossModuleMotionEnvironment(com.google.javascript.rhino.Node, com.google.javascript.jscomp.JSModule, com.google.javascript.rhino.Node, com.google.javascript.jscomp.JSModule, com.google.javascript.jscomp.JSModuleGraph)",
      "begin_line": 479,
      "end_line": 485,
      "comment": "\n     * Creates a cross module code motion environment.\n     *\n     * @param sourceNode The code to be moved\n     * @param sourceModule The module for the code to be moved\n     * @param destinationNode The node before which sourceNode will be inserted\n     * @param destinationModule The module that destination is in\n     * @param moduleGraph The module graph of the entire program\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SideEffectsAnalysis.CrossModuleMotionEnvironment.calculateEnvironment()",
      "begin_line": 487,
      "end_line": 491,
      "comment": "",
      "child_ranges": [
        "(line 490,col 7)-(line 490,col 18)"
      ]
    },
    {
      "type": "class_interface",
      "name": "RawMotionEnvironment",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.SideEffectsAnalysis.AbstractMotionEnvironment"
      ],
      "begin_line": 498,
      "end_line": 510,
      "comment": "\n     * A low-level concrete environment that allows the client to specify\n     * the environment nodes directly. Clients may wish to use this environment\n     * if none of the higher-level environments fit their needs.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "environment"
      ],
      "begin_line": 500,
      "end_line": 500,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.SideEffectsAnalysis.RawMotionEnvironment.RawMotionEnvironment(java.util.Set\u003ccom.google.javascript.rhino.Node\u003e)",
      "begin_line": 502,
      "end_line": 504,
      "comment": "",
      "child_ranges": [
        "(line 503,col 7)-(line 503,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SideEffectsAnalysis.RawMotionEnvironment.calculateEnvironment()",
      "begin_line": 506,
      "end_line": 509,
      "comment": "",
      "child_ranges": [
        "(line 508,col 7)-(line 508,col 25)"
      ]
    },
    {
      "type": "class_interface",
      "name": "LocationSummary",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 518,
      "end_line": 535,
      "comment": "\n   * A combined representation for location set summaries.\n   *\n   * Basically, it is often easier to shuffle MOD/REF around together; this is\n   * a value class for that purpose.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "modSet"
      ],
      "begin_line": 520,
      "end_line": 520,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "refSet"
      ],
      "begin_line": 521,
      "end_line": 521,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.SideEffectsAnalysis.LocationSummary.LocationSummary(com.google.javascript.jscomp.SideEffectsAnalysis.EffectLocation, com.google.javascript.jscomp.SideEffectsAnalysis.EffectLocation)",
      "begin_line": 523,
      "end_line": 526,
      "comment": "",
      "child_ranges": [
        "(line 524,col 7)-(line 524,col 27)",
        "(line 525,col 7)-(line 525,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SideEffectsAnalysis.LocationSummary.getModSet()",
      "begin_line": 528,
      "end_line": 530,
      "comment": "",
      "child_ranges": [
        "(line 529,col 7)-(line 529,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SideEffectsAnalysis.LocationSummary.getRefSet()",
      "begin_line": 532,
      "end_line": 534,
      "comment": "",
      "child_ranges": [
        "(line 533,col 7)-(line 533,col 20)"
      ]
    },
    {
      "type": "class_interface",
      "name": "EffectLocation",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 550,
      "end_line": 573,
      "comment": "\n   * Interface representing the notion of an effect location -- an abstract\n   * location that can be modified or referenced.\n   *\n   * \u003cp\u003eSince there are an infinite number of possible concrete locations\n   * in a running program, this abstraction must be imprecise (i.e. there\n   * will be some distinct concrete locations that are indistinguishable\n   * under the abstraction).\n   *\n   * \u003cp\u003eDifferent location abstractions will provide their\n   * own implementations of this interface, based on the level and kind\n   * of precision they provide.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SideEffectsAnalysis.EffectLocation.intersectsLocation(com.google.javascript.jscomp.SideEffectsAnalysis.EffectLocation)",
      "begin_line": 558,
      "end_line": 558,
      "comment": "\n     * Does the receiver\u0027s effect location intersect a given effect location?\n     * That is, could any of the concrete storage locations (fields, variables,\n     * etc.) represented by the receiver be contained in the set of concrete\n     * storage locations represented by the given abstract effect location.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SideEffectsAnalysis.EffectLocation.join(com.google.javascript.jscomp.SideEffectsAnalysis.EffectLocation)",
      "begin_line": 567,
      "end_line": 567,
      "comment": "\n     * Returns the result of merging the given effect location with\n     * the receiver. The concrete locations represented by the result must\n     * include all the concrete locations represented by each of the merged\n     * locations and may also possibly include more (i.e., a join may\n     * introduce a loss of precision).\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SideEffectsAnalysis.EffectLocation.isEmpty()",
      "begin_line": 572,
      "end_line": 572,
      "comment": "\n     * Does the effect location represent any possible concrete locations?\n     ",
      "child_ranges": []
    },
    {
      "type": "class_interface",
      "name": "LocationAbstraction",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 583,
      "end_line": 616,
      "comment": "\n   * An abstract class representing a location abstraction. (Here \"abstraction\"\n   * means an imprecise representation of concrete side effects.)\n   *\n   * \u003cp\u003eImplementations of this class will each provide own their\n   * implementation(s) of SideEffectLocation and methods to determine the side\n   * effect locations of a given piece of code.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SideEffectsAnalysis.LocationAbstraction.calculateLocationSummary(com.google.javascript.rhino.Node)",
      "begin_line": 588,
      "end_line": 588,
      "comment": " Calculates the abstraction-specific side effects\n     * for the node.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SideEffectsAnalysis.LocationAbstraction.getBottomLocation()",
      "begin_line": 597,
      "end_line": 597,
      "comment": "\n     * Returns an abstraction-specific EffectLocation representing\n     * no location.\n     *\n     * \u003cp\u003eThe bottom location joined with any location should return\n     * that location.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SideEffectsAnalysis.LocationAbstraction.calculateLocationSummary(java.util.Set\u003ccom.google.javascript.rhino.Node\u003e)",
      "begin_line": 603,
      "end_line": 615,
      "comment": "\n     * Calculates the abstraction-specific side effects\n     * for the node.\n     ",
      "child_ranges": [
        "(line 604,col 7)-(line 604,col 58)",
        "(line 605,col 7)-(line 605,col 58)",
        "(line 607,col 7)-(line 612,col 7)",
        "(line 614,col 7)-(line 614,col 65)"
      ]
    },
    {
      "type": "class_interface",
      "name": "DegenerateLocationAbstraction",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.SideEffectsAnalysis.LocationAbstraction"
      ],
      "begin_line": 626,
      "end_line": 681,
      "comment": "\n   * A very imprecise location abstraction in which there are only two abstract\n   * locations: one representing all concrete locations and one for bottom\n   * (no concrete locations).\n   *\n   * This implementation is a thin wrapper on NodeUtil.mayHaveSideEffects()\n   * and NodeUtil.canBeSideEffected() -- it doesn\u0027t add any real value other\n   * than to prototype the LocationAbstraction interface.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "EVERY_LOCATION"
      ],
      "begin_line": 629,
      "end_line": 630,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "NO_LOCATION"
      ],
      "begin_line": 632,
      "end_line": 633,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SideEffectsAnalysis.DegenerateLocationAbstraction.getBottomLocation()",
      "begin_line": 635,
      "end_line": 638,
      "comment": "",
      "child_ranges": [
        "(line 637,col 7)-(line 637,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SideEffectsAnalysis.DegenerateLocationAbstraction.calculateLocationSummary(com.google.javascript.rhino.Node)",
      "begin_line": 640,
      "end_line": 643,
      "comment": "",
      "child_ranges": [
        "(line 642,col 7)-(line 642,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SideEffectsAnalysis.DegenerateLocationAbstraction.calculateRefSet(com.google.javascript.rhino.Node)",
      "begin_line": 645,
      "end_line": 651,
      "comment": "",
      "child_ranges": [
        "(line 646,col 7)-(line 650,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SideEffectsAnalysis.DegenerateLocationAbstraction.calculateModSet(com.google.javascript.rhino.Node)",
      "begin_line": 653,
      "end_line": 659,
      "comment": "",
      "child_ranges": [
        "(line 654,col 7)-(line 658,col 7)"
      ]
    },
    {
      "type": "class_interface",
      "name": "DegenerateEffectLocation",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.SideEffectsAnalysis.EffectLocation"
      ],
      "begin_line": 661,
      "end_line": 680,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SideEffectsAnalysis.DegenerateLocationAbstraction.DegenerateEffectLocation.join(com.google.javascript.jscomp.SideEffectsAnalysis.EffectLocation)",
      "begin_line": 662,
      "end_line": 669,
      "comment": "",
      "child_ranges": [
        "(line 664,col 9)-(line 668,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SideEffectsAnalysis.DegenerateLocationAbstraction.DegenerateEffectLocation.intersectsLocation(com.google.javascript.jscomp.SideEffectsAnalysis.EffectLocation)",
      "begin_line": 671,
      "end_line": 674,
      "comment": "",
      "child_ranges": [
        "(line 673,col 9)-(line 673,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SideEffectsAnalysis.DegenerateLocationAbstraction.DegenerateEffectLocation.isEmpty()",
      "begin_line": 676,
      "end_line": 679,
      "comment": "",
      "child_ranges": [
        "(line 678,col 9)-(line 678,col 35)"
      ]
    },
    {
      "type": "class_interface",
      "name": "VisibilityLocationAbstraction",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.SideEffectsAnalysis.LocationAbstraction"
      ],
      "begin_line": 709,
      "end_line": 936,
      "comment": "\n   * A location abstraction based on the visibility of concrete locations.\n   *\n   * A global variables are treated as one common location, as are all heap\n   * storage locations.\n   *\n   * Local variables are broken up into two classes, one for truly local\n   * variables and one for local variables captured by an inner scope. Each\n   * of these classes has their own separate location representing the\n   * variables in the class.\n   *\n   * Parameter variables are considered to be heap locations since they\n   * can be accessed via the arguments object which itself can be aliased.\n   *\n   * A more precise analysis could:\n   *    1) put parameters on the heap only when \"arguments\" is actually used\n   *        in a method\n   *    2) recognize that GETPROPs cannot access or modify parameters, only\n   *        GETELEMs\n   *\n   * TODO(dcc): Don\u0027t merge parameters with the heap unless necessary.\n   *\n   * Internally, abstract locations are represented as integers\n   * with bits set (masks) representing the storage classes in the location, so\n   * that joining is bit-wise ORing and intersection is bitwise AND.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "VISIBILITY_LOCATION_NONE"
      ],
      "begin_line": 713,
      "end_line": 713,
      "comment": " The \"bottom\" location. Used to signify an empty location set "
    },
    {
      "type": "field",
      "varNames": [
        "UNKNOWN_LOCATION_MASK"
      ],
      "begin_line": 716,
      "end_line": 716,
      "comment": " The \"top\" location. Used to signify the set containing all locations "
    },
    {
      "type": "field",
      "varNames": [
        "LOCAL_VARIABLE_LOCATION_MASK"
      ],
      "begin_line": 718,
      "end_line": 718,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CAPTURED_LOCAL_VARIABLE_LOCATION_MASK"
      ],
      "begin_line": 720,
      "end_line": 720,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "GLOBAL_VARIABLE_LOCATION_MASK"
      ],
      "begin_line": 722,
      "end_line": 722,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "HEAP_LOCATION_MASK"
      ],
      "begin_line": 724,
      "end_line": 724,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 726,
      "end_line": 726,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "variableVisibilityAnalysis"
      ],
      "begin_line": 728,
      "end_line": 728,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "variableUseMap"
      ],
      "begin_line": 729,
      "end_line": 729,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.SideEffectsAnalysis.VisibilityLocationAbstraction.VisibilityLocationAbstraction(com.google.javascript.jscomp.AbstractCompiler, com.google.javascript.jscomp.VariableVisibilityAnalysis, com.google.javascript.jscomp.SideEffectsAnalysis.VariableUseDeclarationMap)",
      "begin_line": 731,
      "end_line": 737,
      "comment": "",
      "child_ranges": [
        "(line 734,col 7)-(line 734,col 31)",
        "(line 735,col 7)-(line 735,col 67)",
        "(line 736,col 7)-(line 736,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SideEffectsAnalysis.VisibilityLocationAbstraction.calculateLocationSummary(com.google.javascript.rhino.Node)",
      "begin_line": 742,
      "end_line": 774,
      "comment": "\n     * Calculates the MOD/REF summary for the given node.\n     ",
      "child_ranges": [
        "(line 744,col 7)-(line 744,col 60)",
        "(line 745,col 7)-(line 745,col 60)",
        "(line 747,col 7)-(line 765,col 7)",
        "(line 767,col 7)-(line 768,col 68)",
        "(line 770,col 7)-(line 771,col 66)",
        "(line 773,col 7)-(line 773,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SideEffectsAnalysis.VisibilityLocationAbstraction.findStorageLocationReferences(com.google.javascript.rhino.Node)",
      "begin_line": 780,
      "end_line": 794,
      "comment": "\n     * Returns the set of references to storage locations (both variables\n     * and the heap) under {@code root}.\n     ",
      "child_ranges": [
        "(line 781,col 7)-(line 781,col 53)",
        "(line 783,col 7)-(line 791,col 9)",
        "(line 793,col 7)-(line 793,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SideEffectsAnalysis.VisibilityLocationAbstraction.Anonymous-b2203d5a-0872-4d3e-8bde-ddabb2264aea.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 784,
      "end_line": 790,
      "comment": "",
      "child_ranges": [
        "(line 786,col 11)-(line 789,col 11)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SideEffectsAnalysis.VisibilityLocationAbstraction.effectMaskForVariableReference(com.google.javascript.rhino.Node)",
      "begin_line": 799,
      "end_line": 836,
      "comment": "\n     * Calculates the effect mask for a variable reference.\n     ",
      "child_ranges": [
        "(line 800,col 7)-(line 800,col 62)",
        "(line 802,col 7)-(line 802,col 48)",
        "(line 804,col 7)-(line 805,col 70)",
        "(line 807,col 7)-(line 833,col 7)",
        "(line 835,col 7)-(line 835,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SideEffectsAnalysis.VisibilityLocationAbstraction.getBottomLocation()",
      "begin_line": 838,
      "end_line": 841,
      "comment": "",
      "child_ranges": [
        "(line 840,col 7)-(line 840,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SideEffectsAnalysis.VisibilityLocationAbstraction.isStorageNode(com.google.javascript.rhino.Node)",
      "begin_line": 848,
      "end_line": 850,
      "comment": "\n     * Returns true if the node is a storage node.\n     *\n     * Only NAMEs, GETPROPs, and GETELEMs are storage nodes.\n     ",
      "child_ranges": [
        "(line 849,col 7)-(line 849,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SideEffectsAnalysis.VisibilityLocationAbstraction.storageNodeIsRValue(com.google.javascript.rhino.Node)",
      "begin_line": 855,
      "end_line": 879,
      "comment": "\n     * Return true if the storage node is an r-value.\n     ",
      "child_ranges": [
        "(line 856,col 7)-(line 856,col 55)",
        "(line 863,col 7)-(line 863,col 37)",
        "(line 865,col 7)-(line 876,col 7)",
        "(line 878,col 7)-(line 878,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SideEffectsAnalysis.VisibilityLocationAbstraction.storageNodeIsLValue(com.google.javascript.rhino.Node)",
      "begin_line": 884,
      "end_line": 887,
      "comment": "\n     * Return true if the storage node is an l-value.\n     ",
      "child_ranges": [
        "(line 885,col 7)-(line 885,col 55)",
        "(line 886,col 7)-(line 886,col 37)"
      ]
    },
    {
      "type": "class_interface",
      "name": "VisibilityBasedEffectLocation",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.SideEffectsAnalysis.EffectLocation"
      ],
      "begin_line": 899,
      "end_line": 935,
      "comment": "\n     * An abstract effect location based the visibility of the\n     * concrete storage location.\n     *\n     * See {@link VisibilityLocationAbstraction} for deeper description\n     * of this abstraction.\n     *\n     * The effect locations are stored as bits set on an integer, so\n     * intersect, join, etc. are the standard bitwise operations.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "visibilityMask"
      ],
      "begin_line": 901,
      "end_line": 901,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.SideEffectsAnalysis.VisibilityLocationAbstraction.VisibilityBasedEffectLocation.VisibilityBasedEffectLocation(int)",
      "begin_line": 903,
      "end_line": 905,
      "comment": "",
      "child_ranges": [
        "(line 904,col 9)-(line 904,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SideEffectsAnalysis.VisibilityLocationAbstraction.VisibilityBasedEffectLocation.intersectsLocation(com.google.javascript.jscomp.SideEffectsAnalysis.EffectLocation)",
      "begin_line": 907,
      "end_line": 916,
      "comment": "",
      "child_ranges": [
        "(line 909,col 9)-(line 910,col 43)",
        "(line 912,col 9)-(line 913,col 75)",
        "(line 915,col 9)-(line 915,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SideEffectsAnalysis.VisibilityLocationAbstraction.VisibilityBasedEffectLocation.isEmpty()",
      "begin_line": 918,
      "end_line": 921,
      "comment": "",
      "child_ranges": [
        "(line 920,col 9)-(line 920,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SideEffectsAnalysis.VisibilityLocationAbstraction.VisibilityBasedEffectLocation.join(com.google.javascript.jscomp.SideEffectsAnalysis.EffectLocation)",
      "begin_line": 923,
      "end_line": 934,
      "comment": "",
      "child_ranges": [
        "(line 925,col 9)-(line 926,col 43)",
        "(line 928,col 9)-(line 929,col 75)",
        "(line 931,col 9)-(line 931,col 52)",
        "(line 933,col 9)-(line 933,col 61)"
      ]
    },
    {
      "type": "class_interface",
      "name": "VariableUseDeclarationMap",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 942,
      "end_line": 992,
      "comment": "\n   * Maps NAME nodes that refer to variables to the NAME\n   * nodes that declared them.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 944,
      "end_line": 944,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "referencesByNameNode"
      ],
      "begin_line": 947,
      "end_line": 947,
      "comment": " Maps a using name to its declaring name"
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.SideEffectsAnalysis.VariableUseDeclarationMap.VariableUseDeclarationMap(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 949,
      "end_line": 951,
      "comment": "",
      "child_ranges": [
        "(line 950,col 7)-(line 950,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SideEffectsAnalysis.VariableUseDeclarationMap.mapUses(com.google.javascript.rhino.Node)",
      "begin_line": 960,
      "end_line": 980,
      "comment": "\n     * Adds a map from each use NAME in {@code root} to its corresponding\n     * declaring name, *provided the declaration is also under root*.\n     *\n     * If the declaration is not under root, then the reference will\n     * not be added to the map.\n     ",
      "child_ranges": [
        "(line 961,col 7)-(line 961,col 47)",
        "(line 963,col 7)-(line 965,col 61)",
        "(line 967,col 7)-(line 967,col 55)",
        "(line 969,col 7)-(line 979,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SideEffectsAnalysis.VariableUseDeclarationMap.findDeclaringNameNodeForUse(com.google.javascript.rhino.Node)",
      "begin_line": 987,
      "end_line": 991,
      "comment": "\n     * Returns the NAME node for the declaration of the variable\n     * that {@code usingNameNode} refers to, if it is in the map,\n     * or {@code null} otherwise.\n     ",
      "child_ranges": [
        "(line 988,col 7)-(line 988,col 58)",
        "(line 990,col 7)-(line 990,col 53)"
      ]
    }
  ]
}