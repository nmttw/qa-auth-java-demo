package com.matheus.qa;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AuthServiceTest {

    @Test
    void shouldRegisterUserSuccessfully() {
        AuthService service = new AuthService();
        boolean result = service.register("test@email.com", "1234");

        assertTrue(result);
    }

    @Test
    void shouldFailLoginWithWrongPassword() {
        AuthService service = new AuthService();
        service.register("test@email.com", "1234");

        boolean loginResult = service.login("test@email.com", "wrong");

        assertFalse(loginResult);
    }
}
