// port-lint: source opentelemetry-semantic-conventions/src/trace.rs
package io.github.kotlinmania.opentelemetrysemanticconventions

/**
 * Trace semantic conventions defined by the OpenTelemetry specification.
 *
 * The trace semantic conventions define a set of standardized attributes to
 * be used in spans.
 */
public object Trace {
    public val androidAppState: String get() = Attribute.androidAppState

    public val appScreenCoordinateX: String get() = Attribute.appScreenCoordinateX

    public val appScreenCoordinateY: String get() = Attribute.appScreenCoordinateY

    public val appWidgetId: String get() = Attribute.appWidgetId

    public val appWidgetName: String get() = Attribute.appWidgetName

    public val awsBedrockGuardrailId: String get() = Attribute.awsBedrockGuardrailId

    public val awsBedrockKnowledgeBaseId: String get() = Attribute.awsBedrockKnowledgeBaseId

    public val awsDynamodbAttributeDefinitions: String get() = Attribute.awsDynamodbAttributeDefinitions

    public val awsDynamodbAttributesToGet: String get() = Attribute.awsDynamodbAttributesToGet

    public val awsDynamodbConsistentRead: String get() = Attribute.awsDynamodbConsistentRead

    public val awsDynamodbConsumedCapacity: String get() = Attribute.awsDynamodbConsumedCapacity

    public val awsDynamodbCount: String get() = Attribute.awsDynamodbCount

    public val awsDynamodbExclusiveStartTable: String get() = Attribute.awsDynamodbExclusiveStartTable

    public val awsDynamodbGlobalSecondaryIndexUpdates: String get() = Attribute.awsDynamodbGlobalSecondaryIndexUpdates

    public val awsDynamodbGlobalSecondaryIndexes: String get() = Attribute.awsDynamodbGlobalSecondaryIndexes

    public val awsDynamodbIndexName: String get() = Attribute.awsDynamodbIndexName

    public val awsDynamodbItemCollectionMetrics: String get() = Attribute.awsDynamodbItemCollectionMetrics

    public val awsDynamodbLimit: String get() = Attribute.awsDynamodbLimit

    public val awsDynamodbLocalSecondaryIndexes: String get() = Attribute.awsDynamodbLocalSecondaryIndexes

    public val awsDynamodbProjection: String get() = Attribute.awsDynamodbProjection

    public val awsDynamodbProvisionedReadCapacity: String get() = Attribute.awsDynamodbProvisionedReadCapacity

    public val awsDynamodbProvisionedWriteCapacity: String get() = Attribute.awsDynamodbProvisionedWriteCapacity

    public val awsDynamodbScanForward: String get() = Attribute.awsDynamodbScanForward

    public val awsDynamodbScannedCount: String get() = Attribute.awsDynamodbScannedCount

    public val awsDynamodbSegment: String get() = Attribute.awsDynamodbSegment

    public val awsDynamodbSelect: String get() = Attribute.awsDynamodbSelect

    public val awsDynamodbTableCount: String get() = Attribute.awsDynamodbTableCount

    public val awsDynamodbTableNames: String get() = Attribute.awsDynamodbTableNames

    public val awsDynamodbTotalSegments: String get() = Attribute.awsDynamodbTotalSegments

    public val awsExtendedRequestId: String get() = Attribute.awsExtendedRequestId

    public val awsLambdaInvokedArn: String get() = Attribute.awsLambdaInvokedArn

    public val awsLambdaResourceMappingId: String get() = Attribute.awsLambdaResourceMappingId

    public val awsRequestId: String get() = Attribute.awsRequestId

    public val awsS3Bucket: String get() = Attribute.awsS3Bucket

    public val awsS3CopySource: String get() = Attribute.awsS3CopySource

    public val awsS3Delete: String get() = Attribute.awsS3Delete

    public val awsS3Key: String get() = Attribute.awsS3Key

    public val awsS3PartNumber: String get() = Attribute.awsS3PartNumber

    public val awsS3UploadId: String get() = Attribute.awsS3UploadId

    @Suppress("DEPRECATION")
    public val azServiceRequestId: String get() = Attribute.azServiceRequestId

    public val azureClientId: String get() = Attribute.azureClientId

    public val azureCosmosdbConnectionMode: String get() = Attribute.azureCosmosdbConnectionMode

    public val azureCosmosdbConsistencyLevel: String get() = Attribute.azureCosmosdbConsistencyLevel

    public val azureCosmosdbOperationContactedRegions: String get() = Attribute.azureCosmosdbOperationContactedRegions

    public val azureCosmosdbOperationRequestCharge: String get() = Attribute.azureCosmosdbOperationRequestCharge

    public val azureCosmosdbRequestBodySize: String get() = Attribute.azureCosmosdbRequestBodySize

    public val azureCosmosdbResponseSubStatusCode: String get() = Attribute.azureCosmosdbResponseSubStatusCode

    public val azureResourceProviderNamespace: String get() = Attribute.azureResourceProviderNamespace

    public val azureServiceRequestId: String get() = Attribute.azureServiceRequestId

    public val cassandraConsistencyLevel: String get() = Attribute.cassandraConsistencyLevel

    public val cassandraCoordinatorDc: String get() = Attribute.cassandraCoordinatorDc

    public val cassandraCoordinatorId: String get() = Attribute.cassandraCoordinatorId

    public val cassandraPageSize: String get() = Attribute.cassandraPageSize

    public val cassandraQueryIdempotent: String get() = Attribute.cassandraQueryIdempotent

    public val cassandraSpeculativeExecutionCount: String get() = Attribute.cassandraSpeculativeExecutionCount

    public val cicdPipelineActionName: String get() = Attribute.cicdPipelineActionName

    public val cicdPipelineResult: String get() = Attribute.cicdPipelineResult

    public val cicdPipelineTaskName: String get() = Attribute.cicdPipelineTaskName

    public val cicdPipelineTaskRunId: String get() = Attribute.cicdPipelineTaskRunId

    public val cicdPipelineTaskRunResult: String get() = Attribute.cicdPipelineTaskRunResult

    public val cicdPipelineTaskRunUrlFull: String get() = Attribute.cicdPipelineTaskRunUrlFull

    public val clientAddress: String get() = Attribute.clientAddress

    public val clientPort: String get() = Attribute.clientPort

    public val cloudRegion: String get() = Attribute.cloudRegion

    public val cloudResourceId: String get() = Attribute.cloudResourceId

    public val dbCollectionName: String get() = Attribute.dbCollectionName

    public val dbNamespace: String get() = Attribute.dbNamespace

    public val dbOperationBatchSize: String get() = Attribute.dbOperationBatchSize

    public val dbOperationName: String get() = Attribute.dbOperationName

    public val dbOperationParameter: String get() = Attribute.dbOperationParameter

    public val dbQueryParameter: String get() = Attribute.dbQueryParameter

    public val dbQuerySummary: String get() = Attribute.dbQuerySummary

    public val dbQueryText: String get() = Attribute.dbQueryText

    public val dbResponseReturnedRows: String get() = Attribute.dbResponseReturnedRows

    public val dbResponseStatusCode: String get() = Attribute.dbResponseStatusCode

    public val dbStoredProcedureName: String get() = Attribute.dbStoredProcedureName

    public val dbSystemName: String get() = Attribute.dbSystemName

    public val dnsAnswers: String get() = Attribute.dnsAnswers

    public val dnsQuestionName: String get() = Attribute.dnsQuestionName

    public val elasticsearchNodeName: String get() = Attribute.elasticsearchNodeName

    public val errorMessage: String get() = Attribute.errorMessage

    public val errorType: String get() = Attribute.errorType

    @Suppress("DEPRECATION")
    public val exceptionEscaped: String get() = Attribute.exceptionEscaped

    public val exceptionMessage: String get() = Attribute.exceptionMessage

    public val exceptionStacktrace: String get() = Attribute.exceptionStacktrace

    public val exceptionType: String get() = Attribute.exceptionType

    public val faasColdstart: String get() = Attribute.faasColdstart

    public val faasCron: String get() = Attribute.faasCron

    public val faasDocumentCollection: String get() = Attribute.faasDocumentCollection

    public val faasDocumentName: String get() = Attribute.faasDocumentName

    public val faasDocumentOperation: String get() = Attribute.faasDocumentOperation

    public val faasDocumentTime: String get() = Attribute.faasDocumentTime

    public val faasInvokedName: String get() = Attribute.faasInvokedName

    public val faasInvokedProvider: String get() = Attribute.faasInvokedProvider

    public val faasInvokedRegion: String get() = Attribute.faasInvokedRegion

    public val faasTime: String get() = Attribute.faasTime

    public val faasTrigger: String get() = Attribute.faasTrigger

    public val featureFlagContextId: String get() = Attribute.featureFlagContextId

    public val featureFlagKey: String get() = Attribute.featureFlagKey

    public val featureFlagProviderName: String get() = Attribute.featureFlagProviderName

    public val featureFlagResultReason: String get() = Attribute.featureFlagResultReason

    public val featureFlagResultValue: String get() = Attribute.featureFlagResultValue

    public val featureFlagResultVariant: String get() = Attribute.featureFlagResultVariant

    public val featureFlagSetId: String get() = Attribute.featureFlagSetId

    public val featureFlagVersion: String get() = Attribute.featureFlagVersion

    public val genAiAgentDescription: String get() = Attribute.genAiAgentDescription

    public val genAiAgentId: String get() = Attribute.genAiAgentId

    public val genAiAgentName: String get() = Attribute.genAiAgentName

    public val genAiConversationId: String get() = Attribute.genAiConversationId

    public val genAiDataSourceId: String get() = Attribute.genAiDataSourceId

    public val genAiOpenaiRequestServiceTier: String get() = Attribute.genAiOpenaiRequestServiceTier

    public val genAiOpenaiResponseServiceTier: String get() = Attribute.genAiOpenaiResponseServiceTier

    public val genAiOpenaiResponseSystemFingerprint: String get() = Attribute.genAiOpenaiResponseSystemFingerprint

    public val genAiOperationName: String get() = Attribute.genAiOperationName

    public val genAiOutputType: String get() = Attribute.genAiOutputType

    public val genAiRequestChoiceCount: String get() = Attribute.genAiRequestChoiceCount

    public val genAiRequestEncodingFormats: String get() = Attribute.genAiRequestEncodingFormats

    public val genAiRequestFrequencyPenalty: String get() = Attribute.genAiRequestFrequencyPenalty

    public val genAiRequestMaxTokens: String get() = Attribute.genAiRequestMaxTokens

    public val genAiRequestModel: String get() = Attribute.genAiRequestModel

    public val genAiRequestPresencePenalty: String get() = Attribute.genAiRequestPresencePenalty

    public val genAiRequestSeed: String get() = Attribute.genAiRequestSeed

    public val genAiRequestStopSequences: String get() = Attribute.genAiRequestStopSequences

    public val genAiRequestTemperature: String get() = Attribute.genAiRequestTemperature

    public val genAiRequestTopK: String get() = Attribute.genAiRequestTopK

    public val genAiRequestTopP: String get() = Attribute.genAiRequestTopP

    public val genAiResponseFinishReasons: String get() = Attribute.genAiResponseFinishReasons

    public val genAiResponseId: String get() = Attribute.genAiResponseId

    public val genAiResponseModel: String get() = Attribute.genAiResponseModel

    public val genAiSystem: String get() = Attribute.genAiSystem

    public val genAiToolCallId: String get() = Attribute.genAiToolCallId

    public val genAiToolDescription: String get() = Attribute.genAiToolDescription

    public val genAiToolName: String get() = Attribute.genAiToolName

    public val genAiUsageInputTokens: String get() = Attribute.genAiUsageInputTokens

    public val genAiUsageOutputTokens: String get() = Attribute.genAiUsageOutputTokens

    public val graphqlDocument: String get() = Attribute.graphqlDocument

    public val graphqlOperationName: String get() = Attribute.graphqlOperationName

    public val graphqlOperationType: String get() = Attribute.graphqlOperationType

    public val httpRequestBodySize: String get() = Attribute.httpRequestBodySize

    public val httpRequestHeader: String get() = Attribute.httpRequestHeader

    public val httpRequestMethod: String get() = Attribute.httpRequestMethod

    public val httpRequestMethodOriginal: String get() = Attribute.httpRequestMethodOriginal

    public val httpRequestResendCount: String get() = Attribute.httpRequestResendCount

    public val httpRequestSize: String get() = Attribute.httpRequestSize

    public val httpResponseBodySize: String get() = Attribute.httpResponseBodySize

    public val httpResponseHeader: String get() = Attribute.httpResponseHeader

    public val httpResponseSize: String get() = Attribute.httpResponseSize

    public val httpResponseStatusCode: String get() = Attribute.httpResponseStatusCode

    public val httpRoute: String get() = Attribute.httpRoute

    public val iosAppState: String get() = Attribute.iosAppState

    public val networkLocalAddress: String get() = Attribute.networkLocalAddress

    public val networkLocalPort: String get() = Attribute.networkLocalPort

    public val networkPeerAddress: String get() = Attribute.networkPeerAddress

    public val networkPeerPort: String get() = Attribute.networkPeerPort

    public val networkProtocolName: String get() = Attribute.networkProtocolName

    public val networkProtocolVersion: String get() = Attribute.networkProtocolVersion

    public val networkTransport: String get() = Attribute.networkTransport

    public val networkType: String get() = Attribute.networkType

    public val processCommandArgs: String get() = Attribute.processCommandArgs

    public val processExecutableName: String get() = Attribute.processExecutableName

    public val processExecutablePath: String get() = Attribute.processExecutablePath

    public val processExitCode: String get() = Attribute.processExitCode

    public val processPid: String get() = Attribute.processPid

    public val rpcMessageCompressedSize: String get() = Attribute.rpcMessageCompressedSize

    public val rpcMessageId: String get() = Attribute.rpcMessageId

    public val rpcMessageType: String get() = Attribute.rpcMessageType

    public val rpcMessageUncompressedSize: String get() = Attribute.rpcMessageUncompressedSize

    public val rpcMethod: String get() = Attribute.rpcMethod

    public val rpcService: String get() = Attribute.rpcService

    public val rpcSystem: String get() = Attribute.rpcSystem

    public val serverAddress: String get() = Attribute.serverAddress

    public val serverPort: String get() = Attribute.serverPort

    public val sessionId: String get() = Attribute.sessionId

    public val sessionPreviousId: String get() = Attribute.sessionPreviousId

    public val tlsProtocolName: String get() = Attribute.tlsProtocolName

    public val tlsProtocolVersion: String get() = Attribute.tlsProtocolVersion

    public val urlFull: String get() = Attribute.urlFull

    public val urlPath: String get() = Attribute.urlPath

    public val urlQuery: String get() = Attribute.urlQuery

    public val urlScheme: String get() = Attribute.urlScheme

    public val urlTemplate: String get() = Attribute.urlTemplate

    public val userAgentOriginal: String get() = Attribute.userAgentOriginal

    public val userAgentSyntheticType: String get() = Attribute.userAgentSyntheticType
}
