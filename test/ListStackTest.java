import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ListStackTest {

  private MyStack stack;

  @BeforeEach
  void setUp() {
    stack = new ListStack();
  }

  @Test
  void stackIsEmpty() {
    assertTrue(stack.isEmpty());
  }

  @Test
  void nonEmptyAfterPush() {
    stack.push(1);
    assertFalse(stack.isEmpty());
  }

  @Test
  void pushThenPop() {
    stack.push(1);
    assertEquals(1, stack.pop());
    assertTrue(stack.isEmpty());
  }

  @Test
  void pushTwiceThenPop() {
    stack.push(1);
    stack.push(2);
    assertEquals(2, stack.pop());
    assertFalse(stack.isEmpty());
    assertEquals(1, stack.pop());
    assertTrue(stack.isEmpty());
  }
}