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
        
        System.out.println(temp);
    }
    
    public static String shuff(String string){
        String[] separateWords = string.split(" ");
        String temp = null;
        
        Random random = new Random();
        for (int i = 0; i < separateWords.length; i++){
            System.out.println(separateWords[i]);
        }
        return "finish";
    }
 }
