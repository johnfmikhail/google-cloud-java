// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/privacy/dlp/v2beta1/dlp.proto

package com.google.privacy.dlp.v2beta1;

public interface TransformationSummaryOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.privacy.dlp.v2beta1.TransformationSummary)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Set if the transformation was limited to a specific info_type.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2beta1.InfoType info_type = 1;</code>
   */
  boolean hasInfoType();
  /**
   * <pre>
   * Set if the transformation was limited to a specific info_type.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2beta1.InfoType info_type = 1;</code>
   */
  com.google.privacy.dlp.v2beta1.InfoType getInfoType();
  /**
   * <pre>
   * Set if the transformation was limited to a specific info_type.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2beta1.InfoType info_type = 1;</code>
   */
  com.google.privacy.dlp.v2beta1.InfoTypeOrBuilder getInfoTypeOrBuilder();

  /**
   * <pre>
   * Set if the transformation was limited to a specific FieldId.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2beta1.FieldId field = 2;</code>
   */
  boolean hasField();
  /**
   * <pre>
   * Set if the transformation was limited to a specific FieldId.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2beta1.FieldId field = 2;</code>
   */
  com.google.privacy.dlp.v2beta1.FieldId getField();
  /**
   * <pre>
   * Set if the transformation was limited to a specific FieldId.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2beta1.FieldId field = 2;</code>
   */
  com.google.privacy.dlp.v2beta1.FieldIdOrBuilder getFieldOrBuilder();

  /**
   * <pre>
   * The specific transformation these stats apply to.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2beta1.PrimitiveTransformation transformation = 3;</code>
   */
  boolean hasTransformation();
  /**
   * <pre>
   * The specific transformation these stats apply to.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2beta1.PrimitiveTransformation transformation = 3;</code>
   */
  com.google.privacy.dlp.v2beta1.PrimitiveTransformation getTransformation();
  /**
   * <pre>
   * The specific transformation these stats apply to.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2beta1.PrimitiveTransformation transformation = 3;</code>
   */
  com.google.privacy.dlp.v2beta1.PrimitiveTransformationOrBuilder getTransformationOrBuilder();

  /**
   * <pre>
   * The field transformation that was applied. This list will contain
   * multiple only in the case of errors.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2beta1.FieldTransformation field_transformations = 5;</code>
   */
  java.util.List<com.google.privacy.dlp.v2beta1.FieldTransformation> 
      getFieldTransformationsList();
  /**
   * <pre>
   * The field transformation that was applied. This list will contain
   * multiple only in the case of errors.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2beta1.FieldTransformation field_transformations = 5;</code>
   */
  com.google.privacy.dlp.v2beta1.FieldTransformation getFieldTransformations(int index);
  /**
   * <pre>
   * The field transformation that was applied. This list will contain
   * multiple only in the case of errors.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2beta1.FieldTransformation field_transformations = 5;</code>
   */
  int getFieldTransformationsCount();
  /**
   * <pre>
   * The field transformation that was applied. This list will contain
   * multiple only in the case of errors.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2beta1.FieldTransformation field_transformations = 5;</code>
   */
  java.util.List<? extends com.google.privacy.dlp.v2beta1.FieldTransformationOrBuilder> 
      getFieldTransformationsOrBuilderList();
  /**
   * <pre>
   * The field transformation that was applied. This list will contain
   * multiple only in the case of errors.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2beta1.FieldTransformation field_transformations = 5;</code>
   */
  com.google.privacy.dlp.v2beta1.FieldTransformationOrBuilder getFieldTransformationsOrBuilder(
      int index);

  /**
   * <pre>
   * The specific suppression option these stats apply to.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2beta1.RecordSuppression record_suppress = 6;</code>
   */
  boolean hasRecordSuppress();
  /**
   * <pre>
   * The specific suppression option these stats apply to.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2beta1.RecordSuppression record_suppress = 6;</code>
   */
  com.google.privacy.dlp.v2beta1.RecordSuppression getRecordSuppress();
  /**
   * <pre>
   * The specific suppression option these stats apply to.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2beta1.RecordSuppression record_suppress = 6;</code>
   */
  com.google.privacy.dlp.v2beta1.RecordSuppressionOrBuilder getRecordSuppressOrBuilder();

  /**
   * <code>repeated .google.privacy.dlp.v2beta1.TransformationSummary.SummaryResult results = 4;</code>
   */
  java.util.List<com.google.privacy.dlp.v2beta1.TransformationSummary.SummaryResult> 
      getResultsList();
  /**
   * <code>repeated .google.privacy.dlp.v2beta1.TransformationSummary.SummaryResult results = 4;</code>
   */
  com.google.privacy.dlp.v2beta1.TransformationSummary.SummaryResult getResults(int index);
  /**
   * <code>repeated .google.privacy.dlp.v2beta1.TransformationSummary.SummaryResult results = 4;</code>
   */
  int getResultsCount();
  /**
   * <code>repeated .google.privacy.dlp.v2beta1.TransformationSummary.SummaryResult results = 4;</code>
   */
  java.util.List<? extends com.google.privacy.dlp.v2beta1.TransformationSummary.SummaryResultOrBuilder> 
      getResultsOrBuilderList();
  /**
   * <code>repeated .google.privacy.dlp.v2beta1.TransformationSummary.SummaryResult results = 4;</code>
   */
  com.google.privacy.dlp.v2beta1.TransformationSummary.SummaryResultOrBuilder getResultsOrBuilder(
      int index);
}