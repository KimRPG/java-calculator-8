package calculator.model;

import java.util.ArrayList;
import java.util.List;

/**
 * String을 Integer로 바꾸는 구현체
 */
public class IntegerParserImpl implements IntegerParser {
    /**
     * 숫자가 아닌 문자열과 음수는 IllegalArgumentException을 반환한다.
     *
     * @param text 사용자 입력 문자열
     * @return 문자열을 int로 바꾼 후 list 반환
     */
    @Override
    public List<Integer> ParserToIntList(String text) {
        List<Integer> list = new ArrayList<>();

        Delimiters delimiters = new Delimiters(text);

        String numberText = delimiters.getNumberText();
        String[] numberStrings = numberText.split(delimiters.getDelimiterRegex());

        for (String value : numberStrings) {
            int number = validIsInteger(value);
            validIsPositiveInteger(number);
            list.add(number);
        }

        return list;
    }

    private int validIsInteger(String value) {
        try {
            if (value == null || value.isEmpty()) {
                return 0;
            }
            return Integer.parseInt(value);

        } catch (NumberFormatException e) {

            throw new IllegalArgumentException("커스텀 구분자와 구분자 외에는 숫자만 들어와야 합니다.");
        }
    }

    private void validIsPositiveInteger(int value) {
        if (value < 0) {
            throw new IllegalArgumentException("음수는 들어올 수 없습니다.");
        }
    }
}
