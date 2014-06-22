/*
 * Anthony Walker
 * SWEAP Code Challenge: Gibberish Generator
 * June 22, 2014
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;
import java.io.IOException;

public class gibgen{
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String temp = null;
        
        if (args.length == 0){
            System.out.println("Error: you must enter input");
        }
        
        else{
            temp = args[0];
        }
        
		//here is where our shuffle method is called to our string argument
        temp = shuff(temp);

        System.out.println(temp);
    }
    
    public static String shuff(String string){
        //take the input string and separate it by word
        String[] separateWords = string.split(" ");
        
        String temp = "";
        
        //random value to be used when we scramble the words, to get truly random behavior
        Random random = new Random();
        
        for (int i = 0; i < separateWords.length; i++){
            int max;
            
            String word = separateWords[i];
            
            char lastCharacter = word.charAt(word.length() - 1);
            
            //here, we are treating characters according to their respective integer value
            // instead of casting and converting we just treat them according to this value. 65 = A, 90 = Z
            //this sets the bounds for the area of what needs to be scrambled
            if (lastCharacter > 64 && lastCharacter < 91)
                max = word.length() - 1;
            else max = word.length() - 2;
            
            char[] scrambledWord = word.toCharArray();
            
            //algorithm here is if the word is long enough we swap characters one at a time randomly inside of our
            // shuffling bounds. So if we have a word "word" we have our characters in play 'o' and 'r' and should our random
            // generator so happen to produce alternate results, these letters are swapped manually, producing word -> wrod
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
                temp += word + " ";
        }
        return temp;
    }
 }
