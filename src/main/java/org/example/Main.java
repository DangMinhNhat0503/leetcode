package org.example;


import leetcode.SameTree.IsSameTreeSolution;
import leetcode.SameTree.TreeNode;

public class Main {
    public static void main(String[] args) {
        IsSameTreeSolution isSameTreeSolution = new IsSameTreeSolution();

        TreeNode p = new TreeNode (0, new TreeNode(1),null);
        TreeNode q = new TreeNode(1, new TreeNode(0), null);

        System.out.println(isSameTreeSolution.isSameTree(p,q));

    }
}