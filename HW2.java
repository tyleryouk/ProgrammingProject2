//Tyler Youk - Programming Project 2

public class HW2{
//instance fields & constructors (none)
//methods
   /*boolean samePrefix: return true if the first m characters of each input String are exactly the same. */
  public static boolean samePrefix(String s, String s2, int m){
    int counter = 0;
    if(m > s.length() || m > s2.length()){return false;} //auto return false if m is too large 
    for(int letter = 0; letter < m; letter++){  //checking each letter of s(index m) with s2(index m)
      if(s.charAt(letter) == s2.charAt(letter)){counter++;} }
    if(counter == m){return true;}  //s and s2 are the same for m
    else {return false;} } //s and s2 are not the same
  
   /*String subtract: subtract second string from first string: (by occurence) (don't go back to start of string) (start at next character)*/
  public static String subtract(String a, String b){
    StringBuilder editedString = new StringBuilder("");
    if(b.length() == 0){return a;} //making sure String lengths are applicable to problem
    
    int bPlace = 0; //starting at b.charAt[0];  goes to b.charAt[1] if b.charAt[0] is subtracted
    boolean bDone = false;
    for(int i = 0; i < a.length(); i++){ //looping through a to find occurances 
      if((a.charAt(i) == b.charAt(bPlace)) && bDone == false){ //if we have a subtractable character and there is still b left to subtract
        if(bPlace == b.length()-1){bDone = true;} //went through all of b, need to add the rest of a then break
        else { bPlace++;}  }
      
      else  {editedString.append(a.charAt(i)); } //adding character if no occurance 
    } //end of for loop
    
    return(editedString.toString()); }
  
  /*String indexWord: output is first string with only indexes of second string */
  public static String indexWord(String c, String d){
    if(c.length() < 10){ return null; }     //checking if first string is at least 10 characters   
    //we're going to assume d is only integers
    StringBuilder sbC = new StringBuilder(); //StringBuilder for c (all 
    StringBuilder sbD = new StringBuilder(); //Stringbuilder for d (all integers)
    StringBuilder sbFinal = new StringBuilder(); //StringBuilder for final string
    sbC.append(c); //sbC is now a StringBuilder of c
    for(int i = 0; i < d.length(); i++){
      char singleD = d.charAt(i);
      int intD = Character.getNumericValue(singleD);
      sbD.append(intD); } //sbD is now a Stringbuilder of the integers of d
    for(int i = 0; i < sbD.length(); i++){
      char sbDchar = sbD.charAt(i); //single character at sbD
      int singleIndex = Character.getNumericValue(sbDchar); //converting single character to integer
      sbFinal.append(sbC.charAt(singleIndex)); } //using integer in index method
    return(sbFinal.toString()); }

  /*String removeExtraSpaces: any spaces at the beginning of the string and end of the string are removed, multiple spaces are replaced by a single space. */
  public static String removeExtraSpaces(String spacedOut){
    StringBuilder noSpaces = new StringBuilder();  //building new StringBuilder
    boolean multSpaces = false; //tracking double spaces
    boolean begSpace = true; //tracking spaces in the beginning
    
    for(int i = 0; i < spacedOut.length(); i++){
      Character currentLetter = spacedOut.charAt(i);  //converting character at index to a String
      String currentLetterS = currentLetter.toString();
      if(currentLetterS.equals(" ") == true){ //first instance of a space, only checking for bypasses
        
        if(begSpace == true) {} //bypassing since it is at the beginning
        else if(multSpaces == true) {} //bypassing since there are multiple spaces
        else if(multSpaces == false) { noSpaces.append(spacedOut.charAt(i)); multSpaces = true;} //adding space only if at one space, next will have multiple spaces
      } else { noSpaces.append(spacedOut.charAt(i)); multSpaces = false; begSpace = false; }  //first instance of a space - auto reset begSpace and multSpaces
    }
    
    //removing space at end if there is one
    Character lastChar = noSpaces.charAt(noSpaces.length()-1);  //converting character at index to a String
    String lastCharS = lastChar.toString();
    //System.out.println("last char:"+ lastCharS +"space before");
    if(lastCharS.equals(" ") == true){
      //System.out.println("removing space");
      noSpaces.deleteCharAt(noSpaces.length()-1);}
    return(noSpaces.toString()); }


  /*flipWords takes a String as input and returns a String:
  Each word of the input string is reversed in the output string, though the order of the words stays the same. A word is defined as a consecutive sequence of English letters.*/
  public static String flipWords(String unFlipped){
    StringBuilder flippedFinal = new StringBuilder(); //building new StringBuilder
    StringBuilder startWord = new StringBuilder();
    StringBuilder flippedWord = new StringBuilder();
    int letterCount = 0; //tracks number of letters in word we are flipping
    boolean onWord = false; //tracks whether or not we are currently flipping a word
    
    //need to check for the first character of the first word
    for(int i = 0; i < unFlipped.length(); i++){
       Character currentLetter = unFlipped.charAt(i);  
       String currentLetterS = currentLetter.toString(); 
       
       if(currentLetterS.equals(" ") == false){ //at a character
         System.out.println("at a character: "+currentLetterS);
         onWord = true; //currently on a word
         startWord.append(currentLetterS); }  //building startWord to flip later
       
       else { //at a space or punctuation
         System.out.println("at a space, current startWord: "+startWord);
         onWord = false;  
         if(startWord.length() > 0){ //making sure we have a word to flip
         for(int j = 0; j < startWord.length(); j++){ //flipping start word
            int back = startWord.length()-1;
            Character toAppend = startWord.charAt(back-j);
            flippedWord.append(toAppend.toString());} }
         
         flippedFinal.append(flippedWord.toString() + " ");  //adding flippedWord to flippedFinal 
         flippedWord.delete(0, flippedWord.length()); //clearing flippedWord
         startWord.delete(0, startWord.length());  } //clearing startWord 
    }
    //end of for loop
    //if there is no space at the end, there will be a word still unflipped and unadded to final
    if(onWord = true){
      if(startWord.length() > 0){ //making sure we have a word to flip
         for(int j = 0; j < startWord.length(); j++){ //flipping start word
            int back = startWord.length()-1;
            Character toAppend = startWord.charAt(back-j);
            flippedWord.append(toAppend.toString());} }
         
         flippedFinal.append(flippedWord.toString());  //adding flippedWord to flippedFinal 
         flippedWord.delete(0, flippedWord.length()); //clearing flippedWord
         startWord.delete(0, startWord.length());  //clearing startWord 
         onWord = false; } 

    //end 
    return(flippedFinal.toString());
  }  
  
  /*Extra credit:reverse takes a two dimensional array of int as input and returns nothing:
The method should reverse each "row" of the array, and it should also reverse the columns so that the first row now becomes the last row and the last row becomes the first.
*/ 
  public static void reverse(int[][] original){
   
  }
   
  //other methods - main method for testing
  public static void main(String[] args){ 
    //HW2 tylerLuv = new  HW2();

  } 
}
