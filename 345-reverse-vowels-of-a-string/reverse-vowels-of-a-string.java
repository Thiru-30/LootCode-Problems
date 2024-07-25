class Solution {
    private boolean isVowel(char c) {
        return c == 'a' || c == 'A' || c == 'e' || c == 'E' || c == 'i' || c == 'I' ||c == 'o'|| c == 'O' || c == 'u' || c == 'U';
    }

    public String reverseVowels(String s) {
        char s1[] = s.toCharArray();
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (!isVowel(s1[i])) {
                i++;
            } else if (!isVowel(s1[j])) {
                j--;
            } else {
                // swapping
                char t = s1[i];
                s1[i] = s1[j];
                s1[j] = t;
                i++;
                j--;
            }
        }
        return String.copyValueOf(s1);
    }
}