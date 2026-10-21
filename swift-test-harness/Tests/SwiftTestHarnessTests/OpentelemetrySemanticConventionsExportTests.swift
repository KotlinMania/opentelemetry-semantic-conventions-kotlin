import Testing
import OpentelemetrySemanticConventions

@Suite("OpentelemetrySemanticConventions Export Smoke Tests")
struct OpentelemetrySemanticConventionsExportTests {
    @Test("Schema URL and semantic conventions export cleanly")
    func testSemanticConventionsExport() throws {
        #expect(SCHEMA_URL == "https://opentelemetry.io/schemas/1.36.0")
        #expect(Attribute.shared.SERVICE_NAME == "service.name")
        #expect(Metric.shared.HTTP_SERVER_REQUEST_DURATION == "http.server.request.duration")
        #expect(Resource.shared.SERVICE_NAME == "service.name")
        #expect(Trace.shared.CLIENT_ADDRESS == "client.address")
    }
}
