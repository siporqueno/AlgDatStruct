package lessonSix;

import java.util.Random;

public class TreeApp {
    private static final int NO_OF_TREES = 20;
    private static final int NO_OF_LEVELS = 6;
    private static int noOfUnbalancedTrees = 0;
    static Random random = new Random();

    public static void main(String[] args) {
        for (int i = 0; i < NO_OF_TREES; i++) {
            if (!getTree(NO_OF_LEVELS).isBalanced()) noOfUnbalancedTrees++;
        }
        System.out.println("Процент несбалансированных деревьев равен " + 100 * noOfUnbalancedTrees / NO_OF_TREES);
    }

    private static TreeImpl getTree(int noOfLevels) {
        TreeImpl tree = new TreeImpl();
        while (tree.getTreeHeight(tree.getRoot()) < noOfLevels) {
            tree.insert(random.nextInt(200) - 100);
        }
        return tree;
    }
}
