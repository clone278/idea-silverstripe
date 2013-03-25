/* The following code was generated by JFlex 1.4.3 on 2013-03-25 23:52 */

package com.raket.silverstripe;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import com.raket.silverstripe.psi.SilverStripeTypes;
import com.raket.silverstripe.psi.SilverStripeTokenType;
import com.intellij.psi.TokenType;
import com.intellij.psi.*;
import com.intellij.psi.xml.*;
import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import com.intellij.util.containers.Stack;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 2013-03-25 23:52 from the specification file
 * <tt>C:/IdeaProjects/idea-silverstripe/src/com/raket/silverstripe/SilverStripe.flex</tt>
 */
class SilverStripeLexer implements FlexLexer {
  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int SS_BAD_VAR = 10;
  public static final int SS_VAR = 2;
  public static final int SS_COMMENT = 14;
  public static final int SS_BAD_BLOCK_STATEMENT = 12;
  public static final int YYINITIAL = 0;
  public static final int SS_BLOCK_VAR = 8;
  public static final int SS_BLOCK_START = 6;
  public static final int SS_WITH_DELIMITER = 4;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1,  1,  2,  2,  3,  3,  4,  4,  5,  5,  6,  6,  7, 7
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\3\1\1\1\0\1\3\1\2\22\0\1\3\1\0\1\7"+
    "\1\0\1\4\1\15\1\0\1\7\1\6\1\10\3\0\1\42\1\11"+
    "\13\0\1\0\1\0\1\14\1\0\1\16\2\0\32\5\1\0\1\0"+
    "\2\0\1\26\1\0\1\40\1\37\1\32\1\36\1\24\1\23\1\41"+
    "\1\31\1\22\2\5\1\17\1\5\1\33\1\20\1\21\1\5\1\34"+
    "\1\25\1\30\1\35\1\5\1\27\3\5\1\12\1\0\1\13\uff82\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\1\7\0\3\1\1\2\2\3\1\4\1\2\1\5"+
    "\1\2\1\6\2\7\1\10\7\7\1\11\1\2\1\12"+
    "\3\2\2\3\1\4\2\2\2\3\1\4\1\2\1\13"+
    "\1\14\1\15\1\0\1\16\7\0\1\17\3\0\1\20"+
    "\25\0\1\21\1\0\1\16\4\0\1\22\1\23\15\0"+
    "\1\24\4\0\1\25\7\0";

  private static int [] zzUnpackAction() {
    int [] result = new int[117];
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
    "\0\0\0\43\0\106\0\151\0\214\0\257\0\322\0\365"+
    "\0\u0118\0\u013b\0\u015e\0\u0181\0\u0181\0\u01a4\0\u01c7\0\u01ea"+
    "\0\u0181\0\u020d\0\u0181\0\u0181\0\u01a4\0\u0230\0\u0253\0\u0276"+
    "\0\u0299\0\u02bc\0\u02df\0\u0302\0\u0325\0\u0348\0\u036b\0\u038e"+
    "\0\u03b1\0\u03d4\0\u03f7\0\u03f7\0\u041a\0\u043d\0\u0460\0\u0483"+
    "\0\u0483\0\u04a6\0\u04c9\0\u04ec\0\u050f\0\u0532\0\u0555\0\u0578"+
    "\0\u0181\0\u059b\0\u05be\0\u05e1\0\u0604\0\u0627\0\u064a\0\u066d"+
    "\0\u0181\0\u0690\0\u03f7\0\u0460\0\u0181\0\u0483\0\u04ec\0\u06b3"+
    "\0\u06d6\0\u06f9\0\u071c\0\u073f\0\u0762\0\u0785\0\u07a8\0\u07cb"+
    "\0\u07ee\0\u0811\0\u0834\0\u0857\0\u087a\0\u089d\0\u08c0\0\u08e3"+
    "\0\u0906\0\u0929\0\u0181\0\u094c\0\u096f\0\u0992\0\u09b5\0\u09d8"+
    "\0\u09fb\0\u0181\0\u0181\0\u0a1e\0\u0a41\0\u0a64\0\u0a87\0\u0aaa"+
    "\0\u0acd\0\u0af0\0\u0b13\0\u0b36\0\u0b59\0\u0b7c\0\u0b9f\0\u0bc2"+
    "\0\u0181\0\u0be5\0\u0c08\0\u0c2b\0\u0c4e\0\u0181\0\u0c71\0\u0c94"+
    "\0\u0cb7\0\u0cda\0\u0cfd\0\u0d20\0\u0d43";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[117];
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
    "\4\1\1\11\5\1\1\12\1\1\1\13\26\1\1\14"+
    "\1\15\1\16\1\17\1\20\5\14\1\21\31\14\1\15"+
    "\1\16\1\17\1\22\6\14\1\23\27\14\1\24\1\15"+
    "\1\25\1\26\10\24\1\27\2\24\1\30\2\24\1\31"+
    "\1\24\1\32\2\24\1\33\2\24\1\34\4\24\1\35"+
    "\3\24\1\14\1\15\1\16\1\36\1\37\1\40\7\14"+
    "\1\41\1\14\7\40\1\14\13\40\1\42\1\14\1\15"+
    "\1\16\1\17\37\14\1\43\1\44\1\45\1\46\11\43"+
    "\1\47\25\43\1\50\1\51\1\52\1\53\36\50\1\54"+
    "\4\1\1\11\1\0\4\1\1\12\1\1\1\13\2\1"+
    "\7\0\1\1\13\0\5\1\1\0\5\1\1\12\1\1"+
    "\1\13\32\1\1\11\5\1\1\12\1\1\1\13\1\0"+
    "\25\1\44\0\1\15\44\0\1\17\44\0\1\55\11\0"+
    "\7\55\1\0\13\55\6\0\1\56\11\0\7\56\1\0"+
    "\13\56\4\0\1\26\54\0\1\57\45\0\1\60\45\0"+
    "\1\61\7\0\1\62\26\0\1\63\13\0\1\64\31\0"+
    "\1\65\40\0\1\66\62\0\1\67\5\0\1\36\44\0"+
    "\1\40\11\0\7\40\1\0\13\40\6\0\1\40\1\70"+
    "\2\0\1\40\5\0\7\40\1\0\13\40\17\0\1\71"+
    "\66\0\1\72\15\73\1\74\26\73\1\44\13\73\1\74"+
    "\30\73\1\46\11\73\1\74\42\73\1\74\1\75\24\73"+
    "\42\76\1\77\1\76\1\51\40\76\1\77\3\76\1\53"+
    "\36\76\1\77\42\76\1\100\5\0\1\55\1\101\2\0"+
    "\1\55\5\0\7\55\1\0\13\55\6\0\1\56\1\102"+
    "\2\0\1\56\5\0\7\56\1\0\13\56\43\0\1\103"+
    "\20\0\1\104\54\0\1\105\35\0\1\106\53\0\1\107"+
    "\34\0\1\110\45\0\1\111\34\0\1\112\22\0\1\113"+
    "\1\0\1\114\7\0\7\113\1\0\13\113\16\0\1\115"+
    "\25\0\15\76\1\116\24\76\1\100\5\0\1\117\1\0"+
    "\1\120\7\0\7\117\1\0\13\117\6\0\1\121\1\0"+
    "\1\122\7\0\7\121\1\0\13\121\43\0\1\123\21\0"+
    "\1\61\40\0\1\124\47\0\1\125\44\0\1\126\45\0"+
    "\1\61\41\0\1\127\36\0\1\130\23\0\1\113\1\0"+
    "\1\131\1\40\6\0\7\113\1\0\13\113\6\0\1\113"+
    "\11\0\7\113\1\0\13\113\17\0\1\132\24\0\16\76"+
    "\1\133\23\76\1\77\5\0\1\117\1\0\1\134\1\55"+
    "\6\0\7\117\1\0\13\117\6\0\1\117\11\0\7\117"+
    "\1\0\13\117\6\0\1\121\1\0\1\135\1\56\6\0"+
    "\7\121\1\0\13\121\6\0\1\121\11\0\7\121\1\0"+
    "\13\121\36\0\1\136\33\0\1\137\33\0\1\140\2\0"+
    "\1\141\4\0\1\142\2\0\1\143\44\0\1\144\34\0"+
    "\1\145\24\0\1\40\42\0\1\55\42\0\1\56\70\0"+
    "\1\146\26\0\1\147\40\0\1\150\45\0\1\151\41\0"+
    "\1\152\40\0\1\153\42\0\1\154\52\0\1\155\36\0"+
    "\1\156\41\0\1\61\37\0\1\157\52\0\1\160\45\0"+
    "\1\161\26\0\1\61\63\0\1\162\23\0\1\151\52\0"+
    "\1\151\41\0\1\163\53\0\1\156\35\0\1\164\26\0"+
    "\1\165\41\0\1\151\23\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[3430];
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
  private static final char[] EMPTY_BUFFER = new char[0];
  private static final int YYEOF = -1;
  private static java.io.Reader zzReader = null; // Fake

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
    "\1\1\7\0\3\1\2\11\3\1\1\11\1\1\2\11"+
    "\33\1\1\0\1\11\7\0\1\11\3\0\1\11\25\0"+
    "\1\11\1\0\1\1\4\0\2\11\15\0\1\11\4\0"+
    "\1\11\7\0";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[117];
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

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** this buffer may contains the current text array to be matched when it is cheap to acquire it */
  private char[] zzBufferArray;

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the textposition at the last state to be included in yytext */
  private int zzPushbackPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /**
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
    private Stack<Integer> stack = new Stack<Integer>();

    public void yypushState(int newState) {
      stack.push(yystate());
      yybegin(newState);
    }

 	public IElementType checkVariable(IElementType success, IElementType fail) {
        String matchedVar = yytext().toString();
        if (matchedVar.matches("(\\$[a-zA-Z]+)((\\((\\\"(?=[a-zA-Z]*\\\")|\\'(?=[a-zA-Z]*\\')|[a-zA-Z](?=[a-zA-Z]+))[a-zA-Z\\\"\\']+\\))|\\.[a-zA-Z]+)*")) {
           return success;
        }
        else {
           return fail;
        }
 	}

  	public IElementType checkBlockVariable(IElementType success, IElementType fail) {
        String matchedVar = yytext().toString();
        if (matchedVar.matches("(\\$?[a-zA-Z]+)((\\((\\\"(?=[a-zA-Z]*\\\")|\\'(?=[a-zA-Z]*\\')|[a-zA-Z](?=[a-zA-Z]+))[a-zA-Z\\\"\\']+\\))|\\.[a-zA-Z]+)*")) {
           return success;
        }
        else {
           return fail;
        }
 	}

    public void yypopState() {
      yybegin(stack.pop());
    }



  SilverStripeLexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  SilverStripeLexer(java.io.InputStream in) {
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
    while (i < 120) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart(){
    return zzStartRead;
  }

  public final int getTokenEnd(){
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end,int initialState){
    zzBuffer = buffer;
    zzBufferArray = com.intellij.util.text.CharArrayUtil.fromSequenceWithoutCopying(buffer);
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzPushbackPos = 0;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
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
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
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
    return zzBufferArray != null ? zzBufferArray[zzStartRead+pos]:zzBuffer.charAt(zzStartRead+pos);
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
  private void zzDoEOF() {
    if (!zzEOFDone) {
      zzEOFDone = true;
    
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;
    char[] zzBufferArrayL = zzBufferArray;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL.charAt(zzCurrentPosL++);
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
              zzInput = zzBufferL.charAt(zzCurrentPosL++);
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
        case 15: 
          { yybegin(YYINITIAL); return SilverStripeTypes.SS_BLOCK_END;
          }
        case 22: break;
        case 6: 
          { yybegin(YYINITIAL); return SilverStripeTypes.SS_VAR_END_DELIMITER;
          }
        case 23: break;
        case 11: 
          { yybegin(YYINITIAL); return checkVariable(SilverStripeTypes.SS_VAR, SilverStripeTypes.SS_BAD_VAR);
          }
        case 24: break;
        case 17: 
          { yybegin(SS_COMMENT); return SilverStripeTypes.SS_COMMENT_START;
          }
        case 25: break;
        case 2: 
          { return TokenType.BAD_CHARACTER;
          }
        case 26: break;
        case 18: 
          { yybegin(YYINITIAL); return SilverStripeTypes.SS_COMMENT_END;
          }
        case 27: break;
        case 1: 
          { if (yylength() > 0 && yytext().subSequence(yylength() - 1, yylength()).toString().equals("<")) {
            yypushback(1);
            yypushState(SS_BLOCK_START);
        }
        if (yylength() > 0 && yytext().subSequence(yylength() - 1, yylength()).toString().equals("$") ||
            yylength() > 0 && yytext().subSequence(yylength() - 1, yylength()).toString().equals("{") ) {
            yypushback(1);
            yybegin(SS_VAR);
        }

        // we stray from the Handlebars grammar a bit here since we need our WHITE_SPACE more clearly delineated
        //    and we need to avoid creating extra tokens for empty strings (makes the parser and formatter happier)
        if (!yytext().toString().equals("")) {
           if (yytext().toString().trim().length() == 0) {
               return TokenType.WHITE_SPACE;
           } else {
               return SilverStripeTypes.CONTENT;
           }
        }
          }
        case 28: break;
        case 9: 
          { yybegin(SS_BLOCK_VAR); return TokenType.WHITE_SPACE;
          }
        case 29: break;
        case 19: 
          { yybegin(SS_BLOCK_VAR); yypushback(4); return SilverStripeTypes.COMMENT;
          }
        case 30: break;
        case 8: 
          { yybegin(SS_BLOCK_START); return TokenType.WHITE_SPACE;
          }
        case 31: break;
        case 21: 
          { yybegin(SS_BLOCK_VAR); return SilverStripeTypes.SS_SIMPLE_KEYWORD;
          }
        case 32: break;
        case 14: 
          { yybegin(SS_BLOCK_VAR); return SilverStripeTypes.SS_START_KEYWORD;
          }
        case 33: break;
        case 3: 
          { yybegin(YYINITIAL); return SilverStripeTypes.CRLF;
          }
        case 34: break;
        case 16: 
          { yybegin(SS_BLOCK_VAR); yypushback(2); return SilverStripeTypes.SS_BAD_BLOCK_STATEMENT;
          }
        case 35: break;
        case 20: 
          { yybegin(SS_BLOCK_VAR); return SilverStripeTypes.SS_END_KEYWORD;
          }
        case 36: break;
        case 13: 
          { yybegin(SS_BLOCK_START); return SilverStripeTypes.SS_BLOCK_START;
          }
        case 37: break;
        case 5: 
          { yybegin(SS_WITH_DELIMITER); return SilverStripeTypes.SS_VAR_START_DELIMITER;
          }
        case 38: break;
        case 4: 
          { yybegin(YYINITIAL); return TokenType.WHITE_SPACE;
          }
        case 39: break;
        case 12: 
          { yybegin(SS_WITH_DELIMITER); return checkVariable(SilverStripeTypes.SS_VAR, SilverStripeTypes.SS_BAD_VAR);
          }
        case 40: break;
        case 10: 
          { yybegin(SS_BLOCK_VAR); return checkBlockVariable(SilverStripeTypes.SS_BLOCK_VAR, SilverStripeTypes.SS_BAD_VAR);
          }
        case 41: break;
        case 7: 
          { yybegin(SS_BAD_BLOCK_STATEMENT); yypushback(1);
          }
        case 42: break;
        default:
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
            return null;
          }
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
