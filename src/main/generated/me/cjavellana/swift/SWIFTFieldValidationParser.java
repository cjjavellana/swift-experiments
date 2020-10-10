// Generated from me/cjavellana/swift/SWIFTFieldValidation.g4 by ANTLR 4.8
package me.cjavellana.swift;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SWIFTFieldValidationParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DIGIT=1, SUBFIELD=2, OPEN_BRACKET=3, CLOSE_BRACKET=4, ROW_BY_LEN_IND=5, 
		RANGE_IND=6, FIXED_LENGTH_IND=7, CHARSET=8, DIGITS=9, DIGITS_DEC_COMMA=10, 
		UPPER_HEX=11, UPPER_LETTERS=12, UPPER_ALPHANUM=13, SWIFT_CHARSET=14, WS=15, 
		LINE_BREAK=16;
	public static final int
		RULE_field = 0, RULE_lineEntry = 1, RULE_optionalComponentValidator = 2, 
		RULE_mandatoryComponentValidator = 3, RULE_componentValidators = 4, RULE_rowByLength = 5, 
		RULE_range = 6, RULE_maxLength = 7, RULE_fixedLength = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"field", "lineEntry", "optionalComponentValidator", "mandatoryComponentValidator", 
			"componentValidators", "rowByLength", "range", "maxLength", "fixedLength"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'['", "']'", "'*'", "'-'", "'!'", null, "'n'", "'d'", 
			"'h'", "'a'", "'c'", "'x'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "DIGIT", "SUBFIELD", "OPEN_BRACKET", "CLOSE_BRACKET", "ROW_BY_LEN_IND", 
			"RANGE_IND", "FIXED_LENGTH_IND", "CHARSET", "DIGITS", "DIGITS_DEC_COMMA", 
			"UPPER_HEX", "UPPER_LETTERS", "UPPER_ALPHANUM", "SWIFT_CHARSET", "WS", 
			"LINE_BREAK"
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
	public String getGrammarFileName() { return "SWIFTFieldValidation.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SWIFTFieldValidationParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class FieldContext extends ParserRuleContext {
		public List<LineEntryContext> lineEntry() {
			return getRuleContexts(LineEntryContext.class);
		}
		public LineEntryContext lineEntry(int i) {
			return getRuleContext(LineEntryContext.class,i);
		}
		public List<TerminalNode> LINE_BREAK() { return getTokens(SWIFTFieldValidationParser.LINE_BREAK); }
		public TerminalNode LINE_BREAK(int i) {
			return getToken(SWIFTFieldValidationParser.LINE_BREAK, i);
		}
		public List<TerminalNode> EOF() { return getTokens(SWIFTFieldValidationParser.EOF); }
		public TerminalNode EOF(int i) {
			return getToken(SWIFTFieldValidationParser.EOF, i);
		}
		public FieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SWIFTFieldValidationListener ) ((SWIFTFieldValidationListener)listener).enterField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SWIFTFieldValidationListener ) ((SWIFTFieldValidationListener)listener).exitField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SWIFTFieldValidationVisitor ) return ((SWIFTFieldValidationVisitor<? extends T>)visitor).visitField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldContext field() throws RecognitionException {
		FieldContext _localctx = new FieldContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_field);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DIGIT) | (1L << SUBFIELD) | (1L << OPEN_BRACKET))) != 0)) {
				{
				{
				setState(18);
				lineEntry();
				setState(23);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LINE_BREAK:
					{
					setState(19);
					match(LINE_BREAK);
					}
					break;
				case EOF:
				case DIGIT:
				case SUBFIELD:
				case OPEN_BRACKET:
					{
					setState(21);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
					case 1:
						{
						setState(20);
						match(EOF);
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(29);
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

	public static class LineEntryContext extends ParserRuleContext {
		public TerminalNode LINE_BREAK() { return getToken(SWIFTFieldValidationParser.LINE_BREAK, 0); }
		public List<MandatoryComponentValidatorContext> mandatoryComponentValidator() {
			return getRuleContexts(MandatoryComponentValidatorContext.class);
		}
		public MandatoryComponentValidatorContext mandatoryComponentValidator(int i) {
			return getRuleContext(MandatoryComponentValidatorContext.class,i);
		}
		public List<OptionalComponentValidatorContext> optionalComponentValidator() {
			return getRuleContexts(OptionalComponentValidatorContext.class);
		}
		public OptionalComponentValidatorContext optionalComponentValidator(int i) {
			return getRuleContext(OptionalComponentValidatorContext.class,i);
		}
		public TerminalNode EOF() { return getToken(SWIFTFieldValidationParser.EOF, 0); }
		public LineEntryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lineEntry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SWIFTFieldValidationListener ) ((SWIFTFieldValidationListener)listener).enterLineEntry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SWIFTFieldValidationListener ) ((SWIFTFieldValidationListener)listener).exitLineEntry(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SWIFTFieldValidationVisitor ) return ((SWIFTFieldValidationVisitor<? extends T>)visitor).visitLineEntry(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LineEntryContext lineEntry() throws RecognitionException {
		LineEntryContext _localctx = new LineEntryContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_lineEntry);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(32); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(32);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case DIGIT:
					case SUBFIELD:
						{
						setState(30);
						mandatoryComponentValidator();
						}
						break;
					case OPEN_BRACKET:
						{
						setState(31);
						optionalComponentValidator();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(34); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(40);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(36);
				match(LINE_BREAK);
				}
				break;
			case 2:
				{
				setState(38);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(37);
					match(EOF);
					}
					break;
				}
				}
				break;
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

	public static class OptionalComponentValidatorContext extends ParserRuleContext {
		public ComponentValidatorsContext validator;
		public TerminalNode OPEN_BRACKET() { return getToken(SWIFTFieldValidationParser.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(SWIFTFieldValidationParser.CLOSE_BRACKET, 0); }
		public ComponentValidatorsContext componentValidators() {
			return getRuleContext(ComponentValidatorsContext.class,0);
		}
		public OptionalComponentValidatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionalComponentValidator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SWIFTFieldValidationListener ) ((SWIFTFieldValidationListener)listener).enterOptionalComponentValidator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SWIFTFieldValidationListener ) ((SWIFTFieldValidationListener)listener).exitOptionalComponentValidator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SWIFTFieldValidationVisitor ) return ((SWIFTFieldValidationVisitor<? extends T>)visitor).visitOptionalComponentValidator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OptionalComponentValidatorContext optionalComponentValidator() throws RecognitionException {
		OptionalComponentValidatorContext _localctx = new OptionalComponentValidatorContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_optionalComponentValidator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			match(OPEN_BRACKET);
			setState(43);
			((OptionalComponentValidatorContext)_localctx).validator = componentValidators();
			setState(44);
			match(CLOSE_BRACKET);
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

	public static class MandatoryComponentValidatorContext extends ParserRuleContext {
		public ComponentValidatorsContext validator;
		public ComponentValidatorsContext componentValidators() {
			return getRuleContext(ComponentValidatorsContext.class,0);
		}
		public MandatoryComponentValidatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mandatoryComponentValidator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SWIFTFieldValidationListener ) ((SWIFTFieldValidationListener)listener).enterMandatoryComponentValidator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SWIFTFieldValidationListener ) ((SWIFTFieldValidationListener)listener).exitMandatoryComponentValidator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SWIFTFieldValidationVisitor ) return ((SWIFTFieldValidationVisitor<? extends T>)visitor).visitMandatoryComponentValidator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MandatoryComponentValidatorContext mandatoryComponentValidator() throws RecognitionException {
		MandatoryComponentValidatorContext _localctx = new MandatoryComponentValidatorContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_mandatoryComponentValidator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			((MandatoryComponentValidatorContext)_localctx).validator = componentValidators();
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

	public static class ComponentValidatorsContext extends ParserRuleContext {
		public FixedLengthContext fixedLength() {
			return getRuleContext(FixedLengthContext.class,0);
		}
		public MaxLengthContext maxLength() {
			return getRuleContext(MaxLengthContext.class,0);
		}
		public RangeContext range() {
			return getRuleContext(RangeContext.class,0);
		}
		public RowByLengthContext rowByLength() {
			return getRuleContext(RowByLengthContext.class,0);
		}
		public ComponentValidatorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componentValidators; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SWIFTFieldValidationListener ) ((SWIFTFieldValidationListener)listener).enterComponentValidators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SWIFTFieldValidationListener ) ((SWIFTFieldValidationListener)listener).exitComponentValidators(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SWIFTFieldValidationVisitor ) return ((SWIFTFieldValidationVisitor<? extends T>)visitor).visitComponentValidators(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentValidatorsContext componentValidators() throws RecognitionException {
		ComponentValidatorsContext _localctx = new ComponentValidatorsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_componentValidators);
		try {
			setState(52);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(48);
				fixedLength();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(49);
				maxLength();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(50);
				range();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(51);
				rowByLength();
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

	public static class RowByLengthContext extends ParserRuleContext {
		public Token row;
		public Token len;
		public Token allowed_chars;
		public TerminalNode ROW_BY_LEN_IND() { return getToken(SWIFTFieldValidationParser.ROW_BY_LEN_IND, 0); }
		public List<TerminalNode> DIGIT() { return getTokens(SWIFTFieldValidationParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(SWIFTFieldValidationParser.DIGIT, i);
		}
		public TerminalNode CHARSET() { return getToken(SWIFTFieldValidationParser.CHARSET, 0); }
		public TerminalNode SUBFIELD() { return getToken(SWIFTFieldValidationParser.SUBFIELD, 0); }
		public RowByLengthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rowByLength; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SWIFTFieldValidationListener ) ((SWIFTFieldValidationListener)listener).enterRowByLength(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SWIFTFieldValidationListener ) ((SWIFTFieldValidationListener)listener).exitRowByLength(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SWIFTFieldValidationVisitor ) return ((SWIFTFieldValidationVisitor<? extends T>)visitor).visitRowByLength(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RowByLengthContext rowByLength() throws RecognitionException {
		RowByLengthContext _localctx = new RowByLengthContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_rowByLength);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SUBFIELD) {
				{
				setState(54);
				match(SUBFIELD);
				}
			}

			setState(57);
			((RowByLengthContext)_localctx).row = match(DIGIT);
			setState(58);
			match(ROW_BY_LEN_IND);
			setState(59);
			((RowByLengthContext)_localctx).len = match(DIGIT);
			setState(60);
			((RowByLengthContext)_localctx).allowed_chars = match(CHARSET);
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

	public static class RangeContext extends ParserRuleContext {
		public Token min;
		public Token max;
		public Token allowed_chars;
		public TerminalNode RANGE_IND() { return getToken(SWIFTFieldValidationParser.RANGE_IND, 0); }
		public List<TerminalNode> DIGIT() { return getTokens(SWIFTFieldValidationParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(SWIFTFieldValidationParser.DIGIT, i);
		}
		public TerminalNode CHARSET() { return getToken(SWIFTFieldValidationParser.CHARSET, 0); }
		public TerminalNode SUBFIELD() { return getToken(SWIFTFieldValidationParser.SUBFIELD, 0); }
		public RangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_range; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SWIFTFieldValidationListener ) ((SWIFTFieldValidationListener)listener).enterRange(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SWIFTFieldValidationListener ) ((SWIFTFieldValidationListener)listener).exitRange(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SWIFTFieldValidationVisitor ) return ((SWIFTFieldValidationVisitor<? extends T>)visitor).visitRange(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RangeContext range() throws RecognitionException {
		RangeContext _localctx = new RangeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_range);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SUBFIELD) {
				{
				setState(62);
				match(SUBFIELD);
				}
			}

			setState(65);
			((RangeContext)_localctx).min = match(DIGIT);
			setState(66);
			match(RANGE_IND);
			setState(67);
			((RangeContext)_localctx).max = match(DIGIT);
			setState(68);
			((RangeContext)_localctx).allowed_chars = match(CHARSET);
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

	public static class MaxLengthContext extends ParserRuleContext {
		public Token length;
		public Token allowed_chars;
		public TerminalNode DIGIT() { return getToken(SWIFTFieldValidationParser.DIGIT, 0); }
		public TerminalNode CHARSET() { return getToken(SWIFTFieldValidationParser.CHARSET, 0); }
		public TerminalNode SUBFIELD() { return getToken(SWIFTFieldValidationParser.SUBFIELD, 0); }
		public MaxLengthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_maxLength; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SWIFTFieldValidationListener ) ((SWIFTFieldValidationListener)listener).enterMaxLength(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SWIFTFieldValidationListener ) ((SWIFTFieldValidationListener)listener).exitMaxLength(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SWIFTFieldValidationVisitor ) return ((SWIFTFieldValidationVisitor<? extends T>)visitor).visitMaxLength(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MaxLengthContext maxLength() throws RecognitionException {
		MaxLengthContext _localctx = new MaxLengthContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_maxLength);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SUBFIELD) {
				{
				setState(70);
				match(SUBFIELD);
				}
			}

			setState(73);
			((MaxLengthContext)_localctx).length = match(DIGIT);
			setState(74);
			((MaxLengthContext)_localctx).allowed_chars = match(CHARSET);
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

	public static class FixedLengthContext extends ParserRuleContext {
		public Token length;
		public Token allowed_chars;
		public TerminalNode FIXED_LENGTH_IND() { return getToken(SWIFTFieldValidationParser.FIXED_LENGTH_IND, 0); }
		public TerminalNode DIGIT() { return getToken(SWIFTFieldValidationParser.DIGIT, 0); }
		public TerminalNode CHARSET() { return getToken(SWIFTFieldValidationParser.CHARSET, 0); }
		public TerminalNode SUBFIELD() { return getToken(SWIFTFieldValidationParser.SUBFIELD, 0); }
		public FixedLengthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fixedLength; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SWIFTFieldValidationListener ) ((SWIFTFieldValidationListener)listener).enterFixedLength(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SWIFTFieldValidationListener ) ((SWIFTFieldValidationListener)listener).exitFixedLength(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SWIFTFieldValidationVisitor ) return ((SWIFTFieldValidationVisitor<? extends T>)visitor).visitFixedLength(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FixedLengthContext fixedLength() throws RecognitionException {
		FixedLengthContext _localctx = new FixedLengthContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_fixedLength);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SUBFIELD) {
				{
				setState(76);
				match(SUBFIELD);
				}
			}

			setState(79);
			((FixedLengthContext)_localctx).length = match(DIGIT);
			setState(80);
			match(FIXED_LENGTH_IND);
			setState(81);
			((FixedLengthContext)_localctx).allowed_chars = match(CHARSET);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\22V\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2\3\2"+
		"\5\2\30\n\2\5\2\32\n\2\7\2\34\n\2\f\2\16\2\37\13\2\3\3\3\3\6\3#\n\3\r"+
		"\3\16\3$\3\3\3\3\5\3)\n\3\5\3+\n\3\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6"+
		"\3\6\5\6\67\n\6\3\7\5\7:\n\7\3\7\3\7\3\7\3\7\3\7\3\b\5\bB\n\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\t\5\tJ\n\t\3\t\3\t\3\t\3\n\5\nP\n\n\3\n\3\n\3\n\3\n\3\n"+
		"\2\2\13\2\4\6\b\n\f\16\20\22\2\2\2Z\2\35\3\2\2\2\4\"\3\2\2\2\6,\3\2\2"+
		"\2\b\60\3\2\2\2\n\66\3\2\2\2\f9\3\2\2\2\16A\3\2\2\2\20I\3\2\2\2\22O\3"+
		"\2\2\2\24\31\5\4\3\2\25\32\7\22\2\2\26\30\7\2\2\3\27\26\3\2\2\2\27\30"+
		"\3\2\2\2\30\32\3\2\2\2\31\25\3\2\2\2\31\27\3\2\2\2\32\34\3\2\2\2\33\24"+
		"\3\2\2\2\34\37\3\2\2\2\35\33\3\2\2\2\35\36\3\2\2\2\36\3\3\2\2\2\37\35"+
		"\3\2\2\2 #\5\b\5\2!#\5\6\4\2\" \3\2\2\2\"!\3\2\2\2#$\3\2\2\2$\"\3\2\2"+
		"\2$%\3\2\2\2%*\3\2\2\2&+\7\22\2\2\')\7\2\2\3(\'\3\2\2\2()\3\2\2\2)+\3"+
		"\2\2\2*&\3\2\2\2*(\3\2\2\2+\5\3\2\2\2,-\7\5\2\2-.\5\n\6\2./\7\6\2\2/\7"+
		"\3\2\2\2\60\61\5\n\6\2\61\t\3\2\2\2\62\67\5\22\n\2\63\67\5\20\t\2\64\67"+
		"\5\16\b\2\65\67\5\f\7\2\66\62\3\2\2\2\66\63\3\2\2\2\66\64\3\2\2\2\66\65"+
		"\3\2\2\2\67\13\3\2\2\28:\7\4\2\298\3\2\2\29:\3\2\2\2:;\3\2\2\2;<\7\3\2"+
		"\2<=\7\7\2\2=>\7\3\2\2>?\7\n\2\2?\r\3\2\2\2@B\7\4\2\2A@\3\2\2\2AB\3\2"+
		"\2\2BC\3\2\2\2CD\7\3\2\2DE\7\b\2\2EF\7\3\2\2FG\7\n\2\2G\17\3\2\2\2HJ\7"+
		"\4\2\2IH\3\2\2\2IJ\3\2\2\2JK\3\2\2\2KL\7\3\2\2LM\7\n\2\2M\21\3\2\2\2N"+
		"P\7\4\2\2ON\3\2\2\2OP\3\2\2\2PQ\3\2\2\2QR\7\3\2\2RS\7\t\2\2ST\7\n\2\2"+
		"T\23\3\2\2\2\16\27\31\35\"$(*\669AIO";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}