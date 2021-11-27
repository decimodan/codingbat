/*
Given an int n, return the string form of the 
number followed by "!". So the int 6 yields "6!". 
Except if the number is divisible by 3 use "Fizz" 
instead of the number, and if the number is 
divisible by 5 use "Buzz", and if divisible by 
both 3 and 5, use "FizzBuzz".

fizzString2(1) → "1!"
fizzString2(2) → "2!"
fizzString2(3) → "Fizz!"
*/

public String fizzString2(int n) {
  String result = "";
  
  if(n%3 == 0 && n%5 == 0){
    result = "FizzBuzz!";
  } else if(n%3 == 0){
    result = "Fizz!";
  } else if(n%5 == 0){
    result = "Buzz!";
  } else {
    result = n + "!";
  }
  
  return result;
}