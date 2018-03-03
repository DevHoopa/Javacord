package org.javacord.entity;

import org.javacord.entity.impl.ImplIcon;
import org.javacord.util.FileContainer;
import org.javacord.util.logging.LoggerUtil;
import org.slf4j.Logger;

import java.awt.image.BufferedImage;
import java.io.InputStream;
import java.net.URL;
import java.util.concurrent.CompletableFuture;

/**
 * This class represents a discord icon, for example a server icon or a user avatar.
 */
public interface Icon {

    /**
     * The logger of this class.
     */
    Logger logger = LoggerUtil.getLogger(Icon.class);

    /**
     * Gets the url of the icon.
     *
     * @return The url of the icon.
     */
    URL getUrl();

    /**
     * Checks if the icon is animated.
     *
     * @return Whether the icon is animated or not.
     */
    default boolean isAnimated() {
        return getUrl().getFile().endsWith(".gif");
    }

    /**
     * Gets the icon as byte array.
     *
     * @return The icon as byte array.
     */
    default CompletableFuture<byte[]> asByteArray() {
        return new FileContainer(getUrl()).asByteArray(((ImplIcon) this).getApi());
    }

    /**
     * Gets the input stream for the icon.
     * This can be used for {@link org.javacord.entity.message.Messageable#sendMessage(InputStream, String)}
     *
     * @return The input stream for the icon.
     */
    default CompletableFuture<InputStream> asInputStream() {
        return new FileContainer(getUrl()).asInputStream(((ImplIcon) this).getApi());
    }

    /**
     * Gets the icon as {@link BufferedImage}.
     *
     * @return The icon as BufferedImage.
     */
    default CompletableFuture<BufferedImage> asBufferedImage() {
        return new FileContainer(getUrl()).asBufferedImage(((ImplIcon) this).getApi());
    }

}
