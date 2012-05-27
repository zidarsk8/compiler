package compiler.abstree.tree;

import java.util.*;

import compiler.abstree.AbsCallVisitor;
import compiler.abstree.AbsCodeVisitor;
import compiler.abstree.AbsVisitor;
import compiler.imcode.ImcCode;

/**
 * Stavki: seznam stavkov.
 */
public class AbsStmts extends AbsTree {
	
	/** Seznam stavkov. */
	public LinkedList<AbsStmt> stmts;
	
	public AbsStmts() {
		stmts = new LinkedList<AbsStmt>();
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
