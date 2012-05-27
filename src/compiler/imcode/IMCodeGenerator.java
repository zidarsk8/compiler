package compiler.imcode;

import java.util.LinkedList;

import compiler.abstree.AbsVisitor;
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
import compiler.frames.FrmDesc;
import compiler.frames.FrmFrame;
import compiler.frames.FrmVarAccess;
import compiler.semanal.SemDesc;
import compiler.semanal.type.SemType;

public class IMCodeGenerator implements AbsVisitor {

	public LinkedList<ImcChunk> chunks = new LinkedList<ImcChunk>();
	private ImcCode code;

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
		// TODO Auto-generated method stub
		
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
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(AbsDeclName acceptor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(AbsDecls acceptor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(AbsExprStmt acceptor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(AbsForStmt acceptor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(AbsFunDecl acceptor) {
		// TODO Auto-generated method stub
		
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
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(AbsProgram acceptor) {
		FrmFrame frame = FrmDesc.getFrame(acceptor);
		acceptor.stmt.accept(this);
		ImcCodeChunk codeChunk = new ImcCodeChunk(frame, (ImcStmt)code);
		chunks.add(codeChunk);
		
		for (AbsDecl decl : acceptor.decls.decls) {
			if (decl instanceof AbsVarDecl) {
				AbsVarDecl varDecl = (AbsVarDecl)decl;
				FrmVarAccess access = (FrmVarAccess)FrmDesc.getAccess(varDecl);
				SemType type = SemDesc.getActualType(varDecl.type);
				ImcDataChunk dataChunk = new ImcDataChunk(access.label, (type != null ? type.size() : 0));
				chunks.add(dataChunk);
			} 
		}
		acceptor.decls.accept(this);

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
		// TODO Auto-generated method stub
		
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
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(AbsWhileStmt acceptor) {
		// TODO Auto-generated method stub
		
	}

}
