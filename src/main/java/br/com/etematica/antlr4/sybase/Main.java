package br.com.etematica.antlr4.sybase;

import br.com.etematica.TranslateTSqlSyb155;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        TranslateSybaseToDoc sybaseToDoc = new TranslateSybaseToDoc();
        sybaseToDoc.inicio();
    }
}
