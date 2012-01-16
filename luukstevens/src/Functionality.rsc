module Functionality

import Language;
import Ast;
import Set;

import ParseTree;
    
public Language::Bot parseSome(loc fileLocation) {
    return parse(#Language::Bot, fileLocation);
}

public Ast::Bot implodeTest() {
    t = parseSome(|project://SafFrontEnd/data/JackieChan.bdl|);
    return implode(#Ast::Bot, t);
}