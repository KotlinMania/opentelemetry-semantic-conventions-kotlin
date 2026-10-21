package io.github.kotlinmania.opentelemetrysemanticconventions

import io.github.kotlinmania.opentelemetry.KeyValue
import io.github.kotlinmania.opentelemetry.global.meter
import io.github.kotlinmania.opentelemetry.global.tracer
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotNull

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
        assertEquals("system.cpu.frequency", Metric.SYSTEM_CPU_FREQUENCY)
        assertEquals("dns.lookup.duration", Metric.DNS_LOOKUP_DURATION)
    }

    @Test
    fun metricUsageDoctest() {
        val m = meter("mylibraryname")
        val histogram =
            m
                .u64Histogram(Metric.HTTP_SERVER_REQUEST_DURATION)
                .withUnit("s")
                .withDescription("Duration of HTTP server requests.")
                .build()
        assertNotNull(histogram)
        assertEquals("GET", KeyValue.new(Attribute.HTTP_REQUEST_METHOD, "GET").value.asStr())
    }

    @Test
    fun traceUsageDoctest() {
        val t = tracer("my-component")
        val span =
            t
                .spanBuilder("span-name")
                .withAttributes(
                    listOf(
                        KeyValue.new(Trace.CLIENT_ADDRESS, "example.org"),
                        KeyValue.new(Trace.CLIENT_PORT, 80L),
                    ),
                ).start(t)
        span.end()
    }
}
