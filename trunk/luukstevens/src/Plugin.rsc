module Plugin

import util::IDE;
import ParseTree;
import Message;

import Language;
import Ast;
import Validation;
import Outline;
import Contribution;

private str lang = "Bot Description Language";
private str ext = "bdl";

public void main() {
    registerLanguage(lang, ext, Language::Bot(str input, loc org) {
        return parse(#Language::Bot, input, org);
    });
    
    registerContributions(lang, { exportXml() });
    //
    //registerOutliner(lang, node (Language::Bot input) {
    //    return outlineBot(implode(#Ast::Bot, input));
    //});
    //
    registerAnnotator(lang, Language::Bot(Language::Bot input) {
        msgs = validate(implode(#Ast::Bot, input));
        return input[@messages=msgs];
    });
}