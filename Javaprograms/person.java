package Javaprograms;
public class person {
    public String name = "Drishya";         // Accessible from anywhere
    private int age = 22;                   // Accessible only within this class
    protected String city = "Gonda";       // Accessible within same package or subclass

    public void showName() {
        System.out.println("Name: " + name);
    }

    private void showAge() {
        System.out.println("Age: " + age);
    }

    protected void showCity() {
        System.out.println("City: " + city);
    }
}



