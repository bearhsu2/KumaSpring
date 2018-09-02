package idv.kuma.vo;

import lombok.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class QueryReturnObj {

    private HitInfoObj hitInfo;
    private PoolValuesObj poolValues;


}
