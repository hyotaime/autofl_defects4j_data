{
  "filepath": "/tmp/Jsoup-22b/src/main/java/org/jsoup/Connection.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Connection",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 23,
      "end_line": 480,
      "comment": "\n * A Connection provides a convenient interface to fetch content from the web, and parse them into Documents.\n * \u003cp\u003e\n * To get a new Connection, use {@link org.jsoup.Jsoup#connect(String)}. Connections contain {@link Connection.Request}\n * and {@link Connection.Response} objects. The request objects are reusable as prototype requests.\n * \u003cp\u003e\n * Request configuration can be made using either the shortcut methods in Connection (e.g. {@link #userAgent(String)}),\n * or by methods in the Connection.Request object directly. All request configuration must be made before the request\n * is executed.\n * \u003cp\u003e\n * The Connection interface is \u003cb\u003ecurrently in beta\u003c/b\u003e and subject to change. Comments, suggestions, and bug reports are welcome.\n "
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.url(java.net.URL)",
      "begin_line": 37,
      "end_line": 37,
      "comment": "\n     * Set the request URL to fetch. The protocol must be HTTP or HTTPS.\n     * @param url URL to connect to\n     * @return this Connection, for chaining\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.url(java.lang.String)",
      "begin_line": 44,
      "end_line": 44,
      "comment": "\n     * Set the request URL to fetch. The protocol must be HTTP or HTTPS.\n     * @param url URL to connect to\n     * @return this Connection, for chaining\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.userAgent(java.lang.String)",
      "begin_line": 51,
      "end_line": 51,
      "comment": "\n     * Set the request user-agent header.\n     * @param userAgent user-agent to use\n     * @return this Connection, for chaining\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.timeout(int)",
      "begin_line": 59,
      "end_line": 59,
      "comment": "\n     * Set the request timeouts (connect and read). If a timeout occurs, an IOException will be thrown. The default\n     * timeout is 3 seconds (3000 millis). A timeout of zero is treated as an infinite timeout.\n     * @param millis number of milliseconds (thousandths of a second) before timing out connects or reads.\n     * @return this Connection, for chaining\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.referrer(java.lang.String)",
      "begin_line": 66,
      "end_line": 66,
      "comment": "\n     * Set the request referrer (aka \"referer\") header.\n     * @param referrer referrer to use\n     * @return this Connection, for chaining\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.followRedirects(boolean)",
      "begin_line": 73,
      "end_line": 73,
      "comment": "\n     * Configures the connection to (not) follow server redirects. By default this is \u003cb\u003etrue\u003c/b\u003e.\n     * @param followRedirects true if server redirects should be followed.\n     * @return this Connection, for chaining\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.method(org.jsoup.Connection.Method)",
      "begin_line": 80,
      "end_line": 80,
      "comment": "\n     * Set the request method to use, GET or POST. Default is GET.\n     * @param method HTTP request method\n     * @return this Connection, for chaining\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.ignoreHttpErrors(boolean)",
      "begin_line": 89,
      "end_line": 89,
      "comment": "\n     * Configures the connection to not throw exceptions when a HTTP error occurs. (4xx - 5xx, e.g. 404 or 500). By\n     * default this is \u003cb\u003efalse\u003c/b\u003e; an IOException is thrown if an error is encountered. If set to \u003cb\u003etrue\u003c/b\u003e, the\n     * response is populated with the error body, and the status message will reflect the error.\n     * @param ignoreHttpErrors - false (default) if HTTP errors should be ignored.\n     * @return this Connection, for chaining\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.ignoreContentType(boolean)",
      "begin_line": 99,
      "end_line": 99,
      "comment": "\n     * Ignore the document\u0027s Content-Type when parsing the response. By default this is \u003cb\u003efalse\u003c/b\u003e, an unrecognised\n     * content-type will cause an IOException to be thrown. (This is to prevent producing garbage by attempting to parse\n     * a JPEG binary image, for example.) Set to true to force a parse attempt regardless of content type.\n     * @param ignoreContentType set to true if you would like the content type ignored on parsing the response into a\n     * Document.\n     * @return this Connection, for chaining\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.data(java.lang.String, java.lang.String)",
      "begin_line": 108,
      "end_line": 108,
      "comment": "\n     * Add a request data parameter. Request parameters are sent in the request query string for GETs, and in the request\n     * body for POSTs. A request may have multiple values of the same name.\n     * @param key data key\n     * @param value data value\n     * @return this Connection, for chaining\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.data(java.util.Map\u003cjava.lang.String, java.lang.String\u003e)",
      "begin_line": 115,
      "end_line": 115,
      "comment": "\n     * Adds all of the supplied data to the request data parameters\n     * @param data map of data parameters\n     * @return this Connection, for chaining\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.data(java.lang.String...)",
      "begin_line": 124,
      "end_line": 124,
      "comment": "\n     * Add a number of request data parameters. Multiple parameters may be set at once, e.g.:\n     * \u003ccode\u003e.data(\"name\", \"jsoup\", \"language\", \"Java\", \"language\", \"English\");\u003c/code\u003e creates a query string like:\n     * \u003ccode\u003e?name\u003djsoup\u0026language\u003dJava\u0026language\u003dEnglish\u003c/code\u003e\n     * @param keyvals a set of key value pairs.\n     * @return this Connection, for chaining\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.header(java.lang.String, java.lang.String)",
      "begin_line": 133,
      "end_line": 133,
      "comment": "\n     * Set a request header.\n     * @param name header name\n     * @param value header value\n     * @return this Connection, for chaining\n     * @see org.jsoup.Connection.Request#headers()\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.cookie(java.lang.String, java.lang.String)",
      "begin_line": 141,
      "end_line": 141,
      "comment": "\n     * Set a cookie to be sent in the request.\n     * @param name name of cookie\n     * @param value value of cookie\n     * @return this Connection, for chaining\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.cookies(java.util.Map\u003cjava.lang.String, java.lang.String\u003e)",
      "begin_line": 148,
      "end_line": 148,
      "comment": "\n     * Adds each of the supplied cookies to the request.\n     * @param cookies map of cookie name -\u003e value pairs\n     * @return this Connection, for chaining\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.parser(org.jsoup.parser.Parser)",
      "begin_line": 155,
      "end_line": 155,
      "comment": "\n     * Provide an alternate parser to use when parsing the response to a Document.\n     * @param parser alternate parser\n     * @return this Connection, for chaining\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.get()",
      "begin_line": 162,
      "end_line": 162,
      "comment": "\n     * Execute the request as a GET, and parse the result.\n     * @return parsed Document\n     * @throws IOException on error\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.post()",
      "begin_line": 169,
      "end_line": 169,
      "comment": "\n     * Execute the request as a POST, and parse the result.\n     * @return parsed Document\n     * @throws IOException on error\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.execute()",
      "begin_line": 176,
      "end_line": 176,
      "comment": "\n     * Execute the request.\n     * @return a response object\n     * @throws IOException on error\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.request()",
      "begin_line": 182,
      "end_line": 182,
      "comment": "\n     * Get the request object associatated with this connection\n     * @return request\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.request(org.jsoup.Connection.Request)",
      "begin_line": 189,
      "end_line": 189,
      "comment": "\n     * Set the connection\u0027s request\n     * @param request new request object\n     * @return this Connection, for chaining\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.response()",
      "begin_line": 195,
      "end_line": 195,
      "comment": "\n     * Get the response, once the request has been executed\n     * @return response\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.response(org.jsoup.Connection.Response)",
      "begin_line": 202,
      "end_line": 202,
      "comment": "\n     * Set the conenction\u0027s response\n     * @param response new response\n     * @return this Connection, for chaining\n     ",
      "child_ranges": []
    },
    {
      "type": "class_interface",
      "name": "Base",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 209,
      "end_line": 314,
      "comment": "\n     * Common methods for Requests and Responses\n     * @param \u003cT\u003e Type of Base, either Request or Response\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.Base.url()",
      "begin_line": 215,
      "end_line": 215,
      "comment": "\n         * Get the URL\n         * @return URL\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.Base.url(java.net.URL)",
      "begin_line": 222,
      "end_line": 222,
      "comment": "\n         * Set the URL\n         * @param url new URL\n         * @return this, for chaining\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.Base.method()",
      "begin_line": 228,
      "end_line": 228,
      "comment": "\n         * Get the request method\n         * @return method\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.Base.method(org.jsoup.Connection.Method)",
      "begin_line": 235,
      "end_line": 235,
      "comment": "\n         * Set the request method\n         * @param method new method\n         * @return this, for chaining\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.Base.header(java.lang.String)",
      "begin_line": 246,
      "end_line": 246,
      "comment": "\n         * Get the value of a header. This is a simplified header model, where a header may only have one value.\n         * \u003cp\u003e\n         * Header names are case insensitive.\n         * @param name name of header (case insensitive)\n         * @return value of header, or null if not set.\n         * @see #hasHeader(String)\n         * @see #cookie(String)\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.Base.header(java.lang.String, java.lang.String)",
      "begin_line": 254,
      "end_line": 254,
      "comment": "\n         * Set a header. This method will overwrite any existing header with the same case insensitive name. \n         * @param name Name of header\n         * @param value Value of header\n         * @return this, for chaining\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.Base.hasHeader(java.lang.String)",
      "begin_line": 261,
      "end_line": 261,
      "comment": "\n         * Check if a header is present\n         * @param name name of header (case insensitive)\n         * @return if the header is present in this request/response\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.Base.removeHeader(java.lang.String)",
      "begin_line": 268,
      "end_line": 268,
      "comment": "\n         * Remove a header by name\n         * @param name name of header to remove (case insensitive)\n         * @return this, for chianing\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.Base.headers()",
      "begin_line": 274,
      "end_line": 274,
      "comment": "\n         * Retrieve all of the request/response headers as a map\n         * @return headers\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.Base.cookie(java.lang.String)",
      "begin_line": 284,
      "end_line": 284,
      "comment": "\n         * Get a cookie value by name from this request/response.\n         * \u003cp\u003e\n         * Response objects have a simplified cookie model. Each cookie set in the response is added to the response\n         * object\u0027s cookie key\u003dvalue map. The cookie\u0027s path, domain, and expiry date are ignored.\n         * @param name name of cookie to retrieve.\n         * @return value of cookie, or null if not set\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.Base.cookie(java.lang.String, java.lang.String)",
      "begin_line": 292,
      "end_line": 292,
      "comment": "\n         * Set a cookie in this request/response.\n         * @param name name of cookie\n         * @param value value of cookie\n         * @return this, for chianing\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.Base.hasCookie(java.lang.String)",
      "begin_line": 299,
      "end_line": 299,
      "comment": "\n         * Check if a cookie is present\n         * @param name name of cookie\n         * @return if the cookie is present in this request/response\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.Base.removeCookie(java.lang.String)",
      "begin_line": 306,
      "end_line": 306,
      "comment": "\n         * Remove a cookie by name\n         * @param name name of cookie to remove\n         * @return this, for chianing\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.Base.cookies()",
      "begin_line": 312,
      "end_line": 312,
      "comment": "\n         * Retrieve all of the request/response cookies as a map\n         * @return cookies\n         ",
      "child_ranges": []
    },
    {
      "type": "class_interface",
      "name": "Request",
      "is_interface": true,
      "parent_types": [
        "org.jsoup.Connection.Base\u003corg.jsoup.Connection.Request\u003e"
      ],
      "begin_line": 319,
      "end_line": 398,
      "comment": "\n     * Represents a HTTP request.\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.Request.timeout()",
      "begin_line": 324,
      "end_line": 324,
      "comment": "\n         * Get the request timeout, in milliseconds.\n         * @return the timeout in milliseconds.\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.Request.timeout(int)",
      "begin_line": 331,
      "end_line": 331,
      "comment": "\n         * Update the request timeout.\n         * @param millis timeout, in milliseconds\n         * @return this Request, for chaining\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.Request.followRedirects()",
      "begin_line": 337,
      "end_line": 337,
      "comment": "\n         * Get the current followRedirects configuration.\n         * @return true if followRedirects is enabled.\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.Request.followRedirects(boolean)",
      "begin_line": 345,
      "end_line": 345,
      "comment": "\n         * Configures the request to (not) follow server redirects. By default this is \u003cb\u003etrue\u003c/b\u003e.\n         *\n         * @param followRedirects true if server redirects should be followed.\n         * @return this Request, for chaining\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.Request.ignoreHttpErrors()",
      "begin_line": 351,
      "end_line": 351,
      "comment": "\n         * Get the current ignoreHttpErrors configuration.\n         * @return true if errors will be ignored; false (default) if HTTP errors will cause an IOException to be thrown.\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.Request.ignoreHttpErrors(boolean)",
      "begin_line": 358,
      "end_line": 358,
      "comment": "\n    \t * Configures the request to ignore HTTP errors in the response.\n    \t * @param ignoreHttpErrors set to true to ignore HTTP errors.\n         * @return this Request, for chaining\n    \t ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.Request.ignoreContentType()",
      "begin_line": 364,
      "end_line": 364,
      "comment": "\n         * Get the current ignoreContentType configuration.\n         * @return true if invalid content-types will be ignored; false (default) if they will cause an IOException to be thrown.\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.Request.ignoreContentType(boolean)",
      "begin_line": 371,
      "end_line": 371,
      "comment": "\n    \t * Configures the request to ignore the Content-Type of the response.\n    \t * @param ignoreContentType set to true to ignore the contenet type.\n         * @return this Request, for chaining\n    \t ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.Request.data(org.jsoup.Connection.KeyVal)",
      "begin_line": 378,
      "end_line": 378,
      "comment": "\n         * Add a data parameter to the request\n         * @param keyval data to add.\n         * @return this Request, for chaining\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.Request.data()",
      "begin_line": 384,
      "end_line": 384,
      "comment": "\n         * Get all of the request\u0027s data parameters\n         * @return collection of keyvals\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.Request.parser(org.jsoup.parser.Parser)",
      "begin_line": 391,
      "end_line": 391,
      "comment": "\n         * Specify the parser to use when parsing the document.\n         * @param parser parser to use.\n         * @return this Request, for chaining\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.Request.parser()",
      "begin_line": 397,
      "end_line": 397,
      "comment": "\n         * Get the current parser to use when parsing the document.\n         * @return current Parser\n         ",
      "child_ranges": []
    },
    {
      "type": "class_interface",
      "name": "Response",
      "is_interface": true,
      "parent_types": [
        "org.jsoup.Connection.Base\u003corg.jsoup.Connection.Response\u003e"
      ],
      "begin_line": 403,
      "end_line": 447,
      "comment": "\n     * Represents a HTTP response.\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.Response.statusCode()",
      "begin_line": 409,
      "end_line": 409,
      "comment": "\n         * Get the status code of the response.\n         * @return status code\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.Response.statusMessage()",
      "begin_line": 415,
      "end_line": 415,
      "comment": "\n         * Get the status message of the response.\n         * @return status message\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.Response.charset()",
      "begin_line": 421,
      "end_line": 421,
      "comment": "\n         * Get the character set name of the response.\n         * @return character set name\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.Response.contentType()",
      "begin_line": 427,
      "end_line": 427,
      "comment": "\n         * Get the response content type (e.g. \"text/html\");\n         * @return the response content type\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.Response.parse()",
      "begin_line": 434,
      "end_line": 434,
      "comment": "\n         * Parse the body of the response as a Document.\n         * @return a parsed Document\n         * @throws IOException on error\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.Response.body()",
      "begin_line": 440,
      "end_line": 440,
      "comment": "\n         * Get the body of the response as a plain string.\n         * @return body\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.Response.bodyAsBytes()",
      "begin_line": 446,
      "end_line": 446,
      "comment": "\n         * Get the body of the response as an array of bytes.\n         * @return body bytes\n         ",
      "child_ranges": []
    },
    {
      "type": "class_interface",
      "name": "KeyVal",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 452,
      "end_line": 479,
      "comment": "\n     * A Key Value tuple.\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.KeyVal.key(java.lang.String)",
      "begin_line": 459,
      "end_line": 459,
      "comment": "\n         * Update the key of a keyval\n         * @param key new key\n         * @return this KeyVal, for chaining\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.KeyVal.key()",
      "begin_line": 465,
      "end_line": 465,
      "comment": "\n         * Get the key of a keyval\n         * @return the key\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.KeyVal.value(java.lang.String)",
      "begin_line": 472,
      "end_line": 472,
      "comment": "\n         * Update the value of a keyval\n         * @param value the new value\n         * @return this KeyVal, for chaining\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.KeyVal.value()",
      "begin_line": 478,
      "end_line": 478,
      "comment": "\n         * Get the value of a keyval\n         * @return the value\n         ",
      "child_ranges": []
    }
  ]
}