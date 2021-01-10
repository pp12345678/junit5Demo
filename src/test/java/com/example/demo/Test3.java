package com.example.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.mock.mockito.SpyBean;

import javax.swing.*;

import static org.mockito.Mockito.when;

/**
 * @version 1.0
 * @author: panpan
 * @create: 2021-01-10 22:51
 **/
@SpringBootTest //用于初始化spring的上下文，如下面获取Svc1的对象不需要通过new（new会使该类中注入到容器的对象无效）
public class Test3 {

  @SpyBean
//  @MockBean
//  @Autowired
  Svc1 svc1;

  @MockBean
  Svc2 svc2;

  @Test
  void t1() {
    when(svc2.add(1,1)).thenReturn(3);
    int res = svc1.add(1, 1);
    int res2 = svc1.jian(2, 1);
    Assertions.assertEquals(3 , res);
    Assertions.assertEquals(1, res2);


  }
}
