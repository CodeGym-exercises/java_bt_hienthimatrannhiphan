import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //System.out.println("Hello World!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = scanner.nextInt();
        printMatrix(n);
    }
    public static void printMatrix(int n){
        int[] randomArr = {0,1};
        int randomNumber=0;
        for (int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                randomNumber = randomArr[(int) Math.floor(Math.random()*2)];
                System.out.printf("%d ",randomNumber);
            }
            System.out.println("");
        }

    }
}
