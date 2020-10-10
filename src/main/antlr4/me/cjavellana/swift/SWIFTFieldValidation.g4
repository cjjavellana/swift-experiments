grammar SWIFTFieldValidation;

field
    : (lineEntry (LINE_BREAK | EOF?))*
    ;

lineEntry
    : (mandatoryComponentValidator | optionalComponentValidator)+ (LINE_BREAK | EOF?)
    ;

optionalComponentValidator
    : OPEN_BRACKET validator=componentValidators optionalComponentValidator* CLOSE_BRACKET;

mandatoryComponentValidator: validator=componentValidators;

componentValidators
    : fixedLength
    | maxLength
    | range
    | rowByLength
    ;

rowByLength
    : SUBFIELD? row=DIGIT ROW_BY_LEN_IND len=DIGIT allowed_chars=CHARSET
    ;

range: SUBFIELD? min=DIGIT RANGE_IND max=DIGIT allowed_chars=CHARSET
    ;

maxLength: SUBFIELD? length=DIGIT allowed_chars=CHARSET
    ;

fixedLength: SUBFIELD? length=DIGIT '!' allowed_chars=CHARSET
    ;

// lexer rules
DIGIT: [0-9]+;
SUBFIELD
    : '/'
    | '//'
    ;
OPEN_BRACKET: '[';
CLOSE_BRACKET: ']';

// Indicators
ROW_BY_LEN_IND: '*';
RANGE_IND: '-';
FIXED_LENGTH_IND: '!';

CHARSET
    : UPPER_ALPHANUM
    | SWIFT_CHARSET
    | DIGITS
    | DIGITS_DEC_COMMA
    | UPPER_HEX
    | UPPER_LETTERS
    ;

DIGITS: 'n';
DIGITS_DEC_COMMA: 'd';
UPPER_HEX: 'h';
UPPER_LETTERS: 'a';
UPPER_ALPHANUM: 'c';
SWIFT_CHARSET: 'x';

WS: (' ' | '\t')+ -> skip;

LINE_BREAK
  :  '\r'? '\n'
  |  '\r'
  |  '\n'
  ;
