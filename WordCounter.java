import java.util.Scanner;
public class WordCounter{

  // to get user sentence
  public static String getSentenceInput(){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a sentence: ");
    String userSentence = input.nextLine();
    return userSentence;
  }
  //count the words 
  public static int countWords(String sentence){
    String[] words = sentence.trim().split("\\s+");
    return words.length;
  }

  public static void main(String[] args) {
   String Sentence = getSentenceInput();
    System.out.println("The sentence has " + countWords(Sentence) + " words.");
  }
}