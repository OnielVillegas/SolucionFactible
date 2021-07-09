//Ejercicio 1 - codewars.com/kata/55f8a9c06c018a0d6e000132/java

public class Solution {

  public static boolean validatePin(String pin) {  
        return pin.matches("\\d{4}|\\d{6}");
  }

}