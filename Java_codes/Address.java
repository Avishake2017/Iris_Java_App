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
	
	PermanentEmployee(double providentFund,double hra){
		this.providentFund = providentFund;
		this.hra = hra;
			}

	void printEmployeeDetails(){
		super(1,"Avishake Dutta",41244,address);
		super.printEmployeeDetails();
		}
	}
class AddressMain{
	public static void main(String[] args){
		Address address = new Address(248,"abc street","kolkata",700120);
		PermanentEmployee p = new PermanentEmployee(5000,2000);
		p.printEmployeeDetails();
		
	}