package binarytree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// 层次遍历
public class test3 {
    public List<List<Integer>> resList = new ArrayList<>();
    public List<List<Integer>> levelOrder(TreeNode root){
        checkFun(root);
        return resList;
    }
    // 递归法
    public void checkFun01(TreeNode root, Integer deep){
        if (root == null)return;
        deep++;
        if (resList.size() < deep){
            List<Integer> item = new ArrayList<>();
            resList.add(item);
        }
        resList.get(deep - 1).add(root.val);
        checkFun01(root.left, deep);
        checkFun01(root.right, deep);

    }

    // 借助队列（迭代法）
    public void checkFun(TreeNode root){
        Queue<TreeNode> queue = new LinkedList<>();
        if (root == null) return;
        queue.offer(root);
        while (!queue.isEmpty()){
            List<Integer> list = new ArrayList<>();
            int size = queue.size();
            while (size > 0){
                TreeNode node = queue.poll();
                list.add(node.val);
                if (node.left != null){
                    queue.offer(node.left);
                }
                if (node.right != null){
                    queue.offer(node.right);
                    size--;
                }
            }
            resList.add(list);
        }
    }
}
