class numberOfWay{
    public static int getnumberOfWay(int x){
        // 関数を完成させてください
        return numberOfWayHelper(1, 2, x);
    }

    public static int numberOfWayHelper(int f1, int f2, int c){
        if(c<=1) return f1;
        return numberOfWayHelper(f2, f1+f2, c-1);
    }
    
    public static void main(String[] args){
        System.out.println(getnumberOfWay(1));
        System.out.println(getnumberOfWay(5));
        System.out.println(getnumberOfWay(10));
    }
}