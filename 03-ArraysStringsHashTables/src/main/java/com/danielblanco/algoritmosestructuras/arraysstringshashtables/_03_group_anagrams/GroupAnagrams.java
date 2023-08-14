package com.danielblanco.algoritmosestructuras.arraysstringshashtables._03_group_anagrams;

import java.util.*;

/*
 * Un anagrama es una palabra creada a partir de la reordenación de las letras de otra palabra. Ej: saco - caso
 * Dado un array de strings, devuelve los anagramas agrupados. Cualquier orden es válido.
 *
 * Ejemplo:
 *  Input: words = ["saco", "arresto", "programa", "rastreo", "caso"].
 *  Output: [["saco", "caso"], ["arresto", "rastreo"], ["programa"]].
 */
public class GroupAnagrams {

  public List<List<String>> groupAnagrams(String[] words) {

    if(words == null || words.length == 0) return Collections.emptyList();

    Map<String, List<String>> groupedAnagrams = groupedAnagrams( words );
    return new ArrayList<>( groupedAnagrams.values( ) );
  }

  private Map<String, List<String>> groupedAnagrams(String[] words) {
    Map<String, List<String>> groupedAnagrams = new HashMap<>(  );
    for (String s: words) {
      String key = generateKey( s );
      if(!groupedAnagrams.containsKey( key )) {
        groupedAnagrams.put( key, new ArrayList<>() );
      }
      groupedAnagrams.get( key ).add( s );
    }
    return groupedAnagrams;
  }

  private static String generateKey( String s ) {
    String[] split = s.split( "" );
    Arrays.sort( split );
    return Arrays.toString( split );
  }
}
