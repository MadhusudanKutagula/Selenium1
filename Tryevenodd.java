package javaExamples;

public class Tryevenodd {

	public static void main(String[] args) {
		for(int i=0;i<=100;i++){
			if(i%2==0){
			System.out.println(i);	
			}
			
		}
		System.out.println("Below are odd numbers");
		for(int i=0;i<=99;i++){
			if(i%2!=0){
				System.out.println(i);
			}
		}
		
		System.out.println("Following are prime numbers");
       for(int i=2;i<=100;i++)
       {
    	 for(int j=2;j<=i;j++)
    	 {
    		if(j==i)
    		{
    		System.out.println(i);	
    		}
    	}
    	   
    	   
       }
	}

}
