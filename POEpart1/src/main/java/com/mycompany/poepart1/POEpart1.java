/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poepart1;
import java.util.Scanner;

public class POEpart1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // REGISTRATION
        System.out.println("=== User Registration ===");
        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter your last name: ");
        String lastName = scanner.nextLine();

        System.out.print("Create a username (max 5 characters & must include underscore): ");
        String username = scanner.nextLine();

        System.out.print("Create a password (must be 8+ chars, uppercase, number, special char): ");
        String password = scanner.nextLine();

        System.out.print("Enter your South African cell phone number (e.g., +27831234567): ");
        String cellPhone = scanner.nextLine();

        Login user = new Login(username, password, cellPhone, firstName, lastName);
        String registrationMessage = user.registerUser();
        System.out.println(registrationMessage);

        if (!registrationMessage.equals("User registered successfully!")) {
            System.out.println("Registration failed. Please try again.");
            return; // Exit if registration fails
        }

        // LOGIN
        System.out.println("\n=== Login ===");
        System.out.print("Enter your username: ");
        String loginUsername = scanner.nextLine();

        System.out.print("Enter your password: ");
        String loginPassword = scanner.nextLine();

        String loginMessage = user.returnLoginStatus(loginUsername, loginPassword);
        System.out.println(loginMessage);
    }
}


