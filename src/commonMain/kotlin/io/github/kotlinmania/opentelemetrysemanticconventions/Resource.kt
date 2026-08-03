// port-lint: source opentelemetry-semantic-conventions/src/resource.rs
package io.github.kotlinmania.opentelemetrysemanticconventions

/**
 * Resource semantic conventions defined by the OpenTelemetry specification.
 *
 * The resource semantic conventions define a set of standardized attributes
 * to be used in resources.
 */
public object Resource {
    public val androidOsApiLevel: String get() = Attribute.androidOsApiLevel

    public val appInstallationId: String get() = Attribute.appInstallationId

    public val awsEcsClusterArn: String get() = Attribute.awsEcsClusterArn

    public val awsEcsContainerArn: String get() = Attribute.awsEcsContainerArn

    public val awsEcsLaunchtype: String get() = Attribute.awsEcsLaunchtype

    public val awsEcsTaskArn: String get() = Attribute.awsEcsTaskArn

    public val awsEcsTaskFamily: String get() = Attribute.awsEcsTaskFamily

    public val awsEcsTaskId: String get() = Attribute.awsEcsTaskId

    public val awsEcsTaskRevision: String get() = Attribute.awsEcsTaskRevision

    public val awsEksClusterArn: String get() = Attribute.awsEksClusterArn

    public val awsLogGroupArns: String get() = Attribute.awsLogGroupArns

    public val awsLogGroupNames: String get() = Attribute.awsLogGroupNames

    public val awsLogStreamArns: String get() = Attribute.awsLogStreamArns

    public val awsLogStreamNames: String get() = Attribute.awsLogStreamNames

    public val browserBrands: String get() = Attribute.browserBrands

    public val browserLanguage: String get() = Attribute.browserLanguage

    public val browserMobile: String get() = Attribute.browserMobile

    public val browserPlatform: String get() = Attribute.browserPlatform

    public val cicdPipelineName: String get() = Attribute.cicdPipelineName

    public val cicdPipelineRunId: String get() = Attribute.cicdPipelineRunId

    public val cicdPipelineRunUrlFull: String get() = Attribute.cicdPipelineRunUrlFull

    public val cicdWorkerId: String get() = Attribute.cicdWorkerId

    public val cicdWorkerName: String get() = Attribute.cicdWorkerName

    public val cicdWorkerUrlFull: String get() = Attribute.cicdWorkerUrlFull

    public val cloudAccountId: String get() = Attribute.cloudAccountId

    public val cloudAvailabilityZone: String get() = Attribute.cloudAvailabilityZone

    public val cloudPlatform: String get() = Attribute.cloudPlatform

    public val cloudProvider: String get() = Attribute.cloudProvider

    public val cloudRegion: String get() = Attribute.cloudRegion

    public val cloudResourceId: String get() = Attribute.cloudResourceId

    public val cloudfoundryAppId: String get() = Attribute.cloudfoundryAppId

    public val cloudfoundryAppName: String get() = Attribute.cloudfoundryAppName

    public val cloudfoundryOrgId: String get() = Attribute.cloudfoundryOrgId

    public val cloudfoundryOrgName: String get() = Attribute.cloudfoundryOrgName

    public val cloudfoundryProcessId: String get() = Attribute.cloudfoundryProcessId

    public val cloudfoundryProcessType: String get() = Attribute.cloudfoundryProcessType

    public val cloudfoundrySpaceId: String get() = Attribute.cloudfoundrySpaceId

    public val cloudfoundrySpaceName: String get() = Attribute.cloudfoundrySpaceName

    public val cloudfoundrySystemId: String get() = Attribute.cloudfoundrySystemId

    public val cloudfoundrySystemInstanceId: String get() = Attribute.cloudfoundrySystemInstanceId

    public val containerCommand: String get() = Attribute.containerCommand

    public val containerCommandArgs: String get() = Attribute.containerCommandArgs

    public val containerCommandLine: String get() = Attribute.containerCommandLine

    public val containerId: String get() = Attribute.containerId

    public val containerImageId: String get() = Attribute.containerImageId

    public val containerImageName: String get() = Attribute.containerImageName

    public val containerImageRepoDigests: String get() = Attribute.containerImageRepoDigests

    public val containerImageTags: String get() = Attribute.containerImageTags

    public val containerLabel: String get() = Attribute.containerLabel

    public val containerName: String get() = Attribute.containerName

    public val containerRuntime: String get() = Attribute.containerRuntime

    public val deploymentEnvironmentName: String get() = Attribute.deploymentEnvironmentName

    public val deviceId: String get() = Attribute.deviceId

    public val deviceManufacturer: String get() = Attribute.deviceManufacturer

    public val deviceModelIdentifier: String get() = Attribute.deviceModelIdentifier

    public val deviceModelName: String get() = Attribute.deviceModelName

    public val faasInstance: String get() = Attribute.faasInstance

    public val faasMaxMemory: String get() = Attribute.faasMaxMemory

    public val faasName: String get() = Attribute.faasName

    public val faasVersion: String get() = Attribute.faasVersion

    public val gcpApphubApplicationContainer: String get() = Attribute.gcpApphubApplicationContainer

    public val gcpApphubApplicationId: String get() = Attribute.gcpApphubApplicationId

    public val gcpApphubApplicationLocation: String get() = Attribute.gcpApphubApplicationLocation

    public val gcpApphubServiceCriticalityType: String get() = Attribute.gcpApphubServiceCriticalityType

    public val gcpApphubServiceEnvironmentType: String get() = Attribute.gcpApphubServiceEnvironmentType

    public val gcpApphubServiceId: String get() = Attribute.gcpApphubServiceId

    public val gcpApphubWorkloadCriticalityType: String get() = Attribute.gcpApphubWorkloadCriticalityType

    public val gcpApphubWorkloadEnvironmentType: String get() = Attribute.gcpApphubWorkloadEnvironmentType

    public val gcpApphubWorkloadId: String get() = Attribute.gcpApphubWorkloadId

    public val gcpCloudRunJobExecution: String get() = Attribute.gcpCloudRunJobExecution

    public val gcpCloudRunJobTaskIndex: String get() = Attribute.gcpCloudRunJobTaskIndex

    public val gcpGceInstanceHostname: String get() = Attribute.gcpGceInstanceHostname

    public val gcpGceInstanceName: String get() = Attribute.gcpGceInstanceName

    public val herokuAppId: String get() = Attribute.herokuAppId

    public val herokuReleaseCommit: String get() = Attribute.herokuReleaseCommit

    public val herokuReleaseCreationTimestamp: String get() = Attribute.herokuReleaseCreationTimestamp

    public val hostArch: String get() = Attribute.hostArch

    public val hostCpuCacheL2Size: String get() = Attribute.hostCpuCacheL2Size

    public val hostCpuFamily: String get() = Attribute.hostCpuFamily

    public val hostCpuModelId: String get() = Attribute.hostCpuModelId

    public val hostCpuModelName: String get() = Attribute.hostCpuModelName

    public val hostCpuStepping: String get() = Attribute.hostCpuStepping

    public val hostCpuVendorId: String get() = Attribute.hostCpuVendorId

    public val hostId: String get() = Attribute.hostId

    public val hostImageId: String get() = Attribute.hostImageId

    public val hostImageName: String get() = Attribute.hostImageName

    public val hostImageVersion: String get() = Attribute.hostImageVersion

    public val hostIp: String get() = Attribute.hostIp

    public val hostMac: String get() = Attribute.hostMac

    public val hostName: String get() = Attribute.hostName

    public val hostType: String get() = Attribute.hostType

    public val k8sClusterName: String get() = Attribute.k8sClusterName

    public val k8sClusterUid: String get() = Attribute.k8sClusterUid

    public val k8sContainerName: String get() = Attribute.k8sContainerName

    public val k8sContainerRestartCount: String get() = Attribute.k8sContainerRestartCount

    public val k8sContainerStatusLastTerminatedReason: String get() = Attribute.k8sContainerStatusLastTerminatedReason

    public val k8sCronjobAnnotation: String get() = Attribute.k8sCronjobAnnotation

    public val k8sCronjobLabel: String get() = Attribute.k8sCronjobLabel

    public val k8sCronjobName: String get() = Attribute.k8sCronjobName

    public val k8sCronjobUid: String get() = Attribute.k8sCronjobUid

    public val k8sDaemonsetAnnotation: String get() = Attribute.k8sDaemonsetAnnotation

    public val k8sDaemonsetLabel: String get() = Attribute.k8sDaemonsetLabel

    public val k8sDaemonsetName: String get() = Attribute.k8sDaemonsetName

    public val k8sDaemonsetUid: String get() = Attribute.k8sDaemonsetUid

    public val k8sDeploymentAnnotation: String get() = Attribute.k8sDeploymentAnnotation

    public val k8sDeploymentLabel: String get() = Attribute.k8sDeploymentLabel

    public val k8sDeploymentName: String get() = Attribute.k8sDeploymentName

    public val k8sDeploymentUid: String get() = Attribute.k8sDeploymentUid

    public val k8sHpaName: String get() = Attribute.k8sHpaName

    public val k8sHpaScaletargetrefApiVersion: String get() = Attribute.k8sHpaScaletargetrefApiVersion

    public val k8sHpaScaletargetrefKind: String get() = Attribute.k8sHpaScaletargetrefKind

    public val k8sHpaScaletargetrefName: String get() = Attribute.k8sHpaScaletargetrefName

    public val k8sHpaUid: String get() = Attribute.k8sHpaUid

    public val k8sJobAnnotation: String get() = Attribute.k8sJobAnnotation

    public val k8sJobLabel: String get() = Attribute.k8sJobLabel

    public val k8sJobName: String get() = Attribute.k8sJobName

    public val k8sJobUid: String get() = Attribute.k8sJobUid

    public val k8sNamespaceAnnotation: String get() = Attribute.k8sNamespaceAnnotation

    public val k8sNamespaceLabel: String get() = Attribute.k8sNamespaceLabel

    public val k8sNamespaceName: String get() = Attribute.k8sNamespaceName

    public val k8sNodeAnnotation: String get() = Attribute.k8sNodeAnnotation

    public val k8sNodeLabel: String get() = Attribute.k8sNodeLabel

    public val k8sNodeName: String get() = Attribute.k8sNodeName

    public val k8sNodeUid: String get() = Attribute.k8sNodeUid

    public val k8sPodAnnotation: String get() = Attribute.k8sPodAnnotation

    public val k8sPodLabel: String get() = Attribute.k8sPodLabel

    public val k8sPodName: String get() = Attribute.k8sPodName

    public val k8sPodUid: String get() = Attribute.k8sPodUid

    public val k8sReplicasetAnnotation: String get() = Attribute.k8sReplicasetAnnotation

    public val k8sReplicasetLabel: String get() = Attribute.k8sReplicasetLabel

    public val k8sReplicasetName: String get() = Attribute.k8sReplicasetName

    public val k8sReplicasetUid: String get() = Attribute.k8sReplicasetUid

    public val k8sReplicationcontrollerName: String get() = Attribute.k8sReplicationcontrollerName

    public val k8sReplicationcontrollerUid: String get() = Attribute.k8sReplicationcontrollerUid

    public val k8sResourcequotaName: String get() = Attribute.k8sResourcequotaName

    public val k8sResourcequotaUid: String get() = Attribute.k8sResourcequotaUid

    public val k8sStatefulsetAnnotation: String get() = Attribute.k8sStatefulsetAnnotation

    public val k8sStatefulsetLabel: String get() = Attribute.k8sStatefulsetLabel

    public val k8sStatefulsetName: String get() = Attribute.k8sStatefulsetName

    public val k8sStatefulsetUid: String get() = Attribute.k8sStatefulsetUid

    public val mainframeLparName: String get() = Attribute.mainframeLparName

    public val ociManifestDigest: String get() = Attribute.ociManifestDigest

    public val osBuildId: String get() = Attribute.osBuildId

    public val osDescription: String get() = Attribute.osDescription

    public val osName: String get() = Attribute.osName

    public val osType: String get() = Attribute.osType

    public val osVersion: String get() = Attribute.osVersion

    public val otelScopeName: String get() = Attribute.otelScopeName

    public val otelScopeVersion: String get() = Attribute.otelScopeVersion

    public val processCommand: String get() = Attribute.processCommand

    public val processCommandArgs: String get() = Attribute.processCommandArgs

    public val processCommandLine: String get() = Attribute.processCommandLine

    public val processExecutableName: String get() = Attribute.processExecutableName

    public val processExecutablePath: String get() = Attribute.processExecutablePath

    public val processLinuxCgroup: String get() = Attribute.processLinuxCgroup

    public val processOwner: String get() = Attribute.processOwner

    public val processParentPid: String get() = Attribute.processParentPid

    public val processPid: String get() = Attribute.processPid

    public val processRuntimeDescription: String get() = Attribute.processRuntimeDescription

    public val processRuntimeName: String get() = Attribute.processRuntimeName

    public val processRuntimeVersion: String get() = Attribute.processRuntimeVersion

    public val serviceInstanceId: String get() = Attribute.serviceInstanceId

    public val serviceName: String get() = Attribute.serviceName

    public val serviceNamespace: String get() = Attribute.serviceNamespace

    public val serviceVersion: String get() = Attribute.serviceVersion

    public val telemetryDistroName: String get() = Attribute.telemetryDistroName

    public val telemetryDistroVersion: String get() = Attribute.telemetryDistroVersion

    public val telemetrySdkLanguage: String get() = Attribute.telemetrySdkLanguage

    public val telemetrySdkName: String get() = Attribute.telemetrySdkName

    public val telemetrySdkVersion: String get() = Attribute.telemetrySdkVersion

    public val userAgentOriginal: String get() = Attribute.userAgentOriginal

    public val vcsRefHeadName: String get() = Attribute.vcsRefHeadName

    public val vcsRefHeadRevision: String get() = Attribute.vcsRefHeadRevision

    public val vcsRefType: String get() = Attribute.vcsRefType

    public val vcsRepositoryName: String get() = Attribute.vcsRepositoryName

    public val vcsRepositoryUrlFull: String get() = Attribute.vcsRepositoryUrlFull

    public val webengineDescription: String get() = Attribute.webengineDescription

    public val webengineName: String get() = Attribute.webengineName

    public val webengineVersion: String get() = Attribute.webengineVersion

    public val zosSmfId: String get() = Attribute.zosSmfId

    public val zosSysplexName: String get() = Attribute.zosSysplexName
}
