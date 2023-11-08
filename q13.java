import java.util.*;



public class q13 {
    public static void main(String[] args) {

        int arr[]={2,3,-2,4};
        int ans=1;
        int max = 1, min=1;

        for (int i=0; i< arr.length;i++){
            if(arr[i]<0){
               int temp=max;
               max=min;
               min=temp;

            }

            max=Math.max(arr[i], max*arr[i]);
            min=Math.min(arr[i], min*arr[i]);
            ans=Math.max(ans,max);
        }
        System.out.println(ans);

    }
}
