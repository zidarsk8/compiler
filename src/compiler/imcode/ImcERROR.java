package compiler.imcode;

import java.io.*;

public class ImcERROR extends ImcStmt {

	/** Ponor.  */
	public String err;

	public ImcERROR(String text) {
		this.err = text;
	}

	@Override
	public void toXML(PrintStream xml) {
		xml.print("<imcnode kind=\"ERROR\">\n"+err);

		xml.print("</imcnode>\n");
	}

	@Override
	public ImcSEQ linear() {
		ImcSEQ lin = new ImcSEQ();
		//System.out.println(err);
		lin.stmts.add(new ImcERROR(err));
		return lin;
	}

}
