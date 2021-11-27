/*
Given 2 strings, a and b, return a new string 
made of the first char of a and the last char 
of b, so "yo" and "java" yields "ya". If either 
string is length 0, use '@' for its missing char.

lastChars("last", "chars") → "ls"
lastChars("yo", "java") → "ya"
lastChars("hi", "") → "h@"
*/

public String lastChars(String a, String b) {
  String resA = "";
  String resB = "";
  
  if(a.length() == 0){
    resA = "@";
  } else {
    resA = a.substring(0,1);
  }
  
  if(b.length() == 0){
    resB = "@";
  } else {
    resB = b.substring(b.length()-1);
  }
  
  return resA + resB;
}