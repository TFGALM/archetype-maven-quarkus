/*
 * Copyright © 2024 Adrian Lopez.
 * All rights reserved
 */

package alopezpa.homelab.api.infrastructure.controllers;

import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;

import alopezpa.homelab.api.domain.models.requests.endpoint1.ExampleRequest;
import alopezpa.homelab.api.domain.models.responses.endpoint1.ExampleResponse;
import alopezpa.homelab.api.domain.services.ExampleService;
import io.quarkus.runtime.annotations.RegisterForReflection;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.validation.Valid;
import jakarta.ws.rs.BeanParam;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;


@Path("/api/example")
@Tag(name = "Example", description = "API for managing examples")
@RegisterForReflection
@RequiredArgsConstructor
@ApplicationScoped
@Slf4j
@SuppressWarnings({"PMD.GuardLogStatement"})
public class ExampleController {

    private final ExampleService exampleService;

    /**
     * Endpoint para obtener un ejemplo basado en los parámetros de entrada.
     * @param exampleRequest Información de la solicitud de ejemplo
     * @return Ejemplo generado
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Operation(summary = "Retrieve an example", description = "Generates an example response based on the input "
            + "parameters.")
    public ExampleResponse getExample(@BeanParam @Valid ExampleRequest exampleRequest) {

        log.debug("getName: {}, getLastname: {}", exampleRequest.getName(), exampleRequest.getLastname());

        return exampleService.getUserById(exampleRequest);
    }
}
