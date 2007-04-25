package com.lowagie.text.pdf.codec.postscript.commands;

import com.lowagie.text.pdf.codec.postscript.PACommand;
import com.lowagie.text.pdf.codec.postscript.PAContext;
import com.lowagie.text.pdf.codec.postscript.PainterException;
import com.lowagie.text.pdf.codec.postscript.interfaces.*;

public class pop implements PACommand,IPSLevel1{
  public pop() {
    super();
  }

  public void execute(PAContext context) throws PainterException {
      context.popOperands(1);
      if(PAContext.DebugCommandleveltrace)System.out.println("pop");
    }

}