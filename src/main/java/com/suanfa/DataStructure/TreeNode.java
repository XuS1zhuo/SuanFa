package com.suanfa.DataStructure;

import lombok.Data;

/**
 * @Author XuS1zhuo
 * @Description TODO
 * @Date 2023/1/15 12:19
 * @Version 1.0
 */
@Data
public class TreeNode {

    private Object data;

    private TreeNode left;

    private TreeNode right;

    public void preOrder(TreeNode root){
        if(root == null){
            return;
        }
        System.out.println(root.data);
        preOrder(root.left);
        preOrder(root.right);
    }

    public void inOrder(TreeNode root){
        if(root == null){
            return;
        }
        inOrder(root.left);
        System.out.println(root.data);
        inOrder(root.right);
    }

    public void postOrder(TreeNode root){
        if(root == null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.data);
    }




}
