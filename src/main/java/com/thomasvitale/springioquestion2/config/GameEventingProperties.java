package com.thomasvitale.springioquestion2.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.net.URI;

@ConfigurationProperties(prefix = "game.eventing")
public record GameEventingProperties(
    URI brokerUri,
    boolean enabled
){}
