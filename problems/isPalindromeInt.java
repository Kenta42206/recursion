class isPalindromeInt {
    public static boolean isPalindromeInteger(int n){
        // nを文字列化する
        String nString = n + "";
        int len = nString.length();
        return isPalindromeIntegerHelper(0, len - 1, nString);
    }

    // 回分かを判定するヘルパ関数
    public static boolean isPalindromeIntegerHelper(int head, int tail, String n){
        // 先頭のポインタが末尾のポインタを越したらtrueを返す
        if(head > tail) return true;

        // 先頭と末尾を比べて等しければ先頭と末尾を動かして再帰的にこの関数を呼び出す
        if(n.charAt(head) == n.charAt(tail)) return isPalindromeIntegerHelper(head + 1, tail - 1, n);
        // 等しくなければfalseを返す
        else return false;
        
    }

    public static void main(String[] args){
        System.out.println(isPalindromeInteger(12222)); // false
        System.out.println(isPalindromeInteger(12321)); // true
        System.out.println(isPalindromeInteger(189981)); // true
        System.out.println(isPalindromeInteger(1)); // true
        System.out.println(isPalindromeInteger(987823)); // false
    }
}
