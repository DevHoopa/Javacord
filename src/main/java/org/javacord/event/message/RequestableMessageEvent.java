package org.javacord.event.message;

import org.javacord.DiscordApi;
import org.javacord.entity.channel.TextChannel;
import org.javacord.entity.message.Message;

import java.util.concurrent.CompletableFuture;

/**
 * A message event where the message is NOT guaranteed to be in the cache, but can be requested from Discord.
 */
public abstract class RequestableMessageEvent extends OptionalMessageEvent {

    /**
     * Creates a new requestable message event.
     *
     * @param api The discord api instance.
     * @param messageId The id of the message.
     * @param channel The text channel in which the message was sent.
     */
    public RequestableMessageEvent(DiscordApi api, long messageId, TextChannel channel) {
        super(api, messageId, channel);
    }

    /**
     * Requests a message from Discord, if it's not cached.
     *
     * @return The message either from the cache or directly from Discord.
     * @see TextChannel#getMessageById(long)
     */
    public CompletableFuture<Message> requestMessage() {
        return getMessage()
                .map(CompletableFuture::completedFuture)
                .orElseGet(() -> getChannel().getMessageById(getMessageId()));
    }

}
