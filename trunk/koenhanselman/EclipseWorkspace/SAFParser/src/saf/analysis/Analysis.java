/* This file was generated by SableCC (http://www.sablecc.org/). */

package saf.analysis;

import saf.node.*;

public interface Analysis extends Switch
{
    Object getIn(Node node);
    void setIn(Node node, Object o);
    Object getOut(Node node);
    void setOut(Node node, Object o);

    void caseStart(Start node);
    void caseAProgram(AProgram node);
    void caseAProgramHeader(AProgramHeader node);
    void caseAProgramFooter(AProgramFooter node);
    void caseAProgramPersonality(AProgramPersonality node);
    void caseAPunchReachProgramCharacteristic(APunchReachProgramCharacteristic node);
    void caseAPunchPowerProgramCharacteristic(APunchPowerProgramCharacteristic node);
    void caseAKickReachProgramCharacteristic(AKickReachProgramCharacteristic node);
    void caseAKickPowerProgramCharacteristic(AKickPowerProgramCharacteristic node);
    void caseAProgramPunchReach(AProgramPunchReach node);
    void caseAProgramPunchPower(AProgramPunchPower node);
    void caseAProgramKickReach(AProgramKickReach node);
    void caseAProgramKickPower(AProgramKickPower node);
    void caseAProgramBehaviour(AProgramBehaviour node);
    void caseAProgramRule(AProgramRule node);
    void caseASingleMoveActionProgramMoveAction(ASingleMoveActionProgramMoveAction node);
    void caseAChooseMoveActionProgramMoveAction(AChooseMoveActionProgramMoveAction node);
    void caseASingleFightActionProgramFightAction(ASingleFightActionProgramFightAction node);
    void caseAChooseFightActionProgramFightAction(AChooseFightActionProgramFightAction node);
    void caseAWalkTowardsMoveActionType(AWalkTowardsMoveActionType node);
    void caseAWalkAwayMoveActionType(AWalkAwayMoveActionType node);
    void caseARunTowardsMoveActionType(ARunTowardsMoveActionType node);
    void caseARunAwayMoveActionType(ARunAwayMoveActionType node);
    void caseAJumpMoveActionType(AJumpMoveActionType node);
    void caseACrouchMoveActionType(ACrouchMoveActionType node);
    void caseAStandMoveActionType(AStandMoveActionType node);
    void caseABlockLowFightActionType(ABlockLowFightActionType node);
    void caseABlockHighFightActionType(ABlockHighFightActionType node);
    void caseAPunchLowFightActionType(APunchLowFightActionType node);
    void caseAPunchHighFightActionType(APunchHighFightActionType node);
    void caseAKickLowFightActionType(AKickLowFightActionType node);
    void caseAKickHighFightActionType(AKickHighFightActionType node);
    void caseAAlwaysConditionType(AAlwaysConditionType node);
    void caseANearConditionType(ANearConditionType node);
    void caseAFarConditionType(AFarConditionType node);
    void caseAMuchStrongerConditionType(AMuchStrongerConditionType node);
    void caseAStrongerConditionType(AStrongerConditionType node);
    void caseAEvenConditionType(AEvenConditionType node);
    void caseAWeakerConditionType(AWeakerConditionType node);
    void caseAMuchWeakerConditionType(AMuchWeakerConditionType node);

    void caseTDigit(TDigit node);
    void caseTLetter(TLetter node);
    void caseTComment(TComment node);
    void caseTNewline(TNewline node);
    void caseTBlank(TBlank node);
    void caseTCurlybracel(TCurlybracel node);
    void caseTCurlybracer(TCurlybracer node);
    void caseTBracketl(TBracketl node);
    void caseTBracketr(TBracketr node);
    void caseTParenthesisl(TParenthesisl node);
    void caseTParenthesisr(TParenthesisr node);
    void caseTEquals(TEquals node);
    void caseTPunchReach(TPunchReach node);
    void caseTPunchPower(TPunchPower node);
    void caseTKickReach(TKickReach node);
    void caseTKickPower(TKickPower node);
    void caseTChoose(TChoose node);
    void caseTWalkTowards(TWalkTowards node);
    void caseTWalkAway(TWalkAway node);
    void caseTRunTowards(TRunTowards node);
    void caseTRunAway(TRunAway node);
    void caseTJump(TJump node);
    void caseTCrouch(TCrouch node);
    void caseTStand(TStand node);
    void caseTAlways(TAlways node);
    void caseTNear(TNear node);
    void caseTFar(TFar node);
    void caseTMuchStronger(TMuchStronger node);
    void caseTStronger(TStronger node);
    void caseTEven(TEven node);
    void caseTWeaker(TWeaker node);
    void caseTMuchWeaker(TMuchWeaker node);
    void caseTBlockLow(TBlockLow node);
    void caseTBlockHigh(TBlockHigh node);
    void caseTPunchLow(TPunchLow node);
    void caseTPunchHigh(TPunchHigh node);
    void caseTKickLow(TKickLow node);
    void caseTKickHigh(TKickHigh node);
    void caseEOF(EOF node);
}