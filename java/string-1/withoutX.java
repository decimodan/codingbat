/*
Given a string, if the first or last chars are 
'x', return the string without those 'x' chars,
and otherwise return the string unchanged.

withoutX("xHix") → "Hi"
withoutX("xHi") → "Hi"
withoutX("Hxix") → "Hxi"
*/

public String withoutX(String str) {
  if(str.length() < 2) return ""; 
  
  
  String finale = "";
  
  if(str.substring(0,1).equals("x")){
    finale = str.substring(1);
  } else {
    finale = str;
  }
  
  if(finale.substring(finale.length()-1).equals("x")){
    finale = finale.substring(0,finale.length()-1);
  }
  
  return finale;
}
