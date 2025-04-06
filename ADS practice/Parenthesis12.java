class Node {
    char data;
    Node next;

    Node(char d) {
        data = d;
        next = null;
    }
}

class Parenthesis1 {
    Node top;

    Parenthesis1() {
        this.top = null;
    }

    boolean isEmpty() {
        return top == null;
    }

    void push(char s) {
        Node n = new Node(s);
        n.next = top;
        top = n;
    }

    char peek() {
        if (isEmpty()) {
            return '\0'; // Return null character instead of '0'
        }
        return top.data;
    }

    void pop() {
        if (!isEmpty()) {
            top = top.next;
        }
    }
}

class Parenthesis12 {
    public static void main(String args[]) {
        Parenthesis1 a = new Parenthesis1();
        String s = "()))";

        char c[] = s.toCharArray();
        int l = c.length;

        // First character should not be a closing bracket
        if (c[0] == '}' || c[0] == ')' || c[0] == ']') {
            System.out.print("not valid");
            return;
        }

        for (int i = 0; i < l; i++) {
            if (c[i] == '{' || c[i] == '(' || c[i] == '[') {
                a.push(c[i]);
            } else {
                if (a.isEmpty()) { // If stack is empty and closing bracket is found
                    System.out.print("not valid");
                    return;
                }
                char topChar = a.peek();
                if ((c[i] == '}' && topChar == '{') ||
                    (c[i] == ')' && topChar == '(') ||
                    (c[i] == ']' && topChar == '[')) {
                    a.pop(); // Pop if valid match
                } else {
                    System.out.print("not valid");
                    return;
                }
            }
        }

        // If stack is empty, brackets are balanced
        System.out.print(a.isEmpty() ? "valid" : "Not valid");
    }
}