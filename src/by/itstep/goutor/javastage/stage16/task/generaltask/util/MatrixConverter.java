package by.itstep.goutor.javastage.stage16.task.generaltask.util;

public class MatrixConverter {
    public static StringBuilder BUILDER;

    static {
        BUILDER = new StringBuilder();
    }

    public static StringBuilder getMatrix(int[][] matrix) {
        for (int[] ints : matrix) {
            for (int j = 0; j < matrix.length; j++) {
                BUILDER.append(ints[j]).append(" ");
            }
            BUILDER.append("\n");
        }


        return BUILDER;
    }
}
