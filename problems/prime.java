import java.util.ArrayList;

class Prime {
    public static int sumOfAllPrimes(int n){
        // 関数を完成させてください
        int[] primeList = new int[getPrimeNumList(n).length];
        primeList = getPrimeNumList(n);
        System.out.println(getPrimeNumList(n).length);


        int sum = 0;
        for(int i = 0; i < primeList.length; i++){
            sum += primeList[i];
        }
        return sum;
    }

    public static int[] getPrimeNumList(int n){
        boolean[] cache = new boolean[n + 1];
        for(int i = 0; i < n + 1; i++){
            cache[i] = true;
        }

        for (int currentPrime = 2; currentPrime <= Math.ceil(Math.sqrt(n)); currentPrime++){
            // キャッシュ内の素数(p)の倍数をすべてfalseにしていきます。
            // iは2からスタートします。
            if (!cache[currentPrime]) continue;
            int i = 2;
            int ip = i * currentPrime;
            while (ip <= n){
                cache[ip] = false;
                // i*pをアップデートします。
                i += 1;
                ip = i * currentPrime;
            }
        }

        printIntArray(cache);
        ArrayList<Integer> primeNumbersDynamic = new ArrayList<Integer>();
        for (int i = 2; i < cache.length; i++){
            if (cache[i]){
                primeNumbersDynamic.add(i);
            }
        }

        int[] primeNumbers = new int[primeNumbersDynamic.size()];
        for (int i = 0; i < primeNumbersDynamic.size(); i++){
            primeNumbers[i] = primeNumbersDynamic.get(i);
        }

        printIntArray(primeNumbers);
        return primeNumbers;
    }

    public static void printIntArray(boolean intArr[]){
        // For文とインデックス演算子を使うことで、配列の各要素にアクセスすることができます。
        // Javaの配列はlengthというプロパティを持っています。lengthで配列のサイズを手に入れます。
        for(int i = 0; i < intArr.length; i++){
            System.out.print(intArr[i] + " ");
        }
        System.out.println();
    }

    public static void printIntArray(int intArr[]){
        // For文とインデックス演算子を使うことで、配列の各要素にアクセスすることができます。
        // Javaの配列はlengthというプロパティを持っています。lengthで配列のサイズを手に入れます。
        for(int i = 0; i < intArr.length; i++){
            System.out.print(intArr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println(sumOfAllPrimes(25));
    }
}
