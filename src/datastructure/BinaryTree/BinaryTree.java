package datastructure.BinaryTree;

import datastructure.node.BinaryNode;
import org.w3c.dom.Node;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {


    BinaryNode node;

    public BinaryTree() {
        this.node = null;
    }


    public static void main(String[] args) {

        BinaryTree binaryTree=new BinaryTree();

        binaryTree.node=new BinaryNode(1);
        binaryTree.node.getLeft()=new BinaryNode(2);
        binaryTree.node.getRight()=new BinaryNode(3);
        binaryTree.node.getLeft()=new BinaryNode(4);
        binaryTree.node.left.right=new BinaryNode(5);
        binaryTree.node.right.left=new BinaryNode(6);
        binaryTree.node.right.right=new BinaryNode(7);


        System.out.println("Level order traversal of binary tree is ");
        binaryTree.printLevelOrder();
    }

    void printLevelOrder(){

        Queue<BinaryNode> queue=new LinkedList<>();

        queue.add(node);

        while (!queue.isEmpty()){

            BinaryNode node=queue.poll();

            System.out.println(node.data);

            if (node.left!=null)
            queue.add(node.left);

            if (node.right!=null)
            queue.add(node.right);

        }


    }

    private int heightOfTree(BinaryNode root){

        if (root==null)
            return 0;
        else {
            int lheight = heightOfTree(root.left);
            int rheight = heightOfTree(root.right);

            if (lheight>rheight){
                return lheight+1;
            }else {
                return rheight+1;
            }
        }
    }


}
