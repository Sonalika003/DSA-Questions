import java.util.Arrays;
public class TwoSum {
    static int[] printN(int[] nums , int target ){
       int[] res={-1,-1};
       int n= nums.length;
       for(int i =0;i<n;i++){
        for(int j =i+1;j<n;j++){
            if(nums[i]+nums[j]==target){
                res[0]=i;
                res[1]=j;
                return res;
            }
        }
       }
       return res;

    }
    public static void main(String[] args) {
        int n[]={2,4,6,7};
        int t=11;
        System.out.println(Arrays.toString(printN(n,t)));
    }
}