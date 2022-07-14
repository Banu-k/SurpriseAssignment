//2. Write a program to find the first 10 fibonacci numbers that are also prime.

package surpriseAssignment;

import java.util.Scanner;

public class Program_2 {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		
//		
//		System.out.print("Enter the first number :");
//        int n1 = sc.nextInt();
//        System.out.print("Enter the second number :");
//        int n2 = sc.nextInt();
		

		int n1 = 1;
		int n2 = 1;
		
        int count=0;

        while(count < 10) {
            boolean bool = true;
            int n3 = n1+n2;
            n1 = n2;
            n2 = n3;
            for(int i=2; i < n3/2; i++) {
                if(n3 % i == 0){
                    bool=false;
                    break;
                }
            }
            if(bool){
                System.out.print(n3 +" ");
                count++;
            }
        }
	}
}

