{
  "filepath": "/tmp/Closure-171b/test/com/google/javascript/jscomp/DataFlowAnalysisTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DataFlowAnalysisTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 44,
      "end_line": 796,
      "comment": "\n * A test suite with a very small programming language that has two types of\n * instructions: {@link BranchInstruction} and {@link ArithmeticInstruction}.\n * Test cases must construct a small program with these instructions and\n * manually put each instruction in a {@code ControlFlowGraph}.\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "stringRep"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.DataFlowAnalysisTest.Operation.Operation(java.lang.String)",
      "begin_line": 53,
      "end_line": 55,
      "comment": "",
      "child_ranges": [
        "(line 54,col 7)-(line 54,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DataFlowAnalysisTest.Operation.toString()",
      "begin_line": 57,
      "end_line": 60,
      "comment": "",
      "child_ranges": [
        "(line 59,col 7)-(line 59,col 23)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Value",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 66,
      "end_line": 75,
      "comment": "\n   * A simple value.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DataFlowAnalysisTest.Value.isNumber()",
      "begin_line": 68,
      "end_line": 70,
      "comment": "",
      "child_ranges": [
        "(line 69,col 7)-(line 69,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DataFlowAnalysisTest.Value.isVariable()",
      "begin_line": 72,
      "end_line": 74,
      "comment": "",
      "child_ranges": [
        "(line 73,col 7)-(line 73,col 38)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Variable",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.DataFlowAnalysisTest.Value"
      ],
      "begin_line": 80,
      "end_line": 114,
      "comment": "\n   * A variable.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.DataFlowAnalysisTest.Variable.Variable(java.lang.String)",
      "begin_line": 88,
      "end_line": 90,
      "comment": "\n     * Constructor.\n     *\n     * @param n Name of the variable.\n     ",
      "child_ranges": [
        "(line 89,col 7)-(line 89,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DataFlowAnalysisTest.Variable.getName()",
      "begin_line": 92,
      "end_line": 94,
      "comment": "",
      "child_ranges": [
        "(line 93,col 7)-(line 93,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DataFlowAnalysisTest.Variable.equals(java.lang.Object)",
      "begin_line": 96,
      "end_line": 103,
      "comment": "",
      "child_ranges": [
        "(line 99,col 7)-(line 101,col 7)",
        "(line 102,col 7)-(line 102,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DataFlowAnalysisTest.Variable.hashCode()",
      "begin_line": 105,
      "end_line": 108,
      "comment": "",
      "child_ranges": [
        "(line 107,col 7)-(line 107,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DataFlowAnalysisTest.Variable.toString()",
      "begin_line": 110,
      "end_line": 113,
      "comment": "",
      "child_ranges": [
        "(line 112,col 7)-(line 112,col 23)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Number",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.DataFlowAnalysisTest.Value"
      ],
      "begin_line": 119,
      "end_line": 144,
      "comment": "\n   * A number constant.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 120,
      "end_line": 120,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.DataFlowAnalysisTest.Number.Number(int)",
      "begin_line": 127,
      "end_line": 129,
      "comment": "\n     * Constructor\n     *\n     * @param v Value\n     ",
      "child_ranges": [
        "(line 128,col 7)-(line 128,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DataFlowAnalysisTest.Number.getValue()",
      "begin_line": 131,
      "end_line": 133,
      "comment": "",
      "child_ranges": [
        "(line 132,col 7)-(line 132,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DataFlowAnalysisTest.Number.toString()",
      "begin_line": 135,
      "end_line": 138,
      "comment": "",
      "child_ranges": [
        "(line 137,col 7)-(line 137,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DataFlowAnalysisTest.Number.hashCode()",
      "begin_line": 140,
      "end_line": 143,
      "comment": "",
      "child_ranges": [
        "(line 142,col 7)-(line 142,col 19)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Instruction",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 149,
      "end_line": 170,
      "comment": "\n   * An instruction of the dummy program.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "order"
      ],
      "begin_line": 151,
      "end_line": 151,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DataFlowAnalysisTest.Instruction.isArithmetic()",
      "begin_line": 158,
      "end_line": 160,
      "comment": "\n     * Check whether this is an arithmetic instruction.\n     *\n     * @return {@code true} if it is an arithmetic instruction.\n     ",
      "child_ranges": [
        "(line 159,col 7)-(line 159,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DataFlowAnalysisTest.Instruction.isBranch()",
      "begin_line": 167,
      "end_line": 169,
      "comment": "\n     * Check whether this is a branch instruction.\n     *\n     * @return {@code true} if it is a branch instruction.\n     ",
      "child_ranges": [
        "(line 168,col 7)-(line 168,col 47)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ArithmeticInstruction",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.DataFlowAnalysisTest.Instruction"
      ],
      "begin_line": 179,
      "end_line": 283,
      "comment": "\n   * Basic arithmetic instruction that only takes the form of:\n   *\n   * \u003cpre\u003e\n   * Result \u003d Operand1 operator Operand2\n   * \u003c/pre\u003e\n   "
    },
    {
      "type": "field",
      "varNames": [
        "operation"
      ],
      "begin_line": 180,
      "end_line": 180,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "operand1"
      ],
      "begin_line": 181,
      "end_line": 181,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "operand2"
      ],
      "begin_line": 182,
      "end_line": 182,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "result"
      ],
      "begin_line": 183,
      "end_line": 183,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.DataFlowAnalysisTest.ArithmeticInstruction.ArithmeticInstruction(com.google.javascript.jscomp.DataFlowAnalysisTest.Variable, int, com.google.javascript.jscomp.DataFlowAnalysisTest.Operation, int)",
      "begin_line": 193,
      "end_line": 195,
      "comment": "\n     * Constructor\n     *\n     * @param res Result.\n     * @param op1 First Operand.\n     * @param o Operator.\n     * @param op2 Second Operand.\n     ",
      "child_ranges": [
        "(line 194,col 7)-(line 194,col 53)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.DataFlowAnalysisTest.ArithmeticInstruction.ArithmeticInstruction(com.google.javascript.jscomp.DataFlowAnalysisTest.Variable, com.google.javascript.jscomp.DataFlowAnalysisTest.Value, com.google.javascript.jscomp.DataFlowAnalysisTest.Operation, int)",
      "begin_line": 205,
      "end_line": 207,
      "comment": "\n     * Constructor\n     *\n     * @param res Result.\n     * @param op1 First Operand.\n     * @param o Operator.\n     * @param op2 Second Operand.\n     ",
      "child_ranges": [
        "(line 206,col 7)-(line 206,col 41)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.DataFlowAnalysisTest.ArithmeticInstruction.ArithmeticInstruction(com.google.javascript.jscomp.DataFlowAnalysisTest.Variable, int, com.google.javascript.jscomp.DataFlowAnalysisTest.Operation, com.google.javascript.jscomp.DataFlowAnalysisTest.Value)",
      "begin_line": 217,
      "end_line": 219,
      "comment": "\n     * Constructor\n     *\n     * @param res Result.\n     * @param op1 First Operand.\n     * @param o Operator.\n     * @param op2 Second Operand.\n     ",
      "child_ranges": [
        "(line 218,col 7)-(line 218,col 41)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.DataFlowAnalysisTest.ArithmeticInstruction.ArithmeticInstruction(com.google.javascript.jscomp.DataFlowAnalysisTest.Variable, com.google.javascript.jscomp.DataFlowAnalysisTest.Value, com.google.javascript.jscomp.DataFlowAnalysisTest.Operation, com.google.javascript.jscomp.DataFlowAnalysisTest.Value)",
      "begin_line": 229,
      "end_line": 234,
      "comment": "\n     * Constructor\n     *\n     * @param res Result.\n     * @param op1 First Operand.\n     * @param o Operator.\n     * @param op2 Second Operand.\n     ",
      "child_ranges": [
        "(line 230,col 7)-(line 230,col 19)",
        "(line 231,col 7)-(line 231,col 21)",
        "(line 232,col 7)-(line 232,col 21)",
        "(line 233,col 7)-(line 233,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DataFlowAnalysisTest.ArithmeticInstruction.getOperator()",
      "begin_line": 236,
      "end_line": 238,
      "comment": "",
      "child_ranges": [
        "(line 237,col 7)-(line 237,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DataFlowAnalysisTest.ArithmeticInstruction.setOperator(com.google.javascript.jscomp.DataFlowAnalysisTest.Operation)",
      "begin_line": 240,
      "end_line": 242,
      "comment": "",
      "child_ranges": [
        "(line 241,col 7)-(line 241,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DataFlowAnalysisTest.ArithmeticInstruction.getOperand1()",
      "begin_line": 244,
      "end_line": 246,
      "comment": "",
      "child_ranges": [
        "(line 245,col 7)-(line 245,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DataFlowAnalysisTest.ArithmeticInstruction.setOperand1(com.google.javascript.jscomp.DataFlowAnalysisTest.Value)",
      "begin_line": 248,
      "end_line": 250,
      "comment": "",
      "child_ranges": [
        "(line 249,col 7)-(line 249,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DataFlowAnalysisTest.ArithmeticInstruction.getOperand2()",
      "begin_line": 252,
      "end_line": 254,
      "comment": "",
      "child_ranges": [
        "(line 253,col 7)-(line 253,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DataFlowAnalysisTest.ArithmeticInstruction.setOperand2(com.google.javascript.jscomp.DataFlowAnalysisTest.Value)",
      "begin_line": 256,
      "end_line": 258,
      "comment": "",
      "child_ranges": [
        "(line 257,col 7)-(line 257,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DataFlowAnalysisTest.ArithmeticInstruction.getResult()",
      "begin_line": 260,
      "end_line": 262,
      "comment": "",
      "child_ranges": [
        "(line 261,col 7)-(line 261,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DataFlowAnalysisTest.ArithmeticInstruction.setResult(com.google.javascript.jscomp.DataFlowAnalysisTest.Variable)",
      "begin_line": 264,
      "end_line": 266,
      "comment": "",
      "child_ranges": [
        "(line 265,col 7)-(line 265,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DataFlowAnalysisTest.ArithmeticInstruction.toString()",
      "begin_line": 268,
      "end_line": 277,
      "comment": "",
      "child_ranges": [
        "(line 270,col 7)-(line 270,col 46)",
        "(line 271,col 7)-(line 271,col 25)",
        "(line 272,col 7)-(line 272,col 24)",
        "(line 273,col 7)-(line 273,col 27)",
        "(line 274,col 7)-(line 274,col 28)",
        "(line 275,col 7)-(line 275,col 27)",
        "(line 276,col 7)-(line 276,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DataFlowAnalysisTest.ArithmeticInstruction.hashCode()",
      "begin_line": 279,
      "end_line": 282,
      "comment": "",
      "child_ranges": [
        "(line 281,col 7)-(line 281,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DataFlowAnalysisTest.newAssignNumberToVariableInstruction(com.google.javascript.jscomp.DataFlowAnalysisTest.Variable, int)",
      "begin_line": 285,
      "end_line": 288,
      "comment": "",
      "child_ranges": [
        "(line 287,col 5)-(line 287,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DataFlowAnalysisTest.newAssignVariableToVariableInstruction(com.google.javascript.jscomp.DataFlowAnalysisTest.Variable, com.google.javascript.jscomp.DataFlowAnalysisTest.Variable)",
      "begin_line": 290,
      "end_line": 293,
      "comment": "",
      "child_ranges": [
        "(line 292,col 5)-(line 292,col 65)"
      ]
    },
    {
      "type": "class_interface",
      "name": "BranchInstruction",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.DataFlowAnalysisTest.Instruction"
      ],
      "begin_line": 298,
      "end_line": 312,
      "comment": "\n   * Branch instruction based on a {@link Value} as a condition.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "condition"
      ],
      "begin_line": 299,
      "end_line": 299,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.DataFlowAnalysisTest.BranchInstruction.BranchInstruction(com.google.javascript.jscomp.DataFlowAnalysisTest.Value)",
      "begin_line": 301,
      "end_line": 303,
      "comment": "",
      "child_ranges": [
        "(line 302,col 7)-(line 302,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DataFlowAnalysisTest.BranchInstruction.getCondition()",
      "begin_line": 305,
      "end_line": 307,
      "comment": "",
      "child_ranges": [
        "(line 306,col 7)-(line 306,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DataFlowAnalysisTest.BranchInstruction.setCondition(com.google.javascript.jscomp.DataFlowAnalysisTest.Value)",
      "begin_line": 309,
      "end_line": 311,
      "comment": "",
      "child_ranges": [
        "(line 310,col 7)-(line 310,col 33)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ConstPropLatticeElement",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.graph.LatticeElement"
      ],
      "begin_line": 333,
      "end_line": 391,
      "comment": "\n   * A lattice to represent constant states. Each variable of the program will\n   * have a lattice defined as:\n   *\n   * \u003cpre\u003e\n   *        TOP\n   *   / / |         \\\n   *  0  1 2 3 ..... MAX_VALUE\n   *  \\  \\ |         /\n   *       BOTTOM\n   * \u003c/pre\u003e\n   *\n   * Where BOTTOM represents the variable is not a constant.\n   * \u003cp\u003e\n   * This class will represent a product lattice of each variable\u0027s lattice. The\n   * whole lattice is store in a {@code HashMap}. If variable {@code x} is\n   * defined to be constant 10. The map will contain the value 10 with the\n   * variable {@code x} as key. Otherwise, {@code x} is not a constant.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "constMap"
      ],
      "begin_line": 334,
      "end_line": 334,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "isTop"
      ],
      "begin_line": 335,
      "end_line": 335,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.DataFlowAnalysisTest.ConstPropLatticeElement.ConstPropLatticeElement(boolean)",
      "begin_line": 342,
      "end_line": 345,
      "comment": "\n     * Constructor.\n     *\n     * @param isTop To define if the lattice is top.\n     ",
      "child_ranges": [
        "(line 343,col 7)-(line 343,col 25)",
        "(line 344,col 7)-(line 344,col 40)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.DataFlowAnalysisTest.ConstPropLatticeElement.ConstPropLatticeElement()",
      "begin_line": 350,
      "end_line": 352,
      "comment": "\n     * Create a lattice where every variable is defined to be not constant.\n     ",
      "child_ranges": [
        "(line 351,col 7)-(line 351,col 18)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.DataFlowAnalysisTest.ConstPropLatticeElement.ConstPropLatticeElement(com.google.javascript.jscomp.DataFlowAnalysisTest.ConstPropLatticeElement)",
      "begin_line": 354,
      "end_line": 357,
      "comment": "",
      "child_ranges": [
        "(line 355,col 7)-(line 355,col 31)",
        "(line 356,col 7)-(line 356,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DataFlowAnalysisTest.ConstPropLatticeElement.toString()",
      "begin_line": 359,
      "end_line": 375,
      "comment": "",
      "child_ranges": [
        "(line 361,col 7)-(line 363,col 7)",
        "(line 364,col 7)-(line 364,col 46)",
        "(line 366,col 7)-(line 366,col 22)",
        "(line 367,col 7)-(line 372,col 7)",
        "(line 373,col 7)-(line 373,col 22)",
        "(line 374,col 7)-(line 374,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DataFlowAnalysisTest.ConstPropLatticeElement.equals(java.lang.Object)",
      "begin_line": 377,
      "end_line": 385,
      "comment": "",
      "child_ranges": [
        "(line 379,col 7)-(line 383,col 7)",
        "(line 384,col 7)-(line 384,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DataFlowAnalysisTest.ConstPropLatticeElement.hashCode()",
      "begin_line": 387,
      "end_line": 390,
      "comment": "",
      "child_ranges": [
        "(line 389,col 7)-(line 389,col 33)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ConstPropJoinOp",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.JoinOp.BinaryJoinOp\u003ccom.google.javascript.jscomp.DataFlowAnalysisTest.ConstPropLatticeElement\u003e"
      ],
      "begin_line": 393,
      "end_line": 421,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DataFlowAnalysisTest.ConstPropJoinOp.apply(com.google.javascript.jscomp.DataFlowAnalysisTest.ConstPropLatticeElement, com.google.javascript.jscomp.DataFlowAnalysisTest.ConstPropLatticeElement)",
      "begin_line": 396,
      "end_line": 420,
      "comment": "",
      "child_ranges": [
        "(line 399,col 7)-(line 399,col 69)",
        "(line 401,col 7)-(line 403,col 7)",
        "(line 404,col 7)-(line 406,col 7)",
        "(line 408,col 7)-(line 418,col 7)",
        "(line 419,col 7)-(line 419,col 20)"
      ]
    },
    {
      "type": "class_interface",
      "name": "DummyConstPropagation",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.DataFlowAnalysis\u003ccom.google.javascript.jscomp.DataFlowAnalysisTest.Instruction, com.google.javascript.jscomp.DataFlowAnalysisTest.ConstPropLatticeElement\u003e"
      ],
      "begin_line": 426,
      "end_line": 463,
      "comment": "\n   * A simple forward constant propagation.\n   "
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.DataFlowAnalysisTest.DummyConstPropagation.DummyConstPropagation(com.google.javascript.jscomp.ControlFlowGraph\u003ccom.google.javascript.jscomp.DataFlowAnalysisTest.Instruction\u003e)",
      "begin_line": 434,
      "end_line": 436,
      "comment": "\n     * Constructor.\n     *\n     * @param targetCfg Control Flow Graph.\n     ",
      "child_ranges": [
        "(line 435,col 7)-(line 435,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DataFlowAnalysisTest.DummyConstPropagation.isForward()",
      "begin_line": 438,
      "end_line": 441,
      "comment": "",
      "child_ranges": [
        "(line 440,col 7)-(line 440,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DataFlowAnalysisTest.DummyConstPropagation.flowThrough(com.google.javascript.jscomp.DataFlowAnalysisTest.Instruction, com.google.javascript.jscomp.DataFlowAnalysisTest.ConstPropLatticeElement)",
      "begin_line": 443,
      "end_line": 452,
      "comment": "",
      "child_ranges": [
        "(line 446,col 7)-(line 451,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DataFlowAnalysisTest.DummyConstPropagation.createEntryLattice()",
      "begin_line": 454,
      "end_line": 457,
      "comment": "",
      "child_ranges": [
        "(line 456,col 7)-(line 456,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DataFlowAnalysisTest.DummyConstPropagation.createInitialEstimateLattice()",
      "begin_line": 459,
      "end_line": 462,
      "comment": "",
      "child_ranges": [
        "(line 461,col 7)-(line 461,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DataFlowAnalysisTest.flowThroughArithmeticInstruction(com.google.javascript.jscomp.DataFlowAnalysisTest.ArithmeticInstruction, com.google.javascript.jscomp.DataFlowAnalysisTest.ConstPropLatticeElement)",
      "begin_line": 465,
      "end_line": 509,
      "comment": "",
      "child_ranges": [
        "(line 468,col 5)-(line 468,col 69)",
        "(line 471,col 5)-(line 471,col 29)",
        "(line 472,col 5)-(line 478,col 5)",
        "(line 481,col 5)-(line 481,col 30)",
        "(line 482,col 5)-(line 488,col 5)",
        "(line 491,col 5)-(line 507,col 5)",
        "(line 508,col 5)-(line 508,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DataFlowAnalysisTest.testSimpleIf()",
      "begin_line": 511,
      "end_line": 566,
      "comment": "",
      "child_ranges": [
        "(line 513,col 5)-(line 513,col 35)",
        "(line 514,col 5)-(line 514,col 35)",
        "(line 515,col 5)-(line 515,col 35)",
        "(line 516,col 5)-(line 516,col 49)",
        "(line 517,col 5)-(line 517,col 67)",
        "(line 518,col 5)-(line 518,col 67)",
        "(line 519,col 5)-(line 519,col 69)",
        "(line 520,col 5)-(line 521,col 59)",
        "(line 522,col 5)-(line 522,col 62)",
        "(line 523,col 5)-(line 523,col 62)",
        "(line 524,col 5)-(line 524,col 62)",
        "(line 525,col 5)-(line 525,col 62)",
        "(line 526,col 5)-(line 526,col 64)",
        "(line 527,col 5)-(line 527,col 63)",
        "(line 528,col 5)-(line 528,col 62)",
        "(line 529,col 5)-(line 529,col 62)",
        "(line 531,col 5)-(line 531,col 69)",
        "(line 532,col 5)-(line 532,col 24)",
        "(line 535,col 5)-(line 535,col 29)",
        "(line 536,col 5)-(line 536,col 29)",
        "(line 537,col 5)-(line 537,col 29)",
        "(line 538,col 5)-(line 538,col 30)",
        "(line 539,col 5)-(line 539,col 30)",
        "(line 540,col 5)-(line 540,col 30)",
        "(line 543,col 5)-(line 543,col 29)",
        "(line 544,col 5)-(line 544,col 29)",
        "(line 545,col 5)-(line 545,col 29)",
        "(line 546,col 5)-(line 546,col 30)",
        "(line 547,col 5)-(line 547,col 27)",
        "(line 548,col 5)-(line 548,col 30)",
        "(line 551,col 5)-(line 551,col 29)",
        "(line 552,col 5)-(line 552,col 29)",
        "(line 553,col 5)-(line 553,col 29)",
        "(line 554,col 5)-(line 554,col 30)",
        "(line 555,col 5)-(line 555,col 27)",
        "(line 556,col 5)-(line 556,col 30)",
        "(line 559,col 5)-(line 559,col 29)",
        "(line 560,col 5)-(line 560,col 26)",
        "(line 561,col 5)-(line 561,col 29)",
        "(line 562,col 5)-(line 562,col 30)",
        "(line 564,col 5)-(line 564,col 27)",
        "(line 565,col 5)-(line 565,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DataFlowAnalysisTest.testSimpleLoop()",
      "begin_line": 568,
      "end_line": 622,
      "comment": "",
      "child_ranges": [
        "(line 570,col 5)-(line 570,col 35)",
        "(line 571,col 5)-(line 571,col 35)",
        "(line 572,col 5)-(line 572,col 35)",
        "(line 573,col 5)-(line 573,col 67)",
        "(line 574,col 5)-(line 574,col 74)",
        "(line 575,col 5)-(line 575,col 49)",
        "(line 576,col 5)-(line 576,col 69)",
        "(line 577,col 5)-(line 578,col 59)",
        "(line 579,col 5)-(line 579,col 62)",
        "(line 580,col 5)-(line 580,col 62)",
        "(line 581,col 5)-(line 581,col 62)",
        "(line 582,col 5)-(line 582,col 62)",
        "(line 583,col 5)-(line 583,col 62)",
        "(line 584,col 5)-(line 584,col 62)",
        "(line 585,col 5)-(line 585,col 63)",
        "(line 586,col 5)-(line 586,col 64)",
        "(line 588,col 5)-(line 588,col 69)",
        "(line 590,col 5)-(line 590,col 24)",
        "(line 593,col 5)-(line 593,col 29)",
        "(line 594,col 5)-(line 594,col 29)",
        "(line 595,col 5)-(line 595,col 29)",
        "(line 596,col 5)-(line 596,col 27)",
        "(line 597,col 5)-(line 597,col 30)",
        "(line 598,col 5)-(line 598,col 30)",
        "(line 602,col 5)-(line 602,col 29)",
        "(line 603,col 5)-(line 603,col 29)",
        "(line 604,col 5)-(line 604,col 29)",
        "(line 605,col 5)-(line 605,col 30)",
        "(line 606,col 5)-(line 606,col 30)",
        "(line 607,col 5)-(line 607,col 30)",
        "(line 609,col 5)-(line 609,col 29)",
        "(line 610,col 5)-(line 610,col 29)",
        "(line 611,col 5)-(line 611,col 29)",
        "(line 612,col 5)-(line 612,col 30)",
        "(line 613,col 5)-(line 613,col 30)",
        "(line 614,col 5)-(line 614,col 30)",
        "(line 616,col 5)-(line 616,col 29)",
        "(line 617,col 5)-(line 617,col 29)",
        "(line 618,col 5)-(line 618,col 29)",
        "(line 619,col 5)-(line 619,col 30)",
        "(line 620,col 5)-(line 620,col 30)",
        "(line 621,col 5)-(line 621,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DataFlowAnalysisTest.testLatticeArrayMinimizationWhenMidpointIsEven()",
      "begin_line": 624,
      "end_line": 626,
      "comment": "",
      "child_ranges": [
        "(line 625,col 5)-(line 625,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DataFlowAnalysisTest.testLatticeArrayMinimizationWhenMidpointRoundsDown()",
      "begin_line": 628,
      "end_line": 630,
      "comment": "",
      "child_ranges": [
        "(line 629,col 5)-(line 629,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DataFlowAnalysisTest.testLatticeArrayMinimizationWithTwoElements()",
      "begin_line": 632,
      "end_line": 634,
      "comment": "",
      "child_ranges": [
        "(line 633,col 5)-(line 633,col 60)"
      ]
    },
    {
      "type": "class_interface",
      "name": "BranchedDummyConstPropagation",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.DataFlowAnalysis.BranchedForwardDataFlowAnalysis\u003ccom.google.javascript.jscomp.DataFlowAnalysisTest.Instruction, com.google.javascript.jscomp.DataFlowAnalysisTest.ConstPropLatticeElement\u003e"
      ],
      "begin_line": 640,
      "end_line": 695,
      "comment": "\n   * A simple forward constant propagation.\n   "
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.DataFlowAnalysisTest.BranchedDummyConstPropagation.BranchedDummyConstPropagation(com.google.javascript.jscomp.ControlFlowGraph\u003ccom.google.javascript.jscomp.DataFlowAnalysisTest.Instruction\u003e)",
      "begin_line": 643,
      "end_line": 645,
      "comment": "",
      "child_ranges": [
        "(line 644,col 7)-(line 644,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DataFlowAnalysisTest.BranchedDummyConstPropagation.flowThrough(com.google.javascript.jscomp.DataFlowAnalysisTest.Instruction, com.google.javascript.jscomp.DataFlowAnalysisTest.ConstPropLatticeElement)",
      "begin_line": 647,
      "end_line": 656,
      "comment": "",
      "child_ranges": [
        "(line 650,col 7)-(line 655,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DataFlowAnalysisTest.BranchedDummyConstPropagation.branchedFlowThrough(com.google.javascript.jscomp.DataFlowAnalysisTest.Instruction, com.google.javascript.jscomp.DataFlowAnalysisTest.ConstPropLatticeElement)",
      "begin_line": 658,
      "end_line": 684,
      "comment": "",
      "child_ranges": [
        "(line 661,col 7)-(line 661,col 66)",
        "(line 662,col 7)-(line 663,col 35)",
        "(line 664,col 7)-(line 682,col 7)",
        "(line 683,col 7)-(line 683,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DataFlowAnalysisTest.BranchedDummyConstPropagation.createEntryLattice()",
      "begin_line": 686,
      "end_line": 689,
      "comment": "",
      "child_ranges": [
        "(line 688,col 7)-(line 688,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DataFlowAnalysisTest.BranchedDummyConstPropagation.createInitialEstimateLattice()",
      "begin_line": 691,
      "end_line": 694,
      "comment": "",
      "child_ranges": [
        "(line 693,col 7)-(line 693,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DataFlowAnalysisTest.testBranchedSimpleIf()",
      "begin_line": 697,
      "end_line": 738,
      "comment": "",
      "child_ranges": [
        "(line 699,col 5)-(line 699,col 35)",
        "(line 700,col 5)-(line 700,col 35)",
        "(line 701,col 5)-(line 701,col 35)",
        "(line 702,col 5)-(line 702,col 49)",
        "(line 703,col 5)-(line 703,col 67)",
        "(line 704,col 5)-(line 704,col 67)",
        "(line 705,col 5)-(line 705,col 69)",
        "(line 706,col 5)-(line 707,col 59)",
        "(line 708,col 5)-(line 708,col 62)",
        "(line 709,col 5)-(line 709,col 62)",
        "(line 710,col 5)-(line 710,col 62)",
        "(line 711,col 5)-(line 711,col 62)",
        "(line 712,col 5)-(line 712,col 63)",
        "(line 713,col 5)-(line 713,col 64)",
        "(line 714,col 5)-(line 714,col 62)",
        "(line 715,col 5)-(line 715,col 62)",
        "(line 717,col 5)-(line 718,col 47)",
        "(line 719,col 5)-(line 719,col 24)",
        "(line 722,col 5)-(line 722,col 37)",
        "(line 723,col 5)-(line 723,col 37)",
        "(line 724,col 5)-(line 724,col 37)",
        "(line 727,col 5)-(line 727,col 37)",
        "(line 728,col 5)-(line 728,col 37)",
        "(line 729,col 5)-(line 729,col 37)",
        "(line 732,col 5)-(line 732,col 34)",
        "(line 733,col 5)-(line 733,col 37)",
        "(line 734,col 5)-(line 734,col 37)",
        "(line 737,col 5)-(line 737,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DataFlowAnalysisTest.testMaxIterationsExceededException()",
      "begin_line": 740,
      "end_line": 777,
      "comment": "",
      "child_ranges": [
        "(line 741,col 5)-(line 741,col 28)",
        "(line 742,col 5)-(line 742,col 35)",
        "(line 743,col 5)-(line 743,col 74)",
        "(line 744,col 5)-(line 757,col 6)",
        "(line 758,col 5)-(line 758,col 26)",
        "(line 762,col 5)-(line 768,col 5)",
        "(line 769,col 5)-(line 769,col 69)",
        "(line 770,col 5)-(line 776,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DataFlowAnalysisTest.Anonymous-50d796a3-bcfc-46f4-96fd-653a9d89f0db.getOptionalNodeComparator(boolean)",
      "begin_line": 746,
      "end_line": 756,
      "comment": "",
      "child_ranges": [
        "(line 749,col 9)-(line 755,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "compare(DiGraphNode, DiGraphNode)",
      "exception": "UnsolvedSymbolException{context\u003d\u0027null\u0027, name\u003d\u0027DiGraphNode\u0027, cause\u003d\u0027null\u0027}",
      "begin_line": 750,
      "end_line": 754,
      "comment": "",
      "child_ranges": [
        "(line 753,col 13)-(line 753,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DataFlowAnalysisTest.verifyInHas(com.google.javascript.jscomp.graph.GraphNode\u003ccom.google.javascript.jscomp.DataFlowAnalysisTest.Instruction, com.google.javascript.jscomp.ControlFlowGraph.Branch\u003e, com.google.javascript.jscomp.DataFlowAnalysisTest.Variable, java.lang.Integer)",
      "begin_line": 779,
      "end_line": 783,
      "comment": "",
      "child_ranges": [
        "(line 781,col 5)-(line 781,col 69)",
        "(line 782,col 5)-(line 782,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DataFlowAnalysisTest.verifyOutHas(com.google.javascript.jscomp.graph.GraphNode\u003ccom.google.javascript.jscomp.DataFlowAnalysisTest.Instruction, com.google.javascript.jscomp.ControlFlowGraph.Branch\u003e, com.google.javascript.jscomp.DataFlowAnalysisTest.Variable, java.lang.Integer)",
      "begin_line": 785,
      "end_line": 789,
      "comment": "",
      "child_ranges": [
        "(line 787,col 5)-(line 787,col 69)",
        "(line 788,col 5)-(line 788,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DataFlowAnalysisTest.verifyBranchedInHas(com.google.javascript.jscomp.graph.GraphNode\u003ccom.google.javascript.jscomp.DataFlowAnalysisTest.Instruction, com.google.javascript.jscomp.ControlFlowGraph.Branch\u003e, com.google.javascript.jscomp.DataFlowAnalysisTest.Variable, java.lang.Integer)",
      "begin_line": 791,
      "end_line": 795,
      "comment": "",
      "child_ranges": [
        "(line 793,col 5)-(line 793,col 77)",
        "(line 794,col 5)-(line 794,col 61)"
      ]
    }
  ]
}