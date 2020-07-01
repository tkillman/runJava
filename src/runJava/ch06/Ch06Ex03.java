package runJava.ch06;

////////////////****************2Â÷ ¹è¿­****************

public class Ch06Ex03 {
	
	public static void main(String[] args) {
		int [][] a = {
						{90,85,95},
						{95,75,95},
						{90,80,70},
						{80,90,60},
						{95,65,80}
							};
		int r,c;
		
		for(r=0;r<5;r++){
			for(c=0;c<3;c++){
				
				System.out.print("a["+r+"]["+c+"] : " +a[r][c] +"\t");
			}
			System.out.println("");
		}
		
		
		
	}

}
