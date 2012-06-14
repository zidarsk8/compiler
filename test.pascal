program inlineif;
	var i:integer; 
    
    procedure p();
    begin
        putint(1);
        putint(2);
        return;
        putint(3)
    end;
    
    function f():integer;
    begin
        putint(11);
        putint(22);
        putint(33)
    end;

begin
    p();
    i := f()
end.



