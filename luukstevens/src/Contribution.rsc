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
    str bdlStringLocation = selection.uri;
    bdlStringLocation = replaceAll(bdlStringLocation, "%2F", "/");
    loc bdlFileLocation = |file:///tmp|; //Ugly, but needed.
    bdlFileLocation.uri = bdlStringLocation;
    
    str xmlStringLocation = prompt("Export XML to path:");
    loc xmlFileLocation = |file:///tmp|; //Ugly, but needed.
    xmlFileLocation.uri = xmlStringLocation;
    
    parseTree = parse(#Language::Bot, bdlFileLocation);
    Bot ast = implode(#Bot, parseTree);
    ModelBot model = convertAstToModel(ast);
    return serializeBot(model, xmlFileLocation);
}