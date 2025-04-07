class EvenNoOfDigit {
    public static int findNumbers(int[] nums) {
        int c=0;
        for(int i =0;i<nums.length;i++){
            int d=0;
            int n=nums[i];
            while(n>0){
                n=n/10;
                d++;
            }
            if(d%2==0){
                c++;
            }
           
        }
          return c;
       
    }
    public static void main(String[] args) {
        int m[]={12,345,6,7890,89,908,9876,45};
        System.out.println(findNumbers(m));
    }
}