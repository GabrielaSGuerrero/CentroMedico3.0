import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Fecha {
	private int dia;
	private int mes;
	private int anio;

	Fecha(int dd, int mm, int aa){
		this.dia = dd;
		this.mes = mm;
		this.anio = aa;
	}
	public boolean esMayor(Fecha f) {
		if (this.anio<f.anio) {
			return true;
		}
		if (this.anio==f.anio && this.mes<f.mes) {
			return true;
		}
		if (this.anio==f.anio && this.mes==f.mes&& this.dia<f.dia) {
			return true;
		}
		else {
			return false;
		}
	}
	public static Fecha hoy() {
		LocalDate fecha = LocalDate.now();
		return new Fecha(fecha.getDayOfMonth(), fecha.getMonthValue(), fecha.getYear());
		}
	
	public int diferenciaDias(Fecha fin) {
		LocalDate d1 = LocalDate.of(this.anio, this.mes, this.dia);
		LocalDate d2 = LocalDate.of(fin.anio, fin.mes, fin.dia);
		return (int) ChronoUnit.DAYS.between(d1, d2);
	}

	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public int getAnio() {
		return anio;
	}
	public void setAnio(int anio) {
		this.anio = anio;
	}
	
	@Override
	public String toString() {
		return this.dia+"/"+this.mes+"/"+this.anio;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + anio;
		result = prime * result + dia;
		result = prime * result + mes;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fecha other = (Fecha) obj;
		if (anio != other.anio)
			return false;
		if (dia != other.dia)
			return false;
		if (mes != other.mes)
			return false;
		return true;
	}
		
}
