package ch6.sunmin.item37;

import java.util.Arrays;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Plant {

	enum LifeCycle { ANNUAL, PERENNIAL, BIENNIAL }
	
	final String name;
	final LifeCycle lifeCycle;
	
	Plant(String name, LifeCycle lifeCycle) {
		this.name = name;
		this.lifeCycle = lifeCycle;
	}
	
	@Override public String toString() {
		return name;
	}
	
	public static void main(String[] args) {
        Plant[] garden = {
                new Plant("바질",    LifeCycle.ANNUAL),
                new Plant("캐러웨이", LifeCycle.BIENNIAL),
                new Plant("딜",      LifeCycle.ANNUAL),
                new Plant("라벤더",   LifeCycle.PERENNIAL),
                new Plant("파슬리",   LifeCycle.BIENNIAL),
                new Plant("로즈마리", LifeCycle.PERENNIAL)
            };
        
//		Set<Plant>[] plantsByLifeCycle = (Set<Plant>[]) new Set[Plant.LifeCycle.values().length];
//		// Plant의 LifeCycle enum 만큼 Set<> 배열을 만든다.
//		
//		for(int i=0; i<plantsByLifeCycle.length; i++) {
//			plantsByLifeCycle[i] = new HashSet<>();
//		}
//		
//		for(Plant p : garden) {
//			// Plant의 LifeCycle을 가져와서 해당 LifeCycle의 위치를 인덱스로 활용한다.
//			plantsByLifeCycle[p.lifeCycle.ordinal()].add(p);
//		}
//		
//		for(int i=0; i<plantsByLifeCycle.length; i++) {
//			System.out.printf("%s: %s%n", Plant.LifeCycle.values()[i], plantsByLifeCycle[i]);
//		}
        
        // 1. EnumMap 활용
        // 배열을 사용하기 때문에 배열의 성능을 가지고 있다.
        Map<Plant.LifeCycle, Set<Plant>> plantsByLifeCycle = new EnumMap<>(Plant.LifeCycle.class); // 한정적 타입 토큰
        // 각 맵의 value (HashSet)을 먼저 초기화 해준다.
        for (Plant.LifeCycle lc : Plant.LifeCycle.values() ) {
        	plantsByLifeCycle.put(lc, new HashSet<>());
        }
        for(Plant p : garden) {
        	plantsByLifeCycle.get(p.lifeCycle).add(p);
        }
        
        System.out.println(plantsByLifeCycle);
        
        // 2. 스트림 활용
        // 배열의 성능 이점이 사라진다.
        System.out.println(Arrays.stream(garden)
        						 .collect(Collectors.groupingBy(p -> p.lifeCycle)));
        
        Map<Object,List<Plant>> test = Arrays.stream(garden)
		 .collect(Collectors.groupingBy(p -> p.lifeCycle));
        
        // 3. 스트림 최적화
        EnumMap<Plant.LifeCycle, Set<Plant>> test2 = Arrays.stream(garden)
		 .collect(Collectors.groupingBy(p -> p.lifeCycle,
				 						() -> new EnumMap<>(LifeCycle.class),
				 						Collectors.toSet()));
        
        System.out.println(Arrays.stream(garden)
        						 .collect(Collectors.groupingBy(p -> p.lifeCycle,
        								 						() -> new EnumMap<>(LifeCycle.class),
        								 						Collectors.toSet())));
        
	}
	
}
