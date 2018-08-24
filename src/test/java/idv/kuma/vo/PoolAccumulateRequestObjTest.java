package idv.kuma.vo;

import org.junit.Assert;
import org.junit.Test;

public class PoolAccumulateRequestObjTest {

    @Test
    public void Basic_Test() throws Exception {

        PoolAccumulateRequestObj obj = PoolAccumulateRequestObj.builder()
                .mNum(1234567890L)
                .partnerID(123)
                .poolCount(1)
                .poolId(new int[]{9, 10, 11, 12})
                .currencyRate(0.5)
                .bet(10D)
                .location("TCCS12345")
                .playerID("sptest0011@JB")
                .webID("FakeWebId")
                .gameServerIdentify("EXTSLOT01")
                .build();


        Assert.assertEquals(1234567890L, obj.getMNum());
    }
}