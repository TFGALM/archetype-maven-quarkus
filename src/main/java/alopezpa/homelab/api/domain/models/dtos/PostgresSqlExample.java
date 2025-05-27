/*
 * Copyright © 2024 Adrian Lopez.
 * All rights reserved
 */

package alopezpa.homelab.api.domain.models.dtos;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class PostgresSqlExample {

    private String attribute1;
    private String attribute2;
}
