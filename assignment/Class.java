package assignment;

public class Class {
	public static void main(String[] args) {
        // Create an object of the JavaConnection class
        JavaCollection javaCollection = new JavaCollection();

        // Call the methods of the JavaConnection object
        javaCollection.connect();
        javaCollection.executeUpdate();
        javaCollection.disconnect();
    }

}
