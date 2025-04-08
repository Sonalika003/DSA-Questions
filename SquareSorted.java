import java.util.Arrays;

public class SquareSorted {
    static int[] printN(int arr[]){
        int n = arr.length;
        int[] c= new int[n];
        for(int i =0;i<n;i++){
           c[i]= arr[i]*arr[i];

        }
        int b= c.length;
        for (int s = 0; s < b - 1; s++) {              //sorting
            for (int j = 0; j < b -s- 1; j++) {
                if (c[j] >= c[j + 1]) {
                    int temp = c[j];
                   c[j] = c[j+1];
                    c[j+1] = temp;
                }
            }

        }
        return c;
    }
    public static void main(String[] args) {
        int m[]={-2,1,0,7,2,-5,10,6};
       System.out.println(Arrays.toString(printN(m)));

    }
    
    
}
