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
        String temp;
        
        //I am marking the information in the stream so I can rewind in the case of the next if statement
        reader.mark(1);
        
        //if program is fed "string" it will scramble entire argument as long as it is in
        // quotation marks so that it is treaded as one argument
        if (args.length == 1)
            System.out.println(shuff(args[0]));
        
        //If we 'cat' a textfile as an argument to the program for instance, we will scramble the textfile given
        // as an argument
        else if ((reader.readLine()) != null){
            reader.reset();
            if (reader.readLine().length() < 1){
                System.out.println("Error: you must enter a valid argument");
            }
            else {
                reader.reset();
                while ((temp = reader.readLine()) != null)
                System.out.println(shuff(temp));
            }
        }
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
