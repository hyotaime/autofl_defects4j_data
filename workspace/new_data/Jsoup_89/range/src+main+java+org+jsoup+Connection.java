{
  "filepath": "/tmp/Jsoup-89b/src/main/java/org/jsoup/Connection.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Connection",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 28,
      "end_line": 789,
      "comment": "\n * A Connection provides a convenient interface to fetch content from the web, and parse them into Documents.\n * \u003cp\u003e\n * To get a new Connection, use {@link org.jsoup.Jsoup#connect(String)}. Connections contain {@link Connection.Request}\n * and {@link Connection.Response} objects. The request objects are reusable as prototype requests.\n * \u003c/p\u003e\n * \u003cp\u003e\n * Request configuration can be made using either the shortcut methods in Connection (e.g. {@link #userAgent(String)}),\n * or by methods in the Connection.Request object directly. All request configuration must be made before the request is\n * executed.\n * \u003c/p\u003e\n "
    },
    {
      "type": "field",
      "varNames": [
        "hasBody"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.Connection.Method.Method(boolean)",
      "begin_line": 38,
      "end_line": 40,
      "comment": "",
      "child_ranges": [
        "(line 39,col 13)-(line 39,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.Method.hasBody()",
      "begin_line": 46,
      "end_line": 48,
      "comment": "\n         * Check if this HTTP method has/needs a request body\n         * @return if body needed\n         ",
      "child_ranges": [
        "(line 47,col 13)-(line 47,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.url(java.net.URL)",
      "begin_line": 56,
      "end_line": 56,
      "comment": "\n     * Set the request URL to fetch. The protocol must be HTTP or HTTPS.\n     * @param url URL to connect to\n     * @return this Connection, for chaining\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.url(java.lang.String)",
      "begin_line": 63,
      "end_line": 63,
      "comment": "\n     * Set the request URL to fetch. The protocol must be HTTP or HTTPS.\n     * @param url URL to connect to\n     * @return this Connection, for chaining\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.proxy(java.net.Proxy)",
      "begin_line": 70,
      "end_line": 70,
      "comment": "\n     * Set the proxy to use for this request. Set to \u003ccode\u003enull\u003c/code\u003e to disable.\n     * @param proxy proxy to use\n     * @return this Connection, for chaining\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.proxy(java.lang.String, int)",
      "begin_line": 78,
      "end_line": 78,
      "comment": "\n     * Set the HTTP proxy to use for this request.\n     * @param host the proxy hostname\n     * @param port the proxy port\n     * @return this Connection, for chaining\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.userAgent(java.lang.String)",
      "begin_line": 86,
      "end_line": 86,
      "comment": "\n     * Set the request user-agent header.\n     * @param userAgent user-agent to use\n     * @return this Connection, for chaining\n     * @see org.jsoup.helper.HttpConnection#DEFAULT_UA\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.timeout(int)",
      "begin_line": 97,
      "end_line": 97,
      "comment": "\n     * Set the total request timeout duration. If a timeout occurs, an {@link java.net.SocketTimeoutException} will be thrown.\n     * \u003cp\u003eThe default timeout is \u003cb\u003e30 seconds\u003c/b\u003e (30,000 millis). A timeout of zero is treated as an infinite timeout.\n     * \u003cp\u003eNote that this timeout specifies the combined maximum duration of the connection time and the time to read\n     * the full response.\n     * @param millis number of milliseconds (thousandths of a second) before timing out connects or reads.\n     * @return this Connection, for chaining\n     * @see #maxBodySize(int)\n     ",
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
      "signature": "org.jsoup.Connection.sslSocketFactory(javax.net.ssl.SSLSocketFactory)",
      "begin_line": 153,
      "end_line": 153,
      "comment": "\n     * Set custom SSL socket factory\n     * @param sslSocketFactory custom SSL socket factory\n     * @return this Connection, for chaining\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.data(java.lang.String, java.lang.String)",
      "begin_line": 162,
      "end_line": 162,
      "comment": "\n     * Add a request data parameter. Request parameters are sent in the request query string for GETs, and in the\n     * request body for POSTs. A request may have multiple values of the same name.\n     * @param key data key\n     * @param value data value\n     * @return this Connection, for chaining\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.data(java.lang.String, java.lang.String, java.io.InputStream)",
      "begin_line": 175,
      "end_line": 175,
      "comment": "\n     * Add an input stream as a request data parameter. For GETs, has no effect, but for POSTS this will upload the\n     * input stream.\n     * @param key data key (form item name)\n     * @param filename the name of the file to present to the remove server. Typically just the name, not path,\n     * component.\n     * @param inputStream the input stream to upload, that you probably obtained from a {@link java.io.FileInputStream}.\n     * You must close the InputStream in a {@code finally} block.\n     * @return this Connections, for chaining\n     * @see #data(String, String, InputStream, String) if you want to set the uploaded file\u0027s mimetype.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.data(java.lang.String, java.lang.String, java.io.InputStream, java.lang.String)",
      "begin_line": 188,
      "end_line": 188,
      "comment": "\n     * Add an input stream as a request data parameter. For GETs, has no effect, but for POSTS this will upload the\n     * input stream.\n     * @param key data key (form item name)\n     * @param filename the name of the file to present to the remove server. Typically just the name, not path,\n     * component.\n     * @param inputStream the input stream to upload, that you probably obtained from a {@link java.io.FileInputStream}.\n     * @param contentType the Content Type (aka mimetype) to specify for this file.\n     * You must close the InputStream in a {@code finally} block.\n     * @return this Connections, for chaining\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.data(java.util.Collection\u003corg.jsoup.Connection.KeyVal\u003e)",
      "begin_line": 195,
      "end_line": 195,
      "comment": "\n     * Adds all of the supplied data to the request data parameters\n     * @param data collection of data parameters\n     * @return this Connection, for chaining\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.data(java.util.Map\u003cjava.lang.String, java.lang.String\u003e)",
      "begin_line": 202,
      "end_line": 202,
      "comment": "\n     * Adds all of the supplied data to the request data parameters\n     * @param data map of data parameters\n     * @return this Connection, for chaining\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.data(java.lang.String...)",
      "begin_line": 211,
      "end_line": 211,
      "comment": "\n     * Add a number of request data parameters. Multiple parameters may be set at once, e.g.: \u003ccode\u003e.data(\"name\",\n     * \"jsoup\", \"language\", \"Java\", \"language\", \"English\");\u003c/code\u003e creates a query string like:\n     * \u003ccode\u003e{@literal ?name\u003djsoup\u0026language\u003dJava\u0026language\u003dEnglish}\u003c/code\u003e\n     * @param keyvals a set of key value pairs.\n     * @return this Connection, for chaining\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.data(java.lang.String)",
      "begin_line": 218,
      "end_line": 218,
      "comment": "\n     * Get the data KeyVal for this key, if any\n     * @param key the data key\n     * @return null if not set\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.requestBody(java.lang.String)",
      "begin_line": 230,
      "end_line": 230,
      "comment": "\n     * Set a POST (or PUT) request body. Useful when a server expects a plain request body, not a set for URL\n     * encoded form key/value pairs. E.g.:\n     * \u003ccode\u003e\u003cpre\u003eJsoup.connect(url)\n     * .requestBody(json)\n     * .header(\"Content-Type\", \"application/json\")\n     * .post();\u003c/pre\u003e\u003c/code\u003e\n     * If any data key/vals are supplied, they will be sent as URL query params.\n     * @return this Request, for chaining\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.header(java.lang.String, java.lang.String)",
      "begin_line": 239,
      "end_line": 239,
      "comment": "\n     * Set a request header.\n     * @param name header name\n     * @param value header value\n     * @return this Connection, for chaining\n     * @see org.jsoup.Connection.Request#headers()\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.headers(java.util.Map\u003cjava.lang.String, java.lang.String\u003e)",
      "begin_line": 247,
      "end_line": 247,
      "comment": "\n     * Adds each of the supplied headers to the request.\n     * @param headers map of headers name {@literal -\u003e} value pairs\n     * @return this Connection, for chaining\n     * @see org.jsoup.Connection.Request#headers()\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.cookie(java.lang.String, java.lang.String)",
      "begin_line": 255,
      "end_line": 255,
      "comment": "\n     * Set a cookie to be sent in the request.\n     * @param name name of cookie\n     * @param value value of cookie\n     * @return this Connection, for chaining\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.cookies(java.util.Map\u003cjava.lang.String, java.lang.String\u003e)",
      "begin_line": 262,
      "end_line": 262,
      "comment": "\n     * Adds each of the supplied cookies to the request.\n     * @param cookies map of cookie name {@literal -\u003e} value pairs\n     * @return this Connection, for chaining\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.parser(org.jsoup.parser.Parser)",
      "begin_line": 270,
      "end_line": 270,
      "comment": "\n     * Provide an alternate parser to use when parsing the response to a Document. If not set, defaults to the HTML\n     * parser, unless the response content-type is XML, in which case the XML parser is used.\n     * @param parser alternate parser\n     * @return this Connection, for chaining\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.postDataCharset(java.lang.String)",
      "begin_line": 277,
      "end_line": 277,
      "comment": "\n     * Sets the default post data character set for x-www-form-urlencoded post data\n     * @param charset character set to encode post data\n     * @return this Connection, for chaining\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.get()",
      "begin_line": 288,
      "end_line": 288,
      "comment": "\n     * Execute the request as a GET, and parse the result.\n     * @return parsed Document\n     * @throws java.net.MalformedURLException if the request URL is not a HTTP or HTTPS URL, or is otherwise malformed\n     * @throws HttpStatusException if the response is not OK and HTTP response errors are not ignored\n     * @throws UnsupportedMimeTypeException if the response mime type is not supported and those errors are not ignored\n     * @throws java.net.SocketTimeoutException if the connection times out\n     * @throws IOException on error\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.post()",
      "begin_line": 299,
      "end_line": 299,
      "comment": "\n     * Execute the request as a POST, and parse the result.\n     * @return parsed Document\n     * @throws java.net.MalformedURLException if the request URL is not a HTTP or HTTPS URL, or is otherwise malformed\n     * @throws HttpStatusException if the response is not OK and HTTP response errors are not ignored\n     * @throws UnsupportedMimeTypeException if the response mime type is not supported and those errors are not ignored\n     * @throws java.net.SocketTimeoutException if the connection times out\n     * @throws IOException on error\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.execute()",
      "begin_line": 310,
      "end_line": 310,
      "comment": "\n     * Execute the request.\n     * @return a response object\n     * @throws java.net.MalformedURLException if the request URL is not a HTTP or HTTPS URL, or is otherwise malformed\n     * @throws HttpStatusException if the response is not OK and HTTP response errors are not ignored\n     * @throws UnsupportedMimeTypeException if the response mime type is not supported and those errors are not ignored\n     * @throws java.net.SocketTimeoutException if the connection times out\n     * @throws IOException on error\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.request()",
      "begin_line": 316,
      "end_line": 316,
      "comment": "\n     * Get the request object associated with this connection\n     * @return request\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.request(org.jsoup.Connection.Request)",
      "begin_line": 323,
      "end_line": 323,
      "comment": "\n     * Set the connection\u0027s request\n     * @param request new request object\n     * @return this Connection, for chaining\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.response()",
      "begin_line": 329,
      "end_line": 329,
      "comment": "\n     * Get the response, once the request has been executed\n     * @return response\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.response(org.jsoup.Connection.Response)",
      "begin_line": 336,
      "end_line": 336,
      "comment": "\n     * Set the connection\u0027s response\n     * @param response new response\n     * @return this Connection, for chaining\n     ",
      "child_ranges": []
    },
    {
      "type": "class_interface",
      "name": "Base",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 342,
      "end_line": 485,
      "comment": "\n     * Common methods for Requests and Responses\n     * @param \u003cT\u003e Type of Base, either Request or Response\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.Base.url()",
      "begin_line": 348,
      "end_line": 348,
      "comment": "\n         * Get the URL\n         * @return URL\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.Base.url(java.net.URL)",
      "begin_line": 355,
      "end_line": 355,
      "comment": "\n         * Set the URL\n         * @param url new URL\n         * @return this, for chaining\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.Base.method()",
      "begin_line": 361,
      "end_line": 361,
      "comment": "\n         * Get the request method\n         * @return method\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.Base.method(org.jsoup.Connection.Method)",
      "begin_line": 368,
      "end_line": 368,
      "comment": "\n         * Set the request method\n         * @param method new method\n         * @return this, for chaining\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.Base.header(java.lang.String)",
      "begin_line": 381,
      "end_line": 381,
      "comment": "\n         * Get the value of a header. If there is more than one header value with the same name, the headers are returned\n         * comma seperated, per \u003ca href\u003d\"https://www.w3.org/Protocols/rfc2616/rfc2616-sec4.html#sec4.2\"\u003erfc2616-sec4\u003c/a\u003e.\n         * \u003cp\u003e\n         * Header names are case insensitive.\n         * \u003c/p\u003e\n         * @param name name of header (case insensitive)\n         * @return value of header, or null if not set.\n         * @see #hasHeader(String)\n         * @see #cookie(String)\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.Base.headers(java.lang.String)",
      "begin_line": 388,
      "end_line": 388,
      "comment": "\n         * Get the values of a header.\n         * @param name header name, case insensitive.\n         * @return a list of values for this header, or an empty list if not set.\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.Base.header(java.lang.String, java.lang.String)",
      "begin_line": 398,
      "end_line": 398,
      "comment": "\n         * Set a header. This method will overwrite any existing header with the same case insensitive name. (If there\n         * is more than one value for this header, this method will update the first matching header.\n         * @param name Name of header\n         * @param value Value of header\n         * @return this, for chaining\n         * @see #addHeader(String, String)\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.Base.addHeader(java.lang.String, java.lang.String)",
      "begin_line": 406,
      "end_line": 406,
      "comment": "\n         * Add a header. The header will be added regardless of whether a header with the same name already exists.\n         * @param name Name of new header\n         * @param value Value of new header\n         * @return this, for chaining\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.Base.hasHeader(java.lang.String)",
      "begin_line": 413,
      "end_line": 413,
      "comment": "\n         * Check if a header is present\n         * @param name name of header (case insensitive)\n         * @return if the header is present in this request/response\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.Base.hasHeaderWithValue(java.lang.String, java.lang.String)",
      "begin_line": 421,
      "end_line": 421,
      "comment": "\n         * Check if a header is present, with the given value\n         * @param name header name (case insensitive)\n         * @param value value (case insensitive)\n         * @return if the header and value pair are set in this req/res\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.Base.removeHeader(java.lang.String)",
      "begin_line": 428,
      "end_line": 428,
      "comment": "\n         * Remove headers by name. If there is more than one header with this name, they will all be removed.\n         * @param name name of header to remove (case insensitive)\n         * @return this, for chaining\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.Base.headers()",
      "begin_line": 439,
      "end_line": 439,
      "comment": "\n         * Retrieve all of the request/response header names and corresponding values as a map. For headers with multiple\n         * values, only the first header is returned.\n         * \u003cp\u003eNote that this is a view of the headers only, and changes made to this map will not be reflected in the\n         * request/response object.\u003c/p\u003e\n         * @return headers\n         * @see #multiHeaders()\n\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.Base.multiHeaders()",
      "begin_line": 445,
      "end_line": 445,
      "comment": "\n         * Retreive all of the headers, keyed by the header name, and with a list of values per header.\n         * @return a list of multiple values per header.\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.Base.cookie(java.lang.String)",
      "begin_line": 456,
      "end_line": 456,
      "comment": "\n         * Get a cookie value by name from this request/response.\n         * \u003cp\u003e\n         * Response objects have a simplified cookie model. Each cookie set in the response is added to the response\n         * object\u0027s cookie key\u003dvalue map. The cookie\u0027s path, domain, and expiry date are ignored.\n         * \u003c/p\u003e\n         * @param name name of cookie to retrieve.\n         * @return value of cookie, or null if not set\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.Base.cookie(java.lang.String, java.lang.String)",
      "begin_line": 464,
      "end_line": 464,
      "comment": "\n         * Set a cookie in this request/response.\n         * @param name name of cookie\n         * @param value value of cookie\n         * @return this, for chaining\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.Base.hasCookie(java.lang.String)",
      "begin_line": 471,
      "end_line": 471,
      "comment": "\n         * Check if a cookie is present\n         * @param name name of cookie\n         * @return if the cookie is present in this request/response\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.Base.removeCookie(java.lang.String)",
      "begin_line": 478,
      "end_line": 478,
      "comment": "\n         * Remove a cookie by name\n         * @param name name of cookie to remove\n         * @return this, for chaining\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.Base.cookies()",
      "begin_line": 484,
      "end_line": 484,
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
      "begin_line": 490,
      "end_line": 648,
      "comment": "\n     * Represents a HTTP request.\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.Request.proxy()",
      "begin_line": 495,
      "end_line": 495,
      "comment": "\n         * Get the proxy used for this request.\n         * @return the proxy; \u003ccode\u003enull\u003c/code\u003e if not enabled.\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.Request.proxy(java.net.Proxy)",
      "begin_line": 502,
      "end_line": 502,
      "comment": "\n         * Update the proxy for this request.\n         * @param proxy the proxy ot use; \u003ccode\u003enull\u003c/code\u003e to disable.\n         * @return this Request, for chaining\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.Request.proxy(java.lang.String, int)",
      "begin_line": 510,
      "end_line": 510,
      "comment": "\n         * Set the HTTP proxy to use for this request.\n         * @param host the proxy hostname\n         * @param port the proxy port\n         * @return this Connection, for chaining\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.Request.timeout()",
      "begin_line": 516,
      "end_line": 516,
      "comment": "\n         * Get the request timeout, in milliseconds.\n         * @return the timeout in milliseconds.\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.Request.timeout(int)",
      "begin_line": 523,
      "end_line": 523,
      "comment": "\n         * Update the request timeout.\n         * @param millis timeout, in milliseconds\n         * @return this Request, for chaining\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.Request.maxBodySize()",
      "begin_line": 529,
      "end_line": 529,
      "comment": "\n         * Get the maximum body size, in bytes.\n         * @return the maximum body size, in bytes.\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.Request.maxBodySize(int)",
      "begin_line": 536,
      "end_line": 536,
      "comment": "\n         * Update the maximum body size, in bytes.\n         * @param bytes maximum body size, in bytes.\n         * @return this Request, for chaining\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.Request.followRedirects()",
      "begin_line": 542,
      "end_line": 542,
      "comment": "\n         * Get the current followRedirects configuration.\n         * @return true if followRedirects is enabled.\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.Request.followRedirects(boolean)",
      "begin_line": 549,
      "end_line": 549,
      "comment": "\n         * Configures the request to (not) follow server redirects. By default this is \u003cb\u003etrue\u003c/b\u003e.\n         * @param followRedirects true if server redirects should be followed.\n         * @return this Request, for chaining\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.Request.ignoreHttpErrors()",
      "begin_line": 556,
      "end_line": 556,
      "comment": "\n         * Get the current ignoreHttpErrors configuration.\n         * @return true if errors will be ignored; false (default) if HTTP errors will cause an IOException to be\n         * thrown.\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.Request.ignoreHttpErrors(boolean)",
      "begin_line": 563,
      "end_line": 563,
      "comment": "\n         * Configures the request to ignore HTTP errors in the response.\n         * @param ignoreHttpErrors set to true to ignore HTTP errors.\n         * @return this Request, for chaining\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.Request.ignoreContentType()",
      "begin_line": 570,
      "end_line": 570,
      "comment": "\n         * Get the current ignoreContentType configuration.\n         * @return true if invalid content-types will be ignored; false (default) if they will cause an IOException to\n         * be thrown.\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.Request.ignoreContentType(boolean)",
      "begin_line": 577,
      "end_line": 577,
      "comment": "\n         * Configures the request to ignore the Content-Type of the response.\n         * @param ignoreContentType set to true to ignore the content type.\n         * @return this Request, for chaining\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.Request.sslSocketFactory()",
      "begin_line": 583,
      "end_line": 583,
      "comment": "\n         * Get the current custom SSL socket factory, if any.\n         * @return custom SSL socket factory if set, null otherwise\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.Request.sslSocketFactory(javax.net.ssl.SSLSocketFactory)",
      "begin_line": 589,
      "end_line": 589,
      "comment": "\n         * Set a custom SSL socket factory.\n         * @param sslSocketFactory SSL socket factory\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.Request.data(org.jsoup.Connection.KeyVal)",
      "begin_line": 596,
      "end_line": 596,
      "comment": "\n         * Add a data parameter to the request\n         * @param keyval data to add.\n         * @return this Request, for chaining\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.Request.data()",
      "begin_line": 602,
      "end_line": 602,
      "comment": "\n         * Get all of the request\u0027s data parameters\n         * @return collection of keyvals\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.Request.requestBody(java.lang.String)",
      "begin_line": 614,
      "end_line": 614,
      "comment": "\n         * Set a POST (or PUT) request body. Useful when a server expects a plain request body, not a set for URL\n         * encoded form key/value pairs. E.g.:\n         * \u003ccode\u003e\u003cpre\u003eJsoup.connect(url)\n         * .requestBody(json)\n         * .header(\"Content-Type\", \"application/json\")\n         * .post();\u003c/pre\u003e\u003c/code\u003e\n         * If any data key/vals are supplied, they will be sent as URL query params.\n         * @return this Request, for chaining\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.Request.requestBody()",
      "begin_line": 620,
      "end_line": 620,
      "comment": "\n         * Get the current request body.\n         * @return null if not set.\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.Request.parser(org.jsoup.parser.Parser)",
      "begin_line": 627,
      "end_line": 627,
      "comment": "\n         * Specify the parser to use when parsing the document.\n         * @param parser parser to use.\n         * @return this Request, for chaining\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.Request.parser()",
      "begin_line": 633,
      "end_line": 633,
      "comment": "\n         * Get the current parser to use when parsing the document.\n         * @return current Parser\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.Request.postDataCharset(java.lang.String)",
      "begin_line": 640,
      "end_line": 640,
      "comment": "\n         * Sets the post data character set for x-www-form-urlencoded post data\n         * @param charset character set to encode post data\n         * @return this Request, for chaining\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.Request.postDataCharset()",
      "begin_line": 646,
      "end_line": 646,
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
      "begin_line": 653,
      "end_line": 722,
      "comment": "\n     * Represents a HTTP response.\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.Response.statusCode()",
      "begin_line": 659,
      "end_line": 659,
      "comment": "\n         * Get the status code of the response.\n         * @return status code\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.Response.statusMessage()",
      "begin_line": 665,
      "end_line": 665,
      "comment": "\n         * Get the status message of the response.\n         * @return status message\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.Response.charset()",
      "begin_line": 671,
      "end_line": 671,
      "comment": "\n         * Get the character set name of the response, derived from the content-type header.\n         * @return character set name\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.Response.charset(java.lang.String)",
      "begin_line": 678,
      "end_line": 678,
      "comment": "\n         * Set / override the response character set. When the document body is parsed it will be with this charset.\n         * @param charset to decode body as\n         * @return this Response, for chaining\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.Response.contentType()",
      "begin_line": 684,
      "end_line": 684,
      "comment": "\n         * Get the response content type (e.g. \"text/html\");\n         * @return the response content type\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.Response.parse()",
      "begin_line": 692,
      "end_line": 692,
      "comment": "\n         * Read and parse the body of the response as a Document. If you intend to parse the same response multiple\n         * times, you should {@link #bufferUp()} first.\n         * @return a parsed Document\n         * @throws IOException on error\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.Response.body()",
      "begin_line": 698,
      "end_line": 698,
      "comment": "\n         * Get the body of the response as a plain string.\n         * @return body\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.Response.bodyAsBytes()",
      "begin_line": 704,
      "end_line": 704,
      "comment": "\n         * Get the body of the response as an array of bytes.\n         * @return body bytes\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.Response.bufferUp()",
      "begin_line": 713,
      "end_line": 713,
      "comment": "\n         * Read the body of the response into a local buffer, so that {@link #parse()} may be called repeatedly on the\n         * same connection response (otherwise, once the response is read, its InputStream will have been drained and\n         * may not be re-read). Calling {@link #body() } or {@link #bodyAsBytes()} has the same effect.\n         * @return this response, for chaining\n         * @throws UncheckedIOException if an IO exception occurs during buffering.\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.Response.bodyStream()",
      "begin_line": 721,
      "end_line": 721,
      "comment": "\n         * Get the body of the response as a (buffered) InputStream. You should close the input stream when you\u0027re done with it.\n         * Other body methods (like bufferUp, body, parse, etc) will not work in conjunction with this method.\n         * \u003cp\u003eThis method is useful for writing large responses to disk, without buffering them completely into memory first.\u003c/p\u003e\n         * @return the response body input stream\n         ",
      "child_ranges": []
    },
    {
      "type": "class_interface",
      "name": "KeyVal",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 727,
      "end_line": 788,
      "comment": "\n     * A Key:Value tuple(+), used for form data.\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.KeyVal.key(java.lang.String)",
      "begin_line": 734,
      "end_line": 734,
      "comment": "\n         * Update the key of a keyval\n         * @param key new key\n         * @return this KeyVal, for chaining\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.KeyVal.key()",
      "begin_line": 740,
      "end_line": 740,
      "comment": "\n         * Get the key of a keyval\n         * @return the key\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.KeyVal.value(java.lang.String)",
      "begin_line": 747,
      "end_line": 747,
      "comment": "\n         * Update the value of a keyval\n         * @param value the new value\n         * @return this KeyVal, for chaining\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.KeyVal.value()",
      "begin_line": 753,
      "end_line": 753,
      "comment": "\n         * Get the value of a keyval\n         * @return the value\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.KeyVal.inputStream(java.io.InputStream)",
      "begin_line": 760,
      "end_line": 760,
      "comment": "\n         * Add or update an input stream to this keyVal\n         * @param inputStream new input stream\n         * @return this KeyVal, for chaining\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.KeyVal.inputStream()",
      "begin_line": 766,
      "end_line": 766,
      "comment": "\n         * Get the input stream associated with this keyval, if any\n         * @return input stream if set, or null\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.KeyVal.hasInputStream()",
      "begin_line": 772,
      "end_line": 772,
      "comment": "\n         * Does this keyval have an input stream?\n         * @return true if this keyval does indeed have an input stream\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.KeyVal.contentType(java.lang.String)",
      "begin_line": 781,
      "end_line": 781,
      "comment": "\n         * Set the Content Type header used in the MIME body (aka mimetype) when uploading files.\n         * Only useful if {@link #inputStream(InputStream)} is set.\n         * \u003cp\u003eWill default to {@code application/octet-stream}.\u003c/p\u003e\n         * @param contentType the new content type\n         * @return this KeyVal\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.Connection.KeyVal.contentType()",
      "begin_line": 787,
      "end_line": 787,
      "comment": "\n         * Get the current Content Type, or {@code null} if not set.\n         * @return the current Content Type.\n         ",
      "child_ranges": []
    }
  ]
}