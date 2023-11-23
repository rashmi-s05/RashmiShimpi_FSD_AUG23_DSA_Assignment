package com.gl.bst.main;

import com.gl.bst.service.*;

public class TransactionDriver {

	public static void main(String[] args) {
		// given code to test
		Transaction_BST tree = new Transaction_BST();
		tree.node = new Node(50);
		tree.node.left = new Node(30);
		tree.node.right = new Node(60);
		tree.node.left.left = new Node(10);
		tree.node.right.left = new Node(55);
		// utility method to transform bst to skewed tree
		tree.processBST(tree.node);
		// utility method to print the transformed data
		tree.traverse(tree.newHead);
	}

}
