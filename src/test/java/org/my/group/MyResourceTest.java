package org.my.group;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;


import javax.inject.Inject;

@QuarkusTest
public class MyResourceTest {

    @Inject
    TestService service;

    @Test
    public void testService() {
        service.test();
    }

}