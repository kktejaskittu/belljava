public class Mini {

	private static Scanner in;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	
		
	     ICCChamp2017();
	     System.out.println("England");
	     FinalIndVsPAk();
	     System.out.println("Finals India Lifted ICC 2017");
	     
		FirstUmpieRevire();
		System.out.println("Simon Taufel  First Umpier Reviews the Score Board");
	   SecondUmpireReview();
	   System.out.println("Billy Bowden  Second Umpier Reviews the Score Board");
	   ThridUmpireReview();
	   System.out.println("David Shepard  Thrid Umpier Reviews the Score Board");
	   
	   
	   Firstcommentary();
	   System.out.println("Ravi  is the commentary");
	   Secondcommentary();
	   System.out.println("Gavaskar is the commentary");
	   
	   
	   
	   
		
		
		int Dhoni, Rahul, Sachin,Kholi;
	      System.out.println("Enter four Batsman Score Display the Mini Score Of the Batsman ");
	      in = new Scanner(System.in);
	      
	 
	      
	      
	      Dhoni  = in.nextInt();
	      Kholi  = in.nextInt();
	      Rahul  = in.nextInt();
	      Sachin = in.nextInt();
	 
	      if ( Dhoni <= Kholi && Dhoni <= Rahul && Dhoni <= Sachin )
	         System.out.println("Dhoni is  the Mini Scored Btsmans.");
	      else
	    	  if ( Kholi <= Dhoni && Kholi <= Rahul && Kholi <= Sachin )
	         System.out.println("Kholi is the Min Scored  Batsmans .");
	      else if ( Rahul <= Dhoni &&   Rahul <= Kholi &&  Rahul <= Sachin )
	         System.out.println("Rahul is the Min Scored  Batsmans.");
	      else if ( Sachin <= Dhoni &&   Sachin <= Kholi &&  Sachin <= Rahul ) 
	    	  System.out.println("Sachin is the Min Scored  Batsmans."); 
	      else 
	         System.out.println("Every one Scored 0 Duck");
	      
	      
	      int Sami,Irfan, Jaffar,Imran;
	      System.out.println("Enter four Blowers Who Taken Wickets Display the Mini Wickets Of the Match");
	     
	      
	 
	      
	      
	      Sami  = in.nextInt();
	      Irfan  = in.nextInt();
	      Jaffar  = in.nextInt();
	      Imran = in.nextInt();
	 
	      if ( Sami <= Irfan && Sami <= Jaffar && Sami <= Imran )
	         System.out.println("Sami is  the Mini Scored Btsmans.");
	      else
	    	  if ( Imran <= Irfan && Imran <= Jaffar && Imran <= Sami )
	         System.out.println("Imran is the Min Scored  Batsmans .");
	      else if  ( Irfan <= Sami && Irfan <= Jaffar && Irfan <= Imran )
	         System.out.println("Irfan is the Min Scored  Batsmans.");
	      else  if (Jaffar <= Irfan && Jaffar <= Jaffar &&Jaffar <= Imran ) 
	    	  System.out.println("Jaffar is the Min Scored  Batsmans."); 
	      else 
	         System.out.println("No on Taken Wickets");
	      
	      
	      
	      
		      
	}

	private static void FinalIndVsPAk() {
		// TODO Auto-generated method stub
		System.out.println("Pak Lost The Match");
		
	}

	private static void ICCChamp2017() {
		// TODO Auto-generated method stub
		System.out.println("Final Match In England");
		
	}

	private static void Secondcommentary() {
		// TODO Auto-generated method stub
		System.out.println(" Ind Scored very Good  ");
		
	}

	private static void Firstcommentary() {
		// TODO Auto-generated method stub
		System.out.println(" Sachin Scored highest Score ");
		
	}

	private static void ThridUmpireReview() {
		// TODO Auto-generated method stub
		System.out.println(" Umpier Reviews the Score Board");
		   
		
	}

	private static void FirstUmpieRevire() {
		// TODO Auto-generated method stub
		System.out.println(" Umpier Reviews the Score Board");
		   
		
	}


	private static void SecondUmpireReview() {
		// TODO Auto-generated method stub
		System.out.println(" Umpier Reviews the Score Board");
		   
		
	}

	
}
