package actionCreators;

import ast.IActionElement;
/* TODO: Generics */
public interface IActionElementCreator {
	public IActionElement createAction(String name);
}