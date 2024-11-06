import java.util.Scanner;
import java.util.Random;

class Main 
{
  public static void main(String[] args) 
  {
    boolean runAgain = true;
    //while (runAgain == true)
    //{
      String question;
      Scanner scan = new Scanner(System.in);
      System.out.println("What question do you want to ask the 8Ball?");
      question = scan.next();

      String[] answers = new String[6];

      answers[0] = "Definitely!";
      answers[1] = "Not likely";
      answers[2] = "Yes";
      answers[3] = "Sadly, no";
      answers[4] = "Probably";
      answers[5] = "Not in the foreseeable future";


      Random gen = new Random();
      int pickedPhrase = gen.nextInt(answers.length);

      System.out.println(answers[pickedPhrase]);

      /*System.out.println("Do you want to ask another question? yes/no");
      String answer = scan.next();
      if (answer == "yes")
      {
        runAgain = true;
      }
      else
      {
        runAgain = false;
      }*/

    //}

  }
}