import java.util.ArrayList;

public class MyBookStore{

    private String name;
    ArrayList<Book> books;
    ArrayList<Person> persons;

    public MyBookStore(String name) {
        this.name = name;
        books = new ArrayList<Book>();
        persons = new ArrayList<Person>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public ArrayList<Person> getPersons() {
        return persons;
    }

    public void addBook(Book b) {
        this.books.add(b);
    }

    public void removeBook(Book b) {
        this.books.remove(b);
    }

    public void addPerson(Person p) {
        this.persons.add(p);
    }

    public void removePerson(Person p) {
        this.persons.remove(p);
    }

    public boolean checkOut(Book b, Person p){

        int booksOut = this.getBooksForPerson(p).size();

        // Logic to check out books
        if((b.getPerson() == null) && booksOut < p.getMaximumBooks()) {

            b.setPerson(p);
            return true;

        }else {
            return false;
        }

    }

    public boolean checkIn(Book b){
        return false;
    }

    public ArrayList<Book> getBooksForPerson(Person p){

        ArrayList<Book> result = new ArrayList<Book>();

        // Logic to assign book to a Person
        for(Book aBook:this.getBooks()) {
            if((aBook.getPerson() != null) && (aBook.getPerson().getName().equals(p.getName()))) {
                result.add(aBook);
            }
        }
        return result;
    }

    public ArrayList<Book> getAvailableBooks(){
        ArrayList<Book> result = new ArrayList<>();
        for(Book aBook: this.getBooks()) {
            if(aBook.getPerson() == null) {
                result.add(aBook);
            }
        }
        return result;
    }

    //

    public ArrayList<Book> getUnavailableBooks(){
        ArrayList<Book> result = new ArrayList<>();
        for(Book aBook: this.getBooks()) {
            if(aBook.getPerson() != null) {
                result.add(aBook);
            }
        }
        return result;
    }
}