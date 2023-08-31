package me.marcostec.devbot.events;

import net.dv8tion.jda.api.entities.channel.concrete.TextChannel;
import net.dv8tion.jda.api.events.guild.member.GuildMemberRemoveEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class MemberLeave  extends ListenerAdapter {

    @Override
    public void onGuildMemberRemove(GuildMemberRemoveEvent event) {
        TextChannel textChannel = event.getGuild().getTextChannelById(1142223204090380299L); //defini em qual canal sera mandado a mensagen
        String userName = event.getUser().getName(); //Salva o user e o nome do usuario

        textChannel.sendMessage(userName + "saiu no servidor!").queue(); //Envia a mensagem
    }
}

