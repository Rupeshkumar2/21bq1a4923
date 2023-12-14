import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Arrays {
    public static void main(String[] args) {
//        int[] arr={1,1,1,1};
//        Count_pairs_with_given_sum(arr,2);
//        int[] nums={3,0,1,1,9,7};
//        leetcode1534(nums,7,2,3);
        int[] nums={13,25,83,77};
        separateDigits(nums);
    }

    static void Min_Max(int[] arr){
        int max=arr[0], min=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>max)max=arr[i];
            if(arr[i]<min)min=arr[i];
        }
        System.out.println("Max:"+max+" Min:"+min);
    }

    static void Count_pairs_with_given_sum(int[] arr,int target){
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]+arr[j]==target)
                    count++;
            }
        }
        System.out.println(count);
    }

    static void leetcode1913(int[] arr){
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                int temp=0;
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
            res.add(arr[i]);
        }
        System.out.println(Math.abs((arr[arr.length-1]* arr[arr.length-2])-(arr[0]*arr[1])));
    }

    static void leetcode1732(int[] arr){
        ArrayList<Integer> temp = new ArrayList<>();
        temp.add(0);
        for (int i = 0; i < arr.length; i++) {
            temp.add(temp.get(i)+arr[i]);
        }
        System.out.println(Collections.max(temp));
    }

    static void leetcode1534(int[] arr, int a, int b, int c){
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(Math.abs(arr[i]-arr[j])<=a)
                    for (int k = j+1; k < arr.length; k++) {
                        if ((Math.abs(arr[j]-arr[k])<=b) && (Math.abs(arr[i]-arr[k])<=c))
                            count++;
                    }
            }
        } System.out.println(count);
    }

    static void separateDigits(int[] nums) {
        int j = 0;
        ArrayList<Integer> temp = new ArrayList<>();
        for(int i:nums){
            for(;j<i;j/=10){
                temp.add(j%10);
            }
        }
        System.out.println(temp);
    }
}
