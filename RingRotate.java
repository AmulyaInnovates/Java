import java.util.Scanner;

public class RingRotate {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the number of rows :- ");
        int n= sc.nextInt();
        
        System.out.println("Enter the number of columns :- ");
        int m= sc.nextInt();

        int[][] arr = new int[n][m];
        System.out.println("Enter the elements of the " + n + "x" + m + " matrix :- ");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]= sc.nextInt();
            }
        }

        // Show the matrix before updates
        System.out.println("Matrix before updates:");
        display(arr);

        System.out.println("Enter the Ring number (sno) :- ");
        int sno= sc.nextInt();

        System.out.println("Enter the number of rotations (rno) :- ");
        int rno = sc.nextInt();
        
        ringrotate(arr, sno, rno);

        // Show the matrix after updates
        System.out.println("Matrix after updates:");
        display(arr);
    }

    public static void ringrotate(int[][] arr, int sno, int rno){
        int[] la = fill1Dfrom2D(arr, sno);

        rotate1D(la, rno);
        fill2Dfrom1D(arr, la, sno);
    }

    public static int[] fill1Dfrom2D(int[][] arr, int sno){
        int rmin= sno-1;
        int cmin= sno-1;
        int rmax=arr.length - sno;
        int cmax=arr[0].length - sno;
        
        int sz= 2*(rmax-rmin + cmax-cmin);
        int[] la = new int[sz];
        int idx=0;

        for (int row= rmin; row<= rmax; row++){
            la[idx]= arr[row][cmin];
            idx++;
        }
        cmin++;

        for (int col= cmin; col<= cmax; col++){
            la[idx]= arr[rmax][col];
            idx++;
        }
        rmax--;

        for (int row= rmax; row >= rmin; row--){
            la[idx]= arr[row][cmax];
            idx++;
        }
        cmax--;

        for (int col= cmax; col >= cmin; col--){
            la[idx]= arr[rmin][col];
            idx++;
        }
        rmin++;

        return la;
    }

    public static void rotate1D(int[] la, int rno){
        rno = rno % la.length;

        if (rno < 0){
            rno += la.length;
        }

        reverse(la, 0, la.length - 1);
        reverse(la, 0, rno - 1);
        reverse(la, rno, la.length - 1);
    }

    public static void reverse(int[] la, int left, int right){
        while (left < right){
            int temp = la[left];
            la[left] = la[right];
            la[right] = temp;
            left++;
            right--;
        }
    }

    public static void fill2Dfrom1D(int[][] arr, int[] la, int sno){
        int rmin = sno - 1;
        int cmin = sno - 1;
        int rmax = arr.length - sno;
        int cmax = arr[0].length - sno;

        int idx = 0;
        for (int row = rmin; row <= rmax; row++){
            arr[row][cmin] = la[idx];
            idx++;
        }
        cmin++;

        for (int col = cmin; col <= cmax; col++){
            arr[rmax][col] = la[idx];
            idx++;
        }
        rmax--;

        for (int row = rmax; row >= rmin; row--){
            arr[row][cmax] = la[idx];
            idx++;
        }
        cmax--;

        for (int col = cmax; col >= cmin; col--){
            arr[rmin][col] = la[idx];
            idx++;
        }
    }

    public static void display(int[][] arr) {
        for (int[] row : arr) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
