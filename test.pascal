program kr_neki;
	const 
		f = 2;
		t = f*5;
	type
		int = integer;
		r = record
			a:integer;
			bb:integer;
			c : record
				a:int
			end
		end; 
	var 
		a : r;
		b : integer;
		c : ^r;
		d : ^^r;
		e : ^integer;
		lol : ^array [f-2..t+2] of r;
		what : array [1..0] of ^array[f-2..t+2] of char;
		wh : array[f-2..t+2] of char;
	
	function loll(e:integer) : ^array [f-2..t+2] of r;
		procedure taPaResNicNeDela(a:int;rr:r);
		begin
			rr.a :=a;
			
			what[33] := ^wh;
			what[0]^[0] := 'a'
		end;
	begin
		e := 2;
		d := nil
	end;
begin
	a.c.a := b;
	e := nil;
	if d <> nil then
		c := d^
	else
		begin
			lol := loll(33)
		end
end.