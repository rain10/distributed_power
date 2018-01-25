package org.arain.power.content.other;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("other")
public class OtherController {
	@Autowired
	private RestTemplate restTemplate;
	@Autowired
	private LoadBalancerClient loadBalancerClient;
	@RequestMapping("list_01")
	public void list_01() {
		ServiceInstance instance = loadBalancerClient.choose("SYSTEM");
		System.out.println(instance.getHost()+":"+instance.getPort()+"/"+instance.getServiceId());
	}
}
