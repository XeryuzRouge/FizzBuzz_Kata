import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.Assert.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import java.util.*;
import java.io.*;

import com.mycompany.app.FizzBuzz;

class FizzBuzzTest {

  public List<String> list;

  @BeforeEach public void setupFizzBuzzList() {
    list = FizzBuzz.range(100);
  }

  @Test public void returnsFizzForMultipliersOf3() {
    for (int i : Arrays.asList(3, 6, 9, 12, 27, 66, 99)) {
        assertEquals("Fizz", list.get(i-1), Integer.toString(i));
    }
  }

  @Test public void returnsBuzzForMultipliersOf5() {
    for (int i : Arrays.asList(5, 10, 20, 25, 50, 70, 95, 100)) {
        assertEquals("Buzz", list.get(i-1), Integer.toString(i));
    }
  }

  @Test public void returnsNonMultipliersOf3Or5AsNumbers() {
    for (int i : Arrays.asList(1, 2, 4, 7, 8, 11, 44, 67, 86, 98)) {
        assertEquals(Integer.toString(i), list.get(i-1));
    }
  }

}