class Author{
	String name,email,Gender;

	Author(String name,String email,String Gender){
		this.name = name;
		this.email = email;
		this.Gender = Gender;
		}
	void getDetails(){
	System.out.println("-------------------");
	System.out.println("Name is:"+ name);
	System.out.println("Email is:"+ email);
	System.out.println("Gender is:"+ Gender);
	}	
}

class Book{
	private String name;
	private Author author;
	double price;
	int qty;
	
	Book(String name,Author author,double price){
		this.name = name;
		this.author = author;
		this.price = price;
	}
	
	Book(String name,Author author,double price,int qty){
		this.name = name;
		this.author = author;
		this.price = price;
		this.qty = qty;
		}

	void bookDetails(){
	System.out.println("-------------------");
	System.out.println("name:" +name);
	System.out.println("Name is:"+ author.name);
	System.out.println("Email is:"+ author.email);
	System.out.println("Gender is:"+ author.Gender);
	System.out.println("price :" +price);
	System.out.println("quantity:" +qty);
		}
	}
class TestMain{
	public static void main(String[] args){
		Author A = new Author[]("Herbert Shildt","Herbs@gmail.com","M");
		Book b1 = new Book("The complete Reference",A,145.2);
		Book b2 = new Book("A new Book",A,456.2,10);
		b1.bookDetails();
		b2.bookDetails();
			}
}