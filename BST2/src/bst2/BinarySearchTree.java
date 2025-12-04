/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bst2;

/**
 *
 * @author ADMIN
 */
public class BinarySearchTree {
    TreeNode root;

    public void insert(int value) {
        root = insertRec(root, value);
    }

    private TreeNode insertRec(TreeNode node, int value) {
        if (node == null) return new TreeNode(value);

        if (value < node.data) {
            node.left = insertRec(node.left, value);
        } else if (value > node.data) {
            node.right = insertRec(node.right, value);
        }
        return node; // ignore duplicates
    }

    public boolean search(int value) {
        return searchRec(root, value);
    }

    private boolean searchRec(TreeNode node, int value) {
        if (node == null) return false;
        if (node.data == value) return true;

        if (value < node.data) return searchRec(node.left, value);
        else return searchRec(node.right, value);
    }

    public void inorder(TreeNode node) {
        if (node == null) return;
        inorder(node.left);
        System.out.print(node.data + " ");
        inorder(node.right);
    }
}