package br.com.etematica.antlr4.sybase;// Generated from TSqlSyb155Parser.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TSqlSyb155Parser}.
 */
public interface TSqlSyb155ParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#tsql_file}.
	 * @param ctx the parse tree
	 */
	void enterTsql_file(TSqlSyb155Parser.Tsql_fileContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#tsql_file}.
	 * @param ctx the parse tree
	 */
	void exitTsql_file(TSqlSyb155Parser.Tsql_fileContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#batch}.
	 * @param ctx the parse tree
	 */
	void enterBatch(TSqlSyb155Parser.BatchContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#batch}.
	 * @param ctx the parse tree
	 */
	void exitBatch(TSqlSyb155Parser.BatchContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#sql_clauses}.
	 * @param ctx the parse tree
	 */
	void enterSql_clauses(TSqlSyb155Parser.Sql_clausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#sql_clauses}.
	 * @param ctx the parse tree
	 */
	void exitSql_clauses(TSqlSyb155Parser.Sql_clausesContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#sql_clause}.
	 * @param ctx the parse tree
	 */
	void enterSql_clause(TSqlSyb155Parser.Sql_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#sql_clause}.
	 * @param ctx the parse tree
	 */
	void exitSql_clause(TSqlSyb155Parser.Sql_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#dml_clause}.
	 * @param ctx the parse tree
	 */
	void enterDml_clause(TSqlSyb155Parser.Dml_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#dml_clause}.
	 * @param ctx the parse tree
	 */
	void exitDml_clause(TSqlSyb155Parser.Dml_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#ddl_clause}.
	 * @param ctx the parse tree
	 */
	void enterDdl_clause(TSqlSyb155Parser.Ddl_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#ddl_clause}.
	 * @param ctx the parse tree
	 */
	void exitDdl_clause(TSqlSyb155Parser.Ddl_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#backup_statement}.
	 * @param ctx the parse tree
	 */
	void enterBackup_statement(TSqlSyb155Parser.Backup_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#backup_statement}.
	 * @param ctx the parse tree
	 */
	void exitBackup_statement(TSqlSyb155Parser.Backup_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#cfl_statement}.
	 * @param ctx the parse tree
	 */
	void enterCfl_statement(TSqlSyb155Parser.Cfl_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#cfl_statement}.
	 * @param ctx the parse tree
	 */
	void exitCfl_statement(TSqlSyb155Parser.Cfl_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#block_statement}.
	 * @param ctx the parse tree
	 */
	void enterBlock_statement(TSqlSyb155Parser.Block_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#block_statement}.
	 * @param ctx the parse tree
	 */
	void exitBlock_statement(TSqlSyb155Parser.Block_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#break_statement}.
	 * @param ctx the parse tree
	 */
	void enterBreak_statement(TSqlSyb155Parser.Break_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#break_statement}.
	 * @param ctx the parse tree
	 */
	void exitBreak_statement(TSqlSyb155Parser.Break_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#continue_statement}.
	 * @param ctx the parse tree
	 */
	void enterContinue_statement(TSqlSyb155Parser.Continue_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#continue_statement}.
	 * @param ctx the parse tree
	 */
	void exitContinue_statement(TSqlSyb155Parser.Continue_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#goto_statement}.
	 * @param ctx the parse tree
	 */
	void enterGoto_statement(TSqlSyb155Parser.Goto_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#goto_statement}.
	 * @param ctx the parse tree
	 */
	void exitGoto_statement(TSqlSyb155Parser.Goto_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#return_statement}.
	 * @param ctx the parse tree
	 */
	void enterReturn_statement(TSqlSyb155Parser.Return_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#return_statement}.
	 * @param ctx the parse tree
	 */
	void exitReturn_statement(TSqlSyb155Parser.Return_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(TSqlSyb155Parser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(TSqlSyb155Parser.If_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#throw_statement}.
	 * @param ctx the parse tree
	 */
	void enterThrow_statement(TSqlSyb155Parser.Throw_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#throw_statement}.
	 * @param ctx the parse tree
	 */
	void exitThrow_statement(TSqlSyb155Parser.Throw_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#throw_error_number}.
	 * @param ctx the parse tree
	 */
	void enterThrow_error_number(TSqlSyb155Parser.Throw_error_numberContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#throw_error_number}.
	 * @param ctx the parse tree
	 */
	void exitThrow_error_number(TSqlSyb155Parser.Throw_error_numberContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#throw_message}.
	 * @param ctx the parse tree
	 */
	void enterThrow_message(TSqlSyb155Parser.Throw_messageContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#throw_message}.
	 * @param ctx the parse tree
	 */
	void exitThrow_message(TSqlSyb155Parser.Throw_messageContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#throw_state}.
	 * @param ctx the parse tree
	 */
	void enterThrow_state(TSqlSyb155Parser.Throw_stateContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#throw_state}.
	 * @param ctx the parse tree
	 */
	void exitThrow_state(TSqlSyb155Parser.Throw_stateContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#try_catch_statement}.
	 * @param ctx the parse tree
	 */
	void enterTry_catch_statement(TSqlSyb155Parser.Try_catch_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#try_catch_statement}.
	 * @param ctx the parse tree
	 */
	void exitTry_catch_statement(TSqlSyb155Parser.Try_catch_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#waitfor_statement}.
	 * @param ctx the parse tree
	 */
	void enterWaitfor_statement(TSqlSyb155Parser.Waitfor_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#waitfor_statement}.
	 * @param ctx the parse tree
	 */
	void exitWaitfor_statement(TSqlSyb155Parser.Waitfor_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#while_statement}.
	 * @param ctx the parse tree
	 */
	void enterWhile_statement(TSqlSyb155Parser.While_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#while_statement}.
	 * @param ctx the parse tree
	 */
	void exitWhile_statement(TSqlSyb155Parser.While_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#print_statement}.
	 * @param ctx the parse tree
	 */
	void enterPrint_statement(TSqlSyb155Parser.Print_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#print_statement}.
	 * @param ctx the parse tree
	 */
	void exitPrint_statement(TSqlSyb155Parser.Print_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#raiseerror_statement}.
	 * @param ctx the parse tree
	 */
	void enterRaiseerror_statement(TSqlSyb155Parser.Raiseerror_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#raiseerror_statement}.
	 * @param ctx the parse tree
	 */
	void exitRaiseerror_statement(TSqlSyb155Parser.Raiseerror_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#empty_statement}.
	 * @param ctx the parse tree
	 */
	void enterEmpty_statement(TSqlSyb155Parser.Empty_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#empty_statement}.
	 * @param ctx the parse tree
	 */
	void exitEmpty_statement(TSqlSyb155Parser.Empty_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#another_statement}.
	 * @param ctx the parse tree
	 */
	void enterAnother_statement(TSqlSyb155Parser.Another_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#another_statement}.
	 * @param ctx the parse tree
	 */
	void exitAnother_statement(TSqlSyb155Parser.Another_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#alter_application_role}.
	 * @param ctx the parse tree
	 */
	void enterAlter_application_role(TSqlSyb155Parser.Alter_application_roleContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#alter_application_role}.
	 * @param ctx the parse tree
	 */
	void exitAlter_application_role(TSqlSyb155Parser.Alter_application_roleContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#create_application_role}.
	 * @param ctx the parse tree
	 */
	void enterCreate_application_role(TSqlSyb155Parser.Create_application_roleContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#create_application_role}.
	 * @param ctx the parse tree
	 */
	void exitCreate_application_role(TSqlSyb155Parser.Create_application_roleContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#drop_aggregate}.
	 * @param ctx the parse tree
	 */
	void enterDrop_aggregate(TSqlSyb155Parser.Drop_aggregateContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#drop_aggregate}.
	 * @param ctx the parse tree
	 */
	void exitDrop_aggregate(TSqlSyb155Parser.Drop_aggregateContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#drop_application_role}.
	 * @param ctx the parse tree
	 */
	void enterDrop_application_role(TSqlSyb155Parser.Drop_application_roleContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#drop_application_role}.
	 * @param ctx the parse tree
	 */
	void exitDrop_application_role(TSqlSyb155Parser.Drop_application_roleContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#alter_assembly}.
	 * @param ctx the parse tree
	 */
	void enterAlter_assembly(TSqlSyb155Parser.Alter_assemblyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#alter_assembly}.
	 * @param ctx the parse tree
	 */
	void exitAlter_assembly(TSqlSyb155Parser.Alter_assemblyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#alter_assembly_start}.
	 * @param ctx the parse tree
	 */
	void enterAlter_assembly_start(TSqlSyb155Parser.Alter_assembly_startContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#alter_assembly_start}.
	 * @param ctx the parse tree
	 */
	void exitAlter_assembly_start(TSqlSyb155Parser.Alter_assembly_startContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#alter_assembly_clause}.
	 * @param ctx the parse tree
	 */
	void enterAlter_assembly_clause(TSqlSyb155Parser.Alter_assembly_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#alter_assembly_clause}.
	 * @param ctx the parse tree
	 */
	void exitAlter_assembly_clause(TSqlSyb155Parser.Alter_assembly_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#alter_assembly_from_clause}.
	 * @param ctx the parse tree
	 */
	void enterAlter_assembly_from_clause(TSqlSyb155Parser.Alter_assembly_from_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#alter_assembly_from_clause}.
	 * @param ctx the parse tree
	 */
	void exitAlter_assembly_from_clause(TSqlSyb155Parser.Alter_assembly_from_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#alter_assembly_from_clause_start}.
	 * @param ctx the parse tree
	 */
	void enterAlter_assembly_from_clause_start(TSqlSyb155Parser.Alter_assembly_from_clause_startContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#alter_assembly_from_clause_start}.
	 * @param ctx the parse tree
	 */
	void exitAlter_assembly_from_clause_start(TSqlSyb155Parser.Alter_assembly_from_clause_startContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#alter_assembly_drop_clause}.
	 * @param ctx the parse tree
	 */
	void enterAlter_assembly_drop_clause(TSqlSyb155Parser.Alter_assembly_drop_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#alter_assembly_drop_clause}.
	 * @param ctx the parse tree
	 */
	void exitAlter_assembly_drop_clause(TSqlSyb155Parser.Alter_assembly_drop_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#alter_assembly_drop_multiple_files}.
	 * @param ctx the parse tree
	 */
	void enterAlter_assembly_drop_multiple_files(TSqlSyb155Parser.Alter_assembly_drop_multiple_filesContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#alter_assembly_drop_multiple_files}.
	 * @param ctx the parse tree
	 */
	void exitAlter_assembly_drop_multiple_files(TSqlSyb155Parser.Alter_assembly_drop_multiple_filesContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#alter_assembly_drop}.
	 * @param ctx the parse tree
	 */
	void enterAlter_assembly_drop(TSqlSyb155Parser.Alter_assembly_dropContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#alter_assembly_drop}.
	 * @param ctx the parse tree
	 */
	void exitAlter_assembly_drop(TSqlSyb155Parser.Alter_assembly_dropContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#alter_assembly_add_clause}.
	 * @param ctx the parse tree
	 */
	void enterAlter_assembly_add_clause(TSqlSyb155Parser.Alter_assembly_add_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#alter_assembly_add_clause}.
	 * @param ctx the parse tree
	 */
	void exitAlter_assembly_add_clause(TSqlSyb155Parser.Alter_assembly_add_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#alter_asssembly_add_clause_start}.
	 * @param ctx the parse tree
	 */
	void enterAlter_asssembly_add_clause_start(TSqlSyb155Parser.Alter_asssembly_add_clause_startContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#alter_asssembly_add_clause_start}.
	 * @param ctx the parse tree
	 */
	void exitAlter_asssembly_add_clause_start(TSqlSyb155Parser.Alter_asssembly_add_clause_startContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#alter_assembly_client_file_clause}.
	 * @param ctx the parse tree
	 */
	void enterAlter_assembly_client_file_clause(TSqlSyb155Parser.Alter_assembly_client_file_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#alter_assembly_client_file_clause}.
	 * @param ctx the parse tree
	 */
	void exitAlter_assembly_client_file_clause(TSqlSyb155Parser.Alter_assembly_client_file_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#alter_assembly_file_name}.
	 * @param ctx the parse tree
	 */
	void enterAlter_assembly_file_name(TSqlSyb155Parser.Alter_assembly_file_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#alter_assembly_file_name}.
	 * @param ctx the parse tree
	 */
	void exitAlter_assembly_file_name(TSqlSyb155Parser.Alter_assembly_file_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#alter_assembly_file_bits}.
	 * @param ctx the parse tree
	 */
	void enterAlter_assembly_file_bits(TSqlSyb155Parser.Alter_assembly_file_bitsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#alter_assembly_file_bits}.
	 * @param ctx the parse tree
	 */
	void exitAlter_assembly_file_bits(TSqlSyb155Parser.Alter_assembly_file_bitsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#alter_assembly_as}.
	 * @param ctx the parse tree
	 */
	void enterAlter_assembly_as(TSqlSyb155Parser.Alter_assembly_asContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#alter_assembly_as}.
	 * @param ctx the parse tree
	 */
	void exitAlter_assembly_as(TSqlSyb155Parser.Alter_assembly_asContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#alter_assembly_with_clause}.
	 * @param ctx the parse tree
	 */
	void enterAlter_assembly_with_clause(TSqlSyb155Parser.Alter_assembly_with_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#alter_assembly_with_clause}.
	 * @param ctx the parse tree
	 */
	void exitAlter_assembly_with_clause(TSqlSyb155Parser.Alter_assembly_with_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#alter_assembly_with}.
	 * @param ctx the parse tree
	 */
	void enterAlter_assembly_with(TSqlSyb155Parser.Alter_assembly_withContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#alter_assembly_with}.
	 * @param ctx the parse tree
	 */
	void exitAlter_assembly_with(TSqlSyb155Parser.Alter_assembly_withContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#client_assembly_specifier}.
	 * @param ctx the parse tree
	 */
	void enterClient_assembly_specifier(TSqlSyb155Parser.Client_assembly_specifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#client_assembly_specifier}.
	 * @param ctx the parse tree
	 */
	void exitClient_assembly_specifier(TSqlSyb155Parser.Client_assembly_specifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#assembly_option}.
	 * @param ctx the parse tree
	 */
	void enterAssembly_option(TSqlSyb155Parser.Assembly_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#assembly_option}.
	 * @param ctx the parse tree
	 */
	void exitAssembly_option(TSqlSyb155Parser.Assembly_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#network_file_share}.
	 * @param ctx the parse tree
	 */
	void enterNetwork_file_share(TSqlSyb155Parser.Network_file_shareContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#network_file_share}.
	 * @param ctx the parse tree
	 */
	void exitNetwork_file_share(TSqlSyb155Parser.Network_file_shareContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#network_computer}.
	 * @param ctx the parse tree
	 */
	void enterNetwork_computer(TSqlSyb155Parser.Network_computerContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#network_computer}.
	 * @param ctx the parse tree
	 */
	void exitNetwork_computer(TSqlSyb155Parser.Network_computerContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#network_file_start}.
	 * @param ctx the parse tree
	 */
	void enterNetwork_file_start(TSqlSyb155Parser.Network_file_startContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#network_file_start}.
	 * @param ctx the parse tree
	 */
	void exitNetwork_file_start(TSqlSyb155Parser.Network_file_startContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#file_path}.
	 * @param ctx the parse tree
	 */
	void enterFile_path(TSqlSyb155Parser.File_pathContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#file_path}.
	 * @param ctx the parse tree
	 */
	void exitFile_path(TSqlSyb155Parser.File_pathContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#file_directory_path_separator}.
	 * @param ctx the parse tree
	 */
	void enterFile_directory_path_separator(TSqlSyb155Parser.File_directory_path_separatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#file_directory_path_separator}.
	 * @param ctx the parse tree
	 */
	void exitFile_directory_path_separator(TSqlSyb155Parser.File_directory_path_separatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#local_file}.
	 * @param ctx the parse tree
	 */
	void enterLocal_file(TSqlSyb155Parser.Local_fileContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#local_file}.
	 * @param ctx the parse tree
	 */
	void exitLocal_file(TSqlSyb155Parser.Local_fileContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#local_drive}.
	 * @param ctx the parse tree
	 */
	void enterLocal_drive(TSqlSyb155Parser.Local_driveContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#local_drive}.
	 * @param ctx the parse tree
	 */
	void exitLocal_drive(TSqlSyb155Parser.Local_driveContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#multiple_local_files}.
	 * @param ctx the parse tree
	 */
	void enterMultiple_local_files(TSqlSyb155Parser.Multiple_local_filesContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#multiple_local_files}.
	 * @param ctx the parse tree
	 */
	void exitMultiple_local_files(TSqlSyb155Parser.Multiple_local_filesContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#multiple_local_file_start}.
	 * @param ctx the parse tree
	 */
	void enterMultiple_local_file_start(TSqlSyb155Parser.Multiple_local_file_startContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#multiple_local_file_start}.
	 * @param ctx the parse tree
	 */
	void exitMultiple_local_file_start(TSqlSyb155Parser.Multiple_local_file_startContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#create_assembly}.
	 * @param ctx the parse tree
	 */
	void enterCreate_assembly(TSqlSyb155Parser.Create_assemblyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#create_assembly}.
	 * @param ctx the parse tree
	 */
	void exitCreate_assembly(TSqlSyb155Parser.Create_assemblyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#drop_assembly}.
	 * @param ctx the parse tree
	 */
	void enterDrop_assembly(TSqlSyb155Parser.Drop_assemblyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#drop_assembly}.
	 * @param ctx the parse tree
	 */
	void exitDrop_assembly(TSqlSyb155Parser.Drop_assemblyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#alter_asymmetric_key}.
	 * @param ctx the parse tree
	 */
	void enterAlter_asymmetric_key(TSqlSyb155Parser.Alter_asymmetric_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#alter_asymmetric_key}.
	 * @param ctx the parse tree
	 */
	void exitAlter_asymmetric_key(TSqlSyb155Parser.Alter_asymmetric_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#alter_asymmetric_key_start}.
	 * @param ctx the parse tree
	 */
	void enterAlter_asymmetric_key_start(TSqlSyb155Parser.Alter_asymmetric_key_startContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#alter_asymmetric_key_start}.
	 * @param ctx the parse tree
	 */
	void exitAlter_asymmetric_key_start(TSqlSyb155Parser.Alter_asymmetric_key_startContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#asymmetric_key_option}.
	 * @param ctx the parse tree
	 */
	void enterAsymmetric_key_option(TSqlSyb155Parser.Asymmetric_key_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#asymmetric_key_option}.
	 * @param ctx the parse tree
	 */
	void exitAsymmetric_key_option(TSqlSyb155Parser.Asymmetric_key_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#asymmetric_key_option_start}.
	 * @param ctx the parse tree
	 */
	void enterAsymmetric_key_option_start(TSqlSyb155Parser.Asymmetric_key_option_startContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#asymmetric_key_option_start}.
	 * @param ctx the parse tree
	 */
	void exitAsymmetric_key_option_start(TSqlSyb155Parser.Asymmetric_key_option_startContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#asymmetric_key_password_change_option}.
	 * @param ctx the parse tree
	 */
	void enterAsymmetric_key_password_change_option(TSqlSyb155Parser.Asymmetric_key_password_change_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#asymmetric_key_password_change_option}.
	 * @param ctx the parse tree
	 */
	void exitAsymmetric_key_password_change_option(TSqlSyb155Parser.Asymmetric_key_password_change_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#create_asymmetric_key}.
	 * @param ctx the parse tree
	 */
	void enterCreate_asymmetric_key(TSqlSyb155Parser.Create_asymmetric_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#create_asymmetric_key}.
	 * @param ctx the parse tree
	 */
	void exitCreate_asymmetric_key(TSqlSyb155Parser.Create_asymmetric_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#drop_asymmetric_key}.
	 * @param ctx the parse tree
	 */
	void enterDrop_asymmetric_key(TSqlSyb155Parser.Drop_asymmetric_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#drop_asymmetric_key}.
	 * @param ctx the parse tree
	 */
	void exitDrop_asymmetric_key(TSqlSyb155Parser.Drop_asymmetric_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#alter_authorization}.
	 * @param ctx the parse tree
	 */
	void enterAlter_authorization(TSqlSyb155Parser.Alter_authorizationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#alter_authorization}.
	 * @param ctx the parse tree
	 */
	void exitAlter_authorization(TSqlSyb155Parser.Alter_authorizationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#authorization_grantee}.
	 * @param ctx the parse tree
	 */
	void enterAuthorization_grantee(TSqlSyb155Parser.Authorization_granteeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#authorization_grantee}.
	 * @param ctx the parse tree
	 */
	void exitAuthorization_grantee(TSqlSyb155Parser.Authorization_granteeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#entity_to}.
	 * @param ctx the parse tree
	 */
	void enterEntity_to(TSqlSyb155Parser.Entity_toContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#entity_to}.
	 * @param ctx the parse tree
	 */
	void exitEntity_to(TSqlSyb155Parser.Entity_toContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#colon_colon}.
	 * @param ctx the parse tree
	 */
	void enterColon_colon(TSqlSyb155Parser.Colon_colonContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#colon_colon}.
	 * @param ctx the parse tree
	 */
	void exitColon_colon(TSqlSyb155Parser.Colon_colonContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#alter_authorization_start}.
	 * @param ctx the parse tree
	 */
	void enterAlter_authorization_start(TSqlSyb155Parser.Alter_authorization_startContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#alter_authorization_start}.
	 * @param ctx the parse tree
	 */
	void exitAlter_authorization_start(TSqlSyb155Parser.Alter_authorization_startContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#alter_authorization_for_sql_database}.
	 * @param ctx the parse tree
	 */
	void enterAlter_authorization_for_sql_database(TSqlSyb155Parser.Alter_authorization_for_sql_databaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#alter_authorization_for_sql_database}.
	 * @param ctx the parse tree
	 */
	void exitAlter_authorization_for_sql_database(TSqlSyb155Parser.Alter_authorization_for_sql_databaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#alter_authorization_for_azure_dw}.
	 * @param ctx the parse tree
	 */
	void enterAlter_authorization_for_azure_dw(TSqlSyb155Parser.Alter_authorization_for_azure_dwContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#alter_authorization_for_azure_dw}.
	 * @param ctx the parse tree
	 */
	void exitAlter_authorization_for_azure_dw(TSqlSyb155Parser.Alter_authorization_for_azure_dwContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#alter_authorization_for_parallel_dw}.
	 * @param ctx the parse tree
	 */
	void enterAlter_authorization_for_parallel_dw(TSqlSyb155Parser.Alter_authorization_for_parallel_dwContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#alter_authorization_for_parallel_dw}.
	 * @param ctx the parse tree
	 */
	void exitAlter_authorization_for_parallel_dw(TSqlSyb155Parser.Alter_authorization_for_parallel_dwContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#class_type}.
	 * @param ctx the parse tree
	 */
	void enterClass_type(TSqlSyb155Parser.Class_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#class_type}.
	 * @param ctx the parse tree
	 */
	void exitClass_type(TSqlSyb155Parser.Class_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#class_type_for_sql_database}.
	 * @param ctx the parse tree
	 */
	void enterClass_type_for_sql_database(TSqlSyb155Parser.Class_type_for_sql_databaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#class_type_for_sql_database}.
	 * @param ctx the parse tree
	 */
	void exitClass_type_for_sql_database(TSqlSyb155Parser.Class_type_for_sql_databaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#class_type_for_azure_dw}.
	 * @param ctx the parse tree
	 */
	void enterClass_type_for_azure_dw(TSqlSyb155Parser.Class_type_for_azure_dwContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#class_type_for_azure_dw}.
	 * @param ctx the parse tree
	 */
	void exitClass_type_for_azure_dw(TSqlSyb155Parser.Class_type_for_azure_dwContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#class_type_for_parallel_dw}.
	 * @param ctx the parse tree
	 */
	void enterClass_type_for_parallel_dw(TSqlSyb155Parser.Class_type_for_parallel_dwContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#class_type_for_parallel_dw}.
	 * @param ctx the parse tree
	 */
	void exitClass_type_for_parallel_dw(TSqlSyb155Parser.Class_type_for_parallel_dwContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#drop_availability_group}.
	 * @param ctx the parse tree
	 */
	void enterDrop_availability_group(TSqlSyb155Parser.Drop_availability_groupContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#drop_availability_group}.
	 * @param ctx the parse tree
	 */
	void exitDrop_availability_group(TSqlSyb155Parser.Drop_availability_groupContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#alter_availability_group}.
	 * @param ctx the parse tree
	 */
	void enterAlter_availability_group(TSqlSyb155Parser.Alter_availability_groupContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#alter_availability_group}.
	 * @param ctx the parse tree
	 */
	void exitAlter_availability_group(TSqlSyb155Parser.Alter_availability_groupContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#alter_availability_group_start}.
	 * @param ctx the parse tree
	 */
	void enterAlter_availability_group_start(TSqlSyb155Parser.Alter_availability_group_startContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#alter_availability_group_start}.
	 * @param ctx the parse tree
	 */
	void exitAlter_availability_group_start(TSqlSyb155Parser.Alter_availability_group_startContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#alter_availability_group_options}.
	 * @param ctx the parse tree
	 */
	void enterAlter_availability_group_options(TSqlSyb155Parser.Alter_availability_group_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#alter_availability_group_options}.
	 * @param ctx the parse tree
	 */
	void exitAlter_availability_group_options(TSqlSyb155Parser.Alter_availability_group_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#create_or_alter_broker_priority}.
	 * @param ctx the parse tree
	 */
	void enterCreate_or_alter_broker_priority(TSqlSyb155Parser.Create_or_alter_broker_priorityContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#create_or_alter_broker_priority}.
	 * @param ctx the parse tree
	 */
	void exitCreate_or_alter_broker_priority(TSqlSyb155Parser.Create_or_alter_broker_priorityContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#drop_broker_priority}.
	 * @param ctx the parse tree
	 */
	void enterDrop_broker_priority(TSqlSyb155Parser.Drop_broker_priorityContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#drop_broker_priority}.
	 * @param ctx the parse tree
	 */
	void exitDrop_broker_priority(TSqlSyb155Parser.Drop_broker_priorityContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#alter_certificate}.
	 * @param ctx the parse tree
	 */
	void enterAlter_certificate(TSqlSyb155Parser.Alter_certificateContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#alter_certificate}.
	 * @param ctx the parse tree
	 */
	void exitAlter_certificate(TSqlSyb155Parser.Alter_certificateContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#alter_column_encryption_key}.
	 * @param ctx the parse tree
	 */
	void enterAlter_column_encryption_key(TSqlSyb155Parser.Alter_column_encryption_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#alter_column_encryption_key}.
	 * @param ctx the parse tree
	 */
	void exitAlter_column_encryption_key(TSqlSyb155Parser.Alter_column_encryption_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#create_column_encryption_key}.
	 * @param ctx the parse tree
	 */
	void enterCreate_column_encryption_key(TSqlSyb155Parser.Create_column_encryption_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#create_column_encryption_key}.
	 * @param ctx the parse tree
	 */
	void exitCreate_column_encryption_key(TSqlSyb155Parser.Create_column_encryption_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#drop_certificate}.
	 * @param ctx the parse tree
	 */
	void enterDrop_certificate(TSqlSyb155Parser.Drop_certificateContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#drop_certificate}.
	 * @param ctx the parse tree
	 */
	void exitDrop_certificate(TSqlSyb155Parser.Drop_certificateContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#drop_column_encryption_key}.
	 * @param ctx the parse tree
	 */
	void enterDrop_column_encryption_key(TSqlSyb155Parser.Drop_column_encryption_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#drop_column_encryption_key}.
	 * @param ctx the parse tree
	 */
	void exitDrop_column_encryption_key(TSqlSyb155Parser.Drop_column_encryption_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#drop_column_master_key}.
	 * @param ctx the parse tree
	 */
	void enterDrop_column_master_key(TSqlSyb155Parser.Drop_column_master_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#drop_column_master_key}.
	 * @param ctx the parse tree
	 */
	void exitDrop_column_master_key(TSqlSyb155Parser.Drop_column_master_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#drop_contract}.
	 * @param ctx the parse tree
	 */
	void enterDrop_contract(TSqlSyb155Parser.Drop_contractContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#drop_contract}.
	 * @param ctx the parse tree
	 */
	void exitDrop_contract(TSqlSyb155Parser.Drop_contractContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#drop_credential}.
	 * @param ctx the parse tree
	 */
	void enterDrop_credential(TSqlSyb155Parser.Drop_credentialContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#drop_credential}.
	 * @param ctx the parse tree
	 */
	void exitDrop_credential(TSqlSyb155Parser.Drop_credentialContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#drop_cryptograhic_provider}.
	 * @param ctx the parse tree
	 */
	void enterDrop_cryptograhic_provider(TSqlSyb155Parser.Drop_cryptograhic_providerContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#drop_cryptograhic_provider}.
	 * @param ctx the parse tree
	 */
	void exitDrop_cryptograhic_provider(TSqlSyb155Parser.Drop_cryptograhic_providerContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#drop_database}.
	 * @param ctx the parse tree
	 */
	void enterDrop_database(TSqlSyb155Parser.Drop_databaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#drop_database}.
	 * @param ctx the parse tree
	 */
	void exitDrop_database(TSqlSyb155Parser.Drop_databaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#drop_database_audit_specification}.
	 * @param ctx the parse tree
	 */
	void enterDrop_database_audit_specification(TSqlSyb155Parser.Drop_database_audit_specificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#drop_database_audit_specification}.
	 * @param ctx the parse tree
	 */
	void exitDrop_database_audit_specification(TSqlSyb155Parser.Drop_database_audit_specificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#drop_database_scoped_credential}.
	 * @param ctx the parse tree
	 */
	void enterDrop_database_scoped_credential(TSqlSyb155Parser.Drop_database_scoped_credentialContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#drop_database_scoped_credential}.
	 * @param ctx the parse tree
	 */
	void exitDrop_database_scoped_credential(TSqlSyb155Parser.Drop_database_scoped_credentialContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#drop_default}.
	 * @param ctx the parse tree
	 */
	void enterDrop_default(TSqlSyb155Parser.Drop_defaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#drop_default}.
	 * @param ctx the parse tree
	 */
	void exitDrop_default(TSqlSyb155Parser.Drop_defaultContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#drop_endpoint}.
	 * @param ctx the parse tree
	 */
	void enterDrop_endpoint(TSqlSyb155Parser.Drop_endpointContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#drop_endpoint}.
	 * @param ctx the parse tree
	 */
	void exitDrop_endpoint(TSqlSyb155Parser.Drop_endpointContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#drop_external_data_source}.
	 * @param ctx the parse tree
	 */
	void enterDrop_external_data_source(TSqlSyb155Parser.Drop_external_data_sourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#drop_external_data_source}.
	 * @param ctx the parse tree
	 */
	void exitDrop_external_data_source(TSqlSyb155Parser.Drop_external_data_sourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#drop_external_file_format}.
	 * @param ctx the parse tree
	 */
	void enterDrop_external_file_format(TSqlSyb155Parser.Drop_external_file_formatContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#drop_external_file_format}.
	 * @param ctx the parse tree
	 */
	void exitDrop_external_file_format(TSqlSyb155Parser.Drop_external_file_formatContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#drop_external_library}.
	 * @param ctx the parse tree
	 */
	void enterDrop_external_library(TSqlSyb155Parser.Drop_external_libraryContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#drop_external_library}.
	 * @param ctx the parse tree
	 */
	void exitDrop_external_library(TSqlSyb155Parser.Drop_external_libraryContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#drop_external_resource_pool}.
	 * @param ctx the parse tree
	 */
	void enterDrop_external_resource_pool(TSqlSyb155Parser.Drop_external_resource_poolContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#drop_external_resource_pool}.
	 * @param ctx the parse tree
	 */
	void exitDrop_external_resource_pool(TSqlSyb155Parser.Drop_external_resource_poolContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#drop_external_table}.
	 * @param ctx the parse tree
	 */
	void enterDrop_external_table(TSqlSyb155Parser.Drop_external_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#drop_external_table}.
	 * @param ctx the parse tree
	 */
	void exitDrop_external_table(TSqlSyb155Parser.Drop_external_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#drop_event_notifications}.
	 * @param ctx the parse tree
	 */
	void enterDrop_event_notifications(TSqlSyb155Parser.Drop_event_notificationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#drop_event_notifications}.
	 * @param ctx the parse tree
	 */
	void exitDrop_event_notifications(TSqlSyb155Parser.Drop_event_notificationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#drop_event_session}.
	 * @param ctx the parse tree
	 */
	void enterDrop_event_session(TSqlSyb155Parser.Drop_event_sessionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#drop_event_session}.
	 * @param ctx the parse tree
	 */
	void exitDrop_event_session(TSqlSyb155Parser.Drop_event_sessionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#drop_fulltext_catalog}.
	 * @param ctx the parse tree
	 */
	void enterDrop_fulltext_catalog(TSqlSyb155Parser.Drop_fulltext_catalogContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#drop_fulltext_catalog}.
	 * @param ctx the parse tree
	 */
	void exitDrop_fulltext_catalog(TSqlSyb155Parser.Drop_fulltext_catalogContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#drop_fulltext_index}.
	 * @param ctx the parse tree
	 */
	void enterDrop_fulltext_index(TSqlSyb155Parser.Drop_fulltext_indexContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#drop_fulltext_index}.
	 * @param ctx the parse tree
	 */
	void exitDrop_fulltext_index(TSqlSyb155Parser.Drop_fulltext_indexContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#drop_fulltext_stoplist}.
	 * @param ctx the parse tree
	 */
	void enterDrop_fulltext_stoplist(TSqlSyb155Parser.Drop_fulltext_stoplistContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#drop_fulltext_stoplist}.
	 * @param ctx the parse tree
	 */
	void exitDrop_fulltext_stoplist(TSqlSyb155Parser.Drop_fulltext_stoplistContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#drop_login}.
	 * @param ctx the parse tree
	 */
	void enterDrop_login(TSqlSyb155Parser.Drop_loginContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#drop_login}.
	 * @param ctx the parse tree
	 */
	void exitDrop_login(TSqlSyb155Parser.Drop_loginContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#drop_master_key}.
	 * @param ctx the parse tree
	 */
	void enterDrop_master_key(TSqlSyb155Parser.Drop_master_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#drop_master_key}.
	 * @param ctx the parse tree
	 */
	void exitDrop_master_key(TSqlSyb155Parser.Drop_master_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#drop_message_type}.
	 * @param ctx the parse tree
	 */
	void enterDrop_message_type(TSqlSyb155Parser.Drop_message_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#drop_message_type}.
	 * @param ctx the parse tree
	 */
	void exitDrop_message_type(TSqlSyb155Parser.Drop_message_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#drop_partition_function}.
	 * @param ctx the parse tree
	 */
	void enterDrop_partition_function(TSqlSyb155Parser.Drop_partition_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#drop_partition_function}.
	 * @param ctx the parse tree
	 */
	void exitDrop_partition_function(TSqlSyb155Parser.Drop_partition_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#drop_partition_scheme}.
	 * @param ctx the parse tree
	 */
	void enterDrop_partition_scheme(TSqlSyb155Parser.Drop_partition_schemeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#drop_partition_scheme}.
	 * @param ctx the parse tree
	 */
	void exitDrop_partition_scheme(TSqlSyb155Parser.Drop_partition_schemeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#drop_queue}.
	 * @param ctx the parse tree
	 */
	void enterDrop_queue(TSqlSyb155Parser.Drop_queueContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#drop_queue}.
	 * @param ctx the parse tree
	 */
	void exitDrop_queue(TSqlSyb155Parser.Drop_queueContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#drop_remote_service_binding}.
	 * @param ctx the parse tree
	 */
	void enterDrop_remote_service_binding(TSqlSyb155Parser.Drop_remote_service_bindingContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#drop_remote_service_binding}.
	 * @param ctx the parse tree
	 */
	void exitDrop_remote_service_binding(TSqlSyb155Parser.Drop_remote_service_bindingContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#drop_resource_pool}.
	 * @param ctx the parse tree
	 */
	void enterDrop_resource_pool(TSqlSyb155Parser.Drop_resource_poolContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#drop_resource_pool}.
	 * @param ctx the parse tree
	 */
	void exitDrop_resource_pool(TSqlSyb155Parser.Drop_resource_poolContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#drop_db_role}.
	 * @param ctx the parse tree
	 */
	void enterDrop_db_role(TSqlSyb155Parser.Drop_db_roleContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#drop_db_role}.
	 * @param ctx the parse tree
	 */
	void exitDrop_db_role(TSqlSyb155Parser.Drop_db_roleContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#drop_route}.
	 * @param ctx the parse tree
	 */
	void enterDrop_route(TSqlSyb155Parser.Drop_routeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#drop_route}.
	 * @param ctx the parse tree
	 */
	void exitDrop_route(TSqlSyb155Parser.Drop_routeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#drop_rule}.
	 * @param ctx the parse tree
	 */
	void enterDrop_rule(TSqlSyb155Parser.Drop_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#drop_rule}.
	 * @param ctx the parse tree
	 */
	void exitDrop_rule(TSqlSyb155Parser.Drop_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#drop_schema}.
	 * @param ctx the parse tree
	 */
	void enterDrop_schema(TSqlSyb155Parser.Drop_schemaContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#drop_schema}.
	 * @param ctx the parse tree
	 */
	void exitDrop_schema(TSqlSyb155Parser.Drop_schemaContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#drop_search_property_list}.
	 * @param ctx the parse tree
	 */
	void enterDrop_search_property_list(TSqlSyb155Parser.Drop_search_property_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#drop_search_property_list}.
	 * @param ctx the parse tree
	 */
	void exitDrop_search_property_list(TSqlSyb155Parser.Drop_search_property_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#drop_security_policy}.
	 * @param ctx the parse tree
	 */
	void enterDrop_security_policy(TSqlSyb155Parser.Drop_security_policyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#drop_security_policy}.
	 * @param ctx the parse tree
	 */
	void exitDrop_security_policy(TSqlSyb155Parser.Drop_security_policyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#drop_sequence}.
	 * @param ctx the parse tree
	 */
	void enterDrop_sequence(TSqlSyb155Parser.Drop_sequenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#drop_sequence}.
	 * @param ctx the parse tree
	 */
	void exitDrop_sequence(TSqlSyb155Parser.Drop_sequenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#drop_server_audit}.
	 * @param ctx the parse tree
	 */
	void enterDrop_server_audit(TSqlSyb155Parser.Drop_server_auditContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#drop_server_audit}.
	 * @param ctx the parse tree
	 */
	void exitDrop_server_audit(TSqlSyb155Parser.Drop_server_auditContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#drop_server_audit_specification}.
	 * @param ctx the parse tree
	 */
	void enterDrop_server_audit_specification(TSqlSyb155Parser.Drop_server_audit_specificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#drop_server_audit_specification}.
	 * @param ctx the parse tree
	 */
	void exitDrop_server_audit_specification(TSqlSyb155Parser.Drop_server_audit_specificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#drop_server_role}.
	 * @param ctx the parse tree
	 */
	void enterDrop_server_role(TSqlSyb155Parser.Drop_server_roleContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#drop_server_role}.
	 * @param ctx the parse tree
	 */
	void exitDrop_server_role(TSqlSyb155Parser.Drop_server_roleContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#drop_service}.
	 * @param ctx the parse tree
	 */
	void enterDrop_service(TSqlSyb155Parser.Drop_serviceContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#drop_service}.
	 * @param ctx the parse tree
	 */
	void exitDrop_service(TSqlSyb155Parser.Drop_serviceContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#drop_signature}.
	 * @param ctx the parse tree
	 */
	void enterDrop_signature(TSqlSyb155Parser.Drop_signatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#drop_signature}.
	 * @param ctx the parse tree
	 */
	void exitDrop_signature(TSqlSyb155Parser.Drop_signatureContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#drop_statistics_name_azure_dw_and_pdw}.
	 * @param ctx the parse tree
	 */
	void enterDrop_statistics_name_azure_dw_and_pdw(TSqlSyb155Parser.Drop_statistics_name_azure_dw_and_pdwContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#drop_statistics_name_azure_dw_and_pdw}.
	 * @param ctx the parse tree
	 */
	void exitDrop_statistics_name_azure_dw_and_pdw(TSqlSyb155Parser.Drop_statistics_name_azure_dw_and_pdwContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#drop_symmetric_key}.
	 * @param ctx the parse tree
	 */
	void enterDrop_symmetric_key(TSqlSyb155Parser.Drop_symmetric_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#drop_symmetric_key}.
	 * @param ctx the parse tree
	 */
	void exitDrop_symmetric_key(TSqlSyb155Parser.Drop_symmetric_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#drop_synonym}.
	 * @param ctx the parse tree
	 */
	void enterDrop_synonym(TSqlSyb155Parser.Drop_synonymContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#drop_synonym}.
	 * @param ctx the parse tree
	 */
	void exitDrop_synonym(TSqlSyb155Parser.Drop_synonymContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#drop_user}.
	 * @param ctx the parse tree
	 */
	void enterDrop_user(TSqlSyb155Parser.Drop_userContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#drop_user}.
	 * @param ctx the parse tree
	 */
	void exitDrop_user(TSqlSyb155Parser.Drop_userContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#drop_workload_group}.
	 * @param ctx the parse tree
	 */
	void enterDrop_workload_group(TSqlSyb155Parser.Drop_workload_groupContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#drop_workload_group}.
	 * @param ctx the parse tree
	 */
	void exitDrop_workload_group(TSqlSyb155Parser.Drop_workload_groupContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#drop_xml_schema_collection}.
	 * @param ctx the parse tree
	 */
	void enterDrop_xml_schema_collection(TSqlSyb155Parser.Drop_xml_schema_collectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#drop_xml_schema_collection}.
	 * @param ctx the parse tree
	 */
	void exitDrop_xml_schema_collection(TSqlSyb155Parser.Drop_xml_schema_collectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#disable_trigger}.
	 * @param ctx the parse tree
	 */
	void enterDisable_trigger(TSqlSyb155Parser.Disable_triggerContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#disable_trigger}.
	 * @param ctx the parse tree
	 */
	void exitDisable_trigger(TSqlSyb155Parser.Disable_triggerContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#enable_trigger}.
	 * @param ctx the parse tree
	 */
	void enterEnable_trigger(TSqlSyb155Parser.Enable_triggerContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#enable_trigger}.
	 * @param ctx the parse tree
	 */
	void exitEnable_trigger(TSqlSyb155Parser.Enable_triggerContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#truncate_table}.
	 * @param ctx the parse tree
	 */
	void enterTruncate_table(TSqlSyb155Parser.Truncate_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#truncate_table}.
	 * @param ctx the parse tree
	 */
	void exitTruncate_table(TSqlSyb155Parser.Truncate_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#create_column_master_key}.
	 * @param ctx the parse tree
	 */
	void enterCreate_column_master_key(TSqlSyb155Parser.Create_column_master_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#create_column_master_key}.
	 * @param ctx the parse tree
	 */
	void exitCreate_column_master_key(TSqlSyb155Parser.Create_column_master_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#alter_credential}.
	 * @param ctx the parse tree
	 */
	void enterAlter_credential(TSqlSyb155Parser.Alter_credentialContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#alter_credential}.
	 * @param ctx the parse tree
	 */
	void exitAlter_credential(TSqlSyb155Parser.Alter_credentialContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#create_credential}.
	 * @param ctx the parse tree
	 */
	void enterCreate_credential(TSqlSyb155Parser.Create_credentialContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#create_credential}.
	 * @param ctx the parse tree
	 */
	void exitCreate_credential(TSqlSyb155Parser.Create_credentialContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#alter_cryptographic_provider}.
	 * @param ctx the parse tree
	 */
	void enterAlter_cryptographic_provider(TSqlSyb155Parser.Alter_cryptographic_providerContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#alter_cryptographic_provider}.
	 * @param ctx the parse tree
	 */
	void exitAlter_cryptographic_provider(TSqlSyb155Parser.Alter_cryptographic_providerContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#create_cryptographic_provider}.
	 * @param ctx the parse tree
	 */
	void enterCreate_cryptographic_provider(TSqlSyb155Parser.Create_cryptographic_providerContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#create_cryptographic_provider}.
	 * @param ctx the parse tree
	 */
	void exitCreate_cryptographic_provider(TSqlSyb155Parser.Create_cryptographic_providerContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#create_event_notification}.
	 * @param ctx the parse tree
	 */
	void enterCreate_event_notification(TSqlSyb155Parser.Create_event_notificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#create_event_notification}.
	 * @param ctx the parse tree
	 */
	void exitCreate_event_notification(TSqlSyb155Parser.Create_event_notificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#create_or_alter_event_session}.
	 * @param ctx the parse tree
	 */
	void enterCreate_or_alter_event_session(TSqlSyb155Parser.Create_or_alter_event_sessionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#create_or_alter_event_session}.
	 * @param ctx the parse tree
	 */
	void exitCreate_or_alter_event_session(TSqlSyb155Parser.Create_or_alter_event_sessionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#event_session_predicate_expression}.
	 * @param ctx the parse tree
	 */
	void enterEvent_session_predicate_expression(TSqlSyb155Parser.Event_session_predicate_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#event_session_predicate_expression}.
	 * @param ctx the parse tree
	 */
	void exitEvent_session_predicate_expression(TSqlSyb155Parser.Event_session_predicate_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#event_session_predicate_factor}.
	 * @param ctx the parse tree
	 */
	void enterEvent_session_predicate_factor(TSqlSyb155Parser.Event_session_predicate_factorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#event_session_predicate_factor}.
	 * @param ctx the parse tree
	 */
	void exitEvent_session_predicate_factor(TSqlSyb155Parser.Event_session_predicate_factorContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#event_session_predicate_leaf}.
	 * @param ctx the parse tree
	 */
	void enterEvent_session_predicate_leaf(TSqlSyb155Parser.Event_session_predicate_leafContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#event_session_predicate_leaf}.
	 * @param ctx the parse tree
	 */
	void exitEvent_session_predicate_leaf(TSqlSyb155Parser.Event_session_predicate_leafContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#alter_external_data_source}.
	 * @param ctx the parse tree
	 */
	void enterAlter_external_data_source(TSqlSyb155Parser.Alter_external_data_sourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#alter_external_data_source}.
	 * @param ctx the parse tree
	 */
	void exitAlter_external_data_source(TSqlSyb155Parser.Alter_external_data_sourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#alter_external_library}.
	 * @param ctx the parse tree
	 */
	void enterAlter_external_library(TSqlSyb155Parser.Alter_external_libraryContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#alter_external_library}.
	 * @param ctx the parse tree
	 */
	void exitAlter_external_library(TSqlSyb155Parser.Alter_external_libraryContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#create_external_library}.
	 * @param ctx the parse tree
	 */
	void enterCreate_external_library(TSqlSyb155Parser.Create_external_libraryContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#create_external_library}.
	 * @param ctx the parse tree
	 */
	void exitCreate_external_library(TSqlSyb155Parser.Create_external_libraryContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#alter_external_resource_pool}.
	 * @param ctx the parse tree
	 */
	void enterAlter_external_resource_pool(TSqlSyb155Parser.Alter_external_resource_poolContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#alter_external_resource_pool}.
	 * @param ctx the parse tree
	 */
	void exitAlter_external_resource_pool(TSqlSyb155Parser.Alter_external_resource_poolContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#create_external_resource_pool}.
	 * @param ctx the parse tree
	 */
	void enterCreate_external_resource_pool(TSqlSyb155Parser.Create_external_resource_poolContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#create_external_resource_pool}.
	 * @param ctx the parse tree
	 */
	void exitCreate_external_resource_pool(TSqlSyb155Parser.Create_external_resource_poolContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#alter_fulltext_catalog}.
	 * @param ctx the parse tree
	 */
	void enterAlter_fulltext_catalog(TSqlSyb155Parser.Alter_fulltext_catalogContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#alter_fulltext_catalog}.
	 * @param ctx the parse tree
	 */
	void exitAlter_fulltext_catalog(TSqlSyb155Parser.Alter_fulltext_catalogContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#create_fulltext_catalog}.
	 * @param ctx the parse tree
	 */
	void enterCreate_fulltext_catalog(TSqlSyb155Parser.Create_fulltext_catalogContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#create_fulltext_catalog}.
	 * @param ctx the parse tree
	 */
	void exitCreate_fulltext_catalog(TSqlSyb155Parser.Create_fulltext_catalogContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#alter_fulltext_stoplist}.
	 * @param ctx the parse tree
	 */
	void enterAlter_fulltext_stoplist(TSqlSyb155Parser.Alter_fulltext_stoplistContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#alter_fulltext_stoplist}.
	 * @param ctx the parse tree
	 */
	void exitAlter_fulltext_stoplist(TSqlSyb155Parser.Alter_fulltext_stoplistContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#create_fulltext_stoplist}.
	 * @param ctx the parse tree
	 */
	void enterCreate_fulltext_stoplist(TSqlSyb155Parser.Create_fulltext_stoplistContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#create_fulltext_stoplist}.
	 * @param ctx the parse tree
	 */
	void exitCreate_fulltext_stoplist(TSqlSyb155Parser.Create_fulltext_stoplistContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#alter_login_sql_server}.
	 * @param ctx the parse tree
	 */
	void enterAlter_login_sql_server(TSqlSyb155Parser.Alter_login_sql_serverContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#alter_login_sql_server}.
	 * @param ctx the parse tree
	 */
	void exitAlter_login_sql_server(TSqlSyb155Parser.Alter_login_sql_serverContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#create_login_sql_server}.
	 * @param ctx the parse tree
	 */
	void enterCreate_login_sql_server(TSqlSyb155Parser.Create_login_sql_serverContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#create_login_sql_server}.
	 * @param ctx the parse tree
	 */
	void exitCreate_login_sql_server(TSqlSyb155Parser.Create_login_sql_serverContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#alter_login_azure_sql}.
	 * @param ctx the parse tree
	 */
	void enterAlter_login_azure_sql(TSqlSyb155Parser.Alter_login_azure_sqlContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#alter_login_azure_sql}.
	 * @param ctx the parse tree
	 */
	void exitAlter_login_azure_sql(TSqlSyb155Parser.Alter_login_azure_sqlContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#create_login_azure_sql}.
	 * @param ctx the parse tree
	 */
	void enterCreate_login_azure_sql(TSqlSyb155Parser.Create_login_azure_sqlContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#create_login_azure_sql}.
	 * @param ctx the parse tree
	 */
	void exitCreate_login_azure_sql(TSqlSyb155Parser.Create_login_azure_sqlContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#alter_login_azure_sql_dw_and_pdw}.
	 * @param ctx the parse tree
	 */
	void enterAlter_login_azure_sql_dw_and_pdw(TSqlSyb155Parser.Alter_login_azure_sql_dw_and_pdwContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#alter_login_azure_sql_dw_and_pdw}.
	 * @param ctx the parse tree
	 */
	void exitAlter_login_azure_sql_dw_and_pdw(TSqlSyb155Parser.Alter_login_azure_sql_dw_and_pdwContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#create_login_pdw}.
	 * @param ctx the parse tree
	 */
	void enterCreate_login_pdw(TSqlSyb155Parser.Create_login_pdwContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#create_login_pdw}.
	 * @param ctx the parse tree
	 */
	void exitCreate_login_pdw(TSqlSyb155Parser.Create_login_pdwContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#alter_master_key_sql_server}.
	 * @param ctx the parse tree
	 */
	void enterAlter_master_key_sql_server(TSqlSyb155Parser.Alter_master_key_sql_serverContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#alter_master_key_sql_server}.
	 * @param ctx the parse tree
	 */
	void exitAlter_master_key_sql_server(TSqlSyb155Parser.Alter_master_key_sql_serverContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#create_master_key_sql_server}.
	 * @param ctx the parse tree
	 */
	void enterCreate_master_key_sql_server(TSqlSyb155Parser.Create_master_key_sql_serverContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#create_master_key_sql_server}.
	 * @param ctx the parse tree
	 */
	void exitCreate_master_key_sql_server(TSqlSyb155Parser.Create_master_key_sql_serverContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#alter_master_key_azure_sql}.
	 * @param ctx the parse tree
	 */
	void enterAlter_master_key_azure_sql(TSqlSyb155Parser.Alter_master_key_azure_sqlContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#alter_master_key_azure_sql}.
	 * @param ctx the parse tree
	 */
	void exitAlter_master_key_azure_sql(TSqlSyb155Parser.Alter_master_key_azure_sqlContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#create_master_key_azure_sql}.
	 * @param ctx the parse tree
	 */
	void enterCreate_master_key_azure_sql(TSqlSyb155Parser.Create_master_key_azure_sqlContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#create_master_key_azure_sql}.
	 * @param ctx the parse tree
	 */
	void exitCreate_master_key_azure_sql(TSqlSyb155Parser.Create_master_key_azure_sqlContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#alter_message_type}.
	 * @param ctx the parse tree
	 */
	void enterAlter_message_type(TSqlSyb155Parser.Alter_message_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#alter_message_type}.
	 * @param ctx the parse tree
	 */
	void exitAlter_message_type(TSqlSyb155Parser.Alter_message_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#alter_partition_function}.
	 * @param ctx the parse tree
	 */
	void enterAlter_partition_function(TSqlSyb155Parser.Alter_partition_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#alter_partition_function}.
	 * @param ctx the parse tree
	 */
	void exitAlter_partition_function(TSqlSyb155Parser.Alter_partition_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#alter_partition_scheme}.
	 * @param ctx the parse tree
	 */
	void enterAlter_partition_scheme(TSqlSyb155Parser.Alter_partition_schemeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#alter_partition_scheme}.
	 * @param ctx the parse tree
	 */
	void exitAlter_partition_scheme(TSqlSyb155Parser.Alter_partition_schemeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#alter_remote_service_binding}.
	 * @param ctx the parse tree
	 */
	void enterAlter_remote_service_binding(TSqlSyb155Parser.Alter_remote_service_bindingContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#alter_remote_service_binding}.
	 * @param ctx the parse tree
	 */
	void exitAlter_remote_service_binding(TSqlSyb155Parser.Alter_remote_service_bindingContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#create_remote_service_binding}.
	 * @param ctx the parse tree
	 */
	void enterCreate_remote_service_binding(TSqlSyb155Parser.Create_remote_service_bindingContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#create_remote_service_binding}.
	 * @param ctx the parse tree
	 */
	void exitCreate_remote_service_binding(TSqlSyb155Parser.Create_remote_service_bindingContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#create_resource_pool}.
	 * @param ctx the parse tree
	 */
	void enterCreate_resource_pool(TSqlSyb155Parser.Create_resource_poolContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#create_resource_pool}.
	 * @param ctx the parse tree
	 */
	void exitCreate_resource_pool(TSqlSyb155Parser.Create_resource_poolContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#alter_resource_governor}.
	 * @param ctx the parse tree
	 */
	void enterAlter_resource_governor(TSqlSyb155Parser.Alter_resource_governorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#alter_resource_governor}.
	 * @param ctx the parse tree
	 */
	void exitAlter_resource_governor(TSqlSyb155Parser.Alter_resource_governorContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#alter_db_role}.
	 * @param ctx the parse tree
	 */
	void enterAlter_db_role(TSqlSyb155Parser.Alter_db_roleContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#alter_db_role}.
	 * @param ctx the parse tree
	 */
	void exitAlter_db_role(TSqlSyb155Parser.Alter_db_roleContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#create_db_role}.
	 * @param ctx the parse tree
	 */
	void enterCreate_db_role(TSqlSyb155Parser.Create_db_roleContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#create_db_role}.
	 * @param ctx the parse tree
	 */
	void exitCreate_db_role(TSqlSyb155Parser.Create_db_roleContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#create_route}.
	 * @param ctx the parse tree
	 */
	void enterCreate_route(TSqlSyb155Parser.Create_routeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#create_route}.
	 * @param ctx the parse tree
	 */
	void exitCreate_route(TSqlSyb155Parser.Create_routeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#create_rule}.
	 * @param ctx the parse tree
	 */
	void enterCreate_rule(TSqlSyb155Parser.Create_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#create_rule}.
	 * @param ctx the parse tree
	 */
	void exitCreate_rule(TSqlSyb155Parser.Create_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#alter_schema_sql}.
	 * @param ctx the parse tree
	 */
	void enterAlter_schema_sql(TSqlSyb155Parser.Alter_schema_sqlContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#alter_schema_sql}.
	 * @param ctx the parse tree
	 */
	void exitAlter_schema_sql(TSqlSyb155Parser.Alter_schema_sqlContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#create_schema}.
	 * @param ctx the parse tree
	 */
	void enterCreate_schema(TSqlSyb155Parser.Create_schemaContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#create_schema}.
	 * @param ctx the parse tree
	 */
	void exitCreate_schema(TSqlSyb155Parser.Create_schemaContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#create_schema_azure_sql_dw_and_pdw}.
	 * @param ctx the parse tree
	 */
	void enterCreate_schema_azure_sql_dw_and_pdw(TSqlSyb155Parser.Create_schema_azure_sql_dw_and_pdwContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#create_schema_azure_sql_dw_and_pdw}.
	 * @param ctx the parse tree
	 */
	void exitCreate_schema_azure_sql_dw_and_pdw(TSqlSyb155Parser.Create_schema_azure_sql_dw_and_pdwContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#alter_schema_azure_sql_dw_and_pdw}.
	 * @param ctx the parse tree
	 */
	void enterAlter_schema_azure_sql_dw_and_pdw(TSqlSyb155Parser.Alter_schema_azure_sql_dw_and_pdwContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#alter_schema_azure_sql_dw_and_pdw}.
	 * @param ctx the parse tree
	 */
	void exitAlter_schema_azure_sql_dw_and_pdw(TSqlSyb155Parser.Alter_schema_azure_sql_dw_and_pdwContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#create_search_property_list}.
	 * @param ctx the parse tree
	 */
	void enterCreate_search_property_list(TSqlSyb155Parser.Create_search_property_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#create_search_property_list}.
	 * @param ctx the parse tree
	 */
	void exitCreate_search_property_list(TSqlSyb155Parser.Create_search_property_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#create_security_policy}.
	 * @param ctx the parse tree
	 */
	void enterCreate_security_policy(TSqlSyb155Parser.Create_security_policyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#create_security_policy}.
	 * @param ctx the parse tree
	 */
	void exitCreate_security_policy(TSqlSyb155Parser.Create_security_policyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#alter_sequence}.
	 * @param ctx the parse tree
	 */
	void enterAlter_sequence(TSqlSyb155Parser.Alter_sequenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#alter_sequence}.
	 * @param ctx the parse tree
	 */
	void exitAlter_sequence(TSqlSyb155Parser.Alter_sequenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#create_sequence}.
	 * @param ctx the parse tree
	 */
	void enterCreate_sequence(TSqlSyb155Parser.Create_sequenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#create_sequence}.
	 * @param ctx the parse tree
	 */
	void exitCreate_sequence(TSqlSyb155Parser.Create_sequenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#alter_server_audit}.
	 * @param ctx the parse tree
	 */
	void enterAlter_server_audit(TSqlSyb155Parser.Alter_server_auditContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#alter_server_audit}.
	 * @param ctx the parse tree
	 */
	void exitAlter_server_audit(TSqlSyb155Parser.Alter_server_auditContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#create_server_audit}.
	 * @param ctx the parse tree
	 */
	void enterCreate_server_audit(TSqlSyb155Parser.Create_server_auditContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#create_server_audit}.
	 * @param ctx the parse tree
	 */
	void exitCreate_server_audit(TSqlSyb155Parser.Create_server_auditContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#alter_server_audit_specification}.
	 * @param ctx the parse tree
	 */
	void enterAlter_server_audit_specification(TSqlSyb155Parser.Alter_server_audit_specificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#alter_server_audit_specification}.
	 * @param ctx the parse tree
	 */
	void exitAlter_server_audit_specification(TSqlSyb155Parser.Alter_server_audit_specificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#create_server_audit_specification}.
	 * @param ctx the parse tree
	 */
	void enterCreate_server_audit_specification(TSqlSyb155Parser.Create_server_audit_specificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#create_server_audit_specification}.
	 * @param ctx the parse tree
	 */
	void exitCreate_server_audit_specification(TSqlSyb155Parser.Create_server_audit_specificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#alter_server_configuration}.
	 * @param ctx the parse tree
	 */
	void enterAlter_server_configuration(TSqlSyb155Parser.Alter_server_configurationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#alter_server_configuration}.
	 * @param ctx the parse tree
	 */
	void exitAlter_server_configuration(TSqlSyb155Parser.Alter_server_configurationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#alter_server_role}.
	 * @param ctx the parse tree
	 */
	void enterAlter_server_role(TSqlSyb155Parser.Alter_server_roleContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#alter_server_role}.
	 * @param ctx the parse tree
	 */
	void exitAlter_server_role(TSqlSyb155Parser.Alter_server_roleContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#create_server_role}.
	 * @param ctx the parse tree
	 */
	void enterCreate_server_role(TSqlSyb155Parser.Create_server_roleContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#create_server_role}.
	 * @param ctx the parse tree
	 */
	void exitCreate_server_role(TSqlSyb155Parser.Create_server_roleContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#alter_server_role_pdw}.
	 * @param ctx the parse tree
	 */
	void enterAlter_server_role_pdw(TSqlSyb155Parser.Alter_server_role_pdwContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#alter_server_role_pdw}.
	 * @param ctx the parse tree
	 */
	void exitAlter_server_role_pdw(TSqlSyb155Parser.Alter_server_role_pdwContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#alter_service}.
	 * @param ctx the parse tree
	 */
	void enterAlter_service(TSqlSyb155Parser.Alter_serviceContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#alter_service}.
	 * @param ctx the parse tree
	 */
	void exitAlter_service(TSqlSyb155Parser.Alter_serviceContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#create_service}.
	 * @param ctx the parse tree
	 */
	void enterCreate_service(TSqlSyb155Parser.Create_serviceContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#create_service}.
	 * @param ctx the parse tree
	 */
	void exitCreate_service(TSqlSyb155Parser.Create_serviceContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#alter_service_master_key}.
	 * @param ctx the parse tree
	 */
	void enterAlter_service_master_key(TSqlSyb155Parser.Alter_service_master_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#alter_service_master_key}.
	 * @param ctx the parse tree
	 */
	void exitAlter_service_master_key(TSqlSyb155Parser.Alter_service_master_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#alter_symmetric_key}.
	 * @param ctx the parse tree
	 */
	void enterAlter_symmetric_key(TSqlSyb155Parser.Alter_symmetric_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#alter_symmetric_key}.
	 * @param ctx the parse tree
	 */
	void exitAlter_symmetric_key(TSqlSyb155Parser.Alter_symmetric_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#create_symmetric_key}.
	 * @param ctx the parse tree
	 */
	void enterCreate_symmetric_key(TSqlSyb155Parser.Create_symmetric_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#create_symmetric_key}.
	 * @param ctx the parse tree
	 */
	void exitCreate_symmetric_key(TSqlSyb155Parser.Create_symmetric_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#create_synonym}.
	 * @param ctx the parse tree
	 */
	void enterCreate_synonym(TSqlSyb155Parser.Create_synonymContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#create_synonym}.
	 * @param ctx the parse tree
	 */
	void exitCreate_synonym(TSqlSyb155Parser.Create_synonymContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#alter_user}.
	 * @param ctx the parse tree
	 */
	void enterAlter_user(TSqlSyb155Parser.Alter_userContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#alter_user}.
	 * @param ctx the parse tree
	 */
	void exitAlter_user(TSqlSyb155Parser.Alter_userContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#create_user}.
	 * @param ctx the parse tree
	 */
	void enterCreate_user(TSqlSyb155Parser.Create_userContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#create_user}.
	 * @param ctx the parse tree
	 */
	void exitCreate_user(TSqlSyb155Parser.Create_userContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#create_user_azure_sql_dw}.
	 * @param ctx the parse tree
	 */
	void enterCreate_user_azure_sql_dw(TSqlSyb155Parser.Create_user_azure_sql_dwContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#create_user_azure_sql_dw}.
	 * @param ctx the parse tree
	 */
	void exitCreate_user_azure_sql_dw(TSqlSyb155Parser.Create_user_azure_sql_dwContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#alter_user_azure_sql}.
	 * @param ctx the parse tree
	 */
	void enterAlter_user_azure_sql(TSqlSyb155Parser.Alter_user_azure_sqlContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#alter_user_azure_sql}.
	 * @param ctx the parse tree
	 */
	void exitAlter_user_azure_sql(TSqlSyb155Parser.Alter_user_azure_sqlContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#alter_workload_group}.
	 * @param ctx the parse tree
	 */
	void enterAlter_workload_group(TSqlSyb155Parser.Alter_workload_groupContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#alter_workload_group}.
	 * @param ctx the parse tree
	 */
	void exitAlter_workload_group(TSqlSyb155Parser.Alter_workload_groupContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#create_workload_group}.
	 * @param ctx the parse tree
	 */
	void enterCreate_workload_group(TSqlSyb155Parser.Create_workload_groupContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#create_workload_group}.
	 * @param ctx the parse tree
	 */
	void exitCreate_workload_group(TSqlSyb155Parser.Create_workload_groupContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#create_xml_schema_collection}.
	 * @param ctx the parse tree
	 */
	void enterCreate_xml_schema_collection(TSqlSyb155Parser.Create_xml_schema_collectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#create_xml_schema_collection}.
	 * @param ctx the parse tree
	 */
	void exitCreate_xml_schema_collection(TSqlSyb155Parser.Create_xml_schema_collectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#create_queue}.
	 * @param ctx the parse tree
	 */
	void enterCreate_queue(TSqlSyb155Parser.Create_queueContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#create_queue}.
	 * @param ctx the parse tree
	 */
	void exitCreate_queue(TSqlSyb155Parser.Create_queueContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#queue_settings}.
	 * @param ctx the parse tree
	 */
	void enterQueue_settings(TSqlSyb155Parser.Queue_settingsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#queue_settings}.
	 * @param ctx the parse tree
	 */
	void exitQueue_settings(TSqlSyb155Parser.Queue_settingsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#alter_queue}.
	 * @param ctx the parse tree
	 */
	void enterAlter_queue(TSqlSyb155Parser.Alter_queueContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#alter_queue}.
	 * @param ctx the parse tree
	 */
	void exitAlter_queue(TSqlSyb155Parser.Alter_queueContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#queue_action}.
	 * @param ctx the parse tree
	 */
	void enterQueue_action(TSqlSyb155Parser.Queue_actionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#queue_action}.
	 * @param ctx the parse tree
	 */
	void exitQueue_action(TSqlSyb155Parser.Queue_actionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#queue_rebuild_options}.
	 * @param ctx the parse tree
	 */
	void enterQueue_rebuild_options(TSqlSyb155Parser.Queue_rebuild_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#queue_rebuild_options}.
	 * @param ctx the parse tree
	 */
	void exitQueue_rebuild_options(TSqlSyb155Parser.Queue_rebuild_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#create_contract}.
	 * @param ctx the parse tree
	 */
	void enterCreate_contract(TSqlSyb155Parser.Create_contractContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#create_contract}.
	 * @param ctx the parse tree
	 */
	void exitCreate_contract(TSqlSyb155Parser.Create_contractContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#conversation_statement}.
	 * @param ctx the parse tree
	 */
	void enterConversation_statement(TSqlSyb155Parser.Conversation_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#conversation_statement}.
	 * @param ctx the parse tree
	 */
	void exitConversation_statement(TSqlSyb155Parser.Conversation_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#message_statement}.
	 * @param ctx the parse tree
	 */
	void enterMessage_statement(TSqlSyb155Parser.Message_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#message_statement}.
	 * @param ctx the parse tree
	 */
	void exitMessage_statement(TSqlSyb155Parser.Message_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#merge_statement}.
	 * @param ctx the parse tree
	 */
	void enterMerge_statement(TSqlSyb155Parser.Merge_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#merge_statement}.
	 * @param ctx the parse tree
	 */
	void exitMerge_statement(TSqlSyb155Parser.Merge_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#merge_matched}.
	 * @param ctx the parse tree
	 */
	void enterMerge_matched(TSqlSyb155Parser.Merge_matchedContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#merge_matched}.
	 * @param ctx the parse tree
	 */
	void exitMerge_matched(TSqlSyb155Parser.Merge_matchedContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#merge_not_matched}.
	 * @param ctx the parse tree
	 */
	void enterMerge_not_matched(TSqlSyb155Parser.Merge_not_matchedContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#merge_not_matched}.
	 * @param ctx the parse tree
	 */
	void exitMerge_not_matched(TSqlSyb155Parser.Merge_not_matchedContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#delete_statement}.
	 * @param ctx the parse tree
	 */
	void enterDelete_statement(TSqlSyb155Parser.Delete_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#delete_statement}.
	 * @param ctx the parse tree
	 */
	void exitDelete_statement(TSqlSyb155Parser.Delete_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#delete_statement_from}.
	 * @param ctx the parse tree
	 */
	void enterDelete_statement_from(TSqlSyb155Parser.Delete_statement_fromContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#delete_statement_from}.
	 * @param ctx the parse tree
	 */
	void exitDelete_statement_from(TSqlSyb155Parser.Delete_statement_fromContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#insert_statement}.
	 * @param ctx the parse tree
	 */
	void enterInsert_statement(TSqlSyb155Parser.Insert_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#insert_statement}.
	 * @param ctx the parse tree
	 */
	void exitInsert_statement(TSqlSyb155Parser.Insert_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#insert_statement_value}.
	 * @param ctx the parse tree
	 */
	void enterInsert_statement_value(TSqlSyb155Parser.Insert_statement_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#insert_statement_value}.
	 * @param ctx the parse tree
	 */
	void exitInsert_statement_value(TSqlSyb155Parser.Insert_statement_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#receive_statement}.
	 * @param ctx the parse tree
	 */
	void enterReceive_statement(TSqlSyb155Parser.Receive_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#receive_statement}.
	 * @param ctx the parse tree
	 */
	void exitReceive_statement(TSqlSyb155Parser.Receive_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#select_statement}.
	 * @param ctx the parse tree
	 */
	void enterSelect_statement(TSqlSyb155Parser.Select_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#select_statement}.
	 * @param ctx the parse tree
	 */
	void exitSelect_statement(TSqlSyb155Parser.Select_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#time}.
	 * @param ctx the parse tree
	 */
	void enterTime(TSqlSyb155Parser.TimeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#time}.
	 * @param ctx the parse tree
	 */
	void exitTime(TSqlSyb155Parser.TimeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#update_statement}.
	 * @param ctx the parse tree
	 */
	void enterUpdate_statement(TSqlSyb155Parser.Update_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#update_statement}.
	 * @param ctx the parse tree
	 */
	void exitUpdate_statement(TSqlSyb155Parser.Update_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#output_clause}.
	 * @param ctx the parse tree
	 */
	void enterOutput_clause(TSqlSyb155Parser.Output_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#output_clause}.
	 * @param ctx the parse tree
	 */
	void exitOutput_clause(TSqlSyb155Parser.Output_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#output_dml_list_elem}.
	 * @param ctx the parse tree
	 */
	void enterOutput_dml_list_elem(TSqlSyb155Parser.Output_dml_list_elemContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#output_dml_list_elem}.
	 * @param ctx the parse tree
	 */
	void exitOutput_dml_list_elem(TSqlSyb155Parser.Output_dml_list_elemContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#output_column_name}.
	 * @param ctx the parse tree
	 */
	void enterOutput_column_name(TSqlSyb155Parser.Output_column_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#output_column_name}.
	 * @param ctx the parse tree
	 */
	void exitOutput_column_name(TSqlSyb155Parser.Output_column_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#create_database}.
	 * @param ctx the parse tree
	 */
	void enterCreate_database(TSqlSyb155Parser.Create_databaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#create_database}.
	 * @param ctx the parse tree
	 */
	void exitCreate_database(TSqlSyb155Parser.Create_databaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#create_index}.
	 * @param ctx the parse tree
	 */
	void enterCreate_index(TSqlSyb155Parser.Create_indexContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#create_index}.
	 * @param ctx the parse tree
	 */
	void exitCreate_index(TSqlSyb155Parser.Create_indexContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#create_or_alter_procedure}.
	 * @param ctx the parse tree
	 */
	void enterCreate_or_alter_procedure(TSqlSyb155Parser.Create_or_alter_procedureContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#create_or_alter_procedure}.
	 * @param ctx the parse tree
	 */
	void exitCreate_or_alter_procedure(TSqlSyb155Parser.Create_or_alter_procedureContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#create_or_alter_trigger}.
	 * @param ctx the parse tree
	 */
	void enterCreate_or_alter_trigger(TSqlSyb155Parser.Create_or_alter_triggerContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#create_or_alter_trigger}.
	 * @param ctx the parse tree
	 */
	void exitCreate_or_alter_trigger(TSqlSyb155Parser.Create_or_alter_triggerContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#create_or_alter_dml_trigger}.
	 * @param ctx the parse tree
	 */
	void enterCreate_or_alter_dml_trigger(TSqlSyb155Parser.Create_or_alter_dml_triggerContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#create_or_alter_dml_trigger}.
	 * @param ctx the parse tree
	 */
	void exitCreate_or_alter_dml_trigger(TSqlSyb155Parser.Create_or_alter_dml_triggerContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#dml_trigger_option}.
	 * @param ctx the parse tree
	 */
	void enterDml_trigger_option(TSqlSyb155Parser.Dml_trigger_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#dml_trigger_option}.
	 * @param ctx the parse tree
	 */
	void exitDml_trigger_option(TSqlSyb155Parser.Dml_trigger_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#dml_trigger_operation}.
	 * @param ctx the parse tree
	 */
	void enterDml_trigger_operation(TSqlSyb155Parser.Dml_trigger_operationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#dml_trigger_operation}.
	 * @param ctx the parse tree
	 */
	void exitDml_trigger_operation(TSqlSyb155Parser.Dml_trigger_operationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#create_or_alter_ddl_trigger}.
	 * @param ctx the parse tree
	 */
	void enterCreate_or_alter_ddl_trigger(TSqlSyb155Parser.Create_or_alter_ddl_triggerContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#create_or_alter_ddl_trigger}.
	 * @param ctx the parse tree
	 */
	void exitCreate_or_alter_ddl_trigger(TSqlSyb155Parser.Create_or_alter_ddl_triggerContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#ddl_trigger_operation}.
	 * @param ctx the parse tree
	 */
	void enterDdl_trigger_operation(TSqlSyb155Parser.Ddl_trigger_operationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#ddl_trigger_operation}.
	 * @param ctx the parse tree
	 */
	void exitDdl_trigger_operation(TSqlSyb155Parser.Ddl_trigger_operationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#create_or_alter_function}.
	 * @param ctx the parse tree
	 */
	void enterCreate_or_alter_function(TSqlSyb155Parser.Create_or_alter_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#create_or_alter_function}.
	 * @param ctx the parse tree
	 */
	void exitCreate_or_alter_function(TSqlSyb155Parser.Create_or_alter_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#func_body_returns_select}.
	 * @param ctx the parse tree
	 */
	void enterFunc_body_returns_select(TSqlSyb155Parser.Func_body_returns_selectContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#func_body_returns_select}.
	 * @param ctx the parse tree
	 */
	void exitFunc_body_returns_select(TSqlSyb155Parser.Func_body_returns_selectContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#func_body_returns_table}.
	 * @param ctx the parse tree
	 */
	void enterFunc_body_returns_table(TSqlSyb155Parser.Func_body_returns_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#func_body_returns_table}.
	 * @param ctx the parse tree
	 */
	void exitFunc_body_returns_table(TSqlSyb155Parser.Func_body_returns_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#func_body_returns_scalar}.
	 * @param ctx the parse tree
	 */
	void enterFunc_body_returns_scalar(TSqlSyb155Parser.Func_body_returns_scalarContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#func_body_returns_scalar}.
	 * @param ctx the parse tree
	 */
	void exitFunc_body_returns_scalar(TSqlSyb155Parser.Func_body_returns_scalarContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#procedure_param}.
	 * @param ctx the parse tree
	 */
	void enterProcedure_param(TSqlSyb155Parser.Procedure_paramContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#procedure_param}.
	 * @param ctx the parse tree
	 */
	void exitProcedure_param(TSqlSyb155Parser.Procedure_paramContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#procedure_option}.
	 * @param ctx the parse tree
	 */
	void enterProcedure_option(TSqlSyb155Parser.Procedure_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#procedure_option}.
	 * @param ctx the parse tree
	 */
	void exitProcedure_option(TSqlSyb155Parser.Procedure_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#function_option}.
	 * @param ctx the parse tree
	 */
	void enterFunction_option(TSqlSyb155Parser.Function_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#function_option}.
	 * @param ctx the parse tree
	 */
	void exitFunction_option(TSqlSyb155Parser.Function_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#create_statistics}.
	 * @param ctx the parse tree
	 */
	void enterCreate_statistics(TSqlSyb155Parser.Create_statisticsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#create_statistics}.
	 * @param ctx the parse tree
	 */
	void exitCreate_statistics(TSqlSyb155Parser.Create_statisticsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#create_table}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table(TSqlSyb155Parser.Create_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#create_table}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table(TSqlSyb155Parser.Create_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#table_options}.
	 * @param ctx the parse tree
	 */
	void enterTable_options(TSqlSyb155Parser.Table_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#table_options}.
	 * @param ctx the parse tree
	 */
	void exitTable_options(TSqlSyb155Parser.Table_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#create_view}.
	 * @param ctx the parse tree
	 */
	void enterCreate_view(TSqlSyb155Parser.Create_viewContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#create_view}.
	 * @param ctx the parse tree
	 */
	void exitCreate_view(TSqlSyb155Parser.Create_viewContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#view_attribute}.
	 * @param ctx the parse tree
	 */
	void enterView_attribute(TSqlSyb155Parser.View_attributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#view_attribute}.
	 * @param ctx the parse tree
	 */
	void exitView_attribute(TSqlSyb155Parser.View_attributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#alter_table}.
	 * @param ctx the parse tree
	 */
	void enterAlter_table(TSqlSyb155Parser.Alter_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#alter_table}.
	 * @param ctx the parse tree
	 */
	void exitAlter_table(TSqlSyb155Parser.Alter_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#alter_database}.
	 * @param ctx the parse tree
	 */
	void enterAlter_database(TSqlSyb155Parser.Alter_databaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#alter_database}.
	 * @param ctx the parse tree
	 */
	void exitAlter_database(TSqlSyb155Parser.Alter_databaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#database_optionspec}.
	 * @param ctx the parse tree
	 */
	void enterDatabase_optionspec(TSqlSyb155Parser.Database_optionspecContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#database_optionspec}.
	 * @param ctx the parse tree
	 */
	void exitDatabase_optionspec(TSqlSyb155Parser.Database_optionspecContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#auto_option}.
	 * @param ctx the parse tree
	 */
	void enterAuto_option(TSqlSyb155Parser.Auto_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#auto_option}.
	 * @param ctx the parse tree
	 */
	void exitAuto_option(TSqlSyb155Parser.Auto_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#change_tracking_option}.
	 * @param ctx the parse tree
	 */
	void enterChange_tracking_option(TSqlSyb155Parser.Change_tracking_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#change_tracking_option}.
	 * @param ctx the parse tree
	 */
	void exitChange_tracking_option(TSqlSyb155Parser.Change_tracking_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#change_tracking_option_list}.
	 * @param ctx the parse tree
	 */
	void enterChange_tracking_option_list(TSqlSyb155Parser.Change_tracking_option_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#change_tracking_option_list}.
	 * @param ctx the parse tree
	 */
	void exitChange_tracking_option_list(TSqlSyb155Parser.Change_tracking_option_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#containment_option}.
	 * @param ctx the parse tree
	 */
	void enterContainment_option(TSqlSyb155Parser.Containment_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#containment_option}.
	 * @param ctx the parse tree
	 */
	void exitContainment_option(TSqlSyb155Parser.Containment_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#cursor_option}.
	 * @param ctx the parse tree
	 */
	void enterCursor_option(TSqlSyb155Parser.Cursor_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#cursor_option}.
	 * @param ctx the parse tree
	 */
	void exitCursor_option(TSqlSyb155Parser.Cursor_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#alter_endpoint}.
	 * @param ctx the parse tree
	 */
	void enterAlter_endpoint(TSqlSyb155Parser.Alter_endpointContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#alter_endpoint}.
	 * @param ctx the parse tree
	 */
	void exitAlter_endpoint(TSqlSyb155Parser.Alter_endpointContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#database_mirroring_option}.
	 * @param ctx the parse tree
	 */
	void enterDatabase_mirroring_option(TSqlSyb155Parser.Database_mirroring_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#database_mirroring_option}.
	 * @param ctx the parse tree
	 */
	void exitDatabase_mirroring_option(TSqlSyb155Parser.Database_mirroring_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#mirroring_set_option}.
	 * @param ctx the parse tree
	 */
	void enterMirroring_set_option(TSqlSyb155Parser.Mirroring_set_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#mirroring_set_option}.
	 * @param ctx the parse tree
	 */
	void exitMirroring_set_option(TSqlSyb155Parser.Mirroring_set_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#mirroring_partner}.
	 * @param ctx the parse tree
	 */
	void enterMirroring_partner(TSqlSyb155Parser.Mirroring_partnerContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#mirroring_partner}.
	 * @param ctx the parse tree
	 */
	void exitMirroring_partner(TSqlSyb155Parser.Mirroring_partnerContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#mirroring_witness}.
	 * @param ctx the parse tree
	 */
	void enterMirroring_witness(TSqlSyb155Parser.Mirroring_witnessContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#mirroring_witness}.
	 * @param ctx the parse tree
	 */
	void exitMirroring_witness(TSqlSyb155Parser.Mirroring_witnessContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#witness_partner_equal}.
	 * @param ctx the parse tree
	 */
	void enterWitness_partner_equal(TSqlSyb155Parser.Witness_partner_equalContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#witness_partner_equal}.
	 * @param ctx the parse tree
	 */
	void exitWitness_partner_equal(TSqlSyb155Parser.Witness_partner_equalContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#partner_option}.
	 * @param ctx the parse tree
	 */
	void enterPartner_option(TSqlSyb155Parser.Partner_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#partner_option}.
	 * @param ctx the parse tree
	 */
	void exitPartner_option(TSqlSyb155Parser.Partner_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#witness_option}.
	 * @param ctx the parse tree
	 */
	void enterWitness_option(TSqlSyb155Parser.Witness_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#witness_option}.
	 * @param ctx the parse tree
	 */
	void exitWitness_option(TSqlSyb155Parser.Witness_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#witness_server}.
	 * @param ctx the parse tree
	 */
	void enterWitness_server(TSqlSyb155Parser.Witness_serverContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#witness_server}.
	 * @param ctx the parse tree
	 */
	void exitWitness_server(TSqlSyb155Parser.Witness_serverContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#partner_server}.
	 * @param ctx the parse tree
	 */
	void enterPartner_server(TSqlSyb155Parser.Partner_serverContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#partner_server}.
	 * @param ctx the parse tree
	 */
	void exitPartner_server(TSqlSyb155Parser.Partner_serverContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#mirroring_host_port_seperator}.
	 * @param ctx the parse tree
	 */
	void enterMirroring_host_port_seperator(TSqlSyb155Parser.Mirroring_host_port_seperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#mirroring_host_port_seperator}.
	 * @param ctx the parse tree
	 */
	void exitMirroring_host_port_seperator(TSqlSyb155Parser.Mirroring_host_port_seperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#partner_server_tcp_prefix}.
	 * @param ctx the parse tree
	 */
	void enterPartner_server_tcp_prefix(TSqlSyb155Parser.Partner_server_tcp_prefixContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#partner_server_tcp_prefix}.
	 * @param ctx the parse tree
	 */
	void exitPartner_server_tcp_prefix(TSqlSyb155Parser.Partner_server_tcp_prefixContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#port_number}.
	 * @param ctx the parse tree
	 */
	void enterPort_number(TSqlSyb155Parser.Port_numberContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#port_number}.
	 * @param ctx the parse tree
	 */
	void exitPort_number(TSqlSyb155Parser.Port_numberContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#host}.
	 * @param ctx the parse tree
	 */
	void enterHost(TSqlSyb155Parser.HostContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#host}.
	 * @param ctx the parse tree
	 */
	void exitHost(TSqlSyb155Parser.HostContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#date_correlation_optimization_option}.
	 * @param ctx the parse tree
	 */
	void enterDate_correlation_optimization_option(TSqlSyb155Parser.Date_correlation_optimization_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#date_correlation_optimization_option}.
	 * @param ctx the parse tree
	 */
	void exitDate_correlation_optimization_option(TSqlSyb155Parser.Date_correlation_optimization_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#db_encryption_option}.
	 * @param ctx the parse tree
	 */
	void enterDb_encryption_option(TSqlSyb155Parser.Db_encryption_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#db_encryption_option}.
	 * @param ctx the parse tree
	 */
	void exitDb_encryption_option(TSqlSyb155Parser.Db_encryption_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#db_state_option}.
	 * @param ctx the parse tree
	 */
	void enterDb_state_option(TSqlSyb155Parser.Db_state_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#db_state_option}.
	 * @param ctx the parse tree
	 */
	void exitDb_state_option(TSqlSyb155Parser.Db_state_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#db_update_option}.
	 * @param ctx the parse tree
	 */
	void enterDb_update_option(TSqlSyb155Parser.Db_update_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#db_update_option}.
	 * @param ctx the parse tree
	 */
	void exitDb_update_option(TSqlSyb155Parser.Db_update_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#db_user_access_option}.
	 * @param ctx the parse tree
	 */
	void enterDb_user_access_option(TSqlSyb155Parser.Db_user_access_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#db_user_access_option}.
	 * @param ctx the parse tree
	 */
	void exitDb_user_access_option(TSqlSyb155Parser.Db_user_access_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#delayed_durability_option}.
	 * @param ctx the parse tree
	 */
	void enterDelayed_durability_option(TSqlSyb155Parser.Delayed_durability_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#delayed_durability_option}.
	 * @param ctx the parse tree
	 */
	void exitDelayed_durability_option(TSqlSyb155Parser.Delayed_durability_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#external_access_option}.
	 * @param ctx the parse tree
	 */
	void enterExternal_access_option(TSqlSyb155Parser.External_access_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#external_access_option}.
	 * @param ctx the parse tree
	 */
	void exitExternal_access_option(TSqlSyb155Parser.External_access_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#hadr_options}.
	 * @param ctx the parse tree
	 */
	void enterHadr_options(TSqlSyb155Parser.Hadr_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#hadr_options}.
	 * @param ctx the parse tree
	 */
	void exitHadr_options(TSqlSyb155Parser.Hadr_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#mixed_page_allocation_option}.
	 * @param ctx the parse tree
	 */
	void enterMixed_page_allocation_option(TSqlSyb155Parser.Mixed_page_allocation_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#mixed_page_allocation_option}.
	 * @param ctx the parse tree
	 */
	void exitMixed_page_allocation_option(TSqlSyb155Parser.Mixed_page_allocation_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#parameterization_option}.
	 * @param ctx the parse tree
	 */
	void enterParameterization_option(TSqlSyb155Parser.Parameterization_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#parameterization_option}.
	 * @param ctx the parse tree
	 */
	void exitParameterization_option(TSqlSyb155Parser.Parameterization_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#recovery_option}.
	 * @param ctx the parse tree
	 */
	void enterRecovery_option(TSqlSyb155Parser.Recovery_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#recovery_option}.
	 * @param ctx the parse tree
	 */
	void exitRecovery_option(TSqlSyb155Parser.Recovery_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#service_broker_option}.
	 * @param ctx the parse tree
	 */
	void enterService_broker_option(TSqlSyb155Parser.Service_broker_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#service_broker_option}.
	 * @param ctx the parse tree
	 */
	void exitService_broker_option(TSqlSyb155Parser.Service_broker_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#snapshot_option}.
	 * @param ctx the parse tree
	 */
	void enterSnapshot_option(TSqlSyb155Parser.Snapshot_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#snapshot_option}.
	 * @param ctx the parse tree
	 */
	void exitSnapshot_option(TSqlSyb155Parser.Snapshot_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#sql_option}.
	 * @param ctx the parse tree
	 */
	void enterSql_option(TSqlSyb155Parser.Sql_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#sql_option}.
	 * @param ctx the parse tree
	 */
	void exitSql_option(TSqlSyb155Parser.Sql_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#target_recovery_time_option}.
	 * @param ctx the parse tree
	 */
	void enterTarget_recovery_time_option(TSqlSyb155Parser.Target_recovery_time_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#target_recovery_time_option}.
	 * @param ctx the parse tree
	 */
	void exitTarget_recovery_time_option(TSqlSyb155Parser.Target_recovery_time_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#termination}.
	 * @param ctx the parse tree
	 */
	void enterTermination(TSqlSyb155Parser.TerminationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#termination}.
	 * @param ctx the parse tree
	 */
	void exitTermination(TSqlSyb155Parser.TerminationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#drop_index}.
	 * @param ctx the parse tree
	 */
	void enterDrop_index(TSqlSyb155Parser.Drop_indexContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#drop_index}.
	 * @param ctx the parse tree
	 */
	void exitDrop_index(TSqlSyb155Parser.Drop_indexContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#drop_relational_or_xml_or_spatial_index}.
	 * @param ctx the parse tree
	 */
	void enterDrop_relational_or_xml_or_spatial_index(TSqlSyb155Parser.Drop_relational_or_xml_or_spatial_indexContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#drop_relational_or_xml_or_spatial_index}.
	 * @param ctx the parse tree
	 */
	void exitDrop_relational_or_xml_or_spatial_index(TSqlSyb155Parser.Drop_relational_or_xml_or_spatial_indexContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#drop_backward_compatible_index}.
	 * @param ctx the parse tree
	 */
	void enterDrop_backward_compatible_index(TSqlSyb155Parser.Drop_backward_compatible_indexContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#drop_backward_compatible_index}.
	 * @param ctx the parse tree
	 */
	void exitDrop_backward_compatible_index(TSqlSyb155Parser.Drop_backward_compatible_indexContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#drop_procedure}.
	 * @param ctx the parse tree
	 */
	void enterDrop_procedure(TSqlSyb155Parser.Drop_procedureContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#drop_procedure}.
	 * @param ctx the parse tree
	 */
	void exitDrop_procedure(TSqlSyb155Parser.Drop_procedureContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#drop_trigger}.
	 * @param ctx the parse tree
	 */
	void enterDrop_trigger(TSqlSyb155Parser.Drop_triggerContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#drop_trigger}.
	 * @param ctx the parse tree
	 */
	void exitDrop_trigger(TSqlSyb155Parser.Drop_triggerContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#drop_dml_trigger}.
	 * @param ctx the parse tree
	 */
	void enterDrop_dml_trigger(TSqlSyb155Parser.Drop_dml_triggerContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#drop_dml_trigger}.
	 * @param ctx the parse tree
	 */
	void exitDrop_dml_trigger(TSqlSyb155Parser.Drop_dml_triggerContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#drop_ddl_trigger}.
	 * @param ctx the parse tree
	 */
	void enterDrop_ddl_trigger(TSqlSyb155Parser.Drop_ddl_triggerContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#drop_ddl_trigger}.
	 * @param ctx the parse tree
	 */
	void exitDrop_ddl_trigger(TSqlSyb155Parser.Drop_ddl_triggerContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#drop_function}.
	 * @param ctx the parse tree
	 */
	void enterDrop_function(TSqlSyb155Parser.Drop_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#drop_function}.
	 * @param ctx the parse tree
	 */
	void exitDrop_function(TSqlSyb155Parser.Drop_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#drop_statistics}.
	 * @param ctx the parse tree
	 */
	void enterDrop_statistics(TSqlSyb155Parser.Drop_statisticsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#drop_statistics}.
	 * @param ctx the parse tree
	 */
	void exitDrop_statistics(TSqlSyb155Parser.Drop_statisticsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#drop_table}.
	 * @param ctx the parse tree
	 */
	void enterDrop_table(TSqlSyb155Parser.Drop_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#drop_table}.
	 * @param ctx the parse tree
	 */
	void exitDrop_table(TSqlSyb155Parser.Drop_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#drop_view}.
	 * @param ctx the parse tree
	 */
	void enterDrop_view(TSqlSyb155Parser.Drop_viewContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#drop_view}.
	 * @param ctx the parse tree
	 */
	void exitDrop_view(TSqlSyb155Parser.Drop_viewContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#create_type}.
	 * @param ctx the parse tree
	 */
	void enterCreate_type(TSqlSyb155Parser.Create_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#create_type}.
	 * @param ctx the parse tree
	 */
	void exitCreate_type(TSqlSyb155Parser.Create_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#drop_type}.
	 * @param ctx the parse tree
	 */
	void enterDrop_type(TSqlSyb155Parser.Drop_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#drop_type}.
	 * @param ctx the parse tree
	 */
	void exitDrop_type(TSqlSyb155Parser.Drop_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#rowset_function_limited}.
	 * @param ctx the parse tree
	 */
	void enterRowset_function_limited(TSqlSyb155Parser.Rowset_function_limitedContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#rowset_function_limited}.
	 * @param ctx the parse tree
	 */
	void exitRowset_function_limited(TSqlSyb155Parser.Rowset_function_limitedContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#openquery}.
	 * @param ctx the parse tree
	 */
	void enterOpenquery(TSqlSyb155Parser.OpenqueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#openquery}.
	 * @param ctx the parse tree
	 */
	void exitOpenquery(TSqlSyb155Parser.OpenqueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#opendatasource}.
	 * @param ctx the parse tree
	 */
	void enterOpendatasource(TSqlSyb155Parser.OpendatasourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#opendatasource}.
	 * @param ctx the parse tree
	 */
	void exitOpendatasource(TSqlSyb155Parser.OpendatasourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#declare_statement}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_statement(TSqlSyb155Parser.Declare_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#declare_statement}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_statement(TSqlSyb155Parser.Declare_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#cursor_statement}.
	 * @param ctx the parse tree
	 */
	void enterCursor_statement(TSqlSyb155Parser.Cursor_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#cursor_statement}.
	 * @param ctx the parse tree
	 */
	void exitCursor_statement(TSqlSyb155Parser.Cursor_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#backup_database}.
	 * @param ctx the parse tree
	 */
	void enterBackup_database(TSqlSyb155Parser.Backup_databaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#backup_database}.
	 * @param ctx the parse tree
	 */
	void exitBackup_database(TSqlSyb155Parser.Backup_databaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#backup_log}.
	 * @param ctx the parse tree
	 */
	void enterBackup_log(TSqlSyb155Parser.Backup_logContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#backup_log}.
	 * @param ctx the parse tree
	 */
	void exitBackup_log(TSqlSyb155Parser.Backup_logContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#backup_certificate}.
	 * @param ctx the parse tree
	 */
	void enterBackup_certificate(TSqlSyb155Parser.Backup_certificateContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#backup_certificate}.
	 * @param ctx the parse tree
	 */
	void exitBackup_certificate(TSqlSyb155Parser.Backup_certificateContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#backup_master_key}.
	 * @param ctx the parse tree
	 */
	void enterBackup_master_key(TSqlSyb155Parser.Backup_master_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#backup_master_key}.
	 * @param ctx the parse tree
	 */
	void exitBackup_master_key(TSqlSyb155Parser.Backup_master_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#backup_service_master_key}.
	 * @param ctx the parse tree
	 */
	void enterBackup_service_master_key(TSqlSyb155Parser.Backup_service_master_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#backup_service_master_key}.
	 * @param ctx the parse tree
	 */
	void exitBackup_service_master_key(TSqlSyb155Parser.Backup_service_master_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#execute_statement}.
	 * @param ctx the parse tree
	 */
	void enterExecute_statement(TSqlSyb155Parser.Execute_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#execute_statement}.
	 * @param ctx the parse tree
	 */
	void exitExecute_statement(TSqlSyb155Parser.Execute_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#execute_statement_arg}.
	 * @param ctx the parse tree
	 */
	void enterExecute_statement_arg(TSqlSyb155Parser.Execute_statement_argContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#execute_statement_arg}.
	 * @param ctx the parse tree
	 */
	void exitExecute_statement_arg(TSqlSyb155Parser.Execute_statement_argContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#execute_var_string}.
	 * @param ctx the parse tree
	 */
	void enterExecute_var_string(TSqlSyb155Parser.Execute_var_stringContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#execute_var_string}.
	 * @param ctx the parse tree
	 */
	void exitExecute_var_string(TSqlSyb155Parser.Execute_var_stringContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#security_statement}.
	 * @param ctx the parse tree
	 */
	void enterSecurity_statement(TSqlSyb155Parser.Security_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#security_statement}.
	 * @param ctx the parse tree
	 */
	void exitSecurity_statement(TSqlSyb155Parser.Security_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#create_certificate}.
	 * @param ctx the parse tree
	 */
	void enterCreate_certificate(TSqlSyb155Parser.Create_certificateContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#create_certificate}.
	 * @param ctx the parse tree
	 */
	void exitCreate_certificate(TSqlSyb155Parser.Create_certificateContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#existing_keys}.
	 * @param ctx the parse tree
	 */
	void enterExisting_keys(TSqlSyb155Parser.Existing_keysContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#existing_keys}.
	 * @param ctx the parse tree
	 */
	void exitExisting_keys(TSqlSyb155Parser.Existing_keysContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#private_key_options}.
	 * @param ctx the parse tree
	 */
	void enterPrivate_key_options(TSqlSyb155Parser.Private_key_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#private_key_options}.
	 * @param ctx the parse tree
	 */
	void exitPrivate_key_options(TSqlSyb155Parser.Private_key_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#generate_new_keys}.
	 * @param ctx the parse tree
	 */
	void enterGenerate_new_keys(TSqlSyb155Parser.Generate_new_keysContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#generate_new_keys}.
	 * @param ctx the parse tree
	 */
	void exitGenerate_new_keys(TSqlSyb155Parser.Generate_new_keysContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#date_options}.
	 * @param ctx the parse tree
	 */
	void enterDate_options(TSqlSyb155Parser.Date_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#date_options}.
	 * @param ctx the parse tree
	 */
	void exitDate_options(TSqlSyb155Parser.Date_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#open_key}.
	 * @param ctx the parse tree
	 */
	void enterOpen_key(TSqlSyb155Parser.Open_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#open_key}.
	 * @param ctx the parse tree
	 */
	void exitOpen_key(TSqlSyb155Parser.Open_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#close_key}.
	 * @param ctx the parse tree
	 */
	void enterClose_key(TSqlSyb155Parser.Close_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#close_key}.
	 * @param ctx the parse tree
	 */
	void exitClose_key(TSqlSyb155Parser.Close_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#create_key}.
	 * @param ctx the parse tree
	 */
	void enterCreate_key(TSqlSyb155Parser.Create_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#create_key}.
	 * @param ctx the parse tree
	 */
	void exitCreate_key(TSqlSyb155Parser.Create_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#key_options}.
	 * @param ctx the parse tree
	 */
	void enterKey_options(TSqlSyb155Parser.Key_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#key_options}.
	 * @param ctx the parse tree
	 */
	void exitKey_options(TSqlSyb155Parser.Key_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#algorithm}.
	 * @param ctx the parse tree
	 */
	void enterAlgorithm(TSqlSyb155Parser.AlgorithmContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#algorithm}.
	 * @param ctx the parse tree
	 */
	void exitAlgorithm(TSqlSyb155Parser.AlgorithmContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#encryption_mechanism}.
	 * @param ctx the parse tree
	 */
	void enterEncryption_mechanism(TSqlSyb155Parser.Encryption_mechanismContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#encryption_mechanism}.
	 * @param ctx the parse tree
	 */
	void exitEncryption_mechanism(TSqlSyb155Parser.Encryption_mechanismContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#decryption_mechanism}.
	 * @param ctx the parse tree
	 */
	void enterDecryption_mechanism(TSqlSyb155Parser.Decryption_mechanismContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#decryption_mechanism}.
	 * @param ctx the parse tree
	 */
	void exitDecryption_mechanism(TSqlSyb155Parser.Decryption_mechanismContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#grant_permission}.
	 * @param ctx the parse tree
	 */
	void enterGrant_permission(TSqlSyb155Parser.Grant_permissionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#grant_permission}.
	 * @param ctx the parse tree
	 */
	void exitGrant_permission(TSqlSyb155Parser.Grant_permissionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#set_statement}.
	 * @param ctx the parse tree
	 */
	void enterSet_statement(TSqlSyb155Parser.Set_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#set_statement}.
	 * @param ctx the parse tree
	 */
	void exitSet_statement(TSqlSyb155Parser.Set_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#transaction_statement}.
	 * @param ctx the parse tree
	 */
	void enterTransaction_statement(TSqlSyb155Parser.Transaction_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#transaction_statement}.
	 * @param ctx the parse tree
	 */
	void exitTransaction_statement(TSqlSyb155Parser.Transaction_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#go_statement}.
	 * @param ctx the parse tree
	 */
	void enterGo_statement(TSqlSyb155Parser.Go_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#go_statement}.
	 * @param ctx the parse tree
	 */
	void exitGo_statement(TSqlSyb155Parser.Go_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#use_statement}.
	 * @param ctx the parse tree
	 */
	void enterUse_statement(TSqlSyb155Parser.Use_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#use_statement}.
	 * @param ctx the parse tree
	 */
	void exitUse_statement(TSqlSyb155Parser.Use_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#dbcc_clause}.
	 * @param ctx the parse tree
	 */
	void enterDbcc_clause(TSqlSyb155Parser.Dbcc_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#dbcc_clause}.
	 * @param ctx the parse tree
	 */
	void exitDbcc_clause(TSqlSyb155Parser.Dbcc_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#dbcc_options}.
	 * @param ctx the parse tree
	 */
	void enterDbcc_options(TSqlSyb155Parser.Dbcc_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#dbcc_options}.
	 * @param ctx the parse tree
	 */
	void exitDbcc_options(TSqlSyb155Parser.Dbcc_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#execute_clause}.
	 * @param ctx the parse tree
	 */
	void enterExecute_clause(TSqlSyb155Parser.Execute_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#execute_clause}.
	 * @param ctx the parse tree
	 */
	void exitExecute_clause(TSqlSyb155Parser.Execute_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#declare_local}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_local(TSqlSyb155Parser.Declare_localContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#declare_local}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_local(TSqlSyb155Parser.Declare_localContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#table_type_definition}.
	 * @param ctx the parse tree
	 */
	void enterTable_type_definition(TSqlSyb155Parser.Table_type_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#table_type_definition}.
	 * @param ctx the parse tree
	 */
	void exitTable_type_definition(TSqlSyb155Parser.Table_type_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#xml_type_definition}.
	 * @param ctx the parse tree
	 */
	void enterXml_type_definition(TSqlSyb155Parser.Xml_type_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#xml_type_definition}.
	 * @param ctx the parse tree
	 */
	void exitXml_type_definition(TSqlSyb155Parser.Xml_type_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#xml_schema_collection}.
	 * @param ctx the parse tree
	 */
	void enterXml_schema_collection(TSqlSyb155Parser.Xml_schema_collectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#xml_schema_collection}.
	 * @param ctx the parse tree
	 */
	void exitXml_schema_collection(TSqlSyb155Parser.Xml_schema_collectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#column_def_table_constraints}.
	 * @param ctx the parse tree
	 */
	void enterColumn_def_table_constraints(TSqlSyb155Parser.Column_def_table_constraintsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#column_def_table_constraints}.
	 * @param ctx the parse tree
	 */
	void exitColumn_def_table_constraints(TSqlSyb155Parser.Column_def_table_constraintsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#column_def_table_constraint}.
	 * @param ctx the parse tree
	 */
	void enterColumn_def_table_constraint(TSqlSyb155Parser.Column_def_table_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#column_def_table_constraint}.
	 * @param ctx the parse tree
	 */
	void exitColumn_def_table_constraint(TSqlSyb155Parser.Column_def_table_constraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#column_definition}.
	 * @param ctx the parse tree
	 */
	void enterColumn_definition(TSqlSyb155Parser.Column_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#column_definition}.
	 * @param ctx the parse tree
	 */
	void exitColumn_definition(TSqlSyb155Parser.Column_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#column_constraint}.
	 * @param ctx the parse tree
	 */
	void enterColumn_constraint(TSqlSyb155Parser.Column_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#column_constraint}.
	 * @param ctx the parse tree
	 */
	void exitColumn_constraint(TSqlSyb155Parser.Column_constraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#table_constraint}.
	 * @param ctx the parse tree
	 */
	void enterTable_constraint(TSqlSyb155Parser.Table_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#table_constraint}.
	 * @param ctx the parse tree
	 */
	void exitTable_constraint(TSqlSyb155Parser.Table_constraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#on_delete}.
	 * @param ctx the parse tree
	 */
	void enterOn_delete(TSqlSyb155Parser.On_deleteContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#on_delete}.
	 * @param ctx the parse tree
	 */
	void exitOn_delete(TSqlSyb155Parser.On_deleteContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#on_update}.
	 * @param ctx the parse tree
	 */
	void enterOn_update(TSqlSyb155Parser.On_updateContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#on_update}.
	 * @param ctx the parse tree
	 */
	void exitOn_update(TSqlSyb155Parser.On_updateContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#index_options}.
	 * @param ctx the parse tree
	 */
	void enterIndex_options(TSqlSyb155Parser.Index_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#index_options}.
	 * @param ctx the parse tree
	 */
	void exitIndex_options(TSqlSyb155Parser.Index_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#index_option}.
	 * @param ctx the parse tree
	 */
	void enterIndex_option(TSqlSyb155Parser.Index_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#index_option}.
	 * @param ctx the parse tree
	 */
	void exitIndex_option(TSqlSyb155Parser.Index_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#declare_cursor}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_cursor(TSqlSyb155Parser.Declare_cursorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#declare_cursor}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_cursor(TSqlSyb155Parser.Declare_cursorContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#declare_set_cursor_common}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_set_cursor_common(TSqlSyb155Parser.Declare_set_cursor_commonContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#declare_set_cursor_common}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_set_cursor_common(TSqlSyb155Parser.Declare_set_cursor_commonContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#declare_set_cursor_common_partial}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_set_cursor_common_partial(TSqlSyb155Parser.Declare_set_cursor_common_partialContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#declare_set_cursor_common_partial}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_set_cursor_common_partial(TSqlSyb155Parser.Declare_set_cursor_common_partialContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#fetch_cursor}.
	 * @param ctx the parse tree
	 */
	void enterFetch_cursor(TSqlSyb155Parser.Fetch_cursorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#fetch_cursor}.
	 * @param ctx the parse tree
	 */
	void exitFetch_cursor(TSqlSyb155Parser.Fetch_cursorContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#set_special}.
	 * @param ctx the parse tree
	 */
	void enterSet_special(TSqlSyb155Parser.Set_specialContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#set_special}.
	 * @param ctx the parse tree
	 */
	void exitSet_special(TSqlSyb155Parser.Set_specialContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#constant_LOCAL_ID}.
	 * @param ctx the parse tree
	 */
	void enterConstant_LOCAL_ID(TSqlSyb155Parser.Constant_LOCAL_IDContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#constant_LOCAL_ID}.
	 * @param ctx the parse tree
	 */
	void exitConstant_LOCAL_ID(TSqlSyb155Parser.Constant_LOCAL_IDContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(TSqlSyb155Parser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(TSqlSyb155Parser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#primitive_expression}.
	 * @param ctx the parse tree
	 */
	void enterPrimitive_expression(TSqlSyb155Parser.Primitive_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#primitive_expression}.
	 * @param ctx the parse tree
	 */
	void exitPrimitive_expression(TSqlSyb155Parser.Primitive_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#case_expression}.
	 * @param ctx the parse tree
	 */
	void enterCase_expression(TSqlSyb155Parser.Case_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#case_expression}.
	 * @param ctx the parse tree
	 */
	void exitCase_expression(TSqlSyb155Parser.Case_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#unary_operator_expression}.
	 * @param ctx the parse tree
	 */
	void enterUnary_operator_expression(TSqlSyb155Parser.Unary_operator_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#unary_operator_expression}.
	 * @param ctx the parse tree
	 */
	void exitUnary_operator_expression(TSqlSyb155Parser.Unary_operator_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#bracket_expression}.
	 * @param ctx the parse tree
	 */
	void enterBracket_expression(TSqlSyb155Parser.Bracket_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#bracket_expression}.
	 * @param ctx the parse tree
	 */
	void exitBracket_expression(TSqlSyb155Parser.Bracket_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#constant_expression}.
	 * @param ctx the parse tree
	 */
	void enterConstant_expression(TSqlSyb155Parser.Constant_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#constant_expression}.
	 * @param ctx the parse tree
	 */
	void exitConstant_expression(TSqlSyb155Parser.Constant_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#subquery}.
	 * @param ctx the parse tree
	 */
	void enterSubquery(TSqlSyb155Parser.SubqueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#subquery}.
	 * @param ctx the parse tree
	 */
	void exitSubquery(TSqlSyb155Parser.SubqueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#with_expression}.
	 * @param ctx the parse tree
	 */
	void enterWith_expression(TSqlSyb155Parser.With_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#with_expression}.
	 * @param ctx the parse tree
	 */
	void exitWith_expression(TSqlSyb155Parser.With_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#common_table_expression}.
	 * @param ctx the parse tree
	 */
	void enterCommon_table_expression(TSqlSyb155Parser.Common_table_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#common_table_expression}.
	 * @param ctx the parse tree
	 */
	void exitCommon_table_expression(TSqlSyb155Parser.Common_table_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#update_elem}.
	 * @param ctx the parse tree
	 */
	void enterUpdate_elem(TSqlSyb155Parser.Update_elemContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#update_elem}.
	 * @param ctx the parse tree
	 */
	void exitUpdate_elem(TSqlSyb155Parser.Update_elemContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#search_condition_list}.
	 * @param ctx the parse tree
	 */
	void enterSearch_condition_list(TSqlSyb155Parser.Search_condition_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#search_condition_list}.
	 * @param ctx the parse tree
	 */
	void exitSearch_condition_list(TSqlSyb155Parser.Search_condition_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#search_condition}.
	 * @param ctx the parse tree
	 */
	void enterSearch_condition(TSqlSyb155Parser.Search_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#search_condition}.
	 * @param ctx the parse tree
	 */
	void exitSearch_condition(TSqlSyb155Parser.Search_conditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#search_condition_and}.
	 * @param ctx the parse tree
	 */
	void enterSearch_condition_and(TSqlSyb155Parser.Search_condition_andContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#search_condition_and}.
	 * @param ctx the parse tree
	 */
	void exitSearch_condition_and(TSqlSyb155Parser.Search_condition_andContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#search_condition_not}.
	 * @param ctx the parse tree
	 */
	void enterSearch_condition_not(TSqlSyb155Parser.Search_condition_notContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#search_condition_not}.
	 * @param ctx the parse tree
	 */
	void exitSearch_condition_not(TSqlSyb155Parser.Search_condition_notContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterPredicate(TSqlSyb155Parser.PredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitPredicate(TSqlSyb155Parser.PredicateContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#query_expression}.
	 * @param ctx the parse tree
	 */
	void enterQuery_expression(TSqlSyb155Parser.Query_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#query_expression}.
	 * @param ctx the parse tree
	 */
	void exitQuery_expression(TSqlSyb155Parser.Query_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#sql_union}.
	 * @param ctx the parse tree
	 */
	void enterSql_union(TSqlSyb155Parser.Sql_unionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#sql_union}.
	 * @param ctx the parse tree
	 */
	void exitSql_union(TSqlSyb155Parser.Sql_unionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#query_specification}.
	 * @param ctx the parse tree
	 */
	void enterQuery_specification(TSqlSyb155Parser.Query_specificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#query_specification}.
	 * @param ctx the parse tree
	 */
	void exitQuery_specification(TSqlSyb155Parser.Query_specificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#top_clause}.
	 * @param ctx the parse tree
	 */
	void enterTop_clause(TSqlSyb155Parser.Top_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#top_clause}.
	 * @param ctx the parse tree
	 */
	void exitTop_clause(TSqlSyb155Parser.Top_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#top_percent}.
	 * @param ctx the parse tree
	 */
	void enterTop_percent(TSqlSyb155Parser.Top_percentContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#top_percent}.
	 * @param ctx the parse tree
	 */
	void exitTop_percent(TSqlSyb155Parser.Top_percentContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#top_count}.
	 * @param ctx the parse tree
	 */
	void enterTop_count(TSqlSyb155Parser.Top_countContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#top_count}.
	 * @param ctx the parse tree
	 */
	void exitTop_count(TSqlSyb155Parser.Top_countContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#order_by_clause}.
	 * @param ctx the parse tree
	 */
	void enterOrder_by_clause(TSqlSyb155Parser.Order_by_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#order_by_clause}.
	 * @param ctx the parse tree
	 */
	void exitOrder_by_clause(TSqlSyb155Parser.Order_by_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#for_clause}.
	 * @param ctx the parse tree
	 */
	void enterFor_clause(TSqlSyb155Parser.For_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#for_clause}.
	 * @param ctx the parse tree
	 */
	void exitFor_clause(TSqlSyb155Parser.For_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#xml_common_directives}.
	 * @param ctx the parse tree
	 */
	void enterXml_common_directives(TSqlSyb155Parser.Xml_common_directivesContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#xml_common_directives}.
	 * @param ctx the parse tree
	 */
	void exitXml_common_directives(TSqlSyb155Parser.Xml_common_directivesContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#order_by_expression}.
	 * @param ctx the parse tree
	 */
	void enterOrder_by_expression(TSqlSyb155Parser.Order_by_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#order_by_expression}.
	 * @param ctx the parse tree
	 */
	void exitOrder_by_expression(TSqlSyb155Parser.Order_by_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#group_by_item}.
	 * @param ctx the parse tree
	 */
	void enterGroup_by_item(TSqlSyb155Parser.Group_by_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#group_by_item}.
	 * @param ctx the parse tree
	 */
	void exitGroup_by_item(TSqlSyb155Parser.Group_by_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#option_clause}.
	 * @param ctx the parse tree
	 */
	void enterOption_clause(TSqlSyb155Parser.Option_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#option_clause}.
	 * @param ctx the parse tree
	 */
	void exitOption_clause(TSqlSyb155Parser.Option_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#option}.
	 * @param ctx the parse tree
	 */
	void enterOption(TSqlSyb155Parser.OptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#option}.
	 * @param ctx the parse tree
	 */
	void exitOption(TSqlSyb155Parser.OptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#optimize_for_arg}.
	 * @param ctx the parse tree
	 */
	void enterOptimize_for_arg(TSqlSyb155Parser.Optimize_for_argContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#optimize_for_arg}.
	 * @param ctx the parse tree
	 */
	void exitOptimize_for_arg(TSqlSyb155Parser.Optimize_for_argContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#select_list}.
	 * @param ctx the parse tree
	 */
	void enterSelect_list(TSqlSyb155Parser.Select_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#select_list}.
	 * @param ctx the parse tree
	 */
	void exitSelect_list(TSqlSyb155Parser.Select_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#udt_method_arguments}.
	 * @param ctx the parse tree
	 */
	void enterUdt_method_arguments(TSqlSyb155Parser.Udt_method_argumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#udt_method_arguments}.
	 * @param ctx the parse tree
	 */
	void exitUdt_method_arguments(TSqlSyb155Parser.Udt_method_argumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#asterisk}.
	 * @param ctx the parse tree
	 */
	void enterAsterisk(TSqlSyb155Parser.AsteriskContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#asterisk}.
	 * @param ctx the parse tree
	 */
	void exitAsterisk(TSqlSyb155Parser.AsteriskContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#column_elem}.
	 * @param ctx the parse tree
	 */
	void enterColumn_elem(TSqlSyb155Parser.Column_elemContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#column_elem}.
	 * @param ctx the parse tree
	 */
	void exitColumn_elem(TSqlSyb155Parser.Column_elemContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#udt_elem}.
	 * @param ctx the parse tree
	 */
	void enterUdt_elem(TSqlSyb155Parser.Udt_elemContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#udt_elem}.
	 * @param ctx the parse tree
	 */
	void exitUdt_elem(TSqlSyb155Parser.Udt_elemContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#expression_elem}.
	 * @param ctx the parse tree
	 */
	void enterExpression_elem(TSqlSyb155Parser.Expression_elemContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#expression_elem}.
	 * @param ctx the parse tree
	 */
	void exitExpression_elem(TSqlSyb155Parser.Expression_elemContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#select_list_elem}.
	 * @param ctx the parse tree
	 */
	void enterSelect_list_elem(TSqlSyb155Parser.Select_list_elemContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#select_list_elem}.
	 * @param ctx the parse tree
	 */
	void exitSelect_list_elem(TSqlSyb155Parser.Select_list_elemContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#table_sources}.
	 * @param ctx the parse tree
	 */
	void enterTable_sources(TSqlSyb155Parser.Table_sourcesContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#table_sources}.
	 * @param ctx the parse tree
	 */
	void exitTable_sources(TSqlSyb155Parser.Table_sourcesContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#table_source}.
	 * @param ctx the parse tree
	 */
	void enterTable_source(TSqlSyb155Parser.Table_sourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#table_source}.
	 * @param ctx the parse tree
	 */
	void exitTable_source(TSqlSyb155Parser.Table_sourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#table_source_item_joined}.
	 * @param ctx the parse tree
	 */
	void enterTable_source_item_joined(TSqlSyb155Parser.Table_source_item_joinedContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#table_source_item_joined}.
	 * @param ctx the parse tree
	 */
	void exitTable_source_item_joined(TSqlSyb155Parser.Table_source_item_joinedContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#table_source_item}.
	 * @param ctx the parse tree
	 */
	void enterTable_source_item(TSqlSyb155Parser.Table_source_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#table_source_item}.
	 * @param ctx the parse tree
	 */
	void exitTable_source_item(TSqlSyb155Parser.Table_source_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#open_xml}.
	 * @param ctx the parse tree
	 */
	void enterOpen_xml(TSqlSyb155Parser.Open_xmlContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#open_xml}.
	 * @param ctx the parse tree
	 */
	void exitOpen_xml(TSqlSyb155Parser.Open_xmlContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#schema_declaration}.
	 * @param ctx the parse tree
	 */
	void enterSchema_declaration(TSqlSyb155Parser.Schema_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#schema_declaration}.
	 * @param ctx the parse tree
	 */
	void exitSchema_declaration(TSqlSyb155Parser.Schema_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#column_declaration}.
	 * @param ctx the parse tree
	 */
	void enterColumn_declaration(TSqlSyb155Parser.Column_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#column_declaration}.
	 * @param ctx the parse tree
	 */
	void exitColumn_declaration(TSqlSyb155Parser.Column_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#change_table}.
	 * @param ctx the parse tree
	 */
	void enterChange_table(TSqlSyb155Parser.Change_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#change_table}.
	 * @param ctx the parse tree
	 */
	void exitChange_table(TSqlSyb155Parser.Change_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#join_part}.
	 * @param ctx the parse tree
	 */
	void enterJoin_part(TSqlSyb155Parser.Join_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#join_part}.
	 * @param ctx the parse tree
	 */
	void exitJoin_part(TSqlSyb155Parser.Join_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#pivot_clause}.
	 * @param ctx the parse tree
	 */
	void enterPivot_clause(TSqlSyb155Parser.Pivot_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#pivot_clause}.
	 * @param ctx the parse tree
	 */
	void exitPivot_clause(TSqlSyb155Parser.Pivot_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#unpivot_clause}.
	 * @param ctx the parse tree
	 */
	void enterUnpivot_clause(TSqlSyb155Parser.Unpivot_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#unpivot_clause}.
	 * @param ctx the parse tree
	 */
	void exitUnpivot_clause(TSqlSyb155Parser.Unpivot_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#full_column_name_list}.
	 * @param ctx the parse tree
	 */
	void enterFull_column_name_list(TSqlSyb155Parser.Full_column_name_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#full_column_name_list}.
	 * @param ctx the parse tree
	 */
	void exitFull_column_name_list(TSqlSyb155Parser.Full_column_name_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#table_name_with_hint}.
	 * @param ctx the parse tree
	 */
	void enterTable_name_with_hint(TSqlSyb155Parser.Table_name_with_hintContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#table_name_with_hint}.
	 * @param ctx the parse tree
	 */
	void exitTable_name_with_hint(TSqlSyb155Parser.Table_name_with_hintContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#rowset_function}.
	 * @param ctx the parse tree
	 */
	void enterRowset_function(TSqlSyb155Parser.Rowset_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#rowset_function}.
	 * @param ctx the parse tree
	 */
	void exitRowset_function(TSqlSyb155Parser.Rowset_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#bulk_option}.
	 * @param ctx the parse tree
	 */
	void enterBulk_option(TSqlSyb155Parser.Bulk_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#bulk_option}.
	 * @param ctx the parse tree
	 */
	void exitBulk_option(TSqlSyb155Parser.Bulk_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#derived_table}.
	 * @param ctx the parse tree
	 */
	void enterDerived_table(TSqlSyb155Parser.Derived_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#derived_table}.
	 * @param ctx the parse tree
	 */
	void exitDerived_table(TSqlSyb155Parser.Derived_tableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RANKING_WINDOWED_FUNC}
	 * labeled alternative in {@link TSqlSyb155Parser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterRANKING_WINDOWED_FUNC(TSqlSyb155Parser.RANKING_WINDOWED_FUNCContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RANKING_WINDOWED_FUNC}
	 * labeled alternative in {@link TSqlSyb155Parser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitRANKING_WINDOWED_FUNC(TSqlSyb155Parser.RANKING_WINDOWED_FUNCContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AGGREGATE_WINDOWED_FUNC}
	 * labeled alternative in {@link TSqlSyb155Parser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterAGGREGATE_WINDOWED_FUNC(TSqlSyb155Parser.AGGREGATE_WINDOWED_FUNCContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AGGREGATE_WINDOWED_FUNC}
	 * labeled alternative in {@link TSqlSyb155Parser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitAGGREGATE_WINDOWED_FUNC(TSqlSyb155Parser.AGGREGATE_WINDOWED_FUNCContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ANALYTIC_WINDOWED_FUNC}
	 * labeled alternative in {@link TSqlSyb155Parser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterANALYTIC_WINDOWED_FUNC(TSqlSyb155Parser.ANALYTIC_WINDOWED_FUNCContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ANALYTIC_WINDOWED_FUNC}
	 * labeled alternative in {@link TSqlSyb155Parser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitANALYTIC_WINDOWED_FUNC(TSqlSyb155Parser.ANALYTIC_WINDOWED_FUNCContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SCALAR_FUNCTION}
	 * labeled alternative in {@link TSqlSyb155Parser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterSCALAR_FUNCTION(TSqlSyb155Parser.SCALAR_FUNCTIONContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SCALAR_FUNCTION}
	 * labeled alternative in {@link TSqlSyb155Parser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitSCALAR_FUNCTION(TSqlSyb155Parser.SCALAR_FUNCTIONContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BINARY_CHECKSUM}
	 * labeled alternative in {@link TSqlSyb155Parser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterBINARY_CHECKSUM(TSqlSyb155Parser.BINARY_CHECKSUMContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BINARY_CHECKSUM}
	 * labeled alternative in {@link TSqlSyb155Parser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitBINARY_CHECKSUM(TSqlSyb155Parser.BINARY_CHECKSUMContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CAST}
	 * labeled alternative in {@link TSqlSyb155Parser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterCAST(TSqlSyb155Parser.CASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CAST}
	 * labeled alternative in {@link TSqlSyb155Parser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitCAST(TSqlSyb155Parser.CASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CONVERT}
	 * labeled alternative in {@link TSqlSyb155Parser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterCONVERT(TSqlSyb155Parser.CONVERTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CONVERT}
	 * labeled alternative in {@link TSqlSyb155Parser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitCONVERT(TSqlSyb155Parser.CONVERTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CHECKSUM}
	 * labeled alternative in {@link TSqlSyb155Parser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterCHECKSUM(TSqlSyb155Parser.CHECKSUMContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CHECKSUM}
	 * labeled alternative in {@link TSqlSyb155Parser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitCHECKSUM(TSqlSyb155Parser.CHECKSUMContext ctx);
	/**
	 * Enter a parse tree produced by the {@code COALESCE}
	 * labeled alternative in {@link TSqlSyb155Parser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterCOALESCE(TSqlSyb155Parser.COALESCEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code COALESCE}
	 * labeled alternative in {@link TSqlSyb155Parser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitCOALESCE(TSqlSyb155Parser.COALESCEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CURRENT_TIMESTAMP}
	 * labeled alternative in {@link TSqlSyb155Parser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterCURRENT_TIMESTAMP(TSqlSyb155Parser.CURRENT_TIMESTAMPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CURRENT_TIMESTAMP}
	 * labeled alternative in {@link TSqlSyb155Parser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitCURRENT_TIMESTAMP(TSqlSyb155Parser.CURRENT_TIMESTAMPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CURRENT_USER}
	 * labeled alternative in {@link TSqlSyb155Parser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterCURRENT_USER(TSqlSyb155Parser.CURRENT_USERContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CURRENT_USER}
	 * labeled alternative in {@link TSqlSyb155Parser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitCURRENT_USER(TSqlSyb155Parser.CURRENT_USERContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DATEADD}
	 * labeled alternative in {@link TSqlSyb155Parser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterDATEADD(TSqlSyb155Parser.DATEADDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DATEADD}
	 * labeled alternative in {@link TSqlSyb155Parser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitDATEADD(TSqlSyb155Parser.DATEADDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DATEDIFF}
	 * labeled alternative in {@link TSqlSyb155Parser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterDATEDIFF(TSqlSyb155Parser.DATEDIFFContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DATEDIFF}
	 * labeled alternative in {@link TSqlSyb155Parser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitDATEDIFF(TSqlSyb155Parser.DATEDIFFContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DATENAME}
	 * labeled alternative in {@link TSqlSyb155Parser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterDATENAME(TSqlSyb155Parser.DATENAMEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DATENAME}
	 * labeled alternative in {@link TSqlSyb155Parser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitDATENAME(TSqlSyb155Parser.DATENAMEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DATEPART}
	 * labeled alternative in {@link TSqlSyb155Parser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterDATEPART(TSqlSyb155Parser.DATEPARTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DATEPART}
	 * labeled alternative in {@link TSqlSyb155Parser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitDATEPART(TSqlSyb155Parser.DATEPARTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GETDATE}
	 * labeled alternative in {@link TSqlSyb155Parser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterGETDATE(TSqlSyb155Parser.GETDATEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GETDATE}
	 * labeled alternative in {@link TSqlSyb155Parser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitGETDATE(TSqlSyb155Parser.GETDATEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GETUTCDATE}
	 * labeled alternative in {@link TSqlSyb155Parser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterGETUTCDATE(TSqlSyb155Parser.GETUTCDATEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GETUTCDATE}
	 * labeled alternative in {@link TSqlSyb155Parser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitGETUTCDATE(TSqlSyb155Parser.GETUTCDATEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IDENTITY}
	 * labeled alternative in {@link TSqlSyb155Parser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterIDENTITY(TSqlSyb155Parser.IDENTITYContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IDENTITY}
	 * labeled alternative in {@link TSqlSyb155Parser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitIDENTITY(TSqlSyb155Parser.IDENTITYContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MIN_ACTIVE_ROWVERSION}
	 * labeled alternative in {@link TSqlSyb155Parser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterMIN_ACTIVE_ROWVERSION(TSqlSyb155Parser.MIN_ACTIVE_ROWVERSIONContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MIN_ACTIVE_ROWVERSION}
	 * labeled alternative in {@link TSqlSyb155Parser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitMIN_ACTIVE_ROWVERSION(TSqlSyb155Parser.MIN_ACTIVE_ROWVERSIONContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NULLIF}
	 * labeled alternative in {@link TSqlSyb155Parser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterNULLIF(TSqlSyb155Parser.NULLIFContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NULLIF}
	 * labeled alternative in {@link TSqlSyb155Parser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitNULLIF(TSqlSyb155Parser.NULLIFContext ctx);
	/**
	 * Enter a parse tree produced by the {@code STUFF}
	 * labeled alternative in {@link TSqlSyb155Parser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterSTUFF(TSqlSyb155Parser.STUFFContext ctx);
	/**
	 * Exit a parse tree produced by the {@code STUFF}
	 * labeled alternative in {@link TSqlSyb155Parser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitSTUFF(TSqlSyb155Parser.STUFFContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SESSION_USER}
	 * labeled alternative in {@link TSqlSyb155Parser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterSESSION_USER(TSqlSyb155Parser.SESSION_USERContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SESSION_USER}
	 * labeled alternative in {@link TSqlSyb155Parser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitSESSION_USER(TSqlSyb155Parser.SESSION_USERContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SYSTEM_USER}
	 * labeled alternative in {@link TSqlSyb155Parser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterSYSTEM_USER(TSqlSyb155Parser.SYSTEM_USERContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SYSTEM_USER}
	 * labeled alternative in {@link TSqlSyb155Parser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitSYSTEM_USER(TSqlSyb155Parser.SYSTEM_USERContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ISNULL}
	 * labeled alternative in {@link TSqlSyb155Parser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterISNULL(TSqlSyb155Parser.ISNULLContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ISNULL}
	 * labeled alternative in {@link TSqlSyb155Parser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitISNULL(TSqlSyb155Parser.ISNULLContext ctx);
	/**
	 * Enter a parse tree produced by the {@code XML_DATA_TYPE_FUNC}
	 * labeled alternative in {@link TSqlSyb155Parser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterXML_DATA_TYPE_FUNC(TSqlSyb155Parser.XML_DATA_TYPE_FUNCContext ctx);
	/**
	 * Exit a parse tree produced by the {@code XML_DATA_TYPE_FUNC}
	 * labeled alternative in {@link TSqlSyb155Parser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitXML_DATA_TYPE_FUNC(TSqlSyb155Parser.XML_DATA_TYPE_FUNCContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#xml_data_type_methods}.
	 * @param ctx the parse tree
	 */
	void enterXml_data_type_methods(TSqlSyb155Parser.Xml_data_type_methodsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#xml_data_type_methods}.
	 * @param ctx the parse tree
	 */
	void exitXml_data_type_methods(TSqlSyb155Parser.Xml_data_type_methodsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#value_method}.
	 * @param ctx the parse tree
	 */
	void enterValue_method(TSqlSyb155Parser.Value_methodContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#value_method}.
	 * @param ctx the parse tree
	 */
	void exitValue_method(TSqlSyb155Parser.Value_methodContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#query_method}.
	 * @param ctx the parse tree
	 */
	void enterQuery_method(TSqlSyb155Parser.Query_methodContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#query_method}.
	 * @param ctx the parse tree
	 */
	void exitQuery_method(TSqlSyb155Parser.Query_methodContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#exist_method}.
	 * @param ctx the parse tree
	 */
	void enterExist_method(TSqlSyb155Parser.Exist_methodContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#exist_method}.
	 * @param ctx the parse tree
	 */
	void exitExist_method(TSqlSyb155Parser.Exist_methodContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#modify_method}.
	 * @param ctx the parse tree
	 */
	void enterModify_method(TSqlSyb155Parser.Modify_methodContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#modify_method}.
	 * @param ctx the parse tree
	 */
	void exitModify_method(TSqlSyb155Parser.Modify_methodContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#nodes_method}.
	 * @param ctx the parse tree
	 */
	void enterNodes_method(TSqlSyb155Parser.Nodes_methodContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#nodes_method}.
	 * @param ctx the parse tree
	 */
	void exitNodes_method(TSqlSyb155Parser.Nodes_methodContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#switch_section}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_section(TSqlSyb155Parser.Switch_sectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#switch_section}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_section(TSqlSyb155Parser.Switch_sectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#switch_search_condition_section}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_search_condition_section(TSqlSyb155Parser.Switch_search_condition_sectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#switch_search_condition_section}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_search_condition_section(TSqlSyb155Parser.Switch_search_condition_sectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#as_column_alias}.
	 * @param ctx the parse tree
	 */
	void enterAs_column_alias(TSqlSyb155Parser.As_column_aliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#as_column_alias}.
	 * @param ctx the parse tree
	 */
	void exitAs_column_alias(TSqlSyb155Parser.As_column_aliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#as_table_alias}.
	 * @param ctx the parse tree
	 */
	void enterAs_table_alias(TSqlSyb155Parser.As_table_aliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#as_table_alias}.
	 * @param ctx the parse tree
	 */
	void exitAs_table_alias(TSqlSyb155Parser.As_table_aliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#table_alias}.
	 * @param ctx the parse tree
	 */
	void enterTable_alias(TSqlSyb155Parser.Table_aliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#table_alias}.
	 * @param ctx the parse tree
	 */
	void exitTable_alias(TSqlSyb155Parser.Table_aliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#with_table_hints}.
	 * @param ctx the parse tree
	 */
	void enterWith_table_hints(TSqlSyb155Parser.With_table_hintsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#with_table_hints}.
	 * @param ctx the parse tree
	 */
	void exitWith_table_hints(TSqlSyb155Parser.With_table_hintsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#insert_with_table_hints}.
	 * @param ctx the parse tree
	 */
	void enterInsert_with_table_hints(TSqlSyb155Parser.Insert_with_table_hintsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#insert_with_table_hints}.
	 * @param ctx the parse tree
	 */
	void exitInsert_with_table_hints(TSqlSyb155Parser.Insert_with_table_hintsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#table_hint}.
	 * @param ctx the parse tree
	 */
	void enterTable_hint(TSqlSyb155Parser.Table_hintContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#table_hint}.
	 * @param ctx the parse tree
	 */
	void exitTable_hint(TSqlSyb155Parser.Table_hintContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#index_value}.
	 * @param ctx the parse tree
	 */
	void enterIndex_value(TSqlSyb155Parser.Index_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#index_value}.
	 * @param ctx the parse tree
	 */
	void exitIndex_value(TSqlSyb155Parser.Index_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#column_alias_list}.
	 * @param ctx the parse tree
	 */
	void enterColumn_alias_list(TSqlSyb155Parser.Column_alias_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#column_alias_list}.
	 * @param ctx the parse tree
	 */
	void exitColumn_alias_list(TSqlSyb155Parser.Column_alias_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#column_alias}.
	 * @param ctx the parse tree
	 */
	void enterColumn_alias(TSqlSyb155Parser.Column_aliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#column_alias}.
	 * @param ctx the parse tree
	 */
	void exitColumn_alias(TSqlSyb155Parser.Column_aliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#table_value_constructor}.
	 * @param ctx the parse tree
	 */
	void enterTable_value_constructor(TSqlSyb155Parser.Table_value_constructorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#table_value_constructor}.
	 * @param ctx the parse tree
	 */
	void exitTable_value_constructor(TSqlSyb155Parser.Table_value_constructorContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#expression_list}.
	 * @param ctx the parse tree
	 */
	void enterExpression_list(TSqlSyb155Parser.Expression_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#expression_list}.
	 * @param ctx the parse tree
	 */
	void exitExpression_list(TSqlSyb155Parser.Expression_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#ranking_windowed_function}.
	 * @param ctx the parse tree
	 */
	void enterRanking_windowed_function(TSqlSyb155Parser.Ranking_windowed_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#ranking_windowed_function}.
	 * @param ctx the parse tree
	 */
	void exitRanking_windowed_function(TSqlSyb155Parser.Ranking_windowed_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#aggregate_windowed_function}.
	 * @param ctx the parse tree
	 */
	void enterAggregate_windowed_function(TSqlSyb155Parser.Aggregate_windowed_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#aggregate_windowed_function}.
	 * @param ctx the parse tree
	 */
	void exitAggregate_windowed_function(TSqlSyb155Parser.Aggregate_windowed_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#analytic_windowed_function}.
	 * @param ctx the parse tree
	 */
	void enterAnalytic_windowed_function(TSqlSyb155Parser.Analytic_windowed_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#analytic_windowed_function}.
	 * @param ctx the parse tree
	 */
	void exitAnalytic_windowed_function(TSqlSyb155Parser.Analytic_windowed_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#all_distinct_expression}.
	 * @param ctx the parse tree
	 */
	void enterAll_distinct_expression(TSqlSyb155Parser.All_distinct_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#all_distinct_expression}.
	 * @param ctx the parse tree
	 */
	void exitAll_distinct_expression(TSqlSyb155Parser.All_distinct_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#over_clause}.
	 * @param ctx the parse tree
	 */
	void enterOver_clause(TSqlSyb155Parser.Over_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#over_clause}.
	 * @param ctx the parse tree
	 */
	void exitOver_clause(TSqlSyb155Parser.Over_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#row_or_range_clause}.
	 * @param ctx the parse tree
	 */
	void enterRow_or_range_clause(TSqlSyb155Parser.Row_or_range_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#row_or_range_clause}.
	 * @param ctx the parse tree
	 */
	void exitRow_or_range_clause(TSqlSyb155Parser.Row_or_range_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#window_frame_extent}.
	 * @param ctx the parse tree
	 */
	void enterWindow_frame_extent(TSqlSyb155Parser.Window_frame_extentContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#window_frame_extent}.
	 * @param ctx the parse tree
	 */
	void exitWindow_frame_extent(TSqlSyb155Parser.Window_frame_extentContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#window_frame_bound}.
	 * @param ctx the parse tree
	 */
	void enterWindow_frame_bound(TSqlSyb155Parser.Window_frame_boundContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#window_frame_bound}.
	 * @param ctx the parse tree
	 */
	void exitWindow_frame_bound(TSqlSyb155Parser.Window_frame_boundContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#window_frame_preceding}.
	 * @param ctx the parse tree
	 */
	void enterWindow_frame_preceding(TSqlSyb155Parser.Window_frame_precedingContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#window_frame_preceding}.
	 * @param ctx the parse tree
	 */
	void exitWindow_frame_preceding(TSqlSyb155Parser.Window_frame_precedingContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#window_frame_following}.
	 * @param ctx the parse tree
	 */
	void enterWindow_frame_following(TSqlSyb155Parser.Window_frame_followingContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#window_frame_following}.
	 * @param ctx the parse tree
	 */
	void exitWindow_frame_following(TSqlSyb155Parser.Window_frame_followingContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#create_database_option}.
	 * @param ctx the parse tree
	 */
	void enterCreate_database_option(TSqlSyb155Parser.Create_database_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#create_database_option}.
	 * @param ctx the parse tree
	 */
	void exitCreate_database_option(TSqlSyb155Parser.Create_database_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#database_filestream_option}.
	 * @param ctx the parse tree
	 */
	void enterDatabase_filestream_option(TSqlSyb155Parser.Database_filestream_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#database_filestream_option}.
	 * @param ctx the parse tree
	 */
	void exitDatabase_filestream_option(TSqlSyb155Parser.Database_filestream_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#database_file_spec}.
	 * @param ctx the parse tree
	 */
	void enterDatabase_file_spec(TSqlSyb155Parser.Database_file_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#database_file_spec}.
	 * @param ctx the parse tree
	 */
	void exitDatabase_file_spec(TSqlSyb155Parser.Database_file_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#file_group}.
	 * @param ctx the parse tree
	 */
	void enterFile_group(TSqlSyb155Parser.File_groupContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#file_group}.
	 * @param ctx the parse tree
	 */
	void exitFile_group(TSqlSyb155Parser.File_groupContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#file_spec}.
	 * @param ctx the parse tree
	 */
	void enterFile_spec(TSqlSyb155Parser.File_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#file_spec}.
	 * @param ctx the parse tree
	 */
	void exitFile_spec(TSqlSyb155Parser.File_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#entity_name}.
	 * @param ctx the parse tree
	 */
	void enterEntity_name(TSqlSyb155Parser.Entity_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#entity_name}.
	 * @param ctx the parse tree
	 */
	void exitEntity_name(TSqlSyb155Parser.Entity_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#entity_name_for_azure_dw}.
	 * @param ctx the parse tree
	 */
	void enterEntity_name_for_azure_dw(TSqlSyb155Parser.Entity_name_for_azure_dwContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#entity_name_for_azure_dw}.
	 * @param ctx the parse tree
	 */
	void exitEntity_name_for_azure_dw(TSqlSyb155Parser.Entity_name_for_azure_dwContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#entity_name_for_parallel_dw}.
	 * @param ctx the parse tree
	 */
	void enterEntity_name_for_parallel_dw(TSqlSyb155Parser.Entity_name_for_parallel_dwContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#entity_name_for_parallel_dw}.
	 * @param ctx the parse tree
	 */
	void exitEntity_name_for_parallel_dw(TSqlSyb155Parser.Entity_name_for_parallel_dwContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#full_table_name}.
	 * @param ctx the parse tree
	 */
	void enterFull_table_name(TSqlSyb155Parser.Full_table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#full_table_name}.
	 * @param ctx the parse tree
	 */
	void exitFull_table_name(TSqlSyb155Parser.Full_table_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#table_name}.
	 * @param ctx the parse tree
	 */
	void enterTable_name(TSqlSyb155Parser.Table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#table_name}.
	 * @param ctx the parse tree
	 */
	void exitTable_name(TSqlSyb155Parser.Table_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#simple_name}.
	 * @param ctx the parse tree
	 */
	void enterSimple_name(TSqlSyb155Parser.Simple_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#simple_name}.
	 * @param ctx the parse tree
	 */
	void exitSimple_name(TSqlSyb155Parser.Simple_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#func_proc_name}.
	 * @param ctx the parse tree
	 */
	void enterFunc_proc_name(TSqlSyb155Parser.Func_proc_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#func_proc_name}.
	 * @param ctx the parse tree
	 */
	void exitFunc_proc_name(TSqlSyb155Parser.Func_proc_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#ddl_object}.
	 * @param ctx the parse tree
	 */
	void enterDdl_object(TSqlSyb155Parser.Ddl_objectContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#ddl_object}.
	 * @param ctx the parse tree
	 */
	void exitDdl_object(TSqlSyb155Parser.Ddl_objectContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#full_column_name}.
	 * @param ctx the parse tree
	 */
	void enterFull_column_name(TSqlSyb155Parser.Full_column_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#full_column_name}.
	 * @param ctx the parse tree
	 */
	void exitFull_column_name(TSqlSyb155Parser.Full_column_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#column_name_list_with_order}.
	 * @param ctx the parse tree
	 */
	void enterColumn_name_list_with_order(TSqlSyb155Parser.Column_name_list_with_orderContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#column_name_list_with_order}.
	 * @param ctx the parse tree
	 */
	void exitColumn_name_list_with_order(TSqlSyb155Parser.Column_name_list_with_orderContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#column_name_list}.
	 * @param ctx the parse tree
	 */
	void enterColumn_name_list(TSqlSyb155Parser.Column_name_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#column_name_list}.
	 * @param ctx the parse tree
	 */
	void exitColumn_name_list(TSqlSyb155Parser.Column_name_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#cursor_name}.
	 * @param ctx the parse tree
	 */
	void enterCursor_name(TSqlSyb155Parser.Cursor_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#cursor_name}.
	 * @param ctx the parse tree
	 */
	void exitCursor_name(TSqlSyb155Parser.Cursor_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#on_off}.
	 * @param ctx the parse tree
	 */
	void enterOn_off(TSqlSyb155Parser.On_offContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#on_off}.
	 * @param ctx the parse tree
	 */
	void exitOn_off(TSqlSyb155Parser.On_offContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#clustered}.
	 * @param ctx the parse tree
	 */
	void enterClustered(TSqlSyb155Parser.ClusteredContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#clustered}.
	 * @param ctx the parse tree
	 */
	void exitClustered(TSqlSyb155Parser.ClusteredContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#null_notnull}.
	 * @param ctx the parse tree
	 */
	void enterNull_notnull(TSqlSyb155Parser.Null_notnullContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#null_notnull}.
	 * @param ctx the parse tree
	 */
	void exitNull_notnull(TSqlSyb155Parser.Null_notnullContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#null_or_default}.
	 * @param ctx the parse tree
	 */
	void enterNull_or_default(TSqlSyb155Parser.Null_or_defaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#null_or_default}.
	 * @param ctx the parse tree
	 */
	void exitNull_or_default(TSqlSyb155Parser.Null_or_defaultContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#scalar_function_name}.
	 * @param ctx the parse tree
	 */
	void enterScalar_function_name(TSqlSyb155Parser.Scalar_function_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#scalar_function_name}.
	 * @param ctx the parse tree
	 */
	void exitScalar_function_name(TSqlSyb155Parser.Scalar_function_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#begin_conversation_timer}.
	 * @param ctx the parse tree
	 */
	void enterBegin_conversation_timer(TSqlSyb155Parser.Begin_conversation_timerContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#begin_conversation_timer}.
	 * @param ctx the parse tree
	 */
	void exitBegin_conversation_timer(TSqlSyb155Parser.Begin_conversation_timerContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#begin_conversation_dialog}.
	 * @param ctx the parse tree
	 */
	void enterBegin_conversation_dialog(TSqlSyb155Parser.Begin_conversation_dialogContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#begin_conversation_dialog}.
	 * @param ctx the parse tree
	 */
	void exitBegin_conversation_dialog(TSqlSyb155Parser.Begin_conversation_dialogContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#contract_name}.
	 * @param ctx the parse tree
	 */
	void enterContract_name(TSqlSyb155Parser.Contract_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#contract_name}.
	 * @param ctx the parse tree
	 */
	void exitContract_name(TSqlSyb155Parser.Contract_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#service_name}.
	 * @param ctx the parse tree
	 */
	void enterService_name(TSqlSyb155Parser.Service_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#service_name}.
	 * @param ctx the parse tree
	 */
	void exitService_name(TSqlSyb155Parser.Service_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#end_conversation}.
	 * @param ctx the parse tree
	 */
	void enterEnd_conversation(TSqlSyb155Parser.End_conversationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#end_conversation}.
	 * @param ctx the parse tree
	 */
	void exitEnd_conversation(TSqlSyb155Parser.End_conversationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#waitfor_conversation}.
	 * @param ctx the parse tree
	 */
	void enterWaitfor_conversation(TSqlSyb155Parser.Waitfor_conversationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#waitfor_conversation}.
	 * @param ctx the parse tree
	 */
	void exitWaitfor_conversation(TSqlSyb155Parser.Waitfor_conversationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#get_conversation}.
	 * @param ctx the parse tree
	 */
	void enterGet_conversation(TSqlSyb155Parser.Get_conversationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#get_conversation}.
	 * @param ctx the parse tree
	 */
	void exitGet_conversation(TSqlSyb155Parser.Get_conversationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#queue_id}.
	 * @param ctx the parse tree
	 */
	void enterQueue_id(TSqlSyb155Parser.Queue_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#queue_id}.
	 * @param ctx the parse tree
	 */
	void exitQueue_id(TSqlSyb155Parser.Queue_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#send_conversation}.
	 * @param ctx the parse tree
	 */
	void enterSend_conversation(TSqlSyb155Parser.Send_conversationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#send_conversation}.
	 * @param ctx the parse tree
	 */
	void exitSend_conversation(TSqlSyb155Parser.Send_conversationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#data_type}.
	 * @param ctx the parse tree
	 */
	void enterData_type(TSqlSyb155Parser.Data_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#data_type}.
	 * @param ctx the parse tree
	 */
	void exitData_type(TSqlSyb155Parser.Data_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#default_value}.
	 * @param ctx the parse tree
	 */
	void enterDefault_value(TSqlSyb155Parser.Default_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#default_value}.
	 * @param ctx the parse tree
	 */
	void exitDefault_value(TSqlSyb155Parser.Default_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(TSqlSyb155Parser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(TSqlSyb155Parser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#sign}.
	 * @param ctx the parse tree
	 */
	void enterSign(TSqlSyb155Parser.SignContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#sign}.
	 * @param ctx the parse tree
	 */
	void exitSign(TSqlSyb155Parser.SignContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(TSqlSyb155Parser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(TSqlSyb155Parser.IdContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#simple_id}.
	 * @param ctx the parse tree
	 */
	void enterSimple_id(TSqlSyb155Parser.Simple_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#simple_id}.
	 * @param ctx the parse tree
	 */
	void exitSimple_id(TSqlSyb155Parser.Simple_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#comparison_operator}.
	 * @param ctx the parse tree
	 */
	void enterComparison_operator(TSqlSyb155Parser.Comparison_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#comparison_operator}.
	 * @param ctx the parse tree
	 */
	void exitComparison_operator(TSqlSyb155Parser.Comparison_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#assignment_operator}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_operator(TSqlSyb155Parser.Assignment_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#assignment_operator}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_operator(TSqlSyb155Parser.Assignment_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlSyb155Parser#file_size}.
	 * @param ctx the parse tree
	 */
	void enterFile_size(TSqlSyb155Parser.File_sizeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlSyb155Parser#file_size}.
	 * @param ctx the parse tree
	 */
	void exitFile_size(TSqlSyb155Parser.File_sizeContext ctx);
}