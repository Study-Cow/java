package ch6.dahye.item37;

import lombok.RequiredArgsConstructor;

import java.util.EnumMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.nio.file.LinkOption;

public enum Phase {
    SOLID, LIQUID, GAS;

    @RequiredArgsConstructor
    public enum Transition {
        MELT(SOLID, LIQUID),
        FREEZE(LIQUID, SOLID),
        BOIL(LIQUID, GAS),
        CONDENSE(GAS, LIQUID),
        SUBLIME(SOLID, GAS),
        DEPOSIT(GAS, SOLID),
        ;

        private final Phase from;
        private final Phase to;

        private static final Map<Phase, Map<Phase, Transition>> m
                = Stream.of(values()).collect(Collectors.groupingBy(t -> t.from, () -> new EnumMap<>(Phase.class), Collectors.toMap(t -> t.to, t -> t, (x, y) -> y, () -> new EnumMap<>(Phase.class))));

        public static Transition from(Phase from, Phase to) {
            return m.get(from).get(to);
        }
    }
}
