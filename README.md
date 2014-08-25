Design Patterns
=====

## State

Le motif de conception (ou design pattern) "State" est un pattern de comportement.

Il offre un moyen de changer dynamiquement le comportement d'un système en fonction de son état ("State"), en évitant d'avoir recours
à des blocs conditionnels ("if,  else if, else if ...).

Ce pattern est relativement proche du "Strategy design pattern".

![Alt text](/state-pattern/src/main/resources/state-pattern-uml.PNG?raw=true "State pattern")

Ce pattern permet de modéliser par exemple le comportement de "machine à états" (la classe com.sqli.patterns.strategy.Context).

[State pattern Wikipédia](http://en.wikipedia.org/wiki/State_pattern)

## Strategy

Tout comme le pattern "State", le pattern "Strategy" permet de changer dynamiquement le comportement d'un système.
 
Pour cela, les comportements sont encapsulés en une famille d'algorithmes qui partagent la même interface. 

La classe d'implémentation est remplacée dynamiquement en fonction du contexte.

![Alt text](/strategy-pattern/src/main/resources/strategy-pattern.PNG?raw=true "Strategy pattern")

[Strategy pattern Wikipédia](http://en.wikipedia.org/wiki/Strategy_pattern)