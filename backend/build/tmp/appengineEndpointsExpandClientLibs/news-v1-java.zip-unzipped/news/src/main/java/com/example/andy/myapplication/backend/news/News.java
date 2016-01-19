/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/google/apis-client-generator/
 * (build: 2015-11-16 19:10:01 UTC)
 * on 2015-12-21 at 03:02:33 UTC 
 * Modify at your own risk.
 */

package com.example.andy.myapplication.backend.news;

/**
 * Service definition for News (v1).
 *
 * <p>
 * This is an API
 * </p>
 *
 * <p>
 * For more information about this service, see the
 * <a href="" target="_blank">API Documentation</a>
 * </p>
 *
 * <p>
 * This service uses {@link NewsRequestInitializer} to initialize global parameters via its
 * {@link Builder}.
 * </p>
 *
 * @since 1.3
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public class News extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient {

  // Note: Leave this static initializer at the top of the file.
  static {
    com.google.api.client.util.Preconditions.checkState(
        com.google.api.client.googleapis.GoogleUtils.MAJOR_VERSION == 1 &&
        com.google.api.client.googleapis.GoogleUtils.MINOR_VERSION >= 15,
        "You are currently running with version %s of google-api-client. " +
        "You need at least version 1.15 of google-api-client to run version " +
        "1.21.0 of the news library.", com.google.api.client.googleapis.GoogleUtils.VERSION);
  }

  /**
   * The default encoded root URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_ROOT_URL = "https://master-smithy-691.appspot.com/_ah/api/";

  /**
   * The default encoded service path of the service. This is determined when the library is
   * generated and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_SERVICE_PATH = "news/v1/news/";

  /**
   * The default encoded base URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   */
  public static final String DEFAULT_BASE_URL = DEFAULT_ROOT_URL + DEFAULT_SERVICE_PATH;

  /**
   * Constructor.
   *
   * <p>
   * Use {@link Builder} if you need to specify any of the optional parameters.
   * </p>
   *
   * @param transport HTTP transport, which should normally be:
   *        <ul>
   *        <li>Google App Engine:
   *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
   *        <li>Android: {@code newCompatibleTransport} from
   *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
   *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
   *        </li>
   *        </ul>
   * @param jsonFactory JSON factory, which may be:
   *        <ul>
   *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
   *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
   *        <li>Android Honeycomb or higher:
   *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
   *        </ul>
   * @param httpRequestInitializer HTTP request initializer or {@code null} for none
   * @since 1.7
   */
  public News(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
      com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
    this(new Builder(transport, jsonFactory, httpRequestInitializer));
  }

  /**
   * @param builder builder
   */
  News(Builder builder) {
    super(builder);
  }

  @Override
  protected void initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest<?> httpClientRequest) throws java.io.IOException {
    super.initialize(httpClientRequest);
  }

  /**
   * Create a request for the method "getHistory".
   *
   * This request holds the parameters needed by the news server.  After setting any optional
   * parameters, call the {@link GetHistory#execute()} method to invoke the remote operation.
   *
   * @param yyymmdd
   * @return the request
   */
  public GetHistory getHistory(java.lang.String yyymmdd) throws java.io.IOException {
    GetHistory result = new GetHistory(yyymmdd);
    initialize(result);
    return result;
  }

  public class GetHistory extends NewsRequest<com.example.andy.myapplication.backend.news.model.NewDTO> {

    private static final String REST_PATH = "history";

    /**
     * Create a request for the method "getHistory".
     *
     * This request holds the parameters needed by the the news server.  After setting any optional
     * parameters, call the {@link GetHistory#execute()} method to invoke the remote operation. <p>
     * {@link
     * GetHistory#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
     * must be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @param yyymmdd
     * @since 1.13
     */
    protected GetHistory(java.lang.String yyymmdd) {
      super(News.this, "GET", REST_PATH, null, com.example.andy.myapplication.backend.news.model.NewDTO.class);
      this.yyymmdd = com.google.api.client.util.Preconditions.checkNotNull(yyymmdd, "Required parameter yyymmdd must be specified.");
    }

    @Override
    public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
      return super.executeUsingHead();
    }

    @Override
    public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
      return super.buildHttpRequestUsingHead();
    }

    @Override
    public GetHistory setAlt(java.lang.String alt) {
      return (GetHistory) super.setAlt(alt);
    }

    @Override
    public GetHistory setFields(java.lang.String fields) {
      return (GetHistory) super.setFields(fields);
    }

    @Override
    public GetHistory setKey(java.lang.String key) {
      return (GetHistory) super.setKey(key);
    }

    @Override
    public GetHistory setOauthToken(java.lang.String oauthToken) {
      return (GetHistory) super.setOauthToken(oauthToken);
    }

    @Override
    public GetHistory setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (GetHistory) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public GetHistory setQuotaUser(java.lang.String quotaUser) {
      return (GetHistory) super.setQuotaUser(quotaUser);
    }

    @Override
    public GetHistory setUserIp(java.lang.String userIp) {
      return (GetHistory) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.String yyymmdd;

    /**

     */
    public java.lang.String getYyymmdd() {
      return yyymmdd;
    }

    public GetHistory setYyymmdd(java.lang.String yyymmdd) {
      this.yyymmdd = yyymmdd;
      return this;
    }

    @Override
    public GetHistory set(String parameterName, Object value) {
      return (GetHistory) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "getNewsByDate".
   *
   * This request holds the parameters needed by the news server.  After setting any optional
   * parameters, call the {@link GetNewsByDate#execute()} method to invoke the remote operation.
   *
   * @param level
   * @param yyymmdd
   * @return the request
   */
  public GetNewsByDate getNewsByDate(java.lang.Integer level, java.lang.String yyymmdd) throws java.io.IOException {
    GetNewsByDate result = new GetNewsByDate(level, yyymmdd);
    initialize(result);
    return result;
  }

  public class GetNewsByDate extends NewsRequest<com.example.andy.myapplication.backend.news.model.NewDTO> {

    private static final String REST_PATH = "getNewsByDate";

    /**
     * Create a request for the method "getNewsByDate".
     *
     * This request holds the parameters needed by the the news server.  After setting any optional
     * parameters, call the {@link GetNewsByDate#execute()} method to invoke the remote operation. <p>
     * {@link GetNewsByDate#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientR
     * equest)} must be called to initialize this instance immediately after invoking the constructor.
     * </p>
     *
     * @param level
     * @param yyymmdd
     * @since 1.13
     */
    protected GetNewsByDate(java.lang.Integer level, java.lang.String yyymmdd) {
      super(News.this, "GET", REST_PATH, null, com.example.andy.myapplication.backend.news.model.NewDTO.class);
      this.level = com.google.api.client.util.Preconditions.checkNotNull(level, "Required parameter level must be specified.");
      this.yyymmdd = com.google.api.client.util.Preconditions.checkNotNull(yyymmdd, "Required parameter yyymmdd must be specified.");
    }

    @Override
    public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
      return super.executeUsingHead();
    }

    @Override
    public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
      return super.buildHttpRequestUsingHead();
    }

    @Override
    public GetNewsByDate setAlt(java.lang.String alt) {
      return (GetNewsByDate) super.setAlt(alt);
    }

    @Override
    public GetNewsByDate setFields(java.lang.String fields) {
      return (GetNewsByDate) super.setFields(fields);
    }

    @Override
    public GetNewsByDate setKey(java.lang.String key) {
      return (GetNewsByDate) super.setKey(key);
    }

    @Override
    public GetNewsByDate setOauthToken(java.lang.String oauthToken) {
      return (GetNewsByDate) super.setOauthToken(oauthToken);
    }

    @Override
    public GetNewsByDate setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (GetNewsByDate) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public GetNewsByDate setQuotaUser(java.lang.String quotaUser) {
      return (GetNewsByDate) super.setQuotaUser(quotaUser);
    }

    @Override
    public GetNewsByDate setUserIp(java.lang.String userIp) {
      return (GetNewsByDate) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.Integer level;

    /**

     */
    public java.lang.Integer getLevel() {
      return level;
    }

    public GetNewsByDate setLevel(java.lang.Integer level) {
      this.level = level;
      return this;
    }

    @com.google.api.client.util.Key
    private java.lang.String yyymmdd;

    /**

     */
    public java.lang.String getYyymmdd() {
      return yyymmdd;
    }

    public GetNewsByDate setYyymmdd(java.lang.String yyymmdd) {
      this.yyymmdd = yyymmdd;
      return this;
    }

    @Override
    public GetNewsByDate set(String parameterName, Object value) {
      return (GetNewsByDate) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "save".
   *
   * This request holds the parameters needed by the news server.  After setting any optional
   * parameters, call the {@link Save#execute()} method to invoke the remote operation.
   *
   * @param content the {@link com.example.andy.myapplication.backend.news.model.NewsRecord}
   * @return the request
   */
  public Save save(com.example.andy.myapplication.backend.news.model.NewsRecord content) throws java.io.IOException {
    Save result = new Save(content);
    initialize(result);
    return result;
  }

  public class Save extends NewsRequest<Void> {

    private static final String REST_PATH = "save";

    /**
     * Create a request for the method "save".
     *
     * This request holds the parameters needed by the the news server.  After setting any optional
     * parameters, call the {@link Save#execute()} method to invoke the remote operation. <p> {@link
     * Save#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must be
     * called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @param content the {@link com.example.andy.myapplication.backend.news.model.NewsRecord}
     * @since 1.13
     */
    protected Save(com.example.andy.myapplication.backend.news.model.NewsRecord content) {
      super(News.this, "POST", REST_PATH, content, Void.class);
    }

    @Override
    public Save setAlt(java.lang.String alt) {
      return (Save) super.setAlt(alt);
    }

    @Override
    public Save setFields(java.lang.String fields) {
      return (Save) super.setFields(fields);
    }

    @Override
    public Save setKey(java.lang.String key) {
      return (Save) super.setKey(key);
    }

    @Override
    public Save setOauthToken(java.lang.String oauthToken) {
      return (Save) super.setOauthToken(oauthToken);
    }

    @Override
    public Save setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (Save) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public Save setQuotaUser(java.lang.String quotaUser) {
      return (Save) super.setQuotaUser(quotaUser);
    }

    @Override
    public Save setUserIp(java.lang.String userIp) {
      return (Save) super.setUserIp(userIp);
    }

    @Override
    public Save set(String parameterName, Object value) {
      return (Save) super.set(parameterName, value);
    }
  }

  /**
   * Builder for {@link News}.
   *
   * <p>
   * Implementation is not thread-safe.
   * </p>
   *
   * @since 1.3.0
   */
  public static final class Builder extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient.Builder {

    /**
     * Returns an instance of a new builder.
     *
     * @param transport HTTP transport, which should normally be:
     *        <ul>
     *        <li>Google App Engine:
     *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
     *        <li>Android: {@code newCompatibleTransport} from
     *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
     *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
     *        </li>
     *        </ul>
     * @param jsonFactory JSON factory, which may be:
     *        <ul>
     *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
     *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
     *        <li>Android Honeycomb or higher:
     *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
     *        </ul>
     * @param httpRequestInitializer HTTP request initializer or {@code null} for none
     * @since 1.7
     */
    public Builder(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
        com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      super(
          transport,
          jsonFactory,
          DEFAULT_ROOT_URL,
          DEFAULT_SERVICE_PATH,
          httpRequestInitializer,
          false);
    }

    /** Builds a new instance of {@link News}. */
    @Override
    public News build() {
      return new News(this);
    }

    @Override
    public Builder setRootUrl(String rootUrl) {
      return (Builder) super.setRootUrl(rootUrl);
    }

    @Override
    public Builder setServicePath(String servicePath) {
      return (Builder) super.setServicePath(servicePath);
    }

    @Override
    public Builder setHttpRequestInitializer(com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      return (Builder) super.setHttpRequestInitializer(httpRequestInitializer);
    }

    @Override
    public Builder setApplicationName(String applicationName) {
      return (Builder) super.setApplicationName(applicationName);
    }

    @Override
    public Builder setSuppressPatternChecks(boolean suppressPatternChecks) {
      return (Builder) super.setSuppressPatternChecks(suppressPatternChecks);
    }

    @Override
    public Builder setSuppressRequiredParameterChecks(boolean suppressRequiredParameterChecks) {
      return (Builder) super.setSuppressRequiredParameterChecks(suppressRequiredParameterChecks);
    }

    @Override
    public Builder setSuppressAllChecks(boolean suppressAllChecks) {
      return (Builder) super.setSuppressAllChecks(suppressAllChecks);
    }

    /**
     * Set the {@link NewsRequestInitializer}.
     *
     * @since 1.12
     */
    public Builder setNewsRequestInitializer(
        NewsRequestInitializer newsRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(newsRequestInitializer);
    }

    @Override
    public Builder setGoogleClientRequestInitializer(
        com.google.api.client.googleapis.services.GoogleClientRequestInitializer googleClientRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(googleClientRequestInitializer);
    }
  }
}
