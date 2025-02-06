{
  "filepath": "/tmp/Math-79b/src/main/java/org/apache/commons/math/ode/nonstiff/AdamsNordsieckTransformer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AdamsNordsieckTransformer",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 133,
      "end_line": 312,
      "comment": " Transformer to Nordsieck vectors for Adams integrators.\n * \u003cp\u003eThis class i used by {@link AdamsBashforthIntegrator Adams-Bashforth} and\n * {@link AdamsMoultonIntegrator Adams-Moulton} integrators to convert between\n * classical representation with several previous first derivatives and Nordsieck\n * representation with higher order scaled derivatives.\u003c/p\u003e\n *\n * \u003cp\u003eWe define scaled derivatives s\u003csub\u003ei\u003c/sub\u003e(n) at step n as:\n * \u003cpre\u003e\n * s\u003csub\u003e1\u003c/sub\u003e(n) \u003d h y\u0027\u003csub\u003en\u003c/sub\u003e for first derivative\n * s\u003csub\u003e2\u003c/sub\u003e(n) \u003d h\u003csup\u003e2\u003c/sup\u003e/2 y\u0027\u0027\u003csub\u003en\u003c/sub\u003e for second derivative\n * s\u003csub\u003e3\u003c/sub\u003e(n) \u003d h\u003csup\u003e3\u003c/sup\u003e/6 y\u0027\u0027\u0027\u003csub\u003en\u003c/sub\u003e for third derivative\n * ...\n * s\u003csub\u003ek\u003c/sub\u003e(n) \u003d h\u003csup\u003ek\u003c/sup\u003e/k! y(k)\u003csub\u003en\u003c/sub\u003e for k\u003csup\u003eth\u003c/sup\u003e derivative\n * \u003c/pre\u003e\u003c/p\u003e\n *\n * \u003cp\u003eWith the previous definition, the classical representation of multistep methods\n * uses first derivatives only, i.e. it handles y\u003csub\u003en\u003c/sub\u003e, s\u003csub\u003e1\u003c/sub\u003e(n) and\n * q\u003csub\u003en\u003c/sub\u003e where q\u003csub\u003en\u003c/sub\u003e is defined as:\n * \u003cpre\u003e\n *   q\u003csub\u003en\u003c/sub\u003e \u003d [ s\u003csub\u003e1\u003c/sub\u003e(n-1) s\u003csub\u003e1\u003c/sub\u003e(n-2) ... s\u003csub\u003e1\u003c/sub\u003e(n-(k-1)) ]\u003csup\u003eT\u003c/sup\u003e\n * \u003c/pre\u003e\n * (we omit the k index in the notation for clarity).\u003c/p\u003e\n *\n * \u003cp\u003eAnother possible representation uses the Nordsieck vector with\n * higher degrees scaled derivatives all taken at the same step, i.e it handles y\u003csub\u003en\u003c/sub\u003e,\n * s\u003csub\u003e1\u003c/sub\u003e(n) and r\u003csub\u003en\u003c/sub\u003e) where r\u003csub\u003en\u003c/sub\u003e is defined as:\n * \u003cpre\u003e\n * r\u003csub\u003en\u003c/sub\u003e \u003d [ s\u003csub\u003e2\u003c/sub\u003e(n), s\u003csub\u003e3\u003c/sub\u003e(n) ... s\u003csub\u003ek\u003c/sub\u003e(n) ]\u003csup\u003eT\u003c/sup\u003e\n * \u003c/pre\u003e\n * (here again we omit the k index in the notation for clarity)\n * \u003c/p\u003e\n *\n * \u003cp\u003eTaylor series formulas show that for any index offset i, s\u003csub\u003e1\u003c/sub\u003e(n-i) can be\n * computed from s\u003csub\u003e1\u003c/sub\u003e(n), s\u003csub\u003e2\u003c/sub\u003e(n) ... s\u003csub\u003ek\u003c/sub\u003e(n), the formula being exact\n * for degree k polynomials.\n * \u003cpre\u003e\n * s\u003csub\u003e1\u003c/sub\u003e(n-i) \u003d s\u003csub\u003e1\u003c/sub\u003e(n) + \u0026sum;\u003csub\u003ej\u003c/sub\u003e j (-i)\u003csup\u003ej-1\u003c/sup\u003e s\u003csub\u003ej\u003c/sub\u003e(n)\n * \u003c/pre\u003e\n * The previous formula can be used with several values for i to compute the transform between\n * classical representation and Nordsieck vector at step end. The transform between r\u003csub\u003en\u003c/sub\u003e\n * and q\u003csub\u003en\u003c/sub\u003e resulting from the Taylor series formulas above is:\n * \u003cpre\u003e\n * q\u003csub\u003en\u003c/sub\u003e \u003d s\u003csub\u003e1\u003c/sub\u003e(n) u + P r\u003csub\u003en\u003c/sub\u003e\n * \u003c/pre\u003e\n * where u is the [ 1 1 ... 1 ]\u003csup\u003eT\u003c/sup\u003e vector and P is the (k-1)\u0026times;(k-1) matrix built\n * with the j (-i)\u003csup\u003ej-1\u003c/sup\u003e terms:\n * \u003cpre\u003e\n *        [  -2   3   -4    5  ... ]\n *        [  -4  12  -32   80  ... ]\n *   P \u003d  [  -6  27 -108  405  ... ]\n *        [  -8  48 -256 1280  ... ]\n *        [          ...           ]\n * \u003c/pre\u003e\u003c/p\u003e\n *\n * \u003cp\u003eChanging -i into +i in the formula above can be used to compute a similar transform between\n * classical representation and Nordsieck vector at step start. The resulting matrix is simply\n * the absolute value of matrix P.\u003c/p\u003e\n *\n * \u003cp\u003eFor {@link AdamsBashforthIntegrator Adams-Bashforth} method, the Nordsieck vector\n * at step n+1 is computed from the Nordsieck vector at step n as follows:\n * \u003cul\u003e\n *   \u003cli\u003ey\u003csub\u003en+1\u003c/sub\u003e \u003d y\u003csub\u003en\u003c/sub\u003e + s\u003csub\u003e1\u003c/sub\u003e(n) + u\u003csup\u003eT\u003c/sup\u003e r\u003csub\u003en\u003c/sub\u003e\u003c/li\u003e\n *   \u003cli\u003es\u003csub\u003e1\u003c/sub\u003e(n+1) \u003d h f(t\u003csub\u003en+1\u003c/sub\u003e, y\u003csub\u003en+1\u003c/sub\u003e)\u003c/li\u003e\n *   \u003cli\u003er\u003csub\u003en+1\u003c/sub\u003e \u003d (s\u003csub\u003e1\u003c/sub\u003e(n) - s\u003csub\u003e1\u003c/sub\u003e(n+1)) P\u003csup\u003e-1\u003c/sup\u003e u + P\u003csup\u003e-1\u003c/sup\u003e A P r\u003csub\u003en\u003c/sub\u003e\u003c/li\u003e\n * \u003c/ul\u003e\n * where A is a rows shifting matrix (the lower left part is an identity matrix):\n * \u003cpre\u003e\n *        [ 0 0   ...  0 0 | 0 ]\n *        [ ---------------+---]\n *        [ 1 0   ...  0 0 | 0 ]\n *    A \u003d [ 0 1   ...  0 0 | 0 ]\n *        [       ...      | 0 ]\n *        [ 0 0   ...  1 0 | 0 ]\n *        [ 0 0   ...  0 1 | 0 ]\n * \u003c/pre\u003e\u003c/p\u003e\n *\n * \u003cp\u003eFor {@link AdamsMoultonIntegrator Adams-Moulton} method, the predicted Nordsieck vector\n * at step n+1 is computed from the Nordsieck vector at step n as follows:\n * \u003cul\u003e\n *   \u003cli\u003eY\u003csub\u003en+1\u003c/sub\u003e \u003d y\u003csub\u003en\u003c/sub\u003e + s\u003csub\u003e1\u003c/sub\u003e(n) + u\u003csup\u003eT\u003c/sup\u003e r\u003csub\u003en\u003c/sub\u003e\u003c/li\u003e\n *   \u003cli\u003eS\u003csub\u003e1\u003c/sub\u003e(n+1) \u003d h f(t\u003csub\u003en+1\u003c/sub\u003e, Y\u003csub\u003en+1\u003c/sub\u003e)\u003c/li\u003e\n *   \u003cli\u003eR\u003csub\u003en+1\u003c/sub\u003e \u003d (s\u003csub\u003e1\u003c/sub\u003e(n) - s\u003csub\u003e1\u003c/sub\u003e(n+1)) P\u003csup\u003e-1\u003c/sup\u003e u + P\u003csup\u003e-1\u003c/sup\u003e A P r\u003csub\u003en\u003c/sub\u003e\u003c/li\u003e\n * \u003c/ul\u003e\n * From this predicted vector, the corrected vector is computed as follows:\n * \u003cul\u003e\n *   \u003cli\u003ey\u003csub\u003en+1\u003c/sub\u003e \u003d y\u003csub\u003en\u003c/sub\u003e + S\u003csub\u003e1\u003c/sub\u003e(n+1) + [ -1 +1 -1 +1 ... \u0026plusmn;1 ] r\u003csub\u003en+1\u003c/sub\u003e\u003c/li\u003e\n *   \u003cli\u003es\u003csub\u003e1\u003c/sub\u003e(n+1) \u003d h f(t\u003csub\u003en+1\u003c/sub\u003e, y\u003csub\u003en+1\u003c/sub\u003e)\u003c/li\u003e\n *   \u003cli\u003er\u003csub\u003en+1\u003c/sub\u003e \u003d R\u003csub\u003en+1\u003c/sub\u003e + (s\u003csub\u003e1\u003c/sub\u003e(n+1) - S\u003csub\u003e1\u003c/sub\u003e(n+1)) P\u003csup\u003e-1\u003c/sup\u003e u\u003c/li\u003e\n * \u003c/ul\u003e\n * where the upper case Y\u003csub\u003en+1\u003c/sub\u003e, S\u003csub\u003e1\u003c/sub\u003e(n+1) and R\u003csub\u003en+1\u003c/sub\u003e represent the\n * predicted states whereas the lower case y\u003csub\u003en+1\u003c/sub\u003e, s\u003csub\u003en+1\u003c/sub\u003e and r\u003csub\u003en+1\u003c/sub\u003e\n * represent the corrected states.\u003c/p\u003e\n *\n * \u003cp\u003eWe observe that both methods use similar update formulas. In both cases a P\u003csup\u003e-1\u003c/sup\u003eu\n * vector and a P\u003csup\u003e-1\u003c/sup\u003e A P matrix are used that do not depend on the state,\n * they only depend on k. This class handles these transformations.\u003c/p\u003e\n *\n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "CACHE"
      ],
      "begin_line": 136,
      "end_line": 137,
      "comment": " Cache for already computed coefficients. "
    },
    {
      "type": "field",
      "varNames": [
        "initialization"
      ],
      "begin_line": 140,
      "end_line": 140,
      "comment": " Initialization matrix for the higher order derivatives wrt y\u0027\u0027, y\u0027\u0027\u0027 ... "
    },
    {
      "type": "field",
      "varNames": [
        "update"
      ],
      "begin_line": 143,
      "end_line": 143,
      "comment": " Update matrix for the higher order derivatives h\u003csup\u003e2\u003c/sup\u003e/2y\u0027\u0027, h\u003csup\u003e3\u003c/sup\u003e/6 y\u0027\u0027\u0027 ... "
    },
    {
      "type": "field",
      "varNames": [
        "c1"
      ],
      "begin_line": 146,
      "end_line": 146,
      "comment": " Update coefficients of the higher order derivatives wrt y\u0027. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.nonstiff.AdamsNordsieckTransformer.AdamsNordsieckTransformer(int)",
      "begin_line": 152,
      "end_line": 195,
      "comment": " Simple constructor.\n     * @param nSteps number of steps of the multistep method\n     * (excluding the one being computed)\n     ",
      "child_ranges": [
        "(line 155,col 9)-(line 155,col 55)",
        "(line 156,col 9)-(line 157,col 72)",
        "(line 159,col 9)-(line 159,col 50)",
        "(line 160,col 9)-(line 160,col 40)",
        "(line 161,col 9)-(line 161,col 47)",
        "(line 166,col 9)-(line 166,col 50)",
        "(line 167,col 9)-(line 170,col 9)",
        "(line 171,col 9)-(line 171,col 46)",
        "(line 172,col 9)-(line 172,col 51)",
        "(line 173,col 9)-(line 174,col 83)",
        "(line 177,col 9)-(line 183,col 11)",
        "(line 184,col 9)-(line 185,col 85)",
        "(line 188,col 9)-(line 188,col 80)",
        "(line 189,col 9)-(line 189,col 80)",
        "(line 190,col 9)-(line 190,col 44)",
        "(line 191,col 9)-(line 193,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.AdamsNordsieckTransformer.Anonymous-809e55c7-ed17-4278-9255-61df03df04e4.visit(int, int, org.apache.commons.math.fraction.BigFraction)",
      "begin_line": 179,
      "end_line": 182,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 181,col 17)-(line 181,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.AdamsNordsieckTransformer.getInstance(int)",
      "begin_line": 202,
      "end_line": 211,
      "comment": " Get the Nordsieck transformer for a given number of steps.\n     * @param nSteps number of steps of the multistep method\n     * (excluding the one being computed)\n     * @return Nordsieck transformer for the specified number of steps\n     ",
      "child_ranges": [
        "(line 203,col 9)-(line 210,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.AdamsNordsieckTransformer.getNSteps()",
      "begin_line": 218,
      "end_line": 220,
      "comment": " Get the number of steps of the method\n     * (excluding the one being computed).\n     * @return number of steps of the method\n     * (excluding the one being computed)\n     ",
      "child_ranges": [
        "(line 219,col 9)-(line 219,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.AdamsNordsieckTransformer.buildP(int)",
      "begin_line": 235,
      "end_line": 252,
      "comment": " Build the P matrix.\n     * \u003cp\u003eThe P matrix general terms are shifted j (-i)\u003csup\u003ej-1\u003c/sup\u003e terms:\n     * \u003cpre\u003e\n     *        [  -2   3   -4    5  ... ]\n     *        [  -4  12  -32   80  ... ]\n     *   P \u003d  [  -6  27 -108  405  ... ]\n     *        [  -8  48 -256 1280  ... ]\n     *        [          ...           ]\n     * \u003c/pre\u003e\u003c/p\u003e\n     * @param nSteps number of steps of the multistep method\n     * (excluding the one being computed)\n     * @return P matrix\n     ",
      "child_ranges": [
        "(line 237,col 9)-(line 237,col 70)",
        "(line 239,col 9)-(line 248,col 9)",
        "(line 250,col 9)-(line 250,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.AdamsNordsieckTransformer.initializeHighOrderDerivatives(double[], double[][])",
      "begin_line": 260,
      "end_line": 269,
      "comment": " Initialize the high order scaled derivatives at step start.\n     * @param first first scaled derivative at step start\n     * @param multistep scaled derivatives after step start (hy\u00271, ..., hy\u0027k-1)\n     * will be modified\n     * @return high order derivatives at step start\n     ",
      "child_ranges": [
        "(line 262,col 9)-(line 267,col 9)",
        "(line 268,col 9)-(line 268,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.AdamsNordsieckTransformer.updateHighOrderDerivativesPhase1(org.apache.commons.math.linear.Array2DRowRealMatrix)",
      "begin_line": 282,
      "end_line": 284,
      "comment": " Update the high order scaled derivatives for Adams integrators (phase 1).\n     * \u003cp\u003eThe complete update of high order derivatives has a form similar to:\n     * \u003cpre\u003e\n     * r\u003csub\u003en+1\u003c/sub\u003e \u003d (s\u003csub\u003e1\u003c/sub\u003e(n) - s\u003csub\u003e1\u003c/sub\u003e(n+1)) P\u003csup\u003e-1\u003c/sup\u003e u + P\u003csup\u003e-1\u003c/sup\u003e A P r\u003csub\u003en\u003c/sub\u003e\n     * \u003c/pre\u003e\n     * this method computes the P\u003csup\u003e-1\u003c/sup\u003e A P r\u003csub\u003en\u003c/sub\u003e part.\u003c/p\u003e\n     * @param highOrder high order scaled derivatives\n     * (h\u003csup\u003e2\u003c/sup\u003e/2 y\u0027\u0027, ... h\u003csup\u003ek\u003c/sup\u003e/k! y(k))\n     * @return updated high order derivatives\n     * @see #updateHighOrderDerivativesPhase2(double[], double[], Array2DRowRealMatrix)\n     ",
      "child_ranges": [
        "(line 283,col 9)-(line 283,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.AdamsNordsieckTransformer.updateHighOrderDerivativesPhase2(double[], double[], org.apache.commons.math.linear.Array2DRowRealMatrix)",
      "begin_line": 299,
      "end_line": 310,
      "comment": " Update the high order scaled derivatives Adams integrators (phase 2).\n     * \u003cp\u003eThe complete update of high order derivatives has a form similar to:\n     * \u003cpre\u003e\n     * r\u003csub\u003en+1\u003c/sub\u003e \u003d (s\u003csub\u003e1\u003c/sub\u003e(n) - s\u003csub\u003e1\u003c/sub\u003e(n+1)) P\u003csup\u003e-1\u003c/sup\u003e u + P\u003csup\u003e-1\u003c/sup\u003e A P r\u003csub\u003en\u003c/sub\u003e\n     * \u003c/pre\u003e\n     * this method computes the (s\u003csub\u003e1\u003c/sub\u003e(n) - s\u003csub\u003e1\u003c/sub\u003e(n+1)) P\u003csup\u003e-1\u003c/sup\u003e u part.\u003c/p\u003e\n     * \u003cp\u003ePhase 1 of the update must already have been performed.\u003c/p\u003e\n     * @param start first order scaled derivatives at step start\n     * @param end first order scaled derivatives at step end\n     * @param highOrder high order scaled derivatives, will be modified\n     * (h\u003csup\u003e2\u003c/sup\u003e/2 y\u0027\u0027, ... h\u003csup\u003ek\u003c/sup\u003e/k! y(k))\n     * @see #updateHighOrderDerivativesPhase1(Array2DRowRealMatrix)\n     ",
      "child_ranges": [
        "(line 302,col 9)-(line 302,col 55)",
        "(line 303,col 9)-(line 309,col 9)"
      ]
    }
  ]
}