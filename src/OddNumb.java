/**
 * 
 */

/**
 * @author kktejas
 *
 */
public class OddNumb {

	private static int kk;
	private static int teja;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		setKk(10);
		setTeja(10);
		{
		    for (int kk1 = 0; kk1 < 10; kk1++)
		    {
	        for (int Teja1 = 1; Teja1 <= 9; Teja1++)
		        {
		            int kktejas = kk1 * 10 + Teja1;
		            if (kktejas % 2 !=0)
		                System.out.print( kktejas + " " );
		        }
		        System.out.println(" Odd Numbers " );
		    }
		}
	}

	public static int getKk() {
		return kk;
	}

	public static void setKk(int kk) {
		OddNumb.kk = kk;
		 System.out.println(" kk is used to Dispaly kktejas Odd Numbers " );
		 
	} 

	public static int getTeja() {
		return teja;
		
	}

	public static void setTeja(int teja) {
		OddNumb.teja = teja;
		 System.out.println(" Teja is used to Dispaly kktejas Odd Numbers " );
		
	}

}
