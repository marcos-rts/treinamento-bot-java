package me.marcostec.devbot.commands;

import me.marcostec.devbot.main.DevBot;
import net.dv8tion.jda.api.entities.channel.concrete.TextChannel;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class Ping extends ListenerAdapter {

    @Override
    public void onMessageReceived(MessageReceivedEvent event) {

        String[] args = event.getMessage().getContentRaw().split(" ");
        TextChannel textChannel = (TextChannel) event.getChannel();

        if (args[0].equalsIgnoreCase("!" + "ping")){
            textChannel.sendMessage(DevBot.jda.getGatewayPing() + "ms").queue();
        }
    }
}
