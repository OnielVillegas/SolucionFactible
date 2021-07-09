//Ejercicio 3 - codewars.com/kata/5839edaa6754d6fec10000a2/java

public class Kata
{
  public static char findMissingLetter(char[] array)
  { 
    int asAscii = 0;
    for(int i = 0 ; i < array.length ; i++){
      if( (int)array[i] + 1 != (int)array[i + 1] ){
        asAscii = (int)array[i] + 1;
        break;
      }
    }
    
    return (char)asAscii;
  }
}