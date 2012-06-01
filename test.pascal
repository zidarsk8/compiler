program kr_neki;
	
	var i:integer;
	function plus(i:integer):integer;
	begin
		plus:=i+1
	end;
	procedure neki(a:integer; j:integer; k:integer);
	begin
		i:= a+j+k
	end;
begin
	i:= 3+2;
	putint(plus(i));
	putnl();
	neki(1,1,1);
	putint(plus(i));
	putnl()
end.