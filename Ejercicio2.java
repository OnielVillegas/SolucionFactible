//Ejercicio 2 - codewars.com/kata/55bf01e5a717a0d57e0000ec/java

class Persist {
	public static int persistence(long n) {
    int multPers = 0;    
    long auxNum = 1;
    
		while(n > 9){   
      
      for (char t : String.valueOf(n).toCharArray()) {
        auxNum *= Character.getNumericValue(t);        
      }            
      
      multPers++;
      n = auxNum;
      auxNum = 1;
    }
    
    return multPers;
	}
}