import java.util.Scanner;
/**
 *
 * @author celer7841
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create the Scanner for user input
    Scanner input = new Scanner(System.in);

    // create the array to store all the grades
    System.out.println("Please enter in 10 integers to put into the array");
    final int NUMINTEGERS = 10;
    int[] numbers = new int [NUMINTEGERS];
    for(int i = 0; i < NUMINTEGERS; i++){
      numbers[i] = input.nextInt();
    }System.out.println("Please enter a number to find");
    for(int i = 0; i < NUMINTEGERS; i++){
    int newnumber = input.nextInt();
    for(i = 0; i < NUMINTEGERS; i++){
      if(newnumber == numbers [i]){
        System.out.println(newnumber + " is located at index " + i );
      }
      }
    }
  }
      }
