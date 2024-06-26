import java.util.Scanner;

// public class Factorial {
//     public static void main(String[] args) {
//          Scanner sc = new Scanner(System.in);
//          System.out.println("Enter the number: ");
//          int num = sc.nextInt();
//          int fac=1;

//         if(num<2){
//             System.out.println("Factorial of "+ num+ " is: 1");
//         }
//         else{

//          for(int i=num;i>1;i--){
//                 fac =fac*i;
//          }
//          System.out.println("Factorial of " + num + " is: " + fac);

//     }
// }
// }
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        
        long factorial = computeFactorial(num);
        System.out.println("Factorial of " + num + " is: " + factorial);
    }

    // Recursive method to compute factorial
    public static long computeFactorial(int num) {
        if (num == 0 || num == 1) {
            return 1;
        } else {
            return num * computeFactorial(num - 1);
        }
    }
}
