public class BreakingRecords {

    public static void main(String[] args) {

    }

    public static int[] breakingRecords(int[] scores) {
        int[] records = new int[2];
        int highestScoreCount = 0;
        int lowestScoreCount = 0;
        int highestScore = scores[0];
        int lowestScore = scores[0];

        for (int i = 1; i < scores.length; i++) {
            if (scores[i] > highestScore) {
                highestScore = scores[i];
                highestScoreCount++;
            }
            if (scores[i] < lowestScore) {
                lowestScore = scores[i];
                lowestScoreCount++;
            }
        }

        records[0] = highestScoreCount;
        records[1] = lowestScoreCount;
        return records;
    }
}
