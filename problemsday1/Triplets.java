package problemsday1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Triplets {

    public  ArrayList<ArrayList<Integer>> check(){
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        ArrayList<String> check = new ArrayList<>();
        int[] arr = {-1,0,1,2,-1,-4};
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                for(int k=j+1;k<arr.length;k++){
                    if((arr[i]+arr[j]+arr[k])==0){
                        int[] temp = {arr[i],arr[j],arr[k]};
                        Arrays.sort(temp);
                        if(!(check.contains(temp[0] + "" + temp[1] + "" + temp[2]))) {
                            check.add((temp[0] + "" + temp[1] + "" + temp[2]));
                            list.add(new ArrayList<>(List.of(arr[i],arr[j],arr[k])));
                        }
                    }
                }
            }
        }
        return list;
    }
    public static void main(String[] args) {
        Triplets triplets = new Triplets();
        System.out.println(triplets.check());
    }
}
