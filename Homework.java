
public class Homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int availablePlainSeats = 5;
double costOfGroceries = 23.64;
char middleInitial = 'A';
boolean isHotOutside = false;
String customerFirstName = "Sally"; 
String customerStreetAddress = "1234 W Easy St";
System.out.println(availablePlainSeats);
System.out.println("Available seats left on the plain:" + availablePlainSeats);
System.out.println(costOfGroceries + " is the price for the groceries.");
System.out.println(availablePlainSeats = availablePlainSeats - 2);
System.out.println(availablePlainSeats -=2);
System.out.println(costOfGroceries = costOfGroceries + 2.15);
System.out.println(costOfGroceries +=2.15);
System.out.println(middleInitial = 'C');
System.out.println(isHotOutside = true);
System.out.println(isHotOutside = !isHotOutside);
String fullName = customerFirstName + " " + middleInitial + " " + "Smith";
System.out.println("Hi! My name is " + fullName + " and I live at " + customerStreetAddress + "."); 


	}

}
