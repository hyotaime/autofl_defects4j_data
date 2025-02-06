{
  "filepath": "/tmp/Jsoup-8b/src/main/java/org/jsoup/Connection.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Connection",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 22,
      "end_line": 388,
      "comment": "\n * A Connection provides a convenient interface to fetch content from the web, and parse them into Documents.\n * \u003cp\u003e\n * To get a new Connection, use {@link org.jsoup.Jsoup#connect(String)}. Connections contain {@link Connection.Request}\n * and {@link Connection.Response} objects. The request objects are reusable as prototype requests.\n * \u003cp\u003e\n * Request configuration can be made using either the shortcut methods in Connection (e.g. {@link #userAgent(String)}),\n * or by methods in the Connection.Request object directly. All request configuration must be made before the request\n * is executed.\n * \u003cp\u003e\n * The Connection interface is \u003cb\u003ecurrently in beta\u003c/b\u003e and subject to change. Comments, suggestions, and bug reports are welcome.\n "
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.url(java.net.URL)",
      "begin_line": 36,
      "end_line": 36,
      "comment": "\n     * Set the request URL to fetch. The protocol must be HTTP or HTTPS.\n     * @param url URL to connect to\n     * @return this Connection, for chaining\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.url(java.lang.String)",
      "begin_line": 43,
      "end_line": 43,
      "comment": "\n     * Set the request URL to fetch. The protocol must be HTTP or HTTPS.\n     * @param url URL to connect to\n     * @return this Connection, for chaining\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.userAgent(java.lang.String)",
      "begin_line": 50,
      "end_line": 50,
      "comment": "\n     * Set the request user-agent header.\n     * @param userAgent user-agent to use\n     * @return this Connection, for chaining\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.timeout(int)",
      "begin_line": 58,
      "end_line": 58,
      "comment": "\n     * Set the request timeouts (connect and read). If a timeout occurs, an IOException will be thrown. The default\n     * timeout is 3 seconds (3000 millis). A timeout of zero is treated as an infinite timeout.\n     * @param millis number of milliseconds (thousandths of a second) before timing out connects or reads.\n     * @return this Connection, for chaining\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.referrer(java.lang.String)",
      "begin_line": 65,
      "end_line": 65,
      "comment": "\n     * Set the request referrer (aka \"referer\") header.\n     * @param referrer referrer to use\n     * @return this Connection, for chaining\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.method(org.jsoup.Connection.Method)",
      "begin_line": 72,
      "end_line": 72,
      "comment": "\n     * Set the request method to use, GET or POST. Default is GET.\n     * @param method HTTP request method\n     * @return this Connection, for chaining\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.data(java.lang.String, java.lang.String)",
      "begin_line": 81,
      "end_line": 81,
      "comment": "\n     * Add a request data parameter. Request parameters are sent in the request query string for GETs, and in the request\n     * body for POSTs. A request may have multiple values of the same name.\n     * @param key data key\n     * @param value data value\n     * @return this Connection, for chaining\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.data(java.util.Map\u003cjava.lang.String, java.lang.String\u003e)",
      "begin_line": 88,
      "end_line": 88,
      "comment": "\n     * Adds all of the supplied data to the request data parameters\n     * @param data map of data parameters\n     * @return this Connection, for chaining\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.data(java.lang.String...)",
      "begin_line": 97,
      "end_line": 97,
      "comment": "\n     * Add a number of request data parameters. Multiple parameters may be set at once, e.g.:\n     * \u003ccode\u003e.data(\"name\", \"jsoup\", \"language\", \"Java\", \"language\", \"English\");\u003c/code\u003e creates a query string like:\n     * \u003ccode\u003e?name\u003djsoup\u0026language\u003dJava\u0026language\u003dEnglish\u003c/code\u003e\n     * @param keyvals a set of key value pairs.\n     * @return this Connection, for chaining\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.header(java.lang.String, java.lang.String)",
      "begin_line": 106,
      "end_line": 106,
      "comment": "\n     * Set a request header.\n     * @param name header name\n     * @param value header value\n     * @return this Connection, for chaining\n     * @see org.jsoup.Connection.Request#headers()\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.cookie(java.lang.String, java.lang.String)",
      "begin_line": 114,
      "end_line": 114,
      "comment": "\n     * Set a cookie to be sent in the request\n     * @param name name of cookie\n     * @param value value of cookie\n     * @return this Connection, for chaining\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.get()",
      "begin_line": 121,
      "end_line": 121,
      "comment": "\n     * Execute the request as a GET, and parse the result.\n     * @return parsed Document\n     * @throws IOException on error\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.post()",
      "begin_line": 128,
      "end_line": 128,
      "comment": "\n     * Execute the request as a POST, and parse the result.\n     * @return parsed Document\n     * @throws IOException on error\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.execute()",
      "begin_line": 135,
      "end_line": 135,
      "comment": "\n     * Execute the request.\n     * @return a response object\n     * @throws IOException on error\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.request()",
      "begin_line": 141,
      "end_line": 141,
      "comment": "\n     * Get the request object associatated with this connection\n     * @return request\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.request(org.jsoup.Connection.Request)",
      "begin_line": 148,
      "end_line": 148,
      "comment": "\n     * Set the connection\u0027s request\n     * @param request new request object\n     * @return this Connection, for chaining\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.response()",
      "begin_line": 154,
      "end_line": 154,
      "comment": "\n     * Get the response, once the request has been executed\n     * @return response\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.response(org.jsoup.Connection.Response)",
      "begin_line": 161,
      "end_line": 161,
      "comment": "\n     * Set the conenction\u0027s response\n     * @param response new response\n     * @return this Connection, for chaining\n     ",
      "child_ranges": []
    },
    {
      "type": "class_interface",
      "name": "Base",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 168,
      "end_line": 273,
      "comment": "\n     * Common methods for Requests and Responses\n     * @param \u003cT\u003e Type of Base, either Request or Response\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.Base.url()",
      "begin_line": 174,
      "end_line": 174,
      "comment": "\n         * Get the URL\n         * @return URL\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.Base.url(java.net.URL)",
      "begin_line": 181,
      "end_line": 181,
      "comment": "\n         * Set the URL\n         * @param url new URL\n         * @return this, for chaining\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.Base.method()",
      "begin_line": 187,
      "end_line": 187,
      "comment": "\n         * Get the request method\n         * @return method\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.Base.method(org.jsoup.Connection.Method)",
      "begin_line": 194,
      "end_line": 194,
      "comment": "\n         * Set the request method\n         * @param method new method\n         * @return this, for chaining\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.Base.header(java.lang.String)",
      "begin_line": 205,
      "end_line": 205,
      "comment": "\n         * Get the value of a header. This is a simplified header model, where a header may only have one value.\n         * \u003cp\u003e\n         * Header names are case insensitive.\n         * @param name name of header (case insensitive)\n         * @return value of header, or null if not set.\n         * @see #hasHeader(String)\n         * @see #cookie(String)\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.Base.header(java.lang.String, java.lang.String)",
      "begin_line": 213,
      "end_line": 213,
      "comment": "\n         * Set a header. This method will overwrite any existing header with the same case insensitive name. \n         * @param name Name of header\n         * @param value Value of header\n         * @return this, for chaining\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.Base.hasHeader(java.lang.String)",
      "begin_line": 220,
      "end_line": 220,
      "comment": "\n         * Check if a header is present\n         * @param name name of header (case insensitive)\n         * @return if the header is present in this request/response\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.Base.removeHeader(java.lang.String)",
      "begin_line": 227,
      "end_line": 227,
      "comment": "\n         * Remove a header by name\n         * @param name name of header to remove (case insensitive)\n         * @return this, for chianing\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.Base.headers()",
      "begin_line": 233,
      "end_line": 233,
      "comment": "\n         * Retrieve all of the request/response headers as a map\n         * @return headers\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.Base.cookie(java.lang.String)",
      "begin_line": 243,
      "end_line": 243,
      "comment": "\n         * Get a cookie value by name from this request/response.\n         * \u003cp\u003e\n         * Response objects have a simplified cookie model. Each cookie set in the response is added to the response\n         * object\u0027s cookie key\u003dvalue map. The cookie\u0027s path, domain, and expiry date are ignored.\n         * @param name name of cookie to retrieve.\n         * @return value of cookie, or null if not set\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.Base.cookie(java.lang.String, java.lang.String)",
      "begin_line": 251,
      "end_line": 251,
      "comment": "\n         * Set a cookie in this request/response.\n         * @param name name of cookie\n         * @param value value of cookie\n         * @return this, for chianing\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.Base.hasCookie(java.lang.String)",
      "begin_line": 258,
      "end_line": 258,
      "comment": "\n         * Check if a cookie is present\n         * @param name name of cookie\n         * @return if the cookie is present in this request/response\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.Base.removeCookie(java.lang.String)",
      "begin_line": 265,
      "end_line": 265,
      "comment": "\n         * Remove a cookie by name\n         * @param name name of cookie to remove\n         * @return this, for chianing\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.Base.cookies()",
      "begin_line": 271,
      "end_line": 271,
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
      "begin_line": 278,
      "end_line": 306,
      "comment": "\n     * Represents a HTTP request.\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.Request.timeout()",
      "begin_line": 284,
      "end_line": 284,
      "comment": "\n         * Get the request timeout, in milliseconds.\n         * @return the timeout in milliseconds.\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.Request.timeout(int)",
      "begin_line": 291,
      "end_line": 291,
      "comment": "\n         * Update the request timeout.\n         * @param millis timeout, in milliseconds\n         * @return this Request, for chaining\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.Request.data(org.jsoup.Connection.KeyVal)",
      "begin_line": 298,
      "end_line": 298,
      "comment": "\n         * Add a data parameter to the request\n         * @param keyval data to add.\n         * @return this Request, for chaining\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.Request.data()",
      "begin_line": 304,
      "end_line": 304,
      "comment": "\n         * Get all of the request\u0027s data parameters\n         * @return collection of keyvals\n         ",
      "child_ranges": []
    },
    {
      "type": "class_interface",
      "name": "Response",
      "is_interface": true,
      "parent_types": [
        "org.jsoup.Connection.Base\u003corg.jsoup.Connection.Response\u003e"
      ],
      "begin_line": 311,
      "end_line": 355,
      "comment": "\n     * Represents a HTTP response.\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.Response.statusCode()",
      "begin_line": 317,
      "end_line": 317,
      "comment": "\n         * Get the status code of the response.\n         * @return status code\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.Response.statusMessage()",
      "begin_line": 323,
      "end_line": 323,
      "comment": "\n         * Get the status message of the response.\n         * @return status message\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.Response.charset()",
      "begin_line": 329,
      "end_line": 329,
      "comment": "\n         * Get the character set name of the response.\n         * @return character set name\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.Response.contentType()",
      "begin_line": 335,
      "end_line": 335,
      "comment": "\n         * Get the response content type (e.g. \"text/html\");\n         * @return the response content type\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.Response.parse()",
      "begin_line": 342,
      "end_line": 342,
      "comment": "\n         * Parse the body of the response as a Document.\n         * @return a parsed Document\n         * @throws IOException on error\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.Response.body()",
      "begin_line": 348,
      "end_line": 348,
      "comment": "\n         * Get the body of the response as a plain string.\n         * @return body\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.Response.bodyAsBytes()",
      "begin_line": 354,
      "end_line": 354,
      "comment": "\n         * Get the body of the response as an array of bytes.\n         * @return body bytes\n         ",
      "child_ranges": []
    },
    {
      "type": "class_interface",
      "name": "KeyVal",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 360,
      "end_line": 387,
      "comment": "\n     * A Key Value tuple.\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.KeyVal.key(java.lang.String)",
      "begin_line": 367,
      "end_line": 367,
      "comment": "\n         * Update the key of a keyval\n         * @param key new key\n         * @return this KeyVal, for chaining\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.KeyVal.key()",
      "begin_line": 373,
      "end_line": 373,
      "comment": "\n         * Get the key of a keyval\n         * @return the key\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.KeyVal.value(java.lang.String)",
      "begin_line": 380,
      "end_line": 380,
      "comment": "\n         * Update the value of a keyval\n         * @param value the new value\n         * @return this KeyVal, for chaining\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.KeyVal.value()",
      "begin_line": 386,
      "end_line": 386,
      "comment": "\n         * Get the value of a keyval\n         * @return the value\n         ",
      "child_ranges": []
    }
  ]
}