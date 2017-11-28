import sx.blah.discord.api.events.Event;
import sx.blah.discord.api.events.IListener;
import sx.blah.discord.handle.impl.events.ReadyEvent;
import sx.blah.discord.handle.impl.events.guild.channel.message.MessageEvent;
import sx.blah.discord.handle.impl.events.guild.channel.message.MessageReceivedEvent;
import sx.blah.discord.handle.impl.events.guild.channel.message.MessageSendEvent;
import sx.blah.discord.handle.impl.obj.Message;

import java.nio.channels.Channel;

public class MessageListener implements IListener<MessageEvent>{


    @Override
    public void handle(MessageEvent event) {

        //filters de bot messages en messages die niet met '!' beginnen.
        if (event.getAuthor().isBot() == false && event.getMessage().getFormattedContent().startsWith("!")){
            //filtert de command
            String command;
            String content;
            if(event.getMessage().getFormattedContent().contains(" ")){
                command = event.getMessage().getFormattedContent().substring(1,event.getMessage().getFormattedContent().indexOf(" "));
                content = event.getMessage().getFormattedContent().substring(event.getMessage().getFormattedContent().indexOf(" ")+1);
            }
            else{
                command = event.getMessage().getFormattedContent().substring(1);
            }


            //filtert de tekst die na het command komt


            //event.getMessage().reply("gave the command: " + command);

            switch (command){
                case "uitschrijven":
                    event.getMessage().getChannel().sendMessage("hier is de link om je uit te schrijven:\n\n https://fontys.nl/Studeren/Aanmelden/Uitschrijven.htm");
                    break;
                case "meme":
                    //send random thrashmeme
                    break;

            }

        }




    }
}
