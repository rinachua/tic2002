public class Person implements Printable {

    private String name;

    //TODO: Add your code here
    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void print() {
        System.out.println("Person of name " + getName());
    }
}