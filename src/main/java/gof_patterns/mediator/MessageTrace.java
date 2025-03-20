package gof_patterns.mediator;

/**
 * Captures a messages details.
 */
public record MessageTrace(String source, String message) {
    /**
     * Constructor.
     *
     * @param source  the message source
     * @param message the message
     */
    public MessageTrace {
    }

    /**
     * Gets the message source.
     *
     * @return the message source
     */
    @Override
    public String source() {
        return source;
    }

    /**
     * Gets the message.
     *
     * @return the message
     */
    @Override
    public String message() {
        return message;
    }

}
