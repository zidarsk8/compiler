#!/bin/sh
JAVACUP=/usr/share/java/java-cup-11a.jar
JFLEX=/usr/bin/jflex

function clean()
{
  rm -f src/compiler/lexanal/PascalLex.java
  rm -f src/compiler/synanal/PascalTok.java
  rm -f src/compiler/synanal/PascalSyn.java
  rm -rf bin
  rm -f *.xml
  echo "Uspesno brisanje generiranih datotek"
}

if [ $# -ne 1 ]; then
  echo "Manjka argument: ImePrograma | compile | clean"
  exit 1
fi

if [ "$1" == "clean" ]; then
  clean 
  exit 0
fi

if [ "$1" == "compile" ]; then
  clean
  $JFLEX --nobak src/compiler/lexanal/pascal.jflex
  java -jar $JAVACUP -package synanal -parser PascalSyn -symbols PascalTok -nonterms -expect 1 src/compiler/synanal/pascal.cup
  mv PascalTok.java src/compiler/synanal/PascalTok.java
  mv PascalSyn.java src/compiler/synanal/PascalSyn.java

  if [ ! -d "bin" ]; then
    mkdir bin
  fi
  javac -d bin -cp src src/compiler/Main.java
  echo "Uspesno generiranje datotek"
  exit 0
fi

PROGNAME=$1
#PROGNAME=`basename -s .pascal $1`
#if [ ! -f "$PROGNAME"".pascal" ]; then
#  echo "'$PROGNAME"".pascal'" "ne obstaja"
#  exit 1
#fi

export PASCALXSL=xsl
# echo -e "\n\n\n\n\nsynanal\n\n"
java -cp bin/java_cup/runtime:bin/compiler/.. compiler.Main $PROGNAME synanal > /dev/null 2>&1
# echo -e "\n\n\n\n\nabstree\n\n"
java -cp bin/java_cup/runtime:bin/compiler/.. compiler.Main $PROGNAME abstree > /dev/null 2>&1
# echo -e "\n\n\n\n\nsemanal\n\n"
java -cp bin/java_cup/runtime:bin/compiler/.. compiler.Main $PROGNAME semanal > /dev/null 2>&1
# echo -e "\n\n\n\n\nframes\n\n"
java -cp bin/java_cup/runtime:bin/compiler/.. compiler.Main $PROGNAME frames  > /dev/null 2>&1
# echo -e "\n\n\n\n\nimcode\n\n"
java -cp bin/java_cup/runtime:bin/compiler/.. compiler.Main $PROGNAME imcode  > /dev/null 2>&1
# echo -e "\n\n\n\n\nlincode\n\n"
java -cp bin/java_cup/runtime:bin/compiler/.. compiler.Main $PROGNAME lincode
