package oops_concepts;

public class Author {
private String name;
private String email;
private char gender;
        Author(String name,String email,char gender){
        	this.name=name;
        	this.email=email;
        	this.gender=gender;
        	
        }
        public String setname(String name) {
        	return name;
        }
        public String setemail(String email) {
        	return email;
        }
        public String setgender(String gender) {
        	return gender;
        }
}
        public class Book{
        	public String name;
        	Author author;
        	double price;
        	int qtyinstock;
        	Book(String name,Author author,double price,int qtyinstock){
        		this.name=name;
        		this.author=author;
        		this.price=price;
        		this.qtyinstock=qtyinstock;
        		
        	}
        	public String getname(String name) {
        		return name;
        	}
        	public Author getauthor() {
        		return author;
        	}
        	public double getprice() {
        		 return price;
        		
        	}
        	 public int getQtyInStock() {
        	        return qtyinstock;
        	    }
        	 public void setName(String name) {
        	        this.name = name;
        	    }

        	    public void setAuthor(Author author) {
        	        this.author = author;
        	    }

        	    public void setPrice(double price) {
        	        this.price = price;
        	    }

        	    public void setQtyInStock(int qtyinstock) {
        	        this.qtyinstock = qtyinstock;
        	    }
        	    public String toString() {
        	        return "Book Name: " + name + "\n" +
        	               "Price: " + price + "\n" +
        	               "Quantity in Stock: " + qtyinstock + "\n" +
        	               author.toString();
        	    }
        	
        }

        public class Bookdetails {
            public static void main(String[] args) {
           
                Author author = new Author("J.K. Rowling", "jkrowling@example.com", 'F');
                Book book = new Book("Harry Potter", author, 799.99, 100);

                System.out.println(book);
            }
        }

