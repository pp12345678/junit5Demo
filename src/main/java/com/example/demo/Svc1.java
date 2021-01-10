package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @version 1.0
 * @author: panpan
 * @create: 2021-01-10 22:51
 **/
@Service
public class Svc1 {

  @Autowired
  Svc2 svc2;

  public int add(int a, int b) {

    return svc2.add(a, b);
  }

  public int jian(int a, int b) {
    return a - b;
  }
}
