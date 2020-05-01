package com.kodilla.patterns.strategy.social.publishers;

import com.kodilla.patterns.strategy.social.SocialPublisher;
import com.kodilla.patterns.strategy.social.User;

public class FacebookPublisher implements SocialPublisher {
    @Override
    public String share() {
        return "Most using Facebook";
    }
}
