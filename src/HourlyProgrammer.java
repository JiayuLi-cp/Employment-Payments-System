
// THIS IS A CODE FILE FOR LAB 7. THIS CODE FILE REQUIRES SOME MODIFICATIONS!!!


/**HourlyProgrammer.java
 *HourlyProgrammer class extends Programmer.
 * @author jiayu
 *@version JDK11.0
 */
public class HourlyProgrammer extends Programmer {
private double wage; // wage per hour
private double hours; // hours worked for week

/**constructor
 * @param firstName first name of the hourly programmer 
 * @param lastName last name of the hourly programmer 
 * @param socialSecurityNumber social security number of the hourly programmer 
 * @param wage wage of the hourly programmer 
 * @param hours working hours of the hourly programmer 
 */
public HourlyProgrammer(String firstName, String lastName,
String socialSecurityNumber, double wage, double hours) {
super(firstName, lastName, socialSecurityNumber);

if (wage < 0.0) { // validate wage
  throw new IllegalArgumentException(
     "Hourly wage must be >= 0.0");
}

if ((hours < 0.0) || (hours > 168.0)) { // validate hours
  throw new IllegalArgumentException(
     "Hours worked must be >= 0.0 and <= 168.0");
}

this.wage = wage;
this.hours = hours;
} 

//set wage
public void setWage(double wage) {
if (wage < 0.0) { // validate wage
  throw new IllegalArgumentException(
     "Hourly wage must be >= 0.0");
}

this.wage = wage;
} 

//return wage
public double getWage() {
return wage;
} 

//set hours worked
public void setHours(double hours) {
if ((hours < 0.0) || (hours > 168.0)) { // validate hours
  throw new IllegalArgumentException(
     "Hours worked must be >= 0.0 and <= 168.0");
}

this.hours = hours;
} 

//return hours worked
public double getHours() {
return hours;
} 

//calculate earnings; override abstract method earnings in Programmer

//MODIFY THIS PORTION. WHY WILL THIS PORTION OF YOUR CODE REQUIRE MODIFICATION?
//PROVIDE THE ANSWER TO THIS QUESTION TO YOUR PROFESSOR DURING DEMO

@Override                                                           
public double earnings() {                                            
if (getHours() <= 40) { // no overtime                           
  return getWage() * getHours();   
}
else {                                                             
  return 40 * getWage() + (getHours() - 40) * getWage() * 1.5;
}
}                                          

//return String representation of HourlyProgrammer object              
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
	return "hourly "+super.toString()+String.format("%nhourly wage: $%.2f; hours worked: %.2f"
			,getWage(),getHours());
}
                     
}

