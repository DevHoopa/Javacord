package org.javacord.entity.channel;

import java.util.Optional;
import java.util.concurrent.CompletableFuture;

/**
 * This class represents an entity which can have a channel category.
 */
public interface Categorizable {

    /**
     * Gets the category of the channel.
     *
     * @return The category of the channel.
     */
    Optional<ChannelCategory> getCategory();

    /**
     * Updates the category of the channel.
     *
     * @param category The new category of the channel.
     * @return A future to check if the update was successful.
     */
    CompletableFuture<Void> updateCategory(ChannelCategory category);

    /**
     * Removes the category of the channel.
     *
     * @return A future to check if the update was successful.
     */
    CompletableFuture<Void> removeCategory();

}
