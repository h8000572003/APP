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
 * on 2015-12-10 at 16:34:43 UTC 
 * Modify at your own risk.
 */

package com.example.andy.myapplication.backend.news.model;

/**
 * Model definition for NewsRecord.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the news. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class NewsRecord extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String content;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String delete;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long id;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer leavel;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String title;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String writeId;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String yyyymmdd;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getContent() {
    return content;
  }

  /**
   * @param content content or {@code null} for none
   */
  public NewsRecord setContent(java.lang.String content) {
    this.content = content;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getDelete() {
    return delete;
  }

  /**
   * @param delete delete or {@code null} for none
   */
  public NewsRecord setDelete(java.lang.String delete) {
    this.delete = delete;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Long getId() {
    return id;
  }

  /**
   * @param id id or {@code null} for none
   */
  public NewsRecord setId(java.lang.Long id) {
    this.id = id;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Integer getLeavel() {
    return leavel;
  }

  /**
   * @param leavel leavel or {@code null} for none
   */
  public NewsRecord setLeavel(java.lang.Integer leavel) {
    this.leavel = leavel;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * @param name name or {@code null} for none
   */
  public NewsRecord setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getTitle() {
    return title;
  }

  /**
   * @param title title or {@code null} for none
   */
  public NewsRecord setTitle(java.lang.String title) {
    this.title = title;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getWriteId() {
    return writeId;
  }

  /**
   * @param writeId writeId or {@code null} for none
   */
  public NewsRecord setWriteId(java.lang.String writeId) {
    this.writeId = writeId;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getYyyymmdd() {
    return yyyymmdd;
  }

  /**
   * @param yyyymmdd yyyymmdd or {@code null} for none
   */
  public NewsRecord setYyyymmdd(java.lang.String yyyymmdd) {
    this.yyyymmdd = yyyymmdd;
    return this;
  }

  @Override
  public NewsRecord set(String fieldName, Object value) {
    return (NewsRecord) super.set(fieldName, value);
  }

  @Override
  public NewsRecord clone() {
    return (NewsRecord) super.clone();
  }

}
