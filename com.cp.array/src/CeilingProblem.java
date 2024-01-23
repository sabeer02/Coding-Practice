public class CeilingProblem {
    static public char nextGreatestLetter(char[] letters, char target) {
        int start =0;
        int end = letters.length-1;

        while (start<=end){
            int mid = start + (end - start)/2;
            if (letters[mid]<target){
                start=mid+1;
            } else if (letters[mid]>target) {
                end=mid-1;
            }else {
                return letters[mid%(letters.length)];
            }
        }
        return letters[start%(letters.length)];
    }

    public static void main(String[] args) {
        char[] arr = new char[]{'c','f','j'};
        char res = nextGreatestLetter(arr,'c');
        System.out.println(res);
    }
}
