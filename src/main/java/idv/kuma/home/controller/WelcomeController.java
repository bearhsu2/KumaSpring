package idv.kuma.home.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class WelcomeController {

	public static String fakeAnswer = "{\"usedChips\":[1,5,10,20,30,100,500,1000,5000,10000],\"tables\":[{\"serverId\":0,\"tableLimit\":\"100000\",\"tableLimit4Tie\":\"100\",\"tableLimit4PP\":\"100\",\"tableLimit4BP\":\"100\",\"display\":1,\"insurance\":\"1000\"},{\"serverId\":1,\"tableLimit\":\"100000\",\"tableLimit4Tie\":\"200\",\"tableLimit4PP\":\"200\",\"tableLimit4BP\":\"200\",\"display\":1,\"insurance\":\"2000\"},{\"serverId\":2,\"tableLimit\":\"100000\",\"tableLimit4Tie\":\"300\",\"tableLimit4PP\":\"300\",\"tableLimit4BP\":\"300\",\"display\":1,\"insurance\":\"3000\"}],\"slotGameBetSetting\":[{\"accDenom\":1,\"autoPlayEnable\":1,\"defaultDenom\":0,\"denomProbId\":[0,0,0,0,0,0,0,0,0],\"denomSelection\":[1,5,10,50,100,20,30,400,5500],\"gambleEnable\":1,\"gambleLimit\":10000000,\"gambleTiems\":5,\"jpEnable\":1,\"usedDenomCount\":5,\"defalutBet\":0,\"defalutLine\":0}],\"disabledSlotGameType\":[1,2,3,4],\"gameScope\":[{\"gameType\":1,\"enable\":true,\"comingSoon\":false,\"unavaiableGame\":[]},{\"gameType\":2,\"enable\":false,\"comingSoon\":false,\"unavaiableGame\":[]},{\"gameType\":3,\"enable\":true,\"comingSoon\":false,\"unavaiableGame\":[]},{\"gameType\":4,\"enable\":false,\"comingSoon\":false,\"unavaiableGame\":[]},{\"gameType\":5,\"enable\":true,\"comingSoon\":false,\"unavaiableGame\":[]},{\"gameType\":6,\"enable\":false,\"comingSoon\":false,\"unavaiableGame\":[]},{\"gameType\":7,\"enable\":true,\"comingSoon\":false,\"unavaiableGame\":[]},{\"gameType\":8,\"enable\":false,\"comingSoon\":false,\"unavaiableGame\":[]},{\"gameType\":9,\"enable\":false,\"comingSoon\":false,\"unavaiableGame\":[]},{\"gameType\":10,\"enable\":false,\"comingSoon\":false,\"unavaiableGame\":[]},{\"gameType\":11,\"enable\":false,\"comingSoon\":false,\"unavaiableGame\":[]},{\"gameType\":12,\"enable\":false,\"comingSoon\":false,\"unavaiableGame\":[]},{\"gameType\":13,\"enable\":false,\"comingSoon\":false,\"unavaiableGame\":[]},{\"gameType\":14,\"enable\":false,\"comingSoon\":false,\"unavaiableGame\":[]}],\"mysteryJackpotSetting\":[0,1,2,-1],\"yiLuFaGameSetting\":{\"pools\":{\"1\":{\"poolIds\":[[1000,1001,1002,1003],[1004,1005,1006,1007]],\"gameWaterLevels\":[92,88],\"jpWaterLevels\":[4,8]},\"2\":{\"poolIds\":[[1008,1009,1010,1011],[1012,1013,1014,1015]],\"gameWaterLevels\":[92,88],\"jpWaterLevels\":[4,8]},\"5\":{\"poolIds\":[[1016,1017,1018,1019],[1020,1021,1022,1023]],\"gameWaterLevels\":[92,88],\"jpWaterLevels\":[4,8]}},\"denoms\":[1.0,2.0,5.0],\"viewCode\":[\"bk_0_0\",\"bk_0_1\",\"bk_1_0\",\"bk_1_1\",\"bk_2_0\",\"bk_2_1\"]}}";

	@RequestMapping("/")
	public String home() {
		return "Hello World!" + fakeAnswer;
	}



}