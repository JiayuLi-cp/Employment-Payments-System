
// 

/**THIS IS A CODE FILE FOR LAB 7. THIS CODE FILE REQUIRES SOME MODIFICATIONS!!!
*BasePlusCommissionProgrammer.java
*BasePlusCommissionProgrammer class extends CommissionProgrammer.
* @author jiayu
*@version JDK11.0
*/
public class BasePlusCommissionProgrammer extends CommissionProgrammer { 

private double baseSalary; // base salary per week

/**arguments constructor
 * @param firstName first name of the BasePlusCommissionProgrammer
 * @param lastName last name of the BasePlusCommissionProgrammer
 * @param socialSecurityNumber social security number of the BasePlusCommissionProgrammer
 * @param grossSales gross sales of the BasePlusCommissionProgrammer
 * @param commissionRate commission rate of the BasePlusCommissionProgrammer
 * @param baseSalary base salary of the BasePlusCommissionProgrammer
 */
public BasePlusCommissionProgrammer(String firstName, String lastName, 
String socialSecurityNumber, 
double grossSales, double commissionRate, double baseSalary) {
super(firstName, lastName, socialSecurityNumber, 
  grossSales, commissionRate);

if (baseSalary < 0.0) { // validate baseSalary                  
  throw new IllegalArgumentException("Base salary must be >= 0.0");
}

this.baseSalary = baseSalary;                
}

//set base salary
public void setBaseSalary(double baseSalary) {
if (baseSalary < 0.0) { // validate baseSalary                  
  throw new IllegalArgumentException("Base salary must be >= 0.0");
}

this.baseSalary = baseSalary;                
} 

//return base salary
public double getBaseSalary() {
return baseSalary;
}

//calculate earnings; override method earnings in CommissionProgrammer

//MODIFY THIS PORTION. WHY WILL THIS PORTION OF YOUR CODE REQUIRE MODIFICATION?
//PROVIDE THE ANSWER TO THIS QUESTION TO YOUR PROFESSOR DURING DEMO

@Override                                                            
public double earnings() {                                             
return getBaseSalary() + super.earnings();                        
} 

//return String representation of BasePlusCommissionProgrammer object
@Override

public double getPaymentAmount() {
	return earnings();
}

/**
 *  return the String representation 
 * @return return a String representation
 *
 */
//TO DO: COMEPLETE THIS PORTION. Format your solution according to sample output.     
//START     
// INSERT YOUR CODE
//END
@Override 
public String toString() {
	return "base-plus "+super.toString()+String.format("base salary: $%.2f",getBaseSalary());
}

}



