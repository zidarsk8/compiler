package compiler.abstree.tree;

import compiler.abstree.AbsCallVisitor;
import compiler.abstree.AbsCodeVisitor;
import compiler.abstree.AbsVisitor;
import compiler.imcode.ImcCode;

/**
 * Prireditveni stavek.
 */
public class AbsAssignStmt extends AbsStmt {

	/** Izraz na levi strani prirejanja. */
	public AbsValExpr dstExpr;
	
	/** Izraz na desni strani prirejanja. */
	public AbsValExpr srcExpr;
	
	public AbsAssignStmt(AbsValExpr dstExpr, AbsValExpr srcExpr) {
		this.dstExpr = dstExpr;
		this.srcExpr = srcExpr;
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
