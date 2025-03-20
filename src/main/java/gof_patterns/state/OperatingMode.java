package gof_patterns.state;

/**
 * The operating modes a stop light functions under.
 */
public enum OperatingMode {
    /** Normal operating (red -> green -> yellow). */
    NORMAL,
    /** Flashing yellow (continuous). */
    CAUTION,
    /** Flashing red (continuous). */
    STOP
}