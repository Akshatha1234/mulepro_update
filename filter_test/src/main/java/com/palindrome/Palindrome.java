package com.palindrome;

public class Palindrome {

	public int palindrome(int a) {
		// TODO Auto-generated method stub
		int temp=a;
		int rev=0;
		int rem;
		while(a>0)
		{
			rem=a%10;
			rev=rev*10+rem;
			a=a/10;
		}
		if(temp==rev)
			return 1;
		else
			return 0;
	}

}
