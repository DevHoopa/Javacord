package org.javacord.api.listener;

import org.javacord.api.entity.channel.VoiceChannel;
import org.javacord.api.listener.channel.group.GroupChannelAttachableListener;
import org.javacord.api.listener.channel.server.voice.ServerVoiceChannelAttachableListener;
import org.javacord.api.listener.channel.user.PrivateChannelAttachableListener;

/**
 * This is a marker interface for listeners that can be attached to a {@link VoiceChannel}.
 */
public interface VoiceChannelAttachableListener
        extends ServerVoiceChannelAttachableListener, GroupChannelAttachableListener, PrivateChannelAttachableListener {
}
