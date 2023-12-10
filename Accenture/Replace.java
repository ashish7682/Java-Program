public class Replace {

  String replaceCharacter(String str, char ch1, char ch2) {
        StringBuilder result = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (c == ch1) {
                result.append(ch2);
            } else if (c == ch2) {
                result.append(ch1);
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String strInput = "apples";
        char ch1Input = 'a';
        char ch2Input = 'p';
        GFG ref=new GFG();
        String output = ref.replaceCharacter(strInput, ch1Input, ch2Input);
        System.out.println(output); // Output: "paales"
    }
}
