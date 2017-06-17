
public class Fabonaci {

	public static void main(String[] args) {
		
		         
		         int Count = 100;
		         int[] feb = new int[Count];
		         feb[0] = 0;
		         feb[1] = 1;
		         for(int i=2; i < Count; i++){
		             feb[i] = feb[i-1] + feb[i-2];
		         }
		 
		         for(int i=0; i< Count; i++){
		                 System.out.print(feb[i] + " ");
		         }
	}
}
		