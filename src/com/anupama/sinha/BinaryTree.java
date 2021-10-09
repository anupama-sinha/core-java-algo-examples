package com.anupama.sinha;

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
                    System.out.println("Deletion Logic yet to be implemented...");
                    break;
                case -1 :
                    System.out.println("Terminating...");
                    break;
                default:
                    System.out.println("Invalid Option! Try Again!");

            }
        }

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

    private static BinaryTree createSimpleBinaryTree(BinaryTree tree) {
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
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
