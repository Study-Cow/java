package ch2.dahye.item1;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

public enum Chnl {
    AUCTION_REP("0000000000", "옥션 대표 채널"),
    AUCTION_OUTLET("0000000000", "옥션 아울렛"),
    ELEVENST_REP("1000000000", "11번가 대표채널"),
    ELEVENST_OUTLET("1000000000", "11번가 대표채널"),
    GMARKET_REP("2000000000", "지마켓 대표채널"),
    NAVER_REP("3000000000", "네이 대표채널");


    // private static 생성 후 
    private static final Map<String, Chnl> map = new HashMap<String, Chnl>();

    static {
        // EnumSet.allOf 활용
        for (Chnl chnl : EnumSet.allOf(Chnl.class)) {
            // 7장 키캆이 Object이면 GC가 처리하지 못함.(HashMap으로 사용하는 경웅)
            map.put(chnl.getChnlId(), chnl);
        }
    }

    private Chnl(String chnlId, String chnlNm) {
        this.chnlId = chnlId;
        this.chnlNm = chnlNm;
    }

     public static Chnl getChnlById(String chnlId) {
        return map.get(chnlId);
    }

    private String chnlId;
    private String chnlNm;

    private String getChnlId() {
        return chnlId;
    }

   

}

