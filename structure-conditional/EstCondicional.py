def EstCondicional01():
  #Definir variables y otros
  print("Ejemplo estructura Condicional en Python")
  montoP=0
  #Datos de entrada
  cantidadX=int(input("Ingrese la cantidad de lapices:"))
  #Proceso
  if cantidadX>=1000:
    montoP=cantidadX*0.80
  else:
    montoP=cantidadX*0.90
  #Datos de salida
  print("El monto a pagar es:", montoP)
#EstCondicional01()
def EstCondicional02():
  #Definir variables y otros
  print("Ejercicio 02 Est. Condicional")
  montoP=0
  #Datos de entrada
  cantidadX=int(input("Ingrese la cantidad personas invitadas:"))
  #Proceso
  if cantidadX<200:
    montoP=cantidadX*95
  elif cantidadX>200 and cantidadX<=300:
    montoP=cantidadX*85
  else:
    montoP=cantidadX*75
  #Datos de salida
  print("La cantidad a pagar es:", montoP)
#EstCondicional02()

#ejercicio 3.1
def votoElecciones():
  print("Como saber si puedes votar por tu edad")
  mensaje =""
  edadP=int(input("ingrese la edad que tiene:"))
  if edadP>=18:
    mensaje ="Usted tiene la edad necesaria para votar"
  else:
    mensaje ="Usted no cumple con la edad mínima para votar"
  print(mensaje)
#votoElecciones()

#ejercicio 3.2
def  pagoSemanaBase40horas ():
  print ( "Pago semanal del trabajador" )
  sueldoPagarSem = 0.0
  #Datos de entrada
  horasTra = int ( input ( "Ingrese horas trabajadas a la semana:" ))
  horasPago = int ( input ( "Ingrese el pago por hora:" ))
  #Proceso 
  if  horasTra>40 :
    sueldoPagarSem = 40 * horasPago + ( horasTra - 40 ) * 2 * horasPago
  else:
    sueldoPagarSem = horasTra * horasPago
  #Datos de salida
  print ( "El sueldo a pagar al trabajador es:" , sueldoPagarSem )
#pagoSemanaBase40horas()

#ejercicio 3.5
def nombre_y_edad():
  print("nombre y edad de la persona menor")
  #datos de entrada
  jose=int(input("ingrese la edad que tiene jose: "))
  carlos=int(input("ingrese la edad que tiene carlos: "))
  yenifer=int(input("ingrese la edad que tiene yenifer: "))
  #proceso y fin
  if 0<jose<150 and 0<carlos<150 and 0<yenifer<150:
    print("\neres lo mejor FELICITACIONES lo resolviste que")
    if jose<carlos and jose<yenifer:
      print(f"el menor es jose y tiene {jose} año(s)")
    elif carlos<jose and carlos<yenifer:
      print(f"el menor es carlos y tiene {carlos} año(s)")
    elif yenifer<jose and yenifer<carlos:
      print(f"el menor es yenifer y tiene {yenifer} año(s)")
    elif jose==carlos and jose==yenifer and carlos==yenifer:
      print("los tres son de la misma edad")
  else:
     print("\nehhh ingresa bien todos tus datos y que sean reales, porque es imposible que una persona tenga esa edad")
#nombre_y_edad()

#ejercicio 3.6
def descuentos():
  print("monto que se debe pagar")
  #variables
  montoapagar = 0.00
  #datos de entrada
  costo=int(input("ingrese el costo del articulo: "))
  #proceso
  if costo>=200:
    montoapagar=costo-(costo*15/100)
  elif 100<=costo<200:
    montoapagar=costo-(costo*12/100)
  else:
    montoapagar=costo-(costo*10/100)
  #datos de salida
  print("\nla cantida a pagar es:", montoapagar)
#descuentos()

#ejercicio 3.14
def calificaciones():
  print("calificacion que deba tener")
  #variables
  calificaciones = ["F","D","C","B","A"]
  calificacion = 0
  #datos de entrada
  nota=int(input("ingrese la nota: "))
  #proceso
  if nota>=0 and nota<=10:
    if 0<=nota<=5:
      print("\nsu calificacion es calificacion es F")
    elif 6<=nota<=7:
      print("\nsu calificacion es D")
    elif nota==8:
      print("\nsu calificacion es C")
    elif nota==9:
      print("\nsu calificacion es B")
    elif nota==10:
      print("\nsu calificacion es A")
  else:
    print("\nerror, ingrese bien las notas")
#calificaciones()

#ejercicio 3.15
def diasemana():
  print("el dia de la semana")
  #variables
  diassemana = ["lunes","martes","miercoles","jueves","viernes","sabado","domingo"]
  #datos de entrada
  ordendeldia=int(input("ingrese el orden del dia: "))
  #proceso y fin
  if 1<=ordendeldia<=7:
    if ordendeldia==1:
      print("el dia es lunes")
    elif ordendeldia==2:
      print("el dia es martes")
    elif ordendeldia==3:
      print("el dia es miercoles")
    elif ordendeldia==4: 
      print ("el dia es jueves")
    elif ordendeldia==5:
      print("el dia es viernes")
    elif ordendeldia==6:
      print("el dia es sabado")
    elif ordendeldia==7:
      print("el dia es domingo")
  else:
    print("\ningrese bien los datos")
#diasemana()

#ejercicio 3.16
def bonoprofesor():
  print("el bono del profesor de acuerdo a su puntuacion")
  #variables
  sueldobono = 0.00
  #datos de dentrada
  puntuacion=int(input("ingrese puntos obtenidos: "))
  SMin=float(input("ingrese el salario minimo: "))
  #proceso
  if puntuacion>=0 and puntuacion<=100:
    sueldobono=1*SMin
  elif puntuacion>=101 and puntuacion<=150:
    sueldobono=2*SMin
  elif puntuacion>=151:
    sueldobono=3*SMin
  #datos de salida
  print("el sueldo de bono que percibira es:", sueldobono)
#bonoprofesor()

#ejercicio 3.18
def bononavideño():
  print("bono que recibira un empleado en navidad")
  #variables
  añosdetrabajo = 0
  sueldoquerecibe = 0.00
  bonoquerecibira = 0.00
  #datos de entrada
  antiguedad=float(input("ingrese los años de trabajo: "))
  sueldo=float(input("ingrese el sueldo que recibe: "))
  #proceso
  if antiguedad>4 or sueldo<2000.00:
    bonoquerecibira=sueldo*25/100
  else:
    bonoquerecibira=sueldo*20/100
  #datos de salida
  print("el bono que recibira es: ", bonoquerecibira)
#bononavideño()

#ejercicio 3.17
def  paquetecompra():
  print("el paque que puede comprar es")
  #Definir Variables
  paquetecomp = ""
  #Datos de entrada
  sueldo=float(input("Ingrese el sueldo que recibe en diciembre: "))
  #Proceso
  if sueldo>=50000:
    paquetecomp="Paquete A"
  elif  sueldo>=20000 and sueldo<50000:
    paquetecomp="Paquete B"
  elif  sueldo>=10000 and sueldo<20000:
    paquetecomp="Paquete C"
  else:
    paquetecomp="Paquete D"
  #Datos de salida
  print ("La persona comprara el:", paquetecomp)
paquetecompra()

#ejercicio 3.3
def regalo14defebrero():
  print("cual sera el regalo por el dia del amor y la amistad") 
  #datos de dentrada
  dinero=float(input("ingrese la cantidad: "))
  #proceso
  if dinero<=10.00:
    print("puedes regalar una tarjeta")
  elif dinero>=11.00 and dinero<=100.00:
    print("puedes comprar unos chocolates")
  elif dinero>=101.00 and dinero<=250.00:
    print("puedes comprar una flor")
  elif dinero>=251.00:
    print("puedes comprar un anillo")
#regalo14defebrero()

#ejercicio 3.7
def becamensualuniversitario():
  #variables
  tipodebeca = 0.000
  #datos de entrada
  edad=int(input("ingrese su edad: "))
  nota=float(input("ingrese su promedio: "))
  #proceso y datos de salida instantanea
  if edad>18 and nota>=9.0:
    print("usted es se ganara una beca de 2000")
  elif edad>18 and nota>=7.5:
    print("usted es se ganara una beca de 1000")
  elif edad>18 and nota<7.5 and nota>=6.0:
    print("usted es se ganara una beca de 500")
  elif edad>18 and nota<6.0:
    print("se le invita a participar al proximo ciclo escolar y seguir estudiando")
  elif edad<=18 and nota>=9.0:
    print("usted es se ganara una beca de 3000")
  elif edad<=18 and nota<9 and nota>=8.0:
    print("usted es se ganara una beca de 2000")
  elif edad<=18 and nota<8 and nota>=6.0:
    print("usted se ganara una beca de 100")
  elif edad<18 and nota<6.0:
    print("se le invita a participar al proximo ciclo escolar y seguir estudiando")
#becamensualuniversitario()

#ejercicio 3.13
def viajedeestudios():
  print("costo del pasaje por alumno")
  #datos de entrada
  cantdalumnos=int(input("ingrese la cantidad de alumnos: "))
  #proceso y datos de salida
  if cantdalumnos>100:
    print("el costo del pasaje por alumno sera de 20 dolares")
  elif 50<=cantdalumnos<=100:
    print("el costo del pasaje por alumno sera de 35 dolares")
  elif 20<=cantdalumnos<=49:
    print("el costo del pasaje por alumno sera de 40 dolares")
  elif cantdalumnos<20:
    print("el costo del pasaje por alumno sera de 70 dolares")
#viajedeestudios()

#Ejercicio 3.4
def costoestacionamiento():
  print("el costo del estacionamiento sera")
  #datos de dentrada
  tarifapago=0.00
  horas=int(input("ingrese horas en estacionamiento: "))
  #proceso  
  if horas>0 and horas<=2:
    tarifapago=horas*5
  elif horas>2 and horas<=5:
    tarifapago=(2*5)+(horas-2)*4
  elif horas>5 and horas<=10:
    tarifapago=(2*5)+(3*4)+(horas-5)*3
  else:
    tarifapago=(2*5)+(3*4)+(5*3)+(horas-10)*0.20
  print("El costo a cobrar es:", tarifapago)
#costoestacionamiento()

