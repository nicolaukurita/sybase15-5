package br.com.etematica.antlr4.sybase;

import br.com.etematica.Conexao;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.File;
import java.io.IOException;

public class TranslateSybaseToDoc {
    public static final String SQL_FILE = "E:\\Projetos\\eqt\\eqt.1\\";

    private String dbName;
    private String ownerName;
    private String procName;

    private static final String LER_SQL = "select object_name(c.id) nome,o.type,c.text\n" +
            "from syscomments c \n" +
            ",    sysobjects o\n" +
            "where c.texttype = 0\n" +
            "and   c.id = o.id";
    private Conexao conexao = new Conexao();

    public void listFilesForFolder(final File folder) throws IOException {
        for (final File fileEntry : folder.listFiles()) {
            if (fileEntry.isDirectory()) {
                listFilesForFolder(fileEntry);
            } else {
                //System.out.println(fileEntry.getName());
                if (fileEntry.getName().contains("spr")) {
                    processar(fileEntry);
                }
            }
        }
    }

    public void inicio() throws IOException {
        final File folder = new File(SQL_FILE);
        listFilesForFolder(folder);
    }

    public void processar(File fileEntry) throws IOException {

        //        File file = new File(SQL_FILE);
//        FileInputStream stream = new FileInputStream(file);

        String[] owner = fileEntry.getName().split("\\.");
        this.dbName = owner[0];
        this.ownerName = owner[1];
        this.procName = owner[2];

        //System.out.println("Filename:" + fileEntry);
        CharStream s = CharStreams.fromFileName(fileEntry.getAbsolutePath().toString());


        CaseChangingCharStream upper = new CaseChangingCharStream(s, true);
        // create a CharStream that reads from standard input
//        ANTLRInputStream input = new ANTLRInputStream(stream);
        // create a lexer that feeds off of input CharStream
        TSqlSyb155Lexer lexer = new TSqlSyb155Lexer(upper);
        // create a buffer of tokens pulled from the lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        // create a parser that feeds off the tokens buffer
        TSqlSyb155Parser parser = new TSqlSyb155Parser(tokens);
        ParseTree tree = parser.tsql_file(); // begin parsing at init rule

        // Create a generic parse tree walker that can trigger callbacks
        ParseTreeWalker walker = new ParseTreeWalker();
        // Walk the tree created during the parse, trigger callbacks
        walker.walk(new CustomListener(dbName, ownerName, procName), tree);
        //System.out.println(); // print a \n after translation

        //System.out.println(tree.toStringTree(parser));
    }


}
