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
	@RequestMapping(value = "/start/MACD/Daily", method = RequestMethod.GET)
	public void findMACDMonthlyBUYSignals() throws InterruptedException, IOException {
		// read URLS
		List<String> urlList = new ArrayList<String>();
		String url111 = "https://springboot-test-chocks.herokuapp.com/baseURL/findMarketSignals/MACD/Daily/SELL/AAPL";
		String url222 = "https://springboot-test-chocks.herokuapp.com/baseURL/findMarketSignals/MACD/Daily/BUY/AAPL";
		
		String url1 = "https://springboot-test-chocks.herokuapp.com/baseURL/findMarketSignals/MACD/Daily/SELL/AAPL";
		String url2 = "https://springboot-test-chocks.herokuapp.com/baseURL/findMarketSignals/MACD/Daily/BUY/AAPL";
		String url3 = "https://springboot-test-chocks.herokuapp.com/baseURL/findMarketSignals/MACD/Daily/SELL/AMZN";
		String url4 = "https://springboot-test-chocks.herokuapp.com/baseURL/findMarketSignals/MACD/Daily/BUY/AMZN";
		String url5 = "https://springboot-test-chocks.herokuapp.com/baseURL/findMarketSignals/MACD/Daily/SELL/CMG";
		String url6 = "https://springboot-test-chocks.herokuapp.com/baseURL/findMarketSignals/MACD/Daily/BUY/CMG";
		
		String url7 = "https://springboot-test-chocks.herokuapp.com/baseURL/findMarketSignals/MACD/Daily/SELL/FB";
		String url8 = "https://springboot-test-chocks.herokuapp.com/baseURL/findMarketSignals/MACD/Daily/BUY/FB";
		String url9 = "https://springboot-test-chocks.herokuapp.com/baseURL/findMarketSignals/MACD/Daily/SELL/GOOG";
		String url10 = "https://springboot-test-chocks.herokuapp.com/baseURL/findMarketSignals/MACD/Daily/BUY/GOOG";
		String url11 = "https://springboot-test-chocks.herokuapp.com/baseURL/findMarketSignals/MACD/Daily/SELL/INTC";
		String url12 = "https://springboot-test-chocks.herokuapp.com/baseURL/findMarketSignals/MACD/Daily/BUY/INTC";
		
		String url13 = "https://springboot-test-chocks.herokuapp.com/baseURL/findMarketSignals/MACD/Daily/SELL/JPM";
		String url14 = "https://springboot-test-chocks.herokuapp.com/baseURL/findMarketSignals/MACD/Daily/BUY/JPM";
		String url15 = "https://springboot-test-chocks.herokuapp.com/baseURL/findMarketSignals/MACD/Daily/SELL/LMT";
		String url16 = "https://springboot-test-chocks.herokuapp.com/baseURL/findMarketSignals/MACD/Daily/BUY/LMT";
		

		urlList.add(url1);
		urlList.add(url2);
		urlList.add(url3);
		urlList.add(url4);
		urlList.add(url5);
		urlList.add(url6);
		urlList.add(url7);
		urlList.add(url8);
		urlList.add(url9);
		urlList.add(url10);
		urlList.add(url11);
		urlList.add(url12);
		urlList.add(url13);
		urlList.add(url14);
		urlList.add(url15);
		urlList.add(url16);
		urlList.add(url111);
		urlList.add(url222);
	

		while (urlList.size() > 0) {
			for (int i = 0; i < urlList.size(); i++) {
				ProcessorThread.process(urlList.get(i));
			}

			Thread.sleep(30 * 1000);
		}
	}

}