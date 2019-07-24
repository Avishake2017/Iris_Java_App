class Book{
/* Instance variables*/
	int bookIsbn;
	String bookTitle;
	String authorName;
	int price;
/* Methods*/
	public void setCredentials(int b,String BT,String AN,int p){
		bookIsbn = b;
		bookTitle = BT;
		authorName = AN;
		price = p;

	}
	
	public void showDetails(){
		System.out.println(bookIsbn);
		System.out.println(bookTitle);
		System.out.println(authorName);
		System.out.println(price);
	
	}
	public double discountPercentPrice(double d){
		price -= (d*price)/100.0;
		return price;
		
	}
}

class BookMain{
	public static void main(String[] args){
	
	
	double newPrice;

	Book b1 = new Book();
	b1.setCredentials(1,"alchemist","paulo coelho",180);
	b1.showDetails();
	newPrice = b1.discountPercentPrice(10);
	System.out.println(newPrice);

	Book b2 = new Book();
	b2.setCredentials(2,"something","avishake",200);
	b2.showDetails();
	newPrice = b2.discountPercentPrice(9);
	System.out.println(newPrice);

	Book b3 = new Book();
	b3.setCredentials(3,"somewhere","anurag",300);
	b3.showDetails();
	newPrice = b3.discountPercentPrice(15);
	System.out.println(newPrice);

	Book b4 = new Book();
	b4.setCredentials(4,"somewhat","abhishek",400);
	b4.showDetails();
	newPrice = b4.discountPercentPrice(20);
	System.out.println(newPrice);

	Book b5 = new Book();
	b5.setCredentials(5,"simple","someone",500);
	b5.showDetails();
	newPrice = b5.discountPercentPrice(25);
	System.out.println(newPrice);
	}
}

	