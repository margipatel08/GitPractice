package java_programs;


	public class ContinueExample2 {  
		public static void main(String[] args) {  
		            aa:  
		            for(int i=1;i<=3;i++){    
		                    bb:  
		                    for(int j=1;j<=3;j++){    
		                        if(i==3&&j==3){    
		                            //using continue statement with label  
		                            continue aa;    
		                        }    
		                        System.out.println(i+" "+j);    
		                    }    
		            }    
		}  
		}  

