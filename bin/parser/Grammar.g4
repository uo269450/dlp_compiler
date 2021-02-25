grammar Grammar;

import Lexicon;

start : data_block code_block EOF;

data_block: 'DATA' definicion+ ;


definicion: tipo IDENT ';';

tipo: REAL | INT ;

code_block: 'CODE' sentencia+;

sentencia: PRINT expresion';'
            |expresion'='expresion';'
            |READ expresion';'
            |if_block else_block
            |if_block
            |while_block
            ;


expresion: expresion'+'expresion
            |'<' tipo '>('expresion')'
            |'('expresion')'
            |LITENT
            |IDENT
            |LITREAL
            ;


if_block: 'if' '(' boolExpres')' '{' sentencia* '}';

else_block: 'else''{'sentencia*'}';

while_block: 'while' '(' boolExpres ')''{' sentencia* '}';

boolExpres: boolExpres'!='boolExpres
            |LITENT
            |IDENT
            |REAL
            ;


