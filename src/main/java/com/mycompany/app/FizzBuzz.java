package com.mycompany.app;

import java.util.*;

public class FizzBuzz {

  public static List range(int n) {
    List<String> list = new ArrayList<String>();

    for (int i = 1; i<=n; i++) {
      String element = "";

      if (i % 3 == 0) {
        element += "Fizz";
      }

      if (i % 5 == 0) {
        element += "Buzz";
      }

      if (element.isEmpty()) {
        element = Integer.toString(i);
      }

      list.add(element);
    }

    return list;
  }

}