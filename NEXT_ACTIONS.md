# Immediate Actions - High-Value Files

Based on AST analysis, here are the concrete next steps.

## Summary

- **Files Present:** 5/5 (100.0%)
- **Function parity:** 0/0 matched — N/A
- **Class/type parity:** 0/0 matched (target 4) — N/A
- **Combined symbol parity:** 0/0 matched (target 4) — N/A
- **Average inline-code cosine:** 0.50 (function body across 4 matched files)
- **Average documentation cosine:** 0.81 (doc text across 4 matched files)
- **Cheat-zeroed Files:** 3
- **Critical Issues:** 3 files with <0.60 function similarity

## Priority 1: Fix Incomplete High-Dependency Files

No incomplete high-dependency files detected.

## Priority 2: Port Missing High-Value Files

Critical missing files (>10 dependencies):

No missing high-value files detected.

## Detailed Work Items

Every matched file is listed below with function and type symbol parity.

### 1. lib

- **Target:** `opentelemetrysemanticconventions.Lib [STUB] [PROVENANCE-FALLBACK]`
- **Similarity:** 0.00
- **Dependents:** 0
- **Priority Score:** 10.0
- **Functions:** 0/0 matched
- **Missing functions:** _none_
- **Types:** 0/0 matched
- **Missing types:** _none_
- **Provenance warning:** port-lint provenance header matched only after fallback normalization: `opentelemetry-semantic-conventions/src/lib.rs` vs expected `lib.rs`
- **Proposed provenance header:** `// port-lint: source lib.rs` (current: `// port-lint: source opentelemetry-semantic-conventions/src/lib.rs`)
- **Lint issues:** 1

### 2. metric

- **Target:** `opentelemetrysemanticconventions.Metric [ZERO] [PROVENANCE-FALLBACK]`
- **Similarity:** 0.00
- **Dependents:** 0
- **Priority Score:** 10.0
- **Functions:** 0/0 matched
- **Missing functions:** _none_
- **Types:** 0/0 matched (target 1)
- **Missing types:** _none_
- **Provenance warning:** port-lint provenance header matched only after fallback normalization: `opentelemetry-semantic-conventions/src/metric.rs` vs expected `metric.rs`
- **Proposed provenance header:** `// port-lint: source metric.rs` (current: `// port-lint: source opentelemetry-semantic-conventions/src/metric.rs`)
- **Lint issues:** 1

### 3. attribute

- **Target:** `opentelemetrysemanticconventions.Attribute [ZERO] [PROVENANCE-FALLBACK]`
- **Similarity:** 0.00
- **Dependents:** 0
- **Priority Score:** 10.0
- **Functions:** 0/0 matched
- **Missing functions:** _none_
- **Types:** 0/0 matched (target 1)
- **Missing types:** _none_
- **Provenance warning:** port-lint provenance header matched only after fallback normalization: `opentelemetry-semantic-conventions/src/attribute.rs` vs expected `attribute.rs`
- **Proposed provenance header:** `// port-lint: source attribute.rs` (current: `// port-lint: source opentelemetry-semantic-conventions/src/attribute.rs`)
- **Lint issues:** 1

### 4. trace

- **Target:** `opentelemetrysemanticconventions.Trace [PROVENANCE-FALLBACK]`
- **Similarity:** 1.00
- **Dependents:** 0
- **Priority Score:** 0.0
- **Functions:** 0/0 matched
- **Missing functions:** _none_
- **Types:** 0/0 matched (target 1)
- **Missing types:** _none_
- **Provenance warning:** port-lint provenance header matched only after fallback normalization: `opentelemetry-semantic-conventions/src/trace.rs` vs expected `trace.rs`
- **Proposed provenance header:** `// port-lint: source trace.rs` (current: `// port-lint: source opentelemetry-semantic-conventions/src/trace.rs`)
- **Lint issues:** 1

### 5. resource

- **Target:** `opentelemetrysemanticconventions.Resource [PROVENANCE-FALLBACK]`
- **Similarity:** 1.00
- **Dependents:** 0
- **Priority Score:** 0.0
- **Functions:** 0/0 matched
- **Missing functions:** _none_
- **Types:** 0/0 matched (target 1)
- **Missing types:** _none_
- **Provenance warning:** port-lint provenance header matched only after fallback normalization: `opentelemetry-semantic-conventions/src/resource.rs` vs expected `resource.rs`
- **Proposed provenance header:** `// port-lint: source resource.rs` (current: `// port-lint: source opentelemetry-semantic-conventions/src/resource.rs`)
- **Lint issues:** 1

## Success Criteria

For each file to be considered "complete":
- **Similarity ≥ 0.85** (Excellent threshold)
- All public APIs ported
- All tests ported
- Documentation ported
- port-lint header present

