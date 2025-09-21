package com.trainee_project.attendance_tracker_springboot;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("ci")   // use H2-based CI profile
@SpringBootTest
class AttendanceTrackerSpringbootApplicationTests {

    @Test
    void contextLoads() {
        // passes if the Spring context starts with the 'ci' profile
    }
}

