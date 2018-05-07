/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes;
/**
 *
 * @author LUIS
 */
public class NumeroPalabra {

    public static String convertir(int num) {
        int cont1;
        String r = "" + num;
        cont1 = r.length();
        String[] cad = new String[cont1];
        for (int i = 0; i < r.length(); i++) {
            cad[i] = r.charAt(cont1 - 1) + "";
            cont1--;
        }
        String[] unidades = new String[10];
        unidades[0] = "";
        unidades[1] = "un";
        unidades[2] = "dos";
        unidades[3] = "tres";
        unidades[4] = "cuatro";
        unidades[5] = "cinco";
        unidades[6] = "seis";
        unidades[7] = "siete";
        unidades[8] = "ocho";
        unidades[9] = "nueve";
        String[] decenas = new String[10];
        decenas[0] = "";
        decenas[1] = "diez";
        decenas[2] = "veinte";
        decenas[3] = "treinta";
        decenas[4] = "cuarenta";
        decenas[5] = "cincuenta";
        decenas[6] = "sesenta";
        decenas[7] = "setenta";
        decenas[8] = "ochenta";
        decenas[9] = "noventa";
        String[] centenas = new String[10];
        centenas[0] = "";
        centenas[1] = "ciento";
        centenas[2] = "doscientos";
        centenas[3] = "trecientos";
        centenas[4] = "cuatrocientos";
        centenas[5] = "quinientos";
        centenas[6] = "seicientos";
        centenas[7] = "setecientos";
        centenas[8] = "ochocientos";
        centenas[9] = "novecientos";
        String nombre = "";
        String aux = "";
        for (int w = 0; w < cad.length; w++) {
            aux = nombre;
            if (cad.length > 1) {
                switch (cad[w]) {
                    case "0":
                        nombre += "";
                        break;
                    case "1":
                        cont1 = 1;
                        switch (w) {
                            case 0:
                                if (cad[w + 1].equals("0")) {
                                    nombre = unidades[cont1];
                                } else if (cad[w + 1].equals("1")) {
                                    nombre = "once";
                                } else {
                                    nombre = "y " + unidades[cont1];
                                }

                                break;
                            case 1:
                                if (cad[w - 1].equals("1") || cad[w - 1].equals("2") || cad[w - 1].equals("3") || cad[w - 1].equals("4") || cad[w - 1].equals("5")) {
                                    nombre += "";
                                } else {
                                    nombre = decenas[cont1] + " " + aux;
                                }

                                break;
                            case 2:
                                if (cad[w - 1].equals("0") && cad[w - 2].equals("0")) {
                                    nombre = "cien " + aux;
                                } else {
                                    nombre = centenas[cont1] + " " + aux;

                                }
                                break;

                        }
                        break;
                    case "2":
                        cont1 = 2;
                        switch (w) {
                            case 0:
                                if (cad[w + 1].equals("0")) {
                                    nombre = unidades[cont1];
                                } else if (cad[w + 1].equals("1")) {
                                    nombre = "doce";
                                } else {
                                    nombre = "y " + unidades[cont1];
                                }

                                break;
                            case 1:
                                if (cad[w - 1].equals("1")) {
                                    nombre += "";
                                } else {
                                    nombre = decenas[cont1] + " " + aux;
                                }
                                break;
                            case 2:
                                nombre = centenas[cont1] + " " + aux;
                                break;

                        }
                        break;
                    case "3":
                        cont1 = 3;
                        switch (w) {
                            case 0:
                                if (cad[w + 1].equals("0")) {
                                    nombre = unidades[cont1];
                                } else if (cad[w + 1].equals("1")) {
                                    nombre = "trece";
                                } else {
                                    nombre = "y " + unidades[cont1];
                                }

                                break;
                            case 1:
                                if (cad[w - 1].equals("1")) {
                                    nombre += "";
                                } else {
                                    nombre = decenas[cont1] + " " + aux;
                                }

                                break;
                            case 2:
                                nombre = centenas[cont1] + " " + aux;
                                break;

                        }
                        break;
                    case "4":
                        cont1 = 4;
                        switch (w) {
                            case 0:
                                if (cad[w + 1].equals("0")) {
                                    nombre = unidades[cont1];
                                } else if (cad[w + 1].equals("1")) {
                                    nombre = "catorce";
                                } else {
                                    nombre = "y " + unidades[cont1];
                                }

                                break;
                            case 1:
                                if (cad[w - 1].equals("1")) {
                                    nombre += "";
                                } else {
                                    nombre = decenas[cont1] + " " + aux;
                                }

                                break;
                            case 2:
                                nombre = centenas[cont1] + " " + aux;
                                break;

                        }
                        break;
                    case "5":
                        cont1 = 5;
                        switch (w) {
                            case 0:
                                if (cad[w + 1].equals("0")) {
                                    nombre = unidades[cont1];
                                } else if (cad[w + 1].equals("1")) {
                                    nombre = "quince";
                                } else {
                                    nombre = "y " + unidades[cont1];
                                }

                                break;
                            case 1:
                                if (cad[w - 1].equals("1")) {
                                    nombre += "";
                                } else {
                                    nombre = decenas[cont1] + " " + aux;
                                }

                                break;
                            case 2:
                                nombre = centenas[cont1] + " " + aux;
                                break;

                        }
                        break;
                    case "6":
                        cont1 = 6;
                        switch (w) {
                            case 0:
                                nombre = "y " + unidades[cont1];
                                break;
                            case 1:
                                nombre = decenas[cont1] + " " + aux;
                                break;
                            case 2:
                                nombre = centenas[cont1] + " " + aux;
                                break;

                        }
                        break;
                    case "7":
                        cont1 = 7;
                        switch (w) {
                            case 0:
                                nombre = "y " + unidades[cont1];
                                break;
                            case 1:
                                nombre = decenas[cont1] + " " + aux;
                                break;
                            case 2:
                                nombre = centenas[cont1] + " " + aux;
                                break;

                        }
                        break;
                    case "8":
                        cont1 = 8;
                        switch (w) {
                            case 0:
                                nombre = "y " + unidades[cont1];
                                break;
                            case 1:
                                nombre = decenas[cont1] + " " + aux;
                                break;
                            case 2:
                                nombre = centenas[cont1] + " " + aux;
                                break;

                        }
                        break;
                    case "9":
                        cont1 = 9;
                        switch (w) {
                            case 0:
                                nombre = "y " + unidades[cont1];
                                break;
                            case 1:
                                nombre = decenas[cont1] + " " + aux;
                                break;
                            case 2:
                                nombre = centenas[cont1] + " " + aux;
                                break;

                        }
                        break;

                }
            } else {
                nombre = "cero";
            }

        }
        nombre += " pesos";
        return nombre;
    }

    public static void main(String[] args) {
        int nu = 15;
        System.out.println(convertir(nu));

    }
}
