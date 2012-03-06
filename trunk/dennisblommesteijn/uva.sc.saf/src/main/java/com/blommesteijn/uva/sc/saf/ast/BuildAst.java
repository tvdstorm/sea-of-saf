package com.blommesteijn.uva.sc.saf.ast;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;
import org.antlr.runtime.tree.CommonTreeNodeStream;


import com.blommesteijn.uva.sc.saf.utils.StringUtil;
import com.blommesteijn.uva.sc.saf.SAFWalker;
import com.blommesteijn.uva.sc.saf.SAFLexer;
import com.blommesteijn.uva.sc.saf.SAFParser;
import com.blommesteijn.uva.sc.saf.SAFParser.astNode_return;
import com.blommesteijn.uva.sc.saf.ast.types.AstNode;
import com.blommesteijn.uva.sc.saf.checkers.ParserChecker;
import com.blommesteijn.uva.sc.saf.checkers.StaticCheckIssue;
import com.blommesteijn.uva.sc.saf.checkers.StaticChecker;

public class BuildAst
{

	private List<AstNode> _astNodes = null;
	private ParserChecker _parserChecker = null;
	private StaticChecker _staticChecker = null;
	

	public BuildAst()
	{
		_astNodes = new LinkedList<AstNode>();
	}

	public List<AstNode> loadSource(List<File> files) throws BuildAstException
	{		
		List<AstNode> ret = new LinkedList<AstNode>();
		for(File file : files)
		{	
			try
			{
				ret.addAll(this.loadSource(file));
			}
			catch (IOException e)
			{
			}
		}
		return ret;
	}
	
	public List<AstNode> loadSource( File file ) throws IOException, BuildAstException
	{
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		String contents = "";
		String s = "";
		while ((s = br.readLine()) != null)
		{
			contents += s + StringUtil.NEW_LINE;
		}
		fr.close();
		
		return this.loadSource(contents);
	}
	
	/**
	 * Load AST node from a source string
	 * @param string source string
	 * @return AST root node
	 * @throws RecognitionException
	 * @throws StaticCheckIssue 
	 */
	public List<AstNode> loadSource(String string) throws BuildAstException
	{
		CharStream input = new ANTLRStringStream(string);
		SAFLexer lexer = new SAFLexer(input);
		
		//Run Parser
		TokenStream tokenStream = new CommonTokenStream(lexer);
		SAFParser parser = new SAFParser(tokenStream);
		astNode_return astNodeParser = null;
		try
		{
			astNodeParser = parser.astNode();
		}
		catch (RecognitionException e1)
		{
			throw new BuildAstException("could not recongnize tokenstream");
		}
				
		//get parser checker (run inside SAFParser)
		_parserChecker = parser.getParserChecker();
		if(_parserChecker.hasIssues())
			throw new BuildAstException("parse check failed");
		
 						
		//Run Walker
		CommonTreeNodeStream nodeStream = new CommonTreeNodeStream(astNodeParser.getTree());
		SAFWalker walker = new SAFWalker(nodeStream);
		
		try
		{
//			_astNodes.addAll();
			List<AstNode> astNode = walker.astNode();
			
			//run static checker
			_staticChecker = new StaticChecker(astNode);
			if(_staticChecker.hasIssues())
				throw new BuildAstException("static check failed");
			
			_astNodes.addAll(astNode);
			
		}
		catch(NullPointerException e)
		{
			throw new BuildAstException("ast build failed");
		}
		catch (RecognitionException e)
		{
			throw new BuildAstException("could not recongnize nodesteam");
		}		
		
//		System.out.println("------------------");
//		for(AstNode node : _astNodes)
//		{
//			System.out.println("node: " + node.getFighters().size());
//		}
		
		

		
//		System.out.println("------------------");
//		for(AstNode node : _astNodes)
//		{
//			System.out.println("node: " + node.getFighters().size());
//		}
		
		
		return _astNodes;
	}


	/**
	 * Get parser checker
	 * @return
	 */
	public ParserChecker getParserChecker()
	{
		return _parserChecker;
	}
	
	/**
	 * Get static checker
	 * @return
	 */
	public StaticChecker getStaticChecker()
	{
		return _staticChecker;
	}
	
	public List<AstNode> getAstNodes()
	{
		return _astNodes;
	}



}
