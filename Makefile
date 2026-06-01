# ==============================================================================
#  RP KOTLIN GENERATION MAKEFILE
# ==============================================================================

# ---------------------------- CONFIGURATION -----------------------------------
# The path to the submodule containing .proto files and buf config
PROTO_ROOT := render-protocol-spec

# The config file specific to Kotlin (inside the submodule)
BUF_CONFIG := $(PROTO_ROOT)/buf.gen.kotlin.yaml

# The destination for generated files
OUTPUT_DIR := src/main/java

# ------------------------------- TASKS ----------------------------------------

.PHONY: all generate clean update-protos init-protos

all: generate

# 1. Init/Update the submodule to get the latest .proto definitions
init-protos:
	@echo "🔄 Initializing submodule..."
	git submodule update --init --remote

update-protos:
	@echo "🔄 Updating submodule..."
	git submodule update --remote --merge

# 2. Clean the output directory to remove stale files
clean:
	@echo "🧹 Cleaning previous build..."
	rm -rf $(OUTPUT_DIR)/*

# 3. Generate the Kotlin code
generate: clean
	@echo "🚀 Generating Kotlin sources..."
	@mkdir -p $(OUTPUT_DIR)
# command breakdown:
# 1. input: $(PROTO_ROOT) -> The directory containing .proto files
# 2. --template: Uses the config file located INSIDE the submodule
# 3. -o: Overrides the output path to your local Source folder
	buf generate $(PROTO_ROOT) \
		--template $(BUF_CONFIG) \
		-o $(OUTPUT_DIR)
	@echo "✅ Kotlin generation complete!"