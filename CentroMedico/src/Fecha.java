import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class Fecha {
	int dia;
	int mes;
	int anio;

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
		Calendar fInicio = Calendar.getInstance();
		fInicio.set(this.anio, this.mes, this.dia);
		fInicio.set(Calendar.HOUR, 0);
		fInicio.set(Calendar.HOUR_OF_DAY, 0);
		fInicio.set(Calendar.MINUTE, 0);
		fInicio.set(Calendar.SECOND, 0);
		
		Calendar fFinal = Calendar.getInstance();
		fFinal.set(fin.anio, fin.mes, fin.dia);
		fFinal.set(Calendar.HOUR, 0);
		fFinal.set(Calendar.HOUR_OF_DAY, 0);
		fFinal.set(Calendar.MINUTE, 0);
		fFinal.set(Calendar.SECOND, 0);
		
		long fInicioMs = fInicio.getTimeInMillis();
		long fFinalMs = fFinal.getTimeInMillis();
		
		int dias = (int) (Math.abs(fFinalMs-fInicioMs)/ (1000*60*60*24));
		
		return dias;
	}
/*	public int diferenciaDias(Fecha ini, Fecha fin) {
		long fechaInicialMs = ini.getTime();
		long fechaFinalMs = fin.getTime();
		long diferencia = fechaFinalMs - fechaInicialMs;
		double dias = Math.floor(diferencia / (1000 * 60 * 60 * 24));
	}*/
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
	
/*	public void setCalendario(int dia, int mes, int anio) {
		this.dia=dia;
		this.mes=mes;
		this.anio=anio;
	}
*/	
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
	
	//public void hoy(){}
	
	
		
}
