class Pair {
    char letter;
    int occur;
    public Pair(char c, int n) {
        this.letter = c;
        this.occur = n;
    }
}
class Solution {
    public String removeDuplicates(String s, int k) {
         Stack<Pair> st = new Stack<>();

        for (char c : s.toCharArray()) {
            if (!st.isEmpty() && st.peek().letter == c) {
                st.peek().occur++;
                if (st.peek().occur == k) {
                    st.pop(); 
                }
            } else {
                st.push(new Pair(c, 1));
            }
        }
        StringBuilder ans = new StringBuilder();
        for (Pair p : st) {
            for (int i = 0; i < p.occur; i++) {
                ans.append(p.letter);
            }
        }

        return ans.toString();

    }
}