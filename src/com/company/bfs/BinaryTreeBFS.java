package com.company.bfs;
import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeBFS {
    /**
     * 이진트리순회 (BFS) 레벨 탐색
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

    public static void BFS(Node root) {
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        int sequence = 1;
        while (!queue.isEmpty()) {
            int size = queue.size();
            System.out.print("[" + sequence + "] ");
            for (int i = 0; i < size; i++) {
                Node current = queue.poll();
                System.out.print(current.data + " ");

                if (current.left != null)
                    queue.offer(current.left);
                if (current.right != null)
                    queue.offer(current.right);
            }
            sequence++;
            System.out.println();
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
        BFS(node);
    }
}
