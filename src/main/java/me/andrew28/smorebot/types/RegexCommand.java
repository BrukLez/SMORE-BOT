package me.andrew28.smorebot.types;

import net.dv8tion.jda.entities.Message;
import net.dv8tion.jda.entities.User;
import net.dv8tion.jda.events.message.MessageReceivedEvent;

/**
 * @author Andrew Tran
 */
public interface RegexCommand extends ICommand{
    public void handle(User user, Message message, MessageReceivedEvent event);
}
