

/**
 *LAB 7: YOU ARE REQUIRED TO MODIFY THIS CODE!!!
 *Programmer.java
 *Programmer - This is an abstract superclass that IMPLEMENTS the Payme interface.
 *SOME MODIFICATION ARE REQUIRED IN THIS SECTION OF YOUR HERE - LOOK CLOSELY!!!
 * @author jiayu
 * @version JDK11.0
 */
public abstract class Programmer implements Payme {

private String firstName;
private String lastName;
private String socialSecurityNumber;

//three-argument constructor
/**
 * @param first fist name of the programmer
 * @param last last name of the programmer
 * @param ssn social security number of the programmer
 */
public Programmer(String first, String last, String ssn) {
 firstName = first;
 lastName = last;
 socialSecurityNumber = ssn;
 
}



/** Getter for first name
 * @return the firstName
 */
public String getFirstName() {
	return firstName;
}



/** Getter for last name
 * @return the lastName
 */
public String getLastName() {
	return lastName;
}



/** Getter for socialSecurityNumber
 * @return the socialSecurityNumber
 */
public String getSocialSecurityNumber() {
	return socialSecurityNumber;
}



/** Setter for fist name
 * @param firstName the firstName to set
 */
public void setFirstName(String firstName) {
	this.firstName = firstName;
}



/**Setter for last name
 * @param lastName the lastName to set
 */
public void setLastName(String lastName) {
	this.lastName = lastName;
}



/**Setter for social security number
 * @param socialSecurityNumber the socialSecurityNumber to set
 */
public void setSocialSecurityNumber(String socialSecurityNumber) {
	this.socialSecurityNumber = socialSecurityNumber;
}



/** CHANGES ARE REQUIRED IN THIS SECTION. 
* THINK OF THE BEST WAY TO ACCESS PRIVATE VARIABLES.
* IN THIS PORTION OF YOUR CODE INCLUDE ALL OF SUCH THAT APPLIES.
*/

/**
 *  return the String representation 
 * @return return a String representation
 *
 */

//return String representation of Programmer object
@Override
public String toString() {
return String.format("Programmer: %s %s %nsocial security number: %s", 
  getFirstName(), getLastName(), getSocialSecurityNumber());
} 


//Note: We do NOT implement Payme method getPaymentAmount() here. 
// THEREFORE, TO AVOID A COMPILATION ERROR, YOU SHOULD DECLARE THIS CLASS AS....??


public abstract double earnings(); /** No implementation here. DO YOU KNOW WHY? What should this method be?*/


} 


