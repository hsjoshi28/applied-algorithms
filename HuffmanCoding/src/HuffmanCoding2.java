/*
import java.util.ArrayList;
import java.util.Arrays;

public class HuffmanCoding2 {
    static Node node;
    static Node newRoot;
    static String codedString = "";
    public static Object build(String text) {
        String data = text;
        int length = text.length();

        return text;
    }

    public static String encode(Object dic, String message) {
        //Convert String to array
        char[] msgChar = message.toCharArray();
        //maintain an arraylist to avoid repetative words.
        ArrayList<Character> characters = new ArrayList<>();
        //Add unique character to arraylist
        for(int i = 0; i < msgChar.length; i++){
            if(!characters.contains(msgChar[i])){
                characters.add(msgChar[i]);
            }
        }
        //Count occurences of each character
        int[] countOfChar = new int[characters.size()];
        for(int i = 0 ; i < characters.size();i++){
            char checker = characters.get(i);
            for(int j = 0; j < msgChar.length;j++ ){
                if(checker==msgChar[j]) {
                    countOfChar[i]++;
                }
            }
        }
        //Sort array in descending order of count with corresponding character position
        for (int i = 0; i < countOfChar.length - 1; i++) {
            for (int j = 0; j < countOfChar.length - 1; j++) {
                if (countOfChar[j] < countOfChar[j + 1]) {
                    int temp = countOfChar[j];
                    countOfChar[j] = countOfChar[j + 1];
                    countOfChar[j + 1] = temp;

                    char tempChar = characters.get(j);
                    characters.set(j, characters.get(j + 1));
                    characters.set(j + 1, tempChar);
                }
            }
        }

        Node root = null;
        Node current = null;
        Node end = null;

        for (int i = 0; i < countOfChar.length; i++) {
            Node node = new Node(characters.get(i).toString(), countOfChar[i]);
            if (root == null) {
                root = node;
                end = node;
            } else {
                current = root;
                while (current.linker != null) {
                    current = current.linker;
                }
                current.linker = node;
                current.linker.linkerBack = current;
                end = node;
            }
        }

        // Recursively add and make nodes!
        TreeMaker(root, end);

        */
/*//*
/ inOrder(root);
        System.out.println();
        inOrder(node);

        // preOrder(root);
        System.out.println();
        preOrder(node);*//*


        // Calculate the ends and the meets!
        char[] messageArray = message.toCharArray();
        char checker;

        for (int i = 0; i < messageArray.length; i++) {
            current = node;
            checker = messageArray[i];
            String code = "";
            while (true) {
                if (current.left.value.toCharArray()[0] == checker) {
                    code += "0";
                    break;
                } else {
                    code += "1";
                    if (current.right != null) {
                        if (current.right.value.toCharArray()[0] == characters
                                .get(countOfChar.length - 1)) {
                            break;
                        }
                        current = current.right;
                    } else {
                        break;
                    }
                }
            }
            codedString += code;
        }
        System.out.println();
        System.out.println("The coded string is " + codedString);
        System.out.println("Size is:"+codedString.length());


        return null;
    }

    public static void TreeMaker(Node root, Node end) {
        node = new Node(end.linkerBack.value + end.value, end.linkerBack.count
                + end.count);
        node.left = end.linkerBack;
        node.right = end;
        end.linkerBack.linkerBack.linker = node;
        node.linkerBack = end.linkerBack.linkerBack;
        end = node;
        end.linker = null;
        Node current = root;

        while (current.linker != null) {
            System.out.print(current.value + "->");
            current = current.linker;
        }

        System.out.println(current.value);

        if (root.linker == end) {
            node = new Node(root.value + end.value, root.count + end.count);
            node.left = root;
            node.right = end;
            node.linker = null;
            node.linkerBack = null;
            System.out.println(node.value);
            newRoot = node;
        } else {
            TreeMaker(root, end);
        }
    }


    public static String decode(Object dic, String text) {


        return null;
    }

    public static void main(String[] args) {
        String message = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        encode(null,message);
    }
}
*/
