package ch2.dahye.item2;

public class AllncoTest {

    public static void main(String[] args){
        Gmarket gmarket = new Gmarket.Builder(Gmarket.Chnl.MART).addApiType(Gmarket.ApiType.UPDATE_ITEM).addApiType(Gmarket.ApiType.UPDATE_PRC).build();

        Naver naver = new Naver.Builder().addApiType(Naver.ApiType.ADD_ITEM).connectToHapi().build();
    }
}
