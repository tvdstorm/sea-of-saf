package saf.javacompiler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.tools.Diagnostic;
import javax.tools.DiagnosticCollector;
import javax.tools.JavaCompiler;
import javax.tools.JavaFileManager;
import javax.tools.JavaFileObject;
import javax.tools.ToolProvider;
import javax.tools.JavaCompiler.CompilationTask;


public class SourceCompiler {
	public static Object createInstanceFromSource(String fullname,String source) throws ClassNotFoundException, InstantiationException, IllegalAccessException{
		JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
		JavaFileManager fileManager = new ClassFileManager(compiler
            .getStandardFileManager(null, null, null));
		DiagnosticCollector<JavaFileObject> diagnostics = new DiagnosticCollector<JavaFileObject>();
		JavaFileObject file = new JavaSourceFromString(fullname, source);
		Iterable<? extends JavaFileObject> compilationUnits = Arrays
				.asList(file);

		List<String> optionList = new ArrayList<String>();
		// set compiler's classpath to be same as the runtime's
		optionList.addAll(Arrays.asList("-classpath", System
				.getProperty("java.class.path")));

		CompilationTask task = compiler.getTask(null, fileManager, diagnostics,
				optionList, null, compilationUnits);

		boolean success = task.call();
		for (Diagnostic<? extends JavaFileObject> diagnostic : diagnostics
				.getDiagnostics()) {
			System.out.println(diagnostic.getCode());
			System.out.println(diagnostic.getKind());
			System.out.println(diagnostic.getPosition());
			System.out.println(diagnostic.getStartPosition());
			System.out.println(diagnostic.getEndPosition());
			System.out.println(diagnostic.getSource());
			System.out.println(diagnostic.getMessage(null));

		}
		System.out.println("Success: " + success);
		return fileManager.getClassLoader(null)
        .loadClass(fullname).newInstance();
	}
}
