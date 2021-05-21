package ch5.dahye.item28;

import java.util.Collection;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ChooserArray {

    private final Object[] choiceArray;


    // 생성자에 어떤 컬렉션을 넘기느냐에 따라 주사위판, 매직8볼, 몬테카를로 시뮬레이션용으로 활용 가능
    public ChooserArray(Collection choices) {
        this.choiceArray = choices.toArray();
    }

    // 컬렉션안의 원소 중 하나를 무작위로 선택해 반환
    // 반환된 Object를 원하는 타입으로 형변환 필요 -> 타입이 다른게 들어가 있는 경우 런타임 오류 발생
    public Object choose() {
        Random rnd = ThreadLocalRandom.current();
        return choiceArray[rnd.nextInt(choiceArray.length)];
    }
}
