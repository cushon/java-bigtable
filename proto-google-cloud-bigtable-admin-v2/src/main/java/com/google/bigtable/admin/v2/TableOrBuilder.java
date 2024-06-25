/*
 * Copyright 2024 Google LLC
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

// Protobuf Java Version: 3.25.3
package com.google.bigtable.admin.v2;

public interface TableOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.bigtable.admin.v2.Table)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The unique name of the table. Values are of the form
   * `projects/{project}/instances/{instance}/tables/[_a-zA-Z0-9][-_.a-zA-Z0-9]*`.
   * Views: `NAME_ONLY`, `SCHEMA_VIEW`, `REPLICATION_VIEW`, `FULL`
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
   * The unique name of the table. Values are of the form
   * `projects/{project}/instances/{instance}/tables/[_a-zA-Z0-9][-_.a-zA-Z0-9]*`.
   * Views: `NAME_ONLY`, `SCHEMA_VIEW`, `REPLICATION_VIEW`, `FULL`
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
   * Output only. Map from cluster ID to per-cluster table state.
   * If it could not be determined whether or not the table has data in a
   * particular cluster (for example, if its zone is unavailable), then
   * there will be an entry for the cluster with UNKNOWN `replication_status`.
   * Views: `REPLICATION_VIEW`, `ENCRYPTION_VIEW`, `FULL`
   * </pre>
   *
   * <code>
   * map&lt;string, .google.bigtable.admin.v2.Table.ClusterState&gt; cluster_states = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  int getClusterStatesCount();
  /**
   *
   *
   * <pre>
   * Output only. Map from cluster ID to per-cluster table state.
   * If it could not be determined whether or not the table has data in a
   * particular cluster (for example, if its zone is unavailable), then
   * there will be an entry for the cluster with UNKNOWN `replication_status`.
   * Views: `REPLICATION_VIEW`, `ENCRYPTION_VIEW`, `FULL`
   * </pre>
   *
   * <code>
   * map&lt;string, .google.bigtable.admin.v2.Table.ClusterState&gt; cluster_states = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  boolean containsClusterStates(java.lang.String key);
  /** Use {@link #getClusterStatesMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, com.google.bigtable.admin.v2.Table.ClusterState>
      getClusterStates();
  /**
   *
   *
   * <pre>
   * Output only. Map from cluster ID to per-cluster table state.
   * If it could not be determined whether or not the table has data in a
   * particular cluster (for example, if its zone is unavailable), then
   * there will be an entry for the cluster with UNKNOWN `replication_status`.
   * Views: `REPLICATION_VIEW`, `ENCRYPTION_VIEW`, `FULL`
   * </pre>
   *
   * <code>
   * map&lt;string, .google.bigtable.admin.v2.Table.ClusterState&gt; cluster_states = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.Map<java.lang.String, com.google.bigtable.admin.v2.Table.ClusterState>
      getClusterStatesMap();
  /**
   *
   *
   * <pre>
   * Output only. Map from cluster ID to per-cluster table state.
   * If it could not be determined whether or not the table has data in a
   * particular cluster (for example, if its zone is unavailable), then
   * there will be an entry for the cluster with UNKNOWN `replication_status`.
   * Views: `REPLICATION_VIEW`, `ENCRYPTION_VIEW`, `FULL`
   * </pre>
   *
   * <code>
   * map&lt;string, .google.bigtable.admin.v2.Table.ClusterState&gt; cluster_states = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  /* nullable */
  com.google.bigtable.admin.v2.Table.ClusterState getClusterStatesOrDefault(
      java.lang.String key,
      /* nullable */
      com.google.bigtable.admin.v2.Table.ClusterState defaultValue);
  /**
   *
   *
   * <pre>
   * Output only. Map from cluster ID to per-cluster table state.
   * If it could not be determined whether or not the table has data in a
   * particular cluster (for example, if its zone is unavailable), then
   * there will be an entry for the cluster with UNKNOWN `replication_status`.
   * Views: `REPLICATION_VIEW`, `ENCRYPTION_VIEW`, `FULL`
   * </pre>
   *
   * <code>
   * map&lt;string, .google.bigtable.admin.v2.Table.ClusterState&gt; cluster_states = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.bigtable.admin.v2.Table.ClusterState getClusterStatesOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * The column families configured for this table, mapped by column family ID.
   * Views: `SCHEMA_VIEW`, `STATS_VIEW`, `FULL`
   * </pre>
   *
   * <code>map&lt;string, .google.bigtable.admin.v2.ColumnFamily&gt; column_families = 3;</code>
   */
  int getColumnFamiliesCount();
  /**
   *
   *
   * <pre>
   * The column families configured for this table, mapped by column family ID.
   * Views: `SCHEMA_VIEW`, `STATS_VIEW`, `FULL`
   * </pre>
   *
   * <code>map&lt;string, .google.bigtable.admin.v2.ColumnFamily&gt; column_families = 3;</code>
   */
  boolean containsColumnFamilies(java.lang.String key);
  /** Use {@link #getColumnFamiliesMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, com.google.bigtable.admin.v2.ColumnFamily> getColumnFamilies();
  /**
   *
   *
   * <pre>
   * The column families configured for this table, mapped by column family ID.
   * Views: `SCHEMA_VIEW`, `STATS_VIEW`, `FULL`
   * </pre>
   *
   * <code>map&lt;string, .google.bigtable.admin.v2.ColumnFamily&gt; column_families = 3;</code>
   */
  java.util.Map<java.lang.String, com.google.bigtable.admin.v2.ColumnFamily> getColumnFamiliesMap();
  /**
   *
   *
   * <pre>
   * The column families configured for this table, mapped by column family ID.
   * Views: `SCHEMA_VIEW`, `STATS_VIEW`, `FULL`
   * </pre>
   *
   * <code>map&lt;string, .google.bigtable.admin.v2.ColumnFamily&gt; column_families = 3;</code>
   */
  /* nullable */
  com.google.bigtable.admin.v2.ColumnFamily getColumnFamiliesOrDefault(
      java.lang.String key,
      /* nullable */
      com.google.bigtable.admin.v2.ColumnFamily defaultValue);
  /**
   *
   *
   * <pre>
   * The column families configured for this table, mapped by column family ID.
   * Views: `SCHEMA_VIEW`, `STATS_VIEW`, `FULL`
   * </pre>
   *
   * <code>map&lt;string, .google.bigtable.admin.v2.ColumnFamily&gt; column_families = 3;</code>
   */
  com.google.bigtable.admin.v2.ColumnFamily getColumnFamiliesOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Immutable. The granularity (i.e. `MILLIS`) at which timestamps are stored
   * in this table. Timestamps not matching the granularity will be rejected. If
   * unspecified at creation time, the value will be set to `MILLIS`. Views:
   * `SCHEMA_VIEW`, `FULL`.
   * </pre>
   *
   * <code>
   * .google.bigtable.admin.v2.Table.TimestampGranularity granularity = 4 [(.google.api.field_behavior) = IMMUTABLE];
   * </code>
   *
   * @return The enum numeric value on the wire for granularity.
   */
  int getGranularityValue();
  /**
   *
   *
   * <pre>
   * Immutable. The granularity (i.e. `MILLIS`) at which timestamps are stored
   * in this table. Timestamps not matching the granularity will be rejected. If
   * unspecified at creation time, the value will be set to `MILLIS`. Views:
   * `SCHEMA_VIEW`, `FULL`.
   * </pre>
   *
   * <code>
   * .google.bigtable.admin.v2.Table.TimestampGranularity granularity = 4 [(.google.api.field_behavior) = IMMUTABLE];
   * </code>
   *
   * @return The granularity.
   */
  com.google.bigtable.admin.v2.Table.TimestampGranularity getGranularity();

  /**
   *
   *
   * <pre>
   * Output only. If this table was restored from another data source (e.g. a
   * backup), this field will be populated with information about the restore.
   * </pre>
   *
   * <code>
   * .google.bigtable.admin.v2.RestoreInfo restore_info = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the restoreInfo field is set.
   */
  boolean hasRestoreInfo();
  /**
   *
   *
   * <pre>
   * Output only. If this table was restored from another data source (e.g. a
   * backup), this field will be populated with information about the restore.
   * </pre>
   *
   * <code>
   * .google.bigtable.admin.v2.RestoreInfo restore_info = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The restoreInfo.
   */
  com.google.bigtable.admin.v2.RestoreInfo getRestoreInfo();
  /**
   *
   *
   * <pre>
   * Output only. If this table was restored from another data source (e.g. a
   * backup), this field will be populated with information about the restore.
   * </pre>
   *
   * <code>
   * .google.bigtable.admin.v2.RestoreInfo restore_info = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.bigtable.admin.v2.RestoreInfoOrBuilder getRestoreInfoOrBuilder();

  /**
   *
   *
   * <pre>
   * If specified, enable the change stream on this table.
   * Otherwise, the change stream is disabled and the change stream is not
   * retained.
   * </pre>
   *
   * <code>.google.bigtable.admin.v2.ChangeStreamConfig change_stream_config = 8;</code>
   *
   * @return Whether the changeStreamConfig field is set.
   */
  boolean hasChangeStreamConfig();
  /**
   *
   *
   * <pre>
   * If specified, enable the change stream on this table.
   * Otherwise, the change stream is disabled and the change stream is not
   * retained.
   * </pre>
   *
   * <code>.google.bigtable.admin.v2.ChangeStreamConfig change_stream_config = 8;</code>
   *
   * @return The changeStreamConfig.
   */
  com.google.bigtable.admin.v2.ChangeStreamConfig getChangeStreamConfig();
  /**
   *
   *
   * <pre>
   * If specified, enable the change stream on this table.
   * Otherwise, the change stream is disabled and the change stream is not
   * retained.
   * </pre>
   *
   * <code>.google.bigtable.admin.v2.ChangeStreamConfig change_stream_config = 8;</code>
   */
  com.google.bigtable.admin.v2.ChangeStreamConfigOrBuilder getChangeStreamConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Set to true to make the table protected against data loss. i.e. deleting
   * the following resources through Admin APIs are prohibited:
   *
   * * The table.
   * * The column families in the table.
   * * The instance containing the table.
   *
   * Note one can still delete the data stored in the table through Data APIs.
   * </pre>
   *
   * <code>bool deletion_protection = 9;</code>
   *
   * @return The deletionProtection.
   */
  boolean getDeletionProtection();

  /**
   *
   *
   * <pre>
   * If specified, automated backups are enabled for this table.
   * Otherwise, automated backups are disabled.
   * </pre>
   *
   * <code>.google.bigtable.admin.v2.Table.AutomatedBackupPolicy automated_backup_policy = 13;
   * </code>
   *
   * @return Whether the automatedBackupPolicy field is set.
   */
  boolean hasAutomatedBackupPolicy();
  /**
   *
   *
   * <pre>
   * If specified, automated backups are enabled for this table.
   * Otherwise, automated backups are disabled.
   * </pre>
   *
   * <code>.google.bigtable.admin.v2.Table.AutomatedBackupPolicy automated_backup_policy = 13;
   * </code>
   *
   * @return The automatedBackupPolicy.
   */
  com.google.bigtable.admin.v2.Table.AutomatedBackupPolicy getAutomatedBackupPolicy();
  /**
   *
   *
   * <pre>
   * If specified, automated backups are enabled for this table.
   * Otherwise, automated backups are disabled.
   * </pre>
   *
   * <code>.google.bigtable.admin.v2.Table.AutomatedBackupPolicy automated_backup_policy = 13;
   * </code>
   */
  com.google.bigtable.admin.v2.Table.AutomatedBackupPolicyOrBuilder
      getAutomatedBackupPolicyOrBuilder();

  com.google.bigtable.admin.v2.Table.AutomatedBackupConfigCase getAutomatedBackupConfigCase();
}
