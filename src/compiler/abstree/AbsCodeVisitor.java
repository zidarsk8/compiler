package compiler.abstree;

import compiler.abstree.tree.AbsAlloc;
import compiler.abstree.tree.AbsArrayType;
import compiler.abstree.tree.AbsAssignStmt;
import compiler.abstree.tree.AbsAtomConst;
import compiler.abstree.tree.AbsAtomType;
import compiler.abstree.tree.AbsBinExpr;
import compiler.abstree.tree.AbsBlockStmt;
import compiler.abstree.tree.AbsCallExpr;
import compiler.abstree.tree.AbsConstDecl;
import compiler.abstree.tree.AbsDeclName;
import compiler.abstree.tree.AbsDecls;
import compiler.abstree.tree.AbsExprStmt;
import compiler.abstree.tree.AbsForStmt;
import compiler.abstree.tree.AbsFunDecl;
import compiler.abstree.tree.AbsIfStmt;
import compiler.abstree.tree.AbsNilConst;
import compiler.abstree.tree.AbsPointerType;
import compiler.abstree.tree.AbsProcDecl;
import compiler.abstree.tree.AbsProgram;
import compiler.abstree.tree.AbsRecordType;
import compiler.abstree.tree.AbsReturnStmt;
import compiler.abstree.tree.AbsStmts;
import compiler.abstree.tree.AbsTypeDecl;
import compiler.abstree.tree.AbsTypeName;
import compiler.abstree.tree.AbsUnExpr;
import compiler.abstree.tree.AbsValExprs;
import compiler.abstree.tree.AbsValName;
import compiler.abstree.tree.AbsVarDecl;
import compiler.abstree.tree.AbsWhileStmt;
import compiler.imcode.ImcCode;

public interface AbsCodeVisitor {

	public ImcCode codeVisit(AbsAlloc acceptor);
	public ImcCode codeVisit(AbsArrayType acceptor);
	public ImcCode codeVisit(AbsAssignStmt acceptor);
	public ImcCode codeVisit(AbsAtomConst acceptor);
	public ImcCode codeVisit(AbsAtomType acceptor);
	public ImcCode codeVisit(AbsBinExpr acceptor);
	public ImcCode codeVisit(AbsBlockStmt acceptor);
	public ImcCode codeVisit(AbsCallExpr acceptor);
	public ImcCode codeVisit(AbsConstDecl acceptor);
	public ImcCode codeVisit(AbsDeclName acceptor);
	public ImcCode codeVisit(AbsDecls acceptor);
	public ImcCode codeVisit(AbsExprStmt acceptor);
	public ImcCode codeVisit(AbsForStmt acceptor);
	public ImcCode codeVisit(AbsFunDecl acceptor);
	public ImcCode codeVisit(AbsIfStmt acceptor);
	public ImcCode codeVisit(AbsNilConst acceptor);
	public ImcCode codeVisit(AbsPointerType acceptor);
	public ImcCode codeVisit(AbsProcDecl acceptor);
	public ImcCode codeVisit(AbsProgram acceptor);
	public ImcCode codeVisit(AbsRecordType acceptor);
	public ImcCode codeVisit(AbsStmts acceptor);
	public ImcCode codeVisit(AbsTypeDecl acceptor);
	public ImcCode codeVisit(AbsTypeName acceptor);
	public ImcCode codeVisit(AbsUnExpr acceptor);
	public ImcCode codeVisit(AbsValExprs acceptor);
	public ImcCode codeVisit(AbsValName acceptor);
	public ImcCode codeVisit(AbsVarDecl acceptor);
	public ImcCode codeVisit(AbsWhileStmt acceptor);
	public ImcCode codeVisit(AbsReturnStmt acceptor);

}
