package com.company.dfs;

public class BinaryTreeDFS {
    /**
     * 이진트리순회 (DFS) 레벨 탐색
     */
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    public static void DFS(Node root) {
        if (root == null) {
            return;
        } else {
            System.out.print(root.data + " ");
            DFS(root.left);
            DFS(root.right);
        }
    }

    public static void main(String[] args) {
        Node node = new Node(1);
        node.left = new Node(2);
        node.right = new Node(3);
        node.left.left = new Node(4);
        node.left.right = new Node(5);
        node.right.left = new Node(6);
        node.right.right = new Node(7);
        DFS(node);
    }
}
