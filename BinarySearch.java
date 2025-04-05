public class BinarySearch {
    static int printN(int[] arr, int target){
        int n=arr.length;
        int start=0;
        int end=n-1;
        int mid=0;
        while (start<=end) {
            mid=(int)Math.floor((start+end)/2);
            if (arr[mid]==target) {
                return mid;
            }else if (arr[mid]>target) {
                end=mid-1;
                
            }else{
                start=mid+1;
            }
            
        }
        return -1;
    }
    public static void main(String[] args) {
        int n[]={2,5,7,9,12,34,56,78,89,100};
        int target=89;
        int result=printN(n, target);
        if (result==-1) {
            System.out.println("Element is not present in array");
            
        }else{
            System.out.println("Element is present at index "+result);
        }
        // System.out.println(result);
    }
    
}
