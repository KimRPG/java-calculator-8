package calculator.model;

import java.util.List;

/**
 * 숫자들의 합을 계산하는 구현체
 */
public class SumCalculatorImpl implements SumCalculator {
    /**
     * List로 들어온 값을 더한 후 반환한다
     *
     * @param numbers Integer list
     * @return list 노드 합산 값
     */
    @Override
    public int sum(List<Integer> numbers) {
        return numbers.stream()
                .mapToInt(Integer::intValue)
                .sum();
    }
}
