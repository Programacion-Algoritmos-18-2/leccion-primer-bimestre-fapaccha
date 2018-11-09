class Empleado(object):
	"""docstring for Empleado"""
	def __init__(self, arg):
		super Empleado, self).__init__()
		self.arg = arg
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
	def obtener_nombre(self,n):
		return self.nombre 
	def obtener_apellido(self,a):
		return self.apellido 
	def obtener_cedula(self,c):
		return self.cedula	
	def obtener_comision_fija(self,com):
		return self.comision_fija
		Cadena= "Informacion de %s %s\n/t cedula: %s"%(self.obtener_nombre(),self.apellido, self.obtener_cedula())
		return cadena