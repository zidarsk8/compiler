package compiler.abstree.tree;

import compiler.abstree.AbsCallVisitor;
import compiler.abstree.AbsCodeVisitor;
import compiler.abstree.AbsVisitor;
import compiler.imcode.ImcCode;

/**
 * Izrazi za opis vrednosti: izrazi z binarnim operatorjem.
 */
public class AbsIifExpr extends AbsValExpr {

	
	/* Pogog */
	public AbsValExpr condExpr;
	
	/* Levi podizraz. */
	public AbsValExpr fstExpr;
	
	/* Desni podizraz. */
	public AbsValExpr sndExpr;
	
	public AbsIifExpr(AbsValExpr condExpr, AbsValExpr fstExpr, AbsValExpr sndExpr) {
		this.condExpr = condExpr;
		this.fstExpr = fstExpr;
		this.sndExpr = sndExpr;
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
