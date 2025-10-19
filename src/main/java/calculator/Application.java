package calculator;

import calculator.controller.CalculatorController;
import calculator.model.IntegerParser;
import calculator.model.IntegerParserImpl;
import calculator.model.SumCalculator;
import calculator.model.SumCalculatorImpl;
import calculator.view.InputView;
import calculator.view.OutputView;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        InputView inputView = new InputView();
        IntegerParser integerParser = new IntegerParserImpl();
        SumCalculator sumCalculator = new SumCalculatorImpl();
        OutputView outputView = new OutputView();
        CalculatorController controller = new CalculatorController(inputView,
                integerParser, sumCalculator, outputView);

        controller.run();

    }
}
