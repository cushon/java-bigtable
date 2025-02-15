/*
 * Copyright 2023 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/bigtable/admin/v2/table.proto

package com.google.bigtable.admin.v2;

public interface BackupOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.bigtable.admin.v2.Backup)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * A globally unique identifier for the backup which cannot be
   * changed. Values are of the form
   * `projects/{project}/instances/{instance}/clusters/{cluster}/
   *    backups/[_a-zA-Z0-9][-_.a-zA-Z0-9]*`
   * The final segment of the name must be between 1 and 50 characters
   * in length.
   *
   * The backup is stored in the cluster identified by the prefix of the backup
   * name of the form
   * `projects/{project}/instances/{instance}/clusters/{cluster}`.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * A globally unique identifier for the backup which cannot be
   * changed. Values are of the form
   * `projects/{project}/instances/{instance}/clusters/{cluster}/
   *    backups/[_a-zA-Z0-9][-_.a-zA-Z0-9]*`
   * The final segment of the name must be between 1 and 50 characters
   * in length.
   *
   * The backup is stored in the cluster identified by the prefix of the backup
   * name of the form
   * `projects/{project}/instances/{instance}/clusters/{cluster}`.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Required. Immutable. Name of the table from which this backup was created.
   * This needs to be in the same instance as the backup. Values are of the form
   * `projects/{project}/instances/{instance}/tables/{source_table}`.
   * </pre>
   *
   * <code>
   * string source_table = 2 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The sourceTable.
   */
  java.lang.String getSourceTable();
  /**
   *
   *
   * <pre>
   * Required. Immutable. Name of the table from which this backup was created.
   * This needs to be in the same instance as the backup. Values are of the form
   * `projects/{project}/instances/{instance}/tables/{source_table}`.
   * </pre>
   *
   * <code>
   * string source_table = 2 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The bytes for sourceTable.
   */
  com.google.protobuf.ByteString getSourceTableBytes();

  /**
   *
   *
   * <pre>
   * Output only. Name of the backup from which this backup was copied. If a
   * backup is not created by copying a backup, this field will be empty. Values
   * are of the form: projects/&lt;project&gt;/instances/&lt;instance&gt;/backups/&lt;backup&gt;.
   * </pre>
   *
   * <code>string source_backup = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The sourceBackup.
   */
  java.lang.String getSourceBackup();
  /**
   *
   *
   * <pre>
   * Output only. Name of the backup from which this backup was copied. If a
   * backup is not created by copying a backup, this field will be empty. Values
   * are of the form: projects/&lt;project&gt;/instances/&lt;instance&gt;/backups/&lt;backup&gt;.
   * </pre>
   *
   * <code>string source_backup = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for sourceBackup.
   */
  com.google.protobuf.ByteString getSourceBackupBytes();

  /**
   *
   *
   * <pre>
   * Required. The expiration time of the backup, with microseconds
   * granularity that must be at least 6 hours and at most 90 days
   * from the time the request is received. Once the `expire_time`
   * has passed, Cloud Bigtable will delete the backup and free the
   * resources used by the backup.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp expire_time = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the expireTime field is set.
   */
  boolean hasExpireTime();
  /**
   *
   *
   * <pre>
   * Required. The expiration time of the backup, with microseconds
   * granularity that must be at least 6 hours and at most 90 days
   * from the time the request is received. Once the `expire_time`
   * has passed, Cloud Bigtable will delete the backup and free the
   * resources used by the backup.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp expire_time = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The expireTime.
   */
  com.google.protobuf.Timestamp getExpireTime();
  /**
   *
   *
   * <pre>
   * Required. The expiration time of the backup, with microseconds
   * granularity that must be at least 6 hours and at most 90 days
   * from the time the request is received. Once the `expire_time`
   * has passed, Cloud Bigtable will delete the backup and free the
   * resources used by the backup.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp expire_time = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getExpireTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. `start_time` is the time that the backup was started
   * (i.e. approximately the time the
   * [CreateBackup][google.bigtable.admin.v2.BigtableTableAdmin.CreateBackup]
   * request is received).  The row data in this backup will be no older than
   * this timestamp.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the startTime field is set.
   */
  boolean hasStartTime();
  /**
   *
   *
   * <pre>
   * Output only. `start_time` is the time that the backup was started
   * (i.e. approximately the time the
   * [CreateBackup][google.bigtable.admin.v2.BigtableTableAdmin.CreateBackup]
   * request is received).  The row data in this backup will be no older than
   * this timestamp.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The startTime.
   */
  com.google.protobuf.Timestamp getStartTime();
  /**
   *
   *
   * <pre>
   * Output only. `start_time` is the time that the backup was started
   * (i.e. approximately the time the
   * [CreateBackup][google.bigtable.admin.v2.BigtableTableAdmin.CreateBackup]
   * request is received).  The row data in this backup will be no older than
   * this timestamp.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getStartTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. `end_time` is the time that the backup was finished. The row
   * data in the backup will be no newer than this timestamp.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the endTime field is set.
   */
  boolean hasEndTime();
  /**
   *
   *
   * <pre>
   * Output only. `end_time` is the time that the backup was finished. The row
   * data in the backup will be no newer than this timestamp.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The endTime.
   */
  com.google.protobuf.Timestamp getEndTime();
  /**
   *
   *
   * <pre>
   * Output only. `end_time` is the time that the backup was finished. The row
   * data in the backup will be no newer than this timestamp.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getEndTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Size of the backup in bytes.
   * </pre>
   *
   * <code>int64 size_bytes = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The sizeBytes.
   */
  long getSizeBytes();

  /**
   *
   *
   * <pre>
   * Output only. The current state of the backup.
   * </pre>
   *
   * <code>
   * .google.bigtable.admin.v2.Backup.State state = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   *
   *
   * <pre>
   * Output only. The current state of the backup.
   * </pre>
   *
   * <code>
   * .google.bigtable.admin.v2.Backup.State state = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The state.
   */
  com.google.bigtable.admin.v2.Backup.State getState();

  /**
   *
   *
   * <pre>
   * Output only. The encryption information for the backup.
   * </pre>
   *
   * <code>
   * .google.bigtable.admin.v2.EncryptionInfo encryption_info = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the encryptionInfo field is set.
   */
  boolean hasEncryptionInfo();
  /**
   *
   *
   * <pre>
   * Output only. The encryption information for the backup.
   * </pre>
   *
   * <code>
   * .google.bigtable.admin.v2.EncryptionInfo encryption_info = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The encryptionInfo.
   */
  com.google.bigtable.admin.v2.EncryptionInfo getEncryptionInfo();
  /**
   *
   *
   * <pre>
   * Output only. The encryption information for the backup.
   * </pre>
   *
   * <code>
   * .google.bigtable.admin.v2.EncryptionInfo encryption_info = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.bigtable.admin.v2.EncryptionInfoOrBuilder getEncryptionInfoOrBuilder();
}
