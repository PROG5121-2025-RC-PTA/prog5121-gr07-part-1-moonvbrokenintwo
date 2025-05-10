/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package LoginTest;

import com.mycompany.poepart1.Login;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class java {

    Login login = new Login("kyl_1", "Ch&&sec@ke99!", "+27838968976", "Kyle", "Smith");

    @Test
    public void testUsernameCorrectlyFormatted() {
        assertTrue(login.checkUserName());
    }

    @Test
    public void testUsernameIncorrectlyFormatted() {
        Login badUsername = new Login("kyle!!!!!!!", "Test123!", "+27831234567", "Test", "User");
        assertFalse(badUsername.checkUserName());
    }

    @Test
    public void testPasswordComplexityCorrect() {
        assertTrue(login.checkPasswordComplexity());
    }

    @Test
    public void testPasswordComplexityIncorrect() {
        Login weakPass = new Login("kyl_1", "password", "+27831234567", "Test", "User");
        assertFalse(weakPass.checkPasswordComplexity());
    }

    @Test
    public void testCellNumberCorrect() {
        assertTrue(login.checkCellPhoneNumber());
    }

    @Test
    public void testCellNumberIncorrect() {
        Login badCell = new Login("kyl_1", "Ch&&sec@ke99!", "08966553", "Test", "User");
        assertFalse(badCell.checkCellPhoneNumber());
    }

    @Test
    public void testLoginSuccess() {
        assertTrue(login.loginUser("kyl_1", "Ch&&sec@ke99!"));
    }

    @Test
    public void testLoginFail() {
        assertFalse(login.loginUser("kyl_1", "wrongpass"));
    }

    @Test
    public void testLoginMessageSuccess() {
        assertEquals("Welcome Kyle Smith, it is great to see you again.", login.returnLoginStatus("kyl_1", "Ch&&sec@ke99!"));
    }

    @Test
    public void testLoginMessageFail() {
        assertEquals("Username or password incorrect, please try again.", login.returnLoginStatus("kyl_1", "badpass"));
    }
}

