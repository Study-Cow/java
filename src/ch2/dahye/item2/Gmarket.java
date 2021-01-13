package ch2.dahye.item2;

import java.util.Objects;

public class Gmarket extends Allnco{
    public enum Chnl { ONLINE, OUTLET, MART, DEPARTMENT, BUYING }
    private final Chnl chnl;

    public static class Builder extends Allnco.Builder<Builder> {
        private final Chnl chnl;

        public Builder(Chnl chnl){
            this.chnl = Objects.requireNonNull(chnl);
        }

        @Override
        public Gmarket build(){
            return new Gmarket(this);
        }

        @Override
        protected Builder self(){
            return this;
        }
    }
    private Gmarket(Builder builder){
        super(builder);
        chnl = builder.chnl;
    }
}
