{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/ode/MultistepIntegrator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MultistepIntegrator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.ode.nonstiff.AdaptiveStepsizeIntegrator"
      ],
      "begin_line": 63,
      "end_line": 448,
      "comment": "\n * This class is the base class for multistep integrators for Ordinary\n * Differential Equations.\n * \u003cp\u003eWe define scaled derivatives s\u003csub\u003ei\u003c/sub\u003e(n) at step n as:\n * \u003cpre\u003e\n * s\u003csub\u003e1\u003c/sub\u003e(n) \u003d h y\u0027\u003csub\u003en\u003c/sub\u003e for first derivative\n * s\u003csub\u003e2\u003c/sub\u003e(n) \u003d h\u003csup\u003e2\u003c/sup\u003e/2 y\u0027\u0027\u003csub\u003en\u003c/sub\u003e for second derivative\n * s\u003csub\u003e3\u003c/sub\u003e(n) \u003d h\u003csup\u003e3\u003c/sup\u003e/6 y\u0027\u0027\u0027\u003csub\u003en\u003c/sub\u003e for third derivative\n * ...\n * s\u003csub\u003ek\u003c/sub\u003e(n) \u003d h\u003csup\u003ek\u003c/sup\u003e/k! y\u003csup\u003e(k)\u003c/sup\u003e\u003csub\u003en\u003c/sub\u003e for k\u003csup\u003eth\u003c/sup\u003e derivative\n * \u003c/pre\u003e\u003c/p\u003e\n * \u003cp\u003eRather than storing several previous steps separately, this implementation uses\n * the Nordsieck vector with higher degrees scaled derivatives all taken at the same\n * step (y\u003csub\u003en\u003c/sub\u003e, s\u003csub\u003e1\u003c/sub\u003e(n) and r\u003csub\u003en\u003c/sub\u003e) where r\u003csub\u003en\u003c/sub\u003e is defined as:\n * \u003cpre\u003e\n * r\u003csub\u003en\u003c/sub\u003e \u003d [ s\u003csub\u003e2\u003c/sub\u003e(n), s\u003csub\u003e3\u003c/sub\u003e(n) ... s\u003csub\u003ek\u003c/sub\u003e(n) ]\u003csup\u003eT\u003c/sup\u003e\n * \u003c/pre\u003e\n * (we omit the k index in the notation for clarity)\u003c/p\u003e\n * \u003cp\u003e\n * Multistep integrators with Nordsieck representation are highly sensitive to\n * large step changes because when the step is multiplied by factor a, the\n * k\u003csup\u003eth\u003c/sup\u003e component of the Nordsieck vector is multiplied by a\u003csup\u003ek\u003c/sup\u003e\n * and the last components are the least accurate ones. The default max growth\n * factor is therefore set to a quite low value: 2\u003csup\u003e1/order\u003c/sup\u003e.\n * \u003c/p\u003e\n *\n * @see org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator\n * @see org.apache.commons.math3.ode.nonstiff.AdamsMoultonIntegrator\n * @version $Id$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "scaled"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": " First scaled derivative (h y\u0027). "
    },
    {
      "type": "field",
      "varNames": [
        "nordsieck"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": " Nordsieck matrix of the higher scaled derivatives.\n     * \u003cp\u003e(h\u003csup\u003e2\u003c/sup\u003e/2 y\u0027\u0027, h\u003csup\u003e3\u003c/sup\u003e/6 y\u0027\u0027\u0027 ..., h\u003csup\u003ek\u003c/sup\u003e/k! y\u003csup\u003e(k)\u003c/sup\u003e)\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "starter"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": " Starter integrator. "
    },
    {
      "type": "field",
      "varNames": [
        "nSteps"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": " Number of steps of the multistep method (excluding the one being computed). "
    },
    {
      "type": "field",
      "varNames": [
        "exp"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": " Stepsize control exponent. "
    },
    {
      "type": "field",
      "varNames": [
        "safety"
      ],
      "begin_line": 83,
      "end_line": 83,
      "comment": " Safety factor for stepsize control. "
    },
    {
      "type": "field",
      "varNames": [
        "minReduction"
      ],
      "begin_line": 86,
      "end_line": 86,
      "comment": " Minimal reduction factor for stepsize control. "
    },
    {
      "type": "field",
      "varNames": [
        "maxGrowth"
      ],
      "begin_line": 89,
      "end_line": 89,
      "comment": " Maximal growth factor for stepsize control. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.ode.MultistepIntegrator.MultistepIntegrator(java.lang.String, int, int, double, double, double, double)",
      "begin_line": 111,
      "end_line": 138,
      "comment": "\n     * Build a multistep integrator with the given stepsize bounds.\n     * \u003cp\u003eThe default starter integrator is set to the {@link\n     * DormandPrince853Integrator Dormand-Prince 8(5,3)} integrator with\n     * some defaults settings.\u003c/p\u003e\n     * \u003cp\u003e\n     * The default max growth factor is set to a quite low value: 2\u003csup\u003e1/order\u003c/sup\u003e.\n     * \u003c/p\u003e\n     * @param name name of the method\n     * @param nSteps number of steps of the multistep method\n     * (excluding the one being computed)\n     * @param order order of the method\n     * @param minStep minimal step (must be positive even for backward\n     * integration), the last step can be smaller than this\n     * @param maxStep maximal step (must be positive even for backward\n     * integration)\n     * @param scalAbsoluteTolerance allowed absolute error\n     * @param scalRelativeTolerance allowed relative error\n     * @exception NumberIsTooSmallException if number of steps is smaller than 2\n     ",
      "child_ranges": [
        "(line 118,col 9)-(line 118,col 84)",
        "(line 120,col 9)-(line 124,col 9)",
        "(line 126,col 9)-(line 128,col 72)",
        "(line 129,col 9)-(line 129,col 29)",
        "(line 131,col 9)-(line 131,col 27)",
        "(line 134,col 9)-(line 134,col 23)",
        "(line 135,col 9)-(line 135,col 29)",
        "(line 136,col 9)-(line 136,col 46)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.ode.MultistepIntegrator.MultistepIntegrator(java.lang.String, int, int, double, double, double[], double[])",
      "begin_line": 159,
      "end_line": 177,
      "comment": "\n     * Build a multistep integrator with the given stepsize bounds.\n     * \u003cp\u003eThe default starter integrator is set to the {@link\n     * DormandPrince853Integrator Dormand-Prince 8(5,3)} integrator with\n     * some defaults settings.\u003c/p\u003e\n     * \u003cp\u003e\n     * The default max growth factor is set to a quite low value: 2\u003csup\u003e1/order\u003c/sup\u003e.\n     * \u003c/p\u003e\n     * @param name name of the method\n     * @param nSteps number of steps of the multistep method\n     * (excluding the one being computed)\n     * @param order order of the method\n     * @param minStep minimal step (must be positive even for backward\n     * integration), the last step can be smaller than this\n     * @param maxStep maximal step (must be positive even for backward\n     * integration)\n     * @param vecAbsoluteTolerance allowed absolute error\n     * @param vecRelativeTolerance allowed relative error\n     ",
      "child_ranges": [
        "(line 164,col 9)-(line 164,col 82)",
        "(line 165,col 9)-(line 167,col 71)",
        "(line 168,col 9)-(line 168,col 29)",
        "(line 170,col 9)-(line 170,col 27)",
        "(line 173,col 9)-(line 173,col 23)",
        "(line 174,col 9)-(line 174,col 29)",
        "(line 175,col 9)-(line 175,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.MultistepIntegrator.getStarterIntegrator()",
      "begin_line": 183,
      "end_line": 185,
      "comment": "\n     * Get the starter integrator.\n     * @return starter integrator\n     ",
      "child_ranges": [
        "(line 184,col 9)-(line 184,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.MultistepIntegrator.setStarterIntegrator(org.apache.commons.math3.ode.FirstOrderIntegrator)",
      "begin_line": 194,
      "end_line": 196,
      "comment": "\n     * Set the starter integrator.\n     * \u003cp\u003eThe various step and event handlers for this starter integrator\n     * will be managed automatically by the multi-step integrator. Any\n     * user configuration for these elements will be cleared before use.\u003c/p\u003e\n     * @param starterIntegrator starter integrator\n     ",
      "child_ranges": [
        "(line 195,col 9)-(line 195,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.MultistepIntegrator.start(double, double[], double)",
      "begin_line": 216,
      "end_line": 261,
      "comment": " Start the integration.\n     * \u003cp\u003eThis method computes one step using the underlying starter integrator,\n     * and initializes the Nordsieck vector at step start. The starter integrator\n     * purpose is only to establish initial conditions, it does not really change\n     * time by itself. The top level multistep integrator remains in charge of\n     * handling time propagation and events handling as it will starts its own\n     * computation right from the beginning. In a sense, the starter integrator\n     * can be seen as a dummy one and so it will never trigger any user event nor\n     * call any user step handler.\u003c/p\u003e\n     * @param t0 initial time\n     * @param y0 initial value of the state vector at t0\n     * @param t target time for the integration\n     * (can be set to a value smaller than \u003ccode\u003et0\u003c/code\u003e for backward integration)\n     * @exception DimensionMismatchException if arrays dimension do not match equations settings\n     * @exception NumberIsTooSmallException if integration step is too small\n     * @exception MaxCountExceededException if the number of functions evaluations is exceeded\n     * @exception NoBracketingException if the location of an event cannot be bracketed\n     ",
      "child_ranges": [
        "(line 223,col 9)-(line 223,col 37)",
        "(line 224,col 9)-(line 224,col 36)",
        "(line 227,col 9)-(line 227,col 76)",
        "(line 230,col 9)-(line 256,col 9)",
        "(line 259,col 9)-(line 259,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.MultistepIntegrator.Anonymous-49c80117-e4a1-4e04-a4f1-66297e46c685.getDimension()",
      "begin_line": 238,
      "end_line": 240,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 239,col 25)-(line 239,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.MultistepIntegrator.Anonymous-a23f8db7-763b-4301-ac23-b1818c6e8a01.computeDerivatives(double, double[], double[])",
      "begin_line": 243,
      "end_line": 245,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 244,col 25)-(line 244,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.MultistepIntegrator.initializeHighOrderDerivatives(double, double[], double[][], double[][])",
      "begin_line": 271,
      "end_line": 273,
      "comment": " Initialize the high order scaled derivatives at step start.\n     * @param h step size to use for scaling\n     * @param t first steps times\n     * @param y first steps states\n     * @param yDot first steps derivatives\n     * @return Nordieck vector at first step (h\u003csup\u003e2\u003c/sup\u003e/2 y\u0027\u0027\u003csub\u003en\u003c/sub\u003e,\n     * h\u003csup\u003e3\u003c/sup\u003e/6 y\u0027\u0027\u0027\u003csub\u003en\u003c/sub\u003e ... h\u003csup\u003ek\u003c/sup\u003e/k! y\u003csup\u003e(k)\u003c/sup\u003e\u003csub\u003en\u003c/sub\u003e)\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.MultistepIntegrator.getMinReduction()",
      "begin_line": 278,
      "end_line": 280,
      "comment": " Get the minimal reduction factor for stepsize control.\n     * @return minimal reduction factor\n     ",
      "child_ranges": [
        "(line 279,col 9)-(line 279,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.MultistepIntegrator.setMinReduction(double)",
      "begin_line": 285,
      "end_line": 287,
      "comment": " Set the minimal reduction factor for stepsize control.\n     * @param minReduction minimal reduction factor\n     ",
      "child_ranges": [
        "(line 286,col 9)-(line 286,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.MultistepIntegrator.getMaxGrowth()",
      "begin_line": 292,
      "end_line": 294,
      "comment": " Get the maximal growth factor for stepsize control.\n     * @return maximal growth factor\n     ",
      "child_ranges": [
        "(line 293,col 9)-(line 293,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.MultistepIntegrator.setMaxGrowth(double)",
      "begin_line": 299,
      "end_line": 301,
      "comment": " Set the maximal growth factor for stepsize control.\n     * @param maxGrowth maximal growth factor\n     ",
      "child_ranges": [
        "(line 300,col 9)-(line 300,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.MultistepIntegrator.getSafety()",
      "begin_line": 306,
      "end_line": 308,
      "comment": " Get the safety factor for stepsize control.\n     * @return safety factor\n     ",
      "child_ranges": [
        "(line 307,col 7)-(line 307,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.MultistepIntegrator.setSafety(double)",
      "begin_line": 313,
      "end_line": 315,
      "comment": " Set the safety factor for stepsize control.\n     * @param safety safety factor\n     ",
      "child_ranges": [
        "(line 314,col 7)-(line 314,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.MultistepIntegrator.computeStepGrowShrinkFactor(double)",
      "begin_line": 321,
      "end_line": 323,
      "comment": " Compute step grow/shrink factor according to normalized error.\n     * @param error normalized error of the current step\n     * @return grow/shrink factor for next step\n     ",
      "child_ranges": [
        "(line 322,col 9)-(line 322,col 102)"
      ]
    },
    {
      "type": "class_interface",
      "name": "NordsieckTransformer",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 326,
      "end_line": 338,
      "comment": " Transformer used to convert the first step to Nordsieck representation. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.MultistepIntegrator.NordsieckTransformer.initializeHighOrderDerivatives(double, double[], double[][], double[][])",
      "begin_line": 335,
      "end_line": 337,
      "comment": " Initialize the high order scaled derivatives at step start.\n         * @param h step size to use for scaling\n         * @param t first steps times\n         * @param y first steps states\n         * @param yDot first steps derivatives\n         * @return Nordieck vector at first step (h\u003csup\u003e2\u003c/sup\u003e/2 y\u0027\u0027\u003csub\u003en\u003c/sub\u003e,\n         * h\u003csup\u003e3\u003c/sup\u003e/6 y\u0027\u0027\u0027\u003csub\u003en\u003c/sub\u003e ... h\u003csup\u003ek\u003c/sup\u003e/k! y\u003csup\u003e(k)\u003c/sup\u003e\u003csub\u003en\u003c/sub\u003e)\n         ",
      "child_ranges": []
    },
    {
      "type": "class_interface",
      "name": "NordsieckInitializer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.ode.sampling.StepHandler"
      ],
      "begin_line": 341,
      "end_line": 432,
      "comment": " Specialized step handler storing the first step. "
    },
    {
      "type": "field",
      "varNames": [
        "count"
      ],
      "begin_line": 344,
      "end_line": 344,
      "comment": " Steps counter. "
    },
    {
      "type": "field",
      "varNames": [
        "t"
      ],
      "begin_line": 347,
      "end_line": 347,
      "comment": " First steps times. "
    },
    {
      "type": "field",
      "varNames": [
        "y"
      ],
      "begin_line": 350,
      "end_line": 350,
      "comment": " First steps states. "
    },
    {
      "type": "field",
      "varNames": [
        "yDot"
      ],
      "begin_line": 353,
      "end_line": 353,
      "comment": " First steps derivatives. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.ode.MultistepIntegrator.NordsieckInitializer.NordsieckInitializer(int, int)",
      "begin_line": 359,
      "end_line": 364,
      "comment": " Simple constructor.\n         * @param nSteps number of steps of the multistep method (excluding the one being computed)\n         * @param n problem dimension\n         ",
      "child_ranges": [
        "(line 360,col 13)-(line 360,col 27)",
        "(line 361,col 13)-(line 361,col 44)",
        "(line 362,col 13)-(line 362,col 47)",
        "(line 363,col 13)-(line 363,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.MultistepIntegrator.NordsieckInitializer.handleStep(org.apache.commons.math3.ode.sampling.StepInterpolator, boolean)",
      "begin_line": 367,
      "end_line": 425,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 370,col 13)-(line 370,col 63)",
        "(line 371,col 13)-(line 371,col 62)",
        "(line 373,col 13)-(line 387,col 13)",
        "(line 390,col 13)-(line 390,col 20)",
        "(line 391,col 13)-(line 391,col 51)",
        "(line 392,col 13)-(line 392,col 28)",
        "(line 394,col 13)-(line 394,col 69)",
        "(line 395,col 13)-(line 395,col 74)",
        "(line 396,col 13)-(line 396,col 86)",
        "(line 397,col 13)-(line 397,col 95)",
        "(line 398,col 13)-(line 398,col 26)",
        "(line 399,col 13)-(line 403,col 13)",
        "(line 405,col 13)-(line 423,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.MultistepIntegrator.NordsieckInitializer.init(double, double[], double)",
      "begin_line": 428,
      "end_line": 430,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "class_interface",
      "name": "InitializationCompletedMarkerException",
      "is_interface": false,
      "parent_types": [
        "java.lang.RuntimeException"
      ],
      "begin_line": 435,
      "end_line": 446,
      "comment": " Marker exception used ONLY to stop the starter integrator after first step. "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 439,
      "end_line": 439,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.ode.MultistepIntegrator.InitializationCompletedMarkerException.InitializationCompletedMarkerException()",
      "begin_line": 442,
      "end_line": 444,
      "comment": " Simple constructor. ",
      "child_ranges": [
        "(line 443,col 13)-(line 443,col 36)"
      ]
    }
  ]
}