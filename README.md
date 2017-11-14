# werken-xpath :: Werken JDOM XPath Engine ::
[![Build Status](https://img.shields.io/travis/Obsidian-StudiosInc/werken-xpath/master.svg?colorA=9977bb&style=plastic)](https://travis-ci.org/Obsidian-StudiosInc/werken-xpath)
[![Build Status](https://img.shields.io/shippable/5a0a1aa5b2a4270700e2dcde/master.svg?colorA=9977bb&style=plastic)](https://app.shippable.com/projects/5a0a1aa5b2a4270700e2dcde/)

## Introduction
This is the Werken JDOM XPath Engine (werken.xpath), created by  the 
Werken & Sons Company. It's available at <http://code.werken.com/xpath>.

It's not overly useful by itself, but rather needs an (currently in
development) implementation of XPointer, XSLT, or other XPath-based 
specification.  werken.xpath is merely an engine which can parse XPaths,
and walk JDOM <http://www.jdom.org/> trees.


## Requirements

* A modern Java2 platform :: 

  I'm using Sun's official JSDK 1.3 for Linux.  Others should work
  without much trouble also.

    <http://java.sun.com/>
    <http://www.blackdown.org/>
    <http://www.ibm.com/>


* The JDOM package. 

  This was written against the CVS tree, so it might not work with
  whatever milestone source drop you're using.  Hopefully a stable 
  release of JDOM will appear, and we can nail down a specific minimum
  version. 

    <http://www.jdom.org/>


* ANTLR Parser-Generator 2.7.x

  Once again, I'm using a pre-release candidate, which has special
  new features to play friendly with jakarta-ant (which is included).

  The version of ANTLR we're using is (and always will be) included
  in the distribution of werken.xpath.  If you wish, you may always obtain
  your own copy, with full documentation.  *Everything* is simply a
  parsing problem, after all.

    <http://www.antlr.org/>


## Documentation
Generated javadoc documentation will appear in the build/apidocs/
directory.

## License
werken.xpath is licensed under the Apache Software Foundation
license. Please see <http://www.apache.org/> for more information.
Basically, do what ever you wish, as long as you mention "Werken &
Sons Company" some where in your documentation, colophon, or 'about'
box.  Just some place, give credit where credit is due.


## Acknowledgements
  * bob mcwhirter/@bobmcwhirter (bob@werken.com)
    Implementor of the initial code base of werken.xpath.

  * Michael Hinchy
    Originally started the JDOM XPath project, but Bob forked, with 100% 
    original code.  Still, he motivated the work.

  * Terence Parr/@parrt
    Let Bob hack on ANTLR for his own evil purposes.  Also, he 
    originally wrote ANTLR, and like to give him credit for the  
    wonderful tool he's graciouslly given to the community.

  * Jason Hunter/@hunterhacker
    One of the JDOM guys (sorry, but Bob never dealt with Brett). Lively 
    banter back'n'forth regarding JDOM, XPath, ant && antlr.
