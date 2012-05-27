package compiler.abstree.tree;

import compiler.abstree.AbsCallVisitor;
import compiler.abstree.AbsCodeVisitor;
import compiler.abstree.AbsVisitor;
import compiler.imcode.ImcCode;

/** Stavek for.
 */
public class AbsForStmt extends AbsStmt {

	/** Ime zancne spremenljivke. */
	public AbsValName name;
	
	/** Spodnja meja. */
	public AbsValExpr loBound;
	
	/** Zgornja meja. */
	public AbsValExpr hiBound;
	
	/** Stavek. */
	public AbsStmt stmt;
	
	public AbsForStmt(AbsValName name, AbsValExpr loBound, AbsValExpr hiBound, AbsStmt stmt) {
		this.name = name;
		this.loBound = loBound;
		this.hiBound = hiBound;
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
