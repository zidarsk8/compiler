program randomgenerator;
    
    var 
        a:integer;
        i:integer;

    procedure aa(a:^integer);
    begin
        putint(a^);
        a^:=a^+1
    end;
begin
    for i:=-1 to 1 do
        if i = 0 then
            repeat
                if a < 33 then 
                    aa(^a);
                putch('*')
            until a < 3
        else 
            putch('a')
end.
{a012a}
