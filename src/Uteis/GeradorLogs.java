package Uteis;

import java.io.*;
import java.nio.file.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class GeradorLogs {

    public void generateLog(String message) throws IOException {

        Path path = Paths.get("Src/logs/");

        if(!Files.exists(path)) {
            Files.createDirectory(path);
        }

        File log = new File("Src/logs/logs.txt");
        if(!log.exists()) {
            log.createNewFile();
        }

        FileWriter fw = new FileWriter(log, true);
        BufferedWriter bw = new BufferedWriter(fw);

        bw.write(recuperarData() + " " + message);
        bw.newLine();

        bw.close();
        fw.close();
    }
    
    public String recuperarData(){
        LocalDateTime dataHoraAtual = LocalDateTime.now();
        // formatar a data
        DateTimeFormatter formatterData = DateTimeFormatter.ofPattern("dd/MM/uuuu");
        String dataFormatada = formatterData.format(dataHoraAtual);

        // formatar a hora
        DateTimeFormatter formatterHora = DateTimeFormatter.ofPattern("HH:mm:ss");
        String horaFormatada = formatterHora.format(dataHoraAtual);
        
        return dataFormatada + " " + horaFormatada; 
    }
}

