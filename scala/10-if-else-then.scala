object IfElseThen{
	def main(args:Array[String]): Unit = {
		var grade_Andres = 30;
		var grade_Braulio = 50;
		var grade_Diego = 70;
		var grade_Salva = 90;
		
		var max_grade = if(grade_Braulio>grade_Andres)
			if(grade_Diego>grade_Braulio)
				if(grade_Salva>grade_Diego)
					grade_Salva

		println(max_grade)

	}
}