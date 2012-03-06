package saf.compiler;

import java.io.*;

import saf.compiler.common.ErrorModule;
import saf.compiler.common.ErrorType;
import saf.compiler.types.IntValue;
import saf.compiler.types.StringValue;
import saf.compiler.types.Value;

class SafLexer implements SafTokens {
    private int c = ' ';
    private InputStream m_Stream; 
    private int m_Token;
    private Value m_Val;

    public SafLexer(InputStream stream){
    	m_Stream=stream;
    }
    
    private void nextChar() {

      if (c>=0) {
        try {
          c = m_Stream.read();
        } catch (Exception e) {
          c = (-1);
        }
      }
    }

    

    /** Read the next token and return the
     *  corresponding integer code.
     */
    int nextToken() {

      while(true) {
        // Skip whitespace
        while (c==' ' || c=='\n' || c=='\t' || c=='\r') {
          nextChar();
        }
        if (c<0) {
          return (m_Token=ENDINPUT);
        }
        switch (c) {
          case '(' : nextChar();
            return m_Token='(';
          case ')' : nextChar();
            return m_Token=')';
          case '{' : nextChar();
          	return m_Token='{';
          case '}' : nextChar();
          	return m_Token='}';
          case '[' : nextChar();
        	return m_Token='[';
        case ']' : nextChar();
        	return m_Token=']';
          default  : 
        	if (Character.isDigit((char)c)) {
              int n = 0;
              do {
            	n = 10*n + (c - '0');
                nextChar();
              } 
              while (Character.isDigit((char)c));
              m_Val=new IntValue( n);
              return m_Token=INTEGER;
            } 
        	else if(Character.isLetter((char) c))
            {
              String text="";
              do{
                text+=(char)c;
                nextChar();
              }while(Character.isLetterOrDigit((char)c) || (char)c == '_');
              
              return m_Token=identifyText(text);
            }
            else{
              ErrorModule.addError(ErrorType.FatalError,"Illegal character "+c);
              nextChar();
            }
        }
      }
    }

    /** Return the token code for the current lexeme.
     */
    int getToken() {
      return m_Token;
    }
    private int identifyText(String text){
    	if(text.equals("and")){
    		return m_Token=AND;
    	}
    	else if(text.equals("or")){
    		return m_Token=OR;
    	}
    	else if(text.equals("choose")){
    		return m_Token=CHOOSE;
    	}
    	else{
    		m_Val=new StringValue(text); 
    		return m_Token=VAR;
    	}
    }

    /** Return the semantic value for the current lexeme.
     */
    Value getSemantic() {
      return m_Val;
    }
}
