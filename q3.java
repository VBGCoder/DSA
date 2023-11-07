public class q3 {
    public static void main(String args[]) {
        int arr[]={-2,1,5,-8,5,2,5,2,-8};
        int max=0;
        int cur=0;

        for (int i=0;i< arr.length;i++) {
            cur=cur+arr[i];
            max =Math.max(max,cur);

            if(cur<0) {
                cur=0;
            }
            System.out.println(max);
        }

    }
}
