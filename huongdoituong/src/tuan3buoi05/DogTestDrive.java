package tuan3buoi05;

public class DogTestDrive {
    public static void main(String[] args) {
        Dog dog = new Dog();
    dog.setSize(5);
    dog.name = "gogo ";

    System.out.println("Dog size " + dog.getSize());
    System.out.println("Name " + dog.name);
    
    }
}
