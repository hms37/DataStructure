
public class insertionsort {
	public static void main(String args[]){
		int a[] = {5,1,6,2,4,3};
		System.out.println("input:");
		
		for(int x=0;x<6;x++){
			System.out.println(a[x]);	
		}
		long start = System.currentTimeMillis();
		for(int i=1; i< 6; i++){
			int key = a[i];
			int j = i-1;
			while(j>=0 && a[j]>key){
				a[j+1]=a[j];
				j--;
			}
			a[j+1]= key;
		}
		long end = System.currentTimeMillis();
		System.out.println("Output:");
		for(int b =0; b<6; b++)
		{
			
		System.out.println(a[b]);
		}
		
		System.out.println(end-start +"ms");
	}

}
