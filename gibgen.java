/*
 * Anthony Walker
 * SWEAP Code Challenge: Gibberish Generator
 * June 22, 2014
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Random;

public class gibgen{
    public static void main(String[] args){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String temp = null; 
        
        //for (String s: args) System.out.println(s);
        //System.exit(0);
        
        if (args.length == 0){
            System.out.println("Error: you must enter input");
        }
        
        else{
            //try{
                temp = args[0];
            //}
            //catch(IOException e){System.err.print(e+"");}
        }
        temp = shuff(temp);
        System.out.println(temp);
    }
    
    public static String shuff(String string){
        String[] separateWords = string.split(" ");
        
        String temp = null;
        
        Random random = new Random();
        for (int i = 0; i < separateWords.length; i++){
            int max;
            
            String tempI = separateWords[i];
            
            char lastCharacter = tempI.charAt(tempI.length() - 1);
            
            if (lastCharacter > 64 && lastCharacter < 123)
                max = tempI.length() - 2;
            else max = tempI.length() - 3;
            
            char[] scrambledWord = tempI.toCharArray();
            
            if (max > 1){
                for (int j = 0; j < max; j++){
                    int firstLetter = random.nextInt(max) + 1;
                    int secondLetter = random.nextInt(max) + 1;
                    
                    if (firstLetter != secondLetter){
                        char tmp = scrambledWord[firstLetter];
                        scrambledWord[firstLetter] = scrambledWord[secondLetter];
                        scrambledWord[secondLetter] = tmp;
                    }
                }
                temp += String.valueOf(scrambledWord) + " ";
            }
            else
                temp += tempI + " ";
        }
        return temp;
    }
 }
