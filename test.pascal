program kr_neki;
	type 
		rec = record {velikost = 20}
			a : integer;
			b : array[0..2] of integer;
			c : record
				a:integer
			end
		end;
		xx = integer;
		arr = array[3..4] of integer;

	var lol : xx;
		ad : integer;
		rr : rec;
		aa : arr;
		
	function b(a:arr):integer;
	begin
	end;
	
	function f(x:rec):integer;
		var n : integer;
	begin
		lol := b(aa)
	end;
begin
	lol := 44
end.