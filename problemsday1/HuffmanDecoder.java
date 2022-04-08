package problemsday1;

import java.util.Scanner;

class HuffmanDecoder{
    public void huffman(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String encodedString = scanner.nextLine();
        String orginalString = "";
        String temp = "";
        for(int i=0;i<encodedString.length();i++){
            if(encodedString.charAt(i) == '1' && temp.length() <= 2){
                temp+=(Character.toString(encodedString.charAt(i)));
            }else{
                temp+=(Character.toString(encodedString.charAt(i)));
                //System.out.println(temp);
                switch(temp){
                    case "0":
                        orginalString+="A";
                        break;
                    case "10":
                        orginalString+="B";
                        break;  
                    case "110":
                        orginalString+="C";
                        break; 
                    case "1110":
                        orginalString+="D";
                        break; 
                    case "1111":
                        orginalString+="E";
                        break;  
                    default:
                        System.out.println("Invalid input."); 
                }
                temp="";
            }
        }
        System.out.println(orginalString);
        scanner.close();
    }
    public static void main(String[] args) {
        HuffmanDecoder huffmanDecoder = new HuffmanDecoder();
        huffmanDecoder.huffman();
    }
}