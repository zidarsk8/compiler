package compiler.abstree.tree;

import compiler.abstree.AbsCallVisitor;
import compiler.abstree.AbsCodeVisitor;
import compiler.abstree.AbsVisitor;
import compiler.imcode.ImcCode;

/**
 * Deklaracija konstante.
 */
public class AbsConstDecl extends AbsDecl {

	/** Ime konstante. */
	public AbsDeclName name;
	
	/** Vrednost konstante. */
	public AbsValExpr value;
	
	public AbsConstDecl(AbsDeclName name, AbsValExpr value) {
		this.name = name;
		this.value = value;
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
