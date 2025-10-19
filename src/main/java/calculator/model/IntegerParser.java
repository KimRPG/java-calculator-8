package calculator.model;

import java.util.List;

/**
 * String을 Integer로 바꾸는 클래스
 */
public interface IntegerParser {

    /**
     * 숫자가 아닌 문자열과 음수는 IllegalArgumentException을 반환한다.
     *
     * @param text 사용자 입력 문자열
     * @return 문자열을 int로 바꾼 후 list 반환
     */
    List<Integer> ParserToIntList(String text);
}
