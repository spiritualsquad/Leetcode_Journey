public class Solution {

        public static void main(String[] args) {
            int[] a = {-1,4,-6,8};
            int maxSum = a[0];
            int currentSum = a[0];
            for(int i =1;i<a.length;i++){
                if(a[i]>currentSum+a[i]){
                    currentSum =a[i];
                }else{
                    currentSum = currentSum +a[i];
                }
                if(currentSum>maxSum){
                    maxSum=currentSum;
                }

            }
            System.out.println("Max sum="+maxSum);
        }
    }