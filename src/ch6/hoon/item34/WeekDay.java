package ch6.hoon.item34;

enum WeekDay {

    MONDAY(0),
    TUESDAY(1),
    WEDNESDAY(2),
    THURSDAY(3),
    FRIDAY(4),
    SATURDAY(5),
    SUNDAY(6);

    //임의의 필드
    private final int value;

    WeekDay(int value) {
        this.value = value;
    }

    //메서드 구현
    public int getValue() {
        return value;
    }

    public static void main(String[] args) {
        System.out.println(WeekDay.MONDAY); //MONDAY 출력
        System.out.println(WeekDay.MONDAY.toString()); //MONDAY 출력
        System.out.println(WeekDay.MONDAY.getValue());  //0 출력

        for (WeekDay value : WeekDay.values()) {    //enum 순회
            System.out.println(value);
        }

        WeekDay monday = WeekDay.valueOf("MONDAY"); //String 인자를 기준으로 enum의 인스턴스를 가져온다
        System.out.println(monday);
    }

}