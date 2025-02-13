import java.util.Scanner;

public class Guessthenumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        for (int i = 0; i < 100; i++) {
            arr[i] = i + 1;
        }
        System.out.println("Enter the number to be guessed (1 - 100:)");
        int chosenNumber = sc.nextInt();

        System.out.print("\033[H\033[2J"); //stackover flow 
        System.out.flush();

        System.out.println("Try to guess the number! you have 3 chances.");
        int attempts = 0 , left = 0 , right = arr.length-1 , userGuess; 

        while (attempts < 3) { 
            System.out.print("Enter your guess :");
            userGuess = sc.nextInt();

            //Binary Search
            int mid;
            while (left <= right) { 
                mid = left + (right - left)/2;
                if (arr[mid] == chosenNumber) {
                    break;
                }else if(arr[mid] < chosenNumber){
                    left = mid+1;
                }else{
                    right = mid -1;
                }
            }
            if (userGuess == chosenNumber) {
                System.out.println("Congratulations ! You guess the correct number.");
            }else{
                attempts++;
                System.out.println("Wrong guess! Try again. Remaining attempts:" + (3-attempts)+"\n"+ "Hint :"+(userGuess<chosenNumber?"Try the large number":"Try a smaller number"));
            }
        }
        System.out.println("Game Over! The correct number was :" + chosenNumber);
    }
}
