package com.greatlearning.balancingBrackets;

public class DriverMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BalancingBrackets balancingBrackets = new BalancingBrackets();
		boolean value = balancingBrackets.isBalanced("([{}])");
		
		if (value)
		{
			System.out.println("The entered string has balanced brackets.");
		}
		
		else 
		{
			System.out.println("The entered string does not have balanced brackets.");
		}

	}

}
