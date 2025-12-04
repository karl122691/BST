/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bst;

/**
 *
 * @author ADMIN
 */
public class BST {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     BinaryTree bt = new BinaryTree();
    bt.insertManual(10);
    bt.insertManual(4);
    bt.insertManual(15);
    bt.insertManual(2);

    System.out.print("Inorder: ");
    bt.inorder(bt.root);
    System.out.println();
}
}