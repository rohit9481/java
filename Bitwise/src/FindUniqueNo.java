public class FindUniqueNo {
    public static void main(String[]args){
        int[] arr={2,3,4,2,3,5,6,4,5};
        System.out.println(ans(arr));
    }
    static int ans(int[] arr){
        int unique=0;
        for(int i:arr){
            unique= unique^=i;
        }
        return unique;
    }
}
