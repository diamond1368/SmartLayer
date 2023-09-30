// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ai/generativelanguage/v1beta3/text_service.proto

package com.google.ai.generativelanguage.v1beta3;

public interface BatchEmbedTextResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ai.generativelanguage.v1beta3.BatchEmbedTextResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. The embeddings generated from the input text.
   * </pre>
   *
   * <code>repeated .google.ai.generativelanguage.v1beta3.Embedding embeddings = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  java.util.List<com.google.ai.generativelanguage.v1beta3.Embedding> 
      getEmbeddingsList();
  /**
   * <pre>
   * Output only. The embeddings generated from the input text.
   * </pre>
   *
   * <code>repeated .google.ai.generativelanguage.v1beta3.Embedding embeddings = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.ai.generativelanguage.v1beta3.Embedding getEmbeddings(int index);
  /**
   * <pre>
   * Output only. The embeddings generated from the input text.
   * </pre>
   *
   * <code>repeated .google.ai.generativelanguage.v1beta3.Embedding embeddings = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  int getEmbeddingsCount();
  /**
   * <pre>
   * Output only. The embeddings generated from the input text.
   * </pre>
   *
   * <code>repeated .google.ai.generativelanguage.v1beta3.Embedding embeddings = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  java.util.List<? extends com.google.ai.generativelanguage.v1beta3.EmbeddingOrBuilder> 
      getEmbeddingsOrBuilderList();
  /**
   * <pre>
   * Output only. The embeddings generated from the input text.
   * </pre>
   *
   * <code>repeated .google.ai.generativelanguage.v1beta3.Embedding embeddings = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.ai.generativelanguage.v1beta3.EmbeddingOrBuilder getEmbeddingsOrBuilder(
      int index);
}
