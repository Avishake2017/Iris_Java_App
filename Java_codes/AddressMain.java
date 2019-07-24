class Address{
	String hNo,street,locality;
	String city;
	long pincode;

	Address(String hNo,String street,String locality,String city,long pincode){
		this.hNo = hNo;
		this.street = street;
		this.locality = locality;
		this.city = city;
		this.pincode = pincode;
		}
	void printAddressDetails(){
		System.out.println("-----------------------");	
		System.out.println("House No:"+hNo);	
		System.out.println("Street:" +street);	
		System.out.println("Locality:" +locality);	
		System.out.println("city:" +city);	
		System.out.println("pincode:" +pincode);
		}
	}

class Employee{
	int employeeId;
	String employeeName;
	double basicSalary;
	Address address;
	
	Employee(int employeeId,String employeeName,double basicSalary,Address address){
	
	this.employeeId = employeeId;
	this.employeeName = employeeName;
	this.basicSalary = basicSalary;
	this.address = address;
	}
	void printEmployeeDetails(){
		System.out.println("employee_id:"+employeeId);
		System.out.println("employee_name:"+employeeName);
		System.out.println("basic_salary:"+basicSalary);
		address.printAddressDetails();
			}

}

class PermanentEmployee extends Employee{
	double providentFund;
	double hra;
	
	PermanentEmployee(int id,String name,double sal,Address addrObj,double providentFund,double hra){
		/*PermanentEmployee is the child of Employee class which will
		try to call the default constructor of its parent class . 
		but as per our requirement we want to work with the parameterised 
		constructor of parent class so here we have to use super keyword*/
		

		super(id,name,sal,addrObj);
		this.providentFund = providentFund;
		this.hra = hra;
			}

	void printEmployeeDetails(){
		super.printEmployeeDetails();
		System.out.println("Hra : "+hra);
		System.out.println("Provident Fund : "+providentFund);
		
		}
	}
class AddressMain{

	public static void main(String[] args){
		Address address = new Address("248","abc street","abc locality","kolkata",700120);
		PermanentEmployee p = new PermanentEmployee(101,"Avishake dutta",8500,address,5000,2000);
		p.printEmployeeDetails();
		
	}
}