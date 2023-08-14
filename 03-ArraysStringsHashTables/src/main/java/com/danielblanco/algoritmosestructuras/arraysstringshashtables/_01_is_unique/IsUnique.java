package com.danielblanco.algoritmosestructuras.arraysstringshashtables._01_is_unique;

import java.util.HashSet;
import java.util.Set;

/*
 * Dado un método que recibe una String, comprobar si todos los caracteres son únicos o no.
 *
 * isUnique("abcde") => true;
 * isUnique("abcded") => false;
 */
public class IsUnique {

  private static final int AVAILABLE_CHARACTERS = 128;

  public boolean isUnique(String s) {
    if(s.length() > AVAILABLE_CHARACTERS) return false;

    Set<String> uniqueChars = new HashSet<>(  );
    for (String c: s.split( "" )) {
      if(uniqueChars.contains( c )) return false;
      uniqueChars.add( c );
    }
    return true;
  }
}
