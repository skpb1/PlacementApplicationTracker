package test.blackbox.specificationBased;

import org.junit.jupiter.api.Test;

import main.java.placementApplicationTracker.mainMenu.ApplicationMainMenu;

import java.io.InputStream;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class ApplicationMainMenuTest {

    @Test
    void testStudentLogin() {
        String input = "1\n5\n";
        simulateUserInputAndRunTest(input);
    }

    @Test
    void testStudentSignup() {
        String input = "2\n5\n";
        simulateUserInputAndRunTest(input);
    }

    @Test
    void testAdminLogin() {
        String input = "3\n5\n";
        simulateUserInputAndRunTest(input);
    }

    @Test
    void testAdminSignup() {
        String input = "4\n5\n";
        simulateUserInputAndRunTest(input);
    }

    @Test
    void testExit() {
        String input = "5\n";
        simulateUserInputAndRunTest(input);
    }

    @Test
    void testInvalidOption() {
        String input = "6\n5\n";
        simulateUserInputAndRunTest(input);
    }

    private void simulateUserInputAndRunTest(String input) {
        InputStream originalInput = System.in;
        System.setIn(new InputStream() {
            private int index = 0;

            @Override
            public int read() {
                if (index == input.length()) {
                    return -1;
                }
                return input.charAt(index++);
            }
        });

        try {
            ApplicationMainMenu applicationMainMenu = new ApplicationMainMenu(
                    null, null, null, null, null, null, null, null, null
            );

            assertDoesNotThrow(() -> applicationMainMenu.displayMainMenu(new Scanner(System.in)));
        } finally {
            System.setIn(originalInput);
        }
    }
}
