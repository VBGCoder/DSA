public class q6 {
    public static void main(String[] args) {
        int arr[]={7,8,9,6,1,2,3,4,5,6};
        int t=6;

        for (int i=0;i<arr.length;i++) {
            if (t==arr[i]){
                System.out.println(arr[i]);
                return;



            }else  System.out.println(-1);
        }
    }
}
