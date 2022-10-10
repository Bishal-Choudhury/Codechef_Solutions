import java.util.Scanner;
import java.util.Arrays;

public class Marks{
    public static void main(String[] args){
        System.out.println("21BCI0184");
        Scanner sc = new Scanner(System.in);
        int count=0;
        int count1=0;
        int arr[][]=new int[4][];
        
        
            arr[0] = new int[5];
            arr[1] = new int[3];
            arr[2] = new int[4];
            arr[3] = new int[2];
        
        System.out.println("Input: ");
        for(int i=0; i<4; i++){
            for(int j=0; j<arr[i].length; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("Output: ");
        for(int k=0; k<4; k++){
            for(int l=0; l<arr[k].length; l++){
                if(arr[k][l]>=40){
                    count++;
                }
                else{
                    count1++;
                }
                
            }
            System.out.print("Student "+(k+1)+ ". ");
            System.out.print(count+ " passed ");
            if(count1>0){
                System.out.print("and "+ count1 +" fail");
            }
            System.out.println(" ");
            count=0;
            count1=0;
        }    
    }
}
