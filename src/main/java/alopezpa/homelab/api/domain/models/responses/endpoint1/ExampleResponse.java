/*
 * Copyright © 2024 Adrian Lopez.
 * All rights reserved
 */

package alopezpa.homelab.api.domain.models.responses.endpoint1;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

import io.quarkus.runtime.annotations.RegisterForReflection;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@RegisterForReflection
public class ExampleResponse {

    @Schema(description = "User age.", examples = {"18"})
    private String age;

    @Schema(description = "User location.", examples = {"example"})
    private String location;

    @Schema(description = "Example for null discard.", examples = {"example"})
    private String example;
}
