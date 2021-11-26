/*
Return true if the given string begins with "mix", except the 'm' can be anything, 
so "pix", "9ix" .. all count.


mixStart("mix snacks") → true
mixStart("pix snacks") → true
mixStart("piz snacks") → false
*/

public boolean mixStart(String str) {
  if(str.length() < 3) return false;
  
  String first2 = str.substring(1,3);
  
  if(first2.equals("ix")){
    return true;
  } else {
    return false;
  }
}