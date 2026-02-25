package com.example;

/**
 * Main application class.
 */
public final class App {

    private App() {
        // Utility class constructor
    }

    /**
     * Entry point of the application.
     * @param args command line arguments.
     */
    public static void main(final String[] args) {
        System.out.println("Hello TeamCity!");
    }

    /**
     * Returns a greeting string.
     * @return greeting.
     */
    public String getGreeting() {
        return "Hello World";
    }
}
