package trabajoPractico1;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import javax.swing.JOptionPane;

public class Usuarios {
	
	public static void main(String args[]) {
		
	   
		ArrayList<String> lista= new ArrayList <String>();
	   
		boolean option = true;
		
		int visible;
		
		String data;
		
    	String nombre;
    	
    	String apellido;
    	
    	GregorianCalendar fechaNacimiento;
    	
 		DateFormat formateador= new SimpleDateFormat("dd/M/yy");
    	
    	String dni;
    	
    	
	    while( option ) {
	    	
	    	nombre = JOptionPane.showInputDialog("Ingrese su nombre, porfavor: ");
	    	
	        apellido = JOptionPane.showInputDialog("Ingrese su apellido, porfavor: ");
	        
	    	dni= JOptionPane.showInputDialog("Ingrese su DNI,por favor:");
	    	
	    	Integer anio= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año de nacimiento ,por favor: "));
	    	
	    	Integer mes= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero del mes de nacimiento ,por favor: "))  ;
	    	
	    	Integer dia= Integer.parseInt(JOptionPane.showInputDialog("Ingrese dia de nacimiento ,por favor: "))  ;
	    	
	    	fechaNacimiento= new GregorianCalendar(anio,mes-1,dia);
	    	
	    	while(nombre.equals("") == true || apellido.equals("") == true || dni.length() != 8) {
	    		
	    		if(nombre.equals("") == true){
	    			
	    			nombre = JOptionPane.showInputDialog("Ingrese su nombre, porfavor: ");	  
	    			
	    		};
	    		if(apellido.equals("") == true){
	    			
	    			apellido =JOptionPane.showInputDialog("Ingrese su apellido, porfavor: ");
	    			
	    		};
	    		if(dni.length() != 8){
	    			
	    			dni= JOptionPane.showInputDialog("Ingrese su DNI,por favor (sin puntos):");	    	
	    			
	    		};
	    	}
	    	
	    	data= "\nNombre:"+ nombre + "\n Apellido: " + apellido +"\nDNI:" + dni + " fecha de nacimiento " + formateador.format(fechaNacimiento.getTime()); 
	    	
	    	lista.add(data);
	    	
	    	
	    	visible=JOptionPane.showConfirmDialog(null, "¿ Desea ver a los usuarios agregados ?");
	    	
	    	if(visible == 0) {
	    		System.out.println(lista);      	
	    	};
	    
	    	
	    	
	    	int op=JOptionPane.showConfirmDialog(null, "¿ Quiere introducir un nuevo usuario ?");
	    	
	    	if(op == 1 || op == 2) {
	    		option = false;	        	
	    	};
	    	
	    }
	    
		visible=JOptionPane.showConfirmDialog(null, "¿ Desea ver a los usuarios agregados ?");
    	
    	if(visible == 0) {
    		System.out.println(lista);      	
    	};
    
	 
	
  }
	
	
}
