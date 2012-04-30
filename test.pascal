program kr_neki;
	type
		int = record
			a:integer;
			b:integer;
			c : record
				a:integer
			end
		end; 
	var 
		a : int;
begin
	a.b := 3
end.