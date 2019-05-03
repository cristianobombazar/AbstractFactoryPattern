package br.com.aula.exercicio1;

import br.com.aula.exercicio1.interfaces.Log;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.UUID;

public class LogFile implements Log {

    @Override
    public void print(String log) throws IOException {
        File file = new File(UUID.randomUUID().toString()+".txt");
        FileWriter fw = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(log);
        bw.flush();
        bw.close();
        fw.close();
    }
}
