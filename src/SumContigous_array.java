public class SumContigous_array {
    static int MaxSubarray(int arr[]){
        int size= arr.length;
        int max_so_far=Integer.MIN_VALUE;
        int endinghere=0;
        for(int i=0;i<size;i++){
         endinghere = endinghere + arr[i];
         if(max_so_far<endinghere)
             max_so_far=endinghere;
         if(endinghere<0)
             endinghere=0;
        }
        return max_so_far;
    }

    public static void main(String[] args) {
        int a[] ={-2,-3,4,-1,-2,1,5,-1};
        System.out.println(MaxSubarray(a));
    }
}
