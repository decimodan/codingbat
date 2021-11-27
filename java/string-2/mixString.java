/*
Given two strings, a and b, create a bigger 
string made of the first char of a, the first 
char of b, the second char of a, the second char 
of b, and so on. Any leftover chars go at the 
end of the result.

mixString("abc", "xyz") → "axbycz"
mixString("Hi", "There") → "HTihere"
mixString("xxxx", "There") → "xTxhxexre"
*/

public String mixString(String a, String b) {
  char[] ar;
  String end;
  int cont = 0;
  
  if(a.length() < b.length()) {
    ar = new char[2 * a.length()];
    end = b.substring(a.length());
  } else {
    ar = new char[2 * b.length()];
    end = a.substring(b.length());
  }
  
  for(int i = 0; i < ar.length / 2; i++) {
    ar[cont] = a.charAt(i);
    cont++;
    ar[cont] = b.charAt(i);
    cont++;
  }
  
  return new String(ar) + end;
}