package com.lnx.stompwebsocket.config;

import java.security.Principal;
import java.util.Map;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;
import org.springframework.web.socket.server.support.DefaultHandshakeHandler;

import com.lnx.stompwebsocket.model.MyPrincipal;

@Configuration
@EnableWebSocketMessageBroker
public class WebSocketConfig implements WebSocketMessageBrokerConfigurer{
	
	 /**
     *	 配置消息代理类
     * @param config
     */
	@Override
	public void configureMessageBroker(MessageBrokerRegistry config) {
        config.enableSimpleBroker("/topic","queue");
        config.setUserDestinationPrefix("/user");
        //config.setApplicationDestinationPrefixes("/app");//设置前缀
    }
	
	 /**
     * 	注册STOMP协议的节点（endpoint）并映射指定的URL
     * @param registry
     */
	@Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {
        registry.addEndpoint("/stomp")
        .setAllowedOrigins("*") // 添加允许跨域访问
        .setHandshakeHandler(new  DefaultHandshakeHandler() {
        	 @Override
             protected Principal determineUser(ServerHttpRequest request, WebSocketHandler wsHandler, Map<String, Object> attributes) {
                 //key就是服务器和客户端保持一致的标记，一般可以用账户名称，或者是用户ID。
				 return new MyPrincipal("test"); 
             }
        	 })
        .withSockJS();
    }
	
	/* @Override
    public void configureClientInboundChannel(ChannelRegistration registration) {
        registration.interceptors(new ChannelInterceptor() {
            @Override
            public Message<?> preSend(Message<?> message, MessageChannel channel) {
                StompHeaderAccessor accessor =
                        MessageHeaderAccessor.getAccessor(message, StompHeaderAccessor.class);
                if (StompCommand.CONNECT.equals(accessor.getCommand())) {
                   // Authentication user =  ; // access authentication header(s)
                   // accessor.setUser(user);
                }
                return message;
            }
        });
    }*/
}
