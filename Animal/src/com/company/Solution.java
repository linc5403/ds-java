package com.company;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    public boolean isAnagram(String s, String t) {
        // 两个hashmap分别存放字符及其出现次数
        HashMap<Character, Integer> sMap = new HashMap<Character, Integer>();
        HashMap<Character, Integer> tMap = new HashMap<Character, Integer>();

        for (int i = 0; i < s.length(); i++) {
            char currChar = s.charAt(i);
            if (sMap.containsKey(currChar)) {
                Integer v = sMap.get(currChar);
                v++;
                sMap.replace(currChar, v);
            } else {
                sMap.put(currChar, 1);
            }
        }

        for (int i = 0; i < t.length(); i++) {
            char currChar = t.charAt(i);
            if (tMap.containsKey(currChar)) {
                Integer v = tMap.get(currChar);
                v++;
                tMap.replace(currChar, v);
            } else {
                tMap.put(currChar, 1);
            }
        }

        // 比较sMap和tMap里面是否一致
        Set<Character> sKeySet = new HashSet<>(sMap.keySet());

        for (Character c: sKeySet) {
            Integer vS = sMap.remove(c);
            Integer vT = tMap.remove(c);
            if (vS == vT)
                continue;
            else
                return false;
        }
        return tMap.isEmpty();
    }
}
