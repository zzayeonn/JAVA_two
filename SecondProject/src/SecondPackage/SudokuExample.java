package SecondPackage;

import java.util.Random;

public class SudokuExample {

	private static int SIZE = 10;
    public static int matrix[][] = new int[SIZE][SIZE];
 
    public static void main(String[] args) {
        for (int i = 1; i < SIZE; i++) {
            for (int j = 1; j < SIZE; j++) {
                matrix[i][j] = 0;
            }
        }
        fill(0);
    }
    public static void fill(int cnt){
        if(cnt==81){
            for(int i=1;i<=9;i++){
                for(int j=1;j<=9;j++){
                    System.out.print(matrix[i][j]+"");
                }
                System.out.println();
            }
            System.exit(0);
        }
        int y=0;
        int x=0;
        boolean Check=true;
        for(int i=1;i<=9;i++){
            for(int j=1;j<=9;j++){
                if(matrix[i][j]==0){
                    y=i;
                    x=j;
                    Check=false;
                    break;
                }
            }
            if(!Check) break;
        }
        if(Check) return ;
 
        for(int n=1;n<=9;n++){
            Random r=new Random();
            int num=r.nextInt(9)+1;
            if(isSafe(num,y,x)){
                matrix[y][x]=num;
                fill(cnt+1);
                matrix[y][x]=0;
            }
        }
    }
 
    public static boolean isSafe(int n, int y, int x) {
        if (checkRow(y, n) && checkCol(x, n) && checkBox(y, x, n))
            return true;
 
        return false;
    }
 
    public static boolean checkCol(int x, int n) {
        for (int i = 1; i <= 9; i++) {
            if (matrix[i][x] == n)
                return false;
        }
        return true;
    }
 
    public static boolean checkRow(int y, int n) {
        for (int j = 1; j <= 9; j++) {
            if (matrix[y][j] == n)
                return false;
        }
        return true;
    }
    public static boolean checkBox(int y,int x,int n){
        int row = ((int) Math.ceil(y / 3.0) - 1) * 3 + 1;
        int col = ((int) Math.ceil(x / 3.0) - 1) * 3 + 1;
        for (int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(matrix[row+i][col+j]==n)
                    return false;
            }
        }
        return true;
    }


}
