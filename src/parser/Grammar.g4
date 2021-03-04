grammar Grammar;

import Lexicon;

start : program EOF;

program: (var_def+|struct+|function_block+)*;


sentencia: expresion'='expresion ';'
        |PRINT expresion ';'
        |READ expresion';'
        |if_block (else_block)?
        |while_block
        |function_call';'
         ;

//Block

function_block : IDENT'('((param_def )|(param_def(','param_def)*))?')'((':')
            tipo_primitivo)? '{' var_def* sentencia* (return_exp)?'}'
            ;

if_block: 'if' '(' boolexpr')''{'sentencia*  return_exp? '}'
            ;

else_block:'else' '{' sentencia* '}'
            ;

while_block:'while' '('boolexpr')''{'sentencia*'}'
            ;

struct: 'struct' IDENT '{' struckt_def*'}'';';

//definiciones

tipo_all: ('['LITENT']')+ tipo_all|tipo_primitivo|IDENT;

tipo_primitivo: REAL | INT |CHAR;

var_def: 'var' IDENT ':' tipo_all';'
            ;

struckt_def:IDENT ':' tipo_all';'
            |IDENT ':'('['LITENT']')+ tipo_all ';'
            ;

param_def: IDENT ':' tipo_primitivo;

//expresiones
return_exp:RETURN expresion';'
            |RETURN ';';

//function_call: IDENT ('('')'|'('((expresion )|(expresion(','expresion)+))')');

function_call: IDENT '('((expresion )|(expresion(','expresion)+))?')';


expresion: function_call
            |'('expresion')'
            |cast
            |expresion('+'|'-')expresion
            |expresion('*'|'/')expresion
            |ref
            |LITENT
            |LITFLOAT
            |LITCHAR
            |IDENT
            ;
            
cast:'<' tipo_primitivo '>' '('expresion')'
;

ref: IDENT ('['(IDENT|LITENT)']')*
    |ref'.'ref
    ;


boolexpr: boolexpr('!='|'<'|'>'|'=='|'<='|'>=')boolexpr
            |boolexpr('&&'|'||'|'!')boolexpr
            |'('boolexpr')'
            |LITENT
            |IDENT
            |LITFLOAT

;
