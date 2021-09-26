package ex37;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

class PasswordGenTest {

    @Test //Passwords should be generated randomly
    void createpass() {

        String password = PasswordGen.createpass(10,5, 5);
        assertNotSame(password, PasswordGen.createpass(10, 5, 5));

        password = PasswordGen.createpass(1000,1, 123);
        assertNotSame(password, PasswordGen.createpass(1000, 1, 123));

    }
}