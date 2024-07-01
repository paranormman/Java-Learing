public class leetcode {
    public ListNode head;
    public static class ListNode{
        int data;
        ListNode next;

        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }

    public int firstUniqChar(String s) {
            int freq[] = new int[26];
            for(var c : s.toCharArray())freq[c - 'a']++;
            for(int indx = 0; indx < s.length(); indx++){
                if(freq[s.charAt(indx) - 'a'] == 1)
                return indx;
            }
            return -1;
    }
    public static void main(String[] args) {
        leetcode code = new leetcode();
        System.out.println(code.firstUniqChar("leetcode"));
    }
}
