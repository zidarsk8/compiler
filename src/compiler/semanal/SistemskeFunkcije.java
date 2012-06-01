package compiler.semanal;

import java.util.TreeSet;

import compiler.abstree.tree.AbsAtomType;
import compiler.abstree.tree.AbsBlockStmt;
import compiler.abstree.tree.AbsDeclName;
import compiler.abstree.tree.AbsDecls;
import compiler.abstree.tree.AbsProcDecl;
import compiler.abstree.tree.AbsStmts;
import compiler.abstree.tree.AbsVarDecl;
import compiler.semanal.type.SemAtomType;
import compiler.semanal.type.SemSubprogramType;

public class SistemskeFunkcije {

	public static final int FAKE_FP = 2011988;

	private static TreeSet<String> functions = new TreeSet<String>();
	private static TreeSet<String> procedures = new TreeSet<String>();

	public static void fillData() {

		genProcedure("free",SemAtomType.VOID);
		genProcedure("putch",SemAtomType.CHAR);
		genProcedure("putnl");
		genProcedure("putint",SemAtomType.INT);
		genFunction("getch",SemAtomType.CHAR);
		genFunction("getint",SemAtomType.INT);
		genFunction("ord",SemAtomType.INT,SemAtomType.CHAR);
		genFunction("chr",SemAtomType.CHAR,SemAtomType.INT);

	}

	private static void genProcedure(String name, Integer... pars){
		try {
			procedures.add(name);
			AbsDecls pardecls = new AbsDecls();
			SemSubprogramType type = new SemSubprogramType(new SemAtomType(SemAtomType.VOID));
			int c = 0;
			for (Integer i: pars){
				pardecls.decls.add(new AbsVarDecl(new AbsDeclName("var"+c++), new AbsAtomType(i)));
				type.addParType(new SemAtomType(i));
			}
			AbsProcDecl acceptor = new AbsProcDecl(new AbsDeclName(name), pardecls, new AbsDecls(), new AbsBlockStmt(new AbsStmts()));
			SemTable.ins(acceptor.name.name, acceptor);
			SemDesc.setActualType(acceptor, type);
		} catch (SemIllegalInsertException e) {
			System.out.println("error making fake function: "+name);
			e.printStackTrace();
		}
	}

	private static void genFunction(String name, Integer... pars){
		try {
			functions.add(name);
			AbsDecls pardecls = new AbsDecls();
			SemSubprogramType type = null;
			int c = 0;
			for (Integer i: pars){
				if (type == null){
					type = new SemSubprogramType(new SemAtomType(i));
				}else{
					pardecls.decls.add(new AbsVarDecl(new AbsDeclName("var"+c++), new AbsAtomType(i)));
					type.addParType(new SemAtomType(i));
				}
			}
			AbsProcDecl acceptor = new AbsProcDecl(new AbsDeclName(name), pardecls, new AbsDecls(), new AbsBlockStmt(new AbsStmts()));
			SemTable.ins(acceptor.name.name, acceptor);
			SemDesc.setActualType(acceptor, type);
		} catch (SemIllegalInsertException e) {
			System.out.println("error making fake function: "+name);
			e.printStackTrace();
		}
	}

	public static boolean isSys(String name) {
		return procedures.contains(name) || functions.contains(name);
	}

}
