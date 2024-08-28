class Hanoi{
    public static int towerOfHanoi(int discs){
        // 関数を完成させてください
        if(discs <= 1) return 1;
        return towerOfHanoi(discs - 1) * 2 + 1;
    }
    public static void main(String[] args){
        System.out.println(towerOfHanoi(1));
        System.out.println(towerOfHanoi(2));
        System.out.println(towerOfHanoi(3));
        System.out.println(towerOfHanoi(5));
        System.out.println(towerOfHanoi(10));
        System.out.println(towerOfHanoi(20));
    }
}
