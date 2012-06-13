package compiler.abstree.tree;

import compiler.abstree.AbsCallVisitor;
import compiler.abstree.AbsCodeVisitor;
import compiler.abstree.AbsVisitor;
import compiler.imcode.ImcCode;

/**
 * Stavek 'while'.
 */
public class AbsRepeatStmt extends AbsStmt {

	/** Pogoj. */
	public AbsValExpr cond;
	
	/** Stavek. */
	public AbsStmts stmt;
	
	public AbsRepeatStmt(AbsValExpr cond, AbsStmts stmt) {
		this.cond = cond;
		this.stmt = stmt;
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
