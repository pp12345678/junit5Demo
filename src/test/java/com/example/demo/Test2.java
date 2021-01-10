package com.example.demo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @version 1.0
 * @author: panpan
 * @create: 2021-01-10 22:45
 **/
public class Test2 {

  @BeforeAll
  static void init() {
    System.out.println("init once");
  }

  @BeforeEach
  void each() {
    System.out.println("init");
  }

  @AfterEach
  void eacha() {
    System.out.println("after");
  }

  @Test
  public void t1() {
    System.out.println(123);
  }

  @Test
  public void t2() {
    System.out.println(456);
  }

}
