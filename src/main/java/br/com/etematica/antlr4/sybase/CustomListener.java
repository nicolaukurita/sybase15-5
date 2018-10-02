package br.com.etematica.antlr4.sybase;

import br.com.etematica.Objeto;

public class CustomListener extends TSqlSyb155ParserBaseListener {

    private boolean criandoProc = false;
    private Objeto proc = new Objeto();

    @Override
    public void enterCreate_or_alter_procedure(TSqlSyb155Parser.Create_or_alter_procedureContext ctx) {
        criandoProc = true;
        System.out.println("enterCreate_or_alter_procedure:" + ctx.proc.getText());
    }

    @Override
    public void exitCreate_or_alter_procedure(TSqlSyb155Parser.Create_or_alter_procedureContext ctx) {
        criandoProc = false;
        System.out.println("exitCreate_or_alter_procedure:" + ctx.getText());
    }

    @Override
    public void enterFunc_proc_name(TSqlSyb155Parser.Func_proc_nameContext ctx) {

        if (ctx.database != null) {
            proc.setDatabase(ctx.database.getText());
        }
        if (ctx.schema != null) {
            proc.setSchema(ctx.schema.getText());
        }
        proc.setName(ctx.procedure.getText());
        System.out.println("enterFunc_proc_name:" + ctx.procedure.getText());
    }

}
