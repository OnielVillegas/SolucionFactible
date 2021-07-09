//Ejercicio 4 - codewars.com/kata/523f5d21c841566fde000009/java

import java.util.ArrayList;

public class Kata {

  public static int[] arrayDiff(int[] a, int[] b) {    
      ArrayList<Integer> listA = arrayToList(a);
      ArrayList<Integer> listB = arrayToList(b);
    
      listA.removeAll(listB);    

      return listToArray(listA);
    }
  
    public static int[] listToArray(ArrayList<Integer> asList) {
      //hay librerias que hacen esto, pero lo quise hacer a mano.
      int[] asArray = new int[asList.size()];
      for(int i = 0 ; i < asList.size() ; i++){
        asArray[i] = asList.get(i);
      }
      return asArray;
    }
  
    public static ArrayList<Integer> arrayToList(int[] asArray) {
      //hay librerias que hacen esto, pero lo quise hacer a mano.
      ArrayList<Integer> asList = new ArrayList<Integer>();
      for(int i : asArray){
        asList.add(i);
      }
      return asList;
    }
}