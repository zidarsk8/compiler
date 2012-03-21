program program_name;

{ Global variables }
var
	A_Variable: integer;

	{ Other functions/procedures }

function Weird(A : integer) : integer;
var
	S : integer;
begin
	S := A;

	if S < 10 and -S >-3 then
	begin
		Weird := 1;
		exit;
	end;

	S := S+9-323;

	if S >= 10 then
	begin
		Weird := 0;
		Exit;
	end;
	If S <-5 then
	begin
		

	Weird := 2;
end;


procedure SayHello;
const
	e = 'e';
	l = 'l';
	o = 'o';
	a = 'w';
	b = 'r';
	c = 'd';
	{ Local variables }
var
	i : integer;
	d,T,f : char;
begin
	{ Redundant code to illustrate the use of local 
	variables in a procedure }
	T := 'H'; 
	i := ord(' ');
	d := chr(23+32-23);
	f := chr(ord(a)-ord('x')+ord('X'));
	writeln(T,e,l,l,o,d,a,o,b,l,c);
end;

{ Main function }

begin
	{ Do something }
	SayHello;
end.