public class MaxConsecutive {
    public static int printN(int[] nums) {
        int n = nums.length;
        int c = 0;
        int c1 = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 1) {
                c++;
                if (c > c1) {
                    c1 = c;
                }
            } else {
                c = 0;
            }

        }
        return c1;

    }
    public static void main(String[] args) {
        int m[]={1,0,1,1,1,0,1};
        System.out.println(printN(m));
    }

}
