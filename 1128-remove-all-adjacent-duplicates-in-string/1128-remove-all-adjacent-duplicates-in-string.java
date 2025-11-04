class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();
        StringBuilder ans = new StringBuilder();
        for(char c:s.toCharArray()){
            if(!st.isEmpty() && st.peek()==c)
            {
                st.pop();
            }else{
            st.push(c);
            }
        }
        if(st.isEmpty()) return "";
        while(!st.isEmpty()){
            ans.append(st.pop());
        }
        return ans.reverse().toString();
    }
}