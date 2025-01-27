import java.util.Scanner;

public class Search2Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your row value:");
        int rows = sc.nextInt();
        System.out.println("enter your cols value:");
        int cols = sc.nextInt();

        int [][] array = new int[rows][cols];
        System.out.println("enter the values into the matrix:");
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array.length;j++){
            array[i][j] = sc.nextInt(); 
        }
    }

        System.out.println("your matrix is :");
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array.length;j++){

        System.out.print(array[i][j]+" ");
        }
        System.out.println();
    }

    // searching an element in the matrix
    System.out.println("enter the element to search:");
        int x = sc.nextInt();

        
        for (int i=0;i<rows;i++){
            for (int j=0;j<cols;j++){
                if(array[i][j]==x){
                    System.out.println("Your Searching element is found at position " + "("+ i + "," + j+ ")");
                }
            }
            System.out.println();
        }
    }
}
