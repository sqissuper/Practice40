package test;

import java.math.BigInteger;
import java.util.Arrays;

/**
 * ClassName:TextDemo2
 * Package:test
 * Description:
 *
 * @Author:HP
 * @date:2021/5/18 22:29
 */
public class TextDemo2 {
    //283. 移动零
//    public static void moveZeroes(int[] nums) {
//        for(int i = 0; i < nums.length - 1; i++) {
//            int tmp = nums[i];
//            if(tmp == 0) {
//                int j = i + 1;
//                while( j < nums.length && nums[j] == 0) j++;
//                if(j < nums.length) nums[i] = nums[j];
//                for(;j < nums.length - 1; j++) {
//                    nums[j] = nums[j + 1];
//                }
//                if(j < nums.length) nums[j] = tmp;
//            }
//        }
//    }

//    public static void oddInOddEvenInEven(int[] arr) {
//        int n = arr.length;
//        for(int i = 0; i < n - 1; i += 2) {
//            if(arr[i] % 2 != 0) {
//                if(i < n - 1) {
//                    for(int j = i + 1; j < n; j++) {
//                        if(arr[j] % 2 == 0) {
//                            int tmp  = arr[i];
//                            arr[i] = arr[j];
//                            arr[j] = tmp;
//                            break;
//                        }
//                    }
//                }
//            }
//        }
//    }

    //14. 最长公共前缀
//    public static String longestCommonPrefix(String[] strs) {
//        if(strs == null && strs.length == 0) return "";
//        String res = "";
//        String s = strs[0];
//        int i = 0;
//        for(int j = i + 1; j <= s.length(); j++) {
//            boolean f = true;
//            String tmp = s.substring(i,j);
//            for(int k = 1; k < strs.length; k++) {
//                if(j <= strs[k].length()) {
//                    if(!tmp.equals(strs[k].substring(i,j))) {
//                        f = false;
//                    }
//                } else {
//                    f = false;
//                }
//            }
//            if(f) {
//                res = tmp;
//            } else {
//                break;
//            }
//        }
//        return res;
//    }
    public static void main(String[] args) {
//        String[] s = {"dog","racecar","car"};
//        System.out.println(longestCommonPrefix(s));
//        int[] arr = {1,2,2};
//        oddInOddEvenInEven(arr);
//        System.out.println(Arrays.toString(arr));
//        int[] arr = {0,1,0,3,12};
//        moveZeroes(arr);
//        System.out.println(Arrays.toString(arr));

    }
}
