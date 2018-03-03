package org.javacord.event.channel.user;

import org.javacord.entity.channel.PrivateChannel;

/**
 * A private channel create event.
 */
public class PrivateChannelCreateEvent extends PrivateChannelEvent {

    /**
     * Creates a new private channel create event.
     *
     * @param channel The channel of the event.
     */
    public PrivateChannelCreateEvent(PrivateChannel channel) {
        super(channel);
    }

}
