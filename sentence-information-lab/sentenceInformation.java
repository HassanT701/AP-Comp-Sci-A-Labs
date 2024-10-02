import java.util.Scanner;

/**
 * Write a description of class sentenceInformation here.
 *
 * @author (Hassan Talha)
 * @version (11-30-22)
 */
public class sentenceInformation
{
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
       
       System.out.println("---Sentence Information---"); 
        
       System.out.println("Enter your sentence: ");
       String s = input.nextLine();
       
       System.out.println("Your sentence has ");
       System.out.print(s.length());
       System.out.print(" characters ");
    }
    public static boolean isVowel (char letter){
        letter = Character.toLowerCase(letter);
        if(letter == 'a'||letter == 'e'||letter == 'i'||letter == 'o'||letter == 'u')
            return true;
        return false;
    }
    public static boolean isConsonant (char letter){
        letter = Character.toLowerCase(letter);
        if(letter == 'a'||letter == 'e'||letter == 'i'||letter == 'o'||letter == 'u')
            return false;
        return true;
    }
    public static boolean isPunctuation (char letter){
        letter = Character.toLowerCase(letter);
        if(letter == '!'||letter == ','||letter == '.'||letter == '?'||letter == ';'||letter == ':')
            return true;
        return false;
    }
    public static int vowelCount (String s){
             
        
    }
    public static int consonantCount (String s){
           
        
    }
    public static int punctuaionCount (String s){
           
        
    }
    public static int wordCount (String s){
           
        
    }




}
