package com.example;

/**
 * Main application class for the Weather App demo.
 */
public final class App {

    /**
     * Private constructor to prevent instantiation of utility class.
     */
    private App() {
    }

    /**
     * Main entry point of the application.
     * @param args Command line arguments.
     */
    public static void main(final String[] args) {
        System.out.println("Hello TeamCity!");
    }

    /**
     * Generates a greeting string.
     * @return A standard greeting.
     */
    public String getGreeting() {
        return "Hello World";
    }
}
