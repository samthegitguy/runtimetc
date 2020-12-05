package com.samthegitguy.rtc.internals;

import java.time.LocalDateTime;

public class Logger {
    public Logger() {

    }
    private static final String ANSI_RESET = "\u001B[0m";
    private static final String ANSI_BLACK = "\u001B[30m";
    private static final String ANSI_RED = "\u001B[31m";
    private static final String ANSI_GREEN = "\u001B[32m";
    private static final String ANSI_YELLOW = "\u001B[33m";
    private static final String ANSI_BLUE = "\u001B[34m";
    private static final String ANSI_PURPLE = "\u001B[35m";
    private static final String ANSI_CYAN = "\u001B[36m";
    private static final String ANSI_WHITE = "\u001B[37m";

    private static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
    private static final String ANSI_RED_BACKGROUND = "\u001B[41m";
    private static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    private static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
    private static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
    private static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
    private static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
    private static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";
    public void info(String msg) {
        System.out.println("[" + ANSI_WHITE + "INFO" + ANSI_RESET + "] " + LocalDateTime.now() + " | " + msg);
    }
    public void error(String msg) {
        System.err.println("[" + ANSI_RED + "ERROR" + ANSI_RESET + "] " + LocalDateTime.now() + " | " + msg);
    }
    public void error(String msg, Exception err) throws Exception {
        System.err.println("[" + ANSI_RED + "ERROR" + ANSI_RESET + "] " + LocalDateTime.now() + " | " + msg);
        throw err;
    }
    public void fatal(String msg) throws Exception {
        System.err.println("[" + ANSI_WHITE_BACKGROUND + ANSI_BLACK + "FATAL" + ANSI_RESET + "] " + LocalDateTime.now() + " | " + msg);
    }
    public void fatal(String msg, Exception err) throws Exception {
        System.err.println("[" + ANSI_WHITE_BACKGROUND + ANSI_BLACK + "FATAL" + ANSI_RESET + "] " + LocalDateTime.now() + " | " + msg);
        throw err;
    }
}
