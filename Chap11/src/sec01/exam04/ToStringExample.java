package sec01.exam04;

import java.util.Date;

public class ToStringExample {

	public static void main(String[] args) {

		Object obj1 = new Object();
		Date obj2 = new Date();
		System.out.println(obj1.toString());
		// java.lang.Object@1ddc4ec2
		System.out.println(obj2.toString());
		// Mon Aug 29 15:31:05 KST 2022

	}

}
