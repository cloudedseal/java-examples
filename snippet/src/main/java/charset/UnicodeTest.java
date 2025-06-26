package charset;


public class UnicodeTest {

    public static void main(String[] args) {
        printBMPChar();
        printSimpleEmoji();
        printComplexEmoji();
    }

    private static void printBMPChar() {
        // 汉 编号 0x6c49
        char [] cc = {'汉'};
        String c = "汉";
        System.out.println("length of 汉 = " + c.length());
        System.out.println("是否在 BMP: " + Character.isBmpCodePoint(0x6c49));
        System.out.println("汉 使用的码点数量: " + c.codePointCount(0, c.length()));
        System.out.println(Integer.toHexString(Character.codePointAt(cc, 0)));
        System.out.println(Character.getName(0x6c49));
        System.out.println("toCharArray = " + c.toCharArray().length);
    }

    private static void printSimpleEmoji() {
        // surrogate pairs: high surrogates (0xD800–0xDBFF), low surrogates (0xDC00–0xDFFF)
        final String s = "🤣"; //🤣 编号 0x1f923
        System.out.println("length of \uD83E\uDD23 = " + s.length()); // 2
        System.out.println("是否在 BMP: " + Character.isBmpCodePoint(0x1f923));
        System.out.println("🤣 使用的码点数量: " + s.codePointCount(0, s.length()));
        System.out.println(Character.getName(0x1f923)); // null
        System.out.println("s[0] = " + s.charAt(0)); // 完整字符的一半
        System.out.println("s[0] = " + Character.isHighSurrogate(s.charAt(0))); // 完整字符的一半
        System.out.println("s[1] = " + s.charAt(1)); // 完整字符的一半
        System.out.println("s[1] = " + Character.isLowSurrogate(s.charAt(1))); // 完整字符的一半
        System.out.println("toCharArray = " + s.toCharArray().length);

    }


    /**
     * 一个
     */
    private static void printComplexEmoji() {
        String familyEmoji = "👨‍👩‍👧‍👦"; // Complex emoji with zero-width joiners
        System.out.println("length of 👨‍👩‍👧‍👦 = " + familyEmoji.length());
        System.out.println("👨‍👩‍👧‍👦 使用的码点数量: " + familyEmoji.codePointCount(0, familyEmoji.length())); // Output: 7
        familyEmoji.codePoints().forEach(cp -> System.out.printf("U+%04X ", cp));
        // U+1F468 U+200D U+1F469 U+200D U+1F467 U+200D U+1F466

// Safely split into individual code points
        int len = familyEmoji.length();
        for (int i = 0; i < len; ) {
            int cp = familyEmoji.codePointAt(i);
            int ct = Character.charCount(cp);
            System.out.printf("Code Point: %04X char count = %d %n", cp, ct);
            i += ct; // Move past the current code point
        }

        System.out.println("toCharArray = " + familyEmoji.toCharArray().length);
    }


}
