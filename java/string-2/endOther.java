/*
Given two strings, return true if either of the 
strings appears at the very end of the other 
string, ignoring upper/lower case differences 
(in other words, the computation should not be 
"case sensitive"). Note: str.toLowerCase() 
returns the lowercase version of a string.

endOther("Hiabc", "abc") → true
endOther("AbC", "HiaBc") → true
endOther("abc", "abXabc") → true
*/

public boolean endOther(String a, String b) {
  int lA = a.length();
  int lB = b.length();
  
  boolean bo = true;
  
  int resultado = lA - lB;
  
  if(resultado > 0){
    if(a.toLowerCase().substring(resultado).equals(b.toLowerCase())){
      bo = true;
    } else {
      bo = false;
    }
  } else if (resultado == 0){
    if(a.equals(b)){
      bo = true;
    } else {
      bo = false;
    }
  } else if (resultado < 0){
    if(b.toLowerCase().substring(b.length() - a.length()).equals(a.toLowerCase())){
      bo = true;
    } else {
      bo = false;
    }
  }
  
  return bo;
}