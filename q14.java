import java.util.Arrays;

public class q14 {
    public static void main(String[] args) {
        int nums[]={4,5,6,7,0,1,2};
        int l=0,h=nums.length-1;
                while(l<h)
                {
                    int mid=l+(h-l)/2;
                    if(nums[mid]>nums[h])
                        l=mid+1;
                    else
                        h=mid;
                }
        System.out.println(Arrays.toString(new int[]{nums[h]}));
            }
        }


