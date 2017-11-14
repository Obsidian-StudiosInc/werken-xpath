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
* Gradle <https://gradle.org/>
* JDOM 2.x <http://www.jdom.org/>
* ANTLR 2.7.x <http://www.antlr.org/> (need to update to newer 4.x)

## Documentation
Generated javadoc documentation will appear in the build/apidocs/ directory.

## License
werken.xpath is licensed under the Apache Software Foundation
license. Please see <http://www.apache.org/> for more information.
Basically, do what ever you wish, as long as you mention "Werken &
Sons Company" some where in your documentation, colophon, or 'about'
box.  Just some place, give credit where credit is due.

## Acknowledgements
  * Bob Mcwhirter / [@bobmcwhirter](https://github.com/bobmcwhirter) 
    Implementor of the initial code base of werken.xpath.

  * Michael Hinchy
    Originally started the JDOM XPath project, but Bob forked, with 100% 
    original code.  Still, he motivated the work.

  * Terence Parr / [@parrt](https://github.com/@parrt)
    Let Bob hack on ANTLR for his own evil purposes.  Also, he 
    originally wrote ANTLR, and like to give him credit for the  
    wonderful tool he's graciouslly given to the community.

  * Jason Hunter / [@hunterhacker](https://github.com/@hunterhacker)
    One of the JDOM guys (sorry, but Bob never dealt with Brett). Lively 
    banter back'n'forth regarding JDOM, XPath, ant && antlr.
