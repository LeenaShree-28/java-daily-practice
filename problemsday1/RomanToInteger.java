package problemsday1;

import java.util.Scanner;

public class RomanToInteger {
    public void convert(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Roman : ");
        String  roman = scanner.nextLine();
        int res = 0;
        for(int i=0;i<roman.length();i++){
            switch(roman.charAt(i)){
                case 'I':
                   if(i!=roman.length()-1 && roman.charAt(i+1)=='V'){
                       res+=Math.abs(1-5);
                       i++;
                   }else if(i!=roman.length()-1 && roman.charAt(i+1)=='X'){
                       res+=Math.abs(1-10);
                       i++;
                   }else{
                       res+=1;
                   }
                    break;
                case 'V':
                    res+=5;
                    break;  
                case 'X':
                    if(i!=roman.length()-1 && roman.charAt(i+1)=='L'){
                        res+=Math.abs(10-50);
                        i++;
                    }else if(i!=roman.length()-1 && roman.charAt(i+1)=='C'){
                        res+=Math.abs(10-100);
                        i++;
                    }else{
                        res+=10;
                    }
                    break; 
                case 'L':
                    res+=50;
                    break; 
                case 'C':
                    if(i!=roman.length()-1 && roman.charAt(i+1)=='D'){
                        res+=Math.abs(100-500);
                        i++;
                    }else if(i!=roman.length()-1 && roman.charAt(i+1)=='M'){
                        res+=Math.abs(100-1000);
                        i++;
                    }else{
                        res+=100;
                    }
                    break; 
                case 'D':
                    res+=500;
                    break; 
                case 'M':
                    res+=1000;
                    break;          
                default:
                    System.out.println("Invalid input."); 
            }
        }
        System.out.println(res);
        scanner.close();
    }
    public static void main(String[] args) {
        RomanToInteger romanToInteger = new RomanToInteger();
        romanToInteger.convert();
    }
}
