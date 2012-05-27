package compiler.abstree.tree;

import java.util.*;

import compiler.abstree.AbsCallVisitor;
import compiler.abstree.AbsCodeVisitor;
import compiler.abstree.AbsVisitor;
import compiler.imcode.ImcCode;

/**
 * Deklaracije: seznam deklaracij.
 */
public class AbsDecls extends AbsTree {
	
	/** Seznam deklaracij. */
	public LinkedList<AbsDecl> decls;
	
	public AbsDecls() {
		decls = new LinkedList<AbsDecl>();
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
