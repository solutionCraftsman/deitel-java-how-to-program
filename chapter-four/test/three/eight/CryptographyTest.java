package three.eight;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CryptographyTest {

    Cryptography cryptography;

    @BeforeEach
    void setUp() {
        cryptography = new Cryptography();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testThat_applicationCan_readFourDigitInteger() {
        int [][] x = {{1,2,3}, {1,2,3}};
        for (int i = 0; i < x[0].length; i++) {

        }
        cryptography.readRawData();
        assertEquals(8694, cryptography.getRawData());
    }

    @Test
    void testThat_applicationCan_encryptDataEntered() {
        cryptography.readRawData();
        cryptography.encryptData();
        assertEquals(6153, cryptography.getEncryptedData());
    }

    /*@Test
    void testThat_applicationCan_decryptEncryptedData() {
        cryptography.setEncryptedData(6153);
        cryptography.decryptData();
        assertEquals(6153, cryptography.getEncryptedData());
    }*/
}