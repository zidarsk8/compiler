package compiler.imcode;

import java.util.LinkedList;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.LocatorEx.Snapshot;

import compiler.abstree.AbsCodeVisitor;
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
import compiler.abstree.tree.AbsStmt;
import compiler.abstree.tree.AbsStmts;
import compiler.abstree.tree.AbsTypeDecl;
import compiler.abstree.tree.AbsTypeName;
import compiler.abstree.tree.AbsUnExpr;
import compiler.abstree.tree.AbsValExprs;
import compiler.abstree.tree.AbsValName;
import compiler.abstree.tree.AbsVarDecl;
import compiler.abstree.tree.AbsWhileStmt;
import compiler.frames.FrmAccess;
import compiler.frames.FrmArgAccess;
import compiler.frames.FrmDesc;
import compiler.frames.FrmLabel;
import compiler.frames.FrmLocAccess;
import compiler.frames.FrmVarAccess;
import compiler.semanal.SemDesc;
import compiler.semanal.type.SemArrayType;
import compiler.semanal.type.SemRecordType;
import compiler.semanal.type.SemType;

public class IMCodeGenerator implements AbsCodeVisitor {

	public LinkedList<ImcChunk> chunks = new LinkedList<ImcChunk>();
	
	@Override
	public ImcCode codeVisit(AbsAlloc acceptor) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public ImcCode codeVisit(AbsArrayType acceptor) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public ImcCode codeVisit(AbsAssignStmt acceptor) {
		System.out.println("AbsAssignStmt accept");
		ImcExpr srcExpr = (ImcExpr)acceptor.srcExpr.codeVisit(this);
		ImcExpr dstExpr = (ImcExpr)acceptor.dstExpr.codeVisit(this);
		return new ImcMOVE(dstExpr,srcExpr);
	}
	@Override
	public ImcCode codeVisit(AbsAtomConst acceptor) {
		switch (acceptor.type) {
		case AbsAtomConst.BOOL:
			return new ImcCONST(acceptor.value.equals("true") ? 1 : 0);
		case AbsAtomConst.CHAR:
			return new ImcCONST((int) acceptor.value.charAt(1));
		case AbsAtomConst.INT:
			return new ImcCONST(Integer.parseInt(acceptor.value));
		default:
			return null;
		}
	}
	@Override
	public ImcCode codeVisit(AbsAtomType acceptor) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public ImcCode codeVisit(AbsBinExpr acceptor) {
		System.out.println("AbsBinExpr accept");
		if (acceptor.oper == AbsBinExpr.RECACCESS){
			SemRecordType srt = (SemRecordType) SemDesc.getActualType(acceptor.fstExpr);
			int offset = 0;
			for (int i = 0; i < srt.getNumFields(); i++) {
				if (((AbsValName)acceptor.sndExpr).name.equals(srt.getFieldName(i).name)){
					return new ImcMEM(new ImcBINOP(ImcBINOP.ADD, 
							((ImcMEM)acceptor.fstExpr.codeVisit(this)).expr, new ImcCONST(offset)));
				}
				offset += srt.getFieldType(i).size();
			}
		}else if (acceptor.oper == AbsBinExpr.ARRACCESS){
			ImcExpr fexp = (ImcExpr) ((ImcMEM)acceptor.fstExpr.codeVisit(this)).expr;
			ImcExpr sexp = (ImcExpr) acceptor.sndExpr.codeVisit(this);
			
			SemArrayType arr = (SemArrayType) SemDesc.getActualType(acceptor.fstExpr);
			
			ImcBINOP ind = new ImcBINOP(ImcBINOP.SUB, sexp, new ImcCONST(arr.loBound));
			ImcBINOP ofset = new ImcBINOP(ImcBINOP.MUL, ind, new ImcCONST(arr.type.size()));
			
			return new ImcMEM(new ImcBINOP(ImcBINOP.ADD, fexp, ofset));
		}else{
			ImcExpr fexp = (ImcExpr) acceptor.fstExpr.codeVisit(this);
			ImcExpr sexp = (ImcExpr) acceptor.sndExpr.codeVisit(this);
			return new ImcMEM(new ImcBINOP(acceptor.oper, fexp, sexp));
		}
		return null;
	}
	@Override
	public ImcCode codeVisit(AbsBlockStmt acceptor) {
		System.out.println("AbsBlockStmt accept");
		return acceptor.stmts.codeVisit(this);
	}
	@Override
	public ImcCode codeVisit(AbsCallExpr acceptor) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public ImcCode codeVisit(AbsConstDecl acceptor) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public ImcCode codeVisit(AbsDeclName acceptor) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public ImcCode codeVisit(AbsDecls acceptor) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public ImcCode codeVisit(AbsExprStmt acceptor) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public ImcCode codeVisit(AbsForStmt acceptor) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public ImcCode codeVisit(AbsFunDecl acceptor) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public ImcCode codeVisit(AbsIfStmt acceptor) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public ImcCode codeVisit(AbsNilConst acceptor) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public ImcCode codeVisit(AbsPointerType acceptor) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public ImcCode codeVisit(AbsProcDecl acceptor) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public ImcCode codeVisit(AbsProgram acceptor) {
		acceptor.decls.codeVisit(this);
		ImcCode code = acceptor.stmt.codeVisit(this);
		chunks.add(new ImcCodeChunk(FrmDesc.getFrame(acceptor), (ImcStmt)code));
		
		for (AbsDecl decl : acceptor.decls.decls) {
			if (decl instanceof AbsVarDecl) {
				AbsVarDecl varDecl = (AbsVarDecl)decl;
				FrmVarAccess access = (FrmVarAccess)FrmDesc.getAccess(varDecl);
				SemType type = SemDesc.getActualType(varDecl.type);
				ImcDataChunk dataChunk = new ImcDataChunk(access.label, (type != null ? type.size() : 0));
				chunks.add(dataChunk);
			} 
		}
		
		return null;
	}
	@Override
	public ImcCode codeVisit(AbsRecordType acceptor) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public ImcCode codeVisit(AbsStmts acceptor) {
		ImcSEQ seq = new ImcSEQ();
		for (AbsStmt stmt: acceptor.stmts) {
			seq.stmts.add((ImcStmt) stmt.codeVisit(this));
		}
		return seq;
	}
	@Override
	public ImcCode codeVisit(AbsTypeDecl acceptor) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public ImcCode codeVisit(AbsTypeName acceptor) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public ImcCode codeVisit(AbsUnExpr acceptor) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public ImcCode codeVisit(AbsValExprs acceptor) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public ImcCode codeVisit(AbsValName acceptor) {
		ImcCode code = null;
		FrmLabel label = null;
		AbsDecl decl = SemDesc.getNameDecl(acceptor);
		FrmAccess access = FrmDesc.getAccess(decl);		
		
		if (access instanceof FrmArgAccess) {
			FrmArgAccess argAccess = (FrmArgAccess)access;
			//TODO: use
			ImcBINOP binop = new ImcBINOP(ImcBINOP.ADD, (ImcExpr)code, new ImcCONST(argAccess.offset));
			code = new ImcMEM((ImcExpr)binop);
			
		} else if (access instanceof FrmLocAccess) {
			FrmLocAccess laccess = (FrmLocAccess)access;
			label = laccess.frame.label;
			ImcExpr limc = null;
			ImcCONST rimc = new ImcCONST(laccess.offset); 
			ImcBINOP expr = new ImcBINOP(ImcBINOP.ADD, limc, rimc);
			code = new ImcMEM(expr);
			
		} else if (access instanceof FrmVarAccess) {
			label = ((FrmVarAccess)access).label;
			code = new ImcMEM(new ImcNAME(label));
			
		} else if(access == null){
			Integer val = SemDesc.getActualConst(decl);
			if(val != null){
				code = new ImcCONST(val);
			}
		}
		
		return code;
	}
	@Override
	public ImcCode codeVisit(AbsVarDecl acceptor) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public ImcCode codeVisit(AbsWhileStmt acceptor) {
		// TODO Auto-generated method stub
		return null;
	}

}
