
package com.werken.xpath.impl;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.ProcessingInstruction;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;

public class PIStep extends NodeTypeStep
{
  private String _target = null;
  
  public PIStep(String axis,
                String target)
  {
    super(axis, null);
    _target = target;
  }

  protected boolean matches(Object node)
  {
    
    if ( node instanceof ProcessingInstruction )
    {
      if ( _target == null )
      {
        return true;
      }
      else if ( _target.equals( ((ProcessingInstruction)node).getTarget() ) )
      {
        return true;
      }
    }

    return false;
  }
}
