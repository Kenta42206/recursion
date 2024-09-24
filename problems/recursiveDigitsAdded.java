class recursiveDigits{
    public static int recursiveDigitsAdded(long digits){
        // 関数を完成させてください
        return (int)recursiveDigitsAddedHelper(digits,0);
    }

    public static long recursiveDigitsAddedHelper(long d, long total){
        long current = splitAndAdd(d,0);

        if(current<10) return total+current;
        return recursiveDigitsAddedHelper(current, total+current);
    }

    public static long splitAndAdd(long d, long sum){
        if(d<10) return sum + d;
        return splitAndAdd(d/10, sum + (d%10));
    }
}