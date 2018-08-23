package idv.kuma.contribution.vo;


import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class PoolAccumulateRequestObj {

    private long mNum;
    private int partnerID;
    private int poolCount;
    private int[] poolId;
    private double currencyRate;
    private double bet;
    private String location;
    private String playerID;
    private String webID;
    private String gameServerIdentify;


}
