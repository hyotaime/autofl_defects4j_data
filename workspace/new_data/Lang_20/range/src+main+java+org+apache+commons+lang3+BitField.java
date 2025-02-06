{
  "filepath": "/tmp/Lang-20b/src/main/java/org/apache/commons/lang3/BitField.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BitField",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 25,
      "end_line": 283,
      "comment": "\n * \u003cp\u003eOperations on bit-mapped fields.\u003c/p\u003e\n *\n * @since 2.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "_mask"
      ],
      "begin_line": 27,
      "end_line": 27,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "_shift_count"
      ],
      "begin_line": 28,
      "end_line": 28,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.BitField.BitField(int)",
      "begin_line": 37,
      "end_line": 49,
      "comment": "\n     * \u003cp\u003eCreates a BitField instance.\u003c/p\u003e\n     *\n     * @param mask the mask specifying which bits apply to this\n     *  BitField. Bits that are set in this mask are the bits\n     *  that this BitField operates on\n     ",
      "child_ranges": [
        "(line 38,col 9)-(line 38,col 21)",
        "(line 39,col 9)-(line 39,col 22)",
        "(line 40,col 9)-(line 40,col 31)",
        "(line 42,col 9)-(line 47,col 9)",
        "(line 48,col 9)-(line 48,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.BitField.getValue(int)",
      "begin_line": 65,
      "end_line": 67,
      "comment": "\n     * \u003cp\u003eObtains the value for the specified BitField, appropriately\n     * shifted right.\u003c/p\u003e\n     *\n     * \u003cp\u003eMany users of a BitField will want to treat the specified\n     * bits as an int value, and will not want to be aware that the\n     * value is stored as a BitField (and so shifted left so many\n     * bits).\u003c/p\u003e\n     *\n     * @see #setValue(int,int)\n     * @param holder the int data containing the bits we\u0027re interested\n     *  in\n     * @return the selected bits, shifted right appropriately\n     ",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.BitField.getShortValue(short)",
      "begin_line": 83,
      "end_line": 85,
      "comment": "\n     * \u003cp\u003eObtains the value for the specified BitField, appropriately\n     * shifted right, as a short.\u003c/p\u003e\n     *\n     * \u003cp\u003eMany users of a BitField will want to treat the specified\n     * bits as an int value, and will not want to be aware that the\n     * value is stored as a BitField (and so shifted left so many\n     * bits).\u003c/p\u003e\n     *\n     * @see #setShortValue(short,short)\n     * @param holder the short data containing the bits we\u0027re\n     *  interested in\n     * @return the selected bits, shifted right appropriately\n     ",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.BitField.getRawValue(int)",
      "begin_line": 94,
      "end_line": 96,
      "comment": "\n     * \u003cp\u003eObtains the value for the specified BitField, unshifted.\u003c/p\u003e\n     *\n     * @param holder the int data containing the bits we\u0027re\n     *  interested in\n     * @return the selected bits\n     ",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.BitField.getShortRawValue(short)",
      "begin_line": 105,
      "end_line": 107,
      "comment": "\n     * \u003cp\u003eObtains the value for the specified BitField, unshifted.\u003c/p\u003e\n     *\n     * @param holder the short data containing the bits we\u0027re\n     *  interested in\n     * @return the selected bits\n     ",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.BitField.isSet(int)",
      "begin_line": 122,
      "end_line": 124,
      "comment": "\n     * \u003cp\u003eReturns whether the field is set or not.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis is most commonly used for a single-bit field, which is\n     * often used to represent a boolean value; the results of using\n     * it for a multi-bit field is to determine whether *any* of its\n     * bits are set.\u003c/p\u003e\n     *\n     * @param holder the int data containing the bits we\u0027re interested\n     *  in\n     * @return {@code true} if any of the bits are set,\n     *  else {@code false}\n     ",
      "child_ranges": [
        "(line 123,col 9)-(line 123,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.BitField.isAllSet(int)",
      "begin_line": 138,
      "end_line": 140,
      "comment": "\n     * \u003cp\u003eReturns whether all of the bits are set or not.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis is a stricter test than {@link #isSet(int)},\n     * in that all of the bits in a multi-bit set must be set\n     * for this method to return {@code true}.\u003c/p\u003e\n     *\n     * @param holder the int data containing the bits we\u0027re\n     *  interested in\n     * @return {@code true} if all of the bits are set,\n     *  else {@code false}\n     ",
      "child_ranges": [
        "(line 139,col 9)-(line 139,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.BitField.setValue(int, int)",
      "begin_line": 152,
      "end_line": 154,
      "comment": "\n     * \u003cp\u003eReplaces the bits with new values.\u003c/p\u003e\n     *\n     * @see #getValue(int)\n     * @param holder the int data containing the bits we\u0027re\n     *  interested in\n     * @param value the new value for the specified bits\n     * @return the value of holder with the bits from the value\n     *  parameter replacing the old bits\n     ",
      "child_ranges": [
        "(line 153,col 9)-(line 153,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.BitField.setShortValue(short, short)",
      "begin_line": 166,
      "end_line": 168,
      "comment": "\n     * \u003cp\u003eReplaces the bits with new values.\u003c/p\u003e\n     *\n     * @see #getShortValue(short)\n     * @param holder the short data containing the bits we\u0027re\n     *  interested in\n     * @param value the new value for the specified bits\n     * @return the value of holder with the bits from the value\n     *  parameter replacing the old bits\n     ",
      "child_ranges": [
        "(line 167,col 9)-(line 167,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.BitField.clear(int)",
      "begin_line": 178,
      "end_line": 180,
      "comment": "\n     * \u003cp\u003eClears the bits.\u003c/p\u003e\n     *\n     * @param holder the int data containing the bits we\u0027re\n     *  interested in\n     * @return the value of holder with the specified bits cleared\n     *  (set to {@code 0})\n     ",
      "child_ranges": [
        "(line 179,col 9)-(line 179,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.BitField.clearShort(short)",
      "begin_line": 190,
      "end_line": 192,
      "comment": "\n     * \u003cp\u003eClears the bits.\u003c/p\u003e\n     *\n     * @param holder the short data containing the bits we\u0027re\n     *  interested in\n     * @return the value of holder with the specified bits cleared\n     *  (set to {@code 0})\n     ",
      "child_ranges": [
        "(line 191,col 9)-(line 191,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.BitField.clearByte(byte)",
      "begin_line": 203,
      "end_line": 205,
      "comment": "\n     * \u003cp\u003eClears the bits.\u003c/p\u003e\n     *\n     * @param holder the byte data containing the bits we\u0027re\n     *  interested in\n     *\n     * @return the value of holder with the specified bits cleared\n     *  (set to {@code 0})\n     ",
      "child_ranges": [
        "(line 204,col 9)-(line 204,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.BitField.set(int)",
      "begin_line": 215,
      "end_line": 217,
      "comment": "\n     * \u003cp\u003eSets the bits.\u003c/p\u003e\n     *\n     * @param holder the int data containing the bits we\u0027re\n     *  interested in\n     * @return the value of holder with the specified bits set\n     *  to {@code 1}\n     ",
      "child_ranges": [
        "(line 216,col 9)-(line 216,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.BitField.setShort(short)",
      "begin_line": 227,
      "end_line": 229,
      "comment": "\n     * \u003cp\u003eSets the bits.\u003c/p\u003e\n     *\n     * @param holder the short data containing the bits we\u0027re\n     *  interested in\n     * @return the value of holder with the specified bits set\n     *  to {@code 1}\n     ",
      "child_ranges": [
        "(line 228,col 9)-(line 228,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.BitField.setByte(byte)",
      "begin_line": 240,
      "end_line": 242,
      "comment": "\n     * \u003cp\u003eSets the bits.\u003c/p\u003e\n     *\n     * @param holder the byte data containing the bits we\u0027re\n     *  interested in\n     *\n     * @return the value of holder with the specified bits set\n     *  to {@code 1}\n     ",
      "child_ranges": [
        "(line 241,col 9)-(line 241,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.BitField.setBoolean(int, boolean)",
      "begin_line": 253,
      "end_line": 255,
      "comment": "\n     * \u003cp\u003eSets a boolean BitField.\u003c/p\u003e\n     *\n     * @param holder the int data containing the bits we\u0027re\n     *  interested in\n     * @param flag indicating whether to set or clear the bits\n     * @return the value of holder with the specified bits set or\n     *         cleared\n     ",
      "child_ranges": [
        "(line 254,col 9)-(line 254,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.BitField.setShortBoolean(short, boolean)",
      "begin_line": 266,
      "end_line": 268,
      "comment": "\n     * \u003cp\u003eSets a boolean BitField.\u003c/p\u003e\n     *\n     * @param holder the short data containing the bits we\u0027re\n     *  interested in\n     * @param flag indicating whether to set or clear the bits\n     * @return the value of holder with the specified bits set or\n     *  cleared\n     ",
      "child_ranges": [
        "(line 267,col 9)-(line 267,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.BitField.setByteBoolean(byte, boolean)",
      "begin_line": 279,
      "end_line": 281,
      "comment": "\n     * \u003cp\u003eSets a boolean BitField.\u003c/p\u003e\n     *\n     * @param holder the byte data containing the bits we\u0027re\n     *  interested in\n     * @param flag indicating whether to set or clear the bits\n     * @return the value of holder with the specified bits set or\n     *  cleared\n     ",
      "child_ranges": [
        "(line 280,col 9)-(line 280,col 58)"
      ]
    }
  ]
}