package com.bridgelab.binarysearchtree;

public class MyBinaryTree<k extends Comparable<k>> {

	private MyBinaryNode<k> root;

	public void add(k key) {
		this.root = this.addRecursively(root, key);
	}

	private MyBinaryNode<k> addRecursively(MyBinaryNode<k> current, k key) {
		if (current == null) {
			return new MyBinaryNode<>(key);
		}
		if (key.compareTo(current.key) == 0) {
			return current;
		}
		if (key.compareTo(current.key) < 0) {
			current.left = addRecursively(current.left, key);
		} else {
			current.right = addRecursively(current.right, key);
		}
		return current;
	}

	public int getSize() {
		return this.getSizeRecursively(root);
	}

	public int getSizeRecursively(MyBinaryNode<k> current) {
		return current == null ? 0 : 1 + getSizeRecursively(current.left) + getSizeRecursively(current.right);
	}
}
