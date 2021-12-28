package com.gtbr.vaultbot;

import com.gtbr.vaultbot.handler.CommandHandler;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.security.auth.login.LoginException;

@SpringBootApplication
public class VaultBotApplication {

    public static void main(String[] args) throws LoginException {
        //provisorio
        String token = "OTI1MTM5OTU1MzY0MjY2MDQ1.YcoxuQ.ody5idYj5tfmDxl3NqQLsv3tKWY";

        SpringApplication.run(VaultBotApplication.class, args);
        JDA jda = JDABuilder.createDefault(token).build();
    }

}
