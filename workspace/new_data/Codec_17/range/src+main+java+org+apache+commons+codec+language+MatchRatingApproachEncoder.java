{
  "filepath": "/tmp/Codec-17b/src/main/java/org/apache/commons/codec/language/MatchRatingApproachEncoder.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MatchRatingApproachEncoder",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.codec.StringEncoder"
      ],
      "begin_line": 32,
      "end_line": 423,
      "comment": "\n * Match Rating Approach Phonetic Algorithm Developed by \u003cCITE\u003eWestern Airlines\u003c/CITE\u003e in 1977.\n *\n * This class is immutable and thread-safe.\n *\n * @see \u003ca href\u003d\"http://en.wikipedia.org/wiki/Match_rating_approach\"\u003eWikipedia - Match Rating Approach\u003c/a\u003e\n * @since 1.8\n "
    },
    {
      "type": "field",
      "varNames": [
        "SPACE"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "EMPTY"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ONE",
        "TWO",
        "THREE",
        "FOUR",
        "FIVE",
        "SIX",
        "SEVEN",
        "ELEVEN",
        "TWELVE"
      ],
      "begin_line": 41,
      "end_line": 42,
      "comment": "\n     * Constants used mainly for the min rating value.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "PLAIN_ASCII"
      ],
      "begin_line": 47,
      "end_line": 54,
      "comment": "\n     * The plain letter equivalent of the accented letters.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "UNICODE"
      ],
      "begin_line": 59,
      "end_line": 64,
      "comment": "\n     * Unicode characters corresponding to various accented letters. For example: \\u00DA is U acute etc...\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DOUBLE_CONSONANT"
      ],
      "begin_line": 66,
      "end_line": 68,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.MatchRatingApproachEncoder.cleanName(java.lang.String)",
      "begin_line": 83,
      "end_line": 95,
      "comment": "\n     * Cleans up a name: 1. Upper-cases everything 2. Removes some common punctuation 3. Removes accents 4. Removes any\n     * spaces.\n     *\n     * \u003ch2\u003eAPI Usage\u003c/h2\u003e\n     * \u003cp\u003e\n     * Consider this method private, it is package protected for unit testing only.\n     * \u003c/p\u003e\n     *\n     * @param name\n     *            The name to be cleaned\n     * @return The cleaned name\n     ",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 60)",
        "(line 86,col 9)-(line 86,col 77)",
        "(line 87,col 9)-(line 89,col 9)",
        "(line 91,col 9)-(line 91,col 45)",
        "(line 92,col 9)-(line 92,col 56)",
        "(line 94,col 9)-(line 94,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.MatchRatingApproachEncoder.encode(java.lang.Object)",
      "begin_line": 108,
      "end_line": 115,
      "comment": "\n     * Encodes an Object using the Match Rating Approach algorithm. Method is here to satisfy the requirements of the\n     * Encoder interface Throws an EncoderException if input object is not of type java.lang.String.\n     *\n     * @param pObject\n     *            Object to encode\n     * @return An object (or type java.lang.String) containing the Match Rating Approach code which corresponds to the\n     *         String supplied.\n     * @throws EncoderException\n     *             if the parameter supplied is not of type java.lang.String\n     ",
      "child_ranges": [
        "(line 110,col 9)-(line 113,col 9)",
        "(line 114,col 9)-(line 114,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.MatchRatingApproachEncoder.encode(java.lang.String)",
      "begin_line": 124,
      "end_line": 145,
      "comment": "\n     * Encodes a String using the Match Rating Approach (MRA) algorithm.\n     *\n     * @param name\n     *            String object to encode\n     * @return The MRA code corresponding to the String supplied\n     ",
      "child_ranges": [
        "(line 127,col 9)-(line 129,col 9)",
        "(line 132,col 9)-(line 132,col 31)",
        "(line 136,col 9)-(line 136,col 34)",
        "(line 139,col 9)-(line 139,col 44)",
        "(line 142,col 9)-(line 142,col 36)",
        "(line 144,col 9)-(line 144,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.MatchRatingApproachEncoder.getFirst3Last3(java.lang.String)",
      "begin_line": 159,
      "end_line": 168,
      "comment": "\n     * Gets the first and last 3 letters of a name (if \u0026gt; 6 characters) Else just returns the name.\n     *\n     * \u003ch2\u003eAPI Usage\u003c/h2\u003e\n     * \u003cp\u003e\n     * Consider this method private, it is package protected for unit testing only.\n     * \u003c/p\u003e\n     *\n     * @param name\n     *            The string to get the substrings from\n     * @return Annexed first and last 3 letters of input word.\n     ",
      "child_ranges": [
        "(line 160,col 9)-(line 160,col 45)",
        "(line 162,col 9)-(line 166,col 9)",
        "(line 167,col 9)-(line 167,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.MatchRatingApproachEncoder.getMinRating(int)",
      "begin_line": 183,
      "end_line": 199,
      "comment": "\n     * Obtains the min rating of the length sum of the 2 names. In essence the larger the sum length the smaller the\n     * min rating. Values strictly from documentation.\n     *\n     * \u003ch2\u003eAPI Usage\u003c/h2\u003e\n     * \u003cp\u003e\n     * Consider this method private, it is package protected for unit testing only.\n     * \u003c/p\u003e\n     *\n     * @param sumLength\n     *            The length of 2 strings sent down\n     * @return The min rating value\n     ",
      "child_ranges": [
        "(line 184,col 9)-(line 184,col 26)",
        "(line 186,col 9)-(line 196,col 9)",
        "(line 198,col 9)-(line 198,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.MatchRatingApproachEncoder.isEncodeEquals(java.lang.String, java.lang.String)",
      "begin_line": 211,
      "end_line": 261,
      "comment": "\n     * Determines if two names are homophonous via Match Rating Approach (MRA) algorithm. It should be noted that the\n     * strings are cleaned in the same way as {@link #encode(String)}.\n     *\n     * @param name1\n     *            First of the 2 strings (names) to compare\n     * @param name2\n     *            Second of the 2 names to compare\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the encodings are identical \u003ccode\u003efalse\u003c/code\u003e otherwise.\n     ",
      "child_ranges": [
        "(line 213,col 9)-(line 221,col 9)",
        "(line 224,col 9)-(line 224,col 33)",
        "(line 225,col 9)-(line 225,col 33)",
        "(line 230,col 9)-(line 230,col 36)",
        "(line 231,col 9)-(line 231,col 36)",
        "(line 234,col 9)-(line 234,col 46)",
        "(line 235,col 9)-(line 235,col 46)",
        "(line 238,col 9)-(line 238,col 38)",
        "(line 239,col 9)-(line 239,col 38)",
        "(line 243,col 9)-(line 245,col 9)",
        "(line 249,col 9)-(line 249,col 72)",
        "(line 250,col 9)-(line 250,col 26)",
        "(line 251,col 9)-(line 251,col 44)",
        "(line 255,col 9)-(line 255,col 77)",
        "(line 259,col 9)-(line 259,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.MatchRatingApproachEncoder.isVowel(java.lang.String)",
      "begin_line": 275,
      "end_line": 278,
      "comment": "\n     * Determines if a letter is a vowel.\n     *\n     * \u003ch2\u003eAPI Usage\u003c/h2\u003e\n     * \u003cp\u003e\n     * Consider this method private, it is package protected for unit testing only.\n     * \u003c/p\u003e\n     *\n     * @param letter\n     *            The letter under investiagtion\n     * @return True if a vowel, else false\n     ",
      "child_ranges": [
        "(line 276,col 9)-(line 277,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.MatchRatingApproachEncoder.leftToRightThenRightToLeftProcessing(java.lang.String, java.lang.String)",
      "begin_line": 293,
      "end_line": 339,
      "comment": "\n     * Processes the names from left to right (first) then right to left removing identical letters in same positions.\n     * Then subtracts the longer string that remains from 6 and returns this.\n     *\n     * \u003ch2\u003eAPI Usage\u003c/h2\u003e\n     * \u003cp\u003e\n     * Consider this method private, it is package protected for unit testing only.\n     * \u003c/p\u003e\n     *\n     * @param name1\n     *            name2\n     * @return the length as above\n     ",
      "child_ranges": [
        "(line 294,col 9)-(line 294,col 53)",
        "(line 295,col 9)-(line 295,col 53)",
        "(line 297,col 9)-(line 297,col 49)",
        "(line 298,col 9)-(line 298,col 49)",
        "(line 300,col 9)-(line 300,col 37)",
        "(line 301,col 9)-(line 301,col 35)",
        "(line 303,col 9)-(line 303,col 37)",
        "(line 304,col 9)-(line 304,col 35)",
        "(line 306,col 9)-(line 328,col 9)",
        "(line 331,col 9)-(line 331,col 76)",
        "(line 332,col 9)-(line 332,col 76)",
        "(line 335,col 9)-(line 337,col 9)",
        "(line 338,col 9)-(line 338,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.MatchRatingApproachEncoder.removeAccents(java.lang.String)",
      "begin_line": 349,
      "end_line": 368,
      "comment": "\n     * Removes accented letters and replaces with non-accented ascii equivalent Case is preserved.\n     * http://www.codecodex.com/wiki/Remove_accent_from_letters_%28ex_.%C3%A9_to_e%29\n     *\n     * @param accentedWord\n     *            The word that may have accents in it.\n     * @return De-accented word\n     ",
      "child_ranges": [
        "(line 350,col 9)-(line 352,col 9)",
        "(line 354,col 9)-(line 354,col 53)",
        "(line 355,col 9)-(line 355,col 44)",
        "(line 357,col 9)-(line 365,col 9)",
        "(line 367,col 9)-(line 367,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.MatchRatingApproachEncoder.removeDoubleConsonants(java.lang.String)",
      "begin_line": 382,
      "end_line": 391,
      "comment": "\n     * Replaces any double consonant pair with the single letter equivalent.\n     *\n     * \u003ch2\u003eAPI Usage\u003c/h2\u003e\n     * \u003cp\u003e\n     * Consider this method private, it is package protected for unit testing only.\n     * \u003c/p\u003e\n     *\n     * @param name\n     *            String to have double consonants removed\n     * @return Single consonant word\n     ",
      "child_ranges": [
        "(line 383,col 9)-(line 383,col 63)",
        "(line 384,col 9)-(line 389,col 9)",
        "(line 390,col 9)-(line 390,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.MatchRatingApproachEncoder.removeVowels(java.lang.String)",
      "begin_line": 405,
      "end_line": 422,
      "comment": "\n     * Deletes all vowels unless the vowel begins the word.\n     *\n     * \u003ch2\u003eAPI Usage\u003c/h2\u003e\n     * \u003cp\u003e\n     * Consider this method private, it is package protected for unit testing only.\n     * \u003c/p\u003e\n     *\n     * @param name\n     *            The name to have vowels removed\n     * @return De-voweled word\n     ",
      "child_ranges": [
        "(line 407,col 9)-(line 407,col 56)",
        "(line 409,col 9)-(line 409,col 43)",
        "(line 410,col 9)-(line 410,col 43)",
        "(line 411,col 9)-(line 411,col 43)",
        "(line 412,col 9)-(line 412,col 43)",
        "(line 413,col 9)-(line 413,col 43)",
        "(line 415,col 9)-(line 415,col 52)",
        "(line 418,col 9)-(line 420,col 9)",
        "(line 421,col 9)-(line 421,col 20)"
      ]
    }
  ]
}