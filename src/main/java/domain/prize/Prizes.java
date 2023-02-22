package domain.prize;

import java.util.List;
import java.util.stream.Collectors;

public class Prizes {

    private final List<Prize> prizes;

    private Prizes(List<Prize> prizes) {
        this.prizes = prizes;
    }

    public static Prizes from(List<String> prizeValues) {
        List<Prize> prizes = prizeValues.stream().map(Prize::new)
                .collect(Collectors.toUnmodifiableList());
        return new Prizes(prizes);
    }

    public List<String> getPrizeValues() {
        return prizes.stream()
                .map(Prize::getValue)
                .collect(Collectors.toList());
    }
}
