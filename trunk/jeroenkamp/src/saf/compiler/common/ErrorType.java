package saf.compiler.common;

public enum ErrorType{
	Message,
	Warning,//processing continues
	Error,// process is stopped after the task
	FatalError,//process is aborted
}