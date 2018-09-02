package idv.kuma.vo;


import lombok.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class HitInfoObj {

    private String gameServerIdentity;
    private String uidA;
    private double poolhitAmt;
    private double currencyRate;
    private long machineId;
    private int poolId;
    private String location;
    private String webId;

}
