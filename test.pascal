program kr_neki;
	const 
		f = 2;
		t = f*5;
	type
		int = integer;
		arr = array[t..t+f] of int;
		r = record
			a:integer;
			bb:integer;
			c : record
				a:arr
			end
		end; 
	var 
		a : r;
		b : integer;
begin
	^a.c.a[f] := ^b
end.