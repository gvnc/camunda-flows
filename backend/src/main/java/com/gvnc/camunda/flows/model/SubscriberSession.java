package com.gvnc.camunda.flows.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

@RedisHash("camundaFlows.SubscriberSession")
public class SubscriberSession extends BaseModel{

  	private static final long serialVersionUID = 1L;

	@Getter @Setter @Id
    private String sessionId;

    @Getter @Setter
    private Subscriber subscriber;

    @Getter @Setter
    private String callId;

    @Getter @Setter
    private String agentUser;

    @Getter @Setter
    private Modem modem;

    @Getter @Setter
    private SwitchInfo switchInfo;

    @Getter @Setter
    private BngInfo bng;
}
