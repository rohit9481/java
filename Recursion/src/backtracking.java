public class backtracking {
    public static void main(String[]args){
        boolean[][] board = {
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };
        Allpath("",board,0,0);
    }
    static void Allpath(String result, boolean[][] maze, int r, int c){
        if(r == maze.length-1 && c == maze[0].length-1){
            System.out.println(result);
            return;

        }
        if(!maze[r][c]){// if it is visited everything
            return;
        }
        maze[r][c] = false;

        if(r<maze.length-1){
            Allpath(result + 'D',maze, r+1,c);
        }
        if(c<maze[0].length-1){
            Allpath(result + 'R', maze,r,c+1);
        }
        if(r>0){
            Allpath(result + 'U',maze, r-1,c);
        }
        if(c>0){
            Allpath(result + 'L',maze, r,c-1);
        }
        //function will be over
        //removing all the changes
        maze[r][c] = true;

    }
}
