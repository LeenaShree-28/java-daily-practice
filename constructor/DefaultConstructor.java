package constructor;

// In Java, a constructor is a block of codes similar to the method.
// It is called when an instance of the class is created.
// At the time of calling constructor, memory for the object is allocated in the memory.
// Every time an object is created using the new() keyword, at least one constructor is called.
// It calls a default constructor if there is no constructor available in the class.
// In such case, Java compiler provides a default constructor by default.
// The constructor name should be a class name.
// You cannot use return type in constructor yet it returns a value

public class DefaultConstructor {

    // The default constructor is used to provide the default values to the object like 0, null, etc., depending on the type.

    int id;
    String name;
    public void display() {
        System.out.println(id + " " + name);
    }

    public static void main(String[] args) {
        DefaultConstructor d = new DefaultConstructor();
        d.display(); // 0 null 
    }
}

// We can use access modifiers while declaring a constructor.
// It controls the object creation.
// In other words, we can have private, protected, public or default constructor in Java.