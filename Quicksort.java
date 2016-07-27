import java.util.Random;

public class Quicksort {
	public static void quicksort(int[] A, int start, int  end){
		if(start<end){
		int Pindex = Partition(A,start,end );
		quicksort(A,start,Pindex-1);
		quicksort(A,Pindex+1,end);
		}
	}
	public static int Partition(int[] A, int start, int end ){
	
		int pivot = A[end];
		int Pindex = start;
		int temp=0;
		for (int a=start;a<end; a++){
			if(A[a]<=pivot){
			 temp= A[a];
				A[a]=A[Pindex];
				A[Pindex]=temp;
				Pindex= Pindex+1;
			}
			}
		temp= A[end];
		A[end]=A[Pindex];
		A[Pindex]= temp;
		return Pindex;
	}
	public static void main(String args[]){
		Random rand = new Random();
		int Array[] = new int[5];
		System.out.println("Input");
		for (int i=0; i<5; i++)
		{
			Array[i]= rand.nextInt(50);
			System.out.println(Array[i]);
		}
		quicksort(Array,0,4);
		System.out.println("Output");
		for (int i=0; i<5; i++)
		{
			System.out.println(Array[i]);
		}
	}
	
	
	
}
