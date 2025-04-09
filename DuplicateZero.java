public class DuplicateZero {
    static void printN(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                for (int j = n - 1; j > i; j--) {
                    arr[j] = arr[j - 1];
                }
                if (i + 1 < n) {
                    arr[i + 1] = 0;
                    i++;
                }
            }
        }
        for(int k = 0;k<n;k++) {
             System.out.print(arr[k] + "  ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {1, 0, 4, 5,0,9,7};
        printN(arr);
    }

}
