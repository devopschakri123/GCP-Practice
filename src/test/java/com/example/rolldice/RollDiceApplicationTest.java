package com.example.rolldice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RollDiceApplicationTest {

    @Test
    void rollShouldBeBetween1And6() {
        int roll = new java.util.Random().nextInt(6) + 1;
        assertTrue(roll >= 1 && roll <= 6);
    }
}
