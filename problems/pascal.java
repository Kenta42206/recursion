public class pascal {
    public static int binomialCoefficient(int n, int k){
        // 関数を完成させてください
        int[][] arr = new int[n+1][k+1];

        for(int i = 0; i <= n; i++){
            arr[i][0] = 1;
        }

        for(int i = 1; i <= k; i++){
            arr[i][i] = 1;
        }

        for(int i = 2; i <= n; i++){
            for(int j = 1; j <= k; j++){
                arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
            }
        }

        System.out.println(arr[3][2]);

        return arr[n][k];
    }

    public static void main(String[] args) {
        System.out.println(binomialCoefficient(4, 2));
    }
}
