package calculator.controller;

import calculator.model.IntegerParser;
import calculator.model.SumCalculator;
import calculator.view.InputView;
import calculator.view.OutputView;
import java.util.List;

/**
 * 계산기 Controller
 */
public class CalculatorController {
    private final InputView inputView;
    private final IntegerParser integerParser;
    private final SumCalculator sumCalculator;
    private final OutputView outputView;


    public CalculatorController(InputView inputView,
                                IntegerParser integerParser,
                                SumCalculator sumCalculator,
                                OutputView outputView) {
        this.inputView = inputView;
        this.integerParser = integerParser;
        this.sumCalculator = sumCalculator;
        this.outputView = outputView;

    }

    /**
     * Application을 실행한다.
     */
    public void run() {
        String text = inputView.inputView();
        List<Integer> integerList = integerParser.ParserToIntList(text);
        int result = sumCalculator.sum(integerList);
        outputView.output(result);
    }
}
