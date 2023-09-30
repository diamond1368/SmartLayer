// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ai/generativelanguage/v1beta3/tuned_model.proto

package com.google.ai.generativelanguage.v1beta3;

public interface TuningExamplesOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ai.generativelanguage.v1beta3.TuningExamples)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The examples. Example input can be for text or discuss, but all
   * examples in a set must be of the same type.
   * </pre>
   *
   * <code>repeated .google.ai.generativelanguage.v1beta3.TuningExample examples = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  java.util.List<com.google.ai.generativelanguage.v1beta3.TuningExample> 
      getExamplesList();
  /**
   * <pre>
   * Required. The examples. Example input can be for text or discuss, but all
   * examples in a set must be of the same type.
   * </pre>
   *
   * <code>repeated .google.ai.generativelanguage.v1beta3.TuningExample examples = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.ai.generativelanguage.v1beta3.TuningExample getExamples(int index);
  /**
   * <pre>
   * Required. The examples. Example input can be for text or discuss, but all
   * examples in a set must be of the same type.
   * </pre>
   *
   * <code>repeated .google.ai.generativelanguage.v1beta3.TuningExample examples = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  int getExamplesCount();
  /**
   * <pre>
   * Required. The examples. Example input can be for text or discuss, but all
   * examples in a set must be of the same type.
   * </pre>
   *
   * <code>repeated .google.ai.generativelanguage.v1beta3.TuningExample examples = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  java.util.List<? extends com.google.ai.generativelanguage.v1beta3.TuningExampleOrBuilder> 
      getExamplesOrBuilderList();
  /**
   * <pre>
   * Required. The examples. Example input can be for text or discuss, but all
   * examples in a set must be of the same type.
   * </pre>
   *
   * <code>repeated .google.ai.generativelanguage.v1beta3.TuningExample examples = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.ai.generativelanguage.v1beta3.TuningExampleOrBuilder getExamplesOrBuilder(
      int index);
}
