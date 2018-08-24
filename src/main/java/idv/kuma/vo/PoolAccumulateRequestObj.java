package idv.kuma.vo;


import lombok.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
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
