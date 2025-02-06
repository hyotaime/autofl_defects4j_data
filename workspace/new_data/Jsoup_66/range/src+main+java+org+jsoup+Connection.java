{
  "filepath": "/tmp/Jsoup-66b/src/main/java/org/jsoup/Connection.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Connection",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 27,
      "end_line": 771,
      "comment": "\n * A Connection provides a convenient interface to fetch content from the web, and parse them into Documents.\n * \u003cp\u003e\n * To get a new Connection, use {@link org.jsoup.Jsoup#connect(String)}. Connections contain {@link Connection.Request}\n * and {@link Connection.Response} objects. The request objects are reusable as prototype requests.\n * \u003c/p\u003e\n * \u003cp\u003e\n * Request configuration can be made using either the shortcut methods in Connection (e.g. {@link #userAgent(String)}),\n * or by methods in the Connection.Request object directly. All request configuration must be made before the request is\n * executed.\n * \u003c/p\u003e\n "
    },
    {
      "type": "field",
      "varNames": [
        "hasBody"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.Connection.Method.Method(boolean)",
      "begin_line": 37,
      "end_line": 39,
      "comment": "",
      "child_ranges": [
        "(line 38,col 13)-(line 38,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.Method.hasBody()",
      "begin_line": 45,
      "end_line": 47,
      "comment": "\n         * Check if this HTTP method has/needs a request body\n         * @return if body needed\n         ",
      "child_ranges": [
        "(line 46,col 13)-(line 46,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.url(java.net.URL)",
      "begin_line": 55,
      "end_line": 55,
      "comment": "\n     * Set the request URL to fetch. The protocol must be HTTP or HTTPS.\n     * @param url URL to connect to\n     * @return this Connection, for chaining\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.url(java.lang.String)",
      "begin_line": 62,
      "end_line": 62,
      "comment": "\n     * Set the request URL to fetch. The protocol must be HTTP or HTTPS.\n     * @param url URL to connect to\n     * @return this Connection, for chaining\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.proxy(java.net.Proxy)",
      "begin_line": 69,
      "end_line": 69,
      "comment": "\n     * Set the proxy to use for this request. Set to \u003ccode\u003enull\u003c/code\u003e to disable.\n     * @param proxy proxy to use\n     * @return this Connection, for chaining\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.proxy(java.lang.String, int)",
      "begin_line": 77,
      "end_line": 77,
      "comment": "\n     * Set the HTTP proxy to use for this request.\n     * @param host the proxy hostname\n     * @param port the proxy port\n     * @return this Connection, for chaining\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.userAgent(java.lang.String)",
      "begin_line": 85,
      "end_line": 85,
      "comment": "\n     * Set the request user-agent header.\n     * @param userAgent user-agent to use\n     * @return this Connection, for chaining\n     * @see org.jsoup.helper.HttpConnection#DEFAULT_UA\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.timeout(int)",
      "begin_line": 97,
      "end_line": 97,
      "comment": "\n     * Set the request timeouts (connect and read). If a timeout occurs, an IOException will be thrown. The default\n     * timeout is \u003cb\u003e30 seconds\u003c/b\u003e (30,000 millis). A timeout of zero is treated as an infinite timeout.\n     * \u003cp\u003eNote that a read timeout is not the same as a maximum timeout. As long as the connection is sending bytes at\n     * least every \u003ci\u003etimeout\u003c/i\u003e seconds (e.g. in the case of an infinite stream of data, or a slow large download), the\n     * read timeout will not fire. This can be mitigated by using a maximum download size (see {@link #maxBodySize(int)}),\n     * or interrupting the connecting thread after a max timeout.\u003c/p\u003e\n     * @param millis number of milliseconds (thousandths of a second) before timing out connects or reads.\n     * @return this Connection, for chaining\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.maxBodySize(int)",
      "begin_line": 106,
      "end_line": 106,
      "comment": "\n     * Set the maximum bytes to read from the (uncompressed) connection into the body, before the connection is closed,\n     * and the input truncated. The default maximum is 1MB. A max size of zero is treated as an infinite amount (bounded\n     * only by your patience and the memory available on your machine).\n     * @param bytes number of bytes to read from the input before truncating\n     * @return this Connection, for chaining\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.referrer(java.lang.String)",
      "begin_line": 113,
      "end_line": 113,
      "comment": "\n     * Set the request referrer (aka \"referer\") header.\n     * @param referrer referrer to use\n     * @return this Connection, for chaining\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.followRedirects(boolean)",
      "begin_line": 120,
      "end_line": 120,
      "comment": "\n     * Configures the connection to (not) follow server redirects. By default this is \u003cb\u003etrue\u003c/b\u003e.\n     * @param followRedirects true if server redirects should be followed.\n     * @return this Connection, for chaining\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.method(org.jsoup.Connection.Method)",
      "begin_line": 127,
      "end_line": 127,
      "comment": "\n     * Set the request method to use, GET or POST. Default is GET.\n     * @param method HTTP request method\n     * @return this Connection, for chaining\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.ignoreHttpErrors(boolean)",
      "begin_line": 136,
      "end_line": 136,
      "comment": "\n     * Configures the connection to not throw exceptions when a HTTP error occurs. (4xx - 5xx, e.g. 404 or 500). By\n     * default this is \u003cb\u003efalse\u003c/b\u003e; an IOException is thrown if an error is encountered. If set to \u003cb\u003etrue\u003c/b\u003e, the\n     * response is populated with the error body, and the status message will reflect the error.\n     * @param ignoreHttpErrors - false (default) if HTTP errors should be ignored.\n     * @return this Connection, for chaining\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.ignoreContentType(boolean)",
      "begin_line": 146,
      "end_line": 146,
      "comment": "\n     * Ignore the document\u0027s Content-Type when parsing the response. By default this is \u003cb\u003efalse\u003c/b\u003e, an unrecognised\n     * content-type will cause an IOException to be thrown. (This is to prevent producing garbage by attempting to parse\n     * a JPEG binary image, for example.) Set to true to force a parse attempt regardless of content type.\n     * @param ignoreContentType set to true if you would like the content type ignored on parsing the response into a\n     * Document.\n     * @return this Connection, for chaining\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.validateTLSCertificates(boolean)",
      "begin_line": 165,
      "end_line": 165,
      "comment": "\n     * Disable/enable TLS certificates validation for HTTPS requests.\n     * \u003cp\u003e\n     * By default this is \u003cb\u003etrue\u003c/b\u003e; all\n     * connections over HTTPS perform normal validation of certificates, and will abort requests if the provided\n     * certificate does not validate.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * Some servers use expired, self-generated certificates; or your JDK may not\n     * support SNI hosts. In which case, you may want to enable this setting.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * \u003cb\u003eBe careful\u003c/b\u003e and understand why you need to disable these validations.\n     * \u003c/p\u003e\n     * @param value if should validate TLS (SSL) certificates. \u003cb\u003etrue\u003c/b\u003e by default.\n     * @return this Connection, for chaining\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.data(java.lang.String, java.lang.String)",
      "begin_line": 174,
      "end_line": 174,
      "comment": "\n     * Add a request data parameter. Request parameters are sent in the request query string for GETs, and in the\n     * request body for POSTs. A request may have multiple values of the same name.\n     * @param key data key\n     * @param value data value\n     * @return this Connection, for chaining\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.data(java.lang.String, java.lang.String, java.io.InputStream)",
      "begin_line": 186,
      "end_line": 186,
      "comment": "\n     * Add an input stream as a request data parameter. For GETs, has no effect, but for POSTS this will upload the\n     * input stream.\n     * @param key data key (form item name)\n     * @param filename the name of the file to present to the remove server. Typically just the name, not path,\n     * component.\n     * @param inputStream the input stream to upload, that you probably obtained from a {@link java.io.FileInputStream}.\n     * You must close the InputStream in a {@code finally} block.\n     * @return this Connections, for chaining\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.data(java.util.Collection\u003corg.jsoup.Connection.KeyVal\u003e)",
      "begin_line": 193,
      "end_line": 193,
      "comment": "\n     * Adds all of the supplied data to the request data parameters\n     * @param data collection of data parameters\n     * @return this Connection, for chaining\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.data(java.util.Map\u003cjava.lang.String, java.lang.String\u003e)",
      "begin_line": 200,
      "end_line": 200,
      "comment": "\n     * Adds all of the supplied data to the request data parameters\n     * @param data map of data parameters\n     * @return this Connection, for chaining\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.data(java.lang.String...)",
      "begin_line": 209,
      "end_line": 209,
      "comment": "\n     * Add a number of request data parameters. Multiple parameters may be set at once, e.g.: \u003ccode\u003e.data(\"name\",\n     * \"jsoup\", \"language\", \"Java\", \"language\", \"English\");\u003c/code\u003e creates a query string like:\n     * \u003ccode\u003e{@literal ?name\u003djsoup\u0026language\u003dJava\u0026language\u003dEnglish}\u003c/code\u003e\n     * @param keyvals a set of key value pairs.\n     * @return this Connection, for chaining\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.data(java.lang.String)",
      "begin_line": 216,
      "end_line": 216,
      "comment": "\n     * Get the data KeyVal for this key, if any\n     * @param key the data key\n     * @return null if not set\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.requestBody(java.lang.String)",
      "begin_line": 228,
      "end_line": 228,
      "comment": "\n     * Set a POST (or PUT) request body. Useful when a server expects a plain request body, not a set for URL\n     * encoded form key/value pairs. E.g.:\n     * \u003ccode\u003e\u003cpre\u003eJsoup.connect(url)\n     * .requestBody(json)\n     * .header(\"Content-Type\", \"application/json\")\n     * .post();\u003c/pre\u003e\u003c/code\u003e\n     * If any data key/vals are supplied, they will be sent as URL query params.\n     * @return this Request, for chaining\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.header(java.lang.String, java.lang.String)",
      "begin_line": 237,
      "end_line": 237,
      "comment": "\n     * Set a request header.\n     * @param name header name\n     * @param value header value\n     * @return this Connection, for chaining\n     * @see org.jsoup.Connection.Request#headers()\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.headers(java.util.Map\u003cjava.lang.String, java.lang.String\u003e)",
      "begin_line": 245,
      "end_line": 245,
      "comment": "\n     * Adds each of the supplied headers to the request.\n     * @param headers map of headers name {@literal -\u003e} value pairs\n     * @return this Connection, for chaining\n     * @see org.jsoup.Connection.Request#headers()\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.cookie(java.lang.String, java.lang.String)",
      "begin_line": 253,
      "end_line": 253,
      "comment": "\n     * Set a cookie to be sent in the request.\n     * @param name name of cookie\n     * @param value value of cookie\n     * @return this Connection, for chaining\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.cookies(java.util.Map\u003cjava.lang.String, java.lang.String\u003e)",
      "begin_line": 260,
      "end_line": 260,
      "comment": "\n     * Adds each of the supplied cookies to the request.\n     * @param cookies map of cookie name {@literal -\u003e} value pairs\n     * @return this Connection, for chaining\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.parser(org.jsoup.parser.Parser)",
      "begin_line": 268,
      "end_line": 268,
      "comment": "\n     * Provide an alternate parser to use when parsing the response to a Document. If not set, defaults to the HTML\n     * parser, unless the response content-type is XML, in which case the XML parser is used.\n     * @param parser alternate parser\n     * @return this Connection, for chaining\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.postDataCharset(java.lang.String)",
      "begin_line": 275,
      "end_line": 275,
      "comment": "\n     * Sets the default post data character set for x-www-form-urlencoded post data\n     * @param charset character set to encode post data\n     * @return this Connection, for chaining\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.get()",
      "begin_line": 286,
      "end_line": 286,
      "comment": "\n     * Execute the request as a GET, and parse the result.\n     * @return parsed Document\n     * @throws java.net.MalformedURLException if the request URL is not a HTTP or HTTPS URL, or is otherwise malformed\n     * @throws HttpStatusException if the response is not OK and HTTP response errors are not ignored\n     * @throws UnsupportedMimeTypeException if the response mime type is not supported and those errors are not ignored\n     * @throws java.net.SocketTimeoutException if the connection times out\n     * @throws IOException on error\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.post()",
      "begin_line": 297,
      "end_line": 297,
      "comment": "\n     * Execute the request as a POST, and parse the result.\n     * @return parsed Document\n     * @throws java.net.MalformedURLException if the request URL is not a HTTP or HTTPS URL, or is otherwise malformed\n     * @throws HttpStatusException if the response is not OK and HTTP response errors are not ignored\n     * @throws UnsupportedMimeTypeException if the response mime type is not supported and those errors are not ignored\n     * @throws java.net.SocketTimeoutException if the connection times out\n     * @throws IOException on error\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.execute()",
      "begin_line": 308,
      "end_line": 308,
      "comment": "\n     * Execute the request.\n     * @return a response object\n     * @throws java.net.MalformedURLException if the request URL is not a HTTP or HTTPS URL, or is otherwise malformed\n     * @throws HttpStatusException if the response is not OK and HTTP response errors are not ignored\n     * @throws UnsupportedMimeTypeException if the response mime type is not supported and those errors are not ignored\n     * @throws java.net.SocketTimeoutException if the connection times out\n     * @throws IOException on error\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.request()",
      "begin_line": 314,
      "end_line": 314,
      "comment": "\n     * Get the request object associated with this connection\n     * @return request\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.request(org.jsoup.Connection.Request)",
      "begin_line": 321,
      "end_line": 321,
      "comment": "\n     * Set the connection\u0027s request\n     * @param request new request object\n     * @return this Connection, for chaining\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.response()",
      "begin_line": 327,
      "end_line": 327,
      "comment": "\n     * Get the response, once the request has been executed\n     * @return response\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.response(org.jsoup.Connection.Response)",
      "begin_line": 334,
      "end_line": 334,
      "comment": "\n     * Set the connection\u0027s response\n     * @param response new response\n     * @return this Connection, for chaining\n     ",
      "child_ranges": []
    },
    {
      "type": "class_interface",
      "name": "Base",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 340,
      "end_line": 483,
      "comment": "\n     * Common methods for Requests and Responses\n     * @param \u003cT\u003e Type of Base, either Request or Response\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.Base.url()",
      "begin_line": 346,
      "end_line": 346,
      "comment": "\n         * Get the URL\n         * @return URL\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.Base.url(java.net.URL)",
      "begin_line": 353,
      "end_line": 353,
      "comment": "\n         * Set the URL\n         * @param url new URL\n         * @return this, for chaining\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.Base.method()",
      "begin_line": 359,
      "end_line": 359,
      "comment": "\n         * Get the request method\n         * @return method\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.Base.method(org.jsoup.Connection.Method)",
      "begin_line": 366,
      "end_line": 366,
      "comment": "\n         * Set the request method\n         * @param method new method\n         * @return this, for chaining\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.Base.header(java.lang.String)",
      "begin_line": 379,
      "end_line": 379,
      "comment": "\n         * Get the value of a header. If there is more than one header value with the same name, the headers are returned\n         * comma seperated, per \u003ca href\u003d\"https://www.w3.org/Protocols/rfc2616/rfc2616-sec4.html#sec4.2\"\u003erfc2616-sec4\u003c/a\u003e.\n         * \u003cp\u003e\n         * Header names are case insensitive.\n         * \u003c/p\u003e\n         * @param name name of header (case insensitive)\n         * @return value of header, or null if not set.\n         * @see #hasHeader(String)\n         * @see #cookie(String)\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.Base.headers(java.lang.String)",
      "begin_line": 386,
      "end_line": 386,
      "comment": "\n         * Get the values of a header.\n         * @param name header name, case insensitive.\n         * @return a list of values for this header, or an empty list if not set.\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.Base.header(java.lang.String, java.lang.String)",
      "begin_line": 396,
      "end_line": 396,
      "comment": "\n         * Set a header. This method will overwrite any existing header with the same case insensitive name. (If there\n         * is more than one value for this header, this method will update the first matching header.\n         * @param name Name of header\n         * @param value Value of header\n         * @return this, for chaining\n         * @see #addHeader(String, String)\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.Base.addHeader(java.lang.String, java.lang.String)",
      "begin_line": 404,
      "end_line": 404,
      "comment": "\n         * Add a header. The header will be added regardless of whether a header with the same name already exists.\n         * @param name Name of new header\n         * @param value Value of new header\n         * @return this, for chaining\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.Base.hasHeader(java.lang.String)",
      "begin_line": 411,
      "end_line": 411,
      "comment": "\n         * Check if a header is present\n         * @param name name of header (case insensitive)\n         * @return if the header is present in this request/response\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.Base.hasHeaderWithValue(java.lang.String, java.lang.String)",
      "begin_line": 419,
      "end_line": 419,
      "comment": "\n         * Check if a header is present, with the given value\n         * @param name header name (case insensitive)\n         * @param value value (case insensitive)\n         * @return if the header and value pair are set in this req/res\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.Base.removeHeader(java.lang.String)",
      "begin_line": 426,
      "end_line": 426,
      "comment": "\n         * Remove headers by name. If there is more than one header with this name, they will all be removed.\n         * @param name name of header to remove (case insensitive)\n         * @return this, for chaining\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.Base.headers()",
      "begin_line": 437,
      "end_line": 437,
      "comment": "\n         * Retrieve all of the request/response header names and corresponding values as a map. For headers with multiple\n         * values, only the first header is returned.\n         * \u003cp\u003eNote that this is a view of the headers only, and changes made to this map will not be reflected in the\n         * request/response object.\u003c/p\u003e\n         * @return headers\n         * @see #multiHeaders()\n\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.Base.multiHeaders()",
      "begin_line": 443,
      "end_line": 443,
      "comment": "\n         * Retreive all of the headers, keyed by the header name, and with a list of values per header.\n         * @return a list of multiple values per header.\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.Base.cookie(java.lang.String)",
      "begin_line": 454,
      "end_line": 454,
      "comment": "\n         * Get a cookie value by name from this request/response.\n         * \u003cp\u003e\n         * Response objects have a simplified cookie model. Each cookie set in the response is added to the response\n         * object\u0027s cookie key\u003dvalue map. The cookie\u0027s path, domain, and expiry date are ignored.\n         * \u003c/p\u003e\n         * @param name name of cookie to retrieve.\n         * @return value of cookie, or null if not set\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.Base.cookie(java.lang.String, java.lang.String)",
      "begin_line": 462,
      "end_line": 462,
      "comment": "\n         * Set a cookie in this request/response.\n         * @param name name of cookie\n         * @param value value of cookie\n         * @return this, for chaining\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.Base.hasCookie(java.lang.String)",
      "begin_line": 469,
      "end_line": 469,
      "comment": "\n         * Check if a cookie is present\n         * @param name name of cookie\n         * @return if the cookie is present in this request/response\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.Base.removeCookie(java.lang.String)",
      "begin_line": 476,
      "end_line": 476,
      "comment": "\n         * Remove a cookie by name\n         * @param name name of cookie to remove\n         * @return this, for chaining\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.Base.cookies()",
      "begin_line": 482,
      "end_line": 482,
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
      "begin_line": 488,
      "end_line": 646,
      "comment": "\n     * Represents a HTTP request.\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.Request.proxy()",
      "begin_line": 493,
      "end_line": 493,
      "comment": "\n         * Get the proxy used for this request.\n         * @return the proxy; \u003ccode\u003enull\u003c/code\u003e if not enabled.\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.Request.proxy(java.net.Proxy)",
      "begin_line": 500,
      "end_line": 500,
      "comment": "\n         * Update the proxy for this request.\n         * @param proxy the proxy ot use; \u003ccode\u003enull\u003c/code\u003e to disable.\n         * @return this Request, for chaining\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.Request.proxy(java.lang.String, int)",
      "begin_line": 508,
      "end_line": 508,
      "comment": "\n         * Set the HTTP proxy to use for this request.\n         * @param host the proxy hostname\n         * @param port the proxy port\n         * @return this Connection, for chaining\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.Request.timeout()",
      "begin_line": 514,
      "end_line": 514,
      "comment": "\n         * Get the request timeout, in milliseconds.\n         * @return the timeout in milliseconds.\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.Request.timeout(int)",
      "begin_line": 521,
      "end_line": 521,
      "comment": "\n         * Update the request timeout.\n         * @param millis timeout, in milliseconds\n         * @return this Request, for chaining\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.Request.maxBodySize()",
      "begin_line": 527,
      "end_line": 527,
      "comment": "\n         * Get the maximum body size, in bytes.\n         * @return the maximum body size, in bytes.\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.Request.maxBodySize(int)",
      "begin_line": 534,
      "end_line": 534,
      "comment": "\n         * Update the maximum body size, in bytes.\n         * @param bytes maximum body size, in bytes.\n         * @return this Request, for chaining\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.Request.followRedirects()",
      "begin_line": 540,
      "end_line": 540,
      "comment": "\n         * Get the current followRedirects configuration.\n         * @return true if followRedirects is enabled.\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.Request.followRedirects(boolean)",
      "begin_line": 547,
      "end_line": 547,
      "comment": "\n         * Configures the request to (not) follow server redirects. By default this is \u003cb\u003etrue\u003c/b\u003e.\n         * @param followRedirects true if server redirects should be followed.\n         * @return this Request, for chaining\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.Request.ignoreHttpErrors()",
      "begin_line": 554,
      "end_line": 554,
      "comment": "\n         * Get the current ignoreHttpErrors configuration.\n         * @return true if errors will be ignored; false (default) if HTTP errors will cause an IOException to be\n         * thrown.\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.Request.ignoreHttpErrors(boolean)",
      "begin_line": 561,
      "end_line": 561,
      "comment": "\n         * Configures the request to ignore HTTP errors in the response.\n         * @param ignoreHttpErrors set to true to ignore HTTP errors.\n         * @return this Request, for chaining\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.Request.ignoreContentType()",
      "begin_line": 568,
      "end_line": 568,
      "comment": "\n         * Get the current ignoreContentType configuration.\n         * @return true if invalid content-types will be ignored; false (default) if they will cause an IOException to\n         * be thrown.\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.Request.ignoreContentType(boolean)",
      "begin_line": 575,
      "end_line": 575,
      "comment": "\n         * Configures the request to ignore the Content-Type of the response.\n         * @param ignoreContentType set to true to ignore the content type.\n         * @return this Request, for chaining\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.Request.validateTLSCertificates()",
      "begin_line": 581,
      "end_line": 581,
      "comment": "\n         * Get the current state of TLS (SSL) certificate validation.\n         * @return true if TLS cert validation enabled\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.Request.validateTLSCertificates(boolean)",
      "begin_line": 587,
      "end_line": 587,
      "comment": "\n         * Set TLS certificate validation.\n         * @param value set false to ignore TLS (SSL) certificates\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.Request.data(org.jsoup.Connection.KeyVal)",
      "begin_line": 594,
      "end_line": 594,
      "comment": "\n         * Add a data parameter to the request\n         * @param keyval data to add.\n         * @return this Request, for chaining\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.Request.data()",
      "begin_line": 600,
      "end_line": 600,
      "comment": "\n         * Get all of the request\u0027s data parameters\n         * @return collection of keyvals\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.Request.requestBody(java.lang.String)",
      "begin_line": 612,
      "end_line": 612,
      "comment": "\n         * Set a POST (or PUT) request body. Useful when a server expects a plain request body, not a set for URL\n         * encoded form key/value pairs. E.g.:\n         * \u003ccode\u003e\u003cpre\u003eJsoup.connect(url)\n         * .requestBody(json)\n         * .header(\"Content-Type\", \"application/json\")\n         * .post();\u003c/pre\u003e\u003c/code\u003e\n         * If any data key/vals are supplied, they will be sent as URL query params.\n         * @return this Request, for chaining\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.Request.requestBody()",
      "begin_line": 618,
      "end_line": 618,
      "comment": "\n         * Get the current request body.\n         * @return null if not set.\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.Request.parser(org.jsoup.parser.Parser)",
      "begin_line": 625,
      "end_line": 625,
      "comment": "\n         * Specify the parser to use when parsing the document.\n         * @param parser parser to use.\n         * @return this Request, for chaining\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.Request.parser()",
      "begin_line": 631,
      "end_line": 631,
      "comment": "\n         * Get the current parser to use when parsing the document.\n         * @return current Parser\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.Request.postDataCharset(java.lang.String)",
      "begin_line": 638,
      "end_line": 638,
      "comment": "\n         * Sets the post data character set for x-www-form-urlencoded post data\n         * @param charset character set to encode post data\n         * @return this Request, for chaining\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.Request.postDataCharset()",
      "begin_line": 644,
      "end_line": 644,
      "comment": "\n         * Gets the post data character set for x-www-form-urlencoded post data\n         * @return character set to encode post data\n         ",
      "child_ranges": []
    },
    {
      "type": "class_interface",
      "name": "Response",
      "is_interface": true,
      "parent_types": [
        "org.jsoup.Connection.Base\u003corg.jsoup.Connection.Response\u003e"
      ],
      "begin_line": 651,
      "end_line": 719,
      "comment": "\n     * Represents a HTTP response.\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.Response.statusCode()",
      "begin_line": 657,
      "end_line": 657,
      "comment": "\n         * Get the status code of the response.\n         * @return status code\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.Response.statusMessage()",
      "begin_line": 663,
      "end_line": 663,
      "comment": "\n         * Get the status message of the response.\n         * @return status message\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.Response.charset()",
      "begin_line": 669,
      "end_line": 669,
      "comment": "\n         * Get the character set name of the response, derived from the content-type header.\n         * @return character set name\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.Response.charset(java.lang.String)",
      "begin_line": 676,
      "end_line": 676,
      "comment": "\n         * Set / override the response character set. When the document body is parsed it will be with this charset.\n         * @param charset to decode body as\n         * @return this Response, for chaining\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.Response.contentType()",
      "begin_line": 682,
      "end_line": 682,
      "comment": "\n         * Get the response content type (e.g. \"text/html\");\n         * @return the response content type\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.Response.parse()",
      "begin_line": 690,
      "end_line": 690,
      "comment": "\n         * Read and parse the body of the response as a Document. If you intend to parse the same response multiple\n         * times, you should {@link #bufferUp()} first.\n         * @return a parsed Document\n         * @throws IOException on error\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.Response.body()",
      "begin_line": 696,
      "end_line": 696,
      "comment": "\n         * Get the body of the response as a plain string.\n         * @return body\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.Response.bodyAsBytes()",
      "begin_line": 702,
      "end_line": 702,
      "comment": "\n         * Get the body of the response as an array of bytes.\n         * @return body bytes\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.Response.bufferUp()",
      "begin_line": 710,
      "end_line": 710,
      "comment": "\n         * Read the body of the response into a local buffer, so that {@link #parse()} may be called repeatedly on the\n         * same connection response (otherwise, once the response is read, its InputStream will have been drained and\n         * may not be re-read). Calling {@link #body() } or {@link #bodyAsBytes()} has the same effect.\n         * @return this response, for chaining\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.Response.bodyStream()",
      "begin_line": 718,
      "end_line": 718,
      "comment": "\n         * Get the body of the response as a (buffered) InputStream. You should close the input stream when you\u0027re done with it.\n         * Other body methods (like bufferUp, body, parse, etc) will not work in conjunction with this method.\n         * \u003cp\u003eThis method is useful for writing large responses to disk, without buffering them completely into memory first.\u003c/p\u003e\n         * @return the response body input stream\n         ",
      "child_ranges": []
    },
    {
      "type": "class_interface",
      "name": "KeyVal",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 724,
      "end_line": 770,
      "comment": "\n     * A Key Value tuple.\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.KeyVal.key(java.lang.String)",
      "begin_line": 731,
      "end_line": 731,
      "comment": "\n         * Update the key of a keyval\n         * @param key new key\n         * @return this KeyVal, for chaining\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.KeyVal.key()",
      "begin_line": 737,
      "end_line": 737,
      "comment": "\n         * Get the key of a keyval\n         * @return the key\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.KeyVal.value(java.lang.String)",
      "begin_line": 744,
      "end_line": 744,
      "comment": "\n         * Update the value of a keyval\n         * @param value the new value\n         * @return this KeyVal, for chaining\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.KeyVal.value()",
      "begin_line": 750,
      "end_line": 750,
      "comment": "\n         * Get the value of a keyval\n         * @return the value\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.KeyVal.inputStream(java.io.InputStream)",
      "begin_line": 757,
      "end_line": 757,
      "comment": "\n         * Add or update an input stream to this keyVal\n         * @param inputStream new input stream\n         * @return this KeyVal, for chaining\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.KeyVal.inputStream()",
      "begin_line": 763,
      "end_line": 763,
      "comment": "\n         * Get the input stream associated with this keyval, if any\n         * @return input stream if set, or null\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.KeyVal.hasInputStream()",
      "begin_line": 769,
      "end_line": 769,
      "comment": "\n         * Does this keyval have an input stream?\n         * @return true if this keyval does indeed have an input stream\n         ",
      "child_ranges": []
    }
  ]
}