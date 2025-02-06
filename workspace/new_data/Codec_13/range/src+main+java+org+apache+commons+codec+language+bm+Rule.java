{
  "filepath": "/tmp/Codec-13b/src/main/java/org/apache/commons/codec/language/bm/Rule.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Rule",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 82,
      "end_line": 697,
      "comment": "\n * A phoneme rule.\n * \u003cp\u003e\n * Rules have a pattern, left context, right context, output phoneme, set of languages for which they apply\n * and a logical flag indicating if all languages must be in play. A rule matches if:\n * \u003cul\u003e\n * \u003cli\u003ethe pattern matches at the current position\u003c/li\u003e\n * \u003cli\u003ethe string up until the beginning of the pattern matches the left context\u003c/li\u003e\n * \u003cli\u003ethe string from the end of the pattern matches the right context\u003c/li\u003e\n * \u003cli\u003elogical is ALL and all languages are in scope; or\u003c/li\u003e\n * \u003cli\u003elogical is any other value and at least one language is in scope\u003c/li\u003e\n * \u003c/ul\u003e\n * \u003cp\u003e\n * Rules are typically generated by parsing rules resources. In normal use, there will be no need for the user\n * to explicitly construct their own.\n * \u003cp\u003e\n * Rules are immutable and thread-safe.\n * \u003cp\u003e\n * \u003cb\u003eRules resources\u003c/b\u003e\n * \u003cp\u003e\n * Rules are typically loaded from resource files. These are UTF-8 encoded text files. They are systematically\n * named following the pattern:\n * \u003cblockquote\u003eorg/apache/commons/codec/language/bm/${NameType#getName}_${RuleType#getName}_${language}.txt\u003c/blockquote\u003e\n * \u003cp\u003e\n * The format of these resources is the following:\n * \u003cul\u003e\n * \u003cli\u003e\u003cb\u003eRules:\u003c/b\u003e whitespace separated, double-quoted strings. There should be 4 columns to each row, and these\n * will be interpreted as:\n * \u003col\u003e\n * \u003cli\u003epattern\u003c/li\u003e\n * \u003cli\u003eleft context\u003c/li\u003e\n * \u003cli\u003eright context\u003c/li\u003e\n * \u003cli\u003ephoneme\u003c/li\u003e\n * \u003c/ol\u003e\n * \u003c/li\u003e\n * \u003cli\u003e\u003cb\u003eEnd-of-line comments:\u003c/b\u003e Any occurrence of \u0027//\u0027 will cause all text following on that line to be discarded\n * as a comment.\u003c/li\u003e\n * \u003cli\u003e\u003cb\u003eMulti-line comments:\u003c/b\u003e Any line starting with \u0027/*\u0027 will start multi-line commenting mode. This will skip\n * all content until a line ending in \u0027*\u0027 and \u0027/\u0027 is found.\u003c/li\u003e\n * \u003cli\u003e\u003cb\u003eBlank lines:\u003c/b\u003e All blank lines will be skipped.\u003c/li\u003e\n * \u003c/ul\u003e\n *\n * @since 1.6\n * @version $Id$\n "
    },
    {
      "type": "class_interface",
      "name": "Phoneme",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.codec.language.bm.Rule.PhonemeExpr"
      ],
      "begin_line": 84,
      "end_line": 150,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "COMPARATOR"
      ],
      "begin_line": 85,
      "end_line": 104,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.Rule.Phoneme.Anonymous-2e643426-cd5c-42af-8431-fd91c695eb54.compare(org.apache.commons.codec.language.bm.Rule.Phoneme, org.apache.commons.codec.language.bm.Rule.Phoneme)",
      "begin_line": 86,
      "end_line": 103,
      "comment": "",
      "child_ranges": [
        "(line 88,col 17)-(line 96,col 17)",
        "(line 98,col 17)-(line 100,col 17)",
        "(line 102,col 17)-(line 102,col 25)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "phonemeText"
      ],
      "begin_line": 106,
      "end_line": 106,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "languages"
      ],
      "begin_line": 107,
      "end_line": 107,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.language.bm.Rule.Phoneme.Phoneme(java.lang.CharSequence, org.apache.commons.codec.language.bm.Languages.LanguageSet)",
      "begin_line": 109,
      "end_line": 112,
      "comment": "",
      "child_ranges": [
        "(line 110,col 13)-(line 110,col 62)",
        "(line 111,col 13)-(line 111,col 39)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.language.bm.Rule.Phoneme.Phoneme(org.apache.commons.codec.language.bm.Rule.Phoneme, org.apache.commons.codec.language.bm.Rule.Phoneme)",
      "begin_line": 114,
      "end_line": 117,
      "comment": "",
      "child_ranges": [
        "(line 115,col 13)-(line 115,col 65)",
        "(line 116,col 13)-(line 116,col 62)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.language.bm.Rule.Phoneme.Phoneme(org.apache.commons.codec.language.bm.Rule.Phoneme, org.apache.commons.codec.language.bm.Rule.Phoneme, org.apache.commons.codec.language.bm.Languages.LanguageSet)",
      "begin_line": 119,
      "end_line": 122,
      "comment": "",
      "child_ranges": [
        "(line 120,col 13)-(line 120,col 53)",
        "(line 121,col 13)-(line 121,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.Rule.Phoneme.append(java.lang.CharSequence)",
      "begin_line": 124,
      "end_line": 127,
      "comment": "",
      "child_ranges": [
        "(line 125,col 13)-(line 125,col 41)",
        "(line 126,col 13)-(line 126,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.Rule.Phoneme.getLanguages()",
      "begin_line": 129,
      "end_line": 131,
      "comment": "",
      "child_ranges": [
        "(line 130,col 13)-(line 130,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.Rule.Phoneme.getPhonemes()",
      "begin_line": 133,
      "end_line": 136,
      "comment": "",
      "child_ranges": [
        "(line 135,col 13)-(line 135,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.Rule.Phoneme.getPhonemeText()",
      "begin_line": 138,
      "end_line": 140,
      "comment": "",
      "child_ranges": [
        "(line 139,col 13)-(line 139,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.Rule.Phoneme.join(org.apache.commons.codec.language.bm.Rule.Phoneme)",
      "begin_line": 145,
      "end_line": 149,
      "comment": "\n         * @deprecated since 1.9\n         ",
      "child_ranges": [
        "(line 147,col 13)-(line 148,col 75)"
      ]
    },
    {
      "type": "class_interface",
      "name": "PhonemeExpr",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 152,
      "end_line": 154,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.Rule.PhonemeExpr.getPhonemes()",
      "begin_line": 153,
      "end_line": 153,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "class_interface",
      "name": "PhonemeList",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.codec.language.bm.Rule.PhonemeExpr"
      ],
      "begin_line": 156,
      "end_line": 167,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "phonemes"
      ],
      "begin_line": 157,
      "end_line": 157,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.language.bm.Rule.PhonemeList.PhonemeList(java.util.List\u003corg.apache.commons.codec.language.bm.Rule.Phoneme\u003e)",
      "begin_line": 159,
      "end_line": 161,
      "comment": "",
      "child_ranges": [
        "(line 160,col 13)-(line 160,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.Rule.PhonemeList.getPhonemes()",
      "begin_line": 163,
      "end_line": 166,
      "comment": "",
      "child_ranges": [
        "(line 165,col 13)-(line 165,col 33)"
      ]
    },
    {
      "type": "class_interface",
      "name": "RPattern",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 172,
      "end_line": 174,
      "comment": "\n     * A minimal wrapper around the functionality of Pattern that we use, to allow for alternate implementations.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.Rule.RPattern.isMatch(java.lang.CharSequence)",
      "begin_line": 173,
      "end_line": 173,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "field",
      "varNames": [
        "ALL_STRINGS_RMATCHER"
      ],
      "begin_line": 176,
      "end_line": 181,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.Rule.Anonymous-7e04ddef-2e1a-4870-b588-f72a7dde7aff.isMatch(java.lang.CharSequence)",
      "begin_line": 177,
      "end_line": 180,
      "comment": "",
      "child_ranges": [
        "(line 179,col 13)-(line 179,col 24)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "ALL"
      ],
      "begin_line": 183,
      "end_line": 183,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "DOUBLE_QUOTE"
      ],
      "begin_line": 185,
      "end_line": 185,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "HASH_INCLUDE"
      ],
      "begin_line": 187,
      "end_line": 187,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "RULES"
      ],
      "begin_line": 189,
      "end_line": 190,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.Rule.contains(java.lang.CharSequence, char)",
      "begin_line": 219,
      "end_line": 226,
      "comment": "",
      "child_ranges": [
        "(line 220,col 9)-(line 224,col 9)",
        "(line 225,col 9)-(line 225,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.Rule.createResourceName(org.apache.commons.codec.language.bm.NameType, org.apache.commons.codec.language.bm.RuleType, java.lang.String)",
      "begin_line": 228,
      "end_line": 231,
      "comment": "",
      "child_ranges": [
        "(line 229,col 9)-(line 230,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.Rule.createScanner(org.apache.commons.codec.language.bm.NameType, org.apache.commons.codec.language.bm.RuleType, java.lang.String)",
      "begin_line": 233,
      "end_line": 242,
      "comment": "",
      "child_ranges": [
        "(line 234,col 9)-(line 234,col 70)",
        "(line 235,col 9)-(line 235,col 98)",
        "(line 237,col 9)-(line 239,col 9)",
        "(line 241,col 9)-(line 241,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.Rule.createScanner(java.lang.String)",
      "begin_line": 244,
      "end_line": 253,
      "comment": "",
      "child_ranges": [
        "(line 245,col 9)-(line 245,col 98)",
        "(line 246,col 9)-(line 246,col 98)",
        "(line 248,col 9)-(line 250,col 9)",
        "(line 252,col 9)-(line 252,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.Rule.endsWith(java.lang.CharSequence, java.lang.CharSequence)",
      "begin_line": 255,
      "end_line": 265,
      "comment": "",
      "child_ranges": [
        "(line 256,col 9)-(line 258,col 9)",
        "(line 259,col 9)-(line 263,col 9)",
        "(line 264,col 9)-(line 264,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.Rule.getInstance(org.apache.commons.codec.language.bm.NameType, org.apache.commons.codec.language.bm.RuleType, org.apache.commons.codec.language.bm.Languages.LanguageSet)",
      "begin_line": 278,
      "end_line": 286,
      "comment": "\n     * Gets rules for a combination of name type, rule type and languages.\n     *\n     * @param nameType\n     *            the NameType to consider\n     * @param rt\n     *            the RuleType to consider\n     * @param langs\n     *            the set of languages to consider\n     * @return a list of Rules that apply\n     ",
      "child_ranges": [
        "(line 280,col 9)-(line 280,col 84)",
        "(line 281,col 9)-(line 281,col 58)",
        "(line 282,col 9)-(line 284,col 9)",
        "(line 285,col 9)-(line 285,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.Rule.getInstance(org.apache.commons.codec.language.bm.NameType, org.apache.commons.codec.language.bm.RuleType, java.lang.String)",
      "begin_line": 299,
      "end_line": 301,
      "comment": "\n     * Gets rules for a combination of name type, rule type and a single language.\n     *\n     * @param nameType\n     *            the NameType to consider\n     * @param rt\n     *            the RuleType to consider\n     * @param lang\n     *            the language to consider\n     * @return a list of Rules that apply\n     ",
      "child_ranges": [
        "(line 300,col 9)-(line 300,col 101)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.Rule.getInstanceMap(org.apache.commons.codec.language.bm.NameType, org.apache.commons.codec.language.bm.RuleType, org.apache.commons.codec.language.bm.Languages.LanguageSet)",
      "begin_line": 315,
      "end_line": 319,
      "comment": "\n     * Gets rules for a combination of name type, rule type and languages.\n     *\n     * @param nameType\n     *            the NameType to consider\n     * @param rt\n     *            the RuleType to consider\n     * @param langs\n     *            the set of languages to consider\n     * @return a map containing all Rules that apply, grouped by the first character of the rule pattern\n     * @since 1.9\n     ",
      "child_ranges": [
        "(line 317,col 9)-(line 318,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.Rule.getInstanceMap(org.apache.commons.codec.language.bm.NameType, org.apache.commons.codec.language.bm.RuleType, java.lang.String)",
      "begin_line": 333,
      "end_line": 343,
      "comment": "\n     * Gets rules for a combination of name type, rule type and a single language.\n     *\n     * @param nameType\n     *            the NameType to consider\n     * @param rt\n     *            the RuleType to consider\n     * @param lang\n     *            the language to consider\n     * @return a map containing all Rules that apply, grouped by the first character of the rule pattern\n     * @since 1.9\n     ",
      "child_ranges": [
        "(line 335,col 9)-(line 335,col 84)",
        "(line 337,col 9)-(line 340,col 9)",
        "(line 342,col 9)-(line 342,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.Rule.parsePhoneme(java.lang.String)",
      "begin_line": 345,
      "end_line": 359,
      "comment": "",
      "child_ranges": [
        "(line 346,col 9)-(line 346,col 41)",
        "(line 347,col 9)-(line 358,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.Rule.parsePhonemeExpr(java.lang.String)",
      "begin_line": 361,
      "end_line": 380,
      "comment": "",
      "child_ranges": [
        "(line 362,col 9)-(line 379,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.Rule.parseRules(java.util.Scanner, java.lang.String)",
      "begin_line": 382,
      "end_line": 467,
      "comment": "",
      "child_ranges": [
        "(line 383,col 9)-(line 383,col 80)",
        "(line 384,col 9)-(line 384,col 28)",
        "(line 386,col 9)-(line 386,col 43)",
        "(line 387,col 9)-(line 464,col 9)",
        "(line 466,col 9)-(line 466,col 21)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "myLine"
      ],
      "begin_line": 436,
      "end_line": 436,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "loc"
      ],
      "begin_line": 437,
      "end_line": 437,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.Rule.Anonymous-a3f42861-a2ed-4586-8c11-2f64d2d42dd0.toString()",
      "begin_line": 439,
      "end_line": 447,
      "comment": "",
      "child_ranges": [
        "(line 441,col 41)-(line 441,col 85)",
        "(line 442,col 41)-(line 442,col 58)",
        "(line 443,col 41)-(line 443,col 75)",
        "(line 444,col 41)-(line 444,col 86)",
        "(line 445,col 41)-(line 445,col 55)",
        "(line 446,col 41)-(line 446,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.Rule.pattern(java.lang.String)",
      "begin_line": 476,
      "end_line": 575,
      "comment": "\n     * Attempts to compile the regex into direct string ops, falling back to Pattern and Matcher in the worst case.\n     *\n     * @param regex\n     *            the regular expression to compile\n     * @return an RPattern that will match this regex\n     ",
      "child_ranges": [
        "(line 477,col 9)-(line 477,col 57)",
        "(line 478,col 9)-(line 478,col 53)",
        "(line 479,col 9)-(line 479,col 115)",
        "(line 480,col 9)-(line 480,col 52)",
        "(line 482,col 9)-(line 564,col 9)",
        "(line 566,col 9)-(line 574,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.Rule.Anonymous-b92b6efc-ee14-4bec-b787-827398da52a9.isMatch(java.lang.CharSequence)",
      "begin_line": 555,
      "end_line": 559,
      "comment": "",
      "child_ranges": [
        "(line 557,col 33)-(line 558,col 107)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.Rule.Anonymous-78650ff1-ede2-44b8-8464-51cd32a4c188.isMatch(java.lang.CharSequence)",
      "begin_line": 547,
      "end_line": 550,
      "comment": "",
      "child_ranges": [
        "(line 549,col 33)-(line 549,col 112)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.Rule.Anonymous-3caacecf-1d46-4624-9fe7-3d9cb5ee95e9.isMatch(java.lang.CharSequence)",
      "begin_line": 539,
      "end_line": 542,
      "comment": "",
      "child_ranges": [
        "(line 541,col 33)-(line 541,col 113)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.Rule.Anonymous-e4d7951a-7ebe-4ef8-8b9e-83fb6fc709ac.isMatch(java.lang.CharSequence)",
      "begin_line": 515,
      "end_line": 518,
      "comment": "",
      "child_ranges": [
        "(line 517,col 25)-(line 517,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.Rule.Anonymous-8e83b55c-ea8f-485b-9c1e-c0fb044d84d6.isMatch(java.lang.CharSequence)",
      "begin_line": 507,
      "end_line": 510,
      "comment": "",
      "child_ranges": [
        "(line 509,col 25)-(line 509,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.Rule.Anonymous-94703cb9-fccf-49e9-b2de-30b86babfb3e.isMatch(java.lang.CharSequence)",
      "begin_line": 495,
      "end_line": 498,
      "comment": "",
      "child_ranges": [
        "(line 497,col 29)-(line 497,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.Rule.Anonymous-ce788977-caea-4907-8281-d5e83ce54d68.isMatch(java.lang.CharSequence)",
      "begin_line": 488,
      "end_line": 491,
      "comment": "",
      "child_ranges": [
        "(line 490,col 29)-(line 490,col 55)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "pattern"
      ],
      "begin_line": 567,
      "end_line": 567,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.Rule.Anonymous-eeb22210-3b73-4f09-a6ca-a2f8f80f5a84.isMatch(java.lang.CharSequence)",
      "begin_line": 569,
      "end_line": 573,
      "comment": "",
      "child_ranges": [
        "(line 571,col 17)-(line 571,col 63)",
        "(line 572,col 17)-(line 572,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.Rule.startsWith(java.lang.CharSequence, java.lang.CharSequence)",
      "begin_line": 577,
      "end_line": 587,
      "comment": "",
      "child_ranges": [
        "(line 578,col 9)-(line 580,col 9)",
        "(line 581,col 9)-(line 585,col 9)",
        "(line 586,col 9)-(line 586,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.Rule.stripQuotes(java.lang.String)",
      "begin_line": 589,
      "end_line": 599,
      "comment": "",
      "child_ranges": [
        "(line 590,col 9)-(line 592,col 9)",
        "(line 594,col 9)-(line 596,col 9)",
        "(line 598,col 9)-(line 598,col 19)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "lContext"
      ],
      "begin_line": 601,
      "end_line": 601,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "pattern"
      ],
      "begin_line": 603,
      "end_line": 603,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "phoneme"
      ],
      "begin_line": 605,
      "end_line": 605,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "rContext"
      ],
      "begin_line": 607,
      "end_line": 607,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.language.bm.Rule.Rule(java.lang.String, java.lang.String, java.lang.String, org.apache.commons.codec.language.bm.Rule.PhonemeExpr)",
      "begin_line": 621,
      "end_line": 626,
      "comment": "\n     * Creates a new rule.\n     *\n     * @param pattern\n     *            the pattern\n     * @param lContext\n     *            the left context\n     * @param rContext\n     *            the right context\n     * @param phoneme\n     *            the resulting phoneme\n     ",
      "child_ranges": [
        "(line 622,col 9)-(line 622,col 31)",
        "(line 623,col 9)-(line 623,col 48)",
        "(line 624,col 9)-(line 624,col 48)",
        "(line 625,col 9)-(line 625,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.Rule.getLContext()",
      "begin_line": 633,
      "end_line": 635,
      "comment": "\n     * Gets the left context. This is a regular expression that must match to the left of the pattern.\n     *\n     * @return the left context Pattern\n     ",
      "child_ranges": [
        "(line 634,col 9)-(line 634,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.Rule.getPattern()",
      "begin_line": 642,
      "end_line": 644,
      "comment": "\n     * Gets the pattern. This is a string-literal that must exactly match.\n     *\n     * @return the pattern\n     ",
      "child_ranges": [
        "(line 643,col 9)-(line 643,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.Rule.getPhoneme()",
      "begin_line": 651,
      "end_line": 653,
      "comment": "\n     * Gets the phoneme. If the rule matches, this is the phoneme associated with the pattern match.\n     *\n     * @return the phoneme\n     ",
      "child_ranges": [
        "(line 652,col 9)-(line 652,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.Rule.getRContext()",
      "begin_line": 660,
      "end_line": 662,
      "comment": "\n     * Gets the right context. This is a regular expression that must match to the right of the pattern.\n     *\n     * @return the right context Pattern\n     ",
      "child_ranges": [
        "(line 661,col 9)-(line 661,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.Rule.patternAndContextMatches(java.lang.CharSequence, int)",
      "begin_line": 675,
      "end_line": 696,
      "comment": "\n     * Decides if the pattern and context match the input starting at a position. It is a match if the\n     * \u003ccode\u003elContext\u003c/code\u003e matches \u003ccode\u003einput\u003c/code\u003e up to \u003ccode\u003ei\u003c/code\u003e, \u003ccode\u003epattern\u003c/code\u003e matches at i and\n     * \u003ccode\u003erContext\u003c/code\u003e matches from the end of the match of \u003ccode\u003epattern\u003c/code\u003e to the end of \u003ccode\u003einput\u003c/code\u003e.\n     *\n     * @param input\n     *            the input String\n     * @param i\n     *            the int position within the input\n     * @return true if the pattern and left/right context match, false otherwise\n     ",
      "child_ranges": [
        "(line 676,col 9)-(line 678,col 9)",
        "(line 680,col 9)-(line 680,col 56)",
        "(line 681,col 9)-(line 681,col 42)",
        "(line 683,col 9)-(line 686,col 9)",
        "(line 690,col 9)-(line 694,col 9)",
        "(line 695,col 9)-(line 695,col 62)"
      ]
    }
  ]
}