import java.util.Arrays;

public class q5 {
    public static void main(String[] args) {
        int arr[]={3,4,1,9,56,7,9,12};
        int m=5;
        int n=8;

        int min=Integer.MAX_VALUE;
        Arrays.sort(arr);


        for (int i=0;i+m-1<n;i++) {

            int x=arr[i+m-1]-arr[i];

           min=Math.min(min,x);


            } System.out.println(min);

            }
        }



