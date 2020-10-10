package me.cjavellana.swift.chartypes;

public class CharTypes {

    /**
     *
     * <b>n</b> - Digits
     * <p>
     * Returns a pattern to match a numeric input e.g. 0-9. It is up to the caller to supplement the
     * resulting pattern with additional information e.g. length
     * </p>
     * <br/>
     * <b>d</b> - Digits with comma separator
     * <p>
     * digits with comma separator pattern only returns the patterns
     * for matching digits and comma. It is up to the caller to supplement the
     * resulting pattern with additional information e.g. length
     * </p>
     *
     * @param swiftCharType
     * @return
     */
    public static String patternFor(String swiftCharType) {
        switch (swiftCharType) {
            case "n":
                return "[0-9]";
            case "d":
                return "[0-9,]";
            case "h":
                return "[0-9A-F]";
            case "a":
                return "[A-Z]";
            case "c":
                return "[0-9A-Z]";
            case "e":
                return "\\s";
            case "x":
                return "[A-Za-z0-9/–?:().,‘+\\s(\\r\\n)]";
            case "y":
                return "[A-Z0-9.,–()/=‘+:?!\"%&*<>;\\s]";
            case "z":
                return "[A-Za-z0-9.,–()/='+:?!\"%&*<>;{@#_\\s(\\r\\n)]";
            default:
                return swiftCharType;
        }
    }
}
