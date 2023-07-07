package BinaryTrees;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeBuilder {
    private static int index;

    public static Node buildTree(String s) {
        s = s.substring(1, s.length() - 1);
        String[] nodes = s.split(",");
        if (nodes.length == 0 || nodes[0].equals("null")) {
            return null;
        }

        Node root = new Node(Integer.parseInt(nodes[0]));
        index = 1;

        buildTreeHelper(root, nodes);
        return root;
    }

    private static void buildTreeHelper(Node node, String[] nodes) {
        if (index >= nodes.length) {
            return;
        }

        if (!nodes[index].equals("null")) {
            node.left = new Node(Integer.parseInt(nodes[index]));
            index++;
            buildTreeHelper(node.left, nodes);
        } else {
            index++;
        }

        if (index >= nodes.length) {
            return;
        }

        if (!nodes[index].equals("null")) {
            node.right = new Node(Integer.parseInt(nodes[index]));
            index++;
            buildTreeHelper(node.right, nodes);
        } else {
            index++;
        }
    }
}
