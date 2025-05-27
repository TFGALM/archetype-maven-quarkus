/*
 * Copyright © 2024 Adrian Lopez.
 * All rights reserved
 */

package alopezpa.homelab.api.domain.services;

import alopezpa.homelab.api.domain.models.requests.endpoint1.ExampleRequest;
import alopezpa.homelab.api.domain.models.responses.endpoint1.ExampleResponse;
import alopezpa.homelab.api.domain.repositories.ExampleRepository;
import alopezpa.homelab.api.infrastructure.mapper.ExampleResponsePostgresSqlExampleMapper;
import jakarta.enterprise.context.ApplicationScoped;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@ApplicationScoped
@RequiredArgsConstructor
@Slf4j
public class ExampleService {

    private final ExampleRepository exampleRepository;
    private final ExampleResponsePostgresSqlExampleMapper mapper;

    /**
     * getUserById.
     * @param request ExampleRequest
     * @return ExampleResponse
     */
    public ExampleResponse getUserById(ExampleRequest request) {
        return mapper.map(exampleRepository.getExample(request.getName()));
    }
}
