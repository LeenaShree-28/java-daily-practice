package studentinfo;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    ArrayList<StudentDetails> list = new ArrayList<>();
    int id = 0;
    public void addDetails(){
        Scanner sc = new Scanner(System.in);
        System.out.println("\n Enter Your Name :");
        String name = sc.nextLine();
        System.out.println("Enter Your Gender :");
        String gender = sc.nextLine();
        System.out.println("Enter Your Mail :");
        String mail = sc.nextLine();
        System.out.println("Enter Your Phone Number :");
        long phoneNumber = sc.nextLong();
        id++;
        StudentDetails sd = new StudentDetails(name, gender, mail, phoneNumber, id);
        list.add(sd);
        System.out.println("\n Successfully registered...");
    }
    public void showDetails(){
        if(list.isEmpty()){
            System.out.println("\n Please Register your details.");
        }else{
            for(StudentDetails i: list){
                System.out.println("\n Name : "+i.getName());
                System.out.println("Registration Number : "+i.getId());
                System.out.println("Gender : "+i.getGender());
                System.out.println("MailId : "+i.getMail());
                System.out.println("Phone Number : "+i.getPhoneNumber());
            }
        }
    }
    public void login(){
        Scanner sc = new Scanner(System.in);
        System.out.println("\n Enter Your mail :");
        String mailId = sc.nextLine();
        int check =0;
        for(StudentDetails i:list){
            if(mailId.equals(i.getMail())){
                check++;
                System.out.println("\n Name : "+i.getName());
                System.out.println("Registration Number : "+i.getId());
                System.out.println("Gender : "+i.getGender());
                System.out.println("Phone Number : "+i.getPhoneNumber());
            }
        }
        if(check==0 || list.isEmpty()){
            System.out.println("\n Your mailId is wrong or You didn't register your details.");
        }
    }
    public void display(){
        Scanner sc = new Scanner(System.in);
        int option;
        Main obj = new Main();
        do{
            System.out.println("\n 1.Registration\n 2.Students List\n 3.Login\n 0.Exit");
            System.out.println("\n Enter any number :");
            option = sc.nextInt();
            switch(option){
                case 1: 
                    obj.addDetails();
                    break;
                case 2: 
                    obj.showDetails();
                    break; 
                case 3: 
                    obj.login();
                    break; 
                case 0:
                    System.out.println("Exit");  
                    break;
                default:
                    System.out.println("\n Please enter valid number.");    
            }
            
        }while(option!=0);
        sc.close();
    }
    public static void main(String[] args) {
        Main obj = new Main();
        obj.display();
    }
}
