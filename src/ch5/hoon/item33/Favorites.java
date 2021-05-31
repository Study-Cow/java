package ch5.hoon.item33;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Favorites {

    private Map<Class<?>, Object> favorites = new HashMap<>();

    public <T> void putFavorite(Class<T> type, T instance) {
        favorites.put(Objects.requireNonNull(type), type.cast(instance));  //해당 객체가 널이 아니어야 하는 경우에 사용한다. 만일 객체가 널이면, NullPointerException을 발생
    }

    public <T> T getFavorite(Class<T> type) {
        return type.cast(favorites.get(type));
    }

    // 코드 33-2 타입 안전 이종 컨테이너 패턴 - 클라이언트 (199쪽)
    public static void main(String[] args) {
        Favorites f = new Favorites();

        f.putFavorite(String.class, "Java");
        f.putFavorite(Integer.class, 0xcafebabe);
        f.putFavorite(Class.class, Favorites.class);

        String favoriteString = f.getFavorite(String.class);
        int favoriteInteger = f.getFavorite(Integer.class);

        System.out.println(favoriteString);
        System.out.println(favoriteInteger);

        Class<?> favoriteClass = f.getFavorite(Class.class);

        System.out.printf("%s %x %s%n", favoriteString, favoriteInteger, favoriteClass.getName());

    }

}