import java.util.HashMap;

public class hashmap {
    public static int searchList(int[] numList, int value){
        // 関数を完成させてください
        // 値とそのインデックスを格納するハッシュマップ
        HashMap<Integer, Integer> indexMap = new HashMap<>();

        // 配列をループしてハッシュマップに値とインデックスを格納する
        for(int i=0;i<numList.length;i++){
            // ハッシュマップに値が存在しない場合のみ格納する
            if(!indexMap.containsKey(numList[i])) indexMap.put(numList[i], i);
        }

        // ハッシュマップに値が存在するかチェック
        if(indexMap.containsKey(value)) return indexMap.get(value);
        else return -1;
    }

    public static void main(String[] args) {
        int[] listA = {3,10,23,3,4,50,2,3,4,18,6,1,-2};
        System.out.println(searchList(listA,3));
    }
}
