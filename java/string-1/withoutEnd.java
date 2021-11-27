/*
Given a string, return a version without the
first and last char, so "Hello" yields "ell". 
The string length will be at least 2.

withoutEnd("Hello") → "ell"
withoutEnd("java") → "av"
withoutEnd("coding") → "odin"
*/

public String withoutEnd(String str) {
  String withoutStart = str.substring(1, str.length());
  
  return withoutStart.substring(0, withoutStart.length()-1);
}