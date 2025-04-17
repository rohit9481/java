package CustomStack;

public class customStack {
    protected int[] data;
    private static final int Defalt_Size = 10;

    int ptr = -1;

    public customStack() {
        this(Defalt_Size);
    }

    public customStack(int size){
        this.data = new int[size];
    }

    public int pop() throws Exception {
        if(isEmpty()){
            throw new Exception("stack is empty for pop");
        }
//        int removed= data[ptr];
//        ptr--;
//        return removed;
        // these above OR below
        return data[ptr--];
    }

    public int peek()throws Exception {
        if(isEmpty()){
            throw new Exception("stack is empty for peek");
        }
        return data[ptr];
    }
    public boolean push(int item){
        if(isFull()){
            System.out.println("stack is full");
            return false;
        }
        ptr++;
        data[ptr] = item;
        return true;
    }
    public boolean isFull(){
        return ptr == data.length-1;
    }

    public boolean isEmpty(){
        return ptr == -1;
    }
}
