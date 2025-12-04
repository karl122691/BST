/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bst;

/**
 *
 * @author ADMIN
 */
public class BinaryTree {
    TreeNode root;

    // Not a BST insert – just “fill” the tree
    public void insertManual(int value) {
        root = insertManual(root, value);
    }

    private TreeNode insertManual(TreeNode node, int value) {
        if (node == null) {
            return new TreeNode(value);
        }

        // Example rule for a “non-ordered” tree:
        // always try to fill the left child first, then right.
        if (node.left == null) {
            node.left = new TreeNode(value);
        } else if (node.right == null) {
            node.right = new TreeNode(value);
        } else {
            // if both are full, just keep going down the left side
            insertManual(node.left, value);
        }
        return node;
    }

    // Traversals (recursive)
    public void inorder(TreeNode node) {
        if (node == null) return;
        inorder(node.left);
        System.out.print(node.data + " ");
        inorder(node.right);
    }

    public void preorder(TreeNode node) {
        if (node == null) return;
        System.out.print(node.data + " ");
        preorder(node.left);
        preorder(node.right);
    }

    public void postorder(TreeNode node) {
        if (node == null) return;
        postorder(node.left);
        postorder(node.right);
        System.out.print(node.data + " ");
    }
}