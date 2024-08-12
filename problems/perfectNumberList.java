public class perfectNumberList {
    public static String perfectNumberList(int n){
        // 関数を完成させてください
        String output = "";
        // nが6以下のときは完全数がないため、noneを返す
        if(n < 6) return "none";

        // 1は完全数に含めないため、iに２を宣言する
        for(int i = 2; i <= n; i++){
            // iが完全数の場合、outputにハイフンと完全数を足していく
            if(totalOfDivisor(i)) output += "-" + i;
        }

        // outputの最初にハイフンが含まれるため、substringで削除する
        return output.substring(1);

    }

    // 引数で与えられたnが完全数かどうか判定する関数
    public static boolean totalOfDivisor(int n){
        // １は除くため、はじめに足しておく
        int total = 1;

        // 約数を足していく
        for(int i = 2; i * i <= n; i++){
            if(n % i == 0){
                // iがnの約数の場合、totalに足していく
                // nの平方まで繰り返すため、足すのはiとそのペアとなる数値
                // 例えば、n=6のときは、i=2とn/i=3のペアを足す
                total += i + (n/i);
            }
        }
        
        // totalがnと等しければtrueを返す
        return total == n;      
    }

    public static void main(String[] args){
        System.out.println(perfectNumberList(3)); // none
        System.out.println(perfectNumberList(6)); // 6
        System.out.println(perfectNumberList(28)); // 6-28
        System.out.println(perfectNumberList(100)); // 6-28
        System.out.println(perfectNumberList(496)); // 6-28-496
        System.out.println(perfectNumberList(1000)); // 6-28-496
        System.out.println(perfectNumberList(10000)); // 6-28-496-8128
    }
    
}
