package day03;

public class SalaryCalculator {
    public static void main(String[] args) {

       double hourlyRate = 50;
        int weeklyHours = 45;
        double stateTaxRate = 6;
       double federalTaxRate = 26;
       double grospay = hourlyRate*52*weeklyHours;
       double federaltax=grospay*federalTaxRate/100;
       double statetax=grospay*stateTaxRate/100;
        System.out.println("Gross pay is: $"+grospay);
        System.out.println("Federal tax is: $"+federaltax);
        System.out.println("State tax is: $"+statetax);
        System.out.println("Total tax is: $"+(federaltax+statetax));
        System.out.println("Net income is: $"+(grospay-(federaltax+statetax)));
    }
}
/*
4. Create a class named SalaryCalculator. Given the following variables:
				hourlyRate (double)
				weeklyHours (int)
				stateTaxRate (double)
				federalTaxRate (double)

	Use the given information above to calculate the following:
				salaryBeforeTax
				stateTax
				federalTax
				totalTax
				salaryAfterTax

	Display each of the above in the following format:

					Example:
						hourlyRate = $50
						weeklyHours = 45
						stateTaxRate = 6  (given as a percentage)
						federalTaxRate = 26 (given as a percentage)

					Output:
						Gross pay is: $117000.0
						Federal tax is: $30420.0
						State tax is: $7020.0
						Total tax is: $37440.0
						Net income is: $79560.0
 */
