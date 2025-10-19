package calculator.view;

import camp.nextstep.edu.missionutils.Console;

/**
 * 사용자의 입력을 받는 클래스
 */
public class InputView {

    private static final String INPUT_PROMPT_MESSAGE = "덧셈할 문자열을 입력해 주세요.";

    /**
     * 사용자의 입력을 받는 메소드
     *
     * @return 사용자가 입력한 문자열 값
     */
    public String inputView() {
        System.out.println(INPUT_PROMPT_MESSAGE);
        return Console.readLine();
    }
}
