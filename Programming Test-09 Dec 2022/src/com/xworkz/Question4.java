package com.xworkz;

public class Question4 {
	
	/*4. find Maximum difference between two elements such that larger element
appears after the smaller number
			int arr[]={14, 12, 70, 15, 95, 65, 22, 30};
 			output = 83
			eg : Max Difference =95-12 = 83   */
	

	static int a[] = { 14, 12, 70, 15, 95, 65, 22, 30 };
	static int c[] = a;
	static int min = 0, max = 0, diff = 0, b = 0;

	public static void showMax() {

		for (int i = 0; i < a.length; i++) {
			if (i < a.length - 1) {
				if (a[i] > a[i + 1]) {
					b = a[i];
					a[i] = a[i + 1];
					a[i + 1] = b;

				}
			}
		}
		System.out.println("Max value is : " + a[a.length - 1]);
		max = a[a.length - 1];
		b = 0;
	}

	public static void showMin() {

		for (int i = 0; i < c.length; i++) {
			if (i < c.length - 1) {
				if (c[i] < c[i + 1]) {
					b = c[i];
					c[i] = c[i + 1];
					c[i + 1] = b;

				}
			}
		}
		System.out.println("Min value is : " + c[c.length - 1]);
		min = c[c.length - 1];
	}

	public static void main(String[] args) {

		showMax();
		showMin();
		diff = max - min;
		System.out.println("Maximum difference is : " + diff);

	}

}
