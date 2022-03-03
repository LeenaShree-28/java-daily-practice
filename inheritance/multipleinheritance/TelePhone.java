package inheritance.multipleinheritance;

// Java doesn’t support Multiple Inheritance.

// Here a class can inherit properties of more than one parent class. 
// The problem occurs when there exist methods with the same signature in both the superclasses and subclass.
// On calling the method, the compiler cannot determine which class method to be called
// and even on calling which class method gets the priority. 

// It is achieved by interface. we can use interface instead of class.
// A class can implements two or more interfaces.

interface TelePhone {
    void call();
}
