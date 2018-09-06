// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/videointelligence/v1beta1/video_intelligence.proto

package com.google.cloud.videointelligence.v1beta1;

public final class VideoIntelligenceServiceProto {
  private VideoIntelligenceServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_videointelligence_v1beta1_AnnotateVideoRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_videointelligence_v1beta1_AnnotateVideoRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_videointelligence_v1beta1_VideoContext_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_videointelligence_v1beta1_VideoContext_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_videointelligence_v1beta1_VideoSegment_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_videointelligence_v1beta1_VideoSegment_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_videointelligence_v1beta1_LabelLocation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_videointelligence_v1beta1_LabelLocation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_videointelligence_v1beta1_LabelAnnotation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_videointelligence_v1beta1_LabelAnnotation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_videointelligence_v1beta1_SafeSearchAnnotation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_videointelligence_v1beta1_SafeSearchAnnotation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_videointelligence_v1beta1_BoundingBox_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_videointelligence_v1beta1_BoundingBox_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_videointelligence_v1beta1_FaceLocation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_videointelligence_v1beta1_FaceLocation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_videointelligence_v1beta1_FaceAnnotation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_videointelligence_v1beta1_FaceAnnotation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_videointelligence_v1beta1_VideoAnnotationResults_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_videointelligence_v1beta1_VideoAnnotationResults_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_videointelligence_v1beta1_AnnotateVideoResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_videointelligence_v1beta1_AnnotateVideoResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_videointelligence_v1beta1_VideoAnnotationProgress_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_videointelligence_v1beta1_VideoAnnotationProgress_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_videointelligence_v1beta1_AnnotateVideoProgress_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_videointelligence_v1beta1_AnnotateVideoProgress_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n?google/cloud/videointelligence/v1beta1" +
      "/video_intelligence.proto\022&google.cloud." +
      "videointelligence.v1beta1\032\034google/api/an" +
      "notations.proto\032#google/longrunning/oper" +
      "ations.proto\032\037google/protobuf/timestamp." +
      "proto\032\027google/rpc/status.proto\"\371\001\n\024Annot" +
      "ateVideoRequest\022\021\n\tinput_uri\030\001 \001(\t\022\025\n\rin" +
      "put_content\030\006 \001(\t\022A\n\010features\030\002 \003(\0162/.go" +
      "ogle.cloud.videointelligence.v1beta1.Fea" +
      "ture\022K\n\rvideo_context\030\003 \001(\01324.google.clo",
      "ud.videointelligence.v1beta1.VideoContex" +
      "t\022\022\n\noutput_uri\030\004 \001(\t\022\023\n\013location_id\030\005 \001" +
      "(\t\"\322\002\n\014VideoContext\022F\n\010segments\030\001 \003(\01324." +
      "google.cloud.videointelligence.v1beta1.V" +
      "ideoSegment\022X\n\024label_detection_mode\030\002 \001(" +
      "\0162:.google.cloud.videointelligence.v1bet" +
      "a1.LabelDetectionMode\022\031\n\021stationary_came" +
      "ra\030\003 \001(\010\022\035\n\025label_detection_model\030\004 \001(\t\022" +
      "\034\n\024face_detection_model\030\005 \001(\t\022#\n\033shot_ch" +
      "ange_detection_model\030\006 \001(\t\022#\n\033safe_searc",
      "h_detection_model\030\007 \001(\t\"B\n\014VideoSegment\022" +
      "\031\n\021start_time_offset\030\001 \001(\003\022\027\n\017end_time_o" +
      "ffset\030\002 \001(\003\"\255\001\n\rLabelLocation\022E\n\007segment" +
      "\030\001 \001(\01324.google.cloud.videointelligence." +
      "v1beta1.VideoSegment\022\022\n\nconfidence\030\002 \001(\002" +
      "\022A\n\005level\030\003 \001(\01622.google.cloud.videointe" +
      "lligence.v1beta1.LabelLevel\"\207\001\n\017LabelAnn" +
      "otation\022\023\n\013description\030\001 \001(\t\022\025\n\rlanguage" +
      "_code\030\002 \001(\t\022H\n\tlocations\030\003 \003(\01325.google." +
      "cloud.videointelligence.v1beta1.LabelLoc",
      "ation\"\375\002\n\024SafeSearchAnnotation\022A\n\005adult\030" +
      "\001 \001(\01622.google.cloud.videointelligence.v" +
      "1beta1.Likelihood\022A\n\005spoof\030\002 \001(\01622.googl" +
      "e.cloud.videointelligence.v1beta1.Likeli" +
      "hood\022C\n\007medical\030\003 \001(\01622.google.cloud.vid" +
      "eointelligence.v1beta1.Likelihood\022C\n\007vio" +
      "lent\030\004 \001(\01622.google.cloud.videointellige" +
      "nce.v1beta1.Likelihood\022@\n\004racy\030\005 \001(\01622.g" +
      "oogle.cloud.videointelligence.v1beta1.Li" +
      "kelihood\022\023\n\013time_offset\030\006 \001(\003\"G\n\013Boundin",
      "gBox\022\014\n\004left\030\001 \001(\005\022\r\n\005right\030\002 \001(\005\022\016\n\006bot" +
      "tom\030\003 \001(\005\022\013\n\003top\030\004 \001(\005\"n\n\014FaceLocation\022I" +
      "\n\014bounding_box\030\001 \001(\01323.google.cloud.vide" +
      "ointelligence.v1beta1.BoundingBox\022\023\n\013tim" +
      "e_offset\030\002 \001(\003\"\264\001\n\016FaceAnnotation\022\021\n\tthu" +
      "mbnail\030\001 \001(\t\022F\n\010segments\030\002 \003(\01324.google." +
      "cloud.videointelligence.v1beta1.VideoSeg" +
      "ment\022G\n\tlocations\030\003 \003(\01324.google.cloud.v" +
      "ideointelligence.v1beta1.FaceLocation\"\243\003" +
      "\n\026VideoAnnotationResults\022\021\n\tinput_uri\030\001 ",
      "\001(\t\022R\n\021label_annotations\030\002 \003(\01327.google." +
      "cloud.videointelligence.v1beta1.LabelAnn" +
      "otation\022P\n\020face_annotations\030\003 \003(\01326.goog" +
      "le.cloud.videointelligence.v1beta1.FaceA" +
      "nnotation\022N\n\020shot_annotations\030\004 \003(\01324.go" +
      "ogle.cloud.videointelligence.v1beta1.Vid" +
      "eoSegment\022]\n\027safe_search_annotations\030\006 \003" +
      "(\0132<.google.cloud.videointelligence.v1be" +
      "ta1.SafeSearchAnnotation\022!\n\005error\030\005 \001(\0132" +
      "\022.google.rpc.Status\"s\n\025AnnotateVideoResp",
      "onse\022Z\n\022annotation_results\030\001 \003(\0132>.googl" +
      "e.cloud.videointelligence.v1beta1.VideoA" +
      "nnotationResults\"\247\001\n\027VideoAnnotationProg" +
      "ress\022\021\n\tinput_uri\030\001 \001(\t\022\030\n\020progress_perc" +
      "ent\030\002 \001(\005\022.\n\nstart_time\030\003 \001(\0132\032.google.p" +
      "rotobuf.Timestamp\022/\n\013update_time\030\004 \001(\0132\032" +
      ".google.protobuf.Timestamp\"u\n\025AnnotateVi" +
      "deoProgress\022\\\n\023annotation_progress\030\001 \003(\013" +
      "2?.google.cloud.videointelligence.v1beta" +
      "1.VideoAnnotationProgress*\201\001\n\007Feature\022\027\n",
      "\023FEATURE_UNSPECIFIED\020\000\022\023\n\017LABEL_DETECTIO" +
      "N\020\001\022\022\n\016FACE_DETECTION\020\002\022\031\n\025SHOT_CHANGE_D" +
      "ETECTION\020\003\022\031\n\025SAFE_SEARCH_DETECTION\020\004*n\n" +
      "\nLabelLevel\022\033\n\027LABEL_LEVEL_UNSPECIFIED\020\000" +
      "\022\017\n\013VIDEO_LEVEL\020\001\022\021\n\rSEGMENT_LEVEL\020\002\022\016\n\n" +
      "SHOT_LEVEL\020\003\022\017\n\013FRAME_LEVEL\020\004*r\n\022LabelDe" +
      "tectionMode\022$\n LABEL_DETECTION_MODE_UNSP" +
      "ECIFIED\020\000\022\r\n\tSHOT_MODE\020\001\022\016\n\nFRAME_MODE\020\002" +
      "\022\027\n\023SHOT_AND_FRAME_MODE\020\003*e\n\nLikelihood\022" +
      "\013\n\007UNKNOWN\020\000\022\021\n\rVERY_UNLIKELY\020\001\022\014\n\010UNLIK",
      "ELY\020\002\022\014\n\010POSSIBLE\020\003\022\n\n\006LIKELY\020\004\022\017\n\013VERY_" +
      "LIKELY\020\0052\256\001\n\030VideoIntelligenceService\022\221\001" +
      "\n\rAnnotateVideo\022<.google.cloud.videointe" +
      "lligence.v1beta1.AnnotateVideoRequest\032\035." +
      "google.longrunning.Operation\"#\202\323\344\223\002\035\"\030/v" +
      "1beta1/videos:annotate:\001*B\370\001\n*com.google" +
      ".cloud.videointelligence.v1beta1B\035VideoI" +
      "ntelligenceServiceProtoP\001ZWgoogle.golang" +
      ".org/genproto/googleapis/cloud/videointe" +
      "lligence/v1beta1;videointelligence\252\002&Goo",
      "gle.Cloud.VideoIntelligence.V1Beta1\312\002&Go" +
      "ogle\\Cloud\\VideoIntelligence\\V1beta1b\006pr" +
      "oto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.longrunning.OperationsProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
        }, assigner);
    internal_static_google_cloud_videointelligence_v1beta1_AnnotateVideoRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_videointelligence_v1beta1_AnnotateVideoRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_videointelligence_v1beta1_AnnotateVideoRequest_descriptor,
        new java.lang.String[] { "InputUri", "InputContent", "Features", "VideoContext", "OutputUri", "LocationId", });
    internal_static_google_cloud_videointelligence_v1beta1_VideoContext_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_videointelligence_v1beta1_VideoContext_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_videointelligence_v1beta1_VideoContext_descriptor,
        new java.lang.String[] { "Segments", "LabelDetectionMode", "StationaryCamera", "LabelDetectionModel", "FaceDetectionModel", "ShotChangeDetectionModel", "SafeSearchDetectionModel", });
    internal_static_google_cloud_videointelligence_v1beta1_VideoSegment_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_videointelligence_v1beta1_VideoSegment_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_videointelligence_v1beta1_VideoSegment_descriptor,
        new java.lang.String[] { "StartTimeOffset", "EndTimeOffset", });
    internal_static_google_cloud_videointelligence_v1beta1_LabelLocation_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_videointelligence_v1beta1_LabelLocation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_videointelligence_v1beta1_LabelLocation_descriptor,
        new java.lang.String[] { "Segment", "Confidence", "Level", });
    internal_static_google_cloud_videointelligence_v1beta1_LabelAnnotation_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_videointelligence_v1beta1_LabelAnnotation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_videointelligence_v1beta1_LabelAnnotation_descriptor,
        new java.lang.String[] { "Description", "LanguageCode", "Locations", });
    internal_static_google_cloud_videointelligence_v1beta1_SafeSearchAnnotation_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_videointelligence_v1beta1_SafeSearchAnnotation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_videointelligence_v1beta1_SafeSearchAnnotation_descriptor,
        new java.lang.String[] { "Adult", "Spoof", "Medical", "Violent", "Racy", "TimeOffset", });
    internal_static_google_cloud_videointelligence_v1beta1_BoundingBox_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_videointelligence_v1beta1_BoundingBox_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_videointelligence_v1beta1_BoundingBox_descriptor,
        new java.lang.String[] { "Left", "Right", "Bottom", "Top", });
    internal_static_google_cloud_videointelligence_v1beta1_FaceLocation_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_videointelligence_v1beta1_FaceLocation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_videointelligence_v1beta1_FaceLocation_descriptor,
        new java.lang.String[] { "BoundingBox", "TimeOffset", });
    internal_static_google_cloud_videointelligence_v1beta1_FaceAnnotation_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_videointelligence_v1beta1_FaceAnnotation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_videointelligence_v1beta1_FaceAnnotation_descriptor,
        new java.lang.String[] { "Thumbnail", "Segments", "Locations", });
    internal_static_google_cloud_videointelligence_v1beta1_VideoAnnotationResults_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_videointelligence_v1beta1_VideoAnnotationResults_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_videointelligence_v1beta1_VideoAnnotationResults_descriptor,
        new java.lang.String[] { "InputUri", "LabelAnnotations", "FaceAnnotations", "ShotAnnotations", "SafeSearchAnnotations", "Error", });
    internal_static_google_cloud_videointelligence_v1beta1_AnnotateVideoResponse_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_google_cloud_videointelligence_v1beta1_AnnotateVideoResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_videointelligence_v1beta1_AnnotateVideoResponse_descriptor,
        new java.lang.String[] { "AnnotationResults", });
    internal_static_google_cloud_videointelligence_v1beta1_VideoAnnotationProgress_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_google_cloud_videointelligence_v1beta1_VideoAnnotationProgress_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_videointelligence_v1beta1_VideoAnnotationProgress_descriptor,
        new java.lang.String[] { "InputUri", "ProgressPercent", "StartTime", "UpdateTime", });
    internal_static_google_cloud_videointelligence_v1beta1_AnnotateVideoProgress_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_google_cloud_videointelligence_v1beta1_AnnotateVideoProgress_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_videointelligence_v1beta1_AnnotateVideoProgress_descriptor,
        new java.lang.String[] { "AnnotationProgress", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}