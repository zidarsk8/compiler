program kr_neki;
	const
		f = 3;
		t = f*3;
	type
		int = integer; 
		ar = array[f..t] of int;
		p = ^integer;
		aar = ^ar;
	var 
		x : ar;
		v : int;
	function fun(x:integer):^ar;
	begin
	end;
begin
	^x := fun(3)
end.