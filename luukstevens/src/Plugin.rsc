module Plugin

import util::IDE;
import ParseTree;
import Message;

import Language;
import Ast;
import Validation;
import Outline;
import IO;

private str lang = "Fighter Description Language";
private str ext = "fdl";

public void main() {
    registerLanguage(lang, ext, Language::Fighter(str input, loc org) {
        return parse(#Language::Fighter, input, org);
    });
    
    registerOutliner(lang, node (Language::Fighter input) {
        return outlineFighter(implode(#Ast::Fighter, input));
    });
    
    registerAnnotator(lang, Language::Fighter(Language::Fighter input) {
        msgs = validate(implode(#Ast::Fighter, input));
        return input[@messages=msgs];
    });
}