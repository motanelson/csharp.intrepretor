// Generated from cs.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class csParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, ID=14, NUMBER=15, WS=16;
	public static final int
		RULE_programa = 0, RULE_classe = 1, RULE_membroClasse = 2, RULE_metodo = 3, 
		RULE_parametroLista = 4, RULE_parametro = 5, RULE_variavel = 6, RULE_bloco = 7, 
		RULE_instrucao = 8, RULE_retorno = 9, RULE_chamadaMetodo = 10, RULE_argumentoLista = 11, 
		RULE_expressao = 12, RULE_tipo = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "classe", "membroClasse", "metodo", "parametroLista", "parametro", 
			"variavel", "bloco", "instrucao", "retorno", "chamadaMetodo", "argumentoLista", 
			"expressao", "tipo"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'class'", "'{'", "'}'", "'('", "')'", "','", "'='", "';'", "'return'", 
			"'int'", "'float'", "'bool'", "'string'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "ID", "NUMBER", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "cs.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public csParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramaContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(csParser.EOF, 0); }
		public List<ClasseContext> classe() {
			return getRuleContexts(ClasseContext.class);
		}
		public ClasseContext classe(int i) {
			return getRuleContext(ClasseContext.class,i);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof csListener ) ((csListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof csListener ) ((csListener)listener).exitPrograma(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(28);
				classe();
				}
				}
				setState(33);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(34);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClasseContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(csParser.ID, 0); }
		public List<MembroClasseContext> membroClasse() {
			return getRuleContexts(MembroClasseContext.class);
		}
		public MembroClasseContext membroClasse(int i) {
			return getRuleContext(MembroClasseContext.class,i);
		}
		public ClasseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classe; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof csListener ) ((csListener)listener).enterClasse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof csListener ) ((csListener)listener).exitClasse(this);
		}
	}

	public final ClasseContext classe() throws RecognitionException {
		ClasseContext _localctx = new ClasseContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_classe);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			match(T__0);
			setState(37);
			match(ID);
			setState(38);
			match(T__1);
			setState(42);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << ID))) != 0)) {
				{
				{
				setState(39);
				membroClasse();
				}
				}
				setState(44);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(45);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MembroClasseContext extends ParserRuleContext {
		public MetodoContext metodo() {
			return getRuleContext(MetodoContext.class,0);
		}
		public VariavelContext variavel() {
			return getRuleContext(VariavelContext.class,0);
		}
		public MembroClasseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_membroClasse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof csListener ) ((csListener)listener).enterMembroClasse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof csListener ) ((csListener)listener).exitMembroClasse(this);
		}
	}

	public final MembroClasseContext membroClasse() throws RecognitionException {
		MembroClasseContext _localctx = new MembroClasseContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_membroClasse);
		try {
			setState(49);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(47);
				metodo();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(48);
				variavel();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MetodoContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode ID() { return getToken(csParser.ID, 0); }
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public ParametroListaContext parametroLista() {
			return getRuleContext(ParametroListaContext.class,0);
		}
		public MetodoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_metodo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof csListener ) ((csListener)listener).enterMetodo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof csListener ) ((csListener)listener).exitMetodo(this);
		}
	}

	public final MetodoContext metodo() throws RecognitionException {
		MetodoContext _localctx = new MetodoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_metodo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			tipo();
			setState(52);
			match(ID);
			setState(53);
			match(T__3);
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << ID))) != 0)) {
				{
				setState(54);
				parametroLista();
				}
			}

			setState(57);
			match(T__4);
			setState(58);
			bloco();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParametroListaContext extends ParserRuleContext {
		public List<ParametroContext> parametro() {
			return getRuleContexts(ParametroContext.class);
		}
		public ParametroContext parametro(int i) {
			return getRuleContext(ParametroContext.class,i);
		}
		public ParametroListaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametroLista; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof csListener ) ((csListener)listener).enterParametroLista(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof csListener ) ((csListener)listener).exitParametroLista(this);
		}
	}

	public final ParametroListaContext parametroLista() throws RecognitionException {
		ParametroListaContext _localctx = new ParametroListaContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_parametroLista);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			parametro();
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(61);
				match(T__5);
				setState(62);
				parametro();
				}
				}
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParametroContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode ID() { return getToken(csParser.ID, 0); }
		public ParametroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof csListener ) ((csListener)listener).enterParametro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof csListener ) ((csListener)listener).exitParametro(this);
		}
	}

	public final ParametroContext parametro() throws RecognitionException {
		ParametroContext _localctx = new ParametroContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_parametro);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			tipo();
			setState(69);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariavelContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode ID() { return getToken(csParser.ID, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public VariavelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variavel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof csListener ) ((csListener)listener).enterVariavel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof csListener ) ((csListener)listener).exitVariavel(this);
		}
	}

	public final VariavelContext variavel() throws RecognitionException {
		VariavelContext _localctx = new VariavelContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_variavel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			tipo();
			setState(72);
			match(ID);
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(73);
				match(T__6);
				setState(74);
				expressao();
				}
			}

			setState(77);
			match(T__7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlocoContext extends ParserRuleContext {
		public List<InstrucaoContext> instrucao() {
			return getRuleContexts(InstrucaoContext.class);
		}
		public InstrucaoContext instrucao(int i) {
			return getRuleContext(InstrucaoContext.class,i);
		}
		public BlocoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloco; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof csListener ) ((csListener)listener).enterBloco(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof csListener ) ((csListener)listener).exitBloco(this);
		}
	}

	public final BlocoContext bloco() throws RecognitionException {
		BlocoContext _localctx = new BlocoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_bloco);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(T__1);
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << ID))) != 0)) {
				{
				{
				setState(80);
				instrucao();
				}
				}
				setState(85);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(86);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InstrucaoContext extends ParserRuleContext {
		public VariavelContext variavel() {
			return getRuleContext(VariavelContext.class,0);
		}
		public ChamadaMetodoContext chamadaMetodo() {
			return getRuleContext(ChamadaMetodoContext.class,0);
		}
		public RetornoContext retorno() {
			return getRuleContext(RetornoContext.class,0);
		}
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public InstrucaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instrucao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof csListener ) ((csListener)listener).enterInstrucao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof csListener ) ((csListener)listener).exitInstrucao(this);
		}
	}

	public final InstrucaoContext instrucao() throws RecognitionException {
		InstrucaoContext _localctx = new InstrucaoContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_instrucao);
		try {
			setState(94);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(88);
				variavel();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(89);
				chamadaMetodo();
				setState(90);
				match(T__7);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(92);
				retorno();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(93);
				bloco();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RetornoContext extends ParserRuleContext {
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public RetornoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_retorno; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof csListener ) ((csListener)listener).enterRetorno(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof csListener ) ((csListener)listener).exitRetorno(this);
		}
	}

	public final RetornoContext retorno() throws RecognitionException {
		RetornoContext _localctx = new RetornoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_retorno);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			match(T__8);
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID || _la==NUMBER) {
				{
				setState(97);
				expressao();
				}
			}

			setState(100);
			match(T__7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ChamadaMetodoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(csParser.ID, 0); }
		public ArgumentoListaContext argumentoLista() {
			return getRuleContext(ArgumentoListaContext.class,0);
		}
		public ChamadaMetodoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chamadaMetodo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof csListener ) ((csListener)listener).enterChamadaMetodo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof csListener ) ((csListener)listener).exitChamadaMetodo(this);
		}
	}

	public final ChamadaMetodoContext chamadaMetodo() throws RecognitionException {
		ChamadaMetodoContext _localctx = new ChamadaMetodoContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_chamadaMetodo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(ID);
			setState(103);
			match(T__3);
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID || _la==NUMBER) {
				{
				setState(104);
				argumentoLista();
				}
			}

			setState(107);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentoListaContext extends ParserRuleContext {
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public ArgumentoListaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentoLista; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof csListener ) ((csListener)listener).enterArgumentoLista(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof csListener ) ((csListener)listener).exitArgumentoLista(this);
		}
	}

	public final ArgumentoListaContext argumentoLista() throws RecognitionException {
		ArgumentoListaContext _localctx = new ArgumentoListaContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_argumentoLista);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			expressao();
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(110);
				match(T__5);
				setState(111);
				expressao();
				}
				}
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressaoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(csParser.ID, 0); }
		public TerminalNode NUMBER() { return getToken(csParser.NUMBER, 0); }
		public ChamadaMetodoContext chamadaMetodo() {
			return getRuleContext(ChamadaMetodoContext.class,0);
		}
		public ExpressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof csListener ) ((csListener)listener).enterExpressao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof csListener ) ((csListener)listener).exitExpressao(this);
		}
	}

	public final ExpressaoContext expressao() throws RecognitionException {
		ExpressaoContext _localctx = new ExpressaoContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_expressao);
		try {
			setState(120);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(117);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(118);
				match(NUMBER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(119);
				chamadaMetodo();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TipoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(csParser.ID, 0); }
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof csListener ) ((csListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof csListener ) ((csListener)listener).exitTipo(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_tipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << ID))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\22\177\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\7\2 \n\2\f\2\16\2#\13\2\3"+
		"\2\3\2\3\3\3\3\3\3\3\3\7\3+\n\3\f\3\16\3.\13\3\3\3\3\3\3\4\3\4\5\4\64"+
		"\n\4\3\5\3\5\3\5\3\5\5\5:\n\5\3\5\3\5\3\5\3\6\3\6\3\6\7\6B\n\6\f\6\16"+
		"\6E\13\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\5\bN\n\b\3\b\3\b\3\t\3\t\7\tT\n\t"+
		"\f\t\16\tW\13\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\5\na\n\n\3\13\3\13\5\13"+
		"e\n\13\3\13\3\13\3\f\3\f\3\f\5\fl\n\f\3\f\3\f\3\r\3\r\3\r\7\rs\n\r\f\r"+
		"\16\rv\13\r\3\16\3\16\3\16\5\16{\n\16\3\17\3\17\3\17\2\2\20\2\4\6\b\n"+
		"\f\16\20\22\24\26\30\32\34\2\3\3\2\f\20\2\177\2!\3\2\2\2\4&\3\2\2\2\6"+
		"\63\3\2\2\2\b\65\3\2\2\2\n>\3\2\2\2\fF\3\2\2\2\16I\3\2\2\2\20Q\3\2\2\2"+
		"\22`\3\2\2\2\24b\3\2\2\2\26h\3\2\2\2\30o\3\2\2\2\32z\3\2\2\2\34|\3\2\2"+
		"\2\36 \5\4\3\2\37\36\3\2\2\2 #\3\2\2\2!\37\3\2\2\2!\"\3\2\2\2\"$\3\2\2"+
		"\2#!\3\2\2\2$%\7\2\2\3%\3\3\2\2\2&\'\7\3\2\2\'(\7\20\2\2(,\7\4\2\2)+\5"+
		"\6\4\2*)\3\2\2\2+.\3\2\2\2,*\3\2\2\2,-\3\2\2\2-/\3\2\2\2.,\3\2\2\2/\60"+
		"\7\5\2\2\60\5\3\2\2\2\61\64\5\b\5\2\62\64\5\16\b\2\63\61\3\2\2\2\63\62"+
		"\3\2\2\2\64\7\3\2\2\2\65\66\5\34\17\2\66\67\7\20\2\2\679\7\6\2\28:\5\n"+
		"\6\298\3\2\2\29:\3\2\2\2:;\3\2\2\2;<\7\7\2\2<=\5\20\t\2=\t\3\2\2\2>C\5"+
		"\f\7\2?@\7\b\2\2@B\5\f\7\2A?\3\2\2\2BE\3\2\2\2CA\3\2\2\2CD\3\2\2\2D\13"+
		"\3\2\2\2EC\3\2\2\2FG\5\34\17\2GH\7\20\2\2H\r\3\2\2\2IJ\5\34\17\2JM\7\20"+
		"\2\2KL\7\t\2\2LN\5\32\16\2MK\3\2\2\2MN\3\2\2\2NO\3\2\2\2OP\7\n\2\2P\17"+
		"\3\2\2\2QU\7\4\2\2RT\5\22\n\2SR\3\2\2\2TW\3\2\2\2US\3\2\2\2UV\3\2\2\2"+
		"VX\3\2\2\2WU\3\2\2\2XY\7\5\2\2Y\21\3\2\2\2Za\5\16\b\2[\\\5\26\f\2\\]\7"+
		"\n\2\2]a\3\2\2\2^a\5\24\13\2_a\5\20\t\2`Z\3\2\2\2`[\3\2\2\2`^\3\2\2\2"+
		"`_\3\2\2\2a\23\3\2\2\2bd\7\13\2\2ce\5\32\16\2dc\3\2\2\2de\3\2\2\2ef\3"+
		"\2\2\2fg\7\n\2\2g\25\3\2\2\2hi\7\20\2\2ik\7\6\2\2jl\5\30\r\2kj\3\2\2\2"+
		"kl\3\2\2\2lm\3\2\2\2mn\7\7\2\2n\27\3\2\2\2ot\5\32\16\2pq\7\b\2\2qs\5\32"+
		"\16\2rp\3\2\2\2sv\3\2\2\2tr\3\2\2\2tu\3\2\2\2u\31\3\2\2\2vt\3\2\2\2w{"+
		"\7\20\2\2x{\7\21\2\2y{\5\26\f\2zw\3\2\2\2zx\3\2\2\2zy\3\2\2\2{\33\3\2"+
		"\2\2|}\t\2\2\2}\35\3\2\2\2\16!,\639CMU`dktz";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}