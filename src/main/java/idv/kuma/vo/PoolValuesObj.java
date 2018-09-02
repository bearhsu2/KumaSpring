package idv.kuma.vo;


import lombok.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PoolValuesObj {

    private int jackpotPoolID;
    private double jackpotPool;
    private int maxJackpotAmt;
    private long jackpotHitId;
    private int jackpotType;
    private int increaseRate;
    private int increaseBase;
    private String jpTypeDescription;
    private double maxPoolValue;
    private double minPoolValue;
    private double maxResetRange;
    private double minResetRange;
    private double jpPoolcontribution;
    private String domain;

}
