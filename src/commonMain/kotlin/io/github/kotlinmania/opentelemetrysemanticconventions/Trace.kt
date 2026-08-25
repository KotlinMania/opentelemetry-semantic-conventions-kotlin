// port-lint: source trace.rs
package io.github.kotlinmania.opentelemetrysemanticconventions

/**
 * Trace semantic conventions defined by the OpenTelemetry specification.
 *
 * The trace semantic conventions define a set of standardized attributes to
 * be used in spans.
 */
@Suppress("DEPRECATION")
public object Trace {
    public val ANDROID_APP_STATE: String get() = Attribute.ANDROID_APP_STATE

    public val APP_SCREEN_COORDINATE_X: String get() = Attribute.APP_SCREEN_COORDINATE_X

    public val APP_SCREEN_COORDINATE_Y: String get() = Attribute.APP_SCREEN_COORDINATE_Y

    public val APP_WIDGET_ID: String get() = Attribute.APP_WIDGET_ID

    public val APP_WIDGET_NAME: String get() = Attribute.APP_WIDGET_NAME

    public val AWS_BEDROCK_GUARDRAIL_ID: String get() = Attribute.AWS_BEDROCK_GUARDRAIL_ID

    public val AWS_BEDROCK_KNOWLEDGE_BASE_ID: String get() = Attribute.AWS_BEDROCK_KNOWLEDGE_BASE_ID

    public val AWS_DYNAMODB_ATTRIBUTE_DEFINITIONS: String get() = Attribute.AWS_DYNAMODB_ATTRIBUTE_DEFINITIONS

    public val AWS_DYNAMODB_ATTRIBUTES_TO_GET: String get() = Attribute.AWS_DYNAMODB_ATTRIBUTES_TO_GET

    public val AWS_DYNAMODB_CONSISTENT_READ: String get() = Attribute.AWS_DYNAMODB_CONSISTENT_READ

    public val AWS_DYNAMODB_CONSUMED_CAPACITY: String get() = Attribute.AWS_DYNAMODB_CONSUMED_CAPACITY

    public val AWS_DYNAMODB_COUNT: String get() = Attribute.AWS_DYNAMODB_COUNT

    public val AWS_DYNAMODB_EXCLUSIVE_START_TABLE: String get() = Attribute.AWS_DYNAMODB_EXCLUSIVE_START_TABLE

    public val AWS_DYNAMODB_GLOBAL_SECONDARY_INDEX_UPDATES: String get() = Attribute.AWS_DYNAMODB_GLOBAL_SECONDARY_INDEX_UPDATES

    public val AWS_DYNAMODB_GLOBAL_SECONDARY_INDEXES: String get() = Attribute.AWS_DYNAMODB_GLOBAL_SECONDARY_INDEXES

    public val AWS_DYNAMODB_INDEX_NAME: String get() = Attribute.AWS_DYNAMODB_INDEX_NAME

    public val AWS_DYNAMODB_ITEM_COLLECTION_METRICS: String get() = Attribute.AWS_DYNAMODB_ITEM_COLLECTION_METRICS

    public val AWS_DYNAMODB_LIMIT: String get() = Attribute.AWS_DYNAMODB_LIMIT

    public val AWS_DYNAMODB_LOCAL_SECONDARY_INDEXES: String get() = Attribute.AWS_DYNAMODB_LOCAL_SECONDARY_INDEXES

    public val AWS_DYNAMODB_PROJECTION: String get() = Attribute.AWS_DYNAMODB_PROJECTION

    public val AWS_DYNAMODB_PROVISIONED_READ_CAPACITY: String get() = Attribute.AWS_DYNAMODB_PROVISIONED_READ_CAPACITY

    public val AWS_DYNAMODB_PROVISIONED_WRITE_CAPACITY: String get() = Attribute.AWS_DYNAMODB_PROVISIONED_WRITE_CAPACITY

    public val AWS_DYNAMODB_SCAN_FORWARD: String get() = Attribute.AWS_DYNAMODB_SCAN_FORWARD

    public val AWS_DYNAMODB_SCANNED_COUNT: String get() = Attribute.AWS_DYNAMODB_SCANNED_COUNT

    public val AWS_DYNAMODB_SEGMENT: String get() = Attribute.AWS_DYNAMODB_SEGMENT

    public val AWS_DYNAMODB_SELECT: String get() = Attribute.AWS_DYNAMODB_SELECT

    public val AWS_DYNAMODB_TABLE_COUNT: String get() = Attribute.AWS_DYNAMODB_TABLE_COUNT

    public val AWS_DYNAMODB_TABLE_NAMES: String get() = Attribute.AWS_DYNAMODB_TABLE_NAMES

    public val AWS_DYNAMODB_TOTAL_SEGMENTS: String get() = Attribute.AWS_DYNAMODB_TOTAL_SEGMENTS

    public val AWS_EXTENDED_REQUEST_ID: String get() = Attribute.AWS_EXTENDED_REQUEST_ID

    public val AWS_LAMBDA_INVOKED_ARN: String get() = Attribute.AWS_LAMBDA_INVOKED_ARN

    public val AWS_LAMBDA_RESOURCE_MAPPING_ID: String get() = Attribute.AWS_LAMBDA_RESOURCE_MAPPING_ID

    public val AWS_REQUEST_ID: String get() = Attribute.AWS_REQUEST_ID

    public val AWS_S3_BUCKET: String get() = Attribute.AWS_S3_BUCKET

    public val AWS_S3_COPY_SOURCE: String get() = Attribute.AWS_S3_COPY_SOURCE

    public val AWS_S3_DELETE: String get() = Attribute.AWS_S3_DELETE

    public val AWS_S3_KEY: String get() = Attribute.AWS_S3_KEY

    public val AWS_S3_PART_NUMBER: String get() = Attribute.AWS_S3_PART_NUMBER

    public val AWS_S3_UPLOAD_ID: String get() = Attribute.AWS_S3_UPLOAD_ID

    public val AZ_SERVICE_REQUEST_ID: String get() = Attribute.AZ_SERVICE_REQUEST_ID

    public val AZURE_CLIENT_ID: String get() = Attribute.AZURE_CLIENT_ID

    public val AZURE_COSMOSDB_CONNECTION_MODE: String get() = Attribute.AZURE_COSMOSDB_CONNECTION_MODE

    public val AZURE_COSMOSDB_CONSISTENCY_LEVEL: String get() = Attribute.AZURE_COSMOSDB_CONSISTENCY_LEVEL

    public val AZURE_COSMOSDB_OPERATION_CONTACTED_REGIONS: String get() = Attribute.AZURE_COSMOSDB_OPERATION_CONTACTED_REGIONS

    public val AZURE_COSMOSDB_OPERATION_REQUEST_CHARGE: String get() = Attribute.AZURE_COSMOSDB_OPERATION_REQUEST_CHARGE

    public val AZURE_COSMOSDB_REQUEST_BODY_SIZE: String get() = Attribute.AZURE_COSMOSDB_REQUEST_BODY_SIZE

    public val AZURE_COSMOSDB_RESPONSE_SUB_STATUS_CODE: String get() = Attribute.AZURE_COSMOSDB_RESPONSE_SUB_STATUS_CODE

    public val AZURE_RESOURCE_PROVIDER_NAMESPACE: String get() = Attribute.AZURE_RESOURCE_PROVIDER_NAMESPACE

    public val AZURE_SERVICE_REQUEST_ID: String get() = Attribute.AZURE_SERVICE_REQUEST_ID

    public val CASSANDRA_CONSISTENCY_LEVEL: String get() = Attribute.CASSANDRA_CONSISTENCY_LEVEL

    public val CASSANDRA_COORDINATOR_DC: String get() = Attribute.CASSANDRA_COORDINATOR_DC

    public val CASSANDRA_COORDINATOR_ID: String get() = Attribute.CASSANDRA_COORDINATOR_ID

    public val CASSANDRA_PAGE_SIZE: String get() = Attribute.CASSANDRA_PAGE_SIZE

    public val CASSANDRA_QUERY_IDEMPOTENT: String get() = Attribute.CASSANDRA_QUERY_IDEMPOTENT

    public val CASSANDRA_SPECULATIVE_EXECUTION_COUNT: String get() = Attribute.CASSANDRA_SPECULATIVE_EXECUTION_COUNT

    public val CICD_PIPELINE_ACTION_NAME: String get() = Attribute.CICD_PIPELINE_ACTION_NAME

    public val CICD_PIPELINE_RESULT: String get() = Attribute.CICD_PIPELINE_RESULT

    public val CICD_PIPELINE_TASK_NAME: String get() = Attribute.CICD_PIPELINE_TASK_NAME

    public val CICD_PIPELINE_TASK_RUN_ID: String get() = Attribute.CICD_PIPELINE_TASK_RUN_ID

    public val CICD_PIPELINE_TASK_RUN_RESULT: String get() = Attribute.CICD_PIPELINE_TASK_RUN_RESULT

    public val CICD_PIPELINE_TASK_RUN_URL_FULL: String get() = Attribute.CICD_PIPELINE_TASK_RUN_URL_FULL

    public val CLIENT_ADDRESS: String get() = Attribute.CLIENT_ADDRESS

    public val CLIENT_PORT: String get() = Attribute.CLIENT_PORT

    public val CLOUD_REGION: String get() = Attribute.CLOUD_REGION

    public val CLOUD_RESOURCE_ID: String get() = Attribute.CLOUD_RESOURCE_ID

    public val DB_COLLECTION_NAME: String get() = Attribute.DB_COLLECTION_NAME

    public val DB_NAMESPACE: String get() = Attribute.DB_NAMESPACE

    public val DB_OPERATION_BATCH_SIZE: String get() = Attribute.DB_OPERATION_BATCH_SIZE

    public val DB_OPERATION_NAME: String get() = Attribute.DB_OPERATION_NAME

    public val DB_OPERATION_PARAMETER: String get() = Attribute.DB_OPERATION_PARAMETER

    public val DB_QUERY_PARAMETER: String get() = Attribute.DB_QUERY_PARAMETER

    public val DB_QUERY_SUMMARY: String get() = Attribute.DB_QUERY_SUMMARY

    public val DB_QUERY_TEXT: String get() = Attribute.DB_QUERY_TEXT

    public val DB_RESPONSE_RETURNED_ROWS: String get() = Attribute.DB_RESPONSE_RETURNED_ROWS

    public val DB_RESPONSE_STATUS_CODE: String get() = Attribute.DB_RESPONSE_STATUS_CODE

    public val DB_STORED_PROCEDURE_NAME: String get() = Attribute.DB_STORED_PROCEDURE_NAME

    public val DB_SYSTEM_NAME: String get() = Attribute.DB_SYSTEM_NAME

    public val DNS_ANSWERS: String get() = Attribute.DNS_ANSWERS

    public val DNS_QUESTION_NAME: String get() = Attribute.DNS_QUESTION_NAME

    public val ELASTICSEARCH_NODE_NAME: String get() = Attribute.ELASTICSEARCH_NODE_NAME

    public val ERROR_MESSAGE: String get() = Attribute.ERROR_MESSAGE

    public val ERROR_TYPE: String get() = Attribute.ERROR_TYPE

    public val EXCEPTION_ESCAPED: String get() = Attribute.EXCEPTION_ESCAPED

    public val EXCEPTION_MESSAGE: String get() = Attribute.EXCEPTION_MESSAGE

    public val EXCEPTION_STACKTRACE: String get() = Attribute.EXCEPTION_STACKTRACE

    public val EXCEPTION_TYPE: String get() = Attribute.EXCEPTION_TYPE

    public val FAAS_COLDSTART: String get() = Attribute.FAAS_COLDSTART

    public val FAAS_CRON: String get() = Attribute.FAAS_CRON

    public val FAAS_DOCUMENT_COLLECTION: String get() = Attribute.FAAS_DOCUMENT_COLLECTION

    public val FAAS_DOCUMENT_NAME: String get() = Attribute.FAAS_DOCUMENT_NAME

    public val FAAS_DOCUMENT_OPERATION: String get() = Attribute.FAAS_DOCUMENT_OPERATION

    public val FAAS_DOCUMENT_TIME: String get() = Attribute.FAAS_DOCUMENT_TIME

    public val FAAS_INVOKED_NAME: String get() = Attribute.FAAS_INVOKED_NAME

    public val FAAS_INVOKED_PROVIDER: String get() = Attribute.FAAS_INVOKED_PROVIDER

    public val FAAS_INVOKED_REGION: String get() = Attribute.FAAS_INVOKED_REGION

    public val FAAS_TIME: String get() = Attribute.FAAS_TIME

    public val FAAS_TRIGGER: String get() = Attribute.FAAS_TRIGGER

    public val FEATURE_FLAG_CONTEXT_ID: String get() = Attribute.FEATURE_FLAG_CONTEXT_ID

    public val FEATURE_FLAG_KEY: String get() = Attribute.FEATURE_FLAG_KEY

    public val FEATURE_FLAG_PROVIDER_NAME: String get() = Attribute.FEATURE_FLAG_PROVIDER_NAME

    public val FEATURE_FLAG_RESULT_REASON: String get() = Attribute.FEATURE_FLAG_RESULT_REASON

    public val FEATURE_FLAG_RESULT_VALUE: String get() = Attribute.FEATURE_FLAG_RESULT_VALUE

    public val FEATURE_FLAG_RESULT_VARIANT: String get() = Attribute.FEATURE_FLAG_RESULT_VARIANT

    public val FEATURE_FLAG_SET_ID: String get() = Attribute.FEATURE_FLAG_SET_ID

    public val FEATURE_FLAG_VERSION: String get() = Attribute.FEATURE_FLAG_VERSION

    public val GEN_AI_AGENT_DESCRIPTION: String get() = Attribute.GEN_AI_AGENT_DESCRIPTION

    public val GEN_AI_AGENT_ID: String get() = Attribute.GEN_AI_AGENT_ID

    public val GEN_AI_AGENT_NAME: String get() = Attribute.GEN_AI_AGENT_NAME

    public val GEN_AI_CONVERSATION_ID: String get() = Attribute.GEN_AI_CONVERSATION_ID

    public val GEN_AI_DATA_SOURCE_ID: String get() = Attribute.GEN_AI_DATA_SOURCE_ID

    public val GEN_AI_OPENAI_REQUEST_SERVICE_TIER: String get() = Attribute.GEN_AI_OPENAI_REQUEST_SERVICE_TIER

    public val GEN_AI_OPENAI_RESPONSE_SERVICE_TIER: String get() = Attribute.GEN_AI_OPENAI_RESPONSE_SERVICE_TIER

    public val GEN_AI_OPENAI_RESPONSE_SYSTEM_FINGERPRINT: String get() = Attribute.GEN_AI_OPENAI_RESPONSE_SYSTEM_FINGERPRINT

    public val GEN_AI_OPERATION_NAME: String get() = Attribute.GEN_AI_OPERATION_NAME

    public val GEN_AI_OUTPUT_TYPE: String get() = Attribute.GEN_AI_OUTPUT_TYPE

    public val GEN_AI_REQUEST_CHOICE_COUNT: String get() = Attribute.GEN_AI_REQUEST_CHOICE_COUNT

    public val GEN_AI_REQUEST_ENCODING_FORMATS: String get() = Attribute.GEN_AI_REQUEST_ENCODING_FORMATS

    public val GEN_AI_REQUEST_FREQUENCY_PENALTY: String get() = Attribute.GEN_AI_REQUEST_FREQUENCY_PENALTY

    public val GEN_AI_REQUEST_MAX_TOKENS: String get() = Attribute.GEN_AI_REQUEST_MAX_TOKENS

    public val GEN_AI_REQUEST_MODEL: String get() = Attribute.GEN_AI_REQUEST_MODEL

    public val GEN_AI_REQUEST_PRESENCE_PENALTY: String get() = Attribute.GEN_AI_REQUEST_PRESENCE_PENALTY

    public val GEN_AI_REQUEST_SEED: String get() = Attribute.GEN_AI_REQUEST_SEED

    public val GEN_AI_REQUEST_STOP_SEQUENCES: String get() = Attribute.GEN_AI_REQUEST_STOP_SEQUENCES

    public val GEN_AI_REQUEST_TEMPERATURE: String get() = Attribute.GEN_AI_REQUEST_TEMPERATURE

    public val GEN_AI_REQUEST_TOP_K: String get() = Attribute.GEN_AI_REQUEST_TOP_K

    public val GEN_AI_REQUEST_TOP_P: String get() = Attribute.GEN_AI_REQUEST_TOP_P

    public val GEN_AI_RESPONSE_FINISH_REASONS: String get() = Attribute.GEN_AI_RESPONSE_FINISH_REASONS

    public val GEN_AI_RESPONSE_ID: String get() = Attribute.GEN_AI_RESPONSE_ID

    public val GEN_AI_RESPONSE_MODEL: String get() = Attribute.GEN_AI_RESPONSE_MODEL

    public val GEN_AI_SYSTEM: String get() = Attribute.GEN_AI_SYSTEM

    public val GEN_AI_TOOL_CALL_ID: String get() = Attribute.GEN_AI_TOOL_CALL_ID

    public val GEN_AI_TOOL_DESCRIPTION: String get() = Attribute.GEN_AI_TOOL_DESCRIPTION

    public val GEN_AI_TOOL_NAME: String get() = Attribute.GEN_AI_TOOL_NAME

    public val GEN_AI_USAGE_INPUT_TOKENS: String get() = Attribute.GEN_AI_USAGE_INPUT_TOKENS

    public val GEN_AI_USAGE_OUTPUT_TOKENS: String get() = Attribute.GEN_AI_USAGE_OUTPUT_TOKENS

    public val GRAPHQL_DOCUMENT: String get() = Attribute.GRAPHQL_DOCUMENT

    public val GRAPHQL_OPERATION_NAME: String get() = Attribute.GRAPHQL_OPERATION_NAME

    public val GRAPHQL_OPERATION_TYPE: String get() = Attribute.GRAPHQL_OPERATION_TYPE

    public val HTTP_REQUEST_BODY_SIZE: String get() = Attribute.HTTP_REQUEST_BODY_SIZE

    public val HTTP_REQUEST_HEADER: String get() = Attribute.HTTP_REQUEST_HEADER

    public val HTTP_REQUEST_METHOD: String get() = Attribute.HTTP_REQUEST_METHOD

    public val HTTP_REQUEST_METHOD_ORIGINAL: String get() = Attribute.HTTP_REQUEST_METHOD_ORIGINAL

    public val HTTP_REQUEST_RESEND_COUNT: String get() = Attribute.HTTP_REQUEST_RESEND_COUNT

    public val HTTP_REQUEST_SIZE: String get() = Attribute.HTTP_REQUEST_SIZE

    public val HTTP_RESPONSE_BODY_SIZE: String get() = Attribute.HTTP_RESPONSE_BODY_SIZE

    public val HTTP_RESPONSE_HEADER: String get() = Attribute.HTTP_RESPONSE_HEADER

    public val HTTP_RESPONSE_SIZE: String get() = Attribute.HTTP_RESPONSE_SIZE

    public val HTTP_RESPONSE_STATUS_CODE: String get() = Attribute.HTTP_RESPONSE_STATUS_CODE

    public val HTTP_ROUTE: String get() = Attribute.HTTP_ROUTE

    public val IOS_APP_STATE: String get() = Attribute.IOS_APP_STATE

    public val NETWORK_LOCAL_ADDRESS: String get() = Attribute.NETWORK_LOCAL_ADDRESS

    public val NETWORK_LOCAL_PORT: String get() = Attribute.NETWORK_LOCAL_PORT

    public val NETWORK_PEER_ADDRESS: String get() = Attribute.NETWORK_PEER_ADDRESS

    public val NETWORK_PEER_PORT: String get() = Attribute.NETWORK_PEER_PORT

    public val NETWORK_PROTOCOL_NAME: String get() = Attribute.NETWORK_PROTOCOL_NAME

    public val NETWORK_PROTOCOL_VERSION: String get() = Attribute.NETWORK_PROTOCOL_VERSION

    public val NETWORK_TRANSPORT: String get() = Attribute.NETWORK_TRANSPORT

    public val NETWORK_TYPE: String get() = Attribute.NETWORK_TYPE

    public val PROCESS_COMMAND_ARGS: String get() = Attribute.PROCESS_COMMAND_ARGS

    public val PROCESS_EXECUTABLE_NAME: String get() = Attribute.PROCESS_EXECUTABLE_NAME

    public val PROCESS_EXECUTABLE_PATH: String get() = Attribute.PROCESS_EXECUTABLE_PATH

    public val PROCESS_EXIT_CODE: String get() = Attribute.PROCESS_EXIT_CODE

    public val PROCESS_PID: String get() = Attribute.PROCESS_PID

    public val RPC_MESSAGE_COMPRESSED_SIZE: String get() = Attribute.RPC_MESSAGE_COMPRESSED_SIZE

    public val RPC_MESSAGE_ID: String get() = Attribute.RPC_MESSAGE_ID

    public val RPC_MESSAGE_TYPE: String get() = Attribute.RPC_MESSAGE_TYPE

    public val RPC_MESSAGE_UNCOMPRESSED_SIZE: String get() = Attribute.RPC_MESSAGE_UNCOMPRESSED_SIZE

    public val RPC_METHOD: String get() = Attribute.RPC_METHOD

    public val RPC_SERVICE: String get() = Attribute.RPC_SERVICE

    public val RPC_SYSTEM: String get() = Attribute.RPC_SYSTEM

    public val SERVER_ADDRESS: String get() = Attribute.SERVER_ADDRESS

    public val SERVER_PORT: String get() = Attribute.SERVER_PORT

    public val SESSION_ID: String get() = Attribute.SESSION_ID

    public val SESSION_PREVIOUS_ID: String get() = Attribute.SESSION_PREVIOUS_ID

    public val TLS_PROTOCOL_NAME: String get() = Attribute.TLS_PROTOCOL_NAME

    public val TLS_PROTOCOL_VERSION: String get() = Attribute.TLS_PROTOCOL_VERSION

    public val URL_FULL: String get() = Attribute.URL_FULL

    public val URL_PATH: String get() = Attribute.URL_PATH

    public val URL_QUERY: String get() = Attribute.URL_QUERY

    public val URL_SCHEME: String get() = Attribute.URL_SCHEME

    public val URL_TEMPLATE: String get() = Attribute.URL_TEMPLATE

    public val USER_AGENT_ORIGINAL: String get() = Attribute.USER_AGENT_ORIGINAL

    public val USER_AGENT_SYNTHETIC_TYPE: String get() = Attribute.USER_AGENT_SYNTHETIC_TYPE
}
