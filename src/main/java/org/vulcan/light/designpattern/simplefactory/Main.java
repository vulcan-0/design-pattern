package org.vulcan.light.designpattern.simplefactory;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import java.security.NoSuchAlgorithmException;
import java.text.DateFormat;

/**
 * @author luxiaocong
 * @createdOn 2020/12/6
 */
public class Main {

    public static void main(String[] args) throws NoSuchAlgorithmException, NoSuchPaddingException {
        Product productA = SimpleFactory.createProduct("A");
        productA.use();
        Product productB = SimpleFactory.createProduct("B");
        productB.use();

        // JDK sample
        DateFormat dateFormat = DateFormat.getInstance();
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
        Cipher cp = Cipher.getInstance("DES/CBC/PKCS5Padding");
    }

}
