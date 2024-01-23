public class OccurencesString {
    static int getOccurrences(String source, String word) {
        int count =0;
        for(String test:source.split("[\\s.]+")){
             if(test.equalsIgnoreCase(word.toLowerCase())){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String source = "Here here is an example. Right here.";
        String word = "here";
        int size = word.length();
        int result = OccurencesString.getOccurrences(source, word);
        System.out.println(result);
    }
}
