package calculator.view;

/**
 * 출력 view
 */
public class OutputView {
    private static final String OUTPUT_PROMPT_MESSAGE = "결과 : ";

    /**
     * 결과 값을 출력한다
     *
     * @param result 결과 값
     */
    public void output(int result) {
        System.out.println(OUTPUT_PROMPT_MESSAGE + result);
    }
}
