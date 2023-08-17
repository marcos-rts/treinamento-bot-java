package me.marcostec.devbot;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.requests.GatewayIntent;

import javax.security.auth.login.LoginException;
import java.util.EnumSet;

public class DevBot {
    public static void main(String[] args) throws LoginException {
        Secret secret = new Secret();

        String token = secret.getTokenDiscord();

        JDA jda = JDABuilder.create( token, EnumSet.allOf(GatewayIntent.class)).build();
    }



}
