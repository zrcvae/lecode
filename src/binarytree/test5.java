package binarytree;

import java.util.*;

// 二叉树的右视图
public class test5 {

    public List<Integer> levelOrder(TreeNode root){
        List<Integer> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if (root == null) {
            return list;
        }
        queue.offer(root);
        while (!queue.isEmpty()){
            int size = queue.size();
            while (size > 0){
                TreeNode node = queue.poll();
                // 返回每个队列最后一个节点
                if (size == 1){
                    list.add(node.val);
                }
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
        }
        return list;
    }

}
