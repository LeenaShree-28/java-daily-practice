package superkeyword;

public class Parent{
    protected int num = 1;
    
    Parent(){
        System.out.println("Parent class default constructor.");
    }
    
    Parent(String x){
        System.out.println("Parent class parameterised constructor.");
    }
    
    public void foo(){
        System.out.println("Parent class foo!");
    }
}
