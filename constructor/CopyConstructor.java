package constructor;

// There is no copy constructor in Java.
// However, we can copy the values from one object to another.
// Ways to copy :
    // By constructor,
    // By assigning the values of one object into another,
    // By clone() method of Object class.

public class CopyConstructor {
     int number;

    CopyConstructor(int n) {
        number = n;
    }

    CopyConstructor(CopyConstructor c) { // object as a parameter
        number = c.number;
    }

    public void display() {
        System.out.println(number);
    }

    public static void main(String[] args) {
        CopyConstructor c1 = new CopyConstructor(5);
        // method 1
        CopyConstructor c2 = new CopyConstructor(c1);
        // method 2

        
        //   CopyConstructor c2 = new CopyConstructor();
        //   c2.number=c1.number;
        

        c1.display();
        c2.display();
    }
}

// public class CopyConstructor {
//     public static void main(String[] args)
//     {
//         ConstructorCopy copy=new ConstructorCopy(3,4);
//         ConstructorCopy newcopy=new ConstructorCopy(copy);

// //        newcopy.var1= copy.var1;
// //        newcopy.var2=copy.var1;
//     }
// }

// class ConstructorCopy
// {
//     final int var1,var2;
//     ConstructorCopy(int val1,int val2)
//     {
//         var1=val1;
//         var2=val2;
//     }
//     ConstructorCopy(ConstructorCopy copy)
//     {
//         var1=copy.var1+1;
//         var2=copy.var2+1;
//         System.out.println(var1+ " " + var2);
//     }
// }
