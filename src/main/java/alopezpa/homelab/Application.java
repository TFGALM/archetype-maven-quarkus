/*
 * Copyright © 2024-2025 Adrian Lopez.
 * All rights reserved
 */

package alopezpa.homelab;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.annotations.QuarkusMain;

@QuarkusMain
@SuppressWarnings({"PMD.UseUtilityClass"})
public final class Application {

    public static void main(final String[] args) {
        Quarkus.run(args);
    }
}
