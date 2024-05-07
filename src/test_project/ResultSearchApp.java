package test_project;
import java.util.Arrays;
import java.util.Scanner;

public class ResultSearchApp {

    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rollNumbers: ");
        int n = scanner.nextInt();

        int[] rollNumbers = new int[n];

        System.out.println("Enter the rollNumbers (in sorted order):");
        for (int i = 0; i < n; i++) {
            rollNumbers[i] = scanner.nextInt();
        }

        Arrays.sort(rollNumbers);

      
        System.out.print("Enter your roll number: ");
        int rollNumberToSearch = scanner.nextInt();

    
        String result = searchRollNumber(rollNumbers, rollNumberToSearch);

     
        System.out.println("Result for Roll Number " + rollNumberToSearch + ": " + result);
    }

   
    private static String searchRollNumber(int[] rollNumbers, int target) {
        int low = 0;
        int high = rollNumbers.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (rollNumbers[mid] == target) {
                return "Pass";
            } else if (rollNumbers[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return "Failed";
    }
    
    private void Sysout() {
		// TODO Auto-generated method stub

	}
}