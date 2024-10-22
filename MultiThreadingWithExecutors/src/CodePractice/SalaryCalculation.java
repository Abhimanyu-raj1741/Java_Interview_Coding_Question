package CodePractice;

public class SalaryCalculation implements Runnable{
	
	Employee e = null;
	public SalaryCalculation(Employee e) {
		// TODO Auto-generated constructor stub
		this.e=e;

	}
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		double salary = e.basicSalaryPerDay*e.noOfWorkingdays;
		
	}

}
