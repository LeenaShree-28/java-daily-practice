package problemsday2;

public class MaxXOR {
    public void findMax(){
        int[] arr = {3,10,5,25,2,8};
        int max =0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                int res = arr[i]^arr[j];
                if(res > max){
                    max = res;
                }
            }
        }
        System.out.println(max);
    }
    public static void main(String[] args) {
        MaxXOR maxXOR = new MaxXOR();
        maxXOR.findMax();
    }
}
