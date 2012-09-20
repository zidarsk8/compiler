package compiler.abstree.tree;

import compiler.abstree.AbsCallVisitor;
import compiler.abstree.AbsCodeVisitor;
import compiler.abstree.AbsVisitor;
import compiler.imcode.ImcCode;

/**
 * Izrazi za opis vrednosti: konstante atomarnih tipov.
 */
public class AbsAtomConst extends AbsConstExpr {
	
	public final static int BOOL = 0;
	public final static int CHAR = 1;
	public final static int INT = 2;
	public final static int LINE = 4;

	/** Vrednost konstante. */
	public String value;
	
	/** Tip konstante. */
	public int type;
	
	public AbsAtomConst(String value, int type) {
		this.value = value;
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
