/*
Given a string, if the string begins with "red"
or "blue" return that color string, otherwise 
return the empty string.

seeColor("redxx") → "red"
seeColor("xxred") → ""
seeColor("blueTimes") → "blue"
*/

public String seeColor(String str) {
  if(str.length() < 3){
    return "";
  } else {
    String red = str.substring(0,3);
    String blue = "";
    
    if(str.length() > 3){
      blue = str.substring(0,4);
    }
    
    if(red.equals("red") ){
      return red;
    } else if(blue.equals("blue")){
      return blue;
    }else{
      return "";
    }
  }
}