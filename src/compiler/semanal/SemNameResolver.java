package compiler.semanal;

import java.util.LinkedList;

import compiler.abstree.*;
import compiler.abstree.tree.AbsAlloc;
import compiler.abstree.tree.AbsArrayType;
import compiler.abstree.tree.AbsAssignStmt;
import compiler.abstree.tree.AbsAtomConst;
import compiler.abstree.tree.AbsAtomType;
import compiler.abstree.tree.AbsBinExpr;
import compiler.abstree.tree.AbsBlockStmt;
import compiler.abstree.tree.AbsCallExpr;
import compiler.abstree.tree.AbsConstDecl;
import compiler.abstree.tree.AbsDecl;
import compiler.abstree.tree.AbsDeclName;
import compiler.abstree.tree.AbsDecls;
import compiler.abstree.tree.AbsExprStmt;
import compiler.abstree.tree.AbsForStmt;
import compiler.abstree.tree.AbsFunDecl;
import compiler.abstree.tree.AbsIfStmt;
import compiler.abstree.tree.AbsNilConst;
import compiler.abstree.tree.AbsPointerType;
import compiler.abstree.tree.AbsProcDecl;
import compiler.abstree.tree.AbsProgram;
import compiler.abstree.tree.AbsRecordType;
import compiler.abstree.tree.AbsStmts;
import compiler.abstree.tree.AbsTypeDecl;
import compiler.abstree.tree.AbsTypeName;
import compiler.abstree.tree.AbsUnExpr;
import compiler.abstree.tree.AbsValExprs;
import compiler.abstree.tree.AbsValName;
import compiler.abstree.tree.AbsVarDecl;
import compiler.abstree.tree.AbsWhileStmt;

public class SemNameResolver implements AbsVisitor{

	public boolean error = false;

	@Override
	public void visit(AbsAlloc acceptor) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visit(AbsArrayType acceptor) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visit(AbsAssignStmt acceptor) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visit(AbsAtomConst acceptor) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visit(AbsAtomType acceptor) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visit(AbsBinExpr acceptor) {
		acceptor.fstExpr.accept(this);
		acceptor.sndExpr.accept(this);
	}

	@Override
	public void visit(AbsBlockStmt acceptor) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visit(AbsCallExpr acceptor) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visit(AbsConstDecl acceptor) {
		acceptor.value.accept(this);
		if (SemTable.fnd(acceptor.name.name) !=null &&
				SemDesc.getScope(SemTable.fnd(acceptor.name.name)) == SemDesc.getScope(acceptor)){

			System.out.println(String.format("const %s is redefined at (%d,%d)",
					acceptor.name.name, 
					acceptor.begLine,
					acceptor.begColumn));
		}else{
			try {
				SemTable.ins(acceptor.name.name, acceptor);
			} catch (SemIllegalInsertException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public void visit(AbsDeclName acceptor) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visit(AbsDecls acceptor) {
		for (AbsDecl decl : acceptor.decls) {
			decl.accept(this);
		}
	}

	@Override
	public void visit(AbsExprStmt acceptor) {
		// TODO Auto-generated method stub
	}

	@Override
	public void visit(AbsForStmt acceptor) {
		// TODO Auto-generated method stub
		if (SemTable.fnd(acceptor.name.name) != null) {
		}else{
			System.out.println(String.format("var %s is undefined at (%d,%d)",
					acceptor.name.name, 
					acceptor.begLine,
					acceptor.begColumn));
		}
	}

	@Override
	public void visit(AbsFunDecl acceptor) {
		try {
			SemTable.ins(acceptor.name.name, acceptor.name);
		} catch (SemIllegalInsertException e) {
			e.printStackTrace();
		}
		SemTable.newScope();
		acceptor.decls.accept(this);
		acceptor.type.accept(this);
		acceptor.pars.accept(this);
		acceptor.stmt.accept(this);
		SemTable.oldScope();
	}

	@Override
	public void visit(AbsIfStmt acceptor) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visit(AbsNilConst acceptor) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visit(AbsPointerType acceptor) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visit(AbsProcDecl acceptor) {
		try {
			SemTable.ins(acceptor.name.name, acceptor.name);
		} catch (SemIllegalInsertException e) {
			e.printStackTrace();
		}
		SemTable.newScope();
		acceptor.decls.accept(this);
		acceptor.pars.accept(this);
		acceptor.stmt.accept(this);
		SemTable.oldScope();
	}

	@Override
	public void visit(AbsProgram acceptor) {
		acceptor.decls.accept(this);
		acceptor.stmt.accept(this);
	}

	@Override
	public void visit(AbsRecordType acceptor) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visit(AbsStmts acceptor) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visit(AbsTypeDecl acceptor) {
		acceptor.type.accept(this);
		if (SemTable.fnd(acceptor.name.name) !=null ){
			System.out.println(String.format("var %s is redefined at (%d,%d)",
					acceptor.name.name, 
					acceptor.begLine,
					acceptor.begColumn));
		}else{
			try {
				SemTable.ins(acceptor.name.name, acceptor);
			} catch (SemIllegalInsertException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public void visit(AbsTypeName acceptor) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visit(AbsUnExpr acceptor) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visit(AbsValExprs acceptor) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visit(AbsValName acceptor) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visit(AbsVarDecl acceptor) {
		acceptor.type.accept(this);
		if (SemTable.fnd(acceptor.name.name) !=null ){
			System.out.println(String.format("var %s is redefined at (%d,%d)",
					acceptor.name.name, 
					acceptor.begLine,
					acceptor.begColumn));
		}else{
			try {
				SemTable.ins(acceptor.name.name, acceptor);
			} catch (SemIllegalInsertException e) {
				e.printStackTrace();
			}
		}
	}


	@Override
	public void visit(AbsWhileStmt acceptor) {
		// TODO Auto-generated method stub

	}

}