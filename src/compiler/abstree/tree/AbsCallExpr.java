package compiler.abstree.tree;

import compiler.abstree.AbsCallVisitor;
import compiler.abstree.AbsCodeVisitor;
import compiler.abstree.AbsVisitor;
import compiler.imcode.ImcCode;

/**
 * Izrazi za opis vrednosti: klic podprograma.
 */
public class AbsCallExpr extends AbsValExpr {
	
	/* Ime podprograma. */
	public AbsValName name;
	
	/* Argumenti. */
	public AbsValExprs args;
	
	public AbsCallExpr(AbsValName name, AbsValExprs args) {
		this.name = name;
		this.args = args;
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
