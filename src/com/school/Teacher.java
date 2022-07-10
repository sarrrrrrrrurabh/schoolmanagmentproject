package com.school;

public class Teacher {

    private int id;
    private String name;
    private int salary;
    private int salaryEarned;
    

	public Teacher(int id, String name, int salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
        this.salaryEarned=0;
    }
    
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public int getSalary(){
        return  salary;
    }
    public  int getSalaryEarned()
    {
    	return salaryEarned;
    }
    public void setSalary(int salary){
        this.salary=salary;
    }
    public void receiveSalary(int salary){
    	if(this.salary==salaryEarned)
        {
        	System.out.println("Salary Already Paid....");
        }
        else
        {
        	
        	salaryEarned+=salary;
        	School.updateTotalMoneySpent(this.salary);
        	System.out.println("Salary Paid successfully...");
        }
    }


    @Override
    public String toString() {
        return "Name of the Teacher: " + name
                +" Total salary earned so far $"
                + salaryEarned;
    }
}
