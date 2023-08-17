package com.danielblanco.algoritmosestructuras._04_add_two_numbers;

import com.danielblanco.algoritmosestructuras._00_linkedlist.Node;

/*
 * Escribe un algoritmo que realice la suma de dos listas que representan
 * dos enteros positivos. Las listas están en posición invertida.
 *
 * Ejemplo:
 *  Input: 1->2->4->6, 5->2->8
 *  Output: 6->4->2->1
 *  6421 + 825 = 7246
 */
public class AddTwoNumbers {

  public Node addTwoNumbers(Node list1, Node list2) {

    int number1 = getNumberFromList(list1);
    int number2 = getNumberFromList(list2);

    String[] result = String.valueOf( number1 + number2 ).split( "" );
    Node response = new Node( 0 );
    Node pointer = response;
    for (int i = result.length-1; i >= 0; i--) {
      pointer.next = new Node( Integer.parseInt(result[i]) );
      pointer = pointer.next;
    }
    return response.next;
  }

  private int getNumberFromList( Node list ) {
    StringBuilder s = new StringBuilder( );

    while(list != null) {
      s.append( list.value );
      list = list.next;
    }

    return Integer.parseInt( s.reverse().toString() );
  }
}
