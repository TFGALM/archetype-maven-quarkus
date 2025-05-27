/*
 * Copyright © 2024 Adrian Lopez.
 * All rights reserved
 */

package alopezpa.homelab.api.domain.repositories;

import alopezpa.homelab.api.domain.models.dtos.PostgresSqlExample;

public interface ExampleRepository {
    PostgresSqlExample getExample(String name);
}
