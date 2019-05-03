package net.unibave.designpattersnexample.factorymethod;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.UUID;

public class LogArquivo implements Log {

    @Override
    public void print(String log) {
        try (final var bufferedWriter = new BufferedWriter(
                new FileWriter(
                        new File(UUID.randomUUID().toString() + ".txt")))) {
            bufferedWriter.write(log);
            bufferedWriter.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
