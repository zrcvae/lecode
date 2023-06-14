package binarytree;

import java.util.ArrayList;
import java.util.List;

// 二叉树前中后序递归遍历(递归方式实现)
public class test1 {
    // 前序遍历
    public List<Integer> preorderTraversal(TreeNode root){
        List<Integer> result = new ArrayList<>();
        preorder(root, result);
        return result;
    }
    public void preorder(TreeNode root, List<Integer> result){
        if (root == null){
            return;
        }
        result.add(root.val);
        preorder(root.left, result);
        preorder(root.right, result);
    }

    // 中序遍历
    public List<Integer> inorderTraversal(TreeNode root){
        List<Integer> res = new ArrayList<>();
        inorder(root, res);
        return res;
    }
    void inorder(TreeNode root, List<Integer> res){
        if (root == null) return;
        inorder(root.left, res);
        res.add(root.val);
        inorder(root.right, res);
    }

    // 后序遍历
    public List<Integer> postorderTraversal(TreeNode root){
        List<Integer> res = new ArrayList<>();
        postorder(root, res);
        return res;
    }
    void postorder(TreeNode root, List<Integer> res){
        if (root == null) return;
        postorder(root.left, res);
        postorder(root.right, res);
        res.add(root.val);
    }

}
