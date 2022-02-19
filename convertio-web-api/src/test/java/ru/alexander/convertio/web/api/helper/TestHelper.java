package ru.alexander.convertio.web.api.helper;

import org.jeasy.random.EasyRandom;
import ru.alexander.convertio.model.Money;

public final class TestHelper {

    public static final EasyRandom RANDOM = new EasyRandom();

    public static Money randomMoney() {
        return Money.builder()
            .currency(randomString())
            .amount(randomAmount())
            .build();
    }

    public static String randomString() {
        return RANDOM.nextObject(String.class);
    }

    public static Double randomAmount() {
        return 42.0;
//        return RANDOM.nextDouble() * Double.MAX_VALUE;
    }

    private TestHelper() {
    }
}