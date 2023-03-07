package Pattern;

import java.util.Scanner;   
class ButterFlyProgram {
	public static void main(String[] args) {
		
	
    	int N= 5;
        int sp = 2*N-1;  
        int st = 0;  
                for(int i = 1; i <= 2*N-1; i++){  
                        
                	if(i <= N){  
                        sp  =sp- 2;  
                        st +=1;  
                    }  
                    else {  
                    	sp  += 2;  
                        st -=1;   
                    }   
                        for(int m = 1; m <= st; m++){  
                         System.out.print("*");  
                        }    
                        for(int n = 1; n <= sp; n++){  
                            System.out.print(" ");  
                        }   
                        for(int p = 1; p <= st; p++){  
                            if(p != N) 
                            	System.out.print("*");  
                              
                        }  
                        System.out.println(); 
                        
                }  
    }  
}