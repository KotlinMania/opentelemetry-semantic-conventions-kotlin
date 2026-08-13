// port-lint: source opentelemetry-semantic-conventions/src/attribute.rs
package io.github.kotlinmania.opentelemetrysemanticconventions

/**
 * Semantic attributes defined by the OpenTelemetry specification.
 *
 * The entire set of semantic attributes (or conventions) defined by the project.
 * The resource, metric, and trace modules reference these attributes.
 */
public object Attribute {
    /**
     * This attribute represents the state of the application.
     *
     * ## Notes
     *
     * The Android lifecycle states are defined in [Activity lifecycle callbacks](https://developer.android.com/guide/components/activities/activity-lifecycle#lc), and from which the `OS identifiers` are derived.
     *
     * # Examples
     *
     * - `"created"`
     */
    public const val ANDROID_APP_STATE: String = "android.app.state"

    /**
     * Uniquely identifies the framework API revision offered by a version (`os.version`) of the android operating system. More information can be found [here](https://developer.android.com/guide/topics/manifest/uses-sdk-element#ApiLevels).
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"33"`
     * - `"32"`
     */
    public const val ANDROID_OS_API_LEVEL: String = "android.os.api_level"

    /**
     * Deprecated. Use `android.app.state` body field instead.
     *
     * ## Notes
     */
    @Deprecated("{note: Use `android.app.state` body field instead., reason: uncategorized}")
    public const val ANDROID_STATE: String = "android.state"

    /**
     * A unique identifier representing the installation of an application on a specific device
     *
     * ## Notes
     *
     * Its value SHOULD persist across launches of the same application installation, including through application upgrades.
     * It SHOULD change if the application is uninstalled or if all applications of the vendor are uninstalled.
     * Additionally, users might be able to reset this value (e.g. by clearing application data).
     * If an app is installed multiple times on the same device (e.g. in different accounts on Android), each `app.installation.id` SHOULD have a different value.
     * If multiple OpenTelemetry SDKs are used within the same application, they SHOULD use the same value for `app.installation.id`.
     * Hardware IDs (e.g. serial number, IMEI, MAC address) MUST NOT be used as the `app.installation.id`.
     *
     * For iOS, this value SHOULD be equal to the [vendor identifier](https://developer.apple.com/documentation/uikit/uidevice/identifierforvendor).
     *
     * For Android, examples of `app.installation.id` implementations include:
     *
     * - [Firebase Installation ID](https://firebase.google.com/docs/projects/manage-installations).
     * - A globally unique UUID which is persisted across sessions in your application.
     * - [App set ID](https://developer.android.com/identity/app-set-id).
     * - [`Settings.getString(Settings.Secure.ANDROID_ID)`](https://developer.android.com/reference/android/provider/Settings.Secure#ANDROID_ID).
     *
     * More information about Android identifier best practices can be found [here](https://developer.android.com/training/articles/user-data-ids).
     *
     * # Examples
     *
     * - `"2ab2916d-a51f-4ac8-80ee-45ac31a28092"`
     */
    public const val APP_INSTALLATION_ID: String = "app.installation.id"

    /**
     * The x (horizontal) coordinate of a screen coordinate, in screen pixels.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `0`
     * - `131`
     */
    public const val APP_SCREEN_COORDINATE_X: String = "app.screen.coordinate.x"

    /**
     * The y (vertical) component of a screen coordinate, in screen pixels.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `12`
     * - `99`
     */
    public const val APP_SCREEN_COORDINATE_Y: String = "app.screen.coordinate.y"

    /**
     * An identifier that uniquely differentiates this widget from other widgets in the same application.
     *
     * ## Notes
     *
     * A widget is an application component, typically an on-screen visual GUI element.
     *
     * # Examples
     *
     * - `"f9bc787d-ff05-48ad-90e1-fca1d46130b3"`
     * - `"submit_order_1829"`
     */
    public const val APP_WIDGET_ID: String = "app.widget.id"

    /**
     * The name of an application widget.
     *
     * ## Notes
     *
     * A widget is an application component, typically an on-screen visual GUI element.
     *
     * # Examples
     *
     * - `"submit"`
     * - `"attack"`
     * - `"Clear Cart"`
     */
    public const val APP_WIDGET_NAME: String = "app.widget.name"

    /**
     * The provenance filename of the built attestation which directly relates to the build artifact filename. This filename SHOULD accompany the artifact at publish time. See the [SLSA Relationship](https://slsa.dev/spec/v1.0/distributing-provenance#relationship-between-artifacts-and-attestations) specification for more information.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"golang-binary-amd64-v0.1.0.attestation"`
     * - `"docker-image-amd64-v0.1.0.intoto.json1"`
     * - `"release-1.tar.gz.attestation"`
     * - `"file-name-package.tar.gz.intoto.json1"`
     */
    public const val ARTIFACT_ATTESTATION_FILENAME: String = "artifact.attestation.filename"

    /**
     * The full [hash value (see glossary)](https://nvlpubs.nist.gov/nistpubs/FIPS/NIST.FIPS.186-5.pdf), of the built attestation. Some envelopes in the [software attestation space](https://github.com/in-toto/attestation/tree/main/spec) also refer to this as the **digest**.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"1b31dfcd5b7f9267bf2ff47651df1cfb9147b9e4df1f335accf65b4cda498408"`
     */
    public const val ARTIFACT_ATTESTATION_HASH: String = "artifact.attestation.hash"

    /**
     * The id of the build [software attestation](https://slsa.dev/attestation-model).
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"123"`
     */
    public const val ARTIFACT_ATTESTATION_ID: String = "artifact.attestation.id"

    /**
     * The human readable file name of the artifact, typically generated during build and release processes. Often includes the package name and version in the file name.
     *
     * ## Notes
     *
     * This file name can also act as the [Package Name](https://slsa.dev/spec/v1.0/terminology#package-model)
     * in cases where the package ecosystem maps accordingly.
     * Additionally, the artifact [can be published](https://slsa.dev/spec/v1.0/terminology#software-supply-chain)
     * for others, but that is not a guarantee.
     *
     * # Examples
     *
     * - `"golang-binary-amd64-v0.1.0"`
     * - `"docker-image-amd64-v0.1.0"`
     * - `"release-1.tar.gz"`
     * - `"file-name-package.tar.gz"`
     */
    public const val ARTIFACT_FILENAME: String = "artifact.filename"

    /**
     * The full [hash value (see glossary)](https://nvlpubs.nist.gov/nistpubs/FIPS/NIST.FIPS.186-5.pdf), often found in checksum.txt on a release of the artifact and used to verify package integrity.
     *
     * ## Notes
     *
     * The specific algorithm used to create the cryptographic hash value is
     * not defined. In situations where an artifact has multiple
     * cryptographic hashes, it is up to the implementer to choose which
     * hash value to set here; this should be the most secure hash algorithm
     * that is suitable for the situation and consistent with the
     * corresponding attestation. The implementer can then provide the other
     * hash values through an additional set of attribute extensions as they
     * deem necessary.
     *
     * # Examples
     *
     * - `"9ff4c52759e2c4ac70b7d517bc7fcdc1cda631ca0045271ddd1b192544f8a3e9"`
     */
    public const val ARTIFACT_HASH: String = "artifact.hash"

    /**
     * The [Package URL](https://github.com/package-url/purl-spec) of the [package artifact](https://slsa.dev/spec/v1.0/terminology#package-model) provides a standard way to identify and locate the packaged artifact.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"pkg:github/package-url/purl-spec@1209109710924"`
     * - `"pkg:npm/foo@12.12.3"`
     */
    public const val ARTIFACT_PURL: String = "artifact.purl"

    /**
     * The version of the artifact.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"v0.1.0"`
     * - `"1.2.1"`
     * - `"122691-build"`
     */
    public const val ARTIFACT_VERSION: String = "artifact.version"

    /**
     * ASP.NET Core exception middleware handling result
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"handled"`
     * - `"unhandled"`
     */
    public const val ASPNETCORE_DIAGNOSTICS_EXCEPTION_RESULT: String = "aspnetcore.diagnostics.exception.result"

    /**
     * Full type name of the [`IExceptionHandler`](https://learn.microsoft.com/dotnet/api/microsoft.aspnetcore.diagnostics.iexceptionhandler) implementation that handled the exception.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"Contoso.MyHandler"`
     */
    public const val ASPNETCORE_DIAGNOSTICS_HANDLER_TYPE: String = "aspnetcore.diagnostics.handler.type"

    /**
     * Rate limiting policy name.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"fixed"`
     * - `"sliding"`
     * - `"token"`
     */
    public const val ASPNETCORE_RATE_LIMITING_POLICY: String = "aspnetcore.rate_limiting.policy"

    /**
     * Rate-limiting result, shows whether the lease was acquired or contains a rejection reason
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"acquired"`
     * - `"request_canceled"`
     */
    public const val ASPNETCORE_RATE_LIMITING_RESULT: String = "aspnetcore.rate_limiting.result"

    /**
     * Flag indicating if request was handled by the application pipeline.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `true`
     */
    public const val ASPNETCORE_REQUEST_IS_UNHANDLED: String = "aspnetcore.request.is_unhandled"

    /**
     * A value that indicates whether the matched route is a fallback route.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `true`
     */
    public const val ASPNETCORE_ROUTING_IS_FALLBACK: String = "aspnetcore.routing.is_fallback"

    /**
     * Match result - success or failure
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"success"`
     * - `"failure"`
     */
    public const val ASPNETCORE_ROUTING_MATCH_STATUS: String = "aspnetcore.routing.match_status"

    /**
     * The unique identifier of the AWS Bedrock Guardrail. A [guardrail](https://docs.aws.amazon.com/bedrock/latest/userguide/guardrails.html) helps safeguard and prevent unwanted behavior from model responses or user messages.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"sgi5gkybzqak"`
     */
    public const val AWS_BEDROCK_GUARDRAIL_ID: String = "aws.bedrock.guardrail.id"

    /**
     * The unique identifier of the AWS Bedrock Knowledge base. A [knowledge base](https://docs.aws.amazon.com/bedrock/latest/userguide/knowledge-base.html) is a bank of information that can be queried by models to generate more relevant responses and augment prompts.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"XFWUPB9PAW"`
     */
    public const val AWS_BEDROCK_KNOWLEDGE_BASE_ID: String = "aws.bedrock.knowledge_base.id"

    /**
     * The JSON-serialized value of each item in the `AttributeDefinitions` request field.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `[
     * "{ \"AttributeName\": \"string\", \"AttributeType\": \"string\" }",
     * ]`
     */
    public const val AWS_DYNAMODB_ATTRIBUTE_DEFINITIONS: String = "aws.dynamodb.attribute_definitions"

    /**
     * The value of the `AttributesToGet` request parameter.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `[
     * "lives",
     * "id",
     * ]`
     */
    public const val AWS_DYNAMODB_ATTRIBUTES_TO_GET: String = "aws.dynamodb.attributes_to_get"

    /**
     * The value of the `ConsistentRead` request parameter.
     *
     * ## Notes
     */
    public const val AWS_DYNAMODB_CONSISTENT_READ: String = "aws.dynamodb.consistent_read"

    /**
     * The JSON-serialized value of each item in the `ConsumedCapacity` response field.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `[
     * "{ \"CapacityUnits\": number, \"GlobalSecondaryIndexes\": { \"string\" : { \"CapacityUnits\": number, \"ReadCapacityUnits\": number, \"WriteCapacityUnits\": number } }, \"LocalSecondaryIndexes\": { \"string\" : { \"CapacityUnits\": number, \"ReadCapacityUnits\": number, \"WriteCapacityUnits\": number } }, \"ReadCapacityUnits\": number, \"Table\": { \"CapacityUnits\": number, \"ReadCapacityUnits\": number, \"WriteCapacityUnits\": number }, \"TableName\": \"string\", \"WriteCapacityUnits\": number }",
     * ]`
     */
    public const val AWS_DYNAMODB_CONSUMED_CAPACITY: String = "aws.dynamodb.consumed_capacity"

    /**
     * The value of the `Count` response parameter.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `10`
     */
    public const val AWS_DYNAMODB_COUNT: String = "aws.dynamodb.count"

    /**
     * The value of the `ExclusiveStartTableName` request parameter.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"Users"`
     * - `"CatsTable"`
     */
    public const val AWS_DYNAMODB_EXCLUSIVE_START_TABLE: String = "aws.dynamodb.exclusive_start_table"

    /**
     * The JSON-serialized value of each item in the `GlobalSecondaryIndexUpdates` request field.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `[
     * "{ \"Create\": { \"IndexName\": \"string\", \"KeySchema\": [ { \"AttributeName\": \"string\", \"KeyType\": \"string\" } ], \"Projection\": { \"NonKeyAttributes\": [ \"string\" ], \"ProjectionType\": \"string\" }, \"ProvisionedThroughput\": { \"ReadCapacityUnits\": number, \"WriteCapacityUnits\": number } }",
     * ]`
     */
    public const val AWS_DYNAMODB_GLOBAL_SECONDARY_INDEX_UPDATES: String = "aws.dynamodb.global_secondary_index_updates"

    /**
     * The JSON-serialized value of each item of the `GlobalSecondaryIndexes` request field
     *
     * ## Notes
     *
     * # Examples
     *
     * - `[
     * "{ \"IndexName\": \"string\", \"KeySchema\": [ { \"AttributeName\": \"string\", \"KeyType\": \"string\" } ], \"Projection\": { \"NonKeyAttributes\": [ \"string\" ], \"ProjectionType\": \"string\" }, \"ProvisionedThroughput\": { \"ReadCapacityUnits\": number, \"WriteCapacityUnits\": number } }",
     * ]`
     */
    public const val AWS_DYNAMODB_GLOBAL_SECONDARY_INDEXES: String = "aws.dynamodb.global_secondary_indexes"

    /**
     * The value of the `IndexName` request parameter.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"name_to_group"`
     */
    public const val AWS_DYNAMODB_INDEX_NAME: String = "aws.dynamodb.index_name"

    /**
     * The JSON-serialized value of the `ItemCollectionMetrics` response field.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"{ \"string\" : [ { \"ItemCollectionKey\": { \"string\" : { \"B\": blob, \"BOOL\": boolean, \"BS\": [ blob ], \"L\": [ \"AttributeValue\" ], \"M\": { \"string\" : \"AttributeValue\" }, \"N\": \"string\", \"NS\": [ \"string\" ], \"NULL\": boolean, \"S\": \"string\", \"SS\": [ \"string\" ] } }, \"SizeEstimateRangeGB\": [ number ] } ] }"`
     */
    public const val AWS_DYNAMODB_ITEM_COLLECTION_METRICS: String = "aws.dynamodb.item_collection_metrics"

    /**
     * The value of the `Limit` request parameter.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `10`
     */
    public const val AWS_DYNAMODB_LIMIT: String = "aws.dynamodb.limit"

    /**
     * The JSON-serialized value of each item of the `LocalSecondaryIndexes` request field.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `[
     * "{ \"IndexArn\": \"string\", \"IndexName\": \"string\", \"IndexSizeBytes\": number, \"ItemCount\": number, \"KeySchema\": [ { \"AttributeName\": \"string\", \"KeyType\": \"string\" } ], \"Projection\": { \"NonKeyAttributes\": [ \"string\" ], \"ProjectionType\": \"string\" } }",
     * ]`
     */
    public const val AWS_DYNAMODB_LOCAL_SECONDARY_INDEXES: String = "aws.dynamodb.local_secondary_indexes"

    /**
     * The value of the `ProjectionExpression` request parameter.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"Title"`
     * - `"Title, Price, Color"`
     * - `"Title, Description, RelatedItems, ProductReviews"`
     */
    public const val AWS_DYNAMODB_PROJECTION: String = "aws.dynamodb.projection"

    /**
     * The value of the `ProvisionedThroughput.ReadCapacityUnits` request parameter.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `1.0`
     * - `2.0`
     */
    public const val AWS_DYNAMODB_PROVISIONED_READ_CAPACITY: String = "aws.dynamodb.provisioned_read_capacity"

    /**
     * The value of the `ProvisionedThroughput.WriteCapacityUnits` request parameter.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `1.0`
     * - `2.0`
     */
    public const val AWS_DYNAMODB_PROVISIONED_WRITE_CAPACITY: String = "aws.dynamodb.provisioned_write_capacity"

    /**
     * The value of the `ScanIndexForward` request parameter.
     *
     * ## Notes
     */
    public const val AWS_DYNAMODB_SCAN_FORWARD: String = "aws.dynamodb.scan_forward"

    /**
     * The value of the `ScannedCount` response parameter.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `50`
     */
    public const val AWS_DYNAMODB_SCANNED_COUNT: String = "aws.dynamodb.scanned_count"

    /**
     * The value of the `Segment` request parameter.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `10`
     */
    public const val AWS_DYNAMODB_SEGMENT: String = "aws.dynamodb.segment"

    /**
     * The value of the `Select` request parameter.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"ALL_ATTRIBUTES"`
     * - `"COUNT"`
     */
    public const val AWS_DYNAMODB_SELECT: String = "aws.dynamodb.select"

    /**
     * The number of items in the `TableNames` response parameter.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `20`
     */
    public const val AWS_DYNAMODB_TABLE_COUNT: String = "aws.dynamodb.table_count"

    /**
     * The keys in the `RequestItems` object field.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `[
     * "Users",
     * "Cats",
     * ]`
     */
    public const val AWS_DYNAMODB_TABLE_NAMES: String = "aws.dynamodb.table_names"

    /**
     * The value of the `TotalSegments` request parameter.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `100`
     */
    public const val AWS_DYNAMODB_TOTAL_SEGMENTS: String = "aws.dynamodb.total_segments"

    /**
     * The ARN of an [ECS cluster](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/clusters.html).
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"arn:aws:ecs:us-west-2:123456789123:cluster/my-cluster"`
     */
    public const val AWS_ECS_CLUSTER_ARN: String = "aws.ecs.cluster.arn"

    /**
     * The Amazon Resource Name (ARN) of an [ECS container instance](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ECS_instances.html).
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"arn:aws:ecs:us-west-1:123456789123:container/32624152-9086-4f0e-acae-1a75b14fe4d9"`
     */
    public const val AWS_ECS_CONTAINER_ARN: String = "aws.ecs.container.arn"

    /**
     * The [launch type](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/launch_types.html) for an ECS task.
     *
     * ## Notes
     */
    public const val AWS_ECS_LAUNCHTYPE: String = "aws.ecs.launchtype"

    /**
     * The ARN of a running [ECS task](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-account-settings.html#ecs-resource-ids).
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"arn:aws:ecs:us-west-1:123456789123:task/10838bed-421f-43ef-870a-f43feacbbb5b"`
     * - `"arn:aws:ecs:us-west-1:123456789123:task/my-cluster/task-id/23ebb8ac-c18f-46c6-8bbe-d55d0e37cfbd"`
     */
    public const val AWS_ECS_TASK_ARN: String = "aws.ecs.task.arn"

    /**
     * The family name of the [ECS task definition](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_definitions.html) used to create the ECS task.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"opentelemetry-family"`
     */
    public const val AWS_ECS_TASK_FAMILY: String = "aws.ecs.task.family"

    /**
     * The ID of a running ECS task. The ID MUST be extracted from `task.arn`.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"10838bed-421f-43ef-870a-f43feacbbb5b"`
     * - `"23ebb8ac-c18f-46c6-8bbe-d55d0e37cfbd"`
     */
    public const val AWS_ECS_TASK_ID: String = "aws.ecs.task.id"

    /**
     * The revision for the task definition used to create the ECS task.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"8"`
     * - `"26"`
     */
    public const val AWS_ECS_TASK_REVISION: String = "aws.ecs.task.revision"

    /**
     * The ARN of an EKS cluster.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"arn:aws:ecs:us-west-2:123456789123:cluster/my-cluster"`
     */
    public const val AWS_EKS_CLUSTER_ARN: String = "aws.eks.cluster.arn"

    /**
     * The AWS extended request ID as returned in the response header `x-amz-id-2`.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"wzHcyEWfmOGDIE5QOhTAqFDoDWP3y8IUvpNINCwL9N4TEHbUw0/gZJ+VZTmCNCWR7fezEN3eCiQ="`
     */
    public const val AWS_EXTENDED_REQUEST_ID: String = "aws.extended_request_id"

    /**
     * The name of the AWS Kinesis [stream](https://docs.aws.amazon.com/streams/latest/dev/introduction.html) the request refers to. Corresponds to the `--stream-name` parameter of the Kinesis [describe-stream](https://docs.aws.amazon.com/cli/latest/reference/kinesis/describe-stream.html) operation.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"some-stream-name"`
     */
    public const val AWS_KINESIS_STREAM_NAME: String = "aws.kinesis.stream_name"

    /**
     * The full invoked ARN as provided on the `Context` passed to the function (`Lambda-Runtime-Invoked-Function-Arn` header on the `/runtime/invocation/next` applicable).
     *
     * ## Notes
     *
     * This may be different from `cloud.resource_id` if an alias is involved.
     *
     * # Examples
     *
     * - `"arn:aws:lambda:us-east-1:123456:function:myfunction:myalias"`
     */
    public const val AWS_LAMBDA_INVOKED_ARN: String = "aws.lambda.invoked_arn"

    /**
     * The UUID of the [AWS Lambda EvenSource Mapping](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html). An event source is mapped to a lambda function. It's contents are read by Lambda and used to trigger a function. This isn't available in the lambda execution context or the lambda runtime environtment. This is going to be populated by the AWS SDK for each language when that UUID is present. Some of these operations are Create/Delete/Get/List/Update EventSourceMapping.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"587ad24b-03b9-4413-8202-bbd56b36e5b7"`
     */
    public const val AWS_LAMBDA_RESOURCE_MAPPING_ID: String = "aws.lambda.resource_mapping.id"

    /**
     * The Amazon Resource Name(s) (ARN) of the AWS log group(s).
     *
     * ## Notes
     *
     * See the [log group ARN format documentation](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/iam-access-control-overview-cwl.html#CWL_ARN_Format).
     *
     * # Examples
     *
     * - `[
     * "arn:aws:logs:us-west-1:123456789012:log-group:/aws/my/group:*",
     * ]`
     */
    public const val AWS_LOG_GROUP_ARNS: String = "aws.log.group.arns"

    /**
     * The name(s) of the AWS log group(s) an application is writing to.
     *
     * ## Notes
     *
     * Multiple log groups must be supported for cases like multi-container applications, where a single application has sidecar containers, and each write to their own log group.
     *
     * # Examples
     *
     * - `[
     * "/aws/lambda/my-function",
     * "opentelemetry-service",
     * ]`
     */
    public const val AWS_LOG_GROUP_NAMES: String = "aws.log.group.names"

    /**
     * The ARN(s) of the AWS log stream(s).
     *
     * ## Notes
     *
     * See the [log stream ARN format documentation](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/iam-access-control-overview-cwl.html#CWL_ARN_Format). One log group can contain several log streams, so these ARNs necessarily identify both a log group and a log stream.
     *
     * # Examples
     *
     * - `[
     * "arn:aws:logs:us-west-1:123456789012:log-group:/aws/my/group:log-stream:logs/main/10838bed-421f-43ef-870a-f43feacbbb5b",
     * ]`
     */
    public const val AWS_LOG_STREAM_ARNS: String = "aws.log.stream.arns"

    /**
     * The name(s) of the AWS log stream(s) an application is writing to.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `[
     * "logs/main/10838bed-421f-43ef-870a-f43feacbbb5b",
     * ]`
     */
    public const val AWS_LOG_STREAM_NAMES: String = "aws.log.stream.names"

    /**
     * The AWS request ID as returned in the response headers `x-amzn-requestid`, `x-amzn-request-id` or `x-amz-request-id`.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"79b9da39-b7ae-508a-a6bc-864b2829c622"`
     * - `"C9ER4AJX75574TDJ"`
     */
    public const val AWS_REQUEST_ID: String = "aws.request_id"

    /**
     * The S3 bucket name the request refers to. Corresponds to the `--bucket` parameter of the [S3 API](https://docs.aws.amazon.com/cli/latest/reference/s3api/index.html) operations.
     *
     * ## Notes
     *
     * The `bucket` attribute is applicable to all S3 operations that reference a bucket, i.e. that require the bucket name as a mandatory parameter.
     * This applies to almost all S3 operations except `list-buckets`.
     *
     * # Examples
     *
     * - `"some-bucket-name"`
     */
    public const val AWS_S3_BUCKET: String = "aws.s3.bucket"

    /**
     * The source object (in the form `bucket`/`key`) for the copy operation.
     *
     * ## Notes
     *
     * The `copy_source` attribute applies to S3 copy operations and corresponds to the `--copy-source` parameter
     * of the [copy-object operation within the S3 API](https://docs.aws.amazon.com/cli/latest/reference/s3api/copy-object.html).
     * This applies in particular to the following operations:
     *
     * - [copy-object](https://docs.aws.amazon.com/cli/latest/reference/s3api/copy-object.html)
     * - [upload-part-copy](https://docs.aws.amazon.com/cli/latest/reference/s3api/upload-part-copy.html)
     *
     * # Examples
     *
     * - `"someFile.yml"`
     */
    public const val AWS_S3_COPY_SOURCE: String = "aws.s3.copy_source"

    /**
     * The delete request container that specifies the objects to be deleted.
     *
     * ## Notes
     *
     * The `delete` attribute is only applicable to the [delete-object](https://docs.aws.amazon.com/cli/latest/reference/s3api/delete-object.html) operation.
     * The `delete` attribute corresponds to the `--delete` parameter of the
     * [delete-objects operation within the S3 API](https://docs.aws.amazon.com/cli/latest/reference/s3api/delete-objects.html).
     *
     * # Examples
     *
     * - `"Objects=[{Key=string,VersionId=string},{Key=string,VersionId=string}],Quiet=boolean"`
     */
    public const val AWS_S3_DELETE: String = "aws.s3.delete"

    /**
     * The S3 object key the request refers to. Corresponds to the `--key` parameter of the [S3 API](https://docs.aws.amazon.com/cli/latest/reference/s3api/index.html) operations.
     *
     * ## Notes
     *
     * The `key` attribute is applicable to all object-related S3 operations, i.e. that require the object key as a mandatory parameter.
     * This applies in particular to the following operations:
     *
     * - [copy-object](https://docs.aws.amazon.com/cli/latest/reference/s3api/copy-object.html)
     * - [delete-object](https://docs.aws.amazon.com/cli/latest/reference/s3api/delete-object.html)
     * - [get-object](https://docs.aws.amazon.com/cli/latest/reference/s3api/get-object.html)
     * - [head-object](https://docs.aws.amazon.com/cli/latest/reference/s3api/head-object.html)
     * - [put-object](https://docs.aws.amazon.com/cli/latest/reference/s3api/put-object.html)
     * - [restore-object](https://docs.aws.amazon.com/cli/latest/reference/s3api/restore-object.html)
     * - [select-object-content](https://docs.aws.amazon.com/cli/latest/reference/s3api/select-object-content.html)
     * - [abort-multipart-upload](https://docs.aws.amazon.com/cli/latest/reference/s3api/abort-multipart-upload.html)
     * - [complete-multipart-upload](https://docs.aws.amazon.com/cli/latest/reference/s3api/complete-multipart-upload.html)
     * - [create-multipart-upload](https://docs.aws.amazon.com/cli/latest/reference/s3api/create-multipart-upload.html)
     * - [list-parts](https://docs.aws.amazon.com/cli/latest/reference/s3api/list-parts.html)
     * - [upload-part](https://docs.aws.amazon.com/cli/latest/reference/s3api/upload-part.html)
     * - [upload-part-copy](https://docs.aws.amazon.com/cli/latest/reference/s3api/upload-part-copy.html)
     *
     * # Examples
     *
     * - `"someFile.yml"`
     */
    public const val AWS_S3_KEY: String = "aws.s3.key"

    /**
     * The part number of the part being uploaded in a multipart-upload operation. This is a positive integer between 1 and 10,000.
     *
     * ## Notes
     *
     * The `part_number` attribute is only applicable to the [upload-part](https://docs.aws.amazon.com/cli/latest/reference/s3api/upload-part.html)
     * and [upload-part-copy](https://docs.aws.amazon.com/cli/latest/reference/s3api/upload-part-copy.html) operations.
     * The `part_number` attribute corresponds to the `--part-number` parameter of the
     * [upload-part operation within the S3 API](https://docs.aws.amazon.com/cli/latest/reference/s3api/upload-part.html).
     *
     * # Examples
     *
     * - `3456`
     */
    public const val AWS_S3_PART_NUMBER: String = "aws.s3.part_number"

    /**
     * Upload ID that identifies the multipart upload.
     *
     * ## Notes
     *
     * The `upload_id` attribute applies to S3 multipart-upload operations and corresponds to the `--upload-id` parameter
     * of the [S3 API](https://docs.aws.amazon.com/cli/latest/reference/s3api/index.html) multipart operations.
     * This applies in particular to the following operations:
     *
     * - [abort-multipart-upload](https://docs.aws.amazon.com/cli/latest/reference/s3api/abort-multipart-upload.html)
     * - [complete-multipart-upload](https://docs.aws.amazon.com/cli/latest/reference/s3api/complete-multipart-upload.html)
     * - [list-parts](https://docs.aws.amazon.com/cli/latest/reference/s3api/list-parts.html)
     * - [upload-part](https://docs.aws.amazon.com/cli/latest/reference/s3api/upload-part.html)
     * - [upload-part-copy](https://docs.aws.amazon.com/cli/latest/reference/s3api/upload-part-copy.html)
     *
     * # Examples
     *
     * - `"dfRtDYWFbkRONycy.Yxwh66Yjlx.cph0gtNBtJ"`
     */
    public const val AWS_S3_UPLOAD_ID: String = "aws.s3.upload_id"

    /**
     * The ARN of the Secret stored in the Secrets Mangger
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"arn:aws:secretsmanager:us-east-1:123456789012:secret:SecretName-6RandomCharacters"`
     */
    public const val AWS_SECRETSMANAGER_SECRET_ARN: String = "aws.secretsmanager.secret.arn"

    /**
     * The ARN of the AWS SNS Topic. An Amazon SNS [topic](https://docs.aws.amazon.com/sns/latest/dg/sns-create-topic.html) is a logical access point that acts as a communication channel.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"arn:aws:sns:us-east-1:123456789012:mystack-mytopic-NZJ5JSMVGFIE"`
     */
    public const val AWS_SNS_TOPIC_ARN: String = "aws.sns.topic.arn"

    /**
     * The URL of the AWS SQS Queue. It's a unique identifier for a queue in Amazon Simple Queue Service (SQS) and is used to access the queue and perform actions on it.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"https://sqs.us-east-1.amazonaws.com/123456789012/MyQueue"`
     */
    public const val AWS_SQS_QUEUE_URL: String = "aws.sqs.queue.url"

    /**
     * The ARN of the AWS Step Functions Activity.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"arn:aws:states:us-east-1:123456789012:activity:get-greeting"`
     */
    public const val AWS_STEP_FUNCTIONS_ACTIVITY_ARN: String = "aws.step_functions.activity.arn"

    /**
     * The ARN of the AWS Step Functions State Machine.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"arn:aws:states:us-east-1:123456789012:stateMachine:myStateMachine:1"`
     */
    public const val AWS_STEP_FUNCTIONS_STATE_MACHINE_ARN: String = "aws.step_functions.state_machine.arn"

    /**
     * Deprecated, use `azure.resource_provider.namespace` instead.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"Microsoft.Storage"`
     * - `"Microsoft.KeyVault"`
     * - `"Microsoft.ServiceBus"`
     */
    @Deprecated("{note: Replaced by `azure.resource_provider.namespace`., reason: renamed, renamed_to: azure.resource_provider.namespace}")
    public const val AZ_NAMESPACE: String = "az.namespace"

    /**
     * Deprecated, use `azure.service.request.id` instead.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"00000000-0000-0000-0000-000000000000"`
     */
    @Deprecated("{note: Replaced by `azure.service.request.id`., reason: renamed, renamed_to: azure.service.request.id}")
    public const val AZ_SERVICE_REQUEST_ID: String = "az.service_request_id"

    /**
     * The unique identifier of the client instance.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"3ba4827d-4422-483f-b59f-85b74211c11d"`
     * - `"storage-client-1"`
     */
    public const val AZURE_CLIENT_ID: String = "azure.client.id"

    /**
     * Cosmos client connection mode.
     *
     * ## Notes
     */
    public const val AZURE_COSMOSDB_CONNECTION_MODE: String = "azure.cosmosdb.connection.mode"

    /**
     * Account or request [consistency level](https://learn.microsoft.com/azure/cosmos-db/consistency-levels).
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"Eventual"`
     * - `"ConsistentPrefix"`
     * - `"BoundedStaleness"`
     * - `"Strong"`
     * - `"Session"`
     */
    public const val AZURE_COSMOSDB_CONSISTENCY_LEVEL: String = "azure.cosmosdb.consistency.level"

    /**
     * List of regions contacted during operation in the order that they were contacted. If there is more than one region listed, it indicates that the operation was performed on multiple regions i.e. cross-regional call.
     *
     * ## Notes
     *
     * Region name matches the format of `displayName` in [Azure Location API](https://learn.microsoft.com/rest/api/subscription/subscriptions/list-locations?view=rest-subscription-2021-10-01&tabs=HTTP#location)
     *
     * # Examples
     *
     * - `[
     * "North Central US",
     * "Australia East",
     * "Australia Southeast",
     * ]`
     */
    public const val AZURE_COSMOSDB_OPERATION_CONTACTED_REGIONS: String = "azure.cosmosdb.operation.contacted_regions"

    /**
     * The number of request units consumed by the operation.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `46.18`
     * - `1.0`
     */
    public const val AZURE_COSMOSDB_OPERATION_REQUEST_CHARGE: String = "azure.cosmosdb.operation.request_charge"

    /**
     * Request payload size in bytes.
     *
     * ## Notes
     */
    public const val AZURE_COSMOSDB_REQUEST_BODY_SIZE: String = "azure.cosmosdb.request.body.size"

    /**
     * Cosmos DB sub status code.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `1000`
     * - `1002`
     */
    public const val AZURE_COSMOSDB_RESPONSE_SUB_STATUS_CODE: String = "azure.cosmosdb.response.sub_status_code"

    /**
     * [Azure Resource Provider Namespace](https://learn.microsoft.com/azure/azure-resource-manager/management/azure-services-resource-providers) as recognized by the client.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"Microsoft.Storage"`
     * - `"Microsoft.KeyVault"`
     * - `"Microsoft.ServiceBus"`
     */
    public const val AZURE_RESOURCE_PROVIDER_NAMESPACE: String = "azure.resource_provider.namespace"

    /**
     * The unique identifier of the service request. It's generated by the Azure service and returned with the response.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"00000000-0000-0000-0000-000000000000"`
     */
    public const val AZURE_SERVICE_REQUEST_ID: String = "azure.service.request.id"

    /**
     * Array of brand name and version separated by a space
     *
     * ## Notes
     *
     * This value is intended to be taken from the [UA client hints API](https://wicg.github.io/ua-client-hints/#interface) (`navigator.userAgentData.brands`).
     *
     * # Examples
     *
     * - `[
     * " Not A;Brand 99",
     * "Chromium 99",
     * "Chrome 99",
     * ]`
     */
    public const val BROWSER_BRANDS: String = "browser.brands"

    /**
     * Preferred language of the user using the browser
     *
     * ## Notes
     *
     * This value is intended to be taken from the Navigator API `navigator.language`.
     *
     * # Examples
     *
     * - `"en"`
     * - `"en-US"`
     * - `"fr"`
     * - `"fr-FR"`
     */
    public const val BROWSER_LANGUAGE: String = "browser.language"

    /**
     * A boolean that is true if the browser is running on a mobile device
     *
     * ## Notes
     *
     * This value is intended to be taken from the [UA client hints API](https://wicg.github.io/ua-client-hints/#interface) (`navigator.userAgentData.mobile`). If unavailable, this attribute SHOULD be left unset
     */
    public const val BROWSER_MOBILE: String = "browser.mobile"

    /**
     * The platform on which the browser is running
     *
     * ## Notes
     *
     * This value is intended to be taken from the [UA client hints API](https://wicg.github.io/ua-client-hints/#interface) (`navigator.userAgentData.platform`). If unavailable, the legacy `navigator.platform` API SHOULD NOT be used instead and this attribute SHOULD be left unset in order for the values to be consistent.
     * The list of possible values is defined in the [W3C User-Agent Client Hints specification](https://wicg.github.io/ua-client-hints/#sec-ch-ua-platform). Note that some (but not all) of these values can overlap with values in the [`os.type` and `os.name` attributes](./os.md). However, for consistency, the values in the `browser.platform` attribute should capture the exact value that the user agent provides.
     *
     * # Examples
     *
     * - `"Windows"`
     * - `"macOS"`
     * - `"Android"`
     */
    public const val BROWSER_PLATFORM: String = "browser.platform"

    /**
     * The consistency level of the query. Based on consistency values from [CQL](https://docs.datastax.com/en/cassandra-oss/3.0/cassandra/dml/dmlConfigConsistency.html).
     *
     * ## Notes
     */
    public const val CASSANDRA_CONSISTENCY_LEVEL: String = "cassandra.consistency.level"

    /**
     * The data center of the coordinating node for a query.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"us-west-2"`
     */
    public const val CASSANDRA_COORDINATOR_DC: String = "cassandra.coordinator.dc"

    /**
     * The ID of the coordinating node for a query.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"be13faa2-8574-4d71-926d-27f16cf8a7af"`
     */
    public const val CASSANDRA_COORDINATOR_ID: String = "cassandra.coordinator.id"

    /**
     * The fetch size used for paging, i.e. how many rows will be returned at once.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `5000`
     */
    public const val CASSANDRA_PAGE_SIZE: String = "cassandra.page.size"

    /**
     * Whether or not the query is idempotent.
     *
     * ## Notes
     */
    public const val CASSANDRA_QUERY_IDEMPOTENT: String = "cassandra.query.idempotent"

    /**
     * The number of times a query was speculatively executed. Not set or `0` if the query was not executed speculatively.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `0`
     * - `2`
     */
    public const val CASSANDRA_SPECULATIVE_EXECUTION_COUNT: String = "cassandra.speculative_execution.count"

    /**
     * The kind of action a pipeline run is performing.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"BUILD"`
     * - `"RUN"`
     * - `"SYNC"`
     */
    public const val CICD_PIPELINE_ACTION_NAME: String = "cicd.pipeline.action.name"

    /**
     * The human readable name of the pipeline within a CI/CD system.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"Build and Test"`
     * - `"Lint"`
     * - `"Deploy Go Project"`
     * - `"deploy_to_environment"`
     */
    public const val CICD_PIPELINE_NAME: String = "cicd.pipeline.name"

    /**
     * The result of a pipeline run.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"success"`
     * - `"failure"`
     * - `"timeout"`
     * - `"skipped"`
     */
    public const val CICD_PIPELINE_RESULT: String = "cicd.pipeline.result"

    /**
     * The unique identifier of a pipeline run within a CI/CD system.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"120912"`
     */
    public const val CICD_PIPELINE_RUN_ID: String = "cicd.pipeline.run.id"

    /**
     * The pipeline run goes through these states during its lifecycle.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"pending"`
     * - `"executing"`
     * - `"finalizing"`
     */
    public const val CICD_PIPELINE_RUN_STATE: String = "cicd.pipeline.run.state"

    /**
     * The [URL](https://wikipedia.org/wiki/URL) of the pipeline run, providing the complete address in order to locate and identify the pipeline run.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"https://github.com/open-telemetry/semantic-conventions/actions/runs/9753949763?pr=1075"`
     */
    public const val CICD_PIPELINE_RUN_URL_FULL: String = "cicd.pipeline.run.url.full"

    /**
     * The human readable name of a task within a pipeline. Task here most closely aligns with a [computing process](https://wikipedia.org/wiki/Pipeline_(computing)) in a pipeline. Other terms for tasks include commands, steps, and procedures.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"Run GoLang Linter"`
     * - `"Go Build"`
     * - `"go-test"`
     * - `"deploy_binary"`
     */
    public const val CICD_PIPELINE_TASK_NAME: String = "cicd.pipeline.task.name"

    /**
     * The unique identifier of a task run within a pipeline.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"12097"`
     */
    public const val CICD_PIPELINE_TASK_RUN_ID: String = "cicd.pipeline.task.run.id"

    /**
     * The result of a task run.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"success"`
     * - `"failure"`
     * - `"timeout"`
     * - `"skipped"`
     */
    public const val CICD_PIPELINE_TASK_RUN_RESULT: String = "cicd.pipeline.task.run.result"

    /**
     * The [URL](https://wikipedia.org/wiki/URL) of the pipeline task run, providing the complete address in order to locate and identify the pipeline task run.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"https://github.com/open-telemetry/semantic-conventions/actions/runs/9753949763/job/26920038674?pr=1075"`
     */
    public const val CICD_PIPELINE_TASK_RUN_URL_FULL: String = "cicd.pipeline.task.run.url.full"

    /**
     * The type of the task within a pipeline.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"build"`
     * - `"test"`
     * - `"deploy"`
     */
    public const val CICD_PIPELINE_TASK_TYPE: String = "cicd.pipeline.task.type"

    /**
     * The name of a component of the CICD system.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"controller"`
     * - `"scheduler"`
     * - `"agent"`
     */
    public const val CICD_SYSTEM_COMPONENT: String = "cicd.system.component"

    /**
     * The unique identifier of a worker within a CICD system.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"abc123"`
     * - `"10.0.1.2"`
     * - `"controller"`
     */
    public const val CICD_WORKER_ID: String = "cicd.worker.id"

    /**
     * The name of a worker within a CICD system.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"agent-abc"`
     * - `"controller"`
     * - `"Ubuntu LTS"`
     */
    public const val CICD_WORKER_NAME: String = "cicd.worker.name"

    /**
     * The state of a CICD worker / agent.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"idle"`
     * - `"busy"`
     * - `"down"`
     */
    public const val CICD_WORKER_STATE: String = "cicd.worker.state"

    /**
     * The [URL](https://wikipedia.org/wiki/URL) of the worker, providing the complete address in order to locate and identify the worker.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"https://cicd.example.org/worker/abc123"`
     */
    public const val CICD_WORKER_URL_FULL: String = "cicd.worker.url.full"

    /**
     * Client address - domain name if available without reverse DNS lookup; otherwise, IP address or Unix domain socket name.
     *
     * ## Notes
     *
     * When observed from the server side, and when communicating through an intermediary, `client.address` SHOULD represent the client address behind any intermediaries,  for example proxies, if it's available.
     *
     * # Examples
     *
     * - `"client.example.com"`
     * - `"10.1.2.80"`
     * - `"/tmp/my.sock"`
     */
    public const val CLIENT_ADDRESS: String = "client.address"

    /**
     * Client port number.
     *
     * ## Notes
     *
     * When observed from the server side, and when communicating through an intermediary, `client.port` SHOULD represent the client port behind any intermediaries,  for example proxies, if it's available.
     *
     * # Examples
     *
     * - `65123`
     */
    public const val CLIENT_PORT: String = "client.port"

    /**
     * The cloud account ID the resource is assigned to.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"111111111111"`
     * - `"opentelemetry"`
     */
    public const val CLOUD_ACCOUNT_ID: String = "cloud.account.id"

    /**
     * Cloud regions often have multiple, isolated locations known as zones to increase availability. Availability zone represents the zone where the resource is running.
     *
     * ## Notes
     *
     * Availability zones are called "zones" on Alibaba Cloud and Google Cloud.
     *
     * # Examples
     *
     * - `"us-east-1c"`
     */
    public const val CLOUD_AVAILABILITY_ZONE: String = "cloud.availability_zone"

    /**
     * The cloud platform in use.
     *
     * ## Notes
     *
     * The prefix of the service SHOULD match the one specified in `cloud.provider`
     */
    public const val CLOUD_PLATFORM: String = "cloud.platform"

    /**
     * Name of the cloud provider.
     *
     * ## Notes
     */
    public const val CLOUD_PROVIDER: String = "cloud.provider"

    /**
     * The geographical region within a cloud provider. When associated with a resource, this attribute specifies the region where the resource operates. When calling services or APIs deployed on a cloud, this attribute identifies the region where the called destination is deployed.
     *
     * ## Notes
     *
     * Refer to your provider's docs to see the available regions, for example [Alibaba Cloud regions](https://www.alibabacloud.com/help/doc-detail/40654.htm), [AWS regions](https://aws.amazon.com/about-aws/global-infrastructure/regions_az/), [Azure regions](https://azure.microsoft.com/global-infrastructure/geographies/), [Google Cloud regions](https://cloud.google.com/about/locations), or [Tencent Cloud regions](https://www.tencentcloud.com/document/product/213/6091).
     *
     * # Examples
     *
     * - `"us-central1"`
     * - `"us-east-1"`
     */
    public const val CLOUD_REGION: String = "cloud.region"

    /**
     * Cloud provider-specific native identifier of the monitored cloud resource (e.g. an [ARN](https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html) on AWS, a [fully qualified resource ID](https://learn.microsoft.com/rest/api/resources/resources/get-by-id) on Azure, a [full resource name](https://google.aip.dev/122#full-resource-names) on GCP)
     *
     * ## Notes
     *
     * On some cloud providers, it may not be possible to determine the full ID at startup,
     * so it may be necessary to set `cloud.resource_id` as a span attribute instead.
     *
     * The exact value to use for `cloud.resource_id` depends on the cloud provider.
     * The following well-known definitions MUST be used if you set this attribute and they apply:
     *
     * - **AWS Lambda:** The function [ARN](https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html).
     * Take care not to use the "invoked ARN" directly but replace any
     * [alias suffix](https://docs.aws.amazon.com/lambda/latest/dg/configuration-aliases.html)
     * with the resolved function version, as the same runtime instance may be invocable with
     * multiple different aliases.
     * - **GCP:** The [URI of the resource](https://cloud.google.com/iam/docs/full-resource-names)
     * - **Azure:** The [Fully Qualified Resource ID](https://learn.microsoft.com/rest/api/resources/resources/get-by-id) of the invoked function,
     * *not* the function app, having the form
     * `/subscriptions/[SUBSCRIPTION_GUID]/resourceGroups/[RG]/providers/Microsoft.Web/sites/[FUNCAPP]/functions/[FUNC]`.
     * This means that a span attribute MUST be used, as an Azure function app can host multiple functions that would usually share
     * a TracerProvider.
     *
     * # Examples
     *
     * - `"arn:aws:lambda:REGION:ACCOUNT_ID:function:my-function"`
     * - `"//run.googleapis.com/projects/PROJECT_ID/locations/LOCATION_ID/services/SERVICE_ID"`
     * - `"/subscriptions/<SUBSCRIPTION_GUID>/resourceGroups/<RG>/providers/Microsoft.Web/sites/<FUNCAPP>/functions/<FUNC>"`
     */
    public const val CLOUD_RESOURCE_ID: String = "cloud.resource_id"

    /**
     * The [event_id](https://github.com/cloudevents/spec/blob/v1.0.2/cloudevents/spec.md#id) uniquely identifies the event.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"123e4567-e89b-12d3-a456-426614174000"`
     * - `"0001"`
     */
    public const val CLOUDEVENTS_EVENT_ID: String = "cloudevents.event_id"

    /**
     * The [source](https://github.com/cloudevents/spec/blob/v1.0.2/cloudevents/spec.md#source-1) identifies the context in which an event happened.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"https://github.com/cloudevents"`
     * - `"/cloudevents/spec/pull/123"`
     * - `"my-service"`
     */
    public const val CLOUDEVENTS_EVENT_SOURCE: String = "cloudevents.event_source"

    /**
     * The [version of the CloudEvents specification](https://github.com/cloudevents/spec/blob/v1.0.2/cloudevents/spec.md#specversion) which the event uses.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"1.0"`
     */
    public const val CLOUDEVENTS_EVENT_SPEC_VERSION: String = "cloudevents.event_spec_version"

    /**
     * The [subject](https://github.com/cloudevents/spec/blob/v1.0.2/cloudevents/spec.md#subject) of the event in the context of the event producer (identified by source).
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"mynewfile.jpg"`
     */
    public const val CLOUDEVENTS_EVENT_SUBJECT: String = "cloudevents.event_subject"

    /**
     * The [event_type](https://github.com/cloudevents/spec/blob/v1.0.2/cloudevents/spec.md#type) contains a value describing the type of event related to the originating occurrence.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"com.github.pull_request.opened"`
     * - `"com.example.object.deleted.v2"`
     */
    public const val CLOUDEVENTS_EVENT_TYPE: String = "cloudevents.event_type"

    /**
     * The guid of the application.
     *
     * ## Notes
     *
     * Application instrumentation should use the value from environment
     * variable `VCAP_APPLICATION.application_id`. This is the same value as
     * reported by `cf app [app-name] --guid`.
     *
     * # Examples
     *
     * - `"218fc5a9-a5f1-4b54-aa05-46717d0ab26d"`
     */
    public const val CLOUDFOUNDRY_APP_ID: String = "cloudfoundry.app.id"

    /**
     * The index of the application instance. 0 when just one instance is active.
     *
     * ## Notes
     *
     * CloudFoundry defines the `instance_id` in the [Loggregator v2 envelope](https://github.com/cloudfoundry/loggregator-api#v2-envelope).
     * It is used for logs and metrics emitted by CloudFoundry. It is
     * supposed to contain the application instance index for applications
     * deployed on the runtime.
     *
     * Application instrumentation should use the value from environment
     * variable `CF_INSTANCE_INDEX`.
     *
     * # Examples
     *
     * - `"0"`
     * - `"1"`
     */
    public const val CLOUDFOUNDRY_APP_INSTANCE_ID: String = "cloudfoundry.app.instance.id"

    /**
     * The name of the application.
     *
     * ## Notes
     *
     * Application instrumentation should use the value from environment
     * variable `VCAP_APPLICATION.application_name`. This is the same value
     * as reported by `cf apps`.
     *
     * # Examples
     *
     * - `"my-app-name"`
     */
    public const val CLOUDFOUNDRY_APP_NAME: String = "cloudfoundry.app.name"

    /**
     * The guid of the CloudFoundry org the application is running in.
     *
     * ## Notes
     *
     * Application instrumentation should use the value from environment
     * variable `VCAP_APPLICATION.org_id`. This is the same value as
     * reported by `cf org [org-name] --guid`.
     *
     * # Examples
     *
     * - `"218fc5a9-a5f1-4b54-aa05-46717d0ab26d"`
     */
    public const val CLOUDFOUNDRY_ORG_ID: String = "cloudfoundry.org.id"

    /**
     * The name of the CloudFoundry organization the app is running in.
     *
     * ## Notes
     *
     * Application instrumentation should use the value from environment
     * variable `VCAP_APPLICATION.org_name`. This is the same value as
     * reported by `cf orgs`.
     *
     * # Examples
     *
     * - `"my-org-name"`
     */
    public const val CLOUDFOUNDRY_ORG_NAME: String = "cloudfoundry.org.name"

    /**
     * The UID identifying the process.
     *
     * ## Notes
     *
     * Application instrumentation should use the value from environment
     * variable `VCAP_APPLICATION.process_id`. It is supposed to be equal to
     * `VCAP_APPLICATION.app_id` for applications deployed to the runtime.
     * For system components, this could be the actual PID.
     *
     * # Examples
     *
     * - `"218fc5a9-a5f1-4b54-aa05-46717d0ab26d"`
     */
    public const val CLOUDFOUNDRY_PROCESS_ID: String = "cloudfoundry.process.id"

    /**
     * The type of process.
     *
     * ## Notes
     *
     * CloudFoundry applications can consist of multiple jobs. Usually the
     * main process will be of type `web`. There can be additional background
     * tasks or side-cars with different process types.
     *
     * # Examples
     *
     * - `"web"`
     */
    public const val CLOUDFOUNDRY_PROCESS_TYPE: String = "cloudfoundry.process.type"

    /**
     * The guid of the CloudFoundry space the application is running in.
     *
     * ## Notes
     *
     * Application instrumentation should use the value from environment
     * variable `VCAP_APPLICATION.space_id`. This is the same value as
     * reported by `cf space [space-name] --guid`.
     *
     * # Examples
     *
     * - `"218fc5a9-a5f1-4b54-aa05-46717d0ab26d"`
     */
    public const val CLOUDFOUNDRY_SPACE_ID: String = "cloudfoundry.space.id"

    /**
     * The name of the CloudFoundry space the application is running in.
     *
     * ## Notes
     *
     * Application instrumentation should use the value from environment
     * variable `VCAP_APPLICATION.space_name`. This is the same value as
     * reported by `cf spaces`.
     *
     * # Examples
     *
     * - `"my-space-name"`
     */
    public const val CLOUDFOUNDRY_SPACE_NAME: String = "cloudfoundry.space.name"

    /**
     * A guid or another name describing the event source.
     *
     * ## Notes
     *
     * CloudFoundry defines the `source_id` in the [Loggregator v2 envelope](https://github.com/cloudfoundry/loggregator-api#v2-envelope).
     * It is used for logs and metrics emitted by CloudFoundry. It is
     * supposed to contain the component name, e.g. "gorouter", for
     * CloudFoundry components.
     *
     * When system components are instrumented, values from the
     * [Bosh spec](https://bosh.io/docs/jobs/#properties-spec)
     * should be used. The `system.id` should be set to
     * `spec.deployment/spec.name`.
     *
     * # Examples
     *
     * - `"cf/gorouter"`
     */
    public const val CLOUDFOUNDRY_SYSTEM_ID: String = "cloudfoundry.system.id"

    /**
     * A guid describing the concrete instance of the event source.
     *
     * ## Notes
     *
     * CloudFoundry defines the `instance_id` in the [Loggregator v2 envelope](https://github.com/cloudfoundry/loggregator-api#v2-envelope).
     * It is used for logs and metrics emitted by CloudFoundry. It is
     * supposed to contain the vm id for CloudFoundry components.
     *
     * When system components are instrumented, values from the
     * [Bosh spec](https://bosh.io/docs/jobs/#properties-spec)
     * should be used. The `system.instance.id` should be set to `spec.id`.
     *
     * # Examples
     *
     * - `"218fc5a9-a5f1-4b54-aa05-46717d0ab26d"`
     */
    public const val CLOUDFOUNDRY_SYSTEM_INSTANCE_ID: String = "cloudfoundry.system.instance.id"

    /**
     * Deprecated, use `code.column.number`
     *
     * ## Notes
     *
     * # Examples
     *
     * - `16`
     */
    @Deprecated("{note: Replaced by `code.column.number`., reason: renamed, renamed_to: code.column.number}")
    public const val CODE_COLUMN: String = "code.column"

    /**
     * The column number in `code.file.path` best representing the operation. It SHOULD point within the code unit named in `code.function.name`. This attribute MUST NOT be used on the Profile signal since the data is already captured in 'message Line'. This constraint is imposed to prevent redundancy and maintain data integrity.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `16`
     */
    public const val CODE_COLUMN_NUMBER: String = "code.column.number"

    /**
     * The source code file name that identifies the code unit as uniquely as possible (preferably an absolute file path). This attribute MUST NOT be used on the Profile signal since the data is already captured in 'message Function'. This constraint is imposed to prevent redundancy and maintain data integrity.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"/usr/local/MyApplication/content_root/app/index.php"`
     */
    public const val CODE_FILE_PATH: String = "code.file.path"

    /**
     * Deprecated, use `code.file.path` instead
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"/usr/local/MyApplication/content_root/app/index.php"`
     */
    @Deprecated("{note: Replaced by `code.file.path`., reason: renamed, renamed_to: code.file.path}")
    public const val CODE_FILEPATH: String = "code.filepath"

    /**
     * Deprecated, use `code.function.name` instead
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"serveRequest"`
     */
    @Deprecated("{note: Value should be included in `code.function.name` which is expected to be a fully-qualified name.\n, reason: uncategorized}")
    public const val CODE_FUNCTION: String = "code.function"

    /**
     * The method or function fully-qualified name without arguments. The value should fit the natural representation of the language runtime, which is also likely the same used within `code.stacktrace` attribute value. This attribute MUST NOT be used on the Profile signal since the data is already captured in 'message Function'. This constraint is imposed to prevent redundancy and maintain data integrity.
     *
     * ## Notes
     *
     * Values and format depends on each language runtime, thus it is impossible to provide an exhaustive list of examples.
     * The values are usually the same (or prefixes of) the ones found in native stack trace representation stored in
     * `code.stacktrace` without information on arguments.
     *
     * Examples:
     *
     * - Java method: `com.example.MyHttpService.serveRequest`
     * - Java anonymous class method: `com.mycompany.Main\$1.myMethod`
     * - Java lambda method: `com.mycompany.Main\$\$Lambda/0x0000748ae4149c00.myMethod`
     * - PHP function: `GuzzleHttp\Client::transfer`
     * - Go function: `github.com/my/repo/pkg.foo.func5`
     * - Elixir: `OpenTelemetry.Ctx.new`
     * - Erlang: `opentelemetry_ctx:new`
     * - Rust: `playground::my_module::my_cool_func`
     * - C function: `fopen`
     *
     * # Examples
     *
     * - `"com.example.MyHttpService.serveRequest"`
     * - `"GuzzleHttp\\Client::transfer"`
     * - `"fopen"`
     */
    public const val CODE_FUNCTION_NAME: String = "code.function.name"

    /**
     * The line number in `code.file.path` best representing the operation. It SHOULD point within the code unit named in `code.function.name`. This attribute MUST NOT be used on the Profile signal since the data is already captured in 'message Line'. This constraint is imposed to prevent redundancy and maintain data integrity.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `42`
     */
    public const val CODE_LINE_NUMBER: String = "code.line.number"

    /**
     * Deprecated, use `code.line.number` instead
     *
     * ## Notes
     *
     * # Examples
     *
     * - `42`
     */
    @Deprecated("{note: Replaced by `code.line.number`., reason: renamed, renamed_to: code.line.number}")
    public const val CODE_LINENO: String = "code.lineno"

    /**
     * Deprecated, namespace is now included into `code.function.name`
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"com.example.MyHttpService"`
     */
    @Deprecated("{note: Value should be included in `code.function.name` which is expected to be a fully-qualified name.\n, reason: uncategorized}")
    public const val CODE_NAMESPACE: String = "code.namespace"

    /**
     * A stacktrace as a string in the natural representation for the language runtime. The representation is identical to [`exception.stacktrace`](/docs/exceptions/exceptions-spans.md#stacktrace-representation). This attribute MUST NOT be used on the Profile signal since the data is already captured in 'message Location'. This constraint is imposed to prevent redundancy and maintain data integrity.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"at com.example.GenerateTrace.methodB(GenerateTrace.java:13)\\n at com.example.GenerateTrace.methodA(GenerateTrace.java:9)\\n at com.example.GenerateTrace.main(GenerateTrace.java:5)\n"`
     */
    public const val CODE_STACKTRACE: String = "code.stacktrace"

    /**
     * The command used to run the container (i.e. the command name).
     *
     * ## Notes
     *
     * If using embedded credentials or sensitive data, it is recommended to remove them to prevent potential leakage.
     *
     * # Examples
     *
     * - `"otelcontribcol"`
     */
    public const val CONTAINER_COMMAND: String = "container.command"

    /**
     * All the command arguments (including the command/executable itself) run by the container.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `[
     * "otelcontribcol",
     * "--config",
     * "config.yaml",
     * ]`
     */
    public const val CONTAINER_COMMAND_ARGS: String = "container.command_args"

    /**
     * The full command run by the container as a single string representing the full command.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"otelcontribcol --config config.yaml"`
     */
    public const val CONTAINER_COMMAND_LINE: String = "container.command_line"

    /**
     * Deprecated, use `cpu.mode` instead.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"user"`
     * - `"kernel"`
     */
    @Deprecated("{note: Replaced by `cpu.mode`., reason: renamed, renamed_to: cpu.mode}")
    public const val CONTAINER_CPU_STATE: String = "container.cpu.state"

    /**
     * The name of the CSI ([Container Storage Interface](https://github.com/container-storage-interface/spec)) plugin used by the volume.
     *
     * ## Notes
     *
     * This can sometimes be referred to as a "driver" in CSI implementations. This should represent the `name` field of the GetPluginInfo RPC.
     *
     * # Examples
     *
     * - `"pd.csi.storage.gke.io"`
     */
    public const val CONTAINER_CSI_PLUGIN_NAME: String = "container.csi.plugin.name"

    /**
     * The unique volume ID returned by the CSI ([Container Storage Interface](https://github.com/container-storage-interface/spec)) plugin.
     *
     * ## Notes
     *
     * This can sometimes be referred to as a "volume handle" in CSI implementations. This should represent the `Volume.volume_id` field in CSI spec.
     *
     * # Examples
     *
     * - `"projects/my-gcp-project/zones/my-gcp-zone/disks/my-gcp-disk"`
     */
    public const val CONTAINER_CSI_VOLUME_ID: String = "container.csi.volume.id"

    /**
     * Container ID. Usually a UUID, as for example used to [identify Docker containers](https://docs.docker.com/engine/containers/run/#container-identification). The UUID might be abbreviated.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"a3bf90e006b2"`
     */
    public const val CONTAINER_ID: String = "container.id"

    /**
     * Runtime specific image identifier. Usually a hash algorithm followed by a UUID.
     *
     * ## Notes
     *
     * Docker defines a sha256 of the image id; `container.image.id` corresponds to the `Image` field from the Docker container inspect [API](https://docs.docker.com/engine/api/v1.43/#tag/Container/operation/ContainerInspect) endpoint.
     * K8s defines a link to the container registry repository with digest `"imageID": "registry.azurecr.io /namespace/service/dockerfile@sha256:bdeabd40c3a8a492eaf9e8e44d0ebbb84bac7ee25ac0cf8a7159d25f62555625"`.
     * The ID is assigned by the container runtime and can vary in different environments. Consider using `oci.manifest.digest` if it is important to identify the same image in different environments/runtimes.
     *
     * # Examples
     *
     * - `"sha256:19c92d0a00d1b66d897bceaa7319bee0dd38a10a851c60bcec9474aa3f01e50f"`
     */
    public const val CONTAINER_IMAGE_ID: String = "container.image.id"

    /**
     * Name of the image the container was built on.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"gcr.io/opentelemetry/operator"`
     */
    public const val CONTAINER_IMAGE_NAME: String = "container.image.name"

    /**
     * Repo digests of the container image as provided by the container runtime.
     *
     * ## Notes
     *
     * [Docker](https://docs.docker.com/engine/api/v1.43/#tag/Image/operation/ImageInspect) and [CRI](https://github.com/kubernetes/cri-api/blob/c75ef5b473bbe2d0a4fc92f82235efd665ea8e9f/pkg/apis/runtime/v1/api.proto#L1237-L1238) report those under the `RepoDigests` field.
     *
     * # Examples
     *
     * - `[
     * "example@sha256:afcc7f1ac1b49db317a7196c902e61c6c3c4607d63599ee1a82d702d249a0ccb",
     * "internal.registry.example.com:5000/example@sha256:b69959407d21e8a062e0416bf13405bb2b71ed7a84dde4158ebafacfa06f5578",
     * ]`
     */
    public const val CONTAINER_IMAGE_REPO_DIGESTS: String = "container.image.repo_digests"

    /**
     * Container image tags. An example can be found in [Docker Image Inspect](https://docs.docker.com/engine/api/v1.43/#tag/Image/operation/ImageInspect). Should be only the `<tag>` section of the full name for example from `registry.example.com/my-org/my-image:<tag>`.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `[
     * "v1.27.1",
     * "3.5.7-0",
     * ]`
     */
    public const val CONTAINER_IMAGE_TAGS: String = "container.image.tags"

    /**
     * Container labels, ``key`` being the label name, the value being the label value.
     *
     * ## Notes
     *
     * For example, a docker container label `app` with value `nginx` SHOULD be recorded as the `container.label.app` attribute with value `"nginx"`.
     *
     * # Examples
     *
     * - `"nginx"`
     */
    public const val CONTAINER_LABEL: String = "container.label"

    /**
     * Deprecated, use `container.label` instead.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"nginx"`
     */
    @Deprecated("{note: Replaced by `container.label`., reason: renamed, renamed_to: container.label}")
    public const val CONTAINER_LABELS: String = "container.labels"

    /**
     * Container name used by container runtime.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"opentelemetry-autoconf"`
     */
    public const val CONTAINER_NAME: String = "container.name"

    /**
     * The container runtime managing this container.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"docker"`
     * - `"containerd"`
     * - `"rkt"`
     */
    public const val CONTAINER_RUNTIME: String = "container.runtime"

    /**
     * The logical CPU number \[0..n-1\]
     *
     * ## Notes
     *
     * # Examples
     *
     * - `1`
     */
    public const val CPU_LOGICAL_NUMBER: String = "cpu.logical_number"

    /**
     * The mode of the CPU
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"user"`
     * - `"system"`
     */
    public const val CPU_MODE: String = "cpu.mode"

    /**
     * Value of the garbage collector collection generation.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `0`
     * - `1`
     * - `2`
     */
    public const val CPYTHON_GC_GENERATION: String = "cpython.gc.generation"

    /**
     * Deprecated, use `cassandra.consistency.level` instead.
     *
     * ## Notes
     */
    @Deprecated("{note: Replaced by `cassandra.consistency.level`., reason: renamed, renamed_to: cassandra.consistency.level}")
    public const val DB_CASSANDRA_CONSISTENCY_LEVEL: String = "db.cassandra.consistency_level"

    /**
     * Deprecated, use `cassandra.coordinator.dc` instead.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"us-west-2"`
     */
    @Deprecated("{note: Replaced by `cassandra.coordinator.dc`., reason: renamed, renamed_to: cassandra.coordinator.dc}")
    public const val DB_CASSANDRA_COORDINATOR_DC: String = "db.cassandra.coordinator.dc"

    /**
     * Deprecated, use `cassandra.coordinator.id` instead.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"be13faa2-8574-4d71-926d-27f16cf8a7af"`
     */
    @Deprecated("{note: Replaced by `cassandra.coordinator.id`., reason: renamed, renamed_to: cassandra.coordinator.id}")
    public const val DB_CASSANDRA_COORDINATOR_ID: String = "db.cassandra.coordinator.id"

    /**
     * Deprecated, use `cassandra.query.idempotent` instead.
     *
     * ## Notes
     */
    @Deprecated("{note: Replaced by `cassandra.query.idempotent`., reason: renamed, renamed_to: cassandra.query.idempotent}")
    public const val DB_CASSANDRA_IDEMPOTENCE: String = "db.cassandra.idempotence"

    /**
     * Deprecated, use `cassandra.page.size` instead.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `5000`
     */
    @Deprecated("{note: Replaced by `cassandra.page.size`., reason: renamed, renamed_to: cassandra.page.size}")
    public const val DB_CASSANDRA_PAGE_SIZE: String = "db.cassandra.page_size"

    /**
     * Deprecated, use `cassandra.speculative_execution.count` instead.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `0`
     * - `2`
     */
    @Deprecated("{note: Replaced by `cassandra.speculative_execution.count`., reason: renamed, renamed_to: cassandra.speculative_execution.count}")
    public const val DB_CASSANDRA_SPECULATIVE_EXECUTION_COUNT: String = "db.cassandra.speculative_execution_count"

    /**
     * Deprecated, use `db.collection.name` instead.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"mytable"`
     */
    @Deprecated("{note: Replaced by `db.collection.name`., reason: renamed, renamed_to: db.collection.name}")
    public const val DB_CASSANDRA_TABLE: String = "db.cassandra.table"

    /**
     * The name of the connection pool; unique within the instrumented application. In case the connection pool implementation doesn't provide a name, instrumentation SHOULD use a combination of parameters that would make the name unique, for example, combining attributes `server.address`, `server.port`, and `db.namespace`, formatted as `server.address:server.port/db.namespace`. Instrumentations that generate connection pool name following different patterns SHOULD document it.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"myDataSource"`
     */
    public const val DB_CLIENT_CONNECTION_POOL_NAME: String = "db.client.connection.pool.name"

    /**
     * The state of a connection in the pool
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"idle"`
     */
    public const val DB_CLIENT_CONNECTION_STATE: String = "db.client.connection.state"

    /**
     * Deprecated, use `db.client.connection.pool.name` instead.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"myDataSource"`
     */
    @Deprecated("{note: Replaced by `db.client.connection.pool.name`., reason: renamed, renamed_to: db.client.connection.pool.name}")
    public const val DB_CLIENT_CONNECTIONS_POOL_NAME: String = "db.client.connections.pool.name"

    /**
     * Deprecated, use `db.client.connection.state` instead.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"idle"`
     */
    @Deprecated("{note: Replaced by `db.client.connection.state`., reason: renamed, renamed_to: db.client.connection.state}")
    public const val DB_CLIENT_CONNECTIONS_STATE: String = "db.client.connections.state"

    /**
     * The name of a collection (table, container) within the database.
     *
     * ## Notes
     *
     * It is RECOMMENDED to capture the value as provided by the application
     * without attempting to do any case normalization.
     *
     * The collection name SHOULD NOT be extracted from `db.query.text`,
     * when the database system supports query text with multiple collections
     * in non-batch operations.
     *
     * For batch operations, if the individual operations are known to have the same
     * collection name then that collection name SHOULD be used.
     *
     * # Examples
     *
     * - `"public.users"`
     * - `"customers"`
     */
    public const val DB_COLLECTION_NAME: String = "db.collection.name"

    /**
     * Deprecated, use `server.address`, `server.port` attributes instead.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"Server=(localdb)\\v11.0;Integrated Security=true;"`
     */
    @Deprecated("{note: Replaced by `server.address` and `server.port`.\n, reason: uncategorized}")
    public const val DB_CONNECTION_STRING: String = "db.connection_string"

    /**
     * Deprecated, use `azure.client.id` instead.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"3ba4827d-4422-483f-b59f-85b74211c11d"`
     */
    @Deprecated("{note: Replaced by `azure.client.id`., reason: renamed, renamed_to: azure.client.id}")
    public const val DB_COSMOSDB_CLIENT_ID: String = "db.cosmosdb.client_id"

    /**
     * Deprecated, use `azure.cosmosdb.connection.mode` instead.
     *
     * ## Notes
     */
    @Deprecated("{note: Replaced by `azure.cosmosdb.connection.mode`., reason: renamed, renamed_to: azure.cosmosdb.connection.mode}")
    public const val DB_COSMOSDB_CONNECTION_MODE: String = "db.cosmosdb.connection_mode"

    /**
     * Deprecated, use `cosmosdb.consistency.level` instead.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"Eventual"`
     * - `"ConsistentPrefix"`
     * - `"BoundedStaleness"`
     * - `"Strong"`
     * - `"Session"`
     */
    @Deprecated("{note: Replaced by `azure.cosmosdb.consistency.level`., reason: renamed, renamed_to: azure.cosmosdb.consistency.level}")
    public const val DB_COSMOSDB_CONSISTENCY_LEVEL: String = "db.cosmosdb.consistency_level"

    /**
     * Deprecated, use `db.collection.name` instead.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"mytable"`
     */
    @Deprecated("{note: Replaced by `db.collection.name`., reason: renamed, renamed_to: db.collection.name}")
    public const val DB_COSMOSDB_CONTAINER: String = "db.cosmosdb.container"

    /**
     * Deprecated, no replacement at this time.
     *
     * ## Notes
     */
    @Deprecated("{note: Removed, no replacement at this time.\n, reason: obsoleted}")
    public const val DB_COSMOSDB_OPERATION_TYPE: String = "db.cosmosdb.operation_type"

    /**
     * Deprecated, use `azure.cosmosdb.operation.contacted_regions` instead.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `[
     * "North Central US",
     * "Australia East",
     * "Australia Southeast",
     * ]`
     */
    @Deprecated("{note: Replaced by `azure.cosmosdb.operation.contacted_regions`., reason: renamed, renamed_to: azure.cosmosdb.operation.contacted_regions}")
    public const val DB_COSMOSDB_REGIONS_CONTACTED: String = "db.cosmosdb.regions_contacted"

    /**
     * Deprecated, use `azure.cosmosdb.operation.request_charge` instead.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `46.18`
     * - `1.0`
     */
    @Deprecated("{note: Replaced by `azure.cosmosdb.operation.request_charge`., reason: renamed, renamed_to: azure.cosmosdb.operation.request_charge}")
    public const val DB_COSMOSDB_REQUEST_CHARGE: String = "db.cosmosdb.request_charge"

    /**
     * Deprecated, use `azure.cosmosdb.request.body.size` instead.
     *
     * ## Notes
     */
    @Deprecated("{note: Replaced by `azure.cosmosdb.request.body.size`., reason: renamed, renamed_to: azure.cosmosdb.request.body.size}")
    public const val DB_COSMOSDB_REQUEST_CONTENT_LENGTH: String = "db.cosmosdb.request_content_length"

    /**
     * Deprecated, use `db.response.status_code` instead.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `200`
     * - `201`
     */
    @Deprecated("{note: Replaced by `db.response.status_code`., reason: renamed, renamed_to: db.response.status_code}")
    public const val DB_COSMOSDB_STATUS_CODE: String = "db.cosmosdb.status_code"

    /**
     * Deprecated, use `azure.cosmosdb.response.sub_status_code` instead.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `1000`
     * - `1002`
     */
    @Deprecated("{note: Replaced by `azure.cosmosdb.response.sub_status_code`., reason: renamed, renamed_to: azure.cosmosdb.response.sub_status_code}")
    public const val DB_COSMOSDB_SUB_STATUS_CODE: String = "db.cosmosdb.sub_status_code"

    /**
     * Deprecated, use `db.namespace` instead.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"e9106fc68e3044f0b1475b04bf4ffd5f"`
     */
    @Deprecated("{note: Replaced by `db.namespace`., reason: renamed, renamed_to: db.namespace}")
    public const val DB_ELASTICSEARCH_CLUSTER_NAME: String = "db.elasticsearch.cluster.name"

    /**
     * Deprecated, use `elasticsearch.node.name` instead.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"instance-0000000001"`
     */
    @Deprecated("{note: Replaced by `elasticsearch.node.name`., reason: renamed, renamed_to: elasticsearch.node.name}")
    public const val DB_ELASTICSEARCH_NODE_NAME: String = "db.elasticsearch.node.name"

    /**
     * Deprecated, use `db.operation.parameter` instead.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"test-index"`
     * - `"123"`
     */
    @Deprecated("{note: Replaced by `db.operation.parameter`., reason: renamed, renamed_to: db.operation.parameter}")
    public const val DB_ELASTICSEARCH_PATH_PARTS: String = "db.elasticsearch.path_parts"

    /**
     * Deprecated, no general replacement at this time. For Elasticsearch, use `db.elasticsearch.node.name` instead.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"mysql-e26b99z.example.com"`
     */
    @Deprecated("{note: Removed, no general replacement at this time. For Elasticsearch, use `db.elasticsearch.node.name` instead.\n, reason: obsoleted}")
    public const val DB_INSTANCE_ID: String = "db.instance.id"

    /**
     * Removed, no replacement at this time.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"org.postgresql.Driver"`
     * - `"com.microsoft.sqlserver.jdbc.SQLServerDriver"`
     */
    @Deprecated("{note: Removed, no replacement at this time.\n, reason: obsoleted}")
    public const val DB_JDBC_DRIVER_CLASSNAME: String = "db.jdbc.driver_classname"

    /**
     * Deprecated, use `db.collection.name` instead.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"mytable"`
     */
    @Deprecated("{note: Replaced by `db.collection.name`., reason: renamed, renamed_to: db.collection.name}")
    public const val DB_MONGODB_COLLECTION: String = "db.mongodb.collection"

    /**
     * Deprecated, SQL Server instance is now populated as a part of `db.namespace` attribute.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"MSSQLSERVER"`
     */
    @Deprecated("{note: Removed, no replacement at this time., reason: obsoleted}")
    public const val DB_MSSQL_INSTANCE_NAME: String = "db.mssql.instance_name"

    /**
     * Deprecated, use `db.namespace` instead.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"customers"`
     * - `"main"`
     */
    @Deprecated("{note: Replaced by `db.namespace`., reason: renamed, renamed_to: db.namespace}")
    public const val DB_NAME: String = "db.name"

    /**
     * The name of the database, fully qualified within the server address and port.
     *
     * ## Notes
     *
     * If a database system has multiple namespace components, they SHOULD be concatenated from the most general to the most specific namespace component, using `|` as a separator between the components. Any missing components (and their associated separators) SHOULD be omitted.
     * Semantic conventions for individual database systems SHOULD document what `db.namespace` means in the context of that system.
     * It is RECOMMENDED to capture the value as provided by the application without attempting to do any case normalization.
     *
     * # Examples
     *
     * - `"customers"`
     * - `"test.users"`
     */
    public const val DB_NAMESPACE: String = "db.namespace"

    /**
     * Deprecated, use `db.operation.name` instead.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"findAndModify"`
     * - `"HMSET"`
     * - `"SELECT"`
     */
    @Deprecated("{note: Replaced by `db.operation.name`., reason: renamed, renamed_to: db.operation.name}")
    public const val DB_OPERATION: String = "db.operation"

    /**
     * The number of queries included in a batch operation.
     *
     * ## Notes
     *
     * Operations are only considered batches when they contain two or more operations, and so `db.operation.batch.size` SHOULD never be `1`.
     *
     * # Examples
     *
     * - `2`
     * - `3`
     * - `4`
     */
    public const val DB_OPERATION_BATCH_SIZE: String = "db.operation.batch.size"

    /**
     * The name of the operation or command being executed.
     *
     * ## Notes
     *
     * It is RECOMMENDED to capture the value as provided by the application
     * without attempting to do any case normalization.
     *
     * The operation name SHOULD NOT be extracted from `db.query.text`,
     * when the database system supports query text with multiple operations
     * in non-batch operations.
     *
     * If spaces can occur in the operation name, multiple consecutive spaces
     * SHOULD be normalized to a single space.
     *
     * For batch operations, if the individual operations are known to have the same operation name
     * then that operation name SHOULD be used prepended by `BATCH `,
     * otherwise `db.operation.name` SHOULD be `BATCH` or some other database
     * system specific term if more applicable.
     *
     * # Examples
     *
     * - `"findAndModify"`
     * - `"HMSET"`
     * - `"SELECT"`
     */
    public const val DB_OPERATION_NAME: String = "db.operation.name"

    /**
     * A database operation parameter, with ``key`` being the parameter name, and the attribute value being a string representation of the parameter value.
     *
     * ## Notes
     *
     * For example, a client-side maximum number of rows to read from the database
     * MAY be recorded as the `db.operation.parameter.max_rows` attribute.
     *
     * `db.query.text` parameters SHOULD be captured using `db.query.parameter.[key]`
     * instead of `db.operation.parameter.[key]`.
     *
     * # Examples
     *
     * - `"someval"`
     * - `"55"`
     */
    public const val DB_OPERATION_PARAMETER: String = "db.operation.parameter"

    /**
     * A database query parameter, with ``key`` being the parameter name, and the attribute value being a string representation of the parameter value.
     *
     * ## Notes
     *
     * If a query parameter has no name and instead is referenced only by index,
     * then `[key]` SHOULD be the 0-based index.
     *
     * `db.query.parameter.[key]` SHOULD match
     * up with the parameterized placeholders present in `db.query.text`.
     *
     * `db.query.parameter.[key]` SHOULD NOT be captured on batch operations.
     *
     * Examples:
     *
     * - For a query `SELECT * FROM users where username =  %s` with the parameter `"jdoe"`,
     * the attribute `db.query.parameter.0` SHOULD be set to `"jdoe"`.
     * - For a query `"SELECT * FROM users WHERE username = %(username)s;` with parameter
     * `username = "jdoe"`, the attribute `db.query.parameter.username` SHOULD be set to `"jdoe"`.
     *
     * # Examples
     *
     * - `"someval"`
     * - `"55"`
     */
    public const val DB_QUERY_PARAMETER: String = "db.query.parameter"

    /**
     * Low cardinality summary of a database query.
     *
     * ## Notes
     *
     * The query summary describes a class of database queries and is useful
     * as a grouping key, especially when analyzing telemetry for database
     * calls involving complex queries.
     *
     * Summary may be available to the instrumentation through
     * instrumentation hooks or other means. If it is not available, instrumentations
     * that support query parsing SHOULD generate a summary following
     * [Generating query summary](/docs/database/database-spans.md#generating-a-summary-of-the-query)
     * section.
     *
     * # Examples
     *
     * - `"SELECT wuser_table"`
     * - `"INSERT shipping_details SELECT orders"`
     * - `"get user by id"`
     */
    public const val DB_QUERY_SUMMARY: String = "db.query.summary"

    /**
     * The database query being executed.
     *
     * ## Notes
     *
     * For sanitization see [Sanitization of `db.query.text`](/docs/database/database-spans.md#sanitization-of-dbquerytext).
     * For batch operations, if the individual operations are known to have the same query text then that query text SHOULD be used, otherwise all of the individual query texts SHOULD be concatenated with separator `; ` or some other database system specific separator if more applicable.
     * Parameterized query text SHOULD NOT be sanitized. Even though parameterized query text can potentially have sensitive data, by using a parameterized query the user is giving a strong signal that any sensitive data will be passed as parameter values, and the benefit to observability of capturing the static part of the query text by default outweighs the risk.
     *
     * # Examples
     *
     * - `"SELECT * FROM wuser_table where username = ?"`
     * - `"SET mykey ?"`
     */
    public const val DB_QUERY_TEXT: String = "db.query.text"

    /**
     * Deprecated, use `db.namespace` instead.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `0`
     * - `1`
     * - `15`
     */
    @Deprecated("{note: Replaced by `db.namespace`., reason: renamed, renamed_to: db.namespace}")
    public const val DB_REDIS_DATABASE_INDEX: String = "db.redis.database_index"

    /**
     * Number of rows returned by the operation.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `10`
     * - `30`
     * - `1000`
     */
    public const val DB_RESPONSE_RETURNED_ROWS: String = "db.response.returned_rows"

    /**
     * Database response status code.
     *
     * ## Notes
     *
     * The status code returned by the database. Usually it represents an error code, but may also represent partial success, warning, or differentiate between various types of successful outcomes.
     * Semantic conventions for individual database systems SHOULD document what `db.response.status_code` means in the context of that system.
     *
     * # Examples
     *
     * - `"102"`
     * - `"ORA-17002"`
     * - `"08P01"`
     * - `"404"`
     */
    public const val DB_RESPONSE_STATUS_CODE: String = "db.response.status_code"

    /**
     * Deprecated, use `db.collection.name` instead.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"mytable"`
     */
    @Deprecated("{note: Replaced by `db.collection.name`, but only if not extracting the value from `db.query.text`., reason: uncategorized}")
    public const val DB_SQL_TABLE: String = "db.sql.table"

    /**
     * The database statement being executed.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"SELECT * FROM wuser_table"`
     * - `"SET mykey \"WuValue\""`
     */
    @Deprecated("{note: Replaced by `db.query.text`., reason: renamed, renamed_to: db.query.text}")
    public const val DB_STATEMENT: String = "db.statement"

    /**
     * The name of a stored procedure within the database.
     *
     * ## Notes
     *
     * It is RECOMMENDED to capture the value as provided by the application
     * without attempting to do any case normalization.
     *
     * For batch operations, if the individual operations are known to have the same
     * stored procedure name then that stored procedure name SHOULD be used.
     *
     * # Examples
     *
     * - `"GetCustomer"`
     */
    public const val DB_STORED_PROCEDURE_NAME: String = "db.stored_procedure.name"

    /**
     * Deprecated, use `db.system.name` instead.
     *
     * ## Notes
     */
    @Deprecated("{note: Replaced by `db.system.name`., reason: renamed, renamed_to: db.system.name}")
    public const val DB_SYSTEM: String = "db.system"

    /**
     * The database management system (DBMS) product as identified by the client instrumentation.
     *
     * ## Notes
     *
     * The actual DBMS may differ from the one identified by the client. For example, when using PostgreSQL client libraries to connect to a CockroachDB, the `db.system.name` is set to `postgresql` based on the instrumentation's best knowledge
     */
    public const val DB_SYSTEM_NAME: String = "db.system.name"

    /**
     * Deprecated, no replacement at this time.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"readonly_user"`
     * - `"reporting_user"`
     */
    @Deprecated("{note: Removed, no replacement at this time., reason: obsoleted}")
    public const val DB_USER: String = "db.user"

    /**
     * 'Deprecated, use `deployment.environment.name` instead.'
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"staging"`
     * - `"production"`
     */
    @Deprecated("{note: Replaced by `deployment.environment.name`., reason: renamed, renamed_to: deployment.environment.name}")
    public const val DEPLOYMENT_ENVIRONMENT: String = "deployment.environment"

    /**
     * Name of the [deployment environment](https://wikipedia.org/wiki/Deployment_environment) (aka deployment tier).
     *
     * ## Notes
     *
     * `deployment.environment.name` does not affect the uniqueness constraints defined through
     * the `service.namespace`, `service.name` and `service.instance.id` resource attributes.
     * This implies that resources carrying the following attribute combinations MUST be
     * considered to be identifying the same service:
     *
     * - `service.name=frontend`, `deployment.environment.name=production`
     * - `service.name=frontend`, `deployment.environment.name=staging`.
     *
     * # Examples
     *
     * - `"staging"`
     * - `"production"`
     */
    public const val DEPLOYMENT_ENVIRONMENT_NAME: String = "deployment.environment.name"

    /**
     * The id of the deployment.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"1208"`
     */
    public const val DEPLOYMENT_ID: String = "deployment.id"

    /**
     * The name of the deployment.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"deploy my app"`
     * - `"deploy-frontend"`
     */
    public const val DEPLOYMENT_NAME: String = "deployment.name"

    /**
     * The status of the deployment.
     *
     * ## Notes
     */
    public const val DEPLOYMENT_STATUS: String = "deployment.status"

    /**
     * Destination address - domain name if available without reverse DNS lookup; otherwise, IP address or Unix domain socket name.
     *
     * ## Notes
     *
     * When observed from the source side, and when communicating through an intermediary, `destination.address` SHOULD represent the destination address behind any intermediaries, for example proxies, if it's available.
     *
     * # Examples
     *
     * - `"destination.example.com"`
     * - `"10.1.2.80"`
     * - `"/tmp/my.sock"`
     */
    public const val DESTINATION_ADDRESS: String = "destination.address"

    /**
     * Destination port number
     *
     * ## Notes
     *
     * # Examples
     *
     * - `3389`
     * - `2888`
     */
    public const val DESTINATION_PORT: String = "destination.port"

    /**
     * A unique identifier representing the device
     *
     * ## Notes
     *
     * Its value SHOULD be identical for all apps on a device and it SHOULD NOT change if an app is uninstalled and re-installed.
     * However, it might be resettable by the user for all apps on a device.
     * Hardware IDs (e.g. vendor-specific serial number, IMEI or MAC address) MAY be used as values.
     *
     * More information about Android identifier best practices can be found [here](https://developer.android.com/training/articles/user-data-ids).
     *
     * \] \[!WARNING\]
     * \]
     * \] This attribute may contain sensitive (PII) information. Caution should be taken when storing personal data or anything which can identify a user. GDPR and data protection laws may apply,
     * \] ensure you do your own due diligence.
     * \]
     * \] Due to these reasons, this identifier is not recommended for consumer applications and will likely result in rejection from both Google Play and App Store.
     * \] However, it may be appropriate for specific enterprise scenarios, such as kiosk devices or enterprise-managed devices, with appropriate compliance clearance.
     * \] Any instrumentation providing this identifier MUST implement it as an opt-in feature.
     * \]
     * \] See [`app.installation.id`](/docs/registry/attributes/app.md#app-installation-id) for a more privacy-preserving alternative.
     *
     * # Examples
     *
     * - `"123456789012345"`
     * - `"01:23:45:67:89:AB"`
     */
    public const val DEVICE_ID: String = "device.id"

    /**
     * The name of the device manufacturer
     *
     * ## Notes
     *
     * The Android OS provides this field via [Build](https://developer.android.com/reference/android/os/Build#MANUFACTURER). iOS apps SHOULD hardcode the value `Apple`.
     *
     * # Examples
     *
     * - `"Apple"`
     * - `"Samsung"`
     */
    public const val DEVICE_MANUFACTURER: String = "device.manufacturer"

    /**
     * The model identifier for the device
     *
     * ## Notes
     *
     * It's recommended this value represents a machine-readable version of the model identifier rather than the market or consumer-friendly name of the device.
     *
     * # Examples
     *
     * - `"iPhone3,4"`
     * - `"SM-G920F"`
     */
    public const val DEVICE_MODEL_IDENTIFIER: String = "device.model.identifier"

    /**
     * The marketing name for the device model
     *
     * ## Notes
     *
     * It's recommended this value represents a human-readable version of the device model rather than a machine-readable alternative.
     *
     * # Examples
     *
     * - `"iPhone 6s Plus"`
     * - `"Samsung Galaxy S6"`
     */
    public const val DEVICE_MODEL_NAME: String = "device.model.name"

    /**
     * The disk IO operation direction.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"read"`
     */
    public const val DISK_IO_DIRECTION: String = "disk.io.direction"

    /**
     * The list of IPv4 or IPv6 addresses resolved during DNS lookup.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `[
     * "10.0.0.1",
     * "2001:0db8:85a3:0000:0000:8a2e:0370:7334",
     * ]`
     */
    public const val DNS_ANSWERS: String = "dns.answers"

    /**
     * The name being queried.
     *
     * ## Notes
     *
     * If the name field contains non-printable characters (below 32 or above 126), those characters should be represented as escaped base 10 integers (\DDD). Back slashes and quotes should be escaped. Tabs, carriage returns, and line feeds should be converted to \t, \r, and \n respectively.
     *
     * # Examples
     *
     * - `"www.example.com"`
     * - `"opentelemetry.io"`
     */
    public const val DNS_QUESTION_NAME: String = "dns.question.name"

    /**
     * Name of the garbage collector managed heap generation.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"gen0"`
     * - `"gen1"`
     * - `"gen2"`
     */
    public const val DOTNET_GC_HEAP_GENERATION: String = "dotnet.gc.heap.generation"

    /**
     * Represents the human-readable identifier of the node/instance to which a request was routed.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"instance-0000000001"`
     */
    public const val ELASTICSEARCH_NODE_NAME: String = "elasticsearch.node.name"

    /**
     * Unique identifier of an end user in the system. It maybe a username, email address, or other identifier.
     *
     * ## Notes
     *
     * Unique identifier of an end user in the system.
     *
     * \] \[!Warning\]
     * \] This field contains sensitive (PII) information.
     *
     * # Examples
     *
     * - `"username"`
     */
    public const val ENDUSER_ID: String = "enduser.id"

    /**
     * Pseudonymous identifier of an end user. This identifier should be a random value that is not directly linked or associated with the end user's actual identity.
     *
     * ## Notes
     *
     * Pseudonymous identifier of an end user.
     *
     * \] \[!Warning\]
     * \] This field contains sensitive (linkable PII) information.
     *
     * # Examples
     *
     * - `"QdH5CAWJgqVT4rOr0qtumf"`
     */
    public const val ENDUSER_PSEUDO_ID: String = "enduser.pseudo.id"

    /**
     * Deprecated, use `user.roles` instead.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"admin"`
     */
    @Deprecated("{note: Use `user.roles` attribute instead., reason: uncategorized}")
    public const val ENDUSER_ROLE: String = "enduser.role"

    /**
     * Deprecated, no replacement at this time.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"read:message, write:files"`
     */
    @Deprecated("{note: Removed, no replacement at this time., reason: obsoleted}")
    public const val ENDUSER_SCOPE: String = "enduser.scope"

    /**
     * A message providing more detail about an error in human-readable form.
     *
     * ## Notes
     *
     * `error.message` should provide additional context and detail about an error.
     * It is NOT RECOMMENDED to duplicate the value of `error.type` in `error.message`.
     * It is also NOT RECOMMENDED to duplicate the value of `exception.message` in `error.message`.
     *
     * `error.message` is NOT RECOMMENDED for metrics or spans due to its unbounded cardinality and overlap with span status.
     *
     * # Examples
     *
     * - `"Unexpected input type: string"`
     * - `"The user has exceeded their storage quota"`
     */
    public const val ERROR_MESSAGE: String = "error.message"

    /**
     * Describes a class of error the operation ended with.
     *
     * ## Notes
     *
     * The `error.type` SHOULD be predictable, and SHOULD have low cardinality.
     *
     * When `error.type` is set to a type (e.g., an exception type), its
     * canonical class name identifying the type within the artifact SHOULD be used.
     *
     * Instrumentations SHOULD document the list of errors they report.
     *
     * The cardinality of `error.type` within one instrumentation library SHOULD be low.
     * Telemetry consumers that aggregate data from multiple instrumentation libraries and applications
     * should be prepared for `error.type` to have high cardinality at query time when no
     * additional filters are applied.
     *
     * If the operation has completed successfully, instrumentations SHOULD NOT set `error.type`.
     *
     * If a specific domain defines its own set of error identifiers (such as HTTP or gRPC status codes),
     * it's RECOMMENDED to:
     *
     * - Use a domain-specific attribute
     * - Set `error.type` to capture all errors, regardless of whether they are defined within the domain-specific set or not.
     *
     * # Examples
     *
     * - `"timeout"`
     * - `"java.net.UnknownHostException"`
     * - `"server_certificate_invalid"`
     * - `"500"`
     */
    public const val ERROR_TYPE: String = "error.type"

    /**
     * Identifies the class / type of event.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"browser.mouse.click"`
     * - `"device.app.lifecycle"`
     */
    @Deprecated("{note: Replaced by EventName top-level field on the LogRecord.\n, reason: uncategorized}")
    public const val EVENT_NAME: String = "event.name"

    /**
     * Indicates that the exception is escaping the scope of the span.
     *
     * ## Notes
     */
    @Deprecated("{note: It's no longer recommended to record exceptions that are handled and do not escape the scope of a span.\n, reason: obsoleted}")
    public const val EXCEPTION_ESCAPED: String = "exception.escaped"

    /**
     * The exception message.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"Division by zero"`
     * - `"Can't convert 'int' object to str implicitly"`
     */
    public const val EXCEPTION_MESSAGE: String = "exception.message"

    /**
     * A stacktrace as a string in the natural representation for the language runtime. The representation is to be determined and documented by each language SIG.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"Exception in thread \"main\" java.lang.RuntimeException: Test exception\\n at com.example.GenerateTrace.methodB(GenerateTrace.java:13)\\n at com.example.GenerateTrace.methodA(GenerateTrace.java:9)\\n at com.example.GenerateTrace.main(GenerateTrace.java:5)\n"`
     */
    public const val EXCEPTION_STACKTRACE: String = "exception.stacktrace"

    /**
     * The type of the exception (its fully-qualified class name, if applicable). The dynamic type of the exception should be preferred over the static type in languages that support it.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"java.net.ConnectException"`
     * - `"OSError"`
     */
    public const val EXCEPTION_TYPE: String = "exception.type"

    /**
     * A boolean that is true if the serverless function is executed for the first time (aka cold-start).
     *
     * ## Notes
     */
    public const val FAAS_COLDSTART: String = "faas.coldstart"

    /**
     * A string containing the schedule period as [Cron Expression](https://docs.oracle.com/cd/E12058_01/doc/doc.1014/e12030/cron_expressions.htm).
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"0/5 * * * ? *"`
     */
    public const val FAAS_CRON: String = "faas.cron"

    /**
     * The name of the source on which the triggering operation was performed. For example, in Cloud Storage or S3 corresponds to the bucket name, and in Cosmos DB to the database name.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"myBucketName"`
     * - `"myDbName"`
     */
    public const val FAAS_DOCUMENT_COLLECTION: String = "faas.document.collection"

    /**
     * The document name/table subjected to the operation. For example, in Cloud Storage or S3 is the name of the file, and in Cosmos DB the table name.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"myFile.txt"`
     * - `"myTableName"`
     */
    public const val FAAS_DOCUMENT_NAME: String = "faas.document.name"

    /**
     * Describes the type of the operation that was performed on the data.
     *
     * ## Notes
     */
    public const val FAAS_DOCUMENT_OPERATION: String = "faas.document.operation"

    /**
     * A string containing the time when the data was accessed in the [ISO 8601](https://www.iso.org/iso-8601-date-and-time-format.html) format expressed in [UTC](https://www.w3.org/TR/NOTE-datetime).
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"2020-01-23T13:47:06Z"`
     */
    public const val FAAS_DOCUMENT_TIME: String = "faas.document.time"

    /**
     * The execution environment ID as a string, that will be potentially reused for other invocations to the same function/function version.
     *
     * ## Notes
     *
     * - **AWS Lambda:** Use the (full) log stream name.
     *
     * # Examples
     *
     * - `"2021/06/28/[\$LATEST]2f399eb14537447da05ab2a2e39309de"`
     */
    public const val FAAS_INSTANCE: String = "faas.instance"

    /**
     * The invocation ID of the current function invocation.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"af9d5aa4-a685-4c5f-a22b-444f80b3cc28"`
     */
    public const val FAAS_INVOCATION_ID: String = "faas.invocation_id"

    /**
     * The name of the invoked function.
     *
     * ## Notes
     *
     * SHOULD be equal to the `faas.name` resource attribute of the invoked function.
     *
     * # Examples
     *
     * - `"my-function"`
     */
    public const val FAAS_INVOKED_NAME: String = "faas.invoked_name"

    /**
     * The cloud provider of the invoked function.
     *
     * ## Notes
     *
     * SHOULD be equal to the `cloud.provider` resource attribute of the invoked function
     */
    public const val FAAS_INVOKED_PROVIDER: String = "faas.invoked_provider"

    /**
     * The cloud region of the invoked function.
     *
     * ## Notes
     *
     * SHOULD be equal to the `cloud.region` resource attribute of the invoked function.
     *
     * # Examples
     *
     * - `"eu-central-1"`
     */
    public const val FAAS_INVOKED_REGION: String = "faas.invoked_region"

    /**
     * The amount of memory available to the serverless function converted to Bytes.
     *
     * ## Notes
     *
     * It's recommended to set this attribute since e.g. too little memory can easily stop a Java AWS Lambda function from working correctly. On AWS Lambda, the environment variable `AWS_LAMBDA_FUNCTION_MEMORY_SIZE` provides this information (which must be multiplied by 1,048,576).
     *
     * # Examples
     *
     * - `134217728`
     */
    public const val FAAS_MAX_MEMORY: String = "faas.max_memory"

    /**
     * The name of the single function that this runtime instance executes.
     *
     * ## Notes
     *
     * This is the name of the function as configured/deployed on the FaaS
     * platform and is usually different from the name of the callback
     * function (which may be stored in the
     * [`code.namespace`/`code.function.name`](/docs/general/attributes.md#source-code-attributes)
     * span attributes).
     *
     * For some cloud providers, the above definition is ambiguous. The following
     * definition of function name MUST be used for this attribute
     * (and consequently the span name) for the listed cloud providers/products:
     *
     * - **Azure:**  The full name `[FUNCAPP]/[FUNC]`, i.e., function app name
     * followed by a forward slash followed by the function name (this form
     * can also be seen in the resource JSON for the function).
     * This means that a span attribute MUST be used, as an Azure function
     * app can host multiple functions that would usually share
     * a TracerProvider (see also the `cloud.resource_id` attribute).
     *
     * # Examples
     *
     * - `"my-function"`
     * - `"myazurefunctionapp/some-function-name"`
     */
    public const val FAAS_NAME: String = "faas.name"

    /**
     * A string containing the function invocation time in the [ISO 8601](https://www.iso.org/iso-8601-date-and-time-format.html) format expressed in [UTC](https://www.w3.org/TR/NOTE-datetime).
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"2020-01-23T13:47:06Z"`
     */
    public const val FAAS_TIME: String = "faas.time"

    /**
     * Type of the trigger which caused this function invocation.
     *
     * ## Notes
     */
    public const val FAAS_TRIGGER: String = "faas.trigger"

    /**
     * The immutable version of the function being executed.
     *
     * ## Notes
     *
     * Depending on the cloud provider and platform, use:
     *
     * - **AWS Lambda:** The [function version](https://docs.aws.amazon.com/lambda/latest/dg/configuration-versions.html)
     * (an integer represented as a decimal string).
     * - **Google Cloud Run (Services):** The [revision](https://cloud.google.com/run/docs/managing/revisions)
     * (i.e., the function name plus the revision suffix).
     * - **Google Cloud Functions:** The value of the
     * [`K_REVISION` environment variable](https://cloud.google.com/functions/docs/env-var#runtime_environment_variables_set_automatically).
     * - **Azure Functions:** Not applicable. Do not set this attribute.
     *
     * # Examples
     *
     * - `"26"`
     * - `"pinkfroid-00002"`
     */
    public const val FAAS_VERSION: String = "faas.version"

    /**
     * The unique identifier for the flag evaluation context. For example, the targeting key.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"5157782b-2203-4c80-a857-dbbd5e7761db"`
     */
    public const val FEATURE_FLAG_CONTEXT_ID: String = "feature_flag.context.id"

    /**
     * Deprecated, use `error.message` instead.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"Flag `header-color`expected type`string`but found type`number`"`
     */
    @Deprecated("{note: Replaced by `error.message`., reason: renamed, renamed_to: error.message}")
    public const val FEATURE_FLAG_EVALUATION_ERROR_MESSAGE: String = "feature_flag.evaluation.error.message"

    /**
     * Deprecated, use `feature_flag.result.reason` instead.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"static"`
     * - `"targeting_match"`
     * - `"error"`
     * - `"default"`
     */
    @Deprecated("{note: Replaced by `feature_flag.result.reason`., reason: renamed, renamed_to: feature_flag.result.reason}")
    public const val FEATURE_FLAG_EVALUATION_REASON: String = "feature_flag.evaluation.reason"

    /**
     * The lookup key of the feature flag.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"logo-color"`
     */
    public const val FEATURE_FLAG_KEY: String = "feature_flag.key"

    /**
     * Identifies the feature flag provider.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"Flag Manager"`
     */
    public const val FEATURE_FLAG_PROVIDER_NAME: String = "feature_flag.provider.name"

    /**
     * The reason code which shows how a feature flag value was determined.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"static"`
     * - `"targeting_match"`
     * - `"error"`
     * - `"default"`
     */
    public const val FEATURE_FLAG_RESULT_REASON: String = "feature_flag.result.reason"

    /**
     * The evaluated value of the feature flag.
     *
     * ## Notes
     *
     * With some feature flag providers, feature flag results can be quite large or contain private or sensitive details.
     * Because of this, `feature_flag.result.variant` is often the preferred attribute if it is available.
     *
     * It may be desirable to redact or otherwise limit the size and scope of `feature_flag.result.value` if possible.
     * Because the evaluated flag value is unstructured and may be any type, it is left to the instrumentation author to determine how best to achieve this.
     *
     * # Examples
     *
     * - `"#ff0000"`
     * - `true`
     * - `3`
     */
    public const val FEATURE_FLAG_RESULT_VALUE: String = "feature_flag.result.value"

    /**
     * A semantic identifier for an evaluated flag value.
     *
     * ## Notes
     *
     * A semantic identifier, commonly referred to as a variant, provides a means
     * for referring to a value without including the value itself. This can
     * provide additional context for understanding the meaning behind a value.
     * For example, the variant `red` maybe be used for the value `#c05543`.
     *
     * # Examples
     *
     * - `"red"`
     * - `"true"`
     * - `"on"`
     */
    public const val FEATURE_FLAG_RESULT_VARIANT: String = "feature_flag.result.variant"

    /**
     * The identifier of the [flag set](https://openfeature.dev/specification/glossary/#flag-set) to which the feature flag belongs.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"proj-1"`
     * - `"ab98sgs"`
     * - `"service1/dev"`
     */
    public const val FEATURE_FLAG_SET_ID: String = "feature_flag.set.id"

    /**
     * Deprecated, use `feature_flag.result.variant` instead.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"red"`
     * - `"true"`
     * - `"on"`
     */
    @Deprecated("{note: Replaced by `feature_flag.result.variant`., reason: renamed, renamed_to: feature_flag.result.variant}")
    public const val FEATURE_FLAG_VARIANT: String = "feature_flag.variant"

    /**
     * The version of the ruleset used during the evaluation. This may be any stable value which uniquely identifies the ruleset.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"1"`
     * - `"01ABCDEF"`
     */
    public const val FEATURE_FLAG_VERSION: String = "feature_flag.version"

    /**
     * Time when the file was last accessed, in ISO 8601 format.
     *
     * ## Notes
     *
     * This attribute might not be supported by some file systems — NFS, FAT32, in embedded OS, etc.
     *
     * # Examples
     *
     * - `"2021-01-01T12:00:00Z"`
     */
    public const val FILE_ACCESSED: String = "file.accessed"

    /**
     * Array of file attributes.
     *
     * ## Notes
     *
     * Attributes names depend on the OS or file system. Here’s a non-exhaustive list of values expected for this attribute: `archive`, `compressed`, `directory`, `encrypted`, `execute`, `hidden`, `immutable`, `journaled`, `read`, `readonly`, `symbolic link`, `system`, `temporary`, `write`.
     *
     * # Examples
     *
     * - `[
     * "readonly",
     * "hidden",
     * ]`
     */
    public const val FILE_ATTRIBUTES: String = "file.attributes"

    /**
     * Time when the file attributes or metadata was last changed, in ISO 8601 format.
     *
     * ## Notes
     *
     * `file.changed` captures the time when any of the file's properties or attributes (including the content) are changed, while `file.modified` captures the timestamp when the file content is modified.
     *
     * # Examples
     *
     * - `"2021-01-01T12:00:00Z"`
     */
    public const val FILE_CHANGED: String = "file.changed"

    /**
     * Time when the file was created, in ISO 8601 format.
     *
     * ## Notes
     *
     * This attribute might not be supported by some file systems — NFS, FAT32, in embedded OS, etc.
     *
     * # Examples
     *
     * - `"2021-01-01T12:00:00Z"`
     */
    public const val FILE_CREATED: String = "file.created"

    /**
     * Directory where the file is located. It should include the drive letter, when appropriate.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"/home/user"`
     * - `"C:\\Program Files\\MyApp"`
     */
    public const val FILE_DIRECTORY: String = "file.directory"

    /**
     * File extension, excluding the leading dot.
     *
     * ## Notes
     *
     * When the file name has multiple extensions (example.tar.gz), only the last one should be captured ("gz", not "tar.gz").
     *
     * # Examples
     *
     * - `"png"`
     * - `"gz"`
     */
    public const val FILE_EXTENSION: String = "file.extension"

    /**
     * Name of the fork. A fork is additional data associated with a filesystem object.
     *
     * ## Notes
     *
     * On Linux, a resource fork is used to store additional data with a filesystem object. A file always has at least one fork for the data portion, and additional forks may exist.
     * On NTFS, this is analogous to an Alternate Data Stream (ADS), and the default data stream for a file is just called \$DATA. Zone.Identifier is commonly used by Windows to track contents downloaded from the Internet. An ADS is typically of the form: C:\path\to\filename.extension:some_fork_name, and some_fork_name is the value that should populate `fork_name`. `filename.extension` should populate `file.name`, and `extension` should populate `file.extension`. The full path, `file.path`, will include the fork name.
     *
     * # Examples
     *
     * - `"Zone.Identifer"`
     */
    public const val FILE_FORK_NAME: String = "file.fork_name"

    /**
     * Primary Group ID (GID) of the file.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"1000"`
     */
    public const val FILE_GROUP_ID: String = "file.group.id"

    /**
     * Primary group name of the file.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"users"`
     */
    public const val FILE_GROUP_NAME: String = "file.group.name"

    /**
     * Inode representing the file in the filesystem.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"256383"`
     */
    public const val FILE_INODE: String = "file.inode"

    /**
     * Mode of the file in octal representation.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"0640"`
     */
    public const val FILE_MODE: String = "file.mode"

    /**
     * Time when the file content was last modified, in ISO 8601 format.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"2021-01-01T12:00:00Z"`
     */
    public const val FILE_MODIFIED: String = "file.modified"

    /**
     * Name of the file including the extension, without the directory.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"example.png"`
     */
    public const val FILE_NAME: String = "file.name"

    /**
     * The user ID (UID) or security identifier (SID) of the file owner.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"1000"`
     */
    public const val FILE_OWNER_ID: String = "file.owner.id"

    /**
     * Username of the file owner.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"root"`
     */
    public const val FILE_OWNER_NAME: String = "file.owner.name"

    /**
     * Full path to the file, including the file name. It should include the drive letter, when appropriate.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"/home/alice/example.png"`
     * - `"C:\\Program Files\\MyApp\\myapp.exe"`
     */
    public const val FILE_PATH: String = "file.path"

    /**
     * File size in bytes.
     *
     * ## Notes
     */
    public const val FILE_SIZE: String = "file.size"

    /**
     * Path to the target of a symbolic link.
     *
     * ## Notes
     *
     * This attribute is only applicable to symbolic links.
     *
     * # Examples
     *
     * - `"/usr/bin/python3"`
     */
    public const val FILE_SYMBOLIC_LINK_TARGET_PATH: String = "file.symbolic_link.target_path"

    /**
     * The container within GCP where the AppHub application is defined.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"projects/my-container-project"`
     */
    public const val GCP_APPHUB_APPLICATION_CONTAINER: String = "gcp.apphub.application.container"

    /**
     * The name of the application as configured in AppHub.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"my-application"`
     */
    public const val GCP_APPHUB_APPLICATION_ID: String = "gcp.apphub.application.id"

    /**
     * The GCP zone or region where the application is defined.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"us-central1"`
     */
    public const val GCP_APPHUB_APPLICATION_LOCATION: String = "gcp.apphub.application.location"

    /**
     * Criticality of a service indicates its importance to the business.
     *
     * ## Notes
     *
     * [See AppHub type enum](https://cloud.google.com/app-hub/docs/reference/rest/v1/Attributes#type)
     */
    public const val GCP_APPHUB_SERVICE_CRITICALITY_TYPE: String = "gcp.apphub.service.criticality_type"

    /**
     * Environment of a service is the stage of a software lifecycle.
     *
     * ## Notes
     *
     * [See AppHub environment type](https://cloud.google.com/app-hub/docs/reference/rest/v1/Attributes#type_1)
     */
    public const val GCP_APPHUB_SERVICE_ENVIRONMENT_TYPE: String = "gcp.apphub.service.environment_type"

    /**
     * The name of the service as configured in AppHub.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"my-service"`
     */
    public const val GCP_APPHUB_SERVICE_ID: String = "gcp.apphub.service.id"

    /**
     * Criticality of a workload indicates its importance to the business.
     *
     * ## Notes
     *
     * [See AppHub type enum](https://cloud.google.com/app-hub/docs/reference/rest/v1/Attributes#type)
     */
    public const val GCP_APPHUB_WORKLOAD_CRITICALITY_TYPE: String = "gcp.apphub.workload.criticality_type"

    /**
     * Environment of a workload is the stage of a software lifecycle.
     *
     * ## Notes
     *
     * [See AppHub environment type](https://cloud.google.com/app-hub/docs/reference/rest/v1/Attributes#type_1)
     */
    public const val GCP_APPHUB_WORKLOAD_ENVIRONMENT_TYPE: String = "gcp.apphub.workload.environment_type"

    /**
     * The name of the workload as configured in AppHub.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"my-workload"`
     */
    public const val GCP_APPHUB_WORKLOAD_ID: String = "gcp.apphub.workload.id"

    /**
     * Identifies the Google Cloud service for which the official client library is intended.
     *
     * ## Notes
     *
     * Intended to be a stable identifier for Google Cloud client libraries that is uniform across implementation languages. The value should be derived from the canonical service domain for the service; for example, 'foo.googleapis.com' should result in a value of 'foo'.
     *
     * # Examples
     *
     * - `"appengine"`
     * - `"run"`
     * - `"firestore"`
     * - `"alloydb"`
     * - `"spanner"`
     */
    public const val GCP_CLIENT_SERVICE: String = "gcp.client.service"

    /**
     * The name of the Cloud Run [execution](https://cloud.google.com/run/docs/managing/job-executions) being run for the Job, as set by the [`CLOUD_RUN_EXECUTION`](https://cloud.google.com/run/docs/container-contract#jobs-env-vars) environment variable.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"job-name-xxxx"`
     * - `"sample-job-mdw84"`
     */
    public const val GCP_CLOUD_RUN_JOB_EXECUTION: String = "gcp.cloud_run.job.execution"

    /**
     * The index for a task within an execution as provided by the [`CLOUD_RUN_TASK_INDEX`](https://cloud.google.com/run/docs/container-contract#jobs-env-vars) environment variable.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `0`
     * - `1`
     */
    public const val GCP_CLOUD_RUN_JOB_TASK_INDEX: String = "gcp.cloud_run.job.task_index"

    /**
     * The hostname of a GCE instance. This is the full value of the default or [custom hostname](https://cloud.google.com/compute/docs/instances/custom-hostname-vm).
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"my-host1234.example.com"`
     * - `"sample-vm.us-west1-b.c.my-project.internal"`
     */
    public const val GCP_GCE_INSTANCE_HOSTNAME: String = "gcp.gce.instance.hostname"

    /**
     * The instance name of a GCE instance. This is the value provided by `host.name`, the visible name of the instance in the Cloud Console UI, and the prefix for the default hostname of the instance as defined by the [default internal DNS name](https://cloud.google.com/compute/docs/internal-dns#instance-fully-qualified-domain-names).
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"instance-1"`
     * - `"my-vm-name"`
     */
    public const val GCP_GCE_INSTANCE_NAME: String = "gcp.gce.instance.name"

    /**
     * Free-form description of the GenAI agent provided by the application.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"Helps with math problems"`
     * - `"Generates fiction stories"`
     */
    public const val GEN_AI_AGENT_DESCRIPTION: String = "gen_ai.agent.description"

    /**
     * The unique identifier of the GenAI agent.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"asst_5j66UpCpwteGg4YSxUnt7lPY"`
     */
    public const val GEN_AI_AGENT_ID: String = "gen_ai.agent.id"

    /**
     * Human-readable name of the GenAI agent provided by the application.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"Math Tutor"`
     * - `"Fiction Writer"`
     */
    public const val GEN_AI_AGENT_NAME: String = "gen_ai.agent.name"

    /**
     * Deprecated, use Event API to report completions contents.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"[{'role': 'assistant', 'content': 'The capital of France is Paris.'}]"`
     */
    @Deprecated("{note: Removed, no replacement at this time., reason: obsoleted}")
    public const val GEN_AI_COMPLETION: String = "gen_ai.completion"

    /**
     * The unique identifier for a conversation (session, thread), used to store and correlate messages within this conversation.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"conv_5j66UpCpwteGg4YSxUnt7lPY"`
     */
    public const val GEN_AI_CONVERSATION_ID: String = "gen_ai.conversation.id"

    /**
     * The data source identifier.
     *
     * ## Notes
     *
     * Data sources are used by AI agents and RAG applications to store grounding data. A data source may be an external database, object store, document collection, website, or any other storage system used by the GenAI agent or application. The `gen_ai.data_source.id` SHOULD match the identifier used by the GenAI system rather than a name specific to the external storage, such as a database or object store. Semantic conventions referencing `gen_ai.data_source.id` MAY also leverage additional attributes, such as `db.*`, to further identify and describe the data source.
     *
     * # Examples
     *
     * - `"H7STPQYOND"`
     */
    public const val GEN_AI_DATA_SOURCE_ID: String = "gen_ai.data_source.id"

    /**
     * Deprecated, use `gen_ai.output.type`.
     *
     * ## Notes
     */
    @Deprecated("{note: Replaced by `gen_ai.output.type`., reason: renamed, renamed_to: gen_ai.output.type}")
    public const val GEN_AI_OPENAI_REQUEST_RESPONSE_FORMAT: String = "gen_ai.openai.request.response_format"

    /**
     * Deprecated, use `gen_ai.request.seed`.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `100`
     */
    @Deprecated("{note: Replaced by `gen_ai.request.seed`., reason: renamed, renamed_to: gen_ai.request.seed}")
    public const val GEN_AI_OPENAI_REQUEST_SEED: String = "gen_ai.openai.request.seed"

    /**
     * The service tier requested. May be a specific tier, default, or auto.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"auto"`
     * - `"default"`
     */
    public const val GEN_AI_OPENAI_REQUEST_SERVICE_TIER: String = "gen_ai.openai.request.service_tier"

    /**
     * The service tier used for the response.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"scale"`
     * - `"default"`
     */
    public const val GEN_AI_OPENAI_RESPONSE_SERVICE_TIER: String = "gen_ai.openai.response.service_tier"

    /**
     * A fingerprint to track any eventual change in the Generative AI environment.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"fp_44709d6fcb"`
     */
    public const val GEN_AI_OPENAI_RESPONSE_SYSTEM_FINGERPRINT: String = "gen_ai.openai.response.system_fingerprint"

    /**
     * The name of the operation being performed.
     *
     * ## Notes
     *
     * If one of the predefined values applies, but specific system uses a different name it's RECOMMENDED to document it in the semantic conventions for specific GenAI system and use system-specific name in the instrumentation. If a different name is not documented, instrumentation libraries SHOULD use applicable predefined value
     */
    public const val GEN_AI_OPERATION_NAME: String = "gen_ai.operation.name"

    /**
     * Represents the content type requested by the client.
     *
     * ## Notes
     *
     * This attribute SHOULD be used when the client requests output of a specific type. The model may return zero or more outputs of this type.
     * This attribute specifies the output modality and not the actual output format. For example, if an image is requested, the actual output could be a URL pointing to an image file.
     * Additional output format details may be recorded in the future in the `gen_ai.output.{type}.*` attributes
     */
    public const val GEN_AI_OUTPUT_TYPE: String = "gen_ai.output.type"

    /**
     * Deprecated, use Event API to report prompt contents.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"[{'role': 'user', 'content': 'What is the capital of France?'}]"`
     */
    @Deprecated("{note: Removed, no replacement at this time., reason: obsoleted}")
    public const val GEN_AI_PROMPT: String = "gen_ai.prompt"

    /**
     * The target number of candidate completions to return.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `3`
     */
    public const val GEN_AI_REQUEST_CHOICE_COUNT: String = "gen_ai.request.choice.count"

    /**
     * The encoding formats requested in an embeddings operation, if specified.
     *
     * ## Notes
     *
     * In some GenAI systems the encoding formats are called embedding types. Also, some GenAI systems only accept a single format per request.
     *
     * # Examples
     *
     * - `[
     * "base64",
     * ]`
     * - `[
     * "float",
     * "binary",
     * ]`
     */
    public const val GEN_AI_REQUEST_ENCODING_FORMATS: String = "gen_ai.request.encoding_formats"

    /**
     * The frequency penalty setting for the GenAI request.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `0.1`
     */
    public const val GEN_AI_REQUEST_FREQUENCY_PENALTY: String = "gen_ai.request.frequency_penalty"

    /**
     * The maximum number of tokens the model generates for a request.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `100`
     */
    public const val GEN_AI_REQUEST_MAX_TOKENS: String = "gen_ai.request.max_tokens"

    /**
     * The name of the GenAI model a request is being made to.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"gpt-4"`
     */
    public const val GEN_AI_REQUEST_MODEL: String = "gen_ai.request.model"

    /**
     * The presence penalty setting for the GenAI request.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `0.1`
     */
    public const val GEN_AI_REQUEST_PRESENCE_PENALTY: String = "gen_ai.request.presence_penalty"

    /**
     * Requests with same seed value more likely to return same result.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `100`
     */
    public const val GEN_AI_REQUEST_SEED: String = "gen_ai.request.seed"

    /**
     * List of sequences that the model will use to stop generating further tokens.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `[
     * "forest",
     * "lived",
     * ]`
     */
    public const val GEN_AI_REQUEST_STOP_SEQUENCES: String = "gen_ai.request.stop_sequences"

    /**
     * The temperature setting for the GenAI request.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `0.0`
     */
    public const val GEN_AI_REQUEST_TEMPERATURE: String = "gen_ai.request.temperature"

    /**
     * The top_k sampling setting for the GenAI request.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `1.0`
     */
    public const val GEN_AI_REQUEST_TOP_K: String = "gen_ai.request.top_k"

    /**
     * The top_p sampling setting for the GenAI request.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `1.0`
     */
    public const val GEN_AI_REQUEST_TOP_P: String = "gen_ai.request.top_p"

    /**
     * Array of reasons the model stopped generating tokens, corresponding to each generation received.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `[
     * "stop",
     * ]`
     * - `[
     * "stop",
     * "length",
     * ]`
     */
    public const val GEN_AI_RESPONSE_FINISH_REASONS: String = "gen_ai.response.finish_reasons"

    /**
     * The unique identifier for the completion.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"chatcmpl-123"`
     */
    public const val GEN_AI_RESPONSE_ID: String = "gen_ai.response.id"

    /**
     * The name of the model that generated the response.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"gpt-4-0613"`
     */
    public const val GEN_AI_RESPONSE_MODEL: String = "gen_ai.response.model"

    /**
     * The Generative AI product as identified by the client or server instrumentation.
     *
     * ## Notes
     *
     * The `gen_ai.system` describes a family of GenAI models with specific model identified
     * by `gen_ai.request.model` and `gen_ai.response.model` attributes.
     *
     * The actual GenAI product may differ from the one identified by the client.
     * Multiple systems, including Azure OpenAI and Gemini, are accessible by OpenAI client
     * libraries. In such cases, the `gen_ai.system` is set to `openai` based on the
     * instrumentation's best knowledge, instead of the actual system. The `server.address`
     * attribute may help identify the actual system in use for `openai`.
     *
     * For custom model, a custom friendly name SHOULD be used.
     * If none of these options apply, the `gen_ai.system` SHOULD be set to `_OTHER`.
     *
     * # Examples
     *
     * - `"openai"`
     */
    public const val GEN_AI_SYSTEM: String = "gen_ai.system"

    /**
     * The type of token being counted.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"input"`
     * - `"output"`
     */
    public const val GEN_AI_TOKEN_TYPE: String = "gen_ai.token.type"

    /**
     * The tool call identifier.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"call_mszuSIzqtI65i1wAUOE8w5H4"`
     */
    public const val GEN_AI_TOOL_CALL_ID: String = "gen_ai.tool.call.id"

    /**
     * The tool description.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"Multiply two numbers"`
     */
    public const val GEN_AI_TOOL_DESCRIPTION: String = "gen_ai.tool.description"

    /**
     * Name of the tool utilized by the agent.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"Flights"`
     */
    public const val GEN_AI_TOOL_NAME: String = "gen_ai.tool.name"

    /**
     * Type of the tool utilized by the agent
     *
     * ## Notes
     *
     * Extension: A tool executed on the agent-side to directly call external APIs, bridging the gap between the agent and real-world systems.
     * Agent-side operations involve actions that are performed by the agent on the server or within the agent's controlled environment.
     * Function: A tool executed on the client-side, where the agent generates parameters for a predefined function, and the client executes the logic.
     * Client-side operations are actions taken on the user's end or within the client application.
     * Datastore: A tool used by the agent to access and query structured or unstructured external data for retrieval-augmented tasks or knowledge updates.
     *
     * # Examples
     *
     * - `"function"`
     * - `"extension"`
     * - `"datastore"`
     */
    public const val GEN_AI_TOOL_TYPE: String = "gen_ai.tool.type"

    /**
     * Deprecated, use `gen_ai.usage.output_tokens` instead.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `42`
     */
    @Deprecated("{note: Replaced by `gen_ai.usage.output_tokens`., reason: renamed, renamed_to: gen_ai.usage.output_tokens}")
    public const val GEN_AI_USAGE_COMPLETION_TOKENS: String = "gen_ai.usage.completion_tokens"

    /**
     * The number of tokens used in the GenAI input (prompt).
     *
     * ## Notes
     *
     * # Examples
     *
     * - `100`
     */
    public const val GEN_AI_USAGE_INPUT_TOKENS: String = "gen_ai.usage.input_tokens"

    /**
     * The number of tokens used in the GenAI response (completion).
     *
     * ## Notes
     *
     * # Examples
     *
     * - `180`
     */
    public const val GEN_AI_USAGE_OUTPUT_TOKENS: String = "gen_ai.usage.output_tokens"

    /**
     * Deprecated, use `gen_ai.usage.input_tokens` instead.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `42`
     */
    @Deprecated("{note: Replaced by `gen_ai.usage.input_tokens`., reason: renamed, renamed_to: gen_ai.usage.input_tokens}")
    public const val GEN_AI_USAGE_PROMPT_TOKENS: String = "gen_ai.usage.prompt_tokens"

    /**
     * Two-letter code representing continent’s name.
     *
     * ## Notes
     */
    public const val GEO_CONTINENT_CODE: String = "geo.continent.code"

    /**
     * Two-letter ISO Country Code ([ISO 3166-1 alpha2](https://wikipedia.org/wiki/ISO_3166-1#Codes)).
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"CA"`
     */
    public const val GEO_COUNTRY_ISO_CODE: String = "geo.country.iso_code"

    /**
     * Locality name. Represents the name of a city, town, village, or similar populated place.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"Montreal"`
     * - `"Berlin"`
     */
    public const val GEO_LOCALITY_NAME: String = "geo.locality.name"

    /**
     * Latitude of the geo location in [WGS84](https://wikipedia.org/wiki/World_Geodetic_System#WGS84).
     *
     * ## Notes
     *
     * # Examples
     *
     * - `45.505918`
     */
    public const val GEO_LOCATION_LAT: String = "geo.location.lat"

    /**
     * Longitude of the geo location in [WGS84](https://wikipedia.org/wiki/World_Geodetic_System#WGS84).
     *
     * ## Notes
     *
     * # Examples
     *
     * - `-73.61483`
     */
    public const val GEO_LOCATION_LON: String = "geo.location.lon"

    /**
     * Postal code associated with the location. Values appropriate for this field may also be known as a postcode or ZIP code and will vary widely from country to country.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"94040"`
     */
    public const val GEO_POSTAL_CODE: String = "geo.postal_code"

    /**
     * Region ISO code ([ISO 3166-2](https://wikipedia.org/wiki/ISO_3166-2)).
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"CA-QC"`
     */
    public const val GEO_REGION_ISO_CODE: String = "geo.region.iso_code"

    /**
     * The type of memory.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"other"`
     * - `"stack"`
     */
    public const val GO_MEMORY_TYPE: String = "go.memory.type"

    /**
     * The GraphQL document being executed.
     *
     * ## Notes
     *
     * The value may be sanitized to exclude sensitive information.
     *
     * # Examples
     *
     * - `"query findBookById { bookById(id: ?) { name } }"`
     */
    public const val GRAPHQL_DOCUMENT: String = "graphql.document"

    /**
     * The name of the operation being executed.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"findBookById"`
     */
    public const val GRAPHQL_OPERATION_NAME: String = "graphql.operation.name"

    /**
     * The type of the operation being executed.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"query"`
     * - `"mutation"`
     * - `"subscription"`
     */
    public const val GRAPHQL_OPERATION_TYPE: String = "graphql.operation.type"

    /**
     * Unique identifier for the application
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"2daa2797-e42b-4624-9322-ec3f968df4da"`
     */
    public const val HEROKU_APP_ID: String = "heroku.app.id"

    /**
     * Commit hash for the current release
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"e6134959463efd8966b20e75b913cafe3f5ec"`
     */
    public const val HEROKU_RELEASE_COMMIT: String = "heroku.release.commit"

    /**
     * Time and date the release was created
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"2022-10-23T18:00:42Z"`
     */
    public const val HEROKU_RELEASE_CREATION_TIMESTAMP: String = "heroku.release.creation_timestamp"

    /**
     * The CPU architecture the host system is running on.
     *
     * ## Notes
     */
    public const val HOST_ARCH: String = "host.arch"

    /**
     * The amount of level 2 memory cache available to the processor (in Bytes).
     *
     * ## Notes
     *
     * # Examples
     *
     * - `12288000`
     */
    public const val HOST_CPU_CACHE_L2_SIZE: String = "host.cpu.cache.l2.size"

    /**
     * Family or generation of the CPU.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"6"`
     * - `"PA-RISC 1.1e"`
     */
    public const val HOST_CPU_FAMILY: String = "host.cpu.family"

    /**
     * Model identifier. It provides more granular information about the CPU, distinguishing it from other CPUs within the same family.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"6"`
     * - `"9000/778/B180L"`
     */
    public const val HOST_CPU_MODEL_ID: String = "host.cpu.model.id"

    /**
     * Model designation of the processor.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"11th Gen Intel(R) Core(TM) i7-1185G7 @ 3.00GHz"`
     */
    public const val HOST_CPU_MODEL_NAME: String = "host.cpu.model.name"

    /**
     * Stepping or core revisions.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"1"`
     * - `"r1p1"`
     */
    public const val HOST_CPU_STEPPING: String = "host.cpu.stepping"

    /**
     * Processor manufacturer identifier. A maximum 12-character string.
     *
     * ## Notes
     *
     * [CPUID](https://wiki.osdev.org/CPUID) command returns the vendor ID string in EBX, EDX and ECX registers. Writing these to memory in this order results in a 12-character string.
     *
     * # Examples
     *
     * - `"GenuineIntel"`
     */
    public const val HOST_CPU_VENDOR_ID: String = "host.cpu.vendor.id"

    /**
     * Unique host ID. For Cloud, this must be the instance_id assigned by the cloud provider. For non-containerized systems, this should be the `machine-id`. See the table below for the sources to use to determine the `machine-id` based on operating system.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"fdbf79e8af94cb7f9e8df36789187052"`
     */
    public const val HOST_ID: String = "host.id"

    /**
     * VM image ID or host OS image ID. For Cloud, this value is from the provider.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"ami-07b06b442921831e5"`
     */
    public const val HOST_IMAGE_ID: String = "host.image.id"

    /**
     * Name of the VM image or OS install the host was instantiated from.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"infra-ami-eks-worker-node-7d4ec78312"`
     * - `"CentOS-8-x86_64-1905"`
     */
    public const val HOST_IMAGE_NAME: String = "host.image.name"

    /**
     * The version string of the VM image or host OS as defined in [Version Attributes](/docs/resource/README.md#version-attributes).
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"0.1"`
     */
    public const val HOST_IMAGE_VERSION: String = "host.image.version"

    /**
     * Available IP addresses of the host, excluding loopback interfaces.
     *
     * ## Notes
     *
     * IPv4 Addresses MUST be specified in dotted-quad notation. IPv6 addresses MUST be specified in the [RFC 5952](https://www.rfc-editor.org/rfc/rfc5952.html) format.
     *
     * # Examples
     *
     * - `[
     * "192.168.1.140",
     * "fe80::abc2:4a28:737a:609e",
     * ]`
     */
    public const val HOST_IP: String = "host.ip"

    /**
     * Available MAC addresses of the host, excluding loopback interfaces.
     *
     * ## Notes
     *
     * MAC Addresses MUST be represented in [IEEE RA hexadecimal form](https://standards.ieee.org/wp-content/uploads/import/documents/tutorials/eui.pdf): as hyphen-separated octets in uppercase hexadecimal form from most to least significant.
     *
     * # Examples
     *
     * - `[
     * "AC-DE-48-23-45-67",
     * "AC-DE-48-23-45-67-01-9F",
     * ]`
     */
    public const val HOST_MAC: String = "host.mac"

    /**
     * Name of the host. On Unix systems, it may contain what the hostname command returns, or the fully qualified hostname, or another name specified by the user.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"opentelemetry-test"`
     */
    public const val HOST_NAME: String = "host.name"

    /**
     * Type of host. For Cloud, this must be the machine type.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"n1-standard-1"`
     */
    public const val HOST_TYPE: String = "host.type"

    /**
     * Deprecated, use `client.address` instead.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"83.164.160.102"`
     */
    @Deprecated("{note: Replaced by `client.address`., reason: renamed, renamed_to: client.address}")
    public const val HTTP_CLIENT_IP: String = "http.client_ip"

    /**
     * State of the HTTP connection in the HTTP connection pool.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"active"`
     * - `"idle"`
     */
    public const val HTTP_CONNECTION_STATE: String = "http.connection.state"

    /**
     * Deprecated, use `network.protocol.name` instead.
     *
     * ## Notes
     */
    @Deprecated("{note: Replaced by `network.protocol.name`., reason: renamed, renamed_to: network.protocol.name}")
    public const val HTTP_FLAVOR: String = "http.flavor"

    /**
     * Deprecated, use one of `server.address`, `client.address` or `http.request.header.host` instead, depending on the usage.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"www.example.org"`
     */
    @Deprecated("{note: Replaced by one of `server.address`, `client.address` or `http.request.header.host`, depending on the usage.\n, reason: uncategorized}")
    public const val HTTP_HOST: String = "http.host"

    /**
     * Deprecated, use `http.request.method` instead.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"GET"`
     * - `"POST"`
     * - `"HEAD"`
     */
    @Deprecated("{note: Replaced by `http.request.method`., reason: renamed, renamed_to: http.request.method}")
    public const val HTTP_METHOD: String = "http.method"

    /**
     * The size of the request payload body in bytes. This is the number of bytes transferred excluding headers and is often, but not always, present as the [Content-Length](https://www.rfc-editor.org/rfc/rfc9110.html#field.content-length) header. For requests using transport encoding, this should be the compressed size.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `3495`
     */
    public const val HTTP_REQUEST_BODY_SIZE: String = "http.request.body.size"

    /**
     * HTTP request headers, ``key`` being the normalized HTTP Header name (lowercase), the value being the header values.
     *
     * ## Notes
     *
     * Instrumentations SHOULD require an explicit configuration of which headers are to be captured.
     * Including all request headers can be a security risk - explicit configuration helps avoid leaking sensitive information.
     *
     * The `User-Agent` header is already captured in the `user_agent.original` attribute.
     * Users MAY explicitly configure instrumentations to capture them even though it is not recommended.
     *
     * The attribute value MUST consist of either multiple header values as an array of strings
     * or a single-item array containing a possibly comma-concatenated string, depending on the way
     * the HTTP library provides access to headers.
     *
     * Examples:
     *
     * - A header `Content-Type: application/json` SHOULD be recorded as the `http.request.header.content-type`
     * attribute with value `["application/json"]`.
     * - A header `X-Forwarded-For: 1.2.3.4, 1.2.3.5` SHOULD be recorded as the `http.request.header.x-forwarded-for`
     * attribute with value `["1.2.3.4", "1.2.3.5"]` or `["1.2.3.4, 1.2.3.5"]` depending on the HTTP library.
     *
     * # Examples
     *
     * - `[
     * "application/json",
     * ]`
     * - `[
     * "1.2.3.4",
     * "1.2.3.5",
     * ]`
     */
    public const val HTTP_REQUEST_HEADER: String = "http.request.header"

    /**
     * HTTP request method.
     *
     * ## Notes
     *
     * HTTP request method value SHOULD be "known" to the instrumentation.
     * By default, this convention defines "known" methods as the ones listed in [RFC9110](https://www.rfc-editor.org/rfc/rfc9110.html#name-methods)
     * and the PATCH method defined in [RFC5789](https://www.rfc-editor.org/rfc/rfc5789.html).
     *
     * If the HTTP request method is not known to instrumentation, it MUST set the `http.request.method` attribute to `_OTHER`.
     *
     * If the HTTP instrumentation could end up converting valid HTTP request methods to `_OTHER`, then it MUST provide a way to override
     * the list of known HTTP methods. If this override is done via environment variable, then the environment variable MUST be named
     * OTEL_INSTRUMENTATION_HTTP_KNOWN_METHODS and support a comma-separated list of case-sensitive known HTTP methods
     * (this list MUST be a full override of the default known method, it is not a list of known methods in addition to the defaults).
     *
     * HTTP method names are case-sensitive and `http.request.method` attribute value MUST match a known HTTP method name exactly.
     * Instrumentations for specific web frameworks that consider HTTP methods to be case insensitive, SHOULD populate a canonical equivalent.
     * Tracing instrumentations that do so, MUST also set `http.request.method_original` to the original value.
     *
     * # Examples
     *
     * - `"GET"`
     * - `"POST"`
     * - `"HEAD"`
     */
    public const val HTTP_REQUEST_METHOD: String = "http.request.method"

    /**
     * Original HTTP method sent by the client in the request line.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"GeT"`
     * - `"ACL"`
     * - `"foo"`
     */
    public const val HTTP_REQUEST_METHOD_ORIGINAL: String = "http.request.method_original"

    /**
     * The ordinal number of request resending attempt (for any reason, including redirects).
     *
     * ## Notes
     *
     * The resend count SHOULD be updated each time an HTTP request gets resent by the client, regardless of what was the cause of the resending (e.g. redirection, authorization failure, 503 Server Unavailable, network issues, or any other).
     *
     * # Examples
     *
     * - `3`
     */
    public const val HTTP_REQUEST_RESEND_COUNT: String = "http.request.resend_count"

    /**
     * The total size of the request in bytes. This should be the total number of bytes sent over the wire, including the request line (HTTP/1.1), framing (HTTP/2 and HTTP/3), headers, and request body if any.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `1437`
     */
    public const val HTTP_REQUEST_SIZE: String = "http.request.size"

    /**
     * Deprecated, use `http.request.header.content-length` instead.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `3495`
     */
    @Deprecated("{note: Replaced by `http.request.header.content-length`., reason: uncategorized}")
    public const val HTTP_REQUEST_CONTENT_LENGTH: String = "http.request_content_length"

    /**
     * Deprecated, use `http.request.body.size` instead.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `5493`
     */
    @Deprecated("{note: Replaced by `http.request.body.size`., reason: renamed, renamed_to: http.request.body.size}")
    public const val HTTP_REQUEST_CONTENT_LENGTH_UNCOMPRESSED: String = "http.request_content_length_uncompressed"

    /**
     * The size of the response payload body in bytes. This is the number of bytes transferred excluding headers and is often, but not always, present as the [Content-Length](https://www.rfc-editor.org/rfc/rfc9110.html#field.content-length) header. For requests using transport encoding, this should be the compressed size.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `3495`
     */
    public const val HTTP_RESPONSE_BODY_SIZE: String = "http.response.body.size"

    /**
     * HTTP response headers, ``key`` being the normalized HTTP Header name (lowercase), the value being the header values.
     *
     * ## Notes
     *
     * Instrumentations SHOULD require an explicit configuration of which headers are to be captured.
     * Including all response headers can be a security risk - explicit configuration helps avoid leaking sensitive information.
     *
     * Users MAY explicitly configure instrumentations to capture them even though it is not recommended.
     *
     * The attribute value MUST consist of either multiple header values as an array of strings
     * or a single-item array containing a possibly comma-concatenated string, depending on the way
     * the HTTP library provides access to headers.
     *
     * Examples:
     *
     * - A header `Content-Type: application/json` header SHOULD be recorded as the `http.request.response.content-type`
     * attribute with value `["application/json"]`.
     * - A header `My-custom-header: abc, def` header SHOULD be recorded as the `http.response.header.my-custom-header`
     * attribute with value `["abc", "def"]` or `["abc, def"]` depending on the HTTP library.
     *
     * # Examples
     *
     * - `[
     * "application/json",
     * ]`
     * - `[
     * "abc",
     * "def",
     * ]`
     */
    public const val HTTP_RESPONSE_HEADER: String = "http.response.header"

    /**
     * The total size of the response in bytes. This should be the total number of bytes sent over the wire, including the status line (HTTP/1.1), framing (HTTP/2 and HTTP/3), headers, and response body and trailers if any.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `1437`
     */
    public const val HTTP_RESPONSE_SIZE: String = "http.response.size"

    /**
     * [HTTP response status code](https://tools.ietf.org/html/rfc7231#section-6).
     *
     * ## Notes
     *
     * # Examples
     *
     * - `200`
     */
    public const val HTTP_RESPONSE_STATUS_CODE: String = "http.response.status_code"

    /**
     * Deprecated, use `http.response.header.content-length` instead.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `3495`
     */
    @Deprecated("{note: Replaced by `http.response.header.content-length`., reason: uncategorized}")
    public const val HTTP_RESPONSE_CONTENT_LENGTH: String = "http.response_content_length"

    /**
     * Deprecated, use `http.response.body.size` instead.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `5493`
     */
    @Deprecated("{note: Replaced by `http.response.body.size`., reason: renamed, renamed_to: http.response.body.size}")
    public const val HTTP_RESPONSE_CONTENT_LENGTH_UNCOMPRESSED: String = "http.response_content_length_uncompressed"

    /**
     * The matched route, that is, the path template in the format used by the respective server framework.
     *
     * ## Notes
     *
     * MUST NOT be populated when this is not supported by the HTTP server framework as the route attribute should have low-cardinality and the URI path can NOT substitute it.
     * SHOULD include the [application root](/docs/http/http-spans.md#http-server-definitions) if there is one.
     *
     * # Examples
     *
     * - `"/users/:userID?"`
     * - `"{controller}/{action}/{id?}"`
     */
    public const val HTTP_ROUTE: String = "http.route"

    /**
     * Deprecated, use `url.scheme` instead.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"http"`
     * - `"https"`
     */
    @Deprecated("{note: Replaced by `url.scheme`., reason: renamed, renamed_to: url.scheme}")
    public const val HTTP_SCHEME: String = "http.scheme"

    /**
     * Deprecated, use `server.address` instead.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"example.com"`
     */
    @Deprecated("{note: Replaced by `server.address`., reason: renamed, renamed_to: server.address}")
    public const val HTTP_SERVER_NAME: String = "http.server_name"

    /**
     * Deprecated, use `http.response.status_code` instead.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `200`
     */
    @Deprecated("{note: Replaced by `http.response.status_code`., reason: renamed, renamed_to: http.response.status_code}")
    public const val HTTP_STATUS_CODE: String = "http.status_code"

    /**
     * Deprecated, use `url.path` and `url.query` instead.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"/search?q=OpenTelemetry#SemConv"`
     */
    @Deprecated("{note: Split to `url.path` and `url.query`., reason: obsoleted}")
    public const val HTTP_TARGET: String = "http.target"

    /**
     * Deprecated, use `url.full` instead.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"https://www.foo.bar/search?q=OpenTelemetry#SemConv"`
     */
    @Deprecated("{note: Replaced by `url.full`., reason: renamed, renamed_to: url.full}")
    public const val HTTP_URL: String = "http.url"

    /**
     * Deprecated, use `user_agent.original` instead.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"CERN-LineMode/2.15 libwww/2.17b3"`
     * - `"Mozilla/5.0 (iPhone; CPU iPhone OS 14_7_1 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/14.1.2 Mobile/15E148 Safari/604.1"`
     */
    @Deprecated("{note: Replaced by `user_agent.original`., reason: renamed, renamed_to: user_agent.original}")
    public const val HTTP_USER_AGENT: String = "http.user_agent"

    /**
     * An identifier for the hardware component, unique within the monitored host
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"win32battery_battery_testsysa33_1"`
     */
    public const val HW_ID: String = "hw.id"

    /**
     * An easily-recognizable name for the hardware component
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"eth0"`
     */
    public const val HW_NAME: String = "hw.name"

    /**
     * Unique identifier of the parent component (typically the `hw.id` attribute of the enclosure, or disk controller)
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"dellStorage_perc_0"`
     */
    public const val HW_PARENT: String = "hw.parent"

    /**
     * The current state of the component
     *
     * ## Notes
     */
    public const val HW_STATE: String = "hw.state"

    /**
     * Type of the component
     *
     * ## Notes
     *
     * Describes the category of the hardware component for which `hw.state` is being reported. For example, `hw.type=temperature` along with `hw.state=degraded` would indicate that the temperature of the hardware component has been reported as `degraded`
     */
    public const val HW_TYPE: String = "hw.type"

    /**
     * This attribute represents the state of the application.
     *
     * ## Notes
     *
     * The iOS lifecycle states are defined in the [UIApplicationDelegate documentation](https://developer.apple.com/documentation/uikit/uiapplicationdelegate), and from which the `OS terminology` column values are derived
     */
    public const val IOS_APP_STATE: String = "ios.app.state"

    /**
     * ## Notes
     *
     * The iOS lifecycle states are defined in the [UIApplicationDelegate documentation](https://developer.apple.com/documentation/uikit/uiapplicationdelegate), and from which the `OS terminology` column values are derived
     */
    @Deprecated("{note: Replaced by the `ios.app.state` event body field., reason: uncategorized}")
    public const val IOS_STATE: String = "ios.state"

    /**
     * Name of the buffer pool.
     *
     * ## Notes
     *
     * Pool names are generally obtained via [BufferPoolMXBean#getName()](https://docs.oracle.com/en/java/javase/11/docs/api/java.management/java/lang/management/BufferPoolMXBean.html#getName()).
     *
     * # Examples
     *
     * - `"mapped"`
     * - `"direct"`
     */
    public const val JVM_BUFFER_POOL_NAME: String = "jvm.buffer.pool.name"

    /**
     * Name of the garbage collector action.
     *
     * ## Notes
     *
     * Garbage collector action is generally obtained via [GarbageCollectionNotificationInfo#getGcAction()](https://docs.oracle.com/en/java/javase/11/docs/api/jdk.management/com/sun/management/GarbageCollectionNotificationInfo.html#getGcAction()).
     *
     * # Examples
     *
     * - `"end of minor GC"`
     * - `"end of major GC"`
     */
    public const val JVM_GC_ACTION: String = "jvm.gc.action"

    /**
     * Name of the garbage collector cause.
     *
     * ## Notes
     *
     * Garbage collector cause is generally obtained via [GarbageCollectionNotificationInfo#getGcCause()](https://docs.oracle.com/en/java/javase/11/docs/api/jdk.management/com/sun/management/GarbageCollectionNotificationInfo.html#getGcCause()).
     *
     * # Examples
     *
     * - `"System.gc()"`
     * - `"Allocation Failure"`
     */
    public const val JVM_GC_CAUSE: String = "jvm.gc.cause"

    /**
     * Name of the garbage collector.
     *
     * ## Notes
     *
     * Garbage collector name is generally obtained via [GarbageCollectionNotificationInfo#getGcName()](https://docs.oracle.com/en/java/javase/11/docs/api/jdk.management/com/sun/management/GarbageCollectionNotificationInfo.html#getGcName()).
     *
     * # Examples
     *
     * - `"G1 Young Generation"`
     * - `"G1 Old Generation"`
     */
    public const val JVM_GC_NAME: String = "jvm.gc.name"

    /**
     * Name of the memory pool.
     *
     * ## Notes
     *
     * Pool names are generally obtained via [MemoryPoolMXBean#getName()](https://docs.oracle.com/en/java/javase/11/docs/api/java.management/java/lang/management/MemoryPoolMXBean.html#getName()).
     *
     * # Examples
     *
     * - `"G1 Old Gen"`
     * - `"G1 Eden space"`
     * - `"G1 Survivor Space"`
     */
    public const val JVM_MEMORY_POOL_NAME: String = "jvm.memory.pool.name"

    /**
     * The type of memory.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"heap"`
     * - `"non_heap"`
     */
    public const val JVM_MEMORY_TYPE: String = "jvm.memory.type"

    /**
     * Whether the thread is daemon or not.
     *
     * ## Notes
     */
    public const val JVM_THREAD_DAEMON: String = "jvm.thread.daemon"

    /**
     * State of the thread.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"runnable"`
     * - `"blocked"`
     */
    public const val JVM_THREAD_STATE: String = "jvm.thread.state"

    /**
     * The name of the cluster.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"opentelemetry-cluster"`
     */
    public const val K8S_CLUSTER_NAME: String = "k8s.cluster.name"

    /**
     * A pseudo-ID for the cluster, set to the UID of the `kube-system` namespace.
     *
     * ## Notes
     *
     * K8s doesn't have support for obtaining a cluster ID. If this is ever
     * added, we will recommend collecting the `k8s.cluster.uid` through the
     * official APIs. In the meantime, we are able to use the `uid` of the
     * `kube-system` namespace as a proxy for cluster ID. Read on for the
     * rationale.
     *
     * Every object created in a K8s cluster is assigned a distinct UID. The
     * `kube-system` namespace is used by Kubernetes itself and will exist
     * for the lifetime of the cluster. Using the `uid` of the `kube-system`
     * namespace is a reasonable proxy for the K8s ClusterID as it will only
     * change if the cluster is rebuilt. Furthermore, Kubernetes UIDs are
     * UUIDs as standardized by
     * [ISO/IEC 9834-8 and ITU-T X.667](https://www.itu.int/ITU-T/studygroups/com17/oid.html).
     * Which states:
     *
     * \] If generated according to one of the mechanisms defined in Rec.
     * \] ITU-T X.667 | ISO/IEC 9834-8, a UUID is either guaranteed to be
     * \] different from all other UUIDs generated before 3603 A.D., or is
     * \] extremely likely to be different (depending on the mechanism chosen).
     *
     * Therefore, UIDs between clusters should be extremely unlikely to
     * conflict.
     *
     * # Examples
     *
     * - `"218fc5a9-a5f1-4b54-aa05-46717d0ab26d"`
     */
    public const val K8S_CLUSTER_UID: String = "k8s.cluster.uid"

    /**
     * The name of the Container from Pod specification, must be unique within a Pod. Container runtime usually uses different globally unique name (`container.name`).
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"redis"`
     */
    public const val K8S_CONTAINER_NAME: String = "k8s.container.name"

    /**
     * Number of times the container was restarted. This attribute can be used to identify a particular container (running or stopped) within a container spec.
     *
     * ## Notes
     */
    public const val K8S_CONTAINER_RESTART_COUNT: String = "k8s.container.restart_count"

    /**
     * Last terminated reason of the Container.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"Evicted"`
     * - `"Error"`
     */
    public const val K8S_CONTAINER_STATUS_LAST_TERMINATED_REASON: String = "k8s.container.status.last_terminated_reason"

    /**
     * The reason for the container state. Corresponds to the `reason` field of the: [K8s ContainerStateWaiting](https://kubernetes.io/docs/reference/generated/kubernetes-api/v1.30/#containerstatewaiting-v1-core) or [K8s ContainerStateTerminated](https://kubernetes.io/docs/reference/generated/kubernetes-api/v1.30/#containerstateterminated-v1-core)
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"ContainerCreating"`
     * - `"CrashLoopBackOff"`
     * - `"CreateContainerConfigError"`
     * - `"ErrImagePull"`
     * - `"ImagePullBackOff"`
     * - `"OOMKilled"`
     * - `"Completed"`
     * - `"Error"`
     * - `"ContainerCannotRun"`
     */
    public const val K8S_CONTAINER_STATUS_REASON: String = "k8s.container.status.reason"

    /**
     * The state of the container. [K8s ContainerState](https://kubernetes.io/docs/reference/generated/kubernetes-api/v1.30/#containerstate-v1-core)
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"terminated"`
     * - `"running"`
     * - `"waiting"`
     */
    public const val K8S_CONTAINER_STATUS_STATE: String = "k8s.container.status.state"

    /**
     * The cronjob annotation placed on the CronJob, the ``key`` being the annotation name, the value being the annotation value.
     *
     * ## Notes
     *
     * Examples:
     *
     * - An annotation `retries` with value `4` SHOULD be recorded as the
     * `k8s.cronjob.annotation.retries` attribute with value `"4"`.
     * - An annotation `data` with empty string value SHOULD be recorded as
     * the `k8s.cronjob.annotation.data` attribute with value `""`.
     *
     * # Examples
     *
     * - `"4"`
     * - `""`
     */
    public const val K8S_CRONJOB_ANNOTATION: String = "k8s.cronjob.annotation"

    /**
     * The label placed on the CronJob, the ``key`` being the label name, the value being the label value.
     *
     * ## Notes
     *
     * Examples:
     *
     * - A label `type` with value `weekly` SHOULD be recorded as the
     * `k8s.cronjob.label.type` attribute with value `"weekly"`.
     * - A label `automated` with empty string value SHOULD be recorded as
     * the `k8s.cronjob.label.automated` attribute with value `""`.
     *
     * # Examples
     *
     * - `"weekly"`
     * - `""`
     */
    public const val K8S_CRONJOB_LABEL: String = "k8s.cronjob.label"

    /**
     * The name of the CronJob.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"opentelemetry"`
     */
    public const val K8S_CRONJOB_NAME: String = "k8s.cronjob.name"

    /**
     * The UID of the CronJob.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"275ecb36-5aa8-4c2a-9c47-d8bb681b9aff"`
     */
    public const val K8S_CRONJOB_UID: String = "k8s.cronjob.uid"

    /**
     * The annotation placed on the DaemonSet, the ``key`` being the annotation name, the value being the annotation value, even if the value is empty.
     *
     * ## Notes
     *
     * Examples:
     *
     * - A label `replicas` with value `1` SHOULD be recorded
     * as the `k8s.daemonset.annotation.replicas` attribute with value `"1"`.
     * - A label `data` with empty string value SHOULD be recorded as
     * the `k8s.daemonset.annotation.data` attribute with value `""`.
     *
     * # Examples
     *
     * - `"1"`
     * - `""`
     */
    public const val K8S_DAEMONSET_ANNOTATION: String = "k8s.daemonset.annotation"

    /**
     * The label placed on the DaemonSet, the ``key`` being the label name, the value being the label value, even if the value is empty.
     *
     * ## Notes
     *
     * Examples:
     *
     * - A label `app` with value `guestbook` SHOULD be recorded
     * as the `k8s.daemonset.label.app` attribute with value `"guestbook"`.
     * - A label `data` with empty string value SHOULD be recorded as
     * the `k8s.daemonset.label.injected` attribute with value `""`.
     *
     * # Examples
     *
     * - `"guestbook"`
     * - `""`
     */
    public const val K8S_DAEMONSET_LABEL: String = "k8s.daemonset.label"

    /**
     * The name of the DaemonSet.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"opentelemetry"`
     */
    public const val K8S_DAEMONSET_NAME: String = "k8s.daemonset.name"

    /**
     * The UID of the DaemonSet.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"275ecb36-5aa8-4c2a-9c47-d8bb681b9aff"`
     */
    public const val K8S_DAEMONSET_UID: String = "k8s.daemonset.uid"

    /**
     * The annotation placed on the Deployment, the ``key`` being the annotation name, the value being the annotation value, even if the value is empty.
     *
     * ## Notes
     *
     * Examples:
     *
     * - A label `replicas` with value `1` SHOULD be recorded
     * as the `k8s.deployment.annotation.replicas` attribute with value `"1"`.
     * - A label `data` with empty string value SHOULD be recorded as
     * the `k8s.deployment.annotation.data` attribute with value `""`.
     *
     * # Examples
     *
     * - `"1"`
     * - `""`
     */
    public const val K8S_DEPLOYMENT_ANNOTATION: String = "k8s.deployment.annotation"

    /**
     * The label placed on the Deployment, the ``key`` being the label name, the value being the label value, even if the value is empty.
     *
     * ## Notes
     *
     * Examples:
     *
     * - A label `replicas` with value `0` SHOULD be recorded
     * as the `k8s.deployment.label.app` attribute with value `"guestbook"`.
     * - A label `injected` with empty string value SHOULD be recorded as
     * the `k8s.deployment.label.injected` attribute with value `""`.
     *
     * # Examples
     *
     * - `"guestbook"`
     * - `""`
     */
    public const val K8S_DEPLOYMENT_LABEL: String = "k8s.deployment.label"

    /**
     * The name of the Deployment.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"opentelemetry"`
     */
    public const val K8S_DEPLOYMENT_NAME: String = "k8s.deployment.name"

    /**
     * The UID of the Deployment.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"275ecb36-5aa8-4c2a-9c47-d8bb681b9aff"`
     */
    public const val K8S_DEPLOYMENT_UID: String = "k8s.deployment.uid"

    /**
     * The type of metric source for the horizontal pod autoscaler.
     *
     * ## Notes
     *
     * This attribute reflects the `type` field of spec.metrics\[\] in the HPA.
     *
     * # Examples
     *
     * - `"Resource"`
     * - `"ContainerResource"`
     */
    public const val K8S_HPA_METRIC_TYPE: String = "k8s.hpa.metric.type"

    /**
     * The name of the horizontal pod autoscaler.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"opentelemetry"`
     */
    public const val K8S_HPA_NAME: String = "k8s.hpa.name"

    /**
     * The API version of the target resource to scale for the HorizontalPodAutoscaler.
     *
     * ## Notes
     *
     * This maps to the `apiVersion` field in the `scaleTargetRef` of the HPA spec.
     *
     * # Examples
     *
     * - `"apps/v1"`
     * - `"autoscaling/v2"`
     */
    public const val K8S_HPA_SCALETARGETREF_API_VERSION: String = "k8s.hpa.scaletargetref.api_version"

    /**
     * The kind of the target resource to scale for the HorizontalPodAutoscaler.
     *
     * ## Notes
     *
     * This maps to the `kind` field in the `scaleTargetRef` of the HPA spec.
     *
     * # Examples
     *
     * - `"Deployment"`
     * - `"StatefulSet"`
     */
    public const val K8S_HPA_SCALETARGETREF_KIND: String = "k8s.hpa.scaletargetref.kind"

    /**
     * The name of the target resource to scale for the HorizontalPodAutoscaler.
     *
     * ## Notes
     *
     * This maps to the `name` field in the `scaleTargetRef` of the HPA spec.
     *
     * # Examples
     *
     * - `"my-deployment"`
     * - `"my-statefulset"`
     */
    public const val K8S_HPA_SCALETARGETREF_NAME: String = "k8s.hpa.scaletargetref.name"

    /**
     * The UID of the horizontal pod autoscaler.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"275ecb36-5aa8-4c2a-9c47-d8bb681b9aff"`
     */
    public const val K8S_HPA_UID: String = "k8s.hpa.uid"

    /**
     * The size (identifier) of the K8s huge page.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"2Mi"`
     */
    public const val K8S_HUGEPAGE_SIZE: String = "k8s.hugepage.size"

    /**
     * The annotation placed on the Job, the ``key`` being the annotation name, the value being the annotation value, even if the value is empty.
     *
     * ## Notes
     *
     * Examples:
     *
     * - A label `number` with value `1` SHOULD be recorded
     * as the `k8s.job.annotation.number` attribute with value `"1"`.
     * - A label `data` with empty string value SHOULD be recorded as
     * the `k8s.job.annotation.data` attribute with value `""`.
     *
     * # Examples
     *
     * - `"1"`
     * - `""`
     */
    public const val K8S_JOB_ANNOTATION: String = "k8s.job.annotation"

    /**
     * The label placed on the Job, the ``key`` being the label name, the value being the label value, even if the value is empty.
     *
     * ## Notes
     *
     * Examples:
     *
     * - A label `jobtype` with value `ci` SHOULD be recorded
     * as the `k8s.job.label.jobtype` attribute with value `"ci"`.
     * - A label `data` with empty string value SHOULD be recorded as
     * the `k8s.job.label.automated` attribute with value `""`.
     *
     * # Examples
     *
     * - `"ci"`
     * - `""`
     */
    public const val K8S_JOB_LABEL: String = "k8s.job.label"

    /**
     * The name of the Job.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"opentelemetry"`
     */
    public const val K8S_JOB_NAME: String = "k8s.job.name"

    /**
     * The UID of the Job.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"275ecb36-5aa8-4c2a-9c47-d8bb681b9aff"`
     */
    public const val K8S_JOB_UID: String = "k8s.job.uid"

    /**
     * The annotation placed on the Namespace, the ``key`` being the annotation name, the value being the annotation value, even if the value is empty.
     *
     * ## Notes
     *
     * Examples:
     *
     * - A label `ttl` with value `0` SHOULD be recorded
     * as the `k8s.namespace.annotation.ttl` attribute with value `"0"`.
     * - A label `data` with empty string value SHOULD be recorded as
     * the `k8s.namespace.annotation.data` attribute with value `""`.
     *
     * # Examples
     *
     * - `"0"`
     * - `""`
     */
    public const val K8S_NAMESPACE_ANNOTATION: String = "k8s.namespace.annotation"

    /**
     * The label placed on the Namespace, the ``key`` being the label name, the value being the label value, even if the value is empty.
     *
     * ## Notes
     *
     * Examples:
     *
     * - A label `kubernetes.io/metadata.name` with value `default` SHOULD be recorded
     * as the `k8s.namespace.label.kubernetes.io/metadata.name` attribute with value `"default"`.
     * - A label `data` with empty string value SHOULD be recorded as
     * the `k8s.namespace.label.data` attribute with value `""`.
     *
     * # Examples
     *
     * - `"default"`
     * - `""`
     */
    public const val K8S_NAMESPACE_LABEL: String = "k8s.namespace.label"

    /**
     * The name of the namespace that the pod is running in.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"default"`
     */
    public const val K8S_NAMESPACE_NAME: String = "k8s.namespace.name"

    /**
     * The phase of the K8s namespace.
     *
     * ## Notes
     *
     * This attribute aligns with the `phase` field of the
     * [K8s NamespaceStatus](https://kubernetes.io/docs/reference/generated/kubernetes-api/v1.30/#namespacestatus-v1-core)
     *
     * # Examples
     *
     * - `"active"`
     * - `"terminating"`
     */
    public const val K8S_NAMESPACE_PHASE: String = "k8s.namespace.phase"

    /**
     * The annotation placed on the Node, the ``key`` being the annotation name, the value being the annotation value, even if the value is empty.
     *
     * ## Notes
     *
     * Examples:
     *
     * - An annotation `node.alpha.kubernetes.io/ttl` with value `0` SHOULD be recorded as
     * the `k8s.node.annotation.node.alpha.kubernetes.io/ttl` attribute with value `"0"`.
     * - An annotation `data` with empty string value SHOULD be recorded as
     * the `k8s.node.annotation.data` attribute with value `""`.
     *
     * # Examples
     *
     * - `"0"`
     * - `""`
     */
    public const val K8S_NODE_ANNOTATION: String = "k8s.node.annotation"

    /**
     * The status of the condition, one of True, False, Unknown.
     *
     * ## Notes
     *
     * This attribute aligns with the `status` field of the
     * [NodeCondition](https://kubernetes.io/docs/reference/generated/kubernetes-api/v1.30/#nodecondition-v1-core)
     *
     * # Examples
     *
     * - `"true"`
     * - `"false"`
     * - `"unknown"`
     */
    public const val K8S_NODE_CONDITION_STATUS: String = "k8s.node.condition.status"

    /**
     * The condition type of a K8s Node.
     *
     * ## Notes
     *
     * K8s Node conditions as described
     * by [K8s documentation](https://v1-32.docs.kubernetes.io/docs/reference/node/node-status/#condition).
     *
     * This attribute aligns with the `type` field of the
     * [NodeCondition](https://kubernetes.io/docs/reference/generated/kubernetes-api/v1.30/#nodecondition-v1-core)
     *
     * The set of possible values is not limited to those listed here. Managed Kubernetes environments,
     * or custom controllers MAY introduce additional node condition types.
     * When this occurs, the exact value as reported by the Kubernetes API SHOULD be used.
     *
     * # Examples
     *
     * - `"Ready"`
     * - `"DiskPressure"`
     */
    public const val K8S_NODE_CONDITION_TYPE: String = "k8s.node.condition.type"

    /**
     * The label placed on the Node, the ``key`` being the label name, the value being the label value, even if the value is empty.
     *
     * ## Notes
     *
     * Examples:
     *
     * - A label `kubernetes.io/arch` with value `arm64` SHOULD be recorded
     * as the `k8s.node.label.kubernetes.io/arch` attribute with value `"arm64"`.
     * - A label `data` with empty string value SHOULD be recorded as
     * the `k8s.node.label.data` attribute with value `""`.
     *
     * # Examples
     *
     * - `"arm64"`
     * - `""`
     */
    public const val K8S_NODE_LABEL: String = "k8s.node.label"

    /**
     * The name of the Node.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"node-1"`
     */
    public const val K8S_NODE_NAME: String = "k8s.node.name"

    /**
     * The UID of the Node.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"1eb3a0c6-0477-4080-a9cb-0cb7db65c6a2"`
     */
    public const val K8S_NODE_UID: String = "k8s.node.uid"

    /**
     * The annotation placed on the Pod, the ``key`` being the annotation name, the value being the annotation value.
     *
     * ## Notes
     *
     * Examples:
     *
     * - An annotation `kubernetes.io/enforce-mountable-secrets` with value `true` SHOULD be recorded as
     * the `k8s.pod.annotation.kubernetes.io/enforce-mountable-secrets` attribute with value `"true"`.
     * - An annotation `mycompany.io/arch` with value `x64` SHOULD be recorded as
     * the `k8s.pod.annotation.mycompany.io/arch` attribute with value `"x64"`.
     * - An annotation `data` with empty string value SHOULD be recorded as
     * the `k8s.pod.annotation.data` attribute with value `""`.
     *
     * # Examples
     *
     * - `"true"`
     * - `"x64"`
     * - `""`
     */
    public const val K8S_POD_ANNOTATION: String = "k8s.pod.annotation"

    /**
     * The label placed on the Pod, the ``key`` being the label name, the value being the label value.
     *
     * ## Notes
     *
     * Examples:
     *
     * - A label `app` with value `my-app` SHOULD be recorded as
     * the `k8s.pod.label.app` attribute with value `"my-app"`.
     * - A label `mycompany.io/arch` with value `x64` SHOULD be recorded as
     * the `k8s.pod.label.mycompany.io/arch` attribute with value `"x64"`.
     * - A label `data` with empty string value SHOULD be recorded as
     * the `k8s.pod.label.data` attribute with value `""`.
     *
     * # Examples
     *
     * - `"my-app"`
     * - `"x64"`
     * - `""`
     */
    public const val K8S_POD_LABEL: String = "k8s.pod.label"

    /**
     * Deprecated, use `k8s.pod.label` instead.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"my-app"`
     */
    @Deprecated("{note: Replaced by `k8s.pod.label`., reason: renamed, renamed_to: k8s.pod.label}")
    public const val K8S_POD_LABELS: String = "k8s.pod.labels"

    /**
     * The name of the Pod.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"opentelemetry-pod-autoconf"`
     */
    public const val K8S_POD_NAME: String = "k8s.pod.name"

    /**
     * The UID of the Pod.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"275ecb36-5aa8-4c2a-9c47-d8bb681b9aff"`
     */
    public const val K8S_POD_UID: String = "k8s.pod.uid"

    /**
     * The annotation placed on the ReplicaSet, the ``key`` being the annotation name, the value being the annotation value, even if the value is empty.
     *
     * ## Notes
     *
     * Examples:
     *
     * - A label `replicas` with value `0` SHOULD be recorded
     * as the `k8s.replicaset.annotation.replicas` attribute with value `"0"`.
     * - A label `data` with empty string value SHOULD be recorded as
     * the `k8s.replicaset.annotation.data` attribute with value `""`.
     *
     * # Examples
     *
     * - `"0"`
     * - `""`
     */
    public const val K8S_REPLICASET_ANNOTATION: String = "k8s.replicaset.annotation"

    /**
     * The label placed on the ReplicaSet, the ``key`` being the label name, the value being the label value, even if the value is empty.
     *
     * ## Notes
     *
     * Examples:
     *
     * - A label `app` with value `guestbook` SHOULD be recorded
     * as the `k8s.replicaset.label.app` attribute with value `"guestbook"`.
     * - A label `injected` with empty string value SHOULD be recorded as
     * the `k8s.replicaset.label.injected` attribute with value `""`.
     *
     * # Examples
     *
     * - `"guestbook"`
     * - `""`
     */
    public const val K8S_REPLICASET_LABEL: String = "k8s.replicaset.label"

    /**
     * The name of the ReplicaSet.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"opentelemetry"`
     */
    public const val K8S_REPLICASET_NAME: String = "k8s.replicaset.name"

    /**
     * The UID of the ReplicaSet.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"275ecb36-5aa8-4c2a-9c47-d8bb681b9aff"`
     */
    public const val K8S_REPLICASET_UID: String = "k8s.replicaset.uid"

    /**
     * The name of the replication controller.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"opentelemetry"`
     */
    public const val K8S_REPLICATIONCONTROLLER_NAME: String = "k8s.replicationcontroller.name"

    /**
     * The UID of the replication controller.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"275ecb36-5aa8-4c2a-9c47-d8bb681b9aff"`
     */
    public const val K8S_REPLICATIONCONTROLLER_UID: String = "k8s.replicationcontroller.uid"

    /**
     * The name of the resource quota.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"opentelemetry"`
     */
    public const val K8S_RESOURCEQUOTA_NAME: String = "k8s.resourcequota.name"

    /**
     * The name of the K8s resource a resource quota defines.
     *
     * ## Notes
     *
     * The value for this attribute can be either the full `count/[resource][.[group]]` string (e.g., count/deployments.apps, count/pods), or, for certain core Kubernetes resources, just the resource name (e.g., pods, services, configmaps). Both forms are supported by Kubernetes for object count quotas. See [Kubernetes Resource Quotas documentation](https://kubernetes.io/docs/concepts/policy/resource-quotas/#object-count-quota) for more details.
     *
     * # Examples
     *
     * - `"count/replicationcontrollers"`
     */
    public const val K8S_RESOURCEQUOTA_RESOURCE_NAME: String = "k8s.resourcequota.resource_name"

    /**
     * The UID of the resource quota.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"275ecb36-5aa8-4c2a-9c47-d8bb681b9aff"`
     */
    public const val K8S_RESOURCEQUOTA_UID: String = "k8s.resourcequota.uid"

    /**
     * The annotation placed on the StatefulSet, the ``key`` being the annotation name, the value being the annotation value, even if the value is empty.
     *
     * ## Notes
     *
     * Examples:
     *
     * - A label `replicas` with value `1` SHOULD be recorded
     * as the `k8s.statefulset.annotation.replicas` attribute with value `"1"`.
     * - A label `data` with empty string value SHOULD be recorded as
     * the `k8s.statefulset.annotation.data` attribute with value `""`.
     *
     * # Examples
     *
     * - `"1"`
     * - `""`
     */
    public const val K8S_STATEFULSET_ANNOTATION: String = "k8s.statefulset.annotation"

    /**
     * The label placed on the StatefulSet, the ``key`` being the label name, the value being the label value, even if the value is empty.
     *
     * ## Notes
     *
     * Examples:
     *
     * - A label `replicas` with value `0` SHOULD be recorded
     * as the `k8s.statefulset.label.app` attribute with value `"guestbook"`.
     * - A label `injected` with empty string value SHOULD be recorded as
     * the `k8s.statefulset.label.injected` attribute with value `""`.
     *
     * # Examples
     *
     * - `"guestbook"`
     * - `""`
     */
    public const val K8S_STATEFULSET_LABEL: String = "k8s.statefulset.label"

    /**
     * The name of the StatefulSet.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"opentelemetry"`
     */
    public const val K8S_STATEFULSET_NAME: String = "k8s.statefulset.name"

    /**
     * The UID of the StatefulSet.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"275ecb36-5aa8-4c2a-9c47-d8bb681b9aff"`
     */
    public const val K8S_STATEFULSET_UID: String = "k8s.statefulset.uid"

    /**
     * The name of K8s [StorageClass](https://kubernetes.io/docs/reference/generated/kubernetes-api/v1.30/#storageclass-v1-storage-k8s-io) object.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"gold.storageclass.storage.k8s.io"`
     */
    public const val K8S_STORAGECLASS_NAME: String = "k8s.storageclass.name"

    /**
     * The name of the K8s volume.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"volume0"`
     */
    public const val K8S_VOLUME_NAME: String = "k8s.volume.name"

    /**
     * The type of the K8s volume.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"emptyDir"`
     * - `"persistentVolumeClaim"`
     */
    public const val K8S_VOLUME_TYPE: String = "k8s.volume.type"

    /**
     * The Linux Slab memory state
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"reclaimable"`
     * - `"unreclaimable"`
     */
    public const val LINUX_MEMORY_SLAB_STATE: String = "linux.memory.slab.state"

    /**
     * The basename of the file.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"audit.log"`
     */
    public const val LOG_FILE_NAME: String = "log.file.name"

    /**
     * The basename of the file, with symlinks resolved.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"uuid.log"`
     */
    public const val LOG_FILE_NAME_RESOLVED: String = "log.file.name_resolved"

    /**
     * The full path to the file.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"/var/log/mysql/audit.log"`
     */
    public const val LOG_FILE_PATH: String = "log.file.path"

    /**
     * The full path to the file, with symlinks resolved.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"/var/lib/docker/uuid.log"`
     */
    public const val LOG_FILE_PATH_RESOLVED: String = "log.file.path_resolved"

    /**
     * The stream associated with the log. See below for a list of well-known values.
     *
     * ## Notes
     */
    public const val LOG_IOSTREAM: String = "log.iostream"

    /**
     * The complete original Log Record.
     *
     * ## Notes
     *
     * This value MAY be added when processing a Log Record which was originally transmitted as a string or equivalent data type AND the Body field of the Log Record does not contain the same value. (e.g. a syslog or a log record read from a file.)
     *
     * # Examples
     *
     * - `"77 <86>1 2015-08-06T21:58:59.694Z 192.168.2.133 inactive - - - Something happened"`
     * - `"[INFO] 8/3/24 12:34:56 Something happened"`
     */
    public const val LOG_RECORD_ORIGINAL: String = "log.record.original"

    /**
     * A unique identifier for the Log Record.
     *
     * ## Notes
     *
     * If an id is provided, other log records with the same id will be considered duplicates and can be removed safely. This means, that two distinguishable log records MUST have different values.
     * The id MAY be an [Universally Unique Lexicographically Sortable Identifier (ULID)](https://github.com/ulid/spec), but other identifiers (e.g. UUID) may be used as needed.
     *
     * # Examples
     *
     * - `"01ARZ3NDEKTSV4RRFFQ69G5FAV"`
     */
    public const val LOG_RECORD_UID: String = "log.record.uid"

    /**
     * Name of the logical partition that hosts a systems with a mainframe operating system.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"LPAR01"`
     */
    public const val MAINFRAME_LPAR_NAME: String = "mainframe.lpar.name"

    /**
     * Deprecated, use `rpc.message.compressed_size` instead.
     *
     * ## Notes
     */
    @Deprecated("{note: Replaced by `rpc.message.compressed_size`., reason: renamed, renamed_to: rpc.message.compressed_size}")
    public const val MESSAGE_COMPRESSED_SIZE: String = "message.compressed_size"

    /**
     * Deprecated, use `rpc.message.id` instead.
     *
     * ## Notes
     */
    @Deprecated("{note: Replaced by `rpc.message.id`., reason: renamed, renamed_to: rpc.message.id}")
    public const val MESSAGE_ID: String = "message.id"

    /**
     * Deprecated, use `rpc.message.type` instead.
     *
     * ## Notes
     */
    @Deprecated("{note: Replaced by `rpc.message.type`., reason: renamed, renamed_to: rpc.message.type}")
    public const val MESSAGE_TYPE: String = "message.type"

    /**
     * Deprecated, use `rpc.message.uncompressed_size` instead.
     *
     * ## Notes
     */
    @Deprecated("{note: Replaced by `rpc.message.uncompressed_size`., reason: renamed, renamed_to: rpc.message.uncompressed_size}")
    public const val MESSAGE_UNCOMPRESSED_SIZE: String = "message.uncompressed_size"

    /**
     * The number of messages sent, received, or processed in the scope of the batching operation.
     *
     * ## Notes
     *
     * Instrumentations SHOULD NOT set `messaging.batch.message_count` on spans that operate with a single message. When a messaging client library supports both batch and single-message API for the same operation, instrumentations SHOULD use `messaging.batch.message_count` for batching APIs and SHOULD NOT use it for single-message APIs.
     *
     * # Examples
     *
     * - `0`
     * - `1`
     * - `2`
     */
    public const val MESSAGING_BATCH_MESSAGE_COUNT: String = "messaging.batch.message_count"

    /**
     * A unique identifier for the client that consumes or produces a message.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"client-5"`
     * - `"myhost@8742@s8083jm"`
     */
    public const val MESSAGING_CLIENT_ID: String = "messaging.client.id"

    /**
     * The name of the consumer group with which a consumer is associated.
     *
     * ## Notes
     *
     * Semantic conventions for individual messaging systems SHOULD document whether `messaging.consumer.group.name` is applicable and what it means in the context of that system.
     *
     * # Examples
     *
     * - `"my-group"`
     * - `"indexer"`
     */
    public const val MESSAGING_CONSUMER_GROUP_NAME: String = "messaging.consumer.group.name"

    /**
     * A boolean that is true if the message destination is anonymous (could be unnamed or have auto-generated name).
     *
     * ## Notes
     */
    public const val MESSAGING_DESTINATION_ANONYMOUS: String = "messaging.destination.anonymous"

    /**
     * The message destination name
     *
     * ## Notes
     *
     * Destination name SHOULD uniquely identify a specific queue, topic or other entity within the broker. If
     * the broker doesn't have such notion, the destination name SHOULD uniquely identify the broker.
     *
     * # Examples
     *
     * - `"MyQueue"`
     * - `"MyTopic"`
     */
    public const val MESSAGING_DESTINATION_NAME: String = "messaging.destination.name"

    /**
     * The identifier of the partition messages are sent to or received from, unique within the `messaging.destination.name`.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"1"`
     */
    public const val MESSAGING_DESTINATION_PARTITION_ID: String = "messaging.destination.partition.id"

    /**
     * The name of the destination subscription from which a message is consumed.
     *
     * ## Notes
     *
     * Semantic conventions for individual messaging systems SHOULD document whether `messaging.destination.subscription.name` is applicable and what it means in the context of that system.
     *
     * # Examples
     *
     * - `"subscription-a"`
     */
    public const val MESSAGING_DESTINATION_SUBSCRIPTION_NAME: String = "messaging.destination.subscription.name"

    /**
     * Low cardinality representation of the messaging destination name
     *
     * ## Notes
     *
     * Destination names could be constructed from templates. An example would be a destination name involving a user name or product id. Although the destination name in this case is of high cardinality, the underlying template is of low cardinality and can be effectively used for grouping and aggregation.
     *
     * # Examples
     *
     * - `"/customers/{customerId}"`
     */
    public const val MESSAGING_DESTINATION_TEMPLATE: String = "messaging.destination.template"

    /**
     * A boolean that is true if the message destination is temporary and might not exist anymore after messages are processed.
     *
     * ## Notes
     */
    public const val MESSAGING_DESTINATION_TEMPORARY: String = "messaging.destination.temporary"

    /**
     * Deprecated, no replacement at this time.
     *
     * ## Notes
     */
    @Deprecated("{note: Removed. No replacement at this time., reason: obsoleted}")
    public const val MESSAGING_DESTINATION_PUBLISH_ANONYMOUS: String = "messaging.destination_publish.anonymous"

    /**
     * Deprecated, no replacement at this time.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"MyQueue"`
     * - `"MyTopic"`
     */
    @Deprecated("{note: Removed. No replacement at this time., reason: obsoleted}")
    public const val MESSAGING_DESTINATION_PUBLISH_NAME: String = "messaging.destination_publish.name"

    /**
     * Deprecated, use `messaging.consumer.group.name` instead.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"\$Default"`
     */
    @Deprecated("{note: Replaced by `messaging.consumer.group.name`., reason: renamed, renamed_to: messaging.consumer.group.name}")
    public const val MESSAGING_EVENTHUBS_CONSUMER_GROUP: String = "messaging.eventhubs.consumer.group"

    /**
     * The UTC epoch seconds at which the message has been accepted and stored in the entity.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `1701393730`
     */
    public const val MESSAGING_EVENTHUBS_MESSAGE_ENQUEUED_TIME: String = "messaging.eventhubs.message.enqueued_time"

    /**
     * The ack deadline in seconds set for the modify ack deadline request.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `10`
     */
    public const val MESSAGING_GCP_PUBSUB_MESSAGE_ACK_DEADLINE: String = "messaging.gcp_pubsub.message.ack_deadline"

    /**
     * The ack id for a given message.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"ack_id"`
     */
    public const val MESSAGING_GCP_PUBSUB_MESSAGE_ACK_ID: String = "messaging.gcp_pubsub.message.ack_id"

    /**
     * The delivery attempt for a given message.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `2`
     */
    public const val MESSAGING_GCP_PUBSUB_MESSAGE_DELIVERY_ATTEMPT: String = "messaging.gcp_pubsub.message.delivery_attempt"

    /**
     * The ordering key for a given message. If the attribute is not present, the message does not have an ordering key.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"ordering_key"`
     */
    public const val MESSAGING_GCP_PUBSUB_MESSAGE_ORDERING_KEY: String = "messaging.gcp_pubsub.message.ordering_key"

    /**
     * Deprecated, use `messaging.consumer.group.name` instead.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"my-group"`
     */
    @Deprecated("{note: Replaced by `messaging.consumer.group.name`., reason: renamed, renamed_to: messaging.consumer.group.name}")
    public const val MESSAGING_KAFKA_CONSUMER_GROUP: String = "messaging.kafka.consumer.group"

    /**
     * Deprecated, use `messaging.destination.partition.id` instead.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `2`
     */
    @Deprecated("{note: Replaced by `messaging.destination.partition.id`., reason: renamed, renamed_to: messaging.destination.partition.id}")
    public const val MESSAGING_KAFKA_DESTINATION_PARTITION: String = "messaging.kafka.destination.partition"

    /**
     * Message keys in Kafka are used for grouping alike messages to ensure they're processed on the same partition. They differ from `messaging.message.id` in that they're not unique. If the key is `null`, the attribute MUST NOT be set.
     *
     * ## Notes
     *
     * If the key type is not string, it's string representation has to be supplied for the attribute. If the key has no unambiguous, canonical string form, don't include its value.
     *
     * # Examples
     *
     * - `"myKey"`
     */
    public const val MESSAGING_KAFKA_MESSAGE_KEY: String = "messaging.kafka.message.key"

    /**
     * Deprecated, use `messaging.kafka.offset` instead.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `42`
     */
    @Deprecated("{note: Replaced by `messaging.kafka.offset`., reason: renamed, renamed_to: messaging.kafka.offset}")
    public const val MESSAGING_KAFKA_MESSAGE_OFFSET: String = "messaging.kafka.message.offset"

    /**
     * A boolean that is true if the message is a tombstone.
     *
     * ## Notes
     */
    public const val MESSAGING_KAFKA_MESSAGE_TOMBSTONE: String = "messaging.kafka.message.tombstone"

    /**
     * The offset of a record in the corresponding Kafka partition.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `42`
     */
    public const val MESSAGING_KAFKA_OFFSET: String = "messaging.kafka.offset"

    /**
     * The size of the message body in bytes.
     *
     * ## Notes
     *
     * This can refer to both the compressed or uncompressed body size. If both sizes are known, the uncompressed
     * body size should be used.
     *
     * # Examples
     *
     * - `1439`
     */
    public const val MESSAGING_MESSAGE_BODY_SIZE: String = "messaging.message.body.size"

    /**
     * The conversation ID identifying the conversation to which the message belongs, represented as a string. Sometimes called "Correlation ID".
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"MyConversationId"`
     */
    public const val MESSAGING_MESSAGE_CONVERSATION_ID: String = "messaging.message.conversation_id"

    /**
     * The size of the message body and metadata in bytes.
     *
     * ## Notes
     *
     * This can refer to both the compressed or uncompressed size. If both sizes are known, the uncompressed
     * size should be used.
     *
     * # Examples
     *
     * - `2738`
     */
    public const val MESSAGING_MESSAGE_ENVELOPE_SIZE: String = "messaging.message.envelope.size"

    /**
     * A value used by the messaging system as an identifier for the message, represented as a string.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"452a7c7c7c7048c2f887f61572b18fc2"`
     */
    public const val MESSAGING_MESSAGE_ID: String = "messaging.message.id"

    /**
     * Deprecated, use `messaging.operation.type` instead.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"publish"`
     * - `"create"`
     * - `"process"`
     */
    @Deprecated("{note: Replaced by `messaging.operation.type`., reason: renamed, renamed_to: messaging.operation.type}")
    public const val MESSAGING_OPERATION: String = "messaging.operation"

    /**
     * The system-specific name of the messaging operation.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"ack"`
     * - `"nack"`
     * - `"send"`
     */
    public const val MESSAGING_OPERATION_NAME: String = "messaging.operation.name"

    /**
     * A string identifying the type of the messaging operation.
     *
     * ## Notes
     *
     * If a custom value is used, it MUST be of low cardinality
     */
    public const val MESSAGING_OPERATION_TYPE: String = "messaging.operation.type"

    /**
     * RabbitMQ message routing key.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"myKey"`
     */
    public const val MESSAGING_RABBITMQ_DESTINATION_ROUTING_KEY: String = "messaging.rabbitmq.destination.routing_key"

    /**
     * RabbitMQ message delivery tag
     *
     * ## Notes
     *
     * # Examples
     *
     * - `123`
     */
    public const val MESSAGING_RABBITMQ_MESSAGE_DELIVERY_TAG: String = "messaging.rabbitmq.message.delivery_tag"

    /**
     * Deprecated, use `messaging.consumer.group.name` instead.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"myConsumerGroup"`
     */
    @Deprecated("{note: Replaced by `messaging.consumer.group.name` on the consumer spans. No replacement for producer spans.\n, reason: uncategorized}")
    public const val MESSAGING_ROCKETMQ_CLIENT_GROUP: String = "messaging.rocketmq.client_group"

    /**
     * Model of message consumption. This only applies to consumer spans.
     *
     * ## Notes
     */
    public const val MESSAGING_ROCKETMQ_CONSUMPTION_MODEL: String = "messaging.rocketmq.consumption_model"

    /**
     * The delay time level for delay message, which determines the message delay time.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `3`
     */
    public const val MESSAGING_ROCKETMQ_MESSAGE_DELAY_TIME_LEVEL: String = "messaging.rocketmq.message.delay_time_level"

    /**
     * The timestamp in milliseconds that the delay message is expected to be delivered to consumer.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `1665987217045`
     */
    public const val MESSAGING_ROCKETMQ_MESSAGE_DELIVERY_TIMESTAMP: String = "messaging.rocketmq.message.delivery_timestamp"

    /**
     * It is essential for FIFO message. Messages that belong to the same message group are always processed one by one within the same consumer group.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"myMessageGroup"`
     */
    public const val MESSAGING_ROCKETMQ_MESSAGE_GROUP: String = "messaging.rocketmq.message.group"

    /**
     * Key(s) of message, another way to mark message besides message id.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `[
     * "keyA",
     * "keyB",
     * ]`
     */
    public const val MESSAGING_ROCKETMQ_MESSAGE_KEYS: String = "messaging.rocketmq.message.keys"

    /**
     * The secondary classifier of message besides topic.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"tagA"`
     */
    public const val MESSAGING_ROCKETMQ_MESSAGE_TAG: String = "messaging.rocketmq.message.tag"

    /**
     * Type of message.
     *
     * ## Notes
     */
    public const val MESSAGING_ROCKETMQ_MESSAGE_TYPE: String = "messaging.rocketmq.message.type"

    /**
     * Namespace of RocketMQ resources, resources in different namespaces are individual.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"myNamespace"`
     */
    public const val MESSAGING_ROCKETMQ_NAMESPACE: String = "messaging.rocketmq.namespace"

    /**
     * Deprecated, use `messaging.destination.subscription.name` instead.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"subscription-a"`
     */
    @Deprecated("{note: Replaced by `messaging.destination.subscription.name`., reason: renamed, renamed_to: messaging.destination.subscription.name}")
    public const val MESSAGING_SERVICEBUS_DESTINATION_SUBSCRIPTION_NAME: String = "messaging.servicebus.destination.subscription_name"

    /**
     * Describes the [settlement type](https://learn.microsoft.com/azure/service-bus-messaging/message-transfers-locks-settlement#peeklock).
     *
     * ## Notes
     */
    public const val MESSAGING_SERVICEBUS_DISPOSITION_STATUS: String = "messaging.servicebus.disposition_status"

    /**
     * Number of deliveries that have been attempted for this message.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `2`
     */
    public const val MESSAGING_SERVICEBUS_MESSAGE_DELIVERY_COUNT: String = "messaging.servicebus.message.delivery_count"

    /**
     * The UTC epoch seconds at which the message has been accepted and stored in the entity.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `1701393730`
     */
    public const val MESSAGING_SERVICEBUS_MESSAGE_ENQUEUED_TIME: String = "messaging.servicebus.message.enqueued_time"

    /**
     * The messaging system as identified by the client instrumentation.
     *
     * ## Notes
     *
     * The actual messaging system may differ from the one known by the client. For example, when using Kafka client libraries to communicate with Azure Event Hubs, the `messaging.system` is set to `kafka` based on the instrumentation's best knowledge
     */
    public const val MESSAGING_SYSTEM: String = "messaging.system"

    /**
     * Deprecated, use `network.local.address`.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"192.168.0.1"`
     */
    @Deprecated("{note: Replaced by `network.local.address`., reason: renamed, renamed_to: network.local.address}")
    public const val NET_HOST_IP: String = "net.host.ip"

    /**
     * Deprecated, use `server.address`.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"example.com"`
     */
    @Deprecated("{note: Replaced by `server.address`., reason: renamed, renamed_to: server.address}")
    public const val NET_HOST_NAME: String = "net.host.name"

    /**
     * Deprecated, use `server.port`.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `8080`
     */
    @Deprecated("{note: Replaced by `server.port`., reason: renamed, renamed_to: server.port}")
    public const val NET_HOST_PORT: String = "net.host.port"

    /**
     * Deprecated, use `network.peer.address`.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"127.0.0.1"`
     */
    @Deprecated("{note: Replaced by `network.peer.address`., reason: renamed, renamed_to: network.peer.address}")
    public const val NET_PEER_IP: String = "net.peer.ip"

    /**
     * Deprecated, use `server.address` on client spans and `client.address` on server spans.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"example.com"`
     */
    @Deprecated("{note: Replaced by `server.address` on client spans and `client.address` on server spans., reason: uncategorized}")
    public const val NET_PEER_NAME: String = "net.peer.name"

    /**
     * Deprecated, use `server.port` on client spans and `client.port` on server spans.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `8080`
     */
    @Deprecated("{note: Replaced by `server.port` on client spans and `client.port` on server spans., reason: uncategorized}")
    public const val NET_PEER_PORT: String = "net.peer.port"

    /**
     * Deprecated, use `network.protocol.name`.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"amqp"`
     * - `"http"`
     * - `"mqtt"`
     */
    @Deprecated("{note: Replaced by `network.protocol.name`., reason: renamed, renamed_to: network.protocol.name}")
    public const val NET_PROTOCOL_NAME: String = "net.protocol.name"

    /**
     * Deprecated, use `network.protocol.version`.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"3.1.1"`
     */
    @Deprecated("{note: Replaced by `network.protocol.version`., reason: renamed, renamed_to: network.protocol.version}")
    public const val NET_PROTOCOL_VERSION: String = "net.protocol.version"

    /**
     * Deprecated, use `network.transport` and `network.type`.
     *
     * ## Notes
     */
    @Deprecated("{note: Split to `network.transport` and `network.type`., reason: uncategorized}")
    public const val NET_SOCK_FAMILY: String = "net.sock.family"

    /**
     * Deprecated, use `network.local.address`.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"/var/my.sock"`
     */
    @Deprecated("{note: Replaced by `network.local.address`., reason: renamed, renamed_to: network.local.address}")
    public const val NET_SOCK_HOST_ADDR: String = "net.sock.host.addr"

    /**
     * Deprecated, use `network.local.port`.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `8080`
     */
    @Deprecated("{note: Replaced by `network.local.port`., reason: renamed, renamed_to: network.local.port}")
    public const val NET_SOCK_HOST_PORT: String = "net.sock.host.port"

    /**
     * Deprecated, use `network.peer.address`.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"192.168.0.1"`
     */
    @Deprecated("{note: Replaced by `network.peer.address`., reason: renamed, renamed_to: network.peer.address}")
    public const val NET_SOCK_PEER_ADDR: String = "net.sock.peer.addr"

    /**
     * Deprecated, no replacement at this time.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"/var/my.sock"`
     */
    @Deprecated("{note: Removed. No replacement at this time., reason: obsoleted}")
    public const val NET_SOCK_PEER_NAME: String = "net.sock.peer.name"

    /**
     * Deprecated, use `network.peer.port`.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `65531`
     */
    @Deprecated("{note: Replaced by `network.peer.port`., reason: renamed, renamed_to: network.peer.port}")
    public const val NET_SOCK_PEER_PORT: String = "net.sock.peer.port"

    /**
     * Deprecated, use `network.transport`.
     *
     * ## Notes
     */
    @Deprecated("{note: Replaced by `network.transport`., reason: renamed, renamed_to: network.transport}")
    public const val NET_TRANSPORT: String = "net.transport"

    /**
     * The ISO 3166-1 alpha-2 2-character country code associated with the mobile carrier network.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"DE"`
     */
    public const val NETWORK_CARRIER_ICC: String = "network.carrier.icc"

    /**
     * The mobile carrier country code.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"310"`
     */
    public const val NETWORK_CARRIER_MCC: String = "network.carrier.mcc"

    /**
     * The mobile carrier network code.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"001"`
     */
    public const val NETWORK_CARRIER_MNC: String = "network.carrier.mnc"

    /**
     * The name of the mobile carrier.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"sprint"`
     */
    public const val NETWORK_CARRIER_NAME: String = "network.carrier.name"

    /**
     * The state of network connection
     *
     * ## Notes
     *
     * Connection states are defined as part of the [rfc9293](https://datatracker.ietf.org/doc/html/rfc9293#section-3.3.2)
     *
     * # Examples
     *
     * - `"close_wait"`
     */
    public const val NETWORK_CONNECTION_STATE: String = "network.connection.state"

    /**
     * This describes more details regarding the connection.type. It may be the type of cell technology connection, but it could be used for describing details about a wifi connection.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"LTE"`
     */
    public const val NETWORK_CONNECTION_SUBTYPE: String = "network.connection.subtype"

    /**
     * The internet connection type.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"wifi"`
     */
    public const val NETWORK_CONNECTION_TYPE: String = "network.connection.type"

    /**
     * The network interface name.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"lo"`
     * - `"eth0"`
     */
    public const val NETWORK_INTERFACE_NAME: String = "network.interface.name"

    /**
     * The network IO operation direction.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"transmit"`
     */
    public const val NETWORK_IO_DIRECTION: String = "network.io.direction"

    /**
     * Local address of the network connection - IP address or Unix domain socket name.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"10.1.2.80"`
     * - `"/tmp/my.sock"`
     */
    public const val NETWORK_LOCAL_ADDRESS: String = "network.local.address"

    /**
     * Local port number of the network connection.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `65123`
     */
    public const val NETWORK_LOCAL_PORT: String = "network.local.port"

    /**
     * Peer address of the network connection - IP address or Unix domain socket name.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"10.1.2.80"`
     * - `"/tmp/my.sock"`
     */
    public const val NETWORK_PEER_ADDRESS: String = "network.peer.address"

    /**
     * Peer port number of the network connection.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `65123`
     */
    public const val NETWORK_PEER_PORT: String = "network.peer.port"

    /**
     * [OSI application layer](https://wikipedia.org/wiki/Application_layer) or non-OSI equivalent.
     *
     * ## Notes
     *
     * The value SHOULD be normalized to lowercase.
     *
     * # Examples
     *
     * - `"amqp"`
     * - `"http"`
     * - `"mqtt"`
     */
    public const val NETWORK_PROTOCOL_NAME: String = "network.protocol.name"

    /**
     * The actual version of the protocol used for network communication.
     *
     * ## Notes
     *
     * If protocol version is subject to negotiation (for example using [ALPN](https://www.rfc-editor.org/rfc/rfc7301.html)), this attribute SHOULD be set to the negotiated version. If the actual protocol version is not known, this attribute SHOULD NOT be set.
     *
     * # Examples
     *
     * - `"1.1"`
     * - `"2"`
     */
    public const val NETWORK_PROTOCOL_VERSION: String = "network.protocol.version"

    /**
     * [OSI transport layer](https://wikipedia.org/wiki/Transport_layer) or [inter-process communication method](https://wikipedia.org/wiki/Inter-process_communication).
     *
     * ## Notes
     *
     * The value SHOULD be normalized to lowercase.
     *
     * Consider always setting the transport when setting a port number, since
     * a port number is ambiguous without knowing the transport. For example
     * different processes could be listening on TCP port 12345 and UDP port 12345.
     *
     * # Examples
     *
     * - `"tcp"`
     * - `"udp"`
     */
    public const val NETWORK_TRANSPORT: String = "network.transport"

    /**
     * [OSI network layer](https://wikipedia.org/wiki/Network_layer) or non-OSI equivalent.
     *
     * ## Notes
     *
     * The value SHOULD be normalized to lowercase.
     *
     * # Examples
     *
     * - `"ipv4"`
     * - `"ipv6"`
     */
    public const val NETWORK_TYPE: String = "network.type"

    /**
     * The state of event loop time.
     *
     * ## Notes
     */
    public const val NODEJS_EVENTLOOP_STATE: String = "nodejs.eventloop.state"

    /**
     * The digest of the OCI image manifest. For container images specifically is the digest by which the container image is known.
     *
     * ## Notes
     *
     * Follows [OCI Image Manifest Specification](https://github.com/opencontainers/image-spec/blob/main/manifest.md), and specifically the [Digest property](https://github.com/opencontainers/image-spec/blob/main/descriptor.md#digests).
     * An example can be found in [Example Image Manifest](https://github.com/opencontainers/image-spec/blob/main/manifest.md#example-image-manifest).
     *
     * # Examples
     *
     * - `"sha256:e4ca62c0d62f3e886e684806dfe9d4e0cda60d54986898173c1083856cfda0f4"`
     */
    public const val OCI_MANIFEST_DIGEST: String = "oci.manifest.digest"

    /**
     * Parent-child Reference type
     *
     * ## Notes
     *
     * The causal relationship between a child Span and a parent Span
     */
    public const val OPENTRACING_REF_TYPE: String = "opentracing.ref_type"

    /**
     * Unique identifier for a particular build or compilation of the operating system.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"TQ3C.230805.001.B2"`
     * - `"20E247"`
     * - `"22621"`
     */
    public const val OS_BUILD_ID: String = "os.build_id"

    /**
     * Human readable (not intended to be parsed) OS version information, like e.g. reported by `ver` or `lsb_release -a` commands.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"Microsoft Windows [Version 10.0.18363.778]"`
     * - `"Ubuntu 18.04.1 LTS"`
     */
    public const val OS_DESCRIPTION: String = "os.description"

    /**
     * Human readable operating system name.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"iOS"`
     * - `"Android"`
     * - `"Ubuntu"`
     */
    public const val OS_NAME: String = "os.name"

    /**
     * The operating system type.
     *
     * ## Notes
     */
    public const val OS_TYPE: String = "os.type"

    /**
     * The version string of the operating system as defined in [Version Attributes](/docs/resource/README.md#version-attributes).
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"14.2.1"`
     * - `"18.04.1"`
     */
    public const val OS_VERSION: String = "os.version"

    /**
     * A name uniquely identifying the instance of the OpenTelemetry component within its containing SDK instance.
     *
     * ## Notes
     *
     * Implementations SHOULD ensure a low cardinality for this attribute, even across application or SDK restarts.
     * E.g. implementations MUST NOT use UUIDs as values for this attribute.
     *
     * Implementations MAY achieve these goals by following a `[otel.component.type]/[instance-counter]` pattern, e.g. `batching_span_processor/0`.
     * Hereby `otel.component.type` refers to the corresponding attribute value of the component.
     *
     * The value of `instance-counter` MAY be automatically assigned by the component and uniqueness within the enclosing SDK instance MUST be guaranteed.
     * For example, `[instance-counter]` MAY be implemented by using a monotonically increasing counter (starting with `0`), which is incremented every time an
     * instance of the given component type is started.
     *
     * With this implementation, for example the first Batching Span Processor would have `batching_span_processor/0`
     * as `otel.component.name`, the second one `batching_span_processor/1` and so on.
     * These values will therefore be reused in the case of an application restart.
     *
     * # Examples
     *
     * - `"otlp_grpc_span_exporter/0"`
     * - `"custom-name"`
     */
    public const val OTEL_COMPONENT_NAME: String = "otel.component.name"

    /**
     * A name identifying the type of the OpenTelemetry component.
     *
     * ## Notes
     *
     * If none of the standardized values apply, implementations SHOULD use the language-defined name of the type.
     * E.g. for Java the fully qualified classname SHOULD be used in this case.
     *
     * # Examples
     *
     * - `"batching_span_processor"`
     * - `"com.example.MySpanExporter"`
     */
    public const val OTEL_COMPONENT_TYPE: String = "otel.component.type"

    /**
     * Deprecated. Use the `otel.scope.name` attribute
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"io.opentelemetry.contrib.mongodb"`
     */
    @Deprecated("{note: Replaced by `otel.scope.name`., reason: renamed, renamed_to: otel.scope.name}")
    public const val OTEL_LIBRARY_NAME: String = "otel.library.name"

    /**
     * Deprecated. Use the `otel.scope.version` attribute.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"1.0.0"`
     */
    @Deprecated("{note: Replaced by `otel.scope.version`., reason: renamed, renamed_to: otel.scope.version}")
    public const val OTEL_LIBRARY_VERSION: String = "otel.library.version"

    /**
     * The name of the instrumentation scope - (`InstrumentationScope.Name` in OTLP).
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"io.opentelemetry.contrib.mongodb"`
     */
    public const val OTEL_SCOPE_NAME: String = "otel.scope.name"

    /**
     * The version of the instrumentation scope - (`InstrumentationScope.Version` in OTLP).
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"1.0.0"`
     */
    public const val OTEL_SCOPE_VERSION: String = "otel.scope.version"

    /**
     * Determines whether the span has a parent span, and if so, [whether it is a remote parent](https://opentelemetry.io/docs/specs/otel/trace/api/#isremote)
     *
     * ## Notes
     */
    public const val OTEL_SPAN_PARENT_ORIGIN: String = "otel.span.parent.origin"

    /**
     * The result value of the sampler for this span
     *
     * ## Notes
     */
    public const val OTEL_SPAN_SAMPLING_RESULT: String = "otel.span.sampling_result"

    /**
     * Name of the code, either "OK" or "ERROR". MUST NOT be set if the status code is UNSET.
     *
     * ## Notes
     */
    public const val OTEL_STATUS_CODE: String = "otel.status_code"

    /**
     * Description of the Status if it has a value, otherwise not set.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"resource not found"`
     */
    public const val OTEL_STATUS_DESCRIPTION: String = "otel.status_description"

    /**
     * Deprecated, use `db.client.connection.state` instead.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"idle"`
     */
    @Deprecated("{note: Replaced by `db.client.connection.state`., reason: renamed, renamed_to: db.client.connection.state}")
    public const val STATE: String = "state"

    /**
     * The [`service.name`](/docs/resource/README.md#service) of the remote service. SHOULD be equal to the actual `service.name` resource attribute of the remote service if any.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"AuthTokenCache"`
     */
    public const val PEER_SERVICE: String = "peer.service"

    /**
     * Deprecated, use `db.client.connection.pool.name` instead.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"myDataSource"`
     */
    @Deprecated("{note: Replaced by `db.client.connection.pool.name`., reason: renamed, renamed_to: db.client.connection.pool.name}")
    public const val POOL_NAME: String = "pool.name"

    /**
     * Length of the process.command_args array
     *
     * ## Notes
     *
     * This field can be useful for querying or performing bucket analysis on how many arguments were provided to start a process. More arguments may be an indication of suspicious activity.
     *
     * # Examples
     *
     * - `4`
     */
    public const val PROCESS_ARGS_COUNT: String = "process.args_count"

    /**
     * The command used to launch the process (i.e. the command name). On Linux based systems, can be set to the zeroth string in `proc/[pid]/cmdline`. On Windows, can be set to the first parameter extracted from `GetCommandLineW`.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"cmd/otelcol"`
     */
    public const val PROCESS_COMMAND: String = "process.command"

    /**
     * All the command arguments (including the command/executable itself) as received by the process. On Linux-based systems (and some other Unixoid systems supporting procfs), can be set according to the list of null-delimited strings extracted from `proc/[pid]/cmdline`. For libc-based executables, this would be the full argv vector passed to `main`. SHOULD NOT be collected by default unless there is sanitization that excludes sensitive data.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `[
     * "cmd/otecol",
     * "--config=config.yaml",
     * ]`
     */
    public const val PROCESS_COMMAND_ARGS: String = "process.command_args"

    /**
     * The full command used to launch the process as a single string representing the full command. On Windows, can be set to the result of `GetCommandLineW`. Do not set this if you have to assemble it just for monitoring; use `process.command_args` instead. SHOULD NOT be collected by default unless there is sanitization that excludes sensitive data.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"C:\\cmd\\otecol --config=\"my directory\\config.yaml\""`
     */
    public const val PROCESS_COMMAND_LINE: String = "process.command_line"

    /**
     * Specifies whether the context switches for this data point were voluntary or involuntary.
     *
     * ## Notes
     */
    public const val PROCESS_CONTEXT_SWITCH_TYPE: String = "process.context_switch_type"

    /**
     * Deprecated, use `cpu.mode` instead.
     *
     * ## Notes
     */
    @Deprecated("{note: Replaced by `cpu.mode`., reason: renamed, renamed_to: cpu.mode}")
    public const val PROCESS_CPU_STATE: String = "process.cpu.state"

    /**
     * The date and time the process was created, in ISO 8601 format.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"2023-11-21T09:25:34.853Z"`
     */
    public const val PROCESS_CREATION_TIME: String = "process.creation.time"

    /**
     * Process environment variables, ``key`` being the environment variable name, the value being the environment variable value.
     *
     * ## Notes
     *
     * Examples:
     *
     * - an environment variable `USER` with value `"ubuntu"` SHOULD be recorded
     * as the `process.environment_variable.USER` attribute with value `"ubuntu"`.
     * - an environment variable `PATH` with value `"/usr/local/bin:/usr/bin"`
     * SHOULD be recorded as the `process.environment_variable.PATH` attribute
     * with value `"/usr/local/bin:/usr/bin"`.
     *
     * # Examples
     *
     * - `"ubuntu"`
     * - `"/usr/local/bin:/usr/bin"`
     */
    public const val PROCESS_ENVIRONMENT_VARIABLE: String = "process.environment_variable"

    /**
     * The GNU build ID as found in the `.note.gnu.build-id` ELF section (hex string).
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"c89b11207f6479603b0d49bf291c092c2b719293"`
     */
    public const val PROCESS_EXECUTABLE_BUILD_ID_GNU: String = "process.executable.build_id.gnu"

    /**
     * The Go build ID as retrieved by `go tool buildid <go executable>`.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"foh3mEXu7BLZjsN9pOwG/kATcXlYVCDEFouRMQed_/WwRFB1hPo9LBkekthSPG/x8hMC8emW2cCjXD0_1aY"`
     */
    public const val PROCESS_EXECUTABLE_BUILD_ID_GO: String = "process.executable.build_id.go"

    /**
     * Profiling specific build ID for executables. See the OTel specification for Profiles for more information.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"600DCAFE4A110000F2BF38C493F5FB92"`
     */
    public const val PROCESS_EXECUTABLE_BUILD_ID_HTLHASH: String = "process.executable.build_id.htlhash"

    /**
     * "Deprecated, use `process.executable.build_id.htlhash` instead."
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"600DCAFE4A110000F2BF38C493F5FB92"`
     */
    @Deprecated("{note: Replaced by `process.executable.build_id.htlhash`., reason: renamed, renamed_to: process.executable.build_id.htlhash}")
    public const val PROCESS_EXECUTABLE_BUILD_ID_PROFILING: String = "process.executable.build_id.profiling"

    /**
     * The name of the process executable. On Linux based systems, this SHOULD be set to the base name of the target of `/proc/[pid]/exe`. On Windows, this SHOULD be set to the base name of `GetProcessImageFileNameW`.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"otelcol"`
     */
    public const val PROCESS_EXECUTABLE_NAME: String = "process.executable.name"

    /**
     * The full path to the process executable. On Linux based systems, can be set to the target of `proc/[pid]/exe`. On Windows, can be set to the result of `GetProcessImageFileNameW`.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"/usr/bin/cmd/otelcol"`
     */
    public const val PROCESS_EXECUTABLE_PATH: String = "process.executable.path"

    /**
     * The exit code of the process.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `127`
     */
    public const val PROCESS_EXIT_CODE: String = "process.exit.code"

    /**
     * The date and time the process exited, in ISO 8601 format.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"2023-11-21T09:26:12.315Z"`
     */
    public const val PROCESS_EXIT_TIME: String = "process.exit.time"

    /**
     * The PID of the process's group leader. This is also the process group ID (PGID) of the process.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `23`
     */
    public const val PROCESS_GROUP_LEADER_PID: String = "process.group_leader.pid"

    /**
     * Whether the process is connected to an interactive shell.
     *
     * ## Notes
     */
    public const val PROCESS_INTERACTIVE: String = "process.interactive"

    /**
     * The control group associated with the process.
     *
     * ## Notes
     *
     * Control groups (cgroups) are a kernel feature used to organize and manage process resources. This attribute provides the path(s) to the cgroup(s) associated with the process, which should match the contents of the [/proc/\[PID\]/cgroup](https://man7.org/linux/man-pages/man7/cgroups.7.html) file.
     *
     * # Examples
     *
     * - `"1:name=systemd:/user.slice/user-1000.slice/session-3.scope"`
     * - `"0::/user.slice/user-1000.slice/user@1000.service/tmux-spawn-0267755b-4639-4a27-90ed-f19f88e53748.scope"`
     */
    public const val PROCESS_LINUX_CGROUP: String = "process.linux.cgroup"

    /**
     * The username of the user that owns the process.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"root"`
     */
    public const val PROCESS_OWNER: String = "process.owner"

    /**
     * The type of page fault for this data point. Type `major` is for major/hard page faults, and `minor` is for minor/soft page faults.
     *
     * ## Notes
     */
    public const val PROCESS_PAGING_FAULT_TYPE: String = "process.paging.fault_type"

    /**
     * Parent Process identifier (PPID).
     *
     * ## Notes
     *
     * # Examples
     *
     * - `111`
     */
    public const val PROCESS_PARENT_PID: String = "process.parent_pid"

    /**
     * Process identifier (PID).
     *
     * ## Notes
     *
     * # Examples
     *
     * - `1234`
     */
    public const val PROCESS_PID: String = "process.pid"

    /**
     * The real user ID (RUID) of the process.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `1000`
     */
    public const val PROCESS_REAL_USER_ID: String = "process.real_user.id"

    /**
     * The username of the real user of the process.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"operator"`
     */
    public const val PROCESS_REAL_USER_NAME: String = "process.real_user.name"

    /**
     * An additional description about the runtime of the process, for example a specific vendor customization of the runtime environment.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"Eclipse OpenJ9 Eclipse OpenJ9 VM openj9-0.21.0"`
     */
    public const val PROCESS_RUNTIME_DESCRIPTION: String = "process.runtime.description"

    /**
     * The name of the runtime of this process.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"OpenJDK Runtime Environment"`
     */
    public const val PROCESS_RUNTIME_NAME: String = "process.runtime.name"

    /**
     * The version of the runtime of this process, as returned by the runtime without modification.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"14.0.2"`
     */
    public const val PROCESS_RUNTIME_VERSION: String = "process.runtime.version"

    /**
     * The saved user ID (SUID) of the process.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `1002`
     */
    public const val PROCESS_SAVED_USER_ID: String = "process.saved_user.id"

    /**
     * The username of the saved user.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"operator"`
     */
    public const val PROCESS_SAVED_USER_NAME: String = "process.saved_user.name"

    /**
     * The PID of the process's session leader. This is also the session ID (SID) of the process.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `14`
     */
    public const val PROCESS_SESSION_LEADER_PID: String = "process.session_leader.pid"

    /**
     * Process title (proctitle)
     *
     * ## Notes
     *
     * In many Unix-like systems, process title (proctitle), is the string that represents the name or command line of a running process, displayed by system monitoring tools like ps, top, and htop.
     *
     * # Examples
     *
     * - `"cat /etc/hostname"`
     * - `"xfce4-session"`
     * - `"bash"`
     */
    public const val PROCESS_TITLE: String = "process.title"

    /**
     * The effective user ID (EUID) of the process.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `1001`
     */
    public const val PROCESS_USER_ID: String = "process.user.id"

    /**
     * The username of the effective user of the process.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"root"`
     */
    public const val PROCESS_USER_NAME: String = "process.user.name"

    /**
     * Virtual process identifier.
     *
     * ## Notes
     *
     * The process ID within a PID namespace. This is not necessarily unique across all processes on the host but it is unique within the process namespace that the process exists within.
     *
     * # Examples
     *
     * - `12`
     */
    public const val PROCESS_VPID: String = "process.vpid"

    /**
     * The working directory of the process.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"/root"`
     */
    public const val PROCESS_WORKING_DIRECTORY: String = "process.working_directory"

    /**
     * Describes the interpreter or compiler of a single frame.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"cpython"`
     */
    public const val PROFILE_FRAME_TYPE: String = "profile.frame.type"

    /**
     * The [error codes](https://connectrpc.com//docs/protocol/#error-codes) of the Connect request. Error codes are always string values.
     *
     * ## Notes
     */
    public const val RPC_CONNECT_RPC_ERROR_CODE: String = "rpc.connect_rpc.error_code"

    /**
     * Connect request metadata, ``key`` being the normalized Connect Metadata key (lowercase), the value being the metadata values.
     *
     * ## Notes
     *
     * Instrumentations SHOULD require an explicit configuration of which metadata values are to be captured.
     * Including all request metadata values can be a security risk - explicit configuration helps avoid leaking sensitive information.
     *
     * For example, a property `my-custom-key` with value `["1.2.3.4", "1.2.3.5"]` SHOULD be recorded as
     * the `rpc.connect_rpc.request.metadata.my-custom-key` attribute with value `["1.2.3.4", "1.2.3.5"]`
     *
     * # Examples
     *
     * - `[
     * "1.2.3.4",
     * "1.2.3.5",
     * ]`
     */
    public const val RPC_CONNECT_RPC_REQUEST_METADATA: String = "rpc.connect_rpc.request.metadata"

    /**
     * Connect response metadata, ``key`` being the normalized Connect Metadata key (lowercase), the value being the metadata values.
     *
     * ## Notes
     *
     * Instrumentations SHOULD require an explicit configuration of which metadata values are to be captured.
     * Including all response metadata values can be a security risk - explicit configuration helps avoid leaking sensitive information.
     *
     * For example, a property `my-custom-key` with value `"attribute_value"` SHOULD be recorded as
     * the `rpc.connect_rpc.response.metadata.my-custom-key` attribute with value `["attribute_value"]`
     *
     * # Examples
     *
     * - `[
     * "attribute_value",
     * ]`
     */
    public const val RPC_CONNECT_RPC_RESPONSE_METADATA: String = "rpc.connect_rpc.response.metadata"

    /**
     * gRPC request metadata, ``key`` being the normalized gRPC Metadata key (lowercase), the value being the metadata values.
     *
     * ## Notes
     *
     * Instrumentations SHOULD require an explicit configuration of which metadata values are to be captured.
     * Including all request metadata values can be a security risk - explicit configuration helps avoid leaking sensitive information.
     *
     * For example, a property `my-custom-key` with value `["1.2.3.4", "1.2.3.5"]` SHOULD be recorded as
     * `rpc.grpc.request.metadata.my-custom-key` attribute with value `["1.2.3.4", "1.2.3.5"]`
     *
     * # Examples
     *
     * - `[
     * "1.2.3.4",
     * "1.2.3.5",
     * ]`
     */
    public const val RPC_GRPC_REQUEST_METADATA: String = "rpc.grpc.request.metadata"

    /**
     * gRPC response metadata, ``key`` being the normalized gRPC Metadata key (lowercase), the value being the metadata values.
     *
     * ## Notes
     *
     * Instrumentations SHOULD require an explicit configuration of which metadata values are to be captured.
     * Including all response metadata values can be a security risk - explicit configuration helps avoid leaking sensitive information.
     *
     * For example, a property `my-custom-key` with value `["attribute_value"]` SHOULD be recorded as
     * the `rpc.grpc.response.metadata.my-custom-key` attribute with value `["attribute_value"]`
     *
     * # Examples
     *
     * - `[
     * "attribute_value",
     * ]`
     */
    public const val RPC_GRPC_RESPONSE_METADATA: String = "rpc.grpc.response.metadata"

    /**
     * The [numeric status code](https://github.com/grpc/grpc/blob/v1.33.2/doc/statuscodes.md) of the gRPC request.
     *
     * ## Notes
     */
    public const val RPC_GRPC_STATUS_CODE: String = "rpc.grpc.status_code"

    /**
     * `error.code` property of response if it is an error response.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `-32700`
     * - `100`
     */
    public const val RPC_JSONRPC_ERROR_CODE: String = "rpc.jsonrpc.error_code"

    /**
     * `error.message` property of response if it is an error response.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"Parse error"`
     * - `"User already exists"`
     */
    public const val RPC_JSONRPC_ERROR_MESSAGE: String = "rpc.jsonrpc.error_message"

    /**
     * `id` property of request or response. Since protocol allows id to be int, string, `null` or missing (for notifications), value is expected to be cast to string for simplicity. Use empty string in case of `null` value. Omit entirely if this is a notification.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"10"`
     * - `"request-7"`
     * - `""`
     */
    public const val RPC_JSONRPC_REQUEST_ID: String = "rpc.jsonrpc.request_id"

    /**
     * Protocol version as in `jsonrpc` property of request/response. Since JSON-RPC 1.0 doesn't specify this, the value can be omitted.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"2.0"`
     * - `"1.0"`
     */
    public const val RPC_JSONRPC_VERSION: String = "rpc.jsonrpc.version"

    /**
     * Compressed size of the message in bytes.
     *
     * ## Notes
     */
    public const val RPC_MESSAGE_COMPRESSED_SIZE: String = "rpc.message.compressed_size"

    /**
     * MUST be calculated as two different counters starting from `1` one for sent messages and one for received message.
     *
     * ## Notes
     *
     * This way we guarantee that the values will be consistent between different implementations
     */
    public const val RPC_MESSAGE_ID: String = "rpc.message.id"

    /**
     * Whether this is a received or sent message.
     *
     * ## Notes
     */
    public const val RPC_MESSAGE_TYPE: String = "rpc.message.type"

    /**
     * Uncompressed size of the message in bytes.
     *
     * ## Notes
     */
    public const val RPC_MESSAGE_UNCOMPRESSED_SIZE: String = "rpc.message.uncompressed_size"

    /**
     * The name of the (logical) method being called, must be equal to the \$method part in the span name.
     *
     * ## Notes
     *
     * This is the logical name of the method from the RPC interface perspective, which can be different from the name of any implementing method/function. The `code.function.name` attribute may be used to store the latter (e.g., method actually executing the call on the server side, RPC client stub method on the client side).
     *
     * # Examples
     *
     * - `"exampleMethod"`
     */
    public const val RPC_METHOD: String = "rpc.method"

    /**
     * The full (logical) name of the service being called, including its package name, if applicable.
     *
     * ## Notes
     *
     * This is the logical name of the service from the RPC interface perspective, which can be different from the name of any implementing class. The `code.namespace` attribute may be used to store the latter (despite the attribute name, it may include a class name; e.g., class with method actually executing the call on the server side, RPC client stub class on the client side).
     *
     * # Examples
     *
     * - `"myservice.EchoService"`
     */
    public const val RPC_SERVICE: String = "rpc.service"

    /**
     * A string identifying the remoting system. See below for a list of well-known identifiers.
     *
     * ## Notes
     */
    public const val RPC_SYSTEM: String = "rpc.system"

    /**
     * A categorization value keyword used by the entity using the rule for detection of this event
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"Attempted Information Leak"`
     */
    public const val SECURITY_RULE_CATEGORY: String = "security_rule.category"

    /**
     * The description of the rule generating the event.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"Block requests to public DNS over HTTPS / TLS protocols"`
     */
    public const val SECURITY_RULE_DESCRIPTION: String = "security_rule.description"

    /**
     * Name of the license under which the rule used to generate this event is made available.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"Apache 2.0"`
     */
    public const val SECURITY_RULE_LICENSE: String = "security_rule.license"

    /**
     * The name of the rule or signature generating the event.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"BLOCK_DNS_over_TLS"`
     */
    public const val SECURITY_RULE_NAME: String = "security_rule.name"

    /**
     * Reference URL to additional information about the rule used to generate this event.
     *
     * ## Notes
     *
     * The URL can point to the vendor’s documentation about the rule. If that’s not available, it can also be a link to a more general page describing this type of alert.
     *
     * # Examples
     *
     * - `"https://en.wikipedia.org/wiki/DNS_over_TLS"`
     */
    public const val SECURITY_RULE_REFERENCE: String = "security_rule.reference"

    /**
     * Name of the ruleset, policy, group, or parent category in which the rule used to generate this event is a member.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"Standard_Protocol_Filters"`
     */
    public const val SECURITY_RULE_RULESET_NAME: String = "security_rule.ruleset.name"

    /**
     * A rule ID that is unique within the scope of a set or group of agents, observers, or other entities using the rule for detection of this event.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"550e8400-e29b-41d4-a716-446655440000"`
     * - `"1100110011"`
     */
    public const val SECURITY_RULE_UUID: String = "security_rule.uuid"

    /**
     * The version / revision of the rule being used for analysis.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"1.0.0"`
     */
    public const val SECURITY_RULE_VERSION: String = "security_rule.version"

    /**
     * Server domain name if available without reverse DNS lookup; otherwise, IP address or Unix domain socket name.
     *
     * ## Notes
     *
     * When observed from the client side, and when communicating through an intermediary, `server.address` SHOULD represent the server address behind any intermediaries, for example proxies, if it's available.
     *
     * # Examples
     *
     * - `"example.com"`
     * - `"10.1.2.80"`
     * - `"/tmp/my.sock"`
     */
    public const val SERVER_ADDRESS: String = "server.address"

    /**
     * Server port number.
     *
     * ## Notes
     *
     * When observed from the client side, and when communicating through an intermediary, `server.port` SHOULD represent the server port behind any intermediaries, for example proxies, if it's available.
     *
     * # Examples
     *
     * - `80`
     * - `8080`
     * - `443`
     */
    public const val SERVER_PORT: String = "server.port"

    /**
     * The string ID of the service instance.
     *
     * ## Notes
     *
     * MUST be unique for each instance of the same `service.namespace,service.name` pair (in other words
     * `service.namespace,service.name,service.instance.id` triplet MUST be globally unique). The ID helps to
     * distinguish instances of the same service that exist at the same time (e.g. instances of a horizontally scaled
     * service).
     *
     * Implementations, such as SDKs, are recommended to generate a random Version 1 or Version 4 [RFC
     * 4122](https://www.ietf.org/rfc/rfc4122.txt) UUID, but are free to use an inherent unique ID as the source of
     * this value if stability is desirable. In that case, the ID SHOULD be used as source of a UUID Version 5 and
     * SHOULD use the following UUID as the namespace: `4d63009a-8d0f-11ee-aad7-4c796ed8e320`.
     *
     * UUIDs are typically recommended, as only an opaque value for the purposes of identifying a service instance is
     * needed. Similar to what can be seen in the man page for the
     * [`/etc/machine-id`](https://www.freedesktop.org/software/systemd/man/latest/machine-id.html) file, the underlying
     * data, such as pod name and namespace should be treated as confidential, being the user's choice to expose it
     * or not via another resource attribute.
     *
     * For applications running behind an application server (like unicorn), we do not recommend using one identifier
     * for all processes participating in the application. Instead, it's recommended each division (e.g. a worker
     * thread in unicorn) to have its own instance.id.
     *
     * It's not recommended for a Collector to set `service.instance.id` if it can't unambiguously determine the
     * service instance that is generating that telemetry. For instance, creating an UUID based on `pod.name` will
     * likely be wrong, as the Collector might not know from which container within that pod the telemetry originated.
     * However, Collectors can set the `service.instance.id` if they can unambiguously determine the service instance
     * for that telemetry. This is typically the case for scraping receivers, as they know the target address and
     * port.
     *
     * # Examples
     *
     * - `"627cc493-f310-47de-96bd-71410b7dec09"`
     */
    public const val SERVICE_INSTANCE_ID: String = "service.instance.id"

    /**
     * Logical name of the service.
     *
     * ## Notes
     *
     * MUST be the same for all instances of horizontally scaled services. If the value was not specified, SDKs MUST fallback to `unknown_service:` concatenated with [`process.executable.name`](process.md), e.g. `unknown_service:bash`. If `process.executable.name` is not available, the value MUST be set to `unknown_service`.
     *
     * # Examples
     *
     * - `"shoppingcart"`
     */
    public const val SERVICE_NAME: String = "service.name"

    /**
     * A namespace for `service.name`.
     *
     * ## Notes
     *
     * A string value having a meaning that helps to distinguish a group of services, for example the team name that owns a group of services. `service.name` is expected to be unique within the same namespace. If `service.namespace` is not specified in the Resource then `service.name` is expected to be unique for all services that have no explicit namespace defined (so the empty/unspecified namespace is simply one more valid namespace). Zero-length namespace string is assumed equal to unspecified namespace.
     *
     * # Examples
     *
     * - `"Shop"`
     */
    public const val SERVICE_NAMESPACE: String = "service.namespace"

    /**
     * The version string of the service API or implementation. The format is not defined by these conventions.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"2.0.0"`
     * - `"a01dbef8a"`
     */
    public const val SERVICE_VERSION: String = "service.version"

    /**
     * A unique id to identify a session.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"00112233-4455-6677-8899-aabbccddeeff"`
     */
    public const val SESSION_ID: String = "session.id"

    /**
     * The previous `session.id` for this user, when known.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"00112233-4455-6677-8899-aabbccddeeff"`
     */
    public const val SESSION_PREVIOUS_ID: String = "session.previous_id"

    /**
     * SignalR HTTP connection closure status.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"app_shutdown"`
     * - `"timeout"`
     */
    public const val SIGNALR_CONNECTION_STATUS: String = "signalr.connection.status"

    /**
     * [SignalR transport type](https://github.com/dotnet/aspnetcore/blob/main/src/SignalR/docs/specs/TransportProtocols.md)
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"web_sockets"`
     * - `"long_polling"`
     */
    public const val SIGNALR_TRANSPORT: String = "signalr.transport"

    /**
     * Source address - domain name if available without reverse DNS lookup; otherwise, IP address or Unix domain socket name.
     *
     * ## Notes
     *
     * When observed from the destination side, and when communicating through an intermediary, `source.address` SHOULD represent the source address behind any intermediaries, for example proxies, if it's available.
     *
     * # Examples
     *
     * - `"source.example.com"`
     * - `"10.1.2.80"`
     * - `"/tmp/my.sock"`
     */
    public const val SOURCE_ADDRESS: String = "source.address"

    /**
     * Source port number
     *
     * ## Notes
     *
     * # Examples
     *
     * - `3389`
     * - `2888`
     */
    public const val SOURCE_PORT: String = "source.port"

    /**
     * Deprecated, use `cpu.logical_number` instead.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `1`
     */
    public const val SYSTEM_CPU_LOGICAL_NUMBER: String = "system.cpu.logical_number"

    /**
     * Deprecated, use `cpu.mode` instead.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"idle"`
     * - `"interrupt"`
     */
    @Deprecated("{note: Replaced by `cpu.mode`., reason: renamed, renamed_to: cpu.mode}")
    public const val SYSTEM_CPU_STATE: String = "system.cpu.state"

    /**
     * The device identifier
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"(identifier)"`
     */
    public const val SYSTEM_DEVICE: String = "system.device"

    /**
     * The filesystem mode
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"rw, ro"`
     */
    public const val SYSTEM_FILESYSTEM_MODE: String = "system.filesystem.mode"

    /**
     * The filesystem mount path
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"/mnt/data"`
     */
    public const val SYSTEM_FILESYSTEM_MOUNTPOINT: String = "system.filesystem.mountpoint"

    /**
     * The filesystem state
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"used"`
     */
    public const val SYSTEM_FILESYSTEM_STATE: String = "system.filesystem.state"

    /**
     * The filesystem type
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"ext4"`
     */
    public const val SYSTEM_FILESYSTEM_TYPE: String = "system.filesystem.type"

    /**
     * The memory state
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"free"`
     * - `"cached"`
     */
    public const val SYSTEM_MEMORY_STATE: String = "system.memory.state"

    /**
     * Deprecated, use `network.connection.state` instead.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"close_wait"`
     */
    @Deprecated("{note: Replaced by `network.connection.state`., reason: renamed, renamed_to: network.connection.state}")
    public const val SYSTEM_NETWORK_STATE: String = "system.network.state"

    /**
     * The paging access direction
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"in"`
     */
    public const val SYSTEM_PAGING_DIRECTION: String = "system.paging.direction"

    /**
     * The memory paging state
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"free"`
     */
    public const val SYSTEM_PAGING_STATE: String = "system.paging.state"

    /**
     * The memory paging type
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"minor"`
     */
    public const val SYSTEM_PAGING_TYPE: String = "system.paging.type"

    /**
     * The process state, e.g., [Linux Process State Codes](https://man7.org/linux/man-pages/man1/ps.1.html#PROCESS_STATE_CODES)
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"running"`
     */
    public const val SYSTEM_PROCESS_STATUS: String = "system.process.status"

    /**
     * Deprecated, use `system.process.status` instead.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"running"`
     */
    @Deprecated("{note: Replaced by `system.process.status`., reason: renamed, renamed_to: system.process.status}")
    public const val SYSTEM_PROCESSES_STATUS: String = "system.processes.status"

    /**
     * The name of the auto instrumentation agent or distribution, if used.
     *
     * ## Notes
     *
     * Official auto instrumentation agents and distributions SHOULD set the `telemetry.distro.name` attribute to
     * a string starting with `opentelemetry-`, e.g. `opentelemetry-java-instrumentation`.
     *
     * # Examples
     *
     * - `"parts-unlimited-java"`
     */
    public const val TELEMETRY_DISTRO_NAME: String = "telemetry.distro.name"

    /**
     * The version string of the auto instrumentation agent or distribution, if used.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"1.2.3"`
     */
    public const val TELEMETRY_DISTRO_VERSION: String = "telemetry.distro.version"

    /**
     * The language of the telemetry SDK.
     *
     * ## Notes
     */
    public const val TELEMETRY_SDK_LANGUAGE: String = "telemetry.sdk.language"

    /**
     * The name of the telemetry SDK as defined above.
     *
     * ## Notes
     *
     * The OpenTelemetry SDK MUST set the `telemetry.sdk.name` attribute to `opentelemetry`.
     * If another SDK, like a fork or a vendor-provided implementation, is used, this SDK MUST set the
     * `telemetry.sdk.name` attribute to the fully-qualified class or module name of this SDK's main entry point
     * or another suitable identifier depending on the language.
     * The identifier `opentelemetry` is reserved and MUST NOT be used in this case.
     * All custom identifiers SHOULD be stable across different versions of an implementation.
     *
     * # Examples
     *
     * - `"opentelemetry"`
     */
    public const val TELEMETRY_SDK_NAME: String = "telemetry.sdk.name"

    /**
     * The version string of the telemetry SDK.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"1.2.3"`
     */
    public const val TELEMETRY_SDK_VERSION: String = "telemetry.sdk.version"

    /**
     * The fully qualified human readable name of the [test case](https://wikipedia.org/wiki/Test_case).
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"org.example.TestCase1.test1"`
     * - `"example/tests/TestCase1.test1"`
     * - `"ExampleTestCase1_test1"`
     */
    public const val TEST_CASE_NAME: String = "test.case.name"

    /**
     * The status of the actual test case result from test execution.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"pass"`
     * - `"fail"`
     */
    public const val TEST_CASE_RESULT_STATUS: String = "test.case.result.status"

    /**
     * The human readable name of a [test suite](https://wikipedia.org/wiki/Test_suite).
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"TestSuite1"`
     */
    public const val TEST_SUITE_NAME: String = "test.suite.name"

    /**
     * The status of the test suite run.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"success"`
     * - `"failure"`
     * - `"skipped"`
     * - `"aborted"`
     * - `"timed_out"`
     * - `"in_progress"`
     */
    public const val TEST_SUITE_RUN_STATUS: String = "test.suite.run.status"

    /**
     * Current "managed" thread ID (as opposed to OS thread ID).
     *
     * ## Notes
     *
     * # Examples
     *
     * - `42`
     */
    public const val THREAD_ID: String = "thread.id"

    /**
     * Current thread name.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"main"`
     */
    public const val THREAD_NAME: String = "thread.name"

    /**
     * String indicating the [cipher](https://datatracker.ietf.org/doc/html/rfc5246#appendix-A.5) used during the current connection.
     *
     * ## Notes
     *
     * The values allowed for `tls.cipher` MUST be one of the `Descriptions` of the [registered TLS Cipher Suits](https://www.iana.org/assignments/tls-parameters/tls-parameters.xhtml#table-tls-parameters-4).
     *
     * # Examples
     *
     * - `"TLS_RSA_WITH_3DES_EDE_CBC_SHA"`
     * - `"TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256"`
     */
    public const val TLS_CIPHER: String = "tls.cipher"

    /**
     * PEM-encoded stand-alone certificate offered by the client. This is usually mutually-exclusive of `client.certificate_chain` since this value also exists in that list.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"MII..."`
     */
    public const val TLS_CLIENT_CERTIFICATE: String = "tls.client.certificate"

    /**
     * Array of PEM-encoded certificates that make up the certificate chain offered by the client. This is usually mutually-exclusive of `client.certificate` since that value should be the first certificate in the chain.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `[
     * "MII...",
     * "MI...",
     * ]`
     */
    public const val TLS_CLIENT_CERTIFICATE_CHAIN: String = "tls.client.certificate_chain"

    /**
     * Certificate fingerprint using the MD5 digest of DER-encoded version of certificate offered by the client. For consistency with other hash values, this value should be formatted as an uppercase hash.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"0F76C7F2C55BFD7D8E8B8F4BFBF0C9EC"`
     */
    public const val TLS_CLIENT_HASH_MD5: String = "tls.client.hash.md5"

    /**
     * Certificate fingerprint using the SHA1 digest of DER-encoded version of certificate offered by the client. For consistency with other hash values, this value should be formatted as an uppercase hash.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"9E393D93138888D288266C2D915214D1D1CCEB2A"`
     */
    public const val TLS_CLIENT_HASH_SHA1: String = "tls.client.hash.sha1"

    /**
     * Certificate fingerprint using the SHA256 digest of DER-encoded version of certificate offered by the client. For consistency with other hash values, this value should be formatted as an uppercase hash.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"0687F666A054EF17A08E2F2162EAB4CBC0D265E1D7875BE74BF3C712CA92DAF0"`
     */
    public const val TLS_CLIENT_HASH_SHA256: String = "tls.client.hash.sha256"

    /**
     * Distinguished name of [subject](https://datatracker.ietf.org/doc/html/rfc5280#section-4.1.2.6) of the issuer of the x.509 certificate presented by the client.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"CN=Example Root CA, OU=Infrastructure Team, DC=example, DC=com"`
     */
    public const val TLS_CLIENT_ISSUER: String = "tls.client.issuer"

    /**
     * A hash that identifies clients based on how they perform an SSL/TLS handshake.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"d4e5b18d6b55c71272893221c96ba240"`
     */
    public const val TLS_CLIENT_JA3: String = "tls.client.ja3"

    /**
     * Date/Time indicating when client certificate is no longer considered valid.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"2021-01-01T00:00:00.000Z"`
     */
    public const val TLS_CLIENT_NOT_AFTER: String = "tls.client.not_after"

    /**
     * Date/Time indicating when client certificate is first considered valid.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"1970-01-01T00:00:00.000Z"`
     */
    public const val TLS_CLIENT_NOT_BEFORE: String = "tls.client.not_before"

    /**
     * Deprecated, use `server.address` instead.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"opentelemetry.io"`
     */
    @Deprecated("{note: Replaced by `server.address`., reason: renamed, renamed_to: server.address}")
    public const val TLS_CLIENT_SERVER_NAME: String = "tls.client.server_name"

    /**
     * Distinguished name of subject of the x.509 certificate presented by the client.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"CN=myclient, OU=Documentation Team, DC=example, DC=com"`
     */
    public const val TLS_CLIENT_SUBJECT: String = "tls.client.subject"

    /**
     * Array of ciphers offered by the client during the client hello.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `[
     * "TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384",
     * "TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384",
     * ]`
     */
    public const val TLS_CLIENT_SUPPORTED_CIPHERS: String = "tls.client.supported_ciphers"

    /**
     * String indicating the curve used for the given cipher, when applicable
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"secp256r1"`
     */
    public const val TLS_CURVE: String = "tls.curve"

    /**
     * Boolean flag indicating if the TLS negotiation was successful and transitioned to an encrypted tunnel.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `true`
     */
    public const val TLS_ESTABLISHED: String = "tls.established"

    /**
     * String indicating the protocol being tunneled. Per the values in the [IANA registry](https://www.iana.org/assignments/tls-extensiontype-values/tls-extensiontype-values.xhtml#alpn-protocol-ids), this string should be lower case.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"http/1.1"`
     */
    public const val TLS_NEXT_PROTOCOL: String = "tls.next_protocol"

    /**
     * Normalized lowercase protocol name parsed from original string of the negotiated [SSL/TLS protocol version](https://docs.openssl.org/1.1.1/man3/SSL_get_version/#return-values)
     *
     * ## Notes
     */
    public const val TLS_PROTOCOL_NAME: String = "tls.protocol.name"

    /**
     * Numeric part of the version parsed from the original string of the negotiated [SSL/TLS protocol version](https://docs.openssl.org/1.1.1/man3/SSL_get_version/#return-values)
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"1.2"`
     * - `"3"`
     */
    public const val TLS_PROTOCOL_VERSION: String = "tls.protocol.version"

    /**
     * Boolean flag indicating if this TLS connection was resumed from an existing TLS negotiation.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `true`
     */
    public const val TLS_RESUMED: String = "tls.resumed"

    /**
     * PEM-encoded stand-alone certificate offered by the server. This is usually mutually-exclusive of `server.certificate_chain` since this value also exists in that list.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"MII..."`
     */
    public const val TLS_SERVER_CERTIFICATE: String = "tls.server.certificate"

    /**
     * Array of PEM-encoded certificates that make up the certificate chain offered by the server. This is usually mutually-exclusive of `server.certificate` since that value should be the first certificate in the chain.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `[
     * "MII...",
     * "MI...",
     * ]`
     */
    public const val TLS_SERVER_CERTIFICATE_CHAIN: String = "tls.server.certificate_chain"

    /**
     * Certificate fingerprint using the MD5 digest of DER-encoded version of certificate offered by the server. For consistency with other hash values, this value should be formatted as an uppercase hash.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"0F76C7F2C55BFD7D8E8B8F4BFBF0C9EC"`
     */
    public const val TLS_SERVER_HASH_MD5: String = "tls.server.hash.md5"

    /**
     * Certificate fingerprint using the SHA1 digest of DER-encoded version of certificate offered by the server. For consistency with other hash values, this value should be formatted as an uppercase hash.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"9E393D93138888D288266C2D915214D1D1CCEB2A"`
     */
    public const val TLS_SERVER_HASH_SHA1: String = "tls.server.hash.sha1"

    /**
     * Certificate fingerprint using the SHA256 digest of DER-encoded version of certificate offered by the server. For consistency with other hash values, this value should be formatted as an uppercase hash.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"0687F666A054EF17A08E2F2162EAB4CBC0D265E1D7875BE74BF3C712CA92DAF0"`
     */
    public const val TLS_SERVER_HASH_SHA256: String = "tls.server.hash.sha256"

    /**
     * Distinguished name of [subject](https://datatracker.ietf.org/doc/html/rfc5280#section-4.1.2.6) of the issuer of the x.509 certificate presented by the client.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"CN=Example Root CA, OU=Infrastructure Team, DC=example, DC=com"`
     */
    public const val TLS_SERVER_ISSUER: String = "tls.server.issuer"

    /**
     * A hash that identifies servers based on how they perform an SSL/TLS handshake.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"d4e5b18d6b55c71272893221c96ba240"`
     */
    public const val TLS_SERVER_JA3S: String = "tls.server.ja3s"

    /**
     * Date/Time indicating when server certificate is no longer considered valid.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"2021-01-01T00:00:00.000Z"`
     */
    public const val TLS_SERVER_NOT_AFTER: String = "tls.server.not_after"

    /**
     * Date/Time indicating when server certificate is first considered valid.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"1970-01-01T00:00:00.000Z"`
     */
    public const val TLS_SERVER_NOT_BEFORE: String = "tls.server.not_before"

    /**
     * Distinguished name of subject of the x.509 certificate presented by the server.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"CN=myserver, OU=Documentation Team, DC=example, DC=com"`
     */
    public const val TLS_SERVER_SUBJECT: String = "tls.server.subject"

    /**
     * Domain extracted from the `url.full`, such as "opentelemetry.io".
     *
     * ## Notes
     *
     * In some cases a URL may refer to an IP and/or port directly, without a domain name. In this case, the IP address would go to the domain field. If the URL contains a [literal IPv6 address](https://www.rfc-editor.org/rfc/rfc2732#section-2) enclosed by `[` and `]`, the `[` and `]` characters should also be captured in the domain field.
     *
     * # Examples
     *
     * - `"www.foo.bar"`
     * - `"opentelemetry.io"`
     * - `"3.12.167.2"`
     * - `"[1080:0:0:0:8:800:200C:417A]"`
     */
    public const val URL_DOMAIN: String = "url.domain"

    /**
     * The file extension extracted from the `url.full`, excluding the leading dot.
     *
     * ## Notes
     *
     * The file extension is only set if it exists, as not every url has a file extension. When the file name has multiple extensions `example.tar.gz`, only the last one should be captured `gz`, not `tar.gz`.
     *
     * # Examples
     *
     * - `"png"`
     * - `"gz"`
     */
    public const val URL_EXTENSION: String = "url.extension"

    /**
     * The [URI fragment](https://www.rfc-editor.org/rfc/rfc3986#section-3.5) component
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"SemConv"`
     */
    public const val URL_FRAGMENT: String = "url.fragment"

    /**
     * Absolute URL describing a network resource according to [RFC3986](https://www.rfc-editor.org/rfc/rfc3986)
     *
     * ## Notes
     *
     * For network calls, URL usually has `scheme://host[:port][path][?query][#fragment]` format, where the fragment
     * is not transmitted over HTTP, but if it is known, it SHOULD be included nevertheless.
     *
     * `url.full` MUST NOT contain credentials passed via URL in form of `https://username:password@www.example.com/`.
     * In such case username and password SHOULD be redacted and attribute's value SHOULD be `https://REDACTED:REDACTED@www.example.com/`.
     *
     * `url.full` SHOULD capture the absolute URL when it is available (or can be reconstructed).
     *
     * Sensitive content provided in `url.full` SHOULD be scrubbed when instrumentations can identify it.
     *
     *
     * Query string values for the following keys SHOULD be redacted by default and replaced by the
     * value `REDACTED`:
     *
     * - [`AWSAccessKeyId`](https://docs.aws.amazon.com/AmazonS3/latest/userguide/RESTAuthentication.html#RESTAuthenticationQueryStringAuth)
     * - [`Signature`](https://docs.aws.amazon.com/AmazonS3/latest/userguide/RESTAuthentication.html#RESTAuthenticationQueryStringAuth)
     * - [`sig`](https://learn.microsoft.com/azure/storage/common/storage-sas-overview#sas-token)
     * - [`X-Goog-Signature`](https://cloud.google.com/storage/docs/access-control/signed-urls)
     *
     * This list is subject to change over time.
     *
     * When a query string value is redacted, the query string key SHOULD still be preserved, e.g.
     * `https://www.example.com/path?color=blue&sig=REDACTED`.
     *
     * # Examples
     *
     * - `"https://www.foo.bar/search?q=OpenTelemetry#SemConv"`
     * - `"//localhost"`
     */
    public const val URL_FULL: String = "url.full"

    /**
     * Unmodified original URL as seen in the event source.
     *
     * ## Notes
     *
     * In network monitoring, the observed URL may be a full URL, whereas in access logs, the URL is often just represented as a path. This field is meant to represent the URL as it was observed, complete or not.
     * `url.original` might contain credentials passed via URL in form of `https://username:password@www.example.com/`. In such case password and username SHOULD NOT be redacted and attribute's value SHOULD remain the same.
     *
     * # Examples
     *
     * - `"https://www.foo.bar/search?q=OpenTelemetry#SemConv"`
     * - `"search?q=OpenTelemetry"`
     */
    public const val URL_ORIGINAL: String = "url.original"

    /**
     * The [URI path](https://www.rfc-editor.org/rfc/rfc3986#section-3.3) component
     *
     * ## Notes
     *
     * Sensitive content provided in `url.path` SHOULD be scrubbed when instrumentations can identify it.
     *
     * # Examples
     *
     * - `"/search"`
     */
    public const val URL_PATH: String = "url.path"

    /**
     * Port extracted from the `url.full`
     *
     * ## Notes
     *
     * # Examples
     *
     * - `443`
     */
    public const val URL_PORT: String = "url.port"

    /**
     * The [URI query](https://www.rfc-editor.org/rfc/rfc3986#section-3.4) component
     *
     * ## Notes
     *
     * Sensitive content provided in `url.query` SHOULD be scrubbed when instrumentations can identify it.
     *
     *
     * Query string values for the following keys SHOULD be redacted by default and replaced by the value `REDACTED`:
     *
     * - [`AWSAccessKeyId`](https://docs.aws.amazon.com/AmazonS3/latest/userguide/RESTAuthentication.html#RESTAuthenticationQueryStringAuth)
     * - [`Signature`](https://docs.aws.amazon.com/AmazonS3/latest/userguide/RESTAuthentication.html#RESTAuthenticationQueryStringAuth)
     * - [`sig`](https://learn.microsoft.com/azure/storage/common/storage-sas-overview#sas-token)
     * - [`X-Goog-Signature`](https://cloud.google.com/storage/docs/access-control/signed-urls)
     *
     * This list is subject to change over time.
     *
     * When a query string value is redacted, the query string key SHOULD still be preserved, e.g.
     * `q=OpenTelemetry&sig=REDACTED`.
     *
     * # Examples
     *
     * - `"q=OpenTelemetry"`
     */
    public const val URL_QUERY: String = "url.query"

    /**
     * The highest registered url domain, stripped of the subdomain.
     *
     * ## Notes
     *
     * This value can be determined precisely with the [public suffix list](https://publicsuffix.org/). For example, the registered domain for `foo.example.com` is `example.com`. Trying to approximate this by simply taking the last two labels will not work well for TLDs such as `co.uk`.
     *
     * # Examples
     *
     * - `"example.com"`
     * - `"foo.co.uk"`
     */
    public const val URL_REGISTERED_DOMAIN: String = "url.registered_domain"

    /**
     * The [URI scheme](https://www.rfc-editor.org/rfc/rfc3986#section-3.1) component identifying the used protocol.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"https"`
     * - `"ftp"`
     * - `"telnet"`
     */
    public const val URL_SCHEME: String = "url.scheme"

    /**
     * The subdomain portion of a fully qualified domain name includes all of the names except the host name under the registered_domain. In a partially qualified domain, or if the qualification level of the full name cannot be determined, subdomain contains all of the names below the registered domain.
     *
     * ## Notes
     *
     * The subdomain portion of `www.east.mydomain.co.uk` is `east`. If the domain has multiple levels of subdomain, such as `sub2.sub1.example.com`, the subdomain field should contain `sub2.sub1`, with no trailing period.
     *
     * # Examples
     *
     * - `"east"`
     * - `"sub2.sub1"`
     */
    public const val URL_SUBDOMAIN: String = "url.subdomain"

    /**
     * The low-cardinality template of an [absolute path reference](https://www.rfc-editor.org/rfc/rfc3986#section-4.2).
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"/users/{id}"`
     * - `"/users/:id"`
     * - `"/users?id={id}"`
     */
    public const val URL_TEMPLATE: String = "url.template"

    /**
     * The effective top level domain (eTLD), also known as the domain suffix, is the last part of the domain name. For example, the top level domain for example.com is `com`.
     *
     * ## Notes
     *
     * This value can be determined precisely with the [public suffix list](https://publicsuffix.org/).
     *
     * # Examples
     *
     * - `"com"`
     * - `"co.uk"`
     */
    public const val URL_TOP_LEVEL_DOMAIN: String = "url.top_level_domain"

    /**
     * User email address.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"a.einstein@example.com"`
     */
    public const val USER_EMAIL: String = "user.email"

    /**
     * User's full name
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"Albert Einstein"`
     */
    public const val USER_FULL_NAME: String = "user.full_name"

    /**
     * Unique user hash to correlate information for a user in anonymized form.
     *
     * ## Notes
     *
     * Useful if `user.id` or `user.name` contain confidential information and cannot be used.
     *
     * # Examples
     *
     * - `"364fc68eaf4c8acec74a4e52d7d1feaa"`
     */
    public const val USER_HASH: String = "user.hash"

    /**
     * Unique identifier of the user.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"S-1-5-21-202424912787-2692429404-2351956786-1000"`
     */
    public const val USER_ID: String = "user.id"

    /**
     * Short name or login/username of the user.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"a.einstein"`
     */
    public const val USER_NAME: String = "user.name"

    /**
     * Array of user roles at the time of the event.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `[
     * "admin",
     * "reporting_user",
     * ]`
     */
    public const val USER_ROLES: String = "user.roles"

    /**
     * Name of the user-agent extracted from original. Usually refers to the browser's name.
     *
     * ## Notes
     *
     * [Example](https://www.whatsmyua.info) of extracting browser's name from original string. In the case of using a user-agent for non-browser products, such as microservices with multiple names/versions inside the `user_agent.original`, the most significant name SHOULD be selected. In such a scenario it should align with `user_agent.version`
     *
     * # Examples
     *
     * - `"Safari"`
     * - `"YourApp"`
     */
    public const val USER_AGENT_NAME: String = "user_agent.name"

    /**
     * Value of the [HTTP User-Agent](https://www.rfc-editor.org/rfc/rfc9110.html#field.user-agent) header sent by the client.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"CERN-LineMode/2.15 libwww/2.17b3"`
     * - `"Mozilla/5.0 (iPhone; CPU iPhone OS 14_7_1 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/14.1.2 Mobile/15E148 Safari/604.1"`
     * - `"YourApp/1.0.0 grpc-java-okhttp/1.27.2"`
     */
    public const val USER_AGENT_ORIGINAL: String = "user_agent.original"

    /**
     * Human readable operating system name.
     *
     * ## Notes
     *
     * For mapping user agent strings to OS names, libraries such as [ua-parser](https://github.com/ua-parser) can be utilized.
     *
     * # Examples
     *
     * - `"iOS"`
     * - `"Android"`
     * - `"Ubuntu"`
     */
    public const val USER_AGENT_OS_NAME: String = "user_agent.os.name"

    /**
     * The version string of the operating system as defined in [Version Attributes](/docs/resource/README.md#version-attributes).
     *
     * ## Notes
     *
     * For mapping user agent strings to OS versions, libraries such as [ua-parser](https://github.com/ua-parser) can be utilized.
     *
     * # Examples
     *
     * - `"14.2.1"`
     * - `"18.04.1"`
     */
    public const val USER_AGENT_OS_VERSION: String = "user_agent.os.version"

    /**
     * Specifies the category of synthetic traffic, such as tests or bots.
     *
     * ## Notes
     *
     * This attribute MAY be derived from the contents of the `user_agent.original` attribute. Components that populate the attribute are responsible for determining what they consider to be synthetic bot or test traffic. This attribute can either be set for self-identification purposes, or on telemetry detected to be generated as a result of a synthetic request. This attribute is useful for distinguishing between genuine client traffic and synthetic traffic generated by bots or tests
     */
    public const val USER_AGENT_SYNTHETIC_TYPE: String = "user_agent.synthetic.type"

    /**
     * Version of the user-agent extracted from original. Usually refers to the browser's version
     *
     * ## Notes
     *
     * [Example](https://www.whatsmyua.info) of extracting browser's version from original string. In the case of using a user-agent for non-browser products, such as microservices with multiple names/versions inside the `user_agent.original`, the most significant version SHOULD be selected. In such a scenario it should align with `user_agent.name`
     *
     * # Examples
     *
     * - `"14.1.2"`
     * - `"1.0.0"`
     */
    public const val USER_AGENT_VERSION: String = "user_agent.version"

    /**
     * The type of garbage collection.
     *
     * ## Notes
     */
    public const val V8JS_GC_TYPE: String = "v8js.gc.type"

    /**
     * The name of the space type of heap memory.
     *
     * ## Notes
     *
     * Value can be retrieved from value `space_name` of [`v8.getHeapSpaceStatistics()`](https://nodejs.org/api/v8.html#v8getheapspacestatistics)
     */
    public const val V8JS_HEAP_SPACE_NAME: String = "v8js.heap.space.name"

    /**
     * The ID of the change (pull request/merge request/changelist) if applicable. This is usually a unique (within repository) identifier generated by the VCS system.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"123"`
     */
    public const val VCS_CHANGE_ID: String = "vcs.change.id"

    /**
     * The state of the change (pull request/merge request/changelist).
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"open"`
     * - `"closed"`
     * - `"merged"`
     */
    public const val VCS_CHANGE_STATE: String = "vcs.change.state"

    /**
     * The human readable title of the change (pull request/merge request/changelist). This title is often a brief summary of the change and may get merged in to a ref as the commit summary.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"Fixes broken thing"`
     * - `"feat: add my new feature"`
     * - `"[chore] update dependency"`
     */
    public const val VCS_CHANGE_TITLE: String = "vcs.change.title"

    /**
     * The type of line change being measured on a branch or change.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"added"`
     * - `"removed"`
     */
    public const val VCS_LINE_CHANGE_TYPE: String = "vcs.line_change.type"

    /**
     * The group owner within the version control system.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"my-org"`
     * - `"myteam"`
     * - `"business-unit"`
     */
    public const val VCS_OWNER_NAME: String = "vcs.owner.name"

    /**
     * The name of the version control system provider.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"github"`
     * - `"gitlab"`
     * - `"gitea"`
     * - `"bitbucket"`
     */
    public const val VCS_PROVIDER_NAME: String = "vcs.provider.name"

    /**
     * The name of the [reference](https://git-scm.com/docs/gitglossary#def_ref) such as **branch** or **tag** in the repository.
     *
     * ## Notes
     *
     * `base` refers to the starting point of a change. For example, `main`
     * would be the base reference of type branch if you've created a new
     * reference of type branch from it and created new commits.
     *
     * # Examples
     *
     * - `"my-feature-branch"`
     * - `"tag-1-test"`
     */
    public const val VCS_REF_BASE_NAME: String = "vcs.ref.base.name"

    /**
     * The revision, literally [revised version](https://www.merriam-webster.com/dictionary/revision), The revision most often refers to a commit object in Git, or a revision number in SVN.
     *
     * ## Notes
     *
     * `base` refers to the starting point of a change. For example, `main`
     * would be the base reference of type branch if you've created a new
     * reference of type branch from it and created new commits. The
     * revision can be a full [hash value (see
     * glossary)](https://nvlpubs.nist.gov/nistpubs/FIPS/NIST.FIPS.186-5.pdf),
     * of the recorded change to a ref within a repository pointing to a
     * commit [commit](https://git-scm.com/docs/git-commit) object. It does
     * not necessarily have to be a hash; it can simply define a [revision
     * number](https://svnbook.red-bean.com/en/1.7/svn.tour.revs.specifiers.html)
     * which is an integer that is monotonically increasing. In cases where
     * it is identical to the `ref.base.name`, it SHOULD still be included.
     * It is up to the implementer to decide which value to set as the
     * revision based on the VCS system and situational context.
     *
     * # Examples
     *
     * - `"9d59409acf479dfa0df1aa568182e43e43df8bbe28d60fcf2bc52e30068802cc"`
     * - `"main"`
     * - `"123"`
     * - `"HEAD"`
     */
    public const val VCS_REF_BASE_REVISION: String = "vcs.ref.base.revision"

    /**
     * The type of the [reference](https://git-scm.com/docs/gitglossary#def_ref) in the repository.
     *
     * ## Notes
     *
     * `base` refers to the starting point of a change. For example, `main`
     * would be the base reference of type branch if you've created a new
     * reference of type branch from it and created new commits.
     *
     * # Examples
     *
     * - `"branch"`
     * - `"tag"`
     */
    public const val VCS_REF_BASE_TYPE: String = "vcs.ref.base.type"

    /**
     * The name of the [reference](https://git-scm.com/docs/gitglossary#def_ref) such as **branch** or **tag** in the repository.
     *
     * ## Notes
     *
     * `head` refers to where you are right now; the current reference at a
     * given time.
     *
     * # Examples
     *
     * - `"my-feature-branch"`
     * - `"tag-1-test"`
     */
    public const val VCS_REF_HEAD_NAME: String = "vcs.ref.head.name"

    /**
     * The revision, literally [revised version](https://www.merriam-webster.com/dictionary/revision), The revision most often refers to a commit object in Git, or a revision number in SVN.
     *
     * ## Notes
     *
     * `head` refers to where you are right now; the current reference at a
     * given time.The revision can be a full [hash value (see
     * glossary)](https://nvlpubs.nist.gov/nistpubs/FIPS/NIST.FIPS.186-5.pdf),
     * of the recorded change to a ref within a repository pointing to a
     * commit [commit](https://git-scm.com/docs/git-commit) object. It does
     * not necessarily have to be a hash; it can simply define a [revision
     * number](https://svnbook.red-bean.com/en/1.7/svn.tour.revs.specifiers.html)
     * which is an integer that is monotonically increasing. In cases where
     * it is identical to the `ref.head.name`, it SHOULD still be included.
     * It is up to the implementer to decide which value to set as the
     * revision based on the VCS system and situational context.
     *
     * # Examples
     *
     * - `"9d59409acf479dfa0df1aa568182e43e43df8bbe28d60fcf2bc52e30068802cc"`
     * - `"main"`
     * - `"123"`
     * - `"HEAD"`
     */
    public const val VCS_REF_HEAD_REVISION: String = "vcs.ref.head.revision"

    /**
     * The type of the [reference](https://git-scm.com/docs/gitglossary#def_ref) in the repository.
     *
     * ## Notes
     *
     * `head` refers to where you are right now; the current reference at a
     * given time.
     *
     * # Examples
     *
     * - `"branch"`
     * - `"tag"`
     */
    public const val VCS_REF_HEAD_TYPE: String = "vcs.ref.head.type"

    /**
     * The type of the [reference](https://git-scm.com/docs/gitglossary#def_ref) in the repository.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"branch"`
     * - `"tag"`
     */
    public const val VCS_REF_TYPE: String = "vcs.ref.type"

    /**
     * Deprecated, use `vcs.change.id` instead.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"123"`
     */
    @Deprecated("{note: Replaced by `vcs.change.id`., reason: renamed, renamed_to: vcs.change.id}")
    public const val VCS_REPOSITORY_CHANGE_ID: String = "vcs.repository.change.id"

    /**
     * Deprecated, use `vcs.change.title` instead.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"Fixes broken thing"`
     * - `"feat: add my new feature"`
     * - `"[chore] update dependency"`
     */
    @Deprecated("{note: Replaced by `vcs.change.title`., reason: renamed, renamed_to: vcs.change.title}")
    public const val VCS_REPOSITORY_CHANGE_TITLE: String = "vcs.repository.change.title"

    /**
     * The human readable name of the repository. It SHOULD NOT include any additional identifier like Group/SubGroup in GitLab or organization in GitHub.
     *
     * ## Notes
     *
     * Due to it only being the name, it can clash with forks of the same
     * repository if collecting telemetry across multiple orgs or groups in
     * the same backends.
     *
     * # Examples
     *
     * - `"semantic-conventions"`
     * - `"my-cool-repo"`
     */
    public const val VCS_REPOSITORY_NAME: String = "vcs.repository.name"

    /**
     * Deprecated, use `vcs.ref.head.name` instead.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"my-feature-branch"`
     * - `"tag-1-test"`
     */
    @Deprecated("{note: Replaced by `vcs.ref.head.name`., reason: renamed, renamed_to: vcs.ref.head.name}")
    public const val VCS_REPOSITORY_REF_NAME: String = "vcs.repository.ref.name"

    /**
     * Deprecated, use `vcs.ref.head.revision` instead.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"9d59409acf479dfa0df1aa568182e43e43df8bbe28d60fcf2bc52e30068802cc"`
     * - `"main"`
     * - `"123"`
     * - `"HEAD"`
     */
    @Deprecated("{note: Replaced by `vcs.ref.head.revision`., reason: renamed, renamed_to: vcs.ref.head.revision}")
    public const val VCS_REPOSITORY_REF_REVISION: String = "vcs.repository.ref.revision"

    /**
     * Deprecated, use `vcs.ref.head.type` instead.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"branch"`
     * - `"tag"`
     */
    @Deprecated("{note: Replaced by `vcs.ref.head.type`., reason: renamed, renamed_to: vcs.ref.head.type}")
    public const val VCS_REPOSITORY_REF_TYPE: String = "vcs.repository.ref.type"

    /**
     * The [canonical URL](https://support.google.com/webmasters/answer/10347851?hl=en#:~:text=A%20canonical%20URL%20is%20the,Google%20chooses%20one%20as%20canonical.) of the repository providing the complete HTTP(S) address in order to locate and identify the repository through a browser.
     *
     * ## Notes
     *
     * In Git Version Control Systems, the canonical URL SHOULD NOT include
     * the `.git` extension.
     *
     * # Examples
     *
     * - `"https://github.com/opentelemetry/open-telemetry-collector-contrib"`
     * - `"https://gitlab.com/my-org/my-project/my-projects-project/repo"`
     */
    public const val VCS_REPOSITORY_URL_FULL: String = "vcs.repository.url.full"

    /**
     * The type of revision comparison.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"ahead"`
     * - `"behind"`
     */
    public const val VCS_REVISION_DELTA_DIRECTION: String = "vcs.revision_delta.direction"

    /**
     * Additional description of the web engine (e.g. detailed version and edition information).
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"WildFly Full 21.0.0.Final (WildFly Core 13.0.1.Final) - 2.2.2.Final"`
     */
    public const val WEBENGINE_DESCRIPTION: String = "webengine.description"

    /**
     * The name of the web engine.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"WildFly"`
     */
    public const val WEBENGINE_NAME: String = "webengine.name"

    /**
     * The version of the web engine.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"21.0.0"`
     */
    public const val WEBENGINE_VERSION: String = "webengine.version"

    /**
     * The System Management Facility (SMF) Identifier uniquely identified a z/OS system within a SYSPLEX or mainframe environment and is used for system and performance analysis.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"SYS1"`
     */
    public const val ZOS_SMF_ID: String = "zos.smf.id"

    /**
     * The name of the SYSPLEX to which the z/OS system belongs too.
     *
     * ## Notes
     *
     * # Examples
     *
     * - `"SYSPLEX1"`
     */
    public const val ZOS_SYSPLEX_NAME: String = "zos.sysplex.name"
}
