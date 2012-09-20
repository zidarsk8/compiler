package compiler.abstree.tree;

import compiler.abstree.AbsCallVisitor;
import compiler.abstree.AbsCodeVisitor;
import compiler.abstree.AbsVisitor;
import compiler.imcode.ImcCode;

/**
 * Deklaracija spremenljivke.
 */
public class AbsVarDecl extends AbsDecl {

	/** Ime spremenljivke. */
	public AbsDeclName name;
	
	/** Tip spremenljivke. */
	public AbsTypeExpr type;

	/* Single */
	public boolean single;
	
	/* Single */
	public boolean isSet;

	public AbsVarDecl(AbsDeclName name, AbsTypeExpr type) {
		this.name = name;
		this.type = type;
		this.single = false;
		this.isSet = false;
	}

	public AbsVarDecl(AbsDeclName name, AbsTypeExpr type, boolean single) {
		this.name = name;
		this.type = type;
		this.single = single;
		this.isSet = false;
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
