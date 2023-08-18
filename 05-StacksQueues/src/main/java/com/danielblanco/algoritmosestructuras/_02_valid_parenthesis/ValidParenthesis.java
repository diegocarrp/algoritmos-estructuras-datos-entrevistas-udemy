package com.danielblanco.algoritmosestructuras._02_valid_parenthesis;

import com.danielblanco.algoritmosestructuras._00_stackqueue.MyQueue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

/*
 * Dado un String que solamente contiene los caracteres '(', ')', '{', '}', '[' y ']',
 * implementa un algoritmo para determinar si es válido.
 *
 * Ejemplo 1:
 *  Input: "([]){}"
 *  Output: true
 *
 * Ejemplo 2:
 *  Input: "({)}"
 *  Output: false
 */
public class ValidParenthesis {

  private final List<String> openingParenthesis = List.of( "(", "{", "[" );
  private final List<String> closingParenthesis = List.of( ")", "}", "]" );


  public boolean isValid(String s) {
    Deque<Character> queue = new ArrayDeque<>(  );

    for(char c : s.toCharArray()) {
      if (c == '(' || c == '{' || c == '[') {
        queue.push( getOpposite(c) );
      } else {
        Character ch = queue.pop();
        if( ch != c ) return false;
      }
    }

    return true;
  }

  private Character getOpposite( char c ) {
    if( c == '(') {
      return ')';
    } else if( c == '{') {
      return '}';
    } else {
      return ']';
    }
  }
}
