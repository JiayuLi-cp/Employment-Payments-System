


/**LAB 7: PaymeInterfaceTest.java
 *This is the test for interface Payme.
 * @author jiayu
 * @version JDK11.0
 */
public class PaymeInterfaceTest  {

public static void main(String[] args) {
	
 //TO DO: IN THIS PORTION OF THE CODE, SEVERAL CHANGES SHOULD BE MADE:
// CREATE SIX-ELEMENTS Payme array HERE 
	
 //START CODE 
	//Create Payme array
Payme[] paymeObjects= new Payme[6];

	
//END CODE
 

// TO DO: POULATE THE ARRAY YOU CREATED WITH OBJECTS THAT IMPLEMENT Payable
//CHECK THE OUTPUT FILE AND REUSE EXACTLY THE DETAILS PROVIDED SUCH AS FIRST NAME
// LAST NAME, SOCIAL INSURANCE NUMBER, ETC.

 // START CODE
paymeObjects[0]=new Invoice("22776", "steering", 3, 300);
paymeObjects[1]=new Invoice("33442", "cruise", 5, 90.99);
paymeObjects[2]=new SalariedProgrammer("Chioma", "Chidimma", "345-67-8901", 320);
paymeObjects[3]=new HourlyProgrammer("Cheng", "Lui", "234-5-7890", 18.95, 40);
paymeObjects[4]=new CommissionProgrammer("Mattew", "Goodman", "123-45-6789", 16500, 0.44);
paymeObjects[5]=new BasePlusCommissionProgrammer("Ramjeet", "Patel", "102-34-5678", 1200, 0.04, 720);
// END CODE


 System.out.println(
    "Payment for Invoices and Programmers are processed polymorphically:\n"); 

 // generically process each element in array paymeObjects
 
 for (Payme currentPayme : paymeObjects) {
    // output currentPayme and its appropriate payment amount
    System.out.printf("%s \n", currentPayme.toString()); 
       
    if (currentPayme instanceof BasePlusCommissionProgrammer) {
       // downcast Payme reference to 
       // BasePlusCommissioProgrammer reference
       BasePlusCommissionProgrammer programmer = 
          (BasePlusCommissionProgrammer) currentPayme;

       double oldBaseSalary = programmer.getBaseSalary();
       programmer.setBaseSalary(1.10 * oldBaseSalary);
       System.out.printf(
          "new base salary with 10%% increase is: $%,.2f\n",
          programmer.getBaseSalary());
    } 
    

// TO DO: INSERT YOUR PRINT STATEMENT HERE: ENSURE THAT YOUR 
// OUTPUT FOLLOWS THE OUTPUT SAMPLE PROVIDED

// START CODE 
System.out.printf("payment due: $%.2f %n",currentPayme.getPaymentAmount());
System.out.println();
// END CODE

 }
}
}


