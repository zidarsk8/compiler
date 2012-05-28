program kr_neki;
var 
	a : integer;
	b : integer;
	v : record
		a : integer;
		b : record
			a:integer
		end
	end;
	function f(i:integer):integer;
	begin
		f := i
	end;
begin
	v.b.a := 3
end.