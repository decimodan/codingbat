/*
Given a string and a non-negative int n, we'll say that the front of the string is the 
first 3 chars, or whatever is there if the string is less than length 3. Return n copies 
of the front;

frontTimes("Chocolate", 2) → "ChoCho"
frontTimes("Chocolate", 3) → "ChoChoCho"
frontTimes("Abc", 3) → "AbcAbcAbc"
*/

public String frontTimes(String str, int n) {
  int frontL = 3;
  
  if(frontL > str.length()){
    frontL = str.length();
  }
  
  String front = str.substring(0, frontL);
  String result = "";
  
  for(int i=0; i<n; i++){
    result = result + front;
  }
  
  return result;
}