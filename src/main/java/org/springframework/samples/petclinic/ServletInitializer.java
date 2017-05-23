package org.springframework.samples.petclinic;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * Created by rayt on 5/23/17.
 */
public class ServletInitializer extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        if (System.getProperty("com.google.appengine.runtime.version").startsWith("Google App Engine/")) {
            System.setProperty("spring.profiles.active", "prod");
        } else {
            System.setProperty("spring.profiles.active", "dev");
        }
        return builder.sources(PetClinicApplication.class).main(PetClinicApplication.class);
    }
}
