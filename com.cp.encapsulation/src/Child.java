public class Child extends Parent{
    public void display() {
        // System.out.println(privateField); // Error: privateField has private access in Parent
        System.out.println(defaultField); // Error: defaultField is not public in Parent
        System.out.println(protectedField); // Accessible: Inherited from Parent
        System.out.println(publicField); // Accessible: Public
    }

    public static void main(String[] args) {
        Child child = new Child();
        child.display();
    }
}
