package arrays;
class ProductofArrayExceptSelf{
   public static void main(String[] args) {
   int[] nums = {-1,1,0,-3,3};
   int[] res = productexceptself(nums);
   for(int val : res){
    System.out.println(val);
   }

       
   }
   public static int[] productexceptself(int[] nums){
    int n = nums.length;
    int[] leftproduct = new int [n];
    int[] rightproduct = new int[n];
    int[] res = new int[n];
    //prefix product
    int product=1;
    for(int i=0 ; i <nums.length; i++){
      product *=  nums[i];
      leftproduct[i] = product;
    }
    //suffix product
    product = 1;
    for(int i=n-1; i>0; i--){
        product*=nums[i];
        rightproduct[i]=product;
    }
    for(int i=1; i<n-1; i++){
        res[i]=leftproduct[i-1]*rightproduct[i+1];
    }
     return res;
   }
   
}
