package com.employeewage;

public class EmployeeWage {
	public static void main(String[] args) {
		int max=1;
		int min=0;
		int flag=0;
		int SalHour=20, fullday=8;
		int partTime=8;
		
		int  a = (int) (Math.random()*(max-min+1)+min);   
		System.out.println("Random no is " + a);
		if(a==1)
		{
			flag=1;
		}
		if(flag==1)
		{
			System.out.println("Employee Present");
		}
		if(flag==0)
		{
			System.out.println("Employee Absent");
		}
		
		if(flag==1)
		{
		int DailyWage= fullday*SalHour;
		System.out.println("DailyWage is "+ DailyWage);
		}
			
		int mn=0,mx=1;
		int  choice = (int) (Math.random()*(mx-mn+1)+mn);
		switch (choice) {
		case 0 : int fullTime=8;
		System.out.println("Fulltime wage is "+ fullTime*SalHour);
		break;
		case 1:int HalfTime=4;
		System.out.println("Halftime wage is "+ HalfTime*SalHour);
		break;

		default : break;
		}
		//UC5
		if(flag==1) {
		int WageperMonth= fullday*20 * SalHour;
		System.out.println("WageperMonth is " + WageperMonth);
		}

		
		
		
		
		
	}

}
