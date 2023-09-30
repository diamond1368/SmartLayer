// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ai/generativelanguage/v1beta3/citation.proto

package com.google.ai.generativelanguage.v1beta3;

public interface CitationMetadataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ai.generativelanguage.v1beta3.CitationMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Citations to sources for a specific response.
   * </pre>
   *
   * <code>repeated .google.ai.generativelanguage.v1beta3.CitationSource citation_sources = 1;</code>
   */
  java.util.List<com.google.ai.generativelanguage.v1beta3.CitationSource> 
      getCitationSourcesList();
  /**
   * <pre>
   * Citations to sources for a specific response.
   * </pre>
   *
   * <code>repeated .google.ai.generativelanguage.v1beta3.CitationSource citation_sources = 1;</code>
   */
  com.google.ai.generativelanguage.v1beta3.CitationSource getCitationSources(int index);
  /**
   * <pre>
   * Citations to sources for a specific response.
   * </pre>
   *
   * <code>repeated .google.ai.generativelanguage.v1beta3.CitationSource citation_sources = 1;</code>
   */
  int getCitationSourcesCount();
  /**
   * <pre>
   * Citations to sources for a specific response.
   * </pre>
   *
   * <code>repeated .google.ai.generativelanguage.v1beta3.CitationSource citation_sources = 1;</code>
   */
  java.util.List<? extends com.google.ai.generativelanguage.v1beta3.CitationSourceOrBuilder> 
      getCitationSourcesOrBuilderList();
  /**
   * <pre>
   * Citations to sources for a specific response.
   * </pre>
   *
   * <code>repeated .google.ai.generativelanguage.v1beta3.CitationSource citation_sources = 1;</code>
   */
  com.google.ai.generativelanguage.v1beta3.CitationSourceOrBuilder getCitationSourcesOrBuilder(
      int index);
}
