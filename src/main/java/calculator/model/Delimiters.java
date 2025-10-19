package calculator.model;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 구분자 클래스
 */
public class Delimiters {
    private String numberText;
    private final String delimiterRegex;

    private static final Pattern CUSTOM_SEPARATOR = Pattern.compile("//(.*)\\\\n(.*)");

    /**
     * 생성자 구분자를 제거한 텍스트와 구분자를 설정한다
     *
     * @param text 사용자 입력 텍스트
     */
    public Delimiters(String text) {
        //Default 구분자
        String delimiters = ",|:";

        StringBuilder sb = new StringBuilder();
        Matcher customDelimiterMatcher = customDelimiterMatcher(text);

        sb.append("[").append(delimiters);
        this.numberText = text;
        // 커스텀 구분자가 존재할 경우
        if (customDelimiterMatcher.matches()) {
            sb.append("|").append(customDelimiterMatcher.group(1));
            this.numberText = customDelimiterMatcher.group(2);
        }
        sb.append("]");

        delimiterRegex = sb.toString();
    }

    private Matcher customDelimiterMatcher(String text) {
        return CUSTOM_SEPARATOR.matcher(text);
    }

    /**
     * @return 커스텀 구분자를 제거한 텍스트
     */
    public String getNumberText() {
        return numberText;
    }

    /**
     * @return 구분자 반환
     */
    public String getDelimiterRegex() {
        return delimiterRegex;
    }
}
