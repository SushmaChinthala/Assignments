package com.company;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Junitassignment3Test {
  Junitassignment3 m1;

  @BeforeEach
  void init() {
    m1 = new Junitassignment3();
  }

  @Test()
  void test() {
    int actual = m1.withdraw(6000);
    String expected="NotSufficientFundException";
    assertEquals(expected,actual,"Exception not raised");
  }
}

