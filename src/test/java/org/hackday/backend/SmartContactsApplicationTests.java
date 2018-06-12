package org.hackday.backend;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringRunner.class)
@ActiveProfiles("dev")
@SpringBootTest
@Transactional
public class SmartContactsApplicationTests {

    @Test
    public void contextLoads() {
    }

}
