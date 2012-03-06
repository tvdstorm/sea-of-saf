package com.blommesteijn.uva.sc.saf.runner;

import com.blommesteijn.uva.sc.saf.runner.model.Model;
import com.blommesteijn.uva.sc.saf.utils.RandUtil;


/**
 * Hello world!
 *
 */
public class Main 
{
	private static final String APP_NAME = "saf";
	private static final String APP_VERSION = "0.0.1-SNAPSHOT";
	
	public static void main( String[] args )
    {	
		Model model = Model.getInstance();
		model.load(APP_NAME, APP_VERSION, args);
    }
}
