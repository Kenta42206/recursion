public class pangram {
    public static boolean isPangram(String string){
        // 関数を完成させてください
        boolean[] alphabetPresence = new boolean[26];

        String processedString = string.replaceAll(" ", "").toLowerCase();

        for (char c : processedString.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                alphabetPresence[c - 'a'] = true;
            }
        }

        // 全てのアルファベットが存在するか確認
        for (boolean present : alphabetPresence) {
            if (!present) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPangram("the five boxing wizards jump quickly"));
    }
}
