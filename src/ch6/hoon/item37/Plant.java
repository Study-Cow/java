package ch6.hoon.item37;

import java.util.*;
import java.util.stream.Collectors;

public class Plant {

    enum LifeCycle { ANNUAL, PERENNIAL, BIENNIAL}

    final String name;
    final LifeCycle lifeCycle;

    public Plant(String name, LifeCycle lifeCycle) {
        this.name = name;
        this.lifeCycle = lifeCycle;
    }

    @Override
    public String toString() {
        return name;
    }

    public static void usingOrdinalArray(List<Plant> garden) {
        Set<Plant>[] plantsByLifeCycle = (Set<Plant>[]) new Set[Plant.LifeCycle.values().length];
        for (int i = 0 ; i < plantsByLifeCycle.length ; i++) {
            plantsByLifeCycle[i] = new HashSet<>();
        }

        for (Plant plant : garden) {
            plantsByLifeCycle[plant.lifeCycle.ordinal()].add(plant);
        }

        for (int i = 0 ; i < plantsByLifeCycle.length ; i++) {
            System.out.printf("%s : %s%n", Plant.LifeCycle.values()[i], plantsByLifeCycle[i]);
        }
    }

    public static void usingEnumMap(List<Plant> garden) {
        Map<LifeCycle, Set<Plant>> plantsByLifeCycle = new EnumMap<>(LifeCycle.class);

        for (Plant.LifeCycle lifeCycle : LifeCycle.values()) {
            plantsByLifeCycle.put(lifeCycle,new HashSet<>());
        }

        for (Plant plant : garden) {
            plantsByLifeCycle.get(plant.lifeCycle).add(plant);
        }

        //EnumMap은 toString을 재정의하였다.
        System.out.println(plantsByLifeCycle);
    }

    public static void streamV1(List<Plant> garden) {
        Map plantsByLifeCycle = garden.stream().collect(Collectors.groupingBy(plant -> plant.lifeCycle));
        System.out.println(plantsByLifeCycle);
    }

    public static void streamV2(List<Plant> garden) {
        Map plantsByLifeCycle = garden.stream().collect(Collectors.groupingBy(plant -> plant.lifeCycle,
                () -> new EnumMap<>(Plant.LifeCycle.class),Collectors.toSet()));
        System.out.println(plantsByLifeCycle);
    }

    public static void main(String[] args) {
        List<Plant> garden = new ArrayList<>();
        garden.add(new Plant("꽃1", Plant.LifeCycle.ANNUAL));
        garden.add(new Plant("꽃2", Plant.LifeCycle.PERENNIAL));
        //garden.add(new Plant("꽃3", LifeCycle.BIENNIAL));
        garden.add(new Plant("꽃4", Plant.LifeCycle.ANNUAL));

        usingOrdinalArray(garden);
        System.out.println("===================");
        usingEnumMap(garden);
        System.out.println("===================");
        streamV1(garden);
        System.out.println("===================");
        streamV2(garden);
    }

}