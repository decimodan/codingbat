/*
Given a string of any length, return a new string 
where the last 2 chars, if present, are swapped, 
so "coding" yields "codign".

lastTwo("coding") → "codign"
lastTwo("cat") → "cta"
lastTwo("ab") → "ba"
*/

public String lastTwo(String str) {
  if(str.length() < 2){
    return str;
  } else {
    String last = str.substring(str.length()-2);
    String shiftString = "";
    
    for (int x=last.length()-1;x>=0;x--){
      shiftString = shiftString + last.charAt(x);  
    }
    
    return str.substring(0, str.length()-2) + shiftString;
  }
}