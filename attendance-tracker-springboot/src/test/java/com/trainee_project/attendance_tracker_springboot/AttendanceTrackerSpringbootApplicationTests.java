package com.trainee_project.attendance_tracker_springboot;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.TestPropertySource;

@ActiveProfiles("ci")
@TestPropertySource(properties = {
        // --- Use in-memory H2 instead of MySQL ---
        "spring.datasource.url=jdbc:h2:mem:testdb;MODE=MySQL;DATABASE_TO_LOWER=TRUE;DB_CLOSE_DELAY=-1",
        "spring.datasource.driver-class-name=org.h2.Driver",
        "spring.datasource.username=sa",
        "spring.datasource.password=",
        "spring.jpa.hibernate.ddl-auto=create-drop",
        // --- Disable Flyway/Liquibase in CI if present ---
        "spring.flyway.enabled=false",
        "spring.liquibase.enabled=false",
        // --- Provide any required app props used at startup ---
        "jwt.secret=test-secret",
        // --- Avoid fixed ports in tests ---
        "server.port=0"
})
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
class AttendanceTrackerSpringbootApplicationTests {

    @Test
    void contextLoads() {
        // Passes if the Spring context can start with the above test-scoped properties.
    }
}
