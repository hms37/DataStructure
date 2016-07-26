

public class bubblesort {

	public static void main(String args[]){
	
		int Array[] = {1,5,2,3,9,0};
		System.out.println("Input:");
		long start = System.currentTimeMillis();
		for(int a=0;a<6;a++){
			System.out.println(Array[a]);	
		}
		
		for (int i = 0; i<6; i++){
			for(int j=0;j<6-i-1; j++){
				if (Array[j]>Array[j+1]){
					int temp = Array[j+1];
					Array[j+1]= Array[j];
					Array[j]= temp;
					}
				}
		}
		System.out.println("Output:");
		for (int b= 0; b<6; b++){
		System.out.println(Array[b]);}
	long end = System.currentTimeMillis();
	System.out.println((end- start) + "ms");
	}
		
	}

