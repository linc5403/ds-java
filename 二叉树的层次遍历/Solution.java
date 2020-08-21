package com.company;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        if (root == null)
            return null;

        List<List<TreeNode>> rNode = new ArrayList<>();

        // 将root放到第0行
        List<TreeNode> line0 = new ArrayList<>();
        line0.add(root);
        rNode.add(line0);

        // 遍历每一行，取他们的下一层节点放入新的一行
        for (int i = 0; ; i++) {
            // 取第i行，生成第i+1行
            List<TreeNode> lineI = rNode.get(i);

            List<TreeNode> lineI_1 = new ArrayList<>();
            for (int j = 0; j < lineI.size(); j++) {
                TreeNode father = lineI.get(j);
                if (father.left != null)
                    lineI_1.add(father.left);
                if (father.right != null)
                    lineI_1.add(father.right);
            }
            if (!lineI_1.isEmpty())
                rNode.add(lineI_1);
            else
                break;
        }

        // rNode 已经ok
        List<List<Integer>> rNumber = new ArrayList<>();
        int lineLen = rNode.size();
        for (int i = 0; i < lineLen; i++) {
            List<TreeNode> lineNode = rNode.get(lineLen-1-i);
            List<Integer> lineNumber = new ArrayList<>();
            for (int j = 0; j < lineNode.size(); j++)
                lineNumber.add(lineNode.get(j).val);
            rNumber.add(lineNumber);
        }
        return rNumber;
    }
}
