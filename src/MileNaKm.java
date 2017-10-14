import java.util.Scanner;
public class MileNaKm {
	  public static void main(String[] args){
		  
	      Scanner odczyt = new Scanner(System.in);
	      	double mile;
	      	double km = 1.609344;
	      	
	      System.out.println("Podaj iloœæ mil: ");
	        mile = odczyt.nextInt();
	        
	        km = km * mile;
	 
	      System.out.println("Mile: " + mile + " na Km: " + km);
	  }
	}