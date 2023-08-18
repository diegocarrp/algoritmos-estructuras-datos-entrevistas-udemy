package com.danielblanco.algoritmosestructuras._03_sort_stack;

import java.util.ArrayDeque;
import java.util.Deque;

/*
 * Ordena un Stack de forma que los elementos más pequeños queden en el tope del Stack.
 * Puedes usar un Stack adicional, pero no está permitido copiar los elementos a otra
 * estructura de datos.
 *
 * Ejemplo:
 *  Input: (tope) 4->2->5->1
 *  Output: (tope) 1->2->4->5
 *
 * 2->1
 * 5->4
 */
public class SortStack {

  public Deque<Integer> sort(Deque<Integer> stack) {
    Deque<Integer> orderedStack = new ArrayDeque<>(  );
    while(!stack.isEmpty()) {
      int element = stack.pop();
      while(!orderedStack.isEmpty() && element > orderedStack.peek() ) {
        stack.push(orderedStack.pop());
      }
      orderedStack.push( element );
    }

    return orderedStack;
  }
}
