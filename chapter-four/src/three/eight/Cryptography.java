package three.eight;

import javax.swing.*;

public class Cryptography {

    private int rawData;
    private int encryptedData;

    public void readRawData() {
        setRawData(Integer.parseInt(JOptionPane.showInputDialog("Enter data to encrypt")));
    }

    private void setRawData(int rawData) {
        this.rawData = rawData;
    }

    public int getRawData() {
        return rawData;
    }

    public int getEncryptedData() {
        return encryptedData;
    }

    public void encryptData() {
        int firstDigit = rawData / 1000;
        int secondDigit = (rawData / 100) % 10;
        int thirdDigit = (rawData / 10) % 10;
        int fourthDigit = rawData % 10;

        firstDigit += 7;
        secondDigit += 7;
        thirdDigit += 7;
        fourthDigit += 7;

        firstDigit %= 10;
        secondDigit %= 10;
        thirdDigit %= 10;
        fourthDigit %= 10;

        encryptedData = Integer.parseInt("" + thirdDigit + fourthDigit + firstDigit + secondDigit);
    }

    /*public void setEncryptedData(int encryptedData) {
        this.encryptedData = encryptedData;
    }

    public void decryptData() {
        int thirdDigit = encryptedData / 1000;
        int fourthDigit = (encryptedData / 100) % 10;
        int firstDigit = (encryptedData / 10) % 10;
        int secondDigit = encryptedData % 10;

        *//* How to reverse engineer?
        firstDigit %= 10;
        secondDigit %= 10;
        thirdDigit %= 10;
        fourthDigit %= 10;*//*

        firstDigit -= 7;
        secondDigit -= 7;
        thirdDigit -= 7;
        fourthDigit -= 7;

        rawData = Integer.parseInt("" + firstDigit + secondDigit + thirdDigit + fourthDigit);
    }*/
}
