#!/usr/bin/env python
def comprobar():
	a = raw_input("dame un numero: ")
	b = raw_input("dame otro numero y te dire si el primero es multiplo del segundo: ")
	try:
		if int(a) % int(b) == 0:
			print a + " es multiplo de " + b
		else:
			print a + " no es multiplo de " + b
	except:
		print"No has introducido dos numeros"
comprobar()
salir()
def salir():
	c = raw_input("1-Volver a comprobar\n2-para salir\n")
	if c == "1":
		comprobar()
	else:
		if c == "2":
			exit()
		else:
			print "Opcion no valida"
salir()
comprobar()
