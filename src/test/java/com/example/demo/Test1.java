package com.example.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

/**
 * @version 1.0
 * @author: panpan
 * @create: 2021-01-10 22:40
 **/
//写法规范，一个service对应一个serviceTest,service里面的一个方法对应一个或多个test（异常输入，特例输入，边界值。。。）
public class Test1 {
  @Test
  void fun1() {
    int res = 1 + 1;
    Assertions.assertTrue(2==res);

  }
}
