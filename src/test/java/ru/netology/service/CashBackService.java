package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CashBackService {
    @Test
    public void positiveСashbackСalculation() {
       CashbackHackService s = new CashbackHackService();
       int amount = 2600;

        int actual = s.remain(amount);
        int expected = 400;

  assertEquals(actual,expected);

    }
    @Test
    public void amountLesThanBoundary() {
        CashbackHackService s = new CashbackHackService();
        int amount = 900;

        int actual = s.remain(amount);
        int expected = 100;

        assertEquals(actual,expected);

    }
    @Test
    public void fallenTest() {
        CashbackHackService s = new CashbackHackService();
        int amount = 1000;

        int actual = s.remain(amount);
        int expected = 0;

        assertEquals(actual,expected);
}
    @Test
    public void largeSumTest() {
        CashbackHackService s = new CashbackHackService();
        int amount = 99998;

        int actual = s.remain(amount);
        int expected = 2;

        assertEquals(actual,expected);
    }
    @Test
    public void littleSumTest() {
        CashbackHackService s = new CashbackHackService();
        int amount = 10;

        int actual = s.remain(amount);
        int expected = 990;

        assertEquals(actual,expected);
    }

}
