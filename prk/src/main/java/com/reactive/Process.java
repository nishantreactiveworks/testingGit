package com.reactive;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class Process implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {
		 System.out.println("Camel Proces");
		System.out.println(exchange.getIn().getBody());
		
	}

}
