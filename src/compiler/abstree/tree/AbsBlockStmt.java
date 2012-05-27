package compiler.abstree.tree;

import compiler.abstree.AbsCallVisitor;
import compiler.abstree.AbsCodeVisitor;
import compiler.abstree.AbsVisitor;
import compiler.imcode.ImcCode;

/**
 * Sestavljeni stavek.
 */
public class AbsBlockStmt extends AbsStmt {

	/** Stavki. */
	public AbsStmts stmts;
	
	public AbsBlockStmt(AbsStmts stmts) {
		this.stmts = stmts;
	}

	public void accept(AbsVisitor visitor) {
		visitor.visit(this);
	}

	@Override
	public int callVisit(AbsCallVisitor visitor) {
		return visitor.callVisit(this);
	}
	
	@Override
	public ImcCode codeVisit(AbsCodeVisitor visitor) {
		return visitor.codeVisit(this);
	}
}
