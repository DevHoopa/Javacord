package org.javacord.event.channel.server;

import org.javacord.entity.channel.ServerChannel;

/**
 * A server channel create event.
 */
public class ServerChannelCreateEvent extends ServerChannelEvent {

    /**
     * Creates a new server channel create event.
     *
     * @param channel The channel of the event.
     */
    public ServerChannelCreateEvent(ServerChannel channel) {
        super(channel);
    }

}
