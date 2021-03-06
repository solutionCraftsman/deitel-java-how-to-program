package com.pentax;

import jakarta.xml.bind.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    Accounts accounts;

    @BeforeEach
    void setUp() {
        Account bob = new Account(100, "Bob", "Blue", 24.98);
        Account steve = new Account(200, "Steve", "Green", -345.67);
        Account pam = new Account(300, "Pam", "White", 0.00);
        Account sam = new Account(400, "Sam", "Red", -42.16);
        Account sue = new Account(500, "Sue", "Yellow", 224.62);

        accounts = new Accounts();
        accounts.getAccounts().add(bob);
        accounts.getAccounts().add(steve);
        accounts.getAccounts().add(pam);
        accounts.getAccounts().add(sam);
        accounts.getAccounts().add(sue);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void createXMLFile() {

        String fileName = "/home/ayodele/Semicolon Africa/temp/clients.xml";
        Path filePath = Paths.get(fileName);

        try {
            BufferedWriter writer = Files.newBufferedWriter(filePath);
            JAXB.marshal(accounts, writer);
            assertNotNull(filePath);
            assertTrue(Files.exists(filePath));

            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    void readXMLFile() {

        String fileName = "/home/ayodele/Semicolon Africa/temp/clients.xml";
        Path filePath = Paths.get(fileName);

        assertNotNull(filePath);
        assertTrue(Files.exists(filePath));

        try {
            BufferedReader reader = Files.newBufferedReader(filePath);
            Accounts accounts = JAXB.unmarshal(reader, Accounts.class);

            List<Account> listOfAccounts = accounts.getAccounts();

            for (Account account : listOfAccounts) {
                System.out.println(account.getAccountNumber());
                System.out.println(account.getFirstName());
                System.out.println(account.getLastName());
                System.out.println(account.getBalance());
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
