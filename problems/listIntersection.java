import java.util.*;

public class listIntersection {
    public static int[] listIntersectionSearch(int[] targetList, int[] searchList){
        Set<Integer> targetSet = new HashSet<>();
        Set<Integer> resultSet = new HashSet<>();

        for (int num : targetList) {
            targetSet.add(num);
        }

        for (int num : searchList) {
            if (targetSet.contains(num)) {
                resultSet.add(num);
            }
        }

        int[] results = resultSet.stream().mapToInt(i -> i).toArray();
        Arrays.sort(results);
        return results;
    }

    public static void main(String[] args) {
        int[] targetList = {1,2,3,4,5,6};
        int[] searchList = {1,4,4,5,8,9,10,11};
        System.out.println(listIntersectionSearch(targetList, searchList));
    }
}
