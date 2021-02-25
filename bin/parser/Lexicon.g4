lexer grammar Lexicon;

COMMENT: '/*'.*? '*/' -> skip; 

REAL: 'real';

INT: 'int';

READ: 'read';

LITENT : [0-9]+;

LITREAL: [0-9]+'.'[0-9]+;

PRINT: 'print'; 

IDENT: [A-Za-z]+;

WHITESPACE : [ \t\r\n]+ -> skip;


