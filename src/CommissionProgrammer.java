
// THIS IS A CODE FILE FOR LAB 7. THIS CODE FILE REQUIRES SOME MODIFICATIONS!!!

/**CommissionProgrammer.java CommissionProgrammer class extends Programmer.
 *@author jiayu
 *@version JDK11.0
 */
public class CommissionProgrammer extends Programmer { 

private double grossSales; // gross weekly sales
private double commissionRate; // commission percentage

/**constructor
 * @param firstName first name of the commission programmer
 * @param lastName last name of the commission programmer
 * @param socialSecurityNumber social security number of the commission programmer
 * @param grossSales gross sales of the commission programmer
 * @param commissionRate commission rate of the commission programmer
 */
public CommissionProgrammer(String firstName, String lastName, 
String socialSecurityNumber, 
double grossSales, double commissionRate) {
super(firstName, lastName, socialSecurityNumber);
this.commissionRate=commissionRate;
this.grossSales=grossSales;

if (commissionRate <= 0.0 || commissionRate >= 1.0) { // validate 
  throw new IllegalArgumentException(
     "Commission rate must be > 0.0 and < 1.0");
}

if (grossSales < 0.0) { // validate
  throw new IllegalArgumentException("Gross sales must be >= 0.0");
}

this.grossSales = grossSales;
this.commissionRate = commissionRate;
} 

//set gross sales amount on the creation of apps
public void setGrossSales(double grossSales) {
if (grossSales < 0.0) { // validate
  throw new IllegalArgumentException("Gross sales must be >= 0.0");
}

this.grossSales = grossSales;
} 

//return gross sales amount 
public double getGrossSales() {
return grossSales;
} 

//set commission rate
public void setCommissionRate(double commissionRate) {
if (commissionRate <= 0.0 || commissionRate >= 1.0) { // validate
  throw new IllegalArgumentException(
     "Commission rate must be > 0.0 and < 1.0");
}

this.commissionRate = commissionRate;
} 

//return commission rate
public double getCommissionRate() {
return commissionRate;
} 

//calculate earnings; override abstract method earnings in Programmer.

//MODIFY THIS PORTION. WHY WILL THIS PORTION OF YOUR CODE REQUIRE MODIFICATION?
//PROVIDE THE ANSWER TO THIS QUESTION TO YOUR PROFESSOR DURING DEMO

@Override                                                           
public double earnings() {                                            
return getCommissionRate() * getGrossSales();                    
}

/**
 *override method from implement Payme
 *get the total payment due
 *@return PaymentAmount 
 */
@Override
public double getPaymentAmount() {
	// TODO Auto-generated method stub
	return earnings();
}



//return String representation of CommissionProgrammer object

/**
 *  return the String representation 
 * @return return a String representation
 *
 */
@Override      
                                             
//TO DO: COMEPLETE THIS PORTION. Format your solution according to sample output.     
//START     
// INSERT YOUR CODE
//END
public String toString() {
	return "commission "+super.toString()+String.format("%ngross sales: $%.2f; commission rate: %.2f",
			getGrossSales(),getCommissionRate());
	
}

}

