class Solution {
    public boolean isValid(String s) {
        // Any valid bracket sequence must have an even number of characters
        if (s.length() % 2 != 0) {
            return false;
        }

        Stack<Character> st = new Stack<>();

        for (char ch : s.toCharArray()) {
            // Push opening brackets onto the stack
            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } else {
                // Unmatched closing bracket found when stack is empty
                if (st.isEmpty()) {
                    return false;
                }

                char top = st.pop();

                // Validate if closing bracket matches top opening bracket
                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }

        // Returns true if all opening brackets were closed
        return st.isEmpty();
    }
}