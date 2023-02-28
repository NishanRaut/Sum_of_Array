import java.util.Scanner;

public class SumOfArray{
    
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        int number,n,sum=0;
        System.out.println("Enter length of an array: ");
        number=input.nextInt();
        int arr[]=new int[number];
        for(int i=0;i<number;i++){
            System.out.println("Enter Number: ");
            n=input.nextInt();
            arr[i]=n;
            sum=sum+arr[i];
        }
        System.out.println("The sum is: "+sum);
    }
}