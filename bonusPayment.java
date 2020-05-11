//Program to compute the bonus payments for drivers using the Oober app
  //Instructions: Enter the distance travelled, enter the number of trips undertaken, and enter the average rating

  package OoberInc;
 
  //Sample Run 
    // Enter distance travelled: 
    // 20.20
    // Enter number of trips: 
    // 5
    // Enter rating: 
    // 4.1
    // Bonus payment for this driver is 24.167352012659908
  
  //allows the user to input custom numbers in the console for the program
  import java.util.Scanner;
  
  //program
    public class bonusPayment {
    
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in); //input custom numbers
				System.out.println("Enter distance travelled: "); //asks user to input distance travelled
				
				       double distance = input.nextDouble(); //allows user to input number
				      
				
				System.out.println("Enter number of trips: "); //asks user to input distance number of trips
				
					   int trips = input.nextInt(); //allows user to input number
					   
				
				System.out.println("Enter rating: "); //asks user to input rating
		
					   double rating = input.nextDouble(); //allows user to input number
					   
      //computation for the bonus payment
		double bonusPayment;
		   //rating*(2*(trips)^1.5) + 3*(distance)^1.5)/50
		     bonusPayment = ((rating)*(2*(Math.pow(trips, 1.5))+3*(Math.pow(distance, 1.5))))/50;
	  //displays bonus payment for the user   
	    System.out.println("Bonus payment for this driver is " + bonusPayment);
}
}