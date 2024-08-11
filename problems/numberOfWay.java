class Solution{
    public static int numberOfWay(int x){
        // 関数を完成させてください
        return numberOfWayHelper(1, 2, x);
    }

    public static int numberOfWayHelper(int f1, int f2, int c){
        if(c<=1) return f1;
        return numberOfWayHelper(f2, f1+f2, c-1);
    }
    
    public static void main(String[] args){
        System.out.println(numberOfWay(1));
        System.out.println(numberOfWay(5));
        System.out.println(numberOfWay(10));
    }
}