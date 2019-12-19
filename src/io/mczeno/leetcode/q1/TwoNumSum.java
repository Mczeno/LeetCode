package io.mczeno.leetcode.q1;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;

/**
 * TwoNumSum
 *
 * @author Chongming Zhou
 */
public class TwoNumSum {

    private static final int[] ARRAY = {1, 32, 89, 7, 45};
    private static final int TARGET = 96;

    public static void main(String[] args) {
        Map<Integer, Map.Entry<Integer, Integer>> sumIndexMap = convertToSumIndexMap(ARRAY);
        Map.Entry<Integer, Integer> indexEntry = sumIndexMap.get(TARGET);
        System.out.println("[" + indexEntry.getKey() + ", " + indexEntry.getValue() + "]");
    }

    private static Map<Integer, Map.Entry<Integer, Integer>> convertToSumIndexMap(int[] array) {
        Map<Integer, Map.Entry<Integer, Integer>> result = new HashMap<>();

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                result.put(array[i] + array[j], new AbstractMap.SimpleImmutableEntry<>(i, j));
            }
        }

        return result;
    }


}
