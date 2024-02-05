public class GridWay {

    public static int Grid(int i,int j,int n ,int m){
        // base case
        if(i == n-1 && j == m-1){ // condation for last cell
            return 1;
        }else if(i == n || j == n){ // Boundary cross condation
            return 0;
        }

        int W1 = Grid(i+1,j,n,m);
        int W2 = Grid(i, j+1, n, m);
        return W1 + W2;
    }
    public static void main(String[] args) {
        int n = 3, m = 3;
        System.out.println(Grid(0, 0, n, m));
    }
}
