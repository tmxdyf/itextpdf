package com.lowagie.text.pdf.codec.postscript.commands;

import com.lowagie.text.pdf.codec.postscript.PACommand;
import com.lowagie.text.pdf.codec.postscript.PAContext;
import com.lowagie.text.pdf.codec.postscript.PainterException;
import com.lowagie.text.pdf.codec.postscript.interfaces.*;

public class version
    implements PACommand, IPSLevel1 {
  public version() {
    super();
  }

  public void execute(PAContext context) throws PainterException {
    context.operands.push("2016");
  }
}