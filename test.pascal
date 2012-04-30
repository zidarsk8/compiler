program HelloWorld;

var
    a:boolean;
    b:^char;

procedure p();
var
    a:integer;
begin
    a := 6
end;
function f():boolean;
var
    a:char;
begin
    a := 'd'
end;

begin
    a := true and f();
    b := nil;
    ^b := nil;
    b^ := 'f'
end.