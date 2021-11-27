/*
Given a string, return a version without the 
first 2 chars. Except keep the first char if it 
is 'a' and keep the second char if it is 'b'. 
The string may be any length. Harder than it 
looks.

deFront("Hello") → "llo"
deFront("java") → "va"
deFront("away") → "aay"
*/

public String deFront(String str) {
  	String esA = str.substring(0,1);
  	String esB = str.substring(1,2);

  	boolean bA;
  	boolean bB;

  	if(esA.equals("a") || esA.equals("A")){
  		bA = true;
  	} else {
  		bA = false;
  	}

  	if(esB.equals("b") || esB.equals("B")){
  		bB = true;
  	} else {
  		bB = false;
  	}

  	if(bA && bB){
  		return str;
  	} else if(bA && !bB){
  		return esA + str.substring(2); 
  	} else if(!bA && bB){
  		return esB + str.substring(2);
  	} else {
  		return str.substring(2);
  	}
}