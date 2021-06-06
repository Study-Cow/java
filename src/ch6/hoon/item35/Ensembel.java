package ch6.hoon.item35;

enum Ensembel {

    SOLO, DUET, TRIO, QUARTET, QUINTET,
    SEXTET, SEPTET, OCTET, NONET, DECTET;

    public int numberOfMusicians(){  //연결된 값을 절대 이렇게 얻는식으로 구현하지말자.
        return ordinal() + 1;
    }

}
