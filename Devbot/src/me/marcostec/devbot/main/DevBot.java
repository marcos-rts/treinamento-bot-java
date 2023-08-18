package me.marcostec.devbot.main;

import me.marcostec.devbot.commands.Ping;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Guild;
import net.dv8tion.jda.api.requests.GatewayIntent;

import javax.security.auth.login.LoginException;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

public class DevBot {

    public static JDA jda;
    public static Map<Long, String> mapGuildName = new HashMap<>();
    public static void main(String[] args) throws LoginException, InterruptedException {
        Secret secret = new Secret(); // pega a classe dos arquivos secretos
        String token = secret.getTokenDiscord(); // Recolhe o id do bot

        jda = JDABuilder.create( token, EnumSet.allOf(GatewayIntent.class)).build(); //Inicia o servidor

        for (Guild guild: jda.awaitReady().getGuilds()){
            mapGuildName.put(guild.getIdLong(), guild.getName()); //Pega os nomes dos servidores instalados
            System.out.println(mapGuildName.get(guild.getIdLong())); // exibe no console os nomes
        }




        jda.addEventListener(new Ping()); // Execução de comando "Ping"
    }
}
