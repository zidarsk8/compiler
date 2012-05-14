package compiler.abstree.tree;

import compiler.abstree.AbsCallVisitor;
import compiler.abstree.AbsVisitor;

/**
 * Klic procedure.
 */
public class AbsExprStmt extends AbsStmt {

	/** Izraz. */
	public AbsValExpr expr;
	
	public AbsExprStmt(AbsValExpr expr) {
		this.expr = expr;
	}
	
	public void accept(AbsVisitor visitor) {
		visitor.visit(this);
	}

	@Override
	public int callVisit(AbsCallVisitor visitor) {
		return visitor.callVisit(this);
	}
}
