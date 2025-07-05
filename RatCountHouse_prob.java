import java.util.*;
public class RatCountHouse_prob {

    public static int solve(int r, int unit, int n,int arr[]){
        if(arr == null){
            return -1;
        }
        int res = r*unit;
        int sum =0;
        int count=0;
        for(int i=0;i<n;i++){
            sum = sum +arr[i];
            count++;
            if(sum >= res){
                break;
            }

        }
        if(sum <res){
            return 0;
        }
        return count;

    }
    public static void main(String[] arg){
        Scanner sc= new Scanner(System.in);
        int r= sc.nextInt();
        int unit= sc.nextInt();
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0;i<n; i++){
            arr[i] = sc.nextInt();
            System.out.println(solve(r,unit,n,arr));
        }



    }
}
