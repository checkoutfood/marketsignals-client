package com.trade.markets.client.services;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")

public class ClientService {
	@RequestMapping(value = "/start/MACD/Monthly/BUY", method = RequestMethod.GET)
	public void findMACDMonthlyBUYSignals() throws InterruptedException, IOException {
		// read URLS
		List<String> urlList = new ArrayList<String>();
		String url1 = "https://springboot-test-chocks.herokuapp.com/baseURL/findMarketSignals/MACD/Daily/SELL/NDX";
		String url2 = "https://springboot-test-chocks.herokuapp.com/baseURL/findMarketSignals/MACD/Daily/SELL/AAPL";
		String url3 = "https://springboot-test-chocks.herokuapp.com/baseURL/findMarketSignals/MACD/Daily/BUY/NDX";
		String url4 = "https://springboot-test-chocks.herokuapp.com/baseURL/findMarketSignals/MACD/Daily/BUY/AAPL";
		String url5 = "https://springboot-test-chocks.herokuapp.com/baseURL/findMarketSignals/MACD/Daily/BUY/TSLA";
		String url6 = "https://springboot-test-chocks.herokuapp.com/baseURL/findMarketSignals/MACD/Daily/SELL/TSLA";

		urlList.add(url1);
		urlList.add(url2);
		urlList.add(url3);
		urlList.add(url4);
		urlList.add(url5);
		urlList.add(url6);

		while (urlList.size() > 0) {
			for (int i = 0; i < urlList.size(); i++) {
				ProcessorThread.process(urlList.get(i));
			}

			Thread.sleep(30 * 1000);
		}
	}

}