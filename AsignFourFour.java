
class About{
	private String Name;
	private int age;
	private double salary;
	public double TotalSalary;
	public static int count=1;
	
	public String getName() {
		return Name;
	}
	
	public void setName(String name) {
		Name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public void ShowData(){
		
		System.out.println("Employee :"+ count++);
		System.out.println("Name :"+getName()+" Age :"+getAge()+" Salary :"+getSalary()+" Total Salary :"+TotalSalary+" Designation :"+this.getClass().getSimpleName());
		System.out.println();
	}
	
}

class Manager extends About{
	
	public Manager(String Name,int age,double sal){
		this.setName(Name);
		this.setSalary(sal);
		TotalSal();
		this.setAge(age);
		
		
	}
	
	public void TotalSal(){
		
		this.TotalSalary=getSalary()+getSalary()*0.15;
	}
	
}

class Trainee extends About{
	public Trainee(String Name,int age,double sal){
		this.setName(Name);
		this.setSalary(sal);
		this.setAge(age);
		TotalSal();
	}
	
	public void TotalSal(){
			
			this.TotalSalary=getSalary()+getSalary()*0.10;
		}

}

public class AsignFourFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Trainee T1= new Trainee("Amit",21,30000);
		Trainee T2= new Trainee("Manish",20,1000);
		Manager m1= new Manager("KG",25,33500);
		Manager m2= new Manager("Rahul",45,450000);
		T1.ShowData();
		m1.ShowData();
		m2.ShowData();
		T2.ShowData();
	}

}
