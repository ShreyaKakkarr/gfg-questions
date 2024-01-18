class Reverse {
    // Complete the function
    // str: input string
    public static String reverseWord(String str) {
        char[] charArray = str.toCharArray();
        int s = 0;
        int l = charArray.length - 1;

        while (s < l) {
            char temp = charArray[s];
            charArray[s] = charArray[l];
            charArray[l] = temp;
            s++;
            l--;
        }

        return new String(charArray);
    }
}
