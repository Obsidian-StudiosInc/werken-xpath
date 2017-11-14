
package com.werken.xpath.impl;

import org.jdom2.Element;

public class StringExpr extends Expr
{

  private String _text = null;

  public StringExpr(String text)
  {
    _text = text;
  }

  public String toString()
  {
    return ("[(StringExpr) " + _text + "]");
  }

  public Object evaluate(Context context)
  {
    return _text;
  }

}
