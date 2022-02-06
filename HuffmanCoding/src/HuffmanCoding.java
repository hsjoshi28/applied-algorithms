import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class HuffmanCoding {

    static class Node {
        Character ch;
        Integer freq;
        Node left = null, right = null;

        Node(Character ch, Integer freq) {
            this.ch = ch;
            this.freq = freq;
        }

        public Node(Character ch, Integer freq, Node left, Node right) {
            this.ch = ch;
            this.freq = freq;
            this.left = left;
            this.right = right;
        }
    }

    public static Object build(String text) {
        if (text == null || text.length() == 0) {
            return null;
        }
        Map<Character, Integer> freq = new HashMap<>();
        for (char c : text.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }
        PriorityQueue<Node> pq = new PriorityQueue<>(Comparator.comparingInt(l -> l.freq));
        for (var entry : freq.entrySet()) {
            pq.add(new Node(entry.getKey(), entry.getValue()));
        }
        while (pq.size() != 1) {
            Node left = pq.poll();
            Node right = pq.poll();
            int sum = left.freq + right.freq;
            pq.add(new Node(null, sum, left, right));
        }
        Node root = pq.peek();
        return root;
    }

    public static void encode(Node root, String str, Map<Character, String> huffmanCode) {
        if (root == null) {
            return;
        }
        if (isLeaf(root)) {
            huffmanCode.put(root.ch, str.length() > 0 ? str : "1");
        }
        encode(root.left, str + '0', huffmanCode);
        encode(root.right, str + '1', huffmanCode);
    }

    public static boolean isLeaf(Node root) {
        return root.left == null && root.right == null;
    }

    public static String encode(Object dic, String text) {
        Map<Character, String> huffmanCode = new HashMap<>();
        Node root = (Node) dic;
        encode(root, "", huffmanCode);
        StringBuilder sb = new StringBuilder();
        for (char c : text.toCharArray()) {
            sb.append(huffmanCode.get(c));
        }
        return String.valueOf(sb);
    }

    public static String decode(Object dic, String text) {
        StringBuilder decodedText = new StringBuilder();
        Node root = (Node) dic;
        if (isLeaf(root)) {
            while (root.freq-- > 0) {
                decodedText.append(root.ch);
            }
        } else {
            int index = -1;
            while (index < text.length() - 1) {
                index = decode(root, index, text, decodedText);
            }
        }
        return decodedText.toString();
    }

    public static int decode(Node root, int index, String text, StringBuilder decodedText) {
        if (root == null) {
            return index;
        }
        if (isLeaf(root)) {
            decodedText.append(root.ch);
            return index;
        }
        index++;
        root = (text.charAt(index) == '0') ? root.left : root.right;
        index = decode(root, index, text, decodedText);
        return index;
    }
}