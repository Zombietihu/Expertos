hombre(juan).
hombre(carlos).
hombre(soltero).
hombre(victor).
hombre(carlitos).
hombre(jorge).
hombre(luis).
hombre(pedro).

mujer(rosario).
mujer(belen).
mujer(elena).
mujer(consuelo).
mujer(maria).
mujer(ana).


padre(juan,carlos).
padre(juan,rosario).
padre(juan,soltero).
padre(victor, belen).
padre(carlos,elena).
padre(carlos,carlitos).
padre(jorge,luis).
padre(jorge,pedro).
padre(jorge,ana).

madre(maria, soltero).
madre(maria,carlos).
madre(maria,rosario).
madre(consuelo,belen).
madre(belen,elena).
madre(belen,carlitos).
madre(rosario,luis).
madre(rosario,pedro).
madre(rosario,ana).


abuelo(Ab,Nieto) :- padre(Ab,Hijo) , padre(Hijo,Nieto).
abuelo(Ab,Nieto) :- padre(Ab,Hija) , madre(Hija,Nieto).
abuela(Ab,Nieto) :- padre(Ab,Hijo) , padre(Hijo,Nieto).
abuela(Ab,Nieto) :- madre(Ab,Hija) , padre(Hija,Nieto).
/*hijos_hijas*/

hijo(H,P,M):-padre(P,H),madre(M,H),matrimonio(P,M), hombre(H).
hija(H,P,M):-padre(P,H),madre(M,H),matrimonio(P,M), mujer(H).
/*hermano o hermana*/
hermano(Her1,Her2) :- padre(P,Her1),padre(P,Her2),madre(M,Her1),madre(M,Her1),hombre(Her1),Her1\=Her2.
hermana(Her1,Her2) :- padre(P,Her1),padre(P,Her2),madre(M,Her1),madre(M,Her1),mujer(Her1),Her1\=Her2.
/*Parejas*/
matrimonio(juan,maria).
matrimonio(victor,consuelo).
matrimonio(carlos,belen).
matrimonio(jorge,rosario).
/*primos*/
primos(P1,P2):- padre(X,P1),madre(Y,P2),hermano(X,Y).
primos(P1,P2):- madre(Y,P1),padre(X,P2),hermana(Y,X).

tio(Tio,Sobrino) :- padre(X,Sobrino) , hermano(X,Tio) ,hombre(Tio).
tio(Tio,Sobrino) :- madre(X,Sobrino) , hermano(Tio,X) ,hombre(Tio).
tio(Tio,Sobrino) :- madre(X,Sobrino) , hermana(X,Y) , mujer(Y) , matrimonio(Tio,Y).
tio(Tio,Sobrino) :- padre(X,Sobrino) , hermana(X,Y) , hombre(Y) , matrimonio(Tio,Y).
tia(Tia,Sobrino) :- padre(X,Sobrino) , hermano(X,Tia) ,mujer(Tia).
tia(Tia,Sobrino) :- madre(X,Sobrino) , hermana(Tia,X) ,mujer(Tia).
tia(Tia,Sobrino) :- madre(X,Sobrino) , hermana(X,Y) , hombre(Y) , matrimonio(Y,Tia).

/**/
/*padres(carlos,belen,elena).*/
/*padre(juan,carlos,rosario,soltero).*/
/*madre(maria,soltero,carlos,rosario).*/























































