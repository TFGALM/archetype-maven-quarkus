/*
 * Copyright © 2024 Adrian Lopez.
 * All rights reserved
 */

package alopezpa.homelab.api.domain.models.requests.endpoint1;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

import io.quarkus.runtime.annotations.RegisterForReflection;
import jakarta.validation.constraints.NotEmpty;
import jakarta.ws.rs.QueryParam;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@RegisterForReflection
public class ExampleRequest {

    @Schema(description = "User name", examples = {"pepe"})
    @NotEmpty
    @QueryParam("name")
    private String name;

    @Schema(description = "User last name", examples = {"jacinto"})
    @NotEmpty
    @QueryParam("lastname")
    private String lastname;
}
