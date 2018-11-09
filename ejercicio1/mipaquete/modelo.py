class Empleado (object):
	"""docstring for Empleado"""
	def __init__(self):
		self.nombre=""
		self.apellido=""
		self.cedula=""
		self.comision_fija = 0
	def agregar_nombre(self,n):
		self.nombre = n	
	def agregar_apellido(self,a):
		self.apellido = a
	def agregar_cedula(self,c):
		self.cedula = c	
	def agregar_comision_fija(self,com):
		self.comision_fija = com
	def obtener_nombre(self):
		return self.nombre 
	def obtener_apellido(self):
		return self.apellido 
	def obtener_cedula(self):
		return self.cedula	
	def obtener_comision_fija(self):
		return self.comision_fija
	def presentar_datos(self):
		cadena= "Informacion de %s %s\n cedula: %s"%(self.obtener_nombre(),self.apellido, self.obtener_cedula())
		return cadena
	class EmpleadoPorHoras(Empleado):
		def __init__(self):
		super(EmpleadoPorHoras,self).__init__()
		self.numero_horas = 0
		self.valor_horas = 0 
		self.operacion = 0
		#metodo para agregar
		def agregar_numero_horas(self,numero):
			self.numero_horas=numero
		def agregar_valor_horas(self,valor):
			self.valor_horas=valor
		def agregar_total(self,x,y):
			self.operacion= x * y
		#metodo para obtener
		def obtener_numero_horas(self):
			return self.numero_horas 
		def obtener_valor_horas(self):
			return self.valor_horas
		def obtenet_total(self):
			return operacion
		def presentar_datos():
			cadena= "Numero y valor por hora"%(self.obtener_numero_horas(), self.obtener_valor_horas(), self.obtener_total())
			return cadena
	class EmpleadoFijo(Empleado):
		def __init__(self):
		super(EmpleadoFijo,self).__init__()
		self.sueldo_fijo=0
		self.descuento_seguro=0	
		self.operacion=0		
		#metodo para agregar
		def agregar_sueldo_fijo(self,s):
			self.numero_horas=s
		def agregar_descuento_seguro(self,d):
			self.valor_horas=d
		def agregar_total(self,x,y):
			self.operacion= x - y

		#metodo para obtener
		def obtener_numero_horas(self):
		return self.sueldo_fijo 
		def obtener_descuento_seguro(self):
		return self.descuento_seguro
		def obtenet_total(self):
			return operacion
		def presentar_datos():
			cadena= "Numero y valor por hora"%(self.obtener_sueldo_fijo(), self.obtener_descuento_seguro(), self.obtener_total())
			return cadena

	class EmpleadoPorSemana(Empleado):
		def __init__(self):
		super(EmpleadoPorSemana,self).__init__()
		self.numero_semanas=0
		self.valor_semanal=0			
		#metodo para agregar
		def agregar_numero_semanas(self,s):
			self.numero_horas=s
		def agregar_valor_semanal(self,d):
			self.valor_horas=d
		def agregar_total(self,x,y):
			self.operacion= x * y

		#metodo para obtener
		def obtener_numero_semanas(self):
		return self.numero_semanas 
		def obtener_valor_semanal(self):
		return self.valor_semanal
		def obtenet_total(self):
			return operacion
		def presentar_datos():
			cadena= "Numero y valor por hora"%(self.obtener_numero_semanas(), self.obtener_valor_semanal(), self.obtener_total())
			return cadena
