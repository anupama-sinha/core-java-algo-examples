package com.anupama.sinha;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//Node
class Node{
    int key;
    Node left,right;

    Node(int item){
        key = item;
        left = right = null;
    }
}
public class BinaryTree {
    Node root;


    BinaryTree(int key){
        root = new Node(key);
    }

    public static void main(String[] args) {
        int opt=0;
        BinaryTree tree = new BinaryTree(1);    //Default root with key 1
        Scanner sc = new Scanner(System.in);
        int item;
        while(opt!=-1){
            System.out.println();
            System.out.println("*******************************");
            System.out.println("*       Binary Tree           *");
            System.out.println("*******************************");
            System.out.println("1.  Create Simple Binary Tree"); //Hardcoded Entries
            System.out.println("2. Add a Node");
            System.out.println("3. Show DFS Inorder Traversal");
            System.out.println("4. Check if Node Exists");
            System.out.println("5. Delete a Node");
            System.out.println("6. Show DFS Preorder Traversal");
            System.out.println("7. Show DFS Postorder Traversal");
            System.out.println("-1. Terminate");
            System.out.println("Enter option[N] => ");

            opt = sc.nextInt();
            switch (opt){
                case 1 :
                    tree = createSimpleBinaryTree(tree);
                    break;
                case 2 :
                    System.out.println("Enter Node's Key[N] => ");
                    //Scanner sc1 = new Scanner(System.in);
                    item = sc.nextInt();
                    addRecursive(tree.root,item);
                    System.out.println("Node Added");
                    break;
                case 3 :
                    showDfsInorderTraversal(tree.root);
                    break;
                case 4:
                    System.out.println("Enter Node's Key to find[N] => ");
                    item = sc.nextInt();
                    if(containsNodeRecursive(tree.root,item))
                        System.out.println("Node exists");
                    else
                        System.out.println("Node doesn't exist");
                    break;
                case 5:
                    System.out.println("Enter Node's Key to delete[N] => ");
                    item = sc.nextInt();
                    tree.root = deleteRecursive(tree.root,item);
                    System.out.println("Node deleted");
                    break;
                case 6 :
                    showDfsPreorderTraversal(tree.root);
                    break;
                case 7 :
                    showDfsPostorderTraversal(tree.root);
                    break;
                case 8 :
                    showBfsTraversal(tree.root);
                    break;
                case -1 :
                    System.out.println("Terminating...");
                    break;
                default:
                    System.out.println("Invalid Option! Try Again!");

            }
        }

    }

    private static void showBfsTraversal(Node root) {
        if (root == null) {
            return;
        }

        Queue<Node> nodes = new LinkedList<>();
        nodes.add(root);

        while (!nodes.isEmpty()) {

            Node node = nodes.remove();

            System.out.print(" " + node.key);

            if (node.left != null) {
                nodes.add(node.left);
            }

            if (node.right != null) {
                nodes.add(node.right);
            }
        }
    }

    private static Node deleteRecursive(Node current, int item) {
        if(current == null)
            return null;
        if(item == current.key){
            //Delete & regenerate tree
            if(current.left == null && current.right == null)
                return null;
            if(current.right == null)
                return current.left;
            if(current.left == null)
                return current.right;
            //If 2 children
            int smallestValue = findSmallestValue(current.right);
            current.key = smallestValue;
            current.right = deleteRecursive(current.right, smallestValue);
            return current;
        }
        if(item < current.key){
            current.left = deleteRecursive(current.left,item);
            return current;
        }
        current.right = deleteRecursive(current.right,item);
        return current;

    }

    private static int findSmallestValue(Node root) {
        return root.left == null ? root.key : findSmallestValue(root.left);
    }

    private static boolean containsNodeRecursive(Node current, int item) {
        if (current == null) {
            return false;
        }
        if (item == current.key) {
            return true;
        }
        return item < current.key
                ? containsNodeRecursive(current.left, item)
                : containsNodeRecursive(current.right, item);
    }

    private static void showDfsInorderTraversal(Node root) {
        if(root != null){
            showDfsInorderTraversal(root.left);
            System.out.print(" " + root.key);
            showDfsInorderTraversal(root.right);
        }
    }

    private static void showDfsPreorderTraversal(Node root) {
        if(root != null){
            System.out.print(" " + root.key);
            showDfsInorderTraversal(root.left);
            showDfsInorderTraversal(root.right);
        }
    }

    private static void showDfsPostorderTraversal(Node root) {
        if(root != null){
            showDfsInorderTraversal(root.left);
            showDfsInorderTraversal(root.right);
            System.out.print(" " + root.key);
        }
    }

    private static BinaryTree createSimpleBinaryTree(BinaryTree tree) {
        tree.root = new Node(3);
        tree.root.left = new Node(2);
        tree.root.right = new Node(4);
        tree.root.left.left = new Node(1);
        System.out.println("Simple Binary Tree Created!");
        return tree;
    }

    private static Node addRecursive(Node current, int item){
        if(current==null)
            return new Node(item);
        if(item<current.key)
            current.left = addRecursive(current.left,item);
        else if(item > current.key)
            current.right = addRecursive(current.right,item);
        return current;
    }
}
