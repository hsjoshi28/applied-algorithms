public class EditDistance {
    public static int editDistance(String word1, String word2) {
        int[][] matrices1w2 = new int[word1.length() + 1][word2.length() + 1];

        for (int i = 0; i < matrices1w2[0].length; i++) {
            matrices1w2[0][i] = i;
        }

        for (int i = 0; i < matrices1w2.length; i++) {
            matrices1w2[i][0] = i;
        }

        for (int i = 1; i <= word1.length(); i++) {
            for (int j = 1; j <= word2.length(); j++) {
                if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
                    matrices1w2[i][j] = matrices1w2[i - 1][j - 1];
                } else {
                    matrices1w2[i][j] = 1 + min(matrices1w2[i - 1][j], matrices1w2[i - 1][j - 1], matrices1w2[i][j - 1]);
                }
            }
        }
        return matrices1w2[word1.length()][word2.length()];
    }

    private static int min(int i, int i1, int i2) {
        if (i <= i1 && i <= i2)
            return i;
        else if (i1 <= i && i1 <= i2)
            return i1;
        return i2;
    }
}
