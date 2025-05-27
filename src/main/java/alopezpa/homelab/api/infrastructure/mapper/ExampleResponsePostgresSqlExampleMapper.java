/*
 * Copyright © 2024 Adrian Lopez.
 * All rights reserved
 */

package alopezpa.homelab.api.infrastructure.mapper;

import alopezpa.homelab.api.domain.models.dtos.PostgresSqlExample;
import alopezpa.homelab.api.domain.models.responses.endpoint1.ExampleResponse;
import jakarta.enterprise.context.Dependent;
import lombok.RequiredArgsConstructor;


@Dependent
@RequiredArgsConstructor
public class ExampleResponsePostgresSqlExampleMapper {

    /**
     * Maps PostgresSqlExample to ExampleResponse.
     * @param postgresData the data from Postgres to be mapped
     * @return the mapped ExampleResponse
     */
    public ExampleResponse map(PostgresSqlExample postgresData) {
        return ExampleResponse.builder()
                              .age(postgresData.getAttribute1())
                              .location(postgresData.getAttribute2())
                              .example(null)
                              .build();
    }
}
