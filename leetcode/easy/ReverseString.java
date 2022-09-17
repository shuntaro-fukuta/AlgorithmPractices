package easy;

public class ReverseString {
    public void reverseString(char[] s) {
        if (s.length == 0) return;

        int front = 0;
        int end = s.length - 1;
        while (front < end) {
            swap(s, front, end);

            front++;
            end--;
        }

    }

    private void swap(char[] s, int front, int end) {
        char tmp = s[front];
        s[front] = s[end];
        s[end] = tmp;
    }
}

