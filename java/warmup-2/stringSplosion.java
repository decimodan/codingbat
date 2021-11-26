/*
Given a non-empty string like "Code" return a string like "CCoCodCode".

stringSplosion("Code") → "CCoCodCode"
stringSplosion("abc") → "aababc"
stringSplosion("ab") → "aab"
*/

public String stringSplosion(String str) {
  int size = str.length();
  StringBuilder res = new StringBuilder();
  
  for(int i=0; i <= size; i++){
    res.append(str.substring(0, i));
  }
  
  return res.toString();
}