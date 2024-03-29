/*
Given three ints, a b c, return true if two or 
more of them have the same rightmost digit. 
The ints are non-negative. 

lastDigit(23, 19, 13) → true
lastDigit(23, 19, 12) → false
lastDigit(23, 19, 3) → true
*/

public boolean lastDigit(int a, int b, int c) {
  int resa = a%10;
  int resb = b%10;
  int resc = c%10;
  
  if(resa == resb || resa == resc || resb == resc){
    return true;
  } 
  
  return false;
}