/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bst2;

/**
 *
 * @author ADMIN
 */
public class BST2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    BinarySearchTree bst = new BinarySearchTree();
    bst.insert(10);
    bst.insert(4);
    bst.insert(15);
    bst.insert(2);
    bst.insert(8);

    System.out.print("BST inorder (sorted): ");
    bst.inorder(bst.root);
    System.out.println();

    System.out.println("Search 8: " + bst.search(8));
    System.out.println("Search 99: " + bst.search(99));
}
}