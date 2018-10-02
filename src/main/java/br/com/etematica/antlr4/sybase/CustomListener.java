package br.com.etematica.antlr4.sybase;

import br.com.etematica.Objeto;

public class CustomListener extends TSqlSyb155ParserBaseListener {

    private boolean criandoProc = false;
    private Objeto proc = new Objeto();

    private String dbName;
    private String ownerName;
    private String procName;

    public CustomListener(String dbName, String ownerName, String procName) {
        this.dbName = dbName;
        this.ownerName = ownerName;
        this.procName = procName;
    }

    @Override
    public void enterCreate_or_alter_procedure(TSqlSyb155Parser.Create_or_alter_procedureContext ctx) {
        criandoProc = true;
        //System.out.println("enterCreate_or_alter_procedure:" + ctx.proc.getText());
    }

    @Override
    public void exitCreate_or_alter_procedure(TSqlSyb155Parser.Create_or_alter_procedureContext ctx) {
        criandoProc = false;
        //System.out.println("exitCreate_or_alter_procedure:" + ctx.getText());
    }

    @Override
    public void enterFunc_proc_name(TSqlSyb155Parser.Func_proc_nameContext ctx) {
//        System.out.println("/" + ctx.procedure.getText().substring(0, 3) + "/");
        if (ctx.procedure.getText().substring(0, 3).equalsIgnoreCase("spr")) {
            if (ctx.database != null) {
                proc.setDatabase(ctx.database.getText());
            } else {
                proc.setDatabase(this.dbName);
            }
            if (ctx.schema != null) {
                proc.setSchema(ctx.schema.getText());
            } else {
                proc.setSchema(this.ownerName);
            }
            proc.setName(ctx.procedure.getText());
            //System.out.println("enterFunc_proc_name:" + ctx.procedure.getText());
        } else {
            proc.setDatabase("master");
            proc.setSchema("dbo");

        }
        System.out.println("procxproc,"
                + ctx.start.getLine() + ","
                + ctx.start.getCharPositionInLine() + ","
                + this.dbName + ","
                + this.ownerName + ","
                + this.procName + ","
                + proc.getDatabase() + ","
                + proc.getSchema() + ","
                + proc.getName());

    }
}
