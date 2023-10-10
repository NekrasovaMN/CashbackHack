package ru.netology.service;

import org.testng.annotations.Test;
import org.testng.Assert;

    public class CashbackHackServiceTest {
        @Test
        public void remainEqualBoundar() {
            CashbackHackService service = new CashbackHackService();
            int amount = 1000;
            int actual = service.remain(amount);
            int expected = 0;

            Assert.assertEquals(actual, expected);
        }

        @Test
        public void AboveBoundary() {
            CashbackHackService service = new CashbackHackService();
            int amount = 1500;
            int actual = service.remain(amount);
            int expected = 500;

            Assert.assertEquals(actual, expected);
        }

        @Test
        public void LessBoundary() {
            CashbackHackService service = new CashbackHackService();
            int amount = 0;
            int actual = service.remain(amount);
            int expected = 1000;

            Assert.assertEquals(actual, expected);
        }
        @Test
        public void InsideBoundary() {
            CashbackHackService service = new CashbackHackService();
            int amount = 900;
            int actual = service.remain(amount);
            int expected = 100;

            Assert.assertEquals(actual, expected);
        }
    }
