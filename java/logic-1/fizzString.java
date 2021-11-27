/*
Given a string str, if the string starts with 
"f" return "Fizz". If the string ends with "b" 
return "Buzz". If both the "f" and "b" 
conditions are true, return "FizzBuzz". 
In all other cases, return the string unchanged. 

fizzString("fig") → "Fizz"
fizzString("dib") → "Buzz"
fizzString("fib") → "FizzBuzz"
*/

public String fizzString(String str) {
  String result = "";
  
  if(str.length() >= 1){
    if(str.substring(0,1).equals("f") && str.substring(str.length()-1).equals("b")){
      result = "FizzBuzz";
    } else if(str.substring(0,1).equals("f")){
      result = "Fizz";
    } else if(str.substring(str.length()-1).equals("b")){
      result = "Buzz";
    } else {
      return str;
    } 
    return result;
  }
  
  return str;
}