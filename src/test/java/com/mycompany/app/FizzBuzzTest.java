import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.Assert.*;
import org.junit.jupiter.api.Test;

import java.util.*;
import java.io.*;

import com.mycompany.app.FizzBuzz;

class FizzBuzzTest {

  @Test public void returnsFizzForMultipliersOf3() {
    assertEquals(
        Arrays.asList("1", "2", "Fizz", "4", "5", "Fizz", "7", "8", "Fizz"),
        FizzBuzz.range(9)
    );
  }

}