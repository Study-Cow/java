package ch5.hoon.item26;

import java.util.ArrayList;
import java.util.List;

public class RowTypeClinet {

    public static void main(String[] args) {
        List list = new ArrayList<>();

        list.add(new Coin());
        //Doge doge = (Doge)list.get(0);  //로타입 사용 시 컴파일 레밸에서 에러를 잡을 수 없음. 그래서 제네릭을 사용해야함.


        List<?> list2 = new ArrayList<>();
        //list2.add(new Doge());

        Wallet<Coin> wallet = new Wallet<>();
        //wallet.coin = new Doge();

        List<Doge> animalList= new ArrayList<>();
        animalList.add(new Doge());
        wallet.addCoin(animalList);

    }

    static class Coin{

    }

    static class Doge extends Coin{

    }

    static class Wallet<T extends Coin>{

        public T coin;

        public void addCoin(List<? extends Coin> coins){
            coins.forEach(coin -> System.out.println(coin));

            List<? extends Coin> x = new ArrayList<Coin>(); //실체화 가능

        }

    }


}
