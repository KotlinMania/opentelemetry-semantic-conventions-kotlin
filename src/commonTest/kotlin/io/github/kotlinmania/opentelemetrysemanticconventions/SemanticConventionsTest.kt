// port-lint: tests lib.rs
package io.github.kotlinmania.opentelemetrysemanticconventions

import kotlin.test.Test
import kotlin.test.assertEquals

@Suppress("DEPRECATION")
class SemanticConventionsTest {
    @Test
    fun schemaUrlIsDefined() {
        assertEquals("https://opentelemetry.io/schemas/1.36.0", SCHEMA_URL)
    }

    @Test
    fun attributeConstantsAreDefined() {
        assertEquals("android.app.state", Attribute.ANDROID_APP_STATE)
        assertEquals("http.request.method", Attribute.HTTP_REQUEST_METHOD)
        assertEquals("http.response.status_code", Attribute.HTTP_RESPONSE_STATUS_CODE)
        assertEquals("service.name", Attribute.SERVICE_NAME)
        assertEquals("service.version", Attribute.SERVICE_VERSION)
    }

    @Test
    fun resourceDelegatesToAttribute() {
        assertEquals(Attribute.ANDROID_OS_API_LEVEL, Resource.ANDROID_OS_API_LEVEL)
        assertEquals(Attribute.APP_INSTALLATION_ID, Resource.APP_INSTALLATION_ID)
        assertEquals(Attribute.AWS_ECS_CLUSTER_ARN, Resource.AWS_ECS_CLUSTER_ARN)
    }

    @Test
    fun traceDelegatesToAttribute() {
        assertEquals(Attribute.CLIENT_ADDRESS, Trace.CLIENT_ADDRESS)
        assertEquals(Attribute.HTTP_REQUEST_METHOD, Trace.HTTP_REQUEST_METHOD)
    }

    @Test
    fun metricConstantsAreDefined() {
        assertEquals("aspnetcore.diagnostics.exceptions", Metric.ASPNETCORE_DIAGNOSTICS_EXCEPTIONS)
        assertEquals("cpu.frequency", Metric.CPU_FREQUENCY)
        assertEquals("dns.lookup.duration", Metric.DNS_LOOKUP_DURATION)
    }
}
