module Plugin

import util::IDE;
import ParseTree;
import Message;

import Language;
import Ast;
import Validation;

private str lang = "Fighter Description Language";
private str ext = "fdl";

public void main() {
    registerLanguage(lang, ext, Language::Fighter(str input, loc org) {
        return parse(#Language::Fighter, input, org);
    });
    
    registerAnnotator(lang, Language::Fighter(Language::Fighter input) {
        msgs = validate(implode(#Ast::Fighter, input));
        return input[@messages=msgs];
    });
}