/*---- output -----
      1                  (1st left side)  ****1|   (2nd right side)
     212                         spaces-> ***21|2
    32123                                 **321|23
   4321234                                *4321|234
  543212345                               54321|2345
----------------- */
package com.example;

public class Pattern13 {

	public static void main(String[] args) {
	
		int n=5;//number of row
		//1st left hand side
		for(int i=1;i<=5;i++) {
			// spaces
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			//digit
			for(int k=i;k>=1;k--) {
				System.out.print(k);
			}
			//2nd right 
			for(int j=2 ;j<=i;j++) {
				System.out.print(j);
			}
			
			System.out.println();
		}
	}
}
