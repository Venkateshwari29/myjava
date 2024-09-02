package com.newbatches;

public class Learning3 {

	public static void main(String[] args) {
		// number reverse
		int n = 135790, temp, numberrev = 0;
		
		while (n>0) {
			temp = n%10;   // reminder
			numberrev = (numberrev * 10) + temp;
			n = n/10;  // coefficient
			
		}
		System.out.println(numberrev);
		
		
		// amstrong reverse
		
		int g = 153, originalN = g, tempp, amstrong = 0;
				
		while (g>0) {
			tempp = g%10;
			amstrong = amstrong + tempp*tempp*tempp;
			g = g/10;
		}
		if (originalN == amstrong) {
			System.out.println("its amstrong number");
		} else {
			System.out.println("its not amstrong number");
		}
	}
	
}
