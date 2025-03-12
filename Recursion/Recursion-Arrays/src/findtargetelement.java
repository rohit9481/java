import java.util.ArrayList;

public class findtargetelement {
    public static void main(String[]args){
        int[] arr={1,64,4,23,64,644,98};
        int target=64;
        System.out.println(searchIndex(arr,target,0));
        System.out.println(search(arr,target,0));

        ArrayList<Integer> ans= findAllIndex(arr,target,0,new ArrayList<>());
        System.out.println(ans);
    }
    static boolean search(int[] arr, int target, int index){
        if(index == arr.length){
            return false;
        }
        return arr[index] == target || search(arr,target,index+1);
    }
    static int searchIndex(int[] arr, int target, int index){
        if(index == arr.length){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }else{
            return searchIndex(arr,target,index+1);

        }
    }
    static ArrayList<Integer> findAllIndex(int[]arr, int target, int index, ArrayList<Integer>list){
        if(index == arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        return findAllIndex(arr,target,index+1,list);
    }

}
