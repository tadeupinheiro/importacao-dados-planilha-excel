package dev.tadeupinheiro;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        ImportacaoDeEstoque importacaoDeEstoque = new ImportacaoDeEstoque();
        try {
            List<Tecido> tecidos = importacaoDeEstoque.criar();
            tecidos.forEach(System.out::println);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }



    }
}