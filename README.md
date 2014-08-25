Design Patterns
=====

## Chain of responsibility (Chaîne de responsabilité)

La chaîne de responsabilité permet de découpler l'émetteur et le destinataire d'une requête.

La requête est passée à un jeu de destinataires liés en chaîne ayant chacun la possibilité d'effectuer un traitement.

Les caractéristiques de ce design pattern sont :

* L'émetteur et le destinataire sont "découplés"
* 1 ou plusieurs intermédiaires interviennent (la résolution des destinataires est dynamique)
* Les destinataires ne sont pas explicitement définis

La spécification Servlet Filter repose sur ce motif de conception.

La librairie [Apache commons-chain](http://commons.apache.org/proper/commons-chain/) fournit une implémentation avancée de ce design pattern. 

## State (Etat)

Le motif de conception (ou design pattern) "State" est un pattern de comportement.

Il offre un moyen de changer dynamiquement le comportement d'un système en fonction de son état ("State"), en évitant d'avoir recours
à des blocs conditionnels ("if,  else if, else if ...).

Ce pattern est relativement proche du "Strategy design pattern".

![Alt text](/state-pattern/src/main/resources/state-pattern-uml.PNG?raw=true "State pattern")

Ce pattern permet de modéliser par exemple le comportement de "machine à états" (la classe com.sqli.patterns.strategy.Context).

[State pattern Wikipédia](http://en.wikipedia.org/wiki/State_pattern)

## Strategy (Stratégie)

Tout comme le pattern "State", le pattern "Strategy" permet de changer dynamiquement le comportement d'un système.
 
Pour cela, les comportements sont encapsulés en une famille d'algorithmes qui partagent la même interface. 

La classe d'implémentation est remplacée dynamiquement en fonction du contexte.

![Alt text](/strategy-pattern/src/main/resources/strategy-pattern.PNG?raw=true "Strategy pattern")

[Strategy pattern Wikipédia](http://en.wikipedia.org/wiki/Strategy_pattern)