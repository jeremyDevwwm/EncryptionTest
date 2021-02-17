package com.opcr.jeremy;

import com.opcr.jeremy.utils.EncryptionClass;

public class Main {

    public static void main(String[] args) {
	// write your code here
        EncryptionClass encryptionClass = new EncryptionClass();

        String encrypted = encryptionClass.Encrypt("neo.wider@gmail.com");
        System.out.println(encrypted);

        String decrypted = encryptionClass.Decrypt(encrypted);

        System.out.println(decrypted);

    }
}
