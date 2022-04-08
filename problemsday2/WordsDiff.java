package problemsday2;

import java.util.*;

public class WordsDiff {
    public  void findDiff(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string1 :");
        String str1 = scanner.nextLine().toLowerCase();
        System.out.println("Enter the string2 :");
        String str2 = scanner.nextLine().toLowerCase();
        LinkedHashMap<Character,Integer> hMap = new LinkedHashMap<>();
        for(int i=0;i<str1.length();i++){
            if(!hMap.containsKey(str1.charAt(i))){
                hMap.put(str1.charAt(i), 1);
            }else{
                hMap.put(str1.charAt(i), hMap.get(str1.charAt(i))+1);
            }
        }
        for(int i=0;i<str2.length();i++){
            if(hMap.containsKey(str2.charAt(i))){
                hMap.put(str2.charAt(i), hMap.get(str2.charAt(i))-1);
            }
        }
        for(int i=0;i<str1.length();i++){
            if(hMap.get(str1.charAt(i))>0){
                System.out.print(str1.charAt(i));
            }
        }
        scanner.close();
    }
    public static void main(String[] args) {
        WordsDiff wordsDiff = new WordsDiff();
        wordsDiff.findDiff();
    }
}
