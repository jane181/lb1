grammar lb1;

WS : [\t | \n | \r | ' ']+ -> skip;
LINE_COMMENT : '//' .*? '\r'?'\n' -> skip;
COMMENT : '/*' .*? '*/' -> skip;

//语法
compUnit : funcDef;
funcDef  : funcType ident '(' ')' block;
block    : '{' stmt '}';
stmt     : 'return' number ';';
number   : decimalconst | octalconst | hexadecimalconst;

//词法
decimalconst      : nonzerodigit digit*;
octalconst        : '0' ( octaldigit*);
hexadecimalconst  : hexadecimalprefix hexadecimaldigit hexadecimaldigit*;
hexadecimalprefix : '0x' | '0X';
nonzerodigit      : '1' | '2' | '3' | '4' | '5' | '6' | '7' | '8' | '9';
octaldigit        : '0' | '1' | '2' | '3' | '4' | '5' | '6' | '7';
digit              : '0' | nonzerodigit;
hexadecimaldigit  :digit| 'a' | 'b' | 'c' | 'd' | 'e' | 'f' | 'A' | 'B' | 'C' | 'D' | 'E' | 'F';
funcType : 'int';
ident    : 'main';
