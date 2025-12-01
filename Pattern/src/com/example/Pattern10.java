/*---- output -----
   *      * 
   **    **
   ***  ***
   ********
   ***  ***
   **    **
   *      *
----------------- */
package com.example;

public class Pattern10 {

	public static void main(String[] args) {
		int n=4;
		
		//1st upper half
		for(int i=1;i<=n;i++) {         				
			for(int j= 1;j<=i;j++){
				System.out.print("*");
			}
			//spaces
			int spaces = 2*(n-i);
			for(int k= 1;k<=spaces;k++) {
				System.out.print(" ");
			}
			//2nd upper half
			for(int j= 1;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		//1st lower half
		for(int i=n;i>=1;i--) {
			for( int j=1;j<=i;j++) {
				System.out.print("*");
			}
			//spaces
			int spaces = 2*(n-i);
			for(int k= 1;k<=spaces;k++) {
				System.out.print(" ");
			}
			//2nd lower half
			for(int j= 1;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
