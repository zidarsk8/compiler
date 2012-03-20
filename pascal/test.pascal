Program program_name;

{ Global variables }
Var
	A_Variable: integer;

	{ Other functions/procedures }

function Weird(A : integer) : Integer;
Var
	S : Integer;
Begin
	S := A;

	If S < 10 Then
	Begin
		Weird := 1;
		Exit;
	End;

	S := S + 9;

	If S >= 10 Then
	Begin
		Weird := 0;
		Exit;
	End;

	Weird := 2;
End;


Procedure SayHello;
const
	e = 'e';
	l = 'l';
	o = 'o';
	a = 'w';
	b = 'r';
	c = 'd';
	{ Local variables }
Var
	i : integer;
	d,T,f : char;
Begin
	{ Redundant code to illustrate the use of local 
	variables in a procedure }
	T := 'H'; 
	i := ord(' ');
	d := chr(23+32-23);
	f := chr(ord(a)-ord('x')+ord('X'));
	Writeln(T,e,l,l,o,d,a,o,b,l,c);
End;

{ Main function }

Begin
	{ Do something }
	SayHello;
End.
