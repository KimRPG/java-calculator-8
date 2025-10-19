package calculator.model;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 구분자 클래스
 */
public class Delimiters {

    private static final Pattern CUSTOM_SEPARATOR = Pattern.compile("//(.*)\\\\n(.*)");
    private final StringBuilder sb = new StringBuilder();

    /**
     * 구분자를 반환하는 클래스
     *
     * @param text 사용자 입력 텍스트
     * @return 구분자 반환
     */
    public String getDelimiters(String text) {
        Matcher customDelimiterMatcher = customDelimiterMatcher(text);
        //Default 구분자
        String delimiters = ",|:";
        sb.append("[").append(delimiters);

        // 커스텀 구분자가 존재할 시에는 커스텀 구분자를 추가하여 구분자를 반환한다.
        if (customDelimiterMatcher.matches()) {
            sb.append("|").append(customDelimiterMatcher.group(1));
        }
        sb.append("]");

        return sb.toString();
    }

    private Matcher customDelimiterMatcher(String text) {
        return CUSTOM_SEPARATOR.matcher(text);
    }
}
