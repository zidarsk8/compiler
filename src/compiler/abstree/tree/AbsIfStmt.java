package compiler.abstree.tree;

import compiler.abstree.AbsCallVisitor;
import compiler.abstree.AbsCodeVisitor;
import compiler.abstree.AbsVisitor;
import compiler.imcode.ImcCode;

/**
 * Stavek 'if'.
 */
public class AbsIfStmt extends AbsStmt {
	
	/** Pogoj. */
	public AbsValExpr cond;

	/** Stavek ob izpolnjenem pogoju. */
	public AbsStmt thenStmt;
	
	/** Stavek ob neizpolnjenem pogoju. */
	public AbsStmt elseStmt;
	
	public AbsIfStmt(AbsValExpr cond, AbsStmt thenStmt, AbsStmt elseStmt) {
		this.cond = cond;
		this.thenStmt = thenStmt;
		this.elseStmt = elseStmt;
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
