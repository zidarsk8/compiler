/* The following code was generated by JFlex 1.4.3 on 3/21/12 11:31 AM */

package compiler.lexanal;

import java.io.*;

import compiler.report.*;
import compiler.synanal.*;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 3/21/12 11:31 AM from the specification file
 * <tt>pascal.jflex</tt>
 */
public class PascalLex implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYCOMMENT = 2;
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1, 1
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\15\1\14\25\0\1\15\6\0\1\13\1\43\1\45\1\52"+
    "\1\47\1\40\1\54\1\41\1\0\12\17\1\36\1\46\1\51\1\37"+
    "\1\50\2\0\32\16\1\42\1\0\1\44\1\53\1\20\1\0\1\10"+
    "\1\24\1\30\1\22\1\6\1\7\1\25\1\31\1\26\2\16\1\11"+
    "\1\34\1\21\1\27\1\33\1\16\1\4\1\12\1\3\1\5\1\32"+
    "\1\35\1\16\1\23\1\16\1\1\1\0\1\2\uff82\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\6\4\1\2\1\1\1\5"+
    "\11\4\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
    "\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24"+
    "\1\1\1\25\1\26\2\4\1\27\11\4\1\0\1\30"+
    "\3\4\1\31\2\4\1\32\1\4\1\33\1\34\5\4"+
    "\1\35\1\36\1\37\1\40\1\41\5\4\1\42\2\4"+
    "\1\43\1\4\1\44\1\45\1\46\1\47\5\4\1\50"+
    "\2\4\1\51\1\52\1\53\1\4\1\54\6\4\1\55"+
    "\5\4\1\56\1\57\2\4\1\60\2\4\1\61\1\62"+
    "\6\4\1\63\1\64\1\65\1\4\1\66\1\4\1\67";

  private static int [] zzUnpackAction() {
    int [] result = new int[135];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\55\0\132\0\132\0\207\0\264\0\341\0\u010e"+
    "\0\u013b\0\u0168\0\u0195\0\u01c2\0\u01ef\0\u021c\0\u0249\0\u0276"+
    "\0\u02a3\0\u02d0\0\u02fd\0\u032a\0\u0357\0\u0384\0\u03b1\0\132"+
    "\0\132\0\u03de\0\132\0\132\0\132\0\132\0\132\0\132"+
    "\0\u040b\0\u0438\0\132\0\132\0\132\0\u0465\0\132\0\132"+
    "\0\u0492\0\u04bf\0\341\0\u04ec\0\u0519\0\u0546\0\u0573\0\u05a0"+
    "\0\u05cd\0\u05fa\0\u0627\0\u0654\0\u0681\0\132\0\u06ae\0\u06db"+
    "\0\u0708\0\341\0\u0735\0\u0762\0\341\0\u078f\0\341\0\341"+
    "\0\u07bc\0\u07e9\0\u0816\0\u0843\0\u0870\0\132\0\132\0\132"+
    "\0\132\0\132\0\u089d\0\u08ca\0\u08f7\0\u0924\0\u0951\0\341"+
    "\0\u097e\0\u09ab\0\341\0\u09d8\0\341\0\341\0\341\0\341"+
    "\0\u0a05\0\u0a32\0\u0a5f\0\u0a8c\0\u0ab9\0\341\0\u0ae6\0\u0b13"+
    "\0\341\0\341\0\341\0\u0b40\0\341\0\u0b6d\0\u0b9a\0\u0bc7"+
    "\0\u0bf4\0\u0c21\0\u0c4e\0\341\0\u0c7b\0\u0ca8\0\u0cd5\0\u0d02"+
    "\0\u0d2f\0\341\0\341\0\u0d5c\0\u0d89\0\341\0\u0db6\0\u0de3"+
    "\0\341\0\341\0\u0e10\0\u0e3d\0\u0e6a\0\u0e97\0\u0ec4\0\u0ef1"+
    "\0\341\0\341\0\341\0\u0f1e\0\341\0\u0f4b\0\341";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[135];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\3\1\4\1\3\1\5\1\6\1\7\1\10\1\11"+
    "\1\12\2\7\1\13\2\14\1\7\1\15\1\3\1\16"+
    "\1\17\1\7\1\20\1\7\1\21\1\22\1\23\1\7"+
    "\1\24\1\25\1\7\1\26\1\27\1\30\1\31\1\32"+
    "\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42"+
    "\1\43\1\44\1\45\1\46\1\47\1\50\52\46\60\0"+
    "\1\7\1\51\6\7\3\0\5\7\1\52\3\7\1\53"+
    "\1\7\1\54\4\7\22\0\3\7\1\55\4\7\3\0"+
    "\20\7\22\0\10\7\3\0\20\7\22\0\6\7\1\56"+
    "\1\7\3\0\3\7\1\57\14\7\22\0\2\7\1\60"+
    "\2\7\1\61\2\7\3\0\11\7\1\62\6\7\22\0"+
    "\1\7\1\63\6\7\3\0\3\7\1\64\14\7\17\0"+
    "\13\65\1\66\1\0\40\65\14\0\2\14\56\0\1\15"+
    "\40\0\10\7\3\0\10\7\1\67\1\70\6\7\22\0"+
    "\10\7\3\0\10\7\1\71\1\72\6\7\22\0\3\7"+
    "\1\73\4\7\3\0\11\7\1\74\6\7\22\0\4\7"+
    "\1\75\3\7\3\0\3\7\1\76\14\7\22\0\1\7"+
    "\1\77\2\7\1\100\3\7\3\0\20\7\22\0\10\7"+
    "\3\0\11\7\1\101\1\7\1\102\4\7\22\0\5\7"+
    "\1\103\2\7\3\0\20\7\22\0\1\7\1\104\6\7"+
    "\3\0\20\7\22\0\10\7\3\0\13\7\1\105\4\7"+
    "\56\0\1\106\56\0\1\107\52\0\1\110\54\0\1\111"+
    "\10\0\1\112\4\0\1\46\2\0\52\46\3\0\2\7"+
    "\1\113\5\7\3\0\20\7\22\0\10\7\3\0\15\7"+
    "\1\114\2\7\22\0\3\7\1\115\4\7\3\0\20\7"+
    "\22\0\10\7\3\0\12\7\1\116\5\7\22\0\7\7"+
    "\1\117\3\0\20\7\22\0\10\7\3\0\4\7\1\120"+
    "\13\7\22\0\10\7\3\0\3\7\1\121\14\7\22\0"+
    "\6\7\1\122\1\7\3\0\20\7\22\0\1\7\1\123"+
    "\6\7\3\0\20\7\22\0\1\7\1\124\6\7\3\0"+
    "\20\7\22\0\10\7\3\0\4\7\1\125\13\7\32\0"+
    "\1\66\44\0\6\7\1\126\1\7\3\0\20\7\22\0"+
    "\1\127\7\7\3\0\20\7\22\0\10\7\3\0\14\7"+
    "\1\130\3\7\22\0\10\7\3\0\7\7\1\131\10\7"+
    "\22\0\10\7\3\0\11\7\1\132\6\7\22\0\1\133"+
    "\7\7\3\0\20\7\22\0\10\7\3\0\3\7\1\134"+
    "\14\7\22\0\5\7\1\135\2\7\3\0\20\7\22\0"+
    "\1\7\1\136\6\7\3\0\20\7\22\0\10\7\3\0"+
    "\11\7\1\137\6\7\22\0\10\7\3\0\10\7\1\140"+
    "\7\7\22\0\3\7\1\141\4\7\3\0\20\7\22\0"+
    "\3\7\1\142\4\7\3\0\20\7\22\0\10\7\3\0"+
    "\3\7\1\143\14\7\22\0\10\7\3\0\11\7\1\144"+
    "\6\7\22\0\3\7\1\145\4\7\3\0\20\7\22\0"+
    "\10\7\3\0\12\7\1\146\5\7\22\0\7\7\1\113"+
    "\3\0\20\7\22\0\5\7\1\147\2\7\3\0\20\7"+
    "\22\0\10\7\3\0\10\7\1\150\7\7\22\0\6\7"+
    "\1\151\1\7\3\0\20\7\22\0\3\7\1\152\4\7"+
    "\3\0\20\7\22\0\7\7\1\153\3\0\20\7\22\0"+
    "\1\7\1\154\6\7\3\0\20\7\22\0\10\7\3\0"+
    "\7\7\1\155\2\7\1\156\5\7\22\0\6\7\1\157"+
    "\1\7\3\0\20\7\22\0\1\7\1\160\6\7\3\0"+
    "\20\7\22\0\1\161\7\7\3\0\20\7\22\0\10\7"+
    "\3\0\5\7\1\162\12\7\22\0\10\7\3\0\3\7"+
    "\1\163\14\7\22\0\3\7\1\164\4\7\3\0\20\7"+
    "\22\0\10\7\3\0\7\7\1\165\10\7\22\0\1\166"+
    "\7\7\3\0\20\7\22\0\1\7\1\167\6\7\3\0"+
    "\20\7\22\0\3\7\1\170\4\7\3\0\20\7\22\0"+
    "\3\7\1\171\4\7\3\0\20\7\22\0\10\7\3\0"+
    "\4\7\1\172\13\7\22\0\10\7\3\0\10\7\1\173"+
    "\7\7\22\0\5\7\1\174\2\7\3\0\20\7\22\0"+
    "\3\7\1\175\4\7\3\0\20\7\22\0\5\7\1\176"+
    "\2\7\3\0\20\7\22\0\10\7\3\0\4\7\1\177"+
    "\13\7\22\0\10\7\3\0\11\7\1\200\6\7\22\0"+
    "\10\7\3\0\3\7\1\201\14\7\22\0\1\7\1\202"+
    "\6\7\3\0\20\7\22\0\10\7\3\0\16\7\1\203"+
    "\1\7\22\0\2\7\1\204\5\7\3\0\20\7\22\0"+
    "\10\7\3\0\3\7\1\205\14\7\22\0\1\7\1\206"+
    "\6\7\3\0\20\7\22\0\3\7\1\207\4\7\3\0"+
    "\20\7\17\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[3960];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\1\2\11\23\1\2\11\1\1\6\11\2\1"+
    "\3\11\1\1\2\11\14\1\1\0\1\11\17\1\5\11"+
    "\75\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[135];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
	int nestedComments = 0;
	int commentStartLine = 0;
	int commentStartColumn = 0;
    private PascalSym sym(int type) {
        return new PascalSym(type, yyline + 1, yycolumn + 1, yytext());
    }


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public PascalLex(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  public PascalLex(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 116) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public PascalSym next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      for (zzCurrentPosL = zzStartRead; zzCurrentPosL < zzMarkedPosL;
                                                             zzCurrentPosL++) {
        switch (zzBufferL[zzCurrentPosL]) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn++;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 20: 
          { return sym(PascalTok.SUB);
          }
        case 56: break;
        case 27: 
          { return sym(PascalTok.OR);
          }
        case 57: break;
        case 11: 
          { return sym(PascalTok.LPARENTHESIS);
          }
        case 58: break;
        case 33: 
          { return sym(PascalTok.NEQ);
          }
        case 59: break;
        case 40: 
          { return sym(PascalTok.VAR);
          }
        case 60: break;
        case 16: 
          { return sym(PascalTok.GTH);
          }
        case 61: break;
        case 30: 
          { return sym(PascalTok.DOTS);
          }
        case 62: break;
        case 35: 
          { return sym(PascalTok.FOR);
          }
        case 63: break;
        case 48: 
          { return sym(PascalTok.CONST);
          }
        case 64: break;
        case 37: 
          { return sym(PascalTok.NIL);
          }
        case 65: break;
        case 14: 
          { return sym(PascalTok.SEMIC);
          }
        case 66: break;
        case 8: 
          { return sym(PascalTok.COMMA);
          }
        case 67: break;
        case 54: 
          { return sym(PascalTok.FUNCTION);
          }
        case 68: break;
        case 28: 
          { return sym(PascalTok.OF);
          }
        case 69: break;
        case 29: 
          { return sym(PascalTok.ASSIGN);
          }
        case 70: break;
        case 23: 
          { return sym(PascalTok.TO);
          }
        case 71: break;
        case 13: 
          { return sym(PascalTok.RPARENTHESIS);
          }
        case 72: break;
        case 50: 
          { return sym(PascalTok.RECORD);
          }
        case 73: break;
        case 2: 
          { Report.warning("something is wrong with '" + yytext() + "' (line: " + 
										yyline + ", column: " + yycolumn + ")");
          }
        case 74: break;
        case 18: 
          { return sym(PascalTok.MUL);
          }
        case 75: break;
        case 21: 
          { nestedComments++;
          }
        case 76: break;
        case 19: 
          { return sym(PascalTok.PTR);
          }
        case 77: break;
        case 9: 
          { return sym(PascalTok.DOT);
          }
        case 78: break;
        case 47: 
          { return sym(PascalTok.BEGIN);
          }
        case 79: break;
        case 32: 
          { return sym(PascalTok.LEQ);
          }
        case 80: break;
        case 53: 
          { return sym(PascalTok.PROGRAM);
          }
        case 81: break;
        case 5: 
          { return sym(PascalTok.INT_CONST);
          }
        case 82: break;
        case 10: 
          { return sym(PascalTok.LBRACKET);
          }
        case 83: break;
        case 42: 
          { return sym(PascalTok.TYPE);
          }
        case 84: break;
        case 15: 
          { return sym(PascalTok.ADD);
          }
        case 85: break;
        case 34: 
          { return sym(PascalTok.END);
          }
        case 86: break;
        case 46: 
          { return sym(PascalTok.ARRAY);
          }
        case 87: break;
        case 44: 
          { return sym(PascalTok.ELSE);
          }
        case 88: break;
        case 52: 
          { return sym(PascalTok.INT);
          }
        case 89: break;
        case 41: 
          { return sym(PascalTok.BOOL_CONST);
          }
        case 90: break;
        case 43: 
          { return sym(PascalTok.THEN);
          }
        case 91: break;
        case 17: 
          { return sym(PascalTok.LTH);
          }
        case 92: break;
        case 38: 
          { return sym(PascalTok.NOT);
          }
        case 93: break;
        case 36: 
          { return sym(PascalTok.AND);
          }
        case 94: break;
        case 25: 
          { return sym(PascalTok.DO);
          }
        case 95: break;
        case 39: 
          { return sym(PascalTok.DIV);
          }
        case 96: break;
        case 3: 
          { nestedComments++; 
						  commentStartLine = yyline;
						  commentStartColumn = yycolumn;
						  yybegin(YYCOMMENT);
          }
        case 97: break;
        case 6: 
          { return sym(PascalTok.COLON);
          }
        case 98: break;
        case 4: 
          { return sym(PascalTok.IDENTIFIER);
          }
        case 99: break;
        case 24: 
          { return sym(PascalTok.CHAR_CONST);
          }
        case 100: break;
        case 26: 
          { return sym(PascalTok.IF);
          }
        case 101: break;
        case 45: 
          { return sym(PascalTok.CHAR);
          }
        case 102: break;
        case 12: 
          { return sym(PascalTok.RBRACKET);
          }
        case 103: break;
        case 51: 
          { return sym(PascalTok.BOOL);
          }
        case 104: break;
        case 49: 
          { return sym(PascalTok.WHILE);
          }
        case 105: break;
        case 22: 
          { nestedComments--; if(nestedComments==0) yybegin(YYINITIAL);
          }
        case 106: break;
        case 55: 
          { return sym(PascalTok.PROCEDURE);
          }
        case 107: break;
        case 31: 
          { return sym(PascalTok.GEQ);
          }
        case 108: break;
        case 1: 
          { 
          }
        case 109: break;
        case 7: 
          { return sym(PascalTok.EQU);
          }
        case 110: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
              { 	if (nestedComments > 0){
		Report.warning("Unclosed comment (line: " + commentStartLine + ", column: " + commentStartColumn + ")");
	}
    return new PascalSym(PascalTok.EOF);
 }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
