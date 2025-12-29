package com.matheus.qa;

public class Main {

    public static void main(String[] args) {
        AuthService authService = new AuthService();

        System.out.println("Cadastro: " +
            authService.register("user@email.com", "123"));

        System.out.println("Login correto: " +
            authService.login("user@email.com", "123"));

        System.out.println("Login incorreto: " +
            authService.login("user@email.com", "errado"));

        System.out.println("Tentativas de login: " +
            authService.getLoginAttempts());
    }
}
