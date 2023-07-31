package com.greatlearning.binarySearchTreeSum;

import com.greatlearning.binarySearchTreeSum.PairSum.Node;

public class DriverMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PairSum pairSum = new PairSum();
		Node root = null;
		root = pairSum.insertData(root, 40);
		root = pairSum.insertData(root, 20);
		root = pairSum.insertData(root, 60);
		root = pairSum.insertData(root, 10);
		root = pairSum.insertData(root, 30);
		root = pairSum.insertData(root, 50);
		root = pairSum.insertData(root, 70);
		
		int sum = 140;
		
		pairSum.findPairWithSum(root, sum);

	}

}
