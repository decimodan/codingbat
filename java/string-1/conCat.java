/*
Given two strings, append them together 
(known as "concatenation") and return the 
result. However, if the concatenation creates a
double-char, then omit one of the chars, so 
"abc" and "cat" yields "abcat".

conCat("abc", "cat") → "abcat"
conCat("dog", "cat") → "dogcat"
conCat("abc", "") → "abc"
*/

public String conCat(String a, String b) {
  if(b.length() == 0 || a.length() == 0){
    return a + b;
  } else {
    String last = a.substring(a.length()-1);
    String first = b.substring(0,1);
    
    if(last.equals(first)){
      return a.substring(0, a.length()-1) + b;
    } else {
      return a + b;
    }
  }
}