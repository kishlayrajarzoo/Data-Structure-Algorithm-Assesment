import java.util.ArrayList;
import java.util.List;

class dynamicalgo_as1 {

    static int count = 0;

    public static void findWordSegments(List<String> wordsList, String inputString) {
        segmentHelper(wordsList, inputString, 0);
    }

    private static void segmentHelper(List<String> wordsList, String inputString, int start) {
        if (start == inputString.length()) {
            count++;
            return;
        }

        for (int end = start + 1; end <= inputString.length(); end++) {
            String substring = inputString.substring(start, end);
            if (wordsList.contains(substring)) {
                segmentHelper(wordsList, inputString, end);
            }
        }
    }

    public static void main(String[] args) {
        List<String> wordsList = new ArrayList<String>();
        wordsList.add("i");
        wordsList.add("like");
        wordsList.add("pizza");
        wordsList.add("li");
        wordsList.add("ke");
        wordsList.add("pi");
        wordsList.add("zza");

        String inputString = "ilikepizza";
        findWordSegments(wordsList, inputString);
        System.out.println("Number of segments: " + count);
    }
}
