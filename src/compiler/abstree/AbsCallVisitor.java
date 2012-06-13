package compiler.abstree;

import compiler.abstree.tree.*;

public interface AbsCallVisitor {

	public int callVisit(AbsAlloc acceptor);
	public int callVisit(AbsArrayType acceptor);
	public int callVisit(AbsAssignStmt acceptor);
	public int callVisit(AbsAtomConst acceptor);
	public int callVisit(AbsAtomType acceptor);
	public int callVisit(AbsBinExpr acceptor);
	public int callVisit(AbsBlockStmt acceptor);
	public int callVisit(AbsCallExpr acceptor);
	public int callVisit(AbsConstDecl acceptor);
	public int callVisit(AbsDeclName acceptor);
	public int callVisit(AbsDecls acceptor);
	public int callVisit(AbsExprStmt acceptor);
	public int callVisit(AbsForStmt acceptor);
	public int callVisit(AbsFunDecl acceptor);
	public int callVisit(AbsIfStmt acceptor);
	public int callVisit(AbsNilConst acceptor);
	public int callVisit(AbsPointerType acceptor);
	public int callVisit(AbsProcDecl acceptor);
	public int callVisit(AbsProgram acceptor);
	public int callVisit(AbsRecordType acceptor);
	public int callVisit(AbsStmts acceptor);
	public int callVisit(AbsTypeDecl acceptor);
	public int callVisit(AbsTypeName acceptor);
	public int callVisit(AbsUnExpr acceptor);
	public int callVisit(AbsValExprs acceptor);
	public int callVisit(AbsValName acceptor);
	public int callVisit(AbsVarDecl acceptor);
	public int callVisit(AbsWhileStmt acceptor);
	public int callVisit(AbsRepeatStmt acceptor);

}
