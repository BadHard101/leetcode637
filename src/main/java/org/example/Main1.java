package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main1 {
    List<Double> ans = new ArrayList<>();
    HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();

    public List<Double> averageOfLevels(TreeNode root) {
        if (root == null) return ans;
        ans.add((double) root.val);
        avgLvls(root.left, 1);
        avgLvls(root.right, 1);

        int level = 1;
        ArrayList<Integer> array = map.get(level);
        while (array != null) {
            int n = map.get(level).size();
            Double avg = 0.0;

            for (int i = 0; i < n; i++)
                avg += array.get(i);
            avg /= n;
            ans.add(avg);

            array = map.get(++level);
        }

        return ans;
    }

    public void avgLvls(TreeNode root, int level) {
        if (root == null) return;
        ArrayList<Integer> temp = map.getOrDefault(level, new ArrayList<>());
        temp.add(root.val);
        map.put(level, temp) ;
        avgLvls(root.left, level+1);
        avgLvls(root.right, level+1);
    }
}