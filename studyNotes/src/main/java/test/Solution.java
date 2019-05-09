package test;

import com.google.common.collect.Sets;

import java.util.HashSet;

public class Solution {

    public static void main(String[] args){
        int abcabcbb = lengthOfLongestSubstring1("abcasadasaxczxzczvbfgjytjbcbb");
        System.err.println(abcabcbb);
    }

    static int lengthOfLongestSubstring(String s) {
        int stIdx = 0, maxLen = 0;
        int arr[] = new int[128];
        for(int i=0;i<s.length();i++){
            stIdx = Math.max(arr[s.charAt(i)],stIdx);
            maxLen = Math.max(maxLen, i-stIdx+1);
            arr[s.charAt(i)] = i+1;
        }
        return maxLen;
    }

    static int lengthOfLongestSubstring1(String s) {
        HashSet<Object> objects = Sets.newHashSet();
        char[] chars = s.toCharArray();
        for (char aChar : chars) {
            objects.add(aChar);
        }
        return objects.size();
    }
}
