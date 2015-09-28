/* Consideremos el siguiente programa con información de parejas inscritas
en el registro
*/
libro_de_familia(
	esposo(nombre(antonio,garcia,fernandez),
	       profesion(arquitecto),
			 salario(300000)),
	esposa(nombre(ana,ruiz,lopez),
	       profesion(docente),
			 salario(120000)),
	domicilio(toluca)).

libro_de_familia(
	esposo(nombre(luis,alvarez,garcia),
	       profesion(arquitecto),
			 salario(400000)),
	esposa(nombre(ana,romero,soler),
	       profesion(sus_labores),
			 salario(0)),
	domicilio(toluca)).

libro_de_familia(
	esposo(nombre(bernardo,bueno,martinez),
	       profesion(docente),
			 salario(120000)),
	esposa(nombre(laura,rodriguez,millan),
	       profesion(medico),
			 salario(250000)),
	domicilio(cuernavaca)).


libro_de_familia(
	esposo(nombre(miguel,gonzalez,ruiz),
	       profesion(empresario),
			 salario(400000)),
	esposa(nombre(belen,salguero,cuevas),
	       profesion(sus_labores),
			 salario(0)),
	domicilio(durango)).

/* (1) Definir el predicado profesion(X) que se verifique si X es una
     profesión que aparece en el programa
  (2) Definir el predicado primer_apellido(X) que se verifique si X es el
      primer apellido de alguien
  (3) Determinar el nombre completo de todas las personas que viven en
  Toluca
 (4) Definir el predicado ingresos_familiares(N), de forma que
  si N es una cantidad que determina los ingresos totales de una
  familia. (5) Definir el predicado pareja(Hombre,Mujer) que devuelva
  los nombres de pila de las parejas existentes. (6) Definir el
  predicado sueldo(X,Y) que se verifique si el sueldo de la persona de
  nombre completo X es Y.
*/
profesion(X):-
	libro_de_familia(esposo(_,profesion(X),_),_,_).
profesion(X):-
	libro_de_familia(_,esposa(_, profesion(X),_),_).
primer_apellido(X):-
	libro_de_familia(esposo(nombre(_,X,_),_,_),_,_).
primer_apellido(X):-
	libro_de_familia(_,esposa(nombre(_,X,_),_,_),_).
toluqueno(X):-
	libro_de_familia(esposo(X,_,_),_,domicilio(toluca)).
toluqueno(X):-
	libro_de_familia(_,esposa(X,_,_),domicilio(toluca)).
ingresos_familiares(X):-
	libro_de_familia(esposo(_,_,salario(N1)),esposa(_,_,salario(N2)),_),
	X is N1+N2.
pareja(X, Y):-
	libro_de_familia(esposo(nombre(X,_,_),_,_),esposa(nombre(Y,_,_),_,_),_).
sueldo(X, Y):-
	libro_de_familia(esposo(X,_,salario(Y)),_,_).
sueldo(X, Y):-
	libro_de_familia(_,esposa(X,_,salario(Y)),_).

/*
los ingresos de una familia especifica
los ingresos totales de toluca
nombres de una profesion
sueldos de una profesion
nombres de aquellos que tengan un apsoellido en
*/
/*Ingresos de una familia especifica*/
ingresos_familia(X,Y,Z):- libro_de_familia(esposo(nombre(_,X,_),_,salario(N1)),esposa(nombre(_,Y,_),_,salario(N2)),_), Z is N1+N2.
/*ingresos de las familias de toluca (ingreso,ciudad)*/
 ingresos_toluca(X):-
	    findall(N,libro_de_familia(esposo(_,_,salario(N)),_,domicilio(toluca)),N1),
	    findall(N,libro_de_familia(_,esposa(_,_,salario(N)),domicilio(toluca)),N2),
	    suma(X1,N1),
	    suma(X2,N2),
	    X is X1+X2.
suma(0,[]).
suma(S,[X|Xs]):-
          suma(S2, Xs),
          S is S2 + X.

/*Nombres de una profecion (Para profecion Esposo y para profecion Esposa)*/
profesion_nombre(X,Y):-
	libro_de_familia(esposo(nombre(Y,_,_),profesion(X),_),_,_).
profesion_nombre(X,Y):-
	libro_de_familia(_,esposa(nombre(Y,_,_), profesion(X),_),_).
/*Sueldos totales de una profecion */

ingresos_profecion(I,P):-
		findall(N,libro_de_familia(esposo(_,profesion(P),salario(N)),_,_),N1),
		findall(N,libro_de_familia(_,esposa(_, profesion(P),salario(N)),_),N2),
		suma(X1,N1),
	    suma(X2,N2),
	    I is X1+X2.

/*Nombres de aquellos que tengan un apellido en común*/
nombre_apellido(X,Y):-libro_de_familia(esposo(nombre(X,Y,_),_,_),_,_).
nombre_apellido(X,Y):-libro_de_familia(_,esposa(nombre(X,Y,_),_,_),_).
nombre_apellido(X,Y):-libro_de_familia(esposo(nombre(X,_,Y),_,_),_,_).
nombre_apellido(X,Y):-libro_de_familia(_,esposa(nombre(X,_,Y),_,_),_).