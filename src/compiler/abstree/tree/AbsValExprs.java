package compiler.abstree.tree;

import java.util.*;

import compiler.abstree.AbsCallVisitor;
import compiler.abstree.AbsCodeVisitor;
import compiler.abstree.AbsVisitor;
import compiler.imcode.ImcCode;

/**
 * Izrazi za opis vrednosti: seznam izrazov.
 */
public class AbsValExprs extends AbsTree {

	/* Izrazi. */
	public LinkedList<AbsValExpr> exprs;
	
	public AbsValExprs() {
		this.exprs = new LinkedList<AbsValExpr>();
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
