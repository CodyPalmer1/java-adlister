package com.codeup.adlister.controllers;

import org.mindrot.jbcrypt.BCrypt;

public class HastTest {
    public static void main(String[] args) {
        String password = "codeyTheDuck";
        String hash = BCrypt.hashpw(password, BCrypt.gensalt());
        System.out.println(hash);
    }
}
