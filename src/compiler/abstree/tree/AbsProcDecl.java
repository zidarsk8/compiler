package compiler.abstree.tree;

import compiler.abstree.AbsCallVisitor;
import compiler.abstree.AbsCodeVisitor;
import compiler.abstree.AbsVisitor;
import compiler.imcode.ImcCode;

/**
 * Deklaracije: procedura.
 */
public class AbsProcDecl extends AbsDecl {

	/** Ime. */
	public AbsDeclName name;
	
	/** Parametri. */
	public AbsDecls pars;
	
	/** Deklaracije. */
	public AbsDecls decls;
	
	/** Stavek. */
	public AbsBlockStmt stmt;
	
	public AbsProcDecl(AbsDeclName name, AbsDecls pars, AbsDecls decls, AbsBlockStmt stmt) {
		this.name = name;
		this.pars = pars;
		this.decls = decls;
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
