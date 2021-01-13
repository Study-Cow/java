package ch2.dahye.item2;

public class Naver extends Allnco{
    private final boolean isHapi;

    public static class Builder extends Allnco.Builder<Builder> {
        public boolean isHapi = false;

        public Builder connectToHapi(){
            isHapi = true;
            return this;
        }

        @Override
        public Naver build(){
            return new Naver(this);
        }

        @Override
        protected Builder self(){
            return this;
        }

    }
    private Naver(Builder builder){
        super(builder);
        isHapi = builder.isHapi;
    }
}