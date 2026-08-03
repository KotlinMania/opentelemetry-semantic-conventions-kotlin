// port-lint: source opentelemetry-semantic-conventions/src/metric.rs
package io.github.kotlinmania.opentelemetrysemanticconventions

/**
 * Metric semantic conventions defined by the OpenTelemetry specification.
 *
 * The metric semantic conventions define a set of standardized attributes to
 * be used in meters.
 */
public object Metric {
    /**
     * ## Description
     *
     * Number of exceptions caught by exception handling middleware.
     *
     * ## Notes
     *
     * Meter name: `Microsoft.AspNetCore.Diagnostics`; Added in: ASP.NET Core 8.0
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `counter` |
     * | Unit: | `{exception}` |
     * | Status: | `Stable`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::ASPNETCORE_DIAGNOSTICS_EXCEPTION_RESULT`] | `Required`
     * | [`crate::attribute::ASPNETCORE_DIAGNOSTICS_HANDLER_TYPE`] | `Conditionally_required`: if and only if the exception was handled by this handler.
     * | [`crate::attribute::ERROR_TYPE`] | `Required`
     */
    public const val aspnetcoreDiagnosticsExceptions: String = "aspnetcore.diagnostics.exceptions"

    /**
     * ## Description
     *
     * Number of requests that are currently active on the server that hold a rate limiting lease.
     *
     * ## Notes
     *
     * Meter name: `Microsoft.AspNetCore.RateLimiting`; Added in: ASP.NET Core 8.0
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `updowncounter` |
     * | Unit: | `{request}` |
     * | Status: | `Stable`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::ASPNETCORE_RATE_LIMITING_POLICY`] | `Conditionally_required`: if the matched endpoint for the request had a rate-limiting policy.
     */
    public const val aspnetcoreRateLimitingActiveRequestLeases: String = "aspnetcore.rate_limiting.active_request_leases"

    /**
     * ## Description
     *
     * Number of requests that are currently queued, waiting to acquire a rate limiting lease.
     *
     * ## Notes
     *
     * Meter name: `Microsoft.AspNetCore.RateLimiting`; Added in: ASP.NET Core 8.0
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `updowncounter` |
     * | Unit: | `{request}` |
     * | Status: | `Stable`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::ASPNETCORE_RATE_LIMITING_POLICY`] | `Conditionally_required`: if the matched endpoint for the request had a rate-limiting policy.
     */
    public const val aspnetcoreRateLimitingQueuedRequests: String = "aspnetcore.rate_limiting.queued_requests"

    /**
     * ## Description
     *
     * The time the request spent in a queue waiting to acquire a rate limiting lease.
     *
     * ## Notes
     *
     * Meter name: `Microsoft.AspNetCore.RateLimiting`; Added in: ASP.NET Core 8.0
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `histogram` |
     * | Unit: | `s` |
     * | Status: | `Stable`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::ASPNETCORE_RATE_LIMITING_POLICY`] | `Conditionally_required`: if the matched endpoint for the request had a rate-limiting policy.
     * | [`crate::attribute::ASPNETCORE_RATE_LIMITING_RESULT`] | `Required`
     */
    public const val aspnetcoreRateLimitingRequestTimeInQueue: String = "aspnetcore.rate_limiting.request.time_in_queue"

    /**
     * ## Description
     *
     * The duration of rate limiting lease held by requests on the server.
     *
     * ## Notes
     *
     * Meter name: `Microsoft.AspNetCore.RateLimiting`; Added in: ASP.NET Core 8.0
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `histogram` |
     * | Unit: | `s` |
     * | Status: | `Stable`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::ASPNETCORE_RATE_LIMITING_POLICY`] | `Conditionally_required`: if the matched endpoint for the request had a rate-limiting policy.
     */
    public const val aspnetcoreRateLimitingRequestLeaseDuration: String = "aspnetcore.rate_limiting.request_lease.duration"

    /**
     * ## Description
     *
     * Number of requests that tried to acquire a rate limiting lease.
     *
     * ## Notes
     *
     * Requests could be:
     *
     * - Rejected by global or endpoint rate limiting policies
     * - Canceled while waiting for the lease.
     *
     * Meter name: `Microsoft.AspNetCore.RateLimiting`; Added in: ASP.NET Core 8.0
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `counter` |
     * | Unit: | `{request}` |
     * | Status: | `Stable`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::ASPNETCORE_RATE_LIMITING_POLICY`] | `Conditionally_required`: if the matched endpoint for the request had a rate-limiting policy.
     * | [`crate::attribute::ASPNETCORE_RATE_LIMITING_RESULT`] | `Required`
     */
    public const val aspnetcoreRateLimitingRequests: String = "aspnetcore.rate_limiting.requests"

    /**
     * ## Description
     *
     * Number of requests that were attempted to be matched to an endpoint.
     *
     * ## Notes
     *
     * Meter name: `Microsoft.AspNetCore.Routing`; Added in: ASP.NET Core 8.0
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `counter` |
     * | Unit: | `{match_attempt}` |
     * | Status: | `Stable`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::ASPNETCORE_ROUTING_IS_FALLBACK`] | `Conditionally_required`: if and only if a route was successfully matched.
     * | [`crate::attribute::ASPNETCORE_ROUTING_MATCH_STATUS`] | `Required`
     * | [`crate::attribute::HTTP_ROUTE`] | `Conditionally_required`: if and only if a route was successfully matched.
     */
    public const val aspnetcoreRoutingMatchAttempts: String = "aspnetcore.routing.match_attempts"

    /**
     * ## Description
     *
     * Number of active client instances
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `updowncounter` |
     * | Unit: | `{instance}` |
     * | Status: | `Development`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::SERVER_ADDRESS`] | `Recommended`
     * | [`crate::attribute::SERVER_PORT`] | `Conditionally_required`: If using a port other than the default port for this DBMS and if `server.address` is set.
     */
    public const val azureCosmosdbClientActiveInstanceCount: String = "azure.cosmosdb.client.active_instance.count"

    /**
     * ## Description
     *
     * [Request units](https://learn.microsoft.com/azure/cosmos-db/request-units) consumed by the operation
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `histogram` |
     * | Unit: | `{request_unit}` |
     * | Status: | `Development`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::AZURE_COSMOSDB_CONSISTENCY_LEVEL`] | `Conditionally_required`: If available.
     * | [`crate::attribute::AZURE_COSMOSDB_OPERATION_CONTACTED_REGIONS`] | `{"recommended": "if available"}`
     * | [`crate::attribute::AZURE_COSMOSDB_RESPONSE_SUB_STATUS_CODE`] | `Conditionally_required`: when response was received and contained sub-code.
     * | [`crate::attribute::DB_COLLECTION_NAME`] | `Conditionally_required`: If available.
     * | [`crate::attribute::DB_NAMESPACE`] | `Conditionally_required`: If available.
     * | [`crate::attribute::DB_OPERATION_NAME`] | `Required`
     * | [`crate::attribute::DB_RESPONSE_STATUS_CODE`] | `Conditionally_required`: If the operation failed and status code is available.
     * | [`crate::attribute::ERROR_TYPE`] | `Conditionally_required`: If and only if the operation failed.
     * | [`crate::attribute::SERVER_ADDRESS`] | `Recommended`
     * | [`crate::attribute::SERVER_PORT`] | `Conditionally_required`: If using a port other than the default port for this DBMS and if `server.address` is set.
     */
    public const val azureCosmosdbClientOperationRequestCharge: String = "azure.cosmosdb.client.operation.request_charge"

    /**
     * ## Description
     *
     * The number of pipeline runs currently active in the system by state
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `updowncounter` |
     * | Unit: | `{run}` |
     * | Status: | `Development`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::CICD_PIPELINE_NAME`] | `Required`
     * | [`crate::attribute::CICD_PIPELINE_RUN_STATE`] | `Required`
     */
    public const val cicdPipelineRunActive: String = "cicd.pipeline.run.active"

    /**
     * ## Description
     *
     * Duration of a pipeline run grouped by pipeline, state and result
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `histogram` |
     * | Unit: | `s` |
     * | Status: | `Development`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::CICD_PIPELINE_NAME`] | `Required`
     * | [`crate::attribute::CICD_PIPELINE_RESULT`] | `Conditionally_required`: If and only if the pipeline run result has been set during that state.
     * | [`crate::attribute::CICD_PIPELINE_RUN_STATE`] | `Required`
     * | [`crate::attribute::ERROR_TYPE`] | `Conditionally_required`: If and only if the pipeline run failed.
     */
    public const val cicdPipelineRunDuration: String = "cicd.pipeline.run.duration"

    /**
     * ## Description
     *
     * The number of errors encountered in pipeline runs (eg. compile, test failures).
     *
     * ## Notes
     *
     * There might be errors in a pipeline run that are non fatal (eg. they are suppressed) or in a parallel stage multiple stages could have a fatal error.
     * This means that this error count might not be the same as the count of metric `cicd.pipeline.run.duration` with run result `failure`
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `counter` |
     * | Unit: | `{error}` |
     * | Status: | `Development`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::CICD_PIPELINE_NAME`] | `Required`
     * | [`crate::attribute::ERROR_TYPE`] | `Required`
     */
    public const val cicdPipelineRunErrors: String = "cicd.pipeline.run.errors"

    /**
     * ## Description
     *
     * The number of errors in a component of the CICD system (eg. controller, scheduler, agent).
     *
     * ## Notes
     *
     * Errors in pipeline run execution are explicitly excluded. Ie a test failure is not counted in this metric
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `counter` |
     * | Unit: | `{error}` |
     * | Status: | `Development`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::CICD_SYSTEM_COMPONENT`] | `Required`
     * | [`crate::attribute::ERROR_TYPE`] | `Required`
     */
    public const val cicdSystemErrors: String = "cicd.system.errors"

    /**
     * ## Description
     *
     * The number of workers on the CICD system by state
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `updowncounter` |
     * | Unit: | `{count}` |
     * | Status: | `Development`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::CICD_WORKER_STATE`] | `Required`
     */
    public const val cicdWorkerCount: String = "cicd.worker.count"

    /**
     * ## Description
     *
     * Total CPU time consumed
     *
     * ## Notes
     *
     * Total CPU time consumed by the specific container on all available CPU cores
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `counter` |
     * | Unit: | `s` |
     * | Status: | `Development`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::CPU_MODE`] | `Conditionally_required`: Required if mode is available, i.e. metrics coming from the Docker Stats API.
     */
    public const val containerCpuTime: String = "container.cpu.time"

    /**
     * ## Description
     *
     * Container's CPU usage, measured in cpus. Range from 0 to the number of allocatable CPUs
     *
     * ## Notes
     *
     * CPU usage of the specific container on all available CPU cores, averaged over the sample window
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `gauge` |
     * | Unit: | `{cpu}` |
     * | Status: | `Development`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::CPU_MODE`] | `Conditionally_required`: Required if mode is available, i.e. metrics coming from the Docker Stats API.
     */
    public const val containerCpuUsage: String = "container.cpu.usage"

    /**
     * ## Description
     *
     * Disk bytes for the container.
     *
     * ## Notes
     *
     * The total number of bytes read/written successfully (aggregated from all disks)
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `counter` |
     * | Unit: | `By` |
     * | Status: | `Development`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::DISK_IO_DIRECTION`] | `Recommended`
     * | [`crate::attribute::SYSTEM_DEVICE`] | `Recommended`
     */
    public const val containerDiskIo: String = "container.disk.io"

    /**
     * ## Description
     *
     * Memory usage of the container.
     *
     * ## Notes
     *
     * Memory usage of the container
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `counter` |
     * | Unit: | `By` |
     * | Status: | `Development`  |
     */
    public const val containerMemoryUsage: String = "container.memory.usage"

    /**
     * ## Description
     *
     * Network bytes for the container.
     *
     * ## Notes
     *
     * The number of bytes sent/received on all network interfaces by the container
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `counter` |
     * | Unit: | `By` |
     * | Status: | `Development`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::NETWORK_INTERFACE_NAME`] | `Recommended`
     * | [`crate::attribute::NETWORK_IO_DIRECTION`] | `Recommended`
     */
    public const val containerNetworkIo: String = "container.network.io"

    /**
     * ## Description
     *
     * The time the container has been running
     *
     * ## Notes
     *
     * Instrumentations SHOULD use a gauge with type `double` and measure uptime in seconds as a floating point number with the highest precision available.
     * The actual accuracy would depend on the instrumentation and operating system
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `gauge` |
     * | Unit: | `s` |
     * | Status: | `Development`  |
     */
    public const val containerUptime: String = "container.uptime"

    /**
     * ## Description
     *
     * Deprecated. Use `system.cpu.frequency` instead
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `gauge` |
     * | Unit: | `{Hz}` |
     * | Status: | `Development`  |
     */
    @Deprecated("{note: Replaced by `system.cpu.frequency`., reason: renamed, renamed_to: system.cpu.frequency}")
    public const val cpuFrequency: String = "cpu.frequency"

    /**
     * ## Description
     *
     * Deprecated. Use `system.cpu.time` instead
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `counter` |
     * | Unit: | `s` |
     * | Status: | `Development`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::CPU_LOGICAL_NUMBER`] | `Recommended`
     * | [`crate::attribute::CPU_MODE`] | `Recommended`
     */
    @Deprecated("{note: Replaced by `system.cpu.time`., reason: renamed, renamed_to: system.cpu.time}")
    public const val cpuTime: String = "cpu.time"

    /**
     * ## Description
     *
     * Deprecated. Use `system.cpu.utilization` instead
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `gauge` |
     * | Unit: | `1` |
     * | Status: | `Development`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::CPU_LOGICAL_NUMBER`] | `Recommended`
     * | [`crate::attribute::CPU_MODE`] | `Recommended`
     */
    @Deprecated("{note: Replaced by `system.cpu.utilization`., reason: renamed, renamed_to: system.cpu.utilization}")
    public const val cpuUtilization: String = "cpu.utilization"

    /**
     * ## Description
     *
     * The total number of objects collected inside a generation since interpreter start.
     *
     * ## Notes
     *
     * This metric reports data from [`gc.stats()`](https://docs.python.org/3/library/gc.html#gc.get_stats)
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `counter` |
     * | Unit: | `{object}` |
     * | Status: | `Development`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::CPYTHON_GC_GENERATION`] | `Required`
     */
    public const val cpythonGcCollectedObjects: String = "cpython.gc.collected_objects"

    /**
     * ## Description
     *
     * The number of times a generation was collected since interpreter start.
     *
     * ## Notes
     *
     * This metric reports data from [`gc.stats()`](https://docs.python.org/3/library/gc.html#gc.get_stats)
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `counter` |
     * | Unit: | `{collection}` |
     * | Status: | `Development`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::CPYTHON_GC_GENERATION`] | `Required`
     */
    public const val cpythonGcCollections: String = "cpython.gc.collections"

    /**
     * ## Description
     *
     * The total number of objects which were found to be uncollectable inside a generation since interpreter start.
     *
     * ## Notes
     *
     * This metric reports data from [`gc.stats()`](https://docs.python.org/3/library/gc.html#gc.get_stats)
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `counter` |
     * | Unit: | `{object}` |
     * | Status: | `Development`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::CPYTHON_GC_GENERATION`] | `Required`
     */
    public const val cpythonGcUncollectableObjects: String = "cpython.gc.uncollectable_objects"

    /**
     * ## Description
     *
     * The number of connections that are currently in state described by the `state` attribute
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `updowncounter` |
     * | Unit: | `{connection}` |
     * | Status: | `Development`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::DB_CLIENT_CONNECTION_POOL_NAME`] | `Required`
     * | [`crate::attribute::DB_CLIENT_CONNECTION_STATE`] | `Required`
     */
    public const val dbClientConnectionCount: String = "db.client.connection.count"

    /**
     * ## Description
     *
     * The time it took to create a new connection
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `histogram` |
     * | Unit: | `s` |
     * | Status: | `Development`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::DB_CLIENT_CONNECTION_POOL_NAME`] | `Required`
     */
    public const val dbClientConnectionCreateTime: String = "db.client.connection.create_time"

    /**
     * ## Description
     *
     * The maximum number of idle open connections allowed
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `updowncounter` |
     * | Unit: | `{connection}` |
     * | Status: | `Development`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::DB_CLIENT_CONNECTION_POOL_NAME`] | `Required`
     */
    public const val dbClientConnectionIdleMax: String = "db.client.connection.idle.max"

    /**
     * ## Description
     *
     * The minimum number of idle open connections allowed
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `updowncounter` |
     * | Unit: | `{connection}` |
     * | Status: | `Development`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::DB_CLIENT_CONNECTION_POOL_NAME`] | `Required`
     */
    public const val dbClientConnectionIdleMin: String = "db.client.connection.idle.min"

    /**
     * ## Description
     *
     * The maximum number of open connections allowed
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `updowncounter` |
     * | Unit: | `{connection}` |
     * | Status: | `Development`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::DB_CLIENT_CONNECTION_POOL_NAME`] | `Required`
     */
    public const val dbClientConnectionMax: String = "db.client.connection.max"

    /**
     * ## Description
     *
     * The number of current pending requests for an open connection
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `updowncounter` |
     * | Unit: | `{request}` |
     * | Status: | `Development`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::DB_CLIENT_CONNECTION_POOL_NAME`] | `Required`
     */
    public const val dbClientConnectionPendingRequests: String = "db.client.connection.pending_requests"

    /**
     * ## Description
     *
     * The number of connection timeouts that have occurred trying to obtain a connection from the pool
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `counter` |
     * | Unit: | `{timeout}` |
     * | Status: | `Development`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::DB_CLIENT_CONNECTION_POOL_NAME`] | `Required`
     */
    public const val dbClientConnectionTimeouts: String = "db.client.connection.timeouts"

    /**
     * ## Description
     *
     * The time between borrowing a connection and returning it to the pool
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `histogram` |
     * | Unit: | `s` |
     * | Status: | `Development`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::DB_CLIENT_CONNECTION_POOL_NAME`] | `Required`
     */
    public const val dbClientConnectionUseTime: String = "db.client.connection.use_time"

    /**
     * ## Description
     *
     * The time it took to obtain an open connection from the pool
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `histogram` |
     * | Unit: | `s` |
     * | Status: | `Development`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::DB_CLIENT_CONNECTION_POOL_NAME`] | `Required`
     */
    public const val dbClientConnectionWaitTime: String = "db.client.connection.wait_time"

    /**
     * ## Description
     *
     * Deprecated, use `db.client.connection.create_time` instead. Note: the unit also changed from `ms` to `s`
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `histogram` |
     * | Unit: | `ms` |
     * | Status: | `Development`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::DB_CLIENT_CONNECTIONS_POOL_NAME`] | `Required`
     */
    @Deprecated("{note: Replaced by `db.client.connection.create_time` with unit `s`., reason: uncategorized}")
    public const val dbClientConnectionsCreateTime: String = "db.client.connections.create_time"

    /**
     * ## Description
     *
     * Deprecated, use `db.client.connection.idle.max` instead
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `updowncounter` |
     * | Unit: | `{connection}` |
     * | Status: | `Development`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::DB_CLIENT_CONNECTIONS_POOL_NAME`] | `Required`
     */
    @Deprecated("{note: Replaced by `db.client.connection.idle.max`., reason: renamed, renamed_to: db.client.connection.idle.max}")
    public const val dbClientConnectionsIdleMax: String = "db.client.connections.idle.max"

    /**
     * ## Description
     *
     * Deprecated, use `db.client.connection.idle.min` instead
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `updowncounter` |
     * | Unit: | `{connection}` |
     * | Status: | `Development`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::DB_CLIENT_CONNECTIONS_POOL_NAME`] | `Required`
     */
    @Deprecated("{note: Replaced by `db.client.connection.idle.min`., reason: renamed, renamed_to: db.client.connection.idle.min}")
    public const val dbClientConnectionsIdleMin: String = "db.client.connections.idle.min"

    /**
     * ## Description
     *
     * Deprecated, use `db.client.connection.max` instead
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `updowncounter` |
     * | Unit: | `{connection}` |
     * | Status: | `Development`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::DB_CLIENT_CONNECTIONS_POOL_NAME`] | `Required`
     */
    @Deprecated("{note: Replaced by `db.client.connection.max`., reason: renamed, renamed_to: db.client.connection.max}")
    public const val dbClientConnectionsMax: String = "db.client.connections.max"

    /**
     * ## Description
     *
     * Deprecated, use `db.client.connection.pending_requests` instead
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `updowncounter` |
     * | Unit: | `{request}` |
     * | Status: | `Development`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::DB_CLIENT_CONNECTIONS_POOL_NAME`] | `Required`
     */
    @Deprecated("{note: Replaced by `db.client.connection.pending_requests`., reason: renamed, renamed_to: db.client.connection.pending_requests}")
    public const val dbClientConnectionsPendingRequests: String = "db.client.connections.pending_requests"

    /**
     * ## Description
     *
     * Deprecated, use `db.client.connection.timeouts` instead
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `counter` |
     * | Unit: | `{timeout}` |
     * | Status: | `Development`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::DB_CLIENT_CONNECTIONS_POOL_NAME`] | `Required`
     */
    @Deprecated("{note: Replaced by `db.client.connection.timeouts`., reason: renamed, renamed_to: db.client.connection.timeouts}")
    public const val dbClientConnectionsTimeouts: String = "db.client.connections.timeouts"

    /**
     * ## Description
     *
     * Deprecated, use `db.client.connection.count` instead
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `updowncounter` |
     * | Unit: | `{connection}` |
     * | Status: | `Development`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::DB_CLIENT_CONNECTIONS_POOL_NAME`] | `Required`
     * | [`crate::attribute::DB_CLIENT_CONNECTIONS_STATE`] | `Required`
     */
    @Deprecated("{note: Replaced by `db.client.connection.count`., reason: renamed, renamed_to: db.client.connection.count}")
    public const val dbClientConnectionsUsage: String = "db.client.connections.usage"

    /**
     * ## Description
     *
     * Deprecated, use `db.client.connection.use_time` instead. Note: the unit also changed from `ms` to `s`
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `histogram` |
     * | Unit: | `ms` |
     * | Status: | `Development`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::DB_CLIENT_CONNECTIONS_POOL_NAME`] | `Required`
     */
    @Deprecated("{note: Replaced by `db.client.connection.use_time` with unit `s`., reason: uncategorized}")
    public const val dbClientConnectionsUseTime: String = "db.client.connections.use_time"

    /**
     * ## Description
     *
     * Deprecated, use `db.client.connection.wait_time` instead. Note: the unit also changed from `ms` to `s`
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `histogram` |
     * | Unit: | `ms` |
     * | Status: | `Development`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::DB_CLIENT_CONNECTIONS_POOL_NAME`] | `Required`
     */
    @Deprecated("{note: Replaced by `db.client.connection.wait_time` with unit `s`., reason: uncategorized}")
    public const val dbClientConnectionsWaitTime: String = "db.client.connections.wait_time"

    /**
     * ## Description
     *
     * Deprecated, use `azure.cosmosdb.client.active_instance.count` instead
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `updowncounter` |
     * | Unit: | `{instance}` |
     * | Status: | `Development`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::SERVER_ADDRESS`] | `Recommended`
     * | [`crate::attribute::SERVER_PORT`] | `Conditionally_required`: If using a port other than the default port for this DBMS and if `server.address` is set.
     */
    @Deprecated("{note: Replaced by `azure.cosmosdb.client.active_instance.count`., reason: renamed, renamed_to: azure.cosmosdb.client.active_instance.count}")
    public const val dbClientCosmosdbActiveInstanceCount: String = "db.client.cosmosdb.active_instance.count"

    /**
     * ## Description
     *
     * Deprecated, use `azure.cosmosdb.client.operation.request_charge` instead
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `histogram` |
     * | Unit: | `{request_unit}` |
     * | Status: | `Development`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::DB_COLLECTION_NAME`] | `Conditionally_required`: If available.
     * | [`crate::attribute::DB_COSMOSDB_CONSISTENCY_LEVEL`] | `Conditionally_required`: If available.
     * | [`crate::attribute::DB_COSMOSDB_REGIONS_CONTACTED`] | `{"recommended": "if available"}`
     * | [`crate::attribute::DB_COSMOSDB_SUB_STATUS_CODE`] | `Conditionally_required`: when response was received and contained sub-code.
     * | [`crate::attribute::DB_NAMESPACE`] | `Conditionally_required`: If available.
     * | [`crate::attribute::DB_OPERATION_NAME`] | `Conditionally_required`: If readily available and if there is a single operation name that describes the database call. The operation name MAY be parsed from the query text, in which case it SHOULD be the single operation name found in the query.
     */
    @Deprecated("{note: Replaced by `azure.cosmosdb.client.operation.request_charge`., reason: renamed, renamed_to: azure.cosmosdb.client.operation.request_charge}")
    public const val dbClientCosmosdbOperationRequestCharge: String = "db.client.cosmosdb.operation.request_charge"

    /**
     * ## Description
     *
     * Duration of database client operations.
     *
     * ## Notes
     *
     * Batch operations SHOULD be recorded as a single operation
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `histogram` |
     * | Unit: | `s` |
     * | Status: | `Stable`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::DB_COLLECTION_NAME`] | `Conditionally_required`: If readily available and if a database call is performed on a single collection.
     * | [`crate::attribute::DB_NAMESPACE`] | `Conditionally_required`: If available.
     * | [`crate::attribute::DB_OPERATION_NAME`] | `Conditionally_required`: If readily available and if there is a single operation name that describes the database call.
     * | [`crate::attribute::DB_QUERY_SUMMARY`] | `{"recommended": "if available through instrumentation hooks or if the instrumentation supports generating a query summary."}`
     * | [`crate::attribute::DB_QUERY_TEXT`] | `Opt_in`
     * | [`crate::attribute::DB_RESPONSE_STATUS_CODE`] | `Conditionally_required`: If the operation failed and status code is available.
     * | [`crate::attribute::DB_STORED_PROCEDURE_NAME`] | `{"recommended": "if operation applies to a specific stored procedure."}`
     * | [`crate::attribute::DB_SYSTEM_NAME`] | `Required`
     * | [`crate::attribute::ERROR_TYPE`] | `Conditionally_required`: If and only if the operation failed.
     * | [`crate::attribute::NETWORK_PEER_ADDRESS`] | `{"recommended": "if applicable for this database system."}`
     * | [`crate::attribute::NETWORK_PEER_PORT`] | `{"recommended": "if and only if `network.peer.address` is set."}`
     * | [`crate::attribute::SERVER_ADDRESS`] | `Recommended`
     * | [`crate::attribute::SERVER_PORT`] | `Conditionally_required`: If using a port other than the default port for this DBMS and if `server.address` is set.
     */
    public const val dbClientOperationDuration: String = "db.client.operation.duration"

    /**
     * ## Description
     *
     * The actual number of records returned by the database operation
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `histogram` |
     * | Unit: | `{row}` |
     * | Status: | `Development`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::DB_COLLECTION_NAME`] | `Conditionally_required`: If readily available and if a database call is performed on a single collection.
     * | [`crate::attribute::DB_NAMESPACE`] | `Conditionally_required`: If available.
     * | [`crate::attribute::DB_OPERATION_NAME`] | `Conditionally_required`: If readily available and if there is a single operation name that describes the database call.
     * | [`crate::attribute::DB_QUERY_SUMMARY`] | `{"recommended": "if available through instrumentation hooks or if the instrumentation supports generating a query summary."}`
     * | [`crate::attribute::DB_QUERY_TEXT`] | `Opt_in`
     * | [`crate::attribute::DB_RESPONSE_STATUS_CODE`] | `Conditionally_required`: If the operation failed and status code is available.
     * | [`crate::attribute::DB_SYSTEM_NAME`] | `Required`
     * | [`crate::attribute::ERROR_TYPE`] | `Conditionally_required`: If and only if the operation failed.
     * | [`crate::attribute::NETWORK_PEER_ADDRESS`] | `{"recommended": "if applicable for this database system."}`
     * | [`crate::attribute::NETWORK_PEER_PORT`] | `{"recommended": "if and only if `network.peer.address` is set."}`
     * | [`crate::attribute::SERVER_ADDRESS`] | `Recommended`
     * | [`crate::attribute::SERVER_PORT`] | `Conditionally_required`: If using a port other than the default port for this DBMS and if `server.address` is set.
     */
    public const val dbClientResponseReturnedRows: String = "db.client.response.returned_rows"

    /**
     * ## Description
     *
     * Measures the time taken to perform a DNS lookup
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `histogram` |
     * | Unit: | `s` |
     * | Status: | `Development`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::DNS_QUESTION_NAME`] | `Required`
     * | [`crate::attribute::ERROR_TYPE`] | `Conditionally_required`: if and only if an error has occurred.
     */
    public const val dnsLookupDuration: String = "dns.lookup.duration"

    /**
     * ## Description
     *
     * The number of .NET assemblies that are currently loaded.
     *
     * ## Notes
     *
     * Meter name: `System.Runtime`; Added in: .NET 9.0.
     * This metric reports the same values as calling [`AppDomain.CurrentDomain.GetAssemblies().Length`](https://learn.microsoft.com/dotnet/api/system.appdomain.getassemblies)
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `updowncounter` |
     * | Unit: | `{assembly}` |
     * | Status: | `Stable`  |
     */
    public const val dotnetAssemblyCount: String = "dotnet.assembly.count"

    /**
     * ## Description
     *
     * The number of exceptions that have been thrown in managed code.
     *
     * ## Notes
     *
     * Meter name: `System.Runtime`; Added in: .NET 9.0.
     * This metric reports the same values as counting calls to [`AppDomain.CurrentDomain.FirstChanceException`](https://learn.microsoft.com/dotnet/api/system.appdomain.firstchanceexception)
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `counter` |
     * | Unit: | `{exception}` |
     * | Status: | `Stable`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::ERROR_TYPE`] | `Required`
     */
    public const val dotnetExceptions: String = "dotnet.exceptions"

    /**
     * ## Description
     *
     * The number of garbage collections that have occurred since the process has started.
     *
     * ## Notes
     *
     * Meter name: `System.Runtime`; Added in: .NET 9.0.
     * This metric uses the [`GC.CollectionCount(int generation)`](https://learn.microsoft.com/dotnet/api/system.gc.collectioncount) API to calculate exclusive collections per generation
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `counter` |
     * | Unit: | `{collection}` |
     * | Status: | `Stable`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::DOTNET_GC_HEAP_GENERATION`] | `Required`
     */
    public const val dotnetGcCollections: String = "dotnet.gc.collections"

    /**
     * ## Description
     *
     * The *approximate* number of bytes allocated on the managed GC heap since the process has started. The returned value does not include any native allocations.
     *
     * ## Notes
     *
     * Meter name: `System.Runtime`; Added in: .NET 9.0.
     * This metric reports the same values as calling [`GC.GetTotalAllocatedBytes()`](https://learn.microsoft.com/dotnet/api/system.gc.gettotalallocatedbytes)
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `counter` |
     * | Unit: | `By` |
     * | Status: | `Stable`  |
     */
    public const val dotnetGcHeapTotalAllocated: String = "dotnet.gc.heap.total_allocated"

    /**
     * ## Description
     *
     * The heap fragmentation, as observed during the latest garbage collection.
     *
     * ## Notes
     *
     * Meter name: `System.Runtime`; Added in: .NET 9.0.
     * This metric reports the same values as calling [`GC.GetGCMemoryInfo().GenerationInfo.FragmentationAfterBytes`](https://learn.microsoft.com/dotnet/api/system.gcgenerationinfo.fragmentationafterbytes)
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `updowncounter` |
     * | Unit: | `By` |
     * | Status: | `Stable`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::DOTNET_GC_HEAP_GENERATION`] | `Required`
     */
    public const val dotnetGcLastCollectionHeapFragmentationSize: String = "dotnet.gc.last_collection.heap.fragmentation.size"

    /**
     * ## Description
     *
     * The managed GC heap size (including fragmentation), as observed during the latest garbage collection.
     *
     * ## Notes
     *
     * Meter name: `System.Runtime`; Added in: .NET 9.0.
     * This metric reports the same values as calling [`GC.GetGCMemoryInfo().GenerationInfo.SizeAfterBytes`](https://learn.microsoft.com/dotnet/api/system.gcgenerationinfo.sizeafterbytes)
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `updowncounter` |
     * | Unit: | `By` |
     * | Status: | `Stable`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::DOTNET_GC_HEAP_GENERATION`] | `Required`
     */
    public const val dotnetGcLastCollectionHeapSize: String = "dotnet.gc.last_collection.heap.size"

    /**
     * ## Description
     *
     * The amount of committed virtual memory in use by the .NET GC, as observed during the latest garbage collection.
     *
     * ## Notes
     *
     * Meter name: `System.Runtime`; Added in: .NET 9.0.
     * This metric reports the same values as calling [`GC.GetGCMemoryInfo().TotalCommittedBytes`](https://learn.microsoft.com/dotnet/api/system.gcmemoryinfo.totalcommittedbytes). Committed virtual memory may be larger than the heap size because it includes both memory for storing existing objects (the heap size) and some extra memory that is ready to handle newly allocated objects in the future
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `updowncounter` |
     * | Unit: | `By` |
     * | Status: | `Stable`  |
     */
    public const val dotnetGcLastCollectionMemoryCommittedSize: String = "dotnet.gc.last_collection.memory.committed_size"

    /**
     * ## Description
     *
     * The total amount of time paused in GC since the process has started.
     *
     * ## Notes
     *
     * Meter name: `System.Runtime`; Added in: .NET 9.0.
     * This metric reports the same values as calling [`GC.GetTotalPauseDuration()`](https://learn.microsoft.com/dotnet/api/system.gc.gettotalpauseduration)
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `counter` |
     * | Unit: | `s` |
     * | Status: | `Stable`  |
     */
    public const val dotnetGcPauseTime: String = "dotnet.gc.pause.time"

    /**
     * ## Description
     *
     * The amount of time the JIT compiler has spent compiling methods since the process has started.
     *
     * ## Notes
     *
     * Meter name: `System.Runtime`; Added in: .NET 9.0.
     * This metric reports the same values as calling [`JitInfo.GetCompilationTime()`](https://learn.microsoft.com/dotnet/api/system.runtime.jitinfo.getcompilationtime)
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `counter` |
     * | Unit: | `s` |
     * | Status: | `Stable`  |
     */
    public const val dotnetJitCompilationTime: String = "dotnet.jit.compilation.time"

    /**
     * ## Description
     *
     * Count of bytes of intermediate language that have been compiled since the process has started.
     *
     * ## Notes
     *
     * Meter name: `System.Runtime`; Added in: .NET 9.0.
     * This metric reports the same values as calling [`JitInfo.GetCompiledILBytes()`](https://learn.microsoft.com/dotnet/api/system.runtime.jitinfo.getcompiledilbytes)
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `counter` |
     * | Unit: | `By` |
     * | Status: | `Stable`  |
     */
    public const val dotnetJitCompiledIlSize: String = "dotnet.jit.compiled_il.size"

    /**
     * ## Description
     *
     * The number of times the JIT compiler (re)compiled methods since the process has started.
     *
     * ## Notes
     *
     * Meter name: `System.Runtime`; Added in: .NET 9.0.
     * This metric reports the same values as calling [`JitInfo.GetCompiledMethodCount()`](https://learn.microsoft.com/dotnet/api/system.runtime.jitinfo.getcompiledmethodcount)
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `counter` |
     * | Unit: | `{method}` |
     * | Status: | `Stable`  |
     */
    public const val dotnetJitCompiledMethods: String = "dotnet.jit.compiled_methods"

    /**
     * ## Description
     *
     * The number of times there was contention when trying to acquire a monitor lock since the process has started.
     *
     * ## Notes
     *
     * Meter name: `System.Runtime`; Added in: .NET 9.0.
     * This metric reports the same values as calling [`Monitor.LockContentionCount`](https://learn.microsoft.com/dotnet/api/system.threading.monitor.lockcontentioncount)
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `counter` |
     * | Unit: | `{contention}` |
     * | Status: | `Stable`  |
     */
    public const val dotnetMonitorLockContentions: String = "dotnet.monitor.lock_contentions"

    /**
     * ## Description
     *
     * The number of processors available to the process.
     *
     * ## Notes
     *
     * Meter name: `System.Runtime`; Added in: .NET 9.0.
     * This metric reports the same values as accessing [`Environment.ProcessorCount`](https://learn.microsoft.com/dotnet/api/system.environment.processorcount)
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `updowncounter` |
     * | Unit: | `{cpu}` |
     * | Status: | `Stable`  |
     */
    public const val dotnetProcessCpuCount: String = "dotnet.process.cpu.count"

    /**
     * ## Description
     *
     * CPU time used by the process.
     *
     * ## Notes
     *
     * Meter name: `System.Runtime`; Added in: .NET 9.0.
     * This metric reports the same values as accessing the corresponding processor time properties on [`System.Diagnostics.Process`](https://learn.microsoft.com/dotnet/api/system.diagnostics.process)
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `counter` |
     * | Unit: | `s` |
     * | Status: | `Stable`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::CPU_MODE`] | `Required`
     */
    public const val dotnetProcessCpuTime: String = "dotnet.process.cpu.time"

    /**
     * ## Description
     *
     * The number of bytes of physical memory mapped to the process context.
     *
     * ## Notes
     *
     * Meter name: `System.Runtime`; Added in: .NET 9.0.
     * This metric reports the same values as calling [`Environment.WorkingSet`](https://learn.microsoft.com/dotnet/api/system.environment.workingset)
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `updowncounter` |
     * | Unit: | `By` |
     * | Status: | `Stable`  |
     */
    public const val dotnetProcessMemoryWorkingSet: String = "dotnet.process.memory.working_set"

    /**
     * ## Description
     *
     * The number of work items that are currently queued to be processed by the thread pool.
     *
     * ## Notes
     *
     * Meter name: `System.Runtime`; Added in: .NET 9.0.
     * This metric reports the same values as calling [`ThreadPool.PendingWorkItemCount`](https://learn.microsoft.com/dotnet/api/system.threading.threadpool.pendingworkitemcount)
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `updowncounter` |
     * | Unit: | `{work_item}` |
     * | Status: | `Stable`  |
     */
    public const val dotnetThreadPoolQueueLength: String = "dotnet.thread_pool.queue.length"

    /**
     * ## Description
     *
     * The number of thread pool threads that currently exist.
     *
     * ## Notes
     *
     * Meter name: `System.Runtime`; Added in: .NET 9.0.
     * This metric reports the same values as calling [`ThreadPool.ThreadCount`](https://learn.microsoft.com/dotnet/api/system.threading.threadpool.threadcount)
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `updowncounter` |
     * | Unit: | `{thread}` |
     * | Status: | `Stable`  |
     */
    public const val dotnetThreadPoolThreadCount: String = "dotnet.thread_pool.thread.count"

    /**
     * ## Description
     *
     * The number of work items that the thread pool has completed since the process has started.
     *
     * ## Notes
     *
     * Meter name: `System.Runtime`; Added in: .NET 9.0.
     * This metric reports the same values as calling [`ThreadPool.CompletedWorkItemCount`](https://learn.microsoft.com/dotnet/api/system.threading.threadpool.completedworkitemcount)
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `counter` |
     * | Unit: | `{work_item}` |
     * | Status: | `Stable`  |
     */
    public const val dotnetThreadPoolWorkItemCount: String = "dotnet.thread_pool.work_item.count"

    /**
     * ## Description
     *
     * The number of timer instances that are currently active.
     *
     * ## Notes
     *
     * Meter name: `System.Runtime`; Added in: .NET 9.0.
     * This metric reports the same values as calling [`Timer.ActiveCount`](https://learn.microsoft.com/dotnet/api/system.threading.timer.activecount)
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `updowncounter` |
     * | Unit: | `{timer}` |
     * | Status: | `Stable`  |
     */
    public const val dotnetTimerCount: String = "dotnet.timer.count"

    /**
     * ## Description
     *
     * Number of invocation cold starts
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `counter` |
     * | Unit: | `{coldstart}` |
     * | Status: | `Development`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::FAAS_TRIGGER`] | `Recommended`
     */
    public const val faasColdstarts: String = "faas.coldstarts"

    /**
     * ## Description
     *
     * Distribution of CPU usage per invocation
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `histogram` |
     * | Unit: | `s` |
     * | Status: | `Development`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::FAAS_TRIGGER`] | `Recommended`
     */
    public const val faasCpuUsage: String = "faas.cpu_usage"

    /**
     * ## Description
     *
     * Number of invocation errors
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `counter` |
     * | Unit: | `{error}` |
     * | Status: | `Development`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::FAAS_TRIGGER`] | `Recommended`
     */
    public const val faasErrors: String = "faas.errors"

    /**
     * ## Description
     *
     * Measures the duration of the function's initialization, such as a cold start
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `histogram` |
     * | Unit: | `s` |
     * | Status: | `Development`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::FAAS_TRIGGER`] | `Recommended`
     */
    public const val faasInitDuration: String = "faas.init_duration"

    /**
     * ## Description
     *
     * Number of successful invocations
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `counter` |
     * | Unit: | `{invocation}` |
     * | Status: | `Development`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::FAAS_TRIGGER`] | `Recommended`
     */
    public const val faasInvocations: String = "faas.invocations"

    /**
     * ## Description
     *
     * Measures the duration of the function's logic execution
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `histogram` |
     * | Unit: | `s` |
     * | Status: | `Development`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::FAAS_TRIGGER`] | `Recommended`
     */
    public const val faasInvokeDuration: String = "faas.invoke_duration"

    /**
     * ## Description
     *
     * Distribution of max memory usage per invocation
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `histogram` |
     * | Unit: | `By` |
     * | Status: | `Development`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::FAAS_TRIGGER`] | `Recommended`
     */
    public const val faasMemUsage: String = "faas.mem_usage"

    /**
     * ## Description
     *
     * Distribution of net I/O usage per invocation
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `histogram` |
     * | Unit: | `By` |
     * | Status: | `Development`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::FAAS_TRIGGER`] | `Recommended`
     */
    public const val faasNetIo: String = "faas.net_io"

    /**
     * ## Description
     *
     * Number of invocation timeouts
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `counter` |
     * | Unit: | `{timeout}` |
     * | Status: | `Development`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::FAAS_TRIGGER`] | `Recommended`
     */
    public const val faasTimeouts: String = "faas.timeouts"

    /**
     * ## Description
     *
     * GenAI operation duration
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `histogram` |
     * | Unit: | `s` |
     * | Status: | `Development`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::ERROR_TYPE`] | `Conditionally_required`: if the operation ended in an error
     * | [`crate::attribute::GEN_AI_OPERATION_NAME`] | `Required`
     * | [`crate::attribute::GEN_AI_REQUEST_MODEL`] | `Conditionally_required`: If available.
     * | [`crate::attribute::GEN_AI_RESPONSE_MODEL`] | `Recommended`
     * | [`crate::attribute::GEN_AI_SYSTEM`] | `Required`
     * | [`crate::attribute::SERVER_ADDRESS`] | `Recommended`
     * | [`crate::attribute::SERVER_PORT`] | `Conditionally_required`: If `server.address` is set.
     */
    public const val genAiClientOperationDuration: String = "gen_ai.client.operation.duration"

    /**
     * ## Description
     *
     * Measures number of input and output tokens used
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `histogram` |
     * | Unit: | `{token}` |
     * | Status: | `Development`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::GEN_AI_OPERATION_NAME`] | `Required`
     * | [`crate::attribute::GEN_AI_REQUEST_MODEL`] | `Conditionally_required`: If available.
     * | [`crate::attribute::GEN_AI_RESPONSE_MODEL`] | `Recommended`
     * | [`crate::attribute::GEN_AI_SYSTEM`] | `Required`
     * | [`crate::attribute::GEN_AI_TOKEN_TYPE`] | `Required`
     * | [`crate::attribute::SERVER_ADDRESS`] | `Recommended`
     * | [`crate::attribute::SERVER_PORT`] | `Conditionally_required`: If `server.address` is set.
     */
    public const val genAiClientTokenUsage: String = "gen_ai.client.token.usage"

    /**
     * ## Description
     *
     * Generative AI server request duration such as time-to-last byte or last output token
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `histogram` |
     * | Unit: | `s` |
     * | Status: | `Development`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::ERROR_TYPE`] | `Conditionally_required`: if the operation ended in an error
     * | [`crate::attribute::GEN_AI_OPERATION_NAME`] | `Required`
     * | [`crate::attribute::GEN_AI_REQUEST_MODEL`] | `Conditionally_required`: If available.
     * | [`crate::attribute::GEN_AI_RESPONSE_MODEL`] | `Recommended`
     * | [`crate::attribute::GEN_AI_SYSTEM`] | `Required`
     * | [`crate::attribute::SERVER_ADDRESS`] | `Recommended`
     * | [`crate::attribute::SERVER_PORT`] | `Conditionally_required`: If `server.address` is set.
     */
    public const val genAiServerRequestDuration: String = "gen_ai.server.request.duration"

    /**
     * ## Description
     *
     * Time per output token generated after the first token for successful responses
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `histogram` |
     * | Unit: | `s` |
     * | Status: | `Development`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::GEN_AI_OPERATION_NAME`] | `Required`
     * | [`crate::attribute::GEN_AI_REQUEST_MODEL`] | `Conditionally_required`: If available.
     * | [`crate::attribute::GEN_AI_RESPONSE_MODEL`] | `Recommended`
     * | [`crate::attribute::GEN_AI_SYSTEM`] | `Required`
     * | [`crate::attribute::SERVER_ADDRESS`] | `Recommended`
     * | [`crate::attribute::SERVER_PORT`] | `Conditionally_required`: If `server.address` is set.
     */
    public const val genAiServerTimePerOutputToken: String = "gen_ai.server.time_per_output_token"

    /**
     * ## Description
     *
     * Time to generate first token for successful responses
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `histogram` |
     * | Unit: | `s` |
     * | Status: | `Development`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::GEN_AI_OPERATION_NAME`] | `Required`
     * | [`crate::attribute::GEN_AI_REQUEST_MODEL`] | `Conditionally_required`: If available.
     * | [`crate::attribute::GEN_AI_RESPONSE_MODEL`] | `Recommended`
     * | [`crate::attribute::GEN_AI_SYSTEM`] | `Required`
     * | [`crate::attribute::SERVER_ADDRESS`] | `Recommended`
     * | [`crate::attribute::SERVER_PORT`] | `Conditionally_required`: If `server.address` is set.
     */
    public const val genAiServerTimeToFirstToken: String = "gen_ai.server.time_to_first_token"

    /**
     * ## Description
     *
     * Heap size target percentage configured by the user, otherwise 100.
     *
     * ## Notes
     *
     * The value range is \\[0.0,100.0\\]. Computed from `/gc/gogc:percent`
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `updowncounter` |
     * | Unit: | `%` |
     * | Status: | `Development`  |
     */
    public const val goConfigGogc: String = "go.config.gogc"

    /**
     * ## Description
     *
     * Count of live goroutines.
     *
     * ## Notes
     *
     * Computed from `/sched/goroutines:goroutines`
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `updowncounter` |
     * | Unit: | `{goroutine}` |
     * | Status: | `Development`  |
     */
    public const val goGoroutineCount: String = "go.goroutine.count"

    /**
     * ## Description
     *
     * Memory allocated to the heap by the application.
     *
     * ## Notes
     *
     * Computed from `/gc/heap/allocs:bytes`
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `counter` |
     * | Unit: | `By` |
     * | Status: | `Development`  |
     */
    public const val goMemoryAllocated: String = "go.memory.allocated"

    /**
     * ## Description
     *
     * Count of allocations to the heap by the application.
     *
     * ## Notes
     *
     * Computed from `/gc/heap/allocs:objects`
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `counter` |
     * | Unit: | `{allocation}` |
     * | Status: | `Development`  |
     */
    public const val goMemoryAllocations: String = "go.memory.allocations"

    /**
     * ## Description
     *
     * Heap size target for the end of the GC cycle.
     *
     * ## Notes
     *
     * Computed from `/gc/heap/goal:bytes`
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `updowncounter` |
     * | Unit: | `By` |
     * | Status: | `Development`  |
     */
    public const val goMemoryGcGoal: String = "go.memory.gc.goal"

    /**
     * ## Description
     *
     * Go runtime memory limit configured by the user, if a limit exists.
     *
     * ## Notes
     *
     * Computed from `/gc/gomemlimit:bytes`. This metric is excluded if the limit obtained from the Go runtime is math.MaxInt64
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `updowncounter` |
     * | Unit: | `By` |
     * | Status: | `Development`  |
     */
    public const val goMemoryLimit: String = "go.memory.limit"

    /**
     * ## Description
     *
     * Memory used by the Go runtime.
     *
     * ## Notes
     *
     * Computed from `(/memory/classes/total:bytes - /memory/classes/heap/released:bytes)`
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `updowncounter` |
     * | Unit: | `By` |
     * | Status: | `Development`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::GO_MEMORY_TYPE`] | `Recommended`
     */
    public const val goMemoryUsed: String = "go.memory.used"

    /**
     * ## Description
     *
     * The number of OS threads that can execute user-level Go code simultaneously.
     *
     * ## Notes
     *
     * Computed from `/sched/gomaxprocs:threads`
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `updowncounter` |
     * | Unit: | `{thread}` |
     * | Status: | `Development`  |
     */
    public const val goProcessorLimit: String = "go.processor.limit"

    /**
     * ## Description
     *
     * The time goroutines have spent in the scheduler in a runnable state before actually running.
     *
     * ## Notes
     *
     * Computed from `/sched/latencies:seconds`. Bucket boundaries are provided by the runtime, and are subject to change
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `histogram` |
     * | Unit: | `s` |
     * | Status: | `Development`  |
     */
    public const val goScheduleDuration: String = "go.schedule.duration"

    /**
     * ## Description
     *
     * Number of active HTTP requests
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `updowncounter` |
     * | Unit: | `{request}` |
     * | Status: | `Development`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::HTTP_REQUEST_METHOD`] | `Recommended`
     * | [`crate::attribute::SERVER_ADDRESS`] | `Required`
     * | [`crate::attribute::SERVER_PORT`] | `Required`
     * | [`crate::attribute::URL_SCHEME`] | `Opt_in`
     * | [`crate::attribute::URL_TEMPLATE`] | `Conditionally_required`: If available.
     */
    public const val httpClientActiveRequests: String = "http.client.active_requests"

    /**
     * ## Description
     *
     * The duration of the successfully established outbound HTTP connections
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `histogram` |
     * | Unit: | `s` |
     * | Status: | `Development`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::NETWORK_PEER_ADDRESS`] | `Recommended`
     * | [`crate::attribute::NETWORK_PROTOCOL_VERSION`] | `Recommended`
     * | [`crate::attribute::SERVER_ADDRESS`] | `Required`
     * | [`crate::attribute::SERVER_PORT`] | `Required`
     * | [`crate::attribute::URL_SCHEME`] | `Opt_in`
     */
    public const val httpClientConnectionDuration: String = "http.client.connection.duration"

    /**
     * ## Description
     *
     * Number of outbound HTTP connections that are currently active or idle on the client
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `updowncounter` |
     * | Unit: | `{connection}` |
     * | Status: | `Development`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::HTTP_CONNECTION_STATE`] | `Required`
     * | [`crate::attribute::NETWORK_PEER_ADDRESS`] | `Recommended`
     * | [`crate::attribute::NETWORK_PROTOCOL_VERSION`] | `Recommended`
     * | [`crate::attribute::SERVER_ADDRESS`] | `Required`
     * | [`crate::attribute::SERVER_PORT`] | `Required`
     * | [`crate::attribute::URL_SCHEME`] | `Opt_in`
     */
    public const val httpClientOpenConnections: String = "http.client.open_connections"

    /**
     * ## Description
     *
     * Size of HTTP client request bodies.
     *
     * ## Notes
     *
     * The size of the request payload body in bytes. This is the number of bytes transferred excluding headers and is often, but not always, present as the [Content-Length](https://www.rfc-editor.org/rfc/rfc9110.html#field.content-length) header. For requests using transport encoding, this should be the compressed size
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `histogram` |
     * | Unit: | `By` |
     * | Status: | `Development`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::ERROR_TYPE`] | `Conditionally_required`: If request has ended with an error.
     * | [`crate::attribute::HTTP_REQUEST_METHOD`] | `Required`
     * | [`crate::attribute::HTTP_RESPONSE_STATUS_CODE`] | `Conditionally_required`: If and only if one was received/sent.
     * | [`crate::attribute::NETWORK_PROTOCOL_NAME`] | `Conditionally_required`: If not `http` and `network.protocol.version` is set.
     * | [`crate::attribute::NETWORK_PROTOCOL_VERSION`] | `Recommended`
     * | [`crate::attribute::SERVER_ADDRESS`] | `Required`
     * | [`crate::attribute::SERVER_PORT`] | `Required`
     * | [`crate::attribute::URL_SCHEME`] | `Opt_in`
     * | [`crate::attribute::URL_TEMPLATE`] | `Conditionally_required`: If available.
     */
    public const val httpClientRequestBodySize: String = "http.client.request.body.size"

    /**
     * ## Description
     *
     * Duration of HTTP client requests
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `histogram` |
     * | Unit: | `s` |
     * | Status: | `Stable`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::ERROR_TYPE`] | `Conditionally_required`: If request has ended with an error.
     * | [`crate::attribute::HTTP_REQUEST_METHOD`] | `Required`
     * | [`crate::attribute::HTTP_RESPONSE_STATUS_CODE`] | `Conditionally_required`: If and only if one was received/sent.
     * | [`crate::attribute::NETWORK_PROTOCOL_NAME`] | `Conditionally_required`: If not `http` and `network.protocol.version` is set.
     * | [`crate::attribute::NETWORK_PROTOCOL_VERSION`] | `Recommended`
     * | [`crate::attribute::SERVER_ADDRESS`] | `Required`
     * | [`crate::attribute::SERVER_PORT`] | `Required`
     * | [`crate::attribute::URL_SCHEME`] | `Opt_in`
     * | [`crate::attribute::URL_TEMPLATE`] | `Opt_in`
     */
    public const val httpClientRequestDuration: String = "http.client.request.duration"

    /**
     * ## Description
     *
     * Size of HTTP client response bodies.
     *
     * ## Notes
     *
     * The size of the response payload body in bytes. This is the number of bytes transferred excluding headers and is often, but not always, present as the [Content-Length](https://www.rfc-editor.org/rfc/rfc9110.html#field.content-length) header. For requests using transport encoding, this should be the compressed size
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `histogram` |
     * | Unit: | `By` |
     * | Status: | `Development`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::ERROR_TYPE`] | `Conditionally_required`: If request has ended with an error.
     * | [`crate::attribute::HTTP_REQUEST_METHOD`] | `Required`
     * | [`crate::attribute::HTTP_RESPONSE_STATUS_CODE`] | `Conditionally_required`: If and only if one was received/sent.
     * | [`crate::attribute::NETWORK_PROTOCOL_NAME`] | `Conditionally_required`: If not `http` and `network.protocol.version` is set.
     * | [`crate::attribute::NETWORK_PROTOCOL_VERSION`] | `Recommended`
     * | [`crate::attribute::SERVER_ADDRESS`] | `Required`
     * | [`crate::attribute::SERVER_PORT`] | `Required`
     * | [`crate::attribute::URL_SCHEME`] | `Opt_in`
     * | [`crate::attribute::URL_TEMPLATE`] | `Conditionally_required`: If available.
     */
    public const val httpClientResponseBodySize: String = "http.client.response.body.size"

    /**
     * ## Description
     *
     * Number of active HTTP server requests
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `updowncounter` |
     * | Unit: | `{request}` |
     * | Status: | `Development`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::HTTP_REQUEST_METHOD`] | `Required`
     * | [`crate::attribute::SERVER_ADDRESS`] | `Opt_in`
     * | [`crate::attribute::SERVER_PORT`] | `Opt_in`
     * | [`crate::attribute::URL_SCHEME`] | `Required`
     */
    public const val httpServerActiveRequests: String = "http.server.active_requests"

    /**
     * ## Description
     *
     * Size of HTTP server request bodies.
     *
     * ## Notes
     *
     * The size of the request payload body in bytes. This is the number of bytes transferred excluding headers and is often, but not always, present as the [Content-Length](https://www.rfc-editor.org/rfc/rfc9110.html#field.content-length) header. For requests using transport encoding, this should be the compressed size
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `histogram` |
     * | Unit: | `By` |
     * | Status: | `Development`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::ERROR_TYPE`] | `Conditionally_required`: If request has ended with an error.
     * | [`crate::attribute::HTTP_REQUEST_METHOD`] | `Required`
     * | [`crate::attribute::HTTP_RESPONSE_STATUS_CODE`] | `Conditionally_required`: If and only if one was received/sent.
     * | [`crate::attribute::HTTP_ROUTE`] | `Conditionally_required`: If and only if it's available
     * | [`crate::attribute::NETWORK_PROTOCOL_NAME`] | `Conditionally_required`: If not `http` and `network.protocol.version` is set.
     * | [`crate::attribute::NETWORK_PROTOCOL_VERSION`] | `Recommended`
     * | [`crate::attribute::SERVER_ADDRESS`] | `Opt_in`
     * | [`crate::attribute::SERVER_PORT`] | `Opt_in`
     * | [`crate::attribute::URL_SCHEME`] | `Required`
     * | [`crate::attribute::USER_AGENT_SYNTHETIC_TYPE`] | `Opt_in`
     */
    public const val httpServerRequestBodySize: String = "http.server.request.body.size"

    /**
     * ## Description
     *
     * Duration of HTTP server requests
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `histogram` |
     * | Unit: | `s` |
     * | Status: | `Stable`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::ERROR_TYPE`] | `Conditionally_required`: If request has ended with an error.
     * | [`crate::attribute::HTTP_REQUEST_METHOD`] | `Required`
     * | [`crate::attribute::HTTP_RESPONSE_STATUS_CODE`] | `Conditionally_required`: If and only if one was received/sent.
     * | [`crate::attribute::HTTP_ROUTE`] | `Conditionally_required`: If and only if it's available
     * | [`crate::attribute::NETWORK_PROTOCOL_NAME`] | `Conditionally_required`: If not `http` and `network.protocol.version` is set.
     * | [`crate::attribute::NETWORK_PROTOCOL_VERSION`] | `Recommended`
     * | [`crate::attribute::SERVER_ADDRESS`] | `Opt_in`
     * | [`crate::attribute::SERVER_PORT`] | `Opt_in`
     * | [`crate::attribute::URL_SCHEME`] | `Required`
     * | [`crate::attribute::USER_AGENT_SYNTHETIC_TYPE`] | `Opt_in`
     */
    public const val httpServerRequestDuration: String = "http.server.request.duration"

    /**
     * ## Description
     *
     * Size of HTTP server response bodies.
     *
     * ## Notes
     *
     * The size of the response payload body in bytes. This is the number of bytes transferred excluding headers and is often, but not always, present as the [Content-Length](https://www.rfc-editor.org/rfc/rfc9110.html#field.content-length) header. For requests using transport encoding, this should be the compressed size
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `histogram` |
     * | Unit: | `By` |
     * | Status: | `Development`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::ERROR_TYPE`] | `Conditionally_required`: If request has ended with an error.
     * | [`crate::attribute::HTTP_REQUEST_METHOD`] | `Required`
     * | [`crate::attribute::HTTP_RESPONSE_STATUS_CODE`] | `Conditionally_required`: If and only if one was received/sent.
     * | [`crate::attribute::HTTP_ROUTE`] | `Conditionally_required`: If and only if it's available
     * | [`crate::attribute::NETWORK_PROTOCOL_NAME`] | `Conditionally_required`: If not `http` and `network.protocol.version` is set.
     * | [`crate::attribute::NETWORK_PROTOCOL_VERSION`] | `Recommended`
     * | [`crate::attribute::SERVER_ADDRESS`] | `Opt_in`
     * | [`crate::attribute::SERVER_PORT`] | `Opt_in`
     * | [`crate::attribute::URL_SCHEME`] | `Required`
     * | [`crate::attribute::USER_AGENT_SYNTHETIC_TYPE`] | `Opt_in`
     */
    public const val httpServerResponseBodySize: String = "http.server.response.body.size"

    /**
     * ## Description
     *
     * Energy consumed by the component
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `counter` |
     * | Unit: | `J` |
     * | Status: | `Development`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::HW_ID`] | `Required`
     * | [`crate::attribute::HW_NAME`] | `Recommended`
     * | [`crate::attribute::HW_PARENT`] | `Recommended`
     * | [`crate::attribute::HW_TYPE`] | `Required`
     */
    public const val hwEnergy: String = "hw.energy"

    /**
     * ## Description
     *
     * Number of errors encountered by the component
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `counter` |
     * | Unit: | `{error}` |
     * | Status: | `Development`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::ERROR_TYPE`] | `Conditionally_required`: if and only if an error has occurred
     * | [`crate::attribute::HW_ID`] | `Required`
     * | [`crate::attribute::HW_NAME`] | `Recommended`
     * | [`crate::attribute::HW_PARENT`] | `Recommended`
     * | [`crate::attribute::HW_TYPE`] | `Required`
     */
    public const val hwErrors: String = "hw.errors"

    /**
     * ## Description
     *
     * Ambient (external) temperature of the physical host
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `gauge` |
     * | Unit: | `Cel` |
     * | Status: | `Development`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::HW_ID`] | `Required`
     * | [`crate::attribute::HW_NAME`] | `Recommended`
     * | [`crate::attribute::HW_PARENT`] | `Recommended`
     */
    public const val hwHostAmbientTemperature: String = "hw.host.ambient_temperature"

    /**
     * ## Description
     *
     * Total energy consumed by the entire physical host, in joules
     *
     * ## Notes
     *
     * The overall energy usage of a host MUST be reported using the specific `hw.host.energy` and `hw.host.power` metrics **only**, instead of the generic `hw.energy` and `hw.power` described in the previous section, to prevent summing up overlapping values
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `counter` |
     * | Unit: | `J` |
     * | Status: | `Development`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::HW_ID`] | `Required`
     * | [`crate::attribute::HW_NAME`] | `Recommended`
     * | [`crate::attribute::HW_PARENT`] | `Recommended`
     */
    public const val hwHostEnergy: String = "hw.host.energy"

    /**
     * ## Description
     *
     * By how many degrees Celsius the temperature of the physical host can be increased, before reaching a warning threshold on one of the internal sensors
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `gauge` |
     * | Unit: | `Cel` |
     * | Status: | `Development`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::HW_ID`] | `Required`
     * | [`crate::attribute::HW_NAME`] | `Recommended`
     * | [`crate::attribute::HW_PARENT`] | `Recommended`
     */
    public const val hwHostHeatingMargin: String = "hw.host.heating_margin"

    /**
     * ## Description
     *
     * Instantaneous power consumed by the entire physical host in Watts (`hw.host.energy` is preferred)
     *
     * ## Notes
     *
     * The overall energy usage of a host MUST be reported using the specific `hw.host.energy` and `hw.host.power` metrics **only**, instead of the generic `hw.energy` and `hw.power` described in the previous section, to prevent summing up overlapping values
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `gauge` |
     * | Unit: | `W` |
     * | Status: | `Development`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::HW_ID`] | `Required`
     * | [`crate::attribute::HW_NAME`] | `Recommended`
     * | [`crate::attribute::HW_PARENT`] | `Recommended`
     */
    public const val hwHostPower: String = "hw.host.power"

    /**
     * ## Description
     *
     * Instantaneous power consumed by the component
     *
     * ## Notes
     *
     * It is recommended to report `hw.energy` instead of `hw.power` when possible
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `gauge` |
     * | Unit: | `W` |
     * | Status: | `Development`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::HW_ID`] | `Required`
     * | [`crate::attribute::HW_NAME`] | `Recommended`
     * | [`crate::attribute::HW_PARENT`] | `Recommended`
     * | [`crate::attribute::HW_TYPE`] | `Required`
     */
    public const val hwPower: String = "hw.power"

    /**
     * ## Description
     *
     * Operational status: `1` (true) or `0` (false) for each of the possible states
     *
     * ## Notes
     *
     * `hw.status` is currently specified as an *UpDownCounter* but would ideally be represented using a [*StateSet* as defined in OpenMetrics](https://github.com/prometheus/OpenMetrics/blob/v1.0.0/specification/OpenMetrics.md#stateset). This semantic convention will be updated once *StateSet* is specified in OpenTelemetry. This planned change is not expected to have any consequence on the way users query their timeseries backend to retrieve the values of `hw.status` over time
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `updowncounter` |
     * | Unit: | `1` |
     * | Status: | `Development`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::HW_ID`] | `Required`
     * | [`crate::attribute::HW_NAME`] | `Recommended`
     * | [`crate::attribute::HW_PARENT`] | `Recommended`
     * | [`crate::attribute::HW_STATE`] | `Required`
     * | [`crate::attribute::HW_TYPE`] | `Required`
     */
    public const val hwStatus: String = "hw.status"

    /**
     * ## Description
     *
     * Number of buffers in the pool
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `updowncounter` |
     * | Unit: | `{buffer}` |
     * | Status: | `Development`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::JVM_BUFFER_POOL_NAME`] | `Recommended`
     */
    public const val jvmBufferCount: String = "jvm.buffer.count"

    /**
     * ## Description
     *
     * Measure of total memory capacity of buffers
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `updowncounter` |
     * | Unit: | `By` |
     * | Status: | `Development`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::JVM_BUFFER_POOL_NAME`] | `Recommended`
     */
    public const val jvmBufferMemoryLimit: String = "jvm.buffer.memory.limit"

    /**
     * ## Description
     *
     * Deprecated, use `jvm.buffer.memory.used` instead
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `updowncounter` |
     * | Unit: | `By` |
     * | Status: | `Development`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::JVM_BUFFER_POOL_NAME`] | `Recommended`
     */
    @Deprecated("{note: Replaced by `jvm.buffer.memory.used`., reason: renamed, renamed_to: jvm.buffer.memory.used}")
    public const val jvmBufferMemoryUsage: String = "jvm.buffer.memory.usage"

    /**
     * ## Description
     *
     * Measure of memory used by buffers
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `updowncounter` |
     * | Unit: | `By` |
     * | Status: | `Development`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::JVM_BUFFER_POOL_NAME`] | `Recommended`
     */
    public const val jvmBufferMemoryUsed: String = "jvm.buffer.memory.used"

    /**
     * ## Description
     *
     * Number of classes currently loaded
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `updowncounter` |
     * | Unit: | `{class}` |
     * | Status: | `Stable`  |
     */
    public const val jvmClassCount: String = "jvm.class.count"

    /**
     * ## Description
     *
     * Number of classes loaded since JVM start
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `counter` |
     * | Unit: | `{class}` |
     * | Status: | `Stable`  |
     */
    public const val jvmClassLoaded: String = "jvm.class.loaded"

    /**
     * ## Description
     *
     * Number of classes unloaded since JVM start
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `counter` |
     * | Unit: | `{class}` |
     * | Status: | `Stable`  |
     */
    public const val jvmClassUnloaded: String = "jvm.class.unloaded"

    /**
     * ## Description
     *
     * Number of processors available to the Java virtual machine
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `updowncounter` |
     * | Unit: | `{cpu}` |
     * | Status: | `Stable`  |
     */
    public const val jvmCpuCount: String = "jvm.cpu.count"

    /**
     * ## Description
     *
     * Recent CPU utilization for the process as reported by the JVM.
     *
     * ## Notes
     *
     * The value range is \\[0.0,1.0\\]. This utilization is not defined as being for the specific interval since last measurement (unlike `system.cpu.utilization`). [Reference](https://docs.oracle.com/en/java/javase/17/docs/api/jdk.management/com/sun/management/OperatingSystemMXBean.html#getProcessCpuLoad())
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `gauge` |
     * | Unit: | `1` |
     * | Status: | `Stable`  |
     */
    public const val jvmCpuRecentUtilization: String = "jvm.cpu.recent_utilization"

    /**
     * ## Description
     *
     * CPU time used by the process as reported by the JVM
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `counter` |
     * | Unit: | `s` |
     * | Status: | `Stable`  |
     */
    public const val jvmCpuTime: String = "jvm.cpu.time"

    /**
     * ## Description
     *
     * Number of open file descriptors as reported by the JVM
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `updowncounter` |
     * | Unit: | `{file_descriptor}` |
     * | Status: | `Development`  |
     */
    public const val jvmFileDescriptorCount: String = "jvm.file_descriptor.count"

    /**
     * ## Description
     *
     * Duration of JVM garbage collection actions
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `histogram` |
     * | Unit: | `s` |
     * | Status: | `Stable`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::JVM_GC_ACTION`] | `Recommended`
     * | [`crate::attribute::JVM_GC_CAUSE`] | `Opt_in`
     * | [`crate::attribute::JVM_GC_NAME`] | `Recommended`
     */
    public const val jvmGcDuration: String = "jvm.gc.duration"

    /**
     * ## Description
     *
     * Measure of memory committed
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `updowncounter` |
     * | Unit: | `By` |
     * | Status: | `Stable`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::JVM_MEMORY_POOL_NAME`] | `Recommended`
     * | [`crate::attribute::JVM_MEMORY_TYPE`] | `Recommended`
     */
    public const val jvmMemoryCommitted: String = "jvm.memory.committed"

    /**
     * ## Description
     *
     * Measure of initial memory requested
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `updowncounter` |
     * | Unit: | `By` |
     * | Status: | `Development`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::JVM_MEMORY_POOL_NAME`] | `Recommended`
     * | [`crate::attribute::JVM_MEMORY_TYPE`] | `Recommended`
     */
    public const val jvmMemoryInit: String = "jvm.memory.init"

    /**
     * ## Description
     *
     * Measure of max obtainable memory
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `updowncounter` |
     * | Unit: | `By` |
     * | Status: | `Stable`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::JVM_MEMORY_POOL_NAME`] | `Recommended`
     * | [`crate::attribute::JVM_MEMORY_TYPE`] | `Recommended`
     */
    public const val jvmMemoryLimit: String = "jvm.memory.limit"

    /**
     * ## Description
     *
     * Measure of memory used
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `updowncounter` |
     * | Unit: | `By` |
     * | Status: | `Stable`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::JVM_MEMORY_POOL_NAME`] | `Recommended`
     * | [`crate::attribute::JVM_MEMORY_TYPE`] | `Recommended`
     */
    public const val jvmMemoryUsed: String = "jvm.memory.used"

    /**
     * ## Description
     *
     * Measure of memory used, as measured after the most recent garbage collection event on this pool
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `updowncounter` |
     * | Unit: | `By` |
     * | Status: | `Stable`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::JVM_MEMORY_POOL_NAME`] | `Recommended`
     * | [`crate::attribute::JVM_MEMORY_TYPE`] | `Recommended`
     */
    public const val jvmMemoryUsedAfterLastGc: String = "jvm.memory.used_after_last_gc"

    /**
     * ## Description
     *
     * Average CPU load of the whole system for the last minute as reported by the JVM.
     *
     * ## Notes
     *
     * The value range is \\[0,n\\], where n is the number of CPU cores - or a negative number if the value is not available. This utilization is not defined as being for the specific interval since last measurement (unlike `system.cpu.utilization`). [Reference](https://docs.oracle.com/en/java/javase/17/docs/api/java.management/java/lang/management/OperatingSystemMXBean.html#getSystemLoadAverage())
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `gauge` |
     * | Unit: | `{run_queue_item}` |
     * | Status: | `Development`  |
     */
    public const val jvmSystemCpuLoad1m: String = "jvm.system.cpu.load_1m"

    /**
     * ## Description
     *
     * Recent CPU utilization for the whole system as reported by the JVM.
     *
     * ## Notes
     *
     * The value range is \\[0.0,1.0\\]. This utilization is not defined as being for the specific interval since last measurement (unlike `system.cpu.utilization`). [Reference](https://docs.oracle.com/en/java/javase/17/docs/api/jdk.management/com/sun/management/OperatingSystemMXBean.html#getCpuLoad())
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `gauge` |
     * | Unit: | `1` |
     * | Status: | `Development`  |
     */
    public const val jvmSystemCpuUtilization: String = "jvm.system.cpu.utilization"

    /**
     * ## Description
     *
     * Number of executing platform threads
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `updowncounter` |
     * | Unit: | `{thread}` |
     * | Status: | `Stable`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::JVM_THREAD_DAEMON`] | `Recommended`
     * | [`crate::attribute::JVM_THREAD_STATE`] | `Recommended`
     */
    public const val jvmThreadCount: String = "jvm.thread.count"

    /**
     * ## Description
     *
     * Maximum CPU resource limit set for the container
     *
     * ## Notes
     *
     * See <https://kubernetes.io/docs/reference/generated/kubernetes-api/v1.30/#resourcerequirements-v1-core> for details
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `updowncounter` |
     * | Unit: | `{cpu}` |
     * | Status: | `Development`  |
     */
    public const val k8sContainerCpuLimit: String = "k8s.container.cpu.limit"

    /**
     * ## Description
     *
     * CPU resource requested for the container
     *
     * ## Notes
     *
     * See <https://kubernetes.io/docs/reference/generated/kubernetes-api/v1.30/#resourcerequirements-v1-core> for details
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `updowncounter` |
     * | Unit: | `{cpu}` |
     * | Status: | `Development`  |
     */
    public const val k8sContainerCpuRequest: String = "k8s.container.cpu.request"

    /**
     * ## Description
     *
     * Maximum ephemeral storage resource limit set for the container
     *
     * ## Notes
     *
     * See <https://kubernetes.io/docs/reference/generated/kubernetes-api/v1.30/#resourcerequirements-v1-core> for details
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `updowncounter` |
     * | Unit: | `By` |
     * | Status: | `Development`  |
     */
    public const val k8sContainerEphemeralStorageLimit: String = "k8s.container.ephemeral_storage.limit"

    /**
     * ## Description
     *
     * Ephemeral storage resource requested for the container
     *
     * ## Notes
     *
     * See <https://kubernetes.io/docs/reference/generated/kubernetes-api/v1.30/#resourcerequirements-v1-core> for details
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `updowncounter` |
     * | Unit: | `By` |
     * | Status: | `Development`  |
     */
    public const val k8sContainerEphemeralStorageRequest: String = "k8s.container.ephemeral_storage.request"

    /**
     * ## Description
     *
     * Maximum memory resource limit set for the container
     *
     * ## Notes
     *
     * See <https://kubernetes.io/docs/reference/generated/kubernetes-api/v1.30/#resourcerequirements-v1-core> for details
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `updowncounter` |
     * | Unit: | `By` |
     * | Status: | `Development`  |
     */
    public const val k8sContainerMemoryLimit: String = "k8s.container.memory.limit"

    /**
     * ## Description
     *
     * Memory resource requested for the container
     *
     * ## Notes
     *
     * See <https://kubernetes.io/docs/reference/generated/kubernetes-api/v1.30/#resourcerequirements-v1-core> for details
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `updowncounter` |
     * | Unit: | `By` |
     * | Status: | `Development`  |
     */
    public const val k8sContainerMemoryRequest: String = "k8s.container.memory.request"

    /**
     * ## Description
     *
     * Indicates whether the container is currently marked as ready to accept traffic, based on its readiness probe (1 = ready, 0 = not ready)
     *
     * ## Notes
     *
     * This metric SHOULD reflect the value of the `ready` field in the
     * [K8s ContainerStatus](https://kubernetes.io/docs/reference/generated/kubernetes-api/v1.30/#containerstatus-v1-core)
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `updowncounter` |
     * | Unit: | `{container}` |
     * | Status: | `Development`  |
     */
    public const val k8sContainerReady: String = "k8s.container.ready"

    /**
     * ## Description
     *
     * Describes how many times the container has restarted (since the last counter reset)
     *
     * ## Notes
     *
     * This value is pulled directly from the K8s API and the value can go indefinitely high and be reset to 0
     * at any time depending on how your kubelet is configured to prune dead containers.
     * It is best to not depend too much on the exact value but rather look at it as
     * either == 0, in which case you can conclude there were no restarts in the recent past, or > 0, in which case
     * you can conclude there were restarts in the recent past, and not try and analyze the value beyond that
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `updowncounter` |
     * | Unit: | `{restart}` |
     * | Status: | `Development`  |
     */
    public const val k8sContainerRestartCount: String = "k8s.container.restart.count"

    /**
     * ## Description
     *
     * Describes the number of K8s containers that are currently in a state for a given reason
     *
     * ## Notes
     *
     * All possible container state reasons will be reported at each time interval to avoid missing metrics.
     * Only the value corresponding to the current state reason will be non-zero
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `updowncounter` |
     * | Unit: | `{container}` |
     * | Status: | `Development`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::K8S_CONTAINER_STATUS_REASON`] | `Required`
     */
    public const val k8sContainerStatusReason: String = "k8s.container.status.reason"

    /**
     * ## Description
     *
     * Describes the number of K8s containers that are currently in a given state
     *
     * ## Notes
     *
     * All possible container states will be reported at each time interval to avoid missing metrics.
     * Only the value corresponding to the current state will be non-zero
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `updowncounter` |
     * | Unit: | `{container}` |
     * | Status: | `Development`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::K8S_CONTAINER_STATUS_STATE`] | `Required`
     */
    public const val k8sContainerStatusState: String = "k8s.container.status.state"

    /**
     * ## Description
     *
     * Maximum storage resource limit set for the container
     *
     * ## Notes
     *
     * See <https://kubernetes.io/docs/reference/generated/kubernetes-api/v1.30/#resourcerequirements-v1-core> for details
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `updowncounter` |
     * | Unit: | `By` |
     * | Status: | `Development`  |
     */
    public const val k8sContainerStorageLimit: String = "k8s.container.storage.limit"

    /**
     * ## Description
     *
     * Storage resource requested for the container
     *
     * ## Notes
     *
     * See <https://kubernetes.io/docs/reference/generated/kubernetes-api/v1.30/#resourcerequirements-v1-core> for details
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `updowncounter` |
     * | Unit: | `By` |
     * | Status: | `Development`  |
     */
    public const val k8sContainerStorageRequest: String = "k8s.container.storage.request"

    /**
     * ## Description
     *
     * The number of actively running jobs for a cronjob
     *
     * ## Notes
     *
     * This metric aligns with the `active` field of the
     * [K8s CronJobStatus](https://kubernetes.io/docs/reference/generated/kubernetes-api/v1.30/#cronjobstatus-v1-batch)
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `updowncounter` |
     * | Unit: | `{job}` |
     * | Status: | `Development`  |
     */
    public const val k8sCronjobActiveJobs: String = "k8s.cronjob.active_jobs"

    /**
     * ## Description
     *
     * Number of nodes that are running at least 1 daemon pod and are supposed to run the daemon pod
     *
     * ## Notes
     *
     * This metric aligns with the `currentNumberScheduled` field of the
     * [K8s DaemonSetStatus](https://kubernetes.io/docs/reference/generated/kubernetes-api/v1.30/#daemonsetstatus-v1-apps)
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `updowncounter` |
     * | Unit: | `{node}` |
     * | Status: | `Development`  |
     */
    public const val k8sDaemonsetCurrentScheduledNodes: String = "k8s.daemonset.current_scheduled_nodes"

    /**
     * ## Description
     *
     * Number of nodes that should be running the daemon pod (including nodes currently running the daemon pod)
     *
     * ## Notes
     *
     * This metric aligns with the `desiredNumberScheduled` field of the
     * [K8s DaemonSetStatus](https://kubernetes.io/docs/reference/generated/kubernetes-api/v1.30/#daemonsetstatus-v1-apps)
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `updowncounter` |
     * | Unit: | `{node}` |
     * | Status: | `Development`  |
     */
    public const val k8sDaemonsetDesiredScheduledNodes: String = "k8s.daemonset.desired_scheduled_nodes"

    /**
     * ## Description
     *
     * Number of nodes that are running the daemon pod, but are not supposed to run the daemon pod
     *
     * ## Notes
     *
     * This metric aligns with the `numberMisscheduled` field of the
     * [K8s DaemonSetStatus](https://kubernetes.io/docs/reference/generated/kubernetes-api/v1.30/#daemonsetstatus-v1-apps)
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `updowncounter` |
     * | Unit: | `{node}` |
     * | Status: | `Development`  |
     */
    public const val k8sDaemonsetMisscheduledNodes: String = "k8s.daemonset.misscheduled_nodes"

    /**
     * ## Description
     *
     * Number of nodes that should be running the daemon pod and have one or more of the daemon pod running and ready
     *
     * ## Notes
     *
     * This metric aligns with the `numberReady` field of the
     * [K8s DaemonSetStatus](https://kubernetes.io/docs/reference/generated/kubernetes-api/v1.30/#daemonsetstatus-v1-apps)
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `updowncounter` |
     * | Unit: | `{node}` |
     * | Status: | `Development`  |
     */
    public const val k8sDaemonsetReadyNodes: String = "k8s.daemonset.ready_nodes"

    /**
     * ## Description
     *
     * Total number of available replica pods (ready for at least minReadySeconds) targeted by this deployment
     *
     * ## Notes
     *
     * This metric aligns with the `availableReplicas` field of the
     * [K8s DeploymentStatus](https://kubernetes.io/docs/reference/generated/kubernetes-api/v1.30/#deploymentstatus-v1-apps)
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `updowncounter` |
     * | Unit: | `{pod}` |
     * | Status: | `Development`  |
     */
    public const val k8sDeploymentAvailablePods: String = "k8s.deployment.available_pods"

    /**
     * ## Description
     *
     * Number of desired replica pods in this deployment
     *
     * ## Notes
     *
     * This metric aligns with the `replicas` field of the
     * [K8s DeploymentSpec](https://kubernetes.io/docs/reference/generated/kubernetes-api/v1.30/#deploymentspec-v1-apps)
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `updowncounter` |
     * | Unit: | `{pod}` |
     * | Status: | `Development`  |
     */
    public const val k8sDeploymentDesiredPods: String = "k8s.deployment.desired_pods"

    /**
     * ## Description
     *
     * Current number of replica pods managed by this horizontal pod autoscaler, as last seen by the autoscaler
     *
     * ## Notes
     *
     * This metric aligns with the `currentReplicas` field of the
     * [K8s HorizontalPodAutoscalerStatus](https://kubernetes.io/docs/reference/generated/kubernetes-api/v1.30/#horizontalpodautoscalerstatus-v2-autoscaling)
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `updowncounter` |
     * | Unit: | `{pod}` |
     * | Status: | `Development`  |
     */
    public const val k8sHpaCurrentPods: String = "k8s.hpa.current_pods"

    /**
     * ## Description
     *
     * Desired number of replica pods managed by this horizontal pod autoscaler, as last calculated by the autoscaler
     *
     * ## Notes
     *
     * This metric aligns with the `desiredReplicas` field of the
     * [K8s HorizontalPodAutoscalerStatus](https://kubernetes.io/docs/reference/generated/kubernetes-api/v1.30/#horizontalpodautoscalerstatus-v2-autoscaling)
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `updowncounter` |
     * | Unit: | `{pod}` |
     * | Status: | `Development`  |
     */
    public const val k8sHpaDesiredPods: String = "k8s.hpa.desired_pods"

    /**
     * ## Description
     *
     * The upper limit for the number of replica pods to which the autoscaler can scale up
     *
     * ## Notes
     *
     * This metric aligns with the `maxReplicas` field of the
     * [K8s HorizontalPodAutoscalerSpec](https://kubernetes.io/docs/reference/generated/kubernetes-api/v1.30/#horizontalpodautoscalerspec-v2-autoscaling)
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `updowncounter` |
     * | Unit: | `{pod}` |
     * | Status: | `Development`  |
     */
    public const val k8sHpaMaxPods: String = "k8s.hpa.max_pods"

    /**
     * ## Description
     *
     * Target average utilization, in percentage, for CPU resource in HPA config.
     *
     * ## Notes
     *
     * This metric aligns with the `averageUtilization` field of the
     * [K8s HPA MetricTarget](https://kubernetes.io/docs/reference/generated/kubernetes-api/v1.30/#metrictarget-v2-autoscaling).
     * If the type of the metric is [`ContainerResource`](https://kubernetes.io/docs/tasks/run-application/horizontal-pod-autoscale/#support-for-metrics-apis),
     * the `k8s.container.name` attribute MUST be set to identify the specific container within the pod to which the metric applies
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `gauge` |
     * | Unit: | `1` |
     * | Status: | `Development`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::K8S_CONTAINER_NAME`] | `Conditionally_required`: if and only if k8s.hpa.metric.type is ContainerResource.
     * | [`crate::attribute::K8S_HPA_METRIC_TYPE`] | `Recommended`
     */
    public const val k8sHpaMetricTargetCpuAverageUtilization: String = "k8s.hpa.metric.target.cpu.average_utilization"

    /**
     * ## Description
     *
     * Target average value for CPU resource in HPA config.
     *
     * ## Notes
     *
     * This metric aligns with the `averageValue` field of the
     * [K8s HPA MetricTarget](https://kubernetes.io/docs/reference/generated/kubernetes-api/v1.30/#metrictarget-v2-autoscaling).
     * If the type of the metric is [`ContainerResource`](https://kubernetes.io/docs/tasks/run-application/horizontal-pod-autoscale/#support-for-metrics-apis),
     * the `k8s.container.name` attribute MUST be set to identify the specific container within the pod to which the metric applies
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `gauge` |
     * | Unit: | `{cpu}` |
     * | Status: | `Development`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::K8S_CONTAINER_NAME`] | `Conditionally_required`: if and only if k8s.hpa.metric.type is ContainerResource
     * | [`crate::attribute::K8S_HPA_METRIC_TYPE`] | `Recommended`
     */
    public const val k8sHpaMetricTargetCpuAverageValue: String = "k8s.hpa.metric.target.cpu.average_value"

    /**
     * ## Description
     *
     * Target value for CPU resource in HPA config.
     *
     * ## Notes
     *
     * This metric aligns with the `value` field of the
     * [K8s HPA MetricTarget](https://kubernetes.io/docs/reference/generated/kubernetes-api/v1.30/#metrictarget-v2-autoscaling).
     * If the type of the metric is [`ContainerResource`](https://kubernetes.io/docs/tasks/run-application/horizontal-pod-autoscale/#support-for-metrics-apis),
     * the `k8s.container.name` attribute MUST be set to identify the specific container within the pod to which the metric applies
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `gauge` |
     * | Unit: | `{cpu}` |
     * | Status: | `Development`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::K8S_CONTAINER_NAME`] | `Conditionally_required`: if and only if k8s.hpa.metric.type is ContainerResource
     * | [`crate::attribute::K8S_HPA_METRIC_TYPE`] | `Recommended`
     */
    public const val k8sHpaMetricTargetCpuValue: String = "k8s.hpa.metric.target.cpu.value"

    /**
     * ## Description
     *
     * The lower limit for the number of replica pods to which the autoscaler can scale down
     *
     * ## Notes
     *
     * This metric aligns with the `minReplicas` field of the
     * [K8s HorizontalPodAutoscalerSpec](https://kubernetes.io/docs/reference/generated/kubernetes-api/v1.30/#horizontalpodautoscalerspec-v2-autoscaling)
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `updowncounter` |
     * | Unit: | `{pod}` |
     * | Status: | `Development`  |
     */
    public const val k8sHpaMinPods: String = "k8s.hpa.min_pods"

    /**
     * ## Description
     *
     * The number of pending and actively running pods for a job
     *
     * ## Notes
     *
     * This metric aligns with the `active` field of the
     * [K8s JobStatus](https://kubernetes.io/docs/reference/generated/kubernetes-api/v1.30/#jobstatus-v1-batch)
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `updowncounter` |
     * | Unit: | `{pod}` |
     * | Status: | `Development`  |
     */
    public const val k8sJobActivePods: String = "k8s.job.active_pods"

    /**
     * ## Description
     *
     * The desired number of successfully finished pods the job should be run with
     *
     * ## Notes
     *
     * This metric aligns with the `completions` field of the
     * [K8s JobSpec](https://kubernetes.io/docs/reference/generated/kubernetes-api/v1.30/#jobspec-v1-batch)
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `updowncounter` |
     * | Unit: | `{pod}` |
     * | Status: | `Development`  |
     */
    public const val k8sJobDesiredSuccessfulPods: String = "k8s.job.desired_successful_pods"

    /**
     * ## Description
     *
     * The number of pods which reached phase Failed for a job
     *
     * ## Notes
     *
     * This metric aligns with the `failed` field of the
     * [K8s JobStatus](https://kubernetes.io/docs/reference/generated/kubernetes-api/v1.30/#jobstatus-v1-batch)
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `updowncounter` |
     * | Unit: | `{pod}` |
     * | Status: | `Development`  |
     */
    public const val k8sJobFailedPods: String = "k8s.job.failed_pods"

    /**
     * ## Description
     *
     * The max desired number of pods the job should run at any given time
     *
     * ## Notes
     *
     * This metric aligns with the `parallelism` field of the
     * [K8s JobSpec](https://kubernetes.io/docs/reference/generated/kubernetes-api/v1.30/#jobspec-v1-batch)
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `updowncounter` |
     * | Unit: | `{pod}` |
     * | Status: | `Development`  |
     */
    public const val k8sJobMaxParallelPods: String = "k8s.job.max_parallel_pods"

    /**
     * ## Description
     *
     * The number of pods which reached phase Succeeded for a job
     *
     * ## Notes
     *
     * This metric aligns with the `succeeded` field of the
     * [K8s JobStatus](https://kubernetes.io/docs/reference/generated/kubernetes-api/v1.30/#jobstatus-v1-batch)
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `updowncounter` |
     * | Unit: | `{pod}` |
     * | Status: | `Development`  |
     */
    public const val k8sJobSuccessfulPods: String = "k8s.job.successful_pods"

    /**
     * ## Description
     *
     * Describes number of K8s namespaces that are currently in a given phase
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `updowncounter` |
     * | Unit: | `{namespace}` |
     * | Status: | `Development`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::K8S_NAMESPACE_PHASE`] | `Required`
     */
    public const val k8sNamespacePhase: String = "k8s.namespace.phase"

    /**
     * ## Description
     *
     * Amount of cpu allocatable on the node
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `updowncounter` |
     * | Unit: | `{cpu}` |
     * | Status: | `Development`  |
     */
    public const val k8sNodeAllocatableCpu: String = "k8s.node.allocatable.cpu"

    /**
     * ## Description
     *
     * Amount of ephemeral-storage allocatable on the node
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `updowncounter` |
     * | Unit: | `By` |
     * | Status: | `Development`  |
     */
    public const val k8sNodeAllocatableEphemeralStorage: String = "k8s.node.allocatable.ephemeral_storage"

    /**
     * ## Description
     *
     * Amount of memory allocatable on the node
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `updowncounter` |
     * | Unit: | `By` |
     * | Status: | `Development`  |
     */
    public const val k8sNodeAllocatableMemory: String = "k8s.node.allocatable.memory"

    /**
     * ## Description
     *
     * Amount of pods allocatable on the node
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `updowncounter` |
     * | Unit: | `{pod}` |
     * | Status: | `Development`  |
     */
    public const val k8sNodeAllocatablePods: String = "k8s.node.allocatable.pods"

    /**
     * ## Description
     *
     * Describes the condition of a particular Node.
     *
     * ## Notes
     *
     * All possible node condition pairs (type and status) will be reported at each time interval to avoid missing metrics. Condition pairs corresponding to the current conditions' statuses will be non-zero
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `updowncounter` |
     * | Unit: | `{node}` |
     * | Status: | `Development`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::K8S_NODE_CONDITION_STATUS`] | `Required`
     * | [`crate::attribute::K8S_NODE_CONDITION_TYPE`] | `Required`
     */
    public const val k8sNodeConditionStatus: String = "k8s.node.condition.status"

    /**
     * ## Description
     *
     * Total CPU time consumed
     *
     * ## Notes
     *
     * Total CPU time consumed by the specific Node on all available CPU cores
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `counter` |
     * | Unit: | `s` |
     * | Status: | `Development`  |
     */
    public const val k8sNodeCpuTime: String = "k8s.node.cpu.time"

    /**
     * ## Description
     *
     * Node's CPU usage, measured in cpus. Range from 0 to the number of allocatable CPUs
     *
     * ## Notes
     *
     * CPU usage of the specific Node on all available CPU cores, averaged over the sample window
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `gauge` |
     * | Unit: | `{cpu}` |
     * | Status: | `Development`  |
     */
    public const val k8sNodeCpuUsage: String = "k8s.node.cpu.usage"

    /**
     * ## Description
     *
     * Memory usage of the Node
     *
     * ## Notes
     *
     * Total memory usage of the Node
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `gauge` |
     * | Unit: | `By` |
     * | Status: | `Development`  |
     */
    public const val k8sNodeMemoryUsage: String = "k8s.node.memory.usage"

    /**
     * ## Description
     *
     * Node network errors
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `counter` |
     * | Unit: | `{error}` |
     * | Status: | `Development`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::NETWORK_INTERFACE_NAME`] | `Recommended`
     * | [`crate::attribute::NETWORK_IO_DIRECTION`] | `Recommended`
     */
    public const val k8sNodeNetworkErrors: String = "k8s.node.network.errors"

    /**
     * ## Description
     *
     * Network bytes for the Node
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `counter` |
     * | Unit: | `By` |
     * | Status: | `Development`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::NETWORK_INTERFACE_NAME`] | `Recommended`
     * | [`crate::attribute::NETWORK_IO_DIRECTION`] | `Recommended`
     */
    public const val k8sNodeNetworkIo: String = "k8s.node.network.io"

    /**
     * ## Description
     *
     * The time the Node has been running
     *
     * ## Notes
     *
     * Instrumentations SHOULD use a gauge with type `double` and measure uptime in seconds as a floating point number with the highest precision available.
     * The actual accuracy would depend on the instrumentation and operating system
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `gauge` |
     * | Unit: | `s` |
     * | Status: | `Development`  |
     */
    public const val k8sNodeUptime: String = "k8s.node.uptime"

    /**
     * ## Description
     *
     * Total CPU time consumed
     *
     * ## Notes
     *
     * Total CPU time consumed by the specific Pod on all available CPU cores
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `counter` |
     * | Unit: | `s` |
     * | Status: | `Development`  |
     */
    public const val k8sPodCpuTime: String = "k8s.pod.cpu.time"

    /**
     * ## Description
     *
     * Pod's CPU usage, measured in cpus. Range from 0 to the number of allocatable CPUs
     *
     * ## Notes
     *
     * CPU usage of the specific Pod on all available CPU cores, averaged over the sample window
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `gauge` |
     * | Unit: | `{cpu}` |
     * | Status: | `Development`  |
     */
    public const val k8sPodCpuUsage: String = "k8s.pod.cpu.usage"

    /**
     * ## Description
     *
     * Memory usage of the Pod
     *
     * ## Notes
     *
     * Total memory usage of the Pod
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `gauge` |
     * | Unit: | `By` |
     * | Status: | `Development`  |
     */
    public const val k8sPodMemoryUsage: String = "k8s.pod.memory.usage"

    /**
     * ## Description
     *
     * Pod network errors
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `counter` |
     * | Unit: | `{error}` |
     * | Status: | `Development`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::NETWORK_INTERFACE_NAME`] | `Recommended`
     * | [`crate::attribute::NETWORK_IO_DIRECTION`] | `Recommended`
     */
    public const val k8sPodNetworkErrors: String = "k8s.pod.network.errors"

    /**
     * ## Description
     *
     * Network bytes for the Pod
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `counter` |
     * | Unit: | `By` |
     * | Status: | `Development`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::NETWORK_INTERFACE_NAME`] | `Recommended`
     * | [`crate::attribute::NETWORK_IO_DIRECTION`] | `Recommended`
     */
    public const val k8sPodNetworkIo: String = "k8s.pod.network.io"

    /**
     * ## Description
     *
     * The time the Pod has been running
     *
     * ## Notes
     *
     * Instrumentations SHOULD use a gauge with type `double` and measure uptime in seconds as a floating point number with the highest precision available.
     * The actual accuracy would depend on the instrumentation and operating system
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `gauge` |
     * | Unit: | `s` |
     * | Status: | `Development`  |
     */
    public const val k8sPodUptime: String = "k8s.pod.uptime"

    /**
     * ## Description
     *
     * Total number of available replica pods (ready for at least minReadySeconds) targeted by this replicaset
     *
     * ## Notes
     *
     * This metric aligns with the `availableReplicas` field of the
     * [K8s ReplicaSetStatus](https://kubernetes.io/docs/reference/generated/kubernetes-api/v1.30/#replicasetstatus-v1-apps)
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `updowncounter` |
     * | Unit: | `{pod}` |
     * | Status: | `Development`  |
     */
    public const val k8sReplicasetAvailablePods: String = "k8s.replicaset.available_pods"

    /**
     * ## Description
     *
     * Number of desired replica pods in this replicaset
     *
     * ## Notes
     *
     * This metric aligns with the `replicas` field of the
     * [K8s ReplicaSetSpec](https://kubernetes.io/docs/reference/generated/kubernetes-api/v1.30/#replicasetspec-v1-apps)
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `updowncounter` |
     * | Unit: | `{pod}` |
     * | Status: | `Development`  |
     */
    public const val k8sReplicasetDesiredPods: String = "k8s.replicaset.desired_pods"

    /**
     * ## Description
     *
     * Deprecated, use `k8s.replicationcontroller.available_pods` instead
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `updowncounter` |
     * | Unit: | `{pod}` |
     * | Status: | `Development`  |
     */
    @Deprecated("{note: Replaced by `k8s.replicationcontroller.available_pods`., reason: renamed, renamed_to: k8s.replicationcontroller.available_pods}")
    public const val k8sReplicationControllerAvailablePods: String = "k8s.replication_controller.available_pods"

    /**
     * ## Description
     *
     * Deprecated, use `k8s.replicationcontroller.desired_pods` instead
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `updowncounter` |
     * | Unit: | `{pod}` |
     * | Status: | `Development`  |
     */
    @Deprecated("{note: Replaced by `k8s.replicationcontroller.desired_pods`., reason: renamed, renamed_to: k8s.replicationcontroller.desired_pods}")
    public const val k8sReplicationControllerDesiredPods: String = "k8s.replication_controller.desired_pods"

    /**
     * ## Description
     *
     * Total number of available replica pods (ready for at least minReadySeconds) targeted by this replication controller
     *
     * ## Notes
     *
     * This metric aligns with the `availableReplicas` field of the
     * [K8s ReplicationControllerStatus](https://kubernetes.io/docs/reference/generated/kubernetes-api/v1.30/#replicationcontrollerstatus-v1-core)
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `updowncounter` |
     * | Unit: | `{pod}` |
     * | Status: | `Development`  |
     */
    public const val k8sReplicationcontrollerAvailablePods: String = "k8s.replicationcontroller.available_pods"

    /**
     * ## Description
     *
     * Number of desired replica pods in this replication controller
     *
     * ## Notes
     *
     * This metric aligns with the `replicas` field of the
     * [K8s ReplicationControllerSpec](https://kubernetes.io/docs/reference/generated/kubernetes-api/v1.30/#replicationcontrollerspec-v1-core)
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `updowncounter` |
     * | Unit: | `{pod}` |
     * | Status: | `Development`  |
     */
    public const val k8sReplicationcontrollerDesiredPods: String = "k8s.replicationcontroller.desired_pods"

    /**
     * ## Description
     *
     * The CPU limits in a specific namespace.
     * The value represents the configured quota limit of the resource in the namespace.
     *
     * ## Notes
     *
     * This metric is retrieved from the `hard` field of the
     * [K8s ResourceQuotaStatus](https://kubernetes.io/docs/reference/generated/kubernetes-api/v1.32/#resourcequotastatus-v1-core)
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `updowncounter` |
     * | Unit: | `{cpu}` |
     * | Status: | `Development`  |
     */
    public const val k8sResourcequotaCpuLimitHard: String = "k8s.resourcequota.cpu.limit.hard"

    /**
     * ## Description
     *
     * The CPU limits in a specific namespace.
     * The value represents the current observed total usage of the resource in the namespace.
     *
     * ## Notes
     *
     * This metric is retrieved from the `used` field of the
     * [K8s ResourceQuotaStatus](https://kubernetes.io/docs/reference/generated/kubernetes-api/v1.32/#resourcequotastatus-v1-core)
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `updowncounter` |
     * | Unit: | `{cpu}` |
     * | Status: | `Development`  |
     */
    public const val k8sResourcequotaCpuLimitUsed: String = "k8s.resourcequota.cpu.limit.used"

    /**
     * ## Description
     *
     * The CPU requests in a specific namespace.
     * The value represents the configured quota limit of the resource in the namespace.
     *
     * ## Notes
     *
     * This metric is retrieved from the `hard` field of the
     * [K8s ResourceQuotaStatus](https://kubernetes.io/docs/reference/generated/kubernetes-api/v1.32/#resourcequotastatus-v1-core)
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `updowncounter` |
     * | Unit: | `{cpu}` |
     * | Status: | `Development`  |
     */
    public const val k8sResourcequotaCpuRequestHard: String = "k8s.resourcequota.cpu.request.hard"

    /**
     * ## Description
     *
     * The CPU requests in a specific namespace.
     * The value represents the current observed total usage of the resource in the namespace.
     *
     * ## Notes
     *
     * This metric is retrieved from the `used` field of the
     * [K8s ResourceQuotaStatus](https://kubernetes.io/docs/reference/generated/kubernetes-api/v1.32/#resourcequotastatus-v1-core)
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `updowncounter` |
     * | Unit: | `{cpu}` |
     * | Status: | `Development`  |
     */
    public const val k8sResourcequotaCpuRequestUsed: String = "k8s.resourcequota.cpu.request.used"

    /**
     * ## Description
     *
     * The sum of local ephemeral storage limits in the namespace.
     * The value represents the configured quota limit of the resource in the namespace.
     *
     * ## Notes
     *
     * This metric is retrieved from the `hard` field of the
     * [K8s ResourceQuotaStatus](https://kubernetes.io/docs/reference/generated/kubernetes-api/v1.32/#resourcequotastatus-v1-core)
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `updowncounter` |
     * | Unit: | `By` |
     * | Status: | `Development`  |
     */
    public const val k8sResourcequotaEphemeralStorageLimitHard: String = "k8s.resourcequota.ephemeral_storage.limit.hard"

    /**
     * ## Description
     *
     * The sum of local ephemeral storage limits in the namespace.
     * The value represents the current observed total usage of the resource in the namespace.
     *
     * ## Notes
     *
     * This metric is retrieved from the `used` field of the
     * [K8s ResourceQuotaStatus](https://kubernetes.io/docs/reference/generated/kubernetes-api/v1.32/#resourcequotastatus-v1-core)
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `updowncounter` |
     * | Unit: | `By` |
     * | Status: | `Development`  |
     */
    public const val k8sResourcequotaEphemeralStorageLimitUsed: String = "k8s.resourcequota.ephemeral_storage.limit.used"

    /**
     * ## Description
     *
     * The sum of local ephemeral storage requests in the namespace.
     * The value represents the configured quota limit of the resource in the namespace.
     *
     * ## Notes
     *
     * This metric is retrieved from the `hard` field of the
     * [K8s ResourceQuotaStatus](https://kubernetes.io/docs/reference/generated/kubernetes-api/v1.32/#resourcequotastatus-v1-core)
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `updowncounter` |
     * | Unit: | `By` |
     * | Status: | `Development`  |
     */
    public const val k8sResourcequotaEphemeralStorageRequestHard: String = "k8s.resourcequota.ephemeral_storage.request.hard"

    /**
     * ## Description
     *
     * The sum of local ephemeral storage requests in the namespace.
     * The value represents the current observed total usage of the resource in the namespace.
     *
     * ## Notes
     *
     * This metric is retrieved from the `used` field of the
     * [K8s ResourceQuotaStatus](https://kubernetes.io/docs/reference/generated/kubernetes-api/v1.32/#resourcequotastatus-v1-core)
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `updowncounter` |
     * | Unit: | `By` |
     * | Status: | `Development`  |
     */
    public const val k8sResourcequotaEphemeralStorageRequestUsed: String = "k8s.resourcequota.ephemeral_storage.request.used"

    /**
     * ## Description
     *
     * The huge page requests in a specific namespace.
     * The value represents the configured quota limit of the resource in the namespace.
     *
     * ## Notes
     *
     * This metric is retrieved from the `hard` field of the
     * [K8s ResourceQuotaStatus](https://kubernetes.io/docs/reference/generated/kubernetes-api/v1.32/#resourcequotastatus-v1-core)
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `updowncounter` |
     * | Unit: | `{hugepage}` |
     * | Status: | `Development`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::K8S_HUGEPAGE_SIZE`] | `Required`
     */
    public const val k8sResourcequotaHugepageCountRequestHard: String = "k8s.resourcequota.hugepage_count.request.hard"

    /**
     * ## Description
     *
     * The huge page requests in a specific namespace.
     * The value represents the current observed total usage of the resource in the namespace.
     *
     * ## Notes
     *
     * This metric is retrieved from the `used` field of the
     * [K8s ResourceQuotaStatus](https://kubernetes.io/docs/reference/generated/kubernetes-api/v1.32/#resourcequotastatus-v1-core)
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `updowncounter` |
     * | Unit: | `{hugepage}` |
     * | Status: | `Development`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::K8S_HUGEPAGE_SIZE`] | `Required`
     */
    public const val k8sResourcequotaHugepageCountRequestUsed: String = "k8s.resourcequota.hugepage_count.request.used"

    /**
     * ## Description
     *
     * The memory limits in a specific namespace.
     * The value represents the configured quota limit of the resource in the namespace.
     *
     * ## Notes
     *
     * This metric is retrieved from the `hard` field of the
     * [K8s ResourceQuotaStatus](https://kubernetes.io/docs/reference/generated/kubernetes-api/v1.32/#resourcequotastatus-v1-core)
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `updowncounter` |
     * | Unit: | `By` |
     * | Status: | `Development`  |
     */
    public const val k8sResourcequotaMemoryLimitHard: String = "k8s.resourcequota.memory.limit.hard"

    /**
     * ## Description
     *
     * The memory limits in a specific namespace.
     * The value represents the current observed total usage of the resource in the namespace.
     *
     * ## Notes
     *
     * This metric is retrieved from the `used` field of the
     * [K8s ResourceQuotaStatus](https://kubernetes.io/docs/reference/generated/kubernetes-api/v1.32/#resourcequotastatus-v1-core)
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `updowncounter` |
     * | Unit: | `By` |
     * | Status: | `Development`  |
     */
    public const val k8sResourcequotaMemoryLimitUsed: String = "k8s.resourcequota.memory.limit.used"

    /**
     * ## Description
     *
     * The memory requests in a specific namespace.
     * The value represents the configured quota limit of the resource in the namespace.
     *
     * ## Notes
     *
     * This metric is retrieved from the `hard` field of the
     * [K8s ResourceQuotaStatus](https://kubernetes.io/docs/reference/generated/kubernetes-api/v1.32/#resourcequotastatus-v1-core)
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `updowncounter` |
     * | Unit: | `By` |
     * | Status: | `Development`  |
     */
    public const val k8sResourcequotaMemoryRequestHard: String = "k8s.resourcequota.memory.request.hard"

    /**
     * ## Description
     *
     * The memory requests in a specific namespace.
     * The value represents the current observed total usage of the resource in the namespace.
     *
     * ## Notes
     *
     * This metric is retrieved from the `used` field of the
     * [K8s ResourceQuotaStatus](https://kubernetes.io/docs/reference/generated/kubernetes-api/v1.32/#resourcequotastatus-v1-core)
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `updowncounter` |
     * | Unit: | `By` |
     * | Status: | `Development`  |
     */
    public const val k8sResourcequotaMemoryRequestUsed: String = "k8s.resourcequota.memory.request.used"

    /**
     * ## Description
     *
     * The object count limits in a specific namespace.
     * The value represents the configured quota limit of the resource in the namespace.
     *
     * ## Notes
     *
     * This metric is retrieved from the `hard` field of the
     * [K8s ResourceQuotaStatus](https://kubernetes.io/docs/reference/generated/kubernetes-api/v1.32/#resourcequotastatus-v1-core)
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `updowncounter` |
     * | Unit: | `{object}` |
     * | Status: | `Development`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::K8S_RESOURCEQUOTA_RESOURCE_NAME`] | `Required`
     */
    public const val k8sResourcequotaObjectCountHard: String = "k8s.resourcequota.object_count.hard"

    /**
     * ## Description
     *
     * The object count limits in a specific namespace.
     * The value represents the current observed total usage of the resource in the namespace.
     *
     * ## Notes
     *
     * This metric is retrieved from the `used` field of the
     * [K8s ResourceQuotaStatus](https://kubernetes.io/docs/reference/generated/kubernetes-api/v1.32/#resourcequotastatus-v1-core)
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `updowncounter` |
     * | Unit: | `{object}` |
     * | Status: | `Development`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::K8S_RESOURCEQUOTA_RESOURCE_NAME`] | `Required`
     */
    public const val k8sResourcequotaObjectCountUsed: String = "k8s.resourcequota.object_count.used"

    /**
     * ## Description
     *
     * The total number of PersistentVolumeClaims that can exist in the namespace.
     * The value represents the configured quota limit of the resource in the namespace.
     *
     * ## Notes
     *
     * This metric is retrieved from the `hard` field of the
     * [K8s ResourceQuotaStatus](https://kubernetes.io/docs/reference/generated/kubernetes-api/v1.32/#resourcequotastatus-v1-core).
     *
     * The `k8s.storageclass.name` should be required when a resource quota is defined for a specific
     * storage class
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `updowncounter` |
     * | Unit: | `{persistentvolumeclaim}` |
     * | Status: | `Development`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::K8S_STORAGECLASS_NAME`] | `Conditionally_required`: The `k8s.storageclass.name` should be required when a resource quota is defined for a specific storage class.
     */
    public const val k8sResourcequotaPersistentvolumeclaimCountHard: String = "k8s.resourcequota.persistentvolumeclaim_count.hard"

    /**
     * ## Description
     *
     * The total number of PersistentVolumeClaims that can exist in the namespace.
     * The value represents the current observed total usage of the resource in the namespace.
     *
     * ## Notes
     *
     * This metric is retrieved from the `used` field of the
     * [K8s ResourceQuotaStatus](https://kubernetes.io/docs/reference/generated/kubernetes-api/v1.32/#resourcequotastatus-v1-core).
     *
     * The `k8s.storageclass.name` should be required when a resource quota is defined for a specific
     * storage class
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `updowncounter` |
     * | Unit: | `{persistentvolumeclaim}` |
     * | Status: | `Development`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::K8S_STORAGECLASS_NAME`] | `Conditionally_required`: The `k8s.storageclass.name` should be required when a resource quota is defined for a specific storage class.
     */
    public const val k8sResourcequotaPersistentvolumeclaimCountUsed: String = "k8s.resourcequota.persistentvolumeclaim_count.used"

    /**
     * ## Description
     *
     * The storage requests in a specific namespace.
     * The value represents the configured quota limit of the resource in the namespace.
     *
     * ## Notes
     *
     * This metric is retrieved from the `hard` field of the
     * [K8s ResourceQuotaStatus](https://kubernetes.io/docs/reference/generated/kubernetes-api/v1.32/#resourcequotastatus-v1-core).
     *
     * The `k8s.storageclass.name` should be required when a resource quota is defined for a specific
     * storage class
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `updowncounter` |
     * | Unit: | `By` |
     * | Status: | `Development`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::K8S_STORAGECLASS_NAME`] | `Conditionally_required`: The `k8s.storageclass.name` should be required when a resource quota is defined for a specific storage class.
     */
    public const val k8sResourcequotaStorageRequestHard: String = "k8s.resourcequota.storage.request.hard"

    /**
     * ## Description
     *
     * The storage requests in a specific namespace.
     * The value represents the current observed total usage of the resource in the namespace.
     *
     * ## Notes
     *
     * This metric is retrieved from the `used` field of the
     * [K8s ResourceQuotaStatus](https://kubernetes.io/docs/reference/generated/kubernetes-api/v1.32/#resourcequotastatus-v1-core).
     *
     * The `k8s.storageclass.name` should be required when a resource quota is defined for a specific
     * storage class
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `updowncounter` |
     * | Unit: | `By` |
     * | Status: | `Development`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::K8S_STORAGECLASS_NAME`] | `Conditionally_required`: The `k8s.storageclass.name` should be required when a resource quota is defined for a specific storage class.
     */
    public const val k8sResourcequotaStorageRequestUsed: String = "k8s.resourcequota.storage.request.used"

    /**
     * ## Description
     *
     * The number of replica pods created by the statefulset controller from the statefulset version indicated by currentRevision
     *
     * ## Notes
     *
     * This metric aligns with the `currentReplicas` field of the
     * [K8s StatefulSetStatus](https://kubernetes.io/docs/reference/generated/kubernetes-api/v1.30/#statefulsetstatus-v1-apps)
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `updowncounter` |
     * | Unit: | `{pod}` |
     * | Status: | `Development`  |
     */
    public const val k8sStatefulsetCurrentPods: String = "k8s.statefulset.current_pods"

    /**
     * ## Description
     *
     * Number of desired replica pods in this statefulset
     *
     * ## Notes
     *
     * This metric aligns with the `replicas` field of the
     * [K8s StatefulSetSpec](https://kubernetes.io/docs/reference/generated/kubernetes-api/v1.30/#statefulsetspec-v1-apps)
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `updowncounter` |
     * | Unit: | `{pod}` |
     * | Status: | `Development`  |
     */
    public const val k8sStatefulsetDesiredPods: String = "k8s.statefulset.desired_pods"

    /**
     * ## Description
     *
     * The number of replica pods created for this statefulset with a Ready Condition
     *
     * ## Notes
     *
     * This metric aligns with the `readyReplicas` field of the
     * [K8s StatefulSetStatus](https://kubernetes.io/docs/reference/generated/kubernetes-api/v1.30/#statefulsetstatus-v1-apps)
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `updowncounter` |
     * | Unit: | `{pod}` |
     * | Status: | `Development`  |
     */
    public const val k8sStatefulsetReadyPods: String = "k8s.statefulset.ready_pods"

    /**
     * ## Description
     *
     * Number of replica pods created by the statefulset controller from the statefulset version indicated by updateRevision
     *
     * ## Notes
     *
     * This metric aligns with the `updatedReplicas` field of the
     * [K8s StatefulSetStatus](https://kubernetes.io/docs/reference/generated/kubernetes-api/v1.30/#statefulsetstatus-v1-apps)
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `updowncounter` |
     * | Unit: | `{pod}` |
     * | Status: | `Development`  |
     */
    public const val k8sStatefulsetUpdatedPods: String = "k8s.statefulset.updated_pods"

    /**
     * ## Description
     *
     * Number of connections that are currently active on the server.
     *
     * ## Notes
     *
     * Meter name: `Microsoft.AspNetCore.Server.Kestrel`; Added in: ASP.NET Core 8.0
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `updowncounter` |
     * | Unit: | `{connection}` |
     * | Status: | `Stable`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::NETWORK_TRANSPORT`] | `Recommended`
     * | [`crate::attribute::NETWORK_TYPE`] | `{"recommended": "if the transport is `tcp` or `udp`"}`
     * | [`crate::attribute::SERVER_ADDRESS`] | `Recommended`
     * | [`crate::attribute::SERVER_PORT`] | `Recommended`
     */
    public const val kestrelActiveConnections: String = "kestrel.active_connections"

    /**
     * ## Description
     *
     * Number of TLS handshakes that are currently in progress on the server.
     *
     * ## Notes
     *
     * Meter name: `Microsoft.AspNetCore.Server.Kestrel`; Added in: ASP.NET Core 8.0
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `updowncounter` |
     * | Unit: | `{handshake}` |
     * | Status: | `Stable`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::NETWORK_TRANSPORT`] | `Recommended`
     * | [`crate::attribute::NETWORK_TYPE`] | `{"recommended": "if the transport is `tcp` or `udp`"}`
     * | [`crate::attribute::SERVER_ADDRESS`] | `Recommended`
     * | [`crate::attribute::SERVER_PORT`] | `Recommended`
     */
    public const val kestrelActiveTlsHandshakes: String = "kestrel.active_tls_handshakes"

    /**
     * ## Description
     *
     * The duration of connections on the server.
     *
     * ## Notes
     *
     * Meter name: `Microsoft.AspNetCore.Server.Kestrel`; Added in: ASP.NET Core 8.0
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `histogram` |
     * | Unit: | `s` |
     * | Status: | `Stable`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::ERROR_TYPE`] | `Conditionally_required`: if and only if an error has occurred.
     * | [`crate::attribute::NETWORK_PROTOCOL_NAME`] | `Recommended`
     * | [`crate::attribute::NETWORK_PROTOCOL_VERSION`] | `Recommended`
     * | [`crate::attribute::NETWORK_TRANSPORT`] | `Recommended`
     * | [`crate::attribute::NETWORK_TYPE`] | `{"recommended": "if the transport is `tcp` or `udp`"}`
     * | [`crate::attribute::SERVER_ADDRESS`] | `Recommended`
     * | [`crate::attribute::SERVER_PORT`] | `Recommended`
     * | [`crate::attribute::TLS_PROTOCOL_VERSION`] | `Recommended`
     */
    public const val kestrelConnectionDuration: String = "kestrel.connection.duration"

    /**
     * ## Description
     *
     * Number of connections that are currently queued and are waiting to start.
     *
     * ## Notes
     *
     * Meter name: `Microsoft.AspNetCore.Server.Kestrel`; Added in: ASP.NET Core 8.0
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `updowncounter` |
     * | Unit: | `{connection}` |
     * | Status: | `Stable`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::NETWORK_TRANSPORT`] | `Recommended`
     * | [`crate::attribute::NETWORK_TYPE`] | `{"recommended": "if the transport is `tcp` or `udp`"}`
     * | [`crate::attribute::SERVER_ADDRESS`] | `Recommended`
     * | [`crate::attribute::SERVER_PORT`] | `Recommended`
     */
    public const val kestrelQueuedConnections: String = "kestrel.queued_connections"

    /**
     * ## Description
     *
     * Number of HTTP requests on multiplexed connections (HTTP/2 and HTTP/3) that are currently queued and are waiting to start.
     *
     * ## Notes
     *
     * Meter name: `Microsoft.AspNetCore.Server.Kestrel`; Added in: ASP.NET Core 8.0
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `updowncounter` |
     * | Unit: | `{request}` |
     * | Status: | `Stable`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::NETWORK_PROTOCOL_NAME`] | `Recommended`
     * | [`crate::attribute::NETWORK_PROTOCOL_VERSION`] | `Recommended`
     * | [`crate::attribute::NETWORK_TRANSPORT`] | `Recommended`
     * | [`crate::attribute::NETWORK_TYPE`] | `{"recommended": "if the transport is `tcp` or `udp`"}`
     * | [`crate::attribute::SERVER_ADDRESS`] | `Recommended`
     * | [`crate::attribute::SERVER_PORT`] | `Recommended`
     */
    public const val kestrelQueuedRequests: String = "kestrel.queued_requests"

    /**
     * ## Description
     *
     * Number of connections rejected by the server.
     *
     * ## Notes
     *
     * Connections are rejected when the currently active count exceeds the value configured with `MaxConcurrentConnections`.
     * Meter name: `Microsoft.AspNetCore.Server.Kestrel`; Added in: ASP.NET Core 8.0
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `counter` |
     * | Unit: | `{connection}` |
     * | Status: | `Stable`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::NETWORK_TRANSPORT`] | `Recommended`
     * | [`crate::attribute::NETWORK_TYPE`] | `{"recommended": "if the transport is `tcp` or `udp`"}`
     * | [`crate::attribute::SERVER_ADDRESS`] | `Recommended`
     * | [`crate::attribute::SERVER_PORT`] | `Recommended`
     */
    public const val kestrelRejectedConnections: String = "kestrel.rejected_connections"

    /**
     * ## Description
     *
     * The duration of TLS handshakes on the server.
     *
     * ## Notes
     *
     * Meter name: `Microsoft.AspNetCore.Server.Kestrel`; Added in: ASP.NET Core 8.0
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `histogram` |
     * | Unit: | `s` |
     * | Status: | `Stable`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::ERROR_TYPE`] | `Conditionally_required`: if and only if an error has occurred.
     * | [`crate::attribute::NETWORK_TRANSPORT`] | `Recommended`
     * | [`crate::attribute::NETWORK_TYPE`] | `{"recommended": "if the transport is `tcp` or `udp`"}`
     * | [`crate::attribute::SERVER_ADDRESS`] | `Recommended`
     * | [`crate::attribute::SERVER_PORT`] | `Recommended`
     * | [`crate::attribute::TLS_PROTOCOL_VERSION`] | `Recommended`
     */
    public const val kestrelTlsHandshakeDuration: String = "kestrel.tls_handshake.duration"

    /**
     * ## Description
     *
     * Number of connections that are currently upgraded (WebSockets). .
     *
     * ## Notes
     *
     * The counter only tracks HTTP/1.1 connections.
     *
     * Meter name: `Microsoft.AspNetCore.Server.Kestrel`; Added in: ASP.NET Core 8.0
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `updowncounter` |
     * | Unit: | `{connection}` |
     * | Status: | `Stable`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::NETWORK_TRANSPORT`] | `Recommended`
     * | [`crate::attribute::NETWORK_TYPE`] | `{"recommended": "if the transport is `tcp` or `udp`"}`
     * | [`crate::attribute::SERVER_ADDRESS`] | `Recommended`
     * | [`crate::attribute::SERVER_PORT`] | `Recommended`
     */
    public const val kestrelUpgradedConnections: String = "kestrel.upgraded_connections"

    /**
     * ## Description
     *
     * Number of messages that were delivered to the application.
     *
     * ## Notes
     *
     * Records the number of messages pulled from the broker or number of messages dispatched to the application in push-based scenarios.
     * The metric SHOULD be reported once per message delivery. For example, if receiving and processing operations are both instrumented for a single message delivery, this counter is incremented when the message is received and not reported when it is processed
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `counter` |
     * | Unit: | `{message}` |
     * | Status: | `Development`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::ERROR_TYPE`] | `Conditionally_required`: If and only if the messaging operation has failed.
     * | [`crate::attribute::MESSAGING_CONSUMER_GROUP_NAME`] | `Conditionally_required`: if applicable.
     * | [`crate::attribute::MESSAGING_DESTINATION_NAME`] | `Conditionally_required`: if and only if `messaging.destination.name` is known to have low cardinality. Otherwise, `messaging.destination.template` MAY be populated.
     * | [`crate::attribute::MESSAGING_DESTINATION_PARTITION_ID`] | `Recommended`
     * | [`crate::attribute::MESSAGING_DESTINATION_SUBSCRIPTION_NAME`] | `Conditionally_required`: if applicable.
     * | [`crate::attribute::MESSAGING_DESTINATION_TEMPLATE`] | `Conditionally_required`: if available.
     * | [`crate::attribute::MESSAGING_OPERATION_NAME`] | `Required`
     * | [`crate::attribute::MESSAGING_SYSTEM`] | `Required`
     * | [`crate::attribute::SERVER_ADDRESS`] | `Conditionally_required`: If available.
     * | [`crate::attribute::SERVER_PORT`] | `Recommended`
     */
    public const val messagingClientConsumedMessages: String = "messaging.client.consumed.messages"

    /**
     * ## Description
     *
     * Duration of messaging operation initiated by a producer or consumer client.
     *
     * ## Notes
     *
     * This metric SHOULD NOT be used to report processing duration - processing duration is reported in `messaging.process.duration` metric
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `histogram` |
     * | Unit: | `s` |
     * | Status: | `Development`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::ERROR_TYPE`] | `Conditionally_required`: If and only if the messaging operation has failed.
     * | [`crate::attribute::MESSAGING_CONSUMER_GROUP_NAME`] | `Conditionally_required`: if applicable.
     * | [`crate::attribute::MESSAGING_DESTINATION_NAME`] | `Conditionally_required`: if and only if `messaging.destination.name` is known to have low cardinality. Otherwise, `messaging.destination.template` MAY be populated.
     * | [`crate::attribute::MESSAGING_DESTINATION_PARTITION_ID`] | `Recommended`
     * | [`crate::attribute::MESSAGING_DESTINATION_SUBSCRIPTION_NAME`] | `Conditionally_required`: if applicable.
     * | [`crate::attribute::MESSAGING_DESTINATION_TEMPLATE`] | `Conditionally_required`: if available.
     * | [`crate::attribute::MESSAGING_OPERATION_NAME`] | `Required`
     * | [`crate::attribute::MESSAGING_OPERATION_TYPE`] | `Conditionally_required`: If applicable.
     * | [`crate::attribute::MESSAGING_SYSTEM`] | `Required`
     * | [`crate::attribute::SERVER_ADDRESS`] | `Conditionally_required`: If available.
     * | [`crate::attribute::SERVER_PORT`] | `Recommended`
     */
    public const val messagingClientOperationDuration: String = "messaging.client.operation.duration"

    /**
     * ## Description
     *
     * Deprecated. Use `messaging.client.sent.messages` instead
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `counter` |
     * | Unit: | `{message}` |
     * | Status: | `Development`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::ERROR_TYPE`] | `Conditionally_required`: If and only if the messaging operation has failed.
     * | [`crate::attribute::MESSAGING_DESTINATION_NAME`] | `Conditionally_required`: if and only if `messaging.destination.name` is known to have low cardinality. Otherwise, `messaging.destination.template` MAY be populated.
     * | [`crate::attribute::MESSAGING_DESTINATION_PARTITION_ID`] | `Recommended`
     * | [`crate::attribute::MESSAGING_DESTINATION_TEMPLATE`] | `Conditionally_required`: if available.
     * | [`crate::attribute::MESSAGING_OPERATION_NAME`] | `Required`
     * | [`crate::attribute::MESSAGING_SYSTEM`] | `Required`
     * | [`crate::attribute::SERVER_ADDRESS`] | `Conditionally_required`: If available.
     * | [`crate::attribute::SERVER_PORT`] | `Recommended`
     */
    @Deprecated("{note: Replaced by `messaging.client.sent.messages`., reason: renamed, renamed_to: messaging.client.sent.messages}")
    public const val messagingClientPublishedMessages: String = "messaging.client.published.messages"

    /**
     * ## Description
     *
     * Number of messages producer attempted to send to the broker.
     *
     * ## Notes
     *
     * This metric MUST NOT count messages that were created but haven't yet been sent
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `counter` |
     * | Unit: | `{message}` |
     * | Status: | `Development`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::ERROR_TYPE`] | `Conditionally_required`: If and only if the messaging operation has failed.
     * | [`crate::attribute::MESSAGING_DESTINATION_NAME`] | `Conditionally_required`: if and only if `messaging.destination.name` is known to have low cardinality. Otherwise, `messaging.destination.template` MAY be populated.
     * | [`crate::attribute::MESSAGING_DESTINATION_PARTITION_ID`] | `Recommended`
     * | [`crate::attribute::MESSAGING_DESTINATION_TEMPLATE`] | `Conditionally_required`: if available.
     * | [`crate::attribute::MESSAGING_OPERATION_NAME`] | `Required`
     * | [`crate::attribute::MESSAGING_SYSTEM`] | `Required`
     * | [`crate::attribute::SERVER_ADDRESS`] | `Conditionally_required`: If available.
     * | [`crate::attribute::SERVER_PORT`] | `Recommended`
     */
    public const val messagingClientSentMessages: String = "messaging.client.sent.messages"

    /**
     * ## Description
     *
     * Duration of processing operation.
     *
     * ## Notes
     *
     * This metric MUST be reported for operations with `messaging.operation.type` that matches `process`
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `histogram` |
     * | Unit: | `s` |
     * | Status: | `Development`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::ERROR_TYPE`] | `Conditionally_required`: If and only if the messaging operation has failed.
     * | [`crate::attribute::MESSAGING_CONSUMER_GROUP_NAME`] | `Conditionally_required`: if applicable.
     * | [`crate::attribute::MESSAGING_DESTINATION_NAME`] | `Conditionally_required`: if and only if `messaging.destination.name` is known to have low cardinality. Otherwise, `messaging.destination.template` MAY be populated.
     * | [`crate::attribute::MESSAGING_DESTINATION_PARTITION_ID`] | `Recommended`
     * | [`crate::attribute::MESSAGING_DESTINATION_SUBSCRIPTION_NAME`] | `Conditionally_required`: if applicable.
     * | [`crate::attribute::MESSAGING_DESTINATION_TEMPLATE`] | `Conditionally_required`: if available.
     * | [`crate::attribute::MESSAGING_OPERATION_NAME`] | `Required`
     * | [`crate::attribute::MESSAGING_SYSTEM`] | `Required`
     * | [`crate::attribute::SERVER_ADDRESS`] | `Conditionally_required`: If available.
     * | [`crate::attribute::SERVER_PORT`] | `Recommended`
     */
    public const val messagingProcessDuration: String = "messaging.process.duration"

    /**
     * ## Description
     *
     * Deprecated. Use `messaging.client.consumed.messages` instead
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `counter` |
     * | Unit: | `{message}` |
     * | Status: | `Development`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::ERROR_TYPE`] | `Conditionally_required`: If and only if the messaging operation has failed.
     * | [`crate::attribute::MESSAGING_OPERATION_NAME`] | `Required`
     * | [`crate::attribute::SERVER_ADDRESS`] | `Conditionally_required`: If available.
     * | [`crate::attribute::SERVER_PORT`] | `Recommended`
     */
    @Deprecated("{note: Replaced by `messaging.client.consumed.messages`., reason: renamed, renamed_to: messaging.client.consumed.messages}")
    public const val messagingProcessMessages: String = "messaging.process.messages"

    /**
     * ## Description
     *
     * Deprecated. Use `messaging.client.operation.duration` instead
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `histogram` |
     * | Unit: | `s` |
     * | Status: | `Development`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::ERROR_TYPE`] | `Conditionally_required`: If and only if the messaging operation has failed.
     * | [`crate::attribute::MESSAGING_OPERATION_NAME`] | `Required`
     * | [`crate::attribute::SERVER_ADDRESS`] | `Conditionally_required`: If available.
     * | [`crate::attribute::SERVER_PORT`] | `Recommended`
     */
    @Deprecated("{note: Replaced by `messaging.client.operation.duration`., reason: renamed, renamed_to: messaging.client.operation.duration}")
    public const val messagingPublishDuration: String = "messaging.publish.duration"

    /**
     * ## Description
     *
     * Deprecated. Use `messaging.client.sent.messages` instead
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `counter` |
     * | Unit: | `{message}` |
     * | Status: | `Development`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::ERROR_TYPE`] | `Conditionally_required`: If and only if the messaging operation has failed.
     * | [`crate::attribute::MESSAGING_OPERATION_NAME`] | `Required`
     * | [`crate::attribute::SERVER_ADDRESS`] | `Conditionally_required`: If available.
     * | [`crate::attribute::SERVER_PORT`] | `Recommended`
     */
    @Deprecated("{note: Replaced by `messaging.client.sent.messages`., reason: renamed, renamed_to: messaging.client.sent.messages}")
    public const val messagingPublishMessages: String = "messaging.publish.messages"

    /**
     * ## Description
     *
     * Deprecated. Use `messaging.client.operation.duration` instead
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `histogram` |
     * | Unit: | `s` |
     * | Status: | `Development`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::ERROR_TYPE`] | `Conditionally_required`: If and only if the messaging operation has failed.
     * | [`crate::attribute::MESSAGING_OPERATION_NAME`] | `Required`
     * | [`crate::attribute::SERVER_ADDRESS`] | `Conditionally_required`: If available.
     * | [`crate::attribute::SERVER_PORT`] | `Recommended`
     */
    @Deprecated("{note: Replaced by `messaging.client.operation.duration`., reason: renamed, renamed_to: messaging.client.operation.duration}")
    public const val messagingReceiveDuration: String = "messaging.receive.duration"

    /**
     * ## Description
     *
     * Deprecated. Use `messaging.client.consumed.messages` instead
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `counter` |
     * | Unit: | `{message}` |
     * | Status: | `Development`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::ERROR_TYPE`] | `Conditionally_required`: If and only if the messaging operation has failed.
     * | [`crate::attribute::MESSAGING_OPERATION_NAME`] | `Required`
     * | [`crate::attribute::SERVER_ADDRESS`] | `Conditionally_required`: If available.
     * | [`crate::attribute::SERVER_PORT`] | `Recommended`
     */
    @Deprecated("{note: Replaced by `messaging.client.consumed.messages`., reason: renamed, renamed_to: messaging.client.consumed.messages}")
    public const val messagingReceiveMessages: String = "messaging.receive.messages"

    /**
     * ## Description
     *
     * Event loop maximum delay.
     *
     * ## Notes
     *
     * Value can be retrieved from value `histogram.max` of [`perf_hooks.monitorEventLoopDelay([options])`](https://nodejs.org/api/perf_hooks.html#perf_hooksmonitoreventloopdelayoptions)
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `gauge` |
     * | Unit: | `s` |
     * | Status: | `Development`  |
     */
    public const val nodejsEventloopDelayMax: String = "nodejs.eventloop.delay.max"

    /**
     * ## Description
     *
     * Event loop mean delay.
     *
     * ## Notes
     *
     * Value can be retrieved from value `histogram.mean` of [`perf_hooks.monitorEventLoopDelay([options])`](https://nodejs.org/api/perf_hooks.html#perf_hooksmonitoreventloopdelayoptions)
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `gauge` |
     * | Unit: | `s` |
     * | Status: | `Development`  |
     */
    public const val nodejsEventloopDelayMean: String = "nodejs.eventloop.delay.mean"

    /**
     * ## Description
     *
     * Event loop minimum delay.
     *
     * ## Notes
     *
     * Value can be retrieved from value `histogram.min` of [`perf_hooks.monitorEventLoopDelay([options])`](https://nodejs.org/api/perf_hooks.html#perf_hooksmonitoreventloopdelayoptions)
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `gauge` |
     * | Unit: | `s` |
     * | Status: | `Development`  |
     */
    public const val nodejsEventloopDelayMin: String = "nodejs.eventloop.delay.min"

    /**
     * ## Description
     *
     * Event loop 50 percentile delay.
     *
     * ## Notes
     *
     * Value can be retrieved from value `histogram.percentile(50)` of [`perf_hooks.monitorEventLoopDelay([options])`](https://nodejs.org/api/perf_hooks.html#perf_hooksmonitoreventloopdelayoptions)
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `gauge` |
     * | Unit: | `s` |
     * | Status: | `Development`  |
     */
    public const val nodejsEventloopDelayP50: String = "nodejs.eventloop.delay.p50"

    /**
     * ## Description
     *
     * Event loop 90 percentile delay.
     *
     * ## Notes
     *
     * Value can be retrieved from value `histogram.percentile(90)` of [`perf_hooks.monitorEventLoopDelay([options])`](https://nodejs.org/api/perf_hooks.html#perf_hooksmonitoreventloopdelayoptions)
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `gauge` |
     * | Unit: | `s` |
     * | Status: | `Development`  |
     */
    public const val nodejsEventloopDelayP90: String = "nodejs.eventloop.delay.p90"

    /**
     * ## Description
     *
     * Event loop 99 percentile delay.
     *
     * ## Notes
     *
     * Value can be retrieved from value `histogram.percentile(99)` of [`perf_hooks.monitorEventLoopDelay([options])`](https://nodejs.org/api/perf_hooks.html#perf_hooksmonitoreventloopdelayoptions)
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `gauge` |
     * | Unit: | `s` |
     * | Status: | `Development`  |
     */
    public const val nodejsEventloopDelayP99: String = "nodejs.eventloop.delay.p99"

    /**
     * ## Description
     *
     * Event loop standard deviation delay.
     *
     * ## Notes
     *
     * Value can be retrieved from value `histogram.stddev` of [`perf_hooks.monitorEventLoopDelay([options])`](https://nodejs.org/api/perf_hooks.html#perf_hooksmonitoreventloopdelayoptions)
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `gauge` |
     * | Unit: | `s` |
     * | Status: | `Development`  |
     */
    public const val nodejsEventloopDelayStddev: String = "nodejs.eventloop.delay.stddev"

    /**
     * ## Description
     *
     * Cumulative duration of time the event loop has been in each state.
     *
     * ## Notes
     *
     * Value can be retrieved from [`performance.eventLoopUtilization([utilization1[, utilization2]])`](https://nodejs.org/api/perf_hooks.html#performanceeventlooputilizationutilization1-utilization2)
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `counter` |
     * | Unit: | `s` |
     * | Status: | `Development`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::NODEJS_EVENTLOOP_STATE`] | `Required`
     */
    public const val nodejsEventloopTime: String = "nodejs.eventloop.time"

    /**
     * ## Description
     *
     * Event loop utilization.
     *
     * ## Notes
     *
     * The value range is \[0.0, 1.0\] and can be retrieved from [`performance.eventLoopUtilization([utilization1[, utilization2]])`](https://nodejs.org/api/perf_hooks.html#performanceeventlooputilizationutilization1-utilization2)
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `gauge` |
     * | Unit: | `1` |
     * | Status: | `Development`  |
     */
    public const val nodejsEventloopUtilization: String = "nodejs.eventloop.utilization"

    /**
     * ## Description
     *
     * The number of log records for which the export has finished, either successful or failed
     *
     * ## Notes
     *
     * For successful exports, `error.type` MUST NOT be set. For failed exports, `error.type` MUST contain the failure cause.
     * For exporters with partial success semantics (e.g. OTLP with `rejected_log_records`), rejected log records MUST count as failed and only non-rejected log records count as success.
     * If no rejection reason is available, `rejected` SHOULD be used as value for `error.type`
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `counter` |
     * | Unit: | `{log_record}` |
     * | Status: | `Development`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::ERROR_TYPE`] | `Recommended`
     * | [`crate::attribute::OTEL_COMPONENT_NAME`] | `Recommended`
     * | [`crate::attribute::OTEL_COMPONENT_TYPE`] | `Recommended`
     * | [`crate::attribute::SERVER_ADDRESS`] | `{"recommended": "when applicable"}`
     * | [`crate::attribute::SERVER_PORT`] | `{"recommended": "when applicable"}`
     */
    public const val otelSdkExporterLogExported: String = "otel.sdk.exporter.log.exported"

    /**
     * ## Description
     *
     * The number of log records which were passed to the exporter, but that have not been exported yet (neither successful, nor failed)
     *
     * ## Notes
     *
     * For successful exports, `error.type` MUST NOT be set. For failed exports, `error.type` MUST contain the failure cause
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `updowncounter` |
     * | Unit: | `{log_record}` |
     * | Status: | `Development`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::OTEL_COMPONENT_NAME`] | `Recommended`
     * | [`crate::attribute::OTEL_COMPONENT_TYPE`] | `Recommended`
     * | [`crate::attribute::SERVER_ADDRESS`] | `{"recommended": "when applicable"}`
     * | [`crate::attribute::SERVER_PORT`] | `{"recommended": "when applicable"}`
     */
    public const val otelSdkExporterLogInflight: String = "otel.sdk.exporter.log.inflight"

    /**
     * ## Description
     *
     * The number of metric data points for which the export has finished, either successful or failed
     *
     * ## Notes
     *
     * For successful exports, `error.type` MUST NOT be set. For failed exports, `error.type` MUST contain the failure cause.
     * For exporters with partial success semantics (e.g. OTLP with `rejected_data_points`), rejected data points MUST count as failed and only non-rejected data points count as success.
     * If no rejection reason is available, `rejected` SHOULD be used as value for `error.type`
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `counter` |
     * | Unit: | `{data_point}` |
     * | Status: | `Development`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::ERROR_TYPE`] | `Recommended`
     * | [`crate::attribute::OTEL_COMPONENT_NAME`] | `Recommended`
     * | [`crate::attribute::OTEL_COMPONENT_TYPE`] | `Recommended`
     * | [`crate::attribute::SERVER_ADDRESS`] | `{"recommended": "when applicable"}`
     * | [`crate::attribute::SERVER_PORT`] | `{"recommended": "when applicable"}`
     */
    public const val otelSdkExporterMetricDataPointExported: String = "otel.sdk.exporter.metric_data_point.exported"

    /**
     * ## Description
     *
     * The number of metric data points which were passed to the exporter, but that have not been exported yet (neither successful, nor failed)
     *
     * ## Notes
     *
     * For successful exports, `error.type` MUST NOT be set. For failed exports, `error.type` MUST contain the failure cause
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `updowncounter` |
     * | Unit: | `{data_point}` |
     * | Status: | `Development`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::OTEL_COMPONENT_NAME`] | `Recommended`
     * | [`crate::attribute::OTEL_COMPONENT_TYPE`] | `Recommended`
     * | [`crate::attribute::SERVER_ADDRESS`] | `{"recommended": "when applicable"}`
     * | [`crate::attribute::SERVER_PORT`] | `{"recommended": "when applicable"}`
     */
    public const val otelSdkExporterMetricDataPointInflight: String = "otel.sdk.exporter.metric_data_point.inflight"

    /**
     * ## Description
     *
     * The duration of exporting a batch of telemetry records.
     *
     * ## Notes
     *
     * This metric defines successful operations using the full success definitions for [http](https://github.com/open-telemetry/opentelemetry-proto/blob/v1.5.0/docs/specification.md#full-success-1)
     * and [grpc](https://github.com/open-telemetry/opentelemetry-proto/blob/v1.5.0/docs/specification.md#full-success). Anything else is defined as an unsuccessful operation. For successful
     * operations, `error.type` MUST NOT be set. For unsuccessful export operations, `error.type` MUST contain a relevant failure cause
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `histogram` |
     * | Unit: | `s` |
     * | Status: | `Development`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::ERROR_TYPE`] | `Conditionally_required`: If operation has ended with an error
     * | [`crate::attribute::HTTP_RESPONSE_STATUS_CODE`] | `{"recommended": "when applicable"}`
     * | [`crate::attribute::OTEL_COMPONENT_NAME`] | `Recommended`
     * | [`crate::attribute::OTEL_COMPONENT_TYPE`] | `Recommended`
     * | [`crate::attribute::RPC_GRPC_STATUS_CODE`] | `{"recommended": "when applicable"}`
     * | [`crate::attribute::SERVER_ADDRESS`] | `{"recommended": "when applicable"}`
     * | [`crate::attribute::SERVER_PORT`] | `{"recommended": "when applicable"}`
     */
    public const val otelSdkExporterOperationDuration: String = "otel.sdk.exporter.operation.duration"

    /**
     * ## Description
     *
     * The number of spans for which the export has finished, either successful or failed
     *
     * ## Notes
     *
     * For successful exports, `error.type` MUST NOT be set. For failed exports, `error.type` MUST contain the failure cause.
     * For exporters with partial success semantics (e.g. OTLP with `rejected_spans`), rejected spans MUST count as failed and only non-rejected spans count as success.
     * If no rejection reason is available, `rejected` SHOULD be used as value for `error.type`
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `counter` |
     * | Unit: | `{span}` |
     * | Status: | `Development`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::ERROR_TYPE`] | `Recommended`
     * | [`crate::attribute::OTEL_COMPONENT_NAME`] | `Recommended`
     * | [`crate::attribute::OTEL_COMPONENT_TYPE`] | `Recommended`
     * | [`crate::attribute::SERVER_ADDRESS`] | `{"recommended": "when applicable"}`
     * | [`crate::attribute::SERVER_PORT`] | `{"recommended": "when applicable"}`
     */
    public const val otelSdkExporterSpanExported: String = "otel.sdk.exporter.span.exported"

    /**
     * ## Description
     *
     * Deprecated, use `otel.sdk.exporter.span.exported` instead
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `updowncounter` |
     * | Unit: | `{span}` |
     * | Status: | `Development`  |
     */
    @Deprecated("{note: Replaced by `otel.sdk.exporter.span.exported`., reason: renamed, renamed_to: otel.sdk.exporter.span.exported}")
    public const val otelSdkExporterSpanExportedCount: String = "otel.sdk.exporter.span.exported.count"

    /**
     * ## Description
     *
     * The number of spans which were passed to the exporter, but that have not been exported yet (neither successful, nor failed)
     *
     * ## Notes
     *
     * For successful exports, `error.type` MUST NOT be set. For failed exports, `error.type` MUST contain the failure cause
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `updowncounter` |
     * | Unit: | `{span}` |
     * | Status: | `Development`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::OTEL_COMPONENT_NAME`] | `Recommended`
     * | [`crate::attribute::OTEL_COMPONENT_TYPE`] | `Recommended`
     * | [`crate::attribute::SERVER_ADDRESS`] | `{"recommended": "when applicable"}`
     * | [`crate::attribute::SERVER_PORT`] | `{"recommended": "when applicable"}`
     */
    public const val otelSdkExporterSpanInflight: String = "otel.sdk.exporter.span.inflight"

    /**
     * ## Description
     *
     * Deprecated, use `otel.sdk.exporter.span.inflight` instead
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `updowncounter` |
     * | Unit: | `{span}` |
     * | Status: | `Development`  |
     */
    @Deprecated("{note: Replaced by `otel.sdk.exporter.span.inflight`., reason: renamed, renamed_to: otel.sdk.exporter.span.inflight}")
    public const val otelSdkExporterSpanInflightCount: String = "otel.sdk.exporter.span.inflight.count"

    /**
     * ## Description
     *
     * The number of logs submitted to enabled SDK Loggers
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `counter` |
     * | Unit: | `{log_record}` |
     * | Status: | `Development`  |
     */
    public const val otelSdkLogCreated: String = "otel.sdk.log.created"

    /**
     * ## Description
     *
     * The duration of the collect operation of the metric reader.
     *
     * ## Notes
     *
     * For successful collections, `error.type` MUST NOT be set. For failed collections, `error.type` SHOULD contain the failure cause.
     * It can happen that metrics collection is successful for some MetricProducers, while others fail. In that case `error.type` SHOULD be set to any of the failure causes
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `histogram` |
     * | Unit: | `s` |
     * | Status: | `Development`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::ERROR_TYPE`] | `Recommended`
     * | [`crate::attribute::OTEL_COMPONENT_NAME`] | `Recommended`
     * | [`crate::attribute::OTEL_COMPONENT_TYPE`] | `Recommended`
     */
    public const val otelSdkMetricReaderCollectionDuration: String = "otel.sdk.metric_reader.collection.duration"

    /**
     * ## Description
     *
     * The number of log records for which the processing has finished, either successful or failed
     *
     * ## Notes
     *
     * For successful processing, `error.type` MUST NOT be set. For failed processing, `error.type` MUST contain the failure cause.
     * For the SDK Simple and Batching Log Record Processor a log record is considered to be processed already when it has been submitted to the exporter,
     * not when the corresponding export call has finished
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `counter` |
     * | Unit: | `{log_record}` |
     * | Status: | `Development`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::ERROR_TYPE`] | `Recommended`
     * | [`crate::attribute::OTEL_COMPONENT_NAME`] | `Recommended`
     * | [`crate::attribute::OTEL_COMPONENT_TYPE`] | `Recommended`
     */
    public const val otelSdkProcessorLogProcessed: String = "otel.sdk.processor.log.processed"

    /**
     * ## Description
     *
     * The maximum number of log records the queue of a given instance of an SDK Log Record processor can hold
     *
     * ## Notes
     *
     * Only applies to Log Record processors which use a queue, e.g. the SDK Batching Log Record Processor
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `updowncounter` |
     * | Unit: | `{log_record}` |
     * | Status: | `Development`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::OTEL_COMPONENT_NAME`] | `Recommended`
     * | [`crate::attribute::OTEL_COMPONENT_TYPE`] | `Recommended`
     */
    public const val otelSdkProcessorLogQueueCapacity: String = "otel.sdk.processor.log.queue.capacity"

    /**
     * ## Description
     *
     * The number of log records in the queue of a given instance of an SDK log processor
     *
     * ## Notes
     *
     * Only applies to log record processors which use a queue, e.g. the SDK Batching Log Record Processor
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `updowncounter` |
     * | Unit: | `{log_record}` |
     * | Status: | `Development`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::OTEL_COMPONENT_NAME`] | `Recommended`
     * | [`crate::attribute::OTEL_COMPONENT_TYPE`] | `Recommended`
     */
    public const val otelSdkProcessorLogQueueSize: String = "otel.sdk.processor.log.queue.size"

    /**
     * ## Description
     *
     * The number of spans for which the processing has finished, either successful or failed
     *
     * ## Notes
     *
     * For successful processing, `error.type` MUST NOT be set. For failed processing, `error.type` MUST contain the failure cause.
     * For the SDK Simple and Batching Span Processor a span is considered to be processed already when it has been submitted to the exporter, not when the corresponding export call has finished
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `counter` |
     * | Unit: | `{span}` |
     * | Status: | `Development`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::ERROR_TYPE`] | `Recommended`
     * | [`crate::attribute::OTEL_COMPONENT_NAME`] | `Recommended`
     * | [`crate::attribute::OTEL_COMPONENT_TYPE`] | `Recommended`
     */
    public const val otelSdkProcessorSpanProcessed: String = "otel.sdk.processor.span.processed"

    /**
     * ## Description
     *
     * Deprecated, use `otel.sdk.processor.span.processed` instead
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `updowncounter` |
     * | Unit: | `{span}` |
     * | Status: | `Development`  |
     */
    @Deprecated("{note: Replaced by `otel.sdk.processor.span.processed`., reason: renamed, renamed_to: otel.sdk.processor.span.processed}")
    public const val otelSdkProcessorSpanProcessedCount: String = "otel.sdk.processor.span.processed.count"

    /**
     * ## Description
     *
     * The maximum number of spans the queue of a given instance of an SDK span processor can hold
     *
     * ## Notes
     *
     * Only applies to span processors which use a queue, e.g. the SDK Batching Span Processor
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `updowncounter` |
     * | Unit: | `{span}` |
     * | Status: | `Development`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::OTEL_COMPONENT_NAME`] | `Recommended`
     * | [`crate::attribute::OTEL_COMPONENT_TYPE`] | `Recommended`
     */
    public const val otelSdkProcessorSpanQueueCapacity: String = "otel.sdk.processor.span.queue.capacity"

    /**
     * ## Description
     *
     * The number of spans in the queue of a given instance of an SDK span processor
     *
     * ## Notes
     *
     * Only applies to span processors which use a queue, e.g. the SDK Batching Span Processor
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `updowncounter` |
     * | Unit: | `{span}` |
     * | Status: | `Development`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::OTEL_COMPONENT_NAME`] | `Recommended`
     * | [`crate::attribute::OTEL_COMPONENT_TYPE`] | `Recommended`
     */
    public const val otelSdkProcessorSpanQueueSize: String = "otel.sdk.processor.span.queue.size"

    /**
     * ## Description
     *
     * Use `otel.sdk.span.started` minus `otel.sdk.span.live` to derive this value
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `counter` |
     * | Unit: | `{span}` |
     * | Status: | `Development`  |
     */
    @Deprecated("{note: Obsoleted., reason: obsoleted}")
    public const val otelSdkSpanEnded: String = "otel.sdk.span.ended"

    /**
     * ## Description
     *
     * Use `otel.sdk.span.started` minus `otel.sdk.span.live` to derive this value
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `counter` |
     * | Unit: | `{span}` |
     * | Status: | `Development`  |
     */
    @Deprecated("{note: Obsoleted., reason: obsoleted}")
    public const val otelSdkSpanEndedCount: String = "otel.sdk.span.ended.count"

    /**
     * ## Description
     *
     * The number of created spans with `recording=true` for which the end operation has not been called yet
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `updowncounter` |
     * | Unit: | `{span}` |
     * | Status: | `Development`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::OTEL_SPAN_SAMPLING_RESULT`] | `Recommended`
     */
    public const val otelSdkSpanLive: String = "otel.sdk.span.live"

    /**
     * ## Description
     *
     * Deprecated, use `otel.sdk.span.live` instead
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `updowncounter` |
     * | Unit: | `{span}` |
     * | Status: | `Development`  |
     */
    @Deprecated("{note: Replaced by `otel.sdk.span.live`., reason: renamed, renamed_to: otel.sdk.span.live}")
    public const val otelSdkSpanLiveCount: String = "otel.sdk.span.live.count"

    /**
     * ## Description
     *
     * The number of created spans
     *
     * ## Notes
     *
     * Implementations MUST record this metric for all spans, even for non-recording ones
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `counter` |
     * | Unit: | `{span}` |
     * | Status: | `Development`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::OTEL_SPAN_PARENT_ORIGIN`] | `Recommended`
     * | [`crate::attribute::OTEL_SPAN_SAMPLING_RESULT`] | `Recommended`
     */
    public const val otelSdkSpanStarted: String = "otel.sdk.span.started"

    /**
     * ## Description
     *
     * Number of times the process has been context switched
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `counter` |
     * | Unit: | `{context_switch}` |
     * | Status: | `Development`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::PROCESS_CONTEXT_SWITCH_TYPE`] | `Recommended`
     */
    public const val processContextSwitches: String = "process.context_switches"

    /**
     * ## Description
     *
     * Total CPU seconds broken down by different states
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `counter` |
     * | Unit: | `s` |
     * | Status: | `Development`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::CPU_MODE`] | `Recommended`
     */
    public const val processCpuTime: String = "process.cpu.time"

    /**
     * ## Description
     *
     * Difference in process.cpu.time since the last measurement, divided by the elapsed time and number of CPUs available to the process
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `gauge` |
     * | Unit: | `1` |
     * | Status: | `Development`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::CPU_MODE`] | `Recommended`
     */
    public const val processCpuUtilization: String = "process.cpu.utilization"

    /**
     * ## Description
     *
     * Disk bytes transferred
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `counter` |
     * | Unit: | `By` |
     * | Status: | `Development`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::DISK_IO_DIRECTION`] | `Recommended`
     */
    public const val processDiskIo: String = "process.disk.io"

    /**
     * ## Description
     *
     * The amount of physical memory in use
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `updowncounter` |
     * | Unit: | `By` |
     * | Status: | `Development`  |
     */
    public const val processMemoryUsage: String = "process.memory.usage"

    /**
     * ## Description
     *
     * The amount of committed virtual memory
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `updowncounter` |
     * | Unit: | `By` |
     * | Status: | `Development`  |
     */
    public const val processMemoryVirtual: String = "process.memory.virtual"

    /**
     * ## Description
     *
     * Network bytes transferred
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `counter` |
     * | Unit: | `By` |
     * | Status: | `Development`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::NETWORK_IO_DIRECTION`] | `Recommended`
     */
    public const val processNetworkIo: String = "process.network.io"

    /**
     * ## Description
     *
     * Number of file descriptors in use by the process
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `updowncounter` |
     * | Unit: | `{file_descriptor}` |
     * | Status: | `Development`  |
     */
    public const val processOpenFileDescriptorCount: String = "process.open_file_descriptor.count"

    /**
     * ## Description
     *
     * Number of page faults the process has made
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `counter` |
     * | Unit: | `{fault}` |
     * | Status: | `Development`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::PROCESS_PAGING_FAULT_TYPE`] | `Recommended`
     */
    public const val processPagingFaults: String = "process.paging.faults"

    /**
     * ## Description
     *
     * Process threads count
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `updowncounter` |
     * | Unit: | `{thread}` |
     * | Status: | `Development`  |
     */
    public const val processThreadCount: String = "process.thread.count"

    /**
     * ## Description
     *
     * The time the process has been running.
     *
     * ## Notes
     *
     * Instrumentations SHOULD use a gauge with type `double` and measure uptime in seconds as a floating point number with the highest precision available.
     * The actual accuracy would depend on the instrumentation and operating system
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `gauge` |
     * | Unit: | `s` |
     * | Status: | `Development`  |
     */
    public const val processUptime: String = "process.uptime"

    /**
     * ## Description
     *
     * Measures the duration of outbound RPC.
     *
     * ## Notes
     *
     * While streaming RPCs may record this metric as start-of-batch
     * to end-of-batch, it's hard to interpret in practice.
     *
     * **Streaming**: N/A
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `histogram` |
     * | Unit: | `ms` |
     * | Status: | `Development`  |
     */
    public const val rpcClientDuration: String = "rpc.client.duration"

    /**
     * ## Description
     *
     * Measures the size of RPC request messages (uncompressed).
     *
     * ## Notes
     *
     * **Streaming**: Recorded per message in a streaming batch
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `histogram` |
     * | Unit: | `By` |
     * | Status: | `Development`  |
     */
    public const val rpcClientRequestSize: String = "rpc.client.request.size"

    /**
     * ## Description
     *
     * Measures the number of messages received per RPC.
     *
     * ## Notes
     *
     * Should be 1 for all non-streaming RPCs.
     *
     * **Streaming**: This metric is required for server and client streaming RPCs
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `histogram` |
     * | Unit: | `{count}` |
     * | Status: | `Development`  |
     */
    public const val rpcClientRequestsPerRpc: String = "rpc.client.requests_per_rpc"

    /**
     * ## Description
     *
     * Measures the size of RPC response messages (uncompressed).
     *
     * ## Notes
     *
     * **Streaming**: Recorded per response in a streaming batch
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `histogram` |
     * | Unit: | `By` |
     * | Status: | `Development`  |
     */
    public const val rpcClientResponseSize: String = "rpc.client.response.size"

    /**
     * ## Description
     *
     * Measures the number of messages sent per RPC.
     *
     * ## Notes
     *
     * Should be 1 for all non-streaming RPCs.
     *
     * **Streaming**: This metric is required for server and client streaming RPCs
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `histogram` |
     * | Unit: | `{count}` |
     * | Status: | `Development`  |
     */
    public const val rpcClientResponsesPerRpc: String = "rpc.client.responses_per_rpc"

    /**
     * ## Description
     *
     * Measures the duration of inbound RPC.
     *
     * ## Notes
     *
     * While streaming RPCs may record this metric as start-of-batch
     * to end-of-batch, it's hard to interpret in practice.
     *
     * **Streaming**: N/A
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `histogram` |
     * | Unit: | `ms` |
     * | Status: | `Development`  |
     */
    public const val rpcServerDuration: String = "rpc.server.duration"

    /**
     * ## Description
     *
     * Measures the size of RPC request messages (uncompressed).
     *
     * ## Notes
     *
     * **Streaming**: Recorded per message in a streaming batch
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `histogram` |
     * | Unit: | `By` |
     * | Status: | `Development`  |
     */
    public const val rpcServerRequestSize: String = "rpc.server.request.size"

    /**
     * ## Description
     *
     * Measures the number of messages received per RPC.
     *
     * ## Notes
     *
     * Should be 1 for all non-streaming RPCs.
     *
     * **Streaming** : This metric is required for server and client streaming RPCs
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `histogram` |
     * | Unit: | `{count}` |
     * | Status: | `Development`  |
     */
    public const val rpcServerRequestsPerRpc: String = "rpc.server.requests_per_rpc"

    /**
     * ## Description
     *
     * Measures the size of RPC response messages (uncompressed).
     *
     * ## Notes
     *
     * **Streaming**: Recorded per response in a streaming batch
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `histogram` |
     * | Unit: | `By` |
     * | Status: | `Development`  |
     */
    public const val rpcServerResponseSize: String = "rpc.server.response.size"

    /**
     * ## Description
     *
     * Measures the number of messages sent per RPC.
     *
     * ## Notes
     *
     * Should be 1 for all non-streaming RPCs.
     *
     * **Streaming**: This metric is required for server and client streaming RPCs
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `histogram` |
     * | Unit: | `{count}` |
     * | Status: | `Development`  |
     */
    public const val rpcServerResponsesPerRpc: String = "rpc.server.responses_per_rpc"

    /**
     * ## Description
     *
     * Number of connections that are currently active on the server.
     *
     * ## Notes
     *
     * Meter name: `Microsoft.AspNetCore.Http.Connections`; Added in: ASP.NET Core 8.0
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `updowncounter` |
     * | Unit: | `{connection}` |
     * | Status: | `Stable`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::SIGNALR_CONNECTION_STATUS`] | `Recommended`
     * | [`crate::attribute::SIGNALR_TRANSPORT`] | `Recommended`
     */
    public const val signalrServerActiveConnections: String = "signalr.server.active_connections"

    /**
     * ## Description
     *
     * The duration of connections on the server.
     *
     * ## Notes
     *
     * Meter name: `Microsoft.AspNetCore.Http.Connections`; Added in: ASP.NET Core 8.0
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `histogram` |
     * | Unit: | `s` |
     * | Status: | `Stable`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::SIGNALR_CONNECTION_STATUS`] | `Recommended`
     * | [`crate::attribute::SIGNALR_TRANSPORT`] | `Recommended`
     */
    public const val signalrServerConnectionDuration: String = "signalr.server.connection.duration"

    /**
     * ## Description
     *
     * Operating frequency of the logical CPU in Hertz
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `gauge` |
     * | Unit: | `Hz` |
     * | Status: | `Development`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::CPU_LOGICAL_NUMBER`] | `Recommended`
     */
    public const val systemCpuFrequency: String = "system.cpu.frequency"

    /**
     * ## Description
     *
     * Reports the number of logical (virtual) processor cores created by the operating system to manage multitasking
     *
     * ## Notes
     *
     * Calculated by multiplying the number of sockets by the number of cores per socket, and then by the number of threads per core
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `updowncounter` |
     * | Unit: | `{cpu}` |
     * | Status: | `Development`  |
     */
    public const val systemCpuLogicalCount: String = "system.cpu.logical.count"

    /**
     * ## Description
     *
     * Reports the number of actual physical processor cores on the hardware
     *
     * ## Notes
     *
     * Calculated by multiplying the number of sockets by the number of cores per socket
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `updowncounter` |
     * | Unit: | `{cpu}` |
     * | Status: | `Development`  |
     */
    public const val systemCpuPhysicalCount: String = "system.cpu.physical.count"

    /**
     * ## Description
     *
     * Seconds each logical CPU spent on each mode
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `counter` |
     * | Unit: | `s` |
     * | Status: | `Development`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::CPU_LOGICAL_NUMBER`] | `Recommended`
     * | [`crate::attribute::CPU_MODE`] | `Recommended`
     */
    public const val systemCpuTime: String = "system.cpu.time"

    /**
     * ## Description
     *
     * For each logical CPU, the utilization is calculated as the change in cumulative CPU time (cpu.time) over a measurement interval, divided by the elapsed time
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `gauge` |
     * | Unit: | `1` |
     * | Status: | `Development`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::CPU_LOGICAL_NUMBER`] | `Recommended`
     * | [`crate::attribute::CPU_MODE`] | `Recommended`
     */
    public const val systemCpuUtilization: String = "system.cpu.utilization"

    /**
     * ## Description
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `counter` |
     * | Unit: | `By` |
     * | Status: | `Development`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::DISK_IO_DIRECTION`] | `Recommended`
     * | [`crate::attribute::SYSTEM_DEVICE`] | `Recommended`
     */
    public const val systemDiskIo: String = "system.disk.io"

    /**
     * ## Description
     *
     * Time disk spent activated
     *
     * ## Notes
     *
     * The real elapsed time ("wall clock") used in the I/O path (time from operations running in parallel are not counted). Measured as:
     *
     * - Linux: Field 13 from [procfs-diskstats](https://www.kernel.org/doc/Documentation/ABI/testing/procfs-diskstats)
     * - Windows: The complement of
     * ["Disk% Idle Time"](https://learn.microsoft.com/archive/blogs/askcore/windows-performance-monitor-disk-counters-explained#windows-performance-monitor-disk-counters-explained)
     * performance counter: `uptime * (100 - "Disk\% Idle Time") / 100`
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `counter` |
     * | Unit: | `s` |
     * | Status: | `Development`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::SYSTEM_DEVICE`] | `Recommended`
     */
    public const val systemDiskIoTime: String = "system.disk.io_time"

    /**
     * ## Description
     *
     * The total storage capacity of the disk
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `updowncounter` |
     * | Unit: | `By` |
     * | Status: | `Development`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::SYSTEM_DEVICE`] | `Recommended`
     */
    public const val systemDiskLimit: String = "system.disk.limit"

    /**
     * ## Description
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `counter` |
     * | Unit: | `{operation}` |
     * | Status: | `Development`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::DISK_IO_DIRECTION`] | `Recommended`
     * | [`crate::attribute::SYSTEM_DEVICE`] | `Recommended`
     */
    public const val systemDiskMerged: String = "system.disk.merged"

    /**
     * ## Description
     *
     * Sum of the time each operation took to complete
     *
     * ## Notes
     *
     * Because it is the sum of time each request took, parallel-issued requests each contribute to make the count grow. Measured as:
     *
     * - Linux: Fields 7 & 11 from [procfs-diskstats](https://www.kernel.org/doc/Documentation/ABI/testing/procfs-diskstats)
     * - Windows: "Avg. Disk sec/Read" perf counter multiplied by "Disk Reads/sec" perf counter (similar for Writes)
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `counter` |
     * | Unit: | `s` |
     * | Status: | `Development`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::DISK_IO_DIRECTION`] | `Recommended`
     * | [`crate::attribute::SYSTEM_DEVICE`] | `Recommended`
     */
    public const val systemDiskOperationTime: String = "system.disk.operation_time"

    /**
     * ## Description
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `counter` |
     * | Unit: | `{operation}` |
     * | Status: | `Development`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::DISK_IO_DIRECTION`] | `Recommended`
     * | [`crate::attribute::SYSTEM_DEVICE`] | `Recommended`
     */
    public const val systemDiskOperations: String = "system.disk.operations"

    /**
     * ## Description
     *
     * The total storage capacity of the filesystem
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `updowncounter` |
     * | Unit: | `By` |
     * | Status: | `Development`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::SYSTEM_DEVICE`] | `Recommended`
     * | [`crate::attribute::SYSTEM_FILESYSTEM_MODE`] | `Recommended`
     * | [`crate::attribute::SYSTEM_FILESYSTEM_MOUNTPOINT`] | `Recommended`
     * | [`crate::attribute::SYSTEM_FILESYSTEM_TYPE`] | `Recommended`
     */
    public const val systemFilesystemLimit: String = "system.filesystem.limit"

    /**
     * ## Description
     *
     * Reports a filesystem's space usage across different states.
     *
     * ## Notes
     *
     * The sum of all `system.filesystem.usage` values over the different `system.filesystem.state` attributes
     * SHOULD equal the total storage capacity of the filesystem, that is `system.filesystem.limit`
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `updowncounter` |
     * | Unit: | `By` |
     * | Status: | `Development`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::SYSTEM_DEVICE`] | `Recommended`
     * | [`crate::attribute::SYSTEM_FILESYSTEM_MODE`] | `Recommended`
     * | [`crate::attribute::SYSTEM_FILESYSTEM_MOUNTPOINT`] | `Recommended`
     * | [`crate::attribute::SYSTEM_FILESYSTEM_STATE`] | `Recommended`
     * | [`crate::attribute::SYSTEM_FILESYSTEM_TYPE`] | `Recommended`
     */
    public const val systemFilesystemUsage: String = "system.filesystem.usage"

    /**
     * ## Description
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `gauge` |
     * | Unit: | `1` |
     * | Status: | `Development`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::SYSTEM_DEVICE`] | `Recommended`
     * | [`crate::attribute::SYSTEM_FILESYSTEM_MODE`] | `Recommended`
     * | [`crate::attribute::SYSTEM_FILESYSTEM_MOUNTPOINT`] | `Recommended`
     * | [`crate::attribute::SYSTEM_FILESYSTEM_STATE`] | `Recommended`
     * | [`crate::attribute::SYSTEM_FILESYSTEM_TYPE`] | `Recommended`
     */
    public const val systemFilesystemUtilization: String = "system.filesystem.utilization"

    /**
     * ## Description
     *
     * An estimate of how much memory is available for starting new applications, without causing swapping
     *
     * ## Notes
     *
     * This is an alternative to `system.memory.usage` metric with `state=free`.
     * Linux starting from 3.14 exports "available" memory. It takes "free" memory as a baseline, and then factors in kernel-specific values.
     * This is supposed to be more accurate than just "free" memory.
     * For reference, see the calculations [here](https://superuser.com/a/980821).
     * See also `MemAvailable` in [/proc/meminfo](https://man7.org/linux/man-pages/man5/proc.5.html)
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `updowncounter` |
     * | Unit: | `By` |
     * | Status: | `Development`  |
     */
    public const val systemLinuxMemoryAvailable: String = "system.linux.memory.available"

    /**
     * ## Description
     *
     * Reports the memory used by the Linux kernel for managing caches of frequently used objects.
     *
     * ## Notes
     *
     * The sum over the `reclaimable` and `unreclaimable` state values in `linux.memory.slab.usage` SHOULD be equal to the total slab memory available on the system.
     * Note that the total slab memory is not constant and may vary over time.
     * See also the [Slab allocator](https://blogs.oracle.com/linux/post/understanding-linux-kernel-memory-statistics) and `Slab` in [/proc/meminfo](https://man7.org/linux/man-pages/man5/proc.5.html)
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `updowncounter` |
     * | Unit: | `By` |
     * | Status: | `Development`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::LINUX_MEMORY_SLAB_STATE`] | `Recommended`
     */
    public const val systemLinuxMemorySlabUsage: String = "system.linux.memory.slab.usage"

    /**
     * ## Description
     *
     * Total memory available in the system.
     *
     * ## Notes
     *
     * Its value SHOULD equal the sum of `system.memory.state` over all states
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `updowncounter` |
     * | Unit: | `By` |
     * | Status: | `Development`  |
     */
    public const val systemMemoryLimit: String = "system.memory.limit"

    /**
     * ## Description
     *
     * Shared memory used (mostly by tmpfs).
     *
     * ## Notes
     *
     * Equivalent of `shared` from [`free` command](https://man7.org/linux/man-pages/man1/free.1.html) or
     * `Shmem` from [`/proc/meminfo`](https://man7.org/linux/man-pages/man5/proc.5.html)"
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `updowncounter` |
     * | Unit: | `By` |
     * | Status: | `Development`  |
     */
    public const val systemMemoryShared: String = "system.memory.shared"

    /**
     * ## Description
     *
     * Reports memory in use by state.
     *
     * ## Notes
     *
     * The sum over all `system.memory.state` values SHOULD equal the total memory
     * available on the system, that is `system.memory.limit`
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `updowncounter` |
     * | Unit: | `By` |
     * | Status: | `Development`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::SYSTEM_MEMORY_STATE`] | `Recommended`
     */
    public const val systemMemoryUsage: String = "system.memory.usage"

    /**
     * ## Description
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `gauge` |
     * | Unit: | `1` |
     * | Status: | `Development`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::SYSTEM_MEMORY_STATE`] | `Recommended`
     */
    public const val systemMemoryUtilization: String = "system.memory.utilization"

    /**
     * ## Description
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `updowncounter` |
     * | Unit: | `{connection}` |
     * | Status: | `Development`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::NETWORK_CONNECTION_STATE`] | `Recommended`
     * | [`crate::attribute::NETWORK_INTERFACE_NAME`] | `Recommended`
     * | [`crate::attribute::NETWORK_TRANSPORT`] | `Recommended`
     */
    public const val systemNetworkConnectionCount: String = "system.network.connection.count"

    /**
     * ## Description
     *
     * Deprecated, use `system.network.connection.count` instead
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `updowncounter` |
     * | Unit: | `{connection}` |
     * | Status: | `Development`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::NETWORK_CONNECTION_STATE`] | `Recommended`
     * | [`crate::attribute::NETWORK_INTERFACE_NAME`] | `Recommended`
     * | [`crate::attribute::NETWORK_TRANSPORT`] | `Recommended`
     */
    @Deprecated("{note: Replaced by `system.network.connection.count`., reason: renamed, renamed_to: system.network.connection.count}")
    public const val systemNetworkConnections: String = "system.network.connections"

    /**
     * ## Description
     *
     * Count of packets that are dropped or discarded even though there was no error
     *
     * ## Notes
     *
     * Measured as:
     *
     * - Linux: the `drop` column in `/proc/dev/net` ([source](https://web.archive.org/web/20180321091318/http://www.onlamp.com/pub/a/linux/2000/11/16/LinuxAdmin.html))
     * - Windows: [`InDiscards`/`OutDiscards`](https://docs.microsoft.com/windows/win32/api/netioapi/ns-netioapi-mib_if_row2)
     * from [`GetIfEntry2`](https://docs.microsoft.com/windows/win32/api/netioapi/nf-netioapi-getifentry2)
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `counter` |
     * | Unit: | `{packet}` |
     * | Status: | `Development`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::NETWORK_INTERFACE_NAME`] | `Recommended`
     * | [`crate::attribute::NETWORK_IO_DIRECTION`] | `Recommended`
     */
    public const val systemNetworkDropped: String = "system.network.dropped"

    /**
     * ## Description
     *
     * Count of network errors detected
     *
     * ## Notes
     *
     * Measured as:
     *
     * - Linux: the `errs` column in `/proc/dev/net` ([source](https://web.archive.org/web/20180321091318/http://www.onlamp.com/pub/a/linux/2000/11/16/LinuxAdmin.html)).
     * - Windows: [`InErrors`/`OutErrors`](https://docs.microsoft.com/windows/win32/api/netioapi/ns-netioapi-mib_if_row2)
     * from [`GetIfEntry2`](https://docs.microsoft.com/windows/win32/api/netioapi/nf-netioapi-getifentry2)
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `counter` |
     * | Unit: | `{error}` |
     * | Status: | `Development`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::NETWORK_INTERFACE_NAME`] | `Recommended`
     * | [`crate::attribute::NETWORK_IO_DIRECTION`] | `Recommended`
     */
    public const val systemNetworkErrors: String = "system.network.errors"

    /**
     * ## Description
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `counter` |
     * | Unit: | `By` |
     * | Status: | `Development`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::NETWORK_INTERFACE_NAME`] | `Recommended`
     * | [`crate::attribute::NETWORK_IO_DIRECTION`] | `Recommended`
     */
    public const val systemNetworkIo: String = "system.network.io"

    /**
     * ## Description
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `counter` |
     * | Unit: | `{packet}` |
     * | Status: | `Development`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::NETWORK_IO_DIRECTION`] | `Recommended`
     * | [`crate::attribute::SYSTEM_DEVICE`] | `Recommended`
     */
    public const val systemNetworkPackets: String = "system.network.packets"

    /**
     * ## Description
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `counter` |
     * | Unit: | `{fault}` |
     * | Status: | `Development`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::SYSTEM_PAGING_TYPE`] | `Recommended`
     */
    public const val systemPagingFaults: String = "system.paging.faults"

    /**
     * ## Description
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `counter` |
     * | Unit: | `{operation}` |
     * | Status: | `Development`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::SYSTEM_PAGING_DIRECTION`] | `Recommended`
     * | [`crate::attribute::SYSTEM_PAGING_TYPE`] | `Recommended`
     */
    public const val systemPagingOperations: String = "system.paging.operations"

    /**
     * ## Description
     *
     * Unix swap or windows pagefile usage
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `updowncounter` |
     * | Unit: | `By` |
     * | Status: | `Development`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::SYSTEM_DEVICE`] | `Recommended`
     * | [`crate::attribute::SYSTEM_PAGING_STATE`] | `Recommended`
     */
    public const val systemPagingUsage: String = "system.paging.usage"

    /**
     * ## Description
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `gauge` |
     * | Unit: | `1` |
     * | Status: | `Development`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::SYSTEM_DEVICE`] | `Recommended`
     * | [`crate::attribute::SYSTEM_PAGING_STATE`] | `Recommended`
     */
    public const val systemPagingUtilization: String = "system.paging.utilization"

    /**
     * ## Description
     *
     * Total number of processes in each state
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `updowncounter` |
     * | Unit: | `{process}` |
     * | Status: | `Development`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::SYSTEM_PROCESS_STATUS`] | `Recommended`
     */
    public const val systemProcessCount: String = "system.process.count"

    /**
     * ## Description
     *
     * Total number of processes created over uptime of the host
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `counter` |
     * | Unit: | `{process}` |
     * | Status: | `Development`  |
     */
    public const val systemProcessCreated: String = "system.process.created"

    /**
     * ## Description
     *
     * The time the system has been running
     *
     * ## Notes
     *
     * Instrumentations SHOULD use a gauge with type `double` and measure uptime in seconds as a floating point number with the highest precision available.
     * The actual accuracy would depend on the instrumentation and operating system
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `gauge` |
     * | Unit: | `s` |
     * | Status: | `Development`  |
     */
    public const val systemUptime: String = "system.uptime"

    /**
     * ## Description
     *
     * Garbage collection duration.
     *
     * ## Notes
     *
     * The values can be retrieved from [`perf_hooks.PerformanceObserver(...).observe({ entryTypes: ['gc'] })`](https://nodejs.org/api/perf_hooks.html#performanceobserverobserveoptions)
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `histogram` |
     * | Unit: | `s` |
     * | Status: | `Development`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::V8JS_GC_TYPE`] | `Required`
     */
    public const val v8jsGcDuration: String = "v8js.gc.duration"

    /**
     * ## Description
     *
     * Heap space available size.
     *
     * ## Notes
     *
     * Value can be retrieved from value `space_available_size` of [`v8.getHeapSpaceStatistics()`](https://nodejs.org/api/v8.html#v8getheapspacestatistics)
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `updowncounter` |
     * | Unit: | `By` |
     * | Status: | `Development`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::V8JS_HEAP_SPACE_NAME`] | `Required`
     */
    public const val v8jsHeapSpaceAvailableSize: String = "v8js.heap.space.available_size"

    /**
     * ## Description
     *
     * Committed size of a heap space.
     *
     * ## Notes
     *
     * Value can be retrieved from value `physical_space_size` of [`v8.getHeapSpaceStatistics()`](https://nodejs.org/api/v8.html#v8getheapspacestatistics)
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `updowncounter` |
     * | Unit: | `By` |
     * | Status: | `Development`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::V8JS_HEAP_SPACE_NAME`] | `Required`
     */
    public const val v8jsHeapSpacePhysicalSize: String = "v8js.heap.space.physical_size"

    /**
     * ## Description
     *
     * Total heap memory size pre-allocated.
     *
     * ## Notes
     *
     * The value can be retrieved from value `space_size` of [`v8.getHeapSpaceStatistics()`](https://nodejs.org/api/v8.html#v8getheapspacestatistics)
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `updowncounter` |
     * | Unit: | `By` |
     * | Status: | `Development`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::V8JS_HEAP_SPACE_NAME`] | `Required`
     */
    public const val v8jsMemoryHeapLimit: String = "v8js.memory.heap.limit"

    /**
     * ## Description
     *
     * Heap Memory size allocated.
     *
     * ## Notes
     *
     * The value can be retrieved from value `space_used_size` of [`v8.getHeapSpaceStatistics()`](https://nodejs.org/api/v8.html#v8getheapspacestatistics)
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `updowncounter` |
     * | Unit: | `By` |
     * | Status: | `Development`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::V8JS_HEAP_SPACE_NAME`] | `Required`
     */
    public const val v8jsMemoryHeapUsed: String = "v8js.memory.heap.used"

    /**
     * ## Description
     *
     * The number of changes (pull requests/merge requests/changelists) in a repository, categorized by their state (e.g. open or merged)
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `updowncounter` |
     * | Unit: | `{change}` |
     * | Status: | `Development`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::VCS_CHANGE_STATE`] | `Required`
     * | [`crate::attribute::VCS_OWNER_NAME`] | `Recommended`
     * | [`crate::attribute::VCS_PROVIDER_NAME`] | `Opt_in`
     * | [`crate::attribute::VCS_REPOSITORY_NAME`] | `Recommended`
     * | [`crate::attribute::VCS_REPOSITORY_URL_FULL`] | `Required`
     */
    public const val vcsChangeCount: String = "vcs.change.count"

    /**
     * ## Description
     *
     * The time duration a change (pull request/merge request/changelist) has been in a given state
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `gauge` |
     * | Unit: | `s` |
     * | Status: | `Development`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::VCS_CHANGE_STATE`] | `Required`
     * | [`crate::attribute::VCS_OWNER_NAME`] | `Recommended`
     * | [`crate::attribute::VCS_PROVIDER_NAME`] | `Opt_in`
     * | [`crate::attribute::VCS_REF_HEAD_NAME`] | `Required`
     * | [`crate::attribute::VCS_REPOSITORY_NAME`] | `Recommended`
     * | [`crate::attribute::VCS_REPOSITORY_URL_FULL`] | `Required`
     */
    public const val vcsChangeDuration: String = "vcs.change.duration"

    /**
     * ## Description
     *
     * The amount of time since its creation it took a change (pull request/merge request/changelist) to get the first approval
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `gauge` |
     * | Unit: | `s` |
     * | Status: | `Development`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::VCS_OWNER_NAME`] | `Recommended`
     * | [`crate::attribute::VCS_PROVIDER_NAME`] | `Opt_in`
     * | [`crate::attribute::VCS_REF_BASE_NAME`] | `Recommended`
     * | [`crate::attribute::VCS_REF_BASE_REVISION`] | `Opt_in`
     * | [`crate::attribute::VCS_REF_HEAD_NAME`] | `Required`
     * | [`crate::attribute::VCS_REF_HEAD_REVISION`] | `Opt_in`
     * | [`crate::attribute::VCS_REPOSITORY_NAME`] | `Recommended`
     * | [`crate::attribute::VCS_REPOSITORY_URL_FULL`] | `Required`
     */
    public const val vcsChangeTimeToApproval: String = "vcs.change.time_to_approval"

    /**
     * ## Description
     *
     * The amount of time since its creation it took a change (pull request/merge request/changelist) to get merged into the target(base) ref
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `gauge` |
     * | Unit: | `s` |
     * | Status: | `Development`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::VCS_OWNER_NAME`] | `Recommended`
     * | [`crate::attribute::VCS_PROVIDER_NAME`] | `Opt_in`
     * | [`crate::attribute::VCS_REF_BASE_NAME`] | `Recommended`
     * | [`crate::attribute::VCS_REF_BASE_REVISION`] | `Opt_in`
     * | [`crate::attribute::VCS_REF_HEAD_NAME`] | `Required`
     * | [`crate::attribute::VCS_REF_HEAD_REVISION`] | `Opt_in`
     * | [`crate::attribute::VCS_REPOSITORY_NAME`] | `Recommended`
     * | [`crate::attribute::VCS_REPOSITORY_URL_FULL`] | `Required`
     */
    public const val vcsChangeTimeToMerge: String = "vcs.change.time_to_merge"

    /**
     * ## Description
     *
     * The number of unique contributors to a repository
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `gauge` |
     * | Unit: | `{contributor}` |
     * | Status: | `Development`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::VCS_OWNER_NAME`] | `Recommended`
     * | [`crate::attribute::VCS_PROVIDER_NAME`] | `Opt_in`
     * | [`crate::attribute::VCS_REPOSITORY_NAME`] | `Recommended`
     * | [`crate::attribute::VCS_REPOSITORY_URL_FULL`] | `Required`
     */
    public const val vcsContributorCount: String = "vcs.contributor.count"

    /**
     * ## Description
     *
     * The number of refs of type branch or tag in a repository
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `updowncounter` |
     * | Unit: | `{ref}` |
     * | Status: | `Development`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::VCS_OWNER_NAME`] | `Recommended`
     * | [`crate::attribute::VCS_PROVIDER_NAME`] | `Opt_in`
     * | [`crate::attribute::VCS_REF_TYPE`] | `Required`
     * | [`crate::attribute::VCS_REPOSITORY_NAME`] | `Recommended`
     * | [`crate::attribute::VCS_REPOSITORY_URL_FULL`] | `Required`
     */
    public const val vcsRefCount: String = "vcs.ref.count"

    /**
     * ## Description
     *
     * The number of lines added/removed in a ref (branch) relative to the ref from the `vcs.ref.base.name` attribute.
     *
     * ## Notes
     *
     * This metric should be reported for each `vcs.line_change.type` value. For example if a ref added 3 lines and removed 2 lines,
     * instrumentation SHOULD report two measurements: 3 and 2 (both positive numbers).
     * If number of lines added/removed should be calculated from the start of time, then `vcs.ref.base.name` SHOULD be set to an empty string
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `gauge` |
     * | Unit: | `{line}` |
     * | Status: | `Development`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::VCS_CHANGE_ID`] | `Conditionally_required`: if a change is associate with the ref.
     * | [`crate::attribute::VCS_LINE_CHANGE_TYPE`] | `Required`
     * | [`crate::attribute::VCS_OWNER_NAME`] | `Recommended`
     * | [`crate::attribute::VCS_PROVIDER_NAME`] | `Opt_in`
     * | [`crate::attribute::VCS_REF_BASE_NAME`] | `Required`
     * | [`crate::attribute::VCS_REF_BASE_TYPE`] | `Required`
     * | [`crate::attribute::VCS_REF_HEAD_NAME`] | `Required`
     * | [`crate::attribute::VCS_REF_HEAD_TYPE`] | `Required`
     * | [`crate::attribute::VCS_REPOSITORY_NAME`] | `Recommended`
     * | [`crate::attribute::VCS_REPOSITORY_URL_FULL`] | `Required`
     */
    public const val vcsRefLinesDelta: String = "vcs.ref.lines_delta"

    /**
     * ## Description
     *
     * The number of revisions (commits) a ref (branch) is ahead/behind the branch from the `vcs.ref.base.name` attribute
     *
     * ## Notes
     *
     * This metric should be reported for each `vcs.revision_delta.direction` value. For example if branch `a` is 3 commits behind and 2 commits ahead of `trunk`,
     * instrumentation SHOULD report two measurements: 3 and 2 (both positive numbers) and `vcs.ref.base.name` is set to `trunk`
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `gauge` |
     * | Unit: | `{revision}` |
     * | Status: | `Development`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::VCS_CHANGE_ID`] | `Conditionally_required`: if a change is associate with the ref.
     * | [`crate::attribute::VCS_OWNER_NAME`] | `Recommended`
     * | [`crate::attribute::VCS_PROVIDER_NAME`] | `Opt_in`
     * | [`crate::attribute::VCS_REF_BASE_NAME`] | `Required`
     * | [`crate::attribute::VCS_REF_BASE_TYPE`] | `Required`
     * | [`crate::attribute::VCS_REF_HEAD_NAME`] | `Required`
     * | [`crate::attribute::VCS_REF_HEAD_TYPE`] | `Required`
     * | [`crate::attribute::VCS_REPOSITORY_NAME`] | `Recommended`
     * | [`crate::attribute::VCS_REPOSITORY_URL_FULL`] | `Required`
     * | [`crate::attribute::VCS_REVISION_DELTA_DIRECTION`] | `Required`
     */
    public const val vcsRefRevisionsDelta: String = "vcs.ref.revisions_delta"

    /**
     * ## Description
     *
     * Time a ref (branch) created from the default branch (trunk) has existed. The `ref.type` attribute will always be `branch`
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `gauge` |
     * | Unit: | `s` |
     * | Status: | `Development`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::VCS_OWNER_NAME`] | `Recommended`
     * | [`crate::attribute::VCS_PROVIDER_NAME`] | `Opt_in`
     * | [`crate::attribute::VCS_REF_HEAD_NAME`] | `Required`
     * | [`crate::attribute::VCS_REF_HEAD_TYPE`] | `Required`
     * | [`crate::attribute::VCS_REPOSITORY_NAME`] | `Recommended`
     * | [`crate::attribute::VCS_REPOSITORY_URL_FULL`] | `Required`
     */
    public const val vcsRefTime: String = "vcs.ref.time"

    /**
     * ## Description
     *
     * The number of repositories in an organization
     * ## Metadata
     * | | |
     * |:-|:-
     * | Instrument: | `updowncounter` |
     * | Unit: | `{repository}` |
     * | Status: | `Development`  |
     *
     * ## Attributes
     * | Name | Requirement |
     * |:-|:- |
     * | [`crate::attribute::VCS_OWNER_NAME`] | `Recommended`
     * | [`crate::attribute::VCS_PROVIDER_NAME`] | `Opt_in`
     */
    public const val vcsRepositoryCount: String = "vcs.repository.count"
}
