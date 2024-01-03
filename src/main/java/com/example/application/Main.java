package com.example.application;


import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("Build Info:");
            System.out.println(new BuildInfo());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}