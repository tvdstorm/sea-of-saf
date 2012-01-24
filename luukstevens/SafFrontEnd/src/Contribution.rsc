module Contribution

import util::IDE;
import util::Prompt;
import ParseTree;
import IO;
import String;

import Language;
import Ast;
import XmlSerialization;
import lang::xml::DOM;

public Contribution exportXml() {
    action = action("Export to XML", performExport);
    menu = menu("Super Awesome Fighters", [action]);
    return popup(menu);
}

public void performExport(Tree tree, loc selection) {   
    str xmlStringLocation = prompt("Export XML to path:");
    loc xmlFileLocation = |file:///tmp|; //Ugly, but needed.
    xmlFileLocation.uri = xmlStringLocation;

    Bot ast = implode(#Bot, tree);
    serializeBot(ast, xmlFileLocation);
}
