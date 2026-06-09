package Typing.Model;

public class TypingView {

    // =====================================
    // 入力済み文字色
    // =====================================

    private final String TYPED_COLOR =
            "#888888";

    // =====================================
    // 通常文字色
    // =====================================

    private final String NORMAL_COLOR =
            "white";

    // =====================================
    // ミス文字色
    // =====================================

    private final String MISS_COLOR =
            "red";

    // =====================================
    // ローマ字表示生成
    // =====================================

    public String createTypingText(
            TypingKey typingKey) {

        // =====================================
        // ローマ字取得
        // =====================================

        String word =
                typingKey.getWord();

        // =====================================
        // 現在位置取得
        // =====================================

        int index =
                typingKey.getCurrentIndex();

        // =====================================
        // 入力済み文字
        // =====================================

        String typed =
                word.substring(
                        0,
                        index);

        // =====================================
        // 次文字
        // =====================================

        String next = "";

        if(index < word.length()) {

            next =
                    word.substring(
                            index,
                            index + 1);
        }

        // =====================================
        // 残り文字
        // =====================================

        String rest = "";

        if(index + 1 < word.length()) {

            rest =
                    word.substring(
                            index + 1);
        }

        // =====================================
        // 次文字色
        // =====================================

        String nextColor =
                typingKey.isMiss()
                ? MISS_COLOR
                : NORMAL_COLOR;

        // =====================================
        // HTML生成
        // =====================================

        return

                "<html>"

                + "<font color='"
                + TYPED_COLOR
                + "'>"
                + typed
                + "</font>"

                + "<font color='"
                + nextColor
                + "'>"
                + next
                + "</font>"

                + rest

                + "</html>";
    }
}