package leetCode;

import java.util.ArrayList;
import java.util.List;

public class UniqueBinarySearchTreeII {
    public List<TreeNode> generateTrees(int n) {
        if (n == 0) return new ArrayList<>();
        return genHelp(1, n);
        /*
        BST rule
        root.left.val<root.val<root.right.val

        generate ---- TreeNode root= new TreeNode(val)

        base case:
        start>end
        list.add(null);

         */

    }

    public List<TreeNode> genHelp(int start, int end) {
        List<TreeNode> list = new ArrayList<TreeNode>();
        if (start > end) {
            list.add(null);
            return list;
        }

        if (start == end) {
            list.add(new TreeNode(start));
            return list;
            List<TreeNode> left, right;
            for (int i = start; i <= end; i++) {
                left = genHelp(start, i - 1);
                right = genHelp(i + 1, end);
                for (TreeNode lnode : left) {
                    for (TreeNode rnode : right) {
                        TreeNode root = new TreeNode(i);
                        root.left = lnode;
                        root.right = rnode;
                        list.add(root);

                    }
                }
            }
            return list;
        }
    }
