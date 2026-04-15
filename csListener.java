// Generated from cs.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link csParser}.
 */
public interface csListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link csParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(csParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link csParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(csParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link csParser#classe}.
	 * @param ctx the parse tree
	 */
	void enterClasse(csParser.ClasseContext ctx);
	/**
	 * Exit a parse tree produced by {@link csParser#classe}.
	 * @param ctx the parse tree
	 */
	void exitClasse(csParser.ClasseContext ctx);
	/**
	 * Enter a parse tree produced by {@link csParser#membroClasse}.
	 * @param ctx the parse tree
	 */
	void enterMembroClasse(csParser.MembroClasseContext ctx);
	/**
	 * Exit a parse tree produced by {@link csParser#membroClasse}.
	 * @param ctx the parse tree
	 */
	void exitMembroClasse(csParser.MembroClasseContext ctx);
	/**
	 * Enter a parse tree produced by {@link csParser#metodo}.
	 * @param ctx the parse tree
	 */
	void enterMetodo(csParser.MetodoContext ctx);
	/**
	 * Exit a parse tree produced by {@link csParser#metodo}.
	 * @param ctx the parse tree
	 */
	void exitMetodo(csParser.MetodoContext ctx);
	/**
	 * Enter a parse tree produced by {@link csParser#parametroLista}.
	 * @param ctx the parse tree
	 */
	void enterParametroLista(csParser.ParametroListaContext ctx);
	/**
	 * Exit a parse tree produced by {@link csParser#parametroLista}.
	 * @param ctx the parse tree
	 */
	void exitParametroLista(csParser.ParametroListaContext ctx);
	/**
	 * Enter a parse tree produced by {@link csParser#parametro}.
	 * @param ctx the parse tree
	 */
	void enterParametro(csParser.ParametroContext ctx);
	/**
	 * Exit a parse tree produced by {@link csParser#parametro}.
	 * @param ctx the parse tree
	 */
	void exitParametro(csParser.ParametroContext ctx);
	/**
	 * Enter a parse tree produced by {@link csParser#variavel}.
	 * @param ctx the parse tree
	 */
	void enterVariavel(csParser.VariavelContext ctx);
	/**
	 * Exit a parse tree produced by {@link csParser#variavel}.
	 * @param ctx the parse tree
	 */
	void exitVariavel(csParser.VariavelContext ctx);
	/**
	 * Enter a parse tree produced by {@link csParser#bloco}.
	 * @param ctx the parse tree
	 */
	void enterBloco(csParser.BlocoContext ctx);
	/**
	 * Exit a parse tree produced by {@link csParser#bloco}.
	 * @param ctx the parse tree
	 */
	void exitBloco(csParser.BlocoContext ctx);
	/**
	 * Enter a parse tree produced by {@link csParser#instrucao}.
	 * @param ctx the parse tree
	 */
	void enterInstrucao(csParser.InstrucaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link csParser#instrucao}.
	 * @param ctx the parse tree
	 */
	void exitInstrucao(csParser.InstrucaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link csParser#retorno}.
	 * @param ctx the parse tree
	 */
	void enterRetorno(csParser.RetornoContext ctx);
	/**
	 * Exit a parse tree produced by {@link csParser#retorno}.
	 * @param ctx the parse tree
	 */
	void exitRetorno(csParser.RetornoContext ctx);
	/**
	 * Enter a parse tree produced by {@link csParser#chamadaMetodo}.
	 * @param ctx the parse tree
	 */
	void enterChamadaMetodo(csParser.ChamadaMetodoContext ctx);
	/**
	 * Exit a parse tree produced by {@link csParser#chamadaMetodo}.
	 * @param ctx the parse tree
	 */
	void exitChamadaMetodo(csParser.ChamadaMetodoContext ctx);
	/**
	 * Enter a parse tree produced by {@link csParser#argumentoLista}.
	 * @param ctx the parse tree
	 */
	void enterArgumentoLista(csParser.ArgumentoListaContext ctx);
	/**
	 * Exit a parse tree produced by {@link csParser#argumentoLista}.
	 * @param ctx the parse tree
	 */
	void exitArgumentoLista(csParser.ArgumentoListaContext ctx);
	/**
	 * Enter a parse tree produced by {@link csParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterExpressao(csParser.ExpressaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link csParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitExpressao(csParser.ExpressaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link csParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(csParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link csParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(csParser.TipoContext ctx);
}