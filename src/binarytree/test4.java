package binarytree;

import java.util.*;

// 返回其节点值 自底向上的层序遍历
public class test4 {
    public List<List<Integer>> resList = new ArrayList<>();
    public List<List<Integer>> levelOrder(TreeNode root){
        checkFun(root);
        Collections.reverse(resList);  // 反转字符串
        return resList;
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

                }
                size--;
            }
            // 每次都往队头塞(这样就不需要反转字符串)
            // result.addFirst(oneLevel);
            resList.add(list);
        }
    }
}
