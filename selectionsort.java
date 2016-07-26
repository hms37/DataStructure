public class selectionsort {
public static void main(String args[]){
	int a[]= {3,6,1,8,4,5};
	for( int b=0; b<6; b++){
		System.out.println(a[b]);
	}
	long start = System.nanoTime();
	int i,j,temp,min;
	for( i= 0; i< 5; i++){
		min = i;
		for(j=i+1;j<6; j++){
			if(a[j]<a[min]){
				min=j;
			}
		temp= a[i];
		a[i]= a[min];
		a[min]= temp;
		}
	}
	long end = System.nanoTime();
	for( int b=0; b<6; b++){
		System.out.println(a[b]);
	}
	System.out.println(end-start+"ns");
}
}
