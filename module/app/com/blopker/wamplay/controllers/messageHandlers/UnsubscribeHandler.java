package com.blopker.wamplay.controllers.messageHandlers;


import org.codehaus.jackson.JsonNode;

import com.blopker.wamplay.models.WAMPlayClient;

public class UnsubscribeHandler implements MessageHandler {

	@Override
	public void process(WAMPlayClient client, JsonNode message) {
		String topic = message.get(1).asText();
		client.unsubscribe(topic);
	}

}
