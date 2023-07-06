package Conversor;

import javax.swing.*;
import java.text.DecimalFormat;

public class App {
    public static void main(String[] args) {
        Object[] options = {"Convertir Divisas","Convertir Temperatura", "salir" };
        int elige = JOptionPane.showOptionDialog(null,"¿Que quieres hacer",
                "Conversor", JOptionPane.DEFAULT_OPTION,
                JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
        if (elige ==2){
            JOptionPane.showMessageDialog(null, "Programa cerrado");
            System.exit(0);
        }
        //CONVERSOR MONEDAS
        if(elige ==0){
            DecimalFormat formatearDivisa = new DecimalFormat("#.##");
            boolean continuarPrograma = true;
            while (continuarPrograma) {
                String[] opciones = {"soles a Euros", "Soles a Dolares", "Soles a libras Esterlinas", "Soles a Yen",
                "Soles a won", "Euros a soles","Dolares a soles","libras Esterlinas a soles","Yen a soles","won a soles"};
                String cambio = (String) JOptionPane.showInputDialog(null,"eliga una Opcion",
                        "Conversor de Moneda", JOptionPane.QUESTION_MESSAGE, null,opciones,opciones[0]);

                String input = JOptionPane.showInputDialog(null, "Ingrese cantidad de soles:");
                double soles = 0.00;

                try{
                    soles = Double.parseDouble(input);
                }catch (NumberFormatException e){
                    JOptionPane.showMessageDialog(null, "valor no valido");
                }
                if(cambio.equals("soles a Euros")){
                        double euros = soles / 3.95;
                        JOptionPane.showMessageDialog(null, soles + "Soles peruanos son: " +
                                formatearDivisa.format(euros) + "Euros.");
                }else if (cambio.equals("Soles a Dolares")) {
                    double dolares = soles / 3.64;
                    JOptionPane.showMessageDialog(null, soles + "Soles peruanos son: " +
                            formatearDivisa.format(dolares) + "Dolares.");
                }else if (cambio.equals("Soles a libras Esterlinas")) {
                    double libras = soles / 4.62;
                    JOptionPane.showMessageDialog(null, soles + "Soles peruanos son: " +
                            formatearDivisa.format(libras) + "Libras.");
                }else if (cambio.equals("Soles a Yen")) {
                    double yen = soles / 0.025;
                    JOptionPane.showMessageDialog(null, soles + "Soles peruanos son: " +
                            formatearDivisa.format(yen) + "Yen.");
                }else if (cambio.equals("Soles a won")) {
                    double won = soles / 0.0028;
                    JOptionPane.showMessageDialog(null, soles + "Soles peruanos son: " +
                            formatearDivisa.format(won) + "Won.");
                    //inversa
                }else if (cambio.equals("Euros a soles")) {
                    double euros = soles * 3.95;
                    JOptionPane.showMessageDialog(null, soles + "Euros son: " +
                            formatearDivisa.format(euros) + "Soles peruanos.");
                }else if (cambio.equals("Dolares a soles")) {
                    double dolar = soles * 3.64;
                    JOptionPane.showMessageDialog(null, soles + "Dolares son: " +
                            formatearDivisa.format(dolar) + "Soles peruanos.");
                }else if (cambio.equals("libras Esterlinas a soles")) {
                    double euros = soles * 4.62;
                    JOptionPane.showMessageDialog(null, soles + "Euros son: " +
                            formatearDivisa.format(euros) + "Soles peruanos.");
                }else if (cambio.equals("Yen a soles")) {
                    double euros = soles * 0.025;
                    JOptionPane.showMessageDialog(null, soles + "Euros son: " +
                            formatearDivisa.format(euros) + "Soles peruanos.");
                }else if (cambio.equals("won a soles")) {
                    double euros = soles * 0.0028;
                    JOptionPane.showMessageDialog(null, soles + "Euros son: " +
                            formatearDivisa.format(euros) + "Soles peruanos.");
                }

                int confirma = JOptionPane.showConfirmDialog(null,"¿Desea continuar usando el programa?", 
                        "Confirmar",JOptionPane.YES_NO_CANCEL_OPTION);
                if(confirma == JOptionPane.NO_OPTION || confirma == JOptionPane.CANCEL_OPTION){
                    continuarPrograma = false;
                    JOptionPane.showMessageDialog(null,"Programa finalizado");
                }
                
            }
        }
        //TEMPERATURA
        if (elige == 1){
            boolean seguirPrograma = true;
            while (seguirPrograma) {
                String[] opciones = { "Celsius a Fahrenheit", "Fahrenheit a Celsius"};
                int opcion = JOptionPane.showOptionDialog(null,"Elige una Opcion",
                        "Conversor de Temperatura", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,null,opciones,opciones[0]);

                String valorNominal = JOptionPane.showInputDialog(null,"Ingrese valor a convertir");
                double valor = 0;
                try {
                        valor = Double.parseDouble(valorNominal);
                }catch (NumberFormatException e){
                    JOptionPane.showMessageDialog(null,"valor no valido");
                    System.exit(0);
                }
                double resultado = 0;
                if(opcion == 0){
                    resultado = (valor * 9/5) + 32;
                    JOptionPane.showMessageDialog(null, valor + "Grados Celsius son: " + resultado + "Grados Fahrenheit");

                } else if (opcion == 1){
                    resultado = (valor - 32) * 5 / 9;
                    JOptionPane.showMessageDialog(null,valor + "Grados Fahremheit" + resultado + "Grado Celsius son: ");
                }
                int continuar = JOptionPane.showConfirmDialog(null,"Desea seguir usando el programa?", "",
                        JOptionPane.YES_NO_OPTION);
                if(continuar == JOptionPane.NO_OPTION){
                    seguirPrograma = false;
                    JOptionPane.showMessageDialog(null,"Programa finalizado");
                }


            }
        }

    }
}
