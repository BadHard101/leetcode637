package org.example;

import java.util.ArrayList;
import java.util.List;

class Solution1 {

    public List<Double> averageOfLevels(TreeNode root) {

        ArrayList<TreeNode> arr = new ArrayList<>();
        ArrayList<Double> ans = new ArrayList<>();
        
        ans.add((double) root.val);
        arr.add(root);

        while (!arr.isEmpty()) {
            double sum = 0;
            int size = arr.size();
            for (int i = 0; i < size; i++) {
                TreeNode cur = arr.remove(0);

                if (cur.left != null) {
                    sum += cur.left.val;
                    arr.add(cur.left);
                }
                if (cur.right != null) {
                    sum += cur.right.val;
                    arr.add(cur.right);
                }
            }

            if (!arr.isEmpty()) ans.add(sum / arr.size());
        }

        return ans;
    }
}