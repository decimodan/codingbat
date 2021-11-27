/*
Return true if the string "cat" and "dog" appear 
the same number of times in the given string.

catDog("catdog") → true
catDog("catcat") → false
catDog("1cat1cadodog") → true
*/
public boolean catDog(String str) {
  int contdog = 0;
  int contcat = 0;
  
  for(int i=0; i < str.length()-2; i++){
    if(str.substring(i, i+3).equals("dog")){
      contdog++;
    }
  }
  
  for(int i=0; i < str.length()-2; i++){
    if(str.substring(i, i+3).equals("cat")){
      contcat++;
    }
  }
  
  if(contdog == contcat){
    return true;
  } else {
    return false;
  } 
}