package com.bridgelab.binarysearchtree;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MyBinaryTreeTest {

	@Test
	public void whenAdded3NumbersToTheBinaryTreeShouldReturnSize3() {
		MyBinaryTree<Integer> myBinaryTree = new MyBinaryTree<>();
		myBinaryTree.add(56);
		myBinaryTree.add(30);
		myBinaryTree.add(70);
		int size = myBinaryTree.getSize();
		assertEquals(3, size);
	}
}

