package com.example.rolldice;

import java.util.Random;

public class RollDiceApplication {
    public static void main(String[] args) {
        Random random = new Random();
        int result = random.nextInt(6) + 1;
        System.out.println("🎲 You rolled: " + result);
    }
}
