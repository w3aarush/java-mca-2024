import java.util.Scanner;
class Employee
{
	Scanner in = new Scanner(System.in);
	String ename, ecode;
	double bs, hra, da, ta, pf, pt;
	void inputemployee()
	{
		try
		{
			System.out.println("Enter employee name: ");
			ename = in.nextLine();
			System.out.println("Enter employee code: ");
			ecode = in.nextLine();
			System.out.println("Enter basic salary : ");
			bs = in.nextDouble();
		}
		catch(NullPointerException e1)
		{
			System.out.println(e1.toString());
		}
		catch(Exception e2)
		{
			System.out.println(e2.toString());
		}
		finally
		{
			System.out.println("Employee input done.");
		}
	}

	void calculate()
	{
		try
		{
			hra = (bs * 0.12);
			da = (bs * 0.35);
			ta = (bs * 0.05);
			pf = (bs * 0.02);
		}
		catch(Exception ex)
		{
			System.out.println(ex.toString());
		}
		finally
		{
			System.out.println("Calculation of Salary done.");
		}
	}

	void salarysummary()
	{
		try
		{
			System.out.println("Name : " + ename);
			System.out.println("Code of Employee : " + ecode);
			System.out.println("Basic Salary : " + bs);
			System.out.println("H.R.A : " + hra + "\n DA = " + da + "\n TA = " + ta);
			System.out.println("Provident Fund = " + pf);
			System.out.println("Professional Tax = " + pt);
			System.out.println("Gross Salary : " + (bs+hra+da+ta));
			System.out.println("Total deduction : " + (pf + pt));
			System.out.println("Net Salary : " + ((bs+hra+da+ta) - (pf + pt)));
		}
		catch(Exception ex)
		{
			System.out.println(ex.toString());
		}
		finally
		{
			System.out.println("Employee Salary Details produced.");
		}
	}
}

class Question02 {
	public static void main(String[] args) {
		Employee  z = new Employee();
		z.inputemployee();
		z.calculate();
		z.salarysummary();
	}
}