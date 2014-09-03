Design Patterns
=====

## Command (Commande)

Le principe de ce motif de conception est d'encapsuler l'invocation. 

**La commande** encapsule l'invocation et référence le destinataire - **receiver** -, et les autres informations nécessaires à l'invocation : la méthode à exécuter et ses paramètres.

Elle est exécutée par **l'invocateur** (invoker).

Le client référence, l'invocateur, une ou plusieurs commandes et décide laquelle invoquer. 

Exemple : un téléspectateur (le client/the client), une télécommande (l'invocateur/the invoker), les boutons de la télécommende (les commandes/the command), la télévision (le destinataire/the receiver).

![Alt text](/command-pattern/src/main/resources/command-pattern.PNG?raw=true "Command pattern")

## Chain of responsibility (Chaîne de responsabilité)

La chaîne de responsabilité permet de découpler l'émetteur et le destinataire d'une requête.

La requête est passée à un jeu de destinataires liés en chaîne ayant chacun la possibilité d'effectuer un traitement.

Les caractéristiques de ce design pattern sont :

* L'émetteur de la requête et les destinataires sont reliés de manière lâche ("loosely coupled")
* 1 ou plusieurs intermédiaires interviennent (la résolution des destinataires est dynamique)
* Les destinataires ne sont pas explicitement définis

La spécification Servlet Filter repose sur ce motif de conception.

La librairie [Apache commons-chain](http://commons.apache.org/proper/commons-chain/) fournit une implémentation avancée de ce design pattern. 

![Alt text](/cor-pattern/src/main/resources/cor-pattern.PNG?raw=true "Chain of responsibility pattern")

**Utilisation :** Ce pattern s'utilise lorsque qu'un ou plusieurs traitements peuvent être envisagés comme une chaine, chaque maillon de la chaîne étant découplé des autres et optionnel.


## State (Etat)

Le motif de conception (ou design pattern) "State" est un pattern de comportement.

Il offre un moyen de changer dynamiquement le comportement d'un système en fonction de son état ("State"), en évitant d'avoir recours
à des blocs conditionnels ("if,  else if, else if ...).

Ce pattern est relativement proche du "Strategy design pattern".

![Alt text](/state-pattern/src/main/resources/state-pattern-uml.PNG?raw=true "State pattern")

Il permet de modéliser par exemple le comportement de la "machine à états" (la classe com.sqli.patterns.strategy.Context).

[State pattern Wikipédia](http://en.wikipedia.org/wiki/State_pattern)

## Strategy (Stratégie)

Tout comme le pattern "State", le pattern "Strategy" permet de changer dynamiquement le comportement d'un système.
 
Pour cela, les comportements sont encapsulés en une famille d'algorithmes qui partagent la même interface. 

La classe d'implémentation est remplacée dynamiquement en fonction du contexte.

![Alt text](/strategy-pattern/src/main/resources/strategy-pattern.PNG?raw=true "Strategy pattern")

[Strategy pattern Wikipédia](http://en.wikipedia.org/wiki/Strategy_pattern)