{
  "filepath": "/tmp/Codec-5b/src/test/org/apache/commons/codec/binary/Base64Codec13Test.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Base64Codec13Test",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 42,
      "end_line": 550,
      "comment": "\n * Tests to make sure future versions of commons-codec.jar have identical Base64\n * behavior as commons-codec-1.3.jar.\n *\n * @author Julius Davies\n * @since Mar 25, 2010\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.binary.Base64Codec13Test.Base64Codec13Test(java.lang.String)",
      "begin_line": 44,
      "end_line": 46,
      "comment": "",
      "child_ranges": [
        "(line 45,col 9)-(line 45,col 20)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "STRINGS"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CHUNKED_STRINGS"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "BYTES"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Codec13Test.initSTRINGS()",
      "begin_line": 59,
      "end_line": 158,
      "comment": " These strings were generated from random byte[] arrays fed into commons-codec-1.3.jar ",
      "child_ranges": [
        "(line 60,col 9)-(line 60,col 29)",
        "(line 61,col 9)-(line 61,col 18)",
        "(line 62,col 9)-(line 62,col 22)",
        "(line 63,col 9)-(line 63,col 22)",
        "(line 64,col 9)-(line 64,col 22)",
        "(line 65,col 9)-(line 65,col 26)",
        "(line 66,col 9)-(line 66,col 26)",
        "(line 67,col 9)-(line 67,col 26)",
        "(line 68,col 9)-(line 68,col 30)",
        "(line 69,col 9)-(line 69,col 30)",
        "(line 70,col 9)-(line 70,col 30)",
        "(line 71,col 9)-(line 71,col 35)",
        "(line 72,col 9)-(line 72,col 35)",
        "(line 73,col 9)-(line 73,col 35)",
        "(line 74,col 9)-(line 74,col 39)",
        "(line 75,col 9)-(line 75,col 39)",
        "(line 76,col 9)-(line 76,col 39)",
        "(line 77,col 9)-(line 77,col 43)",
        "(line 78,col 9)-(line 78,col 103)",
        "(line 79,col 9)-(line 79,col 107)",
        "(line 80,col 9)-(line 80,col 107)",
        "(line 81,col 9)-(line 81,col 107)",
        "(line 82,col 9)-(line 82,col 111)",
        "(line 83,col 9)-(line 83,col 111)",
        "(line 84,col 9)-(line 84,col 111)",
        "(line 85,col 9)-(line 85,col 115)",
        "(line 86,col 9)-(line 86,col 115)",
        "(line 87,col 9)-(line 87,col 115)",
        "(line 88,col 9)-(line 88,col 119)",
        "(line 89,col 9)-(line 89,col 119)",
        "(line 90,col 9)-(line 90,col 119)",
        "(line 91,col 9)-(line 91,col 123)",
        "(line 92,col 9)-(line 92,col 123)",
        "(line 93,col 9)-(line 93,col 123)",
        "(line 94,col 9)-(line 94,col 127)",
        "(line 95,col 9)-(line 95,col 127)",
        "(line 96,col 9)-(line 96,col 127)",
        "(line 97,col 9)-(line 97,col 131)",
        "(line 98,col 9)-(line 98,col 184)",
        "(line 99,col 9)-(line 99,col 184)",
        "(line 100,col 9)-(line 100,col 184)",
        "(line 101,col 9)-(line 101,col 188)",
        "(line 102,col 9)-(line 102,col 188)",
        "(line 103,col 9)-(line 103,col 188)",
        "(line 104,col 9)-(line 104,col 192)",
        "(line 105,col 9)-(line 105,col 192)",
        "(line 106,col 9)-(line 106,col 192)",
        "(line 107,col 9)-(line 107,col 196)",
        "(line 108,col 9)-(line 108,col 196)",
        "(line 109,col 9)-(line 109,col 196)",
        "(line 110,col 9)-(line 110,col 200)",
        "(line 111,col 9)-(line 111,col 200)",
        "(line 112,col 9)-(line 112,col 200)",
        "(line 113,col 9)-(line 113,col 204)",
        "(line 114,col 9)-(line 114,col 204)",
        "(line 115,col 9)-(line 115,col 204)",
        "(line 116,col 9)-(line 116,col 208)",
        "(line 117,col 9)-(line 117,col 208)",
        "(line 118,col 9)-(line 118,col 208)",
        "(line 119,col 9)-(line 119,col 212)",
        "(line 120,col 9)-(line 120,col 212)",
        "(line 121,col 9)-(line 121,col 212)",
        "(line 122,col 9)-(line 122,col 216)",
        "(line 123,col 9)-(line 123,col 216)",
        "(line 124,col 9)-(line 124,col 216)",
        "(line 125,col 9)-(line 125,col 220)",
        "(line 126,col 9)-(line 126,col 220)",
        "(line 127,col 9)-(line 127,col 220)",
        "(line 128,col 9)-(line 128,col 224)",
        "(line 129,col 9)-(line 129,col 224)",
        "(line 130,col 9)-(line 130,col 224)",
        "(line 131,col 9)-(line 131,col 228)",
        "(line 132,col 9)-(line 132,col 228)",
        "(line 133,col 9)-(line 133,col 228)",
        "(line 134,col 9)-(line 134,col 232)",
        "(line 135,col 9)-(line 135,col 232)",
        "(line 136,col 9)-(line 136,col 232)",
        "(line 137,col 9)-(line 137,col 236)",
        "(line 138,col 9)-(line 138,col 236)",
        "(line 139,col 9)-(line 139,col 236)",
        "(line 140,col 9)-(line 140,col 240)",
        "(line 141,col 9)-(line 141,col 240)",
        "(line 142,col 9)-(line 142,col 240)",
        "(line 143,col 9)-(line 143,col 244)",
        "(line 144,col 9)-(line 144,col 244)",
        "(line 145,col 9)-(line 145,col 244)",
        "(line 146,col 9)-(line 146,col 248)",
        "(line 147,col 9)-(line 147,col 248)",
        "(line 148,col 9)-(line 148,col 248)",
        "(line 149,col 9)-(line 149,col 252)",
        "(line 150,col 9)-(line 150,col 252)",
        "(line 151,col 9)-(line 151,col 252)",
        "(line 152,col 9)-(line 152,col 256)",
        "(line 153,col 9)-(line 153,col 256)",
        "(line 154,col 9)-(line 154,col 256)",
        "(line 155,col 9)-(line 155,col 260)",
        "(line 156,col 9)-(line 156,col 260)",
        "(line 157,col 9)-(line 157,col 260)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Codec13Test.initCHUNKED_STRINGS()",
      "begin_line": 161,
      "end_line": 261,
      "comment": " These are chunked versions of the strings above (chunked by commons-codec-1.3.jar) ",
      "child_ranges": [
        "(line 162,col 9)-(line 162,col 37)",
        "(line 163,col 9)-(line 163,col 18)",
        "(line 164,col 9)-(line 164,col 26)",
        "(line 165,col 9)-(line 165,col 26)",
        "(line 166,col 9)-(line 166,col 26)",
        "(line 167,col 9)-(line 167,col 30)",
        "(line 168,col 9)-(line 168,col 30)",
        "(line 169,col 9)-(line 169,col 30)",
        "(line 170,col 9)-(line 170,col 34)",
        "(line 171,col 9)-(line 171,col 34)",
        "(line 172,col 9)-(line 172,col 34)",
        "(line 173,col 9)-(line 173,col 39)",
        "(line 174,col 9)-(line 174,col 39)",
        "(line 175,col 9)-(line 175,col 39)",
        "(line 176,col 9)-(line 176,col 43)",
        "(line 177,col 9)-(line 177,col 43)",
        "(line 178,col 9)-(line 178,col 43)",
        "(line 179,col 9)-(line 179,col 47)",
        "(line 180,col 9)-(line 180,col 111)",
        "(line 181,col 9)-(line 181,col 115)",
        "(line 182,col 9)-(line 182,col 115)",
        "(line 183,col 9)-(line 183,col 115)",
        "(line 184,col 9)-(line 184,col 119)",
        "(line 185,col 9)-(line 185,col 119)",
        "(line 186,col 9)-(line 186,col 119)",
        "(line 187,col 9)-(line 187,col 123)",
        "(line 188,col 9)-(line 188,col 123)",
        "(line 189,col 9)-(line 189,col 123)",
        "(line 190,col 9)-(line 190,col 127)",
        "(line 191,col 9)-(line 191,col 127)",
        "(line 192,col 9)-(line 192,col 127)",
        "(line 193,col 9)-(line 193,col 131)",
        "(line 194,col 9)-(line 194,col 131)",
        "(line 195,col 9)-(line 195,col 131)",
        "(line 196,col 9)-(line 196,col 135)",
        "(line 197,col 9)-(line 197,col 135)",
        "(line 198,col 9)-(line 198,col 135)",
        "(line 199,col 9)-(line 199,col 139)",
        "(line 200,col 9)-(line 200,col 196)",
        "(line 201,col 9)-(line 201,col 196)",
        "(line 202,col 9)-(line 202,col 196)",
        "(line 203,col 9)-(line 203,col 200)",
        "(line 204,col 9)-(line 204,col 200)",
        "(line 205,col 9)-(line 205,col 200)",
        "(line 206,col 9)-(line 206,col 204)",
        "(line 207,col 9)-(line 207,col 204)",
        "(line 208,col 9)-(line 208,col 204)",
        "(line 209,col 9)-(line 209,col 208)",
        "(line 210,col 9)-(line 210,col 208)",
        "(line 211,col 9)-(line 211,col 208)",
        "(line 212,col 9)-(line 212,col 212)",
        "(line 213,col 9)-(line 213,col 212)",
        "(line 214,col 9)-(line 214,col 212)",
        "(line 215,col 9)-(line 215,col 216)",
        "(line 216,col 9)-(line 216,col 216)",
        "(line 217,col 9)-(line 217,col 216)",
        "(line 218,col 9)-(line 218,col 220)",
        "(line 219,col 9)-(line 219,col 220)",
        "(line 220,col 9)-(line 220,col 220)",
        "(line 221,col 9)-(line 221,col 224)",
        "(line 222,col 9)-(line 222,col 224)",
        "(line 223,col 9)-(line 223,col 224)",
        "(line 224,col 9)-(line 224,col 228)",
        "(line 225,col 9)-(line 225,col 228)",
        "(line 226,col 9)-(line 226,col 228)",
        "(line 227,col 9)-(line 227,col 232)",
        "(line 228,col 9)-(line 228,col 232)",
        "(line 229,col 9)-(line 229,col 232)",
        "(line 230,col 9)-(line 230,col 236)",
        "(line 231,col 9)-(line 231,col 236)",
        "(line 232,col 9)-(line 232,col 236)",
        "(line 233,col 9)-(line 233,col 240)",
        "(line 234,col 9)-(line 234,col 240)",
        "(line 235,col 9)-(line 235,col 240)",
        "(line 236,col 9)-(line 236,col 244)",
        "(line 237,col 9)-(line 237,col 244)",
        "(line 238,col 9)-(line 238,col 244)",
        "(line 239,col 9)-(line 239,col 248)",
        "(line 240,col 9)-(line 240,col 248)",
        "(line 241,col 9)-(line 241,col 248)",
        "(line 242,col 9)-(line 242,col 252)",
        "(line 243,col 9)-(line 243,col 252)",
        "(line 244,col 9)-(line 244,col 252)",
        "(line 245,col 9)-(line 245,col 256)",
        "(line 246,col 9)-(line 246,col 256)",
        "(line 247,col 9)-(line 247,col 256)",
        "(line 248,col 9)-(line 248,col 260)",
        "(line 249,col 9)-(line 249,col 260)",
        "(line 250,col 9)-(line 250,col 260)",
        "(line 251,col 9)-(line 251,col 268)",
        "(line 252,col 9)-(line 252,col 268)",
        "(line 253,col 9)-(line 253,col 268)",
        "(line 254,col 9)-(line 254,col 272)",
        "(line 255,col 9)-(line 255,col 272)",
        "(line 256,col 9)-(line 256,col 272)",
        "(line 257,col 9)-(line 257,col 276)",
        "(line 258,col 9)-(line 258,col 276)",
        "(line 259,col 9)-(line 259,col 276)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Codec13Test.initBYTES()",
      "begin_line": 264,
      "end_line": 363,
      "comment": " Here are the randomly generated byte[] arrays we generated to exercise commons-codec-1.3.jar ",
      "child_ranges": [
        "(line 265,col 9)-(line 265,col 27)",
        "(line 266,col 9)-(line 266,col 28)",
        "(line 267,col 9)-(line 267,col 31)",
        "(line 268,col 9)-(line 268,col 36)",
        "(line 269,col 9)-(line 269,col 40)",
        "(line 270,col 9)-(line 270,col 44)",
        "(line 271,col 9)-(line 271,col 51)",
        "(line 272,col 9)-(line 272,col 55)",
        "(line 273,col 9)-(line 273,col 58)",
        "(line 274,col 9)-(line 274,col 63)",
        "(line 275,col 9)-(line 275,col 68)",
        "(line 276,col 9)-(line 276,col 70)",
        "(line 277,col 9)-(line 277,col 79)",
        "(line 278,col 9)-(line 278,col 79)",
        "(line 279,col 9)-(line 279,col 93)",
        "(line 280,col 9)-(line 280,col 94)",
        "(line 281,col 9)-(line 281,col 100)",
        "(line 282,col 9)-(line 282,col 104)",
        "(line 283,col 9)-(line 283,col 326)",
        "(line 284,col 9)-(line 284,col 327)",
        "(line 285,col 9)-(line 285,col 330)",
        "(line 286,col 9)-(line 286,col 340)",
        "(line 287,col 9)-(line 287,col 339)",
        "(line 288,col 9)-(line 288,col 348)",
        "(line 289,col 9)-(line 289,col 333)",
        "(line 290,col 9)-(line 290,col 367)",
        "(line 291,col 9)-(line 291,col 357)",
        "(line 292,col 9)-(line 292,col 369)",
        "(line 293,col 9)-(line 293,col 378)",
        "(line 294,col 9)-(line 294,col 366)",
        "(line 295,col 9)-(line 295,col 365)",
        "(line 296,col 9)-(line 296,col 393)",
        "(line 297,col 9)-(line 297,col 379)",
        "(line 298,col 9)-(line 298,col 387)",
        "(line 299,col 9)-(line 299,col 383)",
        "(line 300,col 9)-(line 300,col 408)",
        "(line 301,col 9)-(line 301,col 415)",
        "(line 302,col 9)-(line 302,col 408)",
        "(line 303,col 9)-(line 303,col 592)",
        "(line 304,col 9)-(line 304,col 588)",
        "(line 305,col 9)-(line 305,col 604)",
        "(line 306,col 9)-(line 306,col 602)",
        "(line 307,col 9)-(line 307,col 604)",
        "(line 308,col 9)-(line 308,col 613)",
        "(line 309,col 9)-(line 309,col 628)",
        "(line 310,col 9)-(line 310,col 616)",
        "(line 311,col 9)-(line 311,col 626)",
        "(line 312,col 9)-(line 312,col 630)",
        "(line 313,col 9)-(line 313,col 642)",
        "(line 314,col 9)-(line 314,col 653)",
        "(line 315,col 9)-(line 315,col 636)",
        "(line 316,col 9)-(line 316,col 655)",
        "(line 317,col 9)-(line 317,col 666)",
        "(line 318,col 9)-(line 318,col 653)",
        "(line 319,col 9)-(line 319,col 675)",
        "(line 320,col 9)-(line 320,col 673)",
        "(line 321,col 9)-(line 321,col 680)",
        "(line 322,col 9)-(line 322,col 684)",
        "(line 323,col 9)-(line 323,col 673)",
        "(line 324,col 9)-(line 324,col 691)",
        "(line 325,col 9)-(line 325,col 688)",
        "(line 326,col 9)-(line 326,col 699)",
        "(line 327,col 9)-(line 327,col 704)",
        "(line 328,col 9)-(line 328,col 706)",
        "(line 329,col 9)-(line 329,col 706)",
        "(line 330,col 9)-(line 330,col 712)",
        "(line 331,col 9)-(line 331,col 722)",
        "(line 332,col 9)-(line 332,col 726)",
        "(line 333,col 9)-(line 333,col 723)",
        "(line 334,col 9)-(line 334,col 717)",
        "(line 335,col 9)-(line 335,col 743)",
        "(line 336,col 9)-(line 336,col 750)",
        "(line 337,col 9)-(line 337,col 737)",
        "(line 338,col 9)-(line 338,col 751)",
        "(line 339,col 9)-(line 339,col 761)",
        "(line 340,col 9)-(line 340,col 770)",
        "(line 341,col 9)-(line 341,col 767)",
        "(line 342,col 9)-(line 342,col 753)",
        "(line 343,col 9)-(line 343,col 777)",
        "(line 344,col 9)-(line 344,col 771)",
        "(line 345,col 9)-(line 345,col 782)",
        "(line 346,col 9)-(line 346,col 795)",
        "(line 347,col 9)-(line 347,col 794)",
        "(line 348,col 9)-(line 348,col 798)",
        "(line 349,col 9)-(line 349,col 787)",
        "(line 350,col 9)-(line 350,col 819)",
        "(line 351,col 9)-(line 351,col 821)",
        "(line 352,col 9)-(line 352,col 831)",
        "(line 353,col 9)-(line 353,col 811)",
        "(line 354,col 9)-(line 354,col 808)",
        "(line 355,col 9)-(line 355,col 837)",
        "(line 356,col 9)-(line 356,col 855)",
        "(line 357,col 9)-(line 357,col 834)",
        "(line 358,col 9)-(line 358,col 840)",
        "(line 359,col 9)-(line 359,col 859)",
        "(line 360,col 9)-(line 360,col 845)",
        "(line 361,col 9)-(line 361,col 864)",
        "(line 362,col 9)-(line 362,col 859)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Codec13Test.testEncoder()",
      "begin_line": 371,
      "end_line": 381,
      "comment": "\n     * Tests to make sure Base64\u0027s implementation of the org.apache.commons.codec.Encoder\n     * interface is behaving identical to commons-codec-1.3.jar.\n     * \n     * @throws EncoderException problem\n     ",
      "child_ranges": [
        "(line 372,col 9)-(line 372,col 35)",
        "(line 373,col 9)-(line 380,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Codec13Test.testDecoder()",
      "begin_line": 389,
      "end_line": 399,
      "comment": "\n     * Tests to make sure Base64\u0027s implementation of the org.apache.commons.codec.Decoder\n     * interface is behaving identical to commons-codec-1.3.jar.\n     *\n     * @throws DecoderException problem\n     ",
      "child_ranges": [
        "(line 390,col 9)-(line 390,col 35)",
        "(line 391,col 9)-(line 398,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Codec13Test.testBinaryEncoder()",
      "begin_line": 407,
      "end_line": 417,
      "comment": "\n     * Tests to make sure Base64\u0027s implementation of the org.apache.commons.codec.BinaryEncoder\n     * interface is behaving identical to commons-codec-1.3.jar.\n     *\n     * @throws EncoderException problem\n     ",
      "child_ranges": [
        "(line 408,col 9)-(line 408,col 41)",
        "(line 409,col 9)-(line 416,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Codec13Test.testBinaryDecoder()",
      "begin_line": 425,
      "end_line": 435,
      "comment": "\n     * Tests to make sure Base64\u0027s implementation of the org.apache.commons.codec.BinaryDecoder\n     * interface is behaving identical to commons-codec-1.3.jar.\n     *\n     * @throws DecoderException problem\n     ",
      "child_ranges": [
        "(line 426,col 9)-(line 426,col 41)",
        "(line 427,col 9)-(line 434,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Codec13Test.testStaticEncode()",
      "begin_line": 443,
      "end_line": 452,
      "comment": "\n     * Tests to make sure Base64\u0027s implementation of Base64.encodeBase64()\n     * static method is behaving identical to commons-codec-1.3.jar.\n     *\n     * @throws EncoderException problem\n     ",
      "child_ranges": [
        "(line 444,col 9)-(line 451,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Codec13Test.testStaticDecode()",
      "begin_line": 460,
      "end_line": 469,
      "comment": "\n     * Tests to make sure Base64\u0027s implementation of Base64.decodeBase64()\n     * static method is behaving identical to commons-codec-1.3.jar.\n     *\n     * @throws DecoderException problem\n     ",
      "child_ranges": [
        "(line 461,col 9)-(line 468,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Codec13Test.testStaticEncodeChunked()",
      "begin_line": 477,
      "end_line": 486,
      "comment": "\n     * Tests to make sure Base64\u0027s implementation of Base64.encodeBase64Chunked()\n     * static method is behaving identical to commons-codec-1.3.jar.\n     *\n     * @throws EncoderException problem\n     ",
      "child_ranges": [
        "(line 478,col 9)-(line 485,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Codec13Test.testStaticDecodeChunked()",
      "begin_line": 495,
      "end_line": 504,
      "comment": "\n     * Tests to make sure Base64\u0027s implementation of Base64.decodeBase64()\n     * static method is behaving identical to commons-codec-1.3.jar when\n     * supplied with chunked input.\n     *\n     * @throws DecoderException problem\n     ",
      "child_ranges": [
        "(line 496,col 9)-(line 503,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Codec13Test.utf8(java.lang.String)",
      "begin_line": 506,
      "end_line": 517,
      "comment": "",
      "child_ranges": [
        "(line 512,col 9)-(line 516,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Codec13Test.main(java.lang.String[])",
      "begin_line": 526,
      "end_line": 549,
      "comment": "\n     * This main() method can be run with just commons-codec-1.3.jar and junit-3.8.1.jar\n     * on the classpath to make sure these tests truly capture the behaviour of\n     * commons-codec-1.3.jar.\n     *\n     * @param args command-line args\n     ",
      "child_ranges": [
        "(line 527,col 9)-(line 527,col 65)",
        "(line 529,col 9)-(line 529,col 40)",
        "(line 530,col 9)-(line 530,col 21)",
        "(line 531,col 9)-(line 531,col 36)",
        "(line 532,col 9)-(line 532,col 44)",
        "(line 533,col 9)-(line 533,col 93)",
        "(line 534,col 9)-(line 547,col 9)"
      ]
    }
  ]
}