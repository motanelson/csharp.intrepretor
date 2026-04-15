grammar cs;

// =====================
// Programa
// =====================
programa : classe * EOF ;

// =====================
// Classes
// =====================
classe : 'class' ID '{' membroClasse* '}' ;

// =====================
// Membros
// =====================
membroClasse : metodo
             | variavel
             ;

// =====================
// Métodos
// =====================
metodo : tipo ID '(' parametroLista? ')' bloco ;

parametroLista : parametro (',' parametro)* ;

parametro : tipo ID ;

// =====================
// Variáveis
// =====================
variavel : tipo ID ( '=' expressao )? ';' ;

// =====================
// Blocos
// =====================
bloco : '{' instrucao* '}' ;

// =====================
// Instruções
// =====================
instrucao : variavel
          | chamadaMetodo ';'
          | retorno
          | bloco
          ;

// =====================
// Retorno
// =====================
retorno : 'return' expressao? ';' ;

// =====================
// Funções / chamadas
// =====================
chamadaMetodo : ID '(' argumentoLista? ')' ;

argumentoLista : expressao (',' expressao)* ;

// =====================
// Expressões (básico mas extensível)
// =====================
expressao : ID
          | NUMBER
          | chamadaMetodo ;

// =====================
// Tipos
// =====================
tipo : 'int' | 'float' | 'bool' | 'string' | ID ;

// =====================
// Lexer
// =====================
ID : [a-zA-Z_][a-zA-Z_0-9]* ;
NUMBER : [0-9]+ ;
WS : [ \t\r\n]+ -> skip ;
