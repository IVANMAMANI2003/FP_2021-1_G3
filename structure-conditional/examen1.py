#ejercicio 1
def notafinalIYMM():
  print("la nota final es")
  #variable
  notafinalIYMM = 0.00
  #datos de entrada
  U1=float(input("ingrese nota de la primera unidad: "))
  U2=float(input("ingrese nota de la segunda unidad: "))
  U3=float(input("ingrese nota de la tercera unidad: "))
  TF=float(input("ingrese nota del trabajo final: "))
  #proceso
  if 0<=U1<=20 and 0<=U2<=20 and 0<=U3<=20 and 0<=TF<=20:
    notafinalIYMM=(U1*(20*0.2)/20+U2*(20*0.15)/20+U3*(20*0.15)/20+TF*(20*0.5)/20)
    #datos de salida
    print("\nla nota final es:", notafinalIYMM)
  else:
    print("\ningrese bien los datosd, las notas solo estan comprendido de 0 a 20")
#notafinalIYMM()

#ejercicio 2
def bonoprofesorIYMM():
  print("el bono del profesor de acuerdo a su puntuacion")
  #variables
  montobonoIYMM = 0.00
  #datos de dentrada
  puntuacion=int(input("ingrese puntos obtenidos: "))
  SMin=float(input("ingrese el salario minimo: "))
  #proceso
  if puntuacion>=50 and puntuacion<=100:
    montobonoIYMM=SMin*0.1
  elif puntuacion>=101 and puntuacion<=150:
    montobonoIYMM=SMin*0.4
  elif puntuacion>=151:
    montobonoIYMM=SMin*0.7
  #datos de salida
  print("el bono que recibira es: ", montobonoIYMM)
#bonoprofesorIYMM()

#ejercicio 3
def vacunacovid19IYMM():
  print("tipo de vacuna que se debe aplicar")
  #variable
  TvacunaIYMM = ""
  F = "FEMENINO"
  M = "MASCULINO"
  #datos de entrada
  edad=int(input("ingrese la edad de la persona: "))
  sexo= input("ingrese el sexo de la persona: ")
  #proceso
  if sexo=='F' or sexo=='M':
    if edad>=70 and sexo=='F' or sexo=='M':
      TvacunaIYMM="C"
    elif 16<=edad<=69 and sexo=='F':
      TvacunaIYMM="B"
    elif 16<=edad<=69 and sexo=='M':
      TvacunaIYMM="A"
    elif edad<16 and sexo=='F' or sexo=='M':
      TvacunaIYMM="A"
    #datos de salida
  print("el tipo de vacuna que la persona debe recibir es: ", TvacunaIYMM)
#vacunacovid19IYMM()

#ejercicio 4
def operacionaritmeticaIYMM():
  print("operaciones aritmeticas")
  #variable
  resultadoIYMM= 0
  #datos de entrada
  num1=float(input("ingrese el primer numero: "))
  num2=float(input("ingrese el segundo numero: "))
  operacion= input("ingrese la operacion: ")
  #proceso
  if operacion=='+':
    resultadoIYMM=num1+num2
  elif operacion=='-':
    resultadoIYMM=num1-num2
  elif operacion=='/':
    resultadoIYMM=num1/num2
  elif operacion=='*':
    resultadoIYMM=num1*num2
  elif operacion=='^':
    resultadIYMM=num1**num2
  else:
    resultadoIYMM="la operacion es incorrecta"
  #datos de salida
  print("el resultado es: ",resultadoIYMM)
#operacionaritmeticaIYMM()

#ejercicio 5
def algoritmoespecialIYMM():
  print("ejercicio que quiero resolver")
  #variable
  NumEjercicio = 0
  #datos de entrada
  NumEjercicio=int(input("ingrese el numero de ejercicio que quieras realizar: "))
  if NumEjercicio>=1 and NumEjercicio<=4:
    if NumEjercicio==1:
      def notafinalIYMM():
        print("la nota final es")
        #variable
        notafinalIYMM = 0.00
        #datos de entrada
        U1=float(input("ingrese nota de la primera unidad: "))
        U2=float(input("ingrese nota de la segunda unidad: "))
        U3=float(input("ingrese nota de la tercera unidad: "))
        TF=float(input("ingrese nota del trabajo final: "))
        #proceso
        if 0<=U1<=20 and 0<=U2<=20 and 0<=U3<=20 and 0<=TF<=20:
          notafinalIYMM=(U1*(20*0.2)/20+U2*(20*0.15)/20+U3*(20*0.15)/20+TF*(20*0.5)/20)
          #datos de salida
          print("\nla nota final es:", notafinalIYMM)
        else:
          print("\ningrese bien los datosd, las notas solo estan comprendido de 0 a 20")
      notafinalIYMM()
    elif NumEjercicio==2:
      def bonoprofesorIYMM():
        print("el bono del profesor de acuerdo a su puntuacion")
        #variables
        montobonoIYMM = 0.00
        #datos de dentrada
        puntuacion=int(input("ingrese puntos obtenidos: "))
        SMin=float(input("ingrese el salario minimo: "))
        #proceso
        if puntuacion>=50 and puntuacion<=100:
          montobonoIYMM=SMin*0.1
        elif puntuacion>=101 and puntuacion<=150:
          montobonoIYMM=SMin*0.4
        elif puntuacion>=151:
          montobonoIYMM=SMin*0.7
        #datos de salida
        print("el bono que recibira es: ", montobonoIYMM)
      bonoprofesorIYMM()
    elif NumEjercicio==3:
      def vacunacovid19IYMM():
        print("tipo de vacuna que se debe aplicar")
        #variable
        TvacunaIYMM = ""
        F = "FEMENINO"
        M = "MASCULINO"
        #datos de entrada
        edad=int(input("ingrese la edad de la persona: "))
        sexo= input("ingrese el sexo de la persona: ")
        #proceso
        if sexo=='F' or sexo=='M':
          if edad>=70 and sexo=='F' or sexo=='M':
            TvacunaIYMM="C"
          elif 16<=edad<=69 and sexo=='F':
            TvacunaIYMM="B"
          elif 16<=edad<=69 and sexo=='M':
            TvacunaIYMM="A"
          elif edad<16 and sexo=='F' or sexo=='M':
            TvacunaIYMM="A"
          #datos de salida
        print("el tipo de vacuna que la persona debe recibir es: ", TvacunaIYMM)
      vacunacovid19IYMM()
    elif NumEjercicio==4:
      def operacionaritmeticaIYMM():
        print("operaciones aritmeticas")
        #variable
        resultadoIYMM= 0
        #datos de entrada
        num1=float(input("ingrese el primer numero: "))
        num2=float(input("ingrese el segundo numero: "))
        operacion= input("ingrese la operacion: ")
        #proceso
        if operacion=='+':
          resultadoIYMM=num1+num2
        elif operacion=='-':
          resultadoIYMM=num1-num2
        elif operacion=='/':
          resultadoIYMM=num1/num2
        elif operacion=='*':
          resultadoIYMM=num1*num2
        elif operacion=='^':
          resultadIYMM=num1**num2
        else:
          resultadoIYMM="la operacion es incorrecta"
        #datos de salida
        print("el resultado es: ",resultadoIYMM)
      operacionaritmeticaIYMM()
  print("solo hay 4 ejercicios intente de nuevo")
algoritmoespecialIYMM()