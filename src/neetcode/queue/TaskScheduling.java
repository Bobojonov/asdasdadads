package neetcode.queue;

public class TaskScheduling {
    public int leastInterval(char[] tasks, int n) {
        int[] arr = new int[26];
        for (char task : tasks) arr[task - 'A']++;
        int max = 0;
        for (int i = 0; i < 26; i++) {
            max = Math.max(arr[i], max);
        }
        int count = 0;
        for (int i = 0; i < 26; i++)
            if (arr[i] == max) count++;
        return Math.max(tasks.length, ((max - 1) * (n + 1)) + max);
    }
}
