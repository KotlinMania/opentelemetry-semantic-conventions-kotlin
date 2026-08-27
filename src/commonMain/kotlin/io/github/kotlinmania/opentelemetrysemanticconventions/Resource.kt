// port-lint: source opentelemetry-semantic-conventions/src/resource.rs
package io.github.kotlinmania.opentelemetrysemanticconventions

/**
 * Resource semantic conventions defined by the OpenTelemetry specification.
 *
 * The resource semantic conventions define a set of standardized attributes
 * to be used in resources.
 */
@Suppress("DEPRECATION")
public object Resource {
    public val ANDROID_OS_API_LEVEL: String get() = Attribute.ANDROID_OS_API_LEVEL

    public val APP_INSTALLATION_ID: String get() = Attribute.APP_INSTALLATION_ID

    public val AWS_ECS_CLUSTER_ARN: String get() = Attribute.AWS_ECS_CLUSTER_ARN

    public val AWS_ECS_CONTAINER_ARN: String get() = Attribute.AWS_ECS_CONTAINER_ARN

    public val AWS_ECS_LAUNCHTYPE: String get() = Attribute.AWS_ECS_LAUNCHTYPE

    public val AWS_ECS_TASK_ARN: String get() = Attribute.AWS_ECS_TASK_ARN

    public val AWS_ECS_TASK_FAMILY: String get() = Attribute.AWS_ECS_TASK_FAMILY

    public val AWS_ECS_TASK_ID: String get() = Attribute.AWS_ECS_TASK_ID

    public val AWS_ECS_TASK_REVISION: String get() = Attribute.AWS_ECS_TASK_REVISION

    public val AWS_EKS_CLUSTER_ARN: String get() = Attribute.AWS_EKS_CLUSTER_ARN

    public val AWS_LOG_GROUP_ARNS: String get() = Attribute.AWS_LOG_GROUP_ARNS

    public val AWS_LOG_GROUP_NAMES: String get() = Attribute.AWS_LOG_GROUP_NAMES

    public val AWS_LOG_STREAM_ARNS: String get() = Attribute.AWS_LOG_STREAM_ARNS

    public val AWS_LOG_STREAM_NAMES: String get() = Attribute.AWS_LOG_STREAM_NAMES

    public val BROWSER_BRANDS: String get() = Attribute.BROWSER_BRANDS

    public val BROWSER_LANGUAGE: String get() = Attribute.BROWSER_LANGUAGE

    public val BROWSER_MOBILE: String get() = Attribute.BROWSER_MOBILE

    public val BROWSER_PLATFORM: String get() = Attribute.BROWSER_PLATFORM

    public val CICD_PIPELINE_NAME: String get() = Attribute.CICD_PIPELINE_NAME

    public val CICD_PIPELINE_RUN_ID: String get() = Attribute.CICD_PIPELINE_RUN_ID

    public val CICD_PIPELINE_RUN_URL_FULL: String get() = Attribute.CICD_PIPELINE_RUN_URL_FULL

    public val CICD_WORKER_ID: String get() = Attribute.CICD_WORKER_ID

    public val CICD_WORKER_NAME: String get() = Attribute.CICD_WORKER_NAME

    public val CICD_WORKER_URL_FULL: String get() = Attribute.CICD_WORKER_URL_FULL

    public val CLOUD_ACCOUNT_ID: String get() = Attribute.CLOUD_ACCOUNT_ID

    public val CLOUD_AVAILABILITY_ZONE: String get() = Attribute.CLOUD_AVAILABILITY_ZONE

    public val CLOUD_PLATFORM: String get() = Attribute.CLOUD_PLATFORM

    public val CLOUD_PROVIDER: String get() = Attribute.CLOUD_PROVIDER

    public val CLOUD_REGION: String get() = Attribute.CLOUD_REGION

    public val CLOUD_RESOURCE_ID: String get() = Attribute.CLOUD_RESOURCE_ID

    public val CLOUDFOUNDRY_APP_ID: String get() = Attribute.CLOUDFOUNDRY_APP_ID

    public val CLOUDFOUNDRY_APP_NAME: String get() = Attribute.CLOUDFOUNDRY_APP_NAME

    public val CLOUDFOUNDRY_ORG_ID: String get() = Attribute.CLOUDFOUNDRY_ORG_ID

    public val CLOUDFOUNDRY_ORG_NAME: String get() = Attribute.CLOUDFOUNDRY_ORG_NAME

    public val CLOUDFOUNDRY_PROCESS_ID: String get() = Attribute.CLOUDFOUNDRY_PROCESS_ID

    public val CLOUDFOUNDRY_PROCESS_TYPE: String get() = Attribute.CLOUDFOUNDRY_PROCESS_TYPE

    public val CLOUDFOUNDRY_SPACE_ID: String get() = Attribute.CLOUDFOUNDRY_SPACE_ID

    public val CLOUDFOUNDRY_SPACE_NAME: String get() = Attribute.CLOUDFOUNDRY_SPACE_NAME

    public val CLOUDFOUNDRY_SYSTEM_ID: String get() = Attribute.CLOUDFOUNDRY_SYSTEM_ID

    public val CLOUDFOUNDRY_SYSTEM_INSTANCE_ID: String get() = Attribute.CLOUDFOUNDRY_SYSTEM_INSTANCE_ID

    public val CONTAINER_COMMAND: String get() = Attribute.CONTAINER_COMMAND

    public val CONTAINER_COMMAND_ARGS: String get() = Attribute.CONTAINER_COMMAND_ARGS

    public val CONTAINER_COMMAND_LINE: String get() = Attribute.CONTAINER_COMMAND_LINE

    public val CONTAINER_ID: String get() = Attribute.CONTAINER_ID

    public val CONTAINER_IMAGE_ID: String get() = Attribute.CONTAINER_IMAGE_ID

    public val CONTAINER_IMAGE_NAME: String get() = Attribute.CONTAINER_IMAGE_NAME

    public val CONTAINER_IMAGE_REPO_DIGESTS: String get() = Attribute.CONTAINER_IMAGE_REPO_DIGESTS

    public val CONTAINER_IMAGE_TAGS: String get() = Attribute.CONTAINER_IMAGE_TAGS

    public val CONTAINER_LABEL: String get() = Attribute.CONTAINER_LABEL

    public val CONTAINER_NAME: String get() = Attribute.CONTAINER_NAME

    public val CONTAINER_RUNTIME: String get() = Attribute.CONTAINER_RUNTIME

    public val DEPLOYMENT_ENVIRONMENT_NAME: String get() = Attribute.DEPLOYMENT_ENVIRONMENT_NAME

    public val DEVICE_ID: String get() = Attribute.DEVICE_ID

    public val DEVICE_MANUFACTURER: String get() = Attribute.DEVICE_MANUFACTURER

    public val DEVICE_MODEL_IDENTIFIER: String get() = Attribute.DEVICE_MODEL_IDENTIFIER

    public val DEVICE_MODEL_NAME: String get() = Attribute.DEVICE_MODEL_NAME

    public val FAAS_INSTANCE: String get() = Attribute.FAAS_INSTANCE

    public val FAAS_MAX_MEMORY: String get() = Attribute.FAAS_MAX_MEMORY

    public val FAAS_NAME: String get() = Attribute.FAAS_NAME

    public val FAAS_VERSION: String get() = Attribute.FAAS_VERSION

    public val GCP_APPHUB_APPLICATION_CONTAINER: String get() = Attribute.GCP_APPHUB_APPLICATION_CONTAINER

    public val GCP_APPHUB_APPLICATION_ID: String get() = Attribute.GCP_APPHUB_APPLICATION_ID

    public val GCP_APPHUB_APPLICATION_LOCATION: String get() = Attribute.GCP_APPHUB_APPLICATION_LOCATION

    public val GCP_APPHUB_SERVICE_CRITICALITY_TYPE: String get() = Attribute.GCP_APPHUB_SERVICE_CRITICALITY_TYPE

    public val GCP_APPHUB_SERVICE_ENVIRONMENT_TYPE: String get() = Attribute.GCP_APPHUB_SERVICE_ENVIRONMENT_TYPE

    public val GCP_APPHUB_SERVICE_ID: String get() = Attribute.GCP_APPHUB_SERVICE_ID

    public val GCP_APPHUB_WORKLOAD_CRITICALITY_TYPE: String get() = Attribute.GCP_APPHUB_WORKLOAD_CRITICALITY_TYPE

    public val GCP_APPHUB_WORKLOAD_ENVIRONMENT_TYPE: String get() = Attribute.GCP_APPHUB_WORKLOAD_ENVIRONMENT_TYPE

    public val GCP_APPHUB_WORKLOAD_ID: String get() = Attribute.GCP_APPHUB_WORKLOAD_ID

    public val GCP_CLOUD_RUN_JOB_EXECUTION: String get() = Attribute.GCP_CLOUD_RUN_JOB_EXECUTION

    public val GCP_CLOUD_RUN_JOB_TASK_INDEX: String get() = Attribute.GCP_CLOUD_RUN_JOB_TASK_INDEX

    public val GCP_GCE_INSTANCE_HOSTNAME: String get() = Attribute.GCP_GCE_INSTANCE_HOSTNAME

    public val GCP_GCE_INSTANCE_NAME: String get() = Attribute.GCP_GCE_INSTANCE_NAME

    public val HEROKU_APP_ID: String get() = Attribute.HEROKU_APP_ID

    public val HEROKU_RELEASE_COMMIT: String get() = Attribute.HEROKU_RELEASE_COMMIT

    public val HEROKU_RELEASE_CREATION_TIMESTAMP: String get() = Attribute.HEROKU_RELEASE_CREATION_TIMESTAMP

    public val HOST_ARCH: String get() = Attribute.HOST_ARCH

    public val HOST_CPU_CACHE_L2_SIZE: String get() = Attribute.HOST_CPU_CACHE_L2_SIZE

    public val HOST_CPU_FAMILY: String get() = Attribute.HOST_CPU_FAMILY

    public val HOST_CPU_MODEL_ID: String get() = Attribute.HOST_CPU_MODEL_ID

    public val HOST_CPU_MODEL_NAME: String get() = Attribute.HOST_CPU_MODEL_NAME

    public val HOST_CPU_STEPPING: String get() = Attribute.HOST_CPU_STEPPING

    public val HOST_CPU_VENDOR_ID: String get() = Attribute.HOST_CPU_VENDOR_ID

    public val HOST_ID: String get() = Attribute.HOST_ID

    public val HOST_IMAGE_ID: String get() = Attribute.HOST_IMAGE_ID

    public val HOST_IMAGE_NAME: String get() = Attribute.HOST_IMAGE_NAME

    public val HOST_IMAGE_VERSION: String get() = Attribute.HOST_IMAGE_VERSION

    public val HOST_IP: String get() = Attribute.HOST_IP

    public val HOST_MAC: String get() = Attribute.HOST_MAC

    public val HOST_NAME: String get() = Attribute.HOST_NAME

    public val HOST_TYPE: String get() = Attribute.HOST_TYPE

    public val K8S_CLUSTER_NAME: String get() = Attribute.K8S_CLUSTER_NAME

    public val K8S_CLUSTER_UID: String get() = Attribute.K8S_CLUSTER_UID

    public val K8S_CONTAINER_NAME: String get() = Attribute.K8S_CONTAINER_NAME

    public val K8S_CONTAINER_RESTART_COUNT: String get() = Attribute.K8S_CONTAINER_RESTART_COUNT

    public val K8S_CONTAINER_STATUS_LAST_TERMINATED_REASON: String get() = Attribute.K8S_CONTAINER_STATUS_LAST_TERMINATED_REASON

    public val K8S_CRONJOB_ANNOTATION: String get() = Attribute.K8S_CRONJOB_ANNOTATION

    public val K8S_CRONJOB_LABEL: String get() = Attribute.K8S_CRONJOB_LABEL

    public val K8S_CRONJOB_NAME: String get() = Attribute.K8S_CRONJOB_NAME

    public val K8S_CRONJOB_UID: String get() = Attribute.K8S_CRONJOB_UID

    public val K8S_DAEMONSET_ANNOTATION: String get() = Attribute.K8S_DAEMONSET_ANNOTATION

    public val K8S_DAEMONSET_LABEL: String get() = Attribute.K8S_DAEMONSET_LABEL

    public val K8S_DAEMONSET_NAME: String get() = Attribute.K8S_DAEMONSET_NAME

    public val K8S_DAEMONSET_UID: String get() = Attribute.K8S_DAEMONSET_UID

    public val K8S_DEPLOYMENT_ANNOTATION: String get() = Attribute.K8S_DEPLOYMENT_ANNOTATION

    public val K8S_DEPLOYMENT_LABEL: String get() = Attribute.K8S_DEPLOYMENT_LABEL

    public val K8S_DEPLOYMENT_NAME: String get() = Attribute.K8S_DEPLOYMENT_NAME

    public val K8S_DEPLOYMENT_UID: String get() = Attribute.K8S_DEPLOYMENT_UID

    public val K8S_HPA_NAME: String get() = Attribute.K8S_HPA_NAME

    public val K8S_HPA_SCALETARGETREF_API_VERSION: String get() = Attribute.K8S_HPA_SCALETARGETREF_API_VERSION

    public val K8S_HPA_SCALETARGETREF_KIND: String get() = Attribute.K8S_HPA_SCALETARGETREF_KIND

    public val K8S_HPA_SCALETARGETREF_NAME: String get() = Attribute.K8S_HPA_SCALETARGETREF_NAME

    public val K8S_HPA_UID: String get() = Attribute.K8S_HPA_UID

    public val K8S_JOB_ANNOTATION: String get() = Attribute.K8S_JOB_ANNOTATION

    public val K8S_JOB_LABEL: String get() = Attribute.K8S_JOB_LABEL

    public val K8S_JOB_NAME: String get() = Attribute.K8S_JOB_NAME

    public val K8S_JOB_UID: String get() = Attribute.K8S_JOB_UID

    public val K8S_NAMESPACE_ANNOTATION: String get() = Attribute.K8S_NAMESPACE_ANNOTATION

    public val K8S_NAMESPACE_LABEL: String get() = Attribute.K8S_NAMESPACE_LABEL

    public val K8S_NAMESPACE_NAME: String get() = Attribute.K8S_NAMESPACE_NAME

    public val K8S_NODE_ANNOTATION: String get() = Attribute.K8S_NODE_ANNOTATION

    public val K8S_NODE_LABEL: String get() = Attribute.K8S_NODE_LABEL

    public val K8S_NODE_NAME: String get() = Attribute.K8S_NODE_NAME

    public val K8S_NODE_UID: String get() = Attribute.K8S_NODE_UID

    public val K8S_POD_ANNOTATION: String get() = Attribute.K8S_POD_ANNOTATION

    public val K8S_POD_LABEL: String get() = Attribute.K8S_POD_LABEL

    public val K8S_POD_NAME: String get() = Attribute.K8S_POD_NAME

    public val K8S_POD_UID: String get() = Attribute.K8S_POD_UID

    public val K8S_REPLICASET_ANNOTATION: String get() = Attribute.K8S_REPLICASET_ANNOTATION

    public val K8S_REPLICASET_LABEL: String get() = Attribute.K8S_REPLICASET_LABEL

    public val K8S_REPLICASET_NAME: String get() = Attribute.K8S_REPLICASET_NAME

    public val K8S_REPLICASET_UID: String get() = Attribute.K8S_REPLICASET_UID

    public val K8S_REPLICATIONCONTROLLER_NAME: String get() = Attribute.K8S_REPLICATIONCONTROLLER_NAME

    public val K8S_REPLICATIONCONTROLLER_UID: String get() = Attribute.K8S_REPLICATIONCONTROLLER_UID

    public val K8S_RESOURCEQUOTA_NAME: String get() = Attribute.K8S_RESOURCEQUOTA_NAME

    public val K8S_RESOURCEQUOTA_UID: String get() = Attribute.K8S_RESOURCEQUOTA_UID

    public val K8S_STATEFULSET_ANNOTATION: String get() = Attribute.K8S_STATEFULSET_ANNOTATION

    public val K8S_STATEFULSET_LABEL: String get() = Attribute.K8S_STATEFULSET_LABEL

    public val K8S_STATEFULSET_NAME: String get() = Attribute.K8S_STATEFULSET_NAME

    public val K8S_STATEFULSET_UID: String get() = Attribute.K8S_STATEFULSET_UID

    public val MAINFRAME_LPAR_NAME: String get() = Attribute.MAINFRAME_LPAR_NAME

    public val OCI_MANIFEST_DIGEST: String get() = Attribute.OCI_MANIFEST_DIGEST

    public val OS_BUILD_ID: String get() = Attribute.OS_BUILD_ID

    public val OS_DESCRIPTION: String get() = Attribute.OS_DESCRIPTION

    public val OS_NAME: String get() = Attribute.OS_NAME

    public val OS_TYPE: String get() = Attribute.OS_TYPE

    public val OS_VERSION: String get() = Attribute.OS_VERSION

    public val OTEL_SCOPE_NAME: String get() = Attribute.OTEL_SCOPE_NAME

    public val OTEL_SCOPE_VERSION: String get() = Attribute.OTEL_SCOPE_VERSION

    public val PROCESS_COMMAND: String get() = Attribute.PROCESS_COMMAND

    public val PROCESS_COMMAND_ARGS: String get() = Attribute.PROCESS_COMMAND_ARGS

    public val PROCESS_COMMAND_LINE: String get() = Attribute.PROCESS_COMMAND_LINE

    public val PROCESS_EXECUTABLE_NAME: String get() = Attribute.PROCESS_EXECUTABLE_NAME

    public val PROCESS_EXECUTABLE_PATH: String get() = Attribute.PROCESS_EXECUTABLE_PATH

    public val PROCESS_LINUX_CGROUP: String get() = Attribute.PROCESS_LINUX_CGROUP

    public val PROCESS_OWNER: String get() = Attribute.PROCESS_OWNER

    public val PROCESS_PARENT_PID: String get() = Attribute.PROCESS_PARENT_PID

    public val PROCESS_PID: String get() = Attribute.PROCESS_PID

    public val PROCESS_RUNTIME_DESCRIPTION: String get() = Attribute.PROCESS_RUNTIME_DESCRIPTION

    public val PROCESS_RUNTIME_NAME: String get() = Attribute.PROCESS_RUNTIME_NAME

    public val PROCESS_RUNTIME_VERSION: String get() = Attribute.PROCESS_RUNTIME_VERSION

    public val SERVICE_INSTANCE_ID: String get() = Attribute.SERVICE_INSTANCE_ID

    public val SERVICE_NAME: String get() = Attribute.SERVICE_NAME

    public val SERVICE_NAMESPACE: String get() = Attribute.SERVICE_NAMESPACE

    public val SERVICE_VERSION: String get() = Attribute.SERVICE_VERSION

    public val TELEMETRY_DISTRO_NAME: String get() = Attribute.TELEMETRY_DISTRO_NAME

    public val TELEMETRY_DISTRO_VERSION: String get() = Attribute.TELEMETRY_DISTRO_VERSION

    public val TELEMETRY_SDK_LANGUAGE: String get() = Attribute.TELEMETRY_SDK_LANGUAGE

    public val TELEMETRY_SDK_NAME: String get() = Attribute.TELEMETRY_SDK_NAME

    public val TELEMETRY_SDK_VERSION: String get() = Attribute.TELEMETRY_SDK_VERSION

    public val USER_AGENT_ORIGINAL: String get() = Attribute.USER_AGENT_ORIGINAL

    public val VCS_REF_HEAD_NAME: String get() = Attribute.VCS_REF_HEAD_NAME

    public val VCS_REF_HEAD_REVISION: String get() = Attribute.VCS_REF_HEAD_REVISION

    public val VCS_REF_TYPE: String get() = Attribute.VCS_REF_TYPE

    public val VCS_REPOSITORY_NAME: String get() = Attribute.VCS_REPOSITORY_NAME

    public val VCS_REPOSITORY_URL_FULL: String get() = Attribute.VCS_REPOSITORY_URL_FULL

    public val WEBENGINE_DESCRIPTION: String get() = Attribute.WEBENGINE_DESCRIPTION

    public val WEBENGINE_NAME: String get() = Attribute.WEBENGINE_NAME

    public val WEBENGINE_VERSION: String get() = Attribute.WEBENGINE_VERSION

    public val ZOS_SMF_ID: String get() = Attribute.ZOS_SMF_ID

    public val ZOS_SYSPLEX_NAME: String get() = Attribute.ZOS_SYSPLEX_NAME
}
