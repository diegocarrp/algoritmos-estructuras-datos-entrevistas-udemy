package com.danielblanco.algoritmosestructuras._04_stack_min;

import java.util.ArrayDeque;
import java.util.Deque;

/*
 * ¿Cómo diseñarías un Stack que además de las operaciones de push y pop también
 * contase con una operación para obtener el mínimo?
 */
public class StackMin {

  Deque<Integer> stack = new ArrayDeque<>(  );
  Deque<Integer> minStack = new ArrayDeque<>(  );

  public void push(Integer data) {
    stack.push( data );
    if(minStack.isEmpty() || data <= minStack.peek()) {
      minStack.push( data );
    }
  }

  public int pop() {
    int removedElement = stack.pop();
    if(!minStack.isEmpty() && removedElement == minStack.peek()) {
      minStack.pop();
    }
    return removedElement;
  }

  public int min() {
    return minStack.peek();
  }
}
