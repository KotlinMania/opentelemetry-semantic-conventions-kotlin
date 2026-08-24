import Testing
import OpentelemetrySemanticConventions

@Suite("OpentelemetrySemanticConventions Export Smoke Tests")
struct OpentelemetrySemanticConventionsExportTests {
    @Test("Swift module loads cleanly")
    func testSwiftModuleLoads() throws {
        #expect(true)
    }
}
