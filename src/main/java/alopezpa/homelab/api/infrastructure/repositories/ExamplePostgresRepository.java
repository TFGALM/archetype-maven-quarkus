/*
 * Copyright © 2024 Adrian Lopez.
 * All rights reserved
 */

package alopezpa.homelab.api.infrastructure.repositories;

import alopezpa.homelab.api.domain.models.dtos.PostgresSqlExample;
import alopezpa.homelab.api.domain.repositories.ExampleRepository;
import jakarta.enterprise.context.ApplicationScoped;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@ApplicationScoped
@RequiredArgsConstructor
@Slf4j
public class ExamplePostgresRepository implements ExampleRepository {
    @Override
    // @transactional : Si es el metodo que realiza la consulta a DB.
    public PostgresSqlExample getExample(String name) {
        log.debug("Puedes escribir logs para de esta manera.");
        log.info("Puedes escribir logs para de esta manera.");
        log.warn("Puedes escribir logs para de esta manera.");
        log.error("Cuidado con este nivel, en el futuro se usara este nivel para lanzar alertas. Solo utilizar en "
                + "caso extremo.");

        return PostgresSqlExample.builder()
                                 .attribute1(name)
                                 .attribute2("example2")
                                 .build();
    }

}
