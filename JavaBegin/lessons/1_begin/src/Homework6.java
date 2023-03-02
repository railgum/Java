import java.util.ArrayList;
import java.util.List;

public class Homework6 {
    public static void main(String[] args) {
        // Учитывая двоичного дерева, верните порядок обхода значений его узлов.
        //
        //пример
        //
        //Input: root = [1,null,2,3]
        //Output: [1,2,3]

        System.out.println(preorderTraversal(new TreeNode(1,null,new TreeNode(2,null,new TreeNode(3)))));
    }
    public static  List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if(root != null){
            //System.out.println(" " + root.val);
            result.add(root.val);
            result.addAll(preorderTraversal(root.left));
            result.addAll(preorderTraversal(root.right));
        }
        return result;
    }
}
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int[] ints) {

    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
