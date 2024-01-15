package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    List<Double> ans = new ArrayList<>();

    public List<Double> averageOfLevels(TreeNode root) {
        if (root == null) return ans;
        ans.add((double) root.val);
        avgLvls(root, 0);
    }

    public List<Double> avgLvls (TreeNode root, int level) {
        Double avg = (root.left.val + root.right.val) / 2.0;
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}