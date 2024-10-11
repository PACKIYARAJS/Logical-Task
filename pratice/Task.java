package pratice;

public class Task {
	
	public void task1() {
		
		/*
		 * *
		 * * * 
		 * * * *
		 * * * * */
		
		for (int i=1; i<=5; i++) {
			
			for(int j=1; j<=i; j++) {
				
				System.out.print("*"+" ");
				
			}
			
			System.out.println();
			
		}
		
	}
	
	
	public void task2() {
		
		/* * * * *
		 * * * *
		 * * *
		 * *
		 */
		
		for(int i=5; i>0; i--) {
			
			for (int j=1; j<=i; j++) {
				
				System.out.print("*"+" ");
				
			}
			
			System.out.println();
			
		}
		
	}
	
	
	public void task3() {
		
		/*	$
		 	& &	 
	  		$ $ $
		   	& & & &
		   	$ $ $ $ $ 
		 */
		
		for(int i=1; i<=5; i++) {
			
			for (int j=1; j<=i; j++) {
				
				if(i%2==0) {
					
					System.out.print("&"+" ");
					
				}
				
				else {
					
					System.out.print("$"+" ");
					
				}
				
			}
			
			System.out.println();
			
		}
		
	}
	
	
	public void task4() {
		
		/*	
		 	1	 
		 	1 2
		 	1 2 3
		 	1 2
		 	1
		 */
		
		for(int i=1; i<=3; i++) {
			
			for (int j=1; j<=i; j++) {
				
				System.out.print(j+" ");
				
			}
			
			System.out.println();
			
		}
		
		for (int i=2; i>0; i--) {
			
			for(int j=1; j<=i; j++) {
				
				System.out.print(j+" ");
				
			}
			
			System.out.println();
			
		}
		
	}
	
	
	public void task5() {
		
		/*
		  	1
		  	3 5
		  	7 9 11
		  	13 15 17 19
		 */
		
		int increase =1;
		
		for(int i=1; i<=4; i++) {
			
			for(int j=1; j<=i; j++) {
				
				System.out.print(increase+ " ");
				
				increase +=2;
				
			}
			
			System.out.println();
			
		}
		
	}
	
	
	public void task6() {
		
		/* * * *
		 *     *
		 * 	   *
		 * * * */
		
		for(int i=1; i<=4; i++) {
			
			for(int j=1; j<=4; j++) {
				
				if (i==1 || i==4 || j==1 || j==4) {
					
					System.out.print("*"+" ");
					
				}
				
				else {
					
					System.out.print(" "+" ");
					
				}
				
			}
			
			System.out.println();
			
		}
		
	}
	
	
	public void task7() {
		
		/*  
		       *
		     * * * 
		   * * * * * 
		 * * * * * * * 
	   * * * * * * * * *
		  */
		
		for (int i=1; i<=5; i++) {
			
			for(int j=i; j<=5; j++) {
				
				System.out.print(" "+" ");
				
			}
			
			for(int j=1; j<=(2*i - 1); j++) {
				
				System.out.print("*"+" ");
				
			}
			
			System.out.println();
			
		}
		
	}
	
	
	public void task8() {
		
		/*
		  * * * * * * * * * 
		    * * * * * * * 
		      * * * * * 
		        * * * 
		          *
		 */
		
		for(int i=5; i>0; i--) {
			
			for(int j=i; j<5; j++) {
				
				System.out.print(" " + " ");
				
			}
			
			for(int j=1; j<=(2*i - 1); j++) {
				
				System.out.print("*" + " ");
				
			}
			
			System.out.println();
			
		}
		
	}
	
	
	public void task9() {
		
		/*
		  *
	    * * * 
	  * * * * * 	  
	* * * * * * * 	  
  * * * * * * * * * 
    * * * * * * *
	  * * * * * 
		* * * 
		  *
		 */
		
		for(int i=1; i<=5; i++) {
			
			for(int j=i; j<5; j++) {
				
				System.out.print(" "+" ");
				
			}
			
			for(int j=1; j<=(2*i-1); j++) {
				
				System.out.print("*"+" ");
				
			}
			
			System.out.println();
			
		}
		
		for(int i=4; i>0; i--) {
			
			for(int j=i; j<=4; j++) {
				
				System.out.print(" "+" ");
				
			}
			
			for(int j=1; j<=(2*i-1); j++) {
				
				System.out.print("*"+" ");
				
			}
			
			System.out.println();
			
		}
		
	}
	
	
	public void task10() {
		
		/*
		  	* 
		  	* *
		  	* * *
		  	* * * *
		  	* * *
		  	* *
		  	*
		 */
		
		for(int i=1; i<=4; i++) {
			
			for(int j=1; j<=i; j++) {
				
				System.out.print("*"+" ");
				
			}
			
			System.out.println();
			
		}
		
		for(int i=3; i>0; i--) {
			
			for(int j=1; j<=i; j++) {
				
				System.out.print("*"+" ");
				
			}
			
			System.out.println();
			
		}
		
	}
	
	
	public void task11() {
		
		/*
		  		  *
		  		*   *
		      *       *
		    * * * * * * * 
		 */
		
		for(int i=1; i<5; i++) {
			
			for(int j=i; j<5; j++) {
				
				System.out.print(" "+" ");
				
			}
			
			for(int j=1; j<=(2*i-1); j++) {
				
				if(j==1 || j==(2*i-1) || i==4) {
				
				System.out.print("*"+" ");
				
				}
				
				else {
					
					System.out.print(" "+" ");
					
				}
				
			}
			
			System.out.println();
			
		}
		
	}
	
	
	public void task12() {
		
		
		
	}
	
	

   public static void main (String [] args) {
	   
	   Task t = new Task();
	   
	   t.task12();
	   
   }
	
}
