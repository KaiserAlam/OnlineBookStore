public class Person{

    private String name;
    private int age;
    private int maximumBooks;

    public Person(String name) {
        this.name = name;
        this.maximumBooks = 3;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.maximumBooks = 3;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public int getMaximumBooks() {
        return maximumBooks;
    }

    public void setMaximumBooks(int maximumBooks) {
        this.maximumBooks = maximumBooks;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + ", maximumBooks=" + maximumBooks + "]";
    }
}