package com.danielblanco.algoritmosestructuras._01_remove_dups;

import com.danielblanco.algoritmosestructuras._00_linkedlist.Node;

import java.util.HashSet;
import java.util.Set;

/*
 * Escribe un algoritmo para eliminar los elementos duplicados en una Lista enlazada
 *
 * Ejemplo:
 *  Input: 1->2->2->3->4->1
 *  Output: 1->2->3->4
 *
 *
 *
 * Follow-up: ¿Cuál sería tu solución si no pudieras utilizar memoria adicional?
 */
public class RemoveDups {

  public void removeDups(Node head) {
    Set<Integer> foundValues = new HashSet<>(  );
    foundValues.add( head.value );
    Node current = head;

    while (current != null && current.next != null) {
      if(!foundValues.add( current.next.value )) {
        current.next = current.next.next;
      }
      current = current.next;
    }
  }

  public void print(Node head) {
    if (head == null) {
      System.out.println("END");
      return;
    }
    Node current = head;
    while (current.next != null) {
      System.out.print(current.value + " -> ");
      current = current.next;
    }
    System.out.println(current.value + " -> END");
  }
}
