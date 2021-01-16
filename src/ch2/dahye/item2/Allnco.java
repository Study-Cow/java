package ch2.dahye.item2;

import java.util.EnumSet;
import java.util.Objects;
import java.util.Set;

public abstract class Allnco {
    public enum ApiType { ADD_ITEM, UPDATE_ITEM, UPDATE_IMAGE, UPDATE_PRC }
    final Set<ApiType> apiTypes;

    abstract static class Builder<T extends Builder<T>> {
        EnumSet<ApiType> apiTypes = EnumSet.noneOf(ApiType.class);

        public T addApiType(ApiType apiType){
            apiTypes.add(Objects.requireNonNull(apiType));
            return self();
        }

        abstract Allnco build();

        // 하위 클래스는 이 메서드를 overriding해 "this"를 반환하도록 구현해야함.
        protected abstract T self();
    }

    Allnco(Builder<?> builder){
        apiTypes = builder.apiTypes.clone();
    }
}
