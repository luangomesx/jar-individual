package Logs;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Log {
    private static final String LOG_FILE_PATH = "C:/Users/EDNAN/Documents/Logs/Arquivo.txt"; // Substitua pelo caminho absoluto desejado
    private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");

    public static void log(String level, String message) {
        try (FileWriter fw = new FileWriter(LOG_FILE_PATH, true);
             PrintWriter out = new PrintWriter(fw)) {
            LocalDateTime now = LocalDateTime.now();
            out.println(dtf.format(now) + " [" + level + "] " + message);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void logInfo(String message) {
        log("INFO", message);
    }

    public static void logErrorLogin(String message) {
        log("ERROR", message);
    }
}
