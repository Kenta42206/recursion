class Asccii{
    public static boolean isFirstStringLarger(String s1, String s2){
        // 関数を完成させてください
        int s1Total = getTotalOfASCCI(s1);
        int s2Total = getTotalOfASCCI(s2);
        return s1Total > s2Total;
    }

    public static int getTotalOfASCCI(String s){
        int total = 0;
        s = s.toLowerCase();
        for(int i=0; i<s.length(); i++){
            total += (int) s.charAt(i);
            // System.out.println(s.charAt(i) + "'s Asccii num is " + (int) s.charAt(i));
        }
        return total;
    }

    public static void main(String args[]){
        System.out.println(isFirstStringLarger("Fantastic","Bridge"));
        System.out.println(isFirstStringLarger("Bridge","Fantastic"));
        System.out.println(isFirstStringLarger("hello","HelLo"));
        System.out.println(isFirstStringLarger("Appearances may deceive","I think so too"));
    }
}


