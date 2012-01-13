module Functionality

import Language;
import Ast;
import Set;

import ParseTree;
    
public Language::Fighter parseSome(loc fileLocation) {
    return parse(#Language::Fighter, fileLocation);
}

public Ast::Fighter implodeTest() {
    t = parseSome(|project://SafFrontEnd/data/JackieChan.fdl|);
    return implode(#Ast::Fighter, t);
}