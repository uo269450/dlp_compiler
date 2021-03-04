lexer grammar Lexicon;

COLON:':';

SEMICOLON:';';

REAL: 'float';

INT: 'int';

CHAR: 'char';

RETURN: 'return';

READ: 'read';

PRINT: 'printsp'|'print'|'println'; 

LITENT : [0-9]+;

LITFLOAT: [0-9]+'.'[0-9]+;

LITCHAR: '\''~[\r\n]'\''|'\'\\n\'';

IDENT: [A-Za-z]+LITENT?;

COMMENT_BLOCK: '/*'.*? '*/' -> skip; 

COMMENT_LINE: '//'.*?[\n]->skip;

WHITESPACE : [ \t\r\n]+ -> skip;


