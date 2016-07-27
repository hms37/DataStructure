public class mergesort {
	public static void main(String args[]){
			
		int[] A = {5,1,6,7,8,9};
		for(int m =0; m<6; m++){
		System.out.println(A[m]);}
		A = Mergesort(A);
		for(int m =0; m<6; m++){
			System.out.println(A[m]);}
		
		}
	public  static int[] Mergesort(int[] A)
	{
		int n = A.length;
		int mid= (int) Math.floor(n/2);
		if (n<2){return A;}
		int left[] = new int[mid];
		int right[]= new int[n-mid];
		for(int x=0; x< n; x++)
		{
			if(x<mid){
				left[x] = A[x]; 
			}
			else
			{
				right[x-mid]= A[x];
			}
		}
		Mergesort(left);
		Mergesort(right);
		Merge(A, right,left);
		return A;
		
		}

	public static void Merge(int[] a, int[] l, int[]  r ){
		int nl = l.length;
		int nr = r.length;
		int i =0;
		int j=0;
		int k=0;
		while(i<nl && j<nr){
		if(l[i]<r[j]){
			a[k]= l[i];
			k=k+1;
			i=i+1;
		}
	else{
			a[k]= r[j];
			k=k+1;
			j=j+1;
		
		}}
		while(i<nl){
			a[k]= l[i];
			i=i+1;
			k=k+1;
		}
		while(j<nr){a[k]= r[j];
		k=k+1;
		j=j+1;}
	}
	
	

}
