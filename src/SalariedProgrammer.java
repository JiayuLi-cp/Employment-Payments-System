


/**THIS IS A CODE FILE FOR LAB 7. THIS CODE FILE REQUIRES SOME MODIFICATIONS!!!
 *SalariedProgrammer.java
 *SalariedProgrammer concrete class extends abstract class Programmer.
 * @author jiayu
 * @version JDK11.0
 */
public class SalariedProgrammer extends Programmer  {
private double weeklySalary;


/**constructor
 * @param firstName first name of the salaried programmer
 * @param lastName last name of the salaried programmer 
 * @param socialSecurityNumber social security number of the salaried programmer 
 * @param weeklySalary weekly salary of the salaried programmer 
 */
public SalariedProgrammer(String firstName, String lastName, 
String socialSecurityNumber, double weeklySalary) {
super(firstName, lastName, socialSecurityNumber); 

if (weeklySalary < 0.0) {
  throw new IllegalArgumentException(
     "Weekly salary must be >= 0.0");
}

this.weeklySalary = weeklySalary;
} 

//set salary
public void setWeeklySalary(double weeklySalary) {
if (weeklySalary < 0.0) {
  throw new IllegalArgumentException(
     "Weekly salary must be >= 0.0");
}

this.weeklySalary = weeklySalary;
} 

//return salary
public double getWeeklySalary() {
return weeklySalary;
} 

//calculate earnings; override abstract method earnings in Programmer

//MODIFY THIS PORTION. WHY WILL THIS PORTION OF YOUR CODE REQUIRE MODIFICATION?
//PROVIDE THE ANSWER TO THIS QUESTION TO YOUR PROFESSOR DURING DEMO


@Override                                                           
public double earnings() {                                          
return getWeeklySalary();                                        
}

@Override
public double getPaymentAmount() {
	// TODO Auto-generated method stub
	return earnings();
}                                             

/**
 *  return the String representation 
 * @return return a String representation
 *
 */
//return String representation of SalariedProgrammer object   
@Override        
public String toString() {
	return "salaried "+super.toString()+String.format("%nweekly salary: $%.2f",
			getWeeklySalary());
}
//TO DO: COMEPLETE THIS PORTION. Format your solution according to sample output.     
//START     
// INSERT YOUR CODE
//END
}

