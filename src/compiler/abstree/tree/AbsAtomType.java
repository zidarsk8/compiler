package compiler.abstree.tree;

import compiler.abstree.AbsCallVisitor;
import compiler.abstree.AbsCodeVisitor;
import compiler.abstree.AbsVisitor;
import compiler.imcode.ImcCode;

/**
 * Izrazi za opis tipov: atomarni tipi.
 */
public class AbsAtomType extends AbsTypeExpr {

	public static final int BOOL = 0;
	public static final int CHAR = 1;
	public static final int INT = 2;
	public static final int LINE = 4;
	
	/* Tip. */
	public int type;
	
	public AbsAtomType(int type) {
		this.type = type;
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
