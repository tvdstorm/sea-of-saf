module Contribution

import util::IDE;
import util::Prompt;
import ParseTree;
import IO;
import String;

import Language;
import Ast;
import Model;
import XmlSerialization;

public Contribution exportXml() {
    action = action("Export to XML", performExport);
    menu = menu("Super Awesome Fighters", [action]);
    return popup(menu);
}

private void performExport(Tree tree, loc selection) {
    str exportLocation = prompt("Export location:");
    str bdlFileLocation = split("|", "<selection>")[1];
    bdlFileLocation = replaceAll(bdlFileLocation, "%2F", "/");
    
    println(fileLocation);
    
    //parseTree = parse(#Language::Bot, |project://| + bdlFileLocation);
    //ast = implode(#Ast::Bot, parseTree);
    //model convertAstToModel(ast);
    //serializeBot(model, exportLocation);
}