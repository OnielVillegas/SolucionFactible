//Ejercicio 5 - codewars.com/kata/550498447451fbbd7600041c/train/java

import java.util.ArrayList;

public class AreSame {
	public static boolean comp(int[] a, int[] b) {
    
    if( (a == null || b == null) || (a.length == 0 && b.length > 0) )
      return false;
        
    ArrayList<Integer> list = arrayToList(b);
    boolean retorno = true;
    
    for(int i : a){
      if( list.contains( i * i) )
        list.remove(new Integer(i * i));
      else
        return false;      
    }
    
    return retorno;
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